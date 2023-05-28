package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.utils.C1002v;

public class TTAdDislikeToast extends FrameLayout {

    /* renamed from: a */
    private Handler f691a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TextView f692b;

    public TTAdDislikeToast(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f691a = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        m833a(context);
    }

    /* renamed from: a */
    private void m833a(Context context) {
        TextView textView = new TextView(context);
        this.f692b = textView;
        textView.setClickable(false);
        this.f692b.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        int b = (int) C1002v.m4731b(C0558m.m2663a(), 20.0f);
        int b2 = (int) C1002v.m4731b(C0558m.m2663a(), 12.0f);
        this.f692b.setPadding(b, b2, b, b2);
        this.f692b.setLayoutParams(layoutParams);
        this.f692b.setTextColor(-1);
        this.f692b.setTextSize(16.0f);
        this.f692b.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#CC000000"));
        gradientDrawable.setCornerRadius(C1002v.m4731b(C0558m.m2663a(), 6.0f));
        this.f692b.setBackgroundDrawable(gradientDrawable);
        addView(this.f692b);
    }

    /* renamed from: a */
    public void mo528a(final String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f691a.removeCallbacksAndMessages((Object) null);
            this.f691a.post(new Runnable() {
                public void run() {
                    if (TTAdDislikeToast.this.f692b != null) {
                        TTAdDislikeToast.this.f692b.setText(String.valueOf(str));
                    }
                    TTAdDislikeToast.this.setVisibility(0);
                }
            });
            this.f691a.postDelayed(new Runnable() {
                public void run() {
                    TTAdDislikeToast.this.setVisibility(8);
                }
            }, 2000);
        }
    }

    /* renamed from: a */
    public void mo527a() {
        setVisibility(8);
        this.f691a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: b */
    public void mo529b() {
        setVisibility(8);
        this.f691a.removeCallbacksAndMessages((Object) null);
    }
}
