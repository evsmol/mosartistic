package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.C4377a;
import com.ironsource.environment.C4407h;
import com.ironsource.sdk.p141e.p142a.C4926a;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.d */
public final class C4980d {

    /* renamed from: b */
    private static C4980d f12729b;

    /* renamed from: a */
    private JSONObject f12730a = new JSONObject();

    private C4980d() {
    }

    /* renamed from: a */
    public static synchronized C4980d m14484a() {
        C4980d dVar;
        synchronized (C4980d.class) {
            if (f12729b == null) {
                f12729b = new C4980d();
            }
            dVar = f12729b;
        }
        return dVar;
    }

    /* renamed from: a */
    private void m14485a(Activity activity) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                mo34722a(SDKUtils.encodeString("immersiveMode"), Boolean.valueOf(C4407h.m12543a(activity)));
            }
            mo34722a("appOrientation", SDKUtils.translateRequestedOrientation(C4407h.m12570m(activity)));
        }
    }

    /* renamed from: a */
    private void m14486a(Map<String, String> map) {
        if (map == null) {
            Log.d("TokenService", "collectDataFromExternalParams params=null");
            return;
        }
        for (String next : map.keySet()) {
            mo34722a(next, SDKUtils.encodeString(map.get(next)));
        }
    }

    /* renamed from: c */
    private static void m14487c() {
        HashMap hashMap = new HashMap();
        hashMap.put("omidVersion", C4926a.f12585a);
        hashMap.put("omidPartnerVersion", "7");
        f12729b.m14486a((Map<String, String>) hashMap);
    }

    /* renamed from: c */
    private void m14488c(final Context context) {
        if (context != null) {
            try {
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            C4980d.this.mo34723a(C4978b.m14475a(context));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private void m14489c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                mo34722a("chinaCDN", new JSONObject(str).opt("chinaCDN"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private static void m14490d() {
        if (IronSourceQaProperties.isInitialized()) {
            f12729b.m14486a(IronSourceQaProperties.getInstance().getParameters());
        }
    }

    /* renamed from: d */
    private void m14491d(Context context) {
        if (context != null) {
            mo34723a(C4978b.m14478c(context));
            mo34723a(C4978b.m14477b(context));
        }
    }

    /* renamed from: a */
    public final String mo34719a(Context context) {
        try {
            return C4377a.C43781.m12464c(mo34724b(context).toString());
        } catch (Exception unused) {
            return C4377a.C43781.m12464c(new JSONObject().toString());
        }
    }

    /* renamed from: a */
    public final void mo34720a(Context context, String str, String str2) {
        m14488c(context);
        if (context instanceof Activity) {
            m14485a((Activity) context);
        }
        m14491d(context);
        mo34721a(str2);
        mo34726b(str);
    }

    /* renamed from: a */
    public final void mo34721a(String str) {
        if (str != null) {
            mo34722a("applicationUserId", SDKUtils.encodeString(str));
        }
    }

    /* renamed from: a */
    public final synchronized void mo34722a(String str, Object obj) {
        try {
            this.f12730a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo34723a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            mo34722a(next, jSONObject.opt(next));
        }
    }

    /* renamed from: b */
    public final JSONObject mo34724b(Context context) {
        mo34725b();
        m14491d(context);
        try {
            return new JSONObject(this.f12730a.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public final void mo34725b() {
        m14489c(SDKUtils.getControllerConfig());
        m14486a(SDKUtils.getInitSDKParams());
        m14490d();
        m14487c();
    }

    /* renamed from: b */
    public final void mo34726b(String str) {
        if (str != null) {
            mo34722a("applicationKey", SDKUtils.encodeString(str));
        }
    }
}
