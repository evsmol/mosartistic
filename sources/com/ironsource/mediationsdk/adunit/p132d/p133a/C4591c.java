package com.ironsource.mediationsdk.adunit.p132d.p133a;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C4619f;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p127a.C4559a;
import com.ironsource.mediationsdk.adunit.p128b.C4561b;
import com.ironsource.mediationsdk.adunit.p128b.C4562c;
import com.ironsource.mediationsdk.adunit.p128b.C4563d;
import com.ironsource.mediationsdk.adunit.p129c.p130a.C4573b;
import com.ironsource.mediationsdk.adunit.p132d.C4588a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C4646a;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p135b.C4611c;
import com.ironsource.mediationsdk.p136c.C4615b;
import com.ironsource.mediationsdk.utils.C4718f;
import com.ironsource.mediationsdk.utils.C4729n;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.d.a.c */
public abstract class C4591c<Listener extends C4573b> implements AdapterAdListener, NetworkInitializationListener, C4562c, C4611c.C4612a, C4729n.C4730a {

    /* renamed from: a */
    protected C4588a f11320a;

    /* renamed from: b */
    protected Listener f11321b;

    /* renamed from: c */
    protected C4563d f11322c;

    /* renamed from: d */
    protected C4592a f11323d;

    /* renamed from: e */
    protected Placement f11324e;

    /* renamed from: f */
    protected AdData f11325f;

    /* renamed from: g */
    private BaseAdAdapter<?, AdapterAdListener> f11326g;

    /* renamed from: h */
    private C4646a f11327h;

    /* renamed from: i */
    private JSONObject f11328i;

    /* renamed from: j */
    private String f11329j;

    /* renamed from: k */
    private Long f11330k;

    /* renamed from: l */
    private C4718f f11331l;

    /* renamed from: m */
    private C4611c f11332m = new C4611c((long) (this.f11320a.f11312d * 1000));

    /* renamed from: com.ironsource.mediationsdk.adunit.d.a.c$a */
    public enum C4592a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    public C4591c(C4588a aVar, BaseAdAdapter<?, ?> baseAdAdapter, C4646a aVar2, Listener listener) {
        this.f11320a = aVar;
        this.f11321b = listener;
        this.f11322c = new C4563d(aVar.f11309a, C4563d.C4565b.PROVIDER, this);
        this.f11327h = aVar2;
        this.f11328i = aVar2.f11592b;
        this.f11326g = baseAdAdapter;
        mo33835a(C4592a.NONE);
    }

    /* renamed from: a */
    private boolean mo33834a() {
        return this.f11323d == C4592a.INIT_IN_PROGRESS;
    }

