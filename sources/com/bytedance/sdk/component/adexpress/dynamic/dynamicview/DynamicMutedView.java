package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.C10314a;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.utils.C10647t;

public class DynamicMutedView extends DynamicBaseWidgetImp implements C10314a {
    /* renamed from: e */
    public boolean mo63626e() {
        return true;
    }

    public DynamicMutedView(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        this.f25759o = new ImageView(context);
        this.f25759o.setTag(5);
        addView(this.f25759o, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        ((ImageView) this.f25759o).setScaleType(ImageView.ScaleType.CENTER);
        setSoundMute(this.f25758n.f25780b);
        GradientDrawable gradientDrawable = (GradientDrawable) C10647t.m31281c(getContext(), "tt_ad_skip_btn_bg");
        gradientDrawable.setCornerRadius((float) (this.f25752h / 2));
        gradientDrawable.setColor(this.f25756l.mo63537w());
        ((ImageView) this.f25759o).setBackgroundDrawable(gradientDrawable);
        return true;
    }

    public void setSoundMute(boolean z) {
        int i;
        if (z) {
            i = C10647t.m31282d(getContext(), "tt_mute");
        } else {
            i = C10647t.m31282d(getContext(), "tt_unmute");
        }
        ((ImageView) this.f25759o).setImageResource(i);
    }
}
