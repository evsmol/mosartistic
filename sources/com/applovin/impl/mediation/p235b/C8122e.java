package com.applovin.impl.mediation.p235b;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.C8105a;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p236c.C8132a;
import com.applovin.impl.mediation.p236c.C8134c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p255d.C8394f;
import com.applovin.impl.sdk.p255d.C8395g;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.utils.C8568f;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appnext.core.p267a.C8894b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.b.e */
public class C8122e extends C8401a {

    /* renamed from: a */
    private static final AtomicBoolean f19784a = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f19785e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final MaxAdFormat f19786f;

    /* renamed from: g */
    private final JSONObject f19787g;

    /* renamed from: h */
    private final List<C8070a> f19788h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C8105a.C8106a f19789i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final WeakReference<Context> f19790j;

    /* renamed from: k */
    private long f19791k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final List<MaxNetworkResponseInfo> f19792l;

    /* renamed from: com.applovin.impl.mediation.b.e$a */
    private class C8125a extends C8401a {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final long f19797e = SystemClock.elapsedRealtime();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final int f19798f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final C8070a f19799g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final List<C8070a> f19800h;

        C8125a(int i, List<C8070a> list) {
            super(C8122e.this.f21119c, C8122e.this.f21118b);
            this.f19798f = i;
            this.f19799g = list.get(i);
            this.f19800h = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m24318a(C8070a aVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            MaxNetworkResponseInfo.AdLoadState adLoadState2 = adLoadState;
            C8122e.this.f19792l.add(new MaxNetworkResponseInfoImpl(adLoadState2, aVar.mo56089i(), new MaxMediatedNetworkInfoImpl(C8134c.m24357a(aVar.mo56151R(), this.f21118b)), j, maxError));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m24321a(String str) {
        }

        public void run() {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21120d;
                String str = this.f21119c;
                vVar2.mo57818b(str, "Loading ad " + (this.f19798f + 1) + " of " + this.f19800h.size() + ": " + this.f19799g.mo56152S());
            }
            m24321a("started to load ad");
            Context context = (Context) C8122e.this.f19790j.get();
            this.f21118b.mo57324H().loadThirdPartyMediatedAd(C8122e.this.f19785e, this.f19799g, context instanceof Activity ? (Activity) context : this.f21118b.mo57377ar(), new C8132a(C8122e.this.f19789i) {
                public void onAdLoadFailed(String str, MaxError maxError) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - C8125a.this.f19797e;
                    C8626v unused = C8125a.this.f21120d;
                    if (C8626v.m26252a()) {
                        C8626v i = C8125a.this.f21120d;
                        String h = C8125a.this.f21119c;
                        i.mo57818b(h, "Ad failed to load in " + elapsedRealtime + " ms with error: " + maxError);
                    }
                    C8125a aVar = C8125a.this;
                    aVar.m24321a("failed to load ad: " + maxError.getCode());
                    C8125a aVar2 = C8125a.this;
                    aVar2.m24318a(aVar2.f19799g, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                    if (C8125a.this.f19798f < C8125a.this.f19800h.size() - 1) {
                        C8125a.this.f21118b.mo57337V().mo57228a((C8401a) new C8125a(C8125a.this.f19798f + 1, C8125a.this.f19800h), C8134c.m24354a(C8122e.this.f19786f));
                        return;
                    }
                    C8122e.this.m24309a((MaxError) new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }

                public void onAdLoaded(MaxAd maxAd) {
                    C8125a.this.m24321a("loaded ad");
                    long elapsedRealtime = SystemClock.elapsedRealtime() - C8125a.this.f19797e;
                    C8626v unused = C8125a.this.f21120d;
                    if (C8626v.m26252a()) {
                        C8626v d = C8125a.this.f21120d;
                        String c = C8125a.this.f21119c;
                        d.mo57818b(c, "Ad loaded in " + elapsedRealtime + "ms");
                    }
                    C8070a aVar = (C8070a) maxAd;
                    C8125a.this.m24318a(aVar, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, (MaxError) null);
                    int e = C8125a.this.f19798f;
                    while (true) {
                        e++;
                        if (e < C8125a.this.f19800h.size()) {
                            C8125a aVar2 = C8125a.this;
                            aVar2.m24318a((C8070a) aVar2.f19800h.get(e), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1, (MaxError) null);
                        } else {
                            C8122e.this.m24306a(aVar);
                            return;
                        }
                    }
                }
            });
        }
    }

    C8122e(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, JSONObject jSONObject, Context context, C8490n nVar, C8105a.C8106a aVar) {
        super("TaskProcessMediationWaterfall:" + str + ":" + maxAdFormat.getLabel(), nVar);
        this.f19785e = str;
        this.f19786f = maxAdFormat;
        this.f19787g = jSONObject;
        this.f19789i = aVar;
        this.f19790j = new WeakReference<>(context);
        this.f19788h = new ArrayList(jSONObject.length());
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f19788h.add(C8070a.m24028a(map, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, nVar));
        }
        this.f19792l = new ArrayList(this.f19788h.size());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24306a(C8070a aVar) {
        this.f21118b.mo57326J().mo57824a(aVar);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19791k;
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57820c(str, "Waterfall loaded in " + elapsedRealtime + "ms for " + aVar.mo56152S());
        }
        aVar.mo56063a((MaxAdWaterfallInfo) new MaxAdWaterfallInfoImpl(aVar, elapsedRealtime, this.f19792l));
        C8575k.m26126a((MaxAdListener) this.f19789i, (MaxAd) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24309a(MaxError maxError) {
        C8395g W;
        C8394f fVar;
        if (maxError.getCode() == 204) {
            W = this.f21118b.mo57338W();
            fVar = C8394f.f21099r;
        } else if (maxError.getCode() == -5001) {
            W = this.f21118b.mo57338W();
            fVar = C8394f.f21100s;
        } else {
            W = this.f21118b.mo57338W();
            fVar = C8394f.f21101t;
        }
        W.mo57151a(fVar);
        ArrayList arrayList = new ArrayList(this.f19792l.size());
        for (MaxNetworkResponseInfo next : this.f19792l) {
            if (next.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
            sb.append("\n");
            int i = 0;
            while (i < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo = (MaxNetworkResponseInfo) arrayList.get(i);
                i++;
                sb.append(i);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo.getMediatedNetwork().getName());
                sb.append("\n");
                sb.append("..code: ");
                sb.append(maxNetworkResponseInfo.getError().getCode());
                sb.append("\n");
                sb.append("..message: ");
                sb.append(maxNetworkResponseInfo.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19791k;
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57820c(str, "Waterfall failed in " + elapsedRealtime + "ms with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl((C8070a) null, JsonUtils.getString(this.f19787g, "waterfall_name", ""), JsonUtils.getString(this.f19787g, "waterfall_test_name", ""), elapsedRealtime, this.f19792l));
        C8575k.m26132a((MaxAdListener) this.f19789i, this.f19785e, maxError);
    }

    public void run() {
        this.f19791k = SystemClock.elapsedRealtime();
        if (this.f19787g.optBoolean("is_testing", false) && !this.f21118b.mo57330N().mo56529a() && f19784a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    Utils.showAlert("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", (Context) C8122e.this.f21118b.mo57377ar());
                }
            });
        }
        if (this.f19788h.size() > 0) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21120d;
                String str = this.f21119c;
                vVar2.mo57818b(str, "Starting waterfall for " + this.f19788h.size() + " ad(s)...");
            }
            this.f21118b.mo57337V().mo57227a((C8401a) new C8125a(0, this.f19788h));
            return;
        }
        C8626v vVar3 = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57821d(this.f21119c, "No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f19785e, this.f19786f, this.f19787g, this.f21118b);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f19787g, C8894b.f22527hW, new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j);
            C81242 r5 = new Runnable() {
                public void run() {
                    C8122e.this.m24309a(maxErrorImpl);
                }
            };
            if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", false).booleanValue()) {
                C8568f.m26077a(millis, this.f21118b, r5);
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(r5, millis);
            }
        } else {
            m24309a((MaxError) maxErrorImpl);
        }
    }
}
