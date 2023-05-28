package com.bytedance.sdk.component.p293a;

/* renamed from: com.bytedance.sdk.component.a.d */
/* compiled from: BaseStatefulMethod */
public abstract class C10221d<P, R> extends C10219b<P, R> {

    /* renamed from: a */
    private boolean f25240a = true;

    /* renamed from: b */
    private C10222a f25241b;

    /* renamed from: c */
    private C10225f f25242c;

    /* renamed from: com.bytedance.sdk.component.a.d$a */
    /* compiled from: BaseStatefulMethod */
    interface C10222a {
        /* renamed from: a */
        void mo63034a(Object obj);

        /* renamed from: a */
        void mo63035a(Throwable th);
    }

    /* renamed from: com.bytedance.sdk.component.a.d$b */
    /* compiled from: BaseStatefulMethod */
    public interface C10223b {
        /* renamed from: a */
        C10221d mo2557a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2554a(P p, C10225f fVar) throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo2556d();

    /* renamed from: a */
    public /* bridge */ /* synthetic */ String mo63024a() {
        return super.mo63024a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63028a(R r) {
        if (m29341g()) {
            this.f25241b.mo63034a((Object) r);
            mo63032e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63030a(Throwable th) {
        if (m29341g()) {
            this.f25241b.mo63035a(th);
            mo63032e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo63031c() {
        mo63030a((Throwable) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo63032e() {
        this.f25240a = false;
        this.f25242c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63029a(P p, C10225f fVar, C10222a aVar) throws Exception {
        this.f25242c = fVar;
        this.f25241b = aVar;
        mo2554a(p, fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo63033f() {
        mo2556d();
        mo63032e();
    }

    /* renamed from: g */
    private boolean m29341g() {
        if (this.f25240a) {
            return true;
        }
        C10231i.m29375a((RuntimeException) new IllegalStateException("Jsb async call already finished: " + mo63024a() + ", hashcode: " + hashCode()));
        return false;
    }
}
