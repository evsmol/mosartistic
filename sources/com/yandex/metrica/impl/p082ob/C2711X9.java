package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C3416qi;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.X9 */
public class C2711X9 implements ProtobufConverter<C3416qi, C2121If> {

    /* renamed from: a */
    private C2268L9 f7148a = new C2268L9();

    /* renamed from: b */
    private C2683W9 f7149b = new C2683W9();

    /* renamed from: c */
    private C2453Q9 f7150c = new C2453Q9();

    /* renamed from: d */
    private C2513S9 f7151d = new C2513S9();

    /* renamed from: e */
    private C1982E9 f7152e = new C1982E9();

    /* renamed from: f */
    private C2370O9 f7153f = new C2370O9();

    /* renamed from: g */
    private C2765Z9 f7154g = new C2765Z9();

    /* renamed from: h */
    private C2596U9 f7155h = new C2596U9();

    /* renamed from: i */
    private C2182J9 f7156i = new C2182J9();

    /* renamed from: j */
    private C2889da f7157j = new C2889da();

    /* renamed from: k */
    private C2862ca f7158k = new C2862ca();

    /* renamed from: l */
    private C3502t9 f7159l = new C3502t9();

    /* renamed from: m */
    private C2799aa f7160m = new C2799aa();

    /* renamed from: n */
    private C3612w9 f7161n = new C3612w9();

    /* renamed from: o */
    private C1859A9 f7162o = new C1859A9();

    /* renamed from: p */
    private C3473s9 f7163p = new C3473s9();

    /* renamed from: q */
    private C1887B9 f7164q = new C1887B9();

    /* renamed from: r */
    private C1918C9 f7165r = new C1918C9();

    /* renamed from: s */
    private C3693y9 f7166s = new C3693y9();

    /* renamed from: t */
    private C2738Y9 f7167t = new C2738Y9();

    /* renamed from: u */
    private C2335N9 f7168u = new C2335N9();

