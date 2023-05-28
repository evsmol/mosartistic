package com.appodeal.ads.modules.libs.network.state;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.appodeal.ads.modules.libs.network.NetworkState;
import com.appodeal.ads.modules.libs.network.NetworkStateObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.appodeal.ads.modules.libs.network.state.a */
public final class C9311a implements NetworkStateObserver {

    /* renamed from: a */
    public ConnectivityManager f23541a;

    /* renamed from: b */
    public final CopyOnWriteArraySet<NetworkStateObserver.ConnectionListener> f23542b = new CopyOnWriteArraySet<>();

    /* renamed from: c */
    public final MutableStateFlow<NetworkState> f23543c = StateFlowKt.MutableStateFlow(NetworkState.NotInitialized);

    /* renamed from: com.appodeal.ads.modules.libs.network.state.a$a */
    public static final class C9312a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final /* synthetic */ C9311a f23544a;

        public C9312a(C9311a aVar) {
            this.f23544a = aVar;
        }

        public final void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onAvailable(network);
            C9311a.m27496a(this.f23544a);
        }

        public final void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onLost(network);
            C9311a.m27496a(this.f23544a);
        }

        public final void onUnavailable() {
            super.onUnavailable();
            C9311a.m27496a(this.f23544a);
        }
    }

    /* renamed from: a */
    public static final void m27496a(C9311a aVar) {
        aVar.f23543c.setValue(aVar.isConnected() ? NetworkState.Enabled : NetworkState.Disabled);
        Iterator<NetworkStateObserver.ConnectionListener> it = aVar.f23542b.iterator();
        while (it.hasNext()) {
            it.next().onConnectionUpdated(aVar.isConnected());
        }
    }

    public final StateFlow getNetworkStateFlow() {
        return this.f23543c;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        if (this.f23543c.getValue() == NetworkState.NotInitialized) {
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            this.f23541a = connectivityManager;
            if (connectivityManager != null) {
                this.f23543c.setValue(NetworkState.Disabled);
                try {
                    connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), new C9312a(this));
                } catch (Throwable unused) {
                    this.f23543c.setValue(NetworkState.ConnectivityManagerError);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getActiveNetworkInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isConnected() {
        /*
            r2 = this;
            android.net.ConnectivityManager r0 = r2.f23541a
            r1 = 1
            if (r0 != 0) goto L_0x0006
            goto L_0x0014
        L_0x0006:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 != 0) goto L_0x000d
            goto L_0x0014
        L_0x000d:
            boolean r0 = r0.isConnected()
            if (r0 != r1) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.libs.network.state.C9311a.isConnected():boolean");
    }

    public final void subscribe(NetworkStateObserver.ConnectionListener connectionListener) {
        Intrinsics.checkNotNullParameter(connectionListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f23542b.add(connectionListener);
    }

    public final void unsubscribe(NetworkStateObserver.ConnectionListener connectionListener) {
        Intrinsics.checkNotNullParameter(connectionListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f23542b.remove(connectionListener);
    }
}
