package com.applovin.impl.sdk.p254c;

import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.c.a */
public class C8379a<T> extends C8380b<T> {

    /* renamed from: A */
    public static final C8380b<Boolean> f20646A = m25195a("fabsina", false);

    /* renamed from: B */
    public static final C8380b<Boolean> f20647B = m25195a("fabsiaif", false);

    /* renamed from: C */
    public static final C8380b<Long> f20648C = m25195a("ad_expiration_ms", Long.valueOf(TimeUnit.HOURS.toMillis(4)));

    /* renamed from: D */
    public static final C8380b<Long> f20649D = m25195a("native_ad_expiration_ms", Long.valueOf(TimeUnit.HOURS.toMillis(4)));

    /* renamed from: E */
    public static final C8380b<Boolean> f20650E = m25195a("rena", true);

    /* renamed from: F */
    public static final C8380b<Boolean> f20651F = m25195a("saewib", false);

    /* renamed from: G */
    public static final C8380b<Long> f20652G = m25195a("fullscreen_ad_displayed_timeout_ms", -1L);

    /* renamed from: H */
    public static final C8380b<Long> f20653H = m25195a("ad_hidden_timeout_ms", -1L);

    /* renamed from: I */
    public static final C8380b<Boolean> f20654I = m25195a("schedule_ad_hidden_on_ad_dismiss", false);

    /* renamed from: J */
    public static final C8380b<Long> f20655J = m25195a("ad_hidden_on_ad_dismiss_callback_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: K */
    public static final C8380b<Boolean> f20656K = m25195a("proe", false);

    /* renamed from: L */
    public static final C8380b<Integer> f20657L = m25195a("mute_state", 2);

    /* renamed from: M */
    public static final C8380b<String> f20658M = m25195a("saf", "");

    /* renamed from: N */
    public static final C8380b<String> f20659N = m25195a("saui", "");

    /* renamed from: O */
    public static final C8380b<Integer> f20660O = m25195a("mra", -1);

    /* renamed from: P */
    public static final C8380b<String> f20661P = m25195a("mra_af", "INTER,REWARDED,REWARDED_INTER,BANNER,LEADER,MREC");

    /* renamed from: Q */
    public static final C8380b<Boolean> f20662Q = m25195a("sai", false);

    /* renamed from: R */
    public static final C8380b<Boolean> f20663R = m25195a("init_adapter_for_sc", true);

    /* renamed from: S */
    public static final C8380b<Boolean> f20664S = m25195a("init_adapter_for_al", true);

    /* renamed from: T */
    public static final C8380b<Boolean> f20665T = m25195a("fadiafase", true);

    /* renamed from: U */
    public static final C8380b<Boolean> f20666U = m25195a("bfarud", false);

    /* renamed from: V */
    public static final C8380b<Boolean> f20667V = m25195a("epobt", false);

    /* renamed from: W */
    public static final C8380b<Boolean> f20668W = m25195a("inacc", Boolean.valueOf(Utils.isMemberOfPackageNameList(Arrays.asList(new String[]{"com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"}))));

    /* renamed from: X */
    public static final C8380b<Boolean> f20669X = m25195a("fetch_mediated_ad_gzip", false);

    /* renamed from: Y */
    public static final C8380b<Boolean> f20670Y = m25195a("max_postback_gzip", false);

    /* renamed from: a */
    public static final C8380b<String> f20671a = m25195a("afi", "");

    /* renamed from: b */
    public static final C8380b<Long> f20672b = m25195a("afi_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(5)));

    /* renamed from: c */
    public static final C8380b<String> f20673c = m25195a("mediation_endpoint", "https://ms.applovin.com/");

    /* renamed from: d */
    public static final C8380b<String> f20674d = m25195a("mediation_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: e */
    public static final C8380b<Long> f20675e = m25195a("fetch_next_ad_retry_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));

    /* renamed from: f */
    public static final C8380b<Long> f20676f = m25195a("fetch_next_ad_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(5)));

    /* renamed from: g */
    public static final C8380b<Long> f20677g = m25195a("fetch_mediation_debugger_info_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(7)));

    /* renamed from: h */
    public static final C8380b<Boolean> f20678h = m25195a("auto_init_mediation_debugger", true);

    /* renamed from: i */
    public static final C8380b<String> f20679i = m25195a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");

    /* renamed from: j */
    public static final C8380b<Long> f20680j = m25195a("max_signal_provider_latency_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: k */
    public static final C8380b<Long> f20681k = m25195a("default_adapter_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: l */
    public static final C8380b<Long> f20682l = m25195a("ad_refresh_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: m */
    public static final C8380b<Long> f20683m = m25195a("ad_load_failure_refresh_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: n */
    public static final C8380b<String> f20684n = m25195a("ad_load_failure_refresh_ignore_error_codes", "204");

    /* renamed from: o */
    public static final C8380b<Long> f20685o = m25195a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);

    /* renamed from: p */
    public static final C8380b<Boolean> f20686p = m25195a("refresh_ad_view_timer_responds_to_background", true);

    /* renamed from: q */
    public static final C8380b<Boolean> f20687q = m25195a("refresh_ad_view_timer_responds_to_store_kit", true);

    /* renamed from: r */
    public static final C8380b<Boolean> f20688r = m25195a("refresh_ad_view_timer_responds_to_window_visibility_changed", false);

    /* renamed from: s */
    public static final C8380b<Boolean> f20689s = m25195a("avrsponse", false);

    /* renamed from: t */
    public static final C8380b<Boolean> f20690t = m25195a(AppLovinSdkExtraParameterKey.ALLOW_IMMEDIATE_AUTO_REFRESH_PAUSE, false);

    /* renamed from: u */
    public static final C8380b<Long> f20691u = m25195a("fullscreen_display_delay_ms", 600L);

    /* renamed from: v */
    public static final C8380b<Boolean> f20692v = m25195a("susaode", false);

    /* renamed from: w */
    public static final C8380b<Long> f20693w = m25195a("ahdm", 500L);

    /* renamed from: x */
    public static final C8380b<Long> f20694x = m25195a("ad_view_refresh_precache_request_viewability_undesired_flags", 502L);

    /* renamed from: y */
    public static final C8380b<Boolean> f20695y = m25195a("ad_view_refresh_precache_request_enabled", true);

    /* renamed from: z */
    public static final C8380b<Boolean> f20696z = m25195a("fullscreen_ads_block_publisher_load_if_another_showing", true);
}
