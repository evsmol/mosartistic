package com.ironsource.mediationsdk.adunit.p132d.p133a;

import com.ironsource.mediationsdk.C4455H;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.p129c.p130a.C4574c;
import com.ironsource.mediationsdk.adunit.p132d.C4588a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C4646a;
import com.ironsource.mediationsdk.utils.C4718f;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.d.a.b */
public class C4590b<Listener extends C4574c> extends C4589a<Listener> implements AdapterAdRewardListener {

    /* renamed from: g */
    private C4718f f11319g;

    public C4590b(C4588a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, C4646a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
    }

    public void onAdClosed() {
        this.f11319g = new C4718f();
        super.onAdClosed();
    }

    public void onAdOpened() {
        this.f11319g = null;
        super.onAdOpened();
    }

    public void onAdRewarded() {
        if (this.f11324e != null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(mo33838c("placement name = " + mo33851q()));
            if (this.f11322c != null) {
                HashMap hashMap = new HashMap();
                if (C4455H.m12683a().f10656n != null) {
                    for (String next : C4455H.m12683a().f10656n.keySet()) {
                        hashMap.put("custom_" + next, C4455H.m12683a().f10656n.get(next));
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                this.f11322c.f11236d.mo33743a(mo33851q(), this.f11324e.getRewardName(), this.f11324e.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, mo33612k()), C4718f.m13801a(this.f11319g), hashMap, C4455H.m12683a().f10655m);
            }
            ((C4574c) this.f11321b).mo33803a(this, this.f11324e);
            return;
        }
        IronLog.INTERNAL.verbose(mo33838c("placement is null "));
        if (this.f11322c != null) {
            this.f11322c.f11237e.mo33788l("mCurrentPlacement is null");
        }
    }
}
