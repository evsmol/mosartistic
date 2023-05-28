package com.ironsource.mediationsdk.adunit.p129c.p131b;

/* renamed from: com.ironsource.mediationsdk.adunit.c.b.a */
public final class C4576a {

    /* renamed from: a */
    public C4577a f11262a;

    /* renamed from: b */
    public long f11263b;

    /* renamed from: c */
    public long f11264c;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.b.a$a */
    public enum C4577a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public C4576a(C4577a aVar, long j, long j2) {
        this.f11262a = aVar;
        this.f11263b = j;
        this.f11264c = j2;
    }

    /* renamed from: a */
    public final boolean mo33807a() {
        return this.f11262a == C4577a.MANUAL || this.f11262a == C4577a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }

    /* renamed from: b */
    public final boolean mo33808b() {
        return this.f11262a == C4577a.AUTOMATIC_LOAD_AFTER_CLOSE || this.f11262a == C4577a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}