    /* renamed from: a */
    public final Map<String, Object> mo33752a(C4561b bVar) {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f11326g != null ? this.f11326g.getNetworkAdapter().getAdapterVersion() : str);
            if (this.f11326g != null) {
                str = this.f11326g.getNetworkAdapter().getNetworkSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
        } catch (Exception unused) {
            IronLog.INTERNAL.error(mo33838c("could not get adapter version for event data" + mo33846l()));
        }
        hashMap.put("spId", this.f11327h.f11591a.getSubProviderId());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f11327h.f11591a.getAdSourceNameForEvents());
        boolean z = true;
        hashMap.put("instanceType", Integer.valueOf(mo33844h() ? 2 : 1));
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f11329j)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f11329j);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f11320a.f11313e));
        if (this.f11320a.f11314f != null && this.f11320a.f11314f.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f11320a.f11314f);
        }
        if (!TextUtils.isEmpty(this.f11320a.f11315g)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f11320a.f11315g);
        }
        if (!(bVar == C4561b.LOAD_AD || bVar == C4561b.LOAD_AD_SUCCESS || bVar == C4561b.LOAD_AD_FAILED || bVar == C4561b.LOAD_AD_FAILED_WITH_REASON || bVar == C4561b.LOAD_AD_NO_FILL || bVar == C4561b.AD_OPENED || bVar == C4561b.AD_CLOSED || bVar == C4561b.SHOW_AD || bVar == C4561b.SHOW_AD_FAILED || bVar == C4561b.AD_CLICKED || bVar == C4561b.AD_REWARDED)) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f11320a.f11316h));
            if (!TextUtils.isEmpty(this.f11320a.f11317i)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f11320a.f11317i);
            }
        }
        if (!TextUtils.isEmpty(this.f11320a.f11311c.getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f11320a.f11311c.getCustomNetwork());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33835a(C4592a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo33838c("to " + aVar));
        this.f11323d = aVar;
    }

    /* renamed from: a */
    public final void mo33836a(String str) {
        try {
            IronLog.INTERNAL.verbose(mo33838c(""));
            this.f11322c.f11234b.mo33771a(false);
            this.f11330k = null;
            this.f11331l = new C4718f();
            HashMap hashMap = new HashMap();
            hashMap.put(DataKeys.USER_ID, this.f11320a.f11310b);
            hashMap.putAll(C4615b.m13488a(this.f11328i));
            this.f11325f = new AdData(str, hashMap);
            mo33835a(C4592a.INIT_IN_PROGRESS);
            this.f11332m.mo33877a(this);
            AdapterBaseInterface networkAdapter = this.f11326g.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f11325f, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + mo33846l();
            IronLog.INTERNAL.error(mo33838c(str2));
            this.f11322c.f11237e.mo33776a(str2);
            onInitFailed(C4559a.m13268a(this.f11320a.f11309a), str2);
        } catch (Throwable th) {
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(mo33838c(str3));
            C4563d dVar = this.f11322c;
            if (dVar != null) {
                dVar.f11237e.mo33788l(str3);
            }
            onInitFailed(C4559a.m13268a(this.f11320a.f11309a), str3);
        }
    }

    /* renamed from: b */
    public final void mo33544b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo33838c("state = " + this.f11323d + ", isBidder = " + mo33844h()));
        long a = C4718f.m13801a(this.f11331l);
        if (mo33839c()) {
            mo33835a(C4592a.FAILED);
            C4563d dVar = this.f11322c;
            if (dVar != null) {
                dVar.f11234b.mo33769a(a, (int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out");
                this.f11322c.f11234b.mo33773b(a, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out");
            }
            Listener listener = this.f11321b;
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("timed out");
            C4718f.m13801a(this.f11331l);
            listener.mo33801a(buildLoadFailedError, this);
            return;
        }
        String format = String.format("unexpected timeout for %s, state - %s, error - %s", new Object[]{mo33846l(), this.f11323d, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)});
        C4563d dVar2 = this.f11322c;
        if (dVar2 != null) {
            dVar2.f11237e.mo33787k(format);
        }
    }

    /* renamed from: b */
    public final void mo33837b(String str) {
        C4619f.m13526a();
        this.f11329j = C4619f.m13537d(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo33838c(String str) {
        String str2 = this.f11320a.f11309a.name() + " - " + mo33846l() + " - state = " + this.f11323d;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* renamed from: c */
    public final boolean mo33839c() {
        return this.f11323d == C4592a.INIT_IN_PROGRESS || this.f11323d == C4592a.LOADING;
    }

    /* renamed from: d */
    public final boolean mo33840d() {
        return this.f11323d == C4592a.LOADED;
    }

    /* renamed from: e */
    public final boolean mo33841e() {
        return this.f11323d != C4592a.FAILED;
    }

    /* renamed from: f */
    public final void mo33842f() {
        IronLog.INTERNAL.verbose(mo33838c(""));
        C4563d dVar = this.f11322c;
        if (dVar != null) {
            dVar.f11236d.mo33739a();
        }
    }

    /* renamed from: g */
    public final Long mo33843g() {
        return this.f11330k;
    }

    /* renamed from: h */
    public final boolean mo33844h() {
        return this.f11327h.f11593c;
    }

    /* renamed from: i */
    public final int mo33845i() {
        return this.f11327h.f11594d;
    }

    /* renamed from: j */
    public final int mo33611j() {
        return this.f11327h.f11595e;
    }

    /* renamed from: k */
    public final String mo33612k() {
        return this.f11327h.f11591a.getProviderName();
    }

    /* renamed from: l */
    public final String mo33846l() {
        return String.format("%s %s", new Object[]{mo33612k(), Integer.valueOf(hashCode())});
    }

    /* renamed from: m */
    public final String mo33847m() {
        return this.f11327h.f11591a.getProviderTypeForReflection();
    }

    /* renamed from: n */
    public final String mo33848n() {
        return this.f11320a.f11315g;
    }

    /* renamed from: o */
    public final void mo33849o() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f11326g;
        if (baseAdAdapter != null) {
            try {
                baseAdAdapter.releaseMemory();
                this.f11326g = null;
            } catch (Exception e) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.f11327h.f11591a.getProviderName() + " - " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(mo33838c(str));
                this.f11322c.f11237e.mo33788l(str);
            }
        }
        C4563d dVar = this.f11322c;
        if (dVar != null) {
            dVar.mo33753a();
            this.f11322c = null;
        }
        C4611c cVar = this.f11332m;
        if (cVar != null) {
            cVar.mo33873c();
            this.f11332m = null;
        }
    }

    public void onAdClicked() {
        IronLog.INTERNAL.verbose(mo33838c(""));
        C4563d dVar = this.f11322c;
        if (dVar != null) {
            dVar.f11236d.mo33747d(mo33851q());
        }
        this.f11321b.mo33802b(this);
    }

    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo33838c("error = " + i + ", " + str));
        C4611c cVar = this.f11332m;
        if (cVar != null) {
            cVar.mo33878d();
        }
        if (this.f11323d == C4592a.LOADING) {
            long a = C4718f.m13801a(this.f11331l);
            if (this.f11322c != null) {
                if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                    this.f11322c.f11234b.mo33768a(a, i);
                } else {
                    if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                        this.f11330k = Long.valueOf(System.currentTimeMillis());
                    }
                    this.f11322c.f11234b.mo33769a(a, i, str);
                    this.f11322c.f11234b.mo33773b(a, i, str);
                }
            }
            mo33835a(C4592a.FAILED);
            this.f11321b.mo33801a(new IronSourceError(i, str), this);
        }
        if (this.f11323d != C4592a.FAILED) {
            String format = String.format("unexpected load failed for %s, state - %s, error - %s, %s", new Object[]{mo33846l(), this.f11323d, Integer.valueOf(i), str});
            C4563d dVar = this.f11322c;
            if (dVar != null) {
                dVar.f11237e.mo33786j(format);
            }
        }
    }

    public void onAdLoadSuccess() {
        IronLog.INTERNAL.verbose(mo33838c(""));
        C4611c cVar = this.f11332m;
        if (cVar != null) {
            cVar.mo33878d();
        }
        if (this.f11323d == C4592a.LOADING) {
            long a = C4718f.m13801a(this.f11331l);
            C4563d dVar = this.f11322c;
            if (dVar != null) {
                dVar.f11234b.mo33770a(a, false);
            }
            mo33835a(C4592a.LOADED);
            this.f11321b.mo33800a(this);
        } else if (this.f11323d != C4592a.FAILED) {
            String format = String.format("unexpected load success for %s, state - %s", new Object[]{mo33846l(), this.f11323d});
            C4563d dVar2 = this.f11322c;
            if (dVar2 != null) {
                dVar2.f11237e.mo33785i(format);
            }
        }
    }

    public void onInitFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo33838c("error = " + i + ", " + str));
        if (mo33834a()) {
            C4611c cVar = this.f11332m;
            if (cVar != null) {
                cVar.mo33878d();
            }
            mo33835a(C4592a.FAILED);
            Listener listener = this.f11321b;
            IronSourceError ironSourceError = new IronSourceError(i, str);
            C4718f.m13801a(this.f11331l);
            listener.mo33801a(ironSourceError, this);
        } else if (this.f11323d != C4592a.FAILED) {
            String format = String.format("unexpected init failed for %s, state - %s, error - %s, %s", new Object[]{mo33846l(), this.f11323d, Integer.valueOf(i), str});
            C4563d dVar = this.f11322c;
            if (dVar != null) {
                dVar.f11237e.mo33782f(format);
            }
        }
    }

    public void onInitSuccess() {
        IronLog.INTERNAL.verbose(mo33838c(""));
        if (mo33834a()) {
            C4611c cVar = this.f11332m;
            if (cVar != null) {
                cVar.mo33878d();
            }
            mo33835a(C4592a.READY_TO_LOAD);
            IronLog.INTERNAL.verbose(mo33838c(""));
            mo33835a(C4592a.LOADING);
            try {
                this.f11332m.mo33877a(this);
                this.f11326g.loadAd(this.f11325f, ContextProvider.getInstance().getCurrentActiveActivity(), this);
            } catch (Throwable th) {
                String str = "unexpected error while calling adapter.loadAd() - " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(mo33838c(str));
                C4563d dVar = this.f11322c;
                if (dVar != null) {
                    dVar.f11237e.mo33788l(str);
                }
                onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
            }
        } else if (this.f11323d != C4592a.FAILED) {
            String format = String.format("unexpected init success for %s, state - %s", new Object[]{mo33846l(), this.f11323d});
            C4563d dVar2 = this.f11322c;
            if (dVar2 != null) {
                dVar2.f11237e.mo33781e(format);
            }
        }
    }

    /* renamed from: p */
    public final boolean mo33850p() {
        return this.f11323d == C4592a.SHOWING;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final String mo33851q() {
        Placement placement = this.f11324e;
        return placement == null ? "" : placement.getPlacementName();
    }
}
