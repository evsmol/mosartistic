package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.p298b.C10296l;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10631h;

public class DynamicBaseWidgetImp extends DynamicBaseWidget {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public InteractViewContainer f25764a;

    public DynamicBaseWidgetImp(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        String b = hVar.mo63563i().mo63357b();
        if ("logo-union".equals(b)) {
            dynamicRootView.setLogoUnionHeight(this.f25752h - ((int) C10305b.m29747a(context, (float) (this.f25756l.mo63516b() + this.f25756l.mo63513a()))));
        } else if ("scoreCountWithIcon".equals(b)) {
            dynamicRootView.setScoreCountWithIcon(this.f25752h - ((int) C10305b.m29747a(context, (float) (this.f25756l.mo63516b() + this.f25756l.mo63513a()))));
        }
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f25751g, this.f25752h);
    }

    /* renamed from: h */
    public boolean mo63645h() {
        final View view = this.f25759o == null ? this : this.f25759o;
        view.setContentDescription(this.f25756l.mo63512K());
        Drawable backgroundDrawable = getBackgroundDrawable();
        if (backgroundDrawable != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.f25756l.mo63538x() > 0) {
            postDelayed(new Runnable() {
                public void run() {
                    try {
                        view.setBackground(DynamicBaseWidgetImp.this.mo63619a(true, DynamicBaseWidgetImp.this.f25758n.getBgColor()));
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.f25756l.mo63538x() * 1000));
        }
        if (this.f25759o != null) {
            this.f25759o.setPadding((int) C10305b.m29747a(this.f25755k, (float) this.f25756l.mo63517c()), (int) C10305b.m29747a(this.f25755k, (float) this.f25756l.mo63516b()), (int) C10305b.m29747a(this.f25755k, (float) this.f25756l.mo63518d()), (int) C10305b.m29747a(this.f25755k, (float) this.f25756l.mo63513a()));
        }
        if (this.f25760p || this.f25756l.mo63528n() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        final View view = this.f25759o == null ? this : this.f25759o;
        double l = this.f25757m.mo63563i().mo63363e().mo63464l();
        if (l < 90.0d && l > 0.0d) {
            C10631h.m31218b().postDelayed(new Runnable() {
                public void run() {
                    DynamicBaseWidgetImp.this.setVisibility(8);
                }
            }, (long) (l * 1000.0d));
        }
        double k = this.f25757m.mo63563i().mo63363e().mo63460k();
        if (k > 0.0d) {
            C10631h.m31218b().postDelayed(new Runnable() {
                public void run() {
                    if (DynamicBaseWidgetImp.this.f25757m.mo63563i().mo63363e().mo63402ac() == null) {
                        view.setVisibility(0);
                        DynamicBaseWidgetImp.this.setVisibility(0);
                    }
                }
            }, (long) (k * 1000.0d));
        }
        if (!TextUtils.isEmpty(this.f25756l.mo63505D())) {
            mo63607a();
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void mo63607a() {
        int G = this.f25756l.mo63508G();
        int H = this.f25756l.mo63509H();
        postDelayed(new Runnable() {
            public void run() {
                if (DynamicBaseWidgetImp.this.f25758n == null || DynamicBaseWidgetImp.this.f25758n.getRenderRequest() == null) {
                    DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                    Context context = DynamicBaseWidgetImp.this.f25755k;
                    DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                    InteractViewContainer unused = dynamicBaseWidgetImp.f25764a = new InteractViewContainer(context, dynamicBaseWidgetImp2, dynamicBaseWidgetImp2.f25756l);
                } else {
                    C10296l renderRequest = DynamicBaseWidgetImp.this.f25758n.getRenderRequest();
                    int p = renderRequest.mo63190p();
                    int q = renderRequest.mo63191q();
                    DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                    Context context2 = DynamicBaseWidgetImp.this.f25755k;
                    DynamicBaseWidgetImp dynamicBaseWidgetImp4 = DynamicBaseWidgetImp.this;
                    InteractViewContainer unused2 = dynamicBaseWidgetImp3.f25764a = new InteractViewContainer(context2, dynamicBaseWidgetImp4, dynamicBaseWidgetImp4.f25756l, p, q);
                }
                DynamicBaseWidgetImp dynamicBaseWidgetImp5 = DynamicBaseWidgetImp.this;
                dynamicBaseWidgetImp5.mo63623a((View) dynamicBaseWidgetImp5.f25764a);
                DynamicBaseWidgetImp.this.f25764a.setTag(2);
                DynamicBaseWidgetImp dynamicBaseWidgetImp6 = DynamicBaseWidgetImp.this;
                dynamicBaseWidgetImp6.addView(dynamicBaseWidgetImp6.f25764a, new FrameLayout.LayoutParams(-1, -1));
                DynamicBaseWidgetImp.this.f25764a.mo63686b();
            }
        }, ((long) G) * 1000);
        if (H < Integer.MAX_VALUE && G < H) {
            postDelayed(new Runnable() {
                public void run() {
                    if (DynamicBaseWidgetImp.this.f25764a != null) {
                        DynamicBaseWidgetImp.this.f25764a.setVisibility(8);
                    }
                }
            }, ((long) H) * 1000);
        }
    }
}
