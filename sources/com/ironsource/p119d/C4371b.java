package com.ironsource.p119d;

import android.content.Context;
import android.util.Pair;
import com.ironsource.mediationsdk.adunit.p127a.C4559a;
import com.ironsource.p118c.C4369b;
import com.ironsource.sdk.p141e.p142a.C4926a;
import com.ironsource.sdk.utils.SDKUtils;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.d.b */
public class C4371b {

    /* renamed from: a */
    private C4559a f10406a = new C4559a();

    /* renamed from: com.ironsource.d.b$a */
    public static class C4372a {

        /* renamed from: a */
        final String f10407a;

        /* renamed from: b */
        final String f10408b;

        /* renamed from: c */
        final String f10409c;

        /* renamed from: d */
        final int f10410d;

        /* renamed from: e */
        final int f10411e;

        /* renamed from: f */
        final String f10412f;

        /* renamed from: g */
        ArrayList<Pair<String, String>> f10413g;

        /* renamed from: com.ironsource.d.b$a$a */
        public static class C4373a {

            /* renamed from: a */
            List<Pair<String, String>> f10414a = new ArrayList();

            /* renamed from: b */
            public String f10415b;

            /* renamed from: c */
            public String f10416c = "POST";

            /* renamed from: d */
            public String f10417d;

            /* renamed from: e */
            int f10418e = 15000;

            /* renamed from: f */
            int f10419f = 15000;

            /* renamed from: g */
            String f10420g = "UTF-8";

            /* renamed from: a */
            public final C4373a mo33170a(List<Pair<String, String>> list) {
                this.f10414a.addAll(list);
                return this;
            }

            /* renamed from: a */
            public final C4372a mo33171a() {
                return new C4372a(this);
            }
        }

