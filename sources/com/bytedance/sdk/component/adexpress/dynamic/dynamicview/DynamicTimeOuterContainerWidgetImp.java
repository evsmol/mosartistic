package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.C10342b;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import java.util.Iterator;
import java.util.List;

public class DynamicTimeOuterContainerWidgetImp extends DynamicBaseWidgetImp implements C10342b {

    /* renamed from: a */
    int f25803a;

    /* renamed from: b */
    boolean f25804b;

    /* renamed from: s */
    private int f25805s = 0;

    public DynamicTimeOuterContainerWidgetImp(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        m30283a();
        dynamicRootView.setTimeOutListener(this);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    /* renamed from: f */
    public void mo63627f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.f25804b) {
            layoutParams.leftMargin = this.f25753i;
        } else {
            layoutParams.leftMargin = this.f25753i + this.f25805s;
        }
        layoutParams.topMargin = this.f25754j;
        setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        setPadding((int) C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63517c()), (int) C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63516b()), (int) C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63518d()), (int) C10305b.m29747a(C10303c.m29743a(), (float) this.f25756l.mo63513a()));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f25804b) {
            setMeasuredDimension(this.f25751g, this.f25752h);
        } else {
            setMeasuredDimension(this.f25803a, this.f25752h);
        }
    }

    /* renamed from: a */
    private void m30283a() {
        List<C10351h> j = this.f25757m.mo63564j();
        if (j != null && j.size() > 0) {
            Iterator<C10351h> it = j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C10351h next = it.next();
                if (TextUtils.equals("skip-with-time-skip-btn", next.mo63563i().mo63357b())) {
                    this.f25803a = (int) (((float) this.f25751g) - C10305b.m29747a(this.f25755k, next.mo63560g()));
                    break;
                }
            }
            this.f25805s = this.f25751g - this.f25803a;
        }
    }

    /* renamed from: a */
    public void mo63313a(CharSequence charSequence, boolean z, int i) {
        if (z && this.f25804b != z) {
            this.f25804b = z;
            mo63627f();
        }
        this.f25804b = z;
    }
}
