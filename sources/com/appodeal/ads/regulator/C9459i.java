package com.appodeal.ads.regulator;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.consent.Consent;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.regulator.i */
public final class C9459i implements C9458h {

    /* renamed from: a */
    public boolean f23997a;

    /* renamed from: b */
    public boolean f23998b;

    /* renamed from: c */
    public Consent f23999c;

    /* renamed from: d */
    public UserConsent f24000d;

    /* renamed from: e */
    public Boolean f24001e;

    /* renamed from: f */
    public Consent f24002f;

    /* renamed from: g */
    public boolean f24003g;

    @DebugMetadata(mo38568c = "com.appodeal.ads.regulator.RegulatorProvider", mo38569f = "RegulatorProvider.kt", mo38570l = {60}, mo38571m = "receiveRegulatorData")
    /* renamed from: com.appodeal.ads.regulator.i$a */
    public static final class C9460a extends ContinuationImpl {

        /* renamed from: a */
        public C9459i f24004a;

        /* renamed from: b */
        public /* synthetic */ Object f24005b;

        /* renamed from: c */
        public final /* synthetic */ C9459i f24006c;

        /* renamed from: d */
        public int f24007d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9460a(C9459i iVar, Continuation<? super C9460a> continuation) {
            super(continuation);
            this.f24006c = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24005b = obj;
            this.f24007d |= RecyclerView.UNDEFINED_DURATION;
            return this.f24006c.mo60663a((Context) null, (String) null, this);
        }
    }

