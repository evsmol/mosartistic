package com.criteo.publisher;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.criteo.publisher.C1321s;
import com.criteo.publisher.advancednative.C1026b;
import com.criteo.publisher.advancednative.C1030e;
import com.criteo.publisher.advancednative.C1032f;
import com.criteo.publisher.advancednative.C1036g;
import com.criteo.publisher.advancednative.C1039h;
import com.criteo.publisher.advancednative.C1040i;
import com.criteo.publisher.advancednative.C1045l;
import com.criteo.publisher.advancednative.C1048o;
import com.criteo.publisher.advancednative.C1050q;
import com.criteo.publisher.advancednative.ImageLoader;
import com.criteo.publisher.advancednative.RendererHelper;
import com.criteo.publisher.context.C1063a;
import com.criteo.publisher.context.C1065b;
import com.criteo.publisher.context.C1068d;
import com.criteo.publisher.logging.C1190c;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.logging.C1198i;
import com.criteo.publisher.logging.C1203j;
import com.criteo.publisher.logging.C1205k;
import com.criteo.publisher.logging.C1206l;
import com.criteo.publisher.logging.C1208m;
import com.criteo.publisher.logging.C1209n;
import com.criteo.publisher.model.C1253g;
import com.criteo.publisher.model.C1269p;
import com.criteo.publisher.model.C1276t;
import com.criteo.publisher.model.C1278u;
import com.criteo.publisher.model.C1283x;
import com.criteo.publisher.p058a.C1017a;
import com.criteo.publisher.p059a0.C1019b;
import com.criteo.publisher.p060b0.C1054b;
import com.criteo.publisher.p061c0.C1058a;
import com.criteo.publisher.p061c0.C1059b;
import com.criteo.publisher.p061c0.C1060c;
import com.criteo.publisher.p061c0.C1061d;
import com.criteo.publisher.p062d0.C1070a;
import com.criteo.publisher.p063e0.C1073a;
import com.criteo.publisher.p063e0.C1076c;
import com.criteo.publisher.p063e0.C1077d;
import com.criteo.publisher.p064f0.C1084a0;
import com.criteo.publisher.p064f0.C1086b0;
import com.criteo.publisher.p064f0.C1102k;
import com.criteo.publisher.p064f0.C1103l;
import com.criteo.publisher.p064f0.C1117q;
import com.criteo.publisher.p064f0.C1118r;
import com.criteo.publisher.p064f0.C1120s;
import com.criteo.publisher.p064f0.C1124u;
import com.criteo.publisher.p064f0.C1126v;
import com.criteo.publisher.p064f0.C1127w;
import com.criteo.publisher.p064f0.C1128x;
import com.criteo.publisher.p064f0.C1131z;
import com.criteo.publisher.p065g0.C1134a;
import com.criteo.publisher.p066h0.C1137b;
import com.criteo.publisher.p066h0.C1142c;
import com.criteo.publisher.p066h0.C1143d;
import com.criteo.publisher.p066h0.C1144e;
import com.criteo.publisher.p066h0.C1145f;
import com.criteo.publisher.p067i0.C1148b;
import com.criteo.publisher.p067i0.C1150c;
import com.criteo.publisher.p068j0.C1154a;
import com.criteo.publisher.p069k0.C1158b;
import com.criteo.publisher.p069k0.C1163e;
import com.criteo.publisher.p069k0.C1166g;
import com.criteo.publisher.p070l0.C1170a;
import com.criteo.publisher.p070l0.C1173c;
import com.criteo.publisher.p074n0.C1289b;
import com.criteo.publisher.p074n0.C1296c;
import com.criteo.publisher.p074n0.C1298e;
import com.criteo.publisher.p074n0.C1300g;
import com.criteo.publisher.p074n0.C1307k;
import com.criteo.publisher.p074n0.C1308l;
import com.criteo.publisher.p074n0.C1309m;
import com.criteo.publisher.p074n0.C1315s;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function0;

/* renamed from: com.criteo.publisher.s */
/* compiled from: DependencyProvider */
public class C1321s {

    /* renamed from: d */
    protected static C1321s f4042d;

    /* renamed from: a */
    private final ConcurrentMap<Class<?>, Object> f4043a = new ConcurrentHashMap();

    /* renamed from: b */
    private Application f4044b;

    /* renamed from: c */
    private String f4045c;

    /* renamed from: com.criteo.publisher.s$a */
    /* compiled from: DependencyProvider */
    public interface C1322a<T> {
        /* renamed from: a */
        T mo2934a();
    }

