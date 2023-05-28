package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.impl.p082ob.C1941D3;
import com.yandex.metrica.impl.p082ob.C1992Eg;
import com.yandex.metrica.impl.p082ob.C2095Hg;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.D4 */
public class C1943D4 extends C2095Hg {

    /* renamed from: o */
    private List<String> f5219o;

    /* renamed from: p */
    private String f5220p;

    /* renamed from: q */
    private Boolean f5221q;

    /* renamed from: B */
    public String mo15610B() {
        return this.f5220p;
    }

    /* renamed from: C */
    public List<String> mo15611C() {
        return this.f5219o;
    }

    /* renamed from: D */
    public Boolean mo15612D() {
        return this.f5221q;
    }

    /* renamed from: a */
    public void mo15614a(List<String> list) {
        this.f5219o = list;
    }

    /* renamed from: h */
    public void mo15615h(String str) {
        this.f5220p = str;
    }

    public String toString() {
        return "DiagnosticRequestConfig{mDiagnosticHosts=" + this.f5219o + ", mApiKey='" + this.f5220p + '\'' + ", statisticsSending=" + this.f5221q + "} " + super.toString();
    }

    /* renamed from: a */
    public void mo15613a(Boolean bool) {
        this.f5221q = bool;
    }

    /* renamed from: com.yandex.metrica.impl.ob.D4$a */
    public static final class C1944a extends C1992Eg.C1993a<C1941D3.C1942a, C1944a> {

        /* renamed from: d */
        public final String f5222d;

        /* renamed from: e */
        public final boolean f5223e;

        public C1944a(String str, String str2, String str3, String str4, Boolean bool) {
            super(str, str2, str3);
            this.f5222d = str4;
            this.f5223e = ((Boolean) C2572Tl.m8512a(bool, Boolean.TRUE)).booleanValue();
        }

        /* renamed from: a */
        public Object mo15606a(Object obj) {
            C1941D3.C1942a aVar = (C1941D3.C1942a) obj;
            String str = aVar.f5202a;
            String str2 = this.f5336a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.f5203b;
            String str4 = this.f5337b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.f5204c;
            String str6 = this.f5338c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.f5205d;
            String str8 = this.f5222d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.f5213l;
            return new C1944a(str2, str4, str6, str8, bool == null ? Boolean.valueOf(this.f5223e) : bool);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
            r3 = r3.f5205d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = r3.f5203b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r0 = r3.f5204c;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo15607b(java.lang.Object r3) {
            /*
                r2 = this;
                com.yandex.metrica.impl.ob.D3$a r3 = (com.yandex.metrica.impl.p082ob.C1941D3.C1942a) r3
                java.lang.String r0 = r3.f5202a
                if (r0 == 0) goto L_0x000f
                java.lang.String r1 = r2.f5336a
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x000f
                goto L_0x0036
            L_0x000f:
                java.lang.String r0 = r3.f5203b
                if (r0 == 0) goto L_0x001c
                java.lang.String r1 = r2.f5337b
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x001c
                goto L_0x0036
            L_0x001c:
                java.lang.String r0 = r3.f5204c
                if (r0 == 0) goto L_0x0029
                java.lang.String r1 = r2.f5338c
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0029
                goto L_0x0036
            L_0x0029:
                java.lang.String r3 = r3.f5205d
                if (r3 == 0) goto L_0x0038
                java.lang.String r0 = r2.f5222d
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0036
                goto L_0x0038
            L_0x0036:
                r3 = 0
                goto L_0x0039
            L_0x0038:
                r3 = 1
            L_0x0039:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C1943D4.C1944a.mo15607b(java.lang.Object):boolean");
        }

        public C1944a(C1941D3.C1942a aVar) {
            this(aVar.f5202a, aVar.f5203b, aVar.f5204c, aVar.f5205d, aVar.f5213l);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.D4$b */
    public static class C1945b extends C2095Hg.C2096a<C1943D4, C1944a> {
        public C1945b(Context context, String str) {
            super(context, str);
        }

        /* renamed from: a */
        public C1992Eg mo15618a(Object obj) {
            C1992Eg.C1995c cVar = (C1992Eg.C1995c) obj;
            C1943D4 d4 = (C1943D4) mo15869a(cVar);
            d4.mo15614a(cVar.f5341a.mo17979k());
            d4.mo15615h(((C1944a) cVar.f5342b).f5222d);
            d4.mo15613a(Boolean.valueOf(((C1944a) cVar.f5342b).f5223e));
            return d4;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C1992Eg mo15617a() {
            return new C1943D4();
        }
    }
}
