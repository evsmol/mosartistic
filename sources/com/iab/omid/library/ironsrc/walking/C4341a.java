package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.ironsrc.adsession.C4309a;
import com.iab.omid.library.ironsrc.p111b.C4311a;
import com.iab.omid.library.ironsrc.p111b.C4314c;
import com.iab.omid.library.ironsrc.p113d.C4331f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.ironsrc.walking.a */
public class C4341a {

    /* renamed from: a */
    private final HashMap<View, String> f10351a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C4342a> f10352b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f10353c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f10354d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f10355e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f10356f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f10357g = new HashMap<>();

    /* renamed from: h */
    private boolean f10358h;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a */
    public static class C4342a {

        /* renamed from: a */
        private final C4314c f10359a;

        /* renamed from: b */
        private final ArrayList<String> f10360b = new ArrayList<>();

        public C4342a(C4314c cVar, String str) {
            this.f10359a = cVar;
            mo33029a(str);
        }

        /* renamed from: a */
        public C4314c mo33028a() {
            return this.f10359a;
        }

        /* renamed from: a */
        public void mo33029a(String str) {
            this.f10360b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo33030b() {
            return this.f10360b;
        }
    }

    /* renamed from: a */
    private void m12365a(C4309a aVar) {
        for (C4314c a : aVar.mo32902a()) {
            m12366a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m12366a(C4314c cVar, C4309a aVar) {
        View view = (View) cVar.mo32948a().get();
        if (view != null) {
            C4342a aVar2 = this.f10352b.get(view);
            if (aVar2 != null) {
                aVar2.mo33029a(aVar.getAdSessionId());
            } else {
                this.f10352b.put(view, new C4342a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m12367d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C4331f.m12316e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f10354d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo33018a(View view) {
        if (this.f10351a.size() == 0) {
            return null;
        }
        String str = this.f10351a.get(view);
        if (str != null) {
            this.f10351a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo33019a(String str) {
        return this.f10357g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo33020a() {
        return this.f10355e;
    }

    /* renamed from: b */
    public View mo33021b(String str) {
        return this.f10353c.get(str);
    }

    /* renamed from: b */
    public C4342a mo33022b(View view) {
        C4342a aVar = this.f10352b.get(view);
        if (aVar != null) {
            this.f10352b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo33023b() {
        return this.f10356f;
    }

    /* renamed from: c */
    public C4352c mo33024c(View view) {
        return this.f10354d.contains(view) ? C4352c.PARENT_VIEW : this.f10358h ? C4352c.OBSTRUCTION_VIEW : C4352c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo33025c() {
        C4311a a = C4311a.m12213a();
        if (a != null) {
            for (C4309a next : a.mo32940c()) {
                View d = next.mo32906d();
                if (next.mo32907e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m12367d(d);
                        if (d2 == null) {
                            this.f10355e.add(adSessionId);
                            this.f10351a.put(d, adSessionId);
                            m12365a(next);
                        } else {
                            this.f10356f.add(adSessionId);
                            this.f10353c.put(adSessionId, d);
                            this.f10357g.put(adSessionId, d2);
                        }
                    } else {
                        this.f10356f.add(adSessionId);
                        this.f10357g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo33026d() {
        this.f10351a.clear();
        this.f10352b.clear();
        this.f10353c.clear();
        this.f10354d.clear();
        this.f10355e.clear();
        this.f10356f.clear();
        this.f10357g.clear();
        this.f10358h = false;
    }

    /* renamed from: e */
    public void mo33027e() {
        this.f10358h = true;
    }
}
