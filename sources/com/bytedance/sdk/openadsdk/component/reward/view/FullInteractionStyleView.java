package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.p016b.C0405a;
import com.bytedance.sdk.openadsdk.core.p016b.C0411e;
import com.bytedance.sdk.openadsdk.core.p021e.C0460j;
import com.bytedance.sdk.openadsdk.core.p021e.C0463k;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p056a.C1007b;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import java.util.List;

public class FullInteractionStyleView extends BackupView {

    /* renamed from: a */
    private float f1173a;

    /* renamed from: m */
    private boolean f1174m;

    /* renamed from: n */
    private int f1175n;

    /* renamed from: o */
    private int f1176o;

    /* renamed from: p */
    private int f1177p = 1;

    /* renamed from: q */
    private View f1178q;

    /* renamed from: r */
    private View f1179r;

    /* renamed from: s */
    private FrameLayout f1180s;

    /* renamed from: t */
    private C0411e f1181t;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo957a(View view, int i, C0460j jVar) {
    }

    public FullInteractionStyleView(Context context, String str) {
        super(context, str);
        this.f2092b = context;
    }

    /* renamed from: a */
    public void mo958a(C0477n nVar, float f, int i, int i2, int i3) {
        this.f1173a = f;
        this.f1177p = i;
        this.f2093c = nVar;
        this.f2096f = "fullscreen_interstitial_ad";
        this.f1175n = i2;
        this.f1176o = i3;
        mo1846a(this.f2099i);
        m1490b();
    }

    /* renamed from: b */
    private void m1490b() {
        this.f2097g = C1002v.m4749e(this.f2092b, (float) this.f1175n);
        this.f2098h = C1002v.m4749e(this.f2092b, (float) this.f1176o);
        int i = (int) (this.f1173a * 1000.0f);
        if (this.f1177p == 1) {
            if (i == 666) {
                m1497e();
            } else if (i == 1000) {
                m1493c();
            } else if (i == 1500) {
                m1504k();
            } else if (i != 1777) {
                m1486a(0.562f);
                m1505l();
            } else {
                m1506m();
            }
        } else if (i == 562) {
            m1502i();
        } else if (i == 666) {
            m1500g();
        } else if (i == 1000) {
            m1493c();
        } else if (i != 1500) {
            m1486a(1.777f);
            m1503j();
        } else {
            m1501h();
        }
    }

    /* renamed from: c */
    private void m1493c() {
        this.f1178q = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_interaction_style_1_1"), this, true);
        m1495d();
        m1499f();
    }

    /* renamed from: d */
    private void m1495d() {
        this.f1180s = (FrameLayout) this.f1178q.findViewById(C10647t.m31283e(this.f2092b, "tt_ad_container"));
        ImageView imageView = (ImageView) this.f1178q.findViewById(C10647t.m31283e(this.f2092b, "tt_full_img"));
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) this.f1178q.findViewById(C10647t.m31283e(this.f2092b, "tt_full_ad_icon"));
        TextView textView = (TextView) this.f1178q.findViewById(C10647t.m31283e(this.f2092b, "tt_full_ad_app_name"));
        TextView textView2 = (TextView) this.f1178q.findViewById(C10647t.m31283e(this.f2092b, "tt_full_ad_download"));
        LinearLayout linearLayout = (LinearLayout) this.f1178q.findViewById(C10647t.m31283e(this.f2092b, "tt_ad_logo_layout"));
        if (!TextUtils.isEmpty(this.f2093c.mo1343W())) {
            textView2.setText(this.f2093c.mo1343W());
        }
        m1487a(this.f1180s, imageView);
        if (this.f2093c.mo1333M() != null && !TextUtils.isEmpty(this.f2093c.mo1333M().mo1281a())) {
            C0835d.m4093a().mo2659a(this.f2093c.mo1333M().mo1281a(), (ImageView) tTRoundRectImageView);
        }
        textView.setText(getTitle());
        m1491b((View) this.f1180s);
        m1491b((View) imageView);
        m1491b((View) tTRoundRectImageView);
        m1491b((View) textView);
        m1491b((View) textView2);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m414a(FullInteractionStyleView.this.f2092b, FullInteractionStyleView.this.f2093c, FullInteractionStyleView.this.f2096f);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: e */
    private void m1497e() {
        this.f1178q = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_interaction_style_2_3"), this, true);
        m1495d();
        m1499f();
    }

    /* renamed from: f */
    private void m1499f() {
        TextView textView = (TextView) this.f1178q.findViewById(C10647t.m31283e(this.f2092b, "tt_full_ad_desc"));
        if (textView != null) {
            textView.setText(getDescription());
            m1491b((View) textView);
        }
    }

    /* renamed from: g */
    private void m1500g() {
        this.f1178q = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_interaction_style_2_3_h"), this, true);
        m1495d();
        m1499f();
    }

    /* renamed from: h */
    private void m1501h() {
        this.f1178q = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_interaction_style_3_2_h"), this, true);
        m1495d();
    }

    /* renamed from: i */
    private void m1502i() {
        this.f1178q = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_interaction_style_9_16_h"), this, true);
        m1495d();
        m1499f();
    }

    /* renamed from: j */
    private void m1503j() {
        this.f1178q = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_interaction_style_16_9_h"), this, true);
        m1495d();
    }

