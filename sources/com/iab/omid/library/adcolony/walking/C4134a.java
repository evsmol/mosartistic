package com.iab.omid.library.adcolony.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.adcolony.adsession.C4102a;
import com.iab.omid.library.adcolony.p093b.C4104a;
import com.iab.omid.library.adcolony.p093b.C4107c;
import com.iab.omid.library.adcolony.p095d.C4124f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.adcolony.walking.a */
public class C4134a {

    /* renamed from: a */
    private final HashMap<View, String> f9881a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C4135a> f9882b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f9883c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f9884d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f9885e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f9886f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f9887g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f9888h = new WeakHashMap();

    /* renamed from: i */
    private boolean f9889i;

    /* renamed from: com.iab.omid.library.adcolony.walking.a$a */
    public static class C4135a {

        /* renamed from: a */
        private final C4107c f9890a;

        /* renamed from: b */
        private final ArrayList<String> f9891b = new ArrayList<>();

        public C4135a(C4107c cVar, String str) {
            this.f9890a = cVar;
            mo32238a(str);
        }

        /* renamed from: a */
        public C4107c mo32237a() {
            return this.f9890a;
        }

        /* renamed from: a */
        public void mo32238a(String str) {
            this.f9891b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo32239b() {
            return this.f9891b;
        }
    }

    /* renamed from: a */
    private void m11435a(C4102a aVar) {
        for (C4107c a : aVar.mo32100a()) {
            m11436a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m11436a(C4107c cVar, C4102a aVar) {
        View view = (View) cVar.mo32156a().get();
        if (view != null) {
            C4135a aVar2 = this.f9882b.get(view);
            if (aVar2 != null) {
                aVar2.mo32238a(aVar.getAdSessionId());
            } else {
                this.f9882b.put(view, new C4135a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: e */
    private String m11437e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m11438f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C4124f.m11386e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f9884d.addAll(hashSet);
        return null;
    }

    /* renamed from: f */
    private Boolean m11438f(View view) {
        if (view.hasWindowFocus()) {
            this.f9888h.remove(view);
            return Boolean.FALSE;
        } else if (this.f9888h.containsKey(view)) {
            return this.f9888h.get(view);
        } else {
            Map<View, Boolean> map = this.f9888h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public String mo32226a(View view) {
        if (this.f9881a.size() == 0) {
            return null;
        }
        String str = this.f9881a.get(view);
        if (str != null) {
            this.f9881a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo32227a(String str) {
        return this.f9887g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo32228a() {
        return this.f9885e;
    }

    /* renamed from: b */
    public View mo32229b(String str) {
        return this.f9883c.get(str);
    }

    /* renamed from: b */
    public C4135a mo32230b(View view) {
        C4135a aVar = this.f9882b.get(view);
        if (aVar != null) {
            this.f9882b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo32231b() {
        return this.f9886f;
    }

    /* renamed from: c */
    public C4145c mo32232c(View view) {
        return this.f9884d.contains(view) ? C4145c.PARENT_VIEW : this.f9889i ? C4145c.OBSTRUCTION_VIEW : C4145c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo32233c() {
        C4104a a = C4104a.m11278a();
        if (a != null) {
            for (C4102a next : a.mo32140c()) {
                View e = next.mo32106e();
                if (next.mo32107f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e != null) {
                        String e2 = m11437e(e);
                        if (e2 == null) {
                            this.f9885e.add(adSessionId);
                            this.f9881a.put(e, adSessionId);
                            m11435a(next);
                        } else if (e2 != "noWindowFocus") {
                            this.f9886f.add(adSessionId);
                            this.f9883c.put(adSessionId, e);
                            this.f9887g.put(adSessionId, e2);
                        }
                    } else {
                        this.f9886f.add(adSessionId);
                        this.f9887g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo32234d() {
        this.f9881a.clear();
        this.f9882b.clear();
        this.f9883c.clear();
        this.f9884d.clear();
        this.f9885e.clear();
        this.f9886f.clear();
        this.f9887g.clear();
        this.f9889i = false;
    }

    /* renamed from: d */
    public boolean mo32235d(View view) {
        if (!this.f9888h.containsKey(view)) {
            return true;
        }
        this.f9888h.put(view, Boolean.TRUE);
        return false;
    }

    /* renamed from: e */
    public void mo32236e() {
        this.f9889i = true;
    }
}
