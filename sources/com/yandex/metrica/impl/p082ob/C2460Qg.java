package com.yandex.metrica.impl.p082ob;

import android.net.Uri;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.yandex.metrica.networktasks.api.IParamsAppender;
import com.yandex.metrica.networktasks.api.NetworkTaskForSendingDataParamsAppender;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;

/* renamed from: com.yandex.metrica.impl.ob.Qg */
public class C2460Qg implements IParamsAppender<C2275Lg> {

    /* renamed from: a */
    private final C2345Ng f6529a;

    /* renamed from: b */
    private final NetworkTaskForSendingDataParamsAppender f6530b;

    /* renamed from: c */
    private C2156Ig f6531c;

    /* renamed from: d */
    private long f6532d;

    public C2460Qg(RequestBodyEncrypter requestBodyEncrypter) {
        this(new C2345Ng(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter));
    }

    /* renamed from: a */
    public void mo16522a(C2156Ig ig) {
        this.f6531c = ig;
    }

    public void appendParams(Uri.Builder builder, Object obj) {
        C2275Lg lg = (C2275Lg) obj;
        builder.path("report");
        this.f6530b.appendEncryptedData(builder);
        C2156Ig ig = this.f6531c;
        if (ig != null) {
            this.f6530b.appendCommitHash(builder, ig.f5772p, ig.f5762f);
            builder.appendQueryParameter("deviceid", C2814b.m9062a(this.f6531c.f5757a, lg.mo15705g()));
            builder.appendQueryParameter(Constants.UUID, C2814b.m9062a(this.f6531c.f5758b, lg.mo15721w()));
            m8200a(builder, "analytics_sdk_version", this.f6531c.f5759c);
            m8200a(builder, "analytics_sdk_version_name", this.f6531c.f5760d);
            builder.appendQueryParameter("app_version_name", C2814b.m9062a(this.f6531c.f5763g, lg.mo15704f()));
            builder.appendQueryParameter("app_build_number", C2814b.m9062a(this.f6531c.f5765i, lg.mo15696b()));
            builder.appendQueryParameter("os_version", C2814b.m9062a(this.f6531c.f5766j, lg.mo15713o()));
            m8200a(builder, "os_api_level", this.f6531c.f5767k);
            m8200a(builder, "analytics_sdk_build_number", this.f6531c.f5761e);
            m8200a(builder, "analytics_sdk_build_type", this.f6531c.f5762f);
            m8200a(builder, "app_debuggable", this.f6531c.f5764h);
            builder.appendQueryParameter("locale", C2814b.m9062a(this.f6531c.f5768l, lg.mo15709k()));
            builder.appendQueryParameter("is_rooted", C2814b.m9062a(this.f6531c.f5769m, lg.mo15706h()));
            builder.appendQueryParameter("app_framework", C2814b.m9062a(this.f6531c.f5770n, lg.mo15698c()));
            m8200a(builder, "attribution_id", this.f6531c.f5771o);
        }
        builder.appendQueryParameter("api_key_128", lg.mo16185B());
        builder.appendQueryParameter("app_id", lg.mo15714p());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("model", lg.mo15711m());
        builder.appendQueryParameter("manufacturer", lg.mo15710l());
        builder.appendQueryParameter("screen_width", String.valueOf(lg.mo15719u()));
        builder.appendQueryParameter("screen_height", String.valueOf(lg.mo15718t()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(lg.mo15717s()));
        builder.appendQueryParameter("scalefactor", String.valueOf(lg.mo15716r()));
        builder.appendQueryParameter("device_type", lg.mo15707i());
        m8200a(builder, "clids_set", lg.mo16188E());
        builder.appendQueryParameter("app_set_id", lg.mo15700d());
        builder.appendQueryParameter("app_set_id_scope", lg.mo15702e());
        this.f6529a.appendParams(builder, lg.mo15689a());
        builder.appendQueryParameter("request_id", String.valueOf(this.f6532d));
    }

    C2460Qg(C2345Ng ng, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender) {
        this.f6529a = ng;
        this.f6530b = networkTaskForSendingDataParamsAppender;
    }

    /* renamed from: a */
    public void mo16521a(long j) {
        this.f6532d = j;
    }

    /* renamed from: a */
    private void m8200a(Uri.Builder builder, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }
}
