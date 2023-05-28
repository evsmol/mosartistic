package com.bytedance.sdk.openadsdk.component.p012g;

import android.content.Context;
import android.view.ViewGroup;
import com.bykv.p271vk.openvk.component.video.api.p287b.C10185a;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.p034c.C0651a;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.p000b.p002b.p003a.C0113a;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0130o;

/* renamed from: com.bytedance.sdk.openadsdk.component.g.a */
/* compiled from: TTAppOpenVideoController */
public class C0261a extends C0651a {

    /* renamed from: z */
    private boolean f852z = false;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int mo646t() {
        return 3;
    }

    public C0261a(Context context, ViewGroup viewGroup, C0477n nVar) {
        super(context, viewGroup, nVar);
        mo2140M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo644a(int i, int i2) {
        if (this.f2381h != null) {
            C0130o.C0131a aVar = new C0130o.C0131a();
            aVar.mo376b(mo2110h());
            aVar.mo379c(mo2112j());
            aVar.mo372a(mo2109g());
            aVar.mo371a(i);
            aVar.mo375b(i2);
            C0113a.m483c(mo2091F(), aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo647u() {
        if (!this.f852z) {
            this.f852z = true;
            C0130o.C0131a aVar = new C0130o.C0131a();
            aVar.mo372a(mo2109g());
            aVar.mo379c(mo2112j());
            aVar.mo376b(mo2110h());
            aVar.mo385f(mo2111i());
            C0113a.m480b(this.f2377d, aVar, (C0146j) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo648v() {
        C0130o.C0131a aVar = new C0130o.C0131a();
        aVar.mo372a(mo2109g());
        aVar.mo379c(mo2112j());
        aVar.mo376b(mo2110h());
        C0113a.m469a((C10185a) this.f2377d, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo649w() {
        C0130o.C0131a aVar = new C0130o.C0131a();
        aVar.mo372a(mo2109g());
        aVar.mo379c(mo2112j());
        aVar.mo376b(mo2110h());
        C0113a.m479b(mo2091F(), aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo650x() {
        C0130o.C0131a aVar = new C0130o.C0131a();
        aVar.mo373a(true);
        aVar.mo379c(mo2112j());
        C0113a.m468a((Context) this.f2381h.get(), (C10185a) this.f2377d, aVar, (C0146j) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo651y() {
        C0113a.m476a(this.f2378e, (C10185a) this.f2377d, this.f2441x);
    }

    /* renamed from: a */
    public void mo645a(C0130o.C0131a aVar) {
        C0113a.m470a((C10185a) this.f2377d, aVar, (C0146j) null);
    }

    /* renamed from: z */
    public void mo652z() {
        C0130o.C0131a aVar = new C0130o.C0131a();
        aVar.mo372a(mo2109g());
        aVar.mo379c(mo2112j());
        aVar.mo376b(mo2110h());
        aVar.mo385f(mo2111i());
        C0113a.m488e(this.f2377d, aVar);
    }
}
