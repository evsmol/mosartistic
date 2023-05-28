package com.bytedance.sdk.openadsdk.p039f.p040a;

import com.bytedance.sdk.component.p293a.C10221d;
import com.bytedance.sdk.component.p293a.C10225f;
import com.bytedance.sdk.component.p293a.C10245r;
import com.bytedance.sdk.openadsdk.core.C0709w;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.c */
/* compiled from: DoNewClickEventMethod */
public class C0780c extends C10221d<JSONObject, JSONObject> {

    /* renamed from: a */
    private WeakReference<C0709w> f2949a;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2556d() {
    }

    /* renamed from: a */
    public static void m3918a(C10245r rVar, final C0709w wVar) {
        rVar.mo63071a("newClickEvent", (C10221d.C10223b) new C10221d.C10223b() {
            /* renamed from: a */
            public C10221d mo2557a() {
                return new C0780c(wVar);
            }
        });
    }

    public C0780c(C0709w wVar) {
        this.f2949a = new WeakReference<>(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2554a(JSONObject jSONObject, C10225f fVar) throws Exception {
        C0709w wVar = (C0709w) this.f2949a.get();
        if (wVar == null) {
            mo63031c();
        } else {
            wVar.mo2379d(jSONObject);
        }
    }
}