        public C4372a(C4373a aVar) {
            this.f10407a = aVar.f10415b;
            this.f10408b = aVar.f10416c;
            this.f10409c = aVar.f10417d;
            this.f10413g = new ArrayList<>(aVar.f10414a);
            this.f10410d = aVar.f10418e;
            this.f10411e = aVar.f10419f;
            this.f10412f = aVar.f10420g;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a A[SYNTHETIC, Splitter:B:32:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ironsource.p119d.C4374c m12424a(com.ironsource.p119d.C4371b.C4372a r7) {
        /*
            java.lang.String r0 = r7.f10407a
            java.lang.String r1 = r7.f10409c
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0016
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x00ce
            com.ironsource.d.c r0 = new com.ironsource.d.c
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r3 = r7.f10407a     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r3 = r7.f10410d     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r3 = r7.f10411e     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setReadTimeout(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r3 = r7.f10408b     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setRequestMethod(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r7.f10413g     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            m12426a((java.net.HttpURLConnection) r2, (java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r3)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r3 = "POST"
            java.lang.String r4 = r7.f10408b     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r7.f10409c     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r4 = r7.f10412f     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            byte[] r3 = r3.getBytes(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            int r4 = r3.length     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r5 = "Content-Length"
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r2.setRequestProperty(r5, r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            m12427a((java.net.HttpURLConnection) r2, (byte[]) r3)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
        L_0x005f:
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r0.f10421a = r3     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            if (r1 == 0) goto L_0x0071
            byte[] r3 = com.ironsource.environment.C4377a.C43781.m12457a((java.io.InputStream) r1)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r0.f10422b = r3     // Catch:{ IOException -> 0x007e, all -> 0x007c }
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            if (r2 == 0) goto L_0x00bd
            r2.disconnect()
            goto L_0x00bd
        L_0x007c:
            r7 = move-exception
            goto L_0x00c3
        L_0x007e:
            r3 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0088
        L_0x0083:
            r7 = move-exception
            r2 = r1
            goto L_0x00c3
        L_0x0086:
            r3 = move-exception
            r2 = r1
        L_0x0088:
            if (r1 == 0) goto L_0x00be
            int r4 = r1.getResponseCode()     // Catch:{ all -> 0x00bf }
            r0.f10421a = r4     // Catch:{ all -> 0x00bf }
            r5 = 400(0x190, float:5.6E-43)
            if (r4 < r5) goto L_0x00be
            java.lang.String r3 = "ISHttpService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = "Failed post to "
            r4.<init>(r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = r7.f10407a     // Catch:{ all -> 0x00bf }
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = " StatusCode: "
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            int r7 = r0.f10421a     // Catch:{ all -> 0x00bf }
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x00bf }
            android.util.Log.d(r3, r7)     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x00b8
            r2.close()
        L_0x00b8:
            if (r1 == 0) goto L_0x00bd
            r1.disconnect()
        L_0x00bd:
            return r0
        L_0x00be:
            throw r3     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r7 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x00c3:
            if (r1 == 0) goto L_0x00c8
            r1.close()
        L_0x00c8:
            if (r2 == 0) goto L_0x00cd
            r2.disconnect()
        L_0x00cd:
            throw r7
        L_0x00ce:
            java.security.InvalidParameterException r7 = new java.security.InvalidParameterException
            java.lang.String r0 = "not valid params"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.p119d.C4371b.m12424a(com.ironsource.d.b$a):com.ironsource.d.c");
    }

    /* renamed from: a */
    public static C4374c m12425a(String str, String str2, List<Pair<String, String>> list) {
        C4372a.C4373a aVar = new C4372a.C4373a();
        aVar.f10415b = str;
        aVar.f10417d = str2;
        aVar.f10416c = "POST";
        aVar.mo33170a(list);
        return m12424a(aVar.mo33171a());
    }

    /* renamed from: a */
    private static void m12426a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) {
        for (Pair next : list) {
            httpURLConnection.setRequestProperty((String) next.first, (String) next.second);
        }
    }

    /* renamed from: a */
    private static void m12427a(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    public void mo33156a(int i) {
        C4559a.m13270a("itp", (Object) Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo33157a(Context context) {
        C4559a.m13269a(context);
    }

    /* renamed from: a */
    public void mo33158a(C4369b bVar) {
        try {
            HashMap hashMap = new HashMap();
            String str = C4926a.f12585a;
            Intrinsics.checkNotNullExpressionValue(str, "OMIDManager.OMID_LIB_VERSION");
            hashMap.put("omv", str);
            hashMap.put("ompv", "7");
            String sDKVersion = SDKUtils.getSDKVersion();
            Intrinsics.checkNotNullExpressionValue(sDKVersion, "SDKUtils.getSDKVersion()");
            hashMap.put("sdkv", sDKVersion);
            C4559a.m13272a((Map<String, Object>) hashMap);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo33159a(Boolean bool) {
        C4559a.m13270a("fs", (Object) bool);
    }

    /* renamed from: a */
    public void mo33160a(String str) {
        C4559a.m13270a("apky", (Object) str);
    }

    /* renamed from: a */
    public void mo33161a(JSONObject jSONObject) {
        C4559a.m13270a("md", (Object) jSONObject);
    }

    /* renamed from: a */
    public void mo33162a(boolean z) {
        C4559a.m13270a("cnst", (Object) Boolean.valueOf(z));
    }

    /* renamed from: b */
    public void mo33163b(String str) {
        C4559a.m13270a("medv", (Object) str);
    }

    /* renamed from: b */
    public void mo33164b(JSONObject jSONObject) {
        C4559a.m13270a("tkgp", (Object) jSONObject);
    }

    /* renamed from: b */
    public void mo33165b(boolean z) {
        C4559a.m13270a("gpi", (Object) Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo33166c(String str) {
        C4559a.m13270a("sid", (Object) str);
    }

    /* renamed from: d */
    public void mo33167d(String str) {
        C4559a.m13270a("plugin", (Object) str);
    }

    /* renamed from: e */
    public void mo33168e(String str) {
        C4559a.m13270a("usid", (Object) str);
    }

    /* renamed from: f */
    public void mo33169f(String str) {
        C4559a.m13270a("audt", (Object) str);
    }
}
