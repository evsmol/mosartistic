package com.bytedance.sdk.openadsdk.core.p026j.p029b;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.b.b */
/* compiled from: VastFractionalProgressTracker */
public class C0529b extends C0532c implements Comparable<C0529b> {

    /* renamed from: a */
    private float f1989a;

    private C0529b(float f, String str, C0532c.C0535b bVar, Boolean bool) {
        super(str, bVar, bool);
        this.f1989a = f;
    }

    /* renamed from: a */
    public boolean mo1762a(float f) {
        return this.f1989a <= f && !mo1769e();
    }

    /* renamed from: a */
    public int compareTo(C0529b bVar) {
        if (bVar == null) {
            return 1;
        }
        float f = this.f1989a;
        float f2 = bVar.f1989a;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    /* renamed from: f_ */
    public void mo1765f_() {
        super.mo1765f_();
        float f = this.f1989a;
        if (f != 0.25f) {
            int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.b$a */
    /* compiled from: VastFractionalProgressTracker */
    public static class C0531a {

        /* renamed from: a */
        private String f1990a;

        /* renamed from: b */
        private float f1991b;

        /* renamed from: c */
        private C0532c.C0535b f1992c = C0532c.C0535b.TRACKING_URL;

        /* renamed from: d */
        private boolean f1993d = false;

        public C0531a(String str, float f) {
            this.f1990a = str;
            this.f1991b = f;
        }

        /* renamed from: a */
        public C0529b mo1766a() {
            return new C0529b(this.f1991b, this.f1990a, this.f1992c, Boolean.valueOf(this.f1993d));
        }
    }

    /* renamed from: b */
    public JSONObject mo1763b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, mo1767c());
        jSONObject.put("trackingFraction", (double) this.f1989a);
        return jSONObject;
    }
}
