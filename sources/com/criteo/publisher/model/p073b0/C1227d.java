package com.criteo.publisher.model.p073b0;

import java.net.URL;

/* renamed from: com.criteo.publisher.model.b0.d */
/* compiled from: $AutoValue_NativeImpressionPixel */
abstract class C1227d extends C1246p {

    /* renamed from: a */
    private final URL f3851a;

    C1227d(URL url) {
        if (url != null) {
            this.f3851a = url;
            return;
        }
        throw new NullPointerException("Null url");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public URL mo3446a() {
        return this.f3851a;
    }

    public String toString() {
        return "NativeImpressionPixel{url=" + this.f3851a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1246p) {
            return this.f3851a.equals(((C1246p) obj).mo3446a());
        }
        return false;
    }

    public int hashCode() {
        return this.f3851a.hashCode() ^ 1000003;
    }
}
