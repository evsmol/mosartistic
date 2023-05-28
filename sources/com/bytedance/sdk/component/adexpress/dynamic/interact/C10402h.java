package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10350g;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.utils.C10647t;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.h */
/* compiled from: ShakeInteract */
public class C10402h implements C10396b<ShakeAnimationView> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ShakeAnimationView f25848a;

    /* renamed from: b */
    private Context f25849b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public DynamicBaseWidget f25850c;

    /* renamed from: d */
    private C10350g f25851d;

    /* renamed from: e */
    private String f25852e;

    /* renamed from: f */
    private int f25853f;

    public C10402h(Context context, DynamicBaseWidget dynamicBaseWidget, C10350g gVar, String str, int i) {
        this.f25849b = context;
        this.f25850c = dynamicBaseWidget;
        this.f25851d = gVar;
        this.f25852e = str;
        this.f25853f = i;
        m30329e();
    }

    /* renamed from: e */
    private void m30329e() {
        if ("16".equals(this.f25852e)) {
            Context context = this.f25849b;
            ShakeAnimationView shakeAnimationView = new ShakeAnimationView(context, C10647t.m31284f(context, "tt_hand_shake_interaction_type_16"), this.f25853f);
            this.f25848a = shakeAnimationView;
            if (shakeAnimationView.getShakeLayout() != null) {
                this.f25848a.getShakeLayout().setOnClickListener((View.OnClickListener) this.f25850c.getDynamicClickListener());
            }
        } else {
            Context context2 = this.f25849b;
            this.f25848a = new ShakeAnimationView(context2, C10647t.m31284f(context2, "tt_hand_shake"), this.f25853f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) C10305b.m29747a(this.f25849b, 80.0f);
        this.f25848a.setLayoutParams(layoutParams);
        this.f25848a.setShakeText(this.f25851d.mo63510I());
        this.f25848a.setClipChildren(false);
        this.f25848a.setOnShakeViewListener(new ShakeAnimationView.C10424a() {
            /* renamed from: a */
            public void mo63703a() {
                C10402h.this.f25848a.setOnClickListener((View.OnClickListener) C10402h.this.f25850c.getDynamicClickListener());
                C10402h.this.f25848a.performClick();
            }
        });
    }

    /* renamed from: a */
    public void mo63692a() {
        this.f25848a.mo63793a();
    }

    /* renamed from: b */
    public void mo63693b() {
        this.f25848a.clearAnimation();
    }

    /* renamed from: c */
    public ShakeAnimationView mo63695d() {
        return this.f25848a;
    }
}
