package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.adexpress.widget.DislikeView;

public class DynamicDislike extends DynamicBaseWidgetImp {
    public DynamicDislike(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        this.f25759o = new DislikeView(context);
        this.f25759o.setTag(3);
        addView(this.f25759o, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.f25759o);
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        int a = (int) C10305b.m29747a(this.f25755k, this.f25756l.mo63531q());
        if (!(this.f25759o instanceof DislikeView)) {
            return true;
        }
        ((DislikeView) this.f25759o).setRadius((int) C10305b.m29747a(this.f25755k, this.f25756l.mo63529o()));
        ((DislikeView) this.f25759o).setStrokeWidth(a);
        ((DislikeView) this.f25759o).setStrokeColor(this.f25756l.mo63530p());
        ((DislikeView) this.f25759o).setBgColor(this.f25756l.mo63537w());
        ((DislikeView) this.f25759o).setDislikeColor(this.f25756l.mo63521g());
        ((DislikeView) this.f25759o).setDislikeWidth((int) C10305b.m29747a(this.f25755k, 1.0f));
        return true;
    }
}
