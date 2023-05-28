package com.applovin.impl.p233b;

import android.net.Uri;
import com.applovin.impl.p233b.C8047n;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p251a.C8328g;
import com.applovin.impl.sdk.p252ad.C8346b;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8388a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.applovin.impl.b.a */
public class C8029a extends C8350e {

    /* renamed from: a */
    private final String f19389a;

    /* renamed from: b */
    private final String f19390b;

    /* renamed from: c */
    private final C8043j f19391c;

    /* renamed from: d */
    private final long f19392d;

    /* renamed from: e */
    private final C8047n f19393e;

    /* renamed from: f */
    private final C8036d f19394f;

    /* renamed from: g */
    private final String f19395g;

    /* renamed from: h */
    private final C8035c f19396h;

    /* renamed from: i */
    private final C8328g f19397i;

    /* renamed from: j */
    private final Set<C8044k> f19398j;

    /* renamed from: k */
    private final Set<C8044k> f19399k;

    /* renamed from: com.applovin.impl.b.a$a */
    public static class C8031a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public JSONObject f19400a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public JSONObject f19401b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C8346b f19402c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C8490n f19403d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f19404e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f19405f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f19406g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C8043j f19407h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C8047n f19408i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C8036d f19409j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C8035c f19410k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Set<C8044k> f19411l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Set<C8044k> f19412m;

        /* renamed from: a */
        public C8031a mo55862a(long j) {
            this.f19404e = j;
            return this;
        }

        /* renamed from: a */
        public C8031a mo55863a(C8035c cVar) {
            this.f19410k = cVar;
            return this;
        }

        /* renamed from: a */
        public C8031a mo55864a(C8036d dVar) {
            this.f19409j = dVar;
            return this;
        }

        /* renamed from: a */
        public C8031a mo55865a(C8043j jVar) {
            this.f19407h = jVar;
            return this;
        }

        /* renamed from: a */
        public C8031a mo55866a(C8047n nVar) {
            this.f19408i = nVar;
            return this;
        }

        /* renamed from: a */
        public C8031a mo55867a(C8346b bVar) {
            this.f19402c = bVar;
            return this;
        }

        /* renamed from: a */
        public C8031a mo55868a(C8490n nVar) {
            if (nVar != null) {
                this.f19403d = nVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        /* renamed from: a */
        public C8031a mo55869a(String str) {
            this.f19405f = str;
            return this;
        }

        /* renamed from: a */
        public C8031a mo55870a(Set<C8044k> set) {
            this.f19411l = set;
            return this;
        }

        /* renamed from: a */
        public C8031a mo55871a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f19400a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        /* renamed from: a */
        public C8029a mo55872a() {
            return new C8029a(this);
        }

        /* renamed from: b */
        public C8031a mo55873b(String str) {
            this.f19406g = str;
            return this;
        }

        /* renamed from: b */
        public C8031a mo55874b(Set<C8044k> set) {
            this.f19412m = set;
            return this;
        }

        /* renamed from: b */
        public C8031a mo55875b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f19401b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }
    }

    /* renamed from: com.applovin.impl.b.a$b */
    public enum C8032b {
        COMPANION_AD,
        VIDEO
    }

    /* renamed from: com.applovin.impl.b.a$c */
    public enum C8033c {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private C8029a(C8031a aVar) {
        super(aVar.f19400a, aVar.f19401b, aVar.f19402c, aVar.f19403d);
        this.f19389a = aVar.f19405f;
        this.f19391c = aVar.f19407h;
        this.f19390b = aVar.f19406g;
        this.f19393e = aVar.f19408i;
        this.f19394f = aVar.f19409j;
        this.f19396h = aVar.f19410k;
        this.f19398j = aVar.f19411l;
        this.f19399k = aVar.f19412m;
        this.f19397i = new C8328g(this);
        Uri h = mo55850h();
        this.f19395g = h != null ? h.toString() : "";
        this.f19392d = aVar.f19404e;
    }

