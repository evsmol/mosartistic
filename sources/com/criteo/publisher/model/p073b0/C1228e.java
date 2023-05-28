package com.criteo.publisher.model.p073b0;

import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URL;

/* renamed from: com.criteo.publisher.model.b0.e */
/* compiled from: $AutoValue_NativePrivacy */
abstract class C1228e extends C1247q {

    /* renamed from: a */
    private final URI f3852a;

    /* renamed from: b */
    private final URL f3853b;

    /* renamed from: c */
    private final String f3854c;

    C1228e(URI uri, URL url, String str) {
        if (uri != null) {
            this.f3852a = uri;
            if (url != null) {
                this.f3853b = url;
                if (str != null) {
                    this.f3854c = str;
                    return;
                }
                throw new NullPointerException("Null legalText");
            }
            throw new NullPointerException("Null imageUrl");
        }
        throw new NullPointerException("Null clickUrl");
    }

    /* access modifiers changed from: package-private */
    @SerializedName("optoutClickUrl")
    /* renamed from: a */
    public URI mo3450a() {
        return this.f3852a;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("optoutImageUrl")
    /* renamed from: b */
    public URL mo3451b() {
        return this.f3853b;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("longLegalText")
    /* renamed from: c */
    public String mo3452c() {
        return this.f3854c;
    }

    public String toString() {
        return "NativePrivacy{clickUrl=" + this.f3852a + ", imageUrl=" + this.f3853b + ", legalText=" + this.f3854c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1247q)) {
            return false;
        }
        C1247q qVar = (C1247q) obj;
        if (!this.f3852a.equals(qVar.mo3450a()) || !this.f3853b.equals(qVar.mo3451b()) || !this.f3854c.equals(qVar.mo3452c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f3852a.hashCode() ^ 1000003) * 1000003) ^ this.f3853b.hashCode()) * 1000003) ^ this.f3854c.hashCode();
    }
}
