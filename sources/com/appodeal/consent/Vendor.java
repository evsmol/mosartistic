package com.appodeal.consent;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001(BY\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0018\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b$\u0010%B\u0011\b\u0010\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b$\u0010'J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006)"}, mo38199d2 = {"Lcom/appodeal/consent/Vendor;", "", "Lorg/json/JSONObject;", "toJson$apd_consent", "()Lorg/json/JSONObject;", "toJson", "", "a", "I", "getId", "()I", "id", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "c", "getBundle", "bundle", "d", "getPolicyUrl", "policyUrl", "", "e", "Ljava/util/List;", "getPurposeIds", "()Ljava/util/List;", "purposeIds", "f", "getFeatureIds", "featureIds", "g", "getLegitimateInterestPurposeIds", "legitimateInterestPurposeIds", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "json", "(Lorg/json/JSONObject;)V", "Builder", "apd_consent"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class Vendor {

    /* renamed from: a */
    public final int f24718a;

    /* renamed from: b */
    public final String f24719b;

    /* renamed from: c */
    public final String f24720c;

    /* renamed from: d */
    public final String f24721d;

    /* renamed from: e */
    public final List<Integer> f24722e;

    /* renamed from: f */
    public final List<Integer> f24723f;

    /* renamed from: g */
    public final List<Integer> f24724g;

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B]\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004J\u0014\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJj\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0017"}, mo38199d2 = {"Lcom/appodeal/consent/Vendor$Builder;", "", "", "id", "", "purposeIds", "featureIds", "legitimateInterestPurposeIds", "Lcom/appodeal/consent/Vendor;", "build", "", "name", "bundle", "policyUrl", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/appodeal/consent/Vendor$Builder;", "toString", "hashCode", "other", "", "equals", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "apd_consent"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public static final class Builder {

        /* renamed from: a */
        public Integer f24725a;

        /* renamed from: b */
        public String f24726b;

        /* renamed from: c */
        public String f24727c;

        /* renamed from: d */
        public String f24728d;

        /* renamed from: e */
        public List<Integer> f24729e;

        /* renamed from: f */
        public List<Integer> f24730f;

        /* renamed from: g */
        public List<Integer> f24731g;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(Integer num, String str, String str2, String str3) {
            this(num, str, str2, str3, (List) null, (List) null, (List) null, 112, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            Intrinsics.checkNotNullParameter(str2, "bundle");
            Intrinsics.checkNotNullParameter(str3, "policyUrl");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(java.lang.Integer r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.List<java.lang.Integer> r16) {
            /*
                r11 = this;
                java.lang.String r0 = "name"
                r3 = r13
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                java.lang.String r0 = "bundle"
                r4 = r14
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.lang.String r0 = "policyUrl"
                r5 = r15
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                java.lang.String r0 = "purposeIds"
                r6 = r16
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r7 = 0
                r8 = 0
                r9 = 96
                r10 = 0
                r1 = r11
                r2 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.Vendor.Builder.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(java.lang.Integer r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.List<java.lang.Integer> r16, java.util.List<java.lang.Integer> r17) {
            /*
                r11 = this;
                java.lang.String r0 = "name"
                r3 = r13
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                java.lang.String r0 = "bundle"
                r4 = r14
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.lang.String r0 = "policyUrl"
                r5 = r15
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                java.lang.String r0 = "purposeIds"
                r6 = r16
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "featureIds"
                r7 = r17
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r8 = 0
                r9 = 64
                r10 = 0
                r1 = r11
                r2 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.Vendor.Builder.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void");
        }

        public Builder(Integer num, String str, String str2, String str3, List<Integer> list, List<Integer> list2, List<Integer> list3) {
            Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            Intrinsics.checkNotNullParameter(str2, "bundle");
            Intrinsics.checkNotNullParameter(str3, "policyUrl");
            Intrinsics.checkNotNullParameter(list, "purposeIds");
            Intrinsics.checkNotNullParameter(list2, "featureIds");
            Intrinsics.checkNotNullParameter(list3, "legitimateInterestPurposeIds");
            this.f24725a = num;
            this.f24726b = str;
            this.f24727c = str2;
            this.f24728d = str3;
            this.f24729e = list;
            this.f24730f = list2;
            this.f24731g = list3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(Integer num, String str, String str2, String str3, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, str, str2, str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? CollectionsKt.emptyList() : list3);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(String str, String str2, String str3) {
            this((Integer) null, str, str2, str3, (List) null, (List) null, (List) null, 113, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            Intrinsics.checkNotNullParameter(str2, "bundle");
            Intrinsics.checkNotNullParameter(str3, "policyUrl");
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Integer num, String str, String str2, String str3, List<Integer> list, List<Integer> list2, List<Integer> list3, int i, Object obj) {
            if ((i & 1) != 0) {
                num = builder.f24725a;
            }
            if ((i & 2) != 0) {
                str = builder.f24726b;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                str2 = builder.f24727c;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = builder.f24728d;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                list = builder.f24729e;
            }
            List<Integer> list4 = list;
            if ((i & 32) != 0) {
                list2 = builder.f24730f;
            }
            List<Integer> list5 = list2;
            if ((i & 64) != 0) {
                list3 = builder.f24731g;
            }
            return builder.copy(num, str4, str5, str6, list4, list5, list3);
        }

        public final Vendor build() {
            Integer num = this.f24725a;
            return new Vendor(num == null ? -this.f24727c.hashCode() : num.intValue(), this.f24726b, this.f24727c, this.f24728d, this.f24729e, this.f24730f, this.f24731g);
        }

        public final Builder copy(Integer num, String str, String str2, String str3, List<Integer> list, List<Integer> list2, List<Integer> list3) {
            Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            Intrinsics.checkNotNullParameter(str2, "bundle");
            Intrinsics.checkNotNullParameter(str3, "policyUrl");
            Intrinsics.checkNotNullParameter(list, "purposeIds");
            Intrinsics.checkNotNullParameter(list2, "featureIds");
            List<Integer> list4 = list3;
            Intrinsics.checkNotNullParameter(list4, "legitimateInterestPurposeIds");
            return new Builder(num, str, str2, str3, list, list2, list4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return Intrinsics.areEqual((Object) this.f24725a, (Object) builder.f24725a) && Intrinsics.areEqual((Object) this.f24726b, (Object) builder.f24726b) && Intrinsics.areEqual((Object) this.f24727c, (Object) builder.f24727c) && Intrinsics.areEqual((Object) this.f24728d, (Object) builder.f24728d) && Intrinsics.areEqual((Object) this.f24729e, (Object) builder.f24729e) && Intrinsics.areEqual((Object) this.f24730f, (Object) builder.f24730f) && Intrinsics.areEqual((Object) this.f24731g, (Object) builder.f24731g);
        }

        public final Builder featureIds(List<Integer> list) {
            Intrinsics.checkNotNullParameter(list, "featureIds");
            this.f24730f = list;
            return this;
        }

        public int hashCode() {
            Integer num = this.f24725a;
            int hashCode = num == null ? 0 : num.hashCode();
            int hashCode2 = this.f24726b.hashCode();
            int hashCode3 = this.f24727c.hashCode();
            int hashCode4 = this.f24728d.hashCode();
            int hashCode5 = this.f24729e.hashCode();
            return this.f24731g.hashCode() + ((this.f24730f.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + (hashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        /* renamed from: id */
        public final Builder mo61310id(int i) {
            this.f24725a = Integer.valueOf(i);
            return this;
        }

        public final Builder legitimateInterestPurposeIds(List<Integer> list) {
            Intrinsics.checkNotNullParameter(list, "legitimateInterestPurposeIds");
            this.f24731g = list;
            return this;
        }

        public final Builder purposeIds(List<Integer> list) {
            Intrinsics.checkNotNullParameter(list, "purposeIds");
            this.f24729e = list;
            return this;
        }

        public String toString() {
            return "Builder(id=" + this.f24725a + ", name=" + this.f24726b + ", bundle=" + this.f24727c + ", policyUrl=" + this.f24728d + ", purposeIds=" + this.f24729e + ", featureIds=" + this.f24730f + ", legitimateInterestPurposeIds=" + this.f24731g + ')';
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Vendor(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, (List) null, (List) null, (List) null, 112, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter(str2, "bundle");
        Intrinsics.checkNotNullParameter(str3, "policyUrl");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Vendor(int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.List<java.lang.Integer> r16) {
        /*
            r11 = this;
            java.lang.String r0 = "name"
            r3 = r13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "bundle"
            r4 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "policyUrl"
            r5 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "purposeIds"
            r6 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r7 = 0
            r8 = 0
            r9 = 96
            r10 = 0
            r1 = r11
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.Vendor.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Vendor(int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.List<java.lang.Integer> r16, java.util.List<java.lang.Integer> r17) {
        /*
            r11 = this;
            java.lang.String r0 = "name"
            r3 = r13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "bundle"
            r4 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "policyUrl"
            r5 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "purposeIds"
            r6 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "featureIds"
            r7 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r8 = 0
            r9 = 64
            r10 = 0
            r1 = r11
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.Vendor.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void");
    }

    public Vendor(int i, String str, String str2, String str3, List<Integer> list, List<Integer> list2, List<Integer> list3) {
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter(str2, "bundle");
        Intrinsics.checkNotNullParameter(str3, "policyUrl");
        Intrinsics.checkNotNullParameter(list, "purposeIds");
        Intrinsics.checkNotNullParameter(list2, "featureIds");
        Intrinsics.checkNotNullParameter(list3, "legitimateInterestPurposeIds");
        this.f24718a = i;
        this.f24719b = str;
        this.f24720c = str2;
        this.f24721d = str3;
        this.f24722e = list;
        this.f24723f = list2;
        this.f24724g = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Vendor(int i, String str, String str2, String str3, List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Vendor(org.json.JSONObject r10) {
        /*
            r9 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "apdId"
            int r2 = r10.optInt(r0)
            java.lang.String r0 = "name"
            java.lang.String r3 = r10.optString(r0)
            java.lang.String r0 = "json.optString(\"name\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            java.lang.String r0 = "status"
            java.lang.String r4 = r10.optString(r0)
            java.lang.String r0 = "json.optString(\"status\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            java.lang.String r0 = "policyUrl"
            java.lang.String r5 = r10.optString(r0)
            java.lang.String r0 = "json.optString(\"policyUrl\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            java.lang.String r0 = "purposeIds"
            org.json.JSONArray r0 = r10.optJSONArray(r0)
            java.util.List r6 = com.appodeal.ads.modules.common.internal.ext.JsonExtKt.asList(r0)
            java.lang.String r0 = "featureIds"
            org.json.JSONArray r0 = r10.optJSONArray(r0)
            java.util.List r7 = com.appodeal.ads.modules.common.internal.ext.JsonExtKt.asList(r0)
            java.lang.String r0 = "legIntPurposeIds"
            org.json.JSONArray r10 = r10.optJSONArray(r0)
            java.util.List r8 = com.appodeal.ads.modules.common.internal.ext.JsonExtKt.asList(r10)
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.Vendor.<init>(org.json.JSONObject):void");
    }

    public final String getBundle() {
        return this.f24720c;
    }

    public final List<Integer> getFeatureIds() {
        return this.f24723f;
    }

    public final int getId() {
        return this.f24718a;
    }

    public final List<Integer> getLegitimateInterestPurposeIds() {
        return this.f24724g;
    }

    public final String getName() {
        return this.f24719b;
    }

    public final String getPolicyUrl() {
        return this.f24721d;
    }

    public final List<Integer> getPurposeIds() {
        return this.f24722e;
    }

    public final JSONObject toJson$apd_consent() {
        JSONObject jSONObject = new JSONObject();
        Integer valueOf = Integer.valueOf(getId());
        boolean z = true;
        JSONArray jSONArray = null;
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        jSONObject.put("apdId", valueOf);
        String name = getName();
        if (!(name.length() > 0)) {
            name = null;
        }
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, name);
        String bundle = getBundle();
        if (!(bundle.length() > 0)) {
            bundle = null;
        }
        jSONObject.put("status", bundle);
        String policyUrl = getPolicyUrl();
        if (!(policyUrl.length() > 0)) {
            policyUrl = null;
        }
        jSONObject.put("policyUrl", policyUrl);
        JSONArray jSONArray2 = new JSONArray(getPurposeIds());
        if (!(jSONArray2.length() != 0)) {
            jSONArray2 = null;
        }
        jSONObject.put("purposeIds", jSONArray2);
        JSONArray jSONArray3 = new JSONArray(getFeatureIds());
        if (!(jSONArray3.length() != 0)) {
            jSONArray3 = null;
        }
        jSONObject.put("featureIds", jSONArray3);
        JSONArray jSONArray4 = new JSONArray(getLegitimateInterestPurposeIds());
        if (jSONArray4.length() == 0) {
            z = false;
        }
        if (z) {
            jSONArray = jSONArray4;
        }
        jSONObject.put("legIntPurposeIds", jSONArray);
        return jSONObject;
    }
}
