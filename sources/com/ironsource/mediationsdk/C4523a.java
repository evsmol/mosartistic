package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.C4716e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.a */
abstract class C4523a {

    /* renamed from: a */
    C4716e f11040a = null;

    /* renamed from: b */
    int f11041b;

    /* renamed from: c */
    final CopyOnWriteArrayList<C4605b> f11042c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    C4605b f11043d;

    /* renamed from: e */
    C4605b f11044e;

    /* renamed from: f */
    String f11045f;

    /* renamed from: g */
    String f11046g;

    /* renamed from: h */
    IronSourceLoggerManager f11047h = IronSourceLoggerManager.getLogger();

    /* renamed from: i */
    boolean f11048i = false;

    /* renamed from: j */
    Boolean f11049j;

    /* renamed from: k */
    boolean f11050k;

    /* renamed from: l */
    boolean f11051l = true;

    /* renamed from: m */
    private String f11052m = IronSourceConstants.EVENTS_ERROR_REASON;

    /* renamed from: n */
    private String f11053n = "status";

    /* renamed from: o */
    private String f11054o = IronSourceConstants.EVENTS_PLACEMENT_NAME;

    /* renamed from: p */
    private String f11055p = IronSourceConstants.EVENTS_REWARD_NAME;

    /* renamed from: q */
    private String f11056q = IronSourceConstants.EVENTS_REWARD_AMOUNT;

    /* renamed from: r */
    private String f11057r = "providerPriority";

    C4523a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo33301a(Context context, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33627a(C4605b bVar) {
        this.f11042c.add(bVar);
        C4716e eVar = this.f11040a;
        if (eVar != null) {
            synchronized (eVar) {
                try {
                    if (bVar.f11369m != 99) {
                        eVar.f11792a.put(eVar.mo34181d(bVar), Integer.valueOf(bVar.f11369m));
                    }
                } catch (Exception e) {
                    eVar.f11794c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "addSmash", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo33628a() {
        return this.f11051l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo33629b() {
        this.f11051l = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo33630b(C4605b bVar) {
        try {
            String str = C4455H.m12683a().f10654l;
            if (!TextUtils.isEmpty(str) && bVar.f11358b != null) {
                IronSourceLoggerManager ironSourceLoggerManager = bVar.f11373q;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                ironSourceLoggerManager.log(ironSourceTag, bVar.mo33867j() + ":setMediationSegment(segment:" + str + ")", 1);
                bVar.f11358b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                String pluginFrameworkVersion = ConfigFile.getConfigFile().getPluginFrameworkVersion();
                if (bVar.f11358b != null) {
                    bVar.f11358b.setPluginData(pluginType, pluginFrameworkVersion);
                }
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f11047h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager2.log(ironSourceTag2, ":setCustomParams():" + e.toString(), 3);
        }
    }
}
