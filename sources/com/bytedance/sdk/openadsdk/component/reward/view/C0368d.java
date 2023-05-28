package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0269c;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0270d;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0278e;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p016b.C0413g;
import com.bytedance.sdk.openadsdk.core.p021e.C0464l;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import com.bytedance.sdk.openadsdk.core.p026j.C0518a;
import com.bytedance.sdk.openadsdk.core.widget.C0737c;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.d */
/* compiled from: RewardFullVideoLayout */
public class C0368d {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public String f1215A;

    /* renamed from: B */
    private int f1216B;

    /* renamed from: C */
    private boolean f1217C = false;

    /* renamed from: a */
    int f1218a = 3;

    /* renamed from: b */
    Activity f1219b;

    /* renamed from: c */
    C0477n f1220c;

    /* renamed from: d */
    C0269c f1221d;

    /* renamed from: e */
    public View f1222e;

    /* renamed from: f */
    RelativeLayout f1223f;

    /* renamed from: g */
    ImageView f1224g;

    /* renamed from: h */
    RelativeLayout f1225h;

    /* renamed from: i */
    TTRoundRectImageView f1226i;

    /* renamed from: j */
    TextView f1227j;

    /* renamed from: k */
    TextView f1228k;

    /* renamed from: l */
    TextView f1229l;

    /* renamed from: m */
    FrameLayout f1230m;

    /* renamed from: n */
    FrameLayout f1231n;

    /* renamed from: o */
    FrameLayout f1232o;

    /* renamed from: p */
    TTRatingBar2 f1233p;

    /* renamed from: q */
    TextView f1234q;

    /* renamed from: r */
    TextView f1235r;

    /* renamed from: s */
    RelativeLayout f1236s;

    /* renamed from: t */
    C0270d f1237t;

    /* renamed from: u */
    boolean f1238u = true;

    /* renamed from: v */
    protected int f1239v = 0;

    /* renamed from: w */
    protected final AtomicBoolean f1240w = new AtomicBoolean(false);

    /* renamed from: x */
    public C0464l f1241x;

