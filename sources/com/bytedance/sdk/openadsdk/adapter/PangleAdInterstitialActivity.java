package com.bytedance.sdk.openadsdk.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10622b;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.CustomEventInterstitialListener;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.util.ArrayList;

public class PangleAdInterstitialActivity extends Activity {
    public static final String INTENT_TYPE = "intent_type";
    public static final int INTENT_TYPE_IMAGE_2_3 = 2;
    public static final int INTENT_TYPE_IMAGE_3_2 = 1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static CustomEventInterstitialListener f406n;

    /* renamed from: o */
    private static TTNativeAd f407o;

    /* renamed from: a */
    private ImageView f408a;

    /* renamed from: b */
    private RelativeLayout f409b;

    /* renamed from: c */
    private NiceImageView f410c;

    /* renamed from: d */
    private TextView f411d;

    /* renamed from: e */
    private TextView f412e;

    /* renamed from: f */
    private Button f413f;

    /* renamed from: g */
    private TTRatingBar2 f414g;

    /* renamed from: h */
    private Intent f415h;

    /* renamed from: i */
    private ViewGroup f416i;

    /* renamed from: j */
    private RelativeLayout f417j;

    /* renamed from: k */
    private ViewGroup f418k;

    /* renamed from: l */
    private float f419l;

    /* renamed from: m */
    private float f420m;

    public void onBackPressed() {
    }

