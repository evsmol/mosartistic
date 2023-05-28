package com.applovin.impl.sdk.p255d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.d.f */
public class C8394f {

    /* renamed from: a */
    public static final C8394f f21082a = m25276a("ad_req");

    /* renamed from: b */
    public static final C8394f f21083b = m25276a("ad_imp");

    /* renamed from: c */
    public static final C8394f f21084c = m25276a("max_ad_imp");

    /* renamed from: d */
    public static final C8394f f21085d = m25276a("ad_session_start");

    /* renamed from: e */
    public static final C8394f f21086e = m25276a("ad_imp_session");

    /* renamed from: f */
    public static final C8394f f21087f = m25276a("max_ad_imp_session");

    /* renamed from: g */
    public static final C8394f f21088g = m25276a("cached_files_expired");

    /* renamed from: h */
    public static final C8394f f21089h = m25276a("cache_drop_count");

    /* renamed from: i */
    public static final C8394f f21090i = m25277a("sdk_reset_state_count", true);

    /* renamed from: j */
    public static final C8394f f21091j = m25277a("ad_response_process_failures", true);

    /* renamed from: k */
    public static final C8394f f21092k = m25277a("response_process_failures", true);

    /* renamed from: l */
    public static final C8394f f21093l = m25277a("incent_failed_to_display_count", true);

    /* renamed from: m */
    public static final C8394f f21094m = m25276a("app_paused_and_resumed");

    /* renamed from: n */
    public static final C8394f f21095n = m25277a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: o */
    public static final C8394f f21096o = m25276a("ad_shown_outside_app_count");

    /* renamed from: p */
    public static final C8394f f21097p = m25276a("med_ad_req");

    /* renamed from: q */
    public static final C8394f f21098q = m25277a("med_ad_response_process_failures", true);

    /* renamed from: r */
    public static final C8394f f21099r = m25277a("med_waterfall_ad_no_fill", true);

    /* renamed from: s */
    public static final C8394f f21100s = m25277a("med_waterfall_ad_adapter_load_failed", true);

    /* renamed from: t */
    public static final C8394f f21101t = m25277a("med_waterfall_ad_invalid_response", true);

    /* renamed from: u */
    private static final Set<String> f21102u = new HashSet(32);

    /* renamed from: w */
    private static final Set<C8394f> f21103w = new HashSet(16);

    /* renamed from: v */
    private final String f21104v;

    static {
        m25276a("fullscreen_ad_nil_vc_count");
        m25276a("applovin_bundle_missing");
    }

    private C8394f(String str) {
        this.f21104v = str;
    }

    /* renamed from: a */
    private static C8394f m25276a(String str) {
        return m25277a(str, false);
    }

    /* renamed from: a */
    private static C8394f m25277a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        } else if (!f21102u.contains(str)) {
            f21102u.add(str);
            C8394f fVar = new C8394f(str);
            if (z) {
                f21103w.add(fVar);
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
    }

    /* renamed from: b */
    public static Set<C8394f> m25278b() {
        return f21103w;
    }

    /* renamed from: a */
    public String mo57150a() {
        return this.f21104v;
    }
}
