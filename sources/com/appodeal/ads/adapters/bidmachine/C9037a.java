package com.appodeal.ads.adapters.bidmachine;

import android.content.Context;
import com.appodeal.ads.ApdService;
import com.appodeal.ads.ApdServiceInitParams;
import com.appodeal.ads.ApdServiceInitializationListener;
import com.appodeal.ads.AppodealNetworks;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.bidmachine.C9039b;
import com.appodeal.ads.networking.LoadingError;
import p150io.bidmachine.BidMachine;

/* renamed from: com.appodeal.ads.adapters.bidmachine.a */
/* compiled from: ApdBidMachineService */
public final class C9037a extends ApdService {

    /* renamed from: com.appodeal.ads.adapters.bidmachine.a$a */
    /* compiled from: ApdBidMachineService */
    public class C9038a implements C9039b.C9040a {

        /* renamed from: a */
        public final /* synthetic */ ApdServiceInitializationListener f22843a;

        public C9038a(ApdServiceInitializationListener apdServiceInitializationListener) {
            this.f22843a = apdServiceInitializationListener;
        }

        public final void onInitializationFailed(LoadingError loadingError) {
            this.f22843a.onInitializationFailed(loadingError);
        }

        public final void onInitializationFinished() {
            this.f22843a.onInitializationFinished();
        }
    }

    public C9037a() {
        super(AppodealNetworks.BIDMACHINE, BuildConfig.ADAPTER_VERSION);
    }

    public final void onInitialize(Context context, ApdServiceInitParams apdServiceInitParams, ApdServiceInitializationListener apdServiceInitializationListener) throws Throwable {
        if (apdServiceInitParams.getJsonData() == null) {
            apdServiceInitializationListener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        C9039b.m27133a().mo59420a(context, apdServiceInitParams.getJsonData(), apdServiceInitParams, new C9038a(apdServiceInitializationListener));
    }

    public final void setLogging(boolean z) {
        BidMachine.setLoggingEnabled(z);
    }
}
