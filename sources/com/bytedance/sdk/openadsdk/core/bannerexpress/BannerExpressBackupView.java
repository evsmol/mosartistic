package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C10281b;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0598k;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.p021e.C0460j;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.widget.RatioFrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.RatioImageView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p152ms.p153bd.p154o.Pgl.C5643c;

public class BannerExpressBackupView extends BackupView {

    /* renamed from: a */
    public static C0598k[] f1395a = {new C0598k(1, 6.4f, 320, 50), new C0598k(4, 1.2f, C5643c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED)};

    /* renamed from: m */
    private View f1396m;

    /* renamed from: n */
    private NativeExpressView f1397n;

    /* renamed from: o */
    private C1008c f1398o;

    /* renamed from: p */
    private int f1399p = 1;

    /* renamed from: q */
    private String f1400q;

    public void setClosedListenerKey(String str) {
        this.f1400q = str;
    }

    public BannerExpressBackupView(Context context) {
        super(context);
        this.f2092b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo957a(View view, int i, C0460j jVar) {
        if (this.f1397n != null) {
            if (i == 1 || i == 2) {
                View findViewById = this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_close"));
                if (i == 1) {
                    this.f1397n.getClickListener().mo1112b(findViewById);
                } else {
                    this.f1397n.getClickCreativeListener().mo1112b(findViewById);
                }
            }
            this.f1397n.mo965a(view, i, (C10281b) jVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1124a(C0477n nVar, NativeExpressView nativeExpressView, C1008c cVar) {
        setBackgroundColor(-1);
        this.f2093c = nVar;
        this.f1397n = nativeExpressView;
        this.f1398o = cVar;
        this.f2096f = "banner_ad";
        this.f1397n.addView(this, new ViewGroup.LayoutParams(-2, -2));
        m1715b();
    }

    /* renamed from: b */
    private void m1715b() {
        C0598k a = m1712a(this.f1397n.getExpectExpressWidth(), this.f1397n.getExpectExpressHeight());
        if (this.f1397n.getExpectExpressWidth() <= 0 || this.f1397n.getExpectExpressHeight() <= 0) {
            this.f2097g = C1002v.m4740c(this.f2092b);
            this.f2098h = Float.valueOf(((float) this.f2097g) / a.f2239b).intValue();
        } else {
            this.f2097g = C1002v.m4749e(this.f2092b, (float) this.f1397n.getExpectExpressWidth());
            this.f2098h = C1002v.m4749e(this.f2092b, (float) this.f1397n.getExpectExpressHeight());
        }
        if (this.f2097g > 0 && this.f2097g > C1002v.m4740c(this.f2092b)) {
            float c = ((float) C1002v.m4740c(this.f2092b)) / ((float) this.f2097g);
            this.f2097g = C1002v.m4740c(this.f2092b);
            this.f2098h = Float.valueOf(((float) this.f2098h) * c).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f2097g, this.f2098h);
        }
        layoutParams.width = this.f2097g;
        layoutParams.height = this.f2098h;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        if (a.f2238a == 1) {
            m1717c();
        } else if (a.f2238a == 4) {
            m1719d();
        } else {
            m1719d();
        }
    }

    /* renamed from: a */
    private void m1713a(ImageView imageView) {
        C0835d.m4093a().mo2658a(this.f2093c.mo1336P().get(0), imageView);
    }

    /* renamed from: c */
    private void m1717c() {
        float e = (((float) this.f2098h) * 1.0f) / ((float) C1002v.m4749e(this.f2092b, 50.0f));
        if ((((float) this.f2098h) * 1.0f) / ((float) this.f2097g) > 0.21875f) {
            e = (((float) this.f2097g) * 1.0f) / ((float) C1002v.m4749e(this.f2092b, 320.0f));
        }
        View inflate = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_backup_banner_layout1"), this, true);
        this.f1396m = inflate;
        View findViewById = inflate.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_close"));
        ImageView imageView = (ImageView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_icon"));
        TextView textView = (TextView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_title"));
        TextView textView2 = (TextView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_score"));
        TTRatingBar2 tTRatingBar2 = (TTRatingBar2) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_score_bar"));
        TextView textView3 = (TextView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_download"));
        textView.setTextSize(2, ((float) C1002v.m4706a(this.f2092b, textView.getTextSize())) * e);
        textView2.setTextSize(2, ((float) C1002v.m4706a(this.f2092b, textView2.getTextSize())) * e);
        textView3.setTextSize(2, ((float) C1002v.m4706a(this.f2092b, textView3.getTextSize())) * e);
        View findViewById2 = this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_backup_logoLayout"));
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTWebsiteActivity.m414a(BannerExpressBackupView.this.f2092b, BannerExpressBackupView.this.f2093c, BannerExpressBackupView.this.f2096f);
                }
            });
        }
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                BannerExpressBackupView.this.mo1123a();
            }
        });
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (((float) C1002v.m4749e(this.f2092b, 45.0f)) * e);
            layoutParams.height = (int) (((float) C1002v.m4749e(this.f2092b, 45.0f)) * e);
        }
        if (this.f2093c.mo1333M() != null && !TextUtils.isEmpty(this.f2093c.mo1333M().mo1281a())) {
            C0835d.m4093a().mo2659a(this.f2093c.mo1333M().mo1281a(), imageView);
        }
        textView.setText(getTitle());
        if (!TextUtils.isEmpty(this.f2093c.mo1343W())) {
            textView3.setText(this.f2093c.mo1343W());
        } else {
            textView3.setVisibility(8);
        }
        C1002v.m4724a(textView2, tTRatingBar2, this.f2093c, this.f2092b);
        mo1848a(imageView, true);
        imageView.setTag(C10647t.m31283e(C0558m.m2663a(), "tt_id_is_video_picture"), true);
        mo1848a(this, true);
        mo1848a(textView3, true);
    }

    /* renamed from: d */
    private void m1719d() {
        String str;
        if (this.f2093c != null) {
            int ad = this.f2093c.mo1383ad();
            float e = (((float) this.f2098h) * 1.0f) / ((float) C1002v.m4749e(this.f2092b, 250.0f));
            if (this.f2093c.mo1330J() == null) {
                View inflate = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_backup_banner_layout4"), this, true);
                this.f1396m = inflate;
                View findViewById = inflate.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_close"));
                RatioImageView ratioImageView = (RatioImageView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "ratio_image_view"));
                ImageView imageView = (ImageView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_icon"));
                TextView textView = (TextView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_title"));
                TextView textView2 = (TextView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_desc"));
                TextView textView3 = (TextView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_name"));
                TextView textView4 = (TextView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_download"));
                FrameLayout frameLayout = (FrameLayout) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_image_layout"));
                LinearLayout linearLayout = (LinearLayout) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_total_title"));
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    str = "tt_id_is_video_picture";
                    layoutParams.width = (int) (((float) C1002v.m4749e(this.f2092b, 45.0f)) * e);
                    layoutParams.height = (int) (((float) C1002v.m4749e(this.f2092b, 45.0f)) * e);
                } else {
                    str = "tt_id_is_video_picture";
                }
                textView.setTextSize(2, ((float) C1002v.m4706a(this.f2092b, textView.getTextSize())) * e);
                textView2.setTextSize(2, ((float) C1002v.m4706a(this.f2092b, textView2.getTextSize())) * e);
                textView3.setTextSize(2, ((float) C1002v.m4706a(this.f2092b, textView3.getTextSize())) * e);
                textView4.setTextSize(2, ((float) C1002v.m4706a(this.f2092b, textView4.getTextSize())) * e);
                try {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                    float f = e - 1.0f;
                    if (f > 0.0f) {
                        layoutParams2.topMargin = C1002v.m4749e(this.f2092b, f * 8.0f);
                    }
                    ((LinearLayout.LayoutParams) textView4.getLayoutParams()).setMargins(0, (int) (((float) C1002v.m4749e(this.f2092b, 16.0f)) * e), 0, 0);
                } catch (Throwable unused) {
                }
                View findViewById2 = this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_backup_logoLayout"));
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            TTWebsiteActivity.m414a(BannerExpressBackupView.this.f2092b, BannerExpressBackupView.this.f2093c, BannerExpressBackupView.this.f2096f);
                        }
                    });
                }
                if (ad == 33) {
                    ratioImageView.setRatio(1.0f);
                } else {
                    ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 2.5f;
                    ratioImageView.setRatio(1.91f);
                }
                findViewById.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        BannerExpressBackupView.this.mo1123a();
                    }
                });
                int b = (int) C1002v.m4731b(this.f2092b, 15.0f);
                C1002v.m4717a(findViewById, b, b, b, b);
                m1713a((ImageView) ratioImageView);
                if (this.f2093c.mo1333M() != null && !TextUtils.isEmpty(this.f2093c.mo1333M().mo1281a())) {
                    C0835d.m4093a().mo2659a(this.f2093c.mo1333M().mo1281a(), imageView);
                }
                textView3.setText(getNameOrSource());
                textView.setText(getNameOrSource());
                textView2.setText(getDescription());
                if (!TextUtils.isEmpty(this.f2093c.mo1343W())) {
                    textView4.setText(this.f2093c.mo1343W());
                } else {
                    textView4.setVisibility(8);
                }
                mo1848a(ratioImageView, true);
                ratioImageView.setTag(C10647t.m31283e(C0558m.m2663a(), str), true);
                mo1848a(this, true);
                mo1848a(textView4, true);
                return;
            }
            String str2 = "tt_id_is_video_picture";
            View inflate2 = LayoutInflater.from(this.f2092b).inflate(C10647t.m31284f(this.f2092b, "tt_backup_banner_layout4_video"), this, true);
            this.f1396m = inflate2;
            View findViewById3 = inflate2.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_close"));
            TextView textView5 = (TextView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_title"));
            TextView textView6 = (TextView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_desc"));
            TextView textView7 = (TextView) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_bu_download"));
            RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "ratio_frame_layout"));
            textView5.setTextSize(2, ((float) C1002v.m4706a(this.f2092b, textView5.getTextSize())) * e);
            textView6.setTextSize(2, ((float) C1002v.m4706a(this.f2092b, textView6.getTextSize())) * e);
            textView7.setTextSize(2, ((float) C1002v.m4706a(this.f2092b, textView7.getTextSize())) * e);
            View findViewById4 = this.f1396m.findViewById(C10647t.m31283e(this.f2092b, "tt_backup_logoLayout"));
            if (findViewById4 != null) {
                findViewById4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TTWebsiteActivity.m414a(BannerExpressBackupView.this.f2092b, BannerExpressBackupView.this.f2093c, BannerExpressBackupView.this.f2096f);
                    }
                });
            }
            if (ad == 15) {
                ratioFrameLayout.setRatio(0.5625f);
            } else if (ad == 5) {
                ratioFrameLayout.setRatio(1.7777778f);
            } else {
                ratioFrameLayout.setRatio(1.0f);
            }
            ratioFrameLayout.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            View videoView = getVideoView();
            if (videoView != null) {
                ratioFrameLayout.addView(videoView, layoutParams3);
            }
            textView5.setText(getNameOrSource());
            textView6.setText(getDescription());
            if (!TextUtils.isEmpty(this.f2093c.mo1343W())) {
                textView7.setText(this.f2093c.mo1343W());
            } else {
                textView7.setVisibility(8);
            }
            findViewById3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    BannerExpressBackupView.this.mo1123a();
                }
            });
            int b2 = (int) C1002v.m4731b(this.f2092b, 15.0f);
            C1002v.m4717a(findViewById3, b2, b2, b2, b2);
            mo1848a(videoView, true);
            videoView.setTag(C10647t.m31283e(C0558m.m2663a(), str2), true);
            mo1848a(this, true);
            mo1848a(textView7, true);
            mo1847a((View) ratioFrameLayout);
        }
    }

    /* renamed from: a */
    public static C0598k m1712a(int i, int i2) {
        try {
            return ((double) i2) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? f1395a[1] : f1395a[0];
        } catch (Throwable unused) {
            return f1395a[0];
        }
    }

    /* renamed from: a */
    public void mo1123a() {
        if (this.f2095e != null) {
            this.f2095e.show();
        } else if (this.f2094d != null) {
            this.f2094d.showDislikeDialog();
        } else {
            TTDelegateActivity.m183a(this.f2093c, this.f1400q);
        }
    }
}
