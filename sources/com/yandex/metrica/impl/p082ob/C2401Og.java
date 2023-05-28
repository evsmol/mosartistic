package com.yandex.metrica.impl.p082ob;

import android.net.Uri;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.yandex.metrica.networktasks.api.IParamsAppender;

/* renamed from: com.yandex.metrica.impl.ob.Og */
public class C2401Og implements IParamsAppender<C1943D4> {
    public void appendParams(Uri.Builder builder, Object obj) {
        C1943D4 d4 = (C1943D4) obj;
        builder.appendPath("diagnostic");
        builder.appendQueryParameter("deviceid", d4.mo15705g());
        builder.appendQueryParameter(Constants.UUID, d4.mo15721w());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("analytics_sdk_version_name", "5.3.0");
        builder.appendQueryParameter("analytics_sdk_build_number", "45003240");
        builder.appendQueryParameter("analytics_sdk_build_type", d4.mo15708j());
        if (d4.mo15708j().contains("source") && !TextUtils.isEmpty("a72bf6f57701ed3c2b8ed570054febbff4e58c12")) {
            builder.appendQueryParameter("commit_hash", "a72bf6f57701ed3c2b8ed570054febbff4e58c12");
        }
        builder.appendQueryParameter("app_version_name", d4.mo15704f());
        builder.appendQueryParameter("app_build_number", d4.mo15696b());
        builder.appendQueryParameter("model", d4.mo15711m());
        builder.appendQueryParameter("manufacturer", d4.mo15710l());
        builder.appendQueryParameter("os_version", d4.mo15713o());
        builder.appendQueryParameter("os_api_level", String.valueOf(d4.mo15712n()));
        builder.appendQueryParameter("screen_width", String.valueOf(d4.mo15719u()));
        builder.appendQueryParameter("screen_height", String.valueOf(d4.mo15718t()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(d4.mo15717s()));
        builder.appendQueryParameter("scalefactor", String.valueOf(d4.mo15716r()));
        builder.appendQueryParameter("locale", d4.mo15709k());
        builder.appendQueryParameter("device_type", d4.mo15707i());
        builder.appendQueryParameter("app_id", d4.mo15714p());
        builder.appendQueryParameter("api_key_128", d4.mo15610B());
        builder.appendQueryParameter("app_debuggable", d4.mo15868z());
        builder.appendQueryParameter("is_rooted", d4.mo15706h());
        builder.appendQueryParameter("app_framework", d4.mo15698c());
    }
}
