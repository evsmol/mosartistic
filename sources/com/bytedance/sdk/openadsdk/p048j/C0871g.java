package com.bytedance.sdk.openadsdk.p048j;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.openadsdk.j.g */
/* compiled from: PlayablePlugin */
public class C0871g {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public WeakReference<View> f3096A;

    /* renamed from: B */
    private C0842e f3097B;

    /* renamed from: C */
    private C0836a f3098C;

    /* renamed from: D */
    private C0840c f3099D;

    /* renamed from: E */
    private int f3100E = 0;

    /* renamed from: F */
    private int f3101F = 0;

    /* renamed from: G */
    private JSONObject f3102G = new JSONObject();

    /* renamed from: H */
    private String f3103H;

    /* renamed from: I */
    private String f3104I;

    /* renamed from: J */
    private String f3105J;

    /* renamed from: K */
    private Map<String, String> f3106K = new HashMap();

    /* renamed from: L */
    private JSONObject f3107L;

    /* renamed from: M */
    private String f3108M;

    /* renamed from: N */
    private JSONObject f3109N;

    /* renamed from: O */
    private float f3110O;

    /* renamed from: P */
    private int f3111P;

    /* renamed from: Q */
    private int f3112Q;

    /* renamed from: R */
    private int f3113R;

    /* renamed from: S */
    private int f3114S;

    /* renamed from: T */
    private int f3115T;

    /* renamed from: U */
    private int f3116U;

    /* renamed from: V */
    private int f3117V;

    /* renamed from: W */
    private int f3118W;

    /* renamed from: X */
    private int f3119X;

    /* renamed from: Y */
    private int f3120Y;

    /* renamed from: Z */
    private String f3121Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f3122a = new Handler(Looper.getMainLooper());

    /* renamed from: aa */
    private boolean f3123aa;

    /* renamed from: ab */
    private boolean f3124ab;

    /* renamed from: ac */
    private boolean f3125ac;

    /* renamed from: ad */
    private boolean f3126ad;

    /* renamed from: ae */
    private String f3127ae;

    /* renamed from: af */
    private String f3128af;

    /* renamed from: ag */
    private boolean f3129ag = false;

