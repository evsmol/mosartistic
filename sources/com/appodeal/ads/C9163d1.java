package com.appodeal.ads;

import android.app.Activity;
import com.appodeal.ads.C9139c1;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;

/* renamed from: com.appodeal.ads.d1 */
public final class C9163d1 extends AdNetwork<C9166b> {

    /* renamed from: com.appodeal.ads.d1$a */
    public class C9164a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ContextProvider f23003a;

        /* renamed from: b */
        public final /* synthetic */ C9420r f23004b;

        /* renamed from: c */
        public final /* synthetic */ C9577u f23005c;

        /* renamed from: d */
        public final /* synthetic */ NetworkInitializationListener f23006d;

        /* renamed from: com.appodeal.ads.d1$a$a */
        public class C9165a implements C9139c1.C9140a {
            public C9165a() {
            }
        }

        public C9164a(ContextProvider contextProvider, C9420r rVar, C9577u uVar, NetworkInitializationListener networkInitializationListener) {
            this.f23003a = contextProvider;
            this.f23004b = rVar;
            this.f23005c = uVar;
            this.f23006d = networkInitializationListener;
        }

        public final void run() {
            Activity value = this.f23003a.getTopActivityFlow().getValue();
            if (value != null) {
                C9139c1.m27230a(value, this.f23004b, new C9165a());
            } else {
                this.f23006d.onInitializationFailed(LoadingError.InternalError);
            }
        }
    }

    /* renamed from: com.appodeal.ads.d1$b */
    public static final class C9166b {
    }

    /* renamed from: com.appodeal.ads.d1$c */
    public static class C9167c extends AdNetworkBuilder {
        public final AdNetwork build() {
            return new C9163d1(this);
        }

        public final String getAdapterVersion() {
            return "1";
        }

        public final String getName() {
            return Constants.DEBUG_INTERSTITIAL;
        }
    }

    public C9163d1(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    public final String getVersion() {
        return "1";
    }

    public final void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<C9166b> networkInitializationListener) {
        C9577u uVar = null;
        C9420r rVar = adNetworkMediationParams instanceof C9202h ? ((C9202h) adNetworkMediationParams).f23134a : null;
        if (rVar == null) {
            networkInitializationListener.onInitializationFailed(LoadingError.AdTypeNotSupportedInAdapter);
            return;
        }
        if (rVar instanceof C9425r1) {
            uVar = C9378o1.m27718a();
        } else if (rVar instanceof C9683w0) {
            uVar = C9566t0.m28247a();
        } else if (rVar instanceof C9573t2) {
            uVar = Native.m27078a();
        } else if (rVar instanceof C9253k2) {
            uVar = C9205h2.m27336a();
        } else if (rVar instanceof C9419q5) {
            uVar = C9685w2.m28463a();
        } else if (rVar instanceof C9325n4) {
            uVar = C9384o4.m27742a();
        }
        if (uVar == null) {
            networkInitializationListener.onInitializationFailed(LoadingError.AdTypeNotSupportedInAdapter);
            return;
        }
        C9212h5.f23153a.post(new C9164a(contextProvider, rVar, uVar, networkInitializationListener));
        networkInitializationListener.onInitializationFinished(new C9166b());
    }

    public final void setLogging(boolean z) {
    }
}
