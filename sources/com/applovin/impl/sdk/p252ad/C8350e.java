package com.applovin.impl.sdk.p252ad;

import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.adview.C7993i;
import com.applovin.impl.adview.C8023s;
import com.applovin.impl.adview.C8027v;
import com.applovin.impl.sdk.C8342aa;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p251a.C8315b;
import com.applovin.impl.sdk.p253b.C8377c;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8388a;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.C8571h;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.e */
public abstract class C8350e extends AppLovinAdImpl {

    /* renamed from: a */
    private final List<Uri> f20569a = CollectionUtils.synchronizedList();

    /* renamed from: b */
    private final AtomicBoolean f20570b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f20571c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicReference<C8377c> f20572d = new AtomicReference<>();

    /* renamed from: e */
    private List<C8388a> f20573e;

    /* renamed from: f */
    private List<C8388a> f20574f;

    /* renamed from: g */
    private List<C8388a> f20575g;

    /* renamed from: h */
    private List<C8388a> f20576h;

    /* renamed from: i */
    private C8354c f20577i;

    /* renamed from: com.applovin.impl.sdk.ad.e$a */
    public enum C8352a {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* renamed from: com.applovin.impl.sdk.ad.e$b */
    public enum C8353b {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* renamed from: com.applovin.impl.sdk.ad.e$c */
    public class C8354c {

        /* renamed from: a */
        public final int f20586a;

        /* renamed from: b */
        public final int f20587b;

        /* renamed from: c */
        public final int f20588c;

        /* renamed from: d */
        public final int f20589d;

        /* renamed from: e */
        public final int f20590e;

        private C8354c() {
            this.f20586a = AppLovinSdkUtils.dpToPx(C8350e.this.sdk.mo57332P(), C8350e.this.mo56967Y());
            this.f20587b = AppLovinSdkUtils.dpToPx(C8350e.this.sdk.mo57332P(), C8350e.this.mo56968Z());
            this.f20588c = AppLovinSdkUtils.dpToPx(C8350e.this.sdk.mo57332P(), C8350e.this.mo56986aa());
            this.f20589d = AppLovinSdkUtils.dpToPx(C8350e.this.sdk.mo57332P(), ((Integer) C8350e.this.sdk.mo57342a(C8380b.f20766bO)).intValue());
            this.f20590e = AppLovinSdkUtils.dpToPx(C8350e.this.sdk.mo57332P(), ((Integer) C8350e.this.sdk.mo57342a(C8380b.f20765bN)).intValue());
        }
    }

    /* renamed from: com.applovin.impl.sdk.ad.e$d */
    public enum C8355d {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public C8350e(JSONObject jSONObject, JSONObject jSONObject2, C8346b bVar, C8490n nVar) {
        super(jSONObject, jSONObject2, bVar, nVar);
    }

    /* renamed from: b */
    private C7993i.C7994a m25034b(boolean z) {
        return z ? C7993i.C7994a.WHITE_ON_TRANSPARENT : C7993i.C7994a.WHITE_ON_BLACK;
    }

    /* renamed from: b */
    private String m25036b(PointF pointF, boolean z) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", (String) null);
        Map<String, String> c = m25040c(pointF, z);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, c);
        }
        return null;
    }

    /* renamed from: b */
    private List<Integer> mo55841b() {
        return getIntegerListFromAdObject("multi_close_style", (List<Integer>) null);
    }

    /* renamed from: c */
    private String mo55842c() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", (String) null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    /* renamed from: c */
    private Map<String, String> m25040c(PointF pointF, boolean z) {
        Point a = C8571h.m26081a(this.sdk.mo57332P());
        Map<String, String> map = CollectionUtils.map(6);
        map.put(Utils.MACRO_CLCODE, getClCode());
        map.put(Utils.MACRO_CLICK_X, String.valueOf(pointF.x));
        map.put(Utils.MACRO_CLICK_Y, String.valueOf(pointF.y));
        map.put(Utils.MACRO_SCREEN_WIDTH, String.valueOf(a.x));
        map.put(Utils.MACRO_SCREEN_HEIGHT, String.valueOf(a.y));
        map.put(Utils.MACRO_IS_VIDEO_CLICK, String.valueOf(z));
        return map;
    }

    /* renamed from: A */
    public boolean mo56944A() {
        return getBooleanFromAdObject("html_resources_cached", false);
    }

    /* renamed from: B */
    public List<Uri> mo56945B() {
        return this.f20569a;
    }

