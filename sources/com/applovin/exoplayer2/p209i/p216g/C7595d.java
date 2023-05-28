package com.applovin.exoplayer2.p209i.p216g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p221l.C7717a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.applovin.exoplayer2.i.g.d */
final class C7595d {

    /* renamed from: a */
    public final String f17685a;

    /* renamed from: b */
    public final String f17686b;

    /* renamed from: c */
    public final boolean f17687c;

    /* renamed from: d */
    public final long f17688d;

    /* renamed from: e */
    public final long f17689e;

    /* renamed from: f */
    public final C7598g f17690f;

    /* renamed from: g */
    public final String f17691g;

    /* renamed from: h */
    public final String f17692h;

    /* renamed from: i */
    public final C7595d f17693i;

    /* renamed from: j */
    private final String[] f17694j;

    /* renamed from: k */
    private final HashMap<String, Integer> f17695k;

    /* renamed from: l */
    private final HashMap<String, Integer> f17696l;

    /* renamed from: m */
    private List<C7595d> f17697m;

    private C7595d(String str, String str2, long j, long j2, C7598g gVar, String[] strArr, String str3, String str4, C7595d dVar) {
        this.f17685a = str;
        this.f17686b = str2;
        this.f17692h = str4;
        this.f17690f = gVar;
        this.f17694j = strArr;
        this.f17687c = str2 != null;
        this.f17688d = j;
        this.f17689e = j2;
        this.f17691g = (String) C7717a.m22120b(str3);
        this.f17693i = dVar;
        this.f17695k = new HashMap<>();
        this.f17696l = new HashMap<>();
    }

    /* renamed from: a */
    private static SpannableStringBuilder m21518a(String str, Map<String, C7540a.C7542a> map) {
        if (!map.containsKey(str)) {
            C7540a.C7542a aVar = new C7540a.C7542a();
            aVar.mo54643a((CharSequence) new SpannableStringBuilder());
            map.put(str, aVar);
        }
        return (SpannableStringBuilder) C7717a.m22120b(map.get(str).mo54644a());
    }

    /* renamed from: a */
    public static C7595d m21519a(String str) {
        return new C7595d((String) null, C7597f.m21536a(str), -9223372036854775807L, -9223372036854775807L, (C7598g) null, (String[]) null, "", (String) null, (C7595d) null);
    }

    /* renamed from: a */
    public static C7595d m21520a(String str, long j, long j2, C7598g gVar, String[] strArr, String str2, String str3, C7595d dVar) {
        return new C7595d(str, (String) null, j, j2, gVar, strArr, str2, str3, dVar);
    }

