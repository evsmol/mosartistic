package com.criteo.publisher.p069k0;

import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.logging.RemoteLogRecords;
import com.criteo.publisher.model.C1268o;
import com.criteo.publisher.model.C1271r;
import com.criteo.publisher.model.C1282w;
import com.criteo.publisher.model.C1284y;
import com.criteo.publisher.p064f0.C1121t;
import com.criteo.publisher.p074n0.C1300g;
import com.criteo.publisher.p074n0.C1308l;
import com.criteo.publisher.p074n0.C1314r;
import com.criteo.publisher.p074n0.C1315s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.criteo.publisher.k0.g */
/* compiled from: PubSdkApi */
public class C1166g {

    /* renamed from: a */
    private final C1195g f3701a = C1197h.m5407b(getClass());

    /* renamed from: b */
    private final C1300g f3702b;

    /* renamed from: c */
    private final C1308l f3703c;

    public C1166g(C1300g gVar, C1308l lVar) {
        this.f3702b = gVar;
        this.f3703c = lVar;
    }

    /* renamed from: a */
    public C1284y mo3264a(C1282w wVar) throws IOException {
        HttpURLConnection a = m5315a(new URL(this.f3702b.mo3631c() + "/config/app"), (String) null, "POST");
        m5319a(a, (Object) wVar);
        InputStream a2 = m5313a(a);
        try {
            C1284y yVar = (C1284y) this.f3703c.mo3659a(C1284y.class, a2);
            if (a2 != null) {
                a2.close();
            }
            return yVar;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: a */
    public C1271r mo3263a(C1268o oVar, String str) throws Exception {
        HttpURLConnection a = m5315a(new URL(this.f3702b.mo3631c() + "/inapp/v2"), str, "POST");
        a.setDoOutput(true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.f3703c.mo3660a((Object) oVar, (OutputStream) byteArrayOutputStream);
            this.f3701a.mo3337a(C1165f.m5312b(byteArrayOutputStream.toString("UTF-8")));
            a.getOutputStream().write(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
            InputStream a2 = m5313a(a);
            try {
                String a3 = C1314r.m5787a(a2);
                this.f3701a.mo3337a(C1165f.m5311a(a3));
                C1271r a4 = C1271r.m5632a(m5317a(a3));
                if (a2 != null) {
                    a2.close();
                }
                return a4;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* renamed from: a */
    public JSONObject mo3267a(int i, String str, String str2, String str3, int i2, String str4, String str5) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("appId", str);
        if (str2 != null) {
            hashMap.put("gaid", str2);
        }
        hashMap.put("eventType", str3);
        hashMap.put("limitedAdTracking", String.valueOf(i2));
        if (str5 != null) {
            hashMap.put("gdpr_consent", str5);
        }
        InputStream a = mo3266a(new URL(this.f3702b.mo3638j() + ("/appevent/v1/" + i + "?" + m5314a((Map<String, String>) hashMap))), str4);
        try {
            JSONObject a2 = m5316a(a);
            if (a != null) {
                a.close();
            }
            return a2;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: a */
    public InputStream mo3265a(URL url) throws IOException {
        return mo3266a(url, (String) null);
    }

    /* renamed from: a */
    public void mo3268a(C1121t tVar) throws IOException {
        m5318a("/csm", (Object) tVar);
    }

    /* renamed from: a */
    public void mo3269a(List<RemoteLogRecords> list) throws IOException {
        m5318a("/inapp/logs", (Object) list);
    }

    /* renamed from: a */
    private void m5318a(String str, Object obj) throws IOException {
        HttpURLConnection a = m5315a(new URL(this.f3702b.mo3631c() + str), (String) null, "POST");
        m5319a(a, obj);
        m5313a(a).close();
    }

    /* renamed from: a */
    public InputStream mo3266a(URL url, String str) throws IOException {
        return m5313a(m5315a(url, str, "GET"));
    }

    /* renamed from: a */
    private HttpURLConnection m5315a(URL url, String str, String str2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setReadTimeout(this.f3702b.mo3642n());
        httpURLConnection.setConnectTimeout(this.f3702b.mo3642n());
        httpURLConnection.setRequestProperty("Content-Type", "text/plain");
        if (!C1315s.m5789a((CharSequence) str)) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        return httpURLConnection;
    }

    /* renamed from: a */
    private static InputStream m5313a(HttpURLConnection httpURLConnection) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200 || responseCode == 204) {
            return httpURLConnection.getInputStream();
        }
        throw new C1162d(responseCode);
    }

    /* renamed from: a */
    private static JSONObject m5316a(InputStream inputStream) throws IOException, JSONException {
        return m5317a(C1314r.m5787a(inputStream));
    }

    /* renamed from: a */
    private static JSONObject m5317a(String str) throws JSONException {
        if (C1315s.m5789a((CharSequence) str)) {
            return new JSONObject();
        }
        return new JSONObject(str);
    }

    /* renamed from: a */
    private void m5319a(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            this.f3703c.mo3660a(obj, outputStream);
            if (outputStream != null) {
                outputStream.close();
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: a */
    private String m5314a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry next : map.entrySet()) {
                sb.append(URLEncoder.encode((String) next.getKey(), Charset.forName("UTF-8").name()));
                sb.append("=");
                sb.append(URLEncoder.encode((String) next.getValue(), Charset.forName("UTF-8").name()));
                sb.append("&");
            }
        } catch (Exception e) {
            this.f3701a.mo3338a("Impossible to encode params string", (Throwable) e);
        }
        if (sb.length() > 0) {
            return sb.substring(0, sb.length() - 1);
        }
        return sb.toString();
    }
}
