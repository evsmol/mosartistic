package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.C8135d;
import com.applovin.impl.mediation.ads.C8105a;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.mediation.p234a.C8075e;
import com.applovin.impl.mediation.p234a.C8076f;
import com.applovin.impl.mediation.p234a.C8077g;
import com.applovin.impl.mediation.p234a.C8079h;
import com.applovin.impl.mediation.p235b.C8121d;
import com.applovin.impl.mediation.p235b.C8127f;
import com.applovin.impl.mediation.p235b.C8128g;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8394f;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f19552a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8626v f19553b;

    /* renamed from: c */
    private final AtomicReference<JSONObject> f19554c = new AtomicReference<>();

    /* renamed from: com.applovin.impl.mediation.MediationServiceImpl$a */
    public class C8066a implements C8105a.C8106a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

        /* renamed from: b */
        private final C8070a f19589b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C8105a.C8106a f19590c;

        public C8066a(C8070a aVar, C8105a.C8106a aVar2) {
            this.f19589b = aVar;
            this.f19590c = aVar2;
        }

        /* renamed from: a */
        public void mo56037a(C8105a.C8106a aVar) {
            this.f19590c = aVar;
        }

        /* renamed from: a */
        public void mo56038a(MaxAd maxAd, Bundle bundle) {
            this.f19589b.mo56103v();
            this.f19589b.mo56062a(bundle);
            MediationServiceImpl.this.m24006a(this.f19589b);
            C8575k.m26126a((MaxAdListener) this.f19590c, maxAd);
        }

        /* renamed from: b */
        public void mo56039b(MaxAd maxAd, Bundle bundle) {
            C8626v unused = MediationServiceImpl.this.f19553b;
            if (C8626v.m26252a()) {
                MediationServiceImpl.this.f19553b.mo57818b("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f19589b, this.f19590c);
            MediationServiceImpl.this.f19552a.mo57338W().mo57151a(C8394f.f21084c);
            MediationServiceImpl.this.f19552a.mo57338W().mo57151a(C8394f.f21087f);
            this.f19589b.mo56062a(bundle);
            if (maxAd.getFormat().isFullscreenAd()) {
                C8072c cVar = (C8072c) maxAd;
                if (cVar.mo56127N()) {
                    MediationServiceImpl.this.f19552a.mo57369aj().mo57289a(this.f19589b, "DID_DISPLAY");
                    MediationServiceImpl.this.f19552a.mo57367ah().mo57671a((Object) this.f19589b);
                } else {
                    C8626v unused2 = MediationServiceImpl.this.f19553b;
                    if (C8626v.m26252a()) {
                        C8626v b = MediationServiceImpl.this.f19553b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Received ad display callback before attempting show");
                        sb.append(cVar.mo56093m() != null ? " for hybrid ad" : "");
                        b.mo57821d("MediationService", sb.toString());
                        return;
                    }
                    return;
                }
            } else {
                MediationServiceImpl.this.f19552a.mo57369aj().mo57289a(this.f19589b, "DID_DISPLAY");
            }
            C8575k.m26154b((MaxAdListener) this.f19590c, maxAd);
        }

        /* renamed from: c */
        public void mo56040c(final MaxAd maxAd, Bundle bundle) {
            if (bundle != null && bundle.size() > 0) {
                ((C8070a) maxAd).mo56065a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
            }
            MediationServiceImpl.this.f19552a.mo57369aj().mo57289a((C8070a) maxAd, "DID_HIDE");
            long j = 0;
            if (maxAd instanceof C8072c) {
                j = ((C8072c) maxAd).mo56119F();
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    if (maxAd.getFormat().isFullscreenAd()) {
                        MediationServiceImpl.this.f19552a.mo57367ah().mo57674b((Object) maxAd);
                    }
                    C8575k.m26160c(C8066a.this.f19590c, maxAd);
                }
            }, j);
        }

        /* renamed from: d */
        public void mo56041d(MaxAd maxAd, Bundle bundle) {
            if (bundle != null && bundle.size() > 0) {
                ((C8070a) maxAd).mo56065a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
            }
            MediationServiceImpl.this.m24007a(this.f19589b, this.f19590c);
            C8575k.m26163d(this.f19590c, maxAd);
        }

        public void onAdClicked(MaxAd maxAd) {
            mo56041d(maxAd, (Bundle) null);
        }

        public void onAdCollapsed(MaxAd maxAd) {
            C8575k.m26171h(this.f19590c, maxAd);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MediationServiceImpl.this.m24017b(this.f19589b, maxError, this.f19590c);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof C8072c)) {
                ((C8072c) maxAd).mo56124K();
            }
        }

        public void onAdDisplayed(MaxAd maxAd) {
            mo56039b(maxAd, (Bundle) null);
        }

        public void onAdExpanded(MaxAd maxAd) {
            C8575k.m26169g(this.f19590c, maxAd);
        }

        public void onAdHidden(MaxAd maxAd) {
            mo56040c(maxAd, (Bundle) null);
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f19589b.mo56103v();
            MediationServiceImpl.this.m24008a(this.f19589b, maxError, (MaxAdListener) this.f19590c);
        }

        public void onAdLoaded(MaxAd maxAd) {
            mo56038a(maxAd, (Bundle) null);
        }

        public void onAdRequestStarted(String str) {
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            C8575k.m26167f(this.f19590c, maxAd);
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            C8575k.m26165e(this.f19590c, maxAd);
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            C8575k.m26129a((MaxAdListener) this.f19590c, maxAd, maxReward);
            MediationServiceImpl.this.f19552a.mo57337V().mo57228a((C8401a) new C8127f((C8072c) maxAd, MediationServiceImpl.this.f19552a), C8432o.C8434a.MEDIATION_REWARD);
        }
    }

    public MediationServiceImpl(C8490n nVar) {
        this.f19552a = nVar;
        this.f19553b = nVar.mo57320D();
        nVar.mo57372am().registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    /* renamed from: a */
    private C8241g m23997a(C8072c cVar) {
        C8241g g = cVar.mo56072g();
        if (g != null) {
            return g;
        }
        this.f19552a.mo57367ah().mo57672a(false);
        if (C8626v.m26252a()) {
            C8626v vVar = this.f19553b;
            vVar.mo57821d("MediationService", "Failed to show " + cVar + ": adapter not found");
        }
        C8626v.m26258i("MediationService", "There may be an integration problem with the adapter for ad unit id '" + cVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24006a(C8070a aVar) {
        this.f19552a.mo57369aj().mo57289a(aVar, "DID_LOAD");
        if (aVar.mo56069d().endsWith("load")) {
            this.f19552a.mo57369aj().mo57288a(aVar);
        }
        long s = aVar.mo56099s();
        Map map = CollectionUtils.map(1);
        map.put("{LOAD_TIME_MS}", String.valueOf(s));
        m24013a("load", (Map<String, String>) map, (C8076f) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24007a(final C8070a aVar, final C8105a.C8106a aVar2) {
        C80658 r0 = new Runnable() {
            public void run() {
                MediationServiceImpl.this.f19552a.mo57369aj().mo57289a(aVar, "DID_CLICKED");
                MediationServiceImpl.this.f19552a.mo57369aj().mo57289a(aVar, "DID_CLICK");
                if (aVar.mo56069d().endsWith(Constants.CLICK)) {
                    MediationServiceImpl.this.f19552a.mo57369aj().mo57288a(aVar);
                    C8575k.m26136a((MaxAdRevenueListener) aVar2, (MaxAd) aVar);
                }
                Map map = CollectionUtils.map(1);
                String emptyIfNull = StringUtils.emptyIfNull(MediationServiceImpl.this.f19552a.mo57397n());
                if (!((Boolean) MediationServiceImpl.this.f19552a.mo57342a(C8380b.f20861dF)).booleanValue()) {
                    emptyIfNull = "";
                }
                map.put("{CUID}", emptyIfNull);
                MediationServiceImpl.this.m24013a("mclick", (Map<String, String>) map, (C8076f) aVar);
            }
        };
        if (((Boolean) this.f19552a.mo57342a(C8379a.f20667V)).booleanValue()) {
            this.f19552a.mo57337V().mo57228a((C8401a) new C8458z(this.f19552a, r0), C8432o.C8434a.MEDIATION_POSTBACKS);
        } else {
            r0.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24008a(C8070a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        m24011a(maxError, aVar);
        destroyAd(aVar);
        C8575k.m26132a(maxAdListener, aVar.getAdUnitId(), maxError);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24009a(C8072c cVar, C8105a.C8106a aVar) {
        this.f19552a.mo57367ah().mo57672a(false);
        m24010a(cVar, (MaxAdListener) aVar);
        if (C8626v.m26252a()) {
            this.f19553b.mo57818b("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpressionPostback(cVar, aVar);
        if (cVar.mo56093m() != null && cVar.mo56104w().get()) {
            if (C8626v.m26252a()) {
                this.f19553b.mo57818b("MediationService", "Running ad displayed logic");
            }
            this.f19552a.mo57369aj().mo57289a((C8070a) cVar, "DID_DISPLAY");
            this.f19552a.mo57367ah().mo57671a((Object) cVar);
            C8575k.m26155b((MaxAdListener) aVar, (MaxAd) cVar, true);
        }
    }

    /* renamed from: a */
    private void m24010a(C8072c cVar, MaxAdListener maxAdListener) {
        long longValue = ((Long) this.f19552a.mo57342a(C8379a.f20652G)).longValue();
        if (longValue > 0) {
            final C8072c cVar2 = cVar;
            final long j = longValue;
            final MaxAdListener maxAdListener2 = maxAdListener;
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    if (!cVar2.mo56104w().get()) {
                        String str = "Ad (" + cVar2.mo56153T() + ") has not been displayed after " + j + "ms. Failing ad display...";
                        C8626v.m26258i("MediationService", str);
                        MediationServiceImpl.this.m24017b(cVar2, new MaxErrorImpl(-1, str), maxAdListener2);
                        MediationServiceImpl.this.f19552a.mo57367ah().mo57674b((Object) cVar2);
                    }
                }
            }, longValue);
        }
    }

    /* renamed from: a */
    private void m24011a(MaxError maxError, C8070a aVar) {
        long s = aVar.mo56099s();
        Map map = CollectionUtils.map(1);
        map.put("{LOAD_TIME_MS}", String.valueOf(s));
        m24014a("mlerr", (Map<String, String>) map, maxError, (C8076f) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24012a(String str, C8079h hVar, C8241g gVar) {
        Map map = CollectionUtils.map(2);
        Utils.putObjectForStringIfValid("{ADAPTER_VERSION}", gVar.mo56567i(), map);
        Utils.putObjectForStringIfValid("{SDK_VERSION}", gVar.mo56566h(), map);
        m24014a("serr", (Map<String, String>) map, (MaxError) new MaxErrorImpl(str), (C8076f) hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24013a(String str, Map<String, String> map, C8076f fVar) {
        m24014a(str, map, (MaxError) null, fVar);
    }

    /* renamed from: a */
    private void m24014a(String str, Map<String, String> map, MaxError maxError, C8076f fVar) {
        Map<String, String> map2 = CollectionUtils.map(map);
        map2.put("{PLACEMENT}", StringUtils.emptyIfNull(fVar.getPlacement()));
        map2.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(fVar.mo56174ag()));
        if (fVar instanceof C8070a) {
            map2.put("{CREATIVE_ID}", StringUtils.emptyIfNull(((C8070a) fVar).getCreativeId()));
        }
        this.f19552a.mo57337V().mo57228a((C8401a) new C8121d(str, map2, maxError, fVar, this.f19552a), C8432o.C8434a.MEDIATION_POSTBACKS);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24017b(C8070a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        if (aVar.mo56093m() == null) {
            this.f19552a.mo57369aj().mo57289a(aVar, "DID_FAIL_DISPLAY");
            processAdDisplayErrorPostback(maxError, aVar);
            if (aVar.mo56104w().compareAndSet(false, true)) {
                C8575k.m26127a(maxAdListener, (MaxAd) aVar, maxError);
            }
        } else if (C8626v.m26252a()) {
            this.f19553b.mo57822e("MediationService", "Ignoring ad display failure for hybrid ad...");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24018b(C8072c cVar) {
        if (cVar.getFormat() == MaxAdFormat.REWARDED || cVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f19552a.mo57337V().mo57228a((C8401a) new C8128g(cVar, this.f19552a), C8432o.C8434a.MEDIATION_REWARD);
        }
    }

    public void collectSignal(MaxAdFormat maxAdFormat, final C8079h hVar, Context context, final C8077g.C8078a aVar) {
        String str;
        C8626v vVar;
        String str2;
        StringBuilder sb;
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        } else if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (aVar != null) {
            final C8241g a = this.f19552a.mo57322F().mo56543a(hVar, hVar.mo56198b());
            if (a != null) {
                Activity ar = context instanceof Activity ? (Activity) context : this.f19552a.mo57377ar();
                MaxAdapterParametersImpl a2 = MaxAdapterParametersImpl.m23996a(hVar, maxAdFormat);
                if (((Boolean) this.f19552a.mo57342a(C8379a.f20663R)).booleanValue()) {
                    this.f19552a.mo57323G().mo56535a((C8076f) hVar, ar);
                }
                C80603 r1 = new MaxSignalCollectionListener() {
                    public void onSignalCollected(String str) {
                        aVar.mo56197a(C8077g.m24149a(hVar, a, str));
                        a.mo56568j();
                    }

                    public void onSignalCollectionFailed(String str) {
                        MediationServiceImpl.this.m24012a(str, hVar, a);
                        aVar.mo56197a(C8077g.m24151b(hVar, a, str));
                        a.mo56568j();
                    }
                };
                if (!hVar.mo56060a()) {
                    if (C8626v.m26252a()) {
                        vVar = this.f19553b;
                        sb = new StringBuilder();
                        str2 = "Collecting signal for adapter: ";
                    }
                    a.mo56556a((MaxAdapterSignalCollectionParameters) a2, hVar, ar, (MaxSignalCollectionListener) r1);
                    return;
                } else if (this.f19552a.mo57323G().mo56539a((C8076f) hVar)) {
                    if (C8626v.m26252a()) {
                        vVar = this.f19553b;
                        sb = new StringBuilder();
                        str2 = "Collecting signal for now-initialized adapter: ";
                    }
                    a.mo56556a((MaxAdapterSignalCollectionParameters) a2, hVar, ar, (MaxSignalCollectionListener) r1);
                    return;
                } else {
                    if (C8626v.m26252a()) {
                        C8626v vVar2 = this.f19553b;
                        vVar2.mo57822e("MediationService", "Skip collecting signal for not-initialized adapter: " + a.mo56562d());
                    }
                    str = "Adapter not initialized yet";
                }
                sb.append(str2);
                sb.append(a.mo56562d());
                vVar.mo57818b("MediationService", sb.toString());
                a.mo56556a((MaxAdapterSignalCollectionParameters) a2, hVar, ar, (MaxSignalCollectionListener) r1);
                return;
            }
            str = "Could not load adapter";
            aVar.mo56197a(C8077g.m24150a(hVar, str));
        } else {
            throw new IllegalArgumentException("No callback specified");
        }
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof C8070a) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f19553b;
                vVar.mo57820c("MediationService", "Destroying " + maxAd);
            }
            C8070a aVar = (C8070a) maxAd;
            C8241g g = aVar.mo56072g();
            if (g != null) {
                g.mo56568j();
                aVar.mo56106y();
            }
            this.f19552a.mo57321E().mo57164b(aVar.mo56071f());
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return this.f19554c.getAndSet((Object) null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, C8135d.C8137a aVar, Map<String, Object> map, Map<String, Object> map2, Context context, C8105a.C8106a aVar2) {
        String str3 = str;
        C8105a.C8106a aVar3 = aVar2;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (aVar3 != null) {
            if (TextUtils.isEmpty(this.f19552a.mo57405u())) {
                C8626v.m26258i("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
            }
            if (!this.f19552a.mo57387d()) {
                C8626v.m26257h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
            }
            this.f19552a.mo57345a();
            if (str.length() != 16 && !str.startsWith("test_mode") && !this.f19552a.mo57319C().startsWith("05TMD")) {
                C8626v.m26258i("MediationService", "Please double-check the ad unit " + str + " for " + maxAdFormat.getLabel() + " : " + Log.getStackTraceString(new Throwable("")));
            }
            MaxAdFormat maxAdFormat2 = maxAdFormat;
            if (this.f19552a.mo57359a(maxAdFormat)) {
                C8626v.m26258i("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
                C8575k.m26132a((MaxAdListener) aVar3, str, (MaxError) new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
                return;
            }
            C8575k.m26135a((MaxAdRequestListener) aVar3, str, true);
            this.f19552a.mo57329M().mo56296a(str, str2, maxAdFormat, aVar, map, map2, context, aVar2);
        } else {
            throw new IllegalArgumentException("No listener specified");
        }
    }

    public void loadThirdPartyMediatedAd(String str, C8070a aVar, Activity activity, C8105a.C8106a aVar2) {
        if (aVar != null) {
            if (C8626v.m26252a()) {
                this.f19553b.mo57818b("MediationService", "Loading " + aVar + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f19552a.mo57369aj().mo57289a(aVar, "WILL_LOAD");
            C8241g a = this.f19552a.mo57322F().mo56542a((C8076f) aVar);
            if (a != null) {
                MaxAdapterParametersImpl a2 = MaxAdapterParametersImpl.m23994a(aVar);
                if (((Boolean) this.f19552a.mo57342a(C8379a.f20664S)).booleanValue()) {
                    this.f19552a.mo57323G().mo56535a((C8076f) aVar, activity);
                }
                C8070a a3 = aVar.mo56059a(a);
                a.mo56558a(str, a3);
                a3.mo56100t();
                a.mo56559a(str, a2, a3, activity, new C8066a(a3, aVar2));
                return;
            }
            String str2 = "Failed to load " + aVar + ": adapter not loaded";
            C8626v.m26258i("MediationService", str2);
            m24008a(aVar, (MaxError) new MaxErrorImpl(-5001, str2), (MaxAdListener) aVar2);
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object c = this.f19552a.mo57367ah().mo57676c();
            if (c instanceof C8070a) {
                processAdDisplayErrorPostback(MaxAdapterError.WEBVIEW_ERROR, (C8070a) c);
            }
        }
    }

    public void processAdDisplayErrorPostback(MaxError maxError, C8070a aVar) {
        m24014a("mierr", (Map<String, String>) Collections.EMPTY_MAP, maxError, (C8076f) aVar);
    }

    public void processAdLossPostback(C8070a aVar, Float f) {
        String f2 = f != null ? f.toString() : "";
        Map map = CollectionUtils.map(1);
        map.put("{MBR}", f2);
        m24013a("mloss", (Map<String, String>) map, (C8076f) aVar);
    }

    public void processAdapterInitializationPostback(C8076f fVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        Map map = CollectionUtils.map(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j));
        m24014a("minit", (Map<String, String>) map, (MaxError) new MaxErrorImpl(str), fVar);
    }

    public void processCallbackAdImpressionPostback(final C8070a aVar, final C8105a.C8106a aVar2) {
        C80647 r0 = new Runnable() {
            public void run() {
                if (aVar.mo56069d().endsWith("cimp")) {
                    MediationServiceImpl.this.f19552a.mo57369aj().mo57288a(aVar);
                    C8575k.m26136a((MaxAdRevenueListener) aVar2, (MaxAd) aVar);
                }
                Map map = CollectionUtils.map(1);
                String emptyIfNull = StringUtils.emptyIfNull(MediationServiceImpl.this.f19552a.mo57397n());
                if (!((Boolean) MediationServiceImpl.this.f19552a.mo57342a(C8380b.f20861dF)).booleanValue()) {
                    emptyIfNull = "";
                }
                map.put("{CUID}", emptyIfNull);
                MediationServiceImpl.this.m24013a("mcimp", (Map<String, String>) map, (C8076f) aVar);
            }
        };
        if (((Boolean) this.f19552a.mo57342a(C8379a.f20667V)).booleanValue()) {
            this.f19552a.mo57337V().mo57228a((C8401a) new C8458z(this.f19552a, r0), C8432o.C8434a.MEDIATION_POSTBACKS);
        } else {
            r0.run();
        }
    }

    public void processRawAdImpressionPostback(final C8070a aVar, final C8105a.C8106a aVar2) {
        C80625 r0 = new Runnable() {
            public void run() {
                MediationServiceImpl.this.f19552a.mo57369aj().mo57289a(aVar, "WILL_DISPLAY");
                if (aVar.mo56069d().endsWith("mimp")) {
                    MediationServiceImpl.this.f19552a.mo57369aj().mo57288a(aVar);
                    C8575k.m26136a((MaxAdRevenueListener) aVar2, (MaxAd) aVar);
                }
                Map map = CollectionUtils.map(2);
                C8070a aVar = aVar;
                if (aVar instanceof C8072c) {
                    map.put("{TIME_TO_SHOW_MS}", String.valueOf(((C8072c) aVar).mo56117D()));
                }
                String emptyIfNull = StringUtils.emptyIfNull(MediationServiceImpl.this.f19552a.mo57397n());
                if (!((Boolean) MediationServiceImpl.this.f19552a.mo57342a(C8380b.f20861dF)).booleanValue()) {
                    emptyIfNull = "";
                }
                map.put("{CUID}", emptyIfNull);
                MediationServiceImpl.this.m24013a("mimp", (Map<String, String>) map, (C8076f) aVar);
            }
        };
        if (((Boolean) this.f19552a.mo57342a(C8379a.f20667V)).booleanValue()) {
            this.f19552a.mo57337V().mo57228a((C8401a) new C8458z(this.f19552a, r0), C8432o.C8434a.MEDIATION_POSTBACKS);
        } else {
            r0.run();
        }
    }

    public void processViewabilityAdImpressionPostback(C8075e eVar, long j, C8105a.C8106a aVar) {
        final C8075e eVar2 = eVar;
        final C8105a.C8106a aVar2 = aVar;
        final long j2 = j;
        C80636 r0 = new Runnable() {
            public void run() {
                if (eVar2.mo56069d().endsWith("vimp")) {
                    MediationServiceImpl.this.f19552a.mo57369aj().mo57288a((C8070a) eVar2);
                    C8575k.m26136a((MaxAdRevenueListener) aVar2, (MaxAd) eVar2);
                }
                Map map = CollectionUtils.map(3);
                map.put("{VIEWABILITY_FLAGS}", String.valueOf(j2));
                map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(eVar2.mo56147N()));
                String emptyIfNull = StringUtils.emptyIfNull(MediationServiceImpl.this.f19552a.mo57397n());
                if (!((Boolean) MediationServiceImpl.this.f19552a.mo57342a(C8380b.f20861dF)).booleanValue()) {
                    emptyIfNull = "";
                }
                map.put("{CUID}", emptyIfNull);
                MediationServiceImpl.this.m24013a("mvimp", (Map<String, String>) map, (C8076f) eVar2);
            }
        };
        if (((Boolean) this.f19552a.mo57342a(C8379a.f20667V)).booleanValue()) {
            this.f19552a.mo57337V().mo57228a((C8401a) new C8458z(this.f19552a, r0), C8432o.C8434a.MEDIATION_POSTBACKS);
        } else {
            r0.run();
        }
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f19554c.set(jSONObject);
    }

    public void showFullscreenAd(C8072c cVar, Activity activity, C8105a.C8106a aVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (activity != null || MaxAdFormat.APP_OPEN == cVar.getFormat()) {
            this.f19552a.mo57367ah().mo57672a(true);
            final C8241g a = m23997a(cVar);
            long E = cVar.mo56118E();
            if (C8626v.m26252a()) {
                C8626v vVar = this.f19553b;
                vVar.mo57820c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + E + "ms...");
            }
            final C8072c cVar2 = cVar;
            final Activity activity2 = activity;
            final C8105a.C8106a aVar2 = aVar;
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    cVar2.mo56129a(true);
                    MediationServiceImpl.this.m24018b(cVar2);
                    a.mo56553a((C8070a) cVar2, activity2);
                    MediationServiceImpl.this.m24009a(cVar2, aVar2);
                }
            }, E);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }

    public void showFullscreenAd(C8072c cVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, C8105a.C8106a aVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (activity != null) {
            this.f19552a.mo57367ah().mo57672a(true);
            final C8241g a = m23997a(cVar);
            long E = cVar.mo56118E();
            if (C8626v.m26252a()) {
                C8626v vVar = this.f19553b;
                vVar.mo57820c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + E + "ms...");
            }
            final C8072c cVar2 = cVar;
            final ViewGroup viewGroup2 = viewGroup;
            final Lifecycle lifecycle2 = lifecycle;
            final Activity activity2 = activity;
            final C8105a.C8106a aVar2 = aVar;
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    cVar2.mo56129a(true);
                    MediationServiceImpl.this.m24018b(cVar2);
                    a.mo56554a((C8070a) cVar2, viewGroup2, lifecycle2, activity2);
                    MediationServiceImpl.this.m24009a(cVar2, aVar2);
                }
            }, E);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }
}
