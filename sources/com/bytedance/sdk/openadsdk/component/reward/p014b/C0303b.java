package com.bytedance.sdk.openadsdk.component.reward.p014b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0269c;
import com.bytedance.sdk.openadsdk.component.reward.view.C0368d;
import com.bytedance.sdk.openadsdk.component.reward.view.RatioImageView;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p016b.C0405a;
import com.bytedance.sdk.openadsdk.core.p016b.C0406b;
import com.bytedance.sdk.openadsdk.core.p021e.C0463k;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p056a.C1007b;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.b */
/* compiled from: RewardFullTypeImage */
public class C0303b extends C0301a {

    /* renamed from: i */
    protected View f1004i;

    /* renamed from: j */
    private boolean f1005j = false;

    /* renamed from: k */
    private int f1006k = 33;

    /* renamed from: l */
    private RatioImageView f1007l;

    /* renamed from: m */
    private TTRoundRectImageView f1008m;

    /* renamed from: n */
    private TextView f1009n;

    /* renamed from: o */
    private TextView f1010o;

    /* renamed from: p */
    private TextView f1011p;

    /* renamed from: q */
    private TTRatingBar2 f1012q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public TextView f1013r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C0477n f1014s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f1015t = "fullscreen_interstitial_ad";

    public C0303b(Activity activity, C0477n nVar, int i, int i2) {
        super(activity, nVar, i, i2);
        boolean z = false;
        this.f1014s = nVar;
        this.f1006k = nVar.mo1383ad();
        this.f1005j = this.f1000e == 2 ? true : z;
    }

    /* renamed from: d */
    private void m1304d() {
        boolean z = this.f1000e == 2;
        this.f1005j = z;
        if (z) {
            int i = this.f1006k;
            if (i == 3) {
                m1308f();
            } else if (i != 33) {
                m1312j();
            } else {
                m1310h();
            }
        } else {
            int i2 = this.f1006k;
            if (i2 == 3) {
                m1307e();
            } else if (i2 != 33) {
                m1311i();
            } else {
                m1309g();
            }
        }
    }

    /* renamed from: e */
    private void m1307e() {
        this.f1004i = LayoutInflater.from(this.f996a).inflate(C10647t.m31284f(this.f996a, "tt_activity_full_image_model_3_191_v"), (ViewGroup) null, true);
        m1313k();
    }

