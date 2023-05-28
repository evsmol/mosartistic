package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.impl.p082ob.C1992Eg;
import com.yandex.metrica.impl.p082ob.C2095Hg;
import com.yandex.metrica.impl.p082ob.C3566v3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Mg */
public class C2312Mg extends C2095Hg {

    /* renamed from: A */
    private final C2197Jg f6211A;

    /* renamed from: o */
    private List<String> f6212o;

    /* renamed from: p */
    private List<String> f6213p;

    /* renamed from: q */
    private String f6214q;

    /* renamed from: r */
    private String f6215r;

    /* renamed from: s */
    private Map<String, String> f6216s;

    /* renamed from: t */
    private C3566v3.C3567a f6217t;

    /* renamed from: u */
    private List<String> f6218u;

    /* renamed from: v */
    private boolean f6219v;

    /* renamed from: w */
    private boolean f6220w;

    /* renamed from: x */
    private String f6221x;

    /* renamed from: y */
    private long f6222y;

    /* renamed from: z */
    private final C3480sg f6223z;

    /* renamed from: com.yandex.metrica.impl.ob.Mg$b */
    public static class C2314b extends C1992Eg.C1993a<C2314b, C2314b> implements C1959Dg<C2314b, C2314b> {

        /* renamed from: d */
        public final String f6224d;

        /* renamed from: e */
        public final String f6225e;

        /* renamed from: f */
        public final Map<String, String> f6226f;

        /* renamed from: g */
        public final boolean f6227g;

        /* renamed from: h */
        public final List<String> f6228h;

