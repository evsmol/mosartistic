package com.yandex.metrica.impl.p082ob;

import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.H6 */
public class C2085H6 {

    /* renamed from: a */
    public final C2016F6 f5512a;

    /* renamed from: b */
    public final C3607w6 f5513b;

    /* renamed from: c */
    public final List<C1947D6> f5514c;

    /* renamed from: d */
    public final String f5515d;

    /* renamed from: e */
    public final String f5516e;

    /* renamed from: f */
    public final Map<String, String> f5517f;

    /* renamed from: g */
    public final String f5518g;

    /* renamed from: h */
    public final Boolean f5519h;

    public C2085H6(C2016F6 f6, C3607w6 w6Var, List<C1947D6> list, String str, String str2, Map<String, String> map, String str3, Boolean bool) {
        this.f5512a = f6;
        this.f5513b = w6Var;
        this.f5514c = list;
        this.f5515d = str;
        this.f5516e = str2;
        this.f5517f = map;
        this.f5518g = str3;
        this.f5519h = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C2016F6 f6 = this.f5512a;
        if (f6 != null) {
            for (C1947D6 next : f6.mo15781d()) {
                sb.append("at " + next.mo15619a() + "." + next.mo15623e() + "(" + next.mo15621c() + ":" + next.mo15622d() + ":" + next.mo15620b() + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f5512a + "\n" + sb.toString() + '}';
    }
}
