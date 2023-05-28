package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.utils.C10647t;

public class DynamicLogoUnion extends DynamicBaseWidgetImp {
    public DynamicLogoUnion(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        this.f25759o = new ImageView(context);
        this.f25759o.setTag(Integer.valueOf(getClickArea()));
        if (C10303c.m29744b()) {
            this.f25752h = Math.max(dynamicRootView.getLogoUnionHeight(), this.f25752h);
        }
        addView(this.f25759o, getWidgetLayoutParams());
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        if (C10303c.m29744b()) {
            ((ImageView) this.f25759o).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f25759o).setImageResource(C10647t.m31282d(getContext(), "tt_ad_logo_reward_full"));
        } else {
            ((ImageView) this.f25759o).setImageResource(C10647t.m31282d(getContext(), "tt_ad_logo"));
        }
        ((ImageView) this.f25759o).setColorFilter(this.f25756l.mo63521g());
        return true;
    }
}
