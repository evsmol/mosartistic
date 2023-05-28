package com.yandex.metrica.impl.p082ob;

import android.net.Uri;
import com.appodeal.ads.modules.common.internal.Constants;
import com.yandex.metrica.networktasks.api.IParamsAppender;
import com.yandex.metrica.networktasks.api.NetworkTaskForSendingDataParamsAppender;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;

/* renamed from: com.yandex.metrica.impl.ob.Pg */
public class C2434Pg implements IParamsAppender<C2995gd> {

    /* renamed from: a */
    private final C2345Ng f6480a;

    /* renamed from: b */
    private final NetworkTaskForSendingDataParamsAppender f6481b;

    /* renamed from: c */
    private long f6482c;

    public C2434Pg(RequestBodyEncrypter requestBodyEncrypter) {
        this(new C2345Ng(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter));
    }

    /* renamed from: a */
    public void mo16475a(long j) {
        this.f6482c = j;
    }

    public void appendParams(Uri.Builder builder, Object obj) {
        C2995gd gdVar = (C2995gd) obj;
        this.f6481b.appendEncryptedData(builder);
        NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender = this.f6481b;
        gdVar.getClass();
        networkTaskForSendingDataParamsAppender.appendCommitHash(builder, "a72bf6f57701ed3c2b8ed570054febbff4e58c12", gdVar.mo15708j());
        builder.appendPath("location");
        builder.appendQueryParameter("deviceid", gdVar.mo15705g());
        builder.appendQueryParameter("device_type", gdVar.mo15707i());
        builder.appendQueryParameter(Constants.UUID, gdVar.mo15721w());
        builder.appendQueryParameter("analytics_sdk_version_name", "5.3.0");
        builder.appendQueryParameter("analytics_sdk_build_number", "45003240");
        builder.appendQueryParameter("analytics_sdk_build_type", gdVar.mo15708j());
        builder.appendQueryParameter("app_version_name", gdVar.mo15704f());
        builder.appendQueryParameter("app_build_number", gdVar.mo15696b());
        builder.appendQueryParameter("os_version", gdVar.mo15713o());
        builder.appendQueryParameter("os_api_level", String.valueOf(gdVar.mo15712n()));
        builder.appendQueryParameter("is_rooted", gdVar.mo15706h());
        builder.appendQueryParameter("app_framework", gdVar.mo15698c());
        builder.appendQueryParameter("app_id", gdVar.mo15714p());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("request_id", String.valueOf(this.f6482c));
        builder.appendQueryParameter("app_set_id", gdVar.mo15700d());
        builder.appendQueryParameter("app_set_id_scope", gdVar.mo15702e());
        this.f6480a.appendParams(builder, gdVar.mo15689a());
    }

    C2434Pg(C2345Ng ng, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender) {
        this.f6480a = ng;
        this.f6481b = networkTaskForSendingDataParamsAppender;
    }
}
