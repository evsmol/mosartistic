package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.p082ob.C1842A1;
import com.yandex.metrica.impl.p082ob.C3356pi;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.r1 */
public class C3427r1 implements C3334p1 {

    /* renamed from: A */
    private final C2909e2 f8968A;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3356pi f8969a;

    /* renamed from: b */
    private boolean f8970b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f8971c;

    /* renamed from: d */
    private volatile MetricaService.C10691d f8972d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1997Eh f8973e;

    /* renamed from: f */
    private C2698X0 f8974f;

    /* renamed from: g */
    private final C1877B0 f8975g;

    /* renamed from: h */
    private C3079j4 f8976h;

    /* renamed from: i */
    private final C1842A1 f8977i;

    /* renamed from: j */
    private C2660Vc f8978j;

    /* renamed from: k */
    private C2917e9 f8979k;

    /* renamed from: l */
    private C2255L1 f8980l;

    /* renamed from: m */
    private final C1972E0 f8981m;

    /* renamed from: n */
    private final C3728za f8982n;

    /* renamed from: o */
    private final C3141l3 f8983o;

    /* renamed from: p */
    private C2735Y6 f8984p;

    /* renamed from: q */
    private final C3310o6 f8985q;

    /* renamed from: r */
    private final C1884B7 f8986r;

    /* renamed from: s */
    private final C3598w f8987s;

    /* renamed from: t */
    private final ICommonExecutor f8988t;

    /* renamed from: u */
    private final C3680y1 f8989u;

    /* renamed from: v */
    private C3240mm<String> f8990v;

    /* renamed from: w */
    private C3240mm<File> f8991w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C2915e7<String> f8992x;

    /* renamed from: y */
    private ICommonExecutor f8993y;

    /* renamed from: z */
    private C2292M1 f8994z;

    /* renamed from: com.yandex.metrica.impl.ob.r1$a */
    class C3428a implements C3240mm<File> {
        C3428a() {
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            C3427r1.this.mo18146a((File) obj);
        }
    }

    public C3427r1(Context context, MetricaService.C10691d dVar) {
        this(context, dVar, new C3339p4(context));
    }

    /* renamed from: d */
    static void m10587d(C3427r1 r1Var) {
        if (r1Var.f8969a != null) {
            C2007F0.m7154g().mo15752o().mo17463a(r1Var.f8969a);
        }
    }

    /* renamed from: f */
    static void m10589f(C3427r1 r1Var) {
        r1Var.f8973e.mo15726b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C2980g1.m9593a(this.f8971c).mo17620b(configuration);
    }

