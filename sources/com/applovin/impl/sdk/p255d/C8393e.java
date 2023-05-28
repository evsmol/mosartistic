package com.applovin.impl.sdk.p255d;

/* renamed from: com.applovin.impl.sdk.d.e */
public final class C8393e {

    /* renamed from: a */
    private long f21075a;

    /* renamed from: b */
    private long f21076b;

    /* renamed from: c */
    private boolean f21077c;

    /* renamed from: d */
    private long f21078d;

    /* renamed from: e */
    private long f21079e;

    /* renamed from: f */
    private int f21080f;

    /* renamed from: g */
    private Exception f21081g;

    /* renamed from: a */
    public void mo57140a() {
        this.f21077c = true;
    }

    /* renamed from: a */
    public void mo57141a(int i) {
        this.f21080f = i;
    }

    /* renamed from: a */
    public void mo57142a(long j) {
        this.f21075a += j;
    }

    /* renamed from: a */
    public void mo57143a(Exception exc) {
        this.f21081g = exc;
    }

    /* renamed from: b */
    public void mo57144b() {
        this.f21078d++;
    }

    /* renamed from: b */
    public void mo57145b(long j) {
        this.f21076b += j;
    }

    /* renamed from: c */
    public void mo57146c() {
        this.f21079e++;
    }

    /* renamed from: d */
    public Exception mo57147d() {
        return this.f21081g;
    }

    /* renamed from: e */
    public int mo57148e() {
        return this.f21080f;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f21075a + ", totalCachedBytes=" + this.f21076b + ", isHTMLCachingCancelled=" + this.f21077c + ", htmlResourceCacheSuccessCount=" + this.f21078d + ", htmlResourceCacheFailureCount=" + this.f21079e + '}';
    }
}
