package com.appodeal.consent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p150io.bidmachine.protobuf.EventTypeExtended;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\b\b\u0018\u0000 92\u00020\u0001:\u0005\u001f:;<=Bi\b\u0000\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b5\u00106B\u0011\b\u0010\u0012\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b5\u00108J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003Ji\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0001J\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001c\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0011\u0010/\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0011\u00102\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00104\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u00101¨\u0006>"}, mo38199d2 = {"Lcom/appodeal/consent/Consent;", "", "", "bundle", "", "hasConsentForVendor", "Lorg/json/JSONObject;", "toJson", "Lcom/appodeal/consent/Consent$Status;", "component1", "Lcom/appodeal/consent/Consent$Zone;", "component2", "component7", "status", "zone", "", "version", "payload", "", "createdAt", "updatedAt", "iab", "sdk", "", "Lcom/appodeal/consent/Vendor;", "acceptedVendors", "copy", "toString", "hashCode", "other", "equals", "a", "Lcom/appodeal/consent/Consent$Status;", "getStatus", "()Lcom/appodeal/consent/Consent$Status;", "b", "Lcom/appodeal/consent/Consent$Zone;", "getZone", "()Lcom/appodeal/consent/Consent$Zone;", "g", "Lorg/json/JSONObject;", "getIab", "()Lorg/json/JSONObject;", "isGDPRScope", "()Z", "isCCPAScope", "getBooleanStatus", "booleanStatus", "getIABConsentString", "()Ljava/lang/String;", "IABConsentString", "getUSPrivacyString", "USPrivacyString", "<init>", "(Lcom/appodeal/consent/Consent$Status;Lcom/appodeal/consent/Consent$Zone;ILjava/lang/String;JJLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/util/List;)V", "json", "(Lorg/json/JSONObject;)V", "Companion", "HasConsent", "ShouldShow", "Status", "Zone", "apd_consent"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class Consent {
    public static final C9746a Companion = new C9746a();

    /* renamed from: a */
    public final Status f24696a;

    /* renamed from: b */
    public final Zone f24697b;

    /* renamed from: c */
    public final int f24698c;

    /* renamed from: d */
    public final String f24699d;

    /* renamed from: e */
    public final long f24700e;

    /* renamed from: f */
    public final long f24701f;

    /* renamed from: g */
    public final JSONObject f24702g;

    /* renamed from: h */
    public final JSONObject f24703h;

    /* renamed from: i */
    public final List<Vendor> f24704i;

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo38199d2 = {"Lcom/appodeal/consent/Consent$HasConsent;", "", "UNKNOWN", "TRUE", "FALSE", "apd_consent"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public enum HasConsent {
        UNKNOWN,
        TRUE,
        FALSE
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo38199d2 = {"Lcom/appodeal/consent/Consent$ShouldShow;", "", "UNKNOWN", "TRUE", "FALSE", "apd_consent"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public enum ShouldShow {
        UNKNOWN,
        TRUE,
        FALSE
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo38199d2 = {"Lcom/appodeal/consent/Consent$Status;", "", "UNKNOWN", "NON_PERSONALIZED", "PARTLY_PERSONALIZED", "PERSONALIZED", "apd_consent"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public enum Status {
        UNKNOWN,
        NON_PERSONALIZED,
        PARTLY_PERSONALIZED,
        PERSONALIZED
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo38199d2 = {"Lcom/appodeal/consent/Consent$Zone;", "", "UNKNOWN", "NONE", "GDPR", "CCPA", "apd_consent"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public enum Zone {
        UNKNOWN,
        NONE,
        GDPR,
        CCPA
    }

    /* renamed from: com.appodeal.consent.Consent$a */
    public static final class C9746a {
    }

    public Consent() {
        this((Status) null, (Zone) null, 0, (String) null, 0, 0, (JSONObject) null, (JSONObject) null, (List) null, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, (DefaultConstructorMarker) null);
    }

    public Consent(Status status, Zone zone, int i, String str, long j, long j2, JSONObject jSONObject, JSONObject jSONObject2, List<Vendor> list) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(zone, "zone");
        Intrinsics.checkNotNullParameter(str, "payload");
        Intrinsics.checkNotNullParameter(jSONObject, "iab");
        Intrinsics.checkNotNullParameter(jSONObject2, "sdk");
        Intrinsics.checkNotNullParameter(list, "acceptedVendors");
        this.f24696a = status;
        this.f24697b = zone;
        this.f24698c = i;
        this.f24699d = str;
        this.f24700e = j;
        this.f24701f = j2;
        this.f24702g = jSONObject;
        this.f24703h = jSONObject2;
        this.f24704i = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Consent(com.appodeal.consent.Consent.Status r12, com.appodeal.consent.Consent.Zone r13, int r14, java.lang.String r15, long r16, long r18, org.json.JSONObject r20, org.json.JSONObject r21, java.util.List r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r11 = this;
            r0 = r23
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            com.appodeal.consent.Consent$Status r1 = com.appodeal.consent.Consent.Status.UNKNOWN
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0011
            com.appodeal.consent.Consent$Zone r2 = com.appodeal.consent.Consent.Zone.UNKNOWN
            goto L_0x0012
        L_0x0011:
            r2 = r13
        L_0x0012:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0018
            r3 = 0
            goto L_0x0019
        L_0x0018:
            r3 = r14
        L_0x0019:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0023
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            goto L_0x0024
        L_0x0023:
            r4 = r15
        L_0x0024:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L_0x002c
            r8 = r6
            goto L_0x002e
        L_0x002c:
            r8 = r16
        L_0x002e:
            r5 = r0 & 32
            if (r5 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r6 = r18
        L_0x0035:
            r5 = r0 & 64
            if (r5 == 0) goto L_0x003f
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            goto L_0x0041
        L_0x003f:
            r5 = r20
        L_0x0041:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x004b
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            goto L_0x004d
        L_0x004b:
            r10 = r21
        L_0x004d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0056
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0058
        L_0x0056:
            r0 = r22
        L_0x0058:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r3
            r16 = r4
            r17 = r8
            r19 = r6
            r21 = r5
            r22 = r10
            r23 = r0
            r12.<init>(r13, r14, r15, r16, r17, r19, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.Consent.<init>(com.appodeal.consent.Consent$Status, com.appodeal.consent.Consent$Zone, int, java.lang.String, long, long, org.json.JSONObject, org.json.JSONObject, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Consent(org.json.JSONObject r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.appodeal.consent.Consent$Status[] r1 = com.appodeal.consent.Consent.Status.values()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x000e:
            r5 = 0
            if (r4 >= r2) goto L_0x0026
            r6 = r1[r4]
            int r4 = r4 + 1
            java.lang.String r7 = r6.name()
            java.lang.String r8 = "status"
            java.lang.String r8 = r0.optString(r8)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x000e
            goto L_0x0027
        L_0x0026:
            r6 = r5
        L_0x0027:
            if (r6 != 0) goto L_0x002b
            com.appodeal.consent.Consent$Status r6 = com.appodeal.consent.Consent.Status.UNKNOWN
        L_0x002b:
            r8 = r6
            com.appodeal.consent.Consent$Zone[] r1 = com.appodeal.consent.Consent.Zone.values()
            int r2 = r1.length
        L_0x0031:
            if (r3 >= r2) goto L_0x0048
            r4 = r1[r3]
            int r3 = r3 + 1
            java.lang.String r6 = r4.name()
            java.lang.String r7 = "zone"
            java.lang.String r7 = r0.optString(r7)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0031
            r5 = r4
        L_0x0048:
            if (r5 != 0) goto L_0x004e
            com.appodeal.consent.Consent$Zone r1 = com.appodeal.consent.Consent.Zone.UNKNOWN
            r9 = r1
            goto L_0x004f
        L_0x004e:
            r9 = r5
        L_0x004f:
            java.lang.String r1 = "payload"
            java.lang.String r11 = r0.optString(r1)
            java.lang.String r1 = "createdAt"
            long r12 = r0.optLong(r1)
            java.lang.String r1 = "updatedAt"
            long r14 = r0.optLong(r1)
            java.lang.String r1 = "vendorListVersion"
            int r10 = r0.optInt(r1)
            java.lang.String r1 = "iab"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            if (r1 != 0) goto L_0x0074
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x0074:
            r16 = r1
            java.lang.String r1 = "sdk"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            if (r1 != 0) goto L_0x0083
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x0083:
            r17 = r1
            java.lang.String r1 = "acceptedVendors"
            org.json.JSONArray r0 = r0.optJSONArray(r1)
            java.util.List r0 = com.appodeal.ads.modules.common.internal.ext.JsonExtKt.asList(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x009e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b3
            java.lang.Object r2 = r0.next()
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            com.appodeal.consent.Vendor r3 = new com.appodeal.consent.Vendor
            r3.<init>(r2)
            r1.add(r3)
            goto L_0x009e
        L_0x00b3:
            java.lang.String r0 = "optString(\"payload\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r7 = r19
            r18 = r1
            r7.<init>(r8, r9, r10, r11, r12, r14, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.Consent.<init>(org.json.JSONObject):void");
    }

    public static /* synthetic */ Consent copy$default(Consent consent, Status status, Zone zone, int i, String str, long j, long j2, JSONObject jSONObject, JSONObject jSONObject2, List list, int i2, Object obj) {
        Consent consent2 = consent;
        int i3 = i2;
        return consent.copy((i3 & 1) != 0 ? consent2.f24696a : status, (i3 & 2) != 0 ? consent2.f24697b : zone, (i3 & 4) != 0 ? consent2.f24698c : i, (i3 & 8) != 0 ? consent2.f24699d : str, (i3 & 16) != 0 ? consent2.f24700e : j, (i3 & 32) != 0 ? consent2.f24701f : j2, (i3 & 64) != 0 ? consent2.f24702g : jSONObject, (i3 & 128) != 0 ? consent2.f24703h : jSONObject2, (i3 & 256) != 0 ? consent2.f24704i : list);
    }

    public final Status component1() {
        return this.f24696a;
    }

    public final Zone component2() {
        return this.f24697b;
    }

    public final JSONObject component7() {
        return this.f24702g;
    }

    public final Consent copy(Status status, Zone zone, int i, String str, long j, long j2, JSONObject jSONObject, JSONObject jSONObject2, List<Vendor> list) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(zone, "zone");
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "payload");
        JSONObject jSONObject3 = jSONObject;
        Intrinsics.checkNotNullParameter(jSONObject3, "iab");
        JSONObject jSONObject4 = jSONObject2;
        Intrinsics.checkNotNullParameter(jSONObject4, "sdk");
        List<Vendor> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "acceptedVendors");
        return new Consent(status, zone, i, str2, j, j2, jSONObject3, jSONObject4, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Consent)) {
            return false;
        }
        Consent consent = (Consent) obj;
        return this.f24696a == consent.f24696a && this.f24697b == consent.f24697b && this.f24698c == consent.f24698c && Intrinsics.areEqual((Object) this.f24699d, (Object) consent.f24699d) && this.f24700e == consent.f24700e && this.f24701f == consent.f24701f && Intrinsics.areEqual((Object) this.f24702g, (Object) consent.f24702g) && Intrinsics.areEqual((Object) this.f24703h, (Object) consent.f24703h) && Intrinsics.areEqual((Object) this.f24704i, (Object) consent.f24704i);
    }

    public final boolean getBooleanStatus() {
        Status status = this.f24696a;
        return status == Status.PERSONALIZED || status == Status.PARTLY_PERSONALIZED;
    }

    public final String getIABConsentString() {
        String optString = this.f24702g.optString("IABConsent_ConsentString");
        Intrinsics.checkNotNullExpressionValue(optString, "iab.optString(\"IABConsent_ConsentString\")");
        return optString;
    }

    public final JSONObject getIab() {
        return this.f24702g;
    }

    public final Status getStatus() {
        return this.f24696a;
    }

    public final String getUSPrivacyString() {
        String optString = this.f24702g.optString("IABUSPrivacy_String");
        Intrinsics.checkNotNullExpressionValue(optString, "iab.optString(\"IABUSPrivacy_String\")");
        return optString;
    }

    public final Zone getZone() {
        return this.f24697b;
    }

    public final boolean hasConsentForVendor(String str) {
        T t;
        if (str == null) {
            return false;
        }
        Iterator<T> it = this.f24704i.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual((Object) ((Vendor) t).getBundle(), (Object) str)) {
                break;
            }
        }
        return ((Vendor) t) != null;
    }

    public int hashCode() {
        int hashCode = this.f24697b.hashCode();
        int i = this.f24698c;
        int hashCode2 = this.f24699d.hashCode();
        int hashCode3 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f24700e);
        int hashCode4 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f24701f);
        int hashCode5 = this.f24702g.hashCode();
        int hashCode6 = this.f24703h.hashCode();
        return this.f24704i.hashCode() + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((i + ((hashCode + (this.f24696a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isCCPAScope() {
        return this.f24697b == Zone.CCPA;
    }

    public final boolean isGDPRScope() {
        return this.f24697b == Zone.GDPR;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("zone", getZone());
        jSONObject.put("status", getStatus());
        Integer valueOf = Integer.valueOf(this.f24698c);
        boolean z = true;
        JSONArray jSONArray = null;
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        jSONObject.put("vendorListVersion", valueOf);
        String str = this.f24699d;
        if (!(str.length() > 0)) {
            str = null;
        }
        jSONObject.put("payload", str);
        Long valueOf2 = Long.valueOf(this.f24700e);
        if (!(valueOf2.longValue() != 0)) {
            valueOf2 = null;
        }
        jSONObject.put("createdAt", valueOf2);
        Long valueOf3 = Long.valueOf(this.f24701f);
        if (!(valueOf3.longValue() != 0)) {
            valueOf3 = null;
        }
        jSONObject.put("updatedAt", valueOf3);
        JSONObject iab = getIab();
        if (!(iab.length() != 0)) {
            iab = null;
        }
        jSONObject.put("iab", iab);
        JSONObject jSONObject2 = this.f24703h;
        if (!(jSONObject2.length() != 0)) {
            jSONObject2 = null;
        }
        jSONObject.put("sdk", jSONObject2);
        List<Vendor> list = this.f24704i;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Vendor json$apd_consent : list) {
            arrayList.add(json$apd_consent.toJson$apd_consent());
        }
        JSONArray jSONArray2 = new JSONArray(arrayList);
        if (jSONArray2.length() == 0) {
            z = false;
        }
        if (z) {
            jSONArray = jSONArray2;
        }
        jSONObject.put("acceptedVendors", jSONArray);
        return jSONObject;
    }

    public String toString() {
        return "Consent(status=" + this.f24696a + ", zone=" + this.f24697b + ", version=" + this.f24698c + ", payload=" + this.f24699d + ", createdAt=" + this.f24700e + ", updatedAt=" + this.f24701f + ", iab=" + this.f24702g + ", sdk=" + this.f24703h + ", acceptedVendors=" + this.f24704i + ')';
    }
}