    /* renamed from: C */
    public String mo56946C() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("video_button_properties", (JSONObject) null);
        return jsonObjectFromAdObject != null ? JsonUtils.getString(jsonObjectFromAdObject, "video_button_html", "") : "";
    }

    /* renamed from: D */
    public C8023s mo56947D() {
        return new C8023s(getJsonObjectFromAdObject("video_button_properties", (JSONObject) null), this.sdk);
    }

    /* renamed from: E */
    public boolean mo55824E() {
        return getBooleanFromAdObject("video_clickable", false);
    }

    /* renamed from: F */
    public boolean mo56948F() {
        return getBooleanFromAdObject("lock_current_orientation", false);
    }

    /* renamed from: G */
    public C8352a mo56949G() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", (String) null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return C8352a.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return C8352a.DO_NOT_DISMISS;
            }
        }
        return C8352a.UNSPECIFIED;
    }

    /* renamed from: H */
    public List<String> mo56950H() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", (String) null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    /* renamed from: I */
    public List<String> mo56951I() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", (String) null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : this.sdk.mo57380b(C8380b.f20802by);
    }

    /* renamed from: J */
    public boolean mo56952J() {
        return getBooleanFromAdObject("sruifwvc", false);
    }

    /* renamed from: K */
    public boolean mo56953K() {
        return getBooleanFromAdObject("require_interaction_for_click", false);
    }

    /* renamed from: L */
    public String mo56954L() {
        return getStringFromAdObject("cache_prefix", (String) null);
    }

    /* renamed from: M */
    public boolean mo56955M() {
        return getBooleanFromAdObject("sscomt", false);
    }

    /* renamed from: N */
    public String mo56956N() {
        return getStringFromFullResponse("event_id", (String) null);
    }

    /* renamed from: O */
    public boolean mo56957O() {
        return getBooleanFromAdObject("progress_bar_enabled", false);
    }

    /* renamed from: P */
    public int mo56958P() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    /* renamed from: Q */
    public int mo56959Q() {
        int videoCompletionPercent;
        synchronized (this.adObjectLock) {
            videoCompletionPercent = Utils.getVideoCompletionPercent(this.adObject);
        }
        return videoCompletionPercent;
    }

    /* renamed from: R */
    public int mo56960R() {
        synchronized (this.adObjectLock) {
            int i = JsonUtils.getInt(this.adObject, "graphic_completion_percent", -1);
            if (i < 0 || i > 100) {
                return 90;
            }
            return i;
        }
    }

    /* renamed from: S */
    public int mo56961S() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    /* renamed from: T */
    public int mo56962T() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    /* renamed from: U */
    public boolean mo56963U() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", false);
    }

    /* renamed from: V */
    public boolean mo56964V() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", false);
    }

    /* renamed from: W */
    public boolean mo56965W() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", false);
    }

    /* renamed from: X */
    public C8354c mo56966X() {
        if (this.f20577i == null) {
            this.f20577i = new C8354c();
        }
        return this.f20577i;
    }

    /* renamed from: Y */
    public int mo56967Y() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.mo57342a(C8380b.f20847cr)).intValue());
    }

    /* renamed from: Z */
    public int mo56968Z() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.mo57342a(C8380b.f20848cs)).intValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7993i.C7994a mo56969a(int i) {
        return i == 1 ? C7993i.C7994a.WHITE_ON_TRANSPARENT : i == 2 ? C7993i.C7994a.INVISIBLE : i == 3 ? C7993i.C7994a.TRANSPARENT_SKIP : C7993i.C7994a.WHITE_ON_BLACK;
    }

    /* renamed from: a */
    public List<C8388a> mo56970a(PointF pointF) {
        List<C8388a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_click_tracking_urls", this.adObject, m25040c(pointF, true), (String) null, mo57005au(), mo57027z(), this.sdk);
        }
        return postbacks.isEmpty() ? mo56971a(pointF, true) : postbacks;
    }

    /* renamed from: a */
    public List<C8388a> mo56971a(PointF pointF, boolean z) {
        List<C8388a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, m25040c(pointF, z), m25036b(pointF, z), mo57005au(), mo57027z(), this.sdk);
        }
        return postbacks;
    }

    /* renamed from: a */
    public abstract void mo55827a();

    /* renamed from: a */
    public void mo56972a(C8377c cVar) {
        this.f20572d.set(cVar);
    }

    /* renamed from: a */
    public void mo56973a(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html_resources_cached", z);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: aA */
    public List<String> mo56974aA() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    /* renamed from: aB */
    public List<String> mo56975aB() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", (String) null));
    }

    /* renamed from: aC */
    public Uri mo56976aC() {
        String stringFromAdObject = getStringFromAdObject("mute_image", (String) null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aD */
    public Uri mo56977aD() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aE */
    public boolean mo56978aE() {
        return this.f20571c.get();
    }

    /* renamed from: aF */
    public void mo56979aF() {
        this.f20571c.set(true);
    }

    /* renamed from: aG */
    public C8377c mo56980aG() {
        return this.f20572d.getAndSet((Object) null);
    }

    /* renamed from: aH */
    public boolean mo56981aH() {
        String str = this.sdk.mo57400q().getExtraParameters().get(AppLovinSdkExtraParameterKey.SHOULD_USE_EXOPLAYER);
        return StringUtils.isValidString(str) ? Boolean.parseBoolean(str) : getBooleanFromAdObject("suep", false);
    }

    /* renamed from: aI */
    public boolean mo56982aI() {
        return getBooleanFromAdObject("rwvbv", false);
    }

    /* renamed from: aJ */
    public boolean mo56983aJ() {
        return getBooleanFromAdObject("upiosp", false);
    }

    /* renamed from: aK */
    public boolean mo56984aK() {
        return getBooleanFromAdObject("web_video", false);
    }

    /* renamed from: aL */
    public C8355d mo56985aL() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", (String) null);
        return "top".equals(stringFromAdObject) ? C8355d.TOP : "bottom".equals(stringFromAdObject) ? C8355d.BOTTOM : "left".equals(stringFromAdObject) ? C8355d.LEFT : "right".equals(stringFromAdObject) ? C8355d.RIGHT : C8355d.RESIZE_ASPECT;
    }

    /* renamed from: aa */
    public int mo56986aa() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.mo57342a(C8380b.f20846cq)).intValue());
    }

    /* renamed from: ab */
    public boolean mo56987ab() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.mo57342a(C8380b.f20845cp));
    }

    /* renamed from: ac */
    public boolean mo56988ac() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.mo57342a(C8380b.f20852cw));
    }

    /* renamed from: ad */
    public long mo56989ad() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1;
    }

    /* renamed from: ae */
    public int mo56990ae() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    /* renamed from: af */
    public boolean mo56991af() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", true);
    }

    /* renamed from: ag */
    public AtomicBoolean mo56992ag() {
        return this.f20570b;
    }

    /* renamed from: ah */
    public boolean mo56993ah() {
        return getBooleanFromAdObject("show_nia", false);
    }

    /* renamed from: ai */
    public String mo56994ai() {
        return getStringFromAdObject("nia_title", "");
    }

    /* renamed from: aj */
    public String mo56995aj() {
        return getStringFromAdObject("nia_message", "");
    }

    /* renamed from: ak */
    public String mo56996ak() {
        return getStringFromAdObject("nia_button_title", "");
    }

    /* renamed from: al */
    public boolean mo56997al() {
        return getBooleanFromAdObject("avoms", false);
    }

    /* renamed from: am */
    public boolean mo56998am() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    /* renamed from: an */
    public String mo56999an() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    /* renamed from: ao */
    public String mo57000ao() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    /* renamed from: ap */
    public String mo57001ap() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    /* renamed from: aq */
    public List<C8388a> mo57002aq() {
        List<C8388a> postbacks;
        List<C8388a> list = this.f20573e;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_end_urls", this.adObject, getClCode(), mo55842c(), this.sdk);
            this.f20573e = postbacks;
        }
        return postbacks;
    }

    /* renamed from: ar */
    public List<C8388a> mo57003ar() {
        List<C8388a> postbacks;
        List<C8388a> list = this.f20574f;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("ad_closed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f20574f = postbacks;
        }
        return postbacks;
    }

    /* renamed from: as */
    public List<C8388a> mo57004as() {
        List<C8388a> postbacks;
        List<C8388a> list = this.f20575g;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("app_killed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f20575g = postbacks;
        }
        return postbacks;
    }

    /* renamed from: at */
    public List<C8388a> mo55840at() {
        List<C8388a> postbacks;
        List<C8388a> list = this.f20576h;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("imp_urls", this.adObject, getClCode(), (Map<String, String>) null, (String) null, mo57005au(), mo57027z(), this.sdk);
            this.f20576h = postbacks;
        }
        return postbacks;
    }

    /* renamed from: au */
    public Map<String, String> mo57005au() {
        Map<String, String> map = CollectionUtils.map();
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", false)) {
            map.put("User-Agent", C8342aa.m24982a());
        }
        return map;
    }

    /* renamed from: av */
    public boolean mo57006av() {
        return getBooleanFromAdObject("playback_requires_user_action", true);
    }

    /* renamed from: aw */
    public String mo57007aw() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    /* renamed from: ax */
    public boolean mo57008ax() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", false);
    }

    /* renamed from: ay */
    public C8027v mo57009ay() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", (JSONObject) null);
        if (jsonObjectFromAdObject != null) {
            return new C8027v(jsonObjectFromAdObject);
        }
        return null;
    }

    /* renamed from: az */
    public int mo57010az() {
        return getIntFromAdObject("whalt", Utils.isBML(getSize()) ? 1 : ((Boolean) this.sdk.mo57342a(C8380b.f20930eW)).booleanValue() ? 0 : -1);
    }

    /* renamed from: b */
    public void mo57011b(Uri uri) {
        this.f20569a.add(uri);
    }

    /* renamed from: c */
    public void mo57012c(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "mute_image", uri);
        }
    }

    /* renamed from: d */
    public abstract String mo55843d();

    /* renamed from: d */
    public void mo57013d(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "unmute_image", uri);
        }
    }

    /* renamed from: f */
    public boolean mo55846f() {
        this.sdk.mo57320D();
        if (!C8626v.m26252a()) {
            return false;
        }
        this.sdk.mo57320D().mo57822e("DirectAd", "Attempting to invoke isVideoStream() from base ad class");
        return false;
    }

    public Bundle getDirectDownloadParameters() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("ah_parameters", (JSONObject) null);
        if (jsonObjectFromAdObject != null) {
            return JsonUtils.toBundle(jsonObjectFromAdObject);
        }
        return null;
    }

    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", (String) null);
    }

    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", (String) null);
    }

    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return Collections.emptyList();
    }

    /* renamed from: h */
    public Uri mo55850h() {
        this.sdk.mo57320D();
        if (!C8626v.m26252a()) {
            return null;
        }
        this.sdk.mo57320D().mo57822e("DirectAd", "Attempting to invoke getVideoUri() from base ad class");
        return null;
    }

    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    public abstract boolean isOpenMeasurementEnabled();

    /* renamed from: j */
    public Uri mo55855j() {
        this.sdk.mo57320D();
        if (!C8626v.m26252a()) {
            return null;
        }
        this.sdk.mo57320D().mo57822e("DirectAd", "Attempting to invoke getClickDestinationUri() from base ad class");
        return null;
    }

    /* renamed from: k */
    public Uri mo55856k() {
        this.sdk.mo57320D();
        if (!C8626v.m26252a()) {
            return null;
        }
        this.sdk.mo57320D().mo57822e("DirectAd", "Attempting to invoke getVideoClickDestinationUri() from base ad class");
        return null;
    }

    /* renamed from: o */
    public abstract C8315b mo55860o();

    /* renamed from: p */
    public C8353b mo57017p() {
        String upperCase = getStringFromAdObject("ad_target", C8353b.DEFAULT.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? C8353b.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? C8353b.ACTIVITY_LANDSCAPE : C8353b.DEFAULT;
    }

    /* renamed from: q */
    public boolean mo57018q() {
        return getBooleanFromAdObject("iopmsdc", false);
    }

    /* renamed from: r */
    public long mo57019r() {
        return getLongFromAdObject("close_delay", 0);
    }

    /* renamed from: s */
    public long mo57020s() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5));
    }

    /* renamed from: t */
    public long mo57021t() {
        List<Integer> u = mo57022u();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (u == null || u.size() <= 0) ? 0 : (long) u.get(0).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0;
        }
        return longFromAdObject;
    }

    /* renamed from: u */
    public List<Integer> mo57022u() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", (List<Integer>) null);
    }

    /* renamed from: v */
    public C7993i.C7994a mo57023v() {
        List<Integer> b = mo55841b();
        int intFromAdObject = getIntFromAdObject("close_style", (b == null || b.size() <= 0) ? -1 : b.get(0).intValue());
        return intFromAdObject == -1 ? m25034b(hasVideoUrl()) : mo56969a(intFromAdObject);
    }

    /* renamed from: w */
    public List<C7993i.C7994a> mo57024w() {
        List<Integer> b = mo55841b();
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b.size());
        for (Integer intValue : b) {
            arrayList.add(mo56969a(intValue.intValue()));
        }
        return arrayList;
    }

    /* renamed from: x */
    public C7993i.C7994a mo57025x() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? mo57023v() : mo56969a(intFromAdObject);
    }

    /* renamed from: y */
    public boolean mo57026y() {
        return getBooleanFromAdObject("dismiss_on_skip", false);
    }

    /* renamed from: z */
    public boolean mo57027z() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", false);
    }
}
