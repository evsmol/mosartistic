package com.criteo.publisher.model.p073b0;

import java.net.URI;

/* renamed from: com.criteo.publisher.model.b0.a */
/* compiled from: $AutoValue_NativeAdvertiser */
abstract class C1223a extends C1242m {

    /* renamed from: a */
    private final String f3838a;

    /* renamed from: b */
    private final String f3839b;

    /* renamed from: c */
    private final URI f3840c;

    /* renamed from: d */
    private final C1245o f3841d;

    C1223a(String str, String str2, URI uri, C1245o oVar) {
        if (str != null) {
            this.f3838a = str;
            if (str2 != null) {
                this.f3839b = str2;
                if (uri != null) {
                    this.f3840c = uri;
                    if (oVar != null) {
                        this.f3841d = oVar;
                        return;
                    }
                    throw new NullPointerException("Null logo");
                }
                throw new NullPointerException("Null logoClickUrl");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null domain");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo3422b() {
        return this.f3838a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo3421a() {
        return this.f3839b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public URI mo3424d() {
        return this.f3840c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1245o mo3423c() {
        return this.f3841d;
    }

    public String toString() {
        return "NativeAdvertiser{domain=" + this.f3838a + ", description=" + this.f3839b + ", logoClickUrl=" + this.f3840c + ", logo=" + this.f3841d + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1242m)) {
            return false;
        }
        C1242m mVar = (C1242m) obj;
        if (!this.f3838a.equals(mVar.mo3422b()) || !this.f3839b.equals(mVar.mo3421a()) || !this.f3840c.equals(mVar.mo3424d()) || !this.f3841d.equals(mVar.mo3423c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f3838a.hashCode() ^ 1000003) * 1000003) ^ this.f3839b.hashCode()) * 1000003) ^ this.f3840c.hashCode()) * 1000003) ^ this.f3841d.hashCode();
    }
}
