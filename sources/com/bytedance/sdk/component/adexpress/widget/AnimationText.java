package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10373l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.utils.C10652x;
import java.util.ArrayList;
import java.util.List;

public class AnimationText extends TextSwitcher implements ViewSwitcher.ViewFactory, C10652x.C10653a {

    /* renamed from: a */
    Animation.AnimationListener f25873a = new Animation.AnimationListener() {
        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
            if (AnimationText.this.f25878f != null) {
                AnimationText.this.f25878f.setText("");
            }
        }
    };

    /* renamed from: b */
    private List<String> f25874b = new ArrayList();

    /* renamed from: c */
    private int f25875c = 0;

    /* renamed from: d */
    private final int f25876d = 1;

    /* renamed from: e */
    private Context f25877e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f25878f;

    /* renamed from: g */
    private int f25879g;

    /* renamed from: h */
    private int f25880h;

    /* renamed from: i */
    private float f25881i;

    /* renamed from: j */
    private int f25882j;

    /* renamed from: k */
    private int f25883k;

    /* renamed from: l */
    private int f25884l;

    /* renamed from: m */
    private int f25885m;

    /* renamed from: n */
    private Handler f25886n = new C10652x(Looper.getMainLooper(), this);

    public AnimationText(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.f25880h = i;
        this.f25881i = f;
        this.f25882j = i2;
        this.f25885m = i3;
        m30356c();
    }

    /* renamed from: c */
    private void m30356c() {
        setFactory(this);
    }

    public void setAnimationType(int i) {
        this.f25884l = i;
    }

    public void setAnimationDuration(int i) {
        this.f25879g = i;
    }

    /* renamed from: a */
    public void mo63710a() {
        int i = this.f25884l;
        if (i == 1) {
            setInAnimation(getContext(), C10647t.m31290l(this.f25877e, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), C10647t.m31290l(this.f25877e, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), C10647t.m31290l(this.f25877e, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), C10647t.m31290l(this.f25877e, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.f25873a);
            getOutAnimation().setAnimationListener(this.f25873a);
        }
        this.f25886n.sendEmptyMessage(1);
    }

    public void setAnimationText(List<String> list) {
        this.f25874b = list;
    }

    /* renamed from: b */
    public void mo63711b() {
        List<String> list = this.f25874b;
        if (list != null && list.size() > 0) {
            int i = this.f25875c;
            this.f25875c = i + 1;
            this.f25883k = i;
            setText(this.f25874b.get(i));
            if (this.f25875c > this.f25874b.size() - 1) {
                this.f25875c = 0;
            }
        }
    }

    public void setTextColor(int i) {
        this.f25880h = i;
    }

    public void setTextSize(float f) {
        this.f25881i = f;
    }

    public void setMaxLines(int i) {
        this.f25882j = i;
    }

    public View makeView() {
        TextView textView = new TextView(getContext());
        this.f25878f = textView;
        textView.setTextColor(this.f25880h);
        this.f25878f.setTextSize(this.f25881i);
        this.f25878f.setMaxLines(this.f25882j);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f25878f.setTextAlignment(this.f25885m);
        }
        return this.f25878f;
    }

    /* renamed from: a */
    public void mo5a(Message message) {
        if (message.what == 1) {
            mo63711b();
            this.f25886n.sendEmptyMessageDelayed(1, (long) this.f25879g);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(C10373l.m30207a(this.f25874b.get(this.f25883k), this.f25881i, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25886n.removeMessages(1);
    }
}
