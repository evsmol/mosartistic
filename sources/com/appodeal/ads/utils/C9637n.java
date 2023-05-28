package com.appodeal.ads.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.appodeal.ads.C9326n5;
import com.appodeal.ads.modules.common.internal.Constants;
import com.explorestack.iab.vast.VastRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.appodeal.ads.utils.n */
public final class C9637n implements Runnable {

    /* renamed from: a */
    public Context f24423a;

    /* renamed from: b */
    public C9639b f24424b;

    /* renamed from: c */
    public String f24425c;

    /* renamed from: d */
    public File f24426d;

    /* renamed from: e */
    public final C9638a f24427e = new C9638a(Looper.getMainLooper());

    /* renamed from: f */
    public boolean f24428f;

    /* renamed from: com.appodeal.ads.utils.n$a */
    public class C9638a extends Handler {
        public C9638a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            C9639b bVar = C9637n.this.f24424b;
            if (bVar != null) {
                int i = message.what;
                if (i == 0) {
                    bVar.mo59902a();
                } else if (i == 1) {
                    Pair pair = (Pair) message.obj;
                    bVar.mo59903a((Uri) pair.first, (VastRequest) pair.second);
                }
            }
        }
    }

    /* renamed from: com.appodeal.ads.utils.n$b */
    public interface C9639b {
        /* renamed from: a */
        void mo59902a();

        /* renamed from: a */
        void mo59903a(Uri uri, VastRequest vastRequest);
    }

    public C9637n(Context context, C9639b bVar, String str) {
        if (context == null || str == null || !C9326n5.m27541a(context)) {
            bVar.mo59902a();
            return;
        }
        this.f24423a = context;
        this.f24424b = bVar;
        this.f24425c = str;
        File externalFilesDir = context.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            File file = new File(externalFilesDir.getPath() + "/native_video/");
            this.f24426d = file;
            if (!file.exists()) {
                this.f24426d.mkdirs();
            }
            this.f24428f = true;
            return;
        }
        bVar.mo59902a();
    }

    /* renamed from: a */
    public static InputStream m28393a(String str) {
        try {
            URLConnection openConnection = new URL(str).openConnection();
            try {
                if (openConnection instanceof HttpsURLConnection) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setSSLSocketFactory(new C9652t(httpsURLConnection.getSSLSocketFactory()));
                }
            } catch (Exception e) {
                Log.log(e);
            }
            openConnection.setConnectTimeout(Constants.SERVER_TIMEOUT_MS);
            openConnection.setReadTimeout(Constants.SERVER_TIMEOUT_MS);
            openConnection.connect();
            return openConnection.getInputStream();
        } catch (IOException e2) {
            Log.log(e2);
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.scheme("http");
            URLConnection openConnection2 = new URL(buildUpon.build().toString()).openConnection();
            openConnection2.setConnectTimeout(Constants.SERVER_TIMEOUT_MS);
            openConnection2.setReadTimeout(Constants.SERVER_TIMEOUT_MS);
            openConnection2.connect();
            return openConnection2.getInputStream();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.explorestack.iab.vast.VastRequestListener, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = r7.f24428f
            r1 = 0
            if (r0 != 0) goto L_0x000b
            com.appodeal.ads.utils.n$a r0 = r7.f24427e
            r0.sendEmptyMessage(r1)
            return
        L_0x000b:
            r0 = 0
            com.explorestack.iab.vast.VastRequest$Builder r2 = com.explorestack.iab.vast.VastRequest.newBuilder()     // Catch:{ Exception -> 0x00a7 }
            com.explorestack.iab.CacheControl r3 = com.explorestack.iab.CacheControl.Stream     // Catch:{ Exception -> 0x00a7 }
            com.explorestack.iab.vast.VastRequest$Builder r2 = r2.setCacheControl(r3)     // Catch:{ Exception -> 0x00a7 }
            com.explorestack.iab.vast.VastRequest r2 = r2.build()     // Catch:{ Exception -> 0x00a7 }
            android.content.Context r3 = r7.f24423a     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r4 = r7.f24425c     // Catch:{ Exception -> 0x00a7 }
            r2.loadVideoWithDataSync(r3, r4, r0)     // Catch:{ Exception -> 0x00a7 }
            com.explorestack.iab.vast.processor.VastAd r3 = r2.getVastAd()     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x009f
            com.explorestack.iab.vast.tags.MediaFileTag r4 = r3.getPickedMediaFileTag()     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r4 = r4.getType()     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r5 = "video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)"
            boolean r4 = r4.matches(r5)     // Catch:{ Exception -> 0x00a7 }
            if (r4 == 0) goto L_0x009f
            com.explorestack.iab.vast.tags.MediaFileTag r3 = r3.getPickedMediaFileTag()     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r3 = r3.getText()     // Catch:{ Exception -> 0x00a7 }
            java.io.InputStream r0 = m28393a(r3)     // Catch:{ Exception -> 0x00a7 }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x00a7 }
            byte[] r3 = com.appodeal.ads.C9326n5.m27543a((byte[]) r3)     // Catch:{ Exception -> 0x00a7 }
            java.math.BigInteger r4 = new java.math.BigInteger     // Catch:{ Exception -> 0x00a7 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00a7 }
            java.math.BigInteger r3 = r4.abs()     // Catch:{ Exception -> 0x00a7 }
            r4 = 36
            java.lang.String r3 = r3.toString(r4)     // Catch:{ Exception -> 0x00a7 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x00a7 }
            java.io.File r5 = r7.f24426d     // Catch:{ Exception -> 0x00a7 }
            r4.<init>(r5, r3)     // Catch:{ Exception -> 0x00a7 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00a7 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00a7 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x00a7 }
        L_0x006a:
            int r6 = r0.read(r5)     // Catch:{ Exception -> 0x00a7 }
            if (r6 <= 0) goto L_0x0074
            r3.write(r5, r1, r6)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x006a
        L_0x0074:
            r3.close()     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r3 = r4.getPath()     // Catch:{ Exception -> 0x00a7 }
            r5 = 1
            android.graphics.Bitmap r3 = android.media.ThumbnailUtils.createVideoThumbnail(r3, r5)     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x009f
            com.appodeal.ads.utils.n$a r3 = r7.f24427e     // Catch:{ Exception -> 0x00a7 }
            android.util.Pair r6 = new android.util.Pair     // Catch:{ Exception -> 0x00a7 }
            android.net.Uri r4 = android.net.Uri.fromFile(r4)     // Catch:{ Exception -> 0x00a7 }
            r6.<init>(r4, r2)     // Catch:{ Exception -> 0x00a7 }
            android.os.Message r2 = r3.obtainMessage(r5, r6)     // Catch:{ Exception -> 0x00a7 }
            com.appodeal.ads.utils.n$a r3 = r7.f24427e     // Catch:{ Exception -> 0x00a7 }
            r3.sendMessage(r2)     // Catch:{ Exception -> 0x00a7 }
            r0.close()     // Catch:{ Exception -> 0x009a }
            goto L_0x009e
        L_0x009a:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x009e:
            return
        L_0x009f:
            if (r0 == 0) goto L_0x00b5
            r0.close()     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b5
        L_0x00a5:
            r1 = move-exception
            goto L_0x00bb
        L_0x00a7:
            r2 = move-exception
            com.appodeal.ads.utils.Log.log(r2)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x00b5
            r0.close()     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b5
        L_0x00b1:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x00b5:
            com.appodeal.ads.utils.n$a r0 = r7.f24427e
            r0.sendEmptyMessage(r1)
            return
        L_0x00bb:
            if (r0 == 0) goto L_0x00c5
            r0.close()     // Catch:{ Exception -> 0x00c1 }
            goto L_0x00c5
        L_0x00c1:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x00c5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.C9637n.run():void");
    }
}
