package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import com.ironsource.p119d.C4370a;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.e */
public class C4975e implements C4973c {

    /* renamed from: a */
    private String f12719a = C4975e.class.getSimpleName();

    /* renamed from: b */
    private int f12720b = 23;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4974d f12721c;

    /* renamed from: d */
    private ConnectivityManager.NetworkCallback f12722d;

    public C4975e(C4974d dVar) {
        this.f12721c = dVar;
    }

    /* renamed from: a */
    public final void mo34706a() {
        this.f12722d = null;
    }

    /* renamed from: a */
    public final void mo34707a(final Context context) {
        if (Build.VERSION.SDK_INT >= this.f12720b) {
            mo34708b(context);
            if (C4370a.m12414a(context).equals("none")) {
                this.f12721c.mo34453a();
            }
            if (this.f12722d == null) {
                this.f12722d = new ConnectivityManager.NetworkCallback() {
                    public final void onAvailable(Network network) {
                        if (network != null) {
                            C4974d a = C4975e.this.f12721c;
                            String a2 = C4370a.m12415a(network, context);
                            C4370a.m12416a(context, network);
                            a.mo34454a(a2);
                            return;
                        }
                        C4974d a3 = C4975e.this.f12721c;
                        String a4 = C4370a.m12414a(context);
                        Context context = context;
                        C4370a.m12416a(context, C4370a.m12417b(context));
                        a3.mo34454a(a4);
                    }

                    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                        if (network != null) {
                            C4975e.this.f12721c.mo34455a(C4370a.m12415a(network, context), C4370a.m12416a(context, network));
                        }
                    }

                    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                        if (network != null) {
                            C4975e.this.f12721c.mo34455a(C4370a.m12415a(network, context), C4370a.m12416a(context, network));
                        }
                    }

                    public final void onLost(Network network) {
                        if (C4370a.m12414a(context).equals("none")) {
                            C4975e.this.f12721c.mo34453a();
                        }
                    }
                };
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.f12722d);
                }
            } catch (Exception unused) {
                Log.e(this.f12719a, "NetworkCallback was not able to register");
            }
        }
    }

    /* renamed from: b */
    public final void mo34708b(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT >= this.f12720b && this.f12722d != null && context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this.f12722d);
            } catch (Exception unused) {
                Log.e(this.f12719a, "NetworkCallback for was not registered or already unregistered");
            }
        }
    }

    /* renamed from: c */
    public final JSONObject mo34709c(Context context) {
        return C4370a.m12416a(context, C4370a.m12417b(context));
    }
}
