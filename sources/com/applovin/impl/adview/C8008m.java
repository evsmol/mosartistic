package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.C7993i;

/* renamed from: com.applovin.impl.adview.m */
public class C8008m extends FrameLayout {

    /* renamed from: a */
    private C7993i f19340a;

    /* renamed from: b */
    private int f19341b;

    public C8008m(C7993i.C7994a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        C7993i a = C7993i.m23745a(aVar, activity);
        this.f19340a = a;
        addView(a);
    }

    /* renamed from: a */
    public void mo55765a(int i, int i2, int i3, int i4) {
        this.f19341b = i;
        int i5 = i2 + i + i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i5;
            layoutParams.width = i5;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i, i4);
        layoutParams2.setMargins(i3, i3, i3, 0);
        this.f19340a.setLayoutParams(layoutParams2);
        this.f19340a.mo55738a(i);
    }

    /* renamed from: a */
    public void mo55766a(C7993i.C7994a aVar) {
        if (aVar != null && aVar != this.f19340a.getStyle()) {
            ViewGroup.LayoutParams layoutParams = this.f19340a.getLayoutParams();
            removeView(this.f19340a);
            C7993i a = C7993i.m23745a(aVar, getContext());
            this.f19340a = a;
            addView(a);
            this.f19340a.setLayoutParams(layoutParams);
            this.f19340a.mo55738a(this.f19341b);
        }
    }
}
