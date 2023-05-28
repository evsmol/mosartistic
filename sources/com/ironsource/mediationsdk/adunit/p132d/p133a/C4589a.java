package com.ironsource.mediationsdk.adunit.p132d.p133a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.p129c.p130a.C4572a;
import com.ironsource.mediationsdk.adunit.p132d.C4588a;
import com.ironsource.mediationsdk.adunit.p132d.p133a.C4591c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C4646a;
import com.ironsource.mediationsdk.model.Placement;

/* renamed from: com.ironsource.mediationsdk.adunit.d.a.a */
public abstract class C4589a<Listener extends C4572a> extends C4591c<Listener> implements AdapterAdInteractionListener {

    /* renamed from: g */
    private BaseAdInteractionAdapter<?, AdapterAdInteractionListener> f11318g;

    public C4589a(C4588a aVar, BaseAdInteractionAdapter<?, ?> baseAdInteractionAdapter, C4646a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
        this.f11318g = baseAdInteractionAdapter;
    }

    /* renamed from: a */
    public final void mo33832a(Placement placement) {
        int i;
        IronLog.INTERNAL.verbose(mo33838c("placementName = " + placement.getPlacementName()));
        try {
            this.f11324e = placement;
            this.f11322c.f11236d.mo33740a(mo33851q());
            this.f11318g.showAd(this.f11325f, this);
        } catch (Throwable th) {
            String str = "showAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(mo33838c(str));
            if (this.f11322c != null) {
                this.f11322c.f11237e.mo33788l(str);
            }
            IronSource.AD_UNIT ad_unit = this.f11320a.f11309a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = IronSourceError.ERROR_IS_SHOW_EXCEPTION;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = IronSourceError.ERROR_RV_SHOW_EXCEPTION;
            } else {
                IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
                i = 510;
            }
            onAdShowFailed(i, str);
        }
    }

    /* renamed from: a */
    public final void mo33833a(boolean z) {
        if (this.f11322c != null) {
            this.f11322c.f11236d.mo33744a(z);
        }
    }

    /* renamed from: a */
    public final boolean mo33834a() {
        if (this.f11325f != null) {
            try {
                return mo33844h() ? this.f11323d == C4591c.C4592a.LOADED && this.f11318g.isAdAvailable(this.f11325f) : this.f11318g.isAdAvailable(this.f11325f);
            } catch (Throwable th) {
                String str = "isReadyToShow - exception = " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(mo33838c(str));
                if (this.f11322c != null) {
                    this.f11322c.f11237e.mo33788l(str);
                }
            }
        }
        return false;
    }

    public void onAdClosed() {
        String str;
        String str2 = "";
        IronLog.INTERNAL.verbose(mo33838c(str2));
        mo33835a(C4591c.C4592a.NONE);
        if (this.f11322c != null) {
            if (this.f11320a.f11309a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                String c = ((C4572a) this.f11321b).mo33796c();
                StringBuilder sb = new StringBuilder("otherInstanceAvailable = ");
                if (c.length() > 0) {
                    str = "true|" + c;
                } else {
                    str = "false";
                }
                sb.append(str);
                str2 = sb.toString();
            }
            this.f11322c.f11236d.mo33742a(mo33851q(), str2);
        }
        ((C4572a) this.f11321b).mo33797c(this);
    }

    public void onAdEnded() {
        IronLog.INTERNAL.verbose(mo33838c(""));
        if (this.f11322c != null) {
            this.f11322c.f11236d.mo33749f(mo33851q());
        }
        ((C4572a) this.f11321b).mo33799e(this);
    }

    public void onAdOpened() {
        IronLog.INTERNAL.verbose(mo33838c(""));
        mo33835a(C4591c.C4592a.SHOWING);
        if (this.f11322c != null) {
            this.f11322c.f11236d.mo33746c(mo33851q());
        }
        ((C4572a) this.f11321b).mo33795b(this);
    }

    public void onAdShowFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo33838c("error = " + i + ", " + str));
        if (this.f11322c != null) {
            this.f11322c.f11236d.mo33741a(mo33851q(), i, str, "");
        }
        ((C4572a) this.f11321b).mo33794a(new IronSourceError(i, str), this);
    }

    public void onAdShowSuccess() {
        IronLog.INTERNAL.verbose(mo33838c(""));
        if (this.f11322c != null) {
            this.f11322c.f11236d.mo33745b(mo33851q());
        }
        ((C4572a) this.f11321b).mo33793a(this);
    }

    public void onAdStarted() {
        IronLog.INTERNAL.verbose(mo33838c(""));
        if (this.f11322c != null) {
            this.f11322c.f11236d.mo33748e(mo33851q());
        }
        ((C4572a) this.f11321b).mo33798d(this);
    }

    public void onAdVisible() {
        IronLog.INTERNAL.verbose(mo33838c(""));
        if (this.f11322c != null) {
            this.f11322c.f11236d.mo33750g(mo33851q());
        }
    }
}
