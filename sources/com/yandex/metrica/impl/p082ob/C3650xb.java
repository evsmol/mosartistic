package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.appodeal.ads.AppodealNetworks;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.yandex.metrica.impl.ob.xb */
public class C3650xb implements C1984Eb {

    /* renamed from: a */
    private final Object f9438a;

    /* renamed from: b */
    private C3356pi f9439b;

    /* renamed from: c */
    private volatile FutureTask<Void> f9440c;

    /* renamed from: d */
    private final C3657g f9441d;

    /* renamed from: e */
    private final C3657g f9442e;

    /* renamed from: f */
    private final C3657g f9443f;

    /* renamed from: g */
    private final C3579vb f9444g;

    /* renamed from: h */
    private final C3579vb f9445h;

    /* renamed from: i */
    private final C3579vb f9446i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Context f9447j;

    /* renamed from: k */
    private ICommonExecutor f9448k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile C3729zb f9449l;

    /* renamed from: com.yandex.metrica.impl.ob.xb$a */
    class C3651a implements Callable<Void> {
        C3651a() {
        }

        public Object call() throws Exception {
            C3650xb xbVar = C3650xb.this;
            C3539ub a = C3650xb.m10999a(xbVar, xbVar.f9447j);
            C3650xb xbVar2 = C3650xb.this;
            C3539ub b = C3650xb.m11005b(xbVar2, xbVar2.f9447j);
            C3650xb xbVar3 = C3650xb.this;
            C3729zb unused = xbVar.f9449l = new C3729zb(a, b, C3650xb.m11000a(xbVar3, xbVar3.f9447j, (C2057Gb) new C2021Fb()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$b */
    class C3652b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Context f9451a;

        /* renamed from: b */
        final /* synthetic */ C2057Gb f9452b;

        C3652b(Context context, C2057Gb gb) {
            this.f9451a = context;
            this.f9452b = gb;
        }

        public Object call() throws Exception {
            C3729zb a = C3650xb.this.f9449l;
            C3650xb xbVar = C3650xb.this;
            C3539ub a2 = C3650xb.m11001a(xbVar, C3650xb.m10999a(xbVar, this.f9451a), a.mo18453a());
            C3650xb xbVar2 = C3650xb.this;
            C3539ub a3 = C3650xb.m11001a(xbVar2, C3650xb.m11005b(xbVar2, this.f9451a), a.mo18454b());
            C3650xb xbVar3 = C3650xb.this;
            C3729zb unused = xbVar.f9449l = new C3729zb(a2, a3, C3650xb.m11001a(xbVar3, C3650xb.m11000a(xbVar3, this.f9451a, this.f9452b), a.mo18455c()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$c */
    public static class C3653c implements C3657g {
        /* renamed from: a */
        public boolean mo18401a(C3356pi piVar) {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$d */
    public static class C3654d implements C3657g {
        /* renamed from: a */
        public boolean mo18401a(C3356pi piVar) {
            return piVar != null && (piVar.mo17974f().f6683v || !piVar.mo17985q());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$e */
    public static class C3655e implements C3657g {
        /* renamed from: a */
        public boolean mo18401a(C3356pi piVar) {
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$f */
    public static class C3656f implements C3657g {
        /* renamed from: a */
        public boolean mo18401a(C3356pi piVar) {
            return piVar != null && piVar.mo17974f().f6683v;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$g */
    interface C3657g {
        /* renamed from: a */
        boolean mo18401a(C3356pi piVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$h */
    public static class C3658h implements C3657g {
        /* renamed from: a */
        public boolean mo18401a(C3356pi piVar) {
            return piVar != null && (piVar.mo17974f().f6675n || !piVar.mo17985q());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$i */
    public static class C3659i implements C3657g {
        /* renamed from: a */
        public boolean mo18401a(C3356pi piVar) {
            return piVar != null && piVar.mo17974f().f6675n;
        }
    }

    public C3650xb(C3657g gVar, C3657g gVar2, C3657g gVar3, ICommonExecutor iCommonExecutor, String str) {
        this(gVar, gVar2, gVar3, iCommonExecutor, new C3614wb(new C2239Kb("google")), new C3614wb(new C2239Kb("huawei")), new C3614wb(new C2239Kb(AppodealNetworks.YANDEX)), str);
    }

    /* renamed from: a */
    static C3539ub m11001a(C3650xb xbVar, C3539ub ubVar, C3539ub ubVar2) {
        xbVar.getClass();
        C2577U0 u0 = ubVar.f9199b;
        return u0 != C2577U0.OK ? new C3539ub(ubVar2.f9198a, u0, ubVar.f9200c) : ubVar;
    }

    /* renamed from: c */
    public void mo18398c(Context context) {
        this.f9447j = context.getApplicationContext();
    }

    C3650xb(C3657g gVar, C3657g gVar2, C3657g gVar3, ICommonExecutor iCommonExecutor, C3579vb vbVar, C3579vb vbVar2, C3579vb vbVar3, String str) {
        this.f9438a = new Object();
        this.f9441d = gVar;
        this.f9442e = gVar2;
        this.f9443f = gVar3;
        this.f9444g = vbVar;
        this.f9445h = vbVar2;
        this.f9446i = vbVar3;
        this.f9448k = iCommonExecutor;
        this.f9449l = new C3729zb();
    }

    /* renamed from: c */
    private void m11006c() {
        boolean z;
        if (this.f9447j != null) {
            synchronized (this) {
                C2577U0 u0 = this.f9449l.mo18453a().f9199b;
                C2577U0 u02 = C2577U0.UNKNOWN;
                z = (u0 == u02 || this.f9449l.mo18454b().f9199b == u02) ? false : true;
            }
            if (!z) {
                mo18393a(this.f9447j);
            }
        }
    }

    /* renamed from: b */
    public void mo18397b(Context context) {
        this.f9447j = context.getApplicationContext();
        if (this.f9440c == null) {
            synchronized (this.f9438a) {
                if (this.f9440c == null) {
                    this.f9440c = new FutureTask<>(new C3651a());
                    this.f9448k.execute(this.f9440c);
                }
            }
        }
    }

    /* renamed from: b */
    static C3539ub m11005b(C3650xb xbVar, Context context) {
        if (xbVar.f9442e.mo18401a(xbVar.f9439b)) {
            return xbVar.f9445h.mo16075a(context);
        }
        C3356pi piVar = xbVar.f9439b;
        if (piVar == null || !piVar.mo17985q()) {
            return new C3539ub((C3504tb) null, C2577U0.NO_STARTUP, "startup has not been received yet");
        }
        if (!xbVar.f9439b.mo17974f().f6683v) {
            return new C3539ub((C3504tb) null, C2577U0.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
        }
        return new C3539ub((C3504tb) null, C2577U0.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    @Deprecated
    /* renamed from: b */
    public Boolean mo15677b() {
        m11006c();
        C3504tb tbVar = this.f9449l.mo18453a().f9198a;
        if (tbVar == null) {
            return null;
        }
        return tbVar.f9143c;
    }

    /* renamed from: a */
    public void mo18395a(Context context, C3356pi piVar) {
        this.f9439b = piVar;
        mo18397b(context);
    }

    /* renamed from: a */
    public void mo18396a(C3356pi piVar) {
        this.f9439b = piVar;
    }

    /* renamed from: a */
    public C3729zb mo18393a(Context context) {
        mo18397b(context);
        try {
            this.f9440c.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f9449l;
    }

    /* renamed from: a */
    public C3729zb mo18394a(Context context, C2057Gb gb) {
        FutureTask futureTask = new FutureTask(new C3652b(context.getApplicationContext(), gb));
        this.f9448k.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f9449l;
    }

    /* renamed from: a */
    static C3539ub m10999a(C3650xb xbVar, Context context) {
        if (xbVar.f9441d.mo18401a(xbVar.f9439b)) {
            return xbVar.f9444g.mo16075a(context);
        }
        C3356pi piVar = xbVar.f9439b;
        if (piVar == null || !piVar.mo17985q()) {
            return new C3539ub((C3504tb) null, C2577U0.NO_STARTUP, "startup has not been received yet");
        }
        if (!xbVar.f9439b.mo17974f().f6675n) {
            return new C3539ub((C3504tb) null, C2577U0.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
        }
        return new C3539ub((C3504tb) null, C2577U0.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    /* renamed from: a */
    static C3539ub m11000a(C3650xb xbVar, Context context, C2057Gb gb) {
        if (xbVar.f9443f.mo18401a(xbVar.f9439b)) {
            return xbVar.f9446i.mo16076a(context, gb);
        }
        return new C3539ub((C3504tb) null, C2577U0.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    @Deprecated
    /* renamed from: a */
    public String mo15676a() {
        m11006c();
        C3504tb tbVar = this.f9449l.mo18453a().f9198a;
        if (tbVar == null) {
            return null;
        }
        return tbVar.f9142b;
    }
}
