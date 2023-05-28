package com.explorestack.iab.utils;

import android.content.Context;
import android.view.View;
import com.explorestack.iab.vast.view.CircleCountdownView;
import com.explorestack.iab.vast.view.LinearCountdownView;
import com.explorestack.iab.vast.view.TextCountdownView;

/* renamed from: com.explorestack.iab.utils.j */
public class C1400j extends C1395g<View> {
    public C1400j(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    /* renamed from: a */
    public void mo4129a(float f, int i, int i2) {
        IabElementStyle iabElementStyle = this.f4317c;
        if (iabElementStyle != null) {
            int i3 = 0;
            boolean z = iabElementStyle.getStyle() != null && this.f4317c.getStyle().endsWith("reverse");
            T t = this.f4316b;
            if (t instanceof TextCountdownView) {
                TextCountdownView textCountdownView = (TextCountdownView) t;
                if (i2 == 0) {
                    textCountdownView.setText("");
                    return;
                }
                if (z) {
                    i = i2 - i;
                }
                textCountdownView.setRemaining(Math.max(1, i));
            } else if (t instanceof CircleCountdownView) {
                CircleCountdownView circleCountdownView = (CircleCountdownView) t;
                if (z) {
                    if (i2 != 0) {
                        i3 = Math.max(1, i2 - i);
                    }
                    circleCountdownView.changePercentage(f, i3);
                    return;
                }
                circleCountdownView.changePercentage(100.0f - f, i);
            } else if (t instanceof LinearCountdownView) {
                LinearCountdownView linearCountdownView = (LinearCountdownView) t;
                if (z) {
                    f = 100.0f - f;
                }
                linearCountdownView.changePercentage(f);
            }
        }
    }

    /* renamed from: b */
    public View mo4104b(Context context, IabElementStyle iabElementStyle) {
        return ("text".equals(iabElementStyle.getStyle()) || "text-reverse".equals(iabElementStyle.getStyle())) ? new TextCountdownView(context) : ("circular".equals(iabElementStyle.getStyle()) || "circular-reverse".equals(iabElementStyle.getStyle())) ? new CircleCountdownView(context) : new LinearCountdownView(context);
    }

    /* renamed from: c */
    public IabElementStyle mo4105c(Context context, IabElementStyle iabElementStyle) {
        if (iabElementStyle != null) {
            if ("text".equals(iabElementStyle.getStyle()) || "text-reverse".equals(iabElementStyle.getStyle())) {
                return Assets.defTextProgressStyle;
            }
            if ("circular".equals(iabElementStyle.getStyle()) || "circular-reverse".equals(iabElementStyle.getStyle())) {
                return Assets.defCountDownProgressStyle;
            }
        }
        return Assets.defLinearProgressStyle;
    }
}
