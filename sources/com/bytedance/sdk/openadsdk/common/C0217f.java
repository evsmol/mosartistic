package com.bytedance.sdk.openadsdk.common;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.common.f */
/* compiled from: TTTitleNewStyleManager */
public class C0217f {

    /* renamed from: a */
    TTAdDislikeDialog f729a;

    /* renamed from: b */
    TTAdDislikeToast f730b;

    /* renamed from: c */
    final AtomicBoolean f731c = new AtomicBoolean(false);

    /* renamed from: d */
    final AtomicBoolean f732d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final RelativeLayout f733e;

    /* renamed from: f */
    private final C0477n f734f;

    /* renamed from: g */
    private Context f735g;

    /* renamed from: h */
    private ImageView f736h;

    /* renamed from: i */
    private TextView f737i;

    /* renamed from: j */
    private ImageView f738j;

    /* renamed from: k */
    private ProgressBar f739k;

    /* renamed from: l */
    private final int f740l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f741m;

    public C0217f(Context context, RelativeLayout relativeLayout, C0477n nVar) {
        this.f735g = context;
        this.f733e = relativeLayout;
        this.f734f = nVar;
        this.f740l = C1002v.m4749e(C0558m.m2663a(), 44.0f);
        m868e();
    }

    /* renamed from: e */
    private void m868e() {
        this.f736h = (ImageView) this.f733e.findViewById(C10647t.m31283e(this.f735g, "tt_title_bar_close"));
        this.f737i = (TextView) this.f733e.findViewById(C10647t.m31283e(this.f735g, "tt_title_bar_title"));
        this.f738j = (ImageView) this.f733e.findViewById(C10647t.m31283e(this.f735g, "tt_title_bar_feedback"));
        this.f739k = (ProgressBar) this.f733e.findViewById(C10647t.m31283e(this.f735g, "tt_title_bar_browser_progress"));
        C0477n nVar = this.f734f;
        if (nVar != null) {
            this.f737i.setText(TextUtils.isEmpty(nVar.mo1341U()) ? C10647t.m31276a(this.f735g, "tt_web_title_default") : this.f734f.mo1341U());
        }
        this.f738j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C0217f.this.mo557d();
            }
        });
    }

    /* renamed from: a */
    public void mo554a(WebView webView, int i) {
        if (i == 100) {
            this.f739k.setVisibility(8);
            return;
        }
        this.f739k.setVisibility(0);
        this.f739k.setProgress(i);
    }

    /* renamed from: a */
    public void mo553a() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f733e.getLayoutParams();
            if (!this.f741m && marginLayoutParams.topMargin == (-this.f740l)) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{-this.f740l, 0});
                ofInt.setDuration(300);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        C0217f.this.f733e.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                        boolean unused = C0217f.this.f741m = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        boolean unused = C0217f.this.f741m = false;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo555b() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f733e.getLayoutParams();
            if (!this.f741m && marginLayoutParams.topMargin == 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, -this.f740l});
                ofInt.setDuration(300);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        C0217f.this.f733e.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                        boolean unused = C0217f.this.f741m = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        boolean unused = C0217f.this.f741m = false;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public ImageView mo556c() {
        return this.f736h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo557d() {
        if (this.f732d.get()) {
            m870g();
            return;
        }
        if (this.f729a == null) {
            m869f();
        }
        this.f729a.mo520a();
    }

    /* renamed from: f */
    private void m869f() {
        try {
            if (this.f729a == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.f735g, this.f734f);
                this.f729a = tTAdDislikeDialog;
                tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.C0201a() {
                    /* renamed from: c */
                    public void mo41c(View view) {
                    }

                    /* renamed from: a */
                    public void mo39a(View view) {
                        C0217f.this.f731c.set(true);
                    }

                    /* renamed from: b */
                    public void mo40b(View view) {
                        C0217f.this.f731c.set(false);
                    }

                    /* renamed from: a */
                    public void mo38a(int i, FilterWord filterWord) {
                        if (!C0217f.this.f732d.get() && filterWord != null && !filterWord.hasSecondOptions()) {
                            C0217f.this.f732d.set(true);
                        }
                    }
                });
            }
            ((FrameLayout) this.f733e.getRootView().findViewById(16908290)).addView(this.f729a);
            if (this.f730b == null) {
                this.f730b = new TTAdDislikeToast(this.f735g);
                ((FrameLayout) this.f733e.getRootView().findViewById(16908290)).addView(this.f730b);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private void m870g() {
        this.f730b.mo528a(C0516f.f1880d);
    }
}
