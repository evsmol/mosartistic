package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C6288e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.i0 */
class C6314i0 {

    /* renamed from: a */
    private final LinkedHashMap<Integer, C6360k0> f13547a = new LinkedHashMap<>();

    /* renamed from: b */
    private int f13548b = 2;

    /* renamed from: c */
    private final HashMap<String, ArrayList<C6327j0>> f13549c = new HashMap<>();

    /* renamed from: d */
    private int f13550d = 1;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final LinkedBlockingQueue<C6294f1> f13551e = new LinkedBlockingQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f13552f = false;

    /* renamed from: g */
    private final ScheduledExecutorService f13553g = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: h */
    private final ExecutorService f13554h = Executors.newSingleThreadExecutor();

    /* renamed from: i */
    private ScheduledFuture<?> f13555i;

    /* renamed from: com.adcolony.sdk.i0$a */
    class C6315a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f13556a;

        C6315a(Context context) {
            this.f13556a = context;
        }

        public void run() {
            C6294f1 b = C6185a.m14887b().mo50810u().mo50290b();
            C6294f1 b2 = C6235c0.m15073b();
            C6235c0.m15070a(b, "os_name", "android");
            C6235c0.m15070a(b2, "filepath", C6185a.m14887b().mo50815z().mo51051a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            C6235c0.m15069a(b2, "info", b);
            C6235c0.m15077b(b2, "m_origin", 0);
            C6235c0.m15077b(b2, "m_id", C6314i0.m15327a(C6314i0.this));
            C6235c0.m15070a(b2, "m_type", "Controller.create");
            try {
                C6361l.m15494b(this.f13556a, new C6312h0(b2));
            } catch (RuntimeException e) {
                C6288e0.C6289a aVar = new C6288e0.C6289a();
                aVar.mo50644a(e.toString() + ": during WebView initialization.").mo50644a(" Disabling AdColony.").mo50645a(C6288e0.f13497h);
                AdColony.disable();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i0$b */
    class C6316b implements Runnable {
        C6316b() {
        }

        public void run() {
            while (true) {
                try {
                    C6294f1 f1Var = (C6294f1) C6314i0.this.f13551e.poll(60, TimeUnit.SECONDS);
                    if (f1Var != null) {
                        C6314i0.this.m15335b(f1Var);
                    } else {
                        synchronized (C6314i0.this.f13551e) {
                            if (C6314i0.this.f13551e.peek() == null) {
                                boolean unused = C6314i0.this.f13552f = false;
                                return;
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    new C6288e0.C6289a().mo50644a("Native messages thread was interrupted: ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i0$c */
    class C6317c implements Runnable {
        C6317c() {
        }

        public void run() {
            C6185a.m14892f();
            if (!C6314i0.this.mo50751f()) {
                C6314i0.this.mo50753i();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i0$d */
    class C6318d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f13560a;

        /* renamed from: b */
        final /* synthetic */ C6294f1 f13561b;

        C6318d(String str, C6294f1 f1Var) {
            this.f13560a = str;
            this.f13561b = f1Var;
        }

        public void run() {
            C6314i0.this.m15331a(this.f13560a, this.f13561b);
        }
    }

    C6314i0() {
    }

    /* renamed from: a */
    static /* synthetic */ int m15327a(C6314i0 i0Var) {
        int i = i0Var.f13550d;
        i0Var.f13550d = i + 1;
        return i;
    }

    /* renamed from: g */
    private void m15336g() {
        if (this.f13555i == null) {
            try {
                this.f13555i = this.f13553g.scheduleAtFixedRate(new C6317c(), 0, 17, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                new C6288e0.C6289a().mo50644a("Error when scheduling message pumping").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50748c(C6294f1 f1Var) {
        try {
            if (f1Var.mo50691c("m_id", this.f13550d)) {
                this.f13550d++;
            }
            f1Var.mo50691c("m_origin", 0);
            int b = f1Var.mo50684b("m_target");
            if (b == 0) {
                m15328a(f1Var);
                return;
            }
            C6360k0 k0Var = this.f13547a.get(Integer.valueOf(b));
            if (k0Var != null) {
                k0Var.mo50564a(f1Var);
            }
        } catch (JSONException e) {
            new C6288e0.C6289a().mo50644a("JSON error in ADCMessageDispatcher's sendMessage(): ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public LinkedHashMap<Integer, C6360k0> mo50749d() {
        return this.f13547a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo50750e() {
        int i = this.f13548b;
        this.f13548b = i + 1;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo50751f() {
        for (C6360k0 a : this.f13547a.values()) {
            if (a.mo50565a()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo50752h() {
        if (mo50751f()) {
            m15336g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo50753i() {
        ScheduledFuture<?> scheduledFuture = this.f13555i;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.f13555i.cancel(false);
            }
            this.f13555i = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo50754j() {
        synchronized (this.f13547a) {
            ArrayList arrayList = new ArrayList(this.f13547a.values());
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C6360k0) it.next()).mo50566b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50744b(String str, C6327j0 j0Var) {
        synchronized (this.f13549c) {
            ArrayList arrayList = this.f13549c.get(str);
            if (arrayList != null) {
                arrayList.remove(j0Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50743a(String str, C6327j0 j0Var) {
        ArrayList arrayList = this.f13549c.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f13549c.put(str, arrayList);
        }
        arrayList.add(j0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo50746b(C6360k0 k0Var) {
        return mo50745b(k0Var.getAdcModuleId());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo50745b(int i) {
        synchronized (this.f13547a) {
            C6360k0 k0Var = (C6360k0) this.f13547a.remove(Integer.valueOf(i));
            if (k0Var == null) {
                return false;
            }
            k0Var.mo50569c();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50742a() {
        Context a;
        C6328k b = C6185a.m14887b();
        if (!b.mo50765E() && !b.mo50766F() && (a = C6185a.m14880a()) != null) {
            m15334b();
            C6509z0.m15953b((Runnable) new C6315a(a));
        }
    }

    /* renamed from: b */
    private void m15334b() {
        if (!this.f13552f) {
            synchronized (this.f13551e) {
                if (!this.f13552f) {
                    this.f13552f = true;
                    new Thread(new C6316b()).start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6361l mo50747c() {
        C6360k0 a = mo50740a(1);
        if (a instanceof C6361l) {
            return (C6361l) a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6360k0 mo50741a(C6360k0 k0Var) {
        synchronized (this.f13547a) {
            this.f13547a.put(Integer.valueOf(k0Var.getAdcModuleId()), k0Var);
            mo50752h();
        }
        return k0Var;
    }

    /* renamed from: a */
    private void m15328a(C6294f1 f1Var) {
        m15334b();
        this.f13551e.add(f1Var);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r4.hasNext() == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        ((com.adcolony.sdk.C6327j0) r4.next()).mo50430a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        new com.adcolony.sdk.C6288e0.C6289a().mo50643a((java.lang.Object) r3).mo50645a(com.adcolony.sdk.C6288e0.f13498i);
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r3 = new com.adcolony.sdk.C6312h0(r4);
        r4 = r1.iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m15331a(java.lang.String r3, com.adcolony.sdk.C6294f1 r4) {
        /*
            r2 = this;
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.adcolony.sdk.j0>> r0 = r2.f13549c
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.adcolony.sdk.j0>> r1 = r2.f13549c     // Catch:{ all -> 0x0041 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0041 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0041 }
            if (r3 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x000f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0041 }
            r1.<init>(r3)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            com.adcolony.sdk.h0 r3 = new com.adcolony.sdk.h0
            r3.<init>(r4)
            java.util.Iterator r4 = r1.iterator()
        L_0x001e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r4.next()
            com.adcolony.sdk.j0 r0 = (com.adcolony.sdk.C6327j0) r0
            r0.mo50430a(r3)     // Catch:{ RuntimeException -> 0x002e }
            goto L_0x001e
        L_0x002e:
            r3 = move-exception
            com.adcolony.sdk.e0$a r4 = new com.adcolony.sdk.e0$a
            r4.<init>()
            com.adcolony.sdk.e0$a r4 = r4.mo50643a((java.lang.Object) r3)
            com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C6288e0.f13498i
            r4.mo50645a((com.adcolony.sdk.C6288e0) r0)
            r3.printStackTrace()
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6314i0.m15331a(java.lang.String, com.adcolony.sdk.f1):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6360k0 mo50740a(int i) {
        return this.f13547a.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15335b(C6294f1 f1Var) {
        try {
            String e = f1Var.mo50694e("m_type");
            int b = f1Var.mo50684b("m_origin");
            C6318d dVar = new C6318d(e, f1Var);
            if (b >= 2) {
                C6509z0.m15953b((Runnable) dVar);
            } else {
                this.f13554h.execute(dVar);
            }
        } catch (RejectedExecutionException e2) {
            new C6288e0.C6289a().mo50644a("RejectedExecutionException from message dispatcher's dispatchNativeMessage(): ").mo50644a(e2.toString()).mo50645a(C6288e0.f13498i);
        } catch (JSONException e3) {
            new C6288e0.C6289a().mo50644a("JSON error from message dispatcher's dispatchNativeMessage(): ").mo50644a(e3.toString()).mo50645a(C6288e0.f13498i);
        }
    }
}
