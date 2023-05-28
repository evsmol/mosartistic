package com.ironsource.mediationsdk.adunit.p134e;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.p129c.p131b.C4576a;
import com.ironsource.mediationsdk.adunit.p132d.p133a.C4591c;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.adunit.e.a */
public final class C4595a<Smash extends C4591c<?>> {

    /* renamed from: a */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f11341a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public String f11342b = "";

    /* renamed from: c */
    private String f11343c = "";

    /* renamed from: d */
    private C4591c<?> f11344d;

    /* renamed from: e */
    private final List<String> f11345e;

    /* renamed from: f */
    private final int f11346f;

    /* renamed from: g */
    private final Timer f11347g = new Timer();

    /* renamed from: h */
    private C4597b f11348h;

    /* renamed from: i */
    private final int f11349i = 5;

    public C4595a(List<String> list, int i, C4597b bVar) {
        this.f11345e = list;
        this.f11346f = i;
        this.f11348h = bVar;
    }

    /* renamed from: b */
    private synchronized void m13440b() {
        if (this.f11344d != null) {
            this.f11344d.mo33849o();
        }
    }

    /* renamed from: c */
    private synchronized boolean m13441c() {
        return this.f11344d != null && this.f11344d.mo33850p() && this.f11344d.mo33848n().equals(this.f11343c);
    }

    /* renamed from: d */
    private void m13442d() {
        Iterator it = mo33852a().iterator();
        while (it.hasNext()) {
            C4591c cVar = (C4591c) it.next();
            if (!cVar.equals(this.f11344d)) {
                cVar.mo33849o();
            }
        }
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<Smash> mo33852a() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f11341a.get(this.f11342b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    /* renamed from: a */
    public final void mo33853a(C4576a.C4577a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        m13442d();
        if (aVar == C4576a.C4577a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f11341a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f11343c)) {
                if (m13441c()) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("ad from previous waterfall " + this.f11343c + " is still showing - the current waterfall " + this.f11342b + " will be deleted instead");
                    String str2 = this.f11342b;
                    this.f11342b = this.f11343c;
                    this.f11343c = str2;
                }
                final String str3 = this.f11343c;
                this.f11347g.schedule(new TimerTask() {
                    public final void run() {
                        try {
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("removing waterfall with id " + str3 + " from memory");
                            C4595a.this.f11341a.remove(str3);
                            IronLog ironLog2 = IronLog.INTERNAL;
                            ironLog2.verbose("waterfall size is currently " + C4595a.this.f11341a.size());
                        } finally {
                            cancel();
                        }
                    }
                }, (long) this.f11346f);
            }
        } else {
            this.f11341a.clear();
            this.f11341a.put(str, copyOnWriteArrayList);
        }
        this.f11343c = this.f11342b;
        this.f11342b = str;
        if (this.f11341a.size() > 5) {
            this.f11348h.mo33818a(this.f11341a.size());
        }
    }

    /* renamed from: a */
    public final synchronized void mo33854a(C4591c<?> cVar) {
        IronLog.INTERNAL.verbose("");
        if (this.f11344d != null && !this.f11344d.equals(cVar)) {
            m13440b();
        }
        this.f11344d = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r3.f11345e.contains(r6) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r3.f11344d.mo33847m().equals(r6) == false) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo33855a(com.ironsource.mediationsdk.adunit.p129c.p131b.C4576a.C4577a r4, java.lang.String r5, java.lang.String r6, com.ironsource.mediationsdk.LoadWhileShowSupportState r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = com.ironsource.mediationsdk.adunit.p129c.p131b.C4576a.C4577a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x0059 }
            r1 = 0
            r2 = 1
            if (r4 == r0) goto L_0x0009
        L_0x0007:
            r1 = 1
            goto L_0x003f
        L_0x0009:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f11344d     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0007
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f11344d     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.mo33850p()     // Catch:{ all -> 0x0059 }
            if (r4 != 0) goto L_0x0016
            goto L_0x0007
        L_0x0016:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch:{ all -> 0x0059 }
            if (r7 != r4) goto L_0x0027
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f11344d     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = r4.mo33612k()     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0027
            goto L_0x003f
        L_0x0027:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch:{ all -> 0x0059 }
            if (r7 == r4) goto L_0x0033
            java.util.List<java.lang.String> r4 = r3.f11345e     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.contains(r6)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0007
        L_0x0033:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f11344d     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = r4.mo33847m()     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0007
        L_0x003f:
            if (r1 != 0) goto L_0x0057
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r6.<init>()     // Catch:{ all -> 0x0059 }
            r6.append(r5)     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = " does not support load while show and will not be added to the auction request"
            r6.append(r5)     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0059 }
            r4.verbose(r5)     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r3)
            return r1
        L_0x0059:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p134e.C4595a.mo33855a(com.ironsource.mediationsdk.adunit.c.b.a$a, java.lang.String, java.lang.String, com.ironsource.mediationsdk.LoadWhileShowSupportState):boolean");
    }
}
