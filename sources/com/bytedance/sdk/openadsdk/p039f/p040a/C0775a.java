package com.bytedance.sdk.openadsdk.p039f.p040a;

import com.bytedance.sdk.component.p293a.C10221d;
import com.bytedance.sdk.component.p293a.C10225f;
import com.bytedance.sdk.component.p293a.C10245r;
import com.bytedance.sdk.openadsdk.core.C0709w;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p041g.C0786c;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.a */
/* compiled from: DoGetAdsFromNetworkAsyncMethod */
public class C0775a extends C10221d<JSONObject, JSONObject> {

    /* renamed from: a */
    private WeakReference<C0709w> f2944a;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2556d() {
    }

    /* renamed from: a */
    public static void m3905a(C10245r rVar, final C0709w wVar) {
        rVar.mo63071a("getNetworkData", (C10221d.C10223b) new C10221d.C10223b() {
            /* renamed from: a */
            public C10221d mo2557a() {
                return new C0775a(wVar);
            }
        });
    }

    public C0775a(C0709w wVar) {
        this.f2944a = new WeakReference<>(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2554a(JSONObject jSONObject, C10225f fVar) throws Exception {
        C0709w wVar = (C0709w) this.f2944a.get();
        if (wVar == null) {
            mo63031c();
        } else {
            wVar.mo2360a(jSONObject, (C0786c) new C0786c() {
                /* renamed from: a */
                public void mo2408a(boolean z, List<C0477n> list) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (z) {
                            jSONObject.put("creatives", C0709w.m3608b(list));
                            C0775a.this.mo63028a(jSONObject);
                            return;
                        }
                        C0775a.this.mo63028a(jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