    /* renamed from: a */
    private Set<C8044k> m23840a(C8032b bVar, String[] strArr) {
        C8036d dVar;
        C8047n nVar;
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map<String, Set<C8044k>> map = null;
        if (bVar == C8032b.VIDEO && (nVar = this.f19393e) != null) {
            map = nVar.mo55937e();
        } else if (bVar == C8032b.COMPANION_AD && (dVar = this.f19394f) != null) {
            map = dVar.mo55890d();
        }
        HashSet hashSet = new HashSet();
        if (map != null && !map.isEmpty()) {
            for (String str : strArr) {
                if (map.containsKey(str)) {
                    hashSet.addAll(map.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: aX */
    private String m23841aX() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", (String) null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    /* renamed from: aY */
    private C8047n.C8049a m23842aY() {
        C8047n.C8049a[] values = C8047n.C8049a.values();
        int intValue = ((Integer) this.sdk.mo57342a(C8380b.f20955ev)).intValue();
        return (intValue < 0 || intValue >= values.length) ? C8047n.C8049a.UNSPECIFIED : values[intValue];
    }

    /* renamed from: aZ */
    private Set<C8044k> m23843aZ() {
        C8047n nVar = this.f19393e;
        return nVar != null ? nVar.mo55936d() : Collections.emptySet();
    }

    /* renamed from: ba */
    private Set<C8044k> m23844ba() {
        C8036d dVar = this.f19394f;
        return dVar != null ? dVar.mo55889c() : Collections.emptySet();
    }

    /* renamed from: E */
    public boolean mo55824E() {
        return getBooleanFromAdObject("video_clickable", false) && mo55855j() != null;
    }

    /* renamed from: a */
    public Set<C8044k> mo55825a(C8033c cVar, String str) {
        return mo55826a(cVar, new String[]{str});
    }

    /* renamed from: a */
    public Set<C8044k> mo55826a(C8033c cVar, String[] strArr) {
        this.sdk.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = this.sdk.mo57320D();
            D.mo57818b("VastAd", "Retrieving trackers of type '" + cVar + "' and events '" + strArr + "'...");
        }
        if (cVar == C8033c.IMPRESSION) {
            return this.f19398j;
        }
        if (cVar == C8033c.VIDEO_CLICK) {
            return m23843aZ();
        }
        if (cVar == C8033c.COMPANION_CLICK) {
            return m23844ba();
        }
        if (cVar == C8033c.VIDEO) {
            return m23840a(C8032b.VIDEO, strArr);
        }
        if (cVar == C8033c.COMPANION) {
            return m23840a(C8032b.COMPANION_AD, strArr);
        }
        if (cVar == C8033c.INDUSTRY_ICON_CLICK) {
            return mo55832aP().mo55907e();
        }
        if (cVar == C8033c.INDUSTRY_ICON_IMPRESSION) {
            return mo55832aP().mo55908f();
        }
        if (cVar == C8033c.ERROR) {
            return this.f19399k;
        }
        this.sdk.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D2 = this.sdk.mo57320D();
            D2.mo57822e("VastAd", "Failed to retrieve trackers of invalid type '" + cVar + "' and events '" + strArr + "'");
        }
        return Collections.emptySet();
    }

    /* renamed from: a */
    public void mo55827a() {
    }

    /* renamed from: a */
    public void mo55828a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    /* renamed from: aM */
    public C8047n mo55829aM() {
        return this.f19393e;
    }

    /* renamed from: aN */
    public C8050o mo55830aN() {
        C8047n nVar = this.f19393e;
        if (nVar != null) {
            return nVar.mo55932a(m23842aY());
        }
        return null;
    }

    /* renamed from: aO */
    public C8036d mo55831aO() {
        return this.f19394f;
    }

    /* renamed from: aP */
    public C8039g mo55832aP() {
        C8047n nVar = this.f19393e;
        if (nVar != null) {
            return nVar.mo55939f();
        }
        return null;
    }

    /* renamed from: aQ */
    public boolean mo55833aQ() {
        return mo55832aP() != null;
    }

    /* renamed from: aR */
    public boolean mo55834aR() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", false);
    }

    /* renamed from: aS */
    public String mo55835aS() {
        return getStringFromAdObject("html_template", "");
    }

    /* renamed from: aT */
    public Uri mo55836aT() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", (String) null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aU */
    public boolean mo55837aU() {
        return getBooleanFromAdObject("cache_companion_ad", true);
    }

    /* renamed from: aV */
    public boolean mo55838aV() {
        return getBooleanFromAdObject("cache_video", true);
    }

    /* renamed from: aW */
    public C8035c mo55839aW() {
        return this.f19396h;
    }

    /* renamed from: at */
    public List<C8388a> mo55840at() {
        List<C8388a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("vimp_urls", this.adObject, getClCode(), (Map<String, String>) null, m23841aX(), mo57005au(), mo57027z(), this.sdk);
        }
        return postbacks;
    }

    /* renamed from: b */
    public void mo55841b() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    /* renamed from: c */
    public boolean mo55842c() {
        return getBooleanFromAdObject("iopms", false);
    }

    /* renamed from: d */
    public String mo55843d() {
        return this.f19395g;
    }

    /* renamed from: e */
    public boolean mo55844e() {
        return getBooleanFromAdObject("iopmsfsr", true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8029a) || !super.equals(obj)) {
            return false;
        }
        C8029a aVar = (C8029a) obj;
        String str = this.f19389a;
        if (str == null ? aVar.f19389a != null : !str.equals(aVar.f19389a)) {
            return false;
        }
        String str2 = this.f19390b;
        if (str2 == null ? aVar.f19390b != null : !str2.equals(aVar.f19390b)) {
            return false;
        }
        C8043j jVar = this.f19391c;
        if (jVar == null ? aVar.f19391c != null : !jVar.equals(aVar.f19391c)) {
            return false;
        }
        C8047n nVar = this.f19393e;
        if (nVar == null ? aVar.f19393e != null : !nVar.equals(aVar.f19393e)) {
            return false;
        }
        C8036d dVar = this.f19394f;
        if (dVar == null ? aVar.f19394f != null : !dVar.equals(aVar.f19394f)) {
            return false;
        }
        C8035c cVar = this.f19396h;
        if (cVar == null ? aVar.f19396h != null : !cVar.equals(aVar.f19396h)) {
            return false;
        }
        Set<C8044k> set = this.f19398j;
        if (set == null ? aVar.f19398j != null : !set.equals(aVar.f19398j)) {
            return false;
        }
        Set<C8044k> set2 = this.f19399k;
        Set<C8044k> set3 = aVar.f19399k;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    /* renamed from: f */
    public boolean mo55846f() {
        return getBooleanFromAdObject("vast_is_streaming", false);
    }

    /* renamed from: g */
    public C8328g mo55860o() {
        return this.f19397i;
    }

    public long getCreatedAtMillis() {
        return this.f19392d;
    }

    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    /* renamed from: h */
    public Uri mo55850h() {
        C8050o aN = mo55830aN();
        if (aN != null) {
            return aN.mo55946b();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo55933a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasVideoUrl() {
        /*
            r2 = this;
            com.applovin.impl.b.n r0 = r2.f19393e
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = r0.mo55933a()
            if (r0 == 0) goto L_0x0012
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0012
            r1 = 1
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.p233b.C8029a.hasVideoUrl():boolean");
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f19389a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19390b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C8043j jVar = this.f19391c;
        int hashCode4 = (hashCode3 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        C8047n nVar = this.f19393e;
        int hashCode5 = (hashCode4 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C8036d dVar = this.f19394f;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C8035c cVar = this.f19396h;
        int hashCode7 = (hashCode6 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Set<C8044k> set = this.f19398j;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set<C8044k> set2 = this.f19399k;
        if (set2 != null) {
            i = set2.hashCode();
        }
        return hashCode8 + i;
    }

    /* renamed from: i */
    public long mo55853i() {
        return getLongFromAdObject("real_close_delay", 0);
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject(IabUtils.KEY_OM_SDK_ENABLED, true) && this.f19396h != null;
    }

    /* renamed from: j */
    public Uri mo55855j() {
        C8047n nVar = this.f19393e;
        if (nVar != null) {
            return nVar.mo55935c();
        }
        return null;
    }

    /* renamed from: k */
    public Uri mo55856k() {
        return mo55855j();
    }

    /* renamed from: l */
    public C8032b mo55857l() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? C8032b.COMPANION_AD : C8032b.VIDEO;
    }

    /* renamed from: m */
    public boolean mo55858m() {
        return getBooleanFromAdObject("vast_immediate_ad_load", true);
    }

    /* renamed from: n */
    public C8043j mo55859n() {
        return this.f19391c;
    }

    public String toString() {
        return "VastAd{title='" + this.f19389a + '\'' + ", adDescription='" + this.f19390b + '\'' + ", systemInfo=" + this.f19391c + ", videoCreative=" + this.f19393e + ", companionAd=" + this.f19394f + ", adVerifications=" + this.f19396h + ", impressionTrackers=" + this.f19398j + ", errorTrackers=" + this.f19399k + '}';
    }
}