    /* renamed from: k */
    private void m1504k() {
        View inflate = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_interaction_style_3_2"), this, true);
        this.f1178q = inflate;
        this.f1180s = (FrameLayout) inflate.findViewById(C10647t.m31283e(this.f2092b, "tt_ad_container"));
        ImageView imageView = (ImageView) this.f1178q.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_img"));
        TextView textView = (TextView) this.f1178q.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_desc"));
        m1487a(this.f1180s, imageView);
        textView.setText(getDescription());
        m1491b((View) this.f1180s);
        m1491b((View) imageView);
        m1491b((View) textView);
        ((LinearLayout) this.f1178q.findViewById(C10647t.m31283e(this.f2092b, "tt_ad_logo_layout"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m414a(FullInteractionStyleView.this.f2092b, FullInteractionStyleView.this.f2093c, FullInteractionStyleView.this.f2096f);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    private void m1487a(FrameLayout frameLayout, ImageView imageView) {
        if (this.f2093c != null) {
            boolean c = C0477n.m2012c(this.f2093c);
            if (this.f2093c.mo1330J() == null || !c) {
                m1488a(imageView);
                C1002v.m4716a((View) imageView, 0);
                C1002v.m4716a((View) frameLayout, 8);
                return;
            }
            C1002v.m4716a((View) imageView, 8);
            C1002v.m4716a((View) frameLayout, 0);
        }
    }

    /* renamed from: a */
    private void m1488a(ImageView imageView) {
        List<C0463k> P;
        if (this.f2093c != null && (P = this.f2093c.mo1336P()) != null && P.size() > 0) {
            C0750a.m3820a(P.get(0)).mo64101a(imageView);
        }
    }

    /* renamed from: l */
    private void m1505l() {
        this.f1178q = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_interaction_style_9_16_v"), this, true);
        m1495d();
    }

    /* renamed from: m */
    private void m1506m() {
        this.f1178q = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_interaction_style_16_9_v"), this, true);
        m1495d();
        m1499f();
    }

    /* renamed from: b */
    private void m1491b(View view) {
        if (view != null) {
            C0405a aVar = this.f1181t;
            if (aVar == null) {
                aVar = new C0405a(this.f2092b, this.f2093c, this.f2096f, C0996u.m4610a(this.f2096f));
                aVar.mo1106a(m1485a(this.f2093c, this.f2092b));
            }
            view.setOnTouchListener(aVar);
            view.setOnClickListener(aVar);
        }
    }

    /* renamed from: a */
    private C1008c m1485a(C0477n nVar, Context context) {
        if (nVar != null && nVar.mo1332L() == 4) {
            return new C1007b(context, nVar, this.f2096f);
        }
        return null;
    }

    public View getInteractionStyleRootView() {
        return this.f1178q;
    }

    public void setIsMute(boolean z) {
        this.f1174m = z;
        View view = this.f1179r;
        if (view != null && (view instanceof NativeVideoTsView)) {
            ((NativeVideoTsView) view).setIsQuiet(z);
        }
    }

    public FrameLayout getVideoContainer() {
        return this.f1180s;
    }

    public void setDownloadListener(C0411e eVar) {
        this.f1181t = eVar;
    }

    private float getHeightDp() {
        return (float) C1002v.m4745d(this.f2092b, (float) C1002v.m4754h(this.f2092b));
    }

    private float getWidthDp() {
        return (float) C1002v.m4745d(this.f2092b, (float) C1002v.m4755i(this.f2092b));
    }

    /* renamed from: a */
    private void m1486a(float f) {
        float f2;
        float f3;
        int i;
        int i2;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.f1177p == 2) {
            f2 = Math.max(heightDp, widthDp);
            f3 = Math.min(heightDp, widthDp);
        } else {
            f2 = Math.min(heightDp, widthDp);
            f3 = Math.max(heightDp, widthDp);
        }
        if (this.f1177p != 2 && C1002v.m4742c((Activity) this.f2092b)) {
            f3 -= (float) C1002v.m4745d(this.f2092b, C1002v.m4756j(this.f2092b));
        }
        int i3 = 20;
        int i4 = 0;
        if (this.f1177p != 2) {
            if (!(f == 0.0f || f == 100.0f)) {
                float f4 = (float) 20;
                i = (int) Math.max((f3 - (((f2 - f4) - f4) / f)) / 2.0f, 0.0f);
                i3 = i;
                i2 = 20;
                i4 = 20;
                int e = C1002v.m4749e(this.f2092b, (float) i3);
                int e2 = C1002v.m4749e(this.f2092b, (float) i);
                ((Activity) this.f2092b).getWindow().getDecorView().setPadding(C1002v.m4749e(this.f2092b, (float) i4), e, C1002v.m4749e(this.f2092b, (float) i2), e2);
            }
        } else if (!(f == 0.0f || f == 100.0f)) {
            float f5 = (float) 20;
            i2 = (int) Math.max((f2 - (((f3 - f5) - f5) * f)) / 2.0f, 0.0f);
            i4 = i2;
            i = 20;
            int e3 = C1002v.m4749e(this.f2092b, (float) i3);
            int e22 = C1002v.m4749e(this.f2092b, (float) i);
            ((Activity) this.f2092b).getWindow().getDecorView().setPadding(C1002v.m4749e(this.f2092b, (float) i4), e3, C1002v.m4749e(this.f2092b, (float) i2), e22);
        }
        i = 0;
        i2 = 0;
        i3 = 0;
        int e32 = C1002v.m4749e(this.f2092b, (float) i3);
        int e222 = C1002v.m4749e(this.f2092b, (float) i);
        ((Activity) this.f2092b).getWindow().getDecorView().setPadding(C1002v.m4749e(this.f2092b, (float) i4), e32, C1002v.m4749e(this.f2092b, (float) i2), e222);
    }
}
