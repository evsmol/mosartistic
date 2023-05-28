package com.adcolony.sdk;

import android.content.ContentValues;
import com.adcolony.sdk.C6288e0;
import com.adcolony.sdk.C6385n0;
import com.adcolony.sdk.C6390o;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* renamed from: com.adcolony.sdk.o0 */
class C6396o0 {

    /* renamed from: e */
    private static C6396o0 f13720e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6385n0 f13721a;

    /* renamed from: b */
    private final ExecutorService f13722b = C6509z0.m15970h();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6390o.C6392b f13723c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f13724d = false;

    /* renamed from: com.adcolony.sdk.o0$a */
    class C6397a implements C6475x<C6390o.C6392b> {

        /* renamed from: a */
        final /* synthetic */ C6390o.C6392b[] f13725a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f13726b;

        C6397a(C6396o0 o0Var, C6390o.C6392b[] bVarArr, CountDownLatch countDownLatch) {
            this.f13725a = bVarArr;
            this.f13726b = countDownLatch;
        }

        /* renamed from: a */
        public void mo50820a(C6390o.C6392b bVar) {
            this.f13725a[0] = bVar;
            this.f13726b.countDown();
        }
    }

    /* renamed from: com.adcolony.sdk.o0$b */
    class C6398b implements C6475x<C6390o.C6392b> {
        C6398b(C6396o0 o0Var) {
        }

        /* renamed from: a */
        public void mo50820a(C6390o.C6392b bVar) {
        }
    }

    /* renamed from: com.adcolony.sdk.o0$c */
    class C6399c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6475x f13727a;

        /* renamed from: b */
        final /* synthetic */ long f13728b;

        C6399c(C6475x xVar, long j) {
            this.f13727a = xVar;
            this.f13728b = j;
        }

        public void run() {
            C6390o.C6392b bVar;
            C6475x xVar = this.f13727a;
            if (C6396o0.this.f13724d) {
                bVar = C6396o0.this.f13723c;
            } else {
                bVar = C6450v.m15783a().mo51042a(C6396o0.this.f13721a, this.f13728b);
            }
            xVar.mo50820a(bVar);
        }
    }

    C6396o0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo50893d() {
        this.f13724d = false;
    }

    /* renamed from: c */
    static C6396o0 m15589c() {
        if (f13720e == null) {
            synchronized (C6396o0.class) {
                if (f13720e == null) {
                    f13720e = new C6396o0();
                }
            }
        }
        return f13720e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50888a(C6385n0 n0Var) {
        this.f13721a = n0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6390o.C6392b mo50892b() {
        return this.f13723c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = r3.mo50707p("request_type");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50887a(com.adcolony.sdk.C6312h0 r3) {
        /*
            r2 = this;
            com.adcolony.sdk.n0 r0 = r2.f13721a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.adcolony.sdk.f1 r3 = r3.mo50732a()
            if (r3 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.String r0 = "payload"
            com.adcolony.sdk.f1 r3 = r3.mo50705n(r0)
            if (r3 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r0 = "request_type"
            java.lang.String r0 = r3.mo50707p(r0)
            com.adcolony.sdk.n0 r1 = r2.f13721a
            com.adcolony.sdk.n0$a r1 = r1.mo50855a((java.lang.String) r0)
            if (r1 == 0) goto L_0x0026
            r2.m15585a(r0, r3, r1)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6396o0.mo50887a(com.adcolony.sdk.h0):void");
    }

    /* renamed from: a */
    private void m15585a(String str, C6294f1 f1Var, C6385n0.C6386a aVar) {
        try {
            ContentValues a = m15584a(f1Var, aVar);
            C6450v.m15783a().mo51046a(aVar.mo50863f(), a);
            C6450v.m15783a().mo51044a(aVar, a);
            mo50893d();
        } catch (NullPointerException | NumberFormatException e) {
            e.printStackTrace();
            C6288e0.C6289a aVar2 = new C6288e0.C6289a();
            C6288e0.C6289a a2 = aVar2.mo50644a("Error parsing event:" + str + " ").mo50644a(f1Var.toString());
            a2.mo50644a("Schema version: " + this.f13721a.mo50857b() + " ").mo50644a(" e: ").mo50644a(e.toString()).mo50645a(C6288e0.f13496g);
        }
    }

    /* renamed from: a */
    static ContentValues m15584a(C6294f1 f1Var, C6385n0.C6386a aVar) throws NumberFormatException, NullPointerException {
        ContentValues contentValues = new ContentValues();
        for (C6385n0.C6387b next : aVar.mo50858a()) {
            Object o = f1Var.mo50706o(next.mo50866b());
            if (o != null) {
                if (o instanceof Boolean) {
                    contentValues.put(next.mo50866b(), (Boolean) o);
                } else if (o instanceof Long) {
                    contentValues.put(next.mo50866b(), (Long) o);
                } else if (o instanceof Double) {
                    contentValues.put(next.mo50866b(), (Double) o);
                } else if (o instanceof Number) {
                    Number number = (Number) o;
                    if (number.doubleValue() != ((double) number.longValue()) || !"INTEGER".equalsIgnoreCase(next.mo50867c())) {
                        contentValues.put(next.mo50866b(), Double.valueOf(number.doubleValue()));
                    } else {
                        contentValues.put(next.mo50866b(), Long.valueOf(number.longValue()));
                    }
                } else if (o instanceof String) {
                    contentValues.put(next.mo50866b(), (String) o);
                }
            }
        }
        return contentValues;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6390o.C6392b mo50885a(long j) {
        C6390o.C6392b[] bVarArr = new C6390o.C6392b[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mo50891a((C6475x<C6390o.C6392b>) new C6397a(this, bVarArr, countDownLatch), j);
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return bVarArr[0];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50886a() {
        mo50890a((C6475x<C6390o.C6392b>) new C6398b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50890a(C6475x<C6390o.C6392b> xVar) {
        mo50891a(xVar, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50891a(C6475x<C6390o.C6392b> xVar, long j) {
        if (this.f13721a == null) {
            xVar.mo50820a(null);
        } else if (this.f13724d) {
            xVar.mo50820a(this.f13723c);
        } else if (!C6509z0.m15941a(this.f13722b, (Runnable) new C6399c(xVar, j))) {
            new C6288e0.C6289a().mo50644a("Execute ADCOdtEventsListener.calculateFeatureVectors failed").mo50645a(C6288e0.f13498i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50889a(C6390o.C6392b bVar) {
        this.f13723c = bVar;
        this.f13724d = true;
    }
}
