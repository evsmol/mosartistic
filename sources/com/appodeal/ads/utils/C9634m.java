package com.appodeal.ads.utils;

import android.content.Context;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.appodeal.ads.C9326n5;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.appodeal.ads.utils.m */
public final class C9634m implements Runnable {

    /* renamed from: a */
    public C9636b f24417a;

    /* renamed from: b */
    public String f24418b;

    /* renamed from: c */
    public File f24419c;

    /* renamed from: d */
    public final C9635a f24420d = new C9635a(Looper.getMainLooper());

    /* renamed from: e */
    public boolean f24421e;

    /* renamed from: com.appodeal.ads.utils.m$a */
    public class C9635a extends Handler {
        public C9635a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            C9636b bVar = C9634m.this.f24417a;
            if (bVar != null) {
                int i = message.what;
                if (i == 0) {
                    bVar.mo59877a();
                } else if (i == 1) {
                    bVar.mo59878a((Uri) message.obj);
                }
            }
        }
    }

    /* renamed from: com.appodeal.ads.utils.m$b */
    public interface C9636b {
        /* renamed from: a */
        void mo59877a();

        /* renamed from: a */
        void mo59878a(Uri uri);
    }

    public C9634m(Context context, C9636b bVar, String str) {
        if (context == null || str == null || !C9326n5.m27541a(context)) {
            bVar.mo59877a();
            return;
        }
        this.f24417a = bVar;
        this.f24418b = str;
        File externalFilesDir = context.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            File file = new File(externalFilesDir.getPath() + "/native_video/");
            this.f24419c = file;
            if (!file.exists()) {
                this.f24419c.mkdirs();
            }
            this.f24421e = true;
            return;
        }
        bVar.mo59877a();
    }

    public final void run() {
        if (!this.f24421e) {
            this.f24420d.sendEmptyMessage(0);
            return;
        }
        InputStream inputStream = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f24418b).openConnection();
            httpURLConnection.setConnectTimeout(Constants.SERVER_TIMEOUT_MS);
            httpURLConnection.setReadTimeout(Constants.SERVER_TIMEOUT_MS);
            inputStream = httpURLConnection.getInputStream();
            File file = new File(this.f24419c, "temp" + System.currentTimeMillis());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            long contentLength = (long) httpURLConnection.getContentLength();
            long j = 0;
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                j += (long) read;
            }
            fileOutputStream.close();
            String bigInteger = new BigInteger(C9326n5.m27543a(this.f24418b.getBytes())).abs().toString(36);
            if (contentLength == j) {
                file.renameTo(new File(this.f24419c, bigInteger));
            }
            File file2 = new File(this.f24419c, bigInteger);
            if (ThumbnailUtils.createVideoThumbnail(file2.getPath(), 1) != null) {
                this.f24420d.sendMessage(this.f24420d.obtainMessage(1, Uri.fromFile(file2)));
                try {
                    inputStream.close();
                } catch (Exception e) {
                    Log.log(e);
                }
            } else {
                Log.log(LogConstants.EVENT_ASSETS, "Video", "video file not supported");
                try {
                    inputStream.close();
                } catch (Exception e2) {
                    Log.log(e2);
                }
                this.f24420d.sendEmptyMessage(0);
            }
        } catch (Exception e3) {
            Log.log(e3);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    Log.log(e4);
                }
            }
            throw th;
        }
    }
}