    /* renamed from: a */
    public final void mo60664a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        this.f23997a = jSONObject.has("gdpr");
        this.f23998b = jSONObject.has("ccpa");
        this.f24003g = jSONObject.optBoolean("consent", true);
    }

    /* renamed from: a */
    public final boolean mo60668a(Boolean bool) {
        if (Intrinsics.areEqual((Object) this.f24001e, (Object) bool)) {
            return false;
        }
        this.f24001e = bool;
        return true;
    }

    /* renamed from: b */
    public final boolean mo60670b() {
        Boolean bool;
        Consent consent = this.f23999c;
        Boolean bool2 = null;
        if (consent == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(consent.getBooleanStatus());
        }
        if (bool == null) {
            Consent consent2 = this.f24002f;
            if (consent2 != null) {
                bool2 = Boolean.valueOf(consent2.getBooleanStatus());
            }
            if (bool2 == null) {
                bool = this.f24001e;
                if (bool == null) {
                    return false;
                }
            } else {
                bool = bool2;
            }
        }
        return bool.booleanValue();
    }

    /* renamed from: c */
    public final Consent mo60671c() {
        return this.f23999c;
    }

    /* renamed from: d */
    public final Boolean mo60672d() {
        return this.f24001e;
    }

    /* renamed from: e */
    public final boolean mo60673e() {
        return this.f24003g && mo60670b();
    }

    /* renamed from: f */
    public final String mo60674f() {
        String str;
        Consent consent = this.f23999c;
        if (consent == null) {
            str = null;
        } else {
            str = consent.getIABConsentString();
        }
        if (str != null) {
            return str;
        }
        Consent consent2 = this.f24002f;
        if (consent2 == null) {
            return null;
        }
        return consent2.getIABConsentString();
    }

    /* renamed from: g */
    public final boolean mo60675g() {
        Boolean bool;
        Consent consent = this.f23999c;
        Boolean bool2 = null;
        if (consent == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(consent.isCCPAScope());
        }
        if (bool == null) {
            Consent consent2 = this.f24002f;
            if (consent2 != null) {
                bool2 = Boolean.valueOf(consent2.isCCPAScope());
            }
            if (bool2 == null) {
                return this.f23998b;
            }
            bool = bool2;
        }
        return bool.booleanValue();
    }

    public final String getUSPrivacyString() {
        String str;
        Consent consent = this.f23999c;
        if (consent == null) {
            str = null;
        } else {
            str = consent.getUSPrivacyString();
        }
        if (str != null) {
            return str;
        }
        Consent consent2 = this.f24002f;
        if (consent2 == null) {
            return null;
        }
        return consent2.getUSPrivacyString();
    }

    /* renamed from: a */
    public final boolean mo60667a(Consent consent) {
        if (Intrinsics.areEqual((Object) this.f24002f, (Object) consent)) {
            return false;
        }
        this.f24002f = consent;
        return true;
    }

    /* renamed from: a */
    public final boolean mo60666a(UserConsent userConsent) {
        Intrinsics.checkNotNullParameter(userConsent, "publisherZoneConsent");
        if (Intrinsics.areEqual((Object) this.f24000d, (Object) userConsent)) {
            return false;
        }
        this.f24000d = userConsent;
        return true;
    }

    /* renamed from: a */
    public final boolean mo60669a(String str) {
        Boolean bool;
        if (this.f24003g) {
            Consent consent = this.f24002f;
            if (consent == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(consent.hasConsentForVendor(str));
            }
            if (bool == null ? mo60673e() : bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo60665a() {
        Boolean bool;
        Consent consent = this.f23999c;
        Boolean bool2 = null;
        if (consent == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(consent.isGDPRScope());
        }
        if (bool == null) {
            Consent consent2 = this.f24002f;
            if (consent2 != null) {
                bool2 = Boolean.valueOf(consent2.isGDPRScope());
            }
            if (bool2 == null) {
                return this.f23997a;
            }
            bool = bool2;
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60663a(android.content.Context r8, java.lang.String r9, kotlin.coroutines.Continuation<? super com.appodeal.consent.Consent> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.appodeal.ads.regulator.C9459i.C9460a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.appodeal.ads.regulator.i$a r0 = (com.appodeal.ads.regulator.C9459i.C9460a) r0
            int r1 = r0.f24007d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24007d = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.regulator.i$a r0 = new com.appodeal.ads.regulator.i$a
            r0.<init>(r7, r10)
        L_0x0018:
            r6 = r0
            java.lang.Object r10 = r6.f24005b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f24007d
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            com.appodeal.ads.regulator.i r8 = r6.f24004a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0084
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r10)
            com.appodeal.ads.regulator.UserConsent r10 = r7.f24000d
            java.lang.Boolean r1 = r7.f24001e
            if (r10 == 0) goto L_0x004a
            com.appodeal.consent.Consent$Status r1 = r10.getStatus()
            com.appodeal.consent.Consent$Zone r10 = r10.getZone()
            kotlin.Pair r10 = kotlin.TuplesKt.m14544to(r1, r10)
            goto L_0x0063
        L_0x004a:
            if (r1 == 0) goto L_0x005e
            boolean r10 = r1.booleanValue()
            if (r10 == 0) goto L_0x0055
            com.appodeal.consent.Consent$Status r10 = com.appodeal.consent.Consent.Status.PERSONALIZED
            goto L_0x0057
        L_0x0055:
            com.appodeal.consent.Consent$Status r10 = com.appodeal.consent.Consent.Status.NON_PERSONALIZED
        L_0x0057:
            com.appodeal.consent.Consent$Zone r1 = com.appodeal.consent.Consent.Zone.UNKNOWN
            kotlin.Pair r10 = kotlin.TuplesKt.m14544to(r10, r1)
            goto L_0x0063
        L_0x005e:
            r10 = 0
            kotlin.Pair r10 = kotlin.TuplesKt.m14544to(r10, r10)
        L_0x0063:
            java.lang.Object r1 = r10.component1()
            r4 = r1
            com.appodeal.consent.Consent$Status r4 = (com.appodeal.consent.Consent.Status) r4
            java.lang.Object r10 = r10.component2()
            r5 = r10
            com.appodeal.consent.Consent$Zone r5 = (com.appodeal.consent.Consent.Zone) r5
            com.appodeal.ads.regulator.d r1 = com.appodeal.ads.regulator.C9447c.m27957a(r8)
            com.appodeal.consent.Consent r3 = r7.f24002f
            r6.f24004a = r7
            r6.f24007d = r2
            r2 = r9
            java.lang.Object r10 = r1.mo60658a((java.lang.String) r2, (com.appodeal.consent.Consent) r3, (com.appodeal.consent.Consent.Status) r4, (com.appodeal.consent.Consent.Zone) r5, (kotlin.coroutines.Continuation<? super com.appodeal.consent.Consent>) r6)
            if (r10 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r8 = r7
        L_0x0084:
            com.appodeal.consent.Consent r10 = (com.appodeal.consent.Consent) r10
            if (r10 != 0) goto L_0x008c
            com.appodeal.consent.Consent r10 = com.appodeal.consent.ConsentManager.getConsent()
        L_0x008c:
            r8.f23999c = r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.regulator.C9459i.mo60663a(android.content.Context, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
