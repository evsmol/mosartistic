package com.apm.insight.p177k;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.apm.insight.C6606g;
import com.apm.insight.Npth;
import com.apm.insight.entity.C6597c;
import com.apm.insight.p178l.C6688q;
import com.apm.insight.runtime.C6718a;
import com.apm.insight.runtime.C6756o;
import com.apm.insight.runtime.C6761p;
import com.apm.insight.runtime.C6770u;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;

/* renamed from: com.apm.insight.k.g */
public final class C6651g {

    /* renamed from: a */
    private static final ConcurrentHashMap<Object, ConcurrentLinkedQueue<C6597c>> f14316a = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final HashMap<Object, HashMap<String, ConcurrentLinkedQueue<C6597c>>> f14317b = new HashMap<>();

    /* renamed from: c */
    private static volatile C6651g f14318c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6770u f14319d = C6761p.m17019b();

    /* renamed from: e */
    private volatile boolean f14320e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Runnable f14321f = new Runnable() {
        public void run() {
            if (!Npth.isStopUpload()) {
                if (!C6651g.f14317b.isEmpty() && C6756o.m17005e()) {
                    C6651g.m16444f();
                }
                C6651g.this.mo52140c();
                C6651g.this.f14319d.mo52328a(C6651g.this.f14321f, 30000);
            }
        }
    };

    private C6651g() {
    }

    /* renamed from: a */
    public static C6651g m16435a() {
        if (f14318c == null) {
            synchronized (C6651g.class) {
                if (f14318c == null) {
                    f14318c = new C6651g();
                }
            }
        }
        return f14318c;
    }

    /* renamed from: a */
    public static void m16437a(C6597c cVar) {
        m16438a(C6606g.m16247a(), cVar);
    }

    /* renamed from: a */
    public static void m16438a(final Object obj, final C6597c cVar) {
        Handler a = C6761p.m17019b().mo52325a();
        if (a == null || a.getLooper() != Looper.myLooper()) {
            C6761p.m17019b().mo52327a((Runnable) new Runnable() {
                public void run() {
                    C6651g.m16438a(obj, cVar);
                }
            });
            return;
        }
        if (obj == null) {
            obj = C6606g.m16247a();
        }
        if (!C6756o.m17005e()) {
            C6688q.m16627a("EventUploadQueue", (Object) "enqueue before init.");
            m16441c(obj, cVar);
            return;
        }
        if (!C6718a.m16795a(obj)) {
            C6633a.m16363b();
        }
        m16444f();
        String str = null;
        try {
            str = cVar.mo52066h().getString("log_type");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(str) || !C6718a.m16796a(obj, str)) {
            C6688q.m16627a("EventUploadQueue", (Object) "logType " + str + " not sampled");
            return;
        }
        C6688q.m16627a("EventUploadQueue", (Object) "logType " + str + " enqueued");
        m16440b(obj, cVar);
    }

    /* renamed from: b */
    private static void m16440b(Object obj, C6597c cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        synchronized (obj) {
            concurrentLinkedQueue = f14316a.get(obj);
            if (concurrentLinkedQueue == null) {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                f14316a.put(obj, concurrentLinkedQueue);
            }
        }
        concurrentLinkedQueue.add(cVar);
        int size = f14316a.size();
        boolean z = size >= 30;
        C6688q.m16631b((Object) "[enqueue] size=" + size);
        if (z) {
            m16445g();
        }
    }

