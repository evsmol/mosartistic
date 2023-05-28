package com.applovin.exoplayer2.p186e.p189c;

import com.applovin.exoplayer2.p186e.C7232g;
import com.applovin.exoplayer2.p221l.C7772y;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.e.c.c */
final class C7198c extends C7199d {

    /* renamed from: b */
    private long f15864b = -9223372036854775807L;

    /* renamed from: c */
    private long[] f15865c = new long[0];

    /* renamed from: d */
    private long[] f15866d = new long[0];

    public C7198c() {
        super(new C7232g());
    }

    /* renamed from: a */
    private static Object m19383a(C7772y yVar, int i) {
        if (i == 0) {
            return m19386d(yVar);
        }
        if (i == 1) {
            return m19385c(yVar);
        }
        if (i == 2) {
            return m19387e(yVar);
        }
        if (i == 3) {
            return m19389g(yVar);
        }
        if (i == 8) {
            return m19390h(yVar);
        }
        if (i == 10) {
            return m19388f(yVar);
        }
        if (i != 11) {
            return null;
        }
        return m19391i(yVar);
    }

    /* renamed from: b */
    private static int m19384b(C7772y yVar) {
        return yVar.mo55084h();
    }

    /* renamed from: c */
    private static Boolean m19385c(C7772y yVar) {
        boolean z = true;
        if (yVar.mo55084h() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: d */
    private static Double m19386d(C7772y yVar) {
        return Double.valueOf(Double.longBitsToDouble(yVar.mo55095s()));
    }

    /* renamed from: e */
    private static String m19387e(C7772y yVar) {
        int i = yVar.mo55085i();
        int c = yVar.mo55074c();
        yVar.mo55079e(i);
        return new String(yVar.mo55077d(), c, i);
    }

    /* renamed from: f */
    private static ArrayList<Object> m19388f(C7772y yVar) {
        int w = yVar.mo55099w();
        ArrayList<Object> arrayList = new ArrayList<>(w);
        for (int i = 0; i < w; i++) {
            Object a = m19383a(yVar, m19384b(yVar));
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static HashMap<String, Object> m19389g(C7772y yVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String e = m19387e(yVar);
            int b = m19384b(yVar);
            if (b == 9) {
                return hashMap;
            }
            Object a = m19383a(yVar, b);
            if (a != null) {
                hashMap.put(e, a);
            }
        }
    }

    /* renamed from: h */
    private static HashMap<String, Object> m19390h(C7772y yVar) {
        int w = yVar.mo55099w();
        HashMap<String, Object> hashMap = new HashMap<>(w);
        for (int i = 0; i < w; i++) {
            String e = m19387e(yVar);
            Object a = m19383a(yVar, m19384b(yVar));
            if (a != null) {
                hashMap.put(e, a);
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    private static Date m19391i(C7772y yVar) {
        Date date = new Date((long) m19386d(yVar).doubleValue());
        yVar.mo55079e(2);
        return date;
    }

    /* renamed from: a */
    public long mo53885a() {
        return this.f15864b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo53883a(C7772y yVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo53884a(C7772y yVar, long j) {
        if (m19384b(yVar) != 2 || !"onMetaData".equals(m19387e(yVar)) || m19384b(yVar) != 8) {
            return false;
        }
        HashMap<String, Object> h = m19390h(yVar);
        Object obj = h.get(IronSourceConstants.EVENTS_DURATION);
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f15864b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = h.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f15865c = new long[size];
                this.f15866d = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f15865c = new long[0];
                        this.f15866d = new long[0];
                    } else {
                        this.f15865c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f15866d[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.f15865c = new long[0];
                this.f15866d = new long[0];
            }
        }
        return false;
    }

    /* renamed from: b */
    public long[] mo53886b() {
        return this.f15865c;
    }

    /* renamed from: c */
    public long[] mo53887c() {
        return this.f15866d;
    }
}
