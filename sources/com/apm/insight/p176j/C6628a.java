package com.apm.insight.p176j;

import android.os.Handler;

/* renamed from: com.apm.insight.j.a */
public abstract class C6628a implements Runnable {

    /* renamed from: a */
    private Handler f14248a;

    /* renamed from: b */
    private final long f14249b;

    /* renamed from: c */
    private final long f14250c;

    C6628a(Handler handler, long j, long j2) {
        this.f14248a = handler;
        this.f14249b = j;
        this.f14250c = j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52113a() {
        int i = (mo52115b() > 0 ? 1 : (mo52115b() == 0 ? 0 : -1));
        Handler handler = this.f14248a;
        if (i > 0) {
            handler.postDelayed(this, mo52115b());
        } else {
            handler.post(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52114a(long j) {
        if (j > 0) {
            this.f14248a.postDelayed(this, j);
        } else {
            this.f14248a.post(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo52115b() {
        return this.f14249b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo52116c() {
        return this.f14250c;
    }
}
