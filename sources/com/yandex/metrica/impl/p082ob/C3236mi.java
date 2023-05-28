package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.IParamsCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.mi */
public class C3236mi {

    /* renamed from: a */
    private final Set<String> f8391a;

    /* renamed from: b */
    private final Map<String, C2673W0> f8392b;

    /* renamed from: c */
    private List<String> f8393c;

    /* renamed from: d */
    private Map<String, String> f8394d;

    /* renamed from: e */
    private long f8395e;

    /* renamed from: f */
    private boolean f8396f;

    /* renamed from: g */
    private C2972fl f8397g;

    /* renamed from: h */
    private C3437ra f8398h;

    /* renamed from: i */
    private long f8399i;

    /* renamed from: j */
    private final List<C3009gl> f8400j;

    /* renamed from: k */
    private final C2830b9 f8401k;

    /* renamed from: l */
    private final C2495Rh f8402l;

    /* renamed from: m */
    private final C2568Th f8403m;

    /* renamed from: n */
    private final C2691Wh f8404n;

    public C3236mi(Context context, C2830b9 b9Var) {
        this(b9Var, new C2346Nh(), new C2495Rh(), C2930ej.m9486a(context).mo17557a(context, new C3038hj(b9Var)), new C2568Th(), new C2691Wh(), new C2665Vh());
    }

    /* renamed from: b */
    private void m10087b(String str, C2673W0 w0) {
        if (!m10086a(w0)) {
            this.f8392b.put(str, w0);
        }
    }

