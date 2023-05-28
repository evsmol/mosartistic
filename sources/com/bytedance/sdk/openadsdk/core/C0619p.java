package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.openadsdk.core.p */
/* compiled from: RitInfo */
public class C0619p {

    /* renamed from: a */
    public static ConcurrentHashMap<Integer, C0619p> f2317a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private String f2318b = "";

    /* renamed from: c */
    private String f2319c = "";

    /* renamed from: d */
    private int f2320d;

    /* renamed from: e */
    private int f2321e;

    /* renamed from: f */
    private String f2322f;

    /* renamed from: a */
    public String mo2010a() {
        return this.f2322f;
    }

    /* renamed from: b */
    public String mo2013b() {
        return this.f2318b;
    }

    /* renamed from: c */
    public String mo2015c() {
        return this.f2319c;
    }

    /* renamed from: d */
    public int mo2016d() {
        return this.f2320d;
    }

    /* renamed from: a */
    public void mo2011a(int i) {
        this.f2320d = i;
    }

    /* renamed from: e */
    public int mo2017e() {
        return this.f2321e;
    }

    /* renamed from: b */
    public void mo2014b(int i) {
        this.f2321e = i;
    }

    /* renamed from: f */
    private void m2999f() {
        this.f2318b = "";
        this.f2319c = "";
        this.f2320d = 0;
        this.f2321e = 0;
    }

    /* renamed from: a */
    public void mo2012a(C0477n nVar) {
        if (nVar != null) {
            String h = C0996u.m4669h(nVar);
            if (!TextUtils.isEmpty(h)) {
                this.f2322f = h;
            }
            String[] split = nVar.mo1335O().split("/");
            if (split.length >= 3) {
                this.f2318b = split[2];
            }
            if (nVar.mo1380aa() != null && !TextUtils.isEmpty(nVar.mo1380aa().mo1220c())) {
                this.f2319c = nVar.mo1380aa().mo1220c();
            }
        }
    }

    /* renamed from: b */
    public static void m2996b(C0477n nVar) {
        if (nVar != null && !TextUtils.isEmpty(nVar.mo1382ac())) {
            Integer valueOf = Integer.valueOf(C0996u.m4657f(nVar));
            if (valueOf.intValue() != 0) {
                C0619p pVar = null;
                if (f2317a == null) {
                    f2317a = new ConcurrentHashMap<>();
                }
                if (f2317a.containsKey(valueOf)) {
                    pVar = f2317a.get(valueOf);
                }
                if (pVar == null) {
                    pVar = new C0619p();
                }
                String h = C0996u.m4669h(nVar);
                if (TextUtils.isEmpty(h) || !h.equals(pVar.mo2010a())) {
                    pVar.m2999f();
                    pVar.mo2012a(nVar);
                    f2317a.put(valueOf, pVar);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m2997c(int i) {
        C0619p pVar;
        if (i != 0) {
            if (f2317a == null) {
                f2317a = new ConcurrentHashMap<>();
            }
            if (f2317a.containsKey(Integer.valueOf(i)) && (pVar = f2317a.get(Integer.valueOf(i))) != null) {
                pVar.mo2014b(1);
            }
        }
    }

    /* renamed from: c */
    public static void m2998c(C0477n nVar) {
        C0619p pVar;
        if (nVar != null) {
            Integer valueOf = Integer.valueOf(C0996u.m4657f(nVar));
            if (valueOf.intValue() != 0) {
                if (f2317a == null) {
                    f2317a = new ConcurrentHashMap<>();
                }
                if (f2317a.containsKey(valueOf) && (pVar = f2317a.get(valueOf)) != null) {
                    pVar.mo2011a(1);
                }
            }
        }
    }
}
