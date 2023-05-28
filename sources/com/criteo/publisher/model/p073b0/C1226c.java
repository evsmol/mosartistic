package com.criteo.publisher.model.p073b0;

import java.net.URL;

/* renamed from: com.criteo.publisher.model.b0.c */
/* compiled from: $AutoValue_NativeImage */
abstract class C1226c extends C1245o {

    /* renamed from: a */
    private final URL f3850a;

    C1226c(URL url) {
        if (url != null) {
            this.f3850a = url;
            return;
        }
        throw new NullPointerException("Null url");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public URL mo3442a() {
        return this.f3850a;
    }

    public String toString() {
        return "NativeImage{url=" + this.f3850a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1245o) {
            return this.f3850a.equals(((C1245o) obj).mo3442a());
        }
        return false;
    }

    public int hashCode() {
        return this.f3850a.hashCode() ^ 1000003;
    }
}
