package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.f */
class C6291f {

    /* renamed from: a */
    private boolean f13503a;

    C6291f() {
    }

    /* renamed from: a */
    public synchronized void mo50660a(long j) {
        if (!this.f13503a) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo50661a(boolean z) {
        this.f13503a = z;
        if (z) {
            notifyAll();
        }
    }

    /* renamed from: a */
    public boolean mo50662a() {
        return this.f13503a;
    }
}
