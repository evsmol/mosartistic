package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import com.yandex.metrica.impl.p082ob.C2936f0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.yandex.metrica.impl.ob.hi */
public class C3035hi implements C2444Q0, C3102ji {

    /* renamed from: j */
    static final Map<C3004gi, IParamsCallback.Reason> f7990j = Collections.unmodifiableMap(new C3036a());

    /* renamed from: a */
    private final List<String> f7991a;

    /* renamed from: b */
    private final C2541T1 f7992b;

    /* renamed from: c */
    private final C3236mi f7993c;

    /* renamed from: d */
    private final Handler f7994d;

    /* renamed from: e */
    private C2875cm f7995e;

    /* renamed from: f */
    private final C2936f0.C2937a f7996f;

    /* renamed from: g */
    private final Object f7997g;

    /* renamed from: h */
    private final Map<C2746Yh, List<String>> f7998h;

    /* renamed from: i */
    private Map<String, String> f7999i;

    /* renamed from: com.yandex.metrica.impl.ob.hi$a */
    class C3036a extends HashMap<C3004gi, IParamsCallback.Reason> {
        C3036a() {
            put(C3004gi.UNKNOWN, IParamsCallback.Reason.UNKNOWN);
            put(C3004gi.NETWORK, IParamsCallback.Reason.NETWORK);
            put(C3004gi.PARSE, IParamsCallback.Reason.INVALID_RESPONSE);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.hi$b */
    class C3037b implements C2936f0.C2937a {
        C3037b(C3035hi hiVar) {
        }

        /* renamed from: a */
        public void mo16696a(int i, Bundle bundle) {
        }
    }

    public C3035hi(Context context, C2541T1 t1, C2830b9 b9Var, Handler handler) {
        this(t1, new C3236mi(context, b9Var), handler);
    }

    /* renamed from: f */
    private void m9698f() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry next : this.f7998h.entrySet()) {
            List list = (List) next.getValue();
            if (this.f7993c.mo17870a((Collection<String>) list)) {
                weakHashMap.put(next.getKey(), list);
            }
        }
        for (Map.Entry key : weakHashMap.entrySet()) {
            C2746Yh yh = (C2746Yh) key.getKey();
            if (yh != null) {
                m9697a(yh, new Bundle());
            }
        }
        weakHashMap.clear();
    }

    /* renamed from: a */
    public long mo16498a() {
        return this.f7993c.mo17875e();
    }

    /* renamed from: b */
    public String mo17675b() {
        return this.f7993c.mo17873c();
    }

    /* renamed from: c */
    public C3437ra mo17677c() {
        return this.f7993c.mo17874d();
    }

    /* renamed from: d */
    public C2972fl mo17678d() {
        return this.f7993c.mo17876f();
    }

    /* renamed from: e */
    public String mo17679e() {
        return this.f7993c.mo17877g();
    }

