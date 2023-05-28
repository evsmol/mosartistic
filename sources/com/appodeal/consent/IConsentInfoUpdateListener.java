package com.appodeal.consent;

import kotlin.Metadata;

@Metadata(mo38198d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, mo38199d2 = {"Lcom/appodeal/consent/IConsentInfoUpdateListener;", "", "onConsentInfoUpdated", "", "consent", "Lcom/appodeal/consent/Consent;", "onFailedToUpdateConsentInfo", "error", "Lcom/appodeal/consent/ConsentManagerError;", "apd_consent"}, mo38200k = 1, mo38201mv = {1, 6, 0}, mo38203xi = 48)
public interface IConsentInfoUpdateListener {
    void onConsentInfoUpdated(Consent consent);

    void onFailedToUpdateConsentInfo(ConsentManagerError consentManagerError);
}
