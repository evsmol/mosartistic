package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10647t;

public class CircleLongPressView extends FrameLayout {

    /* renamed from: a */
    private Context f25888a;

    /* renamed from: b */
    private ImageView f25889b;

    /* renamed from: c */
    private ImageView f25890c;

    /* renamed from: d */
    private TextView f25891d;

    /* renamed from: e */
    private RingProgressView f25892e;

    /* renamed from: f */
    private AnimatorSet f25893f = new AnimatorSet();

    public CircleLongPressView(Context context) {
        super(context);
        this.f25888a = context;
        m30360e();
        m30361f();
    }

    /* renamed from: e */
    private void m30360e() {
        FrameLayout frameLayout = new FrameLayout(this.f25888a);
        this.f25892e = new RingProgressView(this.f25888a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C10305b.m29747a(this.f25888a, 95.0f), (int) C10305b.m29747a(this.f25888a, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.f25892e, layoutParams);
        ImageView imageView = new ImageView(this.f25888a);
        this.f25889b = imageView;
        imageView.setImageResource(C10647t.m31282d(this.f25888a, "tt_interact_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C10305b.m29747a(this.f25888a, 75.0f), (int) C10305b.m29747a(this.f25888a, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.f25889b, layoutParams2);
        ImageView imageView2 = new ImageView(this.f25888a);
        this.f25890c = imageView2;
        imageView2.setImageResource(C10647t.m31282d(this.f25888a, "tt_interact_oval"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C10305b.m29747a(this.f25888a, 63.0f), (int) C10305b.m29747a(this.f25888a, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.f25890c, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.f25888a);
        this.f25891d = textView;
        textView.setTextColor(-1);
        this.f25891d.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.f25891d, layoutParams4);
    }

    /* renamed from: f */
    private void m30361f() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25890c, "scaleX", new float[]{1.0f, 0.9f});
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f25890c, "scaleY", new float[]{1.0f, 0.9f});
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f25893f.setDuration(800);
        this.f25893f.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void setGuideText(String str) {
        this.f25891d.setText(str);
    }

    /* renamed from: a */
    public void mo63724a() {
        this.f25893f.start();
    }

    /* renamed from: b */
    public void mo63725b() {
        this.f25893f.cancel();
    }

    /* renamed from: c */
    public void mo63726c() {
        this.f25892e.mo63775a();
    }

    /* renamed from: d */
    public void mo63727d() {
        this.f25892e.mo63776b();
        this.f25892e.mo63777c();
    }
}
