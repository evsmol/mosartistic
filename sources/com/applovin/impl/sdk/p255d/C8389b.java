package com.applovin.impl.sdk.p255d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.d.b */
public class C8389b {

    /* renamed from: A */
    public static final C8389b f21037A = m25248a("wvrec", "WEB_VIEW_RENDER_ERROR_COUNT");

    /* renamed from: B */
    public static final C8389b f21038B = m25248a("wvsem", "WEB_VIEW_SSL_ERROR_MESSAGES");

    /* renamed from: C */
    public static final C8389b f21039C = m25248a("wvruc", "WEB_VIEW_RENDERER_UNRESPONSIVE_COUNT");

    /* renamed from: F */
    private static final Set<String> f21040F = new HashSet(32);

    /* renamed from: a */
    public static final C8389b f21041a = m25248a("sas", "AD_SOURCE");

    /* renamed from: b */
    public static final C8389b f21042b = m25248a("srt", "AD_RENDER_TIME");

    /* renamed from: c */
    public static final C8389b f21043c = m25248a("sft", "AD_FETCH_TIME");

    /* renamed from: d */
    public static final C8389b f21044d = m25248a("sfs", "AD_FETCH_SIZE");

    /* renamed from: e */
    public static final C8389b f21045e = m25248a("sadb", "AD_DOWNLOADED_BYTES");

    /* renamed from: f */
    public static final C8389b f21046f = m25248a("sacb", "AD_CACHED_BYTES");

    /* renamed from: g */
    public static final C8389b f21047g = m25248a("stdl", "TIME_TO_DISPLAY_FROM_LOAD");

    /* renamed from: h */
    public static final C8389b f21048h = m25248a("stdi", "TIME_TO_DISPLAY_FROM_INIT");

    /* renamed from: i */
    public static final C8389b f21049i = m25248a("snas", "AD_NUMBER_IN_SESSION");

    /* renamed from: j */
    public static final C8389b f21050j = m25248a("snat", "AD_NUMBER_TOTAL");

    /* renamed from: k */
    public static final C8389b f21051k = m25248a("stah", "TIME_AD_HIDDEN_FROM_SHOW");

    /* renamed from: l */
    public static final C8389b f21052l = m25248a("stas", "TIME_TO_SKIP_FROM_SHOW");

    /* renamed from: m */
    public static final C8389b f21053m = m25248a("stac", "TIME_TO_CLICK_FROM_SHOW");

    /* renamed from: n */
    public static final C8389b f21054n = m25248a("stbe", "TIME_TO_EXPAND_FROM_SHOW");

    /* renamed from: o */
    public static final C8389b f21055o = m25248a("stbc", "TIME_TO_CONTRACT_FROM_SHOW");

    /* renamed from: p */
    public static final C8389b f21056p = m25248a("suvs", "INTERSTITIAL_USED_VIDEO_STREAM");

    /* renamed from: q */
    public static final C8389b f21057q = m25248a("sugs", "AD_USED_GRAPHIC_STREAM");

    /* renamed from: r */
    public static final C8389b f21058r = m25248a("svpv", "INTERSTITIAL_VIDEO_PERCENT_VIEWED");

    /* renamed from: s */
    public static final C8389b f21059s = m25248a("stpd", "INTERSTITIAL_PAUSED_DURATION");

    /* renamed from: t */
    public static final C8389b f21060t = m25248a("shsc", "HTML_RESOURCE_CACHE_SUCCESS_COUNT");

    /* renamed from: u */
    public static final C8389b f21061u = m25248a("shfc", "HTML_RESOURCE_CACHE_FAILURE_COUNT");

    /* renamed from: v */
    public static final C8389b f21062v = m25248a("schc", "AD_CANCELLED_HTML_CACHING");

    /* renamed from: w */
    public static final C8389b f21063w = m25248a("smwm", "AD_SHOWN_IN_MULTIWINDOW_MODE");

    /* renamed from: x */
    public static final C8389b f21064x = m25248a("vssc", "VIDEO_STREAM_STALLED_COUNT");

    /* renamed from: y */
    public static final C8389b f21065y = m25248a("wvem", "WEB_VIEW_ERROR_MESSAGES");

    /* renamed from: z */
    public static final C8389b f21066z = m25248a("wvhec", "WEB_VIEW_HTTP_ERROR_COUNT");

    /* renamed from: D */
    private final String f21067D;

    /* renamed from: E */
    private final String f21068E;

    static {
        m25248a("sisw", "IS_STREAMING_WEBKIT");
        m25248a("surw", "UNABLE_TO_RETRIEVE_WEBKIT_HTML_STRING");
        m25248a("surp", "UNABLE_TO_PERSIST_WEBKIT_HTML_PLACEMENT_REPLACED_STRING");
        m25248a("swhp", "SUCCESSFULLY_PERSISTED_WEBKIT_HTML_STRING");
        m25248a("skr", "STOREKIT_REDIRECTED");
        m25248a("sklf", "STOREKIT_LOAD_FAILURE");
        m25248a("skps", "STOREKIT_PRELOAD_SKIPPED");
    }

    private C8389b(String str, String str2) {
        this.f21067D = str;
        this.f21068E = str2;
    }

    /* renamed from: a */
    private static C8389b m25248a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        } else if (f21040F.contains(str)) {
            throw new IllegalArgumentException("Key has already been used: " + str);
        } else if (!TextUtils.isEmpty(str2)) {
            f21040F.add(str);
            return new C8389b(str, str2);
        } else {
            throw new IllegalArgumentException("No debug name specified");
        }
    }
}
