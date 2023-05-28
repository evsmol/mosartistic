package com.applovin.impl.sdk.p254c;

import android.net.Uri;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.p233b.C8047n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.appodeal.ads.AppodealNetworks;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.c.b */
public class C8380b<T> implements Comparable {

    /* renamed from: Z */
    public static final C8380b<Boolean> f20697Z = m25195a("is_disabled", false);

    /* renamed from: a */
    private static final List<?> f20698a = Arrays.asList(new Class[]{Boolean.class, Float.class, Integer.class, Long.class, String.class});

    /* renamed from: aA */
    public static final C8380b<String> f20699aA = m25195a("omsdk_partner_name", AppodealNetworks.APPLOVIN);

    /* renamed from: aB */
    public static final C8380b<Boolean> f20700aB = m25195a("publisher_can_show_consent_dialog", true);

    /* renamed from: aC */
    public static final C8380b<String> f20701aC = m25195a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");

    /* renamed from: aD */
    public static final C8380b<Boolean> f20702aD = m25195a("consent_dialog_immersive_mode_on", false);

    /* renamed from: aE */
    public static final C8380b<Long> f20703aE = m25195a("consent_dialog_show_from_alert_delay_ms", 450L);

    /* renamed from: aF */
    public static final C8380b<Boolean> f20704aF = m25195a("alert_consent_for_dialog_rejected", false);

    /* renamed from: aG */
    public static final C8380b<Boolean> f20705aG = m25195a("alert_consent_for_dialog_closed", false);

    /* renamed from: aH */
    public static final C8380b<Boolean> f20706aH = m25195a("alert_consent_for_dialog_closed_with_back_button", false);

    /* renamed from: aI */
    public static final C8380b<Boolean> f20707aI = m25195a("alert_consent_after_init", false);

