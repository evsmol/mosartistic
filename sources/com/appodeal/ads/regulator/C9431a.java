package com.appodeal.ads.regulator;

import com.appodeal.ads.C9203h0;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentForm;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.regulator.a */
public interface C9431a {

    /* renamed from: com.appodeal.ads.regulator.a$a */
    public static final class C9432a implements C9431a {

        /* renamed from: a */
        public final Consent f23954a;

        public C9432a(Consent consent) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            this.f23954a = consent;
        }

        /* renamed from: a */
        public final Consent mo60640a() {
            return this.f23954a;
        }

        public final String toString() {
            return Intrinsics.stringPlus("Consent form closed. Current consent: ", this.f23954a.toJson());
        }
    }

    /* renamed from: com.appodeal.ads.regulator.a$b */
    public static final class C9433b implements C9431a {

        /* renamed from: a */
        public final Consent f23955a;

        /* renamed from: b */
        public final boolean f23956b;

        public C9433b(Consent consent, boolean z) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            this.f23955a = consent;
            this.f23956b = z;
        }

        /* renamed from: a */
        public final Consent mo60642a() {
            return this.f23955a;
        }

        /* renamed from: b */
        public final boolean mo60643b() {
            return this.f23956b;
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("Consent loaded [consent: ");
            a.append(this.f23955a.toJson());
            a.append(", shouldShowConsentView: ");
            a.append(this.f23956b);
            a.append(']');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.regulator.a$c */
    public static final class C9434c implements C9431a {

        /* renamed from: a */
        public final Consent f23957a;

        public C9434c(Consent consent) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            this.f23957a = consent;
        }

        /* renamed from: a */
        public final Consent mo60645a() {
            return this.f23957a;
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("Consent received successfully [consent: ");
            a.append(this.f23957a.toJson());
            a.append(']');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.regulator.a$d */
    public static final class C9435d implements C9431a {

        /* renamed from: a */
        public final Throwable f23958a;

        public C9435d(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "cause");
            this.f23958a = th;
        }

        /* renamed from: a */
        public final Throwable mo60647a() {
            return this.f23958a;
        }
    }

    /* renamed from: com.appodeal.ads.regulator.a$e */
    public static final class C9436e implements C9431a {

        /* renamed from: a */
        public final ConsentForm f23959a;

        public C9436e(ConsentForm consentForm) {
            Intrinsics.checkNotNullParameter(consentForm, "consentForm");
            this.f23959a = consentForm;
        }

        /* renamed from: a */
        public final ConsentForm mo60648a() {
            return this.f23959a;
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("Form loaded [consentForm: ");
            a.append(this.f23959a);
            a.append(']');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.regulator.a$f */
    public static final class C9437f implements C9431a {

        /* renamed from: a */
        public final String f23960a;

        /* renamed from: b */
        public final Consent f23961b;

        /* renamed from: c */
        public final Consent.Status f23962c;

        /* renamed from: d */
        public final Consent.Zone f23963d;

        public C9437f(String str, Consent consent, Consent.Status status, Consent.Zone zone) {
            Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
            this.f23960a = str;
            this.f23961b = consent;
            this.f23962c = status;
            this.f23963d = zone;
        }

        /* renamed from: a */
        public final String mo60650a() {
            return this.f23960a;
        }

        /* renamed from: b */
        public final Consent mo60651b() {
            return this.f23961b;
        }

        /* renamed from: c */
        public final Consent.Status mo60652c() {
            return this.f23962c;
        }

        /* renamed from: d */
        public final Consent.Zone mo60653d() {
            return this.f23963d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9437f)) {
                return false;
            }
            C9437f fVar = (C9437f) obj;
            return Intrinsics.areEqual((Object) this.f23960a, (Object) fVar.f23960a) && Intrinsics.areEqual((Object) this.f23961b, (Object) fVar.f23961b) && this.f23962c == fVar.f23962c && this.f23963d == fVar.f23963d;
        }

        public final int hashCode() {
            int hashCode = this.f23960a.hashCode() * 31;
            Consent consent = this.f23961b;
            int i = 0;
            int hashCode2 = (hashCode + (consent == null ? 0 : consent.hashCode())) * 31;
            Consent.Status status = this.f23962c;
            int hashCode3 = (hashCode2 + (status == null ? 0 : status.hashCode())) * 31;
            Consent.Zone zone = this.f23963d;
            if (zone != null) {
                i = zone.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("OnStarted(appKey=");
            a.append(this.f23960a);
            a.append(", publisherConsent=");
            a.append(this.f23961b);
            a.append(", status=");
            a.append(this.f23962c);
            a.append(", zone=");
            a.append(this.f23963d);
            a.append(')');
            return a.toString();
        }
    }
}
