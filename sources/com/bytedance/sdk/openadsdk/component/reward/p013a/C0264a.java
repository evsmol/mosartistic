package com.bytedance.sdk.openadsdk.component.reward.p013a;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0625t;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.a */
/* compiled from: RewardFullDownloadManager */
public class C0264a {

    /* renamed from: a */
    C1008c f858a;

    /* renamed from: b */
    private Activity f859b;

    /* renamed from: c */
    private C0477n f860c;

    /* renamed from: d */
    private String f861d;

    /* renamed from: e */
    private boolean f862e = false;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.a$a */
    /* compiled from: RewardFullDownloadManager */
    public interface C0265a {
        /* renamed from: a */
        void mo116a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, int i, int i2, int i3);

        /* renamed from: a */
        void mo117a(String str, JSONObject jSONObject);
    }

    public C0264a(Activity activity) {
        this.f859b = activity;
    }

    /* renamed from: a */
    public void mo668a(C0477n nVar, String str) {
        if (!this.f862e) {
            this.f862e = true;
            this.f860c = nVar;
            this.f861d = str;
            m1039d();
        }
    }

    /* renamed from: d */
    private void m1039d() {
        if (C0934b.m4334c()) {
            C0477n nVar = this.f860c;
            if (nVar != null && nVar.mo1332L() == 4) {
                this.f858a = C1009d.m4776a(this.f859b, this.f860c, this.f861d);
                return;
            }
            return;
        }
        this.f858a = C0625t.m3022a().mo2035g();
    }

    /* renamed from: a */
    public void mo666a() {
        C0477n nVar;
        if (this.f858a == null && (nVar = this.f860c) != null) {
            this.f858a = C1009d.m4776a(this.f859b, nVar, this.f861d);
        }
    }

    /* renamed from: b */
    public void mo669b() {
        C1008c cVar = this.f858a;
        if (cVar != null) {
            cVar.mo2930d();
        }
    }

    /* renamed from: c */
    public C1008c mo670c() {
        return this.f858a;
    }

    /* renamed from: a */
    public void mo667a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, int i, int i2, int i3, C0265a aVar) {
        C0265a aVar2 = aVar;
        if (this.f858a == null) {
            aVar.mo116a(view, f, f2, f3, f4, sparseArray, i, i2, i3);
        } else if (view.getId() == C10647t.m31283e(this.f859b, "tt_rb_score")) {
            aVar2.mo117a("click_play_star_level", (JSONObject) null);
        } else if (view.getId() == C10647t.m31283e(this.f859b, "tt_comment_vertical")) {
            aVar2.mo117a("click_play_star_nums", (JSONObject) null);
        } else if (view.getId() == C10647t.m31283e(this.f859b, "tt_reward_ad_appname")) {
            aVar2.mo117a("click_play_source", (JSONObject) null);
        } else if (view.getId() == C10647t.m31283e(this.f859b, "tt_reward_ad_icon")) {
            aVar2.mo117a("click_play_logo", (JSONObject) null);
        }
    }
}
