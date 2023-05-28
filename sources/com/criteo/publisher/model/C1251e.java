package com.criteo.publisher.model;

import com.criteo.publisher.logging.RemoteLogRecords;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.criteo.publisher.model.e */
/* compiled from: $AutoValue_RemoteConfigResponse */
abstract class C1251e extends C1284y {

    /* renamed from: a */
    private final Boolean f3891a;

    /* renamed from: b */
    private final String f3892b;

    /* renamed from: c */
    private final String f3893c;

    /* renamed from: d */
    private final String f3894d;

    /* renamed from: e */
    private final String f3895e;

    /* renamed from: f */
    private final Boolean f3896f;

    /* renamed from: g */
    private final Boolean f3897g;

    /* renamed from: h */
    private final Integer f3898h;

    /* renamed from: i */
    private final Boolean f3899i;

    /* renamed from: j */
    private final RemoteLogRecords.RemoteLogLevel f3900j;

    C1251e(Boolean bool, String str, String str2, String str3, String str4, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, RemoteLogRecords.RemoteLogLevel remoteLogLevel) {
        this.f3891a = bool;
        this.f3892b = str;
        this.f3893c = str2;
        this.f3894d = str3;
        this.f3895e = str4;
        this.f3896f = bool2;
        this.f3897g = bool3;
        this.f3898h = num;
        this.f3899i = bool4;
        this.f3900j = remoteLogLevel;
    }

    /* renamed from: g */
    public Boolean mo3515g() {
        return this.f3891a;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("AndroidDisplayUrlMacro")
    /* renamed from: e */
    public String mo3512e() {
        return this.f3892b;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("AndroidAdTagUrlMode")
    /* renamed from: d */
    public String mo3511d() {
        return this.f3893c;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("AndroidAdTagDataMacro")
    /* renamed from: b */
    public String mo3509b() {
        return this.f3894d;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("AndroidAdTagDataMode")
    /* renamed from: c */
    public String mo3510c() {
        return this.f3895e;
    }

    /* renamed from: f */
    public Boolean mo3514f() {
        return this.f3896f;
    }

    /* renamed from: h */
    public Boolean mo3516h() {
        return this.f3897g;
    }

    /* renamed from: i */
    public Integer mo3518i() {
        return this.f3898h;
    }

    /* renamed from: j */
    public Boolean mo3519j() {
        return this.f3899i;
    }

    /* renamed from: k */
    public RemoteLogRecords.RemoteLogLevel mo3520k() {
        return this.f3900j;
    }

    public String toString() {
        return "RemoteConfigResponse{killSwitch=" + this.f3891a + ", androidDisplayUrlMacro=" + this.f3892b + ", androidAdTagUrlMode=" + this.f3893c + ", androidAdTagDataMacro=" + this.f3894d + ", androidAdTagDataMode=" + this.f3895e + ", csmEnabled=" + this.f3896f + ", liveBiddingEnabled=" + this.f3897g + ", liveBiddingTimeBudgetInMillis=" + this.f3898h + ", prefetchOnInitEnabled=" + this.f3899i + ", remoteLogLevel=" + this.f3900j + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1284y)) {
            return false;
        }
        C1284y yVar = (C1284y) obj;
        Boolean bool = this.f3891a;
        if (bool != null ? bool.equals(yVar.mo3515g()) : yVar.mo3515g() == null) {
            String str = this.f3892b;
            if (str != null ? str.equals(yVar.mo3512e()) : yVar.mo3512e() == null) {
                String str2 = this.f3893c;
                if (str2 != null ? str2.equals(yVar.mo3511d()) : yVar.mo3511d() == null) {
                    String str3 = this.f3894d;
                    if (str3 != null ? str3.equals(yVar.mo3509b()) : yVar.mo3509b() == null) {
                        String str4 = this.f3895e;
                        if (str4 != null ? str4.equals(yVar.mo3510c()) : yVar.mo3510c() == null) {
                            Boolean bool2 = this.f3896f;
                            if (bool2 != null ? bool2.equals(yVar.mo3514f()) : yVar.mo3514f() == null) {
                                Boolean bool3 = this.f3897g;
                                if (bool3 != null ? bool3.equals(yVar.mo3516h()) : yVar.mo3516h() == null) {
                                    Integer num = this.f3898h;
                                    if (num != null ? num.equals(yVar.mo3518i()) : yVar.mo3518i() == null) {
                                        Boolean bool4 = this.f3899i;
                                        if (bool4 != null ? bool4.equals(yVar.mo3519j()) : yVar.mo3519j() == null) {
                                            RemoteLogRecords.RemoteLogLevel remoteLogLevel = this.f3900j;
                                            if (remoteLogLevel == null) {
                                                if (yVar.mo3520k() == null) {
                                                    return true;
                                                }
                                            } else if (remoteLogLevel.equals(yVar.mo3520k())) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.f3891a;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) ^ 1000003) * 1000003;
        String str = this.f3892b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f3893c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3894d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3895e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Boolean bool2 = this.f3896f;
        int hashCode6 = (hashCode5 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.f3897g;
        int hashCode7 = (hashCode6 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Integer num = this.f3898h;
        int hashCode8 = (hashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Boolean bool4 = this.f3899i;
        int hashCode9 = (hashCode8 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        RemoteLogRecords.RemoteLogLevel remoteLogLevel = this.f3900j;
        if (remoteLogLevel != null) {
            i = remoteLogLevel.hashCode();
        }
        return hashCode9 ^ i;
    }
}
