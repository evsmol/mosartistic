package com.bytedance.sdk.component.p323e.p326c;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.appnext.base.p264b.C8849c;
import com.bytedance.sdk.component.p323e.C10572a;
import com.bytedance.sdk.component.p323e.C10576b;
import com.bytedance.sdk.component.p323e.p324a.C10575a;
import com.bytedance.sdk.component.p323e.p325b.C10579b;
import com.bytedance.sdk.component.p323e.p325b.C10581c;
import com.bytedance.sdk.component.p323e.p327d.C10596b;
import com.bytedance.sdk.component.p323e.p327d.C10603e;
import com.bytedance.sdk.component.p323e.p327d.C10604f;
import com.bytedance.sdk.component.p323e.p327d.C10605g;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.e.c.a */
/* compiled from: AppConfig */
public class C10584a implements C10605g.C10606a {

    /* renamed from: b */
    private static C10584a f26388b;

    /* renamed from: a */
    final C10605g f26389a = new C10605g(Looper.getMainLooper(), this);

    /* renamed from: c */
    private final boolean f26390c;

    /* renamed from: d */
    private volatile boolean f26391d = false;

    /* renamed from: e */
    private boolean f26392e = true;

    /* renamed from: f */
    private boolean f26393f = false;

    /* renamed from: g */
    private long f26394g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f26395h = 0;

    /* renamed from: i */
    private ThreadPoolExecutor f26396i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AtomicBoolean f26397j = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Context f26398k;

    /* renamed from: l */
    private volatile boolean f26399l = false;

    /* renamed from: m */
    private C10572a f26400m;

    /* renamed from: n */
    private int f26401n;

    public C10584a(Context context, int i) {
        this.f26398k = context;
        this.f26390c = C10604f.m31132b(context);
        this.f26401n = i;
    }

    private C10584a(Context context, boolean z) {
        this.f26398k = context;
        this.f26390c = z;
    }

    /* renamed from: a */
    public static C10584a m31043a(Context context) {
        C10584a aVar;
        synchronized (C10584a.class) {
            if (f26388b == null) {
                f26388b = new C10584a(context.getApplicationContext(), C10604f.m31132b(context));
            }
            aVar = f26388b;
        }
        return aVar;
    }

    /* renamed from: a */
    private String m31044a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "https://" + str + "/get_domains/v4/";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31045a(final int i) {
        String[] f = mo64196f();
        if (f == null || f.length <= i) {
            m31051b(102);
            return;
        }
        String str = f[i];
        if (TextUtils.isEmpty(str)) {
            m31051b(102);
            return;
        }
        try {
            String a = m31044a(str);
            if (TextUtils.isEmpty(a)) {
                m31051b(102);
                return;
            }
            C10579b c = m31056i().mo64151c();
            c.mo64176a(a);
            m31046a(c);
            c.mo64173a(new C10575a() {
                /* renamed from: a */
                public void mo444a(C10581c cVar, C10576b bVar) {
                    JSONObject jSONObject;
                    if (bVar == null || !bVar.mo64166f()) {
                        C10584a.this.m31045a(i + 1);
                        return;
                    }
                    String str = null;
                    try {
                        jSONObject = new JSONObject(bVar.mo64164d());
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        C10584a.this.m31045a(i + 1);
                        return;
                    }
                    try {
                        str = jSONObject.getString("message");
                    } catch (Exception unused2) {
                    }
                    if (!"success".equals(str)) {
                        C10584a.this.m31045a(i + 1);
                        return;
                    }
                    try {
                        if (C10584a.this.m31049a((Object) jSONObject)) {
                            C10584a.this.m31051b(101);
                        } else {
                            C10584a.this.m31045a(i + 1);
                        }
                    } catch (Exception unused3) {
                    }
                }

                /* renamed from: a */
                public void mo445a(C10581c cVar, IOException iOException) {
                    C10584a.this.m31045a(i + 1);
                }
            });
        } catch (Throwable th) {
            C10596b.m31119b("AppConfig", "try app config exception: " + th);
        }
    }

