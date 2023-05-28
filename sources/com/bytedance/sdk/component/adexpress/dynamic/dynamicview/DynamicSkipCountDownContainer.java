package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.C10342b;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import java.util.List;

public class DynamicSkipCountDownContainer extends DynamicBaseWidgetImp implements C10342b {

    /* renamed from: a */
    private int f25798a;

    /* renamed from: b */
    private int f25799b;

    /* renamed from: s */
    private int f25800s;

    public DynamicSkipCountDownContainer(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        m30267a();
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    /* renamed from: h */
    public boolean mo63645h() {
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(getBackgroundDrawable());
        }
        setPadding((int) C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63517c()), (int) C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63516b()), (int) C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63518d()), (int) C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63513a()));
        return true;
    }

    /* renamed from: f */
    public void mo63627f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f25753i;
        layoutParams.topMargin = this.f25754j;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f25800s == 0) {
            setMeasuredDimension(this.f25799b, this.f25752h);
        } else {
            setMeasuredDimension(this.f25798a, this.f25752h);
        }
    }

    /* renamed from: a */
    public void mo63313a(CharSequence charSequence, boolean z, int i) {
        this.f25800s = i;
    }

    /* renamed from: a */
    private void m30267a() {
        List<C10351h> j = this.f25757m.mo63564j();
        if (j != null && j.size() > 0) {
            for (C10351h next : j) {
                if (next.mo63563i().mo63354a() == 21) {
                    this.f25798a = (int) (((float) this.f25751g) - C10305b.m29747a(this.f25755k, next.mo63560g()));
                }
                if (next.mo63563i().mo63354a() == 20) {
                    this.f25799b = (int) (((float) this.f25751g) - C10305b.m29747a(this.f25755k, next.mo63560g()));
                }
            }
        }
    }
}
