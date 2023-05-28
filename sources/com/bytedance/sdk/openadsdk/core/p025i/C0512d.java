package com.bytedance.sdk.openadsdk.core.p025i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10201b;
import com.bytedance.sdk.component.p307b.p308a.C10469e;
import com.bytedance.sdk.component.p313d.p316c.p320b.C10522a;
import com.bytedance.sdk.component.p313d.p322d.C10545d;
import com.bytedance.sdk.component.p313d.p322d.C10548g;
import com.bytedance.sdk.component.p323e.p324a.C10575a;
import com.bytedance.sdk.component.p323e.p325b.C10581c;
import com.bytedance.sdk.component.p323e.p325b.C10582d;
import com.bytedance.sdk.component.p323e.p326c.C10584a;
import com.bytedance.sdk.component.p323e.p327d.C10601c;
import com.bytedance.sdk.component.utils.C10621a;
import com.bytedance.sdk.component.utils.C10626e;
import com.bytedance.sdk.component.utils.C10627f;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0517j;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.p005c.C0196d;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0967e;
import com.bytedance.sdk.openadsdk.utils.C0988n;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.com.bytedance.overseas.sdk.p057b.C1010a;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.i.d */
/* compiled from: SdkSettingsHelper */
public class C0512d implements Runnable {

    /* renamed from: d */
    private static final AtomicLong f1867d = new AtomicLong(0);

    /* renamed from: e */
    private static volatile C0512d f1868e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile boolean f1869f = false;

    /* renamed from: g */
    private static boolean f1870g = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0510b f1871a;

    /* renamed from: b */
    private final Context f1872b;

    /* renamed from: c */
    private final Executor f1873c;

