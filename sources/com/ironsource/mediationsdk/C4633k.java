package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C4636l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4651f;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4533d;
import com.ironsource.mediationsdk.sdk.C4671a;
import com.ironsource.mediationsdk.utils.C4718f;
import com.ironsource.mediationsdk.utils.C4723k;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.k */
public final class C4633k implements C4671a {

    /* renamed from: a */
    private C4636l f11508a;

    /* renamed from: b */
    private IronSourceBannerLayout f11509b;

    /* renamed from: c */
    private C4651f f11510c;

    /* renamed from: d */
    private C4635a f11511d = C4635a.NOT_INITIATED;

    /* renamed from: e */
    private IronSourceLoggerManager f11512e = IronSourceLoggerManager.getLogger();

    /* renamed from: f */
    private String f11513f;

    /* renamed from: g */
    private String f11514g;

    /* renamed from: h */
    private final CopyOnWriteArrayList<C4636l> f11515h = new CopyOnWriteArrayList<>();

    /* renamed from: i */
    private long f11516i;

    /* renamed from: j */
    private Timer f11517j;

    /* renamed from: k */
    private AtomicBoolean f11518k = new AtomicBoolean();

    /* renamed from: l */
    private AtomicBoolean f11519l = new AtomicBoolean();

    /* renamed from: m */
    private C4718f f11520m;

    /* renamed from: n */
    private C4718f f11521n;

    /* renamed from: o */
    private int f11522o;

    /* renamed from: p */
    private int f11523p;

    /* renamed from: com.ironsource.mediationsdk.k$a */
    enum C4635a {
        NOT_INITIATED,
        READY_TO_LOAD,
        FIRST_LOAD_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        RELOAD_IN_PROGRESS
    }

