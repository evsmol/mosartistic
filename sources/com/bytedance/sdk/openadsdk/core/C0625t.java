package com.bytedance.sdk.openadsdk.core;

import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.com.bytedance.overseas.sdk.p056a.C1008c;

/* renamed from: com.bytedance.sdk.openadsdk.core.t */
/* compiled from: SingleAppData */
public class C0625t {

    /* renamed from: a */
    private static C0625t f2326a;

    /* renamed from: b */
    private C10192c f2327b;

    /* renamed from: c */
    private boolean f2328c = true;

    /* renamed from: d */
    private C0477n f2329d;

    /* renamed from: e */
    private TTRewardVideoAd.RewardAdInteractionListener f2330e;

    /* renamed from: f */
    private C1008c f2331f;

    /* renamed from: g */
    private TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f2332g;

    /* renamed from: h */
    private TTAppOpenAd.AppOpenAdInteractionListener f2333h;

    /* renamed from: i */
    private boolean f2334i = false;

    private C0625t() {
    }

    /* renamed from: a */
    public static C0625t m3022a() {
        if (f2326a == null) {
            f2326a = new C0625t();
        }
        return f2326a;
    }

    /* renamed from: a */
    public void mo2028a(boolean z) {
        this.f2328c = z;
    }

    /* renamed from: b */
    public boolean mo2030b() {
        return this.f2328c;
    }

    /* renamed from: c */
    public C0477n mo2031c() {
        return this.f2329d;
    }

    /* renamed from: a */
    public void mo2026a(C0477n nVar) {
        this.f2329d = nVar;
    }

    /* renamed from: d */
    public TTRewardVideoAd.RewardAdInteractionListener mo2032d() {
        return this.f2330e;
    }

    /* renamed from: e */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener mo2033e() {
        return this.f2332g;
    }

    /* renamed from: f */
    public TTAppOpenAd.AppOpenAdInteractionListener mo2034f() {
        return this.f2333h;
    }

    /* renamed from: a */
    public void mo2024a(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f2332g = fullScreenVideoAdInteractionListener;
    }

    /* renamed from: a */
    public void mo2025a(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f2330e = rewardAdInteractionListener;
    }

    /* renamed from: a */
    public void mo2023a(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f2333h = appOpenAdInteractionListener;
    }

    /* renamed from: g */
    public C1008c mo2035g() {
        return this.f2331f;
    }

    /* renamed from: a */
    public void mo2027a(C1008c cVar) {
        this.f2331f = cVar;
    }

    /* renamed from: b */
    public void mo2029b(boolean z) {
        this.f2334i = z;
    }

    /* renamed from: h */
    public void mo2036h() {
        this.f2327b = null;
        this.f2329d = null;
        this.f2330e = null;
        this.f2332g = null;
        this.f2333h = null;
        this.f2331f = null;
        this.f2334i = false;
        this.f2328c = true;
    }
}