    public static void showAd(Context context, TTNativeAd tTNativeAd, int i, CustomEventInterstitialListener customEventInterstitialListener) {
        f407o = tTNativeAd;
        f406n = customEventInterstitialListener;
        Intent intent = new Intent(context, PangleAdInterstitialActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(INTENT_TYPE, i);
        C10622b.m31190a(context, intent, new C10622b.C10623a() {
            /* renamed from: a */
            public void mo299a() {
            }

            /* renamed from: a */
            public void mo300a(Throwable th) {
                if (PangleAdInterstitialActivity.f406n != null) {
                    PangleAdInterstitialActivity.f406n.onInterstitialShowFail();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f415h = getIntent();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f419l = (float) C1002v.m4740c((Context) this);
        this.f420m = (float) C1002v.m4744d((Context) this);
        if (this.f415h.getIntExtra(INTENT_TYPE, 0) == 2) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(0);
        }
        if (this.f415h != null) {
            m427b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m427b() {
        /*
            r8 = this;
            float r0 = r8.f419l
            int r0 = (int) r0
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = f407o
            r2 = 1
            r3 = 0
            java.lang.String r4 = "PangleAdInterstitial"
            if (r1 == 0) goto L_0x0087
            java.util.List r1 = r1.getImageList()
            if (r1 == 0) goto L_0x0087
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = f407o
            java.util.List r1 = r1.getImageList()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0087
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = f407o
            java.util.List r1 = r1.getImageList()
            java.lang.Object r1 = r1.get(r3)
            com.bytedance.sdk.openadsdk.TTImage r1 = (com.bytedance.sdk.openadsdk.TTImage) r1
            if (r1 == 0) goto L_0x0087
            boolean r5 = r1.isValid()
            if (r5 == 0) goto L_0x0087
            int r5 = r1.getHeight()
            float r5 = (float) r5
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r1 = r1 / r5
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "ratio...."
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r4, (java.lang.String) r6)
            r6 = 1155432448(0x44de8000, float:1780.0)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x006d
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x006d
            float r1 = (float) r0
            r5 = 1071896330(0x3fe3d70a, float:1.78)
            float r1 = r1 / r5
            int r1 = (int) r1
            int r1 = r1 + 30
            java.lang.String r5 = "RATIO_1_7_8...."
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r4, (java.lang.String) r5)
            goto L_0x0088
        L_0x006d:
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x007f
            float r1 = (float) r0
            r5 = 1072986849(0x3ff47ae1, float:1.91)
            float r1 = r1 / r5
            int r1 = (int) r1
            int r1 = r1 + 30
            java.lang.String r5 = "RATIO_1_9_1...."
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r4, (java.lang.String) r5)
            goto L_0x0088
        L_0x007f:
            java.lang.String r1 = "RATIO_1_1...."
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r4, (java.lang.String) r1)
            r1 = r0
            r5 = 1
            goto L_0x0089
        L_0x0087:
            r1 = r0
        L_0x0088:
            r5 = 0
        L_0x0089:
            android.content.Intent r6 = r8.f415h
            java.lang.String r7 = "intent_type"
            int r3 = r6.getIntExtra(r7, r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "intentType="
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = ",isImageRatio_1_1="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = ", imageHeight = "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = "，imageWidth="
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r4, (java.lang.String) r0)
            if (r3 == r2) goto L_0x00d8
            r0 = 2
            if (r3 == r0) goto L_0x00c7
            r8.finish()
            goto L_0x0156
        L_0x00c7:
            java.lang.String r0 = "tt_pangle_ad_instersitial_layout_2_3"
            int r0 = com.bytedance.sdk.component.utils.C10647t.m31284f(r8, r0)
            r8.setContentView(r0)
            r8.m430d()
            r8.m425a((int) r1)
            goto L_0x0156
        L_0x00d8:
            if (r5 != 0) goto L_0x0101
            java.lang.String r0 = "tt_pangle_ad_instersitial_layout_3_2"
            int r0 = com.bytedance.sdk.component.utils.C10647t.m31284f(r8, r0)
            r8.setContentView(r0)
            r8.m430d()
            r0 = 1117126656(0x42960000, float:75.0)
            int r0 = com.bytedance.sdk.openadsdk.utils.C1002v.m4749e(r8, r0)
            float r0 = (float) r0
            float r2 = r8.f420m
            float r3 = (float) r1
            float r4 = r2 - r3
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x00fd
            float r4 = r8.f419l
            float r4 = r4 - r3
            float r0 = r0 - r4
            float r2 = r2 + r0
            r8.f420m = r2
        L_0x00fd:
            r8.m425a((int) r1)
            goto L_0x0156
        L_0x0101:
            java.lang.String r0 = "tt_pangle_ad_instersitial_layout_3_2_1_1"
            int r0 = com.bytedance.sdk.component.utils.C10647t.m31284f(r8, r0)
            r8.setContentView(r0)
            r8.m430d()
            r0 = 1126825984(0x432a0000, float:170.0)
            int r0 = com.bytedance.sdk.openadsdk.utils.C1002v.m4749e(r8, r0)
            float r0 = (float) r0
            float r2 = r8.f420m
            r3 = 1101004800(0x41a00000, float:20.0)
            int r3 = com.bytedance.sdk.openadsdk.utils.C1002v.m4749e(r8, r3)
            float r3 = (float) r3
            float r2 = r2 - r3
            int r2 = (int) r2
            float r3 = r8.f419l
            float r4 = (float) r1
            float r5 = r3 - r4
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x012b
            float r3 = r3 - r0
            int r0 = (int) r3
            goto L_0x012c
        L_0x012b:
            r0 = r1
        L_0x012c:
            float r3 = r8.f420m
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x013a
            int r1 = (int) r3
            r3 = 1111490560(0x42400000, float:48.0)
            int r3 = com.bytedance.sdk.openadsdk.utils.C1002v.m4749e(r8, r3)
            int r1 = r1 - r3
        L_0x013a:
            android.widget.RelativeLayout r3 = r8.f417j
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r3.height = r1
            r3.width = r0
            android.widget.RelativeLayout r0 = r8.f417j
            r0.setLayoutParams(r3)
            android.view.ViewGroup r0 = r8.f416i
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r2
            android.view.ViewGroup r1 = r8.f416i
            r1.setLayoutParams(r0)
        L_0x0156:
            com.bytedance.sdk.openadsdk.TTNativeAd r0 = f407o
            r8.m426a((com.bytedance.sdk.openadsdk.TTNativeAd) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.adapter.PangleAdInterstitialActivity.m427b():void");
    }

    /* renamed from: a */
    private void m425a(int i) {
        ViewGroup.LayoutParams layoutParams = this.f417j.getLayoutParams();
        layoutParams.height = i;
        this.f417j.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f416i.getLayoutParams();
        layoutParams2.height = (int) (this.f420m - ((float) i));
        this.f416i.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    private void m426a(TTNativeAd tTNativeAd) {
        TTImage tTImage;
        if (tTNativeAd != null) {
            if (f407o.getImageList() != null && !f407o.getImageList().isEmpty() && (tTImage = f407o.getImageList().get(0)) != null && tTImage.isValid()) {
                C0835d.m4093a().mo2659a(tTImage.getImageUrl(), this.f408a);
            }
            if (!(f407o.getIcon() == null || !f407o.getIcon().isValid() || f407o.getIcon().getImageUrl() == null)) {
                C0835d.m4093a().mo2659a(f407o.getIcon().getImageUrl(), (ImageView) this.f410c);
            }
            this.f411d.setText(f407o.getTitle());
            this.f412e.setText(f407o.getDescription());
            this.f413f.setText(f407o.getButtonText());
            m429c();
            m428b(tTNativeAd);
        }
    }

    /* renamed from: b */
    private void m428b(TTNativeAd tTNativeAd) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f408a);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f413f);
        tTNativeAd.registerViewForInteraction(this.f418k, arrayList, arrayList2, this.f409b, new TTNativeAd.AdInteractionListener() {
            public void onAdClicked(View view, TTNativeAd tTNativeAd) {
                C10638l.m31235b("PangleAdInterstitial", "PangleAdInterstitialActivity-onAdClicked....");
                if (PangleAdInterstitialActivity.f406n != null) {
                    PangleAdInterstitialActivity.f406n.onInterstitialClicked();
                }
            }

            public void onAdCreativeClick(View view, TTNativeAd tTNativeAd) {
                C10638l.m31235b("PangleAdInterstitial", "PangleAdInterstitialActivity-onAdClicked....");
                if (PangleAdInterstitialActivity.f406n != null) {
                    PangleAdInterstitialActivity.f406n.onInterstitialClicked();
                }
            }

            public void onAdShow(TTNativeAd tTNativeAd) {
                C10638l.m31235b("PangleAdInterstitial", "PangleAdInterstitialActivity-onAdShow....");
                if (PangleAdInterstitialActivity.f406n != null) {
                    PangleAdInterstitialActivity.f406n.onInterstitialShown();
                }
            }
        });
    }

    /* renamed from: c */
    private void m429c() {
        this.f409b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                PangleAdInterstitialActivity.this.finish();
                if (PangleAdInterstitialActivity.f406n != null) {
                    PangleAdInterstitialActivity.f406n.onInterstitialDismissed();
                }
            }
        });
    }

    /* renamed from: d */
    private void m430d() {
        TTRatingBar2 tTRatingBar2 = (TTRatingBar2) findViewById(C10647t.m31283e(this, "tt_pangle_ad_score"));
        this.f414g = tTRatingBar2;
        if (tTRatingBar2 != null) {
            C1002v.m4723a((TextView) null, tTRatingBar2, (double) f407o.getAppScore(), (Context) this);
        }
        this.f408a = (ImageView) findViewById(C10647t.m31283e(this, "tt_pangle_ad_main_img"));
        this.f409b = (RelativeLayout) findViewById(C10647t.m31283e(this, "tt_pangle_ad_close_layout"));
        this.f410c = (NiceImageView) findViewById(C10647t.m31283e(this, "tt_pangle_ad_icon"));
        this.f411d = (TextView) findViewById(C10647t.m31283e(this, "tt_pangle_ad_title"));
        this.f412e = (TextView) findViewById(C10647t.m31283e(this, "tt_pangle_ad_content"));
        this.f413f = (Button) findViewById(C10647t.m31283e(this, "tt_pangle_ad_btn"));
        this.f416i = (ViewGroup) findViewById(C10647t.m31283e(this, "tt_pangle_ad_content_layout"));
        this.f417j = (RelativeLayout) findViewById(C10647t.m31283e(this, "tt_pangle_ad_image_layout"));
        this.f418k = (ViewGroup) findViewById(C10647t.m31283e(this, "tt_pangle_ad_root"));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        f407o = null;
        f406n = null;
    }
}
