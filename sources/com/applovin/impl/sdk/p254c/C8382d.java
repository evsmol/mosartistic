package com.applovin.impl.sdk.p254c;

import java.util.HashSet;

/* renamed from: com.applovin.impl.sdk.c.d */
public class C8382d<T> {

    /* renamed from: A */
    public static final C8382d<String> f20988A = new C8382d<>("com.applovin.sdk.mediation_provider", String.class);

    /* renamed from: B */
    public static final C8382d<String> f20989B = new C8382d<>("com.applovin.sdk.mediation.test_mode_network", String.class);

    /* renamed from: C */
    public static final C8382d<Boolean> f20990C = new C8382d<>("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);

    /* renamed from: D */
    public static final C8382d<String> f20991D = new C8382d<>("com.applovin.sdk.user_agent", String.class);

    /* renamed from: E */
    public static final C8382d<String> f20992E = new C8382d<>("com.applovin.sdk.last_os_version_user_agent_collected_for", String.class);

    /* renamed from: a */
    public static final C8382d<String> f20993a = new C8382d<>("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: b */
    public static final C8382d<Boolean> f20994b = new C8382d<>("com.applovin.sdk.launched_before", Boolean.class);

    /* renamed from: c */
    public static final C8382d<String> f20995c = new C8382d<>("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: d */
    public static final C8382d<Long> f20996d = new C8382d<>("com.applovin.sdk.install_date", Long.class);

    /* renamed from: e */
    public static final C8382d<String> f20997e = new C8382d<>("com.applovin.sdk.user_id", String.class);

    /* renamed from: f */
    public static final C8382d<String> f20998f = new C8382d<>("com.applovin.sdk.compass_id", String.class);

    /* renamed from: g */
    public static final C8382d<String> f20999g = new C8382d<>("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: h */
    public static final C8382d<String> f21000h = new C8382d<>("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: i */
    public static final C8382d<String> f21001i = new C8382d<>("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: j */
    public static final C8382d<String> f21002j = new C8382d<>("com.applovin.sdk.variables", String.class);

    /* renamed from: k */
    public static final C8382d<Boolean> f21003k = new C8382d<>("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: l */
    public static final C8382d<Boolean> f21004l = new C8382d<>("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: m */
    public static final C8382d<Boolean> f21005m = new C8382d<>("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: n */
    public static final C8382d<String> f21006n = new C8382d<>("IABTCF_TCString", String.class);

    /* renamed from: o */
    public static final C8382d<?> f21007o = new C8382d<>("IABTCF_gdprApplies", Object.class);

    /* renamed from: p */
    public static final C8382d<HashSet> f21008p = new C8382d<>("com.applovin.sdk.impl.postbackQueue.key", HashSet.class);

    /* renamed from: q */
    public static final C8382d<String> f21009q = new C8382d<>("com.applovin.sdk.stats", String.class);

    /* renamed from: r */
    public static final C8382d<HashSet> f21010r = new C8382d<>("com.applovin.sdk.task.stats", HashSet.class);

    /* renamed from: s */
    public static final C8382d<String> f21011s = new C8382d<>("com.applovin.sdk.network_response_code_mapping", String.class);

    /* renamed from: t */
    public static final C8382d<String> f21012t = new C8382d<>("com.applovin.sdk.event_tracking.super_properties", String.class);

    /* renamed from: u */
    public static final C8382d<HashSet> f21013u = new C8382d<>("com.applovin.sdk.ad.stats", HashSet.class);

    /* renamed from: v */
    public static final C8382d<Integer> f21014v = new C8382d<>("com.applovin.sdk.last_video_position", Integer.class);

    /* renamed from: w */
    public static final C8382d<Boolean> f21015w = new C8382d<>("com.applovin.sdk.should_resume_video", Boolean.class);

    /* renamed from: x */
    public static final C8382d<String> f21016x = new C8382d<>("com.applovin.sdk.mediation.signal_providers", String.class);

    /* renamed from: y */
    public static final C8382d<String> f21017y = new C8382d<>("com.applovin.sdk.mediation.auto_init_adapters", String.class);

    /* renamed from: z */
    public static final C8382d<String> f21018z = new C8382d<>("com.applovin.sdk.persisted_data", String.class);

    /* renamed from: F */
    private final String f21019F;

    /* renamed from: G */
    private final Class<T> f21020G;

    public C8382d(String str, Class<T> cls) {
        this.f21019F = str;
        this.f21020G = cls;
    }

    /* renamed from: a */
    public String mo57098a() {
        return this.f21019F;
    }

    /* renamed from: b */
    public Class<T> mo57099b() {
        return this.f21020G;
    }

    public String toString() {
        return "Key{name='" + this.f21019F + '\'' + ", type=" + this.f21020G + '}';
    }
}