    /* renamed from: h */
    private void m10089h() {
        this.f8401k.mo17268i(this.f8392b.get("yandex_mobile_metrica_uuid")).mo17256e(this.f8392b.get("yandex_mobile_metrica_device_id")).mo17253d(this.f8392b.get("appmetrica_device_id_hash")).mo17238a(this.f8392b.get("yandex_mobile_metrica_get_ad_url")).mo17246b(this.f8392b.get("yandex_mobile_metrica_report_ad_url")).mo17264h(this.f8395e).mo17265h(this.f8392b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)).mo17288r(C2572Tl.m8538c(this.f8394d)).mo17240a(this.f8397g).mo17241a(this.f8398h).mo17259f(this.f8392b.get("yandex_mobile_metrica_google_adv_id")).mo17262g(this.f8392b.get("yandex_mobile_metrica_huawei_oaid")).mo17271j(this.f8392b.get("yandex_mobile_metrica_yandex_adv_id")).mo17254d(this.f8396f).mo17250c(this.f8403m.mo16714a()).mo17261g(this.f8399i).mo17239a(this.f8404n.mo17001a()).mo17448d();
    }

    /* renamed from: a */
    public void mo17868a(Map<String, String> map) {
        if (!C1848A2.m6815b((Map) map) && !C1848A2.m6810a((Object) map, (Object) this.f8394d)) {
            this.f8394d = new HashMap(map);
            this.f8396f = true;
            m10089h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo17873c() {
        C2673W0 w0 = this.f8392b.get("yandex_mobile_metrica_device_id");
        if (w0 == null) {
            return null;
        }
        return w0.f7065a;
    }

    /* renamed from: d */
    public C3437ra mo17874d() {
        return this.f8398h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo17875e() {
        return this.f8395e;
    }

    /* renamed from: f */
    public C2972fl mo17876f() {
        return this.f8397g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo17877g() {
        C2673W0 w0 = this.f8392b.get("yandex_mobile_metrica_uuid");
        if (w0 == null) {
            return null;
        }
        return w0.f7065a;
    }

    /* renamed from: b */
    private boolean m10088b(C2673W0 w0) {
        return w0 == null || TextUtils.isEmpty(w0.f7065a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized boolean mo17872b(List<String> list) {
        boolean z;
        boolean z2;
        z = true;
        boolean z3 = !mo17870a(C3289ni.m10177a((Collection<String>) list));
        Iterator<String> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (this.f8391a.contains(it.next())) {
                z2 = true;
                break;
            }
        }
        boolean a = C3289ni.m10178a(this.f8399i);
        C2972fl flVar = this.f8397g;
        boolean z4 = !(flVar != null && flVar.mo17606a());
        if (!z3 && !z2 && !a && !this.f8396f && !z4) {
            z = false;
        }
        return z;
    }

    C3236mi(C2830b9 b9Var, C2346Nh nh, C2495Rh rh, C2901dj djVar, C2568Th th, C2691Wh wh, C2665Vh vh) {
        HashSet hashSet = new HashSet();
        this.f8391a = hashSet;
        this.f8392b = new HashMap();
        this.f8400j = new ArrayList();
        hashSet.add("yandex_mobile_metrica_google_adv_id");
        hashSet.add("yandex_mobile_metrica_huawei_oaid");
        hashSet.add("yandex_mobile_metrica_yandex_adv_id");
        this.f8401k = b9Var;
        this.f8402l = rh;
        this.f8403m = th;
        this.f8404n = wh;
        m10085a("yandex_mobile_metrica_uuid", djVar.mo17469a());
        m10085a("yandex_mobile_metrica_device_id", b9Var.mo17275l());
        m10085a("appmetrica_device_id_hash", b9Var.mo17273k());
        m10085a("yandex_mobile_metrica_get_ad_url", b9Var.mo17257f());
        m10085a("yandex_mobile_metrica_report_ad_url", b9Var.mo17260g());
        m10087b(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, b9Var.mo17287r());
        m10085a("yandex_mobile_metrica_google_adv_id", b9Var.mo17281o());
        m10085a("yandex_mobile_metrica_huawei_oaid", b9Var.mo17283p());
        m10085a("yandex_mobile_metrica_yandex_adv_id", b9Var.mo17294v());
        th.mo16715a(b9Var.mo17270j());
        wh.mo17002a(b9Var.mo17279n());
        this.f8393c = b9Var.mo17269i();
        Map<String, String> map = null;
        String k = b9Var.mo17274k((String) null);
        this.f8394d = k != null ? C2572Tl.m8518a(k) : map;
        this.f8396f = b9Var.mo17248b(true);
        this.f8395e = b9Var.mo17252d(0);
        this.f8397g = b9Var.mo17292t();
        this.f8398h = b9Var.mo17277m();
        this.f8399i = b9Var.mo17285q();
        m10089h();
    }

    /* renamed from: a */
    public boolean mo17869a() {
        C2673W0 w0 = this.f8392b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        if (!m10086a(w0) && w0.f7065a.isEmpty()) {
            return C1848A2.m6815b((Map) this.f8394d);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<String> mo17871b() {
        return this.f8393c;
    }

    /* renamed from: a */
    private void m10085a(String str, C2673W0 w0) {
        if (!m10088b(w0)) {
            this.f8392b.put(str, w0);
        }
    }

    /* renamed from: a */
    private boolean m10086a(C2673W0 w0) {
        return w0 == null || w0.f7065a == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo17867a(List<String> list, Map<String, C2673W0> map) {
        for (String next : list) {
            C2673W0 w0 = this.f8392b.get(next);
            if (w0 != null) {
                map.put(next, w0);
            }
        }
        this.f8403m.mo16716a(list, map);
        this.f8404n.mo17003a(list, map);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo17870a(java.util.Collection<java.lang.String> r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x006b }
        L_0x0005:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x006b }
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.W0> r1 = r4.f8392b     // Catch:{ all -> 0x006b }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006b }
            com.yandex.metrica.impl.ob.W0 r1 = (com.yandex.metrica.impl.p082ob.C2673W0) r1     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0027
            com.yandex.metrica.impl.ob.Th r1 = r4.f8403m     // Catch:{ all -> 0x006b }
            java.util.Map r1 = r1.mo16717b()     // Catch:{ all -> 0x006b }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006b }
            com.yandex.metrica.impl.ob.W0 r1 = (com.yandex.metrica.impl.p082ob.C2673W0) r1     // Catch:{ all -> 0x006b }
        L_0x0027:
            if (r1 != 0) goto L_0x002f
            com.yandex.metrica.impl.ob.Wh r1 = r4.f8404n     // Catch:{ all -> 0x006b }
            com.yandex.metrica.impl.ob.W0 r1 = r1.mo17000a((java.lang.String) r0)     // Catch:{ all -> 0x006b }
        L_0x002f:
            java.lang.String r2 = "yandex_mobile_metrica_clids"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x006b }
            r3 = 0
            if (r2 == 0) goto L_0x0054
            boolean r0 = r4.f8396f     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0052
            boolean r0 = r4.m10086a((com.yandex.metrica.impl.p082ob.C2673W0) r1)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = r1.f7065a     // Catch:{ all -> 0x006b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0005
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f8394d     // Catch:{ all -> 0x006b }
            boolean r0 = com.yandex.metrica.impl.p082ob.C1848A2.m6815b((java.util.Map) r0)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0005
        L_0x0052:
            monitor-exit(r4)
            return r3
        L_0x0054:
            java.lang.String r2 = "yandex_mobile_metrica_lib_ssl_enabled"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0005
            monitor-exit(r4)
            return r3
        L_0x0060:
            boolean r0 = r4.m10088b((com.yandex.metrica.impl.p082ob.C2673W0) r1)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0005
            monitor-exit(r4)
            return r3
        L_0x0068:
            r5 = 1
            monitor-exit(r4)
            return r5
        L_0x006b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3236mi.mo17870a(java.util.Collection):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17864a(Bundle bundle) {
        HashMap<String, String> hashMap;
        boolean z;
        C2253L l = new C2253L(bundle);
        C2673W0 o = l.mo16105o();
        if (m10088b(this.f8392b.get("yandex_mobile_metrica_uuid")) && !m10088b(o) && !m10088b(o)) {
            this.f8392b.put("yandex_mobile_metrica_uuid", o);
        }
        C2673W0 c = l.mo16092c();
        if (!m10088b(c)) {
            this.f8392b.put("yandex_mobile_metrica_device_id", c);
        }
        C2673W0 d = l.mo16094d();
        if (!m10088b(d)) {
            this.f8392b.put("appmetrica_device_id_hash", d);
        }
        this.f8392b.put("yandex_mobile_metrica_google_adv_id", l.mo16097g());
        this.f8392b.put("yandex_mobile_metrica_huawei_oaid", l.mo16099i());
        this.f8392b.put("yandex_mobile_metrica_yandex_adv_id", l.mo16106p());
        this.f8403m.mo16715a(l.mo16091b());
        this.f8404n.mo17002a(l.mo16096f());
        C2673W0 h = l.mo16098h();
        if (!m10086a(h)) {
            this.f8392b.put("yandex_mobile_metrica_get_ad_url", h);
        }
        C2673W0 k = l.mo16101k();
        if (!m10086a(k)) {
            this.f8392b.put("yandex_mobile_metrica_report_ad_url", k);
        }
        this.f8395e = l.mo16103m();
        C2495Rh rh = this.f8402l;
        Map<String, String> map = this.f8394d;
        String str = l.mo16090a().f7065a;
        if (str == null) {
            hashMap = null;
        } else if (str.isEmpty()) {
            hashMap = new HashMap<>();
        } else {
            hashMap = C2572Tl.m8540d(str);
        }
        rh.getClass();
        if (C1848A2.m6815b((Map) map)) {
            z = C1848A2.m6815b((Map) hashMap);
        } else {
            z = map.equals(hashMap);
        }
        if (z) {
            this.f8392b.put(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, l.mo16102l());
            this.f8396f = false;
        }
        C2972fl n = l.mo16104n();
        if (n != null && n.mo17606a()) {
            this.f8397g = n;
            for (C3009gl a : this.f8400j) {
                a.mo17641a(this.f8397g);
            }
        }
        this.f8398h = l.mo16095e();
        this.f8399i = l.mo16100j();
        m10089h();
    }

    /* renamed from: a */
    public synchronized void mo17865a(C3009gl glVar) {
        this.f8400j.add(glVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17866a(List<String> list) {
        this.f8393c = list;
        this.f8401k.mo17247b(list);
    }
}