    public C4633k(List<NetworkSettings> list, String str, String str2, long j, int i, int i2) {
        this.f11513f = str;
        this.f11514g = str2;
        this.f11516i = (long) i;
        C4631j.m13569a().f11502a = i2;
        for (int i3 = 0; i3 < list.size(); i3++) {
            NetworkSettings networkSettings = list.get(i3);
            AbstractAdapter a = C4616d.m13502a().mo33892a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a == null || !C4618e.m13521a().mo33899a(a)) {
                m13581a(networkSettings.getProviderInstanceName() + " can't load adapter or wrong version");
            } else {
                this.f11515h.add(new C4636l(this, networkSettings, a, j, i3 + 1));
            }
        }
        this.f11510c = null;
        m13579a(C4635a.READY_TO_LOAD);
    }

    /* renamed from: a */
    private void m13573a(int i) {
        m13577a(i, (Object[][]) null);
    }

    /* renamed from: a */
    private void m13574a(int i, C4636l lVar) {
        m13575a(i, lVar, (Object[][]) null);
    }

    /* renamed from: a */
    private void m13575a(int i, C4636l lVar, Object[][] objArr) {
        m13576a(i, lVar, objArr, this.f11523p);
    }

    /* renamed from: a */
    private void m13576a(int i, C4636l lVar, Object[][] objArr, int i2) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(lVar);
        try {
            if (this.f11509b != null) {
                m13582a(providerAdditionalData, this.f11509b.getSize());
            }
            if (this.f11510c != null) {
                providerAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f11510c.getPlacementName());
            }
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.f11512e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
        C4533d.m13173e().mo33649b(new C4532c(i, providerAdditionalData));
    }

    /* renamed from: a */
    private void m13577a(int i, Object[][] objArr) {
        m13578a(i, objArr, this.f11523p);
    }

    /* renamed from: a */
    private void m13578a(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (this.f11509b != null) {
                m13582a(mediationAdditionalData, this.f11509b.getSize());
            }
            if (this.f11510c != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f11510c.getPlacementName());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.f11512e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendMediationEvent " + Log.getStackTraceString(e), 3);
        }
        C4533d.m13173e().mo33649b(new C4532c(i, mediationAdditionalData));
    }

    /* renamed from: a */
    private void m13579a(C4635a aVar) {
        this.f11511d = aVar;
        m13581a("state=" + aVar.name());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m13580a(com.ironsource.mediationsdk.C4633k r8) {
        /*
            com.ironsource.mediationsdk.k$a r0 = r8.f11511d
            com.ironsource.mediationsdk.k$a r1 = com.ironsource.mediationsdk.C4633k.C4635a.RELOAD_IN_PROGRESS
            if (r0 == r1) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onReloadTimer wrong state="
            r0.<init>(r1)
            com.ironsource.mediationsdk.k$a r1 = r8.f11511d
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.m13581a((java.lang.String) r0)
            return
        L_0x001e:
            r0 = 0
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r2 = "checking with IronsourceLifecycleManager if app in foreground"
            r1.verbose(r2)
            com.ironsource.lifecycle.d r1 = com.ironsource.lifecycle.C4421d.m12604a()
            boolean r1 = r1.mo33235b()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x00e1
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r8.f11509b
            java.lang.String r4 = "banner is null"
            if (r1 != 0) goto L_0x003f
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1.verbose(r4)
        L_0x003d:
            r1 = 0
            goto L_0x0078
        L_0x003f:
            boolean r1 = r1.isShown()
            if (r1 != 0) goto L_0x004d
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r5 = "banner or one of its parents are INVISIBLE or GONE"
        L_0x0049:
            r1.verbose(r5)
            goto L_0x003d
        L_0x004d:
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r8.f11509b
            boolean r1 = r1.hasWindowFocus()
            if (r1 != 0) goto L_0x005a
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r5 = "banner has no window focus"
            goto L_0x0049
        L_0x005a:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r8.f11509b
            boolean r1 = r5.getGlobalVisibleRect(r1)
            com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "visible = "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.verbose(r6)
        L_0x0078:
            if (r1 == 0) goto L_0x00de
            com.ironsource.mediationsdk.utils.o r1 = com.ironsource.mediationsdk.utils.C4731o.m13872a()
            r5 = 3
            int r1 = r1.mo34207b((int) r5)
            r8.f11523p = r1
            r1 = 3011(0xbc3, float:4.22E-42)
            r8.m13573a((int) r1)
            r1 = 3012(0xbc4, float:4.221E-42)
            com.ironsource.mediationsdk.l r5 = r8.f11508a
            r8.m13574a((int) r1, (com.ironsource.mediationsdk.C4636l) r5)
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f
            r1.<init>()
            r8.f11520m = r1
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f
            r1.<init>()
            r8.f11521n = r1
            com.ironsource.mediationsdk.l r1 = r8.f11508a
            java.lang.String r5 = "reloadBanner()"
            r1.mo33951a((java.lang.String) r5)
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f11535e
            if (r5 == 0) goto L_0x00c9
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f11535e
            boolean r5 = r5.isDestroyed()
            if (r5 == 0) goto L_0x00b3
            goto L_0x00c9
        L_0x00b3:
            r1.mo33952b()
            com.ironsource.mediationsdk.l$a r4 = com.ironsource.mediationsdk.C4636l.C4638a.LOADED
            r1.mo33950a((com.ironsource.mediationsdk.C4636l.C4638a) r4)
            com.ironsource.mediationsdk.AbstractAdapter r4 = r1.f11531a
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f11535e
            com.ironsource.mediationsdk.model.NetworkSettings r6 = r1.f11532b
            org.json.JSONObject r6 = r6.getBannerSettings()
            r4.reloadBanner(r5, r6, r1)
            goto L_0x00dc
        L_0x00c9:
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f11535e
            if (r5 != 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            java.lang.String r4 = "banner is destroyed"
        L_0x00d0:
            com.ironsource.mediationsdk.sdk.a r5 = r1.f11533c
            com.ironsource.mediationsdk.logger.IronSourceError r6 = new com.ironsource.mediationsdk.logger.IronSourceError
            r7 = 610(0x262, float:8.55E-43)
            r6.<init>(r7, r4)
            r5.mo33941a((com.ironsource.mediationsdk.logger.IronSourceError) r6, (com.ironsource.mediationsdk.C4636l) r1, (boolean) r3)
        L_0x00dc:
            r1 = 0
            goto L_0x00e4
        L_0x00de:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r0 = "app in background - start reload timer"
        L_0x00e3:
            r1 = 1
        L_0x00e4:
            if (r1 == 0) goto L_0x0106
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            r1[r3] = r4
            r8.m13577a((int) r0, (java.lang.Object[][]) r1)
            r8.m13588d()
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4633k.m13580a(com.ironsource.mediationsdk.k):void");
    }

    /* renamed from: a */
    private void m13581a(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11512e;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "BannerManager " + str, 0);
    }

    /* renamed from: a */
    private void m13582a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c == 4) {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f11512e;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
    }

    /* renamed from: a */
    private boolean m13583a() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f11509b;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: b */
    private void m13584b() {
        Iterator<C4636l> it = this.f11515h.iterator();
        while (it.hasNext()) {
            it.next().f11534d = true;
        }
    }

    /* renamed from: b */
    private void m13585b(C4636l lVar, View view, FrameLayout.LayoutParams layoutParams) {
        this.f11508a = lVar;
        this.f11509b.mo33416a(view, layoutParams);
    }

    /* renamed from: b */
    private void m13586b(C4636l lVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("bindView = " + z + " smash - " + lVar.mo33948a());
        m13575a((int) IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f11521n))}});
        m13577a((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f11520m))}});
        this.f11522o = C4731o.m13872a().mo34207b(3);
        C4731o.m13872a().mo34205a(3);
        if (z) {
            m13585b(lVar, view, layoutParams);
        }
        m13588d();
    }

    /* renamed from: c */
    private boolean m13587c() {
        Iterator<C4636l> it = this.f11515h.iterator();
        while (it.hasNext()) {
            C4636l next = it.next();
            if (next.f11534d && this.f11508a != next) {
                m13575a(this.f11511d == C4635a.FIRST_LOAD_IN_PROGRESS ? 3002 : IronSourceConstants.BN_INSTANCE_RELOAD, next, (Object[][]) null);
                this.f11521n = new C4718f();
                next.mo33949a(this.f11509b.mo33415a(), this.f11513f, this.f11514g);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m13588d() {
        try {
            m13589e();
            if (this.f11516i > 0) {
                Timer timer = new Timer();
                this.f11517j = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        C4633k.m13580a(C4633k.this);
                    }
                }, this.f11516i * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m13589e() {
        Timer timer = this.f11517j;
        if (timer != null) {
            timer.cancel();
            this.f11517j = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo33936a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout == null) {
            this.f11512e.log(IronSourceLogger.IronSourceTag.API, "destroyBanner banner cannot be null", 3);
        } else if (ironSourceBannerLayout.isDestroyed()) {
            this.f11512e.log(IronSourceLogger.IronSourceTag.API, "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API", 3);
        } else {
            m13578a((int) IronSourceConstants.BN_DESTROY, (Object[][]) null, this.f11522o);
            m13589e();
            if (this.f11508a != null) {
                m13575a((int) IronSourceConstants.BN_INSTANCE_DESTROY, this.f11508a, (Object[][]) null);
                C4636l lVar = this.f11508a;
                lVar.mo33951a("destroyBanner()");
                if (lVar.f11531a == null) {
                    lVar.mo33951a("destroyBanner() mAdapter == null");
                } else {
                    lVar.f11531a.destroyBanner(lVar.f11532b.getBannerSettings());
                    lVar.mo33950a(C4636l.C4638a.DESTROYED);
                }
                this.f11508a = null;
            }
            ironSourceBannerLayout.mo33419b();
            this.f11509b = null;
            this.f11510c = null;
            m13579a(C4635a.READY_TO_LOAD);
        }
    }

    /* renamed from: a */
    public final synchronized void mo33937a(IronSourceBannerLayout ironSourceBannerLayout, C4651f fVar) {
        if (ironSourceBannerLayout != null) {
            try {
                if (!ironSourceBannerLayout.isDestroyed()) {
                    if (fVar != null) {
                        if (!TextUtils.isEmpty(fVar.getPlacementName())) {
                            if (this.f11511d == C4635a.READY_TO_LOAD) {
                                if (!C4631j.m13569a().mo33934b()) {
                                    this.f11523p = C4731o.m13872a().mo34207b(3);
                                    m13579a(C4635a.FIRST_LOAD_IN_PROGRESS);
                                    this.f11509b = ironSourceBannerLayout;
                                    this.f11510c = fVar;
                                    m13577a(3001, (Object[][]) null);
                                    if (C4723k.m13837b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), fVar.getPlacementName())) {
                                        C4631j a = C4631j.m13569a();
                                        a.mo33932a(ironSourceBannerLayout, new IronSourceError(604, "placement " + fVar.getPlacementName() + " is capped"));
                                        m13577a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
                                        m13579a(C4635a.READY_TO_LOAD);
                                        return;
                                    }
                                    this.f11520m = new C4718f();
                                    Iterator<C4636l> it = this.f11515h.iterator();
                                    while (it.hasNext()) {
                                        it.next().f11534d = true;
                                    }
                                    this.f11521n = new C4718f();
                                    C4636l lVar = this.f11515h.get(0);
                                    m13575a(3002, lVar, (Object[][]) null);
                                    lVar.mo33949a(ironSourceBannerLayout.mo33415a(), this.f11513f, this.f11514g);
                                    return;
                                }
                            }
                            this.f11512e.log(IronSourceLogger.IronSourceTag.API, "A banner is already loaded", 3);
                            return;
                        }
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = fVar == null ? "placement is null" : "placement name is empty";
                    this.f11512e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr), 3);
                    return;
                }
            } catch (Exception e) {
                C4631j a2 = C4631j.m13569a();
                a2.mo33932a(ironSourceBannerLayout, new IronSourceError(605, "loadBanner() failed " + e.getMessage()));
                m13577a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 605}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
                m13579a(C4635a.READY_TO_LOAD);
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        this.f11512e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr2), 3);
    }

    /* renamed from: a */
    public final void mo33938a(C4636l lVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo33948a());
        if (m13583a()) {
            this.f11509b.mo33420c();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m13578a((int) IronSourceConstants.BN_CALLBACK_CLICK, objArr, this.f11522o);
        m13576a((int) IronSourceConstants.BN_INSTANCE_CLICK, lVar, objArr, this.f11522o);
    }

    /* renamed from: a */
    public final void mo33939a(C4636l lVar, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo33948a());
        if (this.f11511d == C4635a.FIRST_LOAD_IN_PROGRESS) {
            m13575a(3005, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f11521n))}});
            m13585b(lVar, view, layoutParams);
            C4651f fVar = this.f11510c;
            String placementName = fVar != null ? fVar.getPlacementName() : "";
            C4723k.m13843f(ContextProvider.getInstance().getCurrentActiveActivity(), placementName);
            if (C4723k.m13837b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), placementName)) {
                m13577a((int) IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            m13577a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f11520m))}});
            this.f11509b.mo33418a(lVar.mo33948a());
            this.f11522o = C4731o.m13872a().mo34207b(3);
            C4731o.m13872a().mo34205a(3);
            m13579a(C4635a.RELOAD_IN_PROGRESS);
            m13588d();
        } else if (this.f11511d == C4635a.LOAD_IN_PROGRESS) {
            m13579a(C4635a.RELOAD_IN_PROGRESS);
            m13586b(lVar, view, layoutParams, true);
        } else {
            m13575a((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, lVar, (Object[][]) null);
        }
    }

    /* renamed from: a */
    public final void mo33940a(C4636l lVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo33948a());
        if (this.f11511d != C4635a.RELOAD_IN_PROGRESS) {
            m13581a("onBannerAdReloaded " + lVar.mo33948a() + " wrong state=" + this.f11511d.name());
            m13575a((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, lVar, (Object[][]) null);
            return;
        }
        IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
        m13586b(lVar, view, layoutParams, z);
    }

    /* renamed from: a */
    public final void mo33941a(IronSourceError ironSourceError, C4636l lVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + lVar.mo33948a());
        if (this.f11511d == C4635a.FIRST_LOAD_IN_PROGRESS || this.f11511d == C4635a.LOAD_IN_PROGRESS) {
            if (z) {
                m13575a((int) IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f11521n))}});
            } else {
                m13575a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f11521n))}});
            }
            if (!m13587c()) {
                if (this.f11511d == C4635a.FIRST_LOAD_IN_PROGRESS) {
                    C4631j.m13569a().mo33932a(this.f11509b, new IronSourceError(606, "No ads to show"));
                    m13577a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f11520m))}});
                    m13579a(C4635a.READY_TO_LOAD);
                    return;
                }
                m13577a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f11520m))}});
                m13579a(C4635a.RELOAD_IN_PROGRESS);
                m13588d();
                return;
            }
            return;
        }
        m13581a("onBannerAdLoadFailed " + lVar.mo33948a() + " wrong state=" + this.f11511d.name());
    }

    /* renamed from: b */
    public final void mo33942b(C4636l lVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo33948a());
        if (m13583a()) {
            this.f11509b.mo33422e();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m13578a((int) IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, this.f11522o);
        m13576a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, lVar, objArr, this.f11522o);
    }

    /* renamed from: b */
    public final void mo33943b(IronSourceError ironSourceError, C4636l lVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + lVar.mo33948a());
        if (this.f11511d != C4635a.RELOAD_IN_PROGRESS) {
            m13581a("onBannerAdReloadFailed " + lVar.mo33948a() + " wrong state=" + this.f11511d.name());
            return;
        }
        if (z) {
            m13575a((int) IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f11521n))}});
        } else {
            m13575a((int) IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f11521n))}});
        }
        if (this.f11515h.size() == 1) {
            m13577a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f11520m))}});
            m13588d();
            return;
        }
        m13579a(C4635a.LOAD_IN_PROGRESS);
        m13584b();
        m13587c();
    }

    /* renamed from: c */
    public final void mo33944c(C4636l lVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo33948a());
        if (m13583a()) {
            this.f11509b.mo33421d();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m13578a((int) IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, this.f11522o);
        m13576a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, lVar, objArr, this.f11522o);
    }

    /* renamed from: d */
    public final void mo33945d(C4636l lVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo33948a());
        if (m13583a()) {
            this.f11509b.mo33423f();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m13578a((int) IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, this.f11522o);
        m13576a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, lVar, objArr, this.f11522o);
    }

    /* renamed from: e */
    public final void mo33946e(C4636l lVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.mo33948a());
        m13577a((int) IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
        m13575a((int) IronSourceConstants.BN_INSTANCE_SHOW, lVar, (Object[][]) null);
    }
}
