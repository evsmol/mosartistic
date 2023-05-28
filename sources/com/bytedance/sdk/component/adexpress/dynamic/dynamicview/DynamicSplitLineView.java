package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;

public class DynamicSplitLineView extends DynamicBaseWidgetImp {
    public DynamicSplitLineView(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
        this.f25759o = new View(context);
        addView(this.f25759o, getWidgetLayoutParams());
    }

    /* renamed from: h */
    public boolean mo63645h() {
        super.mo63645h();
        this.f25759o.setBackgroundColor(this.f25756l.mo63537w());
        return true;
    }
}