        public C2314b(C3719z3 z3Var) {
            this(z3Var.mo18444b().mo64616d(), z3Var.mo18444b().mo64614c(), z3Var.mo18444b().mo64611b(), z3Var.mo18443a().mo15427d(), z3Var.mo18443a().mo15429e(), z3Var.mo18443a().mo15419a(), z3Var.mo18443a().mo15434j(), z3Var.mo18443a().mo15423b());
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo15607b(Object obj) {
            C2314b bVar = (C2314b) obj;
            return false;
        }

        /* renamed from: a */
        public C2314b mo15606a(C2314b bVar) {
            String str = this.f5336a;
            String str2 = bVar.f5336a;
            if (str != null) {
                str2 = str;
            }
            String str3 = this.f5337b;
            String str4 = bVar.f5337b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = this.f5338c;
            String str6 = bVar.f5338c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = this.f6224d;
            String str8 = bVar.f6224d;
            if (str7 != null) {
                str8 = str7;
            }
            String str9 = this.f6225e;
            String str10 = bVar.f6225e;
            if (str9 != null) {
                str10 = str9;
            }
            Map<String, String> map = this.f6226f;
            Map<String, String> map2 = bVar.f6226f;
            if (map != null) {
                map2 = map;
            }
            return new C2314b(str2, str4, str6, str8, str10, map2, this.f6227g || bVar.f6227g, bVar.f6227g ? bVar.f6228h : this.f6228h);
        }

        public C2314b(String str, String str2, String str3, String str4, String str5, Map<String, String> map, boolean z, List<String> list) {
            super(str, str2, str3);
            this.f6224d = str4;
            this.f6225e = str5;
            this.f6226f = map;
            this.f6227g = z;
            this.f6228h = list;
        }

        public C2314b() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (Map<String, String>) null, false, (List<String>) null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Mg$c */
    public static class C2315c extends C2095Hg.C2096a<C2312Mg, C2314b> {

        /* renamed from: d */
        private final C2104I f6229d;

        public C2315c(Context context, String str) {
            this(context, str, new C3241mn(), C2007F0.m7154g().mo15742d());
        }

        /* renamed from: a */
        public C1992Eg mo15618a(Object obj) {
            C1992Eg.C1995c cVar = (C1992Eg.C1995c) obj;
            C2312Mg mg = (C2312Mg) mo15869a(cVar);
            C3356pi piVar = cVar.f5341a;
            mg.mo16319c(piVar.mo17987s());
            mg.mo16317b(piVar.mo17986r());
            String str = ((C2314b) cVar.f5342b).f6224d;
            if (str != null) {
                C2312Mg.m7948a(mg, str);
                C2312Mg.m7949b(mg, ((C2314b) cVar.f5342b).f6225e);
            }
            Map<String, String> map = ((C2314b) cVar.f5342b).f6226f;
            mg.mo16314a(map);
            mg.mo16312a((C3566v3.C3567a) this.f6229d.mo18143a(new C3566v3.C3567a(map, C3522u0.APP)));
            mg.mo16315a(((C2314b) cVar.f5342b).f6227g);
            mg.mo16313a(((C2314b) cVar.f5342b).f6228h);
            mg.mo16318b(cVar.f5341a.mo17985q());
            mg.mo16320h(cVar.f5341a.mo17975g());
            mg.mo16316b(cVar.f5341a.mo17983o());
            return mg;
        }

        protected C2315c(Context context, String str, C3241mn mnVar, C2104I i) {
            super(context, str, mnVar);
            this.f6229d = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C1992Eg mo15617a() {
            return new C2312Mg();
        }
    }

    /* renamed from: B */
    public C3566v3.C3567a mo16300B() {
        return this.f6217t;
    }

    /* renamed from: C */
    public Map<String, String> mo16301C() {
        return this.f6216s;
    }

    /* renamed from: D */
    public String mo16302D() {
        return this.f6221x;
    }

    /* renamed from: E */
    public String mo16303E() {
        return this.f6214q;
    }

    /* renamed from: F */
    public String mo16304F() {
        return this.f6215r;
    }

    /* renamed from: G */
    public List<String> mo16305G() {
        return this.f6218u;
    }

    /* renamed from: H */
    public C3480sg mo16306H() {
        return this.f6223z;
    }

    /* renamed from: I */
    public List<String> mo16307I() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!C1848A2.m6814b((Collection) this.f6212o)) {
            linkedHashSet.addAll(this.f6212o);
        }
        if (!C1848A2.m6814b((Collection) this.f6213p)) {
            linkedHashSet.addAll(this.f6213p);
        }
        linkedHashSet.addAll(this.f6211A.mo16029a());
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: J */
    public List<String> mo16308J() {
        return this.f6213p;
    }

    /* renamed from: K */
    public boolean mo16309K() {
        return this.f6219v;
    }

    /* renamed from: L */
    public boolean mo16310L() {
        return this.f6220w;
    }

    /* renamed from: a */
    public long mo16311a(long j) {
        if (this.f6222y == 0) {
            this.f6222y = j;
        }
        return this.f6222y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16318b(boolean z) {
        this.f6220w = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo16319c(List<String> list) {
        this.f6212o = list;
    }

    /* renamed from: h */
    public void mo16320h(String str) {
        this.f6221x = str;
    }

    public String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f6212o + ", mStartupHostsFromClient=" + this.f6213p + ", mDistributionReferrer='" + this.f6214q + '\'' + ", mInstallReferrerSource='" + this.f6215r + '\'' + ", mClidsFromClient=" + this.f6216s + ", mNewCustomHosts=" + this.f6218u + ", mHasNewCustomHosts=" + this.f6219v + ", mSuccessfulStartup=" + this.f6220w + ", mCountryInit='" + this.f6221x + '\'' + ", mFirstStartupTime=" + this.f6222y + "} " + super.toString();
    }

    private C2312Mg() {
        this(C2007F0.m7154g().mo15750m(), new C2197Jg());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16316b(long j) {
        if (this.f6222y == 0) {
            this.f6222y = j;
        }
    }

    C2312Mg(C3480sg sgVar, C2197Jg jg) {
        this.f6217t = new C3566v3.C3567a((Map<String, String>) null, C3522u0.APP);
        this.f6222y = 0;
        this.f6223z = sgVar;
        this.f6211A = jg;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16314a(Map<String, String> map) {
        this.f6216s = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16317b(List<String> list) {
        this.f6213p = list;
    }

    /* renamed from: b */
    static void m7949b(C2312Mg mg, String str) {
        mg.f6215r = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16312a(C3566v3.C3567a aVar) {
        this.f6217t = aVar;
    }

    /* renamed from: a */
    static void m7948a(C2312Mg mg, String str) {
        mg.f6214q = str;
    }

    /* renamed from: a */
    public void mo16313a(List<String> list) {
        this.f6218u = list;
    }

    /* renamed from: a */
    public void mo16315a(boolean z) {
        this.f6219v = z;
    }
}