    /* renamed from: y */
    Runnable f1242y = new Runnable() {
        public void run() {
            try {
                if (C0368d.this.f1221d != null && C0368d.this.f1225h != null) {
                    int[] iArr = new int[2];
                    C0368d.this.f1225h.getLocationOnScreen(iArr);
                    C0368d.this.f1221d.mo705b(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    /* renamed from: z */
    private boolean f1243z;

    /* renamed from: a */
    private void m1560a(C0518a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1004a() {
        return true;
    }

    public C0368d(Activity activity) {
        this.f1219b = activity;
    }

    /* renamed from: a */
    public void mo1011a(C0477n nVar, String str, int i, boolean z, C0269c cVar) {
        if (!this.f1217C) {
            this.f1217C = true;
            this.f1220c = nVar;
            this.f1215A = str;
            this.f1216B = i;
            this.f1243z = z;
            this.f1221d = cVar;
            if (this.f1219b != null && mo1004a()) {
                C0270d dVar = new C0270d(this.f1219b);
                this.f1237t = dVar;
                dVar.mo714a(nVar, this.f1215A, this.f1216B);
            }
            m1562s();
            C0464l lVar = new C0464l(this.f1219b, this.f1220c, str, this.f1230m);
            this.f1241x = lVar;
            lVar.mo1293a();
        }
    }

    /* renamed from: s */
    private void m1562s() {
        RelativeLayout relativeLayout;
        Activity activity = this.f1219b;
        this.f1222e = activity.findViewById(C10647t.m31283e(activity, "tt_reward_root"));
        Activity activity2 = this.f1219b;
        this.f1223f = (RelativeLayout) activity2.findViewById(C10647t.m31283e(activity2, "tt_video_reward_bar"));
        Activity activity3 = this.f1219b;
        this.f1229l = (TextView) activity3.findViewById(C10647t.m31283e(activity3, "tt_reward_ad_download"));
        Activity activity4 = this.f1219b;
        this.f1226i = (TTRoundRectImageView) activity4.findViewById(C10647t.m31283e(activity4, "tt_reward_ad_icon"));
        Activity activity5 = this.f1219b;
        this.f1227j = (TextView) activity5.findViewById(C10647t.m31283e(activity5, "tt_reward_ad_appname"));
        Activity activity6 = this.f1219b;
        this.f1228k = (TextView) activity6.findViewById(C10647t.m31283e(activity6, "tt_comment_vertical"));
        Activity activity7 = this.f1219b;
        this.f1234q = (TextView) activity7.findViewById(C10647t.m31283e(activity7, "tt_ad_logo"));
        Activity activity8 = this.f1219b;
        this.f1224g = (ImageView) activity8.findViewById(C10647t.m31283e(activity8, "tt_video_ad_close"));
        Activity activity9 = this.f1219b;
        this.f1225h = (RelativeLayout) activity9.findViewById(C10647t.m31283e(activity9, "tt_video_ad_close_layout"));
        Activity activity10 = this.f1219b;
        this.f1230m = (FrameLayout) activity10.findViewById(C10647t.m31283e(activity10, "tt_video_reward_container"));
        Activity activity11 = this.f1219b;
        this.f1231n = (FrameLayout) activity11.findViewById(C10647t.m31283e(activity11, "tt_click_upper_non_content_layout"));
        Activity activity12 = this.f1219b;
        this.f1232o = (FrameLayout) activity12.findViewById(C10647t.m31283e(activity12, "tt_click_lower_non_content_layout"));
        Activity activity13 = this.f1219b;
        this.f1233p = (TTRatingBar2) activity13.findViewById(C10647t.m31283e(activity13, "tt_rb_score"));
        Activity activity14 = this.f1219b;
        this.f1236s = (RelativeLayout) activity14.findViewById(C10647t.m31283e(activity14, "tt_full_reward_video_loading_container"));
        TTRatingBar2 tTRatingBar2 = this.f1233p;
        if (tTRatingBar2 != null) {
            C1002v.m4724a((TextView) null, tTRatingBar2, this.f1220c, (Context) this.f1219b);
        }
        C0270d dVar = this.f1237t;
        if (!(dVar == null || !dVar.mo717d() || this.f1237t.mo716c() == null || (relativeLayout = this.f1236s) == null)) {
            relativeLayout.addView(this.f1237t.mo716c(), new LinearLayout.LayoutParams(-1, -1));
            this.f1237t.mo713a();
        }
        C0477n nVar = this.f1220c;
        if (nVar != null && nVar.mo1402aw()) {
            Activity activity15 = this.f1219b;
            this.f1235r = (TextView) activity15.findViewById(C10647t.m31283e(activity15, "tt_reward_ad_description"));
        }
    }

    /* renamed from: a */
    public void mo1013a(String str, boolean z) {
        mo1024g();
        C1002v.m4716a((View) this.f1234q, C0480p.m2198i(this.f1220c) ? 8 : 0);
        mo1023f();
        mo1012a(str);
        mo1014a(z);
        mo1020d();
        if (this.f1243z) {
            mo1018c();
        }
        C0477n nVar = this.f1220c;
        if (nVar != null && nVar.mo1403ax() != null) {
            m1560a(this.f1220c.mo1403ax());
        }
    }

    /* renamed from: a */
    public void mo1003a(int i, int i2) {
        FrameLayout frameLayout;
        if (!this.f1238u) {
            mo1007a(4);
        }
        try {
            if (this.f1216B == 2 && this.f1220c.mo1473v() == 1) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1229l.getLayoutParams();
                layoutParams.height = (int) C1002v.m4731b(this.f1219b, 55.0f);
                layoutParams.topMargin = (int) C1002v.m4731b(this.f1219b, 20.0f);
                this.f1229l.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f1223f.getLayoutParams();
                layoutParams2.bottomMargin = (int) C1002v.m4731b(this.f1219b, 12.0f);
                this.f1223f.setLayoutParams(layoutParams2);
            }
        } catch (Throwable unused) {
        }
        C0477n nVar = this.f1220c;
        if (nVar != null && nVar.mo1473v() == 1 && (frameLayout = this.f1230m) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int c = C1002v.m4740c((Context) this.f1219b);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f1230m.getLayoutParams();
            layoutParams3.width = c;
            int i3 = (c * 9) / 16;
            layoutParams3.height = i3;
            this.f1230m.setLayoutParams(layoutParams3);
            this.f1239v = (C1002v.m4744d((Context) this.f1219b) - i3) / 2;
            C10638l.m31242e("RewardFullVideoLayout", "NonContentAreaHeight:" + this.f1239v);
        }
    }

    /* renamed from: a */
    public void mo1010a(C0408c cVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener, C0278e eVar) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        C0477n nVar;
        C0408c cVar2 = cVar;
        View.OnTouchListener onTouchListener2 = onTouchListener;
        final View.OnClickListener onClickListener2 = onClickListener;
        final C0278e eVar2 = eVar;
        C0477n nVar2 = this.f1220c;
        if (!(nVar2 == null || nVar2.mo1475w() == null)) {
            if (this.f1220c.mo1473v() != 5) {
                if (this.f1220c.mo1475w().f1506e) {
                    this.f1229l.setOnClickListener(cVar);
                    this.f1229l.setOnTouchListener(onTouchListener2);
                } else {
                    this.f1229l.setOnClickListener(onClickListener2);
                }
            }
            if (this.f1220c.mo1473v() == 1) {
                if (this.f1220c.mo1475w().f1502a) {
                    C1002v.m4718a((View) this.f1223f, (View.OnClickListener) cVar, "TTBaseVideoActivity#mRlDownloadBar");
                    C1002v.m4719a((View) this.f1223f, onTouchListener2, "TTBaseVideoActivity#mRlDownloadBar");
                    this.f1227j.setOnClickListener(cVar);
                    this.f1227j.setOnTouchListener(onTouchListener2);
                    this.f1228k.setOnClickListener(cVar);
                    this.f1228k.setOnTouchListener(onTouchListener2);
                    this.f1233p.setOnClickListener(cVar);
                    this.f1233p.setOnTouchListener(onTouchListener2);
                    this.f1226i.setOnClickListener(cVar);
                    this.f1226i.setOnTouchListener(onTouchListener2);
                } else {
                    C1002v.m4718a((View) this.f1223f, onClickListener2, "TTBaseVideoActivity#mRlDownloadBar");
                    this.f1227j.setOnClickListener(onClickListener2);
                    this.f1228k.setOnClickListener(onClickListener2);
                    this.f1233p.setOnClickListener(onClickListener2);
                    this.f1226i.setOnClickListener(onClickListener2);
                }
            } else if (this.f1220c.mo1473v() == 5) {
                if (this.f1220c.mo1475w().f1506e) {
                    C0408c cVar3 = cVar;
                    final C0278e eVar3 = eVar;
                    C03691 r0 = new C0413g("VAST_ACTION_BUTTON", this.f1220c.mo1403ax(), cVar3) {
                        /* renamed from: a */
                        public void mo827a() {
                            if (C0368d.this.f1220c != null && C0368d.this.f1220c.mo1403ax() != null) {
                                C0368d.this.f1220c.mo1403ax().mo1726a().mo1805g(eVar3.mo762s());
                            }
                        }
                    };
                    C03702 r02 = new C0413g("VAST_ICON", this.f1220c.mo1403ax(), cVar3) {
                        /* renamed from: a */
                        public void mo827a() {
                            if (C0368d.this.f1220c != null && C0368d.this.f1220c.mo1403ax() != null && C0368d.this.f1220c.mo1403ax().mo1732b() != null) {
                                C0368d.this.f1220c.mo1403ax().mo1732b().mo1772a(eVar3.mo762s());
                            }
                        }
                    };
                    TextView textView = this.f1229l;
                    if (textView != null) {
                        textView.setOnClickListener(r0);
                        this.f1229l.setOnTouchListener(r0);
                    }
                    TTRoundRectImageView tTRoundRectImageView = this.f1226i;
                    if (tTRoundRectImageView != null) {
                        tTRoundRectImageView.setOnClickListener(r02);
                        this.f1226i.setOnTouchListener(r02);
                    }
                    TextView textView2 = this.f1227j;
                    if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                        this.f1227j.setOnClickListener(r0);
                        this.f1227j.setOnTouchListener(r0);
                    }
                    TextView textView3 = this.f1235r;
                    if (textView3 != null && !TextUtils.isEmpty(textView3.getText())) {
                        this.f1235r.setOnClickListener(r0);
                        this.f1235r.setOnTouchListener(r0);
                    }
                } else {
                    C03713 r03 = new View.OnClickListener() {
                        public void onClick(View view) {
                            View.OnClickListener onClickListener = onClickListener2;
                            if (onClickListener != null) {
                                onClickListener.onClick(view);
                            }
                            if (C0368d.this.f1220c != null && C0368d.this.f1220c.mo1403ax() != null) {
                                C0368d.this.f1220c.mo1403ax().mo1726a().mo1805g(eVar2.mo762s());
                            }
                        }
                    };
                    TextView textView4 = this.f1229l;
                    if (textView4 != null) {
                        textView4.setOnClickListener(r03);
                    }
                    TextView textView5 = this.f1227j;
                    if (textView5 != null && !TextUtils.isEmpty(textView5.getText())) {
                        this.f1227j.setOnClickListener(r03);
                    }
                    TextView textView6 = this.f1235r;
                    if (textView6 != null && !TextUtils.isEmpty(textView6.getText())) {
                        this.f1235r.setOnClickListener(r03);
                    }
                    TTRoundRectImageView tTRoundRectImageView2 = this.f1226i;
                    if (tTRoundRectImageView2 != null) {
                        tTRoundRectImageView2.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                View.OnClickListener onClickListener = onClickListener2;
                                if (onClickListener != null) {
                                    onClickListener.onClick(view);
                                }
                                if (C0368d.this.f1220c != null && C0368d.this.f1220c.mo1403ax() != null && C0368d.this.f1220c.mo1403ax().mo1732b() != null) {
                                    C0368d.this.f1220c.mo1403ax().mo1732b().mo1772a(eVar2.mo762s());
                                }
                            }
                        });
                    }
                }
            } else if (this.f1220c.mo1475w().f1504c) {
                C1002v.m4718a((View) this.f1223f, (View.OnClickListener) cVar, "TTBaseVideoActivity#mRlDownloadBar");
                C1002v.m4719a((View) this.f1223f, onTouchListener2, "TTBaseVideoActivity#mRlDownloadBar");
            } else {
                C1002v.m4718a((View) this.f1223f, onClickListener2, "TTBaseVideoActivity#mRlDownloadBar");
            }
        }
        if (!(this.f1230m == null || (nVar = this.f1220c) == null || nVar.mo1475w() == null)) {
            if (!this.f1220c.mo1475w().f1507f || C0464l.m1967b(this.f1220c)) {
                mo1008a(onClickListener2);
            } else {
                mo1008a((View.OnClickListener) cVar);
                m1559a(cVar);
            }
        }
        C0477n nVar3 = this.f1220c;
        if (nVar3 != null && nVar3.mo1473v() == 1) {
            if (!(this.f1220c.mo1475w() == null || (frameLayout2 = this.f1231n) == null)) {
                C1002v.m4716a((View) frameLayout2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1231n.getLayoutParams();
                layoutParams.height = this.f1239v;
                this.f1231n.setLayoutParams(layoutParams);
                if (this.f1220c.mo1475w().f1503b) {
                    this.f1231n.setOnClickListener(cVar);
                    this.f1231n.setOnTouchListener(onTouchListener2);
                } else {
                    this.f1231n.setOnClickListener(onClickListener2);
                }
            }
            if (!(this.f1220c.mo1475w() == null || (frameLayout = this.f1232o) == null)) {
                C1002v.m4716a((View) frameLayout, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f1232o.getLayoutParams();
                layoutParams2.height = this.f1239v;
                this.f1232o.setLayoutParams(layoutParams2);
                if (this.f1220c.mo1475w().f1505d) {
                    this.f1232o.setOnClickListener(cVar);
                    this.f1232o.setOnTouchListener(onTouchListener2);
                } else {
                    this.f1232o.setOnClickListener(onClickListener2);
                }
            }
        }
        TextView textView7 = this.f1234q;
        if (textView7 != null) {
            textView7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C10638l.m31238c("mAdLogo", "mAdLogo,,,,,,,onClick,,,,,");
                    try {
                        TTWebsiteActivity.m414a(C0368d.this.f1219b, C0368d.this.f1220c, C0368d.this.f1215A);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo1015b() {
        C1002v.m4716a((View) this.f1230m, 8);
        C1002v.m4716a((View) this.f1231n, 8);
        C1002v.m4716a((View) this.f1232o, 8);
        C1002v.m4716a((View) this.f1223f, 8);
        C1002v.m4716a((View) this.f1227j, 8);
        C1002v.m4716a((View) this.f1226i, 8);
        C1002v.m4716a((View) this.f1228k, 8);
        C1002v.m4716a((View) this.f1233p, 8);
        C1002v.m4716a((View) this.f1224g, 8);
        C1002v.m4716a((View) this.f1225h, 8);
        C1002v.m4716a((View) this.f1229l, 8);
        C1002v.m4716a((View) this.f1234q, 8);
        C1002v.m4716a((View) this.f1236s, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1018c() {
        int z = this.f1220c.mo1481z();
        this.f1218a = z;
        if (z == -200) {
            C0516f h = C0558m.m2673h();
            this.f1218a = h.mo1704k(C0996u.m4657f(this.f1220c) + "");
        }
        if (this.f1218a == -1 && this.f1238u) {
            C1002v.m4716a((View) this.f1223f, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1020d() {
        if (this.f1220c.mo1473v() == 3) {
            int[] iArr = {Color.parseColor("#0070FF")};
            int e = C1002v.m4749e(this.f1219b, 17.0f);
            int parseColor = Color.parseColor("#80000000");
            C0737c.C0738a e2 = new C0737c.C0738a().mo2490a(iArr[0]).mo2493b(parseColor).mo2491a(iArr).mo2494c(e).mo2495d(0).mo2496e(C1002v.m4749e(this.f1219b, 3.0f));
            Activity activity = this.f1219b;
            C0737c.m3754a((LinearLayout) activity.findViewById(C10647t.m31283e(activity, "tt_reward_ad_download_layout")), e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1014a(boolean z) {
        if (this.f1216B == 1) {
            TextView textView = this.f1227j;
            if (textView != null) {
                textView.setMaxWidth((int) C1002v.m4731b(this.f1219b, 153.0f));
            }
        } else {
            TextView textView2 = this.f1227j;
            if (textView2 != null) {
                textView2.setMaxWidth((int) C1002v.m4731b(this.f1219b, 404.0f));
            }
            RelativeLayout relativeLayout = this.f1225h;
            if (relativeLayout != null && z) {
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    int b = m1561b("status_bar_height");
                    int b2 = m1561b("navigation_bar_height");
                    if (b > 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (b > marginLayoutParams.topMargin) {
                            marginLayoutParams.topMargin = b;
                            this.f1221d.mo698a(b);
                        }
                    }
                    if (b2 > 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (b2 > marginLayoutParams2.rightMargin) {
                            marginLayoutParams2.rightMargin = b2;
                        }
                    }
                }
            }
        }
        if (!this.f1243z) {
            C1002v.m4716a((View) this.f1223f, 0);
        }
    }

    /* renamed from: b */
    private int m1561b(String str) {
        Resources resources = this.f1219b.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1012a(String str) {
        TextView textView;
        if (!this.f1220c.mo1402aw()) {
            TextView textView2 = this.f1229l;
            if (textView2 != null) {
                if (this.f1220c.mo1473v() == 3) {
                    str = mo1022e();
                }
                textView2.setText(str);
            }
        } else if (this.f1220c.mo1403ax() != null && TextUtils.isEmpty(this.f1220c.mo1403ax().mo1740f()) && (textView = this.f1229l) != null) {
            C1002v.m4716a((View) textView, 8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo1022e() {
        String j = C0996u.m4676j((Context) this.f1219b);
        if (j == null) {
            j = "";
        }
        boolean z = false;
        boolean z2 = true;
        try {
            if (!j.equals(Locale.CHINESE.getLanguage()) && !j.equals(Locale.CHINA.getLanguage())) {
                if (!j.equals(Locale.TRADITIONAL_CHINESE.getLanguage())) {
                    z2 = false;
                }
            }
            z = j.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
        }
        C0477n nVar = this.f1220c;
        String str = "Install";
        if (nVar == null) {
            return str;
        }
        if (!TextUtils.isEmpty(nVar.mo1343W())) {
            str = this.f1220c.mo1343W();
            if (str == null || !C0996u.m4674i(str) || str.length() <= 2) {
                if (str != null && !C0996u.m4674i(str) && str.length() > 7 && (z2 || z)) {
                    str = m1563t();
                }
            } else if (z2 || z) {
                str = m1563t();
            }
        } else if (this.f1220c.mo1332L() != 4) {
            str = "View";
        }
        if (z && !C0996u.m4674i(str)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1229l.getLayoutParams();
            layoutParams.bottomMargin = C1002v.m4749e(this.f1219b, 4.0f);
            this.f1229l.setLayoutParams(layoutParams);
        }
        return str;
    }

    /* renamed from: t */
    private String m1563t() {
        C0477n nVar = this.f1220c;
        if (nVar == null) {
            return null;
        }
        return nVar.mo1332L() != 4 ? "View" : "Install";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo1023f() {
        TextView textView = this.f1228k;
        if (textView != null) {
            C1002v.m4722a(textView, this.f1220c, (Context) this.f1219b, "tt_comment_num");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo1024g() {
        if (!(this.f1226i == null || this.f1220c.mo1333M() == null || TextUtils.isEmpty(this.f1220c.mo1333M().mo1281a()))) {
            C0835d.m4093a().mo2658a(this.f1220c.mo1333M(), (ImageView) this.f1226i);
            if (!(this.f1220c.mo1403ax() == null || this.f1220c.mo1403ax().mo1732b() == null)) {
                this.f1220c.mo1403ax().mo1732b().mo1775b(0);
            }
        }
        if (this.f1227j != null) {
            if (this.f1216B != 1 || this.f1220c.mo1380aa() == null || TextUtils.isEmpty(this.f1220c.mo1380aa().mo1217b())) {
                this.f1227j.setText(this.f1220c.mo1341U());
            } else {
                this.f1227j.setText(this.f1220c.mo1380aa().mo1217b());
            }
        }
        TextView textView = this.f1235r;
        if (textView != null) {
            textView.setText(this.f1220c.mo1342V());
        }
    }

    /* renamed from: b */
    public void mo1017b(boolean z) {
        this.f1238u = z;
    }

    /* renamed from: a */
    public void mo1007a(int i) {
        C1002v.m4716a((View) this.f1223f, i);
    }

    /* renamed from: a */
    public int mo1005a(C0477n nVar) {
        int f = C10647t.m31284f(this.f1219b, "tt_activity_full_reward_video_default_style");
        if (C0464l.m1967b(nVar)) {
            nVar.mo1445k(4);
            return C10647t.m31284f(this.f1219b, "tt_activity_full_reward_video_landingpage_style");
        } else if (C0464l.m1969c(nVar)) {
            nVar.mo1445k(4);
            return C10647t.m31284f(this.f1219b, "tt_activity_full_reward_landingpage_style");
        } else {
            int v = nVar.mo1473v();
            if (v == 0) {
                return C10647t.m31284f(this.f1219b, "tt_activity_full_reward_video_default_style");
            }
            if (v == 1) {
                return C0480p.m2198i(this.f1220c) ? C10647t.m31284f(this.f1219b, "tt_activity_full_reward_video_default_style") : C10647t.m31284f(this.f1219b, "tt_activity_full_reward_video_no_bar_style");
            } else if (v == 3) {
                return C10647t.m31284f(this.f1219b, "tt_activity_full_reward_video_new_bar_style");
            } else {
                if (v != 5) {
                    return f;
                }
                return C10647t.m31284f(this.f1219b, "tt_activity_full_reward_video_vast_bar_style");
            }
        }
    }

    /* renamed from: h */
    public FrameLayout mo1025h() {
        return this.f1230m;
    }

    /* renamed from: b */
    public void mo1016b(int i) {
        C1002v.m4716a((View) this.f1234q, i);
    }

    /* renamed from: c */
    public void mo1019c(int i) {
        int i2 = this.f1218a;
        if (i2 != -1 && i == i2 && !this.f1240w.get()) {
            this.f1223f.setVisibility(0);
            this.f1240w.set(true);
            mo1026i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo1026i() {
        if (this.f1223f != null) {
            Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
            Keyframe ofFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
            Keyframe ofFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
            Keyframe ofFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
            Keyframe ofFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
            Keyframe ofFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe("scaleX", new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
            PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe("scaleY", new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f1223f, new PropertyValuesHolder[]{ofKeyframe, ofKeyframe2});
            ofPropertyValuesHolder.setDuration(1000);
            ofPropertyValuesHolder.start();
        }
    }

    /* renamed from: d */
    public void mo1021d(int i) {
        C1002v.m4716a((View) this.f1224g, i);
        C1002v.m4716a((View) this.f1225h, i);
        RelativeLayout relativeLayout = this.f1225h;
        if (relativeLayout != null) {
            relativeLayout.post(this.f1242y);
        }
    }

    /* renamed from: j */
    public boolean mo1027j() {
        ImageView imageView = this.f1224g;
        if (imageView == null || this.f1225h == null || imageView.getVisibility() != 0 || this.f1225h.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo1008a(View.OnClickListener onClickListener) {
        C1002v.m4718a((View) this.f1230m, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    /* renamed from: a */
    private void m1559a(C0408c cVar) {
        C1002v.m4719a((View) this.f1230m, (View.OnTouchListener) cVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    /* renamed from: k */
    public View mo1028k() {
        return this.f1225h;
    }

    /* renamed from: l */
    public View mo1029l() {
        return this.f1223f;
    }

    /* renamed from: a */
    public void mo1006a(float f) {
        C1002v.m4715a((View) this.f1224g, f);
        C1002v.m4715a((View) this.f1225h, f);
    }

    /* renamed from: a */
    public void mo1009a(Animation animation) {
        RelativeLayout relativeLayout = this.f1236s;
        if (relativeLayout != null) {
            relativeLayout.setAnimation(animation);
        }
    }

    /* renamed from: m */
    public void mo1030m() {
        try {
            if (this.f1237t != null) {
                this.f1237t.mo715b();
            }
            if (this.f1222e != null && this.f1236s != null) {
                ((ViewGroup) this.f1222e).removeView(this.f1236s);
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout = this.f1236s;
            if (relativeLayout != null) {
                relativeLayout.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: n */
    public void mo1031n() {
        C0464l lVar = this.f1241x;
        if (lVar != null) {
            lVar.mo1299e();
        }
        RelativeLayout relativeLayout = this.f1225h;
        if (relativeLayout != null) {
            relativeLayout.removeCallbacks(this.f1242y);
        }
    }

    /* renamed from: o */
    public void mo1032o() {
        C0464l lVar = this.f1241x;
        if (lVar != null) {
            lVar.mo1300f();
        }
    }

    /* renamed from: p */
    public void mo1033p() {
        C0464l lVar = this.f1241x;
        if (lVar != null) {
            lVar.mo1301g();
        }
    }

    /* renamed from: q */
    public void mo1034q() {
        C0464l lVar = this.f1241x;
        if (lVar != null) {
            lVar.mo1302h();
        }
    }

    /* renamed from: r */
    public void mo1035r() {
        RelativeLayout relativeLayout = this.f1223f;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            this.f1223f.setLayoutParams(layoutParams);
            this.f1223f.setVisibility(0);
        }
    }
}
