package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10350g;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideView;
import com.bytedance.sdk.component.utils.C10647t;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.k */
/* compiled from: WriggleGuideInteract */
public class C10406k implements C10396b<WriggleGuideAnimationView> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WriggleGuideAnimationView f25863a;

    /* renamed from: b */
    private Context f25864b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public DynamicBaseWidget f25865c;

    /* renamed from: d */
    private C10350g f25866d;

    /* renamed from: e */
    private String f25867e;

    /* renamed from: f */
    private int f25868f;

    public C10406k(Context context, DynamicBaseWidget dynamicBaseWidget, C10350g gVar, String str, int i) {
        this.f25864b = context;
        this.f25865c = dynamicBaseWidget;
        this.f25866d = gVar;
        this.f25867e = str;
        this.f25868f = i;
        m30346e();
    }

    /* renamed from: e */
    private void m30346e() {
        int F = this.f25866d.mo63507F();
        if ("18".equals(this.f25867e)) {
            Context context = this.f25864b;
            WriggleGuideAnimationView wriggleGuideAnimationView = new WriggleGuideAnimationView(context, C10647t.m31284f(context, "tt_hand_wriggle_guide"), this.f25868f);
            this.f25863a = wriggleGuideAnimationView;
            if (wriggleGuideAnimationView.getWriggleLayout() != null) {
                this.f25863a.getWriggleLayout().setOnClickListener((View.OnClickListener) this.f25865c.getDynamicClickListener());
            }
            if (this.f25863a.getTopTextView() != null) {
                this.f25863a.getTopTextView().setText(C10647t.m31279b(this.f25864b, "tt_splash_wriggle_top_text_style_17"));
            }
        } else {
            Context context2 = this.f25864b;
            this.f25863a = new WriggleGuideAnimationView(context2, C10647t.m31284f(context2, "tt_hand_wriggle_guide"), this.f25868f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) C10305b.m29747a(this.f25864b, (float) F);
        this.f25863a.setLayoutParams(layoutParams);
        this.f25863a.setShakeText(this.f25866d.mo63510I());
        this.f25863a.setClipChildren(false);
        final WriggleGuideView wriggleProgressIv = this.f25863a.getWriggleProgressIv();
        this.f25863a.setOnShakeViewListener(new WriggleGuideAnimationView.C10439a() {
            /* renamed from: a */
            public void mo63706a() {
                WriggleGuideView wriggleGuideView = wriggleProgressIv;
                if (wriggleGuideView != null) {
                    wriggleGuideView.mo63853a(new WriggleGuideView.C10441a() {
                        /* renamed from: a */
                        public void mo63707a() {
                            C10406k.this.f25863a.setOnClickListener((View.OnClickListener) C10406k.this.f25865c.getDynamicClickListener());
                            C10406k.this.f25863a.performClick();
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void mo63692a() {
        this.f25863a.mo63838a();
    }

    /* renamed from: b */
    public void mo63693b() {
        this.f25863a.clearAnimation();
    }

    /* renamed from: c */
    public WriggleGuideAnimationView mo63695d() {
        return this.f25863a;
    }
}
