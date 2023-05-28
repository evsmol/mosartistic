package com.ironsource.p119d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C4377a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.d.a */
public class C4370a {

    /* renamed from: a */
    private boolean f10404a = true;

    /* renamed from: b */
    private IronSourceError f10405b = null;

    /* renamed from: a */
    public static String m12414a(Context context) {
        return Build.VERSION.SDK_INT >= 23 ? m12415a(m12417b(context), context) : m12420d(context);
    }

    /* renamed from: a */
    public static String m12415a(Network network, Context context) {
        String str;
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null) {
                    return m12420d(context);
                }
                if (networkCapabilities.hasTransport(1)) {
                    str = "wifi";
                } else if (!networkCapabilities.hasTransport(0)) {
                    return m12420d(context);
                } else {
                    str = "3g";
                }
            } else {
                str = m12420d(context);
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    /* renamed from: a */
    public static JSONObject m12416a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 23 && network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (!(connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null)) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put("hasVPN", m12419c(context));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static Network m12417b(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 23 && connectivityManager != null) {
            try {
                return connectivityManager.getActiveNetwork();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m12418b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (!(Build.VERSION.SDK_INT < 23 || network == null || context == null)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return "ethernet";
                }
                if (networkCapabilities.hasTransport(5)) {
                    return "wifiAware";
                }
                if (networkCapabilities.hasTransport(6)) {
                    return "lowpan";
                }
                if (networkCapabilities.hasTransport(2)) {
                    return "bluetooth";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: c */
    public static boolean m12419c(Context context) {
        return m12418b(context, m12417b(context)).equals("vpn");
    }

    /* renamed from: d */
    private static String m12420d(Context context) {
        String a = C4377a.C43781.m12451a(context);
        return TextUtils.isEmpty(a) ? "none" : a;
    }

    /* renamed from: a */
    public void mo33152a(IronSourceError ironSourceError) {
        this.f10404a = false;
        this.f10405b = ironSourceError;
    }

    /* renamed from: a */
    public boolean mo33153a() {
        return this.f10404a;
    }

    /* renamed from: b */
    public IronSourceError mo33154b() {
        return this.f10405b;
    }

    public String toString() {
        StringBuilder sb;
        if (mo33153a()) {
            sb = new StringBuilder("valid:");
            sb.append(this.f10404a);
        } else {
            sb = new StringBuilder("valid:");
            sb.append(this.f10404a);
            sb.append(", IronSourceError:");
            sb.append(this.f10405b);
        }
        return sb.toString();
    }
}
