package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.G */
public class C2036G<T> {

    /* renamed from: e */
    public static final C2121If.C2126c f5424e = new C2121If.C2126c();

    /* renamed from: a */
    private volatile long f5425a;

    /* renamed from: b */
    private volatile long f5426b;

    /* renamed from: c */
    private long f5427c = 0;

    /* renamed from: d */
    private T f5428d = null;

    public C2036G(long j, long j2) {
        this.f5425a = j;
        this.f5426b = j2;
    }

    /* renamed from: a */
    public T mo15792a() {
        return this.f5428d;
    }

    /* renamed from: b */
    public final boolean mo15795b() {
        return this.f5428d == null;
    }

    /* renamed from: c */
    public final boolean mo15796c() {
        if (this.f5427c == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f5427c;
        if (currentTimeMillis > this.f5426b || currentTimeMillis < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo15797d() {
        long currentTimeMillis = System.currentTimeMillis() - this.f5427c;
        return currentTimeMillis > this.f5425a || currentTimeMillis < 0;
    }

    public String toString() {
        return "CachedData{refreshTime=" + this.f5425a + ", mCachedTime=" + this.f5427c + ", expiryTime=" + this.f5426b + ", mCachedData=" + this.f5428d + '}';
    }

    /* renamed from: a */
    public void mo15794a(T t) {
        this.f5428d = t;
        this.f5427c = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo15793a(long j, long j2) {
        this.f5425a = j;
        this.f5426b = j2;
    }
}
