package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10350g;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a */
/* compiled from: CircleLongPressInteract */
public class C10391a implements C10396b {

    /* renamed from: a */
    private CircleLongPressView f25824a;

    public C10391a(Context context, DynamicBaseWidget dynamicBaseWidget, C10350g gVar) {
        this.f25824a = new CircleLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C10305b.m29747a(context, 180.0f), (int) C10305b.m29747a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f25824a.setLayoutParams(layoutParams);
        this.f25824a.setGuideText(gVar.mo63510I());
    }

    /* renamed from: a */
    public void mo63692a() {
        this.f25824a.mo63724a();
    }

    /* renamed from: b */
    public void mo63693b() {
        this.f25824a.mo63725b();
    }

    /* renamed from: c */
    public CircleLongPressView mo63695d() {
        return this.f25824a;
    }
}
