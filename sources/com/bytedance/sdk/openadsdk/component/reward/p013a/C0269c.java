package com.bytedance.sdk.openadsdk.component.reward.p013a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.C10353c;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.component.reward.top.C0358b;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C1002v;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.c */
/* compiled from: RewardFullTopProxyManager */
public class C0269c {

    /* renamed from: a */
    TopProxyLayout f882a;

    /* renamed from: b */
    C10353c f883b;

    /* renamed from: c */
    private Activity f884c;

    /* renamed from: d */
    private boolean f885d = false;

    public C0269c(Activity activity) {
        this.f884c = activity;
    }

    /* renamed from: a */
    public void mo697a() {
        if (!this.f885d) {
            this.f885d = true;
            m1079e();
        }
    }

    /* renamed from: e */
    private void m1079e() {
        Activity activity = this.f884c;
        this.f882a = (TopProxyLayout) activity.findViewById(C10647t.m31283e(activity, "tt_top_layout_proxy"));
    }

    /* renamed from: a */
    public void mo703a(boolean z, C0477n nVar) {
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null) {
            topProxyLayout.mo952a(z, nVar);
        }
    }

    /* renamed from: a */
    public void mo702a(boolean z) {
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowDislike(z);
        }
    }

    /* renamed from: b */
    public void mo706b(boolean z) {
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null) {
            topProxyLayout.setSoundMute(z);
        }
        C10353c cVar = this.f883b;
        if (cVar != null) {
            cVar.setSoundMute(z);
        }
    }

    /* renamed from: c */
    public void mo709c(boolean z) {
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSound(z);
        }
    }

    /* renamed from: d */
    public void mo711d(boolean z) {
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSkip(z);
        }
    }

    /* renamed from: a */
    public void mo701a(String str, CharSequence charSequence) {
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null) {
            topProxyLayout.mo940a((CharSequence) String.valueOf(str), charSequence);
        }
    }

    /* renamed from: e */
    public void mo712e(boolean z) {
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null) {
            topProxyLayout.setSkipEnable(z);
        }
    }

    /* renamed from: b */
    public void mo704b() {
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null) {
            topProxyLayout.mo939a();
        }
    }

    /* renamed from: c */
    public void mo707c() {
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null) {
            topProxyLayout.mo941b();
        }
    }

    /* renamed from: d */
    public void mo710d() {
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null) {
            topProxyLayout.mo942c();
        }
    }

    /* renamed from: a */
    public void mo700a(C0358b bVar) {
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null) {
            topProxyLayout.setListener(bVar);
        }
    }

    /* renamed from: a */
    public void mo699a(C10353c cVar) {
        this.f883b = cVar;
    }

    /* renamed from: a */
    public void mo698a(int i) {
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null && (topProxyLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) this.f882a.getLayoutParams()).topMargin = i - C1002v.m4749e(this.f884c, 20.0f);
        }
    }

    /* renamed from: b */
    public void mo705b(int i) {
        View findViewById;
        TopProxyLayout topProxyLayout = this.f882a;
        if (topProxyLayout != null && topProxyLayout.getITopLayout() != null && (findViewById = this.f882a.getITopLayout().findViewById(C10647t.m31283e(C0558m.m2663a(), "tt_top_dislike"))) != null && (findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && findViewById.getWidth() > 0 && findViewById.getVisibility() == 0) {
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            int width = i - (iArr[0] + findViewById.getWidth());
            if (width < C1002v.m4749e(this.f884c, 16.0f)) {
                ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin += C1002v.m4749e(this.f884c, 16.0f) - width;
                findViewById.requestLayout();
            }
        }
    }

    /* renamed from: c */
    public void mo708c(int i) {
        this.f882a.setVisibility(i);
    }
}
