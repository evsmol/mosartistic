package com.adcolony.sdk;

public class AdColonyAdOptions {

    /* renamed from: a */
    boolean f13147a;

    /* renamed from: b */
    boolean f13148b;

    /* renamed from: c */
    AdColonyUserMetadata f13149c;

    /* renamed from: d */
    C6294f1 f13150d = C6235c0.m15073b();

    public AdColonyAdOptions enableConfirmationDialog(boolean z) {
        this.f13147a = z;
        C6235c0.m15079b(this.f13150d, "confirmation_enabled", true);
        return this;
    }

    public AdColonyAdOptions enableResultsDialog(boolean z) {
        this.f13148b = z;
        C6235c0.m15079b(this.f13150d, "results_enabled", true);
        return this;
    }

    public Object getOption(String str) {
        return C6235c0.m15086g(this.f13150d, str);
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f13149c;
    }

    public AdColonyAdOptions setOption(String str, boolean z) {
        if (C6509z0.m15964e(str)) {
            C6235c0.m15079b(this.f13150d, str, z);
        }
        return this;
    }

    @Deprecated
    public AdColonyAdOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f13149c = adColonyUserMetadata;
        C6235c0.m15069a(this.f13150d, "user_metadata", adColonyUserMetadata.f13227b);
        return this;
    }

    public AdColonyAdOptions setOption(String str, double d) {
        if (C6509z0.m15964e(str)) {
            C6235c0.m15067a(this.f13150d, str, d);
        }
        return this;
    }

    public AdColonyAdOptions setOption(String str, String str2) {
        if (str != null) {
            C6235c0.m15070a(this.f13150d, str, str2);
        }
        return this;
    }
}
