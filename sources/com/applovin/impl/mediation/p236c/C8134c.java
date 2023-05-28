package com.applovin.impl.mediation.p236c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.adcolony.sdk.AdColonyAppOptions;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p150io.bidmachine.BidMachine;

/* renamed from: com.applovin.impl.mediation.c.c */
public class C8134c {

    /* renamed from: a */
    private static final TreeMap<String, String> f19813a;

    /* renamed from: b */
    private static final List<String> f19814b = new ArrayList(f19813a.keySet());

    /* renamed from: c */
    private static JSONArray f19815c;

    /* renamed from: d */
    private static final Object f19816d = new Object();

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        f19813a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        f19813a.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        f19813a.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        f19813a.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        f19813a.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        f19813a.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", BidMachine.NAME);
        f19813a.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        f19813a.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        f19813a.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        f19813a.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        f19813a.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        f19813a.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        f19813a.put("com.applovin.mediation.adapters.GoogleMediationAdapter", AdColonyAppOptions.ADMOB);
        f19813a.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        f19813a.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        f19813a.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        f19813a.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", AdColonyAppOptions.FYBER);
        f19813a.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", AdColonyAppOptions.IRONSOURCE);
        f19813a.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        f19813a.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        f19813a.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        f19813a.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        f19813a.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        f19813a.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        f19813a.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        f19813a.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        f19813a.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        f19813a.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        f19813a.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        f19813a.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        f19813a.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        f19813a.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        f19813a.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        f19813a.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        f19813a.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        f19813a.put("com.applovin.mediation.adapters.VungleMediationAdapter", "Vungle");
        f19813a.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        f19813a.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
    }

    /* renamed from: a */
    public static C8432o.C8434a m24354a(MaxAdFormat maxAdFormat) {
        return maxAdFormat == MaxAdFormat.INTERSTITIAL ? C8432o.C8434a.MEDIATION_INTERSTITIAL : maxAdFormat == MaxAdFormat.APP_OPEN ? C8432o.C8434a.MEDIATION_APP_OPEN : maxAdFormat == MaxAdFormat.REWARDED ? C8432o.C8434a.MEDIATION_INCENTIVIZED : maxAdFormat == MaxAdFormat.REWARDED_INTERSTITIAL ? C8432o.C8434a.MEDIATION_REWARDED_INTERSTITIAL : C8432o.C8434a.MEDIATION_BANNER;
    }

    /* renamed from: a */
    public static AppLovinSdkUtils.Size m24355a(int i, MaxAdFormat maxAdFormat, Context context) {
        if (i < 0) {
            try {
                Display defaultDisplay = (context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = AppLovinSdkUtils.pxToDp(context, displayMetrics.widthPixels);
            } catch (Throwable unused) {
                return maxAdFormat.getSize();
            }
        }
        Class<?> cls = Class.forName("com.google.android.gms.ads.AdSize");
        Method method = cls.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", new Class[]{Context.class, Integer.TYPE});
        Method method2 = cls.getMethod("getWidth", new Class[0]);
        Method method3 = cls.getMethod("getHeight", new Class[0]);
        Object invoke = method.invoke((Object) null, new Object[]{context, Integer.valueOf(i)});
        return new AppLovinSdkUtils.Size(((Integer) method2.invoke(invoke, new Object[0])).intValue(), ((Integer) method3.invoke(invoke, new Object[0])).intValue());
    }

    /* renamed from: a */
    public static JSONArray m24356a(C8490n nVar) {
        if (f19815c != null) {
            m24360b(nVar);
            return f19815c;
        }
        f19815c = new JSONArray();
        for (String next : f19814b) {
            MaxAdapter b = m24359b(next, nVar);
            if (b != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, f19813a.get(next));
                    jSONObject.put("class", next);
                    jSONObject.put("sdk_version", b.getSdkVersion());
                    jSONObject.put("version", b.getAdapterVersion());
                } catch (Throwable unused) {
                }
                synchronized (f19816d) {
                    f19815c.put(jSONObject);
                }
            }
        }
        return f19815c;
    }

    /* renamed from: a */
    public static JSONObject m24357a(String str, C8490n nVar) {
        JSONArray a = m24356a(nVar);
        for (int i = 0; i < a.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(a, i, (JSONObject) null);
            if (jSONObject != null && str.equals(JsonUtils.getString(jSONObject, "class", (String) null))) {
                return jSONObject;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m24358a(Object obj) {
        return (obj instanceof C8350e) && StringUtils.isValidString(((C8350e) obj).mo56956N());
    }

    /* renamed from: b */
    public static MaxAdapter m24359b(String str, C8490n nVar) {
        if (TextUtils.isEmpty(str)) {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57822e("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return (MaxAdapter) cls.getConstructor(new Class[]{AppLovinSdk.class}).newInstance(new Object[]{nVar.mo57361ab()});
            }
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D = nVar.mo57320D();
                D.mo57822e("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            }
            return null;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D2 = nVar.mo57320D();
                D2.mo57819b("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
    }

    /* renamed from: b */
    private static void m24360b(C8490n nVar) {
        MaxAdapter b;
        for (int i = 0; i < f19815c.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(f19815c, i, (JSONObject) null);
            String string = JsonUtils.getString(jSONObject, "class", "");
            if (!StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", "")) && (b = m24359b(string, nVar)) != null) {
                String sdkVersion = b.getSdkVersion();
                if (StringUtils.isValidString(sdkVersion)) {
                    synchronized (f19816d) {
                        JsonUtils.putString(jSONObject, "sdk_version", sdkVersion);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m24361b(Object obj) {
        return (obj instanceof C8070a) && "APPLOVIN".equals(((C8070a) obj).mo56153T());
    }
}
