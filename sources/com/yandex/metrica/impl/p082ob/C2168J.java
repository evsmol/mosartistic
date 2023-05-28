package com.yandex.metrica.impl.p082ob;

import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.J */
public class C2168J extends C2851c0 {

    /* renamed from: r */
    private HashMap<C2169a, Integer> f5808r;

    /* renamed from: s */
    private C2977fn<String> f5809s;

    /* renamed from: t */
    private C2977fn<String> f5810t;

    /* renamed from: u */
    private C2977fn<String> f5811u;

    /* renamed from: v */
    private C2977fn<byte[]> f5812v;

    /* renamed from: w */
    private C2977fn<String> f5813w;

    /* renamed from: x */
    private C2977fn<String> f5814x;

    /* renamed from: com.yandex.metrica.impl.ob.J$a */
    public enum C2169a {
        NAME,
        VALUE,
        USER_INFO
    }

    public C2168J(C2875cm cmVar) {
        this.f5808r = new HashMap<>();
        m7457a(cmVar);
    }

    /* renamed from: g */
    private String m7459g(String str) {
        String a = this.f5809s.mo16729a(str);
        m7458a(str, a, C2169a.NAME);
        return a;
    }

    /* renamed from: h */
    private String m7460h(String str) {
        String a = this.f5810t.mo16729a(str);
        m7458a(str, a, C2169a.VALUE);
        return a;
    }

    /* renamed from: s */
    public static C2851c0 m7461s() {
        C2851c0 c0Var = new C2851c0();
        c0Var.f7528e = C2788a1.EVENT_TYPE_SEND_USER_PROFILE.mo17139b();
        return c0Var;
    }

    /* renamed from: u */
    private void m7462u() {
        this.f7531h = 0;
        for (Integer intValue : this.f5808r.values()) {
            this.f7531h += intValue.intValue();
        }
    }

    /* renamed from: a */
    public C2168J mo15966a(HashMap<C2169a, Integer> hashMap) {
        this.f5808r = hashMap;
        return this;
    }

    /* renamed from: b */
    public C2851c0 mo15968b(String str) {
        String a = this.f5809s.mo16729a(str);
        m7458a(str, a, C2169a.NAME);
        this.f7524a = a;
        return this;
    }

    /* renamed from: d */
    public C2851c0 mo15969d(String str) {
        return super.mo15969d(this.f5813w.mo16729a(str));
    }

    /* renamed from: e */
    public C2851c0 mo15970e(String str) {
        String a = this.f5814x.mo16729a(str);
        m7458a(str, a, C2169a.USER_INFO);
        return super.mo15970e(a);
    }

    /* renamed from: f */
    public C2851c0 mo15971f(String str) {
        String a = this.f5810t.mo16729a(str);
        m7458a(str, a, C2169a.VALUE);
        this.f7525b = a;
        return this;
    }

    /* renamed from: i */
    public C2168J mo15972i(String str) {
        String a = this.f5811u.mo16729a(str);
        m7458a(str, a, C2169a.VALUE);
        this.f7525b = a;
        return this;
    }

    /* renamed from: t */
    public HashMap<C2169a, Integer> mo15973t() {
        return this.f5808r;
    }

    /* renamed from: a */
    private void m7457a(C2875cm cmVar) {
        this.f5809s = new C2905dn(1000, "event name", cmVar);
        this.f5810t = new C2876cn(245760, "event value", cmVar);
        this.f5811u = new C2876cn(1024000, "event extended value", cmVar);
        this.f5812v = new C2574Tm(245760, "event value bytes", cmVar);
        this.f5813w = new C2905dn(200, "user profile id", cmVar);
        this.f5814x = new C2905dn(10000, "UserInfo", cmVar);
    }

    public C2168J(String str, String str2, int i, C2875cm cmVar) {
        this(str, str2, i, 0, cmVar);
    }

    public C2168J(String str, String str2, int i, int i2, C2875cm cmVar) {
        this.f5808r = new HashMap<>();
        m7457a(cmVar);
        this.f7525b = m7460h(str);
        this.f7524a = m7459g(str2);
        this.f7528e = i;
        this.f7529f = i2;
    }

    /* renamed from: a */
    private void m7458a(String str, String str2, C2169a aVar) {
        if (C2814b.m9071b(str, str2)) {
            this.f5808r.put(aVar, Integer.valueOf(C2814b.m9072b(str).length - C2814b.m9072b(str2).length));
        } else {
            this.f5808r.remove(aVar);
        }
        m7462u();
    }

    /* renamed from: a */
    public final C2851c0 mo15967a(byte[] bArr) {
        byte[] a = this.f5812v.mo16729a(bArr);
        C2169a aVar = C2169a.VALUE;
        if (bArr.length != a.length) {
            this.f5808r.put(aVar, Integer.valueOf(bArr.length - a.length));
        } else {
            this.f5808r.remove(aVar);
        }
        m7462u();
        return super.mo15967a(a);
    }

    /* renamed from: a */
    static C2851c0 m7456a(String str, C2875cm cmVar) {
        C2168J j = new C2168J(cmVar);
        j.f7528e = C2788a1.EVENT_TYPE_SET_USER_PROFILE_ID.mo17139b();
        return super.mo15969d(j.f5813w.mo16729a(str));
    }

    public C2168J(byte[] bArr, String str, int i, C2875cm cmVar) {
        this.f5808r = new HashMap<>();
        m7457a(cmVar);
        mo15967a(bArr);
        this.f7524a = m7459g(str);
        this.f7528e = i;
    }
}
