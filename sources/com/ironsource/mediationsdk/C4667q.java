package com.ironsource.mediationsdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C4650e;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4533d;
import com.ironsource.mediationsdk.sdk.C4672b;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.q */
public final class C4667q implements C4672b {

    /* renamed from: a */
    C4668r f11689a;

    /* renamed from: b */
    IronSourceBannerLayout f11690b;

    /* renamed from: c */
    ConcurrentHashMap<String, C4668r> f11691c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private C4668r f11692d;

    public C4667q(List<NetworkSettings> list, C4650e eVar, String str, String str2) {
        for (NetworkSettings next : list) {
            if (next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a = C4616d.m13502a().mo33892a(next, next.getBannerSettings(), true, false);
                if (a != null) {
                    this.f11691c.put(next.getSubProviderId(), new C4668r(str, str2, next, this, (int) eVar.f11603b, a));
                }
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("cannot load " + next.getProviderTypeForReflection());
            }
        }
    }

    /* renamed from: a */
    static void m13657a(int i, C4668r rVar, Object[][] objArr) {
        Map<String, Object> c = rVar.mo34070c();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.getMessage());
            }
        }
        C4533d.m13173e().mo33649b(new C4532c(i, new JSONObject(c)));
    }

    /* renamed from: a */
    static void m13658a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        hashMap.put("spId", str);
        C4533d.m13173e().mo33649b(new C4532c(i, new JSONObject(hashMap)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34058a(int i, C4668r rVar) {
        m13657a(i, rVar, (Object[][]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo34059a(com.ironsource.mediationsdk.IronSourceBannerLayout r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x005c }
            java.lang.String r1 = "demand only banner manager : destroyBanner"
            r0.verbose(r1)     // Catch:{ all -> 0x005c }
            if (r4 != 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "destroyBanner banner cannot be null"
            r4.error(r0)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x0013:
            boolean r0 = r4.isDestroyed()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0022
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API"
            r4.error(r0)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x0022:
            r4.mo33419b()     // Catch:{ all -> 0x005c }
            r4 = 0
            r3.f11690b = r4     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.r r0 = r3.f11692d     // Catch:{ all -> 0x005c }
            r1 = 3305(0xce9, float:4.631E-42)
            if (r0 == 0) goto L_0x0043
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "demand only banner manager : destroyBanner | mActiveSmash != null "
            r0.verbose(r2)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.r r0 = r3.f11692d     // Catch:{ all -> 0x005c }
            m13657a((int) r1, (com.ironsource.mediationsdk.C4668r) r0, (java.lang.Object[][]) r4)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.r r0 = r3.f11692d     // Catch:{ all -> 0x005c }
            r0.mo34067a()     // Catch:{ all -> 0x005c }
            r3.f11692d = r4     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x0043:
            com.ironsource.mediationsdk.r r0 = r3.f11689a     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x005a
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "demand only banner manager : destroyBanner | mLoadingSmash != null "
            r0.verbose(r2)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.r r0 = r3.f11689a     // Catch:{ all -> 0x005c }
            m13657a((int) r1, (com.ironsource.mediationsdk.C4668r) r0, (java.lang.Object[][]) r4)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.r r0 = r3.f11689a     // Catch:{ all -> 0x005c }
            r0.mo34067a()     // Catch:{ all -> 0x005c }
            r3.f11689a = r4     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r3)
            return
        L_0x005c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4667q.mo34059a(com.ironsource.mediationsdk.IronSourceBannerLayout):void");
    }

    /* renamed from: a */
    public final void mo34060a(IronSourceError ironSourceError, C4668r rVar, boolean z, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + rVar.mo34069b());
        if (z) {
            m13657a((int) IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, rVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            m13657a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, rVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        IronSourceBannerLayout ironSourceBannerLayout = this.f11690b;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            this.f11690b.mo33417a(ironSourceError);
        }
    }

    /* renamed from: a */
    public final void mo34061a(C4668r rVar) {
        IronLog.INTERNAL.verbose(rVar.mo34069b());
        m13657a((int) IronSourceConstants.BN_INSTANCE_CLICK, rVar, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.f11690b;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.mo33420c();
        }
    }

    /* renamed from: a */
    public final void mo34062a(C4668r rVar, View view, FrameLayout.LayoutParams layoutParams) {
        C4668r rVar2 = rVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + rVar.mo34069b());
        IronSourceBannerLayout ironSourceBannerLayout = this.f11690b;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            mo34058a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, rVar2);
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayout2 = this.f11690b;
        if (ironSourceBannerLayout2 != null) {
            ironSourceBannerLayout2.mo33416a(view, layoutParams);
        }
        this.f11692d = rVar2;
        int b = C4731o.m13872a().mo34207b(3);
        m13657a(3005, rVar2, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b)}});
        m13657a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, rVar2, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b)}});
        C4731o.m13872a().mo34205a(3);
        if (rVar.mo34225i()) {
            for (String a : rVar2.f12006g) {
                C4619f.m13526a();
                String a2 = C4619f.m13528a(a, rVar.mo34220d(), rVar.mo34221e(), rVar2.f12007h, "", "", "", "");
                C4619f.m13526a();
                C4619f.m13531a("onBannerAdLoaded", rVar.mo34220d(), a2);
            }
        }
        IronSourceBannerLayout ironSourceBannerLayout3 = this.f11690b;
        if (ironSourceBannerLayout3 != null) {
            ironSourceBannerLayout3.mo33418a(String.format("%s %s", new Object[]{rVar.mo34069b(), Integer.valueOf(rVar.hashCode())}));
        }
    }

    /* renamed from: b */
    public final void mo34063b(C4668r rVar) {
        IronLog.INTERNAL.verbose(rVar.mo34069b());
        m13657a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, rVar, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.f11690b;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.mo33422e();
        }
    }

    /* renamed from: c */
    public final void mo34064c(C4668r rVar) {
        IronLog.INTERNAL.verbose(rVar.mo34069b());
        m13657a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, rVar, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.f11690b;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.mo33421d();
        }
    }

    /* renamed from: d */
    public final void mo34065d(C4668r rVar) {
        IronLog.INTERNAL.verbose(rVar.mo34069b());
        m13657a((int) IronSourceConstants.BN_INSTANCE_LEFT_APPLICATION, rVar, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.f11690b;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.mo33423f();
        }
    }

    /* renamed from: e */
    public final void mo34066e(C4668r rVar) {
        IronLog.INTERNAL.verbose(rVar.mo34069b());
        m13657a((int) IronSourceConstants.BN_INSTANCE_SHOW, rVar, (Object[][]) null);
        m13658a((int) IronSourceConstants.BN_CALLBACK_SHOW, "");
    }
}
