package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Uc */
public abstract class C2599Uc<T> implements C2270Lb<T> {

    /* renamed from: a */
    private final C3641x2 f6879a;

    /* renamed from: b */
    private final C2994gc f6880b;

    public C2599Uc(C2994gc gcVar, C3641x2 x2Var) {
        this.f6880b = gcVar;
        this.f6879a = x2Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo16273a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16766a(long j) {
        C3641x2 x2Var = this.f6879a;
        long lastAttemptTimeSeconds = this.f6880b.getLastAttemptTimeSeconds();
        return x2Var.mo18390b(lastAttemptTimeSeconds, j, "last " + mo16273a() + " scan attempt");
    }
}
