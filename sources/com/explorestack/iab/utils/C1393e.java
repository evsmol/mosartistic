package com.explorestack.iab.utils;

import android.content.Context;
import android.view.View;
import com.explorestack.iab.vast.view.CircleCountdownView;
import com.explorestack.iab.vast.view.TextCountdownView;

/* renamed from: com.explorestack.iab.utils.e */
public class C1393e extends C1395g<View> {
    public C1393e(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    /* renamed from: a */
    public void mo4107a(int i, int i2) {
        T t = this.f4316b;
        if (t instanceof TextCountdownView) {
            TextCountdownView textCountdownView = (TextCountdownView) t;
            if (i2 == 0) {
                textCountdownView.setText("");
            } else {
                textCountdownView.setRemaining(i2);
            }
        } else if (t instanceof CircleCountdownView) {
            ((CircleCountdownView) t).changePercentage((float) i, i2);
        }
    }

    /* renamed from: b */
    public View mo4104b(Context context, IabElementStyle iabElementStyle) {
        return "text".equals(iabElementStyle.getStyle()) ? new TextCountdownView(context) : new CircleCountdownView(context);
    }

    /* renamed from: c */
    public IabElementStyle mo4105c(Context context, IabElementStyle iabElementStyle) {
        return (iabElementStyle == null || !"text".equals(iabElementStyle.getStyle())) ? Assets.defCountDownStyle : Assets.defTextCountDownStyle;
    }
}
