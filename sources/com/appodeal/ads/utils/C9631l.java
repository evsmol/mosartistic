package com.appodeal.ads.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.appodeal.ads.C9326n5;
import com.appodeal.ads.modules.common.internal.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.appodeal.ads.utils.l */
public final class C9631l implements Runnable {

    /* renamed from: a */
    public final C9632a f24409a = new C9632a(Looper.getMainLooper());

    /* renamed from: b */
    public String f24410b;

    /* renamed from: c */
    public File f24411c;

    /* renamed from: d */
    public boolean f24412d;

    /* renamed from: e */
    public C9633b f24413e;

    /* renamed from: f */
    public int f24414f;

    /* renamed from: g */
    public int f24415g;

    /* renamed from: com.appodeal.ads.utils.l$a */
    public class C9632a extends Handler {
        public C9632a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            C9633b bVar = C9631l.this.f24413e;
            if (bVar != null) {
                int i = message.what;
                if (i == 0) {
                    bVar.mo60583a();
                } else if (i == 1) {
                    bVar.mo60585a((String) message.obj);
                } else if (i == 2) {
                    bVar.mo60584a((Bitmap) message.obj);
                }
            }
        }
    }

    /* renamed from: com.appodeal.ads.utils.l$b */
    public interface C9633b {
        /* renamed from: a */
        void mo60583a();

        /* renamed from: a */
        void mo60584a(Bitmap bitmap);

        /* renamed from: a */
        void mo60585a(String str);
    }

    public C9631l(Context context, String str, boolean z, C9633b bVar) {
        if (context == null) {
            bVar.mo60583a();
            return;
        }
        this.f24410b = str;
        this.f24412d = z;
        this.f24413e = bVar;
        int a = C9643p.m28401a(context);
        this.f24414f = a;
        this.f24415g = C9643p.m28400a(a, z);
        if (C9326n5.m27541a(context)) {
            this.f24411c = C9326n5.m27551c(context);
        }
    }

    /* renamed from: a */
    public static Bitmap m28385a(byte[] bArr, BitmapFactory.Options options) {
        ByteArrayOutputStream byteArrayOutputStream;
        options.inJustDecodeBounds = false;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            try {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                decodeByteArray.compress(Bitmap.CompressFormat.PNG, 85, byteArrayOutputStream);
                decodeByteArray.recycle();
                Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                C9326n5.m27537a((OutputStream) byteArrayOutputStream);
                C9326n5.m27536a((Closeable) byteArrayOutputStream);
                return decodeStream;
            } catch (Exception e) {
                e = e;
                try {
                    Log.log(e);
                    C9326n5.m27537a((OutputStream) byteArrayOutputStream);
                    C9326n5.m27536a((Closeable) byteArrayOutputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    C9326n5.m27537a((OutputStream) byteArrayOutputStream);
                    C9326n5.m27536a((Closeable) byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C9326n5.m27537a((OutputStream) byteArrayOutputStream);
                C9326n5.m27536a((Closeable) byteArrayOutputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            byteArrayOutputStream = null;
            Log.log(e);
            C9326n5.m27537a((OutputStream) byteArrayOutputStream);
            C9326n5.m27536a((Closeable) byteArrayOutputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = byteArrayOutputStream2;
            C9326n5.m27537a((OutputStream) byteArrayOutputStream);
            C9326n5.m27536a((Closeable) byteArrayOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static HttpURLConnection m28386a(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(Constants.SERVER_TIMEOUT_MS);
            httpURLConnection.setReadTimeout(Constants.SERVER_TIMEOUT_MS);
            try {
                if (httpURLConnection instanceof HttpsURLConnection) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
                    httpsURLConnection.setSSLSocketFactory(new C9652t(httpsURLConnection.getSSLSocketFactory()));
                }
            } catch (Exception e) {
                Log.log(e);
            }
            httpURLConnection.connect();
            return httpURLConnection;
        } catch (Exception unused) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.scheme("http");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(buildUpon.build().toString()).openConnection();
            httpURLConnection2.setConnectTimeout(Constants.SERVER_TIMEOUT_MS);
            httpURLConnection2.setReadTimeout(Constants.SERVER_TIMEOUT_MS);
            httpURLConnection2.connect();
            return httpURLConnection2;
        }
    }

    /* renamed from: a */
    public static void m28387a(File file, byte[] bArr, BitmapFactory.Options options) {
        FileOutputStream fileOutputStream;
        options.inJustDecodeBounds = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options).compress(Bitmap.CompressFormat.PNG, 85, fileOutputStream);
            } catch (Exception e) {
                e = e;
                fileOutputStream2 = fileOutputStream;
            } catch (Throwable th) {
                th = th;
                C9326n5.m27537a((OutputStream) fileOutputStream);
                C9326n5.m27536a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            try {
                Log.log(e);
                fileOutputStream = fileOutputStream2;
                C9326n5.m27537a((OutputStream) fileOutputStream);
                C9326n5.m27536a((Closeable) fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                C9326n5.m27537a((OutputStream) fileOutputStream);
                C9326n5.m27536a((Closeable) fileOutputStream);
                throw th;
            }
        }
        C9326n5.m27537a((OutputStream) fileOutputStream);
        C9326n5.m27536a((Closeable) fileOutputStream);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e2 A[Catch:{ Exception -> 0x0149, all -> 0x0147 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015c A[Catch:{ all -> 0x0169 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            java.lang.String r0 = r12.f24410b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0175
            java.lang.String r0 = r12.f24410b
            java.lang.String r2 = "http://"
            boolean r2 = r0.startsWith(r2)
            r3 = 1
            if (r2 != 0) goto L_0x001f
            java.lang.String r2 = "https://"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r0 != 0) goto L_0x0024
            goto L_0x0175
        L_0x0024:
            java.lang.String r0 = r12.f24410b
            java.lang.String r2 = " "
            java.lang.String r4 = "%20"
            java.lang.String r0 = r0.replace(r2, r4)
            r12.f24410b = r0
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r2.inJustDecodeBounds = r3
            java.io.File r4 = r12.f24411c
            r5 = 1069547520(0x3fc00000, float:1.5)
            r6 = 0
            if (r4 == 0) goto L_0x00a4
            java.io.File r4 = new java.io.File
            java.io.File r7 = r12.f24411c
            byte[] r8 = r0.getBytes()
            byte[] r8 = com.appodeal.ads.C9326n5.m27543a((byte[]) r8)
            java.math.BigInteger r9 = new java.math.BigInteger
            r9.<init>(r8)
            java.math.BigInteger r8 = r9.abs()
            r9 = 36
            java.lang.String r8 = r8.toString(r9)
            r4.<init>(r7, r8)
            boolean r7 = r4.exists()
            if (r7 == 0) goto L_0x00a5
            long r7 = r4.length()
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x00a5
            java.lang.String r0 = r4.getPath()
            android.graphics.BitmapFactory.decodeFile(r0, r2)
            boolean r0 = r12.f24412d
            if (r0 == 0) goto L_0x0085
            int r0 = r2.outWidth
            int r2 = r2.outHeight
            float r0 = (float) r0
            float r2 = (float) r2
            float r0 = r0 / r2
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r0 = 0
            goto L_0x0086
        L_0x0085:
            r0 = 1
        L_0x0086:
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r4.getAbsolutePath()
            com.appodeal.ads.utils.l$a r1 = r12.f24409a
            if (r1 == 0) goto L_0x0168
            android.os.Message r0 = r1.obtainMessage(r3, r0)
            com.appodeal.ads.utils.l$a r1 = r12.f24409a
            r1.sendMessage(r0)
            goto L_0x0168
        L_0x009b:
            com.appodeal.ads.utils.l$a r0 = r12.f24409a
            if (r0 == 0) goto L_0x0168
            r0.sendEmptyMessage(r1)
            goto L_0x0168
        L_0x00a4:
            r4 = r6
        L_0x00a5:
            java.net.HttpURLConnection r0 = m28386a(r0)     // Catch:{ Exception -> 0x0152, all -> 0x014e }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Exception -> 0x0152, all -> 0x014e }
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x014c }
            int r8 = r0.available()     // Catch:{ Exception -> 0x014c }
            r7.<init>(r8)     // Catch:{ Exception -> 0x014c }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
        L_0x00ba:
            int r8 = r0.read(r6)     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            r9 = -1
            if (r8 == r9) goto L_0x00c5
            r7.write(r6, r1, r8)     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            goto L_0x00ba
        L_0x00c5:
            byte[] r6 = r7.toByteArray()     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            int r8 = r6.length     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            android.graphics.BitmapFactory.decodeByteArray(r6, r1, r8, r2)     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            boolean r8 = r12.f24412d     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            if (r8 == 0) goto L_0x00df
            int r8 = r2.outWidth     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            int r9 = r2.outHeight     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            float r8 = (float) r8     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            float r9 = (float) r9     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            float r8 = r8 / r9
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            r5 = 0
            goto L_0x00e0
        L_0x00df:
            r5 = 1
        L_0x00e0:
            if (r5 != 0) goto L_0x00f4
            com.appodeal.ads.utils.l$a r2 = r12.f24409a     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            if (r2 == 0) goto L_0x00e9
            r2.sendEmptyMessage(r1)     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
        L_0x00e9:
            com.appodeal.ads.C9326n5.m27537a((java.io.OutputStream) r7)
            com.appodeal.ads.C9326n5.m27536a((java.io.Closeable) r7)
            com.appodeal.ads.C9326n5.m27536a((java.io.Closeable) r0)
            goto L_0x0168
        L_0x00f4:
            if (r4 == 0) goto L_0x010b
            m28387a(r4, r6, r2)     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            java.lang.String r2 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            com.appodeal.ads.utils.l$a r4 = r12.f24409a     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            if (r4 == 0) goto L_0x013a
            android.os.Message r2 = r4.obtainMessage(r3, r2)     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            com.appodeal.ads.utils.l$a r3 = r12.f24409a     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            r3.sendMessage(r2)     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            goto L_0x013a
        L_0x010b:
            int r4 = r12.f24414f     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            int r5 = r12.f24415g     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            int r8 = r2.outWidth     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            int r9 = r2.outHeight     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
        L_0x0113:
            int r10 = r8 / r3
            if (r10 > r4) goto L_0x0144
            int r10 = r9 / r3
            if (r10 <= r5) goto L_0x011c
            goto L_0x0144
        L_0x011c:
            r2.inSampleSize = r3     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            android.graphics.Bitmap r2 = m28385a(r6, r2)     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            if (r2 == 0) goto L_0x0133
            com.appodeal.ads.utils.l$a r3 = r12.f24409a     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            if (r3 == 0) goto L_0x013a
            r4 = 2
            android.os.Message r2 = r3.obtainMessage(r4, r2)     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            com.appodeal.ads.utils.l$a r3 = r12.f24409a     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            r3.sendMessage(r2)     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            goto L_0x013a
        L_0x0133:
            com.appodeal.ads.utils.l$a r2 = r12.f24409a     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
            if (r2 == 0) goto L_0x013a
            r2.sendEmptyMessage(r1)     // Catch:{ Exception -> 0x0149, all -> 0x0147 }
        L_0x013a:
            com.appodeal.ads.C9326n5.m27537a((java.io.OutputStream) r7)
            com.appodeal.ads.C9326n5.m27536a((java.io.Closeable) r7)
            com.appodeal.ads.C9326n5.m27536a((java.io.Closeable) r0)
            goto L_0x0168
        L_0x0144:
            int r3 = r3 * 2
            goto L_0x0113
        L_0x0147:
            r1 = move-exception
            goto L_0x016b
        L_0x0149:
            r2 = move-exception
            r6 = r7
            goto L_0x0155
        L_0x014c:
            r2 = move-exception
            goto L_0x0155
        L_0x014e:
            r0 = move-exception
            r1 = r0
            r0 = r6
            goto L_0x016a
        L_0x0152:
            r0 = move-exception
            r2 = r0
            r0 = r6
        L_0x0155:
            com.appodeal.ads.utils.Log.log(r2)     // Catch:{ all -> 0x0169 }
            com.appodeal.ads.utils.l$a r2 = r12.f24409a     // Catch:{ all -> 0x0169 }
            if (r2 == 0) goto L_0x015f
            r2.sendEmptyMessage(r1)     // Catch:{ all -> 0x0169 }
        L_0x015f:
            com.appodeal.ads.C9326n5.m27537a((java.io.OutputStream) r6)
            com.appodeal.ads.C9326n5.m27536a((java.io.Closeable) r6)
            com.appodeal.ads.C9326n5.m27536a((java.io.Closeable) r0)
        L_0x0168:
            return
        L_0x0169:
            r1 = move-exception
        L_0x016a:
            r7 = r6
        L_0x016b:
            com.appodeal.ads.C9326n5.m27537a((java.io.OutputStream) r7)
            com.appodeal.ads.C9326n5.m27536a((java.io.Closeable) r7)
            com.appodeal.ads.C9326n5.m27536a((java.io.Closeable) r0)
            throw r1
        L_0x0175:
            com.appodeal.ads.utils.l$a r0 = r12.f24409a
            if (r0 == 0) goto L_0x017c
            r0.sendEmptyMessage(r1)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.C9631l.run():void");
    }
}