    /* renamed from: ah */
    private ViewTreeObserver.OnGlobalLayoutListener f3130ah = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            try {
                View view = (View) C0871g.this.f3096A.get();
                if (view != null) {
                    C0871g.this.m4166b(view);
                }
            } catch (Throwable th) {
                C0869f.m4155a("PlayablePlugin", "onSizeChanged error", th);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Runnable f3131b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Runnable f3132c;

    /* renamed from: d */
    private Timer f3133d = new Timer();

    /* renamed from: e */
    private TimerTask f3134e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C0837b f3135f;

    /* renamed from: g */
    private boolean f3136g = true;

    /* renamed from: h */
    private Set<String> f3137h = new HashSet(Arrays.asList(new String[]{"adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"}));

    /* renamed from: i */
    private String f3138i = null;

    /* renamed from: j */
    private String f3139j = "embeded_ad";

    /* renamed from: k */
    private boolean f3140k = true;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f3141l = true;

    /* renamed from: m */
    private boolean f3142m = true;

    /* renamed from: n */
    private long f3143n = 10;

    /* renamed from: o */
    private long f3144o = 10;

    /* renamed from: p */
    private long f3145p = 0;

    /* renamed from: q */
    private long f3146q = 0;

    /* renamed from: r */
    private long f3147r = -1;

    /* renamed from: s */
    private long f3148s = -1;

    /* renamed from: t */
    private long f3149t = -1;

    /* renamed from: u */
    private long f3150u = -1;

    /* renamed from: v */
    private int f3151v = 0;

    /* renamed from: w */
    private int f3152w = 0;

    /* renamed from: x */
    private C0880a f3153x = C0880a.MAIN;

    /* renamed from: y */
    private Context f3154y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public WebView f3155z;

    /* renamed from: com.bytedance.sdk.openadsdk.j.g$a */
    /* compiled from: PlayablePlugin */
    enum C0880a {
        MAIN,
        RIFLE
    }

    /* renamed from: q */
    public void mo2722q() {
    }

    /* renamed from: r */
    public void mo2723r() {
    }

    /* renamed from: w */
    public String mo2728w() {
        return "function playable_callJS(){return \"Android调用了JS的callJS方法\";}";
    }

    /* renamed from: h */
    static /* synthetic */ int m4174h(C0871g gVar) {
        int i = gVar.f3151v;
        gVar.f3151v = i + 1;
        return i;
    }

    private C0871g(Context context, WebView webView, C0840c cVar, C0836a aVar) {
        this.f3155z = webView;
        C0881h.m4228a(webView);
        mo2688a((View) webView);
        m4161a(context, cVar, aVar);
        m4175x();
    }

    /* renamed from: a */
    private void m4161a(Context context, C0840c cVar, C0836a aVar) {
        this.f3138i = UUID.randomUUID().toString();
        this.f3154y = context;
        this.f3097B = new C0842e(this);
        this.f3098C = aVar;
        this.f3099D = cVar;
    }

    /* renamed from: x */
    private void m4175x() {
        this.f3135f = new C0837b(this);
        this.f3131b = new Runnable() {
            public void run() {
                if (C0871g.this.f3141l) {
                    boolean unused = C0871g.this.f3141l = false;
                    C0871g.this.f3122a.removeCallbacks(C0871g.this.f3132c);
                    C0871g.this.mo2686a(2, "容器加载超时");
                }
            }
        };
        this.f3132c = new Runnable() {
            public void run() {
                if (C0871g.this.f3141l) {
                    boolean unused = C0871g.this.f3141l = false;
                    C0871g.this.f3122a.removeCallbacks(C0871g.this.f3131b);
                    C0871g.this.mo2686a(3, "JSSDK加载超时");
                }
            }
        };
        this.f3134e = new TimerTask() {
            public void run() {
                C0871g.this.f3122a.post(new Runnable() {
                    public void run() {
                        if (Build.VERSION.SDK_INT >= 19 && C0871g.this.f3155z != null) {
                            C0871g.this.f3155z.evaluateJavascript("javascript:playable_callJS()", new ValueCallback<String>() {
                                /* renamed from: a */
                                public void onReceiveValue(String str) {
                                    if (C0871g.this.f3135f != null) {
                                        C0871g.this.f3135f.mo2669a(System.currentTimeMillis());
                                    }
                                }
                            });
                        }
                    }
                });
            }
        };
    }

    /* renamed from: y */
    private boolean m4176y() {
        String str = this.f3108M;
        if (str != null) {
            return str.contains("/union-fe/playable/") || this.f3108M.contains("/union-fe-sg/playable/") || this.f3108M.contains("/union-fe-i18n/playable/");
        }
        return false;
    }

    /* renamed from: a */
    public void mo2688a(View view) {
        if (view != null) {
            try {
                this.f3096A = new WeakReference<>(view);
                m4166b(view);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this.f3130ah);
            } catch (Throwable th) {
                C0869f.m4155a("PlayablePlugin", "setViewForScreenSize error", th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4166b(View view) {
        if (view != null) {
            try {
                if (this.f3100E != view.getWidth() || this.f3101F != view.getHeight()) {
                    this.f3100E = view.getWidth();
                    this.f3101F = view.getHeight();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IabUtils.KEY_WIDTH, this.f3100E);
                    jSONObject.put(IabUtils.KEY_HEIGHT, this.f3101F);
                    mo2689a("resize", jSONObject);
                    this.f3102G = jSONObject;
                }
            } catch (Throwable th) {
                C0869f.m4155a("PlayablePlugin", "resetViewDataJsonByView error", th);
            }
        }
    }

    /* renamed from: a */
    public Context mo2681a() {
        return this.f3154y;
    }

    /* renamed from: a */
    public C0871g mo2683a(String str, String str2) {
        this.f3106K.put(str, str2);
        return this;
    }

    /* renamed from: b */
    public Map<String, String> mo2693b() {
        return this.f3106K;
    }

    /* renamed from: a */
    public C0871g mo2682a(String str) {
        this.f3103H = str;
        return this;
    }

    /* renamed from: b */
    public C0871g mo2691b(String str) {
        this.f3104I = str;
        return this;
    }

    /* renamed from: c */
    public JSONObject mo2698c() {
        return this.f3109N;
    }

    /* renamed from: c */
    public C0871g mo2696c(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.f3109N = jSONObject;
        } catch (Throwable th) {
            C0869f.m4155a("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    /* renamed from: d */
    public String mo2702d() {
        return this.f3104I;
    }

    /* renamed from: e */
    public String mo2705e() {
        return this.f3103H;
    }

    /* renamed from: d */
    public C0871g mo2701d(String str) {
        this.f3105J = str;
        return this;
    }

    /* renamed from: f */
    public String mo2708f() {
        return this.f3105J;
    }

    /* renamed from: e */
    public C0871g mo2704e(String str) {
        this.f3121Z = str;
        return this;
    }

    /* renamed from: g */
    public String mo2709g() {
        return this.f3121Z;
    }

    /* renamed from: a */
    public C0871g mo2685a(boolean z) {
        this.f3123aa = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.f3123aa);
            mo2689a("volumeChange", jSONObject);
        } catch (Throwable th) {
            C0869f.m4155a("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    /* renamed from: h */
    public boolean mo2712h() {
        return this.f3123aa;
    }

    /* renamed from: b */
    public C0871g mo2692b(boolean z) {
        if (this.f3124ab == z) {
            return this;
        }
        this.f3124ab = z;
        m4170d(z ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", (JSONObject) null);
        if (this.f3148s == -1 && this.f3124ab) {
            this.f3148s = System.currentTimeMillis();
            m4170d("PL_sdk_page_show", (JSONObject) null);
        }
        if (this.f3124ab) {
            this.f3147r = System.currentTimeMillis();
        } else if (this.f3147r != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f3147r;
            C0869f.m4154a("PlayablePlugin", "playable show time +" + currentTimeMillis);
            this.f3145p = this.f3145p + currentTimeMillis;
            this.f3147r = -1;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", this.f3124ab);
            mo2689a("viewableChange", jSONObject);
        } catch (Throwable th) {
            C0869f.m4155a("PlayablePlugin", "setViewable error", th);
        }
        return this;
    }

    /* renamed from: i */
    public boolean mo2714i() {
        return this.f3124ab;
    }

    /* renamed from: c */
    public C0871g mo2697c(boolean z) {
        this.f3125ac = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.f3125ac);
            mo2689a("change_playable_click", jSONObject);
        } catch (Throwable th) {
            C0869f.m4155a("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    /* renamed from: j */
    public Set<String> mo2715j() {
        return this.f3097B.mo2673a();
    }

    /* renamed from: a */
    public void mo2689a(String str, JSONObject jSONObject) {
        if (C0869f.m4156a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("CALL JS [");
            sb.append(str);
            sb.append("] ");
            sb.append(jSONObject != null ? jSONObject.toString() : "");
            C0869f.m4154a("PlayablePlugin", sb.toString());
        }
        C0840c cVar = this.f3099D;
        if (cVar != null) {
            cVar.mo215a(str, jSONObject);
        }
    }

    /* renamed from: k */
    public C0841d mo2716k() {
        return this.f3098C.mo210a();
    }

    /* renamed from: l */
    public C0836a mo2717l() {
        return this.f3098C;
    }

    /* renamed from: m */
    public JSONObject mo2718m() {
        return this.f3102G;
    }

    /* renamed from: n */
    public JSONObject mo2719n() {
        return this.f3107L;
    }

    /* renamed from: a */
    public C0871g mo2684a(JSONObject jSONObject) {
        this.f3107L = jSONObject;
        return this;
    }

    /* renamed from: f */
    public C0871g mo2707f(String str) {
        if (str != null) {
            try {
                int indexOf = str.indexOf("?");
                if (indexOf != -1) {
                    str = str.substring(0, indexOf);
                }
            } catch (Throwable unused) {
            }
        }
        this.f3108M = str;
        return this;
    }

    /* renamed from: o */
    public JSONObject mo2720o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", (double) this.f3110O);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(IabUtils.KEY_WIDTH, this.f3111P);
            jSONObject2.put(IabUtils.KEY_HEIGHT, this.f3112Q);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.f3114S);
            jSONObject3.put("y", this.f3113R);
            jSONObject3.put(IabUtils.KEY_WIDTH, this.f3115T);
            jSONObject3.put(IabUtils.KEY_HEIGHT, this.f3116U);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.f3118W);
            jSONObject4.put("y", this.f3117V);
            jSONObject4.put(IabUtils.KEY_WIDTH, this.f3119X);
            jSONObject4.put(IabUtils.KEY_HEIGHT, this.f3120Y);
            jSONObject.put("visible", jSONObject4);
        } catch (Throwable th) {
            C0869f.m4155a("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    /* renamed from: p */
    public void mo2721p() {
        this.f3098C.mo212b();
    }

    /* renamed from: g */
    public void mo2710g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f3149t = System.currentTimeMillis();
            jSONObject.put("playable_full_url", str);
            long j = 0;
            if (this.f3148s != -1) {
                j = this.f3149t - this.f3148s;
            }
            jSONObject.put("playable_page_show_duration", j);
        } catch (Throwable th) {
            C0869f.m4155a("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        m4170d("PL_sdk_html_load_start", jSONObject);
        if (this.f3140k && this.f3153x == C0880a.MAIN) {
            this.f3122a.postDelayed(this.f3131b, this.f3143n * 1000);
            this.f3122a.postDelayed(this.f3132c, this.f3144o * 1000);
            this.f3140k = false;
        }
    }

    /* renamed from: h */
    public void mo2711h(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f3150u = System.currentTimeMillis();
            jSONObject.put("playable_full_url", str);
            long j = 0;
            if (this.f3149t != -1) {
                j = this.f3150u - this.f3149t;
            }
            jSONObject.put("playable_html_load_start_duration", j);
        } catch (Throwable th) {
            C0869f.m4155a("PlayablePlugin", "reportUrlLoadFinish error", th);
        }
        m4170d("PL_sdk_html_load_finish", jSONObject);
        this.f3122a.removeCallbacks(this.f3131b);
        if (Build.VERSION.SDK_INT >= 19 && this.f3136g) {
            this.f3136g = false;
            this.f3155z.evaluateJavascript(mo2728w(), new ValueCallback<String>() {
                /* renamed from: a */
                public void onReceiveValue(String str) {
                    C0869f.m4154a("Playable_CrashMonitor", "加载注入js=" + str);
                }
            });
        }
        try {
            if (this.f3153x == C0880a.MAIN && this.f3142m && this.f3135f != null) {
                this.f3142m = false;
                this.f3135f.mo2669a(System.currentTimeMillis());
                this.f3133d.schedule(this.f3134e, 0, 1500);
                this.f3135f.mo2668a(1000);
            }
        } catch (Throwable th2) {
            C0869f.m4155a("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    /* renamed from: s */
    public void mo2724s() {
        this.f3122a.removeCallbacks(this.f3131b);
        this.f3122a.removeCallbacks(this.f3132c);
    }

    /* renamed from: b */
    public void mo2695b(JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.optBoolean("success", true) && this.f3141l) {
            this.f3141l = false;
            this.f3122a.removeCallbacks(this.f3131b);
            this.f3122a.removeCallbacks(this.f3132c);
            mo2686a(4, "素材渲染失败");
        }
    }

    /* renamed from: b */
    private void m4165b(int i, String str) {
        if (this.f3098C != null && m4176y()) {
            this.f3098C.mo2662a(i, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2686a(int i, String str) {
        m4165b(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            C0869f.m4155a("PlayablePlugin", "reportRenderFatal error", th);
        }
        m4170d("PL_sdk_global_faild", jSONObject);
    }

    /* renamed from: t */
    public void mo2725t() {
        C0869f.m4154a("Playable_CrashMonitor", "-- 检测到页面卡顿超过2s  需要上报");
        m4170d("PL_sdk_page_stuck", (JSONObject) null);
        Timer timer = this.f3133d;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2694b(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            m4170d(str, jSONObject);
        }
    }

    /* renamed from: b */
    private String m4164b(String str, String str2) {
        return String.format("rubeex://playable-lynx?accessKey=%1s&groupId=%2s&cardId=main", new Object[]{str, str2});
    }

    /* renamed from: d */
    private void m4170d(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("playable_event", str);
                jSONObject.put("playable_ts", System.currentTimeMillis());
                jSONObject.put("playable_viewable", this.f3124ab);
                jSONObject.put("playable_session_id", this.f3138i);
                if (this.f3153x == C0880a.MAIN) {
                    jSONObject.put("playable_url", this.f3108M);
                } else {
                    jSONObject.put("playable_url", m4164b(this.f3127ae, this.f3128af));
                }
                jSONObject.put("playable_is_prerender", this.f3126ad);
                jSONObject.put("playable_render_type", this.f3153x.ordinal());
                jSONObject.put("playable_sdk_version", "5.2.2");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ad_extra_data", jSONObject);
                jSONObject2.put("tag", this.f3139j);
                jSONObject2.put("nt", 4);
                jSONObject2.put("category", "umeng");
                jSONObject2.put("is_ad_event", "1");
                jSONObject2.put("refer", "playable");
                jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f3107L.opt("cid"));
                jSONObject2.put("log_extra", this.f3107L.opt("log_extra"));
                if (this.f3098C != null) {
                    if (this.f3153x == C0880a.MAIN) {
                        if (m4176y()) {
                            C0869f.m4154a("PlayablePlugin", "reportEvent by ActionProxy");
                            this.f3098C.mo2663a("playable_track", jSONObject2);
                            this.f3098C.mo214c(jSONObject);
                            return;
                        }
                    }
                    if (this.f3153x != C0880a.MAIN) {
                        C0869f.m4154a("PlayablePlugin", "reportEvent by ActionProxy");
                        this.f3098C.mo2663a("playable_track", jSONObject2);
                        this.f3098C.mo214c(jSONObject);
                        return;
                    }
                    C0869f.m4154a("PlayablePlugin", "reportEvent error no not playable url");
                    return;
                }
                C0869f.m4154a("PlayablePlugin", "reportEvent error no impl");
            } catch (Throwable th) {
                C0869f.m4155a("PlayablePlugin", "reportEvent error", th);
            }
        }
    }

    /* renamed from: i */
    public void mo2713i(String str) {
        this.f3122a.post(new Runnable() {
            public void run() {
                C0871g.m4174h(C0871g.this);
            }
        });
    }

    /* renamed from: u */
    public void mo2726u() {
        this.f3110O = 0.0f;
        this.f3111P = 0;
        this.f3112Q = 0;
        this.f3113R = 0;
        this.f3114S = 0;
        this.f3115T = 0;
        this.f3116U = 0;
        this.f3117V = 0;
        this.f3118W = 0;
        this.f3119X = 0;
        this.f3120Y = 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:3|4|5|(2:7|(1:9)(1:10))|11|12|13|14|(1:16)|17|(1:19)|22|23|24|25|(1:27)|28|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[Catch:{ all -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044 A[Catch:{ all -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084 A[Catch:{ all -> 0x00b9 }] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2727v() {
        /*
            r7 = this;
            boolean r0 = r7.f3129ag
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r7.f3129ag = r0
            r0 = 0
            r7.f3146q = r0
            r7.mo2726u()
            java.lang.ref.WeakReference<android.view.View> r0 = r7.f3096A     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0032 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0032
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0032 }
            r2 = 16
            if (r1 < r2) goto L_0x0029
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0032 }
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r7.f3130ah     // Catch:{ all -> 0x0032 }
            r0.removeOnGlobalLayoutListener(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0032
        L_0x0029:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0032 }
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r7.f3130ah     // Catch:{ all -> 0x0032 }
            r0.removeGlobalOnLayoutListener(r1)     // Catch:{ all -> 0x0032 }
        L_0x0032:
            com.bytedance.sdk.openadsdk.j.e r0 = r7.f3097B     // Catch:{ all -> 0x0037 }
            r0.mo2675b()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            java.util.Timer r0 = r7.f3133d     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0040
            java.util.Timer r0 = r7.f3133d     // Catch:{ all -> 0x004d }
            r0.cancel()     // Catch:{ all -> 0x004d }
        L_0x0040:
            com.bytedance.sdk.openadsdk.j.b r0 = r7.f3135f     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0064
            com.bytedance.sdk.openadsdk.j.b r0 = r7.f3135f     // Catch:{ all -> 0x004d }
            r0.mo2667a()     // Catch:{ all -> 0x004d }
            r0 = 0
            r7.f3135f = r0     // Catch:{ all -> 0x004d }
            goto L_0x0064
        L_0x004d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "发生crash -- "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Playable_CrashMonitor"
            com.bytedance.sdk.openadsdk.p048j.C0869f.m4154a(r1, r0)
        L_0x0064:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x007c }
            r0.<init>()     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "playable_all_times"
            int r2 = r7.f3151v     // Catch:{ all -> 0x007c }
            r0.put(r1, r2)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "playable_hit_times"
            int r2 = r7.f3152w     // Catch:{ all -> 0x007c }
            r0.put(r1, r2)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "PL_sdk_preload_times"
            r7.m4170d(r1, r0)     // Catch:{ all -> 0x007c }
        L_0x007c:
            long r0 = r7.f3147r     // Catch:{ all -> 0x00b9 }
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a8
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b9 }
            long r4 = r7.f3147r     // Catch:{ all -> 0x00b9 }
            long r0 = r0 - r4
            java.lang.String r4 = "PlayablePlugin"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
            r5.<init>()     // Catch:{ all -> 0x00b9 }
            java.lang.String r6 = "playable show time +"
            r5.append(r6)     // Catch:{ all -> 0x00b9 }
            r5.append(r0)     // Catch:{ all -> 0x00b9 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00b9 }
            com.bytedance.sdk.openadsdk.p048j.C0869f.m4154a(r4, r5)     // Catch:{ all -> 0x00b9 }
            long r4 = r7.f3145p     // Catch:{ all -> 0x00b9 }
            long r4 = r4 + r0
            r7.f3145p = r4     // Catch:{ all -> 0x00b9 }
            r7.f3147r = r2     // Catch:{ all -> 0x00b9 }
        L_0x00a8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00b9 }
            r0.<init>()     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "playable_user_play_duration"
            long r2 = r7.f3145p     // Catch:{ all -> 0x00b9 }
            r0.put(r1, r2)     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "PL_sdk_user_play_duration"
            r7.m4170d(r1, r0)     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p048j.C0871g.mo2727v():void");
    }

    /* renamed from: a */
    public void mo2687a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
            jSONObject.put("description", str);
            jSONObject.put("failingUrl", str2);
        } catch (Throwable th) {
            C0869f.m4155a("PlayablePlugin", "onWebReceivedError error", th);
        }
        m4170d("PL_sdk_html_load_error", jSONObject);
        if (this.f3141l) {
            this.f3141l = false;
            this.f3122a.removeCallbacks(this.f3131b);
            this.f3122a.removeCallbacks(this.f3132c);
            mo2686a(1, "容器加载失败");
        }
    }

    /* renamed from: a */
    public void mo2690a(boolean z, String str, int i) {
        if (z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
                jSONObject.put("failingUrl", str);
            } catch (Throwable th) {
                C0869f.m4155a("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            m4170d("PL_sdk_html_load_error", jSONObject);
            if (this.f3141l) {
                this.f3141l = false;
                this.f3122a.removeCallbacks(this.f3131b);
                this.f3122a.removeCallbacks(this.f3132c);
                mo2686a(1, "容器加载失败");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo2700c(JSONObject jSONObject) {
        this.f3098C.mo2664d(jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2703d(JSONObject jSONObject) {
        this.f3098C.mo2665e(jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo2706e(JSONObject jSONObject) {
        this.f3098C.mo2666f(jSONObject);
    }

    /* renamed from: c */
    public JSONObject mo2699c(String str, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "";
        if (C0869f.m4156a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayablePlugin JSB-REQ [");
            sb.append(str);
            sb.append("] ");
            sb.append(jSONObject != null ? jSONObject.toString() : str2);
            C0869f.m4154a("PlayablePlugin", sb.toString());
        }
        JSONObject a = this.f3097B.mo2674a(str, jSONObject);
        if (C0869f.m4156a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PlayablePlugin JSB-RSP [");
            sb2.append(str);
            sb2.append("] time:");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ");
            if (a != null) {
                str2 = a.toString();
            }
            sb2.append(str2);
            C0869f.m4154a("PlayablePlugin", sb2.toString());
        }
        return a;
    }

    /* renamed from: a */
    public static C0871g m4159a(Context context, WebView webView, C0840c cVar, C0836a aVar) {
        if (webView == null || cVar == null || aVar == null) {
            return null;
        }
        return new C0871g(context, webView, cVar, aVar);
    }
}
