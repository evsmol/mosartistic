package p163b;

import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import p150io.bidmachine.analytics.entity.Event;
import p158a.C5785a;

/* renamed from: b.a */
public class C6148a {

    /* renamed from: a */
    public final String f13101a;

    /* renamed from: b */
    public final long f13102b;

    /* renamed from: c */
    public final String f13103c;

    /* renamed from: d */
    public final String f13104d;

    /* renamed from: e */
    public final JSONObject f13105e;

    /* renamed from: f */
    public final JSONObject f13106f;

    public C6148a(String str, long j, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f13101a = str;
        this.f13102b = j;
        this.f13103c = str2;
        this.f13104d = str3;
        this.f13105e = jSONObject;
        this.f13106f = jSONObject2;
    }

    public C6148a(String str, Event event) {
        this(UUID.randomUUID().toString(), event.getTimestamp(), str, event.getName(), C5785a.m14751a((Map<?, ?>) event.getDimensions()), C5785a.m14751a((Map<?, ?>) event.getMetrics()));
    }

    /* renamed from: a */
    public String mo50202a() {
        return this.f13103c;
    }

    /* renamed from: b */
    public JSONObject mo50203b() {
        return this.f13105e;
    }

    /* renamed from: c */
    public String mo50204c() {
        return this.f13101a;
    }

    /* renamed from: d */
    public JSONObject mo50205d() {
        return this.f13106f;
    }

    /* renamed from: e */
    public String mo50206e() {
        return this.f13104d;
    }

    /* renamed from: f */
    public long mo50207f() {
        return this.f13102b;
    }
}
