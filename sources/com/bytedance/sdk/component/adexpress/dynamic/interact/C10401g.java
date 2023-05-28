package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10350g;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.adexpress.widget.PressInteractView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.g */
/* compiled from: PressInteract */
public class C10401g implements C10396b<PressInteractView> {

    /* renamed from: a */
    private PressInteractView f25847a;

    public C10401g(Context context, DynamicBaseWidget dynamicBaseWidget, C10350g gVar) {
        this.f25847a = new PressInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C10305b.m29747a(context, 180.0f), (int) C10305b.m29747a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f25847a.setLayoutParams(layoutParams);
        this.f25847a.setGuideText(gVar.mo63510I());
    }

    /* renamed from: a */
    public void mo63692a() {
        this.f25847a.mo63766a();
    }

    /* renamed from: b */
    public void mo63693b() {
        this.f25847a.mo63767b();
    }

    /* renamed from: c */
    public PressInteractView mo63695d() {
        return this.f25847a;
    }
}
