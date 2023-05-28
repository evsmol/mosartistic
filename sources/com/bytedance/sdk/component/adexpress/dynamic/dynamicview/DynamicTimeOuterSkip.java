package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.C10342b;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.utils.C10647t;

public class DynamicTimeOuterSkip extends DynamicButton implements C10342b {

    /* renamed from: a */
    private boolean f25806a;

    public DynamicTimeOuterSkip(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            this.f25806a = dynamicRootView.getRenderRequest().mo63188n();
        }
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        if (!TextUtils.equals(this.f25757m.mo63563i().mo63357b(), "skip-with-time-skip-btn")) {
            return true;
        }
        ((TextView) this.f25759o).setText("");
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.f25759o).getText())) {
            setMeasuredDimension(0, this.f25752h);
        }
    }

    /* renamed from: f */
    public void mo63627f() {
        if (TextUtils.equals("skip-with-time-skip-btn", this.f25757m.mo63563i().mo63357b())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f25751g, this.f25752h);
            layoutParams.gravity = 21;
            setLayoutParams(layoutParams);
        } else {
            super.mo63627f();
        }
        if (!"skip-with-time-skip-btn".equals(this.f25757m.mo63563i().mo63357b()) && Build.VERSION.SDK_INT >= 17) {
            this.f25759o.setTextAlignment(1);
            ((TextView) this.f25759o).setGravity(17);
        }
        setVisibility(8);
    }

    /* renamed from: a */
    public void mo63313a(CharSequence charSequence, boolean z, int i) {
        String a = C10647t.m31276a(C10303c.m29743a(), "tt_reward_screen_skip_tx");
        if (z) {
            if ("skip-with-time-skip-btn".equals(this.f25757m.mo63563i().mo63357b())) {
                if (C10303c.m29744b() && this.f25806a) {
                    a = "X";
                }
                ((TextView) this.f25759o).setText(" | " + a);
            } else {
                ((TextView) this.f25759o).setText(a);
            }
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        requestLayout();
    }
}
