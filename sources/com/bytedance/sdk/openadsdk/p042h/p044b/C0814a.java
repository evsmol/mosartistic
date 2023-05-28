package com.bytedance.sdk.openadsdk.p042h.p044b;

import com.bytedance.sdk.component.p328f.C10612c;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.p328f.p329a.C10610a;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.p042h.C0796b;

/* renamed from: com.bytedance.sdk.openadsdk.h.b.a */
/* compiled from: ReportThreadLogServiceImp */
public class C0814a implements C10612c {
    /* renamed from: a */
    public void mo2619a(final C10610a aVar) {
        if (C0558m.m2673h().mo1668F() && aVar != null && aVar.mo64240a() != null) {
            C10615e.m31160a(new C10618g("ReportThreadLogServiceImp") {
                public void run() {
                    C0796b.m3985a().mo2608a("stats_sdk_thread_num", aVar.mo64240a());
                }
            }, 5);
        }
    }
}