    /* renamed from: a */
    private void m31046a(C10579b bVar) {
        if (bVar != null) {
            Address address = null;
            if (C10594g.m31112a().mo64222a(this.f26401n).mo64214d() != null) {
                address = C10594g.m31112a().mo64222a(this.f26401n).mo64214d().mo2650a(this.f26398k);
            }
            if (address != null && address.hasLatitude() && address.hasLongitude()) {
                bVar.mo64174a("latitude", address.getLatitude() + "");
                bVar.mo64174a("longitude", address.getLongitude() + "");
                String locality = address.getLocality();
                if (!TextUtils.isEmpty(locality)) {
                    bVar.mo64174a("city", Uri.encode(locality));
                }
            }
            if (this.f26391d) {
                bVar.mo64174a("force", "1");
            }
            try {
                bVar.mo64174a("abi", Build.VERSION.SDK_INT < 21 ? Build.CPU_ABI : Build.SUPPORTED_ABIS[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (C10594g.m31112a().mo64222a(this.f26401n).mo64214d() != null) {
                bVar.mo64174a("aid", C10594g.m31112a().mo64222a(this.f26401n).mo64214d().mo2649a() + "");
                bVar.mo64174a("device_platform", C10594g.m31112a().mo64222a(this.f26401n).mo64214d().mo2654c());
                bVar.mo64174a("channel", C10594g.m31112a().mo64222a(this.f26401n).mo64214d().mo2653b());
                bVar.mo64174a("version_code", C10594g.m31112a().mo64222a(this.f26401n).mo64214d().mo2655d() + "");
                bVar.mo64174a("custom_info_1", C10594g.m31112a().mo64222a(this.f26401n).mo64214d().mo2656e());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m31049a(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString("message"))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(C8849c.DATA);
        synchronized (this) {
            SharedPreferences.Editor edit = this.f26398k.getSharedPreferences("ss_app_config", 0).edit();
            edit.putLong("last_refresh_time", System.currentTimeMillis());
            edit.apply();
        }
        if (C10594g.m31112a().mo64222a(this.f26401n).mo64218h() == null) {
            return true;
        }
        C10594g.m31112a().mo64222a(this.f26401n).mo64218h().mo64202a(jSONObject2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'J';
        r1 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x000f;
            case 56: goto L_0x0026;
            case 57: goto L_0x0026;
            default: goto L_0x000e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r2.toCharArray();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 >= r2.length) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2[r0] = (char) (r2[r0] ^ r0);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.lang.String(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a1657027613243dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 73
            r1 = 96
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0026;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0000;
                case 95: goto L_0x0026;
                case 96: goto L_0x0026;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x000f;
                case 56: goto L_0x0026;
                case 57: goto L_0x0026;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0000
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 74
            r1 = 55
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p323e.p326c.C10584a.a1657027613243dc(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m31051b(int i) {
        C10605g gVar = this.f26389a;
        if (gVar != null) {
            gVar.sendEmptyMessage(i);
        }
    }

    /* renamed from: b */
    public static void m31052b(Context context) {
        C10584a aVar = f26388b;
        if (aVar == null) {
            return;
        }
        if (C10604f.m31132b(context)) {
            aVar.mo64190a(true);
        } else {
            aVar.mo64187a();
        }
    }

    /* renamed from: c */
    private void m31054c(boolean z) {
        if (!this.f26393f) {
            if (this.f26392e) {
                this.f26392e = false;
                this.f26394g = 0;
                this.f26395h = 0;
            }
            long j = z ? 10800000 : 43200000;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f26394g <= j) {
                return;
            }
            if (currentTimeMillis - this.f26395h > 120000 || !this.f26399l) {
                mo64193c();
            }
        }
    }

    /* renamed from: h */
    private boolean m31055h() {
        String[] f = mo64196f();
        if (!(f == null || f.length == 0)) {
            m31045a(0);
        }
        return false;
    }

    /* renamed from: i */
    private C10572a m31056i() {
        if (this.f26400m == null) {
            this.f26400m = new C10572a.C10574a().mo64154a(10, TimeUnit.SECONDS).mo64157b(10, TimeUnit.SECONDS).mo64158c(10, TimeUnit.SECONDS).mo64156a();
        }
        return this.f26400m;
    }

    /* renamed from: a */
    public void mo64187a() {
        mo64190a(false);
    }

    /* renamed from: a */
    public void mo64188a(Message message) {
        int i = message.what;
        if (i == 101) {
            this.f26393f = false;
            this.f26394g = System.currentTimeMillis();
            C10596b.m31119b("TNCManager", "doRefresh, succ");
            if (this.f26392e) {
                mo64187a();
            }
        } else if (i == 102) {
            this.f26393f = false;
            if (this.f26392e) {
                mo64187a();
            }
            C10596b.m31119b("TNCManager", "doRefresh, error");
        } else {
            return;
        }
        this.f26397j.set(false);
    }

    /* renamed from: a */
    public void mo64189a(ThreadPoolExecutor threadPoolExecutor) {
        this.f26396i = threadPoolExecutor;
    }

    /* renamed from: a */
    public synchronized void mo64190a(boolean z) {
        if (this.f26390c) {
            m31054c(z);
        } else if (this.f26394g <= 0) {
            try {
                mo64197g().execute(new Runnable() {
                    public void run() {
                        C10584a.this.mo64191b();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo64191b() {
        if (System.currentTimeMillis() - this.f26394g > 3600000) {
            this.f26394g = System.currentTimeMillis();
            try {
                if (C10594g.m31112a().mo64222a(this.f26401n).mo64218h() != null) {
                    C10594g.m31112a().mo64222a(this.f26401n).mo64218h().mo64203b();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo64192b(boolean z) {
        C10596b.m31119b("TNCManager", "doRefresh, actual request");
        mo64194d();
        this.f26393f = true;
        if (!z) {
            this.f26389a.sendEmptyMessage(102);
            return;
        }
        try {
            m31055h();
        } catch (Exception unused) {
            this.f26397j.set(false);
        }
    }

    /* renamed from: c */
    public boolean mo64193c() {
        C10596b.m31119b("TNCManager", "doRefresh: updating state " + this.f26397j.get());
        mo64197g().execute(new Runnable() {
            public void run() {
                boolean a = C10603e.m31129a(C10584a.this.f26398k);
                if (a) {
                    long unused = C10584a.this.f26395h = System.currentTimeMillis();
                    if (!C10584a.this.f26397j.compareAndSet(false, true)) {
                        C10596b.m31119b("TNCManager", "doRefresh, already running");
                    } else {
                        C10584a.this.mo64192b(a);
                    }
                }
            }
        });
        return true;
    }

    /* renamed from: d */
    public synchronized void mo64194d() {
        if (!this.f26399l) {
            this.f26399l = true;
            long j = this.f26398k.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (j > currentTimeMillis) {
                j = currentTimeMillis;
            }
            this.f26394g = j;
            try {
                if (C10594g.m31112a().mo64222a(this.f26401n).mo64218h() != null) {
                    C10594g.m31112a().mo64222a(this.f26401n).mo64218h().mo64201a();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public void mo64195e() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                if (this.f26390c) {
                    mo64194d();
                } else {
                    mo64191b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: f */
    public String[] mo64196f() {
        String[] f = C10594g.m31112a().mo64222a(this.f26401n).mo64214d() != null ? C10594g.m31112a().mo64222a(this.f26401n).mo64214d().mo2657f() : null;
        return (f == null || f.length <= 0) ? new String[0] : f;
    }

    /* renamed from: g */
    public ThreadPoolExecutor mo64197g() {
        Class<C10584a> cls = C10584a.class;
        if (this.f26396i == null) {
            synchronized (cls) {
                if (this.f26396i == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    this.f26396i = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return this.f26396i;
    }
}
