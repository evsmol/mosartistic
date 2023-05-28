package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;

public class TopLayoutDislike2 extends FrameLayout implements C0357a<TopLayoutDislike2> {

    /* renamed from: a */
    private View f1160a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f1161b;

    /* renamed from: c */
    private TextView f1162c;

    /* renamed from: d */
    private boolean f1163d;

    /* renamed from: e */
    private C0477n f1164e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f1165f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C0358b f1166g;

    /* renamed from: h */
    private CharSequence f1167h;

    /* renamed from: i */
    private CharSequence f1168i;

    public TopLayoutDislike2(Context context) {
        this(context, (AttributeSet) null);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1167h = "";
        this.f1168i = "";
    }

    /* renamed from: a */
    public TopLayoutDislike2 mo938a(boolean z, C0477n nVar) {
        this.f1163d = z;
        this.f1164e = nVar;
        LayoutInflater.from(getContext()).inflate(C10647t.m31284f(getContext(), "tt_top_reward_dislike_2"), this, true);
        this.f1160a = findViewById(C10647t.m31283e(getContext(), "tt_top_dislike"));
        if (nVar.mo1402aw()) {
            this.f1160a.setVisibility(8);
        }
        ((TextView) this.f1160a).setText(C10647t.m31276a(C0558m.m2663a(), "tt_reward_feedback"));
        this.f1161b = (ImageView) findViewById(C10647t.m31283e(getContext(), "tt_top_mute"));
        TextView textView = (TextView) findViewById(C10647t.m31283e(getContext(), "tt_top_skip"));
        this.f1162c = textView;
        textView.setVisibility(0);
        this.f1162c.setText("");
        this.f1162c.setEnabled(false);
        this.f1162c.setClickable(false);
        m1465d();
        return this;
    }

    /* renamed from: d */
    private void m1465d() {
        View view = this.f1160a;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TopLayoutDislike2.this.f1166g != null) {
                        TopLayoutDislike2.this.f1166g.mo168c(view);
                    }
                }
            });
        }
        ImageView imageView = this.f1161b;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int i;
                    TopLayoutDislike2 topLayoutDislike2 = TopLayoutDislike2.this;
                    boolean unused = topLayoutDislike2.f1165f = !topLayoutDislike2.f1165f;
                    if (TopLayoutDislike2.this.f1165f) {
                        i = C10647t.m31282d(TopLayoutDislike2.this.getContext(), "tt_mute");
                    } else {
                        i = C10647t.m31282d(TopLayoutDislike2.this.getContext(), "tt_unmute");
                    }
                    TopLayoutDislike2.this.f1161b.setImageResource(i);
                    if (TopLayoutDislike2.this.f1166g != null) {
                        TopLayoutDislike2.this.f1166g.mo167b(view);
                    }
                }
            });
        }
        TextView textView = this.f1162c;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TopLayoutDislike2.this.f1166g != null) {
                        TopLayoutDislike2.this.f1166g.mo166a(view);
                    }
                }
            });
        }
    }

    public void setShowSkip(boolean z) {
        TextView textView = this.f1162c;
        if (textView != null) {
            if (!z) {
                textView.setText("");
            }
            if (this.f1162c.getVisibility() != 4) {
                this.f1162c.setVisibility(z ? 0 : 8);
            }
        }
    }

    public void setSkipEnable(boolean z) {
        TextView textView = this.f1162c;
        if (textView != null) {
            textView.setEnabled(z);
            this.f1162c.setClickable(z);
        }
    }

    public void setShowSound(boolean z) {
        ImageView imageView = this.f1161b;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setSoundMute(boolean z) {
        int i;
        this.f1165f = z;
        if (z) {
            i = C10647t.m31282d(getContext(), "tt_mute");
        } else {
            i = C10647t.m31282d(getContext(), "tt_unmute");
        }
        this.f1161b.setImageResource(i);
    }

    /* renamed from: a */
    public void mo940a(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f1167h = charSequence;
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            this.f1168i = charSequence2;
        }
        if (this.f1162c != null) {
            CharSequence charSequence3 = this.f1167h;
            if (!TextUtils.isEmpty(this.f1168i)) {
                charSequence3 = charSequence3 + " | " + this.f1168i;
            }
            this.f1162c.setText(charSequence3);
        }
    }

    public void setShowDislike(boolean z) {
        View view = this.f1160a;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setListener(C0358b bVar) {
        this.f1166g = bVar;
    }

    /* renamed from: a */
    public void mo939a() {
        TextView textView = this.f1162c;
        if (textView != null) {
            textView.performClick();
        }
    }

    /* renamed from: b */
    public void mo941b() {
        ImageView imageView = this.f1161b;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    /* renamed from: c */
    public void mo942c() {
        this.f1162c.setWidth(20);
        this.f1162c.setVisibility(4);
    }
}
