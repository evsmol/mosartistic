package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.C10342b;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10647t;

public class DynamicSkipCountDownBtn extends DynamicButton implements C10342b {

    /* renamed from: a */
    private int[] f25795a;

    /* renamed from: b */
    private int f25796b;

    /* renamed from: s */
    private int f25797s;

    public DynamicSkipCountDownBtn(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        ((TextView) this.f25759o).setText("");
        return true;
    }

    /* renamed from: f */
    public void mo63627f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f25751g, this.f25752h);
        layoutParams.gravity = 21;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.f25759o).getText())) {
            setMeasuredDimension(0, this.f25752h);
        } else {
            setMeasuredDimension(this.f25751g, this.f25752h);
        }
    }

    /* renamed from: a */
    public void mo63313a(CharSequence charSequence, boolean z, int i) {
        String a = C10647t.m31276a(C10303c.m29743a(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.f25759o.setVisibility(0);
            ((TextView) this.f25759o).setText(" | " + a);
            this.f25759o.measure(-2, -2);
            this.f25795a = new int[]{this.f25759o.getMeasuredWidth() + 1, this.f25759o.getMeasuredHeight()};
            View view = this.f25759o;
            int[] iArr = this.f25795a;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.f25759o).setGravity(17);
            ((TextView) this.f25759o).setIncludeFontPadding(false);
            m30263a();
            this.f25759o.setPadding(this.f25756l.mo63517c(), this.f25796b, this.f25756l.mo63518d(), this.f25797s);
        }
        requestLayout();
    }

    /* renamed from: a */
    private void m30263a() {
        this.f25796b = ((this.f25752h - ((int) C10305b.m29747a(this.f25755k, this.f25756l.mo63519e()))) / 2) - this.f25756l.mo63513a();
        this.f25797s = 0;
    }
}
