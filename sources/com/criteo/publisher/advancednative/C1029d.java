package com.criteo.publisher.advancednative;

import java.net.URL;

/* renamed from: com.criteo.publisher.advancednative.d */
/* compiled from: AutoValue_CriteoMedia */
final class C1029d extends CriteoMedia {

    /* renamed from: a */
    private final URL f3414a;

    C1029d(URL url) {
        if (url != null) {
            this.f3414a = url;
            return;
        }
        throw new NullPointerException("Null imageUrl");
    }

    /* access modifiers changed from: package-private */
    public URL getImageUrl() {
        return this.f3414a;
    }

    public String toString() {
        return "CriteoMedia{imageUrl=" + this.f3414a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CriteoMedia) {
            return this.f3414a.equals(((CriteoMedia) obj).getImageUrl());
        }
        return false;
    }

    public int hashCode() {
        return this.f3414a.hashCode() ^ 1000003;
    }
}
