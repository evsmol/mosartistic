package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0590e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0591f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0597j;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.b */
/* compiled from: RewardFullExpressVideoLayout */
public class C0366b {

    /* renamed from: a */
    C1008c f1206a;

    /* renamed from: b */
    Handler f1207b;

    /* renamed from: c */
    boolean f1208c = false;

    /* renamed from: d */
    boolean f1209d = false;

    /* renamed from: e */
    boolean f1210e = false;

    /* renamed from: f */
    private Activity f1211f;

    /* renamed from: g */
    private C0477n f1212g;

    /* renamed from: h */
    private String f1213h;

    /* renamed from: i */
    private FullRewardExpressView f1214i;

    public C0366b(Activity activity) {
        this.f1211f = activity;
    }

    /* renamed from: a */
    public void mo988a(C0477n nVar, AdSlot adSlot, String str, boolean z) {
        if (!this.f1210e) {
            this.f1210e = true;
            this.f1212g = nVar;
            this.f1213h = str;
            this.f1214i = new FullRewardExpressView(this.f1211f, nVar, adSlot, str, z);
        }
    }

    /* renamed from: a */
    public FullRewardExpressView mo985a() {
        return this.f1214i;
    }

    /* renamed from: b */
    public FrameLayout mo992b() {
        FullRewardExpressView fullRewardExpressView = this.f1214i;
        if (fullRewardExpressView == null) {
            return null;
        }
        FrameLayout videoFrameLayout = fullRewardExpressView.getVideoFrameLayout();
        if (this.f1214i.mo1899n()) {
            mo986a(videoFrameLayout);
        }
        return videoFrameLayout;
    }

    /* renamed from: c */
    public boolean mo994c() {
        return this.f1208c;
    }

    /* renamed from: a */
    public void mo991a(boolean z) {
        this.f1208c = z;
    }

    /* renamed from: d */
    public boolean mo995d() {
        return this.f1209d;
    }

    /* renamed from: b */
    public void mo993b(boolean z) {
        this.f1209d = z;
    }

    /* renamed from: a */
    public void mo989a(C0591f fVar, C0590e eVar) {
        C0477n nVar;
        if (this.f1214i != null && (nVar = this.f1212g) != null) {
            this.f1206a = m1537a(nVar);
            C0136e.m606a(this.f1212g);
            EmptyView a = m1536a((ViewGroup) this.f1214i);
            if (a == null) {
                a = new EmptyView(this.f1211f, this.f1214i);
                this.f1214i.addView(a);
            }
            fVar.mo1100a((View) this.f1214i);
            fVar.mo1106a(this.f1206a);
            this.f1214i.setClickListener(fVar);
            eVar.mo1100a((View) this.f1214i);
            eVar.mo1106a(this.f1206a);
            this.f1214i.setClickCreativeListener(eVar);
            a.setNeedCheckingShow(false);
        }
    }

    /* renamed from: a */
    private C1008c m1537a(C0477n nVar) {
        if (nVar.mo1332L() == 4) {
            return C1009d.m4776a(this.f1211f, nVar, this.f1213h);
        }
        return null;
    }

    /* renamed from: a */
    private EmptyView m1536a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo990a(C0597j jVar) {
        FullRewardExpressView fullRewardExpressView = this.f1214i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.setExpressVideoListenerProxy(jVar);
        }
    }

    /* renamed from: a */
    public void mo987a(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        FullRewardExpressView fullRewardExpressView = this.f1214i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.setExpressInteractionListener(expressAdInteractionListener);
        }
    }

    /* renamed from: e */
    public Handler mo996e() {
        if (this.f1207b == null) {
            this.f1207b = new Handler(Looper.getMainLooper());
        }
        return this.f1207b;
    }

    /* renamed from: f */
    public void mo997f() {
        FullRewardExpressView fullRewardExpressView = this.f1214i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mo1897l();
        }
        Handler handler = this.f1207b;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: g */
    public void mo998g() {
        FullRewardExpressView fullRewardExpressView = this.f1214i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mo1896k();
        }
    }

    /* renamed from: h */
    public boolean mo999h() {
        FullRewardExpressView fullRewardExpressView = this.f1214i;
        if (fullRewardExpressView == null) {
            return false;
        }
        return fullRewardExpressView.mo1899n();
    }

    /* renamed from: i */
    public int mo1000i() {
        FullRewardExpressView fullRewardExpressView = this.f1214i;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.getDynamicShowType();
        }
        return 0;
    }

    /* renamed from: j */
    public void mo1001j() {
        FullRewardExpressView fullRewardExpressView = this.f1214i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mo1894i();
        }
    }

    /* renamed from: k */
    public void mo1002k() {
        FullRewardExpressView fullRewardExpressView = this.f1214i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mo1895j();
            this.f1214i.mo1896k();
        }
    }

    /* renamed from: a */
    public void mo986a(FrameLayout frameLayout) {
        C0477n nVar = this.f1212g;
        if (nVar != null && C0477n.m2012c(nVar) && this.f1212g.mo1469t() == 3 && this.f1212g.mo1473v() == 0) {
            try {
                if (this.f1212g.mo1392am() == 1) {
                    int e = C1002v.m4749e(C0558m.m2663a(), 90.0f);
                    FrameLayout frameLayout2 = (FrameLayout) this.f1214i.getBackupContainerBackgroundView();
                    if (frameLayout2 != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
                        layoutParams.bottomMargin = e;
                        frameLayout2.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