    /* renamed from: aJ */
    public static final C8380b<Long> f20708aJ = m25195a("alert_consent_after_init_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aK */
    public static final C8380b<Long> f20709aK = m25195a("alert_consent_after_dialog_rejection_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(30)));

    /* renamed from: aL */
    public static final C8380b<Long> f20710aL = m25195a("alert_consent_after_dialog_close_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aM */
    public static final C8380b<Long> f20711aM = m25195a("alert_consent_after_dialog_close_with_back_button_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aN */
    public static final C8380b<Long> f20712aN = m25195a("alert_consent_after_cancel_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));

    /* renamed from: aO */
    public static final C8380b<Long> f20713aO = m25195a("alert_consent_reschedule_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aP */
    public static final C8380b<String> f20714aP = m25195a("text_alert_consent_title", "Make this App Better and Stay Free!");

    /* renamed from: aQ */
    public static final C8380b<String> f20715aQ = m25195a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");

    /* renamed from: aR */
    public static final C8380b<String> f20716aR = m25195a("text_alert_consent_yes_option", "I Agree");

    /* renamed from: aS */
    public static final C8380b<String> f20717aS = m25195a("text_alert_consent_no_option", LogConstants.EVENT_CANCEL);

    /* renamed from: aT */
    public static final C8380b<Long> f20718aT = m25195a("ttc_max_click_duration_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: aU */
    public static final C8380b<Integer> f20719aU = m25195a("ttc_max_click_distance_dp", 10);

    /* renamed from: aV */
    public static final C8380b<Integer> f20720aV = m25195a("ttc_acrsv2a", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN.ordinal()));

    /* renamed from: aW */
    public static final C8380b<Integer> f20721aW = m25195a("ttc_edge_buffer_dp", 0);

    /* renamed from: aX */
    public static final C8380b<String> f20722aX = m25195a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");

    /* renamed from: aY */
    public static final C8380b<String> f20723aY = m25195a("fetch_settings_endpoint", "https://ms.applovin.com/");

    /* renamed from: aZ */
    public static final C8380b<String> f20724aZ = m25195a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: aa */
    public static final C8380b<String> f20725aa = m25195a("device_id", "");

    /* renamed from: ab */
    public static final C8380b<Boolean> f20726ab = m25195a("rss", true);

    /* renamed from: ac */
    public static final C8380b<String> f20727ac = m25195a("device_token", "");

    /* renamed from: ad */
    public static final C8380b<Long> f20728ad = m25195a("publisher_id", 0L);

    /* renamed from: ae */
    public static final C8380b<Boolean> f20729ae = m25195a("is_verbose_logging", false);

    /* renamed from: af */
    public static final C8380b<String> f20730af = m25195a("sc", "");

    /* renamed from: ag */
    public static final C8380b<String> f20731ag = m25195a("sc2", "");

    /* renamed from: ah */
    public static final C8380b<String> f20732ah = m25195a("sc3", "");

    /* renamed from: ai */
    public static final C8380b<String> f20733ai = m25195a("server_installed_at", "");

    /* renamed from: aj */
    public static final C8380b<Boolean> f20734aj = m25195a("track_network_response_codes", false);

    /* renamed from: ak */
    public static final C8380b<Boolean> f20735ak = m25195a("submit_network_response_codes", false);

    /* renamed from: al */
    public static final C8380b<Boolean> f20736al = m25195a("clear_network_response_codes_on_request", true);

    /* renamed from: am */
    public static final C8380b<Boolean> f20737am = m25195a("clear_completion_callback_on_failure", false);

    /* renamed from: an */
    public static final C8380b<Long> f20738an = m25195a("sicd_ms", 0L);

    /* renamed from: ao */
    public static final C8380b<Integer> f20739ao = m25195a("logcat_max_line_size", 1000);

    /* renamed from: ap */
    public static final C8380b<Integer> f20740ap = m25195a("stps", 16);

    /* renamed from: aq */
    public static final C8380b<Boolean> f20741aq = m25195a("ustp", false);

    /* renamed from: ar */
    public static final C8380b<Boolean> f20742ar = m25195a("exception_handler_enabled", true);

    /* renamed from: as */
    public static final C8380b<Integer> f20743as = m25195a("network_thread_count", 4);

    /* renamed from: at */
    public static final C8380b<Boolean> f20744at = m25195a("uam", false);

    /* renamed from: au */
    public static final C8380b<Integer> f20745au = m25195a("aei", -1);

    /* renamed from: av */
    public static final C8380b<Integer> f20746av = m25195a("mei", -1);

    /* renamed from: aw */
    public static final C8380b<Boolean> f20747aw = m25195a("ah_cvc", true);

    /* renamed from: ax */
    public static final C8380b<Boolean> f20748ax = m25195a("ah_cdde", true);

    /* renamed from: ay */
    public static final C8380b<Boolean> f20749ay = m25195a("ah_crut", true);

    /* renamed from: az */
    public static final C8380b<Boolean> f20750az = m25195a("init_omsdk", true);

    /* renamed from: b */
    private static final Map<String, C8380b<?>> f20751b = CollectionUtils.map(512);

    /* renamed from: bA */
    public static final C8380b<Boolean> f20752bA = m25195a("use_old_file_manager", false);

    /* renamed from: bB */
    public static final C8380b<Integer> f20753bB = m25195a("vr_retry_count_v1", 1);

    /* renamed from: bC */
    public static final C8380b<Integer> f20754bC = m25195a("cr_retry_count_v1", 1);

    /* renamed from: bD */
    public static final C8380b<Boolean> f20755bD = m25195a("incent_warning_enabled", false);

    /* renamed from: bE */
    public static final C8380b<String> f20756bE = m25195a("text_incent_warning_title", "Attention!");

    /* renamed from: bF */
    public static final C8380b<String> f20757bF = m25195a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");

    /* renamed from: bG */
    public static final C8380b<String> f20758bG = m25195a("text_incent_warning_close_option", "Close");

    /* renamed from: bH */
    public static final C8380b<String> f20759bH = m25195a("text_incent_warning_continue_option", "Keep Watching");

    /* renamed from: bI */
    public static final C8380b<Boolean> f20760bI = m25195a("incent_nonvideo_warning_enabled", false);

    /* renamed from: bJ */
    public static final C8380b<String> f20761bJ = m25195a("text_incent_nonvideo_warning_title", "Attention!");

    /* renamed from: bK */
    public static final C8380b<String> f20762bK = m25195a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");

    /* renamed from: bL */
    public static final C8380b<String> f20763bL = m25195a("text_incent_nonvideo_warning_close_option", "Close");

    /* renamed from: bM */
    public static final C8380b<String> f20764bM = m25195a("text_incent_nonvideo_warning_continue_option", "Keep Playing");

    /* renamed from: bN */
    public static final C8380b<Integer> f20765bN = m25195a("close_button_touch_area", 0);

    /* renamed from: bO */
    public static final C8380b<Integer> f20766bO = m25195a("close_button_outside_touch_area", 0);

    /* renamed from: bP */
    public static final C8380b<Boolean> f20767bP = m25195a("creative_debugger_enabled", true);

    /* renamed from: bQ */
    public static final C8380b<Long> f20768bQ = m25195a("viewability_adview_imp_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: bR */
    public static final C8380b<Integer> f20769bR = m25195a("viewability_adview_banner_min_width", 320);

    /* renamed from: bS */
    public static final C8380b<Integer> f20770bS = m25195a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));

    /* renamed from: bT */
    public static final C8380b<Integer> f20771bT = m25195a("viewability_adview_mrec_min_width", Integer.valueOf(MaxAdFormat.MREC.getSize().getWidth()));

    /* renamed from: bU */
    public static final C8380b<Integer> f20772bU = m25195a("viewability_adview_mrec_min_height", Integer.valueOf(MaxAdFormat.MREC.getSize().getHeight()));

    /* renamed from: bV */
    public static final C8380b<Integer> f20773bV = m25195a("viewability_adview_leader_min_width", 728);

    /* renamed from: bW */
    public static final C8380b<Integer> f20774bW = m25195a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));

    /* renamed from: bX */
    public static final C8380b<Integer> f20775bX = m25195a("viewability_adview_native_min_width", 0);

    /* renamed from: bY */
    public static final C8380b<Integer> f20776bY = m25195a("viewability_adview_native_min_height", 0);

    /* renamed from: bZ */
    public static final C8380b<Float> f20777bZ = m25195a("viewability_adview_min_alpha", Float.valueOf(10.0f));

    /* renamed from: ba */
    public static final C8380b<String> f20778ba = m25195a("adserver_endpoint", "https://a.applovin.com/");

    /* renamed from: bb */
    public static final C8380b<String> f20779bb = m25195a("adserver_backup_endpoint", "https://a.applvn.com/");

    /* renamed from: bc */
    public static final C8380b<String> f20780bc = m25195a("api_endpoint", "https://d.applovin.com/");

    /* renamed from: bd */
    public static final C8380b<String> f20781bd = m25195a("api_backup_endpoint", "https://d.applvn.com/");

    /* renamed from: be */
    public static final C8380b<String> f20782be = m25195a("event_tracking_endpoint_v2", "https://rt.applovin.com/");

    /* renamed from: bf */
    public static final C8380b<String> f20783bf = m25195a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");

    /* renamed from: bg */
    public static final C8380b<String> f20784bg = m25195a("fetch_variables_endpoint", "https://ms.applovin.com/");

    /* renamed from: bh */
    public static final C8380b<String> f20785bh = m25195a("fetch_variables_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: bi */
    public static final C8380b<String> f20786bi = m25195a("anr_postback_endpoint", "https://ms.applovin.com/1.0/sdk/error");

    /* renamed from: bj */
    public static final C8380b<String> f20787bj = m25195a("token_type_prefixes_r", "4!");

    /* renamed from: bk */
    public static final C8380b<String> f20788bk = m25195a("token_type_prefixes_arj", "json_v3!");

    /* renamed from: bl */
    public static final C8380b<String> f20789bl = m25195a("top_level_events", "landing,paused,resumed,ref,rdf,checkout,iap");

    /* renamed from: bm */
    public static final C8380b<String> f20790bm = m25195a("valid_super_property_types", String.class.getName() + "," + Integer.class.getName() + "," + Long.class.getName() + "," + Double.class.getName() + "," + Float.class.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());

    /* renamed from: bn */
    public static final C8380b<Boolean> f20791bn = m25195a("persist_super_properties", true);

    /* renamed from: bo */
    public static final C8380b<Integer> f20792bo = m25195a("super_property_string_max_length", 1024);

    /* renamed from: bp */
    public static final C8380b<Integer> f20793bp = m25195a("super_property_url_max_length", 1024);

    /* renamed from: bq */
    public static final C8380b<Long> f20794bq = m25195a("cached_advertising_info_ttl_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));

    /* renamed from: br */
    public static final C8380b<Boolean> f20795br = m25195a("use_per_format_cache_queues", true);

    /* renamed from: bs */
    public static final C8380b<Boolean> f20796bs = m25195a("cache_cleanup_enabled", false);

    /* renamed from: bt */
    public static final C8380b<Long> f20797bt = m25195a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1)));

    /* renamed from: bu */
    public static final C8380b<Integer> f20798bu = m25195a("cache_max_size_mb", -1);

    /* renamed from: bv */
    public static final C8380b<String> f20799bv = m25195a("precache_delimiters", ")]',");

    /* renamed from: bw */
    public static final C8380b<Boolean> f20800bw = m25195a("ad_resource_caching_enabled", true);

    /* renamed from: bx */
    public static final C8380b<Boolean> f20801bx = m25195a("fail_ad_load_on_failed_video_cache", true);

    /* renamed from: by */
    public static final C8380b<String> f20802by = m25195a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");

    /* renamed from: bz */
    public static final C8380b<String> f20803bz = m25195a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");

    /* renamed from: cA */
    public static final C8380b<Boolean> f20804cA = m25195a("mute_videos", false);

    /* renamed from: cB */
    public static final C8380b<Boolean> f20805cB = m25195a("show_mute_by_default", false);

    /* renamed from: cC */
    public static final C8380b<Boolean> f20806cC = m25195a("mute_with_user_settings", true);

    /* renamed from: cD */
    public static final C8380b<Integer> f20807cD = m25195a("mute_button_size", 32);

    /* renamed from: cE */
    public static final C8380b<Integer> f20808cE = m25195a("mute_button_margin", 10);

    /* renamed from: cF */
    public static final C8380b<Integer> f20809cF = m25195a("mute_button_gravity", 85);

    /* renamed from: cG */
    public static final C8380b<Long> f20810cG = m25195a("progress_bar_step", 25L);

    /* renamed from: cH */
    public static final C8380b<Integer> f20811cH = m25195a("progress_bar_scale", 10000);

    /* renamed from: cI */
    public static final C8380b<Integer> f20812cI = m25195a("progress_bar_vertical_padding", -8);

    /* renamed from: cJ */
    public static final C8380b<Integer> f20813cJ = m25195a("vs_buffer_indicator_size", 50);

    /* renamed from: cK */
    public static final C8380b<Long> f20814cK = m25195a("set_poststitial_muted_initial_delay_ms", 500L);

    /* renamed from: cL */
    public static final C8380b<Boolean> f20815cL = m25195a("fasuic", true);

    /* renamed from: cM */
    public static final C8380b<Boolean> f20816cM = m25195a("ssfwif", false);

    /* renamed from: cN */
    public static final C8380b<Boolean> f20817cN = m25195a("fsahrpg", true);

    /* renamed from: cO */
    public static final C8380b<Integer> f20818cO = m25195a("submit_postback_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: cP */
    public static final C8380b<Integer> f20819cP = m25195a("submit_postback_retries", 4);

    /* renamed from: cQ */
    public static final C8380b<Integer> f20820cQ = m25195a("max_postback_attempts", 3);

    /* renamed from: cR */
    public static final C8380b<Boolean> f20821cR = m25195a("fppopq", false);

    /* renamed from: cS */
    public static final C8380b<Integer> f20822cS = m25195a("max_persisted_postbacks", 100);

    /* renamed from: cT */
    public static final C8380b<Boolean> f20823cT = m25195a("retry_on_all_errors", false);

    /* renamed from: cU */
    public static final C8380b<Integer> f20824cU = m25195a("get_retry_delay_v1", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: cV */
    public static final C8380b<Integer> f20825cV = m25195a("http_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: cW */
    public static final C8380b<Integer> f20826cW = m25195a("http_socket_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(20)));

    /* renamed from: cX */
    public static final C8380b<Boolean> f20827cX = m25195a("force_ssl", false);

    /* renamed from: cY */
    public static final C8380b<Integer> f20828cY = m25195a("fetch_ad_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: cZ */
    public static final C8380b<Integer> f20829cZ = m25195a("fetch_ad_retry_count_v1", 1);

    /* renamed from: ca */
    public static final C8380b<Long> f20830ca = m25195a("viewability_timer_min_visible_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: cb */
    public static final C8380b<Long> f20831cb = m25195a("viewability_timer_interval_ms", 100L);

    /* renamed from: cc */
    public static final C8380b<Integer> f20832cc = m25195a("expandable_close_button_size", 27);

    /* renamed from: cd */
    public static final C8380b<Integer> f20833cd = m25195a("expandable_h_close_button_margin", 10);

    /* renamed from: ce */
    public static final C8380b<Integer> f20834ce = m25195a("expandable_t_close_button_margin", 10);

    /* renamed from: cf */
    public static final C8380b<Boolean> f20835cf = m25195a("expandable_lhs_close_button", false);

    /* renamed from: cg */
    public static final C8380b<Integer> f20836cg = m25195a("expandable_close_button_touch_area", 0);

    /* renamed from: ch */
    public static final C8380b<Boolean> f20837ch = m25195a("iaad", false);

    /* renamed from: ci */
    public static final C8380b<String> f20838ci = m25195a("js_tag_schemes", "applovin,mopub");

    /* renamed from: cj */
    public static final C8380b<String> f20839cj = m25195a("js_tag_load_success_hosts", "load,load_succeeded");

    /* renamed from: ck */
    public static final C8380b<String> f20840ck = m25195a("js_tag_load_failure_hosts", "failLoad,load_failed");

    /* renamed from: cl */
    public static final C8380b<Integer> f20841cl = m25195a("auxiliary_operations_threads", 3);

    /* renamed from: cm */
    public static final C8380b<Integer> f20842cm = m25195a("caching_operations_threads", 8);

    /* renamed from: cn */
    public static final C8380b<Long> f20843cn = m25195a("fullscreen_ad_pending_display_state_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: co */
    public static final C8380b<Long> f20844co = m25195a("fullscreen_ad_showing_state_timeout_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(2)));

    /* renamed from: cp */
    public static final C8380b<Boolean> f20845cp = m25195a("lhs_close_button_video", false);

    /* renamed from: cq */
    public static final C8380b<Integer> f20846cq = m25195a("close_button_right_margin_video", 4);

    /* renamed from: cr */
    public static final C8380b<Integer> f20847cr = m25195a("close_button_size_video", 30);

    /* renamed from: cs */
    public static final C8380b<Integer> f20848cs = m25195a("close_button_top_margin_video", 8);

    /* renamed from: ct */
    public static final C8380b<Long> f20849ct = m25195a("inter_display_delay", 200L);

    /* renamed from: cu */
    public static final C8380b<Long> f20850cu = m25195a("maximum_close_button_delay_seconds", 999L);

    /* renamed from: cv */
    public static final C8380b<Boolean> f20851cv = m25195a("respect_close_button", true);

    /* renamed from: cw */
    public static final C8380b<Boolean> f20852cw = m25195a("lhs_skip_button", true);

    /* renamed from: cx */
    public static final C8380b<Boolean> f20853cx = m25195a("track_app_killed", false);

    /* renamed from: cy */
    public static final C8380b<Boolean> f20854cy = m25195a("mute_controls_enabled", false);

    /* renamed from: cz */
    public static final C8380b<Boolean> f20855cz = m25195a("allow_user_muting", true);

    /* renamed from: dA */
    public static final C8380b<Boolean> f20856dA = m25195a("qq5", true);

    /* renamed from: dB */
    public static final C8380b<Boolean> f20857dB = m25195a("qq6", true);

    /* renamed from: dC */
    public static final C8380b<Boolean> f20858dC = m25195a("qq7", true);

    /* renamed from: dD */
    public static final C8380b<Boolean> f20859dD = m25195a("qq8", true);

    /* renamed from: dE */
    public static final C8380b<Boolean> f20860dE = m25195a("qq9", false);

    /* renamed from: dF */
    public static final C8380b<Boolean> f20861dF = m25195a("qq10", true);

    /* renamed from: dG */
    public static final C8380b<Boolean> f20862dG = m25195a("qq11", true);

    /* renamed from: dH */
    public static final C8380b<Boolean> f20863dH = m25195a("pui", true);

    /* renamed from: dI */
    public static final C8380b<String> f20864dI = m25195a("plugin_version", "");

    /* renamed from: dJ */
    public static final C8380b<Boolean> f20865dJ = m25195a("hgn", false);

    /* renamed from: dK */
    public static final C8380b<Boolean> f20866dK = m25195a("cso", false);

    /* renamed from: dL */
    public static final C8380b<Boolean> f20867dL = m25195a("cfs", false);

    /* renamed from: dM */
    public static final C8380b<Boolean> f20868dM = m25195a("cmi", false);

    /* renamed from: dN */
    public static final C8380b<Boolean> f20869dN = m25195a("crat", false);

    /* renamed from: dO */
    public static final C8380b<Boolean> f20870dO = m25195a("cvs", false);

    /* renamed from: dP */
    public static final C8380b<Boolean> f20871dP = m25195a("caf", false);

    /* renamed from: dQ */
    public static final C8380b<Boolean> f20872dQ = m25195a("cf", false);

    /* renamed from: dR */
    public static final C8380b<Boolean> f20873dR = m25195a("cmtl", true);

    /* renamed from: dS */
    public static final C8380b<Boolean> f20874dS = m25195a("cnr", false);

    /* renamed from: dT */
    public static final C8380b<Boolean> f20875dT = m25195a("adr", false);

    /* renamed from: dU */
    public static final C8380b<Float> f20876dU = m25195a("volume_normalization_factor", Float.valueOf(6.6666665f));

    /* renamed from: dV */
    public static final C8380b<Boolean> f20877dV = m25195a("system_user_agent_collection_enabled", false);

    /* renamed from: dW */
    public static final C8380b<Boolean> f20878dW = m25195a(AppLovinSdkExtraParameterKey.USER_AGENT_COLLECTION_ENABLED, false);

    /* renamed from: dX */
    public static final C8380b<Boolean> f20879dX = m25195a("collect_device_angle", false);

    /* renamed from: dY */
    public static final C8380b<Boolean> f20880dY = m25195a("collect_device_movement", false);

    /* renamed from: dZ */
    public static final C8380b<Float> f20881dZ = m25195a("movement_degradation", Float.valueOf(0.75f));

    /* renamed from: da */
    public static final C8380b<Boolean> f20882da = m25195a("faer", false);

    /* renamed from: db */
    public static final C8380b<Boolean> f20883db = m25195a("faroae", false);

    /* renamed from: dc */
    public static final C8380b<Integer> f20884dc = m25195a("submit_data_retry_count_v1", 1);

    /* renamed from: dd */
    public static final C8380b<Integer> f20885dd = m25195a("response_buffer_size", 16000);

    /* renamed from: de */
    public static final C8380b<Integer> f20886de = m25195a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: df */
    public static final C8380b<Integer> f20887df = m25195a("fetch_basic_settings_retry_count", 3);

    /* renamed from: dg */
    public static final C8380b<Boolean> f20888dg = m25195a("fetch_basic_settings_on_reconnect", false);

    /* renamed from: dh */
    public static final C8380b<Boolean> f20889dh = m25195a("skip_fetch_basic_settings_if_not_connected", false);

    /* renamed from: di */
    public static final C8380b<Integer> f20890di = m25195a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(2)));

    /* renamed from: dj */
    public static final C8380b<Integer> f20891dj = m25195a("fetch_variables_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(5)));

    /* renamed from: dk */
    public static final C8380b<Boolean> f20892dk = m25195a("idflrwbe", false);

    /* renamed from: dl */
    public static final C8380b<Boolean> f20893dl = m25195a("falawpr", false);

    /* renamed from: dm */
    public static final C8380b<Boolean> f20894dm = m25195a("sort_query_parameters", false);

    /* renamed from: dn */
    public static final C8380b<Boolean> f20895dn = m25195a("encode_amp_query_value", false);

    /* renamed from: do */
    public static final C8380b<Long> f20896do = m25195a("communicator_request_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: dp */
    public static final C8380b<Integer> f20897dp = m25195a("communicator_request_retry_count", 3);

    /* renamed from: dq */
    public static final C8380b<Long> f20898dq = m25195a("communicator_request_retry_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));

    /* renamed from: dr */
    public static final C8380b<Integer> f20899dr = m25195a("ad_session_minutes", 60);

    /* renamed from: ds */
    public static final C8380b<Boolean> f20900ds = m25195a("session_tracking_cooldown_on_event_fire", true);

    /* renamed from: dt */
    public static final C8380b<Long> f20901dt = m25195a("session_tracking_resumed_cooldown_minutes", 90L);

    /* renamed from: du */
    public static final C8380b<Long> f20902du = m25195a("session_tracking_paused_cooldown_minutes", 90L);

    /* renamed from: dv */
    public static final C8380b<Boolean> f20903dv = m25195a("qq", false);

    /* renamed from: dw */
    public static final C8380b<Boolean> f20904dw = m25195a("qq1", true);

    /* renamed from: dx */
    public static final C8380b<Boolean> f20905dx = m25195a("qq2", true);

    /* renamed from: dy */
    public static final C8380b<Boolean> f20906dy = m25195a("qq3", true);

    /* renamed from: dz */
    public static final C8380b<Boolean> f20907dz = m25195a("qq4", true);

    /* renamed from: eA */
    public static final C8380b<Boolean> f20908eA = m25195a("ree", true);

    /* renamed from: eB */
    public static final C8380b<Boolean> f20909eB = m25195a("btee", true);

    /* renamed from: eC */
    public static final C8380b<Long> f20910eC = m25195a("server_timestamp_ms", 0L);

    /* renamed from: eD */
    public static final C8380b<Long> f20911eD = m25195a("device_timestamp_ms", 0L);

    /* renamed from: eE */
    public static final C8380b<Integer> f20912eE = m25195a("gzip_min_length", 0);

    /* renamed from: eF */
    public static final C8380b<Boolean> f20913eF = m25195a("gzip_encoding_default", false);

    /* renamed from: eG */
    public static final C8380b<Boolean> f20914eG = m25195a("fetch_settings_gzip", false);

    /* renamed from: eH */
    public static final C8380b<Boolean> f20915eH = m25195a("device_init_gzip", false);

    /* renamed from: eI */
    public static final C8380b<Boolean> f20916eI = m25195a("fetch_ad_gzip", false);

    /* renamed from: eJ */
    public static final C8380b<Boolean> f20917eJ = m25195a("event_tracking_gzip", false);

    /* renamed from: eK */
    public static final C8380b<Boolean> f20918eK = m25195a("submit_ad_stats_gzip", false);

    /* renamed from: eL */
    public static final C8380b<Boolean> f20919eL = m25195a("reward_postback_gzip", false);

    /* renamed from: eM */
    public static final C8380b<Boolean> f20920eM = m25195a("force_rerender", false);

    /* renamed from: eN */
    public static final C8380b<Boolean> f20921eN = m25195a("daostr", false);

    /* renamed from: eO */
    public static final C8380b<Boolean> f20922eO = m25195a("tctlaa", false);

    /* renamed from: eP */
    public static final C8380b<Boolean> f20923eP = m25195a("rwvdv", false);

    /* renamed from: eQ */
    public static final C8380b<Boolean> f20924eQ = m25195a("handle_render_process_gone", true);

    /* renamed from: eR */
    public static final C8380b<Boolean> f20925eR = m25195a("fdadaomr", true);

    /* renamed from: eS */
    public static final C8380b<Boolean> f20926eS = m25195a("teorpc", false);

    /* renamed from: eT */
    public static final C8380b<Boolean> f20927eT = m25195a("rmpibt", false);

    /* renamed from: eU */
    public static final C8380b<Boolean> f20928eU = m25195a("spbcioa", false);

    /* renamed from: eV */
    public static final C8380b<Boolean> f20929eV = m25195a("set_webview_render_process_client", false);

    /* renamed from: eW */
    public static final C8380b<Boolean> f20930eW = m25195a("disable_webview_hardware_acceleration", false);

    /* renamed from: eX */
    public static final C8380b<Boolean> f20931eX = m25195a("dsaovcf", false);

    /* renamed from: eY */
    public static final C8380b<Boolean> f20932eY = m25195a("daoar", false);

    /* renamed from: eZ */
    public static final C8380b<Boolean> f20933eZ = m25195a("use_uri_encode", false);

    /* renamed from: ea */
    public static final C8380b<Integer> f20934ea = m25195a("device_sensor_period_ms", Integer.valueOf(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED));

    /* renamed from: eb */
    public static final C8380b<Boolean> f20935eb = m25195a("dte", true);

    /* renamed from: ec */
    public static final C8380b<Boolean> f20936ec = m25195a("idcw", false);

    /* renamed from: ed */
    public static final C8380b<Long> f20937ed = m25195a("anr_debug_thread_refresh_time_ms", -1L);

    /* renamed from: ee */
    public static final C8380b<Integer> f20938ee = m25195a("fetch_basic_settings_delay_ms", 1500);

    /* renamed from: ef */
    public static final C8380b<Boolean> f20939ef = m25195a("cclia", true);

    /* renamed from: eg */
    public static final C8380b<Long> f20940eg = m25195a("lccdm", 10L);

    /* renamed from: eh */
    public static final C8380b<Integer> f20941eh = m25195a("lmfd", 2);

    /* renamed from: ei */
    public static final C8380b<Boolean> f20942ei = m25195a("is_track_ad_info", true);

    /* renamed from: ej */
    public static final C8380b<Boolean> f20943ej = m25195a("submit_ad_stats_enabled", false);

    /* renamed from: ek */
    public static final C8380b<Integer> f20944ek = m25195a("submit_ad_stats_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: el */
    public static final C8380b<Integer> f20945el = m25195a("submit_ad_stats_retry_count", 1);

    /* renamed from: em */
    public static final C8380b<Integer> f20946em = m25195a("submit_ad_stats_max_count", 500);

    /* renamed from: en */
    public static final C8380b<Boolean> f20947en = m25195a("asdm", false);

    /* renamed from: eo */
    public static final C8380b<String> f20948eo = m25195a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");

    /* renamed from: ep */
    public static final C8380b<String> f20949ep = m25195a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");

    /* renamed from: eq */
    public static final C8380b<Integer> f20950eq = m25195a("vast_max_response_length", 640000);

    /* renamed from: er */
    public static final C8380b<Integer> f20951er = m25195a("vast_max_wrapper_depth", 5);

    /* renamed from: es */
    public static final C8380b<String> f20952es = m25195a("vast_unsupported_video_extensions", "ogv,flv");

    /* renamed from: et */
    public static final C8380b<String> f20953et = m25195a("vast_unsupported_video_types", "video/ogg,video/x-flv");

    /* renamed from: eu */
    public static final C8380b<Boolean> f20954eu = m25195a("vast_validate_with_extension_if_no_video_type", true);

    /* renamed from: ev */
    public static final C8380b<Integer> f20955ev = m25195a("vast_video_selection_policy", Integer.valueOf(C8047n.C8049a.MEDIUM.ordinal()));

    /* renamed from: ew */
    public static final C8380b<Integer> f20956ew = m25195a("vast_wrapper_resolution_retry_count_v1", 1);

    /* renamed from: ex */
    public static final C8380b<Integer> f20957ex = m25195a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: ey */
    public static final C8380b<Integer> f20958ey = m25195a("vast_industry_icon_max_size", 24);

    /* renamed from: ez */
    public static final C8380b<Integer> f20959ez = m25195a("vast_industry_icon_margin", 12);

    /* renamed from: fa */
    public static final C8380b<Boolean> f20960fa = m25195a("anr_detection_enabled", false);

    /* renamed from: fb */
    public static final C8380b<Long> f20961fb = m25195a("anr_trigger_millis", 4000L);

    /* renamed from: fc */
    public static final C8380b<Long> f20962fc = m25195a("anr_touch_millis", 3000L);

    /* renamed from: fd */
    public static final C8380b<Long> f20963fd = m25195a("anr_check_millis", 3000L);

    /* renamed from: fe */
    public static final C8380b<Boolean> f20964fe = m25195a("frpcfn", false);

    /* renamed from: ff */
    public static final C8380b<Boolean> f20965ff = m25195a("use_in_memory_signal_providers", false);

    /* renamed from: fg */
    public static final C8380b<Boolean> f20966fg = m25195a("uobid", true);

    /* renamed from: fh */
    public static final C8380b<Boolean> f20967fh = m25195a("unrm", true);

    /* renamed from: fi */
    public static final C8380b<Boolean> f20968fi = m25195a("bvde", false);

    /* renamed from: fj */
    public static final C8380b<Long> f20969fj = m25195a("bvdidm", 1000L);

    /* renamed from: fk */
    public static final C8380b<Long> f20970fk = m25195a("bvdim", 4000L);

    /* renamed from: fl */
    public static final C8380b<Integer> f20971fl = m25195a("bvdrs", 10);

    /* renamed from: fm */
    public static final C8380b<Boolean> f20972fm = m25195a("bvad", false);

    /* renamed from: fn */
    public static final C8380b<Boolean> f20973fn = m25195a("bvebb", true);

    /* renamed from: fo */
    public static final C8380b<Boolean> f20974fo = m25195a("bvscb", true);

    /* renamed from: fp */
    public static final C8380b<Boolean> f20975fp = m25195a("apsobt", true);

    /* renamed from: fq */
    public static final C8380b<Boolean> f20976fq = m25195a("aetobt", false);

    /* renamed from: fr */
    public static final C8380b<Integer> f20977fr = m25195a("tmtp", 10);

    /* renamed from: fs */
    public static final C8380b<String> f20978fs = m25195a("config_consent_dialog_state", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);

    /* renamed from: ft */
    public static final C8380b<String> f20979ft = m25195a("country_code", "");

    /* renamed from: fu */
    public static final C8380b<Boolean> f20980fu = m25195a("communicator_enabled", true);

    /* renamed from: c */
    private final String f20981c;

    /* renamed from: d */
    private final T f20982d;

    public C8380b(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        } else if (t != null) {
            this.f20981c = str;
            this.f20982d = t;
        } else {
            throw new IllegalArgumentException("No default value specified");
        }
    }

    /* renamed from: a */
    protected static <T> C8380b<T> m25195a(String str, T t) {
        if (t == null) {
            throw new IllegalArgumentException("No default value specified");
        } else if (f20698a.contains(t.getClass())) {
            C8380b<T> bVar = new C8380b<>(str, t);
            if (!f20751b.containsKey(str)) {
                f20751b.put(str, bVar);
                return bVar;
            }
            throw new IllegalArgumentException("Setting has already been used: " + str);
        } else {
            throw new IllegalArgumentException("Unsupported value type: " + t.getClass());
        }
    }

    /* renamed from: c */
    public static Collection<C8380b<?>> m25196c() {
        return Collections.synchronizedCollection(f20751b.values());
    }

    /* renamed from: a */
    public T mo57084a(Object obj) {
        return this.f20982d.getClass().cast(obj);
    }

    /* renamed from: a */
    public String mo57085a() {
        return this.f20981c;
    }

    /* renamed from: b */
    public T mo57086b() {
        return this.f20982d;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof C8380b)) {
            return 0;
        }
        return this.f20981c.compareTo(((C8380b) obj).mo57085a());
    }
}
