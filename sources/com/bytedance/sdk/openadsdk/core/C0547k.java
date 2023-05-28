package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10263b;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10264c;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10265d;
import com.bytedance.sdk.component.adexpress.p294a.p296b.C10266a;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a;
import com.bytedance.sdk.component.p323e.p325b.C10577a;
import com.bytedance.sdk.component.p323e.p325b.C10579b;
import com.bytedance.sdk.component.widget.p330a.C10658a;
import com.bytedance.sdk.component.widget.p330a.C10659b;
import com.bytedance.sdk.component.widget.p331b.C10660a;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.p033b.C0642a;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C0933c;
import com.bytedance.sdk.openadsdk.multipro.p050a.C0895a;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0795b;
import com.bytedance.sdk.openadsdk.p046i.C0834c;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0984l;
import com.bytedance.sdk.openadsdk.utils.C0993r;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.k */
/* compiled from: InitHelper */
public class C0547k {

    /* renamed from: a */
    public static volatile boolean f2052a = false;

    /* renamed from: b */
    public static AtomicBoolean f2053b = new AtomicBoolean(false);

    /* renamed from: c */
    public static volatile boolean f2054c = false;

    /* renamed from: d */
    public static final List<TTAdSdk.InitCallback> f2055d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e */
    private static AtomicBoolean f2056e = new AtomicBoolean(false);

    /* renamed from: f */
    private static volatile HandlerThread f2057f;

    /* renamed from: g */
    private static volatile Handler f2058g;

    /* renamed from: h */
    private static volatile int f2059h = 0;

    /* renamed from: com.bytedance.sdk.openadsdk.core.k$a */
    /* compiled from: InitHelper */
    private static class C0552a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Handler f2060a = new Handler(Looper.getMainLooper());
    }

    static {
        f2057f = null;
        f2058g = null;
        f2057f = new HandlerThread("tt_pangle_thread_init", 10);
        f2057f.start();
        f2058g = new Handler(f2057f.getLooper());
    }

    /* renamed from: a */
    public static void m2616a() {
        Context a;
        if (C0558m.m2673h().mo1684d() && (a = C0558m.m2663a()) != null) {
            try {
                C0835d.m4093a().mo2660b().mo64149a(a, C0934b.m4334c(), true, new C0834c(a));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m2618a(Context context) {
        C0993r.m4598a();
        C1002v.m4712a(context);
        m2620b(context);
        C0558m.m2674i().mo2621a();
        C0624s.m3019a(C0517j.m2474a(context));
        C0558m.m2672g().mo2739a();
        C10266a.m29491a();
        C0642a.m3091a().mo2124b();
    }

    /* renamed from: b */
    public static void m2619b() {
        C10262a.m29464a().mo63090a((C10263b) new C10263b() {
            /* renamed from: a */
            public int mo1814a(String str, ContentValues contentValues, String str2, String[] strArr) {
                return C0895a.m4281a(C0558m.m2663a(), str, contentValues, str2, strArr);
            }

            /* renamed from: a */
            public Cursor mo1816a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new C0933c(C0895a.m4285a(C0558m.m2663a(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            /* renamed from: a */
            public int mo1815a(String str, String str2, String[] strArr) {
                return C0895a.m4282a(C0558m.m2663a(), str, str2, strArr);
            }

            /* renamed from: a */
            public void mo1817a(String str, ContentValues contentValues) {
                C0895a.m4287a(C0558m.m2663a(), str, contentValues);
            }
        });
        C10262a.m29464a().mo63091a((C10264c) new C10264c() {
            /* renamed from: d */
            public void mo1821d() {
            }

            /* renamed from: i */
            public int mo1826i() {
                return 1;
            }

            /* renamed from: k */
            public int mo1828k() {
                return 0;
            }

            /* renamed from: a */
            public int mo1818a() {
                if (C0558m.m2673h() == null) {
                    return 0;
                }
                return C0558m.m2673h().mo1677b();
            }

            /* renamed from: b */
            public Context mo1819b() {
                return C0558m.m2663a();
            }

            /* renamed from: c */
            public Handler mo1820c() {
                return C0547k.m2622d();
            }

            /* renamed from: e */
            public C10277a mo1822e() {
                return C0558m.m2671f().mo1837a();
            }

            /* renamed from: f */
            public C10577a mo1823f() {
                return C0835d.m4093a().mo2660b().mo64152d();
            }

            /* renamed from: g */
            public C10579b mo1824g() {
                return C0835d.m4093a().mo2660b().mo64151c();
            }

            /* renamed from: h */
            public String mo1825h() {
                return C0503h.m2281d().mo1603f();
            }

            /* renamed from: j */
            public int mo1827j() {
                return C0558m.m2673h().mo1670H();
            }
        });
        C10262a.m29464a().mo63092a((C10265d) new C10265d() {
            /* renamed from: a */
            public void mo1829a(int i) {
                C0796b.m3985a().mo2610b(C0795b.m3955b().mo2580b(i).mo2588f(C0492g.m2254a(i)));
            }
        });
        C10658a.m31358a().mo64367a(new C10659b() {
            /* renamed from: a */
            public boolean mo1831a() {
                return true;
            }

            /* renamed from: a */
            public void mo1830a(C10660a aVar, String str, String str2, JSONObject jSONObject, long j) {
                C0477n nVar = new C0477n();
                nVar.mo1463q(aVar.mo64369a());
                nVar.mo1452m(aVar.mo64372b());
                nVar.mo1446k(aVar.mo64374c());
                C0136e.m601a(C0558m.m2663a(), nVar, str, str2, jSONObject, j);
            }
        });
    }

    /* renamed from: b */
    private static void m2620b(Context context) {
        C0434c.m1779a(context).mo1176a(Constants.UUID, C0984l.m4553a());
    }

    /* renamed from: c */
    public static Handler m2621c() {
        if (f2057f == null || !f2057f.isAlive()) {
            synchronized (C0547k.class) {
                if (f2057f == null || !f2057f.isAlive()) {
                    f2057f = new HandlerThread("tt_pangle_thread_init", -1);
                    f2057f.start();
                    f2058g = new Handler(f2057f.getLooper());
                }
            }
        }
        return f2058g;
    }

    /* renamed from: d */
    public static Handler m2622d() {
        return C0552a.f2060a;
    }

    /* renamed from: e */
    public static int m2623e() {
        return f2059h;
    }

    /* renamed from: a */
    public static void m2617a(int i) {
        f2059h = i;
    }
}
