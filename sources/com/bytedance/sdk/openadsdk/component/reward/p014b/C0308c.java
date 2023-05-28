package com.bytedance.sdk.openadsdk.component.reward.p014b;

import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0269c;
import com.bytedance.sdk.openadsdk.component.reward.p014b.C0301a;
import com.bytedance.sdk.openadsdk.component.reward.view.C0368d;
import com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.c */
/* compiled from: RewardFullTypeInteraction */
public class C0308c extends C0301a {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public FullInteractionStyleView f1021i;

    public C0308c(Activity activity, C0477n nVar, int i, int i2) {
        super(activity, nVar, i, i2);
    }

    /* renamed from: a */
    public void mo845a(FrameLayout frameLayout) {
        FullInteractionStyleView fullInteractionStyleView = new FullInteractionStyleView(this.f996a, this.f1002g);
        this.f1021i = fullInteractionStyleView;
        fullInteractionStyleView.setDownloadListener(this.f1003h);
        this.f1021i.mo958a(this.f997b, this.f1001f, this.f1000e, this.f998c, this.f999d);
        frameLayout.addView(this.f1021i.getInteractionStyleRootView());
    }

    /* renamed from: a */
    public static boolean m1325a(C0477n nVar) {
        return (nVar == null || nVar.mo1393an() == 100.0f) ? false : true;
    }

    /* renamed from: a */
    public C0301a.C0302a mo842a() {
        return new C0301a.C0302a() {
            /* renamed from: a */
            public void mo851a(boolean z) {
                if (C0308c.this.f1021i != null) {
                    C0308c.this.f1021i.setIsMute(z);
                }
            }
        };
    }

    /* renamed from: d */
    public FrameLayout mo859d() {
        FullInteractionStyleView fullInteractionStyleView = this.f1021i;
        if (fullInteractionStyleView != null) {
            return fullInteractionStyleView.getVideoContainer();
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo849b() {
        return m1326e();
    }

    /* renamed from: c */
    public boolean mo850c() {
        return m1326e();
    }

    /* renamed from: a */
    public void mo846a(C0269c cVar, C0368d dVar) {
        dVar.mo1016b(8);
        dVar.mo1007a(8);
        if (this.f997b.mo1447l() == 2) {
            cVar.mo702a(false);
            cVar.mo709c(false);
            cVar.mo711d(false);
            dVar.mo1021d(8);
            return;
        }
        cVar.mo702a(this.f997b.mo1395ap());
        cVar.mo709c(m1326e());
        cVar.mo711d(m1326e());
        if (m1326e()) {
            dVar.mo1021d(8);
            return;
        }
        cVar.mo710d();
        dVar.mo1021d(0);
    }

    /* renamed from: e */
    private boolean m1326e() {
        return C0477n.m2012c(this.f997b);
    }
}
