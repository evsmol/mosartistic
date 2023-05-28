package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;

public class DynamicRoot extends DynamicBaseWidgetImp {

    /* renamed from: a */
    public C10386a f25778a;

    public DynamicRoot(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
    }

    /* renamed from: h */
    public boolean mo63645h() {
        return super.mo63645h();
    }

    /* access modifiers changed from: protected */
    public GradientDrawable getDrawable() {
        C10386a aVar = new C10386a();
        this.f25778a = aVar;
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GradientDrawable mo63621a(GradientDrawable.Orientation orientation, int[] iArr) {
        C10386a aVar = new C10386a(orientation, iArr);
        this.f25778a = aVar;
        return aVar;
    }
}
