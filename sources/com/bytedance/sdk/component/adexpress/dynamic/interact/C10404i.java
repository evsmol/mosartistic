package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10350g;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.adexpress.widget.SlideRightView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.i */
/* compiled from: SlideRightInteract */
public class C10404i implements C10396b {

    /* renamed from: a */
    private SlideRightView f25855a;

    /* renamed from: b */
    private Context f25856b;

    /* renamed from: c */
    private DynamicBaseWidget f25857c;

    /* renamed from: d */
    private C10350g f25858d;

    /* renamed from: b */
    public void mo63693b() {
    }

    public C10404i(Context context, DynamicBaseWidget dynamicBaseWidget, C10350g gVar) {
        this.f25856b = context;
        this.f25857c = dynamicBaseWidget;
        this.f25858d = gVar;
        m30335c();
    }

    /* renamed from: c */
    private void m30335c() {
        this.f25855a = new SlideRightView(this.f25856b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C10305b.m29747a(this.f25856b, 120.0f), (int) C10305b.m29747a(this.f25856b, 120.0f));
        layoutParams.gravity = 17;
        this.f25855a.setLayoutParams(layoutParams);
        this.f25855a.setClipChildren(false);
        this.f25855a.setGuideText(this.f25858d.mo63510I());
    }

    /* renamed from: a */
    public void mo63692a() {
        this.f25855a.mo63807a();
    }

    /* renamed from: d */
    public ViewGroup mo63695d() {
        return this.f25855a;
    }
}
