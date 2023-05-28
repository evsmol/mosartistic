package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0278e;
import com.bytedance.sdk.openadsdk.component.reward.p013a.C0292g;
import com.bytedance.sdk.openadsdk.core.p016b.C0411e;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C1002v;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.a */
/* compiled from: RewardFullBackUpEndCard */
public class C0363a {

    /* renamed from: a */
    LinearLayout f1191a;

    /* renamed from: b */
    FrameLayout f1192b;

    /* renamed from: c */
    TTRoundRectImageView f1193c;

    /* renamed from: d */
    TextView f1194d;

    /* renamed from: e */
    TTRatingBar2 f1195e;

    /* renamed from: f */
    TextView f1196f;

    /* renamed from: g */
    TextView f1197g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Activity f1198h;

    /* renamed from: i */
    private boolean f1199i;

    /* renamed from: j */
    private TextView f1200j;

    /* renamed from: k */
    private C0292g f1201k;

    public C0363a(Activity activity) {
        this.f1198h = activity;
    }

    /* renamed from: a */
    public void mo975a() {
        if (!this.f1199i) {
            this.f1199i = true;
            m1527d();
        }
    }

    /* renamed from: d */
    private void m1527d() {
        Activity activity = this.f1198h;
        this.f1192b = (FrameLayout) activity.findViewById(C10647t.m31283e(activity, "tt_reward_full_endcard_backup_container"));
        Activity activity2 = this.f1198h;
        this.f1191a = (LinearLayout) activity2.findViewById(C10647t.m31283e(activity2, "tt_reward_full_endcard_backup"));
        Activity activity3 = this.f1198h;
        this.f1193c = (TTRoundRectImageView) activity3.findViewById(C10647t.m31283e(activity3, "tt_reward_ad_icon_backup"));
        Activity activity4 = this.f1198h;
        this.f1194d = (TextView) activity4.findViewById(C10647t.m31283e(activity4, "tt_reward_ad_appname_backup"));
        Activity activity5 = this.f1198h;
        this.f1195e = (TTRatingBar2) activity5.findViewById(C10647t.m31283e(activity5, "tt_rb_score_backup"));
        Activity activity6 = this.f1198h;
        this.f1196f = (TextView) activity6.findViewById(C10647t.m31283e(activity6, "tt_comment_backup"));
        Activity activity7 = this.f1198h;
        this.f1197g = (TextView) activity7.findViewById(C10647t.m31283e(activity7, "tt_reward_ad_download_backup"));
        Activity activity8 = this.f1198h;
        this.f1200j = (TextView) activity8.findViewById(C10647t.m31283e(activity8, "tt_ad_endcard_logo"));
    }

    /* renamed from: a */
    public void mo976a(C0411e eVar) {
        C1002v.m4718a((View) this.f1192b, (View.OnClickListener) new View.OnClickListener() {
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        this.f1197g.setOnClickListener(eVar);
        this.f1197g.setOnTouchListener(eVar);
        if (this.f1201k == null) {
            this.f1201k = new C0292g(this.f1198h);
        }
        this.f1201k.mo822a(eVar);
    }

    /* renamed from: b */
    public void mo981b() {
        C1002v.m4716a((View) this.f1192b, 0);
        C1002v.m4716a((View) this.f1191a, 0);
        C0292g gVar = this.f1201k;
        if (gVar != null) {
            gVar.mo821a();
        }
    }

    /* renamed from: c */
    public void mo982c() {
        TTRoundRectImageView tTRoundRectImageView = this.f1193c;
        if (tTRoundRectImageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tTRoundRectImageView.getLayoutParams();
            layoutParams.setMargins(0, (int) C1002v.m4731b(this.f1198h, 50.0f), 0, 0);
            this.f1193c.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public void mo977a(C0477n nVar) {
        if (nVar.mo1402aw()) {
            if (this.f1201k == null) {
                this.f1201k = new C0292g(this.f1198h);
            }
            this.f1201k.mo823a(nVar);
            return;
        }
        if (!(this.f1193c == null || nVar.mo1333M() == null || TextUtils.isEmpty(nVar.mo1333M().mo1281a()))) {
            C0835d.m4093a().mo2658a(nVar.mo1333M(), (ImageView) this.f1193c);
        }
        TTRatingBar2 tTRatingBar2 = this.f1195e;
        if (tTRatingBar2 != null) {
            C1002v.m4724a((TextView) null, tTRatingBar2, nVar, (Context) this.f1198h);
        }
        if (this.f1194d != null) {
            if (nVar.mo1380aa() == null || TextUtils.isEmpty(nVar.mo1380aa().mo1217b())) {
                this.f1194d.setText(nVar.mo1341U());
            } else {
                this.f1194d.setText(nVar.mo1380aa().mo1217b());
            }
        }
        TextView textView = this.f1196f;
        if (textView != null) {
            C1002v.m4722a(textView, nVar, (Context) this.f1198h, "tt_comment_num_backup");
        }
    }

    /* renamed from: a */
    public void mo979a(String str) {
        TextView textView;
        if (!TextUtils.isEmpty(str) && (textView = this.f1197g) != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public void mo978a(final C0477n nVar, final String str) {
        this.f1200j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m414a(C0363a.this.f1198h, nVar, str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    public boolean mo980a(C0278e eVar) {
        C0292g gVar = this.f1201k;
        if (gVar == null || !gVar.mo824a(eVar)) {
            return false;
        }
        C1002v.m4716a((View) this.f1192b, 0);
        C1002v.m4716a((View) this.f1191a, 8);
        return true;
    }
}
