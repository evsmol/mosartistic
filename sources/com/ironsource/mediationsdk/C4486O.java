package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4655j;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4537h;
import com.ironsource.mediationsdk.sdk.C4676f;
import com.ironsource.mediationsdk.sdk.C4702j;
import com.ironsource.mediationsdk.utils.C4726l;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.O */
final class C4486O implements C4676f {

    /* renamed from: a */
    C4702j f10830a;

    /* renamed from: b */
    C4676f f10831b;

    /* renamed from: c */
    private final String f10832c = getClass().getName();

    /* renamed from: d */
    private IronSourceLoggerManager f10833d = IronSourceLoggerManager.getLogger();

    /* renamed from: e */
    private AtomicBoolean f10834e = new AtomicBoolean(true);

    /* renamed from: f */
    private AtomicBoolean f10835f = new AtomicBoolean(false);

    /* renamed from: g */
    private C4726l f10836g;

    /* renamed from: h */
    private NetworkSettings f10837h;

    /* renamed from: i */
    private String f10838i;

    C4486O() {
    }

    /* renamed from: a */
    private synchronized void m12879a(IronSourceError ironSourceError) {
        if (this.f10835f != null) {
            this.f10835f.set(false);
        }
        if (this.f10834e != null) {
            this.f10834e.set(true);
        }
        if (this.f10831b != null) {
            this.f10831b.mo33514a(false, ironSourceError);
        }
    }

