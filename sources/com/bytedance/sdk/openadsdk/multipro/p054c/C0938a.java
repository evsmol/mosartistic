package com.bytedance.sdk.openadsdk.multipro.p054c;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.multipro.C0894a;
import com.bytedance.sdk.openadsdk.multipro.C0937c;
import com.bytedance.sdk.openadsdk.multipro.C0950e;
import com.bytedance.sdk.openadsdk.multipro.p050a.C0895a;
import com.bytedance.sdk.openadsdk.p000b.C0106a;
import com.bytedance.sdk.openadsdk.p000b.C0132c;
import com.bytedance.sdk.openadsdk.p000b.C0139f;
import com.bytedance.sdk.openadsdk.p000b.C0140g;
import com.bytedance.sdk.openadsdk.p000b.C0141h;
import com.bytedance.sdk.openadsdk.p000b.C0160q;
import com.bytedance.sdk.openadsdk.p000b.C0162s;
import com.bytedance.sdk.openadsdk.p000b.C0163t;
import com.bytedance.sdk.openadsdk.p042h.C0793a;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0794a;
import com.bytedance.sdk.openadsdk.p042h.p045c.C0818c;
import com.bytedance.sdk.openadsdk.p049k.C0883a;
import com.bytedance.sdk.openadsdk.p049k.C0884b;
import com.bytedance.sdk.openadsdk.p049k.C0893h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a */
/* compiled from: AdEventProviderImpl */
public class C0938a implements C0894a {
    /* renamed from: a */
    public int mo2756a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public int mo2757a(Uri uri, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public Cursor mo2758a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* renamed from: a */
    public Uri mo2759a(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* renamed from: a */
    public String mo2760a() {
        return "t_event_ad_event";
    }

    /* renamed from: b */
    public void mo2762b() {
    }

    /* renamed from: f */
    private static IListenerManager m4355f() {
        try {
            if (C0558m.m2663a() != null) {
                return C0895a.m4283a(C0558m.m2663a());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m4352c() {
        if (C0558m.m2663a() != null) {
            try {
                IListenerManager f = m4355f();
                if (f != null) {
                    f.getType(Uri.parse(m4356g() + "adEventStart"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m4350a(boolean z) {
        if (C0558m.m2663a() != null) {
            try {
                IListenerManager f = m4355f();
                if (f != null) {
                    f.getType(Uri.parse(m4356g() + "logStatusStart" + ("?isRealTime=" + String.valueOf(z))));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m4347a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C10638l.m31235b("AdEventProviderImpl", "dispatch event");
            try {
                IListenerManager f = m4355f();
                if (f != null) {
                    String a = C0937c.m4345a(str);
                    f.getType(Uri.parse(m4356g() + "adEventDispatch" + "?event=" + a));
                }
            } catch (Throwable th) {
                C10638l.m31242e("AdEventProviderImpl", "dispatch event Throwable:" + th.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m4349a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            try {
                StringBuilder sb = new StringBuilder();
                for (String a : list) {
                    sb.append(C0937c.m4345a(a));
                    sb.append(",");
                }
                String a2 = C0937c.m4345a(sb.toString());
                String str = "?track=" + String.valueOf(a2);
                IListenerManager f = m4355f();
                if (f != null) {
                    f.getType(Uri.parse(m4356g() + "trackUrl" + str));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m4353d() {
        try {
            IListenerManager f = m4355f();
            if (f != null) {
                f.getType(Uri.parse(m4356g() + "trackFailed"));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public static void m4354e() {
        try {
            IListenerManager f = m4355f();
            if (f != null) {
                f.getType(Uri.parse(m4356g() + "logStatusInit"));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m4351b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                IListenerManager f = m4355f();
                if (f != null) {
                    String a = C0937c.m4345a(str);
                    f.getType(Uri.parse(m4356g() + "logStatusUpload" + "?event=" + a));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m4348a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            try {
                IListenerManager f = m4355f();
                if (f != null) {
                    f.getType(Uri.parse(m4356g() + "logStatusDispatch" + ("?event=" + C0937c.m4345a(str) + "&isRealTime=" + String.valueOf(z))));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    private static String m4356g() {
        return C0950e.f3265b + "/" + "t_event_ad_event" + "/";
    }

    /* renamed from: a */
    public String mo2761a(Uri uri) {
        String str = uri.getPath().split("/")[2];
        if ("adEventStart".equals(str)) {
            C10638l.m31235b("AdEventProviderImpl", "====ad event function will be start====");
            C0941b.m4368a().mo393a();
        } else if ("logStatusStart".equals(str)) {
            C10638l.m31235b("AdEventProviderImpl", "====log stats function will be start====");
            if (Boolean.valueOf(uri.getQueryParameter("isRealTime")).booleanValue()) {
                C0941b.m4371c().mo393a();
            } else {
                C0941b.m4370b().mo393a();
            }
        } else if ("adEventDispatch".equals(str)) {
            C10638l.m31235b("AdEventProviderImpl", "dispatch FUN_AD_EVENT_DISPATCH");
            C0106a a = C0106a.m433a(C0937c.m4346b(uri.getQueryParameter("event")));
            if (a != null) {
                C0941b.m4368a().mo394a(a);
            }
        } else if ("logStatusDispatch".equals(str)) {
            Boolean valueOf = Boolean.valueOf(uri.getQueryParameter("isRealTime"));
            C0818c.C0821a a2 = C0818c.C0821a.m4037a(C0937c.m4346b(uri.getQueryParameter("event")));
            if (a2 == null) {
                return null;
            }
            if (valueOf.booleanValue()) {
                C0941b.m4371c().mo394a(a2);
            } else {
                C0941b.m4370b().mo394a(a2);
            }
        } else if ("trackUrl".equals(str)) {
            try {
                String[] split = C0937c.m4346b(uri.getQueryParameter("track")).split(",");
                if (split.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String b : split) {
                        String b2 = C0937c.m4346b(b);
                        if (!TextUtils.isEmpty(b2)) {
                            arrayList.add(b2);
                        }
                    }
                    C0944d.m4375a().mo2740a(arrayList);
                }
            } catch (Throwable unused) {
            }
        } else if ("trackFailed".equals(str)) {
            C0944d.m4375a().mo2739a();
            C10638l.m31235b("AdEventProviderImpl", "track failed: ");
        } else if ("logStatusInit".equals(str)) {
            C0943c.m4374a().mo2621a();
        } else if ("logStatusUpload".equals(str)) {
            final String b3 = C0937c.m4346b(uri.getQueryParameter("event"));
            if (!TextUtils.isEmpty(b3)) {
                C0943c.m4374a().mo2622a((C0793a) new C0793a() {
                    /* renamed from: a */
                    public C0794a mo322a() throws Exception {
                        return C0940a.m4366b(b3);
                    }
                });
            }
        }
        return null;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$b */
    /* compiled from: AdEventProviderImpl */
    private static class C0941b {

        /* renamed from: a */
        private static volatile C0132c<C0106a> f3256a;

        /* renamed from: b */
        private static volatile C0132c<C0818c.C0821a> f3257b;

        /* renamed from: c */
        private static volatile C0132c<C0818c.C0821a> f3258c;

        /* renamed from: a */
        static C0132c<C0106a> m4368a() {
            if (f3256a == null) {
                synchronized (C0558m.class) {
                    if (f3256a == null) {
                        f3256a = new C0132c<>(new C0140g(C0558m.m2663a()), C0558m.m2671f(), C0141h.C0144c.m688a(), m4372d());
                    }
                }
            }
            return f3256a;
        }

        /* renamed from: b */
        public static C0132c<C0818c.C0821a> m4370b() {
            if (f3258c == null) {
                synchronized (C0558m.class) {
                    if (f3258c == null) {
                        f3258c = m4369a("ttad_bk_batch_stats", "AdStatsEventBatchThread", false);
                    }
                }
            }
            return f3258c;
        }

        /* renamed from: c */
        public static C0132c<C0818c.C0821a> m4371c() {
            if (f3257b == null) {
                synchronized (C0558m.class) {
                    if (f3257b == null) {
                        f3257b = m4369a("ttad_bk_stats", "AdStatsEventThread", true);
                    }
                }
            }
            return f3257b;
        }

        /* renamed from: a */
        public static C0132c<C0818c.C0821a> m4369a(String str, String str2, boolean z) {
            C0139f fVar;
            C0141h.C0144c cVar;
            if (z) {
                fVar = new C0162s(C0558m.m2663a());
                cVar = C0141h.C0144c.m688a();
            } else {
                cVar = C0141h.C0144c.m689b();
                fVar = new C0160q(C0558m.m2663a());
            }
            C0141h.C0143b d = m4372d();
            return new C0132c(fVar, (C0561n) null, cVar, d, new C0163t(str, str2, fVar, (C0561n) null, cVar, d));
        }

        /* renamed from: d */
        private static C0141h.C0143b m4372d() {
            return new C0141h.C0143b() {
                /* renamed from: a */
                public boolean mo418a() {
                    return C10642o.m31257a(C0558m.m2663a());
                }
            };
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$d */
    /* compiled from: AdEventProviderImpl */
    private static class C0944d {

        /* renamed from: a */
        private static volatile C0883a f3260a;

        /* renamed from: a */
        public static C0883a m4375a() {
            if (f3260a == null) {
                synchronized (C0883a.class) {
                    if (f3260a == null) {
                        f3260a = new C0884b(C0558m.m2663a(), new C0893h(C0558m.m2663a()));
                    }
                }
            }
            return f3260a;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$c */
    /* compiled from: AdEventProviderImpl */
    private static class C0943c {

        /* renamed from: a */
        private static volatile C0818c f3259a;

        /* renamed from: a */
        public static C0818c m4374a() {
            if (f3259a == null) {
                synchronized (C0818c.class) {
                    if (f3259a == null) {
                        f3259a = new C0818c();
                    }
                }
            }
            return f3259a;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$a */
    /* compiled from: AdEventProviderImpl */
    private static class C0940a implements C0794a {

        /* renamed from: a */
        JSONObject f3255a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C0940a m4366b(String str) {
            return new C0940a(str);
        }

        private C0940a(String str) {
            try {
                this.f3255a = new JSONObject(str);
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        public JSONObject mo2576a() {
            return this.f3255a;
        }
    }
}
