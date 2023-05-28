package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10350g;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.adexpress.widget.HandLongPressView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.e */
/* compiled from: LongPressInteract */
public class C10399e implements C10396b {

    /* renamed from: a */
    private HandLongPressView f25845a;

    public C10399e(Context context, DynamicBaseWidget dynamicBaseWidget, C10350g gVar) {
        this.f25845a = new HandLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C10305b.m29747a(context, 180.0f), (int) C10305b.m29747a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f25845a.setLayoutParams(layoutParams);
        this.f25845a.setGuideText(gVar.mo63510I());
    }

    /* renamed from: a */
    public void mo63692a() {
        this.f25845a.mo63750a();
    }

    /* renamed from: b */
    public void mo63693b() {
        this.f25845a.mo63751b();
    }

    /* renamed from: d */
    public ViewGroup mo63695d() {
        return this.f25845a;
    }
}
