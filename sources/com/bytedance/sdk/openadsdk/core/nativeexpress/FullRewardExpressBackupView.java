package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C10281b;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.p021e.C0460j;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;

public class FullRewardExpressBackupView extends BackupView {

    /* renamed from: a */
    private View f2106a;

    /* renamed from: m */
    private NativeExpressView f2107m;

    /* renamed from: n */
    private FrameLayout f2108n;

    public FullRewardExpressBackupView(Context context) {
        super(context);
        this.f2092b = context;
    }

    /* renamed from: a */
    public void mo1871a(C0477n nVar, NativeExpressView nativeExpressView) {
        C10638l.m31235b("FullRewardExpressBackupView", "show backup view");
        if (nVar != null) {
            setBackgroundColor(-1);
            this.f2093c = nVar;
            this.f2107m = nativeExpressView;
            if (C0996u.m4653e(this.f2093c) == 7) {
                this.f2096f = "rewarded_video";
            } else {
                this.f2096f = "fullscreen_interstitial_ad";
            }
            m2706b();
            this.f2107m.addView(this, new ViewGroup.LayoutParams(-2, -2));
        }
    }

    /* renamed from: b */
    private void m2706b() {
        this.f2097g = C1002v.m4749e(this.f2092b, (float) this.f2107m.getExpectExpressWidth());
        this.f2098h = C1002v.m4749e(this.f2092b, (float) this.f2107m.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f2097g, this.f2098h);
        }
        layoutParams.width = this.f2097g;
        layoutParams.height = this.f2098h;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.f2093c.mo1473v();
        m2707c();
    }

    /* renamed from: c */
    private void m2707c() {
        View inflate = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_backup_full_reward"), this, true);
        this.f2106a = inflate;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_video_container"));
        this.f2108n = frameLayout;
        frameLayout.removeAllViews();
    }

    public FrameLayout getVideoContainer() {
        return this.f2108n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo957a(View view, int i, C0460j jVar) {
        NativeExpressView nativeExpressView = this.f2107m;
        if (nativeExpressView != null) {
            nativeExpressView.mo965a(view, i, (C10281b) jVar);
        }
    }

    public View getBackupContainerBackgroundView() {
        return this.f2106a;
    }
}
