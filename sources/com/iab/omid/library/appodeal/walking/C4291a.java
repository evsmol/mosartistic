package com.iab.omid.library.appodeal.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.appodeal.adsession.C4259a;
import com.iab.omid.library.appodeal.p105b.C4261a;
import com.iab.omid.library.appodeal.p105b.C4264c;
import com.iab.omid.library.appodeal.p107d.C4281f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.appodeal.walking.a */
public class C4291a {

    /* renamed from: a */
    private final HashMap<View, String> f10237a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C4292a> f10238b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f10239c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f10240d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f10241e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f10242f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f10243g = new HashMap<>();

    /* renamed from: h */
    private boolean f10244h;

    /* renamed from: com.iab.omid.library.appodeal.walking.a$a */
    public static class C4292a {

        /* renamed from: a */
        private final C4264c f10245a;

        /* renamed from: b */
        private final ArrayList<String> f10246b = new ArrayList<>();

        public C4292a(C4264c cVar, String str) {
            this.f10245a = cVar;
            mo32843a(str);
        }

        /* renamed from: a */
        public C4264c mo32842a() {
            return this.f10245a;
        }

        /* renamed from: a */
        public void mo32843a(String str) {
            this.f10246b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo32844b() {
            return this.f10246b;
        }
    }

    /* renamed from: a */
    private void m12144a(C4259a aVar) {
        for (C4264c a : aVar.mo32708a()) {
            m12145a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m12145a(C4264c cVar, C4259a aVar) {
        View view = (View) cVar.mo32762a().get();
        if (view != null) {
            C4292a aVar2 = this.f10238b.get(view);
            if (aVar2 != null) {
                aVar2.mo32843a(aVar.getAdSessionId());
            } else {
                this.f10238b.put(view, new C4292a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m12146d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C4281f.m12095e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f10240d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo32832a(View view) {
        if (this.f10237a.size() == 0) {
            return null;
        }
        String str = this.f10237a.get(view);
        if (str != null) {
            this.f10237a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo32833a(String str) {
        return this.f10243g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo32834a() {
        return this.f10241e;
    }

    /* renamed from: b */
    public View mo32835b(String str) {
        return this.f10239c.get(str);
    }

    /* renamed from: b */
    public C4292a mo32836b(View view) {
        C4292a aVar = this.f10238b.get(view);
        if (aVar != null) {
            this.f10238b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo32837b() {
        return this.f10242f;
    }

    /* renamed from: c */
    public C4302c mo32838c(View view) {
        return this.f10240d.contains(view) ? C4302c.PARENT_VIEW : this.f10244h ? C4302c.OBSTRUCTION_VIEW : C4302c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo32839c() {
        C4261a a = C4261a.m11989a();
        if (a != null) {
            for (C4259a next : a.mo32746c()) {
                View d = next.mo32712d();
                if (next.mo32713e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m12146d(d);
                        if (d2 == null) {
                            this.f10241e.add(adSessionId);
                            this.f10237a.put(d, adSessionId);
                            m12144a(next);
                        } else {
                            this.f10242f.add(adSessionId);
                            this.f10239c.put(adSessionId, d);
                            this.f10243g.put(adSessionId, d2);
                        }
                    } else {
                        this.f10242f.add(adSessionId);
                        this.f10243g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo32840d() {
        this.f10237a.clear();
        this.f10238b.clear();
        this.f10239c.clear();
        this.f10240d.clear();
        this.f10241e.clear();
        this.f10242f.clear();
        this.f10243g.clear();
        this.f10244h = false;
    }

    /* renamed from: e */
    public void mo32841e() {
        this.f10244h = true;
    }
}
