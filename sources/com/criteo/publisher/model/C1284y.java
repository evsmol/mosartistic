package com.criteo.publisher.model;

import com.criteo.publisher.logging.RemoteLogRecords;
import com.criteo.publisher.model.C1263l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.criteo.publisher.model.y */
/* compiled from: RemoteConfigResponse */
public abstract class C1284y {
    /* access modifiers changed from: package-private */
    @SerializedName("AndroidAdTagDataMacro")
    /* renamed from: b */
    public abstract String mo3509b();

    /* access modifiers changed from: package-private */
    @SerializedName("AndroidAdTagDataMode")
    /* renamed from: c */
    public abstract String mo3510c();

    /* access modifiers changed from: package-private */
    @SerializedName("AndroidAdTagUrlMode")
    /* renamed from: d */
    public abstract String mo3511d();

    /* access modifiers changed from: package-private */
    @SerializedName("AndroidDisplayUrlMacro")
    /* renamed from: e */
    public abstract String mo3512e();

    /* renamed from: f */
    public abstract Boolean mo3514f();

    /* renamed from: g */
    public abstract Boolean mo3515g();

    /* renamed from: h */
    public abstract Boolean mo3516h();

    /* renamed from: i */
    public abstract Integer mo3518i();

    /* renamed from: j */
    public abstract Boolean mo3519j();

    /* renamed from: k */
    public abstract RemoteLogRecords.RemoteLogLevel mo3520k();

    /* renamed from: a */
    public static C1284y m5698a(Boolean bool, String str, String str2, String str3, String str4, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, RemoteLogRecords.RemoteLogLevel remoteLogLevel) {
        return new C1263l(bool, str, str2, str3, str4, bool2, bool3, num, bool4, remoteLogLevel);
    }

    /* renamed from: a */
    public static C1284y m5697a() {
        return m5698a((Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (RemoteLogRecords.RemoteLogLevel) null);
    }

    /* renamed from: a */
    public static TypeAdapter<C1284y> m5699a(Gson gson) {
        return new C1263l.C1264a(gson);
    }
}
