package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.ads.C8105a;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p235b.C8114b;
import com.applovin.impl.mediation.p235b.C8119c;
import com.applovin.impl.mediation.p236c.C8134c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* renamed from: com.applovin.impl.mediation.d */
public class C8135d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f19817a;

    /* renamed from: b */
    private final Map<String, C8140c> f19818b = CollectionUtils.map(4);

    /* renamed from: c */
    private final Object f19819c = new Object();

    /* renamed from: d */
    private final Map<String, C8070a> f19820d = CollectionUtils.map(4);

    /* renamed from: e */
    private final Object f19821e = new Object();

    /* renamed from: com.applovin.impl.mediation.d$a */
    public enum C8137a {
        PUBLISHER_INITIATED("publisher_initiated"),
        SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
        REFRESH("refresh"),
        EXPONENTIAL_RETRY("exponential_retry"),
        EXPIRED("expired"),
        NATIVE_AD_PLACER("native_ad_placer");
        

        /* renamed from: g */
        private final String f19837g;

        private C8137a(String str) {
            this.f19837g = str;
        }

        /* renamed from: a */
        public String mo56298a() {
            return this.f19837g;
        }
    }

    /* renamed from: com.applovin.impl.mediation.d$b */
    private static class C8138b implements C8105a.C8106a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C8490n f19838a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final WeakReference<Context> f19839b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C8135d f19840c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C8140c f19841d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final MaxAdFormat f19842e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final Map<String, Object> f19843f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Map<String, Object> f19844g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final Map<String, Object> f19845h;

        /* renamed from: i */
        private final int f19846i;

        /* renamed from: j */
        private long f19847j;

        private C8138b(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, C8140c cVar, MaxAdFormat maxAdFormat, long j, C8135d dVar, C8490n nVar, Context context) {
            this.f19838a = nVar;
            this.f19839b = new WeakReference<>(context);
            this.f19840c = dVar;
            this.f19841d = cVar;
            this.f19842e = maxAdFormat;
            this.f19844g = map2;
            this.f19843f = map;
            this.f19845h = map3;
            this.f19847j = j;
            this.f19846i = CollectionUtils.getBoolean(map2, AppLovinSdkExtraParameterKey.DISABLE_AUTO_RETRIES) ? -1 : (!maxAdFormat.isAdViewAd() || !CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) ? ((Integer) nVar.mo57342a(C8379a.f20660O)).intValue() : Math.min(2, ((Integer) nVar.mo57342a(C8379a.f20660O)).intValue());
        }

        public void onAdClicked(MaxAd maxAd) {
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        public void onAdDisplayed(MaxAd maxAd) {
        }

        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        public void onAdLoadFailed(final String str, MaxError maxError) {
            if (!this.f19838a.mo57358a(C8379a.f20661P, this.f19842e) || this.f19841d.f19853c >= this.f19846i) {
                int unused = this.f19841d.f19853c = 0;
                this.f19841d.f19852b.set(false);
                if (this.f19841d.f19854d != null) {
                    MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                    maxErrorImpl.setLoadTag(this.f19841d.f19851a);
                    maxErrorImpl.setRequestLatencyMillis(SystemClock.elapsedRealtime() - this.f19847j);
                    C8575k.m26132a((MaxAdListener) this.f19841d.f19854d, str, maxError);
                    C8105a.C8106a unused2 = this.f19841d.f19854d = null;
                    return;
                }
                return;
            }
            C8140c.m24389e(this.f19841d);
            final int pow = (int) Math.pow(2.0d, (double) this.f19841d.f19853c);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C8138b.this.f19844g.put("retry_delay_sec", Integer.valueOf(pow));
                    C8138b.this.f19844g.put("retry_attempt", Integer.valueOf(C8138b.this.f19841d.f19853c));
                    Context context = (Context) C8138b.this.f19839b.get();
                    if (context == null) {
                        context = C8138b.this.f19838a.mo57332P();
                    }
                    C8138b.this.f19845h.put("art", C8137a.EXPONENTIAL_RETRY.mo56298a());
                    C8138b.this.f19845h.put("era", Integer.valueOf(C8138b.this.f19841d.f19853c));
                    C8138b.this.f19840c.m24366a(str, C8138b.this.f19842e, C8138b.this.f19843f, C8138b.this.f19844g, C8138b.this.f19845h, context, C8138b.this);
                }
            }, TimeUnit.SECONDS.toMillis((long) pow));
        }

        public void onAdLoaded(MaxAd maxAd) {
            C8070a aVar = (C8070a) maxAd;
            aVar.mo56064a(this.f19841d.f19851a);
            aVar.mo56061a(SystemClock.elapsedRealtime() - this.f19847j);
            int unused = this.f19841d.f19853c = 0;
            if (this.f19841d.f19854d != null) {
                aVar.mo56072g().mo56563e().mo56037a(this.f19841d.f19854d);
                this.f19841d.f19854d.onAdLoaded(aVar);
                if (aVar.mo56069d().endsWith("load")) {
                    this.f19841d.f19854d.onAdRevenuePaid(aVar);
                }
                C8105a.C8106a unused2 = this.f19841d.f19854d = null;
                if ((this.f19838a.mo57380b(C8379a.f20659N).contains(maxAd.getAdUnitId()) || this.f19838a.mo57358a(C8379a.f20658M, maxAd.getFormat())) && !this.f19838a.mo57330N().mo56529a() && !this.f19838a.mo57330N().mo56530b()) {
                    Context context = (Context) this.f19839b.get();
                    if (context == null) {
                        context = this.f19838a.mo57332P();
                    }
                    this.f19847j = SystemClock.elapsedRealtime();
                    this.f19845h.put("art", C8137a.SEQUENTIAL_OR_PRECACHE.mo56298a());
                    this.f19840c.m24366a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f19843f, this.f19844g, this.f19845h, context, this);
                    return;
                }
            } else {
                this.f19840c.m24363a(aVar);
            }
            this.f19841d.f19852b.set(false);
        }

        public void onAdRequestStarted(String str) {
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    /* renamed from: com.applovin.impl.mediation.d$c */
    private static class C8140c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f19851a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final AtomicBoolean f19852b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f19853c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public volatile C8105a.C8106a f19854d;

        private C8140c(String str) {
            this.f19852b = new AtomicBoolean();
            this.f19851a = str;
        }

        /* renamed from: e */
        static /* synthetic */ int m24389e(C8140c cVar) {
            int i = cVar.f19853c;
            cVar.f19853c = i + 1;
            return i;
        }
    }

    public C8135d(C8490n nVar) {
        this.f19817a = nVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24363a(C8070a aVar) {
        synchronized (this.f19821e) {
            if (this.f19820d.containsKey(aVar.getAdUnitId())) {
                C8626v.m26258i("AppLovinSdk", "Ad in cache already: " + aVar.getAdUnitId());
            }
            this.f19820d.put(aVar.getAdUnitId(), aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24366a(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Context context, C8105a.C8106a aVar) {
        final String str2 = str;
        final MaxAdFormat maxAdFormat2 = maxAdFormat;
        final Map<String, Object> map4 = map;
        final Map<String, Object> map5 = map2;
        final Map<String, Object> map6 = map3;
        final Context context2 = context;
        final C8105a.C8106a aVar2 = aVar;
        this.f19817a.mo57337V().mo57228a((C8401a) new C8114b(maxAdFormat, map, context, this.f19817a, new C8114b.C8116a() {
            /* renamed from: a */
            public void mo56271a(JSONArray jSONArray) {
                C8135d.this.f19817a.mo57337V().mo57227a((C8401a) new C8119c(str2, maxAdFormat2, map4, map5, map6, jSONArray, context2, C8135d.this.f19817a, aVar2));
            }
        }), C8134c.m24354a(maxAdFormat));
    }

    /* renamed from: b */
    private C8070a m24367b(String str) {
        C8070a aVar;
        synchronized (this.f19821e) {
            aVar = this.f19820d.get(str);
            this.f19820d.remove(str);
        }
        return aVar;
    }

    /* renamed from: b */
    private C8140c m24368b(String str, String str2) {
        C8140c cVar;
        synchronized (this.f19819c) {
            String c = m24369c(str, str2);
            cVar = this.f19818b.get(c);
            if (cVar == null) {
                cVar = new C8140c(str2);
                this.f19818b.put(c, cVar);
            }
        }
        return cVar;
    }

    /* renamed from: c */
    private String m24369c(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo56295a(String str, String str2) {
        synchronized (this.f19819c) {
            this.f19818b.remove(m24369c(str, str2));
        }
    }

    /* renamed from: a */
    public void mo56296a(String str, String str2, MaxAdFormat maxAdFormat, C8137a aVar, Map<String, Object> map, Map<String, Object> map2, Context context, C8105a.C8106a aVar2) {
        String str3 = str2;
        C8105a.C8106a aVar3 = aVar2;
        C8070a b = (this.f19817a.mo57330N().mo56530b() || Utils.isDspDemoApp(this.f19817a.mo57332P())) ? null : m24367b(str);
        if (b != null) {
            b.mo56064a(str3);
            b.mo56072g().mo56563e().mo56037a(aVar3);
            aVar3.onAdLoaded(b);
            if (b.mo56069d().endsWith("load")) {
                aVar3.onAdRevenuePaid(b);
            }
        }
        C8140c b2 = m24368b(str, str2);
        if (b2.f19852b.compareAndSet(false, true)) {
            if (b == null) {
                C8105a.C8106a unused = b2.f19854d = aVar3;
            }
            Map synchronizedMap = Collections.synchronizedMap(CollectionUtils.map());
            synchronizedMap.put("art", aVar.mo56298a());
            if (StringUtils.isValidString(str2)) {
                synchronizedMap.put("alt", str3);
            }
            m24366a(str, maxAdFormat, map, map2, synchronizedMap, context, new C8138b(map, map2, synchronizedMap, b2, maxAdFormat, SystemClock.elapsedRealtime(), this, this.f19817a, context));
            return;
        }
        if (!(b2.f19854d == null || b2.f19854d == aVar3)) {
            C8626v.m26257h("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        C8105a.C8106a unused2 = b2.f19854d = aVar3;
    }

    /* renamed from: a */
    public boolean mo56297a(String str) {
        boolean z;
        synchronized (this.f19821e) {
            z = this.f19820d.get(str) != null;
        }
        return z;
    }
}
