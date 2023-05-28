package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Hd */
public class C2092Hd {

    /* renamed from: a */
    private Context f5530a;

    public C2092Hd(Context context) {
        this.f5530a = context;
    }

    /* renamed from: a */
    public void mo15862a() {
        SharedPreferences a = C2814b.m9059a(this.f5530a, "_bidoptpreferences");
        if (a.getAll().size() > 0) {
            C2484Rd rd = C2429Pd.f6450p;
            String string = a.getString(rd.mo16560b(), (String) null);
            C2429Pd pd = new C2429Pd(this.f5530a, (String) null);
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(pd.mo16459b((String) null))) {
                pd.mo16467i(string).mo16079b();
                a.edit().remove(rd.mo16560b()).apply();
            }
            Map<String, ?> all = a.getAll();
            if (all.size() > 0) {
                Iterator it = ((ArrayList) m7320a(all, C2429Pd.f6451q.mo16560b())).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String string2 = a.getString(new C2484Rd(C2429Pd.f6451q.mo16560b(), str).mo16558a(), (String) null);
                    C2429Pd pd2 = new C2429Pd(this.f5530a, str);
                    if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(pd2.mo16466h((String) null))) {
                        pd2.mo16468j(string2).mo16079b();
                    }
                }
            }
            a.edit().clear().apply();
        }
    }

    /* renamed from: b */
    public void mo15863b() {
        C2511S7 p = C3093ja.m9805a(this.f5530a).mo17751p();
        SharedPreferences a = C2814b.m9059a(this.f5530a, "_startupserviceinfopreferences");
        C2946f9 f9Var = new C2946f9(p, (String) null);
        C2484Rd rd = C2429Pd.f6450p;
        String string = a.getString(rd.mo16560b(), (String) null);
        if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(f9Var.mo17582g().f8880b)) {
            f9Var.mo17585i(string).mo17448d();
            a.edit().remove(rd.mo16560b()).apply();
        }
        C2946f9 f9Var2 = new C2946f9(p, this.f5530a.getPackageName());
        boolean z = a.getBoolean(C2429Pd.f6459y.mo16560b(), false);
        if (z) {
            f9Var2.mo17578a(z).mo17448d();
        }
        m7321a(p, this.f5530a.getPackageName());
        Iterator it = ((ArrayList) m7320a(a.getAll(), C2429Pd.f6451q.mo16560b())).iterator();
        while (it.hasNext()) {
            m7321a(p, (String) it.next());
        }
    }

    /* renamed from: a */
    private List<String> m7320a(Map<String, ?> map, String str) {
        ArrayList arrayList = new ArrayList();
        for (String next : map.keySet()) {
            if (next.startsWith(str)) {
                arrayList.add(next.replace(str, ""));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m7321a(C2511S7 s7, String str) {
        C2946f9 f9Var = new C2946f9(s7, str);
        C2429Pd pd = new C2429Pd(this.f5530a, str);
        String h = pd.mo16466h((String) null);
        if (!TextUtils.isEmpty(h)) {
            f9Var.mo17591o(h);
        }
        String c = pd.mo16460c((String) null);
        if (!TextUtils.isEmpty(c)) {
            f9Var.mo17586j(c);
        }
        String d = pd.mo16461d((String) null);
        if (!TextUtils.isEmpty(d)) {
            f9Var.mo17587k(d);
        }
        String f = pd.mo16463f((String) null);
        if (!TextUtils.isEmpty(f)) {
            f9Var.mo17589m(f);
        }
        String e = pd.mo16462e((String) null);
        if (!TextUtils.isEmpty(e)) {
            f9Var.mo17588l(e);
        }
        long a = pd.mo16458a(-1);
        if (a != -1) {
            f9Var.mo17579b(a);
        }
        String g = pd.mo16465g((String) null);
        if (!TextUtils.isEmpty(g)) {
            f9Var.mo17590n(g);
        }
        f9Var.mo17448d();
        pd.mo16464f();
    }
}
