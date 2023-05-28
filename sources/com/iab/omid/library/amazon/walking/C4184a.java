package com.iab.omid.library.amazon.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.amazon.adsession.C4152a;
import com.iab.omid.library.amazon.p099b.C4154a;
import com.iab.omid.library.amazon.p099b.C4157c;
import com.iab.omid.library.amazon.p101d.C4174f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.amazon.walking.a */
public class C4184a {

    /* renamed from: a */
    private final HashMap<View, String> f9998a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C4185a> f9999b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f10000c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f10001d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f10002e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f10003f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f10004g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f10005h = new WeakHashMap();

    /* renamed from: i */
    private boolean f10006i;

    /* renamed from: com.iab.omid.library.amazon.walking.a$a */
    public static class C4185a {

        /* renamed from: a */
        private final C4157c f10007a;

        /* renamed from: b */
        private final ArrayList<String> f10008b = new ArrayList<>();

        public C4185a(C4157c cVar, String str) {
            this.f10007a = cVar;
            mo32437a(str);
        }

        /* renamed from: a */
        public C4157c mo32436a() {
            return this.f10007a;
        }

        /* renamed from: a */
        public void mo32437a(String str) {
            this.f10008b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo32438b() {
            return this.f10008b;
        }
    }

    /* renamed from: a */
    private void m11665a(C4152a aVar) {
        for (C4157c a : aVar.mo32299a()) {
            m11666a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m11666a(C4157c cVar, C4152a aVar) {
        View view = (View) cVar.mo32355a().get();
        if (view != null) {
            C4185a aVar2 = this.f9999b.get(view);
            if (aVar2 != null) {
                aVar2.mo32437a(aVar.getAdSessionId());
            } else {
                this.f9999b.put(view, new C4185a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: e */
    private String m11667e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m11668f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C4174f.m11616e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f10001d.addAll(hashSet);
        return null;
    }

    /* renamed from: f */
    private Boolean m11668f(View view) {
        if (view.hasWindowFocus()) {
            this.f10005h.remove(view);
            return false;
        } else if (this.f10005h.containsKey(view)) {
            return this.f10005h.get(view);
        } else {
            this.f10005h.put(view, false);
            return false;
        }
    }

    /* renamed from: a */
    public String mo32425a(View view) {
        if (this.f9998a.size() == 0) {
            return null;
        }
        String str = this.f9998a.get(view);
        if (str != null) {
            this.f9998a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo32426a(String str) {
        return this.f10004g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo32427a() {
        return this.f10002e;
    }

    /* renamed from: b */
    public View mo32428b(String str) {
        return this.f10000c.get(str);
    }

    /* renamed from: b */
    public C4185a mo32429b(View view) {
        C4185a aVar = this.f9999b.get(view);
        if (aVar != null) {
            this.f9999b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo32430b() {
        return this.f10003f;
    }

    /* renamed from: c */
    public C4195c mo32431c(View view) {
        return this.f10001d.contains(view) ? C4195c.PARENT_VIEW : this.f10006i ? C4195c.OBSTRUCTION_VIEW : C4195c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo32432c() {
        C4154a a = C4154a.m11508a();
        if (a != null) {
            for (C4152a next : a.mo32339c()) {
                View e = next.mo32305e();
                if (next.mo32306f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e != null) {
                        String e2 = m11667e(e);
                        if (e2 == null) {
                            this.f10002e.add(adSessionId);
                            this.f9998a.put(e, adSessionId);
                            m11665a(next);
                        } else if (e2 != "noWindowFocus") {
                            this.f10003f.add(adSessionId);
                            this.f10000c.put(adSessionId, e);
                            this.f10004g.put(adSessionId, e2);
                        }
                    } else {
                        this.f10003f.add(adSessionId);
                        this.f10004g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo32433d() {
        this.f9998a.clear();
        this.f9999b.clear();
        this.f10000c.clear();
        this.f10001d.clear();
        this.f10002e.clear();
        this.f10003f.clear();
        this.f10004g.clear();
        this.f10006i = false;
    }

    /* renamed from: d */
    public boolean mo32434d(View view) {
        if (!this.f10005h.containsKey(view)) {
            return true;
        }
        this.f10005h.put(view, true);
        return false;
    }

    /* renamed from: e */
    public void mo32435e() {
        this.f10006i = true;
    }
}
