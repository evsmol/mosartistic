package com.appodeal.consent;

import kotlin.Metadata;

@Metadata(mo38198d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, mo38199d2 = {"Lcom/appodeal/consent/IConsentFormListener;", "", "onConsentFormClosed", "", "consent", "Lcom/appodeal/consent/Consent;", "onConsentFormError", "error", "Lcom/appodeal/consent/ConsentManagerError;", "onConsentFormLoaded", "consentForm", "Lcom/appodeal/consent/ConsentForm;", "onConsentFormOpened", "apd_consent"}, mo38200k = 1, mo38201mv = {1, 6, 0}, mo38203xi = 48)
public interface IConsentFormListener {
    void onConsentFormClosed(Consent consent);

    void onConsentFormError(ConsentManagerError consentManagerError);

    void onConsentFormLoaded(ConsentForm consentForm);

    void onConsentFormOpened();
}
