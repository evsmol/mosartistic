package com.yandex.metrica.impl.p082ob;

import java.net.Socket;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ch */
class C1928Ch {

    /* renamed from: a */
    private final Socket f5183a;

    /* renamed from: b */
    private final C2063Gh f5184b;

    /* renamed from: c */
    private final Map<String, C1897Bh> f5185c;

    /* renamed from: d */
    private final C2097Hh f5186d;

    C1928Ch(Socket socket, C2063Gh gh, Map<String, C1897Bh> map, C2097Hh hh) {
        this.f5183a = socket;
        this.f5184b = gh;
        this.f5185c = map;
        this.f5186d = hh;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r3 = r2.indexOf(47) + 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af A[SYNTHETIC, Splitter:B:36:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15592a() {
        /*
            r6 = this;
            r0 = 0
            java.net.Socket r1 = r6.f5183a     // Catch:{ all -> 0x00a3 }
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.setSoTimeout(r2)     // Catch:{ all -> 0x00a3 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x00a3 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x00a3 }
            java.net.Socket r3 = r6.f5183a     // Catch:{ all -> 0x00a3 }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ all -> 0x00a3 }
            r2.<init>(r3)     // Catch:{ all -> 0x00a3 }
            r1.<init>(r2)     // Catch:{ all -> 0x00a3 }
            com.yandex.metrica.impl.ob.Hh r2 = r6.f5186d     // Catch:{ all -> 0x009e }
            r2.mo15870a()     // Catch:{ all -> 0x009e }
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x009e }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x009e }
            if (r3 != 0) goto L_0x004c
            java.lang.String r3 = "GET /"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x009e }
            if (r3 != 0) goto L_0x0037
            java.lang.String r3 = "POST /"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x009e }
            if (r3 == 0) goto L_0x004c
        L_0x0037:
            r3 = 47
            int r3 = r2.indexOf(r3)     // Catch:{ all -> 0x009e }
            int r3 = r3 + 1
            r4 = 32
            int r4 = r2.indexOf(r4, r3)     // Catch:{ all -> 0x009e }
            if (r4 <= 0) goto L_0x004c
            java.lang.String r0 = r2.substring(r3, r4)     // Catch:{ all -> 0x009e }
            goto L_0x0055
        L_0x004c:
            com.yandex.metrica.impl.ob.Gh r3 = r6.f5184b     // Catch:{ all -> 0x009e }
            com.yandex.metrica.impl.ob.Jh r3 = (com.yandex.metrica.impl.p082ob.C2198Jh) r3     // Catch:{ all -> 0x009e }
            java.lang.String r4 = "invalid_route"
            r3.mo16034a((java.lang.String) r4, (java.lang.String) r2)     // Catch:{ all -> 0x009e }
        L_0x0055:
            if (r0 == 0) goto L_0x009a
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x009e }
            java.lang.String r3 = r2.getPath()     // Catch:{ all -> 0x009e }
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.Bh> r4 = r6.f5185c     // Catch:{ all -> 0x009e }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x009e }
            com.yandex.metrica.impl.ob.Bh r3 = (com.yandex.metrica.impl.p082ob.C1897Bh) r3     // Catch:{ all -> 0x009e }
            if (r3 == 0) goto L_0x0091
            java.net.Socket r0 = r6.f5183a     // Catch:{ all -> 0x009e }
            com.yandex.metrica.impl.ob.Hh r4 = r6.f5186d     // Catch:{ all -> 0x009e }
            com.yandex.metrica.impl.ob.Ah r0 = r3.mo15567a(r0, r2, r4)     // Catch:{ all -> 0x009e }
            android.net.Uri r2 = r0.f5048d     // Catch:{ all -> 0x009e }
            java.lang.String r3 = "t"
            java.lang.String r2 = r2.getQueryParameter(r3)     // Catch:{ all -> 0x009e }
            com.yandex.metrica.impl.ob.di r3 = r0.f5047c     // Catch:{ all -> 0x009e }
            java.lang.String r3 = r3.f7674b     // Catch:{ all -> 0x009e }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x0087
            r0.mo15465a()     // Catch:{ all -> 0x009e }
            goto L_0x009a
        L_0x0087:
            com.yandex.metrica.impl.ob.Gh r0 = r0.f5046b     // Catch:{ all -> 0x009e }
            com.yandex.metrica.impl.ob.Jh r0 = (com.yandex.metrica.impl.p082ob.C2198Jh) r0     // Catch:{ all -> 0x009e }
            java.lang.String r2 = "request_with_wrong_token"
            r0.mo16032a((java.lang.String) r2)     // Catch:{ all -> 0x009e }
            goto L_0x009a
        L_0x0091:
            com.yandex.metrica.impl.ob.Gh r2 = r6.f5184b     // Catch:{ all -> 0x009e }
            java.lang.String r3 = "request_to_unknown_path"
            com.yandex.metrica.impl.ob.Jh r2 = (com.yandex.metrica.impl.p082ob.C2198Jh) r2
            r2.mo16034a((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ all -> 0x009e }
        L_0x009a:
            r1.close()     // Catch:{ all -> 0x00b2 }
            goto L_0x00b2
        L_0x009e:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x00a4
        L_0x00a3:
            r1 = move-exception
        L_0x00a4:
            com.yandex.metrica.impl.ob.Gh r2 = r6.f5184b     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "LocalHttpServer exception"
            com.yandex.metrica.impl.ob.Jh r2 = (com.yandex.metrica.impl.p082ob.C2198Jh) r2
            r2.mo16035a((java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00b2
            r0.close()     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            return
        L_0x00b3:
            r1 = move-exception
            if (r0 == 0) goto L_0x00b9
            r0.close()     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C1928Ch.mo15592a():void");
    }
}
