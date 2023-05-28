package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.appsetid.C10700a;
import com.yandex.metrica.appsetid.C10703c;
import com.yandex.metrica.appsetid.C10704d;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.Bb */
public final class C1889Bb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile C1861Ab f5099a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CountDownLatch f5100b = new CountDownLatch(1);

    /* renamed from: c */
    private final long f5101c = 20;

    /* renamed from: d */
    private final C10700a f5102d = new C1890a(this);

    /* renamed from: e */
    private final Context f5103e;

    /* renamed from: f */
    private final C10704d f5104f;

    public C1889Bb(Context context, C10704d dVar) {
        this.f5103e = context;
        this.f5104f = dVar;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Bb$a */
    public static final class C1890a implements C10700a {

        /* renamed from: a */
        final /* synthetic */ C1889Bb f5105a;

        C1890a(C1889Bb bb) {
            this.f5105a = bb;
        }

        /* renamed from: a */
        public void mo15552a(String str, C10703c cVar) {
            this.f5105a.f5099a = new C1861Ab(str, cVar);
            this.f5105a.f5100b.countDown();
        }

        /* renamed from: a */
        public void mo15553a(Throwable th) {
            this.f5105a.f5100b.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:1|2|(2:4|5)|6|7|(1:9)(1:10)|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.yandex.metrica.impl.p082ob.C1861Ab mo15551a() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.yandex.metrica.impl.ob.Ab r0 = r4.f5099a     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x001f
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x001f }
            r1 = 1
            r0.<init>(r1)     // Catch:{ all -> 0x001f }
            r4.f5100b = r0     // Catch:{ all -> 0x001f }
            com.yandex.metrica.appsetid.d r0 = r4.f5104f     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r4.f5103e     // Catch:{ all -> 0x001f }
            com.yandex.metrica.appsetid.a r2 = r4.f5102d     // Catch:{ all -> 0x001f }
            r0.mo15628a(r1, r2)     // Catch:{ all -> 0x001f }
            java.util.concurrent.CountDownLatch r0 = r4.f5100b     // Catch:{ all -> 0x001f }
            long r1 = r4.f5101c     // Catch:{ all -> 0x001f }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x001f }
            r0.await(r1, r3)     // Catch:{ all -> 0x001f }
        L_0x001f:
            com.yandex.metrica.impl.ob.Ab r0 = r4.f5099a     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0024
            goto L_0x002e
        L_0x0024:
            com.yandex.metrica.impl.ob.Ab r0 = new com.yandex.metrica.impl.ob.Ab     // Catch:{ all -> 0x0030 }
            com.yandex.metrica.appsetid.c r1 = com.yandex.metrica.appsetid.C10703c.UNKNOWN     // Catch:{ all -> 0x0030 }
            r2 = 0
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0030 }
            r4.f5099a = r0     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r4)
            return r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C1889Bb.mo15551a():com.yandex.metrica.impl.ob.Ab");
    }
}
