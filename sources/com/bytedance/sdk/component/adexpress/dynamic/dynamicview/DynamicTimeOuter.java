package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.C10342b;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;

public class DynamicTimeOuter extends DynamicButton implements C10342b {
    public DynamicTimeOuter(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(hVar.mo63563i().mo63357b())) {
            dynamicRootView.setTimedown(this.f25752h);
        }
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        if ("timedown".equals(this.f25757m.mo63563i().mo63357b())) {
            ((TextView) this.f25759o).setText(String.valueOf((int) Double.parseDouble(this.f25756l.mo63524j())));
            return true;
        }
        ((TextView) this.f25759o).setText(((int) Double.parseDouble(this.f25756l.mo63524j())) + "s");
        return true;
    }

    /* renamed from: f */
    public void mo63627f() {
        if (TextUtils.equals("skip-with-countdowns-video-countdown", this.f25757m.mo63563i().mo63357b()) || TextUtils.equals("skip-with-time-countdown", this.f25757m.mo63563i().mo63357b())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f25751g, this.f25752h);
            layoutParams.gravity = 19;
            setLayoutParams(layoutParams);
            return;
        }
        super.mo63627f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.f25759o).getText())) {
            setMeasuredDimension(0, this.f25752h);
        }
    }

    /* renamed from: a */
    public void mo63313a(CharSequence charSequence, boolean z, int i) {
        if ("timedown".equals(this.f25757m.mo63563i().mo63357b())) {
            ((TextView) this.f25759o).setText(charSequence);
            return;
        }
        ((TextView) this.f25759o).setText(charSequence + "s");
    }
}
