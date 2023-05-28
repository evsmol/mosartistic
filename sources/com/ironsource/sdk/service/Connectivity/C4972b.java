package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import android.os.Build;
import com.ironsource.environment.C4386c;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.b */
public abstract class C4972b implements C4974d {

    /* renamed from: a */
    public C4973c f12718a;

    protected C4972b(JSONObject jSONObject, Context context) {
        C4973c cVar;
        if (jSONObject.optInt("connectivityStrategy") == 1) {
            cVar = new C4971a(this);
        } else {
            cVar = (Build.VERSION.SDK_INT < 23 || !C4386c.m12478b(context, "android.permission.ACCESS_NETWORK_STATE")) ? new C4971a(this) : new C4975e(this);
        }
        this.f12718a = cVar;
        String simpleName = C4972b.class.getSimpleName();
        Logger.m14507i(simpleName, "created ConnectivityAdapter with strategy " + this.f12718a.getClass().getSimpleName());
    }

    /* renamed from: a */
    public void mo34453a() {
    }

    /* renamed from: a */
    public void mo34454a(String str) {
    }

    /* renamed from: a */
    public void mo34455a(String str, JSONObject jSONObject) {
    }
}
