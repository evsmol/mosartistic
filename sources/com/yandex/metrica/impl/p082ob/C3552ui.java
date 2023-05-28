package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.ui */
public class C3552ui {

    /* renamed from: a */
    public final C3553a f9246a;

    /* renamed from: b */
    public final C3553a f9247b;

    /* renamed from: com.yandex.metrica.impl.ob.ui$a */
    public static class C3553a {

        /* renamed from: a */
        public final int f9248a;

        /* renamed from: b */
        public final long f9249b;

        public C3553a(int i, long j) {
            this.f9248a = i;
            this.f9249b = j;
        }

        public String toString() {
            return "Item{refreshEventCount=" + this.f9248a + ", refreshPeriodSeconds=" + this.f9249b + '}';
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ui$b */
    public enum C3554b {
        WIFI,
        CELL
    }

    public C3552ui(C3553a aVar, C3553a aVar2) {
        this.f9246a = aVar;
        this.f9247b = aVar2;
    }

    public String toString() {
        return "ThrottlingConfig{cell=" + this.f9246a + ", wifi=" + this.f9247b + '}';
    }
}
