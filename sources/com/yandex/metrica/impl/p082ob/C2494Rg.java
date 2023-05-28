package com.yandex.metrica.impl.p082ob;

import android.net.Uri;
import android.text.TextUtils;
import com.appnext.base.p264b.C8850d;
import com.appodeal.ads.modules.common.internal.Constants;
import com.yandex.metrica.impl.p082ob.C3566v3;
import com.yandex.metrica.networktasks.api.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Rg */
public class C2494Rg implements IParamsAppender<C2312Mg> {

    /* renamed from: a */
    private final C2244Kg f6593a;

    /* renamed from: b */
    private final C3126kd f6594b;

    public C2494Rg(C2244Kg kg, C3126kd kdVar) {
        this.f6593a = kg;
        this.f6594b = kdVar;
    }

    /* renamed from: a */
    private void m8282a(Uri.Builder builder, C3539ub ubVar, String str) {
        if (!ubVar.mo18256a()) {
            builder.appendQueryParameter(this.f6593a.mo16084a(str), "");
        } else {
            builder.appendQueryParameter(this.f6593a.mo16084a(str), ubVar.f9198a.f9142b);
        }
    }

    public void appendParams(Uri.Builder builder, Object obj) {
        C2895dg a;
        Uri.Builder builder2 = builder;
        C2312Mg mg = (C2312Mg) obj;
        builder2.path("analytics/startup");
        builder2.appendQueryParameter(this.f6593a.mo16084a("deviceid"), mg.mo15705g());
        C3464s2 u = C2007F0.m7154g().mo15758u();
        C3729zb a2 = mg.mo15689a();
        if (u.mo18197c()) {
            builder2.appendQueryParameter(this.f6593a.mo16084a("adv_id"), "");
            builder2.appendQueryParameter(this.f6593a.mo16084a("oaid"), "");
            builder2.appendQueryParameter(this.f6593a.mo16084a("yandex_adv_id"), "");
        } else {
            m8282a(builder2, a2.mo18453a(), "adv_id");
            m8282a(builder2, a2.mo18454b(), "oaid");
            m8282a(builder2, a2.mo18455c(), "yandex_adv_id");
        }
        builder2.appendQueryParameter(this.f6593a.mo16084a("app_set_id"), mg.mo15700d());
        builder2.appendQueryParameter(this.f6593a.mo16084a("app_set_id_scope"), mg.mo15702e());
        builder2.appendQueryParameter(this.f6593a.mo16084a("app_platform"), "android");
        builder2.appendQueryParameter(this.f6593a.mo16084a("protocol_version"), "2");
        builder2.appendQueryParameter(this.f6593a.mo16084a("analytics_sdk_version_name"), "5.3.0");
        builder2.appendQueryParameter(this.f6593a.mo16084a("model"), mg.mo15711m());
        builder2.appendQueryParameter(this.f6593a.mo16084a("manufacturer"), mg.mo15710l());
        builder2.appendQueryParameter(this.f6593a.mo16084a("os_version"), mg.mo15713o());
        builder2.appendQueryParameter(this.f6593a.mo16084a("screen_width"), String.valueOf(mg.mo15719u()));
        builder2.appendQueryParameter(this.f6593a.mo16084a("screen_height"), String.valueOf(mg.mo15718t()));
        builder2.appendQueryParameter(this.f6593a.mo16084a("screen_dpi"), String.valueOf(mg.mo15717s()));
        builder2.appendQueryParameter(this.f6593a.mo16084a("scalefactor"), String.valueOf(mg.mo15716r()));
        builder2.appendQueryParameter(this.f6593a.mo16084a("locale"), mg.mo15709k());
        builder2.appendQueryParameter(this.f6593a.mo16084a("device_type"), mg.mo15707i());
        builder2.appendQueryParameter(this.f6593a.mo16084a("queries"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("query_hosts"), String.valueOf(2));
        String a3 = this.f6593a.mo16084a("features");
        List<String> b = this.f6594b.mo17764b();
        String str = "";
        String str2 = "egress";
        String str3 = "easy_collecting";
        String str4 = "permissions_collecting";
        String str5 = "throttling";
        String[] strArr = {this.f6593a.mo16084a("easy_collecting"), this.f6593a.mo16084a("egress"), this.f6593a.mo16084a("package_info"), this.f6593a.mo16084a("socket"), this.f6593a.mo16084a("permissions_collecting"), this.f6593a.mo16084a("features_collecting"), this.f6593a.mo16084a("location_collecting"), this.f6593a.mo16084a("lbs_collecting"), this.f6593a.mo16084a("google_aid"), this.f6593a.mo16084a("huawei_oaid"), this.f6593a.mo16084a("throttling"), this.f6593a.mo16084a("wifi_around"), this.f6593a.mo16084a("wifi_connected"), this.f6593a.mo16084a("cells_around"), this.f6593a.mo16084a("sim_info"), this.f6593a.mo16084a("sdk_list"), this.f6593a.mo16084a("identity_light_collecting"), this.f6593a.mo16084a("gpl_collecting"), this.f6593a.mo16084a("ui_parsing"), this.f6593a.mo16084a("ui_collecting_for_bridge"), this.f6593a.mo16084a("ui_event_sending"), this.f6593a.mo16084a("ui_raw_event_sending"), this.f6593a.mo16084a("cell_additional_info"), this.f6593a.mo16084a("cell_additional_info_connected_only"), this.f6593a.mo16084a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(b);
        arrayList.addAll(Arrays.asList(strArr));
        builder2.appendQueryParameter(a3, TextUtils.join(",", (String[]) arrayList.toArray(new String[0])));
        builder2.appendQueryParameter(this.f6593a.mo16084a("socket"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("app_id"), mg.mo15714p());
        builder2.appendQueryParameter(this.f6593a.mo16084a("location_collecting"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("app_debuggable"), mg.mo15868z());
        builder2.appendQueryParameter(this.f6593a.mo16084a("sdk_list"), String.valueOf(1));
        if (mg.mo16310L()) {
            String D = mg.mo16302D();
            if (!TextUtils.isEmpty(D)) {
                builder2.appendQueryParameter(this.f6593a.mo16084a("country_init"), D);
            }
        } else {
            builder2.appendQueryParameter(this.f6593a.mo16084a("detect_locale"), String.valueOf(1));
        }
        C3566v3.C3567a B = mg.mo16300B();
        if (!C1848A2.m6815b((Map) B.mo18318b())) {
            builder2.appendQueryParameter(this.f6593a.mo16084a("distribution_customization"), String.valueOf(1));
            builder2.appendQueryParameter(this.f6593a.mo16084a("clids_set"), C2572Tl.m8538c(B.mo18318b()));
            int ordinal = B.mo17550a().ordinal();
            builder2.appendQueryParameter(this.f6593a.mo16084a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? str : "retail" : "satellite" : "api");
            String E = mg.mo16303E();
            String F = mg.mo16304F();
            if (TextUtils.isEmpty(E) && (a = mg.mo16306H().mo18211a()) != null) {
                E = a.f7645a;
                F = a.f7648d.f7653a;
            }
            if (!TextUtils.isEmpty(E)) {
                builder2.appendQueryParameter(this.f6593a.mo16084a("install_referrer"), E);
                if (F == null) {
                    F = "null";
                }
                builder2.appendQueryParameter(this.f6593a.mo16084a("install_referrer_source"), F);
            }
        }
        String w = mg.mo15721w();
        if (!TextUtils.isEmpty(w)) {
            builder2.appendQueryParameter(this.f6593a.mo16084a(Constants.UUID), w);
        }
        builder2.appendQueryParameter(this.f6593a.mo16084a(C8850d.f22432fl), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("requests"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("stat_sending"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("permissions"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("identity_light_collecting"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("ui_parsing"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("ui_collecting_for_bridge"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("ui_event_sending"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("ui_raw_event_sending"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("retry_policy"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a(str5), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("cache_control"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("mediascope_api_keys"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("diagnostics"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a(str4), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("app_system_flag"), mg.mo15865A());
        builder2.appendQueryParameter(this.f6593a.mo16084a("auto_inapp_collecting"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("attribution"), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a(str3), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a(str2), String.valueOf(1));
        builder2.appendQueryParameter(this.f6593a.mo16084a("startup_update"), String.valueOf(1));
        Map<String, Integer> a4 = this.f6594b.mo17763a();
        for (String next : a4.keySet()) {
            builder2.appendQueryParameter(next, String.valueOf(a4.get(next)));
        }
    }
}
