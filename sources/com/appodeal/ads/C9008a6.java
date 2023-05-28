package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.C9430r5;
import com.appodeal.ads.C9464s;
import com.appodeal.ads.C9710x5;
import com.appodeal.ads.C9737z5;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.C9492h;
import com.appodeal.ads.utils.C9609c;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.app.AppState;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.a6 */
public abstract class C9008a6<AdObjectType extends C9430r5<AdRequestType, ?, ?, ?>, AdRequestType extends C9737z5<AdObjectType>, RequestParamsType extends C9464s<RequestParamsType>> extends C9577u<AdObjectType, AdRequestType, RequestParamsType> {
    public C9008a6(C9136b6 b6Var, AdType adType) {
        super(b6Var, adType, C9492h.m28089b());
    }

    /* renamed from: a */
    public final void mo59377a(Activity activity, AppState appState) {
        C9710x5 x = mo59381x();
        if (appState == AppState.Resumed && this.f24291i && !C9609c.m28357a(activity)) {
            C9710x5.C9714d a = x.mo61224a(activity);
            if (a.f24600b == C9181f0.VISIBLE || a.f24599a != null) {
                x.mo61231a(activity, new C9726y5(mo60845e(), x.mo61234b(activity)), this);
            }
        }
        if (appState == AppState.Destroyed) {
            for (Map.Entry entry : x.f24594l.entrySet()) {
                if (((WeakReference) entry.getKey()).get() == activity) {
                    x.f24594l.remove(entry.getKey());
                    Log.debug(x.f24583a, "handleActivityDestroy", activity.toString());
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo59246b(Context context) {
        mo60839b(context, mo59380w());
    }

    /* renamed from: t */
    public final void mo59378t() {
        Activity activity = C9148b.f22956b.f22957a.getActivity();
        if (activity != null) {
            C9710x5 x = mo59381x();
            C8998a aVar = x.mo61224a(activity).f24599a;
            if (!(aVar != null ? x.mo61231a(activity, new C9726y5(mo60845e(), aVar), this) : false)) {
                super.mo59378t();
            }
        }
    }

    /* renamed from: u */
    public final boolean mo59379u() {
        return this.f24303u && mo60846f() == null;
    }

    /* renamed from: w */
    public abstract RequestParamsType mo59380w();

    /* renamed from: x */
    public abstract C9710x5<AdRequestType, AdObjectType> mo59381x();

    /* renamed from: a */
    public final void mo59242a(JSONObject jSONObject) {
        C9710x5 x = mo59381x();
        x.getClass();
        if (jSONObject.has("refresh_period")) {
            x.f24584b = Integer.valueOf(jSONObject.optInt("refresh_period") * 1000);
        }
    }
}