    /* renamed from: b */
    private AbstractAdapter m12880b(String str) {
        try {
            C4455H a = C4455H.m12683a();
            AbstractAdapter b = a.mo33351b(str);
            if (b == null) {
                Class<?> cls = Class.forName("com.ironsource.adapters." + str.toLowerCase(Locale.ENGLISH) + "." + str + "Adapter");
                b = (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, new Class[]{String.class}).invoke(cls, new Object[]{str});
                if (b == null) {
                    return null;
                }
            }
            a.mo33345a(b);
            return b;
        } catch (Throwable th) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f10833d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str + " initialization failed - please verify that required dependencies are in you build path.", 2);
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f10833d;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager2.logException(ironSourceTag2, this.f10832c + ":startOfferwallAdapter", th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo33512a(String str) {
        String str2 = "OWManager:showOfferwall(" + str + ")";
        try {
            if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
                this.f10831b.onOfferwallShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            this.f10838i = str;
            C4655j a = this.f10836g.f11953c.f11612c.mo34032a(str);
            if (a == null) {
                this.f10833d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a = this.f10836g.f11953c.f11612c.mo34031a();
                if (a == null) {
                    this.f10833d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f10833d.log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 1);
            if (this.f10835f != null && this.f10835f.get() && this.f10830a != null) {
                this.f10830a.showOfferwall(String.valueOf(a.f11629a), this.f10837h.getRewardedVideoSettings());
            }
        } catch (Exception e) {
            this.f10833d.logException(IronSourceLogger.IronSourceTag.INTERNAL, str2, e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067 A[SYNTHETIC, Splitter:B:18:0x0067] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33513a(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.f10833d     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00fc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r2.<init>()     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = r7.f10832c     // Catch:{ all -> 0x00fc }
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = ":initOfferwall(appKey: "
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            r2.append(r8)     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = ", userId: "
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            r2.append(r9)     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00fc }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.H r0 = com.ironsource.mediationsdk.C4455H.m12683a()     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.utils.l r0 = r0.f10651i     // Catch:{ all -> 0x00fc }
            r7.f10836g = r0     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x0054
            com.ironsource.mediationsdk.model.g r1 = r0.f11953c     // Catch:{ all -> 0x00fc }
            if (r1 == 0) goto L_0x0054
            com.ironsource.mediationsdk.model.g r1 = r0.f11953c     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.i r1 = r1.f11612c     // Catch:{ all -> 0x00fc }
            if (r1 == 0) goto L_0x0054
            com.ironsource.mediationsdk.model.g r1 = r0.f11953c     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.i r1 = r1.f11612c     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r1.mo34033b()     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x004b
            goto L_0x0054
        L_0x004b:
            com.ironsource.mediationsdk.model.g r0 = r0.f11953c     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.i r0 = r0.f11612c     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = r0.mo34033b()     // Catch:{ all -> 0x00fc }
            goto L_0x0056
        L_0x0054:
            java.lang.String r0 = "SupersonicAds"
        L_0x0056:
            com.ironsource.mediationsdk.utils.l r1 = r7.f10836g     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x0067
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00fc }
            r7.m12879a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00fc }
            monitor-exit(r7)
            return
        L_0x0067:
            com.ironsource.mediationsdk.utils.l r1 = r7.f10836g     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.n r1 = r1.f11929b     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r1.mo34039a((java.lang.String) r0)     // Catch:{ all -> 0x00fc }
            r7.f10837h = r1     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x0080
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00fc }
            r7.m12879a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00fc }
            monitor-exit(r7)
            return
        L_0x0080:
            com.ironsource.mediationsdk.AbstractAdapter r0 = r7.m12880b(r0)     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x0093
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00fc }
            r7.m12879a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00fc }
            monitor-exit(r7)
            return
        L_0x0093:
            com.ironsource.mediationsdk.H r1 = com.ironsource.mediationsdk.C4455H.m12683a()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r1 = r1.f10654l     // Catch:{ Exception -> 0x00c8 }
            if (r1 == 0) goto L_0x009e
            r0.setMediationSegment(r1)     // Catch:{ Exception -> 0x00c8 }
        L_0x009e:
            com.ironsource.mediationsdk.H r1 = com.ironsource.mediationsdk.C4455H.m12683a()     // Catch:{ Exception -> 0x00c8 }
            java.lang.Boolean r1 = r1.f10667y     // Catch:{ Exception -> 0x00c8 }
            if (r1 == 0) goto L_0x00e3
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.f10833d     // Catch:{ Exception -> 0x00c8 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API     // Catch:{ Exception -> 0x00c8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r6 = "Offerwall | setConsent(consent:"
            r5.<init>(r6)     // Catch:{ Exception -> 0x00c8 }
            r5.append(r1)     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00c8 }
            r2.log(r4, r5, r3)     // Catch:{ Exception -> 0x00c8 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x00c8 }
            r0.setConsent(r1)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00e3
        L_0x00c8:
            r1 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.f10833d     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00fc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = ":setCustomParams():"
            r4.<init>(r5)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fc }
            r4.append(r1)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00fc }
            r4 = 3
            r2.log(r3, r1, r4)     // Catch:{ all -> 0x00fc }
        L_0x00e3:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r7.f10833d     // Catch:{ all -> 0x00fc }
            r0.setLogListener(r1)     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.sdk.j r0 = (com.ironsource.mediationsdk.sdk.C4702j) r0     // Catch:{ all -> 0x00fc }
            r7.f10830a = r0     // Catch:{ all -> 0x00fc }
            r0.setInternalOfferwallListener(r7)     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.sdk.j r0 = r7.f10830a     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r7.f10837h     // Catch:{ all -> 0x00fc }
            org.json.JSONObject r1 = r1.getRewardedVideoSettings()     // Catch:{ all -> 0x00fc }
            r0.initOfferwall(r8, r9, r1)     // Catch:{ all -> 0x00fc }
            monitor-exit(r7)
            return
        L_0x00fc:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4486O.mo33513a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo33514a(boolean z, IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f10833d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallAvailable(isAvailable: " + z + ")", 1);
        if (z) {
            this.f10835f.set(true);
            C4676f fVar = this.f10831b;
            if (fVar != null) {
                fVar.onOfferwallAvailable(true);
                return;
            }
            return;
        }
        m12879a(ironSourceError);
    }

    /* renamed from: a */
    public final synchronized boolean mo33515a() {
        boolean z;
        z = false;
        if (this.f10835f != null) {
            z = this.f10835f.get();
        }
        return z;
    }

    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f10833d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        C4676f fVar = this.f10831b;
        if (fVar != null) {
            fVar.onGetOfferwallCreditsFailed(ironSourceError);
        }
    }

    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        this.f10833d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAdCredited()", 1);
        C4676f fVar = this.f10831b;
        if (fVar != null) {
            return fVar.onOfferwallAdCredited(i, i2, z);
        }
        return false;
    }

    public final void onOfferwallAvailable(boolean z) {
        mo33514a(z, (IronSourceError) null);
    }

    public final void onOfferwallClosed() {
        this.f10833d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallClosed()", 1);
        C4676f fVar = this.f10831b;
        if (fVar != null) {
            fVar.onOfferwallClosed();
        }
    }

    public final void onOfferwallOpened() {
        this.f10833d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallOpened()", 1);
        int b = C4731o.m13872a().mo34207b(0);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (!TextUtils.isEmpty(this.f10838i)) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f10838i);
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C4537h.m13193e().mo33649b(new C4532c(IronSourceConstants.OFFERWALL_OPENED, mediationAdditionalData));
        C4731o.m13872a().mo34205a(0);
        C4676f fVar = this.f10831b;
        if (fVar != null) {
            fVar.onOfferwallOpened();
        }
    }

    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f10833d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        C4676f fVar = this.f10831b;
        if (fVar != null) {
            fVar.onOfferwallShowFailed(ironSourceError);
        }
    }
}
