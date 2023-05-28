package com.bytedance.sdk.component.p328f;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.C10638l;

/* renamed from: com.bytedance.sdk.component.f.b */
/* compiled from: DelegateRunnable */
class C10611b implements Comparable, Runnable {

    /* renamed from: a */
    private C10618g f26478a = null;

    /* renamed from: b */
    private C10607a f26479b = null;

    /* renamed from: c */
    private long f26480c = 0;

    /* renamed from: d */
    private Thread f26481d = null;

    public C10611b(C10618g gVar, C10607a aVar) {
        this.f26478a = gVar;
        this.f26479b = aVar;
        this.f26480c = SystemClock.uptimeMillis();
    }

    public void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - this.f26480c;
        this.f26481d = Thread.currentThread();
        C10618g gVar = this.f26478a;
        if (gVar != null) {
            gVar.run();
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (this.f26479b != null) {
            C10613d.m31152a();
        }
        if (C10638l.m31232a()) {
            Object[] objArr = new Object[8];
            objArr[0] = "run: pool  = ";
            C10607a aVar = this.f26479b;
            String str = "null";
            objArr[1] = aVar != null ? aVar.mo64226a() : str;
            objArr[2] = " waitTime =";
            objArr[3] = Long.valueOf(j);
            objArr[4] = " taskCost = ";
            objArr[5] = Long.valueOf(uptimeMillis2);
            objArr[6] = " name=";
            C10618g gVar2 = this.f26478a;
            if (gVar2 != null) {
                str = gVar2.mo64256b();
            }
            objArr[7] = str;
            C10638l.m31231a("DelegateRunnable", objArr);
        }
    }

    /* renamed from: a */
    public C10618g mo64241a() {
        return this.f26478a;
    }

    public int compareTo(Object obj) {
        if (obj instanceof C10611b) {
            return this.f26478a.compareTo(((C10611b) obj).mo64241a());
        }
        return 0;
    }

    public int hashCode() {
        return this.f26478a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f26478a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof com.bytedance.sdk.component.p328f.C10611b
            if (r0 == 0) goto L_0x0016
            com.bytedance.sdk.component.f.g r0 = r1.f26478a
            if (r0 == 0) goto L_0x0016
            com.bytedance.sdk.component.f.b r2 = (com.bytedance.sdk.component.p328f.C10611b) r2
            com.bytedance.sdk.component.f.g r2 = r2.mo64241a()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p328f.C10611b.equals(java.lang.Object):boolean");
    }
}
