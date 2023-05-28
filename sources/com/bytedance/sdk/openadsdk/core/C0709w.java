package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.adexpress.C10281b;
import com.bytedance.sdk.component.adexpress.p298b.C10294j;
import com.bytedance.sdk.component.adexpress.p300d.C10310b;
import com.bytedance.sdk.component.p293a.C10217a;
import com.bytedance.sdk.component.p293a.C10237l;
import com.bytedance.sdk.component.p293a.C10245r;
import com.bytedance.sdk.component.p307b.p308a.C10469e;
import com.bytedance.sdk.component.p313d.p316c.p320b.C10522a;
import com.bytedance.sdk.component.p313d.p322d.C10545d;
import com.bytedance.sdk.component.p313d.p322d.C10548g;
import com.bytedance.sdk.component.p323e.p326c.C10584a;
import com.bytedance.sdk.component.p323e.p326c.C10590d;
import com.bytedance.sdk.component.p323e.p326c.C10591e;
import com.bytedance.sdk.component.p323e.p326c.C10594g;
import com.bytedance.sdk.component.p323e.p327d.C10601c;
import com.bytedance.sdk.component.utils.C10634k;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10652x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.common.C0204a;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0597j;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p016b.C0410d;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0449b;
import com.bytedance.sdk.openadsdk.core.p021e.C0460j;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0727a;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0145i;
import com.bytedance.sdk.openadsdk.p000b.C0164u;
import com.bytedance.sdk.openadsdk.p038e.C0771b;
import com.bytedance.sdk.openadsdk.p038e.C0772c;
import com.bytedance.sdk.openadsdk.p038e.C0773d;
import com.bytedance.sdk.openadsdk.p039f.C0774a;
import com.bytedance.sdk.openadsdk.p039f.p040a.C0775a;
import com.bytedance.sdk.openadsdk.p039f.p040a.C0778b;
import com.bytedance.sdk.openadsdk.p039f.p040a.C0780c;
import com.bytedance.sdk.openadsdk.p039f.p040a.C0782d;
import com.bytedance.sdk.openadsdk.p039f.p040a.C0783e;
import com.bytedance.sdk.openadsdk.p041g.C0784a;
import com.bytedance.sdk.openadsdk.p041g.C0785b;
import com.bytedance.sdk.openadsdk.p041g.C0786c;
import com.bytedance.sdk.openadsdk.p041g.C0787d;
import com.bytedance.sdk.openadsdk.p041g.C0788e;
import com.bytedance.sdk.openadsdk.p041g.C0792h;
import com.bytedance.sdk.openadsdk.utils.C0967e;
import com.bytedance.sdk.openadsdk.utils.C0981i;
import com.bytedance.sdk.openadsdk.utils.C0983k;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.w */
/* compiled from: TTAndroidObject */
public class C0709w implements C10310b, C10652x.C10653a, C0771b {

    /* renamed from: g */
    private static final Map<String, Boolean> f2661g;

    /* renamed from: A */
    private C0785b f2662A;

    /* renamed from: B */
    private C0792h f2663B;

    /* renamed from: C */
    private boolean f2664C = true;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public List<C0477n> f2665D;

    /* renamed from: E */
    private HashMap<String, C0508i> f2666E;

    /* renamed from: F */
    private boolean f2667F = false;

    /* renamed from: G */
    private boolean f2668G = false;

    /* renamed from: H */
    private C0164u f2669H;

    /* renamed from: I */
    private C10245r f2670I;

    /* renamed from: J */
    private String f2671J;

    /* renamed from: K */
    private boolean f2672K = false;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C0727a f2673L;

    /* renamed from: a */
    protected Map<String, Object> f2674a;

    /* renamed from: b */
    boolean f2675b;

    /* renamed from: c */
    boolean f2676c = false;

    /* renamed from: d */
    private WeakReference<SSWebView> f2677d;

    /* renamed from: e */
    private C10652x f2678e;

    /* renamed from: f */
    private String f2679f;

    /* renamed from: h */
    private WeakReference<Context> f2680h;

    /* renamed from: i */
    private C0772c f2681i;

    /* renamed from: j */
    private String f2682j;

    /* renamed from: k */
    private WeakReference<View> f2683k;

    /* renamed from: l */
    private String f2684l;

    /* renamed from: m */
    private int f2685m;

    /* renamed from: n */
    private String f2686n;

    /* renamed from: o */
    private int f2687o;

    /* renamed from: p */
    private boolean f2688p = true;

    /* renamed from: q */
    private C0477n f2689q;

    /* renamed from: r */
    private C10294j f2690r;

    /* renamed from: s */
    private C0597j f2691s;

    /* renamed from: t */
    private JSONObject f2692t;

    /* renamed from: u */
    private C0773d f2693u;

    /* renamed from: v */
    private C0784a f2694v;

    /* renamed from: w */
    private C0788e f2695w;

    /* renamed from: x */
    private C0787d f2696x;

    /* renamed from: y */
    private JSONObject f2697y;

    /* renamed from: z */
    private C0410d f2698z;

    /* renamed from: com.bytedance.sdk.openadsdk.core.w$a */
    /* compiled from: TTAndroidObject */
    public static class C0719a {

        /* renamed from: a */
        public String f2714a;

        /* renamed from: b */
        public String f2715b;

        /* renamed from: c */
        public String f2716c;

        /* renamed from: d */
        public JSONObject f2717d;

        /* renamed from: e */
        public int f2718e;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f2661g = concurrentHashMap;
        concurrentHashMap.put(C10584a.a1657027613243dc("lne\\asci|"), Boolean.TRUE);
        f2661g.put(C10584a.a1657027613243dc("pskueqc"), Boolean.TRUE);
        f2661g.put(C10584a.a1657027613243dc("dhqseqeoWdoxlij"), Boolean.TRUE);
        f2661g.put(C10584a.a1657027613243dc("ctqwkhYb~ld"), Boolean.TRUE);
        f2661g.put(C10584a.a1657027613243dc("lne\\asci|V|8"), Boolean.TRUE);
    }

