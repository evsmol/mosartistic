package com.bytedance.sdk.component.p313d.p316c.p317a.p318a;

import android.util.Log;
import com.bytedance.sdk.component.p313d.C10498c;
import com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a;
import com.bytedance.sdk.component.p313d.p316c.p321c.C10531b;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.component.d.c.a.a.b */
/* compiled from: LruCountDiskCache */
public class C10508b implements C10498c {

    /* renamed from: a */
    private long f26204a;

    /* renamed from: b */
    private C10501a f26205b;

    public C10508b(File file, long j, ExecutorService executorService) {
        this.f26204a = j;
        try {
            this.f26205b = C10501a.m30679a(file, 20210302, 1, j, executorService);
        } catch (IOException e) {
            Log.w("LruCountDiskCache", e.toString());
        }
    }

    /* renamed from: a */
    public InputStream mo64016a(String str) {
        C10501a aVar = this.f26205b;
        if (aVar == null) {
            return null;
        }
        try {
            C10501a.C10507c a = aVar.mo64020a(str);
            if (a != null) {
                return a.mo64039a(0);
            }
        } catch (IOException e) {
            Log.w("LruCountDiskCache", e.getMessage());
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.bytedance.sdk.component.d.c.a.a.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.bytedance.sdk.component.d.c.a.a.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.bytedance.sdk.component.d.c.a.a.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.bytedance.sdk.component.d.c.a.a.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.bytedance.sdk.component.d.c.a.a.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.bytedance.sdk.component.d.c.a.a.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.bytedance.sdk.component.d.c.a.a.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.bytedance.sdk.component.d.c.a.a.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.bytedance.sdk.component.d.c.a.a.a$a} */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        r8 = r3;
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        r7 = th;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r3.mo64031b();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v4 com.bytedance.sdk.component.d.c.a.a.a$a) = (r3v0 com.bytedance.sdk.component.d.c.a.a.a$a), (r3v0 com.bytedance.sdk.component.d.c.a.a.a$a), (r3v0 com.bytedance.sdk.component.d.c.a.a.a$a), (r3v0 com.bytedance.sdk.component.d.c.a.a.a$a), (r3v10 com.bytedance.sdk.component.d.c.a.a.a$a), (r3v12 com.bytedance.sdk.component.d.c.a.a.a$a) binds: [B:5:0x000e, B:13:0x0031, B:9:0x0016, B:10:?, B:19:0x0054, B:20:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075 A[SYNTHETIC, Splitter:B:31:0x0075] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo63992a(java.lang.String r7, byte[] r8) {
        /*
            r6 = this;
            java.lang.String r0 = "LruCountDiskCache"
            com.bytedance.sdk.component.d.c.a.a.a r1 = r6.f26205b
            r2 = 0
            if (r1 == 0) goto L_0x0082
            if (r8 == 0) goto L_0x0082
            if (r7 != 0) goto L_0x000d
            goto L_0x0082
        L_0x000d:
            r3 = 0
            com.bytedance.sdk.component.d.c.a.a.a$a r1 = r1.mo64022b((java.lang.String) r7)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.lang.String r4 = "save "
            if (r1 != 0) goto L_0x0031
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            r8.<init>()     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            r8.append(r4)     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            r8.append(r7)     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            java.lang.String r7 = " failed for edit null"
            r8.append(r7)     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            java.lang.String r7 = r8.toString()     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            android.util.Log.w(r0, r7)     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            com.bytedance.sdk.component.p313d.p316c.p321c.C10531b.m30852a(r3)
            return r2
        L_0x0031:
            java.io.OutputStream r3 = r1.mo64029a((int) r2)     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            java.io.OutputStream r5 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.f26170c     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            if (r3 != r5) goto L_0x0054
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            r8.<init>()     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            r8.append(r4)     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            r8.append(r7)     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            java.lang.String r7 = " failed for null OutputStream"
            r8.append(r7)     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            java.lang.String r7 = r8.toString()     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            android.util.Log.w(r0, r7)     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            com.bytedance.sdk.component.p313d.p316c.p321c.C10531b.m30852a(r3)
            return r2
        L_0x0054:
            r3.write(r8)     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            r1.mo64030a()     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            com.bytedance.sdk.component.d.c.a.a.a r7 = r6.f26205b     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            r7.mo64021a()     // Catch:{ IOException -> 0x0064, all -> 0x0068 }
            com.bytedance.sdk.component.p313d.p316c.p321c.C10531b.m30852a(r3)
            r7 = 1
            return r7
        L_0x0064:
            r7 = move-exception
            r8 = r3
            r3 = r1
            goto L_0x006c
        L_0x0068:
            r7 = move-exception
            goto L_0x007e
        L_0x006a:
            r7 = move-exception
            r8 = r3
        L_0x006c:
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x007c }
            android.util.Log.w(r0, r7)     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x0078
            r3.mo64031b()     // Catch:{ IOException -> 0x0078 }
        L_0x0078:
            com.bytedance.sdk.component.p313d.p316c.p321c.C10531b.m30852a(r8)
            return r2
        L_0x007c:
            r7 = move-exception
            r3 = r8
        L_0x007e:
            com.bytedance.sdk.component.p313d.p316c.p321c.C10531b.m30852a(r3)
            throw r7
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10508b.mo63992a(java.lang.String, byte[]):boolean");
    }

    /* renamed from: b */
    public byte[] mo63991a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        C10501a aVar = this.f26205b;
        InputStream inputStream2 = null;
        if (aVar == null || str == null) {
            return null;
        }
        try {
            C10501a.C10507c a = aVar.mo64020a(str);
            if (a == null) {
                C10531b.m30852a((Closeable) null);
                C10531b.m30852a((Closeable) null);
                return null;
            }
            inputStream = a.mo64039a(0);
            if (inputStream != null) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (IOException e) {
                    e = e;
                    byteArrayOutputStream = null;
                    try {
                        Log.w("LruCountDiskCache", e.toString());
                        C10531b.m30852a(inputStream);
                        C10531b.m30852a(byteArrayOutputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        C10531b.m30852a(inputStream2);
                        C10531b.m30852a(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = null;
                    inputStream2 = inputStream;
                    C10531b.m30852a(inputStream2);
                    C10531b.m30852a(byteArrayOutputStream);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } catch (IOException e2) {
                    e = e2;
                    Log.w("LruCountDiskCache", e.toString());
                    C10531b.m30852a(inputStream);
                    C10531b.m30852a(byteArrayOutputStream);
                    return null;
                }
            } else {
                byteArrayOutputStream = null;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C10531b.m30852a(inputStream);
            C10531b.m30852a(byteArrayOutputStream);
            return byteArray;
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            byteArrayOutputStream = null;
            Log.w("LruCountDiskCache", e.toString());
            C10531b.m30852a(inputStream);
            C10531b.m30852a(byteArrayOutputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            C10531b.m30852a(inputStream2);
            C10531b.m30852a(byteArrayOutputStream);
            throw th;
        }
    }

    /* renamed from: c */
    public boolean mo63993b(String str) {
        boolean z = false;
        C10501a.C10507c cVar = null;
        try {
            cVar = this.f26205b.mo64020a(str);
            if (cVar != null) {
                z = true;
            }
            return z;
        } catch (IOException e) {
            Log.w("LruCountDiskCache", e.getMessage());
            return false;
        } finally {
            C10531b.m30852a(cVar);
        }
    }
}