    public Object fromModel(Object obj) {
        C3416qi qiVar = (C3416qi) obj;
        C2121If ifR = new C2121If();
        ifR.f5560C = qiVar.f8863G;
        ifR.f5561D = qiVar.f8864H;
        ifR.f5592l = new C2121If.C2134k[qiVar.f8897s.size()];
        int i = 0;
        int i2 = 0;
        for (C3316oc a : qiVar.f8897s) {
            ifR.f5592l[i2] = this.f7148a.fromModel(a);
            i2++;
        }
        String str = qiVar.f8879a;
        if (str != null) {
            ifR.f5581a = str;
        }
        String str2 = qiVar.f8880b;
        if (str2 != null) {
            ifR.f5605y = str2;
        }
        String str3 = qiVar.f8881c;
        if (str3 != null) {
            ifR.f5606z = str3;
        }
        List<String> list = qiVar.f8888j;
        if (list != null) {
            ifR.f5587g = (String[]) list.toArray(new String[list.size()]);
        }
        List<String> list2 = qiVar.f8889k;
        if (list2 != null) {
            ifR.f5588h = (String[]) list2.toArray(new String[list2.size()]);
        }
        List<String> list3 = qiVar.f8882d;
        if (list3 != null) {
            ifR.f5583c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List<String> list4 = qiVar.f8887i;
        if (list4 != null) {
            ifR.f5586f = (String[]) list4.toArray(new String[list4.size()]);
        }
        List<String> list5 = qiVar.f8890l;
        if (list5 != null) {
            ifR.f5600t = (String[]) list5.toArray(new String[list5.size()]);
        }
        List<String> list6 = qiVar.f8891m;
        if (list6 != null) {
            ifR.f5589i = (String[]) list6.toArray(new String[list6.size()]);
        }
        Map<String, List<String>> map = qiVar.f8892n;
        if (map != null) {
            ifR.f5590j = this.f7166s.fromModel((Map<String, ? extends List<String>>) map);
        }
        C2900di diVar = qiVar.f8898t;
        if (diVar != null) {
            ifR.f5593m = this.f7149b.fromModel(diVar);
        }
        C2808ai aiVar = qiVar.f8857A;
        if (aiVar != null) {
            this.f7150c.getClass();
            C2121If.C2143n nVar = new C2121If.C2143n();
            nVar.f5696a = aiVar.f7401a;
            nVar.f5697b = aiVar.f7402b;
            ifR.f5563F = nVar;
        }
        String str4 = qiVar.f8893o;
        if (str4 != null) {
            ifR.f5595o = str4;
        }
        String str5 = qiVar.f8883e;
        if (str5 != null) {
            ifR.f5584d = str5;
        }
        String str6 = qiVar.f8884f;
        if (str6 != null) {
            ifR.f5585e = str6;
        }
        String str7 = qiVar.f8885g;
        if (str7 != null) {
            ifR.f5558A = str7;
        }
        String str8 = qiVar.f8886h;
        if (str8 != null) {
            ifR.f5559B = str8;
        }
        ifR.f5591k = this.f7152e.fromModel(qiVar.f8896r);
        String str9 = qiVar.f8894p;
        if (str9 != null) {
            ifR.f5596p = str9;
        }
        String str10 = qiVar.f8895q;
        if (str10 != null) {
            ifR.f5597q = str10;
        }
        ifR.f5598r = qiVar.f8901w;
        ifR.f5582b = qiVar.f8899u;
        ifR.f5602v = qiVar.f8900v;
        RetryPolicyConfig retryPolicyConfig = qiVar.f8861E;
        ifR.f5565H = retryPolicyConfig.maxIntervalSeconds;
        ifR.f5566I = retryPolicyConfig.exponentialMultiplier;
        List<C2841bi> list7 = qiVar.f8902x;
        if (list7 != null) {
            C2121If.C2144o[] oVarArr = new C2121If.C2144o[list7.size()];
            for (C2841bi a2 : list7) {
                oVarArr[i] = this.f7151d.fromModel(a2);
                i++;
            }
            ifR.f5594n = oVarArr;
        }
        String str11 = qiVar.f8903y;
        if (str11 != null) {
            ifR.f5599s = str11;
        }
        List<String> list8 = qiVar.f8873Q;
        ifR.f5574Q = (String[]) list8.toArray(new String[list8.size()]);
        List<C1892Bd> list9 = qiVar.f8858B;
        if (list9 != null) {
            ifR.f5603w = this.f7153f.fromModel(list9);
        }
        C2871ci ciVar = qiVar.f8859C;
        if (ciVar != null) {
            ifR.f5604x = this.f7155h.fromModel(ciVar);
        }
        C3512ti tiVar = qiVar.f8904z;
        if (tiVar != null) {
            this.f7154g.getClass();
            C2121If.C2149s sVar = new C2121If.C2149s();
            sVar.f5723a = tiVar.f9164a;
            ifR.f5601u = sVar;
        }
        ifR.f5562E = qiVar.f8865I;
        C2776Zh zh = qiVar.f8860D;
        if (zh != null) {
            this.f7156i.getClass();
            C2121If.C2133j jVar = new C2121If.C2133j();
            jVar.f5656a = zh.f7283a;
            ifR.f5564G = jVar;
        }
        C3634wl wlVar = qiVar.f8866J;
        if (wlVar != null) {
            ifR.f5567J = this.f7157j.fromModel(wlVar);
        }
        C3040hl hlVar = qiVar.f8867K;
        if (hlVar != null) {
            ifR.f5569L = this.f7158k.fromModel(hlVar);
        }
        C3040hl hlVar2 = qiVar.f8868L;
        if (hlVar2 != null) {
            ifR.f5570M = this.f7158k.fromModel(hlVar2);
        }
        C3040hl hlVar3 = qiVar.f8869M;
        if (hlVar3 != null) {
            ifR.f5568K = this.f7158k.fromModel(hlVar3);
        }
        C3044i iVar = qiVar.f8870N;
        if (iVar != null) {
            this.f7159l.getClass();
            C2121If.C2125b bVar = new C2121If.C2125b();
            bVar.f5612a = iVar.f8020a;
            bVar.f5613b = iVar.f8021b;
            ifR.f5575R = bVar;
        }
        C3552ui uiVar = qiVar.f8862F;
        if (uiVar != null) {
            ifR.f5571N = this.f7160m.fromModel(uiVar);
        }
        C2435Ph ph = qiVar.f8871O;
        if (ph != null) {
            ifR.f5572O = this.f7161n.fromModel(ph);
        }
        ifR.f5573P = this.f7162o.fromModel(qiVar.f8872P);
        C2402Oh oh = qiVar.f8874R;
        if (oh != null) {
            ifR.f5576S = this.f7163p.fromModel(oh);
        }
        C3601w0 w0Var = qiVar.f8875S;
        if (w0Var != null) {
            this.f7164q.getClass();
            C2121If.C2130g gVar = new C2121If.C2130g();
            gVar.f5626a = w0Var.mo18350a();
            ifR.f5578U = gVar;
        }
        C2637Uh uh = qiVar.f8876T;
        if (uh != null) {
            ifR.f5577T = this.f7165r.fromModel(uh);
        }
        C2738Y9 y9 = this.f7167t;
        C3483si siVar = qiVar.f8877U;
        y9.getClass();
        C2121If.C2148r rVar = new C2121If.C2148r();
        rVar.f5722a = siVar.mo18215a();
        ifR.f5579V = rVar;
        ifR.f5580W = this.f7168u.fromModel((Map<String, ? extends Object>) qiVar.f8878V);
        return ifR;
    }

    public Object toModel(Object obj) {
        C2121If ifR = (C2121If) obj;
        C3416qi.C3418b a = new C3416qi.C3418b(this.f7152e.toModel(ifR.f5591k)).mo18138k(ifR.f5581a).mo18121c(ifR.f5605y).mo18124d(ifR.f5606z).mo18126e(ifR.f5595o).mo18128f(ifR.f5584d).mo18135i((List<String>) Arrays.asList(ifR.f5583c)).mo18127e((List<String>) Arrays.asList(ifR.f5586f)).mo18116b((List<String>) Arrays.asList(ifR.f5588h)).mo18122c((List<String>) Arrays.asList(ifR.f5587g)).mo18134i(ifR.f5585e).mo18136j(ifR.f5558A).mo18108a(ifR.f5559B).mo18109a((List<String>) Arrays.asList(ifR.f5600t)).mo18131g((List<String>) Arrays.asList(ifR.f5589i)).mo18132h(ifR.f5596p).mo18130g(ifR.f5597q).mo18123c(ifR.f5598r).mo18119c(ifR.f5582b).mo18111a(ifR.f5602v);
        C2121If.C2144o[] oVarArr = ifR.f5594n;
        ArrayList arrayList = new ArrayList(oVarArr.length);
        int i = 0;
        for (C2121If.C2144o a2 : oVarArr) {
            arrayList.add(this.f7151d.toModel(a2));
        }
        C3416qi.C3418b a3 = a.mo18137j((List<C2841bi>) arrayList).mo18113b(ifR.f5560C).mo18091a(ifR.f5561D).mo18115b(ifR.f5599s).mo18118b(ifR.f5562E).mo18107a(new RetryPolicyConfig(ifR.f5565H, ifR.f5566I)).mo18129f((List<String>) Arrays.asList(ifR.f5574Q)).mo18110a(this.f7166s.toModel(ifR.f5590j));
        if (ifR.f5592l != null) {
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                C2121If.C2134k[] kVarArr = ifR.f5592l;
                if (i >= kVarArr.length) {
                    break;
                }
                arrayList2.add(this.f7148a.toModel(kVarArr[i]));
                i++;
            }
            a3.mo18125d((List<C3316oc>) arrayList2);
        }
        C2121If.C2147q qVar = ifR.f5593m;
        if (qVar != null) {
            a3.mo18098a(this.f7149b.toModel(qVar));
        }
        C2121If.C2143n nVar = ifR.f5563F;
        if (nVar != null) {
            this.f7150c.getClass();
            a3.mo18096a(new C2808ai(nVar.f5696a, nVar.f5697b));
        }
        C2121If.C2142m[] mVarArr = ifR.f5603w;
        if (mVarArr != null) {
            a3.mo18133h(this.f7153f.toModel(mVarArr));
        }
        C2121If.C2146p pVar = ifR.f5604x;
        if (pVar != null) {
            a3.mo18097a(this.f7155h.toModel(pVar));
        }
        C2121If.C2149s sVar = ifR.f5601u;
        if (sVar != null) {
            a3.mo18103a(this.f7154g.toModel(sVar));
        }
        C2121If.C2133j jVar = ifR.f5564G;
        if (jVar != null) {
            a3.mo18095a(this.f7156i.toModel(jVar));
        }
        C2121If.C2153w wVar = ifR.f5567J;
        if (wVar != null) {
            a3.mo18106a(this.f7157j.toModel(wVar));
        }
        C2121If.C2152v vVar = ifR.f5569L;
        if (vVar != null) {
            a3.mo18114b(this.f7158k.toModel(vVar));
        }
        C2121If.C2152v vVar2 = ifR.f5570M;
        if (vVar2 != null) {
            a3.mo18120c(this.f7158k.toModel(vVar2));
        }
        C2121If.C2152v vVar3 = ifR.f5568K;
        if (vVar3 != null) {
            a3.mo18099a(this.f7158k.toModel(vVar3));
        }
        C2121If.C2125b bVar = ifR.f5575R;
        if (bVar != null) {
            a3.mo18100a(this.f7159l.toModel(bVar));
        }
        C2121If.C2150t tVar = ifR.f5571N;
        if (tVar != null) {
            a3.mo18104a(this.f7160m.toModel(tVar));
        }
        C2121If.C2126c cVar = ifR.f5572O;
        if (cVar != null) {
            a3.mo18093a(this.f7161n.toModel(cVar));
        }
        C2121If.C2129f fVar = ifR.f5573P;
        if (fVar != null) {
            a3.mo18101a(this.f7162o.mo15451a(fVar));
        }
        C2121If.C2122a aVar = ifR.f5576S;
        if (aVar != null) {
            a3.mo18092a(this.f7163p.toModel(aVar));
        }
        C2121If.C2131h hVar = ifR.f5577T;
        if (hVar != null) {
            a3.mo18094a(this.f7165r.toModel(hVar));
        }
        C2121If.C2130g gVar = ifR.f5578U;
        if (gVar != null) {
            a3.mo18105a(this.f7164q.toModel(gVar));
        }
        C2121If.C2148r rVar = ifR.f5579V;
        if (rVar != null) {
            a3.mo18102a(this.f7167t.toModel(rVar));
        }
        a3.mo18117b(this.f7168u.toModel(ifR.f5580W));
        return a3.mo18112a();
    }
}