    /* renamed from: g */
    public void mo17680g() {
        boolean b;
        synchronized (this.f7997g) {
            C3236mi miVar = this.f7993c;
            synchronized (miVar) {
                b = miVar.mo17872b((List<String>) Arrays.asList(new String[]{IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid"}));
            }
            if (b) {
                Map<String, String> map = this.f7999i;
                this.f7992b.mo16681a(this.f7991a, (ResultReceiver) new C2936f0(this.f7994d, this.f7996f), map);
            }
        }
    }

    C3035hi(C2541T1 t1, C3236mi miVar, Handler handler) {
        this.f7991a = Arrays.asList(new String[]{"yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS});
        this.f7997g = new Object();
        this.f7998h = new WeakHashMap();
        this.f7992b = t1;
        this.f7993c = miVar;
        this.f7994d = handler;
        this.f7996f = new C3037b(this);
    }

    /* renamed from: a */
    public void mo17669a(IIdentifierCallback iIdentifierCallback, List<String> list, Map<String, String> map) {
        C2461Qh qh = new C2461Qh(iIdentifierCallback);
        synchronized (this.f7997g) {
            this.f7993c.mo17868a(map);
            if (this.f7998h.isEmpty()) {
                this.f7992b.mo16694g();
            }
            this.f7998h.put(qh, list);
            if (this.f7993c.mo17872b(list)) {
                this.f7992b.mo16681a(list, (ResultReceiver) new C2936f0(this.f7994d, new C3064ii(this, qh)), map);
            } else {
                m9697a((C2746Yh) qh, new Bundle());
            }
        }
    }

    /* renamed from: b */
    public void mo17676b(String str) {
        synchronized (this.f7997g) {
            this.f7992b.mo16687b(str);
        }
    }

    /* renamed from: a */
    public void mo17668a(Bundle bundle, C2746Yh yh) {
        synchronized (this.f7997g) {
            this.f7993c.mo17864a(bundle);
            m9698f();
            m9698f();
            if (yh != null) {
                m9697a(yh, bundle);
            }
        }
    }

    /* renamed from: a */
    public void mo17670a(C2875cm cmVar) {
        this.f7995e = cmVar;
    }

    /* renamed from: a */
    public void mo17673a(List<String> list) {
        synchronized (this.f7997g) {
            List<String> b = this.f7993c.mo17871b();
            if (C1848A2.m6814b((Collection) list)) {
                if (!C1848A2.m6814b((Collection) b)) {
                    this.f7993c.mo17866a((List<String>) null);
                    this.f7992b.mo16680a((List<String>) null);
                }
            } else if (!C1848A2.m6810a((Object) list, (Object) b)) {
                this.f7993c.mo17866a(list);
                this.f7992b.mo16680a(list);
            } else {
                this.f7992b.mo16680a(b);
            }
        }
    }

    /* renamed from: a */
    public void mo17674a(Map<String, String> map) {
        if (!C1848A2.m6815b((Map) map)) {
            synchronized (this.f7997g) {
                Map<String, String> i = C2572Tl.m8548i(map);
                this.f7999i = i;
                this.f7992b.mo16682a(i);
                this.f7993c.mo17868a(i);
            }
        }
    }

    /* renamed from: a */
    public void mo17672a(String str) {
        synchronized (this.f7997g) {
            this.f7992b.mo16677a(str);
        }
    }

    /* renamed from: a */
    public void mo17671a(C3009gl glVar) {
        this.f7993c.mo17865a(glVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9697a(com.yandex.metrica.impl.p082ob.C2746Yh r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.util.Map<com.yandex.metrica.impl.ob.Yh, java.util.List<java.lang.String>> r0 = r6.f7998h
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x0099
            java.util.Map<com.yandex.metrica.impl.ob.Yh, java.util.List<java.lang.String>> r0 = r6.f7998h
            java.lang.Object r0 = r0.get(r7)
            java.util.List r0 = (java.util.List) r0
            com.yandex.metrica.impl.ob.mi r1 = r6.f7993c
            boolean r1 = r1.mo17870a((java.util.Collection<java.lang.String>) r0)
            r2 = 0
            if (r1 == 0) goto L_0x002a
            if (r0 != 0) goto L_0x001c
            goto L_0x0026
        L_0x001c:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.yandex.metrica.impl.ob.mi r8 = r6.f7993c
            r8.mo17867a((java.util.List<java.lang.String>) r0, (java.util.Map<java.lang.String, com.yandex.metrica.impl.p082ob.C2673W0>) r2)
        L_0x0026:
            r7.onReceive(r2)
            goto L_0x0087
        L_0x002a:
            java.lang.String r1 = "startup_error_key_code"
            boolean r3 = r8.containsKey(r1)
            r4 = 1
            if (r3 == 0) goto L_0x0045
            int r8 = r8.getInt(r1)
            com.yandex.metrica.impl.ob.gi r1 = com.yandex.metrica.impl.p082ob.C3004gi.UNKNOWN
            if (r8 == r4) goto L_0x0042
            r3 = 2
            if (r8 == r3) goto L_0x003f
            goto L_0x0046
        L_0x003f:
            com.yandex.metrica.impl.ob.gi r1 = com.yandex.metrica.impl.p082ob.C3004gi.PARSE
            goto L_0x0046
        L_0x0042:
            com.yandex.metrica.impl.ob.gi r1 = com.yandex.metrica.impl.p082ob.C3004gi.NETWORK
            goto L_0x0046
        L_0x0045:
            r1 = r2
        L_0x0046:
            if (r1 != 0) goto L_0x0065
            com.yandex.metrica.impl.ob.mi r8 = r6.f7993c
            boolean r8 = r8.mo17869a()
            if (r8 != 0) goto L_0x0063
            com.yandex.metrica.impl.ob.cm r8 = r6.f7995e
            if (r8 == 0) goto L_0x0060
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.util.Map<java.lang.String, java.lang.String> r4 = r6.f7999i
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "Clids error. Passed clids: %s, and clids from server are empty."
            r8.mo15270fw(r4, r3)
        L_0x0060:
            com.yandex.metrica.IParamsCallback$Reason r8 = com.yandex.metrica.IParamsCallback.Reason.INCONSISTENT_CLIDS
            goto L_0x0066
        L_0x0063:
            com.yandex.metrica.impl.ob.gi r1 = com.yandex.metrica.impl.p082ob.C3004gi.UNKNOWN
        L_0x0065:
            r8 = r2
        L_0x0066:
            if (r8 != 0) goto L_0x0077
            java.util.Map<com.yandex.metrica.impl.ob.gi, com.yandex.metrica.IParamsCallback$Reason> r8 = f7990j
            com.yandex.metrica.IParamsCallback$Reason r3 = com.yandex.metrica.IParamsCallback.Reason.UNKNOWN
            java.lang.Object r8 = r8.get(r1)
            if (r8 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r3 = r8
        L_0x0074:
            r8 = r3
            com.yandex.metrica.IParamsCallback$Reason r8 = (com.yandex.metrica.IParamsCallback.Reason) r8
        L_0x0077:
            if (r0 != 0) goto L_0x007a
            goto L_0x0084
        L_0x007a:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.yandex.metrica.impl.ob.mi r1 = r6.f7993c
            r1.mo17867a((java.util.List<java.lang.String>) r0, (java.util.Map<java.lang.String, com.yandex.metrica.impl.p082ob.C2673W0>) r2)
        L_0x0084:
            r7.mo16523a(r8, r2)
        L_0x0087:
            java.util.Map<com.yandex.metrica.impl.ob.Yh, java.util.List<java.lang.String>> r8 = r6.f7998h
            r8.remove(r7)
            java.util.Map<com.yandex.metrica.impl.ob.Yh, java.util.List<java.lang.String>> r7 = r6.f7998h
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0099
            com.yandex.metrica.impl.ob.T1 r7 = r6.f7992b
            r7.mo16693f()
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3035hi.m9697a(com.yandex.metrica.impl.ob.Yh, android.os.Bundle):void");
    }
}
