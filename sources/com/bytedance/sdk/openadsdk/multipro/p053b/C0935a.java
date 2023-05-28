package com.bytedance.sdk.openadsdk.multipro.p053b;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.b.a */
/* compiled from: VideoControllerDataModel */
public class C0935a {

    /* renamed from: a */
    public boolean f3246a;

    /* renamed from: b */
    public boolean f3247b;

    /* renamed from: c */
    public boolean f3248c;

    /* renamed from: d */
    public boolean f3249d;

    /* renamed from: e */
    public long f3250e;

    /* renamed from: f */
    public long f3251f;

    /* renamed from: g */
    public long f3252g;

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.b.a$a */
    /* compiled from: VideoControllerDataModel */
    public interface C0936a {
        /* renamed from: f */
        C0935a mo612f();
    }

    /* renamed from: a */
    public C0935a mo2872a(boolean z) {
        this.f3249d = z;
        return this;
    }

    /* renamed from: b */
    public C0935a mo2875b(boolean z) {
        this.f3246a = z;
        return this;
    }

    /* renamed from: c */
    public C0935a mo2877c(boolean z) {
        this.f3247b = z;
        return this;
    }

    /* renamed from: d */
    public C0935a mo2878d(boolean z) {
        this.f3248c = z;
        return this;
    }

    /* renamed from: a */
    public C0935a mo2871a(long j) {
        this.f3250e = j;
        return this;
    }

    /* renamed from: b */
    public C0935a mo2874b(long j) {
        this.f3251f = j;
        return this;
    }

    /* renamed from: c */
    public C0935a mo2876c(long j) {
        this.f3252g = j;
        return this;
    }

    /* renamed from: a */
    public JSONObject mo2873a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.f3246a);
            jSONObject.put("isFromVideoDetailPage", this.f3247b);
            jSONObject.put("isFromDetailPage", this.f3248c);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, this.f3250e);
            jSONObject.put("totalPlayDuration", this.f3251f);
            jSONObject.put("currentPlayPosition", this.f3252g);
            jSONObject.put("isAutoPlay", this.f3249d);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C0935a m4335a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C0935a aVar = new C0935a();
        aVar.mo2875b(jSONObject.optBoolean("isCompleted"));
        aVar.mo2877c(jSONObject.optBoolean("isFromVideoDetailPage"));
        aVar.mo2878d(jSONObject.optBoolean("isFromDetailPage"));
        aVar.mo2871a(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION));
        aVar.mo2874b(jSONObject.optLong("totalPlayDuration"));
        aVar.mo2876c(jSONObject.optLong("currentPlayPosition"));
        aVar.mo2872a(jSONObject.optBoolean("isAutoPlay"));
        return aVar;
    }
}
