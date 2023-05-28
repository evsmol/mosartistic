package com.appodeal.ads.regulator;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.consent.Consent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo38199d2 = {"Lcom/appodeal/ads/regulator/GDPRUserConsent;", "", "Lcom/appodeal/ads/regulator/UserConsent;", "Lcom/appodeal/consent/Consent$Zone;", "a", "Lcom/appodeal/consent/Consent$Zone;", "getZone", "()Lcom/appodeal/consent/Consent$Zone;", "zone", "Unknown", "Personalized", "NonPersonalized", "apd_core"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public enum GDPRUserConsent implements UserConsent {
    ;
    

    /* renamed from: a */
    public final Consent.Zone f23950a;

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo38199d2 = {"Lcom/appodeal/ads/regulator/GDPRUserConsent$NonPersonalized;", "Lcom/appodeal/ads/regulator/GDPRUserConsent;", "apd_core"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class NonPersonalized extends GDPRUserConsent {

        /* renamed from: b */
        public final Consent.Status f23951b;

        public NonPersonalized() {
            super("NonPersonalized", 2, (DefaultConstructorMarker) null);
            this.f23951b = Consent.Status.NON_PERSONALIZED;
        }

        public final Consent.Status getStatus() {
            return this.f23951b;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo38199d2 = {"Lcom/appodeal/ads/regulator/GDPRUserConsent$Personalized;", "Lcom/appodeal/ads/regulator/GDPRUserConsent;", "apd_core"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class Personalized extends GDPRUserConsent {

        /* renamed from: b */
        public final Consent.Status f23952b;

        public Personalized() {
            super("Personalized", 1, (DefaultConstructorMarker) null);
            this.f23952b = Consent.Status.PERSONALIZED;
        }

        public final Consent.Status getStatus() {
            return this.f23952b;
        }
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo38199d2 = {"Lcom/appodeal/ads/regulator/GDPRUserConsent$Unknown;", "Lcom/appodeal/ads/regulator/GDPRUserConsent;", "apd_core"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class Unknown extends GDPRUserConsent {

        /* renamed from: b */
        public final Consent.Status f23953b;

        public Unknown() {
            super(LogConstants.KEY_UNKNOWN, 0, (DefaultConstructorMarker) null);
            this.f23953b = Consent.Status.UNKNOWN;
        }

        public final Consent.Status getStatus() {
            return this.f23953b;
        }
    }

    public Consent.Zone getZone() {
        return this.f23950a;
    }
}
