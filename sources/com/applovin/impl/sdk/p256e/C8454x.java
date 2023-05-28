package com.applovin.impl.sdk.p256e;

import com.applovin.impl.p233b.C8037e;
import com.applovin.impl.p233b.C8038f;
import com.applovin.impl.p233b.C8046m;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* renamed from: com.applovin.impl.sdk.e.x */
class C8454x extends C8401a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8037e f21232a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AppLovinAdLoadListener f21233e;

    C8454x(C8037e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
        super("TaskResolveVastWrapper", nVar);
        this.f21233e = appLovinAdLoadListener;
        this.f21232a = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25477a(int i) {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57822e(str, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f21233e;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        C8046m.m23955a(this.f21232a, this.f21233e, i == -1001 ? C8038f.TIMED_OUT : C8038f.GENERAL_WRAPPER_ERROR, i, this.f21118b);
    }

    public void run() {
        String a = C8046m.m23951a(this.f21232a);
        if (StringUtils.isValidString(a)) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21120d;
                String str = this.f21119c;
                vVar2.mo57818b(str, "Resolving VAST ad with depth " + this.f21232a.mo55894a() + " at " + a);
            }
            try {
                this.f21118b.mo57337V().mo57227a((C8401a) new C8449u<C8622s>(C8516c.m25763a(this.f21118b).mo57528a(a).mo57534b("GET").mo57527a(C8622s.f21773a).mo57526a(((Integer) this.f21118b.mo57342a(C8380b.f20956ew)).intValue()).mo57533b(((Integer) this.f21118b.mo57342a(C8380b.f20957ex)).intValue()).mo57539c(false).mo57532a(), this.f21118b) {
                    /* renamed from: a */
                    public void mo56275a(int i, String str, C8622s sVar) {
                        C8626v vVar = this.f21120d;
                        if (C8626v.m26252a()) {
                            C8626v vVar2 = this.f21120d;
                            String str2 = this.f21119c;
                            vVar2.mo57822e(str2, "Unable to resolve VAST wrapper. Server returned " + i);
                        }
                        C8454x.this.m25477a(i);
                    }

                    /* renamed from: a */
                    public void mo56277a(C8622s sVar, int i) {
                        this.f21118b.mo57337V().mo57227a((C8401a) C8442r.m25441a(sVar, C8454x.this.f21232a, C8454x.this.f21233e, C8454x.this.f21118b));
                    }
                });
            } catch (Throwable th) {
                C8626v vVar3 = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57819b(this.f21119c, "Unable to resolve VAST wrapper", th);
                }
            }
        } else {
            C8626v vVar4 = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57822e(this.f21119c, "Resolving VAST failed. Could not find resolution URL");
            }
            m25477a(-1);
        }
    }
}
