package com.explorestack.iab.utils;

import android.content.Context;
import android.view.View;

/* renamed from: com.explorestack.iab.utils.h */
public class C1398h extends C1395g<CircularProgressBar> {
    public C1398h(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    /* renamed from: c */
    public IabElementStyle mo4105c(Context context, IabElementStyle iabElementStyle) {
        return Assets.defLoadingStyle;
    }

    /* renamed from: d */
    public CircularProgressBar mo4104b(Context context, IabElementStyle iabElementStyle) {
        return new CircularProgressBar(context);
    }
}
