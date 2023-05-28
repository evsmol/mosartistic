package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.adview.C7981d;
import com.applovin.impl.mediation.C8135d;
import com.applovin.impl.mediation.C8238e;
import com.applovin.impl.mediation.C8239f;
import com.applovin.impl.mediation.C8287h;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.debugger.C8147b;
import com.applovin.impl.mediation.debugger.p243ui.testmode.C8237c;
import com.applovin.impl.mediation.p234a.C8076f;
import com.applovin.impl.mediation.p236c.C8133b;
import com.applovin.impl.p225a.p226a.C7871a;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.C8511b;
import com.applovin.impl.sdk.network.C8518d;
import com.applovin.impl.sdk.network.C8528f;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.p251a.C8326f;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p254c.C8381c;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.p254c.C8383e;
import com.applovin.impl.sdk.p255d.C8390c;
import com.applovin.impl.sdk.p255d.C8394f;
import com.applovin.impl.sdk.p255d.C8395g;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8419i;
import com.applovin.impl.sdk.p256e.C8429n;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.C8615o;
import com.applovin.impl.sdk.utils.C8618q;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.hybridAds.C8642d;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinUserSegment;
import com.applovin.sdk.AppLovinUserService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.n */
public class C8490n {

    /* renamed from: a */
    public static C8490n f21321a;

    /* renamed from: b */
    public static C8490n f21322b;

    /* renamed from: c */
    protected static Context f21323c;

    /* renamed from: e */
    private static final long f21324e = System.currentTimeMillis();

    /* renamed from: f */
    private static final boolean f21325f;

    /* renamed from: g */
    private static C8313a f21326g;

    /* renamed from: A */
    private C8383e f21327A;

    /* renamed from: B */
    private C8483m f21328B;

    /* renamed from: C */
    private C8618q f21329C;

    /* renamed from: D */
    private C8378c f21330D;

    /* renamed from: E */
    private C8551s f21331E;

    /* renamed from: F */
    private C8550r f21332F;

    /* renamed from: G */
    private C8390c f21333G;

    /* renamed from: H */
    private SessionTracker f21334H;

    /* renamed from: I */
    private C8552t f21335I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C8518d f21336J;

    /* renamed from: K */
    private C8474j f21337K;

    /* renamed from: L */
    private C8615o f21338L;

    /* renamed from: M */
    private C8464h f21339M;

    /* renamed from: N */
    private C7871a f21340N;

    /* renamed from: O */
    private C8326f f21341O;

    /* renamed from: P */
    private C8555u f21342P;

    /* renamed from: Q */
    private ArrayService f21343Q;

    /* renamed from: R */
    private PostbackServiceImpl f21344R;

    /* renamed from: S */
    private C8528f f21345S;

    /* renamed from: T */
    private C8397e f21346T;

    /* renamed from: U */
    private C8239f f21347U;

    /* renamed from: V */
    private C8238e f21348V;

    /* renamed from: W */
    private MediationServiceImpl f21349W;

    /* renamed from: X */
    private C8642d f21350X;

    /* renamed from: Y */
    private C8287h f21351Y;

    /* renamed from: Z */
    private C8147b f21352Z;

    /* renamed from: aa */
    private C8628w f21353aa;

    /* renamed from: ab */
    private C8135d f21354ab;

    /* renamed from: ac */
    private C8237c f21355ac;
    /* access modifiers changed from: private */

    /* renamed from: ad */
    public List<MaxAdFormat> f21356ad;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public final Object f21357ae = new Object();

    /* renamed from: af */
    private final AtomicBoolean f21358af = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public boolean f21359ag = false;

    /* renamed from: ah */
    private boolean f21360ah = false;

    /* renamed from: ai */
    private boolean f21361ai = false;

    /* renamed from: aj */
    private boolean f21362aj = false;

    /* renamed from: ak */
    private int f21363ak = 0;

    /* renamed from: al */
    private AppLovinSdk.SdkInitializationListener f21364al;

    /* renamed from: am */
    private AppLovinSdk.SdkInitializationListener f21365am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public AppLovinSdkConfiguration f21366an;

    /* renamed from: d */
    protected C8381c f21367d;

