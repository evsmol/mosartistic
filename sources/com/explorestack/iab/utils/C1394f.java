package com.explorestack.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.explorestack.iab.vast.view.IabTextView;

/* renamed from: com.explorestack.iab.utils.f */
public class C1394f extends C1395g<IabTextView> {
    public C1394f(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    /* renamed from: a */
    public void mo4102a(Context context, IabTextView iabTextView, IabElementStyle iabElementStyle) {
        super.mo4102a(context, iabTextView, iabElementStyle);
        iabTextView.setText(!TextUtils.isEmpty(iabElementStyle.getContent()) ? iabElementStyle.getContent() : "Learn more");
    }

    /* renamed from: c */
    public IabElementStyle mo4105c(Context context, IabElementStyle iabElementStyle) {
        return Assets.defCtaStyle;
    }

    /* renamed from: d */
    public IabTextView mo4104b(Context context, IabElementStyle iabElementStyle) {
        return new IabTextView(context);
    }
}