    /* renamed from: c */
    private static void m16441c(Object obj, C6597c cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        try {
            String string = cVar.mo52066h().getString("log_type");
            synchronized (f14317b) {
                HashMap hashMap = f14317b.get(string);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    f14317b.put(obj, hashMap);
                }
                concurrentLinkedQueue = (ConcurrentLinkedQueue) hashMap.get(string);
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    hashMap.put(string, concurrentLinkedQueue);
                }
            }
            concurrentLinkedQueue.add(cVar);
            if (concurrentLinkedQueue.size() > 100) {
                concurrentLinkedQueue.poll();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m16444f() {
        HashMap hashMap;
        synchronized (f14317b) {
            hashMap = new HashMap(f14317b);
            f14317b.clear();
        }
        if (!C6718a.m16798b()) {
            C6688q.m16627a("EventUploadQueue", (Object) "ApmConfig not inited, clear cache.");
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                String str = (String) entry2.getKey();
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) entry2.getValue();
                if (concurrentLinkedQueue == null || (C6718a.m16798b() && !C6718a.m16796a(entry.getKey(), str))) {
                    C6688q.m16627a("EventUploadQueue", (Object) "logType " + str + " not sampled");
                } else {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        try {
                            C6597c cVar = (C6597c) concurrentLinkedQueue.poll();
                            if (cVar == null) {
                                break;
                            }
                            m16440b(entry.getKey(), cVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private static void m16445g() {
        if (C6756o.m17005e() && !Npth.isStopUpload()) {
            try {
                C6761p.m17019b().mo52327a((Runnable) new Runnable() {
                    public void run() {
                        C6651g.m16435a().mo52140c();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo52139b() {
        if (f14316a.isEmpty()) {
            this.f14319d.mo52328a(this.f14321f, 30000);
        } else {
            this.f14319d.mo52327a(this.f14321f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r1.hasNext() == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r2 = r1.next();
        r4 = (java.util.concurrent.ConcurrentLinkedQueue) r2.getValue();
        r2 = r2.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        r7.f14320e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        r0 = new java.util.LinkedList();
        r1 = f14316a.entrySet().iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo52140c() {
        /*
            r7 = this;
            com.apm.insight.runtime.u r0 = r7.f14319d
            monitor-enter(r0)
            boolean r1 = r7.f14320e     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            return
        L_0x0009:
            r1 = 1
            r7.f14320e = r1     // Catch:{ all -> 0x0080 }
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c>> r1 = f14316a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x007d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getValue()
            java.util.concurrent.ConcurrentLinkedQueue r4 = (java.util.concurrent.ConcurrentLinkedQueue) r4
            java.lang.Object r2 = r2.getKey()
        L_0x0033:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x001c
            r5 = 0
        L_0x003a:
            r6 = 30
            if (r5 >= r6) goto L_0x004f
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x0045
            goto L_0x004f
        L_0x0045:
            java.lang.Object r6 = r4.poll()     // Catch:{ all -> 0x0078 }
            r0.add(r6)     // Catch:{ all -> 0x0078 }
            int r5 = r5 + 1
            goto L_0x003a
        L_0x004f:
            boolean r5 = r0.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r5 == 0) goto L_0x0056
            goto L_0x001c
        L_0x0056:
            com.apm.insight.runtime.a.f r5 = com.apm.insight.runtime.p179a.C6729f.m16893a()     // Catch:{ all -> 0x0078 }
            org.json.JSONArray r6 = com.apm.insight.entity.C6595b.m16200a((java.lang.Object) r2)     // Catch:{ all -> 0x0078 }
            com.apm.insight.entity.a r5 = r5.mo52280a((java.util.List<com.apm.insight.entity.C6594a>) r0, (org.json.JSONArray) r6)     // Catch:{ all -> 0x0078 }
            if (r5 == 0) goto L_0x0074
            java.lang.String r6 = "upload events"
            com.apm.insight.p178l.C6688q.m16625a((java.lang.Object) r6)     // Catch:{ all -> 0x0078 }
            com.apm.insight.k.d r6 = com.apm.insight.p177k.C6645d.m16403a()     // Catch:{ all -> 0x0078 }
            org.json.JSONObject r5 = r5.mo52066h()     // Catch:{ all -> 0x0078 }
            r6.mo52131a(r5)     // Catch:{ all -> 0x0078 }
        L_0x0074:
            r0.clear()     // Catch:{ all -> 0x0078 }
            goto L_0x0033
        L_0x0078:
            r5 = move-exception
            com.apm.insight.p178l.C6688q.m16632b((java.lang.Throwable) r5)
            goto L_0x0033
        L_0x007d:
            r7.f14320e = r3
            return
        L_0x0080:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p177k.C6651g.mo52140c():void");
    }
}