    /* renamed from: h */
    private String f21368h;

    /* renamed from: i */
    private WeakReference<Activity> f21369i;

    /* renamed from: j */
    private long f21370j;

    /* renamed from: k */
    private boolean f21371k;

    /* renamed from: l */
    private AppLovinSdkSettings f21372l;

    /* renamed from: m */
    private AppLovinUserSegment f21373m;

    /* renamed from: n */
    private AppLovinTargetingData f21374n;

    /* renamed from: o */
    private String f21375o;

    /* renamed from: p */
    private AppLovinAdServiceImpl f21376p;

    /* renamed from: q */
    private AppLovinNativeAdService f21377q;

    /* renamed from: r */
    private EventServiceImpl f21378r;

    /* renamed from: s */
    private UserServiceImpl f21379s;

    /* renamed from: t */
    private VariableServiceImpl f21380t;

    /* renamed from: u */
    private AppLovinSdk f21381u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C8626v f21382v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C8432o f21383w;

    /* renamed from: x */
    private C8511b f21384x;

    /* renamed from: y */
    private C8395g f21385y;

    /* renamed from: z */
    private C8538o f21386z;

    static {
        boolean z;
        try {
            AppLovinSdkUtils.runOnUiThread($$Lambda$VR7QGn0xyRJD0dkleEGYCFjawQ.INSTANCE);
            z = true;
        } catch (Throwable th) {
            f21325f = false;
            throw th;
        }
        f21325f = z;
    }

    /* renamed from: A */
    public static long m25591A() {
        return f21324e;
    }

    /* renamed from: B */
    public static boolean m25592B() {
        return f21325f;
    }

    /* renamed from: Q */
    public static Context m25593Q() {
        return f21323c;
    }

    /* renamed from: a */
    public static C8313a m25594a(Context context) {
        if (f21326g == null) {
            f21326g = new C8313a(context);
        }
        return f21326g;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25599a(JSONObject jSONObject) {
        for (String i : JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList())) {
            C8626v.m26258i("AppLovinSdk", i);
        }
    }

