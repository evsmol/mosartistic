package com.ironsource.sdk.p137a;

import android.content.Context;
import com.adcolony.adcolonysdk.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.p116a.C4357c;
import com.ironsource.p119d.C4370a;
import com.ironsource.sdk.utils.C4983a;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.a.b */
public final class C4744b implements C4357c {

    /* renamed from: a */
    private static Map<String, Object> f12029a = new HashMap();

    /* renamed from: com.ironsource.sdk.a.b$a */
    public static class C4745a {

        /* renamed from: a */
        public String f12030a;

        /* renamed from: b */
        public String f12031b;

        /* renamed from: c */
        public Context f12032c;

        /* renamed from: d */
        public String f12033d;
    }

    private C4744b(C4745a aVar) {
        Context context = aVar.f12032c;
        C4983a a = C4983a.m14513a(context);
        f12029a.put("deviceos", SDKUtils.encodeString(a.f12749c));
        f12029a.put("deviceosversion", SDKUtils.encodeString(a.f12750d));
        f12029a.put("deviceapilevel", Integer.valueOf(a.f12751e));
        f12029a.put("deviceoem", SDKUtils.encodeString(a.f12747a));
        f12029a.put("devicemodel", SDKUtils.encodeString(a.f12748b));
        f12029a.put("bundleid", SDKUtils.encodeString(context.getPackageName()));
        f12029a.put("applicationkey", SDKUtils.encodeString(aVar.f12031b));
        f12029a.put("sessionid", SDKUtils.encodeString(aVar.f12030a));
        f12029a.put("sdkversion", SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f12029a.put("applicationuserid", SDKUtils.encodeString(aVar.f12033d));
        f12029a.put("env", BuildConfig.FLAVOR);
        f12029a.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "n");
        f12029a.put("connectiontype", C4370a.m12414a(aVar.f12032c));
    }

    public /* synthetic */ C4744b(C4745a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public static void m13915a(String str) {
        f12029a.put("connectiontype", SDKUtils.encodeString(str));
    }

    /* renamed from: a */
    public final Map<String, Object> mo33051a() {
        return f12029a;
    }
}
