package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.C10342b;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.utils.C10647t;

public class DynamicSkipCountDown extends DynamicButton implements C10342b {
    public DynamicSkipCountDown(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
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
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f25751g, this.f25752h);
        layoutParams.leftMargin = this.f25753i;
        layoutParams.gravity = 16;
        setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo63313a(CharSequence charSequence, boolean z, int i) {
        if (i != 0) {
            String a = C10647t.m31276a(C10303c.m29743a(), "tt_reward_full_skip_count_down");
            ((TextView) this.f25759o).setText(" | " + String.format(a, new Object[]{Integer.valueOf(i)}));
        } else if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        requestLayout();
    }
}
