package com.appodeal.ads.regulator;

import com.appodeal.ads.regulator.C9431a;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentForm;
import com.appodeal.consent.ConsentFormListener;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.regulator.e */
public final class C9455e extends ConsentFormListener {

    /* renamed from: a */
    public final /* synthetic */ C9448d f23987a;

    public C9455e(C9448d dVar) {
        this.f23987a = dVar;
    }

    public final void onConsentFormClosed(Consent consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        C9448d.m27959a(this.f23987a, new C9431a.C9432a(consent));
    }

    public final void onConsentFormLoaded(ConsentForm consentForm) {
        Intrinsics.checkNotNullParameter(consentForm, "consentForm");
        C9448d.m27959a(this.f23987a, new C9431a.C9436e(consentForm));
    }
}
