package com.appodeal.ads.utils;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appodeal.ads.C9237k0;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.libs.network.NetworkStatus;
import com.appodeal.ads.storage.C9531b;
import com.appodeal.ads.storage.C9562o;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.utils.x */
public final class C9662x {

    /* renamed from: l */
    public static final HashMap f24470l = new HashMap();

    /* renamed from: m */
    public static volatile C9662x f24471m;

    /* renamed from: n */
    public static final long f24472n;

    /* renamed from: o */
    public static final long f24473o;

    /* renamed from: p */
    public static final long f24474p;

    /* renamed from: a */
    public int f24475a = 7;

    /* renamed from: b */
    public long f24476b = f24472n;

    /* renamed from: c */
    public long f24477c = f24473o;

    /* renamed from: d */
    public long f24478d = f24474p;

    /* renamed from: e */
    public C9661w f24479e;

    /* renamed from: f */
    public Long f24480f;

    /* renamed from: g */
    public Long f24481g;

    /* renamed from: h */
    public final Handler f24482h;

    /* renamed from: i */
    public C9665c f24483i;

    /* renamed from: j */
    public C9664b f24484j;

    /* renamed from: k */
    public final C9562o f24485k = C9562o.f24251b;

    /* renamed from: com.appodeal.ads.utils.x$a */
    public static final class C9663a {
        /* renamed from: a */
        public static C9662x m28439a() {
            C9662x xVar;
            C9662x xVar2 = C9662x.f24471m;
            if (xVar2 != null) {
                return xVar2;
            }
            synchronized (C9662x.class) {
                xVar = C9662x.f24471m;
                if (xVar == null) {
                    xVar = new C9662x();
                    C9662x.f24471m = xVar;
                }
            }
            return xVar;
        }
    }

    /* renamed from: com.appodeal.ads.utils.x$b */
    public final class C9664b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9662x f24486a;

        public C9664b(C9662x xVar) {
            Intrinsics.checkNotNullParameter(xVar, "this$0");
            this.f24486a = xVar;
        }

