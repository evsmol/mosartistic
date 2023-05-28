package com.apm.insight.runtime.p179a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6663b;
import com.appnext.base.p264b.C8850d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.a.b */
public class C6720b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f14425a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f14426b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f14427c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static int f14428d = 1;

    /* renamed from: e */
    private static boolean f14429e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static long f14430f = -1;

    /* renamed from: z */
    private static volatile C6720b f14431z;

    /* renamed from: A */
    private int f14432A = 50;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f14433B;

    /* renamed from: g */
    private Application f14434g;

    /* renamed from: h */
    private Context f14435h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<String> f14436i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List<Long> f14437j = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List<String> f14438k = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public List<Long> f14439l = new ArrayList();

    /* renamed from: m */
    private LinkedList<C6722a> f14440m = new LinkedList<>();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f14441n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f14442o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f14443p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f14444q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f14445r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public long f14446s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f14447t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f14448u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f14449v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public long f14450w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f14451x = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public long f14452y = -1;

    /* renamed from: com.apm.insight.runtime.a.b$a */
    private static class C6722a {

        /* renamed from: a */
        String f14454a;

        /* renamed from: b */
        String f14455b;

        /* renamed from: c */
        long f14456c;

        C6722a(String str, String str2, long j) {
            this.f14455b = str2;
            this.f14456c = j;
            this.f14454a = str;
        }

        public String toString() {
            return C6663b.m16485a().format(new Date(this.f14456c)) + " : " + this.f14454a + ' ' + this.f14455b;
        }
    }

    private C6720b(Application application) {
        this.f14435h = application;
        this.f14434g = application;
        try {
            m16853m();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private C6722a m16815a(String str, String str2, long j) {
        C6722a aVar;
        if (this.f14440m.size() >= this.f14432A) {
            aVar = this.f14440m.poll();
            if (aVar != null) {
                this.f14440m.add(aVar);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        C6722a aVar2 = new C6722a(str, str2, j);
        this.f14440m.add(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private JSONObject m16818a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            jSONObject.put(C8850d.f22432fl, j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m16819a() {
        f14429e = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16821a(String str, long j, String str2) {
        try {
            C6722a a = m16815a(str, str2, j);
            a.f14455b = str2;
            a.f14454a = str;
            a.f14456c = j;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static int m16824b() {
        int i = f14428d;
        return i == 1 ? f14429e ? 2 : 1 : i;
    }

    /* renamed from: c */
    public static long m16829c() {
        return f14430f;
    }

    /* renamed from: d */
    public static C6720b m16835d() {
        if (f14431z == null) {
            synchronized (C6720b.class) {
                if (f14431z == null) {
                    f14431z = new C6720b(C6617h.m16314h());
                }
            }
        }
        return f14431z;
    }

    /* renamed from: g */
    static /* synthetic */ int m16843g(C6720b bVar) {
        int i = bVar.f14433B;
        bVar.f14433B = i + 1;
        return i;
    }

    /* renamed from: l */
    static /* synthetic */ int m16850l(C6720b bVar) {
        int i = bVar.f14433B;
        bVar.f14433B = i - 1;
        return i;
    }

    /* renamed from: m */
    private void m16853m() {
        if (Build.VERSION.SDK_INT >= 14 && this.f14434g != null) {
            this.f14434g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    String unused = C6720b.this.f14441n = activity.getClass().getName();
                    long unused2 = C6720b.this.f14442o = System.currentTimeMillis();
                    boolean unused3 = C6720b.f14426b = bundle != null;
                    boolean unused4 = C6720b.f14427c = true;
                    C6720b.this.f14436i.add(C6720b.this.f14441n);
                    C6720b.this.f14437j.add(Long.valueOf(C6720b.this.f14442o));
                    C6720b bVar = C6720b.this;
                    bVar.m16821a(bVar.f14441n, C6720b.this.f14442o, "onCreate");
                }

                public void onActivityDestroyed(Activity activity) {
                    String name = activity.getClass().getName();
                    int indexOf = C6720b.this.f14436i.indexOf(name);
                    if (indexOf > -1 && indexOf < C6720b.this.f14436i.size()) {
                        C6720b.this.f14436i.remove(indexOf);
                        C6720b.this.f14437j.remove(indexOf);
                    }
                    C6720b.this.f14438k.add(name);
                    long currentTimeMillis = System.currentTimeMillis();
                    C6720b.this.f14439l.add(Long.valueOf(currentTimeMillis));
                    C6720b.this.m16821a(name, currentTimeMillis, "onDestroy");
                }

                public void onActivityPaused(Activity activity) {
                    String unused = C6720b.this.f14447t = activity.getClass().getName();
                    long unused2 = C6720b.this.f14448u = System.currentTimeMillis();
                    C6720b.m16850l(C6720b.this);
                    if (C6720b.this.f14433B != 0) {
                        if (C6720b.this.f14433B < 0) {
                            int unused3 = C6720b.this.f14433B = 0;
                        }
                        C6720b bVar = C6720b.this;
                        bVar.m16821a(bVar.f14447t, C6720b.this.f14448u, "onPause");
                    }
                    boolean unused4 = C6720b.this.f14451x = false;
                    boolean unused5 = C6720b.f14427c = false;
                    long unused6 = C6720b.this.f14452y = SystemClock.uptimeMillis();
                    C6720b bVar2 = C6720b.this;
                    bVar2.m16821a(bVar2.f14447t, C6720b.this.f14448u, "onPause");
                }

                public void onActivityResumed(Activity activity) {
                    String unused = C6720b.this.f14445r = activity.getClass().getName();
                    long unused2 = C6720b.this.f14446s = System.currentTimeMillis();
                    C6720b.m16843g(C6720b.this);
                    if (!C6720b.this.f14451x) {
                        if (C6720b.f14425a) {
                            boolean unused3 = C6720b.f14425a = false;
                            int unused4 = C6720b.f14428d = 1;
                            long unused5 = C6720b.f14430f = C6720b.this.f14446s;
                        }
                        if (C6720b.this.f14445r.equals(C6720b.this.f14447t)) {
                            if (C6720b.f14427c && !C6720b.f14426b) {
                                int unused6 = C6720b.f14428d = 4;
                                long unused7 = C6720b.f14430f = C6720b.this.f14446s;
                                return;
                            } else if (!C6720b.f14427c) {
                                int unused8 = C6720b.f14428d = 3;
                                long unused9 = C6720b.f14430f = C6720b.this.f14446s;
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    boolean unused10 = C6720b.this.f14451x = true;
                    C6720b bVar = C6720b.this;
                    bVar.m16821a(bVar.f14445r, C6720b.this.f14446s, "onResume");
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public void onActivityStarted(Activity activity) {
                    String unused = C6720b.this.f14443p = activity.getClass().getName();
                    long unused2 = C6720b.this.f14444q = System.currentTimeMillis();
                    C6720b bVar = C6720b.this;
                    bVar.m16821a(bVar.f14443p, C6720b.this.f14444q, "onStart");
                }

                public void onActivityStopped(Activity activity) {
                    String unused = C6720b.this.f14449v = activity.getClass().getName();
                    long unused2 = C6720b.this.f14450w = System.currentTimeMillis();
                    C6720b bVar = C6720b.this;
                    bVar.m16821a(bVar.f14449v, C6720b.this.f14450w, "onStop");
                }
            });
        }
    }

    /* renamed from: n */
    private JSONArray m16855n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f14436i;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (i < this.f14436i.size()) {
                try {
                    jSONArray.put(m16818a(this.f14436i.get(i), this.f14437j.get(i).longValue()));
                    i++;
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: o */
    private JSONArray m16857o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f14438k;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (i < this.f14438k.size()) {
                try {
                    jSONArray.put(m16818a(this.f14438k.get(i), this.f14439l.get(i).longValue()));
                    i++;
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: e */
    public long mo52250e() {
        return SystemClock.uptimeMillis() - this.f14452y;
    }

    /* renamed from: f */
    public boolean mo52251f() {
        return this.f14451x;
    }

    /* renamed from: g */
    public JSONObject mo52252g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", m16818a(this.f14441n, this.f14442o));
            jSONObject.put("last_start_activity", m16818a(this.f14443p, this.f14444q));
            jSONObject.put("last_resume_activity", m16818a(this.f14445r, this.f14446s));
            jSONObject.put("last_pause_activity", m16818a(this.f14447t, this.f14448u));
            jSONObject.put("last_stop_activity", m16818a(this.f14449v, this.f14450w));
            jSONObject.put("alive_activities", m16855n());
            jSONObject.put("finish_activities", m16857o());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: h */
    public String mo52253h() {
        return String.valueOf(this.f14445r);
    }

    /* renamed from: i */
    public JSONArray mo52254i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f14440m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((C6722a) it.next()).toString());
        }
        return jSONArray;
    }
}
