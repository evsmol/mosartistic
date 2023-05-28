package com.applovin.impl.sdk.network;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.f */
public class C8528f {

    /* renamed from: a */
    private final C8490n f21512a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8626v f21513b;

    /* renamed from: c */
    private final int f21514c;

    /* renamed from: d */
    private final C8532g f21515d;

    /* renamed from: e */
    private final SharedPreferences f21516e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Object f21517f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ArrayList<C8533h> f21518g;

    /* renamed from: h */
    private final ArrayList<C8533h> f21519h = new ArrayList<>();

    /* renamed from: i */
    private long f21520i = 0;

    /* renamed from: j */
    private final Set<C8533h> f21521j = new HashSet();

    public C8528f(C8490n nVar) {
        if (nVar != null) {
            this.f21512a = nVar;
            this.f21513b = nVar.mo57320D();
            this.f21514c = ((Integer) nVar.mo57342a(C8380b.f20822cS)).intValue();
            if (nVar.mo57363ad() != null) {
                this.f21516e = nVar.mo57332P().getSharedPreferences("com.applovin.sdk.impl.postbackQueue.domain", 0);
                this.f21518g = m25854d();
                this.f21515d = null;
                return;
            }
            C8532g gVar = new C8532g(this, nVar);
            this.f21515d = gVar;
            this.f21518g = gVar.mo57575a(this.f21514c);
            this.f21515d.mo57576a();
            this.f21516e = null;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        r0 = ((java.lang.Integer) r4.f21512a.mo57342a(com.applovin.impl.sdk.p254c.C8380b.f20820cQ)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r5.mo57590k() <= r0) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
        if (com.applovin.impl.sdk.C8626v.m26252a() == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        r6 = r4.f21513b;
        r6.mo57821d("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + r0 + ". Dequeuing postback: " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        m25857d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        r1 = r4.f21517f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b9, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.f21521j.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        if (r5.mo57584f() == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        r0 = new org.json.JSONObject(r5.mo57584f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        r4.f21512a.mo57360aa().dispatchPostbackRequest(com.applovin.impl.sdk.network.C8536i.m25907b(r4.f21512a).mo57614d(r5.mo57579b()).mo57617e(r5.mo57580c()).mo57612c(r5.mo57581d()).mo57620f(r5.mo57578a()).mo57615d(r5.mo57582e()).mo57610b(r0).mo57621f(r5.mo57586h()).mo57618e(r5.mo57585g()).mo57623g(r5.mo57588i()).mo57622g(r5.mo57589j()).mo57611b(), new com.applovin.impl.sdk.network.C8528f.C85302(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m25847a(final com.applovin.impl.sdk.network.C8533h r5, final com.applovin.sdk.AppLovinPostbackListener r6) {
        /*
            r4 = this;
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x001e
            com.applovin.impl.sdk.v r0 = r4.f21513b
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Preparing to submit postback..."
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.mo57818b(r1, r2)
        L_0x001e:
            com.applovin.impl.sdk.n r0 = r4.f21512a
            boolean r0 = r0.mo57386c()
            if (r0 == 0) goto L_0x0036
            boolean r5 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r5 == 0) goto L_0x0035
            com.applovin.impl.sdk.v r5 = r4.f21513b
            java.lang.String r6 = "PersistentPostbackManager"
            java.lang.String r0 = "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards"
            r5.mo57818b(r6, r0)
        L_0x0035:
            return
        L_0x0036:
            java.lang.Object r0 = r4.f21517f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.network.h> r1 = r4.f21521j     // Catch:{ all -> 0x0139 }
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x0139 }
            if (r1 == 0) goto L_0x0065
            boolean r6 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0139 }
            if (r6 == 0) goto L_0x0063
            com.applovin.impl.sdk.v r6 = r4.f21513b     // Catch:{ all -> 0x0139 }
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r2.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r3 = "Skip pending postback: "
            r2.append(r3)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r5.mo57579b()     // Catch:{ all -> 0x0139 }
            r2.append(r5)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0139 }
            r6.mo57818b(r1, r5)     // Catch:{ all -> 0x0139 }
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x0139 }
            return
        L_0x0065:
            r5.mo57591l()     // Catch:{ all -> 0x0139 }
            com.applovin.impl.sdk.n r1 = r4.f21512a     // Catch:{ all -> 0x0139 }
            com.applovin.impl.sdk.s r1 = r1.mo57363ad()     // Catch:{ all -> 0x0139 }
            if (r1 == 0) goto L_0x0074
            r4.m25860f()     // Catch:{ all -> 0x0139 }
            goto L_0x0077
        L_0x0074:
            r4.m25858e()     // Catch:{ all -> 0x0139 }
        L_0x0077:
            monitor-exit(r0)     // Catch:{ all -> 0x0139 }
            com.applovin.impl.sdk.n r0 = r4.f21512a
            com.applovin.impl.sdk.c.b<java.lang.Integer> r1 = com.applovin.impl.sdk.p254c.C8380b.f20820cQ
            java.lang.Object r0 = r0.mo57342a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r1 = r5.mo57590k()
            if (r1 <= r0) goto L_0x00b7
            boolean r6 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r6 == 0) goto L_0x00b2
            com.applovin.impl.sdk.v r6 = r4.f21513b
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exceeded maximum persisted attempt count of "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ". Dequeuing postback: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            r6.mo57821d(r1, r0)
        L_0x00b2:
            r4.m25857d((com.applovin.impl.sdk.network.C8533h) r5)
            goto L_0x0135
        L_0x00b7:
            java.lang.Object r1 = r4.f21517f
            monitor-enter(r1)
            java.util.Set<com.applovin.impl.sdk.network.h> r0 = r4.f21521j     // Catch:{ all -> 0x0136 }
            r0.add(r5)     // Catch:{ all -> 0x0136 }
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            java.util.Map r0 = r5.mo57584f()
            if (r0 == 0) goto L_0x00d0
            org.json.JSONObject r0 = new org.json.JSONObject
            java.util.Map r1 = r5.mo57584f()
            r0.<init>(r1)
            goto L_0x00d1
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            com.applovin.impl.sdk.n r1 = r4.f21512a
            com.applovin.impl.sdk.network.i$a r1 = com.applovin.impl.sdk.network.C8536i.m25907b(r1)
            java.lang.String r2 = r5.mo57579b()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo57528a((java.lang.String) r2)
            java.lang.String r2 = r5.mo57580c()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo57538c((java.lang.String) r2)
            java.util.Map r2 = r5.mo57581d()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo57529a((java.util.Map<java.lang.String, java.lang.String>) r2)
            java.lang.String r2 = r5.mo57578a()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo57534b((java.lang.String) r2)
            java.util.Map r2 = r5.mo57582e()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo57535b((java.util.Map<java.lang.String, java.lang.String>) r2)
            com.applovin.impl.sdk.network.i$a r0 = r1.mo57530a((org.json.JSONObject) r0)
            boolean r1 = r5.mo57586h()
            com.applovin.impl.sdk.network.i$a r0 = r0.mo57540d((boolean) r1)
            boolean r1 = r5.mo57585g()
            com.applovin.impl.sdk.network.i$a r0 = r0.mo57539c((boolean) r1)
            boolean r1 = r5.mo57588i()
            com.applovin.impl.sdk.network.i$a r0 = r0.mo57623g((boolean) r1)
            java.lang.String r1 = r5.mo57589j()
            com.applovin.impl.sdk.network.i$a r0 = r0.mo57622g((java.lang.String) r1)
            com.applovin.impl.sdk.network.i r0 = r0.mo57532a()
            com.applovin.impl.sdk.n r1 = r4.f21512a
            com.applovin.impl.sdk.network.PostbackServiceImpl r1 = r1.mo57360aa()
            com.applovin.impl.sdk.network.f$2 r2 = new com.applovin.impl.sdk.network.f$2
            r2.<init>(r5, r6)
            r1.dispatchPostbackRequest(r0, r2)
        L_0x0135:
            return
        L_0x0136:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            throw r5
        L_0x0139:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0139 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C8528f.m25847a(com.applovin.impl.sdk.network.h, com.applovin.sdk.AppLovinPostbackListener):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25850b(C8533h hVar) {
        synchronized (this.f21517f) {
            if (this.f21512a.mo57363ad() != null) {
                this.f21518g.add(hVar);
                m25860f();
            } else {
                while (this.f21518g.size() > this.f21514c) {
                    this.f21518g.remove(0);
                }
                this.f21518g.add(hVar);
                m25858e();
            }
            if (C8626v.m26252a()) {
                C8626v vVar = this.f21513b;
                vVar.mo57818b("PersistentPostbackManager", "Enqueued postback: " + hVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25853c(C8533h hVar) {
        m25847a(hVar, (AppLovinPostbackListener) null);
    }

    /* renamed from: d */
    private ArrayList<C8533h> m25854d() {
        Set<String> set = (Set) this.f21512a.mo57379b(C8382d.f21008p, new LinkedHashSet(0), this.f21516e);
        ArrayList<C8533h> arrayList = new ArrayList<>(Math.max(1, set.size()));
        int intValue = ((Integer) this.f21512a.mo57342a(C8380b.f20820cQ)).intValue();
        if (C8626v.m26252a()) {
            C8626v vVar = this.f21513b;
            vVar.mo57818b("PersistentPostbackManager", "Deserializing " + set.size() + " postback(s).");
        }
        for (String str : set) {
            try {
                C8533h hVar = new C8533h(new JSONObject(str), this.f21512a);
                if (hVar.mo57590k() < intValue) {
                    arrayList.add(hVar);
                } else if (C8626v.m26252a()) {
                    C8626v vVar2 = this.f21513b;
                    vVar2.mo57818b("PersistentPostbackManager", "Skipping deserialization because maximum attempt count exceeded for postback: " + hVar);
                }
            } catch (Throwable th) {
                if (C8626v.m26252a()) {
                    C8626v vVar3 = this.f21513b;
                    vVar3.mo57819b("PersistentPostbackManager", "Unable to deserialize postback request from json: " + str, th);
                }
            }
        }
        if (C8626v.m26252a()) {
            C8626v vVar4 = this.f21513b;
            vVar4.mo57818b("PersistentPostbackManager", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m25857d(C8533h hVar) {
        synchronized (this.f21517f) {
            this.f21521j.remove(hVar);
            this.f21518g.remove(hVar);
            if (this.f21512a.mo57363ad() != null) {
                m25860f();
            } else {
                m25858e();
            }
        }
        if (C8626v.m26252a()) {
            C8626v vVar = this.f21513b;
            vVar.mo57818b("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + hVar);
        }
    }

    /* renamed from: e */
    private void m25858e() {
        this.f21520i = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m25859e(C8533h hVar) {
        synchronized (this.f21517f) {
            this.f21521j.remove(hVar);
            this.f21519h.add(hVar);
        }
    }

    /* renamed from: f */
    private void m25860f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f21518g.size());
        Iterator<C8533h> it = this.f21518g.iterator();
        while (it.hasNext()) {
            try {
                linkedHashSet.add(it.next().mo57593n().toString());
            } catch (Throwable th) {
                if (C8626v.m26252a()) {
                    this.f21513b.mo57819b("PersistentPostbackManager", "Unable to serialize postback request to JSON.", th);
                }
            }
        }
        this.f21512a.mo57350a(C8382d.f21008p, linkedHashSet, this.f21516e);
        if (C8626v.m26252a()) {
            this.f21513b.mo57818b("PersistentPostbackManager", "Wrote updated postback queue to disk.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m25861g() {
        synchronized (this.f21517f) {
            Iterator<C8533h> it = this.f21519h.iterator();
            while (it.hasNext()) {
                m25853c(it.next());
            }
            this.f21519h.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo57567a() {
        return this.f21520i;
    }

    /* renamed from: a */
    public void mo57568a(C8533h hVar) {
        mo57569a(hVar, true);
    }

    /* renamed from: a */
    public void mo57569a(C8533h hVar, boolean z) {
        mo57570a(hVar, z, (AppLovinPostbackListener) null);
    }

    /* renamed from: a */
    public void mo57570a(final C8533h hVar, boolean z, final AppLovinPostbackListener appLovinPostbackListener) {
        if (StringUtils.isValidString(hVar.mo57579b())) {
            if (z) {
                hVar.mo57592m();
            }
            C85291 r3 = new Runnable() {
                public void run() {
                    synchronized (C8528f.this.f21517f) {
                        C8528f.this.m25850b(hVar);
                        C8528f.this.m25847a(hVar, appLovinPostbackListener);
                    }
                }
            };
            if (Utils.isMainThread()) {
                this.f21512a.mo57337V().mo57228a((C8401a) new C8458z(this.f21512a, r3), C8432o.C8434a.POSTBACKS);
                return;
            }
            r3.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C8533h> mo57571b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f21517f) {
            arrayList.ensureCapacity(this.f21518g.size());
            arrayList.addAll(this.f21518g);
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo57572c() {
        C85313 r0 = new Runnable() {
            public void run() {
                synchronized (C8528f.this.f21517f) {
                    if (C8528f.this.f21518g != null) {
                        for (C8533h d : new ArrayList(C8528f.this.f21518g)) {
                            C8528f.this.m25853c(d);
                        }
                    }
                }
            }
        };
        if (((Boolean) this.f21512a.mo57342a(C8380b.f20821cR)).booleanValue()) {
            this.f21512a.mo57337V().mo57228a((C8401a) new C8458z(this.f21512a, r0), C8432o.C8434a.POSTBACKS);
            return;
        }
        r0.run();
    }
}
