package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.C10696a;
import com.yandex.metrica.C10725i;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C2782a;
import com.yandex.metrica.impl.p082ob.C3364q;
import com.yandex.metrica.impl.p082ob.C3424r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.j1 */
public class C3072j1 extends C1874B implements C2214K0 {

    /* renamed from: y */
    private static final C2252Kn<String> f8073y = new C2103Hn(new C2035Fn("Referral url"));

    /* renamed from: z */
    private static final Long f8074z = Long.valueOf(TimeUnit.SECONDS.toMillis(5));

    /* renamed from: p */
    private final C10696a f8075p;

    /* renamed from: q */
    private final C10725i f8076q;

    /* renamed from: r */
    private final C3035hi f8077r;

    /* renamed from: s */
    private C2782a f8078s;

    /* renamed from: t */
    private final C3558ul f8079t;

    /* renamed from: u */
    private final C3424r f8080u;

    /* renamed from: v */
    private final AtomicBoolean f8081v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C3112k3 f8082w;

    /* renamed from: x */
    private final C3083j7 f8083x;

    /* renamed from: com.yandex.metrica.impl.ob.j1$a */
    class C3073a implements C2782a.C2784b {

        /* renamed from: a */
        final /* synthetic */ ICommonExecutor f8084a;

        /* renamed from: b */
        final /* synthetic */ C2908e1 f8085b;

        /* renamed from: c */
        final /* synthetic */ C3681y2 f8086c;

        /* renamed from: d */
        final /* synthetic */ C3681y2 f8087d;

        /* renamed from: com.yandex.metrica.impl.ob.j1$a$a */
        class C3074a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C3607w6 f8089a;

            C3074a(C3607w6 w6Var) {
                this.f8089a = w6Var;
            }

            public void run() {
                C3072j1.this.mo15480a(this.f8089a);
                if (C3073a.this.f8085b.mo17475a(this.f8089a.f9369a.f5307f)) {
                    C3073a.this.f8086c.mo17699a().mo15480a(this.f8089a);
                }
                if (C3073a.this.f8085b.mo17476b(this.f8089a.f9369a.f5307f)) {
                    C3073a.this.f8087d.mo17699a().mo15480a(this.f8089a);
                }
            }
        }

        C3073a(ICommonExecutor iCommonExecutor, C2908e1 e1Var, C3681y2 y2Var, C3681y2 y2Var2) {
            this.f8084a = iCommonExecutor;
            this.f8085b = e1Var;
            this.f8086c = y2Var;
            this.f8087d = y2Var2;
        }

