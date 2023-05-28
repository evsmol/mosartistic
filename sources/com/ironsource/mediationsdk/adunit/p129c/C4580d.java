package com.ironsource.mediationsdk.adunit.p129c;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C4439B;
import com.ironsource.mediationsdk.C4540aa;
import com.ironsource.mediationsdk.C4624h;
import com.ironsource.mediationsdk.C4626i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.p129c.C4581e;
import com.ironsource.mediationsdk.adunit.p129c.p130a.C4572a;
import com.ironsource.mediationsdk.adunit.p129c.p131b.C4576a;
import com.ironsource.mediationsdk.adunit.p132d.p133a.C4589a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.server.C4707b;
import com.ironsource.mediationsdk.utils.C4723k;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ironsource.mediationsdk.adunit.c.d */
public abstract class C4580d<Smash extends C4589a<?>, Adapter extends BaseAdInteractionAdapter<?, ? extends AdapterAdInteractionListener>> extends C4581e<Smash, Adapter> implements C4572a {
    public C4580d(C4571a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    /* renamed from: a */
    private void m13349a(IronSourceError ironSourceError, String str) {
        this.f11290q.f11236d.mo33741a(mo33829h(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.f11288o.mo33811b();
        this.f11291r.mo33806b(ironSourceError);
        if (this.f11286m.f11259h.mo33808b()) {
            mo33823a(false, false);
        }
    }

    /* renamed from: a */
    public final void mo33793a(C4589a<?> aVar) {
        IronLog.INTERNAL.verbose(mo33817a(aVar.mo33846l()));
        C4575b bVar = this.f11291r;
        if (bVar.f11261a == IronSource.AD_UNIT.INTERSTITIAL) {
            C4439B.m12623a().mo33288e();
        } else if (bVar.f11261a != IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.f11261a);
        }
    }

    /* renamed from: a */
    public final void mo33794a(IronSourceError ironSourceError, C4589a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo33817a(aVar.mo33846l() + " - error = " + ironSourceError));
        this.f11276c.put(aVar.mo33612k(), C4626i.C4627a.ISAuctionPerformanceFailedToShow);
        mo33820a(C4581e.C4584a.READY_TO_LOAD);
        m13349a(ironSourceError, "");
    }

    /* renamed from: a */
    public final void mo33813a(Placement placement) {
        C4589a aVar;
        IronSourceError ironSourceError;
        String stringBuffer;
        IronLog.INTERNAL.verbose(mo33817a("state = " + this.f11287n));
        synchronized (this.f11293t) {
            this.f11283j = placement;
            this.f11290q.f11236d.mo33740a(mo33829h());
            int i = 510;
            aVar = null;
            if (this.f11287n == C4581e.C4584a.SHOWING) {
                IronSource.AD_UNIT ad_unit = this.f11286m.f11252a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
                }
                ironSourceError = new IronSourceError(i, "can't show ad while an ad is already showing");
            } else if (this.f11287n != C4581e.C4584a.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(509, "show called while no ads are available");
            } else if (placement == null) {
                IronSource.AD_UNIT ad_unit2 = this.f11286m.f11252a;
                if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT;
                } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT;
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit2);
                }
                ironSourceError = new IronSourceError(i, "empty default placement");
            } else if (C4723k.m13832a(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.f11286m.f11252a)) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, "placement " + placement.getPlacementName() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(mo33817a(ironSourceError.getErrorMessage()));
                stringBuffer = "";
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                Iterator it = this.f11274a.mo33852a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C4589a aVar2 = (C4589a) it.next();
                    if (aVar2.mo33834a()) {
                        mo33820a(C4581e.C4584a.SHOWING);
                        aVar2.mo33833a(true);
                        aVar = aVar2;
                        break;
                    }
                    if (aVar2.mo33843g() != null) {
                        stringBuffer2.append(aVar2.mo33612k() + ":" + aVar2.mo33843g() + ",");
                    }
                    aVar2.mo33833a(false);
                    IronLog.INTERNAL.verbose(mo33817a(aVar2.mo33846l() + " - not ready to show"));
                }
                if (aVar == null) {
                    ironSourceError = ErrorBuilder.buildNoAdsToShowError(this.f11286m.f11252a.toString());
                    stringBuffer = stringBuffer2.toString();
                }
            }
            m13349a(ironSourceError, stringBuffer);
        }
        if (aVar != null) {
            Placement placement2 = this.f11283j;
            if (this.f11286m.f11259h.mo33808b()) {
                this.f11289p.mo34226a();
            }
            aVar.mo33832a(placement2);
        }
    }

    /* renamed from: b */
    public final void mo33795b(C4589a<?> aVar) {
        IronLog.INTERNAL.verbose(mo33817a(aVar.mo33846l()));
        this.f11274a.mo33854a(aVar);
        this.f11285l.mo34202a(aVar);
        if (this.f11285l.mo34204b(aVar)) {
            IronLog.INTERNAL.verbose(mo33817a(aVar.mo33612k() + " was session capped"));
            aVar.mo33842f();
            IronSourceUtils.sendAutomationLog(aVar.mo33612k() + " was session capped");
        }
        C4723k.m13835b(ContextProvider.getInstance().getApplicationContext(), mo33829h(), this.f11286m.f11252a);
        if (C4723k.m13832a(ContextProvider.getInstance().getApplicationContext(), mo33829h(), this.f11286m.f11252a)) {
            IronLog.INTERNAL.verbose(mo33817a("placement " + mo33829h() + " is capped"));
            this.f11290q.f11236d.mo33751h(mo33829h());
        }
        C4575b bVar = this.f11291r;
        if (bVar.f11261a == IronSource.AD_UNIT.INTERSTITIAL) {
            C4439B.m12623a().mo33286c();
        } else if (bVar.f11261a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C4540aa.m13201a().mo33678b();
        } else {
            IronLog.INTERNAL.warning("ad unit not supported - " + bVar.f11261a);
        }
        if (this.f11286m.f11259h.mo33808b()) {
            mo33823a(false, false);
        }
        C4731o.m13872a().mo34206a(this.f11286m.f11252a);
        if (this.f11286m.mo33792a()) {
            C4707b bVar2 = (C4707b) this.f11275b.get(aVar.mo33612k());
            if (bVar2 != null) {
                C4624h.m13548a(bVar2, aVar.mo33845i(), this.f11282i, mo33829h());
                this.f11276c.put(aVar.mo33612k(), C4626i.C4627a.ISAuctionPerformanceShowedSuccessfully);
                mo33822a(bVar2, mo33829h());
            } else {
                String k = aVar.mo33612k();
                String str = "showing instance missing from waterfall - " + k;
                IronLog.INTERNAL.verbose(mo33817a(str));
                this.f11290q.f11237e.mo33775a(IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND, str, k);
            }
        }
        C4578c cVar = this.f11288o;
        if (cVar.f11270a.f11262a == C4576a.C4577a.AUTOMATIC_LOAD_WHILE_SHOW) {
            cVar.mo33810a(cVar.f11270a.f11263b);
        }
    }

    /* renamed from: b */
    public final boolean mo33814b() {
        if (!mo33827f()) {
            return false;
        }
        if (this.f11284k && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f11274a.mo33852a().iterator();
        while (it.hasNext()) {
            if (((C4589a) it.next()).mo33834a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final String mo33796c() {
        StringBuilder sb = new StringBuilder();
        if (this.f11287n == C4581e.C4584a.READY_TO_SHOW) {
            Iterator it = this.f11274a.mo33852a().iterator();
            while (it.hasNext()) {
                C4589a aVar = (C4589a) it.next();
                if (aVar.mo33840d()) {
                    sb.append(aVar.mo33612k() + ";");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo33797c(C4589a<?> aVar) {
        IronLog.INTERNAL.verbose(mo33817a(aVar.mo33846l()));
        if (this.f11287n == C4581e.C4584a.SHOWING) {
            mo33820a(C4581e.C4584a.READY_TO_LOAD);
        }
        C4578c cVar = this.f11288o;
        if (cVar.f11270a.f11262a == C4576a.C4577a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            cVar.mo33810a(cVar.f11270a.f11263b);
        }
        C4575b bVar = this.f11291r;
        if (bVar.f11261a == IronSource.AD_UNIT.INTERSTITIAL) {
            C4439B.m12623a().mo33287d();
        } else if (bVar.f11261a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C4540aa.m13201a().mo33680c();
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.f11261a);
        }
    }

    /* renamed from: d */
    public final void mo33798d(C4589a<?> aVar) {
        IronLog.INTERNAL.verbose(mo33817a(aVar.mo33846l()));
        C4575b bVar = this.f11291r;
        if (bVar.f11261a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C4540aa.m13201a().mo33681d();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar.f11261a);
    }

    /* renamed from: e */
    public final void mo33799e(C4589a<?> aVar) {
        IronLog.INTERNAL.verbose(mo33817a(aVar.mo33846l()));
        C4575b bVar = this.f11291r;
        if (bVar.f11261a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C4540aa.m13201a().mo33682e();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar.f11261a);
    }
}
