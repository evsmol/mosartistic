package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C1002v;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.c */
/* compiled from: RewardFullNativeVideoLayout */
public class C0367c extends C0368d {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1004a() {
        return false;
    }

    public C0367c(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public void mo1003a(int i, int i2) {
        super.mo1003a(i, i2);
        if (this.f1220c != null && C0477n.m2012c(this.f1220c) && this.f1220c.mo1469t() == 3 && this.f1220c.mo1473v() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.f1219b.findViewById(C10647t.m31283e(this.f1219b, "tt_video_container_back"));
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.f1220c.mo1392am() == 1) {
                    int e = C1002v.m4749e(C0558m.m2663a(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = e;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