    /* renamed from: com.bytedance.sdk.openadsdk.core.i.d$a */
    /* compiled from: SdkSettingsHelper */
    private class C0514a extends BroadcastReceiver {
        private C0514a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                int intExtra = intent.getIntExtra(C10601c.c1657027613239dc("b^opcZoc"), -1);
                if (intExtra == 1) {
                    long longExtra = intent.getLongExtra(C10601c.c1657027613239dc("b^opcZrnel"), -1);
                    if (longExtra > 0) {
                        C0512d.m2388d().set(longExtra);
                    }
                } else if (intExtra == 2) {
                    try {
                        if (C0512d.this.f1871a != null) {
                            C0512d.this.f1871a.mo1657a();
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private C0512d(C0510b bVar) {
        this.f1871a = bVar == null ? C0558m.m2673h() : bVar;
        this.f1872b = C0558m.m2663a();
        this.f1873c = Executors.newSingleThreadExecutor();
        if (C0934b.m4334c()) {
            try {
                this.f1872b.registerReceiver(new C0514a(), new IntentFilter(C10522a.a1657027613264dc("cno-f|rblhdhi#auswgq}9k|nousyMEBGJR@T")));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static int m2376a(Context context) {
        if (context == null || !m2387c(context)) {
            return -2;
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(C10584a.a1657027613243dc("I@@WGCY`lyxJ|}bfub"), -1);
    }

    /* renamed from: a */
    public static C0512d m2378a(C0510b bVar) {
        Class<C0512d> cls = C0512d.class;
        if (f1868e == null) {
            synchronized (cls) {
                if (f1868e == null) {
                    f1868e = new C0512d(bVar);
                }
            }
        }
        return f1868e;
    }

    /* renamed from: a */
    private JSONObject m2379a(JSONObject jSONObject) {
        return f1870g ? C10621a.m31186a(jSONObject) : jSONObject;
    }

    /* renamed from: a */
    public static void m2380a() {
        try {
            Context a = C0558m.m2663a();
            File file = new File(Build.VERSION.SDK_INT >= 24 ? new File(a.getDataDir(), C10522a.a1657027613264dc("sicqaaYwzllx")) : new File(a.getDatabasePath(C10548g.g1657027613257dc("1")).getParentFile().getParentFile(), C10548g.g1657027613257dc("sicqaaYwzllx")), C10522a.a1657027613264dc("tu]p`nYtm}~bbj}!h|~"));
            if (file.exists()) {
                if (file.isFile()) {
                    String replace = file.getName().replace(C10522a.a1657027613264dc(".yoo"), "");
                    if (Build.VERSION.SDK_INT >= 24) {
                        a.deleteSharedPreferences(replace);
                    } else {
                        a.getSharedPreferences(replace, 0).edit().clear().apply();
                        C10627f.m31210c(file);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m2381a(long j) {
        if (j > 0 && C0558m.m2663a() != null) {
            try {
                Intent intent = new Intent();
                intent.setAction(C10469e.e1657027613270dc("cno-f|rblhdhi#auswgq}9k|nousyMEBGJR@T"));
                intent.putExtra(C10469e.e1657027613270dc("b^opcZoc"), 1);
                intent.putExtra(C10469e.e1657027613270dc("b^opcZrnel"), j);
                C0558m.m2663a().sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2383a(String str, Map<String, String> map) {
        int i = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                int intValue = Integer.valueOf(map.get(C10601c.c1657027613239dc("abvjr`+dgg~yca"))).intValue();
                long longValue = Long.valueOf(map.get(C10601c.c1657027613239dc("tr"))).longValue();
                String str2 = map.get(C10601c.c1657027613239dc("prv"));
                String a = C10201b.m29279a(str + intValue + longValue);
                if (a != null && a.equalsIgnoreCase(str2)) {
                    i = intValue;
                }
            }
        } catch (Throwable unused) {
        }
        C0515e.m2396a(i);
    }

    /* renamed from: b */
    public static String m2384b(Context context) {
        return context != null ? PreferenceManager.getDefaultSharedPreferences(context).getString(C0516f.f1878b, "") : "";
    }

    /* renamed from: b */
    public static void m2385b() {
        if (C0558m.m2663a() != null) {
            try {
                Intent intent = new Intent();
                intent.setAction(C10469e.e1657027613270dc("cno-f|rblhdhi#auswgq}9k|nousyMEBGJR@T"));
                intent.putExtra(C10469e.e1657027613270dc("b^opcZoc"), 2);
                C0558m.m2663a().sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ boolean m2386b(boolean r3) {
        /*
        L_0x0000:
            r0 = 94
            r1 = 75
            r2 = 93
        L_0x0006:
            switch(r0) {
                case 92: goto L_0x000e;
                case 93: goto L_0x0011;
                case 94: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x001c
        L_0x000a:
            r0 = 4
            if (r1 > r0) goto L_0x0016
            goto L_0x001c
        L_0x000e:
            switch(r1) {
                case 21: goto L_0x0016;
                case 22: goto L_0x0015;
                case 23: goto L_0x0015;
                default: goto L_0x0011;
            }
        L_0x0011:
            switch(r1) {
                case 91: goto L_0x0000;
                case 92: goto L_0x0016;
                case 93: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0019
        L_0x0015:
            return r3
        L_0x0016:
            f1869f = r3
            goto L_0x001c
        L_0x0019:
            r1 = 91
            goto L_0x0011
        L_0x001c:
            r0 = 93
            r1 = 93
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p025i.C0512d.m2386b(boolean):boolean");
    }

    /* renamed from: c */
    private static boolean m2387c(Context context) {
        if (context == null) {
            return true;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return (defaultSharedPreferences.getInt(C10584a.a1657027613243dc("I@@WGCYDeyYogDJ"), RecyclerView.UNDEFINED_DURATION) == Integer.MIN_VALUE && defaultSharedPreferences.getInt(C10584a.a1657027613243dc("I@@WGCYDeyYog[k}cx}}"), RecyclerView.UNDEFINED_DURATION) == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: d */
    static /* synthetic */ AtomicLong m2388d() {
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
        return f1867d;
    }

    /* renamed from: f */
    private boolean m2390f() {
        return TextUtils.isEmpty(C0503h.m2281d().mo1603f());
    }

    /* renamed from: g */
    private JSONObject m2391g() {
        JSONObject jSONObject = new JSONObject();
        int i = 1;
        C0996u.m4626a(jSONObject, true);
        try {
            int j = C0503h.m2281d().mo1609j();
            String d1657027613261dc = C10545d.d1657027613261dc("sdvwmka");
            C10638l.m31235b(d1657027613261dc, C10545d.d1657027613261dc("Sdvwmkat  $bJjbDavf5+") + C0558m.m2673h().mo1723x());
            jSONObject.put(C10545d.d1657027613261dc("mnffh"), Build.MODEL);
            jSONObject.put(C10545d.d1657027613261dc("ddtjg`Yda}s"), C0996u.m4689n());
            C0516f h = C0558m.m2673h();
            if (h.mo1715p(C10545d.d1657027613261dc("g`kg"))) {
                jSONObject.put(C10548g.g1657027613257dc("g`kg"), C1010a.m4777a().mo2932b());
            }
            jSONObject.put(C10545d.d1657027613261dc("gerq"), j);
            jSONObject.put(C10545d.d1657027613261dc("cnrse"), C0503h.m2281d().mo1608i());
            jSONObject.put(C10545d.d1657027613261dc("cbrb"), C0503h.m2281d().mo1621v());
            String d1657027613261dc2 = C10545d.d1657027613261dc("SeiPaqrnfnyCia~jb");
            C10638l.m31238c(d1657027613261dc2, C10545d.d1657027613261dc("cnrse%;") + C0503h.m2281d().mo1608i());
            if (h.mo1715p(C10545d.d1657027613261dc("mba"))) {
                jSONObject.put(C10545d.d1657027613261dc("mba"), C0988n.m4582b());
            }
            jSONObject.put(C10545d.d1657027613261dc("cnlm[qwm"), C0996u.m4695p(this.f1872b));
            jSONObject.put(C10545d.d1657027613261dc("or"), 1);
            jSONObject.put(C10545d.d1657027613261dc("owgqw`gX~lxxeb`Pdhbv"), 1);
            jSONObject.put(C10545d.d1657027613261dc("or]uawungg"), String.valueOf(Build.VERSION.RELEASE));
            jSONObject.put(C10545d.d1657027613261dc("sei\\r`ttafd"), C10545d.d1657027613261dc("4/7-4+0"));
            jSONObject.put(C10545d.d1657027613261dc("l`ldqdab"), C0517j.m2473a());
            jSONObject.put(C10545d.d1657027613261dc("thof[iim"), C0996u.m4697q());
            jSONObject.put(C10545d.d1657027613261dc("p`ahebcXfhgn"), C0996u.m4648d());
            boolean c = C0996u.m4643c(this.f1872b, C0996u.m4648d());
            String d1657027613261dc3 = C10545d.d1657027613261dc("irCstiodi}cdbKa}uv`|a{r");
            C10638l.m31238c(d1657027613261dc3, C10545d.d1657027613261dc("irCstiodi}cdbKa}uv`|a{r-") + c);
            String d1657027613261dc4 = C10545d.d1657027613261dc("pnqjplii");
            if (!c) {
                i = 2;
            }
            jSONObject.put(d1657027613261dc4, i);
            jSONObject.put(C10545d.d1657027613261dc("aqr\\r`ttafd"), C0996u.m4660f());
            jSONObject.put(C10545d.d1657027613261dc("vdlgkw"), Build.MANUFACTURER);
            jSONObject.put(C10545d.d1657027613261dc("utkg"), C0517j.m2478c(this.f1872b));
            if (!(C0503h.m2281d() == null || C0503h.m2281d().mo1603f() == null)) {
                jSONObject.put(C10545d.d1657027613261dc("aqr\\ma"), C0503h.m2281d().mo1603f());
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put(C10545d.d1657027613261dc("tr"), currentTimeMillis);
            String str = "";
            if (!(C0503h.m2281d() == null || C0503h.m2281d().mo1603f() == null)) {
                str = C0503h.m2281d().mo1603f().concat(String.valueOf(currentTimeMillis)).concat(C10545d.d1657027613261dc("4/7-4+0"));
            }
            jSONObject.put(C10545d.d1657027613261dc("rds\\wlai"), C10626e.m31201a(str));
            jSONObject.put(C10545d.d1657027613261dc("tbqwvlh`"), m2384b(this.f1872b));
            jSONObject.put(C10545d.d1657027613261dc("tbd\\cavu"), m2376a(this.f1872b));
            jSONObject.put(C10545d.d1657027613261dc("llv"), C0967e.m4489b());
            jSONObject.put(C10545d.d1657027613261dc("lnabh`Ykigm~mjk"), C0967e.m4495c());
            jSONObject.put(C10545d.d1657027613261dc("cicmj`j"), C10545d.d1657027613261dc("m`km"));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo1659a(boolean z) {
        try {
            if (!m2390f()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (z || currentTimeMillis - f1867d.get() >= TTAdConstant.AD_MAX_EVENT_TIME) {
                    f1867d.set(currentTimeMillis);
                    if (C0934b.m4334c()) {
                        m2381a(currentTimeMillis);
                    }
                    this.f1873c.execute(this);
                }
            }
        } catch (Throwable th) {
            C10638l.m31230a(C10469e.e1657027613270dc("SeiPaqrnfnyCia~jb"), C10469e.e1657027613270dc("lncg$vbl(zoxd`hc1wafzd-8"), th);
        }
    }

    /* renamed from: c */
    public void mo1660c() {
        C0967e.m4504g();
    }

    public void run() {
        if (!C10642o.m31257a(this.f1872b)) {
            try {
                this.f1871a.mo1657a();
            } catch (Throwable unused) {
            }
        } else if (!m2390f()) {
            C10638l.m31238c(C10601c.c1657027613239dc("SeiPaqrnfnyCia~jb"), C10601c.c1657027613239dc("Fdv`l%ub|}cek-|jadw``5ecykn"));
            JSONObject g = m2391g();
            C10582d b = C0835d.m4093a().mo2660b().mo64150b();
            try {
                b.mo64176a(C0196d.m815a(b, C0996u.m4665g(C10601c.c1657027613239dc("/`rj+db(}gcdb\"}k{>av`ayj5"))));
                b.mo64179b(C10601c.c1657027613239dc("Urgq)Dabf}"), C0996u.m4631b());
            } catch (Exception unused2) {
            }
            b.mo64186c(m2379a(g).toString());
            b.mo64184a((C10575a) new C10575a() {
                /* JADX WARNING: Can't fix incorrect switch cases order */
                /* JADX WARNING: Can't wrap try/catch for region: R(9:12|(2:14|(3:16|17|18))|21|22|23|24|(3:26|42|30)|39|(2:41|44)(1:45)) */
                /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
                    com.bytedance.sdk.openadsdk.core.p025i.C0512d.m2386b(true);
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
                /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void mo444a(com.bytedance.sdk.component.p323e.p325b.C10581c r6, com.bytedance.sdk.component.p323e.C10576b r7) {
                    /*
                        r5 = this;
                        r6 = 5
                        if (r7 == 0) goto L_0x0082
                        boolean r0 = r7.mo64166f()
                        if (r0 == 0) goto L_0x0082
                        java.lang.String r0 = r7.mo64164d()
                        java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                        if (r0 != 0) goto L_0x0082
                        r0 = 0
                        org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0020 }
                        java.lang.String r2 = r7.mo64164d()     // Catch:{ JSONException -> 0x0020 }
                        r1.<init>(r2)     // Catch:{ JSONException -> 0x0020 }
                        goto L_0x0027
                    L_0x0020:
                        r1 = move-exception
                        org.json.JSONException r1 = (org.json.JSONException) r1
                        r1.printStackTrace()
                        r1 = r0
                    L_0x0027:
                        if (r1 == 0) goto L_0x0082
                        java.lang.String r2 = "cxrkaw"
                        java.lang.String r2 = com.bytedance.sdk.component.p323e.p326c.C10591e.e1657027613237dc(r2)
                        r3 = -1
                        int r2 = r1.optInt(r2, r3)
                        r3 = 3
                        if (r2 != r3) goto L_0x0065
                        java.lang.String r0 = "mdqpebc"
                        java.lang.String r0 = com.bytedance.sdk.component.p323e.p326c.C10591e.e1657027613237dc(r0)
                        java.lang.String r0 = r1.optString(r0)
                        java.lang.String r0 = com.bytedance.sdk.component.utils.C10621a.m31188b(r0)
                        r2 = r0
                        java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                        boolean r2 = android.text.TextUtils.isEmpty(r2)
                        if (r2 != 0) goto L_0x0065
                        org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0055 }
                        r2.<init>(r0)     // Catch:{ all -> 0x0055 }
                        r1 = r2
                        goto L_0x0065
                    L_0x0055:
                        r2 = move-exception
                        java.lang.String r3 = "SeiPaqrnfnyCia~jb"
                        java.lang.String r3 = com.bytedance.sdk.component.p323e.p326c.C10591e.e1657027613237dc(r3)
                        java.lang.String r4 = "sdvwmka'lh~j,h|}c )4"
                        java.lang.String r4 = com.bytedance.sdk.component.p323e.p326c.C10591e.e1657027613237dc(r4)
                        com.bytedance.sdk.component.utils.C10638l.m31230a(r3, r4, r2)
                    L_0x0065:
                        java.util.Map r7 = r7.mo64163c()     // Catch:{ all -> 0x006e }
                        com.bytedance.sdk.openadsdk.core.i.d r2 = com.bytedance.sdk.openadsdk.core.p025i.C0512d.this     // Catch:{ all -> 0x006e }
                        r2.m2383a(r0, r7)     // Catch:{ all -> 0x006e }
                    L_0x006e:
                        com.bytedance.sdk.openadsdk.core.i.d r7 = com.bytedance.sdk.openadsdk.core.p025i.C0512d.this     // Catch:{ all -> 0x009d }
                        com.bytedance.sdk.openadsdk.core.i.b r7 = r7.f1871a     // Catch:{ all -> 0x009d }
                        r7.mo1658a(r1)     // Catch:{ all -> 0x009d }
                        boolean r7 = com.bytedance.sdk.openadsdk.core.p025i.C0512d.f1869f     // Catch:{ all -> 0x009d }
                        if (r7 != 0) goto L_0x009e
                        r7 = 11
                        r0 = 11
                        goto L_0x00a8
                    L_0x0082:
                        com.bytedance.sdk.openadsdk.core.i.d r7 = com.bytedance.sdk.openadsdk.core.p025i.C0512d.this     // Catch:{ all -> 0x00ab }
                        com.bytedance.sdk.openadsdk.core.i.b r7 = r7.f1871a     // Catch:{ all -> 0x00ab }
                        r7.mo1657a()     // Catch:{ all -> 0x00ab }
                        r7 = 64
                        r0 = 5
                    L_0x008e:
                        switch(r7) {
                            case 63: goto L_0x0098;
                            case 64: goto L_0x0092;
                            case 65: goto L_0x0098;
                            default: goto L_0x0091;
                        }
                    L_0x0091:
                        goto L_0x00a8
                    L_0x0092:
                        r7 = 4
                        if (r0 == r7) goto L_0x0098
                        if (r0 == r6) goto L_0x00ab
                        r6 = 6
                    L_0x0098:
                        r6 = 1
                        com.bytedance.sdk.openadsdk.core.p025i.C0512d.m2386b((boolean) r6)     // Catch:{ all -> 0x009d }
                        goto L_0x009e
                    L_0x009d:
                    L_0x009e:
                        boolean r6 = com.bytedance.sdk.openadsdk.multipro.C0934b.m4334c()
                        if (r6 == 0) goto L_0x00a7
                        com.bytedance.sdk.openadsdk.core.p025i.C0512d.m2385b()
                    L_0x00a7:
                        return
                    L_0x00a8:
                        r7 = 63
                        goto L_0x008e
                    L_0x00ab:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p025i.C0512d.C05131.mo444a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                }

                /* renamed from: a */
                public void mo445a(C10581c cVar, IOException iOException) {
                    try {
                        C0512d.this.f1871a.mo1657a();
                    } catch (Throwable unused) {
                    }
                }
            });
        } else {
            return;
        }
        mo1660c();
    }
}
