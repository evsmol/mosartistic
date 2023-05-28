package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10350g;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.j */
/* compiled from: SlideUpInteract */
public class C10405j implements C10396b<SlideUpView> {

    /* renamed from: a */
    private SlideUpView f25859a;

    /* renamed from: b */
    private Context f25860b;

    /* renamed from: c */
    private DynamicBaseWidget f25861c;

    /* renamed from: d */
    private C10350g f25862d;

    public C10405j(Context context, DynamicBaseWidget dynamicBaseWidget, C10350g gVar) {
        this.f25860b = context;
        this.f25861c = dynamicBaseWidget;
        this.f25862d = gVar;
        m30339e();
    }

    /* renamed from: e */
    private void m30339e() {
        this.f25859a = new SlideUpView(this.f25860b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) C10305b.m29747a(this.f25860b, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) C10305b.m29747a(this.f25860b, 100.0f);
        this.f25859a.setLayoutParams(layoutParams);
        this.f25859a.setGuideText(this.f25862d.mo63510I());
    }

    /* renamed from: a */
    public void mo63692a() {
        this.f25859a.mo63814a();
    }

    /* renamed from: b */
    public void mo63693b() {
        this.f25859a.mo63816c();
    }

    /* renamed from: c */
    public SlideUpView mo63695d() {
        return this.f25859a;
    }
}
