package com.bytedance.sdk.openadsdk.component.reward.p013a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.p313d.C10561j;
import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.TwoSemicirclesView;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import com.bytedance.sdk.openadsdk.utils.C1002v;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.d */
/* compiled from: RewardFullVideoLoadingManager */
public class C0270d {

    /* renamed from: a */
    TTRoundRectImageView f886a;

    /* renamed from: b */
    TextView f887b;

    /* renamed from: c */
    ProgressBar f888c;

    /* renamed from: d */
    TextView f889d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C0477n f890e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f891f;

    /* renamed from: g */
    private int f892g = 0;

    /* renamed from: h */
    private View f893h;

    /* renamed from: i */
    private boolean f894i = false;

    /* renamed from: j */
    private LinearLayout f895j;

    /* renamed from: k */
    private TwoSemicirclesView f896k;

    /* renamed from: l */
    private TwoSemicirclesView f897l;

    /* renamed from: m */
    private TextView f898m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f899n;

    /* renamed from: o */
    private int f900o;

    /* renamed from: p */
    private AnimatorSet f901p;

    /* renamed from: q */
    private AnimatorSet f902q;

    public C0270d(Context context) {
        this.f891f = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|(2:13|(2:15|(2:17|(2:19|29)(2:20|30))(2:21|31))(2:22|32))(2:23|33)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A[Catch:{ all -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f A[Catch:{ all -> 0x0054 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo714a(com.bytedance.sdk.openadsdk.core.p021e.C0477n r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            r2.f890e = r3     // Catch:{ all -> 0x0054 }
            boolean r3 = com.bytedance.sdk.openadsdk.core.p021e.C0477n.m2012c((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r3)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0053
            com.bytedance.sdk.openadsdk.core.e.n r3 = r2.f890e     // Catch:{ all -> 0x0054 }
            boolean r3 = com.bytedance.sdk.openadsdk.core.p021e.C0480p.m2198i(r3)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0015
            goto L_0x0053
        L_0x0015:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002c }
            com.bytedance.sdk.openadsdk.core.e.n r1 = r2.f890e     // Catch:{ JSONException -> 0x002c }
            com.bytedance.sdk.openadsdk.core.e.n$a r1 = r1.mo1327G()     // Catch:{ JSONException -> 0x002c }
            java.lang.String r1 = r1.mo1495g()     // Catch:{ JSONException -> 0x002c }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x002c }
            java.lang.String r1 = "loading_page_type"
            int r3 = r3.optInt(r1, r0)     // Catch:{ JSONException -> 0x002c }
            r2.f892g = r3     // Catch:{ JSONException -> 0x002c }
        L_0x002c:
            r2.f899n = r4     // Catch:{ all -> 0x0054 }
            r2.f900o = r5     // Catch:{ all -> 0x0054 }
            r3 = 1
            r2.f894i = r3     // Catch:{ all -> 0x0054 }
            int r4 = r2.f892g     // Catch:{ all -> 0x0054 }
            if (r4 == r3) goto L_0x004f
            r3 = 2
            if (r4 == r3) goto L_0x004b
            r3 = 3
            if (r4 == r3) goto L_0x0047
            r3 = 4
            if (r4 == r3) goto L_0x0043
            r2.f894i = r0     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0043:
            r2.m1102h()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0047:
            r2.m1101g()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x004b:
            r2.m1100f()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x004f:
            r2.m1099e()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0053:
            return
        L_0x0054:
            r2.f894i = r0
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.p013a.C0270d.mo714a(com.bytedance.sdk.openadsdk.core.e.n, java.lang.String, int):void");
    }

    /* renamed from: a */
    public void mo713a() {
        try {
            int i = this.f892g;
            if (i == 1) {
                m1103i();
            } else if (i == 2) {
                m1104j();
            } else if (i == 3) {
                m1105k();
            } else if (i == 4) {
                m1106l();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private void m1099e() {
        View inflate = LayoutInflater.from(this.f891f).inflate(C10647t.m31284f(this.f891f, "tt_full_reward_video_loading"), (ViewGroup) null, false);
        this.f893h = inflate;
        this.f886a = (TTRoundRectImageView) inflate.findViewById(C10647t.m31283e(this.f891f, "tt_loading_icon"));
        this.f887b = (TextView) this.f893h.findViewById(C10647t.m31283e(this.f891f, "tt_loading_appname"));
        this.f888c = (ProgressBar) this.f893h.findViewById(C10647t.m31283e(this.f891f, "tt_loading_progressbar"));
        this.f889d = (TextView) this.f893h.findViewById(C10647t.m31283e(this.f891f, "tt_loading_progress_number"));
        this.f898m = (TextView) this.f893h.findViewById(C10647t.m31283e(this.f891f, "tt_ad_loading_logo"));
        if (this.f900o == 1 && this.f890e.mo1380aa() != null && !TextUtils.isEmpty(this.f890e.mo1380aa().mo1217b())) {
            this.f887b.setText(this.f890e.mo1380aa().mo1217b());
        } else if (!TextUtils.isEmpty(this.f890e.mo1341U())) {
            this.f887b.setText(this.f890e.mo1341U());
        } else {
            this.f887b.setVisibility(8);
        }
        m1107m();
        this.f898m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m414a(C0270d.this.f891f, C0270d.this.f890e, C0270d.this.f899n);
            }
        });
    }

    /* renamed from: f */
    private void m1100f() {
        View inflate = LayoutInflater.from(this.f891f).inflate(C10647t.m31284f(this.f891f, "tt_full_reward_video_loading2"), (ViewGroup) null, false);
        this.f893h = inflate;
        this.f886a = (TTRoundRectImageView) inflate.findViewById(C10647t.m31283e(this.f891f, "tt_loading_icon"));
        this.f889d = (TextView) this.f893h.findViewById(C10647t.m31283e(this.f891f, "tt_loading_progress_number"));
        this.f898m = (TextView) this.f893h.findViewById(C10647t.m31283e(this.f891f, "tt_ad_loading_logo"));
        m1107m();
        this.f898m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m414a(C0270d.this.f891f, C0270d.this.f890e, C0270d.this.f899n);
            }
        });
    }

    /* renamed from: g */
    private void m1101g() {
        View inflate = LayoutInflater.from(this.f891f).inflate(C10647t.m31284f(this.f891f, "tt_full_reward_video_loading3"), (ViewGroup) null, false);
        this.f893h = inflate;
        this.f895j = (LinearLayout) inflate.findViewById(C10647t.m31283e(this.f891f, "wave_container"));
        this.f889d = (TextView) this.f893h.findViewById(C10647t.m31283e(this.f891f, "tt_loading_progress_number"));
        TextView textView = (TextView) this.f893h.findViewById(C10647t.m31283e(this.f891f, "tt_ad_loading_logo"));
        this.f898m = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m414a(C0270d.this.f891f, C0270d.this.f890e, C0270d.this.f899n);
            }
        });
    }

    /* renamed from: h */
    private void m1102h() {
        View inflate = LayoutInflater.from(this.f891f).inflate(C10647t.m31284f(this.f891f, "tt_full_reward_video_loading4"), (ViewGroup) null, false);
        this.f893h = inflate;
        this.f896k = (TwoSemicirclesView) inflate.findViewById(C10647t.m31283e(this.f891f, "inner_circle"));
        this.f897l = (TwoSemicirclesView) this.f893h.findViewById(C10647t.m31283e(this.f891f, "outer_circle"));
        this.f896k.setRadius((float) C1002v.m4749e(this.f891f, 80.0f));
        Paint paintTwo = this.f896k.getPaintTwo();
        paintTwo.setColor(Color.parseColor("#C4C4C4"));
        this.f896k.setPaintTwo(paintTwo);
        this.f897l.setRadius((float) C1002v.m4749e(this.f891f, 95.0f));
        Paint paintTwo2 = this.f897l.getPaintTwo();
        paintTwo2.setStrokeWidth(6.0f);
        paintTwo2.setColor(Color.parseColor("#118BFF"));
        this.f897l.setPaintTwo(paintTwo2);
        this.f889d = (TextView) this.f893h.findViewById(C10647t.m31283e(this.f891f, "tt_loading_progress_number"));
        TextView textView = (TextView) this.f893h.findViewById(C10647t.m31283e(this.f891f, "tt_ad_loading_logo"));
        this.f898m = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m414a(C0270d.this.f891f, C0270d.this.f890e, C0270d.this.f899n);
            }
        });
    }

    /* renamed from: i */
    private void m1103i() {
        m1108n();
    }

    /* renamed from: j */
    private void m1104j() {
        Context context = this.f891f;
        this.f886a.setAnimation(AnimationUtils.loadAnimation(context, C10647t.m31290l(context, "tt_loading_two_icon_scale")));
        m1108n();
    }

    /* renamed from: k */
    private void m1105k() {
        this.f901p = new AnimatorSet();
        LinearLayout linearLayout = this.f895j;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", new float[]{-9.0f, 9.0f}).setDuration(300);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder play = this.f901p.play(duration);
            for (int i = 1; i < this.f895j.getChildCount(); i++) {
                float f = i % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f895j.getChildAt(i), "translationY", new float[]{-f, f}).setDuration(300);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.f901p.start();
        }
        m1108n();
    }

    /* renamed from: l */
    private void m1106l() {
        this.f901p = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f896k, "rotation", new float[]{0.0f, 360.0f}).setDuration(1500);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatCount(-1);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f897l, "rotation", new float[]{0.0f, 360.0f}).setDuration(2500);
        duration2.setRepeatCount(-1);
        this.f901p.playTogether(new Animator[]{duration, duration2});
        this.f901p.start();
        m1108n();
    }

    /* renamed from: m */
    private void m1107m() {
        if (this.f890e.mo1333M() == null || TextUtils.isEmpty(this.f890e.mo1333M().mo1281a())) {
            this.f886a.setVisibility(8);
            return;
        }
        try {
            C0750a.m3820a(this.f890e.mo1333M()).mo64102a((C10565n) new C10565n<Bitmap>() {
                /* renamed from: a */
                public void mo257a(C10561j<Bitmap> jVar) {
                    if (jVar != null) {
                        try {
                            if (jVar.mo64116b() != null) {
                                C0270d.this.f886a.setImageBitmap(jVar.mo64116b());
                                return;
                            }
                        } catch (Throwable unused) {
                            C0270d.this.f886a.setVisibility(8);
                            return;
                        }
                    }
                    C0270d.this.f886a.setVisibility(8);
                }

                /* renamed from: a */
                public void mo256a(int i, String str, Throwable th) {
                    C0270d.this.f886a.setVisibility(8);
                }
            });
        } catch (Throwable unused) {
            this.f886a.setVisibility(8);
        }
    }

    /* renamed from: n */
    private void m1108n() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1, 80});
        ofInt.setDuration(2000);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C0270d.this.f888c != null) {
                    C0270d.this.f888c.setProgress(intValue);
                }
                C0270d.this.f889d.setText(String.valueOf(intValue));
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{81, 99});
        ofInt2.setDuration(3000);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C0270d.this.f888c != null) {
                    C0270d.this.f888c.setProgress(intValue);
                }
                C0270d.this.f889d.setText(String.valueOf(intValue));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofInt).before(ofInt2);
        animatorSet.start();
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f902q = animatorSet2;
        animatorSet2.play(ofInt).before(ofInt2);
        this.f902q.start();
    }

    /* renamed from: b */
    public void mo715b() {
        AnimatorSet animatorSet = this.f901p;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f902q;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    /* renamed from: c */
    public View mo716c() {
        return this.f893h;
    }

    /* renamed from: d */
    public boolean mo717d() {
        return this.f894i;
    }
}