    public void reportData(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f8974f.mo17007a();
        this.f8980l.mo16108a(C2851c0.m9215a(bundle), bundle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C3427r1(android.content.Context r18, com.yandex.metrica.MetricaService.C10691d r19, com.yandex.metrica.impl.p082ob.C3339p4 r20) {
        /*
            r17 = this;
            r10 = r18
            r0 = r17
            r1 = r18
            r2 = r19
            com.yandex.metrica.impl.ob.j4 r4 = new com.yandex.metrica.impl.ob.j4
            r3 = r4
            r5 = r20
            r4.<init>(r10, r5)
            com.yandex.metrica.impl.ob.A1 r5 = new com.yandex.metrica.impl.ob.A1
            r4 = r5
            r5.<init>()
            com.yandex.metrica.impl.ob.B0 r6 = new com.yandex.metrica.impl.ob.B0
            r5 = r6
            r6.<init>()
            com.yandex.metrica.impl.ob.E0 r7 = new com.yandex.metrica.impl.ob.E0
            r6 = r7
            r7.<init>()
            com.yandex.metrica.impl.ob.za r8 = new com.yandex.metrica.impl.ob.za
            r7 = r8
            r8.<init>(r10)
            com.yandex.metrica.impl.ob.l3 r8 = com.yandex.metrica.impl.p082ob.C3141l3.m9936a()
            com.yandex.metrica.impl.ob.Eh r11 = new com.yandex.metrica.impl.ob.Eh
            r9 = r11
            r11.<init>(r10)
            com.yandex.metrica.impl.ob.F0 r10 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.w r10 = r10.mo15740b()
            com.yandex.metrica.impl.ob.F0 r11 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.f1 r11 = r11.mo15745h()
            com.yandex.metrica.impl.ob.o6 r11 = r11.mo17565c()
            com.yandex.metrica.impl.ob.B7 r12 = com.yandex.metrica.impl.p082ob.C1884B7.m6911a()
            com.yandex.metrica.impl.ob.F0 r13 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.Pm r13 = r13.mo15754q()
            com.yandex.metrica.core.api.executors.ICommonExecutor r13 = r13.mo16492e()
            com.yandex.metrica.impl.ob.F0 r14 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.Pm r14 = r14.mo15754q()
            com.yandex.metrica.core.api.executors.ICommonExecutor r14 = r14.mo16486a()
            com.yandex.metrica.impl.ob.y1 r16 = new com.yandex.metrica.impl.ob.y1
            r15 = r16
            r16.<init>()
            com.yandex.metrica.impl.ob.F0 r16 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.e2 r16 = r16.mo15751n()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3427r1.<init>(android.content.Context, com.yandex.metrica.MetricaService$d, com.yandex.metrica.impl.ob.p4):void");
    }

    /* renamed from: a */
    public void mo15525a() {
        if (!this.f8970b) {
            this.f8979k = C2007F0.m7154g().mo15756s();
            this.f8981m.mo15645a(this.f8971c);
            C2007F0.m7154g().mo15761x();
            C2974fm.m9584c().mo17616d();
            this.f8978j = new C2660Vc(C3580vc.m10884a(this.f8971c), C2081H2.m7295a(this.f8971c), this.f8979k);
            this.f8969a = new C3356pi.C3358b(this.f8971c).mo18044a();
            C2007F0.m7154g().mo15757t().getClass();
            this.f8977i.mo15413b((C1842A1.C1847e) new C3564v1(this));
            this.f8977i.mo15415c((C1842A1.C1847e) new C3602w1(this));
            this.f8977i.mo15411a((C1842A1.C1847e) new C3640x1(this));
            this.f8983o.mo17794a(this, C3385q3.class, C3336p3.m10282a(new C3491t1(this)).mo17935a(new C3463s1(this)).mo17936a());
            C2007F0.m7154g().mo15755r().mo18395a(this.f8971c, this.f8969a);
            this.f8974f = new C2698X0(this.f8979k, this.f8969a.mo17988t(), new SystemTimeProvider(), new C3641x2(), C3322oh.m10248a());
            C3356pi piVar = this.f8969a;
            if (piVar != null) {
                this.f8973e.mo15727b(piVar);
            }
            m10579a(this.f8969a);
            C3680y1 y1Var = this.f8989u;
            Context context = this.f8971c;
            C3079j4 j4Var = this.f8976h;
            y1Var.getClass();
            this.f8980l = new C2255L1(context, j4Var, C2007F0.m7154g().mo15754q().mo16492e(), new C1877B0());
            YandexMetrica.getReporter(this.f8971c, "20799a27-fa80-4b36-b2db-0f8141f24180");
            File a = this.f8975g.mo15519a(this.f8971c, "appmetrica_crashes");
            if (a != null) {
                C3680y1 y1Var2 = this.f8989u;
                C3240mm<File> mmVar = this.f8991w;
                y1Var2.getClass();
                this.f8984p = new C2735Y6(a, mmVar);
                this.f8988t.execute(new C3529u6(this.f8971c, a, this.f8991w));
                this.f8984p.mo17077a();
            }
            if (C1848A2.m6808a(21)) {
                C3680y1 y1Var3 = this.f8989u;
                C2255L1 l1 = this.f8980l;
                y1Var3.getClass();
                this.f8992x = new C3497t7(new C3571v7(l1));
                this.f8990v = new C3524u1(this);
                if (this.f8986r.mo15549b()) {
                    this.f8992x.mo17497a();
                    this.f8993y.executeDelayed(new C2017F7(), 1, TimeUnit.MINUTES);
                }
            }
            C2007F0.m7154g().mo15744f().mo17710a(this.f8969a);
            this.f8970b = true;
        } else {
            C2980g1.m9593a(this.f8971c).mo17620b(this.f8971c.getResources().getConfiguration());
        }
        if (C1848A2.m6808a(21)) {
            this.f8985q.mo17909a(this.f8990v);
        }
    }

    /* renamed from: b */
    public void mo15412b(Intent intent) {
        String str;
        this.f8977i.mo15412b(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data == null) {
                str = null;
            } else {
                str = data.getEncodedAuthority();
            }
            if ("com.yandex.metrica.IMetricaService".equals(action) && data != null && data.getPath().equals("/client")) {
                int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
                this.f8976h.mo17729a(str, parseInt, data.getQueryParameter("psid"));
                this.f8987s.mo18346a(parseInt);
            }
        }
    }

    /* renamed from: c */
    public void mo15414c(Intent intent) {
        this.f8977i.mo15414c(intent);
    }

    /* renamed from: c */
    private Integer m10586c(Bundle bundle) {
        C1850A3 a3;
        bundle.setClassLoader(C1850A3.class.getClassLoader());
        String str = C1850A3.f5024c;
        try {
            a3 = (C1850A3) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            a3 = null;
        }
        if (a3 == null) {
            return null;
        }
        return a3.mo15431g();
    }

    /* renamed from: b */
    public void mo15528b() {
        if (C1848A2.m6808a(21)) {
            this.f8985q.mo17910b(this.f8990v);
        }
    }

    /* renamed from: b */
    public void mo17930b(Bundle bundle) {
        Integer c = m10586c(bundle);
        if (c != null) {
            this.f8987s.mo18349c(c.intValue());
        }
    }

    C3427r1(Context context, MetricaService.C10691d dVar, C3079j4 j4Var, C1842A1 a1, C1877B0 b0, C1972E0 e0, C3728za zaVar, C3141l3 l3Var, C1997Eh eh, C3598w wVar, C3310o6 o6Var, C1884B7 b7, ICommonExecutor iCommonExecutor, ICommonExecutor iCommonExecutor2, C3680y1 y1Var, C2909e2 e2Var) {
        this.f8970b = false;
        this.f8991w = new C3428a();
        this.f8971c = context;
        this.f8972d = dVar;
        this.f8976h = j4Var;
        this.f8977i = a1;
        this.f8975g = b0;
        this.f8981m = e0;
        this.f8982n = zaVar;
        this.f8983o = l3Var;
        this.f8973e = eh;
        this.f8987s = wVar;
        this.f8988t = iCommonExecutor;
        this.f8993y = iCommonExecutor2;
        this.f8989u = y1Var;
        this.f8985q = o6Var;
        this.f8986r = b7;
        this.f8994z = new C2292M1((C3334p1) this, context);
        this.f8968A = e2Var;
    }

    /* renamed from: b */
    private void m10583b(Intent intent, int i) {
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            boolean z = true;
            if (!(intent.getData() == null)) {
                Bundle extras = intent.getExtras();
                C3719z3 z3Var = new C3719z3(extras);
                if (!C3719z3.m11119a(z3Var, this.f8971c)) {
                    C2851c0 a = C2851c0.m9215a(extras);
                    boolean z2 = a.f7524a == null;
                    if (C2788a1.EVENT_TYPE_UNDEFINED.mo17139b() != a.f7528e) {
                        z = false;
                    }
                    if (!z && !z2) {
                        try {
                            this.f8980l.mo16109a(C3049i4.m9730a(z3Var), a, new C1941D3(z3Var));
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        this.f8972d.mo64676a(i);
    }

    /* renamed from: b */
    static void m10584b(C3427r1 r1Var, C3356pi piVar) {
        C2660Vc vc = r1Var.f8978j;
        if (vc != null) {
            vc.mo16974a(piVar);
        }
    }

    /* renamed from: a */
    public void mo15526a(Intent intent, int i) {
        m10583b(intent, i);
    }

    /* renamed from: a */
    public void mo15527a(Intent intent, int i, int i2) {
        m10583b(intent, i2);
    }

    /* renamed from: a */
    public void mo15410a(Intent intent) {
        this.f8977i.mo15410a(intent);
    }

    /* renamed from: a */
    static void m10581a(C3427r1 r1Var, C3356pi piVar) {
        r1Var.f8969a = piVar;
        C2660Vc vc = r1Var.f8978j;
        if (vc != null) {
            vc.mo16974a(piVar);
        }
        r1Var.f8974f.mo17008a(r1Var.f8969a.mo17988t());
        r1Var.f8982n.mo18452a(piVar);
        r1Var.f8973e.mo15727b(piVar);
    }

    /* renamed from: a */
    static void m10580a(C3427r1 r1Var, Intent intent) {
        r1Var.f8973e.mo15723a();
        r1Var.f8968A.mo17478a(C2572Tl.m8544f(intent.getStringExtra("screen_size")));
    }

    @Deprecated
    /* renamed from: a */
    public void mo17929a(String str, int i, String str2, Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f8980l.mo16108a(new C2851c0(str2, str, i), bundle);
    }

    /* renamed from: a */
    public void mo17926a(int i, Bundle bundle) {
        this.f8994z.mo16237a(i, bundle);
    }

    /* renamed from: a */
    public void mo17927a(Bundle bundle) {
        Integer c = m10586c(bundle);
        if (c != null) {
            this.f8987s.mo18347b(c.intValue());
        }
    }

    /* renamed from: a */
    public void mo17928a(MetricaService.C10691d dVar) {
        this.f8972d = dVar;
    }

    /* renamed from: a */
    public void mo18146a(File file) {
        this.f8980l.mo16111a(file);
    }

    /* renamed from: a */
    private void m10579a(C3356pi piVar) {
        C2660Vc vc = this.f8978j;
        if (vc != null) {
            vc.mo16974a(piVar);
        }
    }
}
