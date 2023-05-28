package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.n */
public final class C4660n {

    /* renamed from: b */
    private static C4660n f11655b;

    /* renamed from: a */
    private ArrayList<NetworkSettings> f11656a = new ArrayList<>();

    private C4660n() {
    }

    /* renamed from: a */
    public static synchronized C4660n m13636a() {
        C4660n nVar;
        synchronized (C4660n.class) {
            if (f11655b == null) {
                f11655b = new C4660n();
            }
            nVar = f11655b;
        }
        return nVar;
    }

    /* renamed from: a */
    public final NetworkSettings mo34039a(String str) {
        Iterator<NetworkSettings> it = this.f11656a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.getProviderName().equals(str)) {
                return next;
            }
        }
        NetworkSettings networkSettings = new NetworkSettings(str);
        mo34040a(networkSettings);
        return networkSettings;
    }

    /* renamed from: a */
    public final void mo34040a(NetworkSettings networkSettings) {
        this.f11656a.add(networkSettings);
    }

    /* renamed from: b */
    public final void mo34041b() {
        Iterator<NetworkSettings> it = this.f11656a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.isMultipleInstances() && !TextUtils.isEmpty(next.getProviderTypeForReflection())) {
                NetworkSettings a = mo34039a(next.getProviderDefaultInstance());
                next.setApplicationSettings(IronSourceUtils.mergeJsons(next.getApplicationSettings(), a.getApplicationSettings()));
                next.setInterstitialSettings(IronSourceUtils.mergeJsons(next.getInterstitialSettings(), a.getInterstitialSettings()));
                next.setRewardedVideoSettings(IronSourceUtils.mergeJsons(next.getRewardedVideoSettings(), a.getRewardedVideoSettings()));
                next.setBannerSettings(IronSourceUtils.mergeJsons(next.getBannerSettings(), a.getBannerSettings()));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo34042b(String str) {
        Iterator<NetworkSettings> it = this.f11656a.iterator();
        while (it.hasNext()) {
            if (it.next().getProviderName().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
