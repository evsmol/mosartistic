package com.applovin.impl.adview;

import android.os.Handler;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.adview.j */
public final class C7995j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8626v f19316a;

    /* renamed from: b */
    private final Handler f19317b;

    /* renamed from: c */
    private final Set<C7998b> f19318c = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AtomicInteger f19319d = new AtomicInteger();

    /* renamed from: com.applovin.impl.adview.j$a */
    public interface C7997a {
        /* renamed from: a */
        void mo55597a();

        /* renamed from: b */
        boolean mo55598b();
    }

    /* renamed from: com.applovin.impl.adview.j$b */
    private static class C7998b {

        /* renamed from: a */
        private final String f19323a;

        /* renamed from: b */
        private final C7997a f19324b;

        /* renamed from: c */
        private final long f19325c;

        private C7998b(String str, long j, C7997a aVar) {
            this.f19323a = str;
            this.f19325c = j;
            this.f19324b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m23758a() {
            return this.f19323a;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public long m23760b() {
            return this.f19325c;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C7997a m23763c() {
            return this.f19324b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7998b)) {
                return false;
            }
            String str = this.f19323a;
            String str2 = ((C7998b) obj).f19323a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f19323a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f19323a + '\'' + ", countdownStepMillis=" + this.f19325c + '}';
        }
    }

    public C7995j(Handler handler, C8490n nVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        } else if (nVar != null) {
            this.f19317b = handler;
            this.f19316a = nVar.mo57320D();
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23749a(final C7998b bVar, final int i) {
        this.f19317b.postDelayed(new Runnable() {
            public void run() {
                C7997a b = bVar.m23763c();
                if (!b.mo55598b()) {
                    C8626v unused = C7995j.this.f19316a;
                    if (C8626v.m26252a()) {
                        C8626v b2 = C7995j.this.f19316a;
                        b2.mo57818b("CountdownManager", "Ending countdown for " + bVar.m23758a());
                    }
                } else if (C7995j.this.f19319d.get() == i) {
                    try {
                        b.mo55597a();
                        C7995j.this.m23749a(bVar, i);
                    } catch (Throwable th) {
                        C8626v unused2 = C7995j.this.f19316a;
                        if (C8626v.m26252a()) {
                            C8626v b3 = C7995j.this.f19316a;
                            b3.mo57819b("CountdownManager", "Encountered error on countdown step for: " + bVar.m23758a(), th);
                        }
                        C7995j.this.mo55745b();
                    }
                } else {
                    C8626v unused3 = C7995j.this.f19316a;
                    if (C8626v.m26252a()) {
                        C8626v b4 = C7995j.this.f19316a;
                        b4.mo57821d("CountdownManager", "Killing duplicate countdown from previous generation: " + bVar.m23758a());
                    }
                }
            }
        }, bVar.m23760b());
    }

    /* renamed from: a */
    public void mo55743a() {
        HashSet<C7998b> hashSet = new HashSet<>(this.f19318c);
        if (C8626v.m26252a()) {
            C8626v vVar = this.f19316a;
            vVar.mo57818b("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.f19319d.incrementAndGet();
        for (C7998b bVar : hashSet) {
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f19316a;
                vVar2.mo57818b("CountdownManager", "Starting countdown: " + bVar.m23758a() + " for generation " + incrementAndGet + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            m23749a(bVar, incrementAndGet);
        }
    }

    /* renamed from: a */
    public void mo55744a(String str, long j, C7997a aVar) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        } else if (this.f19317b != null) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f19316a;
                vVar.mo57818b("CountdownManager", "Adding countdown: " + str);
            }
            this.f19318c.add(new C7998b(str, j, aVar));
        } else {
            throw new IllegalArgumentException("No handler specified.");
        }
    }

    /* renamed from: b */
    public void mo55745b() {
        if (C8626v.m26252a()) {
            this.f19316a.mo57818b("CountdownManager", "Removing all countdowns...");
        }
        mo55746c();
        this.f19318c.clear();
    }

    /* renamed from: c */
    public void mo55746c() {
        if (C8626v.m26252a()) {
            this.f19316a.mo57818b("CountdownManager", "Stopping countdowns...");
        }
        this.f19319d.incrementAndGet();
        this.f19317b.removeCallbacksAndMessages((Object) null);
    }
}
