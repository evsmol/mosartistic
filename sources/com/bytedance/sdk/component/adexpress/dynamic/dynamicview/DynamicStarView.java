package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.adexpress.widget.TTRatingBar2;

public class DynamicStarView extends DynamicBaseWidgetImp {

    /* renamed from: a */
    private int f25801a = 0;

    /* renamed from: b */
    private int f25802b = 0;

    public DynamicStarView(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        this.f25759o = new TTRatingBar2(context, (AttributeSet) null);
        this.f25759o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f25759o, getWidgetLayoutParams());
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        this.f25752h = (int) (((float) this.f25752h) + C10305b.m29747a(this.f25755k, (float) (this.f25756l.mo63516b() + this.f25756l.mo63513a())));
        int a = (int) ((C10305b.m29747a(C10303c.m29743a(), this.f25756l.mo63519e()) * 5.0f) + C10305b.m29747a(C10303c.m29743a(), ((float) this.f25756l.mo63517c()) + C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63518d())));
        if (this.f25751g > a && 4 == this.f25756l.mo63522h()) {
            this.f25801a = (this.f25751g - a) / 2;
        }
        this.f25802b = (int) C10305b.m29747a(this.f25755k, (float) this.f25756l.mo63516b());
        this.f25751g = a;
        return new FrameLayout.LayoutParams(this.f25751g, this.f25752h);
    }

    /* renamed from: f */
    public void mo63627f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f25751g, this.f25752h);
        layoutParams.topMargin = this.f25754j + this.f25802b;
        layoutParams.leftMargin = this.f25753i + this.f25801a;
        setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        double m = this.f25756l.mo63527m();
        if (!C10303c.m29744b() || (m >= 0.0d && m <= 5.0d && (this.f25758n == null || this.f25758n.getRenderRequest() == null || this.f25758n.getRenderRequest().mo63185k() == 4))) {
            if (m < 0.0d || m > 5.0d) {
                m = 5.0d;
            }
            this.f25759o.setVisibility(0);
            ((TTRatingBar2) this.f25759o).mo63831a(m, this.f25756l.mo63521g(), (int) this.f25756l.mo63519e());
            return true;
        }
        this.f25759o.setVisibility(8);
        return true;
    }
}
