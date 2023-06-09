package com.appodeal.ads.modules.libs.network;

import android.content.Context;
import com.appodeal.ads.modules.libs.network.NetworkStateObserver;
import com.appodeal.ads.modules.libs.network.state.C9311a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\t\u0010\u0007\u001a\u00020\u0006H\u0001J\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0001J\u0011\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0001R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo38199d2 = {"Lcom/appodeal/ads/modules/libs/network/NetworkStatus;", "Lcom/appodeal/ads/modules/libs/network/NetworkStateObserver;", "Landroid/content/Context;", "applicationContext", "", "init", "", "isConnected", "Lcom/appodeal/ads/modules/libs/network/NetworkStateObserver$ConnectionListener;", "listener", "subscribe", "unsubscribe", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/appodeal/ads/modules/libs/network/NetworkState;", "getNetworkStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "networkStateFlow", "apd_network"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class NetworkStatus implements NetworkStateObserver {
    public static final NetworkStatus INSTANCE = new NetworkStatus();

    /* renamed from: a */
    public final /* synthetic */ C9311a f23515a = new C9311a();

    public StateFlow<NetworkState> getNetworkStateFlow() {
        return this.f23515a.f23543c;
    }

    public void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        this.f23515a.init(context);
    }

    public boolean isConnected() {
        return this.f23515a.isConnected();
    }

    public void subscribe(NetworkStateObserver.ConnectionListener connectionListener) {
        Intrinsics.checkNotNullParameter(connectionListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f23515a.subscribe(connectionListener);
    }

    public void unsubscribe(NetworkStateObserver.ConnectionListener connectionListener) {
        Intrinsics.checkNotNullParameter(connectionListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f23515a.unsubscribe(connectionListener);
    }
}