    /* renamed from: f */
    private void m1308f() {
        View inflate = LayoutInflater.from(this.f996a).inflate(C10647t.m31284f(this.f996a, "tt_activity_full_image_model_3_191_h"), (ViewGroup) null, true);
        this.f1004i = inflate;
        this.f1007l = (RatioImageView) inflate.findViewById(C10647t.m31283e(this.f996a, "tt_ratio_image_view"));
        this.f1008m = (TTRoundRectImageView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_ad_icon"));
        this.f1009n = (TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_ad_app_name"));
        this.f1010o = (TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_desc"));
        this.f1011p = (TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_comment"));
        this.f1013r = (TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_ad_download"));
        final View findViewById = this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_image_full_bar"));
        mo853a((View) this.f1007l);
        mo853a((View) this.f1008m);
        mo853a((View) this.f1009n);
        mo853a((View) this.f1010o);
        mo853a((View) this.f1011p);
        mo853a((View) this.f1013r);
        ((TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_ad_logo"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m414a(C0303b.this.f996a, C0303b.this.f1014s, C0303b.this.f1015t);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        this.f1013r.post(new Runnable() {
            public void run() {
                int width = findViewById.getWidth() / 2;
                if (width >= C1002v.m4745d(C0558m.m2663a(), 90.0f)) {
                    ViewGroup.LayoutParams layoutParams = C0303b.this.f1013r.getLayoutParams();
                    if (layoutParams.width > 0) {
                        layoutParams.width = Math.min(width, layoutParams.width);
                        C0303b.this.f1013r.setLayoutParams(layoutParams);
                    }
                }
            }
        });
    }

    /* renamed from: g */
    private void m1309g() {
        this.f1004i = LayoutInflater.from(this.f996a).inflate(C10647t.m31284f(this.f996a, "tt_activity_full_image_model_33_v"), (ViewGroup) null, true);
        m1313k();
    }

    /* renamed from: h */
    private void m1310h() {
        this.f1004i = LayoutInflater.from(this.f996a).inflate(C10647t.m31284f(this.f996a, "tt_activity_full_image_model_33_h"), (ViewGroup) null, true);
        m1313k();
    }

    /* renamed from: i */
    private void m1311i() {
        View inflate = LayoutInflater.from(this.f996a).inflate(C10647t.m31284f(this.f996a, "tt_activity_full_image_model_173_v"), (ViewGroup) null, true);
        this.f1004i = inflate;
        this.f1007l = (RatioImageView) inflate.findViewById(C10647t.m31283e(this.f996a, "tt_ratio_image_view"));
        this.f1008m = (TTRoundRectImageView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_ad_icon"));
        this.f1009n = (TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_ad_app_name"));
        this.f1010o = (TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_desc"));
        this.f1013r = (TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_ad_download"));
        mo853a((View) this.f1007l);
        mo853a((View) this.f1008m);
        mo853a((View) this.f1009n);
        mo853a((View) this.f1010o);
        mo853a((View) this.f1013r);
        ((TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_ad_logo"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m414a(C0303b.this.f996a, C0303b.this.f1014s, C0303b.this.f1015t);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: j */
    private void m1312j() {
        this.f1004i = LayoutInflater.from(this.f996a).inflate(C10647t.m31284f(this.f996a, "tt_activity_full_image_model_173_h"), (ViewGroup) null, true);
        m1313k();
    }

    /* renamed from: k */
    private void m1313k() {
        View view = this.f1004i;
        if (view != null) {
            this.f1007l = (RatioImageView) view.findViewById(C10647t.m31283e(this.f996a, "tt_ratio_image_view"));
            this.f1008m = (TTRoundRectImageView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_ad_icon"));
            this.f1009n = (TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_ad_app_name"));
            this.f1010o = (TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_desc"));
            this.f1011p = (TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_comment"));
            this.f1012q = (TTRatingBar2) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_rb_score"));
            this.f1013r = (TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_full_ad_download"));
            mo853a((View) this.f1007l);
            mo853a((View) this.f1008m);
            mo853a((View) this.f1009n);
            mo853a((View) this.f1010o);
            mo853a((View) this.f1011p);
            mo853a((View) this.f1012q);
            mo853a((View) this.f1013r);
            ((TextView) this.f1004i.findViewById(C10647t.m31283e(this.f996a, "tt_ad_logo"))).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    try {
                        TTWebsiteActivity.m414a(C0303b.this.f996a, C0303b.this.f1014s, C0303b.this.f1015t);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    private void m1305d(C0477n nVar) {
        if (nVar != null) {
            RatioImageView ratioImageView = this.f1007l;
            if (ratioImageView != null) {
                int i = this.f1006k;
                if (i == 33) {
                    ratioImageView.setRatio(1.0f);
                } else if (i == 3) {
                    ratioImageView.setRatio(1.91f);
                } else {
                    ratioImageView.setRatio(0.56f);
                }
                m1300a((ImageView) this.f1007l);
            }
            if (!(this.f1008m == null || this.f1014s.mo1333M() == null || TextUtils.isEmpty(this.f1014s.mo1333M().mo1281a()))) {
                C0835d.m4093a().mo2659a(this.f1014s.mo1333M().mo1281a(), (ImageView) this.f1008m);
            }
            TextView textView = this.f1009n;
            if (textView != null) {
                textView.setText(mo852a(this.f1014s));
            }
            TextView textView2 = this.f1010o;
            if (textView2 != null) {
                textView2.setText(mo854b(this.f1014s));
            }
            m1314l();
            m1315m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo852a(C0477n nVar) {
        if (nVar == null) {
            return "";
        }
        if (nVar.mo1380aa() != null && !TextUtils.isEmpty(nVar.mo1380aa().mo1217b())) {
            return nVar.mo1380aa().mo1217b();
        }
        if (!TextUtils.isEmpty(nVar.mo1331K())) {
            return nVar.mo1331K();
        }
        if (!TextUtils.isEmpty(nVar.mo1341U())) {
            return nVar.mo1341U();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo854b(C0477n nVar) {
        if (nVar == null) {
            return "";
        }
        if (!TextUtils.isEmpty(nVar.mo1341U())) {
            return nVar.mo1341U();
        }
        if (!TextUtils.isEmpty(nVar.mo1342V())) {
            return nVar.mo1342V();
        }
        return "";
    }

    /* renamed from: a */
    private void m1300a(ImageView imageView) {
        List<C0463k> P;
        C0477n nVar = this.f1014s;
        if (nVar != null && (P = nVar.mo1336P()) != null && P.size() > 0) {
            C0750a.m3820a(P.get(0)).mo64101a(imageView);
        }
    }

    /* renamed from: l */
    private void m1314l() {
        TTRatingBar2 tTRatingBar2 = this.f1012q;
        if (tTRatingBar2 != null) {
            C1002v.m4724a((TextView) null, tTRatingBar2, this.f997b, (Context) this.f996a);
        }
    }

    /* renamed from: m */
    private void m1315m() {
        C0477n nVar;
        TextView textView = this.f1011p;
        if (textView != null && (nVar = this.f1014s) != null) {
            C1002v.m4722a(textView, nVar, (Context) this.f996a, "tt_comment_num_backup");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo853a(View view) {
        C0406b bVar;
        if (view != null && this.f996a != null && this.f1014s != null) {
            if (this.f1003h == null) {
                Activity activity = this.f996a;
                C0477n nVar = this.f1014s;
                String str = this.f1015t;
                bVar = new C0405a(activity, nVar, str, C0996u.m4610a(str));
                bVar.mo1106a(m1306e(this.f1014s));
                HashMap hashMap = new HashMap();
                if (C0480p.m2198i(this.f997b)) {
                    hashMap.put("click_scence", 3);
                } else {
                    hashMap.put("click_scence", 1);
                }
                bVar.mo1108a((Map<String, Object>) hashMap);
            } else {
                bVar = this.f1003h;
            }
            if (this.f996a != null) {
                bVar.mo1099a(this.f996a);
            }
            view.setOnTouchListener(bVar);
            view.setOnClickListener(bVar);
        }
    }

    /* renamed from: e */
    private C1008c m1306e(C0477n nVar) {
        if (nVar.mo1332L() == 4) {
            return new C1007b(C0558m.m2663a(), nVar, this.f1015t);
        }
        return null;
    }

    /* renamed from: a */
    public void mo845a(FrameLayout frameLayout) {
        m1304d();
        m1305d(this.f1014s);
        frameLayout.addView(this.f1004i);
    }

    /* renamed from: c */
    public static boolean m1303c(C0477n nVar) {
        if (nVar != null && !C0477n.m2012c(nVar) && nVar.mo1393an() == 100.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo849b() {
        return m1316n();
    }

    /* renamed from: c */
    public boolean mo850c() {
        return m1316n();
    }

    /* renamed from: n */
    private boolean m1316n() {
        C0477n nVar = this.f1014s;
        if (nVar != null && nVar.mo1447l() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo846a(C0269c cVar, C0368d dVar) {
        dVar.mo1016b(8);
        dVar.mo1007a(8);
        cVar.mo709c(false);
        cVar.mo711d(false);
        if (this.f997b.mo1447l() == 2) {
            cVar.mo702a(false);
            dVar.mo1021d(8);
            return;
        }
        cVar.mo702a(this.f997b.mo1395ap());
        dVar.mo1021d(0);
        cVar.mo710d();
    }
}
