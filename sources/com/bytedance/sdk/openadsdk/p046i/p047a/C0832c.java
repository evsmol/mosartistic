package com.bytedance.sdk.openadsdk.p046i.p047a;

import com.bytedance.sdk.component.p313d.C10558g;
import com.bytedance.sdk.component.p313d.C10561j;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.p021e.C0481q;
import com.bytedance.sdk.openadsdk.p046i.p047a.C0827a;

/* renamed from: com.bytedance.sdk.openadsdk.i.a.c */
/* compiled from: SplashGifLoader */
public class C0832c extends C0827a {

    /* renamed from: a */
    public static volatile int f3042a;

    /* renamed from: b */
    private C0481q f3043b;

    /* renamed from: a */
    private void m4071a(C10561j jVar) {
        C10558g e = jVar.mo64119e();
        if (e != null && m4073c()) {
            if (jVar.mo64118d()) {
                C10638l.m31235b("splashLoadAd", " GiftLoader doTask  缓存存在，直接返回缓存数据");
                f3042a = 1;
                m4072a(true);
            } else {
                C10638l.m31235b("splashLoadAd", " GiftLoader doTask  缓存存在，直接返回缓存数据");
                f3042a = 2;
                m4072a(false);
            }
            m4070a(e.mo64012a());
        }
    }

    /* renamed from: c */
    private boolean m4073c() {
        C0481q qVar = this.f3043b;
        return qVar != null && qVar.mo1504c();
    }

    /* renamed from: a */
    private void m4070a(long j) {
        this.f3043b.mo1505d(j);
        C0481q qVar = this.f3043b;
        qVar.mo1502b(j - qVar.mo1501b());
    }

    /* renamed from: a */
    private void m4072a(boolean z) {
        if (m4073c()) {
            this.f3043b.mo1500a(z);
        }
    }

    /* renamed from: d */
    private void m4074d() {
        if (m4073c()) {
            long currentTimeMillis = System.currentTimeMillis();
            C0481q qVar = this.f3043b;
            qVar.mo1499a(currentTimeMillis - qVar.mo1498a());
            this.f3043b.mo1503c(currentTimeMillis);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2635a(C10561j jVar, C0827a.C0830b bVar) {
        m4071a(jVar);
        super.mo2635a(jVar, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2633a() {
        m4074d();
    }
}
