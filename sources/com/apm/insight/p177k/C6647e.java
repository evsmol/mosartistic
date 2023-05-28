package com.apm.insight.p177k;

import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.apm.insight.C6617h;
import com.apm.insight.Npth;
import com.apm.insight.p178l.C6677k;
import com.apm.insight.p178l.C6688q;
import com.explorestack.protobuf.openrtb.LossReason;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.e */
public class C6647e {

    /* renamed from: a */
    public static boolean f14296a = false;

    /* renamed from: b */
    private static C6655h f14297b;

    /* renamed from: com.apm.insight.k.e$a */
    public enum C6648a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: d */
        final int f14302d;

        private C6648a(int i) {
            this.f14302d = i;
        }
    }

    /* renamed from: com.apm.insight.k.e$b */
    public enum C6649b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        

        /* renamed from: l */
        final int f14315l;

        private C6649b(int i) {
            this.f14315l = i;
        }
    }

    /* renamed from: a */
    public static C6660l m16409a(long j, String str, byte[] bArr, C6648a aVar, String str2, boolean z) {
        StringBuilder sb;
        String str3;
        if (Npth.isStopUpload()) {
            return new C6660l(201);
        }
        if (str == null) {
            return new C6660l(201);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        String str4 = null;
        if (C6648a.GZIP == aVar && length > 128) {
            bArr = m16425b(bArr);
            str4 = "gzip";
        } else if (C6648a.DEFLATER == aVar && length > 128) {
            bArr = m16420a(bArr);
            str4 = "deflate";
        }
        String str5 = str4;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            return new C6660l(LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE);
        }
        if (!z) {
            return m16413a(str, bArr2, str2, str5, "POST", true, false);
        }
        byte[] a = C6617h.m16315i().getEncryptImpl().mo52022a(bArr2);
        if (a != null) {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                str3 = "?";
                if (!str.endsWith(str3)) {
                    sb = new StringBuilder();
                }
                str = str + "tt_data=a";
                str2 = "application/octet-stream;tt-data=a";
                bArr2 = a;
            } else {
                str3 = "&";
                if (!str.endsWith(str3)) {
                    sb = new StringBuilder();
                }
                str = str + "tt_data=a";
                str2 = "application/octet-stream;tt-data=a";
                bArr2 = a;
            }
            sb.append(str);
            sb.append(str3);
            str = sb.toString();
            str = str + "tt_data=a";
            str2 = "application/octet-stream;tt-data=a";
            bArr2 = a;
        }
        return m16413a(str, bArr2, str2, str5, "POST", true, true);
    }

    /* renamed from: a */
    public static C6660l m16410a(String str, String str2) {
        return m16411a(str, str2, m16424b());
    }

    /* renamed from: a */
    public static C6660l m16411a(String str, String str2, boolean z) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str)) {
                    return m16409a(2097152, str, str2.getBytes(), C6648a.GZIP, "application/json; charset=utf-8", z);
                }
            }
            return new C6660l(201);
        } catch (Throwable th) {
            C6688q.m16632b(th);
            return new C6660l((int) LossReason.LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS_VALUE, th);
        }
    }

    /* renamed from: a */
    public static C6660l m16412a(String str, String str2, File... fileArr) {
        return m16422b(str, str2, fileArr);
    }

    /* renamed from: a */
    private static C6660l m16413a(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) {
        return m16423b(str, bArr, str2, str3, str4, z, z2);
    }

    /* renamed from: a */
    private static String m16414a(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append("&");
                    }
                    sb.append(m16430d(entry.getKey().toString(), "UTF-8"));
                    sb.append("=");
                    sb.append(m16430d(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static void m16415a(C6655h hVar) {
        f14297b = hVar;
    }

    /* renamed from: a */
    public static boolean m16416a() {
        return true;
    }

    /* renamed from: a */
    public static boolean m16417a(String str, String str2, String str3, String str4, List<String> list) {
        if (Npth.isStopUpload()) {
            return false;
        }
        try {
            C6657j jVar = new C6657j(str, "UTF-8", false);
            jVar.mo52148a("aid", str2);
            jVar.mo52148a("device_id", str3);
            jVar.mo52148a("os", APSAnalytics.OS_NAME);
            jVar.mo52148a("process_name", str4);
            for (String file : list) {
                File file2 = new File(file);
                if (file2.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "崩溃");
                    jVar.mo52147a(file2.getName(), file2, (Map<String, String>) hashMap);
                }
            }
            try {
                return new JSONObject(jVar.mo52146a()).optInt("errno", -1) == 200;
            } catch (JSONException unused) {
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m16418a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    C6677k.m16550a((Closeable) byteArrayOutputStream);
                }
            }
        }
    }

    /* renamed from: a */
    public static byte[] m16419a(String str, Map<String, String> map, byte[] bArr) {
        try {
            return m16409a(2097152, m16414a(str, (Map) map), bArr, C6648a.GZIP, "application/json; charset=utf-8", false).mo52153b();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m16420a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    public static C6660l m16421b(String str, String str2) {
        return m16411a(str, str2, m16416a());
    }

    /* renamed from: b */
    public static C6660l m16422b(String str, String str2, File... fileArr) {
        if (Npth.isStopUpload()) {
            return new C6660l(201);
        }
        try {
            C6657j jVar = new C6657j(m16428c(str, "have_dump=true&encrypt=true"), "UTF-8", true);
            jVar.mo52149a("json", str2, true);
            jVar.mo52150a("file", fileArr);
            try {
                return new C6660l(0, new JSONObject(jVar.mo52146a()));
            } catch (JSONException e) {
                return new C6660l(0, (Throwable) e);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return new C6660l(LossReason.LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS_VALUE);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|(2:4|5)|6|7|(3:9|10|11)(1:12)|(1:14)|(1:16)|17|(4:19|(6:23|24|25|26|27|28)|35|(8:37|38|39|(6:41|42|43|44|45|46)(1:52)|53|(2:55|56)|57|59)(5:62|63|(2:65|66)|67|69))(3:70|71|72)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f A[Catch:{ all -> 0x0053, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[Catch:{ all -> 0x0053, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c A[Catch:{ all -> 0x0053, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[Catch:{ all -> 0x0053, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bd A[SYNTHETIC, Splitter:B:70:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d8 A[SYNTHETIC, Splitter:B:80:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.apm.insight.p177k.C6660l m16423b(java.lang.String r3, byte[] r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            java.lang.String r9 = "gzip"
            r0 = 0
            com.apm.insight.k.h r1 = f14297b     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x000d
            com.apm.insight.k.h r1 = f14297b     // Catch:{ all -> 0x000d }
            java.lang.String r3 = r1.mo52144a(r3, r4)     // Catch:{ all -> 0x000d }
        L_0x000d:
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x00ca }
            r1.<init>(r3)     // Catch:{ all -> 0x00ca }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ all -> 0x00ca }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ all -> 0x00ca }
            if (r8 == 0) goto L_0x001f
            r8 = 1
            r3.setDoOutput(r8)     // Catch:{ all -> 0x00c5 }
            goto L_0x0023
        L_0x001f:
            r8 = 0
            r3.setDoOutput(r8)     // Catch:{ all -> 0x00c5 }
        L_0x0023:
            if (r5 == 0) goto L_0x002a
            java.lang.String r8 = "Content-Type"
            r3.setRequestProperty(r8, r5)     // Catch:{ all -> 0x00c5 }
        L_0x002a:
            if (r6 == 0) goto L_0x0031
            java.lang.String r5 = "Content-Encoding"
            r3.setRequestProperty(r5, r6)     // Catch:{ all -> 0x00c5 }
        L_0x0031:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r9)     // Catch:{ all -> 0x00c5 }
            if (r7 == 0) goto L_0x00bd
            r3.setRequestMethod(r7)     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x005b
            int r5 = r4.length     // Catch:{ all -> 0x00c5 }
            if (r5 <= 0) goto L_0x005b
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ all -> 0x0055 }
            java.io.OutputStream r6 = r3.getOutputStream()     // Catch:{ all -> 0x0055 }
            r5.<init>(r6)     // Catch:{ all -> 0x0055 }
            r5.write(r4)     // Catch:{ all -> 0x0053 }
            r5.flush()     // Catch:{ all -> 0x0053 }
            com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r5)     // Catch:{ all -> 0x00c5 }
            goto L_0x005b
        L_0x0053:
            r4 = move-exception
            goto L_0x0057
        L_0x0055:
            r4 = move-exception
            r5 = r0
        L_0x0057:
            com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r5)     // Catch:{ all -> 0x00c5 }
            throw r4     // Catch:{ all -> 0x00c5 }
        L_0x005b:
            int r4 = r3.getResponseCode()     // Catch:{ all -> 0x00c5 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x009c
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = r3.getContentEncoding()     // Catch:{ all -> 0x0097 }
            boolean r5 = r9.equalsIgnoreCase(r5)     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x0086
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0081 }
            r5.<init>(r4)     // Catch:{ all -> 0x0081 }
            byte[] r6 = m16418a((java.io.InputStream) r5)     // Catch:{ all -> 0x007e }
            com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r5)     // Catch:{ all -> 0x0097 }
            goto L_0x008a
        L_0x007e:
            r6 = move-exception
            r0 = r5
            goto L_0x0082
        L_0x0081:
            r6 = move-exception
        L_0x0082:
            com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r0)     // Catch:{ all -> 0x0097 }
            throw r6     // Catch:{ all -> 0x0097 }
        L_0x0086:
            byte[] r6 = m16418a((java.io.InputStream) r4)     // Catch:{ all -> 0x0097 }
        L_0x008a:
            com.apm.insight.k.l r5 = m16426c(r6)     // Catch:{ all -> 0x0097 }
            if (r3 == 0) goto L_0x0093
            r3.disconnect()     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r4)
            return r5
        L_0x0097:
            r5 = move-exception
            r0 = r3
            r3 = r4
            r4 = r5
            goto L_0x00cc
        L_0x009c:
            com.apm.insight.k.l r5 = new com.apm.insight.k.l     // Catch:{ all -> 0x00c5 }
            r6 = 206(0xce, float:2.89E-43)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            r7.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = "http response code "
            r7.append(r8)     // Catch:{ all -> 0x00c5 }
            r7.append(r4)     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x00c5 }
            r5.<init>((int) r6, (java.lang.String) r4)     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x00b9
            r3.disconnect()     // Catch:{ Exception -> 0x00b9 }
        L_0x00b9:
            com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r0)
            return r5
        L_0x00bd:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = "request method is not null"
            r4.<init>(r5)     // Catch:{ all -> 0x00c5 }
            throw r4     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r4 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L_0x00cc
        L_0x00ca:
            r4 = move-exception
            r3 = r0
        L_0x00cc:
            com.apm.insight.p178l.C6688q.m16630a((java.lang.Throwable) r4)     // Catch:{ all -> 0x00df }
            com.apm.insight.k.l r5 = new com.apm.insight.k.l     // Catch:{ all -> 0x00df }
            r6 = 207(0xcf, float:2.9E-43)
            r5.<init>((int) r6, (java.lang.Throwable) r4)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00db
            r0.disconnect()     // Catch:{ Exception -> 0x00db }
        L_0x00db:
            com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r3)
            return r5
        L_0x00df:
            r4 = move-exception
            if (r0 == 0) goto L_0x00e5
            r0.disconnect()     // Catch:{ Exception -> 0x00e5 }
        L_0x00e5:
            com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p177k.C6647e.m16423b(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):com.apm.insight.k.l");
    }

    /* renamed from: b */
    public static boolean m16424b() {
        return true;
    }

    /* renamed from: b */
    private static byte[] m16425b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }

    /* renamed from: c */
    private static C6660l m16426c(byte[] bArr) {
        return new C6660l(204, bArr);
    }

    /* renamed from: c */
    public static String m16427c() {
        return C6617h.m16315i().getJavaCrashUploadUrl();
    }

    /* renamed from: c */
    private static String m16428c(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith("&")) {
                str = str + "&";
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: d */
    public static String m16429d() {
        return C6617h.m16315i().getAlogUploadUrl();
    }

    /* renamed from: d */
    private static String m16430d(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static String m16431e() {
        return C6617h.m16315i().getLaunchCrashUploadUrl();
    }

    /* renamed from: f */
    public static String m16432f() {
        return C6617h.m16315i().getExceptionUploadUrl();
    }

    /* renamed from: g */
    public static String m16433g() {
        return C6617h.m16315i().getNativeCrashUploadUrl();
    }
}