        /* renamed from: a */
        public void mo17134a() {
            this.f8084a.execute(new C3074a(C3072j1.this.f8082w.mo17774a()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j1$b */
    class C3075b implements C10696a.C10697a {
        C3075b() {
        }

        /* renamed from: a */
        public void mo17724a() {
            C3072j1 j1Var = C3072j1.this;
            j1Var.f5070i.mo16664a(j1Var.f5063b.mo18443a());
        }

        /* renamed from: b */
        public void mo17725b() {
            C3072j1 j1Var = C3072j1.this;
            j1Var.f5070i.mo16684b(j1Var.f5063b.mo18443a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j1$c */
    static class C3076c {
        C3076c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3558ul mo17726a(Context context, ICommonExecutor iCommonExecutor, C2830b9 b9Var, C3072j1 j1Var, C3035hi hiVar) {
            return new C3558ul(context, b9Var, j1Var, iCommonExecutor, hiVar.mo17678d());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C3072j1(android.content.Context r26, com.yandex.metrica.impl.p082ob.C1850A3 r27, com.yandex.metrica.C10725i r28, com.yandex.metrica.impl.p082ob.C2541T1 r29, com.yandex.metrica.impl.p082ob.C3083j7 r30, com.yandex.metrica.impl.p082ob.C3035hi r31, com.yandex.metrica.impl.p082ob.C3681y2 r32, com.yandex.metrica.impl.p082ob.C3681y2 r33, com.yandex.metrica.impl.p082ob.C2830b9 r34, com.yandex.metrica.impl.p082ob.C2410P r35, com.yandex.metrica.impl.p082ob.C1841A0 r36) {
        /*
            r25 = this;
            r2 = r28
            com.yandex.metrica.impl.ob.Q1 r5 = new com.yandex.metrica.impl.ob.Q1
            com.yandex.metrica.CounterConfiguration r0 = new com.yandex.metrica.CounterConfiguration
            com.yandex.metrica.CounterConfiguration$b r1 = com.yandex.metrica.CounterConfiguration.C10685b.MAIN
            r0.<init>(r2, r1)
            java.lang.String r1 = r2.userProfileID
            r3 = r27
            r5.<init>(r3, r0, r1)
            com.yandex.metrica.a r6 = new com.yandex.metrica.a
            java.lang.Integer r0 = r2.sessionTimeout
            if (r0 != 0) goto L_0x0021
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r3 = 10
            long r0 = r0.toMillis(r3)
            goto L_0x0026
        L_0x0021:
            int r0 = r0.intValue()
            long r0 = (long) r0
        L_0x0026:
            r6.<init>(r0)
            com.yandex.metrica.impl.ob.e1 r0 = new com.yandex.metrica.impl.ob.e1
            r8 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.bm r9 = r35.mo16436j()
            com.yandex.metrica.core.api.executors.ICommonExecutor r13 = r35.mo16430c()
            com.yandex.metrica.impl.ob.j1$c r0 = new com.yandex.metrica.impl.ob.j1$c
            r15 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.r r0 = new com.yandex.metrica.impl.ob.r
            r16 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.Zg r0 = new com.yandex.metrica.impl.ob.Zg
            r17 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.Yg r0 = new com.yandex.metrica.impl.ob.Yg
            r18 = r0
            java.lang.String r1 = r2.appVersion
            java.lang.String r3 = r2.f26869a
            r0.<init>(r1, r3)
            com.yandex.metrica.impl.ob.s6 r0 = new com.yandex.metrica.impl.ob.s6
            r19 = r0
            r14 = r36
            r0.<init>(r14)
            com.yandex.metrica.impl.ob.X6 r0 = new com.yandex.metrica.impl.ob.X6
            r20 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.S6 r0 = new com.yandex.metrica.impl.ob.S6
            r21 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.M6 r0 = new com.yandex.metrica.impl.ob.M6
            r22 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.K6 r0 = new com.yandex.metrica.impl.ob.K6
            r23 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.zg r24 = r35.mo16437k()
            r0 = r25
            r1 = r26
            r2 = r28
            r3 = r29
            r4 = r30
            r7 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3072j1.<init>(android.content.Context, com.yandex.metrica.impl.ob.A3, com.yandex.metrica.i, com.yandex.metrica.impl.ob.T1, com.yandex.metrica.impl.ob.j7, com.yandex.metrica.impl.ob.hi, com.yandex.metrica.impl.ob.y2, com.yandex.metrica.impl.ob.y2, com.yandex.metrica.impl.ob.b9, com.yandex.metrica.impl.ob.P, com.yandex.metrica.impl.ob.A0):void");
    }

    /* renamed from: h */
    private void m9775h() {
        this.f5070i.mo16664a(this.f5063b.mo18443a());
        this.f8075p.mo64722a(new C3075b(), f8074z.longValue());
    }

    /* renamed from: a */
    public void mo16698a(boolean z) {
    }

    /* renamed from: b */
    public void mo16060b(Activity activity) {
        if (this.f8080u.mo18141a(activity, C3424r.C3425a.PAUSED)) {
            String str = null;
            if (activity != null) {
                str = activity.getClass().getSimpleName();
            }
            mo15491d(str);
            this.f8075p.mo64721a();
            if (activity != null) {
                this.f8079t.mo18310a(activity);
            }
        }
    }

    /* renamed from: c */
    public void mo15490c(String str, String str2) {
        super.mo15490c(str, str2);
        this.f8083x.mo17734a(this.f5063b.f6507c.mo18387a());
    }

    /* renamed from: g */
    public final void mo17722g() {
        if (this.f8081v.compareAndSet(false, true)) {
            this.f8078s.mo17132c();
        }
    }

    /* renamed from: a */
    public void mo16059a(String str, boolean z) {
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15273i("App opened via deeplink: " + mo15495f(str));
        }
        this.f5070i.mo16671a(C3716z0.m11106a("open", str, z, this.f5064c), this.f5063b);
    }

    /* renamed from: b */
    public void mo16699b(boolean z) {
        this.f5063b.mo18444b().mo64613b(z);
    }

    /* renamed from: b */
    public void mo15734b(JSONObject jSONObject) {
        C2541T1 t1 = this.f5070i;
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        t1.mo16671a((C2851c0) new C2168J(jSONObject.toString(), "view_tree", C2788a1.EVENT_TYPE_VIEW_TREE.mo17139b(), 0, cmVar), this.f5063b);
    }

    /* renamed from: a */
    public void mo16058a(String str) {
        ((C2103Hn) f8073y).mo15517a(str);
        this.f5070i.mo16671a(C3716z0.m11106a("referral", str, false, this.f5064c), this.f5063b);
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15273i("Referral URL received: " + mo15495f(str));
        }
    }

    /* renamed from: a */
    public void mo16057a(C3364q.C3367c cVar) {
        if (cVar == C3364q.C3367c.WATCHING) {
            if (this.f5064c.isEnabled()) {
                this.f5064c.mo15273i("Enable activity auto tracking");
            }
        } else if (this.f5064c.isEnabled()) {
            C2875cm cmVar = this.f5064c;
            cmVar.mo15283w("Could not enable activity auto tracking. " + cVar.f8671a);
        }
    }

    /* renamed from: a */
    public void mo16054a(Activity activity) {
        if (this.f8080u.mo18141a(activity, C3424r.C3425a.RESUMED)) {
            String str = null;
            if (activity != null) {
                str = activity.getClass().getSimpleName();
            }
            mo15493e(str);
            this.f8075p.mo64723b();
            if (activity != null) {
                this.f8079t.mo18312b(activity);
            }
        }
    }

    /* renamed from: a */
    public void mo16697a(Location location) {
        this.f5063b.mo18444b().mo64608a(location);
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15265fi("Set location: %s", location);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C3072j1(android.content.Context r17, com.yandex.metrica.C10725i r18, com.yandex.metrica.impl.p082ob.C2541T1 r19, com.yandex.metrica.impl.p082ob.C3083j7 r20, com.yandex.metrica.impl.p082ob.C2445Q1 r21, com.yandex.metrica.C10696a r22, com.yandex.metrica.impl.p082ob.C3035hi r23, com.yandex.metrica.impl.p082ob.C2908e1 r24, com.yandex.metrica.impl.p082ob.C2848bm r25, com.yandex.metrica.impl.p082ob.C3681y2 r26, com.yandex.metrica.impl.p082ob.C3681y2 r27, com.yandex.metrica.impl.p082ob.C2830b9 r28, com.yandex.metrica.core.api.executors.ICommonExecutor r29, com.yandex.metrica.impl.p082ob.C1841A0 r30, com.yandex.metrica.impl.p082ob.C3072j1.C3076c r31, com.yandex.metrica.impl.p082ob.C3424r r32, com.yandex.metrica.impl.p082ob.C2772Zg r33, com.yandex.metrica.impl.p082ob.C2745Yg r34, com.yandex.metrica.impl.p082ob.C3470s6 r35, com.yandex.metrica.impl.p082ob.C2706X6 r36, com.yandex.metrica.impl.p082ob.C2510S6 r37, com.yandex.metrica.impl.p082ob.C2300M6 r38, com.yandex.metrica.impl.p082ob.C2232K6 r39, com.yandex.metrica.impl.p082ob.C3735zg r40) {
        /*
            r16 = this;
            r13 = r16
            r14 = r18
            r15 = r23
            com.yandex.metrica.rtm.wrapper.k r0 = r19.mo16683b()
            java.lang.String r1 = r14.apiKey
            r2 = 1
            r3 = r33
            com.yandex.metrica.rtm.wrapper.d r6 = r3.mo17112a(r0, r1, r2)
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r21
            r4 = r30
            r5 = r25
            r7 = r34
            r8 = r36
            r9 = r37
            r10 = r38
            r11 = r39
            r12 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r13.f8081v = r0
            com.yandex.metrica.impl.ob.k3 r0 = new com.yandex.metrica.impl.ob.k3
            r0.<init>()
            r13.f8082w = r0
            com.yandex.metrica.impl.ob.Q1 r0 = r13.f5063b
            com.yandex.metrica.impl.ob.ie r1 = r13.m9772a((com.yandex.metrica.C10725i) r14)
            r0.mo16500a((com.yandex.metrica.impl.p082ob.C3060ie) r1)
            r0 = r22
            r13.f8075p = r0
            r0 = r20
            r13.f8083x = r0
            r13.f8076q = r14
            r0 = r32
            r13.f8080u = r0
            r30 = r31
            r31 = r17
            r32 = r29
            r33 = r28
            r34 = r16
            r35 = r23
            com.yandex.metrica.impl.ob.ul r0 = r30.mo17726a(r31, r32, r33, r34, r35)
            r13.f8079t = r0
            r13.f8077r = r15
            r15.mo17671a((com.yandex.metrica.impl.p082ob.C3009gl) r0)
            java.lang.Boolean r0 = r14.nativeCrashReporting
            com.yandex.metrica.impl.ob.Q1 r1 = r13.f5063b
            r13.m9774a((java.lang.Boolean) r0, (com.yandex.metrica.impl.p082ob.C2445Q1) r1)
            r17.getApplicationContext()
            r23.mo17675b()
            com.yandex.metrica.impl.ob.Bg r0 = com.yandex.metrica.impl.p082ob.C1896Bg.f5122b
            r1 = r24
            r2 = r26
            r3 = r27
            r4 = r29
            com.yandex.metrica.impl.ob.a r0 = r13.m9771a(r4, r1, r2, r3)
            r13.f8078s = r0
            java.lang.Boolean r0 = r14.f26879k
            boolean r0 = com.yandex.metrica.impl.p082ob.C2814b.m9068a((java.lang.Boolean) r0)
            if (r0 == 0) goto L_0x0093
            r16.mo17722g()
        L_0x0093:
            r16.m9775h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3072j1.<init>(android.content.Context, com.yandex.metrica.i, com.yandex.metrica.impl.ob.T1, com.yandex.metrica.impl.ob.j7, com.yandex.metrica.impl.ob.Q1, com.yandex.metrica.a, com.yandex.metrica.impl.ob.hi, com.yandex.metrica.impl.ob.e1, com.yandex.metrica.impl.ob.bm, com.yandex.metrica.impl.ob.y2, com.yandex.metrica.impl.ob.y2, com.yandex.metrica.impl.ob.b9, com.yandex.metrica.core.api.executors.ICommonExecutor, com.yandex.metrica.impl.ob.A0, com.yandex.metrica.impl.ob.j1$c, com.yandex.metrica.impl.ob.r, com.yandex.metrica.impl.ob.Zg, com.yandex.metrica.impl.ob.Yg, com.yandex.metrica.impl.ob.s6, com.yandex.metrica.impl.ob.X6, com.yandex.metrica.impl.ob.S6, com.yandex.metrica.impl.ob.M6, com.yandex.metrica.impl.ob.K6, com.yandex.metrica.impl.ob.zg):void");
    }

    /* renamed from: a */
    private C2782a m9771a(ICommonExecutor iCommonExecutor, C2908e1 e1Var, C3681y2 y2Var, C3681y2 y2Var2) {
        return new C2782a(new C3073a(iCommonExecutor, e1Var, y2Var, y2Var2));
    }

    /* renamed from: a */
    public void mo15733a(JSONObject jSONObject) {
        C2541T1 t1 = this.f5070i;
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        t1.mo16671a((C2851c0) new C2168J(jSONObject.toString(), "view_tree", C2788a1.EVENT_TYPE_RAW_VIEW_TREE.mo17139b(), 0, cmVar), this.f5063b);
    }

    /* renamed from: a */
    public void mo16056a(C3166ll llVar, boolean z) {
        this.f8079t.mo18311a(llVar, z);
    }

    /* renamed from: a */
    public void mo16055a(C1939D2 d2) {
        d2.mo15604a(this.f5064c);
    }

    /* renamed from: a */
    private void m9774a(Boolean bool, C2445Q1 q1) {
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        boolean booleanValue = bool.booleanValue();
        this.f8083x.mo17735a(booleanValue, q1.mo18444b().mo64607a(), q1.f6507c.mo18387a());
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15265fi("Set report native crashes enabled: %b", Boolean.valueOf(booleanValue));
        }
    }

    /* renamed from: a */
    private C3060ie m9772a(C10725i iVar) {
        PreloadInfo preloadInfo = iVar.preloadInfo;
        C2875cm cmVar = this.f5064c;
        Boolean bool = iVar.f26877i;
        Boolean bool2 = Boolean.FALSE;
        if (bool == null) {
            bool = bool2;
        }
        return new C3060ie(preloadInfo, cmVar, bool.booleanValue());
    }
}