    /* renamed from: as */
    private void m25600as() {
        this.f21336J.mo57541a((C8518d.C8519a) new C8518d.C8519a() {
            /* renamed from: a */
            public void mo57414a() {
                C8626v unused = C8490n.this.f21382v;
                if (C8626v.m26252a()) {
                    C8490n.this.f21382v.mo57820c("AppLovinSdk", "Connected to internet - re-initializing SDK");
                }
                synchronized (C8490n.this.f21357ae) {
                    if (!C8490n.this.f21359ag) {
                        C8490n.this.mo57381b();
                    }
                }
                C8490n.this.f21336J.mo57542b(this);
            }

            /* renamed from: b */
            public void mo57415b() {
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public List<MaxAdFormat> m25602b(JSONObject jSONObject) {
        List<String> asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        for (String formatFromString : asList) {
            MaxAdFormat formatFromString2 = MaxAdFormat.formatFromString(formatFromString);
            if (formatFromString2 != null) {
                arrayList.add(formatFromString2);
            }
        }
        return arrayList;
    }

    /* renamed from: C */
    public String mo57319C() {
        return this.f21368h;
    }

    /* renamed from: D */
    public C8626v mo57320D() {
        return this.f21382v;
    }

    /* renamed from: E */
    public C8397e mo57321E() {
        return this.f21346T;
    }

    /* renamed from: F */
    public C8239f mo57322F() {
        return this.f21347U;
    }

    /* renamed from: G */
    public C8238e mo57323G() {
        return this.f21348V;
    }

    /* renamed from: H */
    public MediationServiceImpl mo57324H() {
        return this.f21349W;
    }

    /* renamed from: I */
    public C8642d mo57325I() {
        return this.f21350X;
    }

    /* renamed from: J */
    public C8628w mo57326J() {
        return this.f21353aa;
    }

    /* renamed from: K */
    public C8147b mo57327K() {
        return this.f21352Z;
    }

    /* renamed from: L */
    public C8287h mo57328L() {
        return this.f21351Y;
    }

    /* renamed from: M */
    public C8135d mo57329M() {
        return this.f21354ab;
    }

    /* renamed from: N */
    public C8237c mo57330N() {
        return this.f21355ac;
    }

    /* renamed from: O */
    public C8381c mo57331O() {
        return this.f21367d;
    }

    /* renamed from: P */
    public Context mo57332P() {
        return f21323c;
    }

    /* renamed from: R */
    public Activity mo57333R() {
        WeakReference<Activity> weakReference = this.f21369i;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: S */
    public boolean mo57334S() {
        return this.f21361ai;
    }

    /* renamed from: T */
    public boolean mo57335T() {
        return this.f21362aj;
    }

    /* renamed from: U */
    public C8511b mo57336U() {
        return this.f21384x;
    }

    /* renamed from: V */
    public C8432o mo57337V() {
        return this.f21383w;
    }

    /* renamed from: W */
    public C8395g mo57338W() {
        return this.f21385y;
    }

    /* renamed from: X */
    public C8528f mo57339X() {
        return this.f21345S;
    }

    /* renamed from: Y */
    public C8538o mo57340Y() {
        return this.f21386z;
    }

    /* renamed from: Z */
    public C8483m mo57341Z() {
        return this.f21328B;
    }

    /* renamed from: a */
    public <T> T mo57342a(C8380b<T> bVar) {
        return this.f21367d.mo57089a(bVar);
    }

    /* renamed from: a */
    public <T> T mo57343a(C8382d<T> dVar) {
        return mo57378b(dVar, (Object) null);
    }

    /* renamed from: a */
    public <T> T mo57344a(String str, T t, Class<?> cls, SharedPreferences sharedPreferences) {
        return C8383e.m25215a(str, t, (Class) cls, sharedPreferences);
    }

    /* renamed from: a */
    public void mo57345a() {
        synchronized (this.f21357ae) {
            if (!this.f21359ag && !this.f21360ah) {
                mo57381b();
            }
        }
    }

    /* renamed from: a */
    public void mo57346a(long j) {
        this.f21328B.mo57309a(j);
    }

    /* renamed from: a */
    public void mo57347a(SharedPreferences sharedPreferences) {
        this.f21327A.mo57101a(sharedPreferences);
    }

    /* renamed from: a */
    public void mo57348a(C8076f fVar) {
        if (!this.f21383w.mo57232a()) {
            List<String> b = mo57380b(C8379a.f20671a);
            if (b.size() > 0 && this.f21348V.mo56540b().keySet().containsAll(b)) {
                if (C8626v.m26252a()) {
                    this.f21382v.mo57818b("AppLovinSdk", "All required adapters initialized");
                }
                this.f21383w.mo57236e();
                mo57393j();
            }
        }
    }

    /* renamed from: a */
    public <T> void mo57349a(C8382d<T> dVar, T t) {
        this.f21327A.mo57103a(dVar, t);
    }

    /* renamed from: a */
    public <T> void mo57350a(C8382d<T> dVar, T t, SharedPreferences sharedPreferences) {
        this.f21327A.mo57104a(dVar, t, sharedPreferences);
    }

    /* renamed from: a */
    public void mo57351a(final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!mo57387d()) {
            this.f21364al = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    sdkInitializationListener.onSdkInitialized(C8490n.this.f21366an);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo57352a(AppLovinSdk appLovinSdk) {
        this.f21381u = appLovinSdk;
    }

    /* renamed from: a */
    public void mo57353a(String str) {
        C8626v.m26255f("AppLovinSdk", "Setting plugin version: " + str);
        this.f21367d.mo57091a((C8380b<?>) C8380b.f20864dI, (Object) str);
    }

    /* renamed from: a */
    public void mo57354a(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        C8383e eVar;
        String str2;
        C8382d<String> dVar;
        this.f21368h = str;
        this.f21370j = System.currentTimeMillis();
        this.f21372l = appLovinSdkSettings;
        this.f21373m = new C8463g();
        this.f21374n = new AppLovinTargetingDataImpl();
        this.f21366an = new SdkConfigurationImpl((List<String>) null, this);
        f21323c = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f21369i = new WeakReference<>((Activity) context);
        }
        if ("HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(str)) {
            this.f21371k = true;
            f21322b = this;
        } else if (f21321a == null) {
            f21321a = this;
        } else {
            C8626v.m26258i("AppLovinSdk", "Multiple SDK instances detected");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f21327A = new C8383e(this);
        this.f21367d = new C8381c(this);
        this.f21382v = new C8626v(this);
        if (((Boolean) mo57342a(C8380b.f20752bA)).booleanValue()) {
            this.f21331E = new C8551s(this);
        }
        this.f21332F = new C8550r(this);
        this.f21330D = new C8378c(this);
        this.f21378r = new EventServiceImpl(this);
        this.f21379s = new UserServiceImpl(this);
        this.f21380t = new VariableServiceImpl(this);
        this.f21333G = new C8390c(this);
        this.f21383w = new C8432o(this);
        this.f21384x = new C8511b(this);
        this.f21385y = new C8395g(this);
        this.f21341O = new C8326f(this);
        this.f21386z = new C8538o(this);
        this.f21376p = new AppLovinAdServiceImpl(this);
        this.f21377q = new AppLovinNativeAdService(this);
        this.f21334H = new SessionTracker(this);
        this.f21335I = new C8552t(this);
        this.f21344R = new PostbackServiceImpl(this);
        this.f21345S = new C8528f(this);
        this.f21346T = new C8397e(this);
        this.f21347U = new C8239f(this);
        this.f21348V = new C8238e(this);
        this.f21349W = new MediationServiceImpl(this);
        this.f21350X = new C8642d(this);
        this.f21353aa = new C8628w(this);
        this.f21352Z = new C8147b(this);
        this.f21351Y = new C8287h();
        this.f21354ab = new C8135d(this);
        this.f21328B = new C8483m(this);
        this.f21338L = new C8615o(this);
        this.f21339M = new C8464h(this);
        this.f21355ac = new C8237c(this);
        this.f21340N = new C7871a(this);
        this.f21342P = new C8555u(this);
        this.f21343Q = new ArrayService(this);
        this.f21337K = new C8474j(this);
        this.f21329C = new C8618q(this);
        this.f21348V.mo56537a(MaxAdapter.InitializationStatus.INITIALIZING);
        if (((Boolean) mo57342a(C8380b.f20888dg)).booleanValue()) {
            this.f21336J = new C8518d(context);
        }
        if (TextUtils.isEmpty(str)) {
            C8626v.m26258i("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            C8626v.m26258i("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable("")));
        }
        if (str.length() != 86 && Utils.isPubInDebugMode(context, this)) {
            C8626v.m26258i("AppLovinSdk", "Please double-check that you entered your SDK key correctly (" + str + ") : " + Log.getStackTraceString(new Throwable("")));
        }
        if (Utils.isProguardRulesOmitted()) {
            C8626v.m26258i("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!Utils.hasAndroidCoreJsonLibrary(this)) {
            C8626v.m26258i("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (Utils.isVerboseLoggingEnabled(context)) {
            appLovinSdkSettings.setVerboseLogging(true);
        }
        mo57331O().mo57091a((C8380b<?>) C8380b.f20729ae, (Object) Boolean.valueOf(appLovinSdkSettings.isVerboseLoggingEnabled()));
        C7981d.class.getName();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (TextUtils.isEmpty((String) this.f21327A.mo57108b(C8382d.f20993a, null, defaultSharedPreferences))) {
            this.f21361ai = true;
            eVar = this.f21327A;
            dVar = C8382d.f20993a;
            str2 = Boolean.toString(true);
        } else {
            eVar = this.f21327A;
            dVar = C8382d.f20993a;
            str2 = Boolean.toString(false);
        }
        eVar.mo57104a(dVar, str2, defaultSharedPreferences);
        if (((Boolean) this.f21327A.mo57107b(C8382d.f20994b, false)).booleanValue()) {
            if (C8626v.m26252a()) {
                this.f21382v.mo57818b("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f21362aj = true;
        } else {
            if (C8626v.m26252a()) {
                this.f21382v.mo57818b("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            this.f21327A.mo57103a(C8382d.f20994b, true);
        }
        String str3 = (String) this.f21327A.mo57107b(C8382d.f20995c, null);
        if (!StringUtils.isValidString(str3) || AppLovinSdk.VERSION_CODE > Utils.toVersionCode(str3)) {
            this.f21327A.mo57103a(C8382d.f20995c, AppLovinSdk.VERSION);
        }
        boolean a = C8572i.m26102a(mo57332P());
        if (!((Boolean) mo57342a(C8380b.f20889dh)).booleanValue() || a) {
            mo57381b();
        }
        if (((Boolean) mo57342a(C8380b.f20888dg)).booleanValue() && !a) {
            if (C8626v.m26252a()) {
                this.f21382v.mo57820c("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            m25600as();
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: a */
    public <T> void mo57355a(String str, T t, SharedPreferences.Editor editor) {
        this.f21327A.mo57105a(str, t, editor);
    }

    /* renamed from: a */
    public void mo57356a(Map<String, List<?>> map) {
        this.f21352Z.mo56314a(map);
    }

    /* renamed from: a */
    public void mo57357a(boolean z) {
        synchronized (this.f21357ae) {
            this.f21359ag = false;
            this.f21360ah = z;
        }
        if (this.f21367d != null && this.f21383w != null) {
            List<String> b = mo57380b(C8379a.f20671a);
            if (b.isEmpty()) {
                this.f21383w.mo57236e();
                mo57393j();
                return;
            }
            long longValue = ((Long) mo57342a(C8379a.f20672b)).longValue();
            C8458z zVar = new C8458z(this, true, new Runnable() {
                public void run() {
                    if (!C8490n.this.f21383w.mo57232a()) {
                        C8626v unused = C8490n.this.f21382v;
                        if (C8626v.m26252a()) {
                            C8490n.this.f21382v.mo57818b("AppLovinSdk", "Timing out adapters init...");
                        }
                        C8490n.this.f21383w.mo57236e();
                        C8490n.this.mo57393j();
                    }
                }
            });
            if (C8626v.m26252a()) {
                C8626v vVar = this.f21382v;
                vVar.mo57818b("AppLovinSdk", "Waiting for required adapters to init: " + b + " - timing out in " + longValue + "ms...");
            }
            this.f21383w.mo57230a(zVar, C8432o.C8434a.MEDIATION_TIMEOUT, longValue, true);
        }
    }

    /* renamed from: a */
    public boolean mo57358a(C8380b<String> bVar, MaxAdFormat maxAdFormat) {
        return mo57384c(bVar).contains(maxAdFormat);
    }

    /* renamed from: a */
    public boolean mo57359a(MaxAdFormat maxAdFormat) {
        List<MaxAdFormat> list = this.f21356ad;
        return list != null && list.size() > 0 && !this.f21356ad.contains(maxAdFormat);
    }

    /* renamed from: aa */
    public PostbackServiceImpl mo57360aa() {
        return this.f21344R;
    }

    /* renamed from: ab */
    public AppLovinSdk mo57361ab() {
        return this.f21381u;
    }

    /* renamed from: ac */
    public C8378c mo57362ac() {
        return this.f21330D;
    }

    /* renamed from: ad */
    public C8551s mo57363ad() {
        return this.f21331E;
    }

    /* renamed from: ae */
    public C8550r mo57364ae() {
        return this.f21332F;
    }

    /* renamed from: af */
    public C8390c mo57365af() {
        return this.f21333G;
    }

    /* renamed from: ag */
    public SessionTracker mo57366ag() {
        return this.f21334H;
    }

    /* renamed from: ah */
    public C8552t mo57367ah() {
        return this.f21335I;
    }

    /* renamed from: ai */
    public C8313a mo57368ai() {
        return f21326g;
    }

    /* renamed from: aj */
    public C8474j mo57369aj() {
        return this.f21337K;
    }

    /* renamed from: ak */
    public C8615o mo57370ak() {
        return this.f21338L;
    }

    /* renamed from: al */
    public C8464h mo57371al() {
        return this.f21339M;
    }

    /* renamed from: am */
    public AppLovinBroadcastManager mo57372am() {
        return AppLovinBroadcastManager.getInstance(f21323c);
    }

    /* renamed from: an */
    public C7871a mo57373an() {
        return this.f21340N;
    }

    /* renamed from: ao */
    public C8326f mo57374ao() {
        return this.f21341O;
    }

    /* renamed from: ap */
    public C8555u mo57375ap() {
        return this.f21342P;
    }

    /* renamed from: aq */
    public ArrayService mo57376aq() {
        return this.f21343Q;
    }

    /* renamed from: ar */
    public Activity mo57377ar() {
        Activity a = m25594a(f21323c).mo56831a();
        return a != null ? a : mo57333R();
    }

    /* renamed from: b */
    public <T> T mo57378b(C8382d<T> dVar, T t) {
        return this.f21327A.mo57107b(dVar, t);
    }

    /* renamed from: b */
    public <T> T mo57379b(C8382d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return this.f21327A.mo57108b(dVar, t, sharedPreferences);
    }

    /* renamed from: b */
    public List<String> mo57380b(C8380b<String> bVar) {
        return this.f21367d.mo57093b(bVar);
    }

    /* renamed from: b */
    public void mo57381b() {
        synchronized (this.f21357ae) {
            this.f21359ag = true;
            mo57337V().mo57235d();
            int i = this.f21363ak + 1;
            this.f21363ak = i;
            mo57337V().mo57229a((C8401a) new C8419i(i, this, new C8419i.C8421a() {
                /* renamed from: a */
                public void mo57219a(JSONObject jSONObject) {
                    boolean z = jSONObject.length() > 0;
                    C8572i.m26107d(jSONObject, C8490n.this);
                    C8572i.m26106c(jSONObject, C8490n.this);
                    C8459f.m25498a(C8490n.this);
                    C8572i.m26109e(jSONObject, C8490n.this);
                    C8572i.m26099a(jSONObject, z, C8490n.this);
                    C8133b.m24349a(jSONObject, C8490n.this);
                    C8133b.m24351b(jSONObject, C8490n.this);
                    C8490n.this.mo57327K().mo56316a(JsonUtils.getBoolean(jSONObject, "smd", false).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
                    C8490n nVar = C8490n.this;
                    List unused = nVar.f21356ad = nVar.m25602b(jSONObject);
                    if (z) {
                        List<String> explode = CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", ""));
                        C8490n nVar2 = C8490n.this;
                        AppLovinSdkConfiguration unused2 = nVar2.f21366an = new SdkConfigurationImpl(explode, nVar2);
                    }
                    C8572i.m26111f(jSONObject, C8490n.this);
                    C8490n.this.mo57330N().mo56527a(jSONObject);
                    C8490n.this.m25599a(jSONObject);
                    C8490n.this.mo57337V().mo57227a((C8401a) new C8429n(C8490n.this));
                }
            }), C8432o.C8434a.MAIN, (long) ((Integer) mo57342a(C8380b.f20938ee)).intValue());
        }
    }

    /* renamed from: b */
    public <T> void mo57382b(C8382d<T> dVar) {
        this.f21327A.mo57102a(dVar);
    }

    /* renamed from: b */
    public void mo57383b(String str) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f21382v;
            vVar.mo57818b("AppLovinSdk", "Setting user id: " + str);
        }
        if (StringUtils.isValidString(str) && str.length() > Utils.kilobytesToByes(8)) {
            C8626v.m26258i("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + Utils.kilobytesToByes(8) + " maximum)");
        }
        this.f21329C.mo57785a(str);
    }

    /* renamed from: c */
    public List<MaxAdFormat> mo57384c(C8380b<String> bVar) {
        return this.f21367d.mo57095c(bVar);
    }

    /* renamed from: c */
    public void mo57385c(String str) {
        this.f21375o = str;
        mo57382b(C8382d.f20988A);
    }

    /* renamed from: c */
    public boolean mo57386c() {
        boolean z;
        synchronized (this.f21357ae) {
            z = this.f21359ag;
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo57387d() {
        boolean z;
        synchronized (this.f21357ae) {
            z = this.f21360ah;
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo57388e() {
        return this.f21371k;
    }

    /* renamed from: f */
    public boolean mo57389f() {
        return StringUtils.containsIgnoreCase(mo57405u(), AppLovinMediationProvider.MAX);
    }

    /* renamed from: g */
    public boolean mo57390g() {
        return Utils.checkClassExistence("com.unity3d.player.UnityPlayerActivity");
    }

    /* renamed from: h */
    public void mo57391h() {
        String str = (String) this.f21327A.mo57107b(C8382d.f20995c, null);
        if (StringUtils.isValidString(str) && AppLovinSdk.VERSION_CODE < Utils.toVersionCode(str)) {
            C8626v.m26258i("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
        }
    }

    /* renamed from: i */
    public void mo57392i() {
        this.f21337K.mo57286a();
    }

    /* renamed from: j */
    public void mo57393j() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.f21364al;
        if (sdkInitializationListener != null) {
            if (mo57387d()) {
                this.f21364al = null;
                this.f21365am = null;
                this.f21348V.mo56537a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
            } else if (this.f21365am != sdkInitializationListener) {
                this.f21348V.mo56537a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
                if (((Boolean) mo57342a(C8380b.f20737am)).booleanValue()) {
                    this.f21364al = null;
                } else {
                    this.f21365am = sdkInitializationListener;
                }
            } else {
                return;
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C8626v unused = C8490n.this.f21382v;
                    if (C8626v.m26252a()) {
                        C8490n.this.f21382v.mo57818b("AppLovinSdk", "Calling back publisher's initialization completion handler...");
                    }
                    sdkInitializationListener.onSdkInitialized(C8490n.this.f21366an);
                }
            }, Math.max(0, ((Long) mo57342a(C8380b.f20738an)).longValue()));
        }
    }

    /* renamed from: k */
    public void mo57394k() {
        C8626v.m26258i("AppLovinSdk", "Resetting SDK state...");
        long b = this.f21385y.mo57154b(C8394f.f21090i);
        this.f21367d.mo57096c();
        this.f21367d.mo57090a();
        this.f21385y.mo57153a();
        this.f21385y.mo57156b(C8394f.f21090i, b + 1);
        if (this.f21358af.compareAndSet(true, false)) {
            mo57381b();
        } else {
            this.f21358af.set(true);
        }
    }

    /* renamed from: l */
    public void mo57395l() {
        mo57356a((Map<String, List<?>>) null);
    }

    /* renamed from: m */
    public void mo57396m() {
        this.f21340N.mo55455b();
    }

    /* renamed from: n */
    public String mo57397n() {
        return this.f21329C.mo57784a();
    }

    /* renamed from: o */
    public String mo57398o() {
        return this.f21329C.mo57786b();
    }

    /* renamed from: p */
    public String mo57399p() {
        return this.f21329C.mo57787c();
    }

    /* renamed from: q */
    public AppLovinSdkSettings mo57400q() {
        return this.f21372l;
    }

    /* renamed from: r */
    public AppLovinUserSegment mo57401r() {
        return this.f21373m;
    }

    /* renamed from: s */
    public AppLovinTargetingDataImpl mo57402s() {
        return (AppLovinTargetingDataImpl) this.f21374n;
    }

    /* renamed from: t */
    public AppLovinSdkConfiguration mo57403t() {
        return this.f21366an;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f21368h + '\'' + ", enabled=" + this.f21360ah + ", isFirstSession=" + this.f21361ai + '}';
    }

    /* renamed from: u */
    public String mo57405u() {
        String str = (String) mo57343a(C8382d.f20988A);
        return StringUtils.isValidString(str) ? str : this.f21375o;
    }

    /* renamed from: v */
    public AppLovinAdServiceImpl mo57406v() {
        return this.f21376p;
    }

    /* renamed from: w */
    public AppLovinNativeAdService mo57407w() {
        return this.f21377q;
    }

    /* renamed from: x */
    public AppLovinEventService mo57408x() {
        return this.f21378r;
    }

    /* renamed from: y */
    public AppLovinUserService mo57409y() {
        return this.f21379s;
    }

    /* renamed from: z */
    public VariableServiceImpl mo57410z() {
        return this.f21380t;
    }
}
