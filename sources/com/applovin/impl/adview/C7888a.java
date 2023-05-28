package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.a */
public class C7888a extends RelativeLayout {

    /* renamed from: a */
    private final ProgressBar f19039a;

    public C7888a(Context context, int i, int i2) {
        super(context);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, (AttributeSet) null, i2);
        this.f19039a = progressBar;
        progressBar.setIndeterminate(true);
        this.f19039a.setClickable(false);
        if (i == -2 || i == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i, i);
        } else {
            int dpToPx = AppLovinSdkUtils.dpToPx(context, i);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        }
        layoutParams.addRule(13);
        this.f19039a.setLayoutParams(layoutParams);
        addView(this.f19039a);
    }

    /* renamed from: a */
    public void mo55509a() {
        setVisibility(0);
    }

    /* renamed from: b */
    public void mo55510b() {
        setVisibility(8);
    }

    public void setColor(int i) {
        this.f19039a.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
