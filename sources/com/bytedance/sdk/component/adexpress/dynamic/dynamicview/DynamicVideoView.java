package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bytedance.sdk.component.adexpress.dynamic.C10374d;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;

public class DynamicVideoView extends DynamicBaseWidgetImp implements C10374d {

    /* renamed from: a */
    TextView f25807a;

    /* renamed from: b */
    boolean f25808b = false;

    /* renamed from: e */
    public boolean mo63626e() {
        return true;
    }

    public DynamicVideoView(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        this.f25759o = new View(context);
        this.f25759o.setTag(Integer.valueOf(getClickArea()));
        this.f25807a = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C10305b.m29747a(context, 40.0f), (int) C10305b.m29747a(context, 15.0f));
        layoutParams.gravity = 85;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.f25807a.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f25807a.setBackground(gradientDrawable);
        this.f25807a.setTextSize(10.0f);
        this.f25807a.setGravity(17);
        this.f25807a.setTextColor(-1);
        this.f25807a.setVisibility(8);
        addView(this.f25807a);
        addView(this.f25759o, getWidgetLayoutParams());
        dynamicRootView.setVideoListener(this);
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        double d = 0.0d;
        double d2 = 0.0d;
        for (C10351h hVar = this.f25757m; hVar != null; hVar = hVar.mo63565k()) {
            double e = d2 + ((double) hVar.mo63556e());
            double f = d + ((double) hVar.mo63558f());
            d2 = e - ((double) hVar.mo63552c());
            d = f - ((double) hVar.mo63554d());
        }
        try {
            float f2 = (float) d2;
            float f3 = (float) d;
            ((DynamicRoot) this.f25758n.getChildAt(0)).f25778a.mo63683a((int) C10305b.m29747a(getContext(), f2), (int) C10305b.m29747a(getContext(), f3), (int) C10305b.m29747a(getContext(), f2 + this.f25749e), (int) C10305b.m29747a(getContext(), f3 + this.f25750f));
        } catch (Exception unused) {
        }
        this.f25758n.mo63653a(d2, d, (double) this.f25749e, (double) this.f25750f, this.f25756l.mo63529o());
        return true;
    }

    public void setTimeUpdate(int i) {
        String str;
        String str2;
        if (!this.f25757m.mo63563i().mo63363e().mo63407ah() || i <= 0 || this.f25808b) {
            this.f25808b = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                m30290b(getChildAt(i2));
            }
            this.f25807a.setVisibility(8);
            return;
        }
        if (i >= 60) {
            str = "" + BuildConfig.ADAPTER_VERSION + (i / 60);
        } else {
            str = "00";
        }
        String str3 = str + ":";
        int i3 = i % 60;
        if (i3 > 9) {
            str2 = str3 + i3;
        } else {
            str2 = str3 + BuildConfig.ADAPTER_VERSION + i3;
        }
        this.f25807a.setText(str2);
        this.f25807a.setVisibility(0);
    }

    /* renamed from: b */
    private void m30290b(View view) {
        if (view != this.f25807a) {
            int i = 0;
            view.setVisibility(0);
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i < viewGroup.getChildCount()) {
                        m30290b(viewGroup.getChildAt(i));
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo63607a() {
        this.f25807a.setVisibility(8);
    }
}