    protected C1321s() {
    }

    /* renamed from: c */
    public static synchronized C1321s m5824c() {
        C1321s sVar;
        synchronized (C1321s.class) {
            if (f4042d == null) {
                f4042d = new C1321s();
            }
            sVar = f4042d;
        }
        return sVar;
    }

    /* renamed from: a */
    public void mo3690a(Application application) {
        this.f4044b = application;
        m5821a();
    }

    /* renamed from: a */
    public void mo3691a(String str) {
        this.f4045c = str;
        m5823b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3697d() {
        try {
            m5824c().m5821a();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m5821a() {
        if (this.f4044b == null) {
            throw new C1320q("Application reference is required");
        }
    }

    /* renamed from: b */
    private void m5823b() {
        if (C1315s.m5789a((CharSequence) this.f4045c)) {
            throw new C1320q("Criteo Publisher Id is required");
        }
    }

    /* renamed from: h0 */
    public Application mo3706h0() {
        m5821a();
        return this.f4044b;
    }

    /* renamed from: v0 */
    public Context mo3726v0() {
        return mo3706h0().getApplicationContext();
    }

    /* renamed from: x0 */
    public String mo3728x0() {
        m5823b();
        return this.f4045c;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ C1166g m5806M() {
        return new C1166g(mo3716m0(), mo3670H0());
    }

    /* renamed from: S0 */
    public C1166g mo3681S0() {
        return (C1166g) mo3689a(C1166g.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5806M();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ C1289b m5827g() {
        return new C1289b(mo3726v0(), mo3707h1(), mo3699d1());
    }

    /* renamed from: d0 */
    public C1289b mo3698d0() {
        return (C1289b) mo3689a(C1289b.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5827g();
            }
        });
    }

    /* renamed from: d1 */
    public C1289b.C1295f mo3699d1() {
        return (C1289b.C1295f) mo3689a(C1289b.C1295f.class, $$Lambda$8ZjxTxX1GyqWafpUJMGnT9oLaKk.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ C1296c m5828h() {
        return new C1296c(mo3726v0(), mo3663A0());
    }

    /* renamed from: e0 */
    public C1296c mo3700e0() {
        return (C1296c) mo3689a(C1296c.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5828h();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ C1307k m5843w() {
        return new C1307k(mo3726v0());
    }

    /* renamed from: A0 */
    public C1307k mo3663A0() {
        return (C1307k) mo3689a(C1307k.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5843w();
            }
        });
    }

    /* renamed from: h1 */
    public Executor mo3707h1() {
        return (Executor) mo3689a(ThreadPoolExecutor.class, new C1077d());
    }

    /* renamed from: e1 */
    public ScheduledExecutorService mo3701e1() {
        return (ScheduledExecutorService) mo3689a(ScheduledExecutorService.class, $$Lambda$S13P7s06haLcYyF5gJwjIbzDzMs.INSTANCE);
    }

    /* renamed from: c1 */
    public C1076c mo3696c1() {
        return (C1076c) mo3689a(C1076c.class, $$Lambda$NrTtTT899C2gM4uo0ZvSWDcUge0.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ C1276t m5835o() {
        return new C1276t(mo3705g1(), mo3670H0());
    }

    /* renamed from: q0 */
    public C1276t mo3721q0() {
        return (C1276t) mo3689a(C1276t.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5835o();
            }
        });
    }

    /* renamed from: p0 */
    public C1146i mo3720p0() {
        return (C1146i) mo3689a(C1146i.class, $$Lambda$SsIlMVEh9NAYjOat7cN8vUa6_8.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ C1173c m5819Z() {
        return new C1173c(mo3726v0());
    }

    /* renamed from: l1 */
    public C1173c mo3715l1() {
        return (C1173c) mo3689a(C1173c.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5819Z();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ C1071e m5832l() {
        return new C1071e(new C1070a(mo3663A0()), mo3721q0(), mo3720p0(), mo3695c0(), mo3714l0(), mo3671I0(), mo3710j0(), mo3677O0(), mo3692a1(), mo3723s0());
    }

    /* renamed from: k0 */
    public C1071e mo3712k0() {
        return (C1071e) mo3689a(C1071e.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5832l();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ C1278u m5842v() {
        return new C1278u(mo3726v0(), mo3696c1());
    }

    /* renamed from: z0 */
    public C1278u mo3730z0() {
        return (C1278u) mo3689a(C1278u.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5842v();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ C1253g m5826f() {
        return new C1253g(mo3663A0(), mo3668F0());
    }

    /* renamed from: c0 */
    public C1253g mo3695c0() {
        return (C1253g) mo3689a(C1253g.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5826f();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ C1017a m5829i() {
        return new C1017a(mo3726v0(), mo3698d0(), mo3720p0(), mo3681S0(), mo3715l1(), mo3730z0(), mo3707h1());
    }

    /* renamed from: f0 */
    public C1017a mo3702f0() {
        return (C1017a) mo3689a(C1017a.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5829i();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ C1298e m5830j() {
        return new C1298e(mo3702f0(), mo3712k0());
    }

    /* renamed from: g0 */
    public C1298e mo3704g0() {
        return (C1298e) mo3689a(C1298e.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5830j();
            }
        });
    }

    /* renamed from: m0 */
    public C1300g mo3716m0() {
        return (C1300g) mo3689a(C1300g.class, $$Lambda$moOTksrh3pVP2CBY8LhRS9RXw.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ C1269p m5834n() {
        return new C1269p(mo3726v0(), mo3728x0(), mo3730z0(), mo3698d0(), mo3715l1(), mo3711j1(), mo3716m0(), mo3668F0(), mo3727w0(), mo3713k1());
    }

    /* renamed from: n0 */
    public C1269p mo3718n0() {
        return (C1269p) mo3689a(C1269p.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5834n();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ C1061d m5818Y() {
        return new C1061d(mo3720p0());
    }

    /* renamed from: j1 */
    public C1061d mo3711j1() {
        return (C1061d) mo3689a(C1061d.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5818Y();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ C1283x m5808O() {
        return new C1283x(mo3726v0(), mo3728x0(), mo3716m0(), mo3668F0(), mo3698d0());
    }

    /* renamed from: V0 */
    public C1283x mo3684V0() {
        return (C1283x) mo3689a(C1283x.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5808O();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ C1158b m5833m() {
        return new C1158b(mo3718n0(), mo3684V0(), mo3720p0(), mo3681S0(), mo3707h1());
    }

    /* renamed from: l0 */
    public C1158b mo3714l0() {
        return (C1158b) mo3689a(C1158b.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5833m();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ C1163e m5797D() {
        return new C1163e(mo3681S0(), mo3718n0(), mo3720p0(), mo3707h1(), mo3701e1(), mo3721q0());
    }

    /* renamed from: I0 */
    public C1163e mo3671I0() {
        return (C1163e) mo3689a(C1163e.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5797D();
            }
        });
    }

    /* renamed from: j0 */
    public C1058a mo3710j0() {
        return (C1058a) mo3689a(C1058a.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5831k();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ C1058a m5831k() {
        C1059b bVar = new C1059b();
        bVar.mo3077a((C1058a) new C1060c(mo3692a1()));
        if (Build.VERSION.SDK_INT >= 17) {
            bVar.mo3077a((C1058a) new C1103l(mo3674L0(), mo3678P0(), mo3720p0(), mo3721q0(), mo3723s0(), mo3707h1()));
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ C1045l m5804K() {
        return new C1045l(mo3717m1(), new C1040i(mo3681S0(), mo3707h1(), mo3696c1()), mo3719o0(), new C1032f(mo3683U0(), mo3709i1(), mo3696c1()), mo3693b0(), mo3694b1());
    }

    /* renamed from: Q0 */
    public C1045l mo3679Q0() {
        return (C1045l) mo3689a(C1045l.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5804K();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public static /* synthetic */ C1050q m5822a0() {
        return new C1050q(new C1048o());
    }

    /* renamed from: m1 */
    public C1050q mo3717m1() {
        return (C1050q) mo3689a(C1050q.class, $$Lambda$s$yR2_9hKMFM3YQqzNRwlCyNgQTw.INSTANCE);
    }

    /* renamed from: o0 */
    public C1030e mo3719o0() {
        return (C1030e) mo3689a(C1030e.class, $$Lambda$WnlEGEyMdvvPQomtgtP1k26vUc4.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ C1054b m5807N() {
        return new C1054b(mo3726v0());
    }

    /* renamed from: U0 */
    public C1054b mo3683U0() {
        return (C1054b) mo3689a(C1054b.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5807N();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ C1026b m5825e() {
        return new C1026b(mo3716m0(), mo3700e0());
    }

    /* renamed from: b0 */
    public C1026b mo3693b0() {
        return (C1026b) mo3689a(C1026b.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5825e();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ Picasso m5805L() {
        return new Picasso.Builder(mo3726v0()).build();
    }

    /* renamed from: R0 */
    public Picasso mo3680R0() {
        return (Picasso) mo3689a(Picasso.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5805L();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ ImageLoader m5841u() {
        return new C1036g(mo3680R0(), mo3708i0());
    }

    /* renamed from: y0 */
    public ImageLoader mo3729y0() {
        return (ImageLoader) mo3689a(ImageLoader.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5841u();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ C1039h m5846z() {
        return new C1039h(mo3729y0());
    }

    /* renamed from: D0 */
    public C1039h mo3666D0() {
        return (C1039h) mo3689a(C1039h.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5846z();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ RendererHelper m5814U() {
        return new RendererHelper(mo3666D0(), mo3696c1());
    }

    /* renamed from: b1 */
    public RendererHelper mo3694b1() {
        return (RendererHelper) mo3689a(RendererHelper.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5814U();
            }
        });
    }

    /* renamed from: i0 */
    public C1073a mo3708i0() {
        return (C1073a) mo3689a(C1073a.class, $$Lambda$2yKR28BC8QuBINxy9Jm2OejaU.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ SharedPreferences m5816W() {
        return mo3726v0().getSharedPreferences("com.criteo.publisher.sdkSharedPreferences", 0);
    }

    /* renamed from: g1 */
    public SharedPreferences mo3705g1() {
        return (SharedPreferences) mo3689a(SharedPreferences.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5816W();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ C1150c m5794A() {
        return new C1150c(mo3705g1(), mo3667E0());
    }

    /* renamed from: F0 */
    public C1150c mo3668F0() {
        return (C1150c) mo3689a(C1150c.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5794A();
            }
        });
    }

    /* renamed from: E0 */
    public C1148b mo3667E0() {
        return (C1148b) mo3689a(C1148b.class, $$Lambda$LJ__joS73orG6Xal7XNNpDa73UA.INSTANCE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T> T mo3689a(Class<T> cls, C1322a<T> aVar) {
        ConcurrentMap<Class<?>, Object> concurrentMap = this.f4043a;
        Objects.requireNonNull(aVar);
        return C1309m.m5776a(concurrentMap, cls, new Function0() {
            public final Object invoke() {
                return C1321s.C1322a.this.mo2934a();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ C1152j m5839s() {
        return new C1152j(mo3712k0(), mo3720p0(), mo3696c1());
    }

    /* renamed from: u0 */
    public C1152j mo3725u0() {
        return (C1152j) mo3689a(C1152j.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5839s();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ C1142c m5845y() {
        return new C1142c(Arrays.asList(new C1143d[]{new C1144e(), new C1137b(mo3700e0(), mo3663A0()), new C1145f()}), mo3668F0());
    }

    /* renamed from: C0 */
    public C1142c mo3665C0() {
        return (C1142c) mo3689a(C1142c.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5845y();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ C1154a m5795B() {
        return new C1154a(mo3726v0(), mo3709i1());
    }

    /* renamed from: G0 */
    public C1154a mo3669G0() {
        return (C1154a) mo3689a(C1154a.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5795B();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ C1019b m5817X() {
        return new C1019b(mo3726v0());
    }

    /* renamed from: i1 */
    public C1019b mo3709i1() {
        return (C1019b) mo3689a(C1019b.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5817X();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ C1127w m5802I() {
        return new C1127w(mo3675M0(), mo3681S0(), mo3716m0(), mo3721q0(), mo3707h1());
    }

    /* renamed from: O0 */
    public C1127w mo3677O0() {
        return (C1127w) mo3689a(C1127w.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5802I();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ C1128x m5803J() {
        return new C1128x(mo3675M0());
    }

    /* renamed from: P0 */
    public C1128x mo3678P0() {
        return (C1128x) mo3689a(C1128x.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5803J();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ C1124u m5800G() {
        return new C1124u.C1125a(m5820a(mo3676N0()));
    }

    /* renamed from: M0 */
    public C1124u mo3675M0() {
        return (C1124u) mo3689a(C1124u.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5800G();
            }
        });
    }

    /* renamed from: a */
    private <T> C1102k<T> m5820a(C1084a0<T> a0Var) {
        return new C1086b0(new C1131z(mo3726v0(), mo3670H0(), a0Var), a0Var).mo2934a();
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ C1126v m5801H() {
        return new C1126v(mo3716m0());
    }

    /* renamed from: N0 */
    public C1126v mo3676N0() {
        return (C1126v) mo3689a(C1126v.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5801H();
            }
        });
    }

    /* renamed from: L0 */
    public C1118r mo3674L0() {
        return (C1118r) mo3689a(C1118r.class, new C1120s(mo3726v0(), mo3673K0(), mo3716m0()));
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ C1117q m5799F() {
        return new C1117q(mo3670H0());
    }

    /* renamed from: K0 */
    public C1117q mo3673K0() {
        return (C1117q) mo3689a(C1117q.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5799F();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ C1308l m5796C() {
        return new C1308l(mo3664B0());
    }

    /* renamed from: H0 */
    public C1308l mo3670H0() {
        return (C1308l) mo3689a(C1308l.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5796C();
            }
        });
    }

    /* renamed from: B0 */
    public Gson mo3664B0() {
        return (Gson) mo3689a(Gson.class, $$Lambda$s$zQMrgJNlFRpL9E_PwssipD0kMEs.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ C1197h m5798E() {
        return new C1197h(Arrays.asList(new C1134a[]{new C1134a("ConsoleHandler", new Function0() {
            public final Object invoke() {
                return C1321s.this.mo3724t0();
            }
        }), new C1134a("RemoteHandler", new Function0() {
            public final Object invoke() {
                return C1321s.this.mo3685W0();
            }
        })}));
    }

    /* renamed from: J0 */
    public C1197h mo3672J0() {
        return (C1197h) mo3689a(C1197h.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5798E();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ C1190c m5838r() {
        return new C1190c(mo3716m0());
    }

    /* renamed from: t0 */
    public C1190c mo3724t0() {
        return (C1190c) mo3689a(C1190c.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5838r();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ C1065b m5840t() {
        return new C1065b(mo3726v0(), mo3722r0(), mo3700e0(), mo3703f1());
    }

    /* renamed from: w0 */
    public C1065b mo3727w0() {
        return (C1065b) mo3689a(C1065b.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5840t();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ C1063a m5836p() {
        return new C1063a(mo3726v0());
    }

    /* renamed from: r0 */
    public C1063a mo3722r0() {
        return (C1063a) mo3689a(C1063a.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5836p();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ C1333z m5815V() {
        return new C1333z(mo3720p0(), mo3711j1());
    }

    /* renamed from: f1 */
    public C1333z mo3703f1() {
        return (C1333z) mo3689a(C1333z.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5815V();
            }
        });
    }

    /* renamed from: k1 */
    public C1068d mo3713k1() {
        return (C1068d) mo3689a(C1068d.class, $$Lambda$PXRbrM5kYcbLI6WrWwr8YqzxutI.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ C1206l m5811R() {
        return new C1206l.C1207a(m5820a(mo3688Z0()));
    }

    /* renamed from: Y0 */
    public C1206l mo3687Y0() {
        return (C1206l) mo3689a(C1206l.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5811R();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ C1208m m5812S() {
        return new C1208m(mo3716m0());
    }

    /* renamed from: Z0 */
    public C1208m mo3688Z0() {
        return (C1208m) mo3689a(C1208m.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5812S();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ C1205k m5810Q() {
        return new C1205k(mo3716m0(), mo3726v0(), mo3698d0(), mo3703f1(), mo3668F0(), mo3720p0(), mo3682T0());
    }

    /* renamed from: X0 */
    public C1205k mo3686X0() {
        return (C1205k) mo3689a(C1205k.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5810Q();
            }
        });
    }

    /* renamed from: T0 */
    public C1198i mo3682T0() {
        return (C1198i) mo3689a(C1198i.class, $$Lambda$HCplnjlTIZGtwZOaw4LF45lghNc.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ C1203j m5809P() {
        return new C1203j(mo3686X0(), mo3687Y0(), mo3721q0(), mo3707h1(), mo3723s0());
    }

    /* renamed from: W0 */
    public C1203j mo3685W0() {
        return (C1203j) mo3689a(C1203j.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5809P();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ C1209n m5813T() {
        return new C1209n(mo3687Y0(), mo3681S0(), mo3716m0(), mo3698d0(), mo3707h1());
    }

    /* renamed from: a1 */
    public C1209n mo3692a1() {
        return (C1209n) mo3689a(C1209n.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5813T();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ C1170a m5837q() {
        return new C1170a(mo3705g1());
    }

    /* renamed from: s0 */
    public C1170a mo3723s0() {
        return (C1170a) mo3689a(C1170a.class, new C1322a() {
            /* renamed from: a */
            public final Object mo2934a() {
                return C1321s.this.m5837q();
            }
        });
    }
}