    public C0709w(Context context) {
        this.f2680h = new WeakReference<>(context);
        this.f2678e = new C10652x(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    private void m3600a(final C0719a aVar, final JSONObject jSONObject) {
        if (aVar != null) {
            try {
                mo2360a(aVar.f2717d, (C0786c) new C0786c() {
                    /* renamed from: a */
                    public void mo2408a(boolean z, List<C0477n> list) {
                        if (z) {
                            try {
                                jSONObject.put(C10548g.g1657027613257dc("csgbplpb{"), C0709w.m3608b(list));
                                C0709w.this.m3610b(aVar.f2715b, jSONObject);
                            } catch (Exception unused) {
                            }
                        } else {
                            C0709w.this.m3610b(aVar.f2715b, jSONObject);
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m3604a(String str, boolean z) {
        if (this.f2669H != null && !TextUtils.isEmpty(str)) {
            if (z) {
                this.f2669H.mo463a(str);
            } else {
                this.f2669H.mo470b(str);
            }
        }
    }

    @JProtect
    /* renamed from: a */
    private void m3605a(JSONObject jSONObject, int i) throws Exception {
        String g1657027613239dc;
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String put : m3631q()) {
            jSONArray.put(put);
        }
        jSONObject.put(C10594g.g1657027613239dc("aqrMehc"), C0204a.m837a());
        jSONObject.put(C10594g.g1657027613239dc("iolfvDvwFhgn"), C0204a.m842e());
        jSONObject.put(C10594g.g1657027613239dc("ahf"), C0204a.m839b());
        jSONObject.put(C10594g.g1657027613239dc("seiF`lrngg"), C0204a.m840c());
        jSONObject.put(C10594g.g1657027613239dc("aqrUawungg"), C0204a.m841d());
        jSONObject.put(C10594g.g1657027613239dc("ndvW}uc"), C0204a.m843f());
        jSONObject.put(C10594g.g1657027613239dc("strskwrKaz~"), jSONArray);
        jSONObject.put(C10594g.g1657027613239dc("ddtjg`Oc"), C0204a.m838a(C0558m.m2663a()));
        if (C0967e.m4492b(C0558m.m2663a())) {
            g1657027613239dc = C10594g.g1657027613239dc("ddtjg`Ywdh~mcc");
            str = "AofqklbXXhn";
        } else {
            g1657027613239dc = C10594g.g1657027613239dc("ddtjg`Ywdh~mcc");
            str = "Aofqklb";
        }
        jSONObject.put(g1657027613239dc, C10594g.g1657027613239dc(str));
        jSONObject.put(C10594g.g1657027613239dc("ddtjg`Ysqyo"), Build.VERSION.RELEASE);
    }

    @JProtect
    /* renamed from: a */
    private boolean m3606a(String str, int i, C0460j jVar) {
        HashMap<String, C0508i> hashMap;
        C0508i iVar;
        if (TextUtils.isEmpty(str) || (hashMap = this.f2666E) == null || (iVar = hashMap.get(str)) == null) {
            return false;
        }
        iVar.mo1629a(i, jVar);
        return true;
    }

    /* renamed from: b */
    public static JSONArray m3608b(List<C0477n> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(list.get(i).mo1397ar());
        }
        return jSONArray;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3610b(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C10522a.a1657027613264dc("_^opcZr~xl"), C10522a.a1657027613264dc("c`nofdel"));
            jSONObject2.put(C10522a.a1657027613264dc("_^abhidfkbUbh"), str);
            if (jSONObject != null) {
                jSONObject2.put(C10522a.a1657027613264dc("_^rbvdkt"), jSONObject);
            }
            m3632q(jSONObject2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m3612c(String str, JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C10545d.d1657027613261dc("_^opcZr~xl"), C10545d.d1657027613261dc("ewgmp"));
                jSONObject2.put(C10545d.d1657027613261dc("_^guakrXam"), str);
                if (jSONObject != null) {
                    jSONObject2.put(C10545d.d1657027613261dc("_^rbvdkt"), jSONObject);
                }
                m3632q(jSONObject2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private void m3613e(JSONObject jSONObject) throws Exception {
        if (!TextUtils.isEmpty(this.f2682j)) {
            jSONObject.put(C10522a.a1657027613264dc("chf"), this.f2682j);
        }
        if (!TextUtils.isEmpty(this.f2684l)) {
            jSONObject.put(C10522a.a1657027613264dc("lne\\a}rui"), this.f2684l);
        }
        if (!TextUtils.isEmpty(this.f2686n)) {
            jSONObject.put(C10522a.a1657027613264dc("dnumhjgcW|xg"), this.f2686n);
        }
        jSONObject.put(C10522a.a1657027613264dc("db"), TextUtils.isEmpty(C0558m.m2673h().mo1722w()) ? C0558m.m2673h().mo1722w() : C10522a.a1657027613264dc("SF"));
        jSONObject.put(C10522a.a1657027613264dc("l`ldqdab"), C0996u.m4679k(C0558m.m2663a()));
    }

    /* renamed from: f */
    private void m3614f(JSONObject jSONObject) throws Exception {
        if (!TextUtils.isEmpty(C0480p.m2191b(this.f2689q))) {
            jSONObject.put(C10590d.d1657027613220dc("pmczegjbWz~r`h"), C0480p.m2191b(this.f2689q));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:4|5|6|(1:8)|9|10|(1:24)(2:12|(2:14|25)(2:15|23))|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0067 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0071 A[Catch:{ Exception -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3615g(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "TUCm`winlFhainz"
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x008e }
            r2 = 2
            byte[] r2 = android.util.Base64.decode(r9, r2)     // Catch:{ Exception -> 0x008e }
            r1.<init>(r2)     // Catch:{ Exception -> 0x008e }
            java.lang.String r2 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r0)     // Catch:{ Exception -> 0x008e }
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x008e }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x008e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x008e }
            int r1 = r2.length()     // Catch:{ Exception -> 0x008e }
            r3 = 0
        L_0x001d:
            if (r3 >= r1) goto L_0x00bf
            com.bytedance.sdk.openadsdk.core.w$a r4 = new com.bytedance.sdk.openadsdk.core.w$a     // Catch:{ Exception -> 0x008e }
            r4.<init>()     // Catch:{ Exception -> 0x008e }
            org.json.JSONObject r5 = r2.optJSONObject(r3)     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x0067
            java.lang.String r6 = "_^opcZr~xl"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r6)     // Catch:{ all -> 0x0067 }
            r7 = 0
            java.lang.String r6 = r5.optString(r6, r7)     // Catch:{ all -> 0x0067 }
            r4.f2714a = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "_^abhidfkbUbh"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r6)     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = r5.optString(r6, r7)     // Catch:{ all -> 0x0067 }
            r4.f2715b = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "ftl`"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r6)     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = r5.optString(r6)     // Catch:{ all -> 0x0067 }
            r4.f2716c = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "p`pbiv"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r6)     // Catch:{ all -> 0x0067 }
            org.json.JSONObject r6 = r5.optJSONObject(r6)     // Catch:{ all -> 0x0067 }
            r4.f2717d = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "JRQGO"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r6)     // Catch:{ all -> 0x0067 }
            int r5 = r5.optInt(r6)     // Catch:{ all -> 0x0067 }
            r4.f2718e = r5     // Catch:{ all -> 0x0067 }
        L_0x0067:
            java.lang.String r5 = r4.f2714a     // Catch:{ Exception -> 0x008e }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x008e }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x008e }
            if (r5 != 0) goto L_0x008b
            java.lang.String r5 = r4.f2716c     // Catch:{ Exception -> 0x008e }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x008e }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x008e }
            if (r5 == 0) goto L_0x007c
            goto L_0x008b
        L_0x007c:
            com.bytedance.sdk.component.utils.x r5 = r8.f2678e     // Catch:{ Exception -> 0x008e }
            r6 = 11
            android.os.Message r5 = r5.obtainMessage(r6)     // Catch:{ Exception -> 0x008e }
            r5.obj = r4     // Catch:{ Exception -> 0x008e }
            com.bytedance.sdk.component.utils.x r4 = r8.f2678e     // Catch:{ Exception -> 0x008e }
            r4.sendMessage(r5)     // Catch:{ Exception -> 0x008e }
        L_0x008b:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x008e:
            boolean r1 = com.bytedance.sdk.component.utils.C10638l.m31232a()
            if (r1 == 0) goto L_0x00b2
            java.lang.String r0 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "f`koaa&sg)zj~~k/zbpa}qqr8ti|<lkzUD\u0002"
            java.lang.String r2 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r2)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.bytedance.sdk.component.utils.C10638l.m31241d(r0, r9)
            goto L_0x00bf
        L_0x00b2:
            java.lang.String r9 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r0)
            java.lang.String r0 = "f`koaa&sg)zj~~k/zbpa}qqr8ti|<lkzUD"
            java.lang.String r0 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r0)
            com.bytedance.sdk.component.utils.C10638l.m31241d(r9, r0)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0709w.m3615g(java.lang.String):void");
    }

    /* renamed from: g */
    private void m3616g(JSONObject jSONObject) {
        C0164u uVar;
        if (jSONObject != null && (uVar = this.f2669H) != null) {
            uVar.mo472b(jSONObject);
        }
    }

    /* renamed from: h */
    private void m3617h(JSONObject jSONObject) {
        C0785b bVar = this.f2662A;
        if (bVar != null && jSONObject != null) {
            bVar.mo112a(jSONObject.optBoolean(C10522a.a1657027613264dc("irPfjacu[|i"), false), jSONObject.optInt(C10522a.a1657027613264dc("cnff"), -1), jSONObject.optString(C10522a.a1657027613264dc("mre"), ""));
        }
    }

    /* renamed from: h */
    private boolean m3618h(String str) {
        return TextUtils.isEmpty(str) || !C10545d.d1657027613261dc("cmk`oZis`lx").equals(str) || mo2394k();
    }

    /* renamed from: i */
    private String m3619i(String str) {
        if (this.f2690r != null) {
            return str;
        }
        int i = this.f2685m;
        while (true) {
            char c = '^';
            char c2 = '}';
            while (true) {
                switch (c) {
                    case '^':
                        break;
                    case '_':
                        switch (c2) {
                            case '^':
                            case '`':
                                break;
                            case '_':
                                break;
                        }
                    case '`':
                        break;
                }
                switch (c2) {
                    case '7':
                    case '9':
                        break;
                    case '8':
                        break;
                }
                c = '_';
                c2 = '_';
            }
        }
        return C0996u.m4615a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m3620i(JSONObject jSONObject) {
        if (this.f2691s != null && jSONObject != null) {
            try {
                this.f2691s.mo130a(jSONObject.optBoolean(C10601c.c1657027613239dc("mtvf"), false));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r0 = r1.length();
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3621j(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "bxvf`dhdm3%$"
            java.lang.String r0 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r0)
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            java.lang.String r0 = "bxvf`dhdm3%$hd}qeq{Kxsdkx}~3"
            java.lang.String r0 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r0)
            java.lang.String r1 = "bxvf`dhdm3%$|gyqew<gpbe}jowh2"
            java.lang.String r1 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r1)
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0032
            android.webkit.WebView r3 = r2.m3627o()     // Catch:{ Exception -> 0x0064 }
            if (r3 == 0) goto L_0x0064
            java.lang.String r0 = "j`tbwftnx}0_cxzfq~X@Vgs|4Dzxj|HpWFQ@\u000e\u000e"
            java.lang.String r0 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r0)     // Catch:{ Exception -> 0x0064 }
            com.bytedance.sdk.component.utils.C10634k.m31223a(r3, r0)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0064
        L_0x0032:
            boolean r0 = r3.startsWith(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
            int r0 = r1.length()     // Catch:{ Exception -> 0x0064 }
            r1 = 38
            int r1 = r3.indexOf(r1, r0)     // Catch:{ Exception -> 0x0064 }
            if (r1 > 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.String r0 = r3.substring(r0, r1)     // Catch:{ Exception -> 0x0064 }
            int r1 = r1 + 1
            java.lang.String r3 = r3.substring(r1)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r1 = "SBGMAZ@B\\JBZYH[J"
            java.lang.String r1 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x0064 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
            int r0 = r3.length()     // Catch:{ Exception -> 0x0064 }
            if (r0 <= 0) goto L_0x0064
            r2.m3615g((java.lang.String) r3)     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0709w.m3621j(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m3622j(JSONObject jSONObject) {
        if (this.f2691s != null && jSONObject != null) {
            try {
                this.f2691s.mo129a(jSONObject.optInt(C10601c.c1657027613239dc("sucwaQwm"), -1));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: k */
    private boolean m3623k(JSONObject jSONObject) {
        C0597j jVar = this.f2691s;
        if (!(jVar == null || jSONObject == null)) {
            double c = (double) jVar.mo133c();
            int d = this.f2691s.mo134d();
            try {
                jSONObject.put(C10594g.g1657027613239dc("ctpqakrSado"), c / 1000.0d);
                jSONObject.put(C10594g.g1657027613239dc("sucwa"), d);
                String g1657027613239dc = C10594g.g1657027613239dc("TUCm`winlFhainz");
                C10638l.m31235b(g1657027613239dc, C10594g.g1657027613239dc("ctpqakrSado'yo{u+") + d);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0118, code lost:
        switch(r2) {
            case 40: goto L_0x0118;
            case 41: goto L_0x011c;
            case 42: goto L_0x011f;
            default: goto L_0x011b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011c, code lost:
        switch(r1) {
            case 70: goto L_0x0102;
            case 71: goto L_0x0102;
            case 72: goto L_0x0112;
            default: goto L_0x011f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011f, code lost:
        r4 = '6';
        r2 = 'Q';
        r1 = '[';
     */
    @com.bytedance.JProtect
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3624l(org.json.JSONObject r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            com.bytedance.sdk.component.adexpress.b.j r2 = r0.f2690r
            if (r2 == 0) goto L_0x0139
            if (r1 != 0) goto L_0x000c
            goto L_0x0139
        L_0x000c:
            com.bytedance.sdk.component.adexpress.b.m r2 = new com.bytedance.sdk.component.adexpress.b.m
            r2.<init>()
            r3 = 1
            r2.mo63209a((int) r3)
            java.lang.String r4 = "irPfjacu[|i"
            java.lang.String r4 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r4)     // Catch:{ Exception -> 0x0128 }
            boolean r4 = r1.optBoolean(r4)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r5 = "AeQj~`"
            java.lang.String r5 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r5)     // Catch:{ Exception -> 0x0128 }
            org.json.JSONObject r5 = r1.optJSONObject(r5)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r6 = "hdkdlq"
            java.lang.String r7 = "whfwl"
            r8 = 0
            if (r5 == 0) goto L_0x0042
            java.lang.String r8 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r7)     // Catch:{ Exception -> 0x0128 }
            double r8 = r5.optDouble(r8)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r10 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r6)     // Catch:{ Exception -> 0x0128 }
            double r10 = r5.optDouble(r10)     // Catch:{ Exception -> 0x0128 }
            goto L_0x0043
        L_0x0042:
            r10 = r8
        L_0x0043:
            java.lang.String r5 = "vhffkLhag"
            java.lang.String r5 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r5)     // Catch:{ Exception -> 0x0128 }
            org.json.JSONObject r5 = r1.optJSONObject(r5)     // Catch:{ Exception -> 0x0128 }
            if (r5 == 0) goto L_0x00ca
            java.lang.String r12 = "x"
            java.lang.String r12 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r12)     // Catch:{ Exception -> 0x00c5 }
            double r12 = r5.optDouble(r12)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r14 = "y"
            java.lang.String r14 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r14)     // Catch:{ Exception -> 0x00c5 }
            double r14 = r5.optDouble(r14)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r7 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r7)     // Catch:{ Exception -> 0x00c5 }
            r16 = r4
            double r3 = r5.optDouble(r7)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r6)     // Catch:{ Exception -> 0x00c5 }
            double r6 = r5.optDouble(r6)     // Catch:{ Exception -> 0x00c5 }
            boolean r17 = r0.m3625m(r5)     // Catch:{ Exception -> 0x00c5 }
            if (r17 == 0) goto L_0x00b6
            java.lang.String r17 = "bnpgawTfl`xXb~Cuwf"
            java.lang.String r0 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r17)     // Catch:{ Exception -> 0x00c5 }
            r17 = r10
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.mo63208a((float) r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "bnpgawTfl`xXb~]yvzg"
            java.lang.String r0 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r0)     // Catch:{ Exception -> 0x00c5 }
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.mo63215b((float) r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "bnpgawTfl`xNbz{|^vra"
            java.lang.String r0 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r0)     // Catch:{ Exception -> 0x00c5 }
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.mo63220c((float) r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "bnpgawTfl`xNbz{|@zs}b"
            java.lang.String r0 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r0)     // Catch:{ Exception -> 0x00c5 }
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.mo63223d((float) r0)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00b8
        L_0x00b6:
            r17 = r10
        L_0x00b8:
            r2.mo63219c((double) r12)     // Catch:{ Exception -> 0x00c5 }
            r2.mo63222d((double) r14)     // Catch:{ Exception -> 0x00c5 }
            r2.mo63225e(r3)     // Catch:{ Exception -> 0x00c5 }
            r2.mo63227f(r6)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00ce
        L_0x00c5:
            r1 = 101(0x65, float:1.42E-43)
            r0 = r19
            goto L_0x012a
        L_0x00ca:
            r16 = r4
            r17 = r10
        L_0x00ce:
            java.lang.String r0 = "mdqpebc"
            java.lang.String r0 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r0)     // Catch:{ Exception -> 0x0126 }
            r3 = 101(0x65, float:1.42E-43)
            java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C0492g.m2254a(r3)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r0 = r1.optString(r0, r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r4 = "cnff"
            java.lang.String r4 = com.bytedance.sdk.component.p313d.p322d.C10545d.d1657027613261dc(r4)     // Catch:{ Exception -> 0x0126 }
            int r1 = r1.optInt(r4, r3)     // Catch:{ Exception -> 0x0126 }
            r3 = r16
            r2.mo63211a((boolean) r3)     // Catch:{ Exception -> 0x0126 }
            r2.mo63207a((double) r8)     // Catch:{ Exception -> 0x0126 }
            r8 = r17
            r2.mo63214b((double) r8)     // Catch:{ Exception -> 0x0126 }
            r2.mo63210a((java.lang.String) r0)     // Catch:{ Exception -> 0x0126 }
            r2.mo63216b((int) r1)     // Catch:{ Exception -> 0x0126 }
            r0 = r19
            com.bytedance.sdk.component.adexpress.b.j r1 = r0.f2690r     // Catch:{ Exception -> 0x0128 }
            r1.mo63174a(r2)     // Catch:{ Exception -> 0x0128 }
        L_0x0102:
            r1 = -84
            r3 = 17
            r2 = 17
        L_0x0108:
            if (r2 == r3) goto L_0x0110
        L_0x010a:
            switch(r1) {
                case 89: goto L_0x0102;
                case 90: goto L_0x0102;
                case 91: goto L_0x0139;
                default: goto L_0x010d;
            }
        L_0x010d:
            r1 = 90
            goto L_0x010a
        L_0x0110:
            r4 = 11
        L_0x0112:
            r4 = 56
        L_0x0114:
            switch(r4) {
                case 54: goto L_0x0108;
                case 55: goto L_0x0118;
                case 56: goto L_0x011f;
                default: goto L_0x0117;
            }
        L_0x0117:
            goto L_0x0112
        L_0x0118:
            switch(r2) {
                case 40: goto L_0x0118;
                case 41: goto L_0x011c;
                case 42: goto L_0x011f;
                default: goto L_0x011b;
            }
        L_0x011b:
            goto L_0x011f
        L_0x011c:
            switch(r1) {
                case 70: goto L_0x0102;
                case 71: goto L_0x0102;
                case 72: goto L_0x0112;
                default: goto L_0x011f;
            }
        L_0x011f:
            r4 = 54
            r2 = 81
            r1 = 91
            goto L_0x0114
        L_0x0126:
            r0 = r19
        L_0x0128:
            r1 = 101(0x65, float:1.42E-43)
        L_0x012a:
            r2.mo63216b((int) r1)
            java.lang.String r1 = com.bytedance.sdk.openadsdk.core.C0492g.m2254a(r1)
            r2.mo63210a((java.lang.String) r1)
            com.bytedance.sdk.component.adexpress.b.j r1 = r0.f2690r
            r1.mo63174a(r2)
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0709w.m3624l(org.json.JSONObject):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: m */
    private boolean m3625m(org.json.JSONObject r5) {
        /*
            r4 = this;
            java.lang.String r0 = "bnpgawTfl`xXb~Cuwf"
            java.lang.String r0 = com.bytedance.sdk.component.p323e.p327d.C10601c.c1657027613239dc(r0)
            boolean r0 = r5.has(r0)
            r1 = 0
            r2 = 56
            r3 = 60
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "bnpgawTfl`xNbz{|^vra"
            java.lang.String r0 = com.bytedance.sdk.component.p323e.p327d.C10601c.c1657027613239dc(r0)
            boolean r0 = r5.has(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "bnpgawTfl`xXb~]yvzg"
            java.lang.String r0 = com.bytedance.sdk.component.p323e.p327d.C10601c.c1657027613239dc(r0)
            boolean r0 = r5.has(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "bnpgawTfl`xNbz{|@zs}b"
            java.lang.String r0 = com.bytedance.sdk.component.p323e.p327d.C10601c.c1657027613239dc(r0)
            boolean r5 = r5.has(r0)
            goto L_0x0043
        L_0x0034:
            r5 = 0
        L_0x0035:
            r0 = 41
        L_0x0037:
            switch(r0) {
                case 40: goto L_0x003b;
                case 41: goto L_0x0055;
                case 42: goto L_0x0035;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0035
        L_0x003b:
            switch(r3) {
                case 81: goto L_0x003f;
                case 82: goto L_0x0049;
                case 83: goto L_0x0047;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0055
        L_0x003f:
            switch(r2) {
                case 29: goto L_0x0047;
                case 30: goto L_0x0047;
                case 31: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x0049
        L_0x0043:
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x004d
        L_0x0047:
            r1 = r5
            goto L_0x0055
        L_0x0049:
            switch(r2) {
                case 39: goto L_0x004d;
                case 40: goto L_0x0034;
                case 41: goto L_0x0055;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0052
        L_0x004d:
            r0 = 40
            r3 = 83
            goto L_0x0037
        L_0x0052:
            r2 = 39
            goto L_0x0049
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0709w.m3625m(org.json.JSONObject):boolean");
    }

    /* renamed from: n */
    private void m3626n(JSONObject jSONObject) {
        if (jSONObject != null) {
            C10638l.m31235b(C10601c.c1657027613239dc("TUCm`winlFhainz"), C10601c.c1657027613239dc("TUCm`winlFhainz/xp|wxpdSaw{vu~JmABI"));
            try {
                Uri parse = Uri.parse(jSONObject.optString(C10601c.c1657027613239dc("tsc`oAgsi")));
                if (C10601c.c1657027613239dc("bxvf`dhdm").equals(parse.getScheme().toLowerCase())) {
                    C0981i.m4547a(parse, this);
                    char c = '(';
                    while (true) {
                        switch (c) {
                            case ')':
                                return;
                            default:
                                c = ')';
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: o */
    private WebView m3627o() {
        WeakReference<SSWebView> weakReference = this.f2677d;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return ((SSWebView) this.f2677d.get()).getWebView();
    }

    /* renamed from: o */
    private void m3628o(JSONObject jSONObject) {
        if (jSONObject != null && this.f2693u != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(C10591e.e1657027613237dc("tdobmUthl|iEi}"));
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    this.f2693u.mo169a(false, (JSONArray) null);
                    return;
                }
                this.f2693u.mo169a(true, optJSONArray);
                char c = '\'';
                while (true) {
                    switch (c) {
                        case '&':
                            return;
                        default:
                            c = '&';
                    }
                }
            } catch (Exception unused) {
                this.f2693u.mo169a(false, (JSONArray) null);
            }
        }
    }

    @JProtect
    /* renamed from: p */
    private JSONObject m3629p() {
        try {
            View view = (View) this.f2683k.get();
            View view2 = (View) this.f2677d.get();
            if (view != null) {
                if (view2 != null) {
                    int[] b = C1002v.m4738b(view);
                    int[] b2 = C1002v.m4738b(view2);
                    if (b != null) {
                        if (b2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(C10590d.d1657027613220dc("x"), C1002v.m4745d(C0558m.m2663a(), (float) (b[0] - b2[0])));
                            jSONObject.put(C10590d.d1657027613220dc("y"), C1002v.m4745d(C0558m.m2663a(), (float) (b[1] - b2[1])));
                            jSONObject.put(C10590d.d1657027613220dc("w"), C1002v.m4745d(C0558m.m2663a(), (float) view.getWidth()));
                            jSONObject.put(C10590d.d1657027613220dc("h"), C1002v.m4745d(C0558m.m2663a(), (float) view.getHeight()));
                            jSONObject.put(C10590d.d1657027613220dc("irG{mvr"), true);
                            return jSONObject;
                        }
                    }
                    C10638l.m31242e(C10590d.d1657027613220dc("TUCm`winlFhainz"), C10590d.d1657027613220dc("sdv@hjubJ|~ccGav~2vfgye8iuhuiwpN\u0001MQ\u0004RCE~@O\\|B]FDX]]\u0014\\E\u0017VLVW"));
                    return null;
                }
            }
            C10638l.m31242e(C10590d.d1657027613220dc("TUCm`winlFhainz"), C10590d.d1657027613220dc("sdv@hjubJ|~ccGav~2vfgye8zvtox\\jTUMM\u0004LU\u0007F\\FG"));
            return null;
        } catch (Throwable th) {
            C10638l.m31230a(C10590d.d1657027613220dc("TUCm`winlFhainz"), C10590d.d1657027613220dc("sdv@hjubJ|~ccGav~2vfgye"), th);
            return null;
        }
    }

    /* renamed from: p */
    private boolean m3630p(JSONObject jSONObject) {
        try {
            jSONObject.put(C10591e.e1657027613237dc("csgbplpb{"), m3608b(this.f2665D));
            while (true) {
                char c = '_';
                char c2 = '_';
                while (true) {
                    switch (c) {
                        case '^':
                            if (c2 != '\'') {
                                break;
                            } else {
                                continue;
                            }
                        case '_':
                            switch (c2) {
                                case '^':
                                case '`':
                                    continue;
                                case '_':
                                    break;
                            }
                        case '`':
                            break;
                    }
                    switch (c2) {
                        case '7':
                        case '8':
                        case '9':
                            break;
                    }
                    c = '^';
                    c2 = '}';
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: q */
    private List<String> m3631q() {
        return Arrays.asList(new String[]{C0145i.i1657027613257dc("aqrJjci"), C0145i.i1657027613257dc("aeKmbj"), C0145i.i1657027613257dc("gdvWahvki}oBbka"), C0145i.i1657027613257dc("gdvWaHgnImy")});
    }

    /* renamed from: q */
    private void m3632q(JSONObject jSONObject) {
        WebView o;
        if (jSONObject != null && (o = m3627o()) != null) {
            String str = C10522a.a1657027613264dc("j`tbwftnx}0_cxzfq~X@Vgs|4Dt|p{LDoFWVG@MoXDAyAZDXS\\\u001c") + jSONObject.toString() + C10522a.a1657027613264dc(")");
            C10634k.m31223a(o, str);
            if (C10638l.m31232a()) {
                C10638l.m31229a(C10522a.a1657027613264dc("TUCm`winlFhainz"), C10522a.a1657027613264dc("jr]nwb&") + str);
            }
        }
    }

    /* renamed from: r */
    private JSONObject m3633r(JSONObject jSONObject) {
        if (this.f2674a != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String optString = jSONObject.optString(C10590d.d1657027613220dc("ae]f|qtfWmkm"), (String) null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                for (Map.Entry next : this.f2674a.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
                jSONObject.put(C10590d.d1657027613220dc("ae]f|qtfWmkm"), jSONObject2.toString());
            } catch (Exception e) {
                C10638l.m31234b(e.toString());
            }
        }
        return jSONObject;
    }

    /* renamed from: r */
    private void m3634r() {
        C0792h hVar = this.f2663B;
        if (hVar != null) {
            hVar.mo818a();
        }
    }

    /* renamed from: s */
    private void m3635s() {
        C0792h hVar = this.f2663B;
        if (hVar != null) {
            hVar.mo819b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m3636t() {
        C0597j jVar = this.f2691s;
        if (jVar != null) {
            jVar.mo128a();
            while (true) {
                char c = 15;
                while (true) {
                    switch (c) {
                        case 13:
                        case 14:
                            return;
                        default:
                            c = 14;
                    }
                }
            }
        }
    }

    /* renamed from: u */
    private void m3637u() {
        WeakReference<Context> weakReference = this.f2680h;
        if (weakReference != null && weakReference.get() != null && !TextUtils.isEmpty(C0558m.m2673h().mo1718s())) {
            TTWebsiteActivity.m414a((Context) this.f2680h.get(), this.f2689q, this.f2671J);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0 A[Catch:{ Exception -> 0x00c2 }] */
    @com.bytedance.JProtect
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m3638v() {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.sdk.openadsdk.core.i.f r1 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()
            if (r1 == 0) goto L_0x00c2
            com.bytedance.sdk.openadsdk.core.e.n r1 = r10.f2689q     // Catch:{ Exception -> 0x00c2 }
            int r1 = com.bytedance.sdk.openadsdk.utils.C0996u.m4657f((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f2689q     // Catch:{ Exception -> 0x00c2 }
            int r2 = com.bytedance.sdk.openadsdk.utils.C0996u.m4653e((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r2)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.i.f r3 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2 }
            int r3 = r3.mo1690f((java.lang.String) r4)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.i.f r4 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()     // Catch:{ Exception -> 0x00c2 }
            int r4 = r4.mo1686e((int) r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.i.f r5 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2 }
            boolean r5 = r5.mo1682c((java.lang.String) r6)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r6 = r10.f2689q     // Catch:{ Exception -> 0x00c2 }
            boolean r6 = com.bytedance.sdk.openadsdk.core.p021e.C0477n.m2012c((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r6)     // Catch:{ Exception -> 0x00c2 }
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L_0x0051
            com.bytedance.sdk.openadsdk.core.i.f r6 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2 }
            int r6 = r6.mo1702j((java.lang.String) r9)     // Catch:{ Exception -> 0x00c2 }
            if (r6 != r7) goto L_0x0051
            r6 = 1
            goto L_0x0052
        L_0x0051:
            r6 = 0
        L_0x0052:
            r9 = 7
            if (r2 == r9) goto L_0x0063
            r9 = 8
            if (r2 != r9) goto L_0x005a
            goto L_0x0063
        L_0x005a:
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()     // Catch:{ Exception -> 0x00c2 }
            boolean r1 = r2.mo1676a((int) r1)     // Catch:{ Exception -> 0x00c2 }
            goto L_0x006b
        L_0x0063:
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()     // Catch:{ Exception -> 0x00c2 }
            boolean r1 = r2.mo1678b((int) r1)     // Catch:{ Exception -> 0x00c2 }
        L_0x006b:
            java.lang.String r2 = "vnk`aZehf}xd`"
            java.lang.String r2 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r2)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "rw]polvX|`gn"
            java.lang.String r1 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "fw]polvX{ae|"
            java.lang.String r1 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r5)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "iw]polvX|`gn"
            java.lang.String r1 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r4)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "simt[aotd`an"
            java.lang.String r1 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f2689q     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00a2
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f2689q     // Catch:{ Exception -> 0x00c2 }
            boolean r2 = r2.mo1395ap()     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r7 = 0
        L_0x00a3:
            r0.put(r1, r7)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "vhffkZgciy~jxdaa"
            java.lang.String r1 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f2689q     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00b6
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f2689q     // Catch:{ Exception -> 0x00c2 }
            int r8 = r2.mo1469t()     // Catch:{ Exception -> 0x00c2 }
        L_0x00b6:
            r0.put(r1, r8)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "sjks[fnffnoTxbQl|~av"
            java.lang.String r1 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r6)     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0709w.m3638v():org.json.JSONObject");
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m3639w() {
        Context context;
        List<C0477n> list = this.f2665D;
        if (list != null && list.size() > 0) {
            this.f2666E = new HashMap<>();
            View view = null;
            WeakReference<SSWebView> weakReference = this.f2677d;
            if (weakReference != null) {
                view = (View) weakReference.get();
            }
            WeakReference<Context> weakReference2 = this.f2680h;
            if (weakReference2 != null && (context = (Context) weakReference2.get()) != null) {
                for (C0477n next : this.f2665D) {
                    this.f2666E.put(next.mo1345Y(), new C0508i(context, next, view));
                }
            }
        }
    }

    /* renamed from: x */
    private boolean m3640x() {
        C0477n nVar = this.f2689q;
        if (nVar == null || nVar.mo1390ak() == null || C0480p.m2190a(this.f2689q) || this.f2667F || this.f2689q.mo1390ak().optInt(C10594g.g1657027613239dc("p`pfjqYsqyo")) != 2) {
            return false;
        }
        int e = C0996u.m4653e(this.f2689q);
        if (e != 8 && e != 7) {
            return false;
        }
        this.f2667F = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        switch(r2) {
            case 55: goto L_0x000f;
            case 56: goto L_0x000f;
            case 57: goto L_0x000f;
            default: goto L_0x001d;
        };
     */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3641y() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.e.c r0 = r3.f2681i
            r1 = 95
            if (r0 != 0) goto L_0x000f
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f2689q
            com.bytedance.sdk.openadsdk.e.a r0 = com.bytedance.sdk.openadsdk.p038e.C0770a.m3882a((com.bytedance.sdk.openadsdk.p038e.C0771b) r3, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r0)
            r3.f2681i = r0
            goto L_0x0022
        L_0x000f:
            r0 = 94
            r2 = 125(0x7d, float:1.75E-43)
        L_0x0013:
            switch(r0) {
                case 94: goto L_0x001e;
                case 95: goto L_0x0017;
                case 96: goto L_0x001a;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x000f
        L_0x0017:
            switch(r2) {
                case 94: goto L_0x0022;
                case 95: goto L_0x000f;
                case 96: goto L_0x0022;
                default: goto L_0x001a;
            }
        L_0x001a:
            switch(r2) {
                case 55: goto L_0x000f;
                case 56: goto L_0x000f;
                case 57: goto L_0x000f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0027
        L_0x001e:
            r0 = 39
            if (r2 != r0) goto L_0x0027
        L_0x0022:
            r0 = 95
            r2 = 95
            goto L_0x0013
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0709w.m3641y():void");
    }

    /* renamed from: a */
    public C10245r mo2338a() {
        return this.f2670I;
    }

    /* renamed from: a */
    public C0709w mo2339a(int i) {
        this.f2687o = i;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2340a(View view) {
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                                break;
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c = ']';
                c2 = ']';
            }
            while (true) {
                switch (c2) {
                    case '[':
                    case '\\':
                        break;
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        this.f2683k = new WeakReference<>(view);
        return this;
    }

    /* renamed from: a */
    public C0709w mo2341a(C10294j jVar) {
        this.f2690r = jVar;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2342a(SSWebView sSWebView) {
        String c1657027613239dc = C10601c.c1657027613239dc("wd`um`qwgff");
        C10638l.m31242e(c1657027613239dc, C10601c.c1657027613239dc("=<?vw`Ltj;*|ioXfuf2{uf~Tw}!") + sSWebView.hashCode());
        if (sSWebView == null && sSWebView.getWebView() == null) {
            return this;
        }
        try {
            C10245r b = C10245r.m29423a(sSWebView.getWebView()).mo63043a((C10217a) new C0774a()).mo63045a(C10601c.c1657027613239dc("TnwwmdiM[Kxbhjk")).mo63044a((C10237l) new C10237l() {
                /* renamed from: a */
                public <T> T mo2401a(String str, Type type) {
                    return null;
                }

                /* renamed from: a */
                public <T> String mo2402a(T t) {
                    return null;
                }
            }).mo63046a(C0503h.m2281d().mo1618s()).mo63047b(true).mo63042a().mo63048b();
            this.f2670I = b;
            C0783e.m3926a(b, this);
            C0775a.m3905a(this.f2670I, this);
            C0778b.m3913a(this.f2670I, this);
            C0780c.m3918a(this.f2670I, this);
            C0782d.m3923a(this.f2670I, this);
        } catch (Exception unused) {
        }
        return this;
    }

    /* renamed from: a */
    public C0709w mo2343a(C0164u uVar) {
        this.f2669H = uVar;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2344a(C0410d dVar) {
        this.f2698z = dVar;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2345a(C0477n nVar) {
        this.f2689q = nVar;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2346a(C0597j jVar) {
        this.f2691s = jVar;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2347a(C0773d dVar) {
        this.f2693u = dVar;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2348a(C0784a aVar) {
        this.f2694v = aVar;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2349a(C0785b bVar) {
        this.f2662A = bVar;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2350a(C0787d dVar) {
        this.f2696x = dVar;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2351a(C0788e eVar) {
        this.f2695w = eVar;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2352a(C0792h hVar) {
        this.f2663B = hVar;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2353a(List<C0477n> list) {
        this.f2665D = list;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2354a(Map<String, Object> map) {
        this.f2674a = map;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2355a(JSONObject jSONObject) {
        this.f2692t = jSONObject;
        return this;
    }

    /* renamed from: a */
    public C0709w mo2356a(boolean z) {
        this.f2675b = z;
        return this;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x042a, code lost:
        if (r5 != null) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x045a, code lost:
        if (r5 != null) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x045c, code lost:
        r3 = r5;
     */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo2357a(com.bytedance.sdk.openadsdk.core.C0709w.C0719a r22, int r23) throws java.lang.Exception {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "c`no"
            java.lang.String r3 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r3)
            java.lang.String r4 = r1.f2714a
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0016
            r1 = 0
            return r1
        L_0x0016:
            com.bytedance.sdk.openadsdk.core.h r3 = com.bytedance.sdk.openadsdk.core.C0503h.m2281d()
            boolean r3 = r3.mo1618s()
            java.lang.String r4 = "TUCm`winlFhainz"
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[KQA)WCVU)|n~~g`~+"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " lgwljb="
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            r5.append(r6)
            java.lang.String r6 = r1.f2716c
            r5.append(r6)
            java.lang.String r6 = " qcqehu:"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            r5.append(r6)
            org.json.JSONObject r6 = r1.f2717d
            if (r6 == 0) goto L_0x0059
            org.json.JSONObject r6 = r1.f2717d
            java.lang.String r6 = r6.toString()
            goto L_0x005b
        L_0x0059:
            java.lang.String r6 = ""
        L_0x005b:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
        L_0x0065:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r5 = r1.f2716c
            int r6 = r5.hashCode()
            r7 = 3
            r8 = 0
            java.lang.String r9 = "oqgmTwoqijs"
            r10 = -1
            r11 = 1
            switch(r6) {
                case -2036781162: goto L_0x028b;
                case -1423303823: goto L_0x027d;
                case -1330994877: goto L_0x026e;
                case -1169135450: goto L_0x025f;
                case -1023873614: goto L_0x0250;
                case -844321441: goto L_0x0241;
                case -800853518: goto L_0x0232;
                case -794273169: goto L_0x0223;
                case -715147645: goto L_0x0214;
                case -511324706: goto L_0x0206;
                case -489318846: goto L_0x01f6;
                case -278382602: goto L_0x01e6;
                case -173752734: goto L_0x01d7;
                case 27837080: goto L_0x01c7;
                case 94756344: goto L_0x01b7;
                case 105049135: goto L_0x01a7;
                case 399543522: goto L_0x0197;
                case 402955465: goto L_0x0188;
                case 425443791: goto L_0x0178;
                case 442647767: goto L_0x0168;
                case 571273292: goto L_0x0158;
                case 650209982: goto L_0x0149;
                case 672928467: goto L_0x0139;
                case 711635577: goto L_0x0129;
                case 885131792: goto L_0x0119;
                case 1107374321: goto L_0x0109;
                case 1151744482: goto L_0x00f9;
                case 1237100796: goto L_0x00e9;
                case 1532142616: goto L_0x00d9;
                case 1634511418: goto L_0x00c9;
                case 1713585602: goto L_0x00b9;
                case 1731806400: goto L_0x00aa;
                case 1979895452: goto L_0x009b;
                case 2086000188: goto L_0x008b;
                case 2105008900: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x029a
        L_0x007b:
            java.lang.String r6 = "l`lgwfgwmVigene"
            java.lang.String r6 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 16
            goto L_0x029b
        L_0x008b:
            java.lang.String r6 = "sjksRlbbg"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 20
            goto L_0x029b
        L_0x009b:
            java.lang.String r6 = "sdlgHja"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 2
            goto L_0x029b
        L_0x00aa:
            java.lang.String r6 = "pmczegjbWz~r`h"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 3
            goto L_0x029b
        L_0x00b9:
            java.lang.String r6 = "gdvMaqqhzbNjxl"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 26
            goto L_0x029b
        L_0x00c9:
            java.lang.String r6 = "eof`ewbXdfko"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 27
            goto L_0x029b
        L_0x00d9:
            java.lang.String r6 = "rdolr`Jhimcek"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 10
            goto L_0x029b
        L_0x00e9:
            java.lang.String r6 = "rdlgawBnlOcee~f"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 18
            goto L_0x029b
        L_0x00f9:
            java.lang.String r6 = "mtvfRlbbg"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 21
            goto L_0x029b
        L_0x0109:
            java.lang.String r6 = "p`wpaRce^`o|Xdcjbb"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 29
            goto L_0x029b
        L_0x0119:
            java.lang.String r6 = "gdvUkisjm"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 9
            goto L_0x029b
        L_0x0129:
            java.lang.String r6 = "gdv@qwtbf}\\bhha\\dpfv"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 23
            goto L_0x029b
        L_0x0139:
            java.lang.String r6 = "c`l`aiYcg~dgcljPqabLuq"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 14
            goto L_0x029b
        L_0x0149:
            java.lang.String r6 = "gdvWahvki}oBbka"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 4
            goto L_0x029b
        L_0x0158:
            java.lang.String r6 = "dxlbileSzhi`"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 19
            goto L_0x029b
        L_0x0168:
            java.lang.String r6 = "sdlgV`qfzm"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 11
            goto L_0x029b
        L_0x0178:
            java.lang.String r6 = "gdvMeqoqmZciN{|d~Wuaw"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 33
            goto L_0x029b
        L_0x0188:
            java.lang.String r6 = "irTjargedl"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 6
            goto L_0x029b
        L_0x0197:
            java.lang.String r6 = "gdv@hjubJ|~ccGav~"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 8
            goto L_0x029b
        L_0x01a7:
            java.lang.String r6 = "uoqvfveuakoTm}~Pqu"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 15
            goto L_0x029b
        L_0x01b7:
            java.lang.String r6 = "cmmpa"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 34
            goto L_0x029b
        L_0x01c7:
            java.lang.String r6 = "dnumhjgcWhz{Slj"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 13
            goto L_0x029b
        L_0x01d7:
            java.lang.String r6 = "gdvWaHgnImy"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 5
            goto L_0x029b
        L_0x01e6:
            java.lang.String r6 = "sdlg[qcji`U{~bjzseMzpf"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 24
            goto L_0x029b
        L_0x01f6:
            java.lang.String r6 = "gdvNeqcuahfFiyo"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 25
            goto L_0x029b
        L_0x0206:
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r9)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 31
            goto L_0x029b
        L_0x0214:
            java.lang.String r6 = "gdvPgwcbfZcqi"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 7
            goto L_0x029b
        L_0x0223:
            java.lang.String r6 = "aqrJjci"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 0
            goto L_0x029b
        L_0x0232:
            java.lang.String r6 = "cmk`o@pbf}"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 17
            goto L_0x029b
        L_0x0241:
            java.lang.String r6 = "wd`um`qX|`gnSy|nsz"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 30
            goto L_0x029b
        L_0x0250:
            java.lang.String r6 = "oqgmEaJffmZjkhBf~za"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 32
            goto L_0x029b
        L_0x025f:
            java.lang.String r6 = "cicmc`PnlleXxlzj"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 22
            goto L_0x029b
        L_0x026e:
            java.lang.String r6 = "p`wpaRce^`o|"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 28
            goto L_0x029b
        L_0x027d:
            java.lang.String r6 = "aeKmbj"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 1
            goto L_0x029b
        L_0x028b:
            java.lang.String r6 = "st`pgwoemVk{|Rok"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 12
            goto L_0x029b
        L_0x029a:
            r5 = -1
        L_0x029b:
            switch(r5) {
                case 0: goto L_0x0520;
                case 1: goto L_0x051c;
                case 2: goto L_0x048e;
                case 3: goto L_0x0489;
                case 4: goto L_0x045f;
                case 5: goto L_0x0458;
                case 6: goto L_0x044f;
                case 7: goto L_0x042d;
                case 8: goto L_0x0426;
                case 9: goto L_0x03e6;
                case 10: goto L_0x03dd;
                case 11: goto L_0x03d2;
                case 12: goto L_0x03af;
                case 13: goto L_0x0387;
                case 14: goto L_0x037c;
                case 15: goto L_0x0371;
                case 16: goto L_0x035a;
                case 17: goto L_0x0353;
                case 18: goto L_0x034c;
                case 19: goto L_0x0345;
                case 20: goto L_0x0340;
                case 21: goto L_0x0339;
                case 22: goto L_0x0332;
                case 23: goto L_0x032d;
                case 24: goto L_0x0326;
                case 25: goto L_0x0321;
                case 26: goto L_0x031c;
                case 27: goto L_0x0315;
                case 28: goto L_0x0310;
                case 29: goto L_0x030b;
                case 30: goto L_0x0304;
                case 31: goto L_0x02f4;
                case 32: goto L_0x02e0;
                case 33: goto L_0x02b2;
                case 34: goto L_0x02a0;
                default: goto L_0x029e;
            }
        L_0x029e:
            goto L_0x0525
        L_0x02a0:
            java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r4)
            java.lang.String r6 = "MDVKKAYDDFYN"
            java.lang.String r6 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r6)
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r5, (java.lang.String) r6)
            r21.mo2386f()
            goto L_0x0525
        L_0x02b2:
            java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r4)
            java.lang.String r6 = "MDVKKAY@M]UEMYGYUNAZ@PITMJNTQBZ^t`"
            java.lang.String r6 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r6)
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r5, (java.lang.String) r6)
            com.bytedance.sdk.openadsdk.core.e.n r5 = r0.f2689q
            if (r5 == 0) goto L_0x0525
            java.lang.String r5 = r5.mo1324D()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0525
            java.lang.String r5 = "d`vb"
            java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)
            com.bytedance.sdk.openadsdk.core.e.n r6 = r0.f2689q
            java.lang.String r6 = r6.mo1324D()
            r3.put(r5, r6)
            goto L_0x0525
        L_0x02e0:
            java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r4)
            java.lang.String r6 = "MDVKKAYHXLDTC]KAOPVLXTXSHX]^CQWQkr"
            java.lang.String r6 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r6)
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r5, (java.lang.String) r6)
            org.json.JSONObject r5 = r1.f2717d
            r0.mo2375c((org.json.JSONObject) r5)
            goto L_0x0525
        L_0x02f4:
            java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r4)
            java.lang.String r6 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r9)
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r5, (java.lang.String) r6)
            r21.m3637u()
            goto L_0x0525
        L_0x0304:
            org.json.JSONObject r5 = r1.f2717d
            r0.m3616g((org.json.JSONObject) r5)
            goto L_0x0525
        L_0x030b:
            r21.m3635s()
            goto L_0x0525
        L_0x0310:
            r21.m3634r()
            goto L_0x0525
        L_0x0315:
            org.json.JSONObject r5 = r1.f2717d
            r0.m3617h((org.json.JSONObject) r5)
            goto L_0x0525
        L_0x031c:
            r0.m3600a((com.bytedance.sdk.openadsdk.core.C0709w.C0719a) r1, (org.json.JSONObject) r3)
            goto L_0x0525
        L_0x0321:
            r0.m3630p(r3)
            goto L_0x0525
        L_0x0326:
            org.json.JSONObject r5 = r1.f2717d
            r0.m3628o(r5)
            goto L_0x0525
        L_0x032d:
            r0.m3623k(r3)
            goto L_0x0525
        L_0x0332:
            org.json.JSONObject r5 = r1.f2717d
            r0.m3622j((org.json.JSONObject) r5)
            goto L_0x0525
        L_0x0339:
            org.json.JSONObject r5 = r1.f2717d
            r0.m3620i((org.json.JSONObject) r5)
            goto L_0x0525
        L_0x0340:
            r21.m3636t()
            goto L_0x0525
        L_0x0345:
            org.json.JSONObject r5 = r1.f2717d
            r0.m3626n(r5)
            goto L_0x0525
        L_0x034c:
            org.json.JSONObject r5 = r1.f2717d
            r0.m3624l(r5)
            goto L_0x0525
        L_0x0353:
            org.json.JSONObject r5 = r1.f2717d
            r0.mo2379d((org.json.JSONObject) r5)
            goto L_0x0525
        L_0x035a:
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f2680h
            if (r5 == 0) goto L_0x0525
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            if (r5 == 0) goto L_0x0525
            boolean r6 = r5 instanceof com.bytedance.sdk.openadsdk.core.video.p034c.C0666b
            if (r6 == 0) goto L_0x0525
            com.bytedance.sdk.openadsdk.core.video.c.b r5 = (com.bytedance.sdk.openadsdk.core.video.p034c.C0666b) r5
            r5.mo158L()
            goto L_0x0525
        L_0x0371:
            com.bytedance.sdk.openadsdk.e.c r5 = r0.f2681i
            if (r5 == 0) goto L_0x0525
            org.json.JSONObject r6 = r1.f2717d
            r5.mo2548a(r6)
            goto L_0x0525
        L_0x037c:
            com.bytedance.sdk.openadsdk.e.c r5 = r0.f2681i
            if (r5 == 0) goto L_0x0525
            org.json.JSONObject r6 = r1.f2717d
            r5.mo2550b(r6)
            goto L_0x0525
        L_0x0387:
            r0.f2672K = r11
            com.bytedance.sdk.openadsdk.core.b.d r5 = r0.f2698z
            if (r5 == 0) goto L_0x0394
            boolean r6 = r0.f2664C
            r5.mo189a(r6)
            goto L_0x0525
        L_0x0394:
            com.bytedance.sdk.openadsdk.e.c r5 = r0.f2681i
            if (r5 == 0) goto L_0x0525
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f2680h
            if (r5 == 0) goto L_0x0525
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            if (r5 == 0) goto L_0x0525
            com.bytedance.sdk.openadsdk.e.c r6 = r0.f2681i
            org.json.JSONObject r7 = r1.f2717d
            java.lang.String r8 = r0.f2671J
            r6.mo2546a(r5, r7, r8)
            goto L_0x0525
        L_0x03af:
            r21.m3641y()
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f2680h
            if (r5 == 0) goto L_0x0525
            java.lang.Object r5 = r5.get()
            r13 = r5
            android.content.Context r13 = (android.content.Context) r13
            if (r13 == 0) goto L_0x0525
            com.bytedance.sdk.openadsdk.e.c r12 = r0.f2681i
            org.json.JSONObject r14 = r1.f2717d
            java.lang.String r15 = r0.f2684l
            int r5 = r0.f2685m
            boolean r6 = r0.f2688p
            r16 = r5
            r17 = r6
            r12.mo2547a(r13, r14, r15, r16, r17)
            goto L_0x0525
        L_0x03d2:
            r0.f2676c = r11
            com.bytedance.sdk.openadsdk.g.e r5 = r0.f2695w
            if (r5 == 0) goto L_0x0525
            r5.mo123a()
            goto L_0x0525
        L_0x03dd:
            com.bytedance.sdk.openadsdk.g.d r5 = r0.f2696x
            if (r5 == 0) goto L_0x0525
            r5.mo124a()
            goto L_0x0525
        L_0x03e6:
            android.content.Context r5 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()
            java.lang.String r6 = "atfjk"
            java.lang.String r6 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r6)
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x0418
            int r10 = r5.getStreamVolume(r7)
            java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Mtqjg%phd|gn,301.1Sfp|yZyw{|yo32\u001eBWQV@HS~FF^AH\u0013"
            java.lang.String r7 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r7)
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r5, (java.lang.String) r6)
        L_0x0418:
            if (r10 > 0) goto L_0x041b
            r8 = 1
        L_0x041b:
            java.lang.String r5 = "eof`ewbXe|~n"
            java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)
            r3.put(r5, r8)
            goto L_0x0525
        L_0x0426:
            org.json.JSONObject r5 = r21.m3629p()
            if (r5 == 0) goto L_0x0525
            goto L_0x045c
        L_0x042d:
            com.bytedance.sdk.openadsdk.g.a r5 = r0.f2694v
            if (r5 == 0) goto L_0x0525
            int r5 = r5.mo817b()
            com.bytedance.sdk.openadsdk.g.a r6 = r0.f2694v
            int r6 = r6.mo816a()
            java.lang.String r7 = "whfwl"
            java.lang.String r7 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r7)
            r3.put(r7, r5)
            java.lang.String r5 = "hdkdlq"
            java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)
        L_0x044a:
            r3.put(r5, r6)
            goto L_0x0525
        L_0x044f:
            java.lang.String r5 = "vhgtWqgs}z"
            java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)
            boolean r6 = r0.f2668G
            goto L_0x044a
        L_0x0458:
            org.json.JSONObject r5 = r0.f2697y
            if (r5 == 0) goto L_0x0525
        L_0x045c:
            r3 = r5
            goto L_0x0525
        L_0x045f:
            org.json.JSONObject r3 = r0.f2692t
            if (r3 == 0) goto L_0x0485
            java.lang.String r5 = "sdvwmka"
            java.lang.String r5 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r5)
            org.json.JSONObject r6 = r21.m3638v()
            r3.put(r5, r6)
            com.bytedance.sdk.openadsdk.core.e.n r3 = r0.f2689q
            if (r3 == 0) goto L_0x0485
            org.json.JSONObject r3 = r0.f2692t
            java.lang.String r5 = "eyvfjvohf"
            java.lang.String r5 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r5)
            com.bytedance.sdk.openadsdk.core.e.n r6 = r0.f2689q
            org.json.JSONObject r6 = r6.mo1371aB()
            r3.put(r5, r6)
        L_0x0485:
            org.json.JSONObject r3 = r0.f2692t
            goto L_0x0525
        L_0x0489:
            r0.m3614f((org.json.JSONObject) r3)
            goto L_0x0525
        L_0x048e:
            org.json.JSONObject r5 = r1.f2717d
            if (r5 == 0) goto L_0x0525
            java.lang.String r6 = "eyvIwjh"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r6)
            org.json.JSONObject r6 = r5.getJSONObject(r6)
            if (r6 == 0) goto L_0x0525
            java.lang.String r7 = "c`vfcjt~"
            java.lang.String r8 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r7)
            boolean r8 = r6.has(r8)
            if (r8 == 0) goto L_0x0525
            java.lang.String r8 = "t`e"
            java.lang.String r9 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r8)
            boolean r9 = r6.has(r9)
            if (r9 == 0) goto L_0x0525
            java.lang.String r9 = "l``fh"
            java.lang.String r10 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r9)
            boolean r10 = r6.has(r10)
            if (r10 == 0) goto L_0x0525
            java.lang.String r7 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r7)
            java.lang.String r13 = r6.getString(r7)
            java.lang.String r7 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r8)
            r6.getString(r7)
            java.lang.String r7 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r9)
            java.lang.String r15 = r6.getString(r7)
            java.lang.String r7 = "v`nva"
            java.lang.String r7 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r7)
            long r16 = r5.getLong(r7)
            java.lang.String r7 = "eyvUeisb"
            java.lang.String r7 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r7)
            long r18 = r5.getLong(r7)
            java.lang.String r5 = "u`]skiodq"
            java.lang.String r5 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r5)     // Catch:{ Exception -> 0x04fd }
            int r7 = r0.f2687o     // Catch:{ Exception -> 0x04fd }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x04fd }
            r6.putOpt(r5, r7)     // Catch:{ Exception -> 0x04fd }
            goto L_0x04fe
        L_0x04fd:
        L_0x04fe:
            java.lang.String r5 = "cmk`o"
            java.lang.String r5 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r5)
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x050e
            org.json.JSONObject r6 = r0.m3633r(r6)
        L_0x050e:
            r20 = r6
            int r5 = r0.f2685m
            java.lang.String r14 = com.bytedance.sdk.openadsdk.utils.C0996u.m4615a((int) r5)
            com.bytedance.sdk.openadsdk.core.e.n r12 = r0.f2689q
            com.bytedance.sdk.openadsdk.p000b.C0136e.m611a(r12, r13, r14, r15, r16, r18, r20)
            goto L_0x0525
        L_0x051c:
            r0.m3613e((org.json.JSONObject) r3)
            goto L_0x0525
        L_0x0520:
            int r5 = r1.f2718e
            r0.m3605a((org.json.JSONObject) r3, (int) r5)
        L_0x0525:
            if (r2 != r11) goto L_0x0568
            java.lang.String r5 = r1.f2715b
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0568
            java.lang.String r1 = r1.f2715b
            r0.m3610b((java.lang.String) r1, (org.json.JSONObject) r3)
            com.bytedance.sdk.openadsdk.core.h r1 = com.bytedance.sdk.openadsdk.core.C0503h.m2281d()
            boolean r1 = r1.mo1618s()
            if (r1 == 0) goto L_0x0568
            java.lang.String r1 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[KQA)WUWU)|n~~g`~+"
            java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " ecwe8"
            java.lang.String r2 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r2)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            android.util.Log.d(r1, r2)
        L_0x0568:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0709w.mo2357a(com.bytedance.sdk.openadsdk.core.w$a, int):org.json.JSONObject");
    }

    /* renamed from: a */
    public void mo5a(Message message) {
        if (message != null && message.what == 11 && (message.obj instanceof C0719a)) {
            try {
                mo2357a((C0719a) message.obj, 1);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo2358a(String str) {
    }

    /* renamed from: a */
    public void mo2359a(String str, JSONObject jSONObject) {
        m3612c(str, jSONObject);
    }

    @JProtect
    /* renamed from: a */
    public void mo2360a(JSONObject jSONObject, final C0786c cVar) {
        if (cVar != null) {
            try {
                if (this.f2689q != null) {
                    if (!TextUtils.isEmpty(this.f2684l)) {
                        int e = C0996u.m4653e(this.f2689q);
                        AdSlot x = this.f2689q.mo1477x();
                        C0479o oVar = new C0479o();
                        if (this.f2689q.mo1327G() != null) {
                            oVar.f1731f = 2;
                        }
                        JSONObject ak = this.f2689q.mo1390ak();
                        if (ak == null) {
                            ak = new JSONObject();
                        }
                        if (jSONObject != null) {
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                ak.put(next, jSONObject.opt(next));
                            }
                        }
                        oVar.f1733h = ak;
                        C0558m.m2671f().mo1840a(x, oVar, e, new C0561n.C0562a() {
                            /* renamed from: a */
                            public void mo186a(int i, String str) {
                                cVar.mo2408a(false, (List<C0477n>) null);
                            }

                            /* renamed from: a */
                            public void mo187a(C0448a aVar, C0449b bVar) {
                                if (aVar.mo1199b() == null || aVar.mo1199b().isEmpty()) {
                                    cVar.mo2408a(false, (List<C0477n>) null);
                                    bVar.mo1204a(-3);
                                    C0449b.m1835a(bVar);
                                    return;
                                }
                                cVar.mo2408a(true, aVar.mo1199b());
                            }
                        });
                        return;
                    }
                }
                cVar.mo2408a(false, (List<C0477n>) null);
            } catch (Exception e2) {
                C10638l.m31239c(C10545d.d1657027613261dc("TUCm`winlFhainz"), C10545d.d1657027613261dc("gdv#eau'm{xd~"), e2);
            }
        }
    }

    /* renamed from: a */
    public boolean mo2361a(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!C10594g.g1657027613239dc("bxvf`dhdm").equals(uri.getScheme())) {
                return false;
            }
            return f2661g.containsKey(uri.getHost());
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            m3613e(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            m3605a(jSONObject, 0);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public C0709w mo2364b(int i) {
        this.f2685m = i;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        switch(r1) {
            case 91: goto L_0x001c;
            case 92: goto L_0x0000;
            case 93: goto L_0x001c;
            default: goto L_0x001b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = '[';
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.core.C0709w mo2365b(com.bytedance.sdk.component.widget.SSWebView r3) {
        /*
            r2 = this;
        L_0x0000:
            r0 = 93
            r1 = 93
        L_0x0004:
            switch(r0) {
                case 92: goto L_0x000c;
                case 93: goto L_0x0018;
                case 94: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0000
        L_0x0008:
            r0 = 4
            if (r1 > r0) goto L_0x0010
            goto L_0x0000
        L_0x000c:
            switch(r1) {
                case 21: goto L_0x0000;
                case 22: goto L_0x0010;
                case 23: goto L_0x001c;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0018
        L_0x0010:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f2677d = r0
            return r2
        L_0x0018:
            switch(r1) {
                case 91: goto L_0x001c;
                case 92: goto L_0x0000;
                case 93: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x0021
        L_0x001c:
            r0 = 94
            r1 = 75
            goto L_0x0004
        L_0x0021:
            r1 = 91
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0709w.mo2365b(com.bytedance.sdk.component.widget.SSWebView):com.bytedance.sdk.openadsdk.core.w");
    }

    /* renamed from: b */
    public C0709w mo2366b(JSONObject jSONObject) {
        this.f2697y = jSONObject;
        return this;
    }

    /* renamed from: b */
    public C0709w mo2367b(boolean z) {
        this.f2668G = z;
        return this;
    }

    /* renamed from: b */
    public void mo2368b() {
        C10245r rVar = this.f2670I;
        if (rVar != null) {
            rVar.mo63075a();
            this.f2670I = null;
        }
    }

    /* renamed from: b */
    public void mo2369b(Uri uri) {
        long j;
        String str;
        JSONObject jSONObject;
        try {
            String host = uri.getHost();
            if (!C10594g.g1657027613239dc("lne\\asci|").equals(host) && !C10594g.g1657027613239dc("ctqwkhYb~ld").equals(host)) {
                if (!C10594g.g1657027613239dc("lne\\asci|V|8").equals(host)) {
                    if (!C10594g.g1657027613239dc("pskueqc").equals(host)) {
                        if (!C10594g.g1657027613239dc("dhqseqeoWdoxlij").equals(host)) {
                            C10638l.m31241d(C10594g.g1657027613239dc("TUCm`winlFhainz"), C10594g.g1657027613239dc("h`lghwSnz3*ecy.bqeq{4fu}t{;trmk"));
                            return;
                        }
                    }
                    m3621j(uri.toString());
                    return;
                }
            }
            String queryParameter = uri.getQueryParameter(C10594g.g1657027613239dc("c`vfcjt~"));
            String queryParameter2 = uri.getQueryParameter(C10594g.g1657027613239dc("t`e"));
            this.f2671J = queryParameter2;
            String queryParameter3 = uri.getQueryParameter(C10594g.g1657027613239dc("l``fh"));
            if (m3618h(queryParameter3)) {
                long j2 = 0;
                try {
                    j = Long.parseLong(uri.getQueryParameter(C10594g.g1657027613239dc("v`nva")));
                } catch (Exception unused) {
                    j = 0;
                }
                try {
                    j2 = Long.parseLong(uri.getQueryParameter(C10594g.g1657027613239dc("eyv\\rdjrm")));
                } catch (Exception unused2) {
                }
                long j3 = j2;
                JSONObject jSONObject2 = null;
                String queryParameter4 = uri.getQueryParameter(C10594g.g1657027613239dc("eyvqe"));
                if (!TextUtils.isEmpty(queryParameter4)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(queryParameter4);
                        try {
                            jSONObject3.putOpt(C10594g.g1657027613239dc("u`]skiodq"), Integer.valueOf(this.f2687o));
                        } catch (Exception unused3) {
                        }
                        jSONObject2 = jSONObject3;
                    } catch (Exception unused4) {
                    }
                }
                if (C10594g.g1657027613239dc("cmk`o").equals(queryParameter3)) {
                    jSONObject2 = m3633r(jSONObject2);
                }
                if (!C10594g.g1657027613239dc("l`lgmkaXxlxmSh|}c").equals(queryParameter3)) {
                    if (!C10594g.g1657027613239dc("l`lgmkaXxlxmS~zndb").equals(queryParameter3)) {
                        str = m3619i(queryParameter2);
                        jSONObject = jSONObject2;
                        C0136e.m611a(this.f2689q, queryParameter, str, queryParameter3, j, j3, jSONObject);
                    }
                }
                try {
                    jSONObject = new JSONObject();
                    for (String next : uri.getQueryParameterNames()) {
                        try {
                            if (C10594g.g1657027613239dc("eyvqe").equals(next)) {
                                jSONObject.put(C10594g.g1657027613239dc("ae]f|qtfWmkm"), new JSONObject(uri.getQueryParameter(next)).optString(C10594g.g1657027613239dc("ae]f|qtfWmkm")));
                            } else {
                                jSONObject.put(next, uri.getQueryParameter(next));
                            }
                        } catch (Exception unused5) {
                        }
                    }
                    str = this.f2679f;
                    C0136e.m611a(this.f2689q, queryParameter, str, queryParameter3, j, j3, jSONObject);
                } catch (Exception unused6) {
                }
            }
        } catch (Exception e) {
            C10638l.m31236b(C10594g.g1657027613239dc("TUCm`winlFhainz"), C10594g.g1657027613239dc("h`lgh`Sua)osoh~{y~|)4"), e);
        }
    }

    /* renamed from: b */
    public void mo2370b(String str) {
    }

    /* renamed from: c */
    public C0477n mo2371c() {
        return this.f2689q;
    }

    /* renamed from: c */
    public C0709w mo2372c(String str) {
        this.f2679f = str;
        return this;
    }

    /* renamed from: c */
    public C0709w mo2373c(boolean z) {
        this.f2664C = z;
        return this;
    }

    /* renamed from: c */
    public void mo2374c(int i) {
        C0597j jVar = this.f2691s;
        if (jVar != null) {
            jVar.mo132b(i);
        }
    }

    /* renamed from: c */
    public void mo2375c(JSONObject jSONObject) {
        WeakReference<Context> weakReference;
        int optInt = jSONObject.optInt(C10469e.e1657027613270dc("l`lgmkaT|pfn"));
        String optString = jSONObject.optString(C10469e.e1657027613270dc("usn"));
        String optString2 = jSONObject.optString(C10469e.e1657027613270dc("f`nofdelW|xg"));
        if (!TextUtils.isEmpty(optString)) {
            if (optInt == 0) {
                if (m3627o() != null) {
                    m3627o().loadUrl(optString);
                }
            } else if (optInt == 1) {
                WeakReference<Context> weakReference2 = this.f2680h;
                if (weakReference2 != null && (weakReference2.get() instanceof Activity)) {
                    C0983k.m4549a((Activity) this.f2680h.get(), optString);
                }
            } else if (optInt == 2 && (weakReference = this.f2680h) != null && (weakReference.get() instanceof Activity) && !C0983k.m4551b((Activity) this.f2680h.get(), optString)) {
                C0983k.m4549a((Activity) this.f2680h.get(), optString2);
            }
        }
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m3622j(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C0709w.this.m3622j(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo2379d(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C0709w.this.mo2379d(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public C0709w mo2378d(String str) {
        this.f2682j = str;
        return this;
    }

    /* renamed from: d */
    public void mo2379d(JSONObject jSONObject) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        String str;
        double d7;
        double d8;
        JSONObject jSONObject2;
        double d9;
        JSONObject jSONObject3 = jSONObject;
        if (jSONObject3 != null) {
            C10638l.m31235b(C10548g.g1657027613257dc("TUCm`winlFhainz"), C10548g.g1657027613257dc("TUCm`winlFhainz/xp|wxpU{qzq^jxpk"));
            try {
                String optString = jSONObject3.optString(C10548g.g1657027613257dc("aeKg"));
                int optInt = jSONObject3.optInt(C10548g.g1657027613257dc("asgbP|vb"), 1);
                String optString2 = jSONObject3.optString(C10548g.g1657027613257dc("cmk`oDtbi]s{i"));
                JSONObject optJSONObject = jSONObject3.optJSONObject(C10548g.g1657027613257dc("cmk`oLhag"));
                double d10 = 0.0d;
                if (optJSONObject != null) {
                    double optDouble = optJSONObject.optDouble(C10548g.g1657027613257dc("dnum[}"), 0.0d);
                    d7 = optJSONObject.optDouble(C10548g.g1657027613257dc("dnum[|"), 0.0d);
                    double optDouble2 = optJSONObject.optDouble(C10548g.g1657027613257dc("uq]{"), 0.0d);
                    double optDouble3 = optJSONObject.optDouble(C10548g.g1657027613257dc("uq]z"), 0.0d);
                    double optDouble4 = optJSONObject.optDouble(C10548g.g1657027613257dc("dnum[qojm"), 0.0d);
                    double optDouble5 = optJSONObject.optDouble(C10548g.g1657027613257dc("uq]wmhc"), 0.0d);
                    double optDouble6 = optJSONObject.optDouble(C10548g.g1657027613257dc("btvwkkY"), 0.0d);
                    double optDouble7 = optJSONObject.optDouble(C10548g.g1657027613257dc("btvwkkY~"), 0.0d);
                    double optDouble8 = optJSONObject.optDouble(C10548g.g1657027613257dc("btvwkkYpam~c"), 0.0d);
                    double optDouble9 = optJSONObject.optDouble(C10548g.g1657027613257dc("btvwkkYom`mcx"), 0.0d);
                    jSONObject2 = optJSONObject.optJSONObject(C10548g.g1657027613257dc("rdawMk`h"));
                    d = optDouble9;
                    d10 = optDouble;
                    d8 = optDouble2;
                    d6 = optDouble4;
                    d5 = optDouble5;
                    d4 = optDouble6;
                    d3 = optDouble7;
                    d2 = optDouble8;
                    str = optString;
                    d9 = optDouble3;
                } else {
                    str = optString;
                    d9 = 0.0d;
                    d8 = 0.0d;
                    d7 = 0.0d;
                    d6 = 0.0d;
                    d5 = 0.0d;
                    d4 = 0.0d;
                    d3 = 0.0d;
                    d2 = 0.0d;
                    d = 0.0d;
                    jSONObject2 = null;
                }
                C0460j a = new C0460j.C0462a().mo1277d((float) d10).mo1275c((float) d7).mo1272b((float) d8).mo1264a((float) d9).mo1274b((long) d6).mo1266a((long) d5).mo1276c((int) d4).mo1278d((int) d3).mo1279e((int) d2).mo1280f((int) d).mo1268a(optString2).mo1267a((SparseArray<C0408c.C0409a>) null).mo1270a(true).mo1273b(optInt).mo1269a(jSONObject2).mo1265a(jSONObject3.optInt(C10548g.g1657027613257dc("cmk`oDtbiJkija}i"), -1)).mo1271a();
                if (this.f2690r != null) {
                    this.f2690r.mo63173a((View) null, optInt, a);
                }
                m3606a(str, optInt, a);
                while (true) {
                    char c = 8;
                    while (true) {
                        if (c == 7) {
                            return;
                        }
                        if (c == 8 || c != 9) {
                            c = 7;
                        }
                    }
                }
            } catch (Exception unused) {
                C10294j jVar = this.f2690r;
                if (jVar != null) {
                    jVar.mo63173a((View) null, -1, (C10281b) null);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo2380d(boolean z) {
        this.f2676c = z;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023 A[LOOP:0: B:5:0x000e->B:12:0x0023, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x000a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0012 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0015 A[SYNTHETIC] */
    /* renamed from: d */
    public boolean mo2381d() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f2689q
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.mo1458o()
            goto L_0x0019
        L_0x0009:
            r0 = 0
        L_0x000a:
            r1 = 74
            r2 = 55
        L_0x000e:
            switch(r1) {
                case 72: goto L_0x000a;
                case 73: goto L_0x0012;
                case 74: goto L_0x0015;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0023
        L_0x0012:
            switch(r2) {
                case 94: goto L_0x001e;
                case 95: goto L_0x000a;
                case 96: goto L_0x000a;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r2) {
                case 55: goto L_0x001d;
                case 56: goto L_0x0019;
                case 57: goto L_0x000a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x001e
        L_0x0019:
            if (r0 == 0) goto L_0x0009
            r0 = 1
            goto L_0x001e
        L_0x001d:
            return r0
        L_0x001e:
            r1 = 73
            r2 = 96
            goto L_0x000e
        L_0x0023:
            r1 = 72
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0709w.mo2381d():boolean");
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            m3626n(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public C0709w mo2383e(String str) {
        this.f2684l = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo2384e() {
        boolean z = this.f2676c;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        if (c2 > 4) {
                            break;
                        } else {
                            continue;
                        }
                }
                while (true) {
                    switch (c2) {
                        case '[':
                        case ']':
                            break;
                        case '\\':
                            break;
                        default:
                            c2 = '[';
                    }
                }
                c = '^';
                c2 = 'K';
            }
        }
        return z;
    }

    /* renamed from: f */
    public C0709w mo2385f(String str) {
        this.f2686n = str;
        return this;
    }

    /* renamed from: f */
    public void mo2386f() {
        WeakReference<Context> weakReference = this.f2680h;
        if (weakReference != null && (weakReference.get() instanceof Activity) && C0983k.m4550a((Activity) this.f2680h.get())) {
            ((Activity) this.f2680h.get()).finish();
        }
    }

    /* renamed from: g */
    public void mo2387g() {
        C0597j jVar = this.f2691s;
        if (jVar != null) {
            jVar.mo131b();
            char c = '\\';
            while (true) {
                char c2 = 14;
                while (true) {
                    switch (c2) {
                        case 13:
                            break;
                        case 14:
                            break;
                        case 15:
                            switch (c) {
                                case '_':
                                    return;
                            }
                    }
                    c2 = 15;
                    c = '_';
                }
            }
        }
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        m3623k(jSONObject);
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        m3604a(C10522a.a1657027613264dc("gdvWahvki}oBbka"), true);
        try {
            if (this.f2692t != null) {
                this.f2692t.put(C10522a.a1657027613264dc("sdvwmka"), m3638v());
                if (this.f2689q != null) {
                    this.f2692t.put(C10522a.a1657027613264dc("eyvfjvohf"), this.f2689q.mo1371aB());
                }
            }
            m3604a(C10522a.a1657027613264dc("gdvWahvki}oBbka"), false);
            return this.f2692t.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @JProtect
    /* renamed from: h */
    public void mo2390h() {
        mo2360a((JSONObject) null, (C0786c) new C0786c() {
            /* renamed from: a */
            public void mo2408a(boolean z, List<C0477n> list) {
                List unused = C0709w.this.f2665D = list;
                C0709w.this.m3639w();
                C0709w.this.mo2391i();
            }
        });
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        while (true) {
                            switch (c2) {
                                case '[':
                                case '\\':
                                case ']':
                                    break;
                                default:
                                    c2 = '[';
                            }
                        }
                    case '^':
                        if (c2 <= 4) {
                            continue;
                        } else {
                            return;
                        }
                }
                c = '^';
                c2 = 'K';
            }
        }
    }

    /* renamed from: i */
    public void mo2391i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C10594g.g1657027613239dc("m`vfvlgk"), m3608b(this.f2665D));
            mo2359a(C10594g.g1657027613239dc("m`vfvlgkEl~j"), jSONObject);
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void initRenderFinish() {
        C10638l.m31235b(C10601c.c1657027613239dc("TUCm`winlFhainz"), C10601c.c1657027613239dc("iokwV`hcm{Lbbd}g"));
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                if (C0709w.this.f2673L != null) {
                    C0709w.this.f2673L.mo2469a();
                }
            }
        });
    }

    /* renamed from: j */
    public boolean mo2393j() {
        boolean z = this.f2672K;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c = ']';
                c2 = ']';
            }
            while (true) {
                switch (c2) {
                    case '[':
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo2394k() {
        C0477n nVar = this.f2689q;
        if (nVar != null) {
            int I = nVar.mo1329I();
            while (true) {
                char c = '_';
                char c2 = '_';
                while (true) {
                    switch (c) {
                        case '^':
                            if (c2 != '\'') {
                                break;
                            } else {
                                continue;
                            }
                        case '_':
                            switch (c2) {
                                case '^':
                                case '`':
                                    continue;
                                case '_':
                                    if (I != 1) {
                                        break;
                                    } else {
                                        return true;
                                    }
                            }
                        case '`':
                            break;
                    }
                    switch (c2) {
                        case '7':
                        case '9':
                            break;
                        case '8':
                            break;
                    }
                    c = '^';
                    c2 = '}';
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: l */
    public void mo2395l() {
        C0772c cVar = this.f2681i;
        if (cVar != null) {
            cVar.mo2545a();
        }
        if (m3640x()) {
            mo2390h();
        }
    }

    /* renamed from: m */
    public void mo2396m() {
        C0772c cVar = this.f2681i;
        if (cVar != null) {
            cVar.mo2549b();
            while (true) {
                char c = 15;
                while (true) {
                    switch (c) {
                        case 13:
                        case 14:
                            return;
                        default:
                            c = 14;
                    }
                }
            }
        }
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m3620i(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C0709w.this.m3620i(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
            C10638l.m31242e(C10548g.g1657027613257dc("TUCm`winlFhainz"), "");
        }
    }

    /* renamed from: n */
    public void mo2398n() {
        C0772c cVar = this.f2681i;
        if (cVar != null) {
            cVar.mo2551c();
            char c = '\\';
            while (true) {
                char c2 = 14;
                while (true) {
                    switch (c2) {
                        case 13:
                            break;
                        case 14:
                            break;
                        case 15:
                            switch (c) {
                                case '_':
                                    return;
                            }
                    }
                    c2 = 15;
                    c = '_';
                }
            }
        }
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            m3624l(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m3636t();
            } else {
                this.f2678e.post(new Runnable() {
                    public void run() {
                        C0709w.this.m3636t();
                    }
                });
            }
        } catch (Exception unused) {
        }
    }
}