    /* renamed from: a */
    private void m21521a(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f17691g)) {
            str = this.f17691g;
        }
        if (!mo54717a(j) || !"div".equals(this.f17685a) || this.f17692h == null) {
            for (int i = 0; i < mo54713a(); i++) {
                mo54714a(i).m21521a(j, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f17692h));
    }

    /* renamed from: a */
    private void m21522a(long j, Map<String, C7598g> map, Map<String, C7596e> map2, String str, Map<String, C7540a.C7542a> map3) {
        int i;
        if (mo54717a(j)) {
            String str2 = "".equals(this.f17691g) ? str : this.f17691g;
            Iterator<Map.Entry<String, Integer>> it = this.f17696l.entrySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str3 = (String) next.getKey();
                int intValue = this.f17695k.containsKey(str3) ? this.f17695k.get(str3).intValue() : 0;
                int intValue2 = ((Integer) next.getValue()).intValue();
                if (intValue != intValue2) {
                    m21525a(map, (C7540a.C7542a) C7717a.m22120b(map3.get(str3)), intValue, intValue2, ((C7596e) C7717a.m22120b(map2.get(str2))).f17707j);
                } else {
                    Map<String, C7596e> map4 = map2;
                    Map<String, C7540a.C7542a> map5 = map3;
                }
            }
            Map<String, C7596e> map6 = map2;
            Map<String, C7540a.C7542a> map7 = map3;
            while (i < mo54713a()) {
                mo54714a(i).m21522a(j, map, map2, str2, map3);
                i++;
                Map<String, C7596e> map8 = map2;
            }
        }
    }

    /* renamed from: a */
    private void m21523a(long j, boolean z, String str, Map<String, C7540a.C7542a> map) {
        this.f17695k.clear();
        this.f17696l.clear();
        if (!"metadata".equals(this.f17685a)) {
            if (!"".equals(this.f17691g)) {
                str = this.f17691g;
            }
            if (this.f17687c && z) {
                m21518a(str, map).append((CharSequence) C7717a.m22120b(this.f17686b));
            } else if ("br".equals(this.f17685a) && z) {
                m21518a(str, map).append(10);
            } else if (mo54717a(j)) {
                for (Map.Entry next : map.entrySet()) {
                    this.f17695k.put((String) next.getKey(), Integer.valueOf(((CharSequence) C7717a.m22120b(((C7540a.C7542a) next.getValue()).mo54644a())).length()));
                }
                boolean equals = "p".equals(this.f17685a);
                for (int i = 0; i < mo54713a(); i++) {
                    mo54714a(i).m21523a(j, z || equals, str, map);
                }
                if (equals) {
                    C7597f.m21538a(m21518a(str, map));
                }
                for (Map.Entry next2 : map.entrySet()) {
                    this.f17696l.put((String) next2.getKey(), Integer.valueOf(((CharSequence) C7717a.m22120b(((C7540a.C7542a) next2.getValue()).mo54644a())).length()));
                }
            }
        }
    }

    /* renamed from: a */
    private static void m21524a(SpannableStringBuilder spannableStringBuilder) {
        for (C7589a aVar : (C7589a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C7589a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == 10) {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == 10) {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    /* renamed from: a */
    private void m21525a(Map<String, C7598g> map, C7540a.C7542a aVar, int i, int i2, int i3) {
        C7598g a = C7597f.m21535a(this.f17690f, this.f17694j, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.mo54644a();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            aVar.mo54643a((CharSequence) spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (a != null) {
            C7597f.m21537a(spannableStringBuilder2, i, i2, a, this.f17693i, map, i3);
            if ("p".equals(this.f17685a)) {
                if (a.mo54746i() != Float.MAX_VALUE) {
                    aVar.mo54654d((a.mo54746i() * -90.0f) / 100.0f);
                }
                if (a.mo54750m() != null) {
                    aVar.mo54642a(a.mo54750m());
                }
                if (a.mo54751n() != null) {
                    aVar.mo54649b(a.mo54751n());
                }
            }
        }
    }

    /* renamed from: a */
    private void m21526a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f17685a);
        boolean equals2 = "div".equals(this.f17685a);
        if (z || equals || (equals2 && this.f17692h != null)) {
            long j = this.f17688d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f17689e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f17697m != null) {
            for (int i = 0; i < this.f17697m.size(); i++) {
                this.f17697m.get(i).m21526a(treeSet, z || equals);
            }
        }
    }

    /* renamed from: a */
    public int mo54713a() {
        List<C7595d> list = this.f17697m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public C7595d mo54714a(int i) {
        List<C7595d> list = this.f17697m;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public List<C7540a> mo54715a(long j, Map<String, C7598g> map, Map<String, C7596e> map2, Map<String, String> map3) {
        ArrayList<Pair> arrayList = new ArrayList<>();
        m21521a(j, this.f17691g, arrayList);
        TreeMap treeMap = new TreeMap();
        long j2 = j;
        m21523a(j2, false, this.f17691g, (Map<String, C7540a.C7542a>) treeMap);
        m21522a(j2, map, map2, this.f17691g, (Map<String, C7540a.C7542a>) treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C7596e eVar = (C7596e) C7717a.m22120b(map2.get(pair.first));
                arrayList2.add(new C7540a.C7542a().mo54641a(decodeByteArray).mo54638a(eVar.f17699b).mo54648b(0).mo54639a(eVar.f17700c, 0).mo54640a(eVar.f17702e).mo54646b(eVar.f17703f).mo54651c(eVar.f17704g).mo54655d(eVar.f17707j).mo54656e());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C7596e eVar2 = (C7596e) C7717a.m22120b(map2.get(entry.getKey()));
            C7540a.C7542a aVar = (C7540a.C7542a) entry.getValue();
            m21524a((SpannableStringBuilder) C7717a.m22120b(aVar.mo54644a()));
            aVar.mo54639a(eVar2.f17700c, eVar2.f17701d);
            aVar.mo54640a(eVar2.f17702e);
            aVar.mo54638a(eVar2.f17699b);
            aVar.mo54646b(eVar2.f17703f);
            aVar.mo54647b(eVar2.f17706i, eVar2.f17705h);
            aVar.mo54655d(eVar2.f17707j);
            arrayList2.add(aVar.mo54656e());
        }
        return arrayList2;
    }

    /* renamed from: a */
    public void mo54716a(C7595d dVar) {
        if (this.f17697m == null) {
            this.f17697m = new ArrayList();
        }
        this.f17697m.add(dVar);
    }

    /* renamed from: a */
    public boolean mo54717a(long j) {
        return (this.f17688d == -9223372036854775807L && this.f17689e == -9223372036854775807L) || (this.f17688d <= j && this.f17689e == -9223372036854775807L) || ((this.f17688d == -9223372036854775807L && j < this.f17689e) || (this.f17688d <= j && j < this.f17689e));
    }

    /* renamed from: b */
    public long[] mo54718b() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m21526a((TreeSet<Long>) treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: c */
    public String[] mo54719c() {
        return this.f17694j;
    }
}
