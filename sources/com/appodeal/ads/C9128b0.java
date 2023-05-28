package com.appodeal.ads;

import android.os.Handler;
import android.text.TextUtils;
import com.appodeal.ads.C9258l;
import com.appodeal.ads.C9378o1;
import com.appodeal.ads.C9420r;
import com.appodeal.ads.Native;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.utils.C9618d0;
import com.appodeal.ads.utils.C9640o;
import com.appodeal.ads.utils.C9670y;
import com.appodeal.ads.utils.EventsTracker;
import com.appodeal.ads.utils.ExchangeAd;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.b0 */
public abstract class C9128b0<AdObjectType extends C9258l, AdRequestType extends C9420r<AdObjectType>, ReferenceObjectType> {

    /* renamed from: a */
    public C9577u<AdObjectType, AdRequestType, ?> f22929a;

    /* renamed from: b */
    public final C9192g<AdRequestType, AdObjectType, ReferenceObjectType> f22930b;

    public C9128b0(C9192g<AdRequestType, AdObjectType, ReferenceObjectType> gVar) {
        this.f22930b = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27162a(C9420r rVar, C9258l lVar, Object obj) {
        this.f22930b.mo59944a(rVar, lVar, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27163a(C9420r rVar, C9258l lVar, Object obj, LoadingError loadingError) {
        this.f22930b.mo59946b(rVar, lVar, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m27164c(C9420r rVar, C9258l lVar) {
        this.f22930b.mo59945b(rVar, lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m27165d(C9420r rVar, C9258l lVar) {
        this.f22930b.mo59950e(rVar, lVar);
    }

    /* renamed from: a */
    public void mo59834a(C9420r rVar, C9229j1 j1Var) {
    }

    /* renamed from: a */
    public final void mo59840a(C9573t2 t2Var, C9258l lVar) {
        mo59838a(t2Var, lVar, (LoadingError) null);
    }

    /* renamed from: a */
    public final void mo59841a(C9577u<AdObjectType, AdRequestType, ?> uVar) {
        this.f22929a = uVar;
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo59842a() {
        return !(this instanceof Native.C8989b);
    }

    /* renamed from: a */
    public boolean mo59250a(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        return adrequesttype.f23907v;
    }

    /* renamed from: b */
    public final void mo59843b(AdRequestType adrequesttype) {
        this.f22929a.mo60832a(adrequesttype, 0, false, false);
    }

    /* renamed from: b */
    public boolean mo59846b() {
        return this instanceof C9378o1.C9380b;
    }

    /* renamed from: b */
    public boolean mo59253b(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
        return rVar.f23911z;
    }

    /* renamed from: c */
    public boolean mo59255c(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
        return rVar.f23879C;
    }

    /* renamed from: d */
    public final void mo59848d(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
        C9212h5.f23153a.post(new Runnable(rVar, lVar, l2Var) {
            public final /* synthetic */ C9420r f$1;
            public final /* synthetic */ C9258l f$2;
            public final /* synthetic */ Object f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C9128b0.this.m27162a(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: d */
    public boolean mo59849d(AdRequestType adrequesttype) {
        return true;
    }

    /* renamed from: e */
    public C9490g mo59256e(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
        return this.f22929a.mo60845e();
    }

    /* renamed from: f */
    public final void mo59850f(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        C9212h5.f23153a.post(new Runnable(adrequesttype, adobjecttype) {
            public final /* synthetic */ C9420r f$1;
            public final /* synthetic */ C9258l f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C9128b0.this.m27164c(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: f */
    public abstract void mo59257f(C9420r rVar, C9258l lVar, C9263l2 l2Var);

    /* renamed from: g */
    public final void mo59851g(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        C9212h5.f23153a.post(new Runnable(adrequesttype, adobjecttype) {
            public final /* synthetic */ C9420r f$1;
            public final /* synthetic */ C9258l f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C9128b0.this.m27165d(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: g */
    public abstract void mo59258g(C9420r rVar, C9258l lVar, C9263l2 l2Var);

    /* renamed from: h */
    public void mo59259h(AdRequestType adrequesttype, AdObjectType adobjecttype) {
    }

    /* renamed from: h */
    public abstract void mo59260h(C9420r rVar, C9258l lVar, C9263l2 l2Var);

    /* renamed from: i */
    public void mo59852i(C9420r rVar, C9258l lVar) {
    }

    /* renamed from: i */
    public final void mo59853i(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
        try {
            if (!mo59253b(rVar, lVar, l2Var)) {
                rVar.f23911z = true;
                rVar.f23900o = System.currentTimeMillis();
                lVar.getClass();
                C9618d0.m28372a(lVar);
                ExchangeAd exchangeAd = lVar.f23275i;
                if (exchangeAd != null) {
                    exchangeAd.trackFinish();
                }
                UnifiedAdType unifiedadtype = lVar.f23272f;
                if (unifiedadtype != null) {
                    unifiedadtype.onFinished();
                }
                if (lVar.f23283q == 0) {
                    lVar.f23283q = System.currentTimeMillis();
                }
                this.f22929a.mo60836a(LogConstants.EVENT_FINISHED, (AdUnit) lVar, (LoadingError) null);
                EventsTracker.get().mo61022a(this.f22929a.f24288f, lVar, EventsTracker.EventType.Finish);
                C9237k0.m27398a(rVar, lVar, Integer.valueOf(mo59256e(rVar, lVar, l2Var).f24089a), Double.valueOf(this.f22929a.mo60848h()));
                mo59258g(rVar, lVar, l2Var);
                C9212h5.f23153a.post(new C9727z(this, rVar, lVar, l2Var));
            }
        } catch (Exception e) {
            Log.log(e);
        }
    }

    /* renamed from: j */
    public void mo59854j(C9420r rVar, C9258l lVar) {
    }

    /* renamed from: j */
    public final synchronized void mo59855j(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
        if (rVar != null) {
            try {
                if (!mo59255c(rVar, lVar, l2Var)) {
                    rVar.f23879C = true;
                    rVar.f23898m = System.currentTimeMillis();
                    rVar.mo60605a(false, true);
                    if (!rVar.f23878B) {
                        mo59859o(rVar, lVar);
                    }
                    mo59249a(rVar);
                    C9640o.m28398b(lVar);
                    C9670y.m28444a(this.f22929a.f24288f);
                    C9409q4.m27829a(this.f22929a.f24288f, lVar.f23268b.getName(), lVar.f23270d, lVar.f23269c.getAdUnitName(), mo59256e(rVar, lVar, l2Var), lVar.f23269c.getEcpm());
                    this.f22929a.mo60836a(LogConstants.EVENT_SHOWN, (AdUnit) lVar, (LoadingError) null);
                    rVar.f23906u = false;
                    rVar.f23907v = false;
                    rVar.mo60092e(lVar);
                    if (mo59846b()) {
                        UnifiedAdType unifiedadtype = lVar.f23272f;
                        if (unifiedadtype != null) {
                            unifiedadtype.onShow();
                        }
                        if (lVar.f23280n == 0) {
                            lVar.f23280n = System.currentTimeMillis();
                        }
                    }
                    lVar.mo60100b(this.f22929a.mo60845e().f24089a);
                    EventsTracker.get().mo61022a(this.f22929a.f24288f, lVar, EventsTracker.EventType.Impression);
                    C9237k0.m27403b(rVar, lVar, Integer.valueOf(mo59256e(rVar, lVar, l2Var).f24089a), Double.valueOf(this.f22929a.mo60848h()));
                    mo59260h(rVar, lVar, l2Var);
                    C9212h5.f23153a.post(new C9001a0(this, rVar, lVar, l2Var));
                }
            } catch (Exception e) {
                Log.log(e);
            }
        }
        return;
    }

    /* renamed from: k */
    public final void mo59856k(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        int i = 0;
        if (!adobjecttype.mo60103f()) {
            if (adobjecttype.f23269c.isPrecache()) {
                adrequesttype.f23907v = true;
            } else {
                adrequesttype.f23906u = true;
            }
            C9640o.m28398b(adrequesttype.f23904s);
            AdObjectType adobjecttype2 = adrequesttype.f23904s;
            if (!(adobjecttype2 == null || adobjecttype2 == adobjecttype || adobjecttype2.mo60103f())) {
                adobjecttype2.mo60107k();
            }
            adrequesttype.f23904s = adobjecttype;
            AdRequestType adrequesttype2 = this.f22929a.f24306x;
            if (!(adrequesttype2 != null && adrequesttype2 == adrequesttype)) {
                adrequesttype.mo60605a(false, true);
            } else if (!adobjecttype.f23269c.isPrecache()) {
                adrequesttype.mo60605a(false, false);
            }
        } else {
            adrequesttype.getClass();
            while (i < adobjecttype.f23271e.size()) {
                try {
                    String str = (String) adobjecttype.f23271e.get(i);
                    C9258l lVar = (C9258l) adrequesttype.f23902q.get(str);
                    if (lVar == null || adobjecttype.f23269c.getEcpm() > lVar.f23269c.getEcpm()) {
                        adrequesttype.f23902q.put(str, adobjecttype);
                    }
                    i++;
                } catch (Exception e) {
                    Log.log(e);
                }
            }
            adrequesttype.f23888c.remove(adobjecttype);
        }
    }

    /* renamed from: k */
    public abstract boolean mo59261k(C9420r rVar, C9258l lVar, C9263l2 l2Var);

    /* renamed from: l */
    public void mo59262l(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        adrequesttype.f23905t = adobjecttype.f23269c.getEcpm();
    }

    /* renamed from: m */
    public final void m27166e(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        C9577u<AdObjectType, AdRequestType, ?> uVar = this.f22929a;
        AdRequestType adrequesttype2 = uVar.f24306x;
        boolean z = true;
        if ((adrequesttype2 != null && adrequesttype2 == adrequesttype) && uVar.f24289g.contains(adrequesttype)) {
            this.f22929a.mo60836a(LogConstants.EVENT_EXPIRED, (AdUnit) adobjecttype, (LoadingError) null);
            EventsTracker.get().mo61022a(this.f22929a.f24288f, adobjecttype, EventsTracker.EventType.Expired);
            if (!mo59842a()) {
                if (adobjecttype != null) {
                    C9640o.m28398b(adobjecttype);
                    String id = adobjecttype.f23269c.getId();
                    adrequesttype.getClass();
                    try {
                        Iterator it = adrequesttype.f23902q.values().iterator();
                        while (it.hasNext()) {
                            if (((C9258l) it.next()).f23269c.getId().equals(id)) {
                                it.remove();
                            }
                        }
                    } catch (Exception e) {
                        Log.log(e);
                    }
                }
                AdObjectType adobjecttype2 = adrequesttype.f23904s;
                if (adobjecttype2 != null) {
                    adobjecttype2.mo60107k();
                    adrequesttype.f23904s = null;
                    adrequesttype.f23885I.f24256a = null;
                    adrequesttype.f23906u = false;
                    adrequesttype.f23907v = false;
                }
            } else if (adobjecttype.mo60103f()) {
                C9640o.m28398b(adobjecttype);
                String id2 = adobjecttype.f23269c.getId();
                adrequesttype.getClass();
                try {
                    Iterator it2 = adrequesttype.f23902q.values().iterator();
                    while (it2.hasNext()) {
                        if (((C9258l) it2.next()).f23269c.getId().equals(id2)) {
                            it2.remove();
                        }
                    }
                } catch (Exception e2) {
                    Log.log(e2);
                }
                adobjecttype.mo60107k();
                return;
            } else {
                AdObjectType adobjecttype3 = adrequesttype.f23904s;
                if (adobjecttype3 == null || adobjecttype3 != adobjecttype) {
                    z = false;
                }
                if (z) {
                    C9640o.m28398b(adobjecttype);
                    C9640o.m28397a((Collection<? extends C9258l>) adrequesttype.f23902q.values());
                    AdObjectType adobjecttype4 = adrequesttype.f23904s;
                    if (adobjecttype4 != null) {
                        adobjecttype4.mo60107k();
                        adrequesttype.f23904s = null;
                        adrequesttype.f23885I.f24256a = null;
                        adrequesttype.f23906u = false;
                        adrequesttype.f23907v = false;
                    }
                    try {
                        Iterator it3 = adrequesttype.f23902q.values().iterator();
                        while (it3.hasNext()) {
                            C9258l lVar = (C9258l) it3.next();
                            if (lVar != null) {
                                lVar.mo60107k();
                            }
                            it3.remove();
                        }
                    } catch (Exception e3) {
                        Log.log(e3);
                    }
                } else {
                    return;
                }
            }
            adrequesttype.mo60634y();
            mo59259h(adrequesttype, adobjecttype);
            mo59850f(adrequesttype, adobjecttype);
        }
    }

    /* renamed from: n */
    public final void mo59858n(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        AdObjectType adobjecttype2;
        AdObjectType adobjecttype3;
        if (adrequesttype != null) {
            try {
                if (!adrequesttype.f23882F && !adrequesttype.f23879C) {
                    if (!adrequesttype.f23878B) {
                        AdRequestType adrequesttype2 = this.f22929a.f24307y;
                        boolean z = false;
                        if (adrequesttype2 != null && adrequesttype2 == adrequesttype) {
                            if (!(adobjecttype == null || (adobjecttype3 = adrequesttype.f23904s) == null || adobjecttype3 != adobjecttype)) {
                                z = true;
                            }
                            if (!z) {
                                adobjecttype.mo60107k();
                                return;
                            }
                            return;
                        } else if (adobjecttype.f23278l == 3) {
                            adobjecttype.mo60107k();
                            return;
                        } else {
                            if (adrequesttype.f23890e.contains(adobjecttype)) {
                                adrequesttype.f23890e.remove(adobjecttype);
                            }
                            adobjecttype.f23278l = 2;
                            this.f22929a.mo60836a(LogConstants.EVENT_LOADED, (AdUnit) adobjecttype, (LoadingError) null);
                            ExchangeAd exchangeAd = adobjecttype.f23275i;
                            if (exchangeAd != null) {
                                exchangeAd.trackFill();
                            }
                            UnifiedAdType unifiedadtype = adobjecttype.f23272f;
                            if (unifiedadtype != null) {
                                unifiedadtype.onLoaded();
                            }
                            if (!adrequesttype.f23891f.contains(adobjecttype)) {
                                adrequesttype.f23891f.add(adobjecttype);
                            }
                            if ((!TextUtils.isEmpty(adobjecttype.f23269c.getId())) && adobjecttype.f23269c.getRequestResult() == null) {
                                adobjecttype.f23269c.mo59874a(C9173e0.Successful);
                                adobjecttype.f23269c.mo59898a(System.currentTimeMillis());
                            }
                            C9420r.C9421a aVar = adrequesttype.f23885I;
                            aVar.getClass();
                            if (!adobjecttype.mo60103f()) {
                                AdObjectType adobjecttype4 = aVar.f24256a;
                                if (adobjecttype4 == null || adobjecttype4.f23269c.getEcpm() < adobjecttype.f23269c.getEcpm()) {
                                    aVar.f24256a = adobjecttype;
                                }
                            }
                            AdObjectType adobjecttype5 = adrequesttype.f23885I.f24256a;
                            if (adobjecttype5 == null) {
                                adobjecttype5 = adobjecttype;
                            }
                            if (adobjecttype5.mo60103f() || (adobjecttype2 = adrequesttype.f23904s) == null || adobjecttype2 == adobjecttype || adobjecttype2.f23269c.getEcpm() < adobjecttype5.f23269c.getEcpm()) {
                                mo59262l(adrequesttype, adobjecttype5);
                                mo59856k(adrequesttype, adobjecttype5);
                            }
                            C9409q4.m27875k().mo60329c(this.f22929a.f24288f, adrequesttype.f23905t, adobjecttype.f23270d, adobjecttype.f23269c.getAdUnitName());
                            AdRequestType adrequesttype3 = this.f22929a.f24306x;
                            boolean z2 = adrequesttype3 != null && adrequesttype3 == adrequesttype;
                            if (!adrequesttype.f23893h && (adrequesttype.f23886a.isEmpty() ^ true) && mo59264p(adrequesttype, adobjecttype)) {
                                mo59843b(adrequesttype);
                                z = true;
                            }
                            if ((!z && !(true ^ adrequesttype.f23890e.isEmpty()) && mo59849d(adrequesttype)) || !z2) {
                                mo59859o(adrequesttype, adobjecttype);
                            }
                            if (z2) {
                                $$Lambda$b0$LG08XYbEAP0z5TaAUpQIbL5DaIk r1 = new C9640o.C9642b(adrequesttype) {
                                    public final /* synthetic */ C9420r f$1;

                                    {
                                        this.f$1 = r2;
                                    }

                                    /* renamed from: a */
                                    public final void mo59118a(C9258l lVar) {
                                        C9128b0.this.m27166e(this.f$1, lVar);
                                    }
                                };
                                Handler handler = C9640o.f24430a;
                                if (adobjecttype.f23269c.getExpTime() > 0) {
                                    Runnable runnable = (Runnable) C9640o.f24431b.get(adobjecttype);
                                    if (runnable != null) {
                                        C9640o.f24430a.removeCallbacks(runnable);
                                    }
                                    C9640o.f24431b.put(adobjecttype, new C9640o.C9641a(adobjecttype, r1));
                                    C9640o.m28396a((C9258l) adobjecttype);
                                }
                                if (adrequesttype.f23884H == null && !adobjecttype.mo60103f()) {
                                    mo59839a(adrequesttype, adobjecttype, z);
                                    this.f22929a.f24280B = 5000;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Exception e) {
                Log.log(e);
                mo59845b(adrequesttype, adobjecttype, (C9263l2) null, LoadingError.InternalError);
                return;
            }
        }
        adobjecttype.mo60107k();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c A[Catch:{ Exception -> 0x003d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[Catch:{ Exception -> 0x003d }] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59859o(AdRequestType r7, AdObjectType r8) {
        /*
            r6 = this;
            boolean r0 = r7.f23878B     // Catch:{ Exception -> 0x003d }
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.util.concurrent.CopyOnWriteArrayList r0 = r7.f23888c     // Catch:{ Exception -> 0x003d }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x003d }
            r1 = 1
            if (r0 == 0) goto L_0x0019
            java.util.concurrent.CopyOnWriteArrayList r0 = r7.f23889d     // Catch:{ Exception -> 0x003d }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x003d }
            if (r0 != 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            boolean r0 = r7.f23882F     // Catch:{ Exception -> 0x003d }
            if (r0 != 0) goto L_0x0032
            com.appodeal.ads.n0 r0 = com.appodeal.ads.C9409q4.m27875k()     // Catch:{ Exception -> 0x003d }
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r2 = r6.f22929a     // Catch:{ Exception -> 0x003d }
            com.appodeal.ads.modules.common.internal.adtype.AdType r2 = r2.f24288f     // Catch:{ Exception -> 0x003d }
            double r3 = r7.f23905t     // Catch:{ Exception -> 0x003d }
            boolean r5 = r6.mo59252b(r7, r8)     // Catch:{ Exception -> 0x003d }
            r0.mo60327a(r2, r3, r5)     // Catch:{ Exception -> 0x003d }
        L_0x0032:
            r7.mo60608b(r8)     // Catch:{ Exception -> 0x003d }
            r7.f23878B = r1     // Catch:{ Exception -> 0x003d }
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r0 = r6.f22929a     // Catch:{ Exception -> 0x003d }
            com.appodeal.ads.C9237k0.m27400a(r0, r7, r8)     // Catch:{ Exception -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r7 = move-exception
            com.appodeal.ads.utils.Log.log(r7)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9128b0.mo59859o(com.appodeal.ads.r, com.appodeal.ads.l):void");
    }

    /* renamed from: p */
    public boolean mo59264p(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        if (!adobjecttype.f23269c.isPrecache() && !adobjecttype.mo60103f()) {
            this.f22929a.getClass();
            return C9577u.m28268b((C9420r) adrequesttype, (C9258l) adobjecttype);
        }
    }

    /* renamed from: q */
    public boolean mo59860q(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        return true;
    }

    /* renamed from: a */
    public boolean mo59251a(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
        return rVar.f23880D;
    }

    /* renamed from: b */
    public boolean mo59252b(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        return adrequesttype.f23906u || adrequesttype.f23907v;
    }

    /* renamed from: c */
    public final void mo59847c(AdRequestType adrequesttype) {
        JSONObject jSONObject;
        C9577u<AdObjectType, AdRequestType, ?> uVar = this.f22929a;
        int indexOf = uVar.f24289g.indexOf(adrequesttype) + 1;
        C9420r rVar = (indexOf <= 0 || indexOf >= uVar.f24289g.size()) ? null : (C9420r) uVar.f24289g.get(indexOf);
        if (rVar != null && (jSONObject = rVar.f23883G) != null) {
            ArrayList arrayList = rVar.f23886a;
            arrayList.remove(arrayList.size() - 1);
            rVar.f23886a.add(0, jSONObject);
            if (rVar.f23905t < rVar.f23883G.optDouble("ecpm", 0.0d) && (rVar.f23886a.size() == 1 || rVar.f23906u)) {
                mo59843b(rVar);
            } else if (rVar.f23906u && !rVar.mo60630u()) {
                mo59859o(rVar, rVar.f23904s);
            }
        }
    }

    /* renamed from: a */
    public final void mo59836a(C9420r rVar, C9258l lVar, C9263l2 l2Var, LoadingError loadingError) {
        if (loadingError == LoadingError.ShowFailed) {
            C9212h5.f23153a.post(new Runnable(rVar, lVar, l2Var, loadingError) {
                public final /* synthetic */ C9420r f$1;
                public final /* synthetic */ C9258l f$2;
                public final /* synthetic */ Object f$3;
                public final /* synthetic */ LoadingError f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void run() {
                    C9128b0.this.m27163a(this.f$1, this.f$2, this.f$3, this.f$4);
                }
            });
            return;
        }
        C9212h5.f23153a.post(new C9682w(this, rVar, lVar, loadingError));
    }

    /* renamed from: b */
    public final void mo59844b(C9420r rVar, C9229j1 j1Var) {
        if (rVar != null) {
            try {
                if (!rVar.f23877A) {
                    rVar.f23877A = true;
                    UnifiedAdType unifiedadtype = j1Var.f23272f;
                    if (unifiedadtype != null) {
                        unifiedadtype.onHide();
                    }
                    this.f22929a.mo60836a(LogConstants.EVENT_CLOSED, (AdUnit) j1Var, (LoadingError) null);
                    mo59834a(rVar, j1Var);
                    C9212h5.f23153a.post(new C9717y((C9678v2) this, rVar, j1Var));
                }
            } catch (Exception e) {
                Log.log(e);
            }
        }
    }

    /* renamed from: l */
    public boolean mo59263l(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
        return !rVar.f23879C;
    }

    /* renamed from: a */
    public void mo59249a(AdRequestType adrequesttype) {
        HashSet hashSet = new HashSet();
        while (adrequesttype != null) {
            hashSet.addAll(adrequesttype.f23891f);
            adrequesttype = adrequesttype.f23884H;
        }
        if (!hashSet.isEmpty()) {
            C9258l lVar = null;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C9258l lVar2 = (C9258l) it.next();
                if (lVar == null || lVar.f23269c.getEcpm() < lVar2.f23269c.getEcpm()) {
                    lVar = lVar2;
                }
            }
            if (lVar != null) {
                lVar.mo60106j();
                hashSet.remove(lVar);
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C9258l) it2.next()).mo60098a(lVar.f23270d, lVar.f23269c.getEcpm());
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo59845b(C9420r rVar, C9258l lVar, C9263l2 l2Var, LoadingError loadingError) {
        if (loadingError == null) {
            try {
                loadingError = LoadingError.InternalError;
            } catch (Exception e) {
                Log.log(e);
                return;
            }
        }
        this.f22929a.mo60836a(LogConstants.EVENT_LOAD_FAILED_SOFT, (AdUnit) lVar, loadingError);
        EventsTracker.get().mo61022a(this.f22929a.f24288f, lVar, EventsTracker.EventType.InternalError);
        if (rVar != null) {
            rVar.mo60605a(false, false);
            rVar.f23906u = false;
            rVar.f23907v = false;
        }
        if (lVar != null) {
            ExchangeAd exchangeAd = lVar.f23275i;
            if (exchangeAd != null && loadingError == LoadingError.TimeoutError) {
                exchangeAd.trackError(1005);
            }
            UnifiedAdType unifiedadtype = lVar.f23272f;
            if (unifiedadtype != null) {
                unifiedadtype.onError(loadingError);
            }
        }
        if (rVar == null || rVar.f23884H == null) {
            mo59854j(rVar, lVar);
            C9577u<AdObjectType, AdRequestType, ?> uVar = this.f22929a;
            int i = uVar.f24280B;
            if (uVar.mo60582k()) {
                C9212h5.f23153a.postDelayed(new C9697x(this), (long) i);
            }
            mo59836a(rVar, lVar, l2Var, loadingError);
        }
    }

    /* renamed from: a */
    public void mo59839a(AdRequestType adrequesttype, AdObjectType adobjecttype, boolean z) {
        if (mo59254b(adrequesttype, adobjecttype, z)) {
            adrequesttype.f23910y = true;
            mo59851g(adrequesttype, adobjecttype);
        }
    }

    /* renamed from: a */
    public final void mo59837a(C9420r rVar, C9258l lVar, C9263l2 l2Var, UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        try {
            if (mo59263l(rVar, lVar, l2Var)) {
                mo59855j(rVar, lVar, l2Var);
            }
            if (mo59261k(rVar, lVar, l2Var)) {
                mo59853i(rVar, lVar, l2Var);
            }
            if (!mo59251a(rVar, lVar, l2Var)) {
                rVar.f23880D = true;
                rVar.f23899n = System.currentTimeMillis();
                C9409q4.m27875k().mo60325a(this.f22929a.f24288f, lVar.f23269c.getEcpm(), lVar.f23270d, lVar.f23269c.getAdUnitName());
                this.f22929a.mo60836a(LogConstants.EVENT_CLICKED, (AdUnit) lVar, (LoadingError) null);
                C9148b.f22956b.f22957a.getApplicationContext();
                lVar.mo60104h();
                EventsTracker.get().mo61022a(this.f22929a.f24288f, lVar, EventsTracker.EventType.Click);
                C9237k0.m27399a((C9420r<?>) rVar, (C9258l<?, ?, ?, ?>) lVar, Integer.valueOf(mo59256e(rVar, lVar, l2Var).f24089a), Double.valueOf(this.f22929a.mo60848h()), unifiedAdCallbackClickTrackListener);
                mo59257f(rVar, lVar, l2Var);
                mo59848d(rVar, lVar, l2Var);
            } else if (unifiedAdCallbackClickTrackListener != null) {
                unifiedAdCallbackClickTrackListener.onTrackError();
            }
        } catch (Exception e) {
            Log.log(e);
        }
    }

    /* renamed from: b */
    public boolean mo59254b(AdRequestType adrequesttype, AdObjectType adobjecttype, boolean z) {
        return !adrequesttype.f23910y && (!z || this.f22929a.f24302t);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x017a A[Catch:{ Exception -> 0x0185 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59835a(AdRequestType r12, AdObjectType r13, com.appodeal.ads.C9191f5 r14, com.appodeal.ads.networking.LoadingError r15) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x018f
            boolean r0 = r12.f23882F     // Catch:{ Exception -> 0x0185 }
            if (r0 != 0) goto L_0x018f
            boolean r0 = r12.f23879C     // Catch:{ Exception -> 0x0185 }
            if (r0 == 0) goto L_0x000c
            goto L_0x018f
        L_0x000c:
            boolean r0 = r12.f23893h     // Catch:{ Exception -> 0x0185 }
            java.util.concurrent.CopyOnWriteArrayList r1 = r12.f23890e     // Catch:{ Exception -> 0x0185 }
            boolean r1 = r1.contains(r13)     // Catch:{ Exception -> 0x0185 }
            if (r1 == 0) goto L_0x001b
            java.util.concurrent.CopyOnWriteArrayList r1 = r12.f23890e     // Catch:{ Exception -> 0x0185 }
            r1.remove(r13)     // Catch:{ Exception -> 0x0185 }
        L_0x001b:
            r1 = 1
            if (r13 == 0) goto L_0x0023
            int r2 = r13.f23278l     // Catch:{ Exception -> 0x0185 }
            if (r2 == r1) goto L_0x0023
            return
        L_0x0023:
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r2 = r11.f22929a     // Catch:{ Exception -> 0x0185 }
            java.lang.String r3 = "Load Failed"
            r2.mo60836a((java.lang.String) r3, (com.appodeal.ads.AdUnit) r13, (com.appodeal.ads.networking.LoadingError) r15)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.utils.EventsTracker r2 = com.appodeal.ads.utils.EventsTracker.get()     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r3 = r11.f22929a     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = r3.f24288f     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.utils.EventsTracker$EventType r4 = com.appodeal.ads.utils.EventsTracker.EventType.FailedToLoad     // Catch:{ Exception -> 0x0185 }
            r2.mo61022a(r3, r13, r4)     // Catch:{ Exception -> 0x0185 }
            if (r13 == 0) goto L_0x006e
            r2 = 3
            r13.f23278l = r2     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.n0 r3 = com.appodeal.ads.C9409q4.m27875k()     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r2 = r11.f22929a     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.modules.common.internal.adtype.AdType r4 = r2.f24288f     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.f5 r2 = r13.f23269c     // Catch:{ Exception -> 0x0185 }
            double r5 = r2.getEcpm()     // Catch:{ Exception -> 0x0185 }
            java.lang.String r7 = r13.f23270d     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.f5 r2 = r13.f23269c     // Catch:{ Exception -> 0x0185 }
            java.lang.String r8 = r2.getAdUnitName()     // Catch:{ Exception -> 0x0185 }
            r9 = 0
            int r10 = r15.getCode()     // Catch:{ Exception -> 0x0185 }
            r3.mo60326a(r4, r5, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.utils.ExchangeAd r2 = r13.f23275i     // Catch:{ Exception -> 0x0185 }
            if (r2 == 0) goto L_0x0067
            com.appodeal.ads.networking.LoadingError r3 = com.appodeal.ads.networking.LoadingError.TimeoutError     // Catch:{ Exception -> 0x0185 }
            if (r15 != r3) goto L_0x0067
            r3 = 1005(0x3ed, float:1.408E-42)
            r2.trackError(r3)     // Catch:{ Exception -> 0x0185 }
        L_0x0067:
            UnifiedAdType r2 = r13.f23272f     // Catch:{ Exception -> 0x0185 }
            if (r2 == 0) goto L_0x006e
            r2.onError(r15)     // Catch:{ Exception -> 0x0185 }
        L_0x006e:
            if (r14 == 0) goto L_0x0089
            com.appodeal.ads.e0 r2 = r14.getRequestResult()     // Catch:{ Exception -> 0x0185 }
            if (r2 != 0) goto L_0x0089
            if (r15 == 0) goto L_0x007d
            com.appodeal.ads.e0 r2 = r15.getRequestResult()     // Catch:{ Exception -> 0x0185 }
            goto L_0x007f
        L_0x007d:
            com.appodeal.ads.e0 r2 = com.appodeal.ads.C9173e0.Exception     // Catch:{ Exception -> 0x0185 }
        L_0x007f:
            r14.mo59874a((com.appodeal.ads.C9173e0) r2)     // Catch:{ Exception -> 0x0185 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0185 }
            r14.mo59898a(r2)     // Catch:{ Exception -> 0x0185 }
        L_0x0089:
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r14 = r11.f22929a     // Catch:{ Exception -> 0x0185 }
            AdRequestType r14 = r14.f24306x     // Catch:{ Exception -> 0x0185 }
            r2 = 0
            if (r14 == 0) goto L_0x0094
            if (r14 != r12) goto L_0x0094
            r14 = 1
            goto L_0x0095
        L_0x0094:
            r14 = 0
        L_0x0095:
            if (r14 == 0) goto L_0x017e
            java.util.concurrent.CopyOnWriteArrayList r14 = r12.f23890e     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.isEmpty()     // Catch:{ Exception -> 0x0185 }
            r14 = r14 ^ r1
            if (r14 == 0) goto L_0x00be
            if (r13 == 0) goto L_0x00bd
            com.appodeal.ads.f5 r14 = r13.f23269c     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.isAsync()     // Catch:{ Exception -> 0x0185 }
            if (r14 != 0) goto L_0x00bd
            int r14 = r12.mo60592a()     // Catch:{ Exception -> 0x0185 }
            if (r14 <= 0) goto L_0x00bd
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r14 = r11.f22929a     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.f5 r15 = r13.f23269c     // Catch:{ Exception -> 0x0185 }
            boolean r15 = r15.isPrecache()     // Catch:{ Exception -> 0x0185 }
            boolean r0 = r12.f23893h     // Catch:{ Exception -> 0x0185 }
            r14.mo60832a(r12, (int) r2, (boolean) r15, (boolean) r0)     // Catch:{ Exception -> 0x0185 }
        L_0x00bd:
            return
        L_0x00be:
            if (r13 == 0) goto L_0x010e
            com.appodeal.ads.f5 r14 = r13.f23269c     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.isPrecache()     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x010e
            if (r0 != 0) goto L_0x0178
            java.util.ArrayList r14 = r12.f23887b     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.isEmpty()     // Catch:{ Exception -> 0x0185 }
            r14 = r14 ^ r1
            if (r14 == 0) goto L_0x00da
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r14 = r11.f22929a     // Catch:{ Exception -> 0x0185 }
            r14.mo60832a(r12, (int) r2, (boolean) r1, (boolean) r2)     // Catch:{ Exception -> 0x0185 }
            goto L_0x0178
        L_0x00da:
            java.util.ArrayList r14 = r12.f23886a     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.isEmpty()     // Catch:{ Exception -> 0x0185 }
            r14 = r14 ^ r1
            if (r14 == 0) goto L_0x00e5
            goto L_0x0162
        L_0x00e5:
            r11.mo59859o(r12, r13)     // Catch:{ Exception -> 0x0185 }
            r12.mo60605a((boolean) r2, (boolean) r2)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.r<AdObjectType> r14 = r12.f23884H     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x00f0
            return
        L_0x00f0:
            r11.mo59852i(r12, r13)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.w r14 = new com.appodeal.ads.w     // Catch:{ Exception -> 0x0185 }
            r14.<init>(r11, r12, r13, r15)     // Catch:{ Exception -> 0x0185 }
            android.os.Handler r15 = com.appodeal.ads.C9212h5.f23153a     // Catch:{ Exception -> 0x0185 }
            r15.post(r14)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r14 = r11.f22929a     // Catch:{ Exception -> 0x0185 }
            int r0 = r14.f24280B     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.mo60582k()     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x0178
            com.appodeal.ads.x r14 = new com.appodeal.ads.x     // Catch:{ Exception -> 0x0185 }
            r14.<init>(r11)     // Catch:{ Exception -> 0x0185 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0185 }
            goto L_0x015c
        L_0x010e:
            java.util.ArrayList r14 = r12.f23886a     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.isEmpty()     // Catch:{ Exception -> 0x0185 }
            r14 = r14 ^ r1
            if (r14 != 0) goto L_0x0160
            r12.mo60605a((boolean) r2, (boolean) r2)     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r11.mo59860q(r12, r13)     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x0123
            r11.mo59859o(r12, r13)     // Catch:{ Exception -> 0x0185 }
        L_0x0123:
            AdObjectType r14 = r12.f23904s     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x012b
            r11.mo59839a(r12, r14, (boolean) r2)     // Catch:{ Exception -> 0x0185 }
            goto L_0x0178
        L_0x012b:
            com.appodeal.ads.r<AdObjectType> r14 = r12.f23884H     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x0130
            return
        L_0x0130:
            r11.mo59852i(r12, r13)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.w r14 = new com.appodeal.ads.w     // Catch:{ Exception -> 0x0185 }
            r14.<init>(r11, r12, r13, r15)     // Catch:{ Exception -> 0x0185 }
            android.os.Handler r15 = com.appodeal.ads.C9212h5.f23153a     // Catch:{ Exception -> 0x0185 }
            r15.post(r14)     // Catch:{ Exception -> 0x0185 }
            if (r0 != 0) goto L_0x0178
            boolean r14 = r11.mo59250a(r12, r13)     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x0148
            r14 = 30000(0x7530, float:4.2039E-41)
            goto L_0x014c
        L_0x0148:
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r14 = r11.f22929a     // Catch:{ Exception -> 0x0185 }
            int r14 = r14.f24280B     // Catch:{ Exception -> 0x0185 }
        L_0x014c:
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r0 = r11.f22929a     // Catch:{ Exception -> 0x0185 }
            boolean r0 = r0.mo60582k()     // Catch:{ Exception -> 0x0185 }
            if (r0 == 0) goto L_0x0178
            com.appodeal.ads.x r0 = new com.appodeal.ads.x     // Catch:{ Exception -> 0x0185 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0185 }
            long r1 = (long) r14     // Catch:{ Exception -> 0x0185 }
            r14 = r0
            r0 = r1
        L_0x015c:
            r15.postDelayed(r14, r0)     // Catch:{ Exception -> 0x0185 }
            goto L_0x0178
        L_0x0160:
            if (r0 != 0) goto L_0x0166
        L_0x0162:
            r11.mo59843b(r12)     // Catch:{ Exception -> 0x0185 }
            goto L_0x0178
        L_0x0166:
            com.appodeal.ads.r<AdObjectType> r14 = r12.f23884H     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x016b
            return
        L_0x016b:
            r11.mo59852i(r12, r13)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.w r14 = new com.appodeal.ads.w     // Catch:{ Exception -> 0x0185 }
            r14.<init>(r11, r12, r13, r15)     // Catch:{ Exception -> 0x0185 }
            android.os.Handler r15 = com.appodeal.ads.C9212h5.f23153a     // Catch:{ Exception -> 0x0185 }
            r15.post(r14)     // Catch:{ Exception -> 0x0185 }
        L_0x0178:
            if (r13 == 0) goto L_0x018f
            r13.mo60107k()     // Catch:{ Exception -> 0x0185 }
            goto L_0x018f
        L_0x017e:
            r12.mo60605a((boolean) r2, (boolean) r2)     // Catch:{ Exception -> 0x0185 }
            r11.mo59859o(r12, r13)     // Catch:{ Exception -> 0x0185 }
            return
        L_0x0185:
            r14 = move-exception
            com.appodeal.ads.utils.Log.log(r14)
            com.appodeal.ads.networking.LoadingError r14 = com.appodeal.ads.networking.LoadingError.InternalError
            r15 = 0
            r11.mo59845b(r12, r13, r15, r14)
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9128b0.mo59835a(com.appodeal.ads.r, com.appodeal.ads.l, com.appodeal.ads.f5, com.appodeal.ads.networking.LoadingError):void");
    }

    /* renamed from: a */
    public final void mo59838a(AdRequestType adrequesttype, AdObjectType adobjecttype, LoadingError loadingError) {
        C9191f5 f5Var = adobjecttype != null ? adobjecttype.f23269c : null;
        if (loadingError == null) {
            loadingError = LoadingError.NoFill;
        }
        mo59835a(adrequesttype, adobjecttype, f5Var, loadingError);
    }
}
