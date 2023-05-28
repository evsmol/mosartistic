package com.ironsource.sdk.p149k;

import android.os.Handler;
import android.os.Message;
import com.ironsource.environment.p124e.C4399a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.p145h.C4948c;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.ironsource.sdk.k.b */
public final class C4965b {

    /* renamed from: c */
    private static C4965b f12696c;

    /* renamed from: a */
    public C4964a f12697a = new C4964a(C4399a.m12508a());

    /* renamed from: b */
    public final String f12698b;

    /* renamed from: d */
    private Thread f12699d;

    /* renamed from: com.ironsource.sdk.k.b$a */
    static class C4966a implements Callable<C4967b> {

        /* renamed from: a */
        private String f12700a;

        /* renamed from: b */
        private String f12701b;

        /* renamed from: c */
        private String f12702c;

        /* renamed from: d */
        private long f12703d;

        /* renamed from: e */
        private String f12704e;

        C4966a(String str, String str2, String str3, long j, String str4) {
            this.f12700a = str;
            this.f12701b = str2;
            this.f12702c = str3;
            this.f12703d = j;
            this.f12704e = str4;
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v1, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v5 */
        /* JADX WARNING: type inference failed for: r3v6, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: type inference failed for: r3v9, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v15 */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
            r10 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
            r10 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
            r4 = r3;
            r3 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
            r10 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
            r4 = r3;
            r3 = r5;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x012f A[Catch:{ all -> 0x012b }] */
        /* JADX WARNING: Removed duplicated region for block: B:109:? A[ExcHandler: URISyntaxException (unused java.net.URISyntaxException), SYNTHETIC, Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x013e A[SYNTHETIC, Splitter:B:110:0x013e] */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0146 A[Catch:{ all -> 0x0142 }] */
        /* JADX WARNING: Removed duplicated region for block: B:121:? A[ExcHandler: MalformedURLException (unused java.net.MalformedURLException), SYNTHETIC, Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x0155 A[SYNTHETIC, Splitter:B:122:0x0155] */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x015d A[Catch:{ all -> 0x0159 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0093 A[ExcHandler: Error (e java.lang.Error), Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab A[Catch:{ all -> 0x00f4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00b4 A[SYNTHETIC, Splitter:B:46:0x00b4] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00bc A[Catch:{ all -> 0x00b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00d6 A[Catch:{ all -> 0x00f4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x00df A[SYNTHETIC, Splitter:B:62:0x00df] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00e7 A[Catch:{ all -> 0x00e3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x00f9 A[SYNTHETIC, Splitter:B:73:0x00f9] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0101 A[Catch:{ all -> 0x00fd }] */
        /* JADX WARNING: Removed duplicated region for block: B:85:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0110 A[SYNTHETIC, Splitter:B:86:0x0110] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0118 A[Catch:{ all -> 0x0114 }] */
        /* JADX WARNING: Removed duplicated region for block: B:97:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0127 A[SYNTHETIC, Splitter:B:98:0x0127] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:41:0x00a1=Splitter:B:41:0x00a1, B:57:0x00cc=Splitter:B:57:0x00cc} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.ironsource.sdk.p149k.C4965b.C4967b m14447a(java.lang.String r9, int r10) {
            /*
                r8 = this;
                java.lang.String r0 = "DownloadManager"
                com.ironsource.sdk.k.b$b r1 = new com.ironsource.sdk.k.b$b
                r1.<init>()
                boolean r2 = android.text.TextUtils.isEmpty(r9)
                if (r2 == 0) goto L_0x0014
                r1.f12705a = r9
                r9 = 1007(0x3ef, float:1.411E-42)
                r1.f12706b = r9
                return r1
            L_0x0014:
                r2 = 1019(0x3fb, float:1.428E-42)
                r3 = 0
                r4 = 0
                java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0152, URISyntaxException -> 0x013b, SocketTimeoutException -> 0x0124, FileNotFoundException -> 0x010d, Exception -> 0x00c9, Error -> 0x009f, all -> 0x009b }
                r5.<init>(r9)     // Catch:{ MalformedURLException -> 0x0152, URISyntaxException -> 0x013b, SocketTimeoutException -> 0x0124, FileNotFoundException -> 0x010d, Exception -> 0x00c9, Error -> 0x009f, all -> 0x009b }
                r5.toURI()     // Catch:{ MalformedURLException -> 0x0152, URISyntaxException -> 0x013b, SocketTimeoutException -> 0x0124, FileNotFoundException -> 0x010d, Exception -> 0x00c9, Error -> 0x009f, all -> 0x009b }
                java.net.URLConnection r5 = r5.openConnection()     // Catch:{ MalformedURLException -> 0x0152, URISyntaxException -> 0x013b, SocketTimeoutException -> 0x0124, FileNotFoundException -> 0x010d, Exception -> 0x00c9, Error -> 0x009f, all -> 0x009b }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ MalformedURLException -> 0x0152, URISyntaxException -> 0x013b, SocketTimeoutException -> 0x0124, FileNotFoundException -> 0x010d, Exception -> 0x00c9, Error -> 0x009f, all -> 0x009b }
                java.lang.String r6 = "GET"
                r5.setRequestMethod(r6)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x0097, Error -> 0x0093, all -> 0x0091 }
                r6 = 5000(0x1388, float:7.006E-42)
                r5.setConnectTimeout(r6)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x0097, Error -> 0x0093, all -> 0x0091 }
                r5.setReadTimeout(r6)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x0097, Error -> 0x0093, all -> 0x0091 }
                r5.connect()     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x0097, Error -> 0x0093, all -> 0x0091 }
                int r4 = r5.getResponseCode()     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x0097, Error -> 0x0093, all -> 0x0091 }
                r6 = 200(0xc8, float:2.8E-43)
                if (r4 < r6) goto L_0x004e
                r6 = 400(0x190, float:5.6E-43)
                if (r4 < r6) goto L_0x0043
                goto L_0x004e
            L_0x0043:
                java.io.InputStream r3 = r5.getInputStream()     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                byte[] r10 = m14448a(r3)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                r1.f12707c = r10     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                goto L_0x0071
            L_0x004e:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                java.lang.String r7 = " RESPONSE CODE: "
                r6.<init>(r7)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                r6.append(r4)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                java.lang.String r7 = " URL: "
                r6.append(r7)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                r6.append(r9)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                java.lang.String r7 = " ATTEMPT: "
                r6.append(r7)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                r6.append(r10)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                java.lang.String r10 = r6.toString()     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                com.ironsource.sdk.utils.Logger.m14507i(r0, r10)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                r4 = 1011(0x3f3, float:1.417E-42)
            L_0x0071:
                if (r3 == 0) goto L_0x0079
                r3.close()     // Catch:{ all -> 0x0077 }
                goto L_0x0079
            L_0x0077:
                r10 = move-exception
                goto L_0x007f
            L_0x0079:
                if (r5 == 0) goto L_0x0082
                r5.disconnect()     // Catch:{ all -> 0x0077 }
                goto L_0x0082
            L_0x007f:
                r10.printStackTrace()
            L_0x0082:
                r1.f12705a = r9
                r1.f12706b = r4
                goto L_0x016a
            L_0x0088:
                r10 = move-exception
                r2 = r4
                goto L_0x00f7
            L_0x008c:
                r10 = move-exception
                r2 = r4
                r4 = r3
                r3 = r5
                goto L_0x00cc
            L_0x0091:
                r10 = move-exception
                goto L_0x009d
            L_0x0093:
                r10 = move-exception
                r4 = r3
                r3 = r5
                goto L_0x00a1
            L_0x0097:
                r10 = move-exception
                r4 = r3
                r3 = r5
                goto L_0x00cb
            L_0x009b:
                r10 = move-exception
                r5 = r3
            L_0x009d:
                r2 = 0
                goto L_0x00f7
            L_0x009f:
                r10 = move-exception
                r4 = r3
            L_0x00a1:
                java.lang.String r5 = r10.getMessage()     // Catch:{ all -> 0x00f4 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00f4 }
                if (r5 != 0) goto L_0x00b2
                java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00f4 }
                com.ironsource.sdk.utils.Logger.m14507i(r0, r10)     // Catch:{ all -> 0x00f4 }
            L_0x00b2:
                if (r4 == 0) goto L_0x00ba
                r4.close()     // Catch:{ all -> 0x00b8 }
                goto L_0x00ba
            L_0x00b8:
                r10 = move-exception
                goto L_0x00c0
            L_0x00ba:
                if (r3 == 0) goto L_0x00c3
                r3.disconnect()     // Catch:{ all -> 0x00b8 }
                goto L_0x00c3
            L_0x00c0:
                r10.printStackTrace()
            L_0x00c3:
                r1.f12705a = r9
                r1.f12706b = r2
                goto L_0x016a
            L_0x00c9:
                r10 = move-exception
                r4 = r3
            L_0x00cb:
                r2 = 0
            L_0x00cc:
                java.lang.String r5 = r10.getMessage()     // Catch:{ all -> 0x00f4 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00f4 }
                if (r5 != 0) goto L_0x00dd
                java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00f4 }
                com.ironsource.sdk.utils.Logger.m14507i(r0, r10)     // Catch:{ all -> 0x00f4 }
            L_0x00dd:
                if (r4 == 0) goto L_0x00e5
                r4.close()     // Catch:{ all -> 0x00e3 }
                goto L_0x00e5
            L_0x00e3:
                r10 = move-exception
                goto L_0x00eb
            L_0x00e5:
                if (r3 == 0) goto L_0x00ee
                r3.disconnect()     // Catch:{ all -> 0x00e3 }
                goto L_0x00ee
            L_0x00eb:
                r10.printStackTrace()
            L_0x00ee:
                r1.f12705a = r9
                r9 = 1009(0x3f1, float:1.414E-42)
                goto L_0x0168
            L_0x00f4:
                r10 = move-exception
                r5 = r3
                r3 = r4
            L_0x00f7:
                if (r3 == 0) goto L_0x00ff
                r3.close()     // Catch:{ all -> 0x00fd }
                goto L_0x00ff
            L_0x00fd:
                r0 = move-exception
                goto L_0x0105
            L_0x00ff:
                if (r5 == 0) goto L_0x0108
                r5.disconnect()     // Catch:{ all -> 0x00fd }
                goto L_0x0108
            L_0x0105:
                r0.printStackTrace()
            L_0x0108:
                r1.f12705a = r9
                r1.f12706b = r2
                throw r10
            L_0x010d:
                r5 = r3
            L_0x010e:
                if (r3 == 0) goto L_0x0116
                r3.close()     // Catch:{ all -> 0x0114 }
                goto L_0x0116
            L_0x0114:
                r10 = move-exception
                goto L_0x011c
            L_0x0116:
                if (r5 == 0) goto L_0x011f
                r5.disconnect()     // Catch:{ all -> 0x0114 }
                goto L_0x011f
            L_0x011c:
                r10.printStackTrace()
            L_0x011f:
                r1.f12705a = r9
                r9 = 1018(0x3fa, float:1.427E-42)
                goto L_0x0168
            L_0x0124:
                r5 = r3
            L_0x0125:
                if (r3 == 0) goto L_0x012d
                r3.close()     // Catch:{ all -> 0x012b }
                goto L_0x012d
            L_0x012b:
                r10 = move-exception
                goto L_0x0133
            L_0x012d:
                if (r5 == 0) goto L_0x0136
                r5.disconnect()     // Catch:{ all -> 0x012b }
                goto L_0x0136
            L_0x0133:
                r10.printStackTrace()
            L_0x0136:
                r1.f12705a = r9
                r9 = 1008(0x3f0, float:1.413E-42)
                goto L_0x0168
            L_0x013b:
                r5 = r3
            L_0x013c:
                if (r3 == 0) goto L_0x0144
                r3.close()     // Catch:{ all -> 0x0142 }
                goto L_0x0144
            L_0x0142:
                r10 = move-exception
                goto L_0x014a
            L_0x0144:
                if (r5 == 0) goto L_0x014d
                r5.disconnect()     // Catch:{ all -> 0x0142 }
                goto L_0x014d
            L_0x014a:
                r10.printStackTrace()
            L_0x014d:
                r1.f12705a = r9
                r9 = 1010(0x3f2, float:1.415E-42)
                goto L_0x0168
            L_0x0152:
                r5 = r3
            L_0x0153:
                if (r3 == 0) goto L_0x015b
                r3.close()     // Catch:{ all -> 0x0159 }
                goto L_0x015b
            L_0x0159:
                r10 = move-exception
                goto L_0x0161
            L_0x015b:
                if (r5 == 0) goto L_0x0164
                r5.disconnect()     // Catch:{ all -> 0x0159 }
                goto L_0x0164
            L_0x0161:
                r10.printStackTrace()
            L_0x0164:
                r1.f12705a = r9
                r9 = 1004(0x3ec, float:1.407E-42)
            L_0x0168:
                r1.f12706b = r9
            L_0x016a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p149k.C4965b.C4966a.m14447a(java.lang.String, int):com.ironsource.sdk.k.b$b");
        }

        /* renamed from: a */
        private static byte[] m14448a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            r2 = m14447a(r9.f12700a, r1);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ironsource.sdk.p149k.C4965b.C4967b call() {
            /*
                r9 = this;
                java.lang.String r0 = "DownloadManager"
                long r1 = r9.f12703d
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L_0x000e
                r1 = 1
                r9.f12703d = r1
            L_0x000e:
                r1 = 0
                r2 = 0
            L_0x0010:
                long r3 = (long) r1
                long r5 = r9.f12703d
                r7 = 1009(0x3f1, float:1.414E-42)
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 >= 0) goto L_0x002a
                java.lang.String r2 = r9.f12700a
                com.ironsource.sdk.k.b$b r2 = r9.m14447a(r2, r1)
                int r3 = r2.f12706b
                r4 = 1008(0x3f0, float:1.413E-42)
                if (r3 == r4) goto L_0x0027
                if (r3 != r7) goto L_0x002a
            L_0x0027:
                int r1 = r1 + 1
                goto L_0x0010
            L_0x002a:
                if (r2 == 0) goto L_0x00ab
                byte[] r1 = r2.f12707c
                if (r1 == 0) goto L_0x00ab
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = r9.f12701b
                r1.append(r3)
                java.lang.String r3 = java.io.File.separator
                r1.append(r3)
                java.lang.String r3 = r9.f12702c
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r9.f12704e
                r3.append(r4)
                java.lang.String r4 = java.io.File.separator
                r3.append(r4)
                java.lang.String r4 = "tmp_"
                r3.append(r4)
                java.lang.String r4 = r9.f12702c
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                byte[] r4 = r2.f12707c     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                int r4 = com.ironsource.sdk.utils.IronSourceStorageUtils.saveFile(r4, r3)     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                if (r4 != 0) goto L_0x0072
                r1 = 1006(0x3ee, float:1.41E-42)
                r2.f12706b = r1     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                goto L_0x00ab
            L_0x0072:
                boolean r1 = com.ironsource.sdk.utils.IronSourceStorageUtils.renameFile(r3, r1)     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                if (r1 != 0) goto L_0x00ab
                r1 = 1020(0x3fc, float:1.43E-42)
                r2.f12706b = r1     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                goto L_0x00ab
            L_0x007d:
                r1 = move-exception
                java.lang.String r3 = r1.getMessage()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x008f
                java.lang.String r1 = r1.getMessage()
                com.ironsource.sdk.utils.Logger.m14507i(r0, r1)
            L_0x008f:
                r0 = 1019(0x3fb, float:1.428E-42)
                goto L_0x00a9
            L_0x0092:
                r1 = move-exception
                java.lang.String r3 = r1.getMessage()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x00a4
                java.lang.String r1 = r1.getMessage()
                com.ironsource.sdk.utils.Logger.m14507i(r0, r1)
            L_0x00a4:
                r2.f12706b = r7
                goto L_0x00ab
            L_0x00a7:
                r0 = 1018(0x3fa, float:1.427E-42)
            L_0x00a9:
                r2.f12706b = r0
            L_0x00ab:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p149k.C4965b.C4966a.call():com.ironsource.sdk.k.b$b");
        }
    }

    /* renamed from: com.ironsource.sdk.k.b$b */
    static class C4967b {

        /* renamed from: a */
        public String f12705a;

        /* renamed from: b */
        int f12706b;

        /* renamed from: c */
        byte[] f12707c;

        C4967b() {
        }
    }

    /* renamed from: com.ironsource.sdk.k.b$c */
    static class C4968c implements Runnable {

        /* renamed from: a */
        private final long f12708a = 3;

        /* renamed from: b */
        private final String f12709b;

        /* renamed from: c */
        private Handler f12710c;

        /* renamed from: d */
        private String f12711d;

        /* renamed from: e */
        private String f12712e;

        /* renamed from: f */
        private String f12713f;

        /* renamed from: g */
        private long f12714g;

        C4968c(C4948c cVar, String str, Handler handler, String str2) {
            this.f12711d = str;
            this.f12712e = cVar.getParent();
            this.f12713f = cVar.getName();
            this.f12714g = 3;
            this.f12710c = handler;
            this.f12709b = str2;
        }

        public final void run() {
            int i;
            C4948c cVar = new C4948c(this.f12712e, this.f12713f);
            Message message = new Message();
            message.obj = cVar;
            String makeDir = IronSourceStorageUtils.makeDir(cVar.getParent());
            if (makeDir == null) {
                i = IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT;
            } else {
                C4967b a = new C4966a(this.f12711d, makeDir, cVar.getName(), this.f12714g, this.f12709b).call();
                i = a.f12706b == 200 ? 1016 : a.f12706b;
            }
            message.what = i;
            this.f12710c.sendMessage(message);
        }
    }

    private C4965b(String str, C4399a aVar) {
        this.f12698b = str;
        IronSourceStorageUtils.deleteFolder(m14442c());
        IronSourceStorageUtils.makeDir(m14442c());
    }

    /* renamed from: a */
    public static synchronized C4965b m14441a(String str, C4399a aVar) {
        C4965b bVar;
        synchronized (C4965b.class) {
            if (f12696c == null) {
                f12696c = new C4965b(str, aVar);
            }
            bVar = f12696c;
        }
        return bVar;
    }

    /* renamed from: c */
    private String m14442c() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f12698b, "temp");
    }

    /* renamed from: a */
    public final synchronized void mo34698a() {
        f12696c = null;
        if (this.f12697a != null) {
            this.f12697a.f12695a = null;
            this.f12697a = null;
        }
    }

    /* renamed from: a */
    public final void mo34699a(C4948c cVar, String str) {
        Thread thread = new Thread(new C4968c(cVar, str, this.f12697a, m14442c()));
        this.f12699d = thread;
        thread.start();
    }

    /* renamed from: a */
    public final void mo34700a(C4948c cVar, String str, Handler handler) {
        new Thread(new C4968c(cVar, str, handler, m14442c())).start();
    }

    /* renamed from: b */
    public final boolean mo34701b() {
        Thread thread = this.f12699d;
        return thread != null && thread.isAlive();
    }
}