        public final void run() {
            this.f24486a.mo61194m();
            C9662x xVar = this.f24486a;
            long j = xVar.f24477c;
            if (j > 0) {
                xVar.f24482h.postDelayed(this, j);
            }
        }
    }

    /* renamed from: com.appodeal.ads.utils.x$c */
    public final class C9665c implements Runnable {

        /* renamed from: a */
        public final Context f24487a;

        /* renamed from: b */
        public final boolean f24488b;

        /* renamed from: c */
        public final /* synthetic */ C9662x f24489c;

        public C9665c(C9662x xVar, Context context, boolean z) {
            Intrinsics.checkNotNullParameter(xVar, "this$0");
            Intrinsics.checkNotNullParameter(context, "context");
            this.f24489c = xVar;
            this.f24487a = context;
            this.f24488b = z;
        }

        public final void run() {
            long a = C9662x.m28415a(this.f24489c);
            if (!this.f24488b && 0 != a) {
                this.f24489c.mo61181a(this.f24487a, a);
            } else if (!NetworkStatus.INSTANCE.isConnected()) {
                Log.log("SessionManager", "sendSessions", "skip: no network connection");
                C9662x xVar = this.f24489c;
                xVar.mo61181a(this.f24487a, xVar.f24476b);
            } else {
                Log.log("SessionManager", "sendSessions", "start");
                C9237k0.m27404c();
            }
        }
    }

    /* renamed from: com.appodeal.ads.utils.x$d */
    public abstract class C9666d implements Runnable {

        /* renamed from: a */
        public final int f24490a;

        /* renamed from: b */
        public final /* synthetic */ C9662x f24491b;

        /* renamed from: com.appodeal.ads.utils.x$d$a */
        public static final class C9667a extends LinkedHashMap<String, JSONObject> {

            /* renamed from: a */
            public final /* synthetic */ C9666d f24492a;

            public C9667a(C9666d dVar) {
                this.f24492a = dVar;
            }

            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj == null ? true : obj instanceof String)) {
                    return false;
                }
                return super.containsKey((String) obj);
            }

            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj == null ? true : obj instanceof JSONObject)) {
                    return false;
                }
                return super.containsValue((JSONObject) obj);
            }

            public final /* bridge */ Set<Map.Entry<String, JSONObject>> entrySet() {
                return super.entrySet();
            }

            public final /* bridge */ Set<String> keySet() {
                return super.keySet();
            }

            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                boolean z = true;
                if (!(obj == null ? true : obj instanceof String)) {
                    return false;
                }
                if (obj2 != null) {
                    z = obj2 instanceof JSONObject;
                }
                if (!z) {
                    return false;
                }
                return super.remove((String) obj, (JSONObject) obj2);
            }

            public final boolean removeEldestEntry(Map.Entry<String, ? extends JSONObject> entry) {
                Intrinsics.checkNotNullParameter(entry, "eldest");
                return super.size() > this.f24492a.f24490a;
            }

            public final /* bridge */ int size() {
                return super.size();
            }

            public final /* bridge */ Collection<JSONObject> values() {
                return super.values();
            }
        }

        public C9666d(C9662x xVar, int i) {
            Intrinsics.checkNotNullParameter(xVar, "this$0");
            this.f24491b = xVar;
            this.f24490a = i;
        }

        /* renamed from: a */
        public abstract void mo61198a(C9667a aVar);

        public final void run() {
            try {
                C9667a aVar = new C9667a(this);
                C9662x xVar = this.f24491b;
                C9662x.m28418a(xVar, C9662x.m28421d(xVar), aVar);
                mo61198a(aVar);
                C9562o b = this.f24491b.f24485k;
                String jSONArray = new JSONArray(aVar.values()).toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray, "JSONArray(sessions.values).toString()");
                b.mo60815b(jSONArray, (long) aVar.size());
            } catch (Throwable th) {
                Log.log(th);
            }
        }
    }

    /* renamed from: com.appodeal.ads.utils.x$e */
    public static final class C9668e extends C9666d {
        public C9668e(C9662x xVar, int i) {
            super(xVar, i);
        }

        /* renamed from: a */
        public final void mo61198a(C9666d.C9667a aVar) {
            Intrinsics.checkNotNullParameter(aVar, Constants.SESSIONS);
            synchronized (C9662x.f24470l) {
                for (String remove : C9662x.f24470l.keySet()) {
                    aVar.remove(remove);
                }
                C9662x.f24470l.clear();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: com.appodeal.ads.utils.x$f */
    public static final class C9669f extends C9666d {

        /* renamed from: c */
        public final /* synthetic */ C9661w f24493c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9669f(C9662x xVar, C9661w wVar, int i) {
            super(xVar, i);
            this.f24493c = wVar;
        }

        /* renamed from: a */
        public final void mo61198a(C9666d.C9667a aVar) {
            Intrinsics.checkNotNullParameter(aVar, Constants.SESSIONS);
            aVar.put(this.f24493c.mo61175a(), this.f24493c.mo61178d());
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f24472n = timeUnit.toMillis(120);
        f24473o = timeUnit.toMillis(60);
        f24474p = timeUnit.toMillis(30);
    }

    public C9662x() {
        HandlerThread handlerThread = new HandlerThread("AppodealSessionHandler");
        handlerThread.start();
        this.f24482h = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public static final long m28415a(C9662x xVar) {
        Long l = xVar.f24481g;
        if (l == null) {
            return xVar.f24476b;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        long j = xVar.f24476b;
        if (elapsedRealtime >= j) {
            return 0;
        }
        return j - elapsedRealtime;
    }

    /* renamed from: d */
    public static final JSONArray m28421d(C9662x xVar) {
        xVar.getClass();
        JSONArray jSONArray = new JSONArray();
        try {
            String f = xVar.f24485k.mo60823f();
            if (f == null) {
                f = jSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(f, "sessions.toString()");
            }
            return new JSONArray(f);
        } catch (Throwable th) {
            Log.log(th);
            return jSONArray;
        }
    }

    /* renamed from: e */
    public static final void m28422e(C9662x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "this$0");
        xVar.mo61194m();
    }

    /* renamed from: a */
    public final synchronized void mo61181a(Context context, long j) {
        C9665c cVar = this.f24483i;
        if (cVar != null) {
            this.f24482h.removeCallbacks(cVar);
            this.f24483i = null;
        }
        if (this.f24476b > 0) {
            boolean z = 0 == j;
            C9665c cVar2 = new C9665c(this, context, z);
            this.f24483i = cVar2;
            if (z) {
                this.f24482h.postAtFrontOfQueue(cVar2);
            } else {
                this.f24482h.postDelayed(cVar2, j);
            }
        }
    }

    /* renamed from: b */
    public final void mo61183b() {
        this.f24482h.post(new C9668e(this, this.f24475a));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public final long mo61184c() {
        /*
            r6 = this;
            com.appodeal.ads.utils.w r0 = r6.f24479e
            r1 = 0
            if (r0 != 0) goto L_0x0007
            goto L_0x002e
        L_0x0007:
            monitor-enter(r0)
            long r3 = r0.f24460b     // Catch:{ all -> 0x0032 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x000f
            goto L_0x002d
        L_0x000f:
            monitor-enter(r0)     // Catch:{ all -> 0x0032 }
            r0.mo61179e()     // Catch:{ all -> 0x002f }
            com.appodeal.ads.storage.o r3 = com.appodeal.ads.utils.C9661w.f24458l     // Catch:{ all -> 0x002f }
            com.appodeal.ads.storage.b r3 = r3.f24252a     // Catch:{ all -> 0x002f }
            com.appodeal.ads.storage.b$a r4 = com.appodeal.ads.storage.C9531b.C9532a.Default     // Catch:{ all -> 0x002f }
            android.content.SharedPreferences r3 = r3.mo60778a((com.appodeal.ads.storage.C9531b.C9532a) r4)     // Catch:{ all -> 0x002f }
            java.lang.String r4 = "app_uptime"
            long r1 = r3.getLong(r4, r1)     // Catch:{ all -> 0x002f }
            long r3 = r0.f24463e     // Catch:{ all -> 0x002f }
            long r1 = r1 + r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            long r3 = r0.f24460b     // Catch:{ all -> 0x0032 }
            long r1 = r1 / r3
        L_0x002d:
            monitor-exit(r0)
        L_0x002e:
            return r1
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.C9662x.mo61184c():long");
    }

    /* renamed from: e */
    public final long mo61186e() {
        C9661w wVar = this.f24479e;
        long j = 0;
        if (wVar != null) {
            synchronized (wVar) {
                wVar.mo61179e();
                j = (C9661w.f24458l.f24252a.mo60778a(C9531b.C9532a.Default).getLong("app_uptime", 0) + wVar.f24463e) / 1000;
            }
        }
        return j;
    }

    /* renamed from: f */
    public final long mo61187f() {
        C9661w wVar = this.f24479e;
        long j = 0;
        if (wVar != null) {
            synchronized (wVar) {
                wVar.mo61179e();
                j = C9661w.f24458l.f24252a.mo60778a(C9531b.C9532a.Default).getLong("app_uptime_m", 0) + wVar.f24464f;
            }
        }
        return j;
    }

    /* renamed from: g */
    public final long mo61188g() {
        long j;
        C9661w wVar = this.f24479e;
        if (wVar == null) {
            return 0;
        }
        synchronized (wVar) {
            j = wVar.f24460b;
        }
        return j;
    }

    /* renamed from: h */
    public final long mo61189h() {
        long j;
        C9661w wVar = this.f24479e;
        if (wVar == null) {
            return 0;
        }
        synchronized (wVar) {
            wVar.mo61179e();
            j = wVar.f24463e / 1000;
        }
        return j;
    }

    /* renamed from: i */
    public final long mo61190i() {
        long j;
        C9661w wVar = this.f24479e;
        if (wVar == null) {
            return 0;
        }
        synchronized (wVar) {
            wVar.mo61179e();
            j = wVar.f24464f;
        }
        return j;
    }

    /* renamed from: j */
    public final String mo61191j() {
        String str;
        C9661w wVar = this.f24479e;
        if (wVar == null) {
            return null;
        }
        synchronized (wVar) {
            str = wVar.f24459a;
        }
        return str;
    }

    /* renamed from: k */
    public final void mo61192k() {
        C9661w wVar = this.f24479e;
        if (wVar != null) {
            synchronized (wVar) {
                wVar.f24467i = System.currentTimeMillis();
                wVar.f24468j = SystemClock.elapsedRealtime();
                wVar.mo61179e();
            }
            this.f24482h.post(new Runnable() {
                public final void run() {
                    C9662x.m28422e(C9662x.this);
                }
            });
        }
        C9665c cVar = this.f24483i;
        if (cVar != null) {
            this.f24482h.removeCallbacks(cVar);
            this.f24483i = null;
        }
        C9664b bVar = this.f24484j;
        if (bVar != null) {
            this.f24482h.removeCallbacks(bVar);
            this.f24484j = null;
        }
    }

    /* renamed from: l */
    public final void mo61193l() {
        long elapsedRealtime;
        long j;
        long j2;
        Context applicationContext = C9148b.f22956b.f22957a.getApplicationContext();
        C9661w wVar = this.f24479e;
        if (wVar != null) {
            synchronized (wVar) {
                if (wVar.f24467i > 0) {
                    wVar.f24465g = System.currentTimeMillis();
                }
                if (wVar.f24468j > 0) {
                    wVar.f24466h = SystemClock.elapsedRealtime();
                }
            }
            synchronized (wVar) {
                elapsedRealtime = wVar.f24468j > 0 ? SystemClock.elapsedRealtime() - wVar.f24468j : 0;
            }
            if (elapsedRealtime >= this.f24478d) {
                if (this.f24485k.f24252a.mo60778a(C9531b.C9532a.Default).getLong("sessions_size", 0) >= ((long) this.f24475a)) {
                    mo61181a(applicationContext, 0);
                } else {
                    Long l = this.f24481g;
                    if (l == null) {
                        j2 = this.f24476b;
                    } else {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - l.longValue();
                        long j3 = this.f24476b;
                        j2 = elapsedRealtime2 >= j3 ? 0 : j3 - elapsedRealtime2;
                    }
                    mo61181a(applicationContext, j2);
                }
                mo61195n();
            } else {
                Long l2 = this.f24481g;
                if (l2 == null) {
                    j = this.f24476b;
                } else {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - l2.longValue();
                    long j4 = this.f24476b;
                    j = elapsedRealtime3 >= j4 ? 0 : j4 - elapsedRealtime3;
                }
                mo61181a(applicationContext, j);
            }
        }
        synchronized (this) {
            C9664b bVar = this.f24484j;
            if (bVar != null) {
                this.f24482h.removeCallbacks(bVar);
                this.f24484j = null;
            }
            if (this.f24477c > 0) {
                C9664b bVar2 = new C9664b(this);
                this.f24484j = bVar2;
                this.f24482h.postDelayed(bVar2, this.f24477c);
            }
        }
    }

    /* renamed from: m */
    public final synchronized void mo61194m() {
        C9661w wVar = this.f24479e;
        if (wVar != null) {
            wVar.mo61177c();
        }
    }

    /* renamed from: n */
    public final void mo61195n() {
        Long l;
        long j;
        long j2;
        C9661w wVar = this.f24479e;
        Long l2 = null;
        if (wVar == null) {
            C9562o oVar = C9661w.f24458l;
            String m = oVar.f24252a.mo60806m();
            wVar = !TextUtils.isEmpty(m) ? new C9661w(m, oVar.f24252a.mo60801h(), oVar.f24252a.mo60803j(), oVar.f24252a.mo60802i(), oVar.f24252a.mo60805l(), oVar.f24252a.mo60804k()) : null;
        } else {
            wVar.mo61177c();
        }
        if (wVar == null) {
            l = null;
        } else {
            synchronized (wVar) {
                j2 = wVar.f24460b;
            }
            l = Long.valueOf(j2);
        }
        if (l == null) {
            j = this.f24485k.f24252a.mo60801h();
        } else {
            j = l.longValue();
        }
        if (this.f24480f == null) {
            String c = this.f24485k.mo60775c();
            Long d = this.f24485k.mo60819d();
            if ((c == null || StringsKt.isBlank(c)) || j == 0) {
                l2 = Long.valueOf(SystemClock.elapsedRealtime());
                this.f24485k.mo60810a(l2.longValue());
            } else if (d != null) {
                l2 = d;
            }
            this.f24480f = l2;
        }
        if (wVar != null) {
            this.f24482h.post(new C9669f(this, wVar, this.f24475a));
        }
        C9661w wVar2 = new C9661w(j);
        this.f24479e = wVar2;
        wVar2.mo61176b();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final long mo61185d() {
        /*
            r6 = this;
            com.appodeal.ads.utils.w r0 = r6.f24479e
            r1 = 0
            if (r0 != 0) goto L_0x0007
            goto L_0x002b
        L_0x0007:
            monitor-enter(r0)
            long r3 = r0.f24460b     // Catch:{ all -> 0x002f }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x000f
            goto L_0x002a
        L_0x000f:
            monitor-enter(r0)     // Catch:{ all -> 0x002f }
            r0.mo61179e()     // Catch:{ all -> 0x002c }
            com.appodeal.ads.storage.o r3 = com.appodeal.ads.utils.C9661w.f24458l     // Catch:{ all -> 0x002c }
            com.appodeal.ads.storage.b r3 = r3.f24252a     // Catch:{ all -> 0x002c }
            com.appodeal.ads.storage.b$a r4 = com.appodeal.ads.storage.C9531b.C9532a.Default     // Catch:{ all -> 0x002c }
            android.content.SharedPreferences r3 = r3.mo60778a((com.appodeal.ads.storage.C9531b.C9532a) r4)     // Catch:{ all -> 0x002c }
            java.lang.String r4 = "app_uptime_m"
            long r1 = r3.getLong(r4, r1)     // Catch:{ all -> 0x002c }
            long r3 = r0.f24464f     // Catch:{ all -> 0x002c }
            long r1 = r1 + r3
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            long r3 = r0.f24460b     // Catch:{ all -> 0x002f }
            long r1 = r1 / r3
        L_0x002a:
            monitor-exit(r0)
        L_0x002b:
            return r1
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.C9662x.mo61185d():long");
    }

    /* renamed from: a */
    public static final void m28418a(C9662x xVar, JSONArray jSONArray, C9666d.C9667a aVar) {
        xVar.getClass();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                aVar.put(jSONObject.optString("session_uuid"), jSONObject);
            } catch (Throwable th) {
                Log.log(th);
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public final void mo61182a(Context context, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        if (jSONObject.has("session_store_size")) {
            this.f24475a = jSONObject.optInt("session_store_size");
        }
        if (jSONObject.has("session_report_interval")) {
            this.f24476b = jSONObject.optLong("session_report_interval");
        }
        if (jSONObject.has("session_update_interval")) {
            this.f24477c = jSONObject.optLong("session_update_interval");
        }
        if (jSONObject.has("session_timeout_duration")) {
            this.f24478d = jSONObject.optLong("session_timeout_duration");
        }
        mo61181a(context, this.f24476b);
        synchronized (this) {
            C9664b bVar = this.f24484j;
            if (bVar != null) {
                this.f24482h.removeCallbacks(bVar);
                this.f24484j = null;
            }
            if (this.f24477c > 0) {
                C9664b bVar2 = new C9664b(this);
                this.f24484j = bVar2;
                this.f24482h.postDelayed(bVar2, this.f24477c);
            }
        }
    }

    /* renamed from: a */
    public final JSONArray mo61180a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24481g = Long.valueOf(SystemClock.elapsedRealtime());
        mo61181a(context, this.f24476b);
        JSONArray jSONArray = new JSONArray();
        try {
            String f = this.f24485k.mo60823f();
            if (f == null) {
                f = jSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(f, "sessions.toString()");
            }
            jSONArray = new JSONArray(f);
        } catch (Throwable th) {
            Log.log(th);
        }
        HashMap hashMap = f24470l;
        synchronized (hashMap) {
            int i = 0;
            int length = jSONArray.length();
            while (i < length) {
                int i2 = i + 1;
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    hashMap.put(jSONObject.optString("session_uuid"), jSONObject);
                } catch (Throwable th2) {
                    Log.log(th2);
                }
                i = i2;
            }
            Unit unit = Unit.INSTANCE;
        }
        return jSONArray;
    }
}
