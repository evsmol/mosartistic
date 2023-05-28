package com.adcolony.sdk;

import com.adcolony.sdk.C6288e0;

public class AdColonyZone {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 0;
    @Deprecated
    public static final int NATIVE = 2;

    /* renamed from: a */
    private String f13229a;

    /* renamed from: b */
    private String f13230b;

    /* renamed from: c */
    private int f13231c = 5;

    /* renamed from: d */
    private int f13232d;

    /* renamed from: e */
    private int f13233e;

    /* renamed from: f */
    private int f13234f;

    /* renamed from: g */
    private int f13235g;

    /* renamed from: h */
    private int f13236h;

    /* renamed from: i */
    private int f13237i;

    /* renamed from: j */
    private boolean f13238j;

    /* renamed from: k */
    private boolean f13239k;

    AdColonyZone(String str) {
        this.f13229a = str;
    }

    /* renamed from: a */
    private int m14871a(int i) {
        if (C6185a.m14890d() && !C6185a.m14887b().mo50765E() && !C6185a.m14887b().mo50766F()) {
            return i;
        }
        m14875b();
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50417b(int i) {
        this.f13237i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50418c(int i) {
        this.f13231c = i;
    }

    public int getPlayFrequency() {
        return m14871a(this.f13235g);
    }

    public int getRemainingViewsUntilReward() {
        return m14871a(this.f13233e);
    }

    public int getRewardAmount() {
        return m14871a(this.f13236h);
    }

    public String getRewardName() {
        return m14872a(this.f13230b);
    }

    public int getViewsPerReward() {
        return m14871a(this.f13234f);
    }

    public String getZoneID() {
        return m14872a(this.f13229a);
    }

    public int getZoneType() {
        return this.f13232d;
    }

    public boolean isRewarded() {
        return this.f13239k;
    }

    public boolean isValid() {
        return m14874a(this.f13238j);
    }

    /* renamed from: b */
    private void m14875b() {
        new C6288e0.C6289a().mo50644a("The AdColonyZone API is not available while AdColony is disabled.").mo50645a(C6288e0.f13497h);
    }

    /* renamed from: a */
    private boolean m14874a(boolean z) {
        if (C6185a.m14890d() && !C6185a.m14887b().mo50765E() && !C6185a.m14887b().mo50766F()) {
            return z;
        }
        m14875b();
        return false;
    }

    /* renamed from: a */
    private String m14872a(String str) {
        return m14873a(str, "");
    }

    /* renamed from: a */
    private String m14873a(String str, String str2) {
        if (C6185a.m14890d() && !C6185a.m14887b().mo50765E() && !C6185a.m14887b().mo50766F()) {
            return str;
        }
        m14875b();
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50416a(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        C6294f1 f = C6235c0.m15085f(a, "reward");
        this.f13230b = C6235c0.m15087h(f, "reward_name");
        this.f13236h = C6235c0.m15083d(f, "reward_amount");
        this.f13234f = C6235c0.m15083d(f, "views_per_reward");
        this.f13233e = C6235c0.m15083d(f, "views_until_reward");
        this.f13239k = C6235c0.m15076b(a, "rewarded");
        this.f13231c = C6235c0.m15083d(a, "status");
        this.f13232d = C6235c0.m15083d(a, "type");
        this.f13235g = C6235c0.m15083d(a, "play_interval");
        this.f13229a = C6235c0.m15087h(a, "zone_id");
        boolean z = true;
        if (this.f13231c == 1) {
            z = false;
        }
        this.f13238j = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo50415a() {
        return this.f13237i;
    }
}
