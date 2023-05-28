package com.iab.omid.library.applovin.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.applovin.adsession.C4197a;
import com.iab.omid.library.applovin.internal.C4207c;
import com.iab.omid.library.applovin.internal.C4210e;
import com.iab.omid.library.applovin.utils.C4234h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.applovin.walking.a */
public class C4238a {

    /* renamed from: a */
    private final HashMap<View, String> f10123a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C4239a> f10124b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f10125c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f10126d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f10127e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f10128f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f10129g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f10130h = new WeakHashMap();

    /* renamed from: i */
    private boolean f10131i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a */
    public static class C4239a {

        /* renamed from: a */
        private final C4210e f10132a;

        /* renamed from: b */
        private final ArrayList<String> f10133b = new ArrayList<>();

        public C4239a(C4210e eVar, String str) {
            this.f10132a = eVar;
            mo32649a(str);
        }

        /* renamed from: a */
        public C4210e mo32648a() {
            return this.f10132a;
        }

        /* renamed from: a */
        public void mo32649a(String str) {
            this.f10133b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo32650b() {
            return this.f10133b;
        }
    }

    /* renamed from: a */
    private String m11918a(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m11921b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a = C4234h.m11893a(view);
            if (a != null) {
                return a;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f10126d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    private void m11919a(C4197a aVar) {
        for (C4210e a : aVar.mo32496d()) {
            m11920a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m11920a(C4210e eVar, C4197a aVar) {
        View view = (View) eVar.mo32565c().get();
        if (view != null) {
            C4239a aVar2 = this.f10124b.get(view);
            if (aVar2 != null) {
                aVar2.mo32649a(aVar.getAdSessionId());
            } else {
                this.f10124b.put(view, new C4239a(eVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: b */
    private Boolean m11921b(View view) {
        if (view.hasWindowFocus()) {
            this.f10130h.remove(view);
            return Boolean.FALSE;
        } else if (this.f10130h.containsKey(view)) {
            return this.f10130h.get(view);
        } else {
            Map<View, Boolean> map = this.f10130h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public View mo32637a(String str) {
        return this.f10125c.get(str);
    }

    /* renamed from: a */
    public void mo32638a() {
        this.f10123a.clear();
        this.f10124b.clear();
        this.f10125c.clear();
        this.f10126d.clear();
        this.f10127e.clear();
        this.f10128f.clear();
        this.f10129g.clear();
        this.f10131i = false;
    }

    /* renamed from: b */
    public String mo32639b(String str) {
        return this.f10129g.get(str);
    }

    /* renamed from: b */
    public HashSet<String> mo32640b() {
        return this.f10128f;
    }

    /* renamed from: c */
    public C4239a mo32641c(View view) {
        C4239a aVar = this.f10124b.get(view);
        if (aVar != null) {
            this.f10124b.remove(view);
        }
        return aVar;
    }

    /* renamed from: c */
    public HashSet<String> mo32642c() {
        return this.f10127e;
    }

    /* renamed from: d */
    public String mo32643d(View view) {
        if (this.f10123a.size() == 0) {
            return null;
        }
        String str = this.f10123a.get(view);
        if (str != null) {
            this.f10123a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public void mo32644d() {
        this.f10131i = true;
    }

    /* renamed from: e */
    public C4249c mo32645e(View view) {
        return this.f10126d.contains(view) ? C4249c.PARENT_VIEW : this.f10131i ? C4249c.OBSTRUCTION_VIEW : C4249c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void mo32646e() {
        C4207c c = C4207c.m11754c();
        if (c != null) {
            for (C4197a next : c.mo32544a()) {
                View c2 = next.mo32495c();
                if (next.mo32498f()) {
                    String adSessionId = next.getAdSessionId();
                    if (c2 != null) {
                        String a = m11918a(c2);
                        if (a == null) {
                            this.f10127e.add(adSessionId);
                            this.f10123a.put(c2, adSessionId);
                            m11919a(next);
                        } else if (a != "noWindowFocus") {
                            this.f10128f.add(adSessionId);
                            this.f10125c.put(adSessionId, c2);
                            this.f10129g.put(adSessionId, a);
                        }
                    } else {
                        this.f10128f.add(adSessionId);
                        this.f10129g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public boolean mo32647f(View view) {
        if (!this.f10130h.containsKey(view)) {
            return true;
        }
        this.f10130h.put(view, Boolean.TRUE);
        return false;
    }
}
