package com.bytedance.sdk.openadsdk.component.p010e;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0558m;

/* renamed from: com.bytedance.sdk.openadsdk.component.e.b */
/* compiled from: TTAppOpenAdTopManager */
public class C0256b {

    /* renamed from: g */
    private static String f838g = "Skip";

    /* renamed from: a */
    private TextView f839a;

    /* renamed from: b */
    private TextView f840b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0255a f841c;

    /* renamed from: d */
    private int f842d = 0;

    /* renamed from: e */
    private float f843e = 5.0f;

    /* renamed from: f */
    private int f844f = 0;

    /* renamed from: h */
    private ValueAnimator f845h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f846i;

    /* renamed from: j */
    private boolean f847j;

    public C0256b() {
        f838g = C10647t.m31276a(C0558m.m2663a(), "tt_txt_skip");
    }

    /* renamed from: a */
    public void mo633a(Activity activity) {
        this.f839a = (TextView) activity.findViewById(C10647t.m31283e(activity, "tt_top_dislike"));
        this.f840b = (TextView) activity.findViewById(C10647t.m31283e(activity, "tt_top_skip"));
        this.f839a.setText(C10647t.m31276a(C0558m.m2663a(), "tt_reward_feedback"));
        m999g();
    }

    /* renamed from: g */
    private void m999g() {
        this.f839a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0256b.this.f841c != null) {
                    C0256b.this.f841c.mo27b(view);
                }
            }
        });
        this.f840b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0256b.this.f841c != null && C0256b.this.f846i) {
                    C0256b.this.f841c.mo26a(view);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo630a() {
        int i = (int) (this.f843e * 1000.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, i});
        this.f845h = ofInt;
        ofInt.setDuration((long) i);
        this.f845h.setInterpolator(new LinearInterpolator());
        this.f845h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0256b.this.mo632a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
    }

    /* renamed from: a */
    public void mo632a(int i) {
        this.f842d = i;
        float f = (((float) i) * 1.0f) / 1000.0f;
        int ceil = (int) Math.ceil((double) (this.f843e - f));
        if (ceil <= 0) {
            ceil = 0;
            C0255a aVar = this.f841c;
            if (aVar != null && !this.f847j) {
                aVar.mo25a();
                this.f847j = true;
            }
        }
        String valueOf = String.valueOf(ceil);
        if (f >= ((float) this.f844f)) {
            valueOf = valueOf + " | " + f838g;
            this.f846i = true;
        }
        this.f840b.setText(valueOf);
    }

    /* renamed from: a */
    public void mo631a(float f) {
        this.f843e = f;
        if (f <= 0.0f) {
            this.f843e = 5.0f;
        }
        mo630a();
    }

    /* renamed from: b */
    public void mo636b(int i) {
        this.f844f = i;
    }

    /* renamed from: a */
    public void mo634a(C0255a aVar) {
        this.f841c = aVar;
    }

    /* renamed from: b */
    public ValueAnimator mo635b() {
        return this.f845h;
    }

    /* renamed from: c */
    public void mo637c() {
        TextView textView = this.f840b;
        if (textView != null) {
            textView.performClick();
        }
    }

    /* renamed from: d */
    public int mo638d() {
        return this.f842d;
    }

    /* renamed from: e */
    public float mo639e() {
        return this.f843e;
    }

    /* renamed from: f */
    public int mo640f() {
        return this.f844f;
    }
}
