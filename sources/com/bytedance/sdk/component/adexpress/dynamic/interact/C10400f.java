package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10350g;
import com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.f */
/* compiled from: PressButtonInteract */
public class C10400f implements C10396b {

    /* renamed from: a */
    private PressButtonInteractView f25846a;

    public C10400f(Context context, DynamicBaseWidget dynamicBaseWidget, C10350g gVar) {
        this.f25846a = new PressButtonInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicBaseWidget.getDynamicHeight(), dynamicBaseWidget.getDynamicHeight());
        layoutParams.gravity = 21;
        this.f25846a.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo63692a() {
        this.f25846a.mo63759a();
    }

    /* renamed from: b */
    public void mo63693b() {
        this.f25846a.mo63760b();
    }

    /* renamed from: c */
    public PressButtonInteractView mo63695d() {
        return this.f25846a;
    }
}
