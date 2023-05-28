package com.criteo.publisher.model.p073b0;

import java.net.URI;

/* renamed from: com.criteo.publisher.model.b0.f */
/* compiled from: $AutoValue_NativeProduct */
abstract class C1229f extends C1248r {

    /* renamed from: a */
    private final String f3855a;

    /* renamed from: b */
    private final String f3856b;

    /* renamed from: c */
    private final String f3857c;

    /* renamed from: d */
    private final URI f3858d;

    /* renamed from: e */
    private final String f3859e;

    /* renamed from: f */
    private final C1245o f3860f;

    C1229f(String str, String str2, String str3, URI uri, String str4, C1245o oVar) {
        if (str != null) {
            this.f3855a = str;
            if (str2 != null) {
                this.f3856b = str2;
                if (str3 != null) {
                    this.f3857c = str3;
                    if (uri != null) {
                        this.f3858d = uri;
                        if (str4 != null) {
                            this.f3859e = str4;
                            if (oVar != null) {
                                this.f3860f = oVar;
                                return;
                            }
                            throw new NullPointerException("Null image");
                        }
                        throw new NullPointerException("Null callToAction");
                    }
                    throw new NullPointerException("Null clickUrl");
                }
                throw new NullPointerException("Null price");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null title");
    }

    /* renamed from: g */
    public String mo3462g() {
        return this.f3855a;
    }

    /* renamed from: c */
    public String mo3458c() {
        return this.f3856b;
    }

    /* renamed from: f */
    public String mo3461f() {
        return this.f3857c;
    }

    /* renamed from: b */
    public URI mo3457b() {
        return this.f3858d;
    }

    /* renamed from: a */
    public String mo3456a() {
        return this.f3859e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1245o mo3459d() {
        return this.f3860f;
    }

    public String toString() {
        return "NativeProduct{title=" + this.f3855a + ", description=" + this.f3856b + ", price=" + this.f3857c + ", clickUrl=" + this.f3858d + ", callToAction=" + this.f3859e + ", image=" + this.f3860f + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1248r)) {
            return false;
        }
        C1248r rVar = (C1248r) obj;
        if (!this.f3855a.equals(rVar.mo3462g()) || !this.f3856b.equals(rVar.mo3458c()) || !this.f3857c.equals(rVar.mo3461f()) || !this.f3858d.equals(rVar.mo3457b()) || !this.f3859e.equals(rVar.mo3456a()) || !this.f3860f.equals(rVar.mo3459d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((this.f3855a.hashCode() ^ 1000003) * 1000003) ^ this.f3856b.hashCode()) * 1000003) ^ this.f3857c.hashCode()) * 1000003) ^ this.f3858d.hashCode()) * 1000003) ^ this.f3859e.hashCode()) * 1000003) ^ this.f3860f.hashCode();
    }
}
