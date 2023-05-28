package com.bytedance.sdk.component.adexpress.dynamic.p304c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10349f;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a */
/* compiled from: ComputeRuler */
public class C10354a {

    /* renamed from: a */
    public Map<String, C10357c> f25689a = new HashMap();

    /* renamed from: b */
    public Map<String, C10357c> f25690b = new HashMap();

    /* renamed from: c */
    public Map<String, C10357c> f25691c = new HashMap();

    /* renamed from: d */
    private double f25692d = Math.random();

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00da  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.adexpress.dynamic.p304c.C10354a.C10357c mo63579a(com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h r13, float r14, float r15) {
        /*
            r12 = this;
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.mo63563i()
            java.lang.String r0 = r0.mo63360c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.mo63563i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r0 = r0.mo63363e()
            java.lang.String r0 = r0.mo63381P()
            if (r0 != 0) goto L_0x0023
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>(r1, r1)
            return r13
        L_0x0023:
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.mo63563i()
            java.lang.String r0 = r0.mo63357b()
            java.lang.String r2 = "creative-playable-bait"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0039
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>(r1, r1)
            return r13
        L_0x0039:
            float r0 = r13.mo63560g()
            float r1 = r13.mo63562h()
            com.bytedance.sdk.component.adexpress.dynamic.b.e r2 = r13.mo63563i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r2 = r2.mo63363e()
            java.lang.String r3 = r2.mo63484r()
            java.lang.String r2 = r2.mo63481q()
            int r4 = r13.mo63566l()
            float r4 = (float) r4
            int r5 = r13.mo63567m()
            float r5 = (float) r5
            float r6 = r13.mo63568n()
            float r7 = r13.mo63569o()
            java.lang.String r8 = "fixed"
            boolean r9 = android.text.TextUtils.equals(r3, r8)
            java.lang.String r10 = "flex"
            java.lang.String r11 = "auto"
            if (r9 == 0) goto L_0x0086
            float r14 = java.lang.Math.min(r0, r14)
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L_0x00b7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.mo63582b((com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r13, (float) r0, (float) r1)
            float r13 = r13.f25702b
        L_0x0083:
            float r1 = r13 + r7
            goto L_0x00b7
        L_0x0086:
            boolean r9 = android.text.TextUtils.equals(r3, r11)
            if (r9 == 0) goto L_0x009f
            float r14 = r14 - r6
            float r0 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.mo63582b((com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r13, (float) r14, (float) r0)
            float r14 = r13.f25701a
            float r14 = r14 + r6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L_0x00b7
            float r13 = r13.f25702b
            goto L_0x0083
        L_0x009f:
            boolean r3 = android.text.TextUtils.equals(r3, r10)
            if (r3 == 0) goto L_0x00b6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L_0x00b7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.mo63582b((com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r13, (float) r0, (float) r1)
            float r13 = r13.f25702b
            goto L_0x0083
        L_0x00b6:
            r14 = r0
        L_0x00b7:
            java.lang.String r13 = "scale"
            boolean r13 = android.text.TextUtils.equals(r2, r13)
            if (r13 == 0) goto L_0x00da
            float r13 = r14 - r4
            float r13 = r13 / r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r13 = r13 + r5
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d8
            float r13 = r15 - r5
            float r13 = r13 * r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r14 = r13 + r4
            goto L_0x00ee
        L_0x00d8:
            r15 = r13
            goto L_0x00ee
        L_0x00da:
            boolean r13 = android.text.TextUtils.equals(r2, r8)
            if (r13 == 0) goto L_0x00e6
            float r1 = r1 + r5
            float r15 = java.lang.Math.min(r1, r15)
            goto L_0x00ee
        L_0x00e6:
            boolean r13 = android.text.TextUtils.equals(r2, r10)
            if (r13 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r15 = r1
        L_0x00ee:
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>()
            r13.f25701a = r14
            r13.f25702b = r15
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p304c.C10354a.mo63579a(com.bytedance.sdk.component.adexpress.dynamic.b.h, float, float):com.bytedance.sdk.component.adexpress.dynamic.c.a$c");
    }

    /* renamed from: b */
    public C10357c mo63582b(C10351h hVar, float f, float f2) {
        C10357c cVar = new C10357c();
        if (hVar.mo63563i().mo63363e() == null) {
            return cVar;
        }
        C10357c e = m30134e(hVar, f, f2);
        float f3 = e.f25701a;
        float f4 = e.f25702b;
        cVar.f25701a = Math.min(f3, f);
        cVar.f25702b = Math.min(f4, f2);
        return cVar;
    }

    /* renamed from: e */
    private C10357c m30134e(C10351h hVar, float f, float f2) {
        String str = hVar.mo63547b() + "_" + f + "_" + f2;
        if (this.f25691c.containsKey(str)) {
            return this.f25691c.get(str);
        }
        C10357c f3 = m30136f(hVar, f, f2);
        this.f25691c.put(str, f3);
        return f3;
    }

    /* renamed from: f */
    private C10357c m30136f(C10351h hVar, float f, float f2) {
        new C10357c();
        C10349f e = hVar.mo63563i().mo63363e();
        hVar.mo63563i().mo63360c();
        e.mo63372G();
        float j = e.mo63456j();
        int F = e.mo63371F();
        double E = e.mo63370E();
        int H = e.mo63373H();
        boolean y = e.mo63500y();
        boolean I = e.mo63374I();
        int z = e.mo63501z();
        C10356b bVar = new C10356b();
        bVar.f25696a = j;
        bVar.f25697b = F;
        bVar.f25698c = H;
        bVar.f25699d = E;
        bVar.f25700e = f;
        return m30120a(hVar.mo63563i().mo63360c(), bVar, y, I, z, hVar);
    }

    /* renamed from: a */
    private C10357c m30120a(String str, C10356b bVar, boolean z, boolean z2, int i, C10351h hVar) {
        return C10373l.m30203a(str, hVar.mo63563i().mo63357b(), C10356b.m30144a(bVar).toString(), z, z2, i);
    }

    /* renamed from: c */
    public C10357c mo63583c(C10351h hVar, float f, float f2) {
        if (hVar == null) {
            return null;
        }
        C10357c a = mo63578a(hVar);
        if (a != null && (a.f25701a != 0.0f || a.f25702b != 0.0f)) {
            return a;
        }
        C10357c d = mo63584d(hVar, f, f2);
        m30121a(hVar, d);
        return d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.adexpress.dynamic.p304c.C10354a.C10357c mo63584d(com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h r19, float r20, float r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r3.<init>()
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x011b
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 > 0) goto L_0x0016
            goto L_0x011b
        L_0x0016:
            boolean r5 = r19.mo63571q()
            if (r5 == 0) goto L_0x0021
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r1 = r18.mo63579a((com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r19, (float) r20, (float) r21)
            return r1
        L_0x0021:
            float r5 = r19.mo63560g()
            float r6 = r19.mo63562h()
            float r7 = r19.mo63568n()
            float r8 = r19.mo63569o()
            com.bytedance.sdk.component.adexpress.dynamic.b.e r9 = r19.mo63563i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r9 = r9.mo63363e()
            java.lang.String r10 = r9.mo63484r()
            java.lang.String r9 = r9.mo63481q()
            java.lang.String r11 = "flex"
            boolean r12 = android.text.TextUtils.equals(r10, r11)
            java.lang.String r13 = "auto"
            if (r12 != 0) goto L_0x0057
            boolean r12 = android.text.TextUtils.equals(r10, r13)
            if (r12 == 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            float r5 = java.lang.Math.min(r5, r1)
            goto L_0x0058
        L_0x0057:
            r5 = r1
        L_0x0058:
            float r5 = r5 - r7
            java.lang.String r12 = "scale"
            boolean r12 = android.text.TextUtils.equals(r9, r12)
            if (r12 == 0) goto L_0x0077
            float r12 = r5 / r6
            int r12 = java.lang.Math.round(r12)
            float r12 = (float) r12
            float r12 = r12 + r8
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x008a
            float r5 = r2 - r8
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            goto L_0x0089
        L_0x0077:
            boolean r12 = android.text.TextUtils.equals(r9, r13)
            if (r12 != 0) goto L_0x0089
            boolean r12 = android.text.TextUtils.equals(r9, r11)
            if (r12 == 0) goto L_0x0084
            goto L_0x0089
        L_0x0084:
            float r12 = java.lang.Math.min(r6, r2)
            goto L_0x008a
        L_0x0089:
            r12 = r2
        L_0x008a:
            float r12 = r12 - r8
            java.util.List r6 = r19.mo63570p()
            java.util.Iterator r14 = r6.iterator()
            r15 = 0
            r16 = 0
        L_0x0096:
            boolean r17 = r14.hasNext()
            if (r17 == 0) goto L_0x00c4
            java.lang.Object r17 = r14.next()
            r1 = r17
            java.util.List r1 = (java.util.List) r1
            r19 = r14
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r14 = r0.m30126b((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h>) r1, (float) r5, (float) r12)
            boolean r1 = r0.m30128b((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h>) r1)
            if (r1 == 0) goto L_0x00b4
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 + r1
            goto L_0x00bb
        L_0x00b4:
            float r1 = r14.f25701a
            float r1 = java.lang.Math.max(r15, r1)
            r15 = r1
        L_0x00bb:
            float r1 = r14.f25702b
            float r16 = r16 + r1
            r14 = r19
            r1 = r20
            goto L_0x0096
        L_0x00c4:
            boolean r1 = android.text.TextUtils.equals(r10, r13)
            if (r1 == 0) goto L_0x00ed
            int r1 = r6.size()
            float r1 = (float) r1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d6
            r15 = r20
            goto L_0x00ee
        L_0x00d6:
            java.util.Iterator r1 = r6.iterator()
        L_0x00da:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00ee
            java.lang.Object r4 = r1.next()
            java.util.List r4 = (java.util.List) r4
            r0.m30130c((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h>) r4)
            r0.m30126b((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h>) r4, (float) r15, (float) r12)
            goto L_0x00da
        L_0x00ed:
            r15 = r5
        L_0x00ee:
            boolean r1 = android.text.TextUtils.equals(r9, r13)
            if (r1 == 0) goto L_0x00ff
            int r1 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x00fb
            r12 = r16
            goto L_0x0114
        L_0x00fb:
            r0.m30122a((java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h>>) r6, (float) r15, (float) r12)
            goto L_0x0114
        L_0x00ff:
            java.lang.String r1 = "fixed"
            boolean r1 = android.text.TextUtils.equals(r9, r1)
            if (r1 != 0) goto L_0x010d
            boolean r1 = android.text.TextUtils.equals(r9, r11)
            if (r1 == 0) goto L_0x0114
        L_0x010d:
            int r1 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x0114
            r0.m30122a((java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h>>) r6, (float) r15, (float) r12)
        L_0x0114:
            float r15 = r15 + r7
            float r12 = r12 + r8
            r3.f25701a = r15
            r3.f25702b = r12
            return r3
        L_0x011b:
            r3.f25701a = r4
            r3.f25702b = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p304c.C10354a.mo63584d(com.bytedance.sdk.component.adexpress.dynamic.b.h, float, float):com.bytedance.sdk.component.adexpress.dynamic.c.a$c");
    }

    /* renamed from: a */
    private void m30122a(List<List<C10351h>> list, float f, float f2) {
        float f3;
        if (list != null && list.size() > 0) {
            boolean z = false;
            for (List<C10351h> a : list) {
                if (m30125a(a, false)) {
                    z = true;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (List next : list) {
                C10355a aVar = new C10355a();
                boolean a2 = m30125a((List<C10351h>) next, !z);
                C10357c b = m30126b((List<C10351h>) next, f, f2);
                if (a2) {
                    f3 = 1.0f;
                } else {
                    f3 = b.f25702b;
                }
                aVar.f25693a = f3;
                aVar.f25694b = !a2;
                arrayList.add(aVar);
            }
            List<C10355a> a3 = C10372k.m30200a(f2, arrayList);
            for (int i = 0; i < list.size(); i++) {
                if (((C10355a) arrayList.get(i)).f25693a != a3.get(i).f25693a) {
                    List list2 = list.get(i);
                    m30130c((List<C10351h>) list2);
                    m30126b((List<C10351h>) list2, f, a3.get(i).f25693a);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m30128b(List<C10351h> list) {
        boolean z;
        List<List<C10351h>> p;
        Iterator<C10351h> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().mo63563i().mo63363e().mo63484r(), "flex")) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        Iterator<C10351h> it2 = list.iterator();
        while (true) {
            boolean z2 = false;
            while (true) {
                if (!it2.hasNext()) {
                    return z2;
                }
                C10351h next = it2.next();
                if (TextUtils.equals(next.mo63563i().mo63363e().mo63484r(), "auto") && (p = next.mo63570p()) != null) {
                    Iterator<List<C10351h>> it3 = p.iterator();
                    int i = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            continue;
                            break;
                        }
                        List next2 = it3.next();
                        i++;
                        if (m30128b((List<C10351h>) next2)) {
                            if (i == next2.size()) {
                                z2 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private C10357c m30126b(List<C10351h> list, float f, float f2) {
        C10357c a = mo63580a(list);
        if (a != null && (a.f25701a != 0.0f || a.f25702b != 0.0f)) {
            return a;
        }
        C10357c c = m30129c(list, f, f2);
        m30124a(list, c);
        return c;
    }

    /* renamed from: c */
    private C10357c m30129c(List<C10351h> list, float f, float f2) {
        float f3;
        m30132d(list);
        C10357c cVar = new C10357c();
        ArrayList<C10351h> arrayList = new ArrayList<>();
        ArrayList<C10351h> arrayList2 = new ArrayList<>();
        for (C10351h next : list) {
            C10349f e = next.mo63563i().mo63363e();
            if (e.mo63375J() == 1 || e.mo63375J() == 2) {
                arrayList.add(next);
            }
            if (!(e.mo63375J() == 1 || e.mo63375J() == 2)) {
                arrayList2.add(next);
            }
        }
        for (C10351h c : arrayList) {
            mo63583c(c, f, f2);
        }
        if (arrayList2.size() <= 0) {
            return cVar;
        }
        ArrayList arrayList3 = new ArrayList();
        for (C10351h c2 : arrayList2) {
            arrayList3.add(Float.valueOf(mo63583c(c2, f, f2).f25701a));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            f3 = 0.0f;
            if (i >= arrayList2.size()) {
                break;
            }
            C10351h hVar = (C10351h) arrayList2.get(i);
            String r = hVar.mo63563i().mo63363e().mo63484r();
            float g = hVar.mo63560g();
            boolean equals = TextUtils.equals(r, "flex");
            if (TextUtils.equals(r, "auto")) {
                List<List<C10351h>> p = hVar.mo63570p();
                if (p != null && p.size() > 0) {
                    Iterator<List<C10351h>> it = p.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (m30128b(it.next())) {
                                equals = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                equals = false;
            }
            C10355a aVar = new C10355a();
            if (!equals) {
                g = ((Float) arrayList3.get(i)).floatValue();
            }
            aVar.f25693a = g;
            aVar.f25694b = !equals;
            if (equals) {
                f3 = ((Float) arrayList3.get(i)).floatValue();
            }
            aVar.f25695c = f3;
            arrayList4.add(aVar);
            i++;
        }
        m30123a((List<C10355a>) arrayList4, f, (List<C10351h>) arrayList2);
        List<C10355a> a = C10372k.m30200a(f, arrayList4);
        float f4 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f4 += a.get(i2).f25693a;
            if (((Float) arrayList3.get(i2)).floatValue() != a.get(i2).f25693a) {
                m30133d((C10351h) arrayList2.get(i2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            i3++;
            if (!m30127b((C10351h) it2.next())) {
                z = false;
                break;
            } else if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        if (z) {
            f3 = f2;
        }
        ArrayList<C10357c> arrayList5 = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            C10351h hVar2 = (C10351h) arrayList2.get(i4);
            C10357c c3 = mo63583c(hVar2, a.get(i4).f25693a, f2);
            if (!m30127b(hVar2)) {
                f3 = Math.max(f3, c3.f25702b);
            }
            arrayList5.add(c3);
        }
        ArrayList arrayList6 = new ArrayList();
        for (C10357c cVar2 : arrayList5) {
            arrayList6.add(Float.valueOf(cVar2.f25702b));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                C10351h hVar3 = (C10351h) arrayList2.get(i5);
                if (m30127b(hVar3) && ((Float) arrayList6.get(i5)).floatValue() != f3) {
                    m30133d(hVar3);
                    mo63583c(hVar3, a.get(i5).f25693a, f3);
                }
            }
        }
        cVar.f25701a = f4;
        cVar.f25702b = f3;
        return cVar;
    }

    /* renamed from: b */
    private boolean m30127b(C10351h hVar) {
        if (hVar == null) {
            return false;
        }
        if (TextUtils.equals(hVar.mo63563i().mo63363e().mo63481q(), "flex")) {
            return true;
        }
        return m30131c(hVar);
    }

    /* renamed from: c */
    private boolean m30131c(C10351h hVar) {
        List<List<C10351h>> p;
        if (!hVar.mo63571q() && TextUtils.equals(hVar.mo63563i().mo63363e().mo63481q(), "auto") && (p = hVar.mo63570p()) != null && p.size() > 0) {
            if (p.size() == 1) {
                for (C10351h b : p.get(0)) {
                    if (!m30127b(b)) {
                        return false;
                    }
                }
                return true;
            }
            for (List<C10351h> a : p) {
                if (m30125a(a, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m30125a(List<C10351h> list, boolean z) {
        boolean z2;
        Iterator<C10351h> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            String q = it.next().mo63563i().mo63363e().mo63481q();
            if (!TextUtils.equals(q, "flex") && (!z || !TextUtils.equals(q, "flex"))) {
            }
        }
        z2 = true;
        if (z2) {
            return true;
        }
        for (C10351h c : list) {
            if (m30131c(c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m30123a(List<C10355a> list, float f, List<C10351h> list2) {
        float f2 = 0.0f;
        for (C10355a next : list) {
            if (next.f25694b) {
                f2 += next.f25693a;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).f25694b && list2.get(i2).mo63573s()) {
                    i++;
                }
            }
            if (i > 0) {
                float ceil = (float) (Math.ceil((double) (((f2 - f) / ((float) i)) * 1000.0f)) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    C10355a aVar = list.get(i3);
                    if (aVar.f25694b && list2.get(i3).mo63573s()) {
                        aVar.f25693a -= ceil;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo63581a() {
        this.f25691c.clear();
        this.f25689a.clear();
        this.f25690b.clear();
    }

    /* renamed from: a */
    public C10357c mo63578a(C10351h hVar) {
        return this.f25689a.get(m30135e(hVar));
    }

    /* renamed from: a */
    public C10357c mo63580a(List<C10351h> list) {
        return this.f25690b.get(m30132d(list));
    }

    /* renamed from: d */
    private void m30133d(C10351h hVar) {
        this.f25689a.remove(m30135e(hVar));
        List<List<C10351h>> p = hVar.mo63570p();
        if (p != null && p.size() > 0) {
            for (List<C10351h> c : p) {
                m30130c(c);
            }
        }
    }

    /* renamed from: c */
    private void m30130c(List<C10351h> list) {
        if (list != null && list.size() > 0) {
            this.f25690b.remove(m30132d(list));
            for (C10351h d : list) {
                m30133d(d);
            }
        }
    }

    /* renamed from: e */
    private String m30135e(C10351h hVar) {
        return hVar.mo63547b();
    }

    /* renamed from: d */
    private String m30132d(List<C10351h> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String b = list.get(i).mo63547b();
            if (i < list.size() - 1) {
                sb.append(b);
                sb.append("-");
            } else {
                sb.append(b);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m30121a(C10351h hVar, C10357c cVar) {
        this.f25689a.put(m30135e(hVar), cVar);
    }

    /* renamed from: a */
    private void m30124a(List<C10351h> list, C10357c cVar) {
        this.f25690b.put(m30132d(list), cVar);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a$c */
    /* compiled from: ComputeRuler */
    static class C10357c {

        /* renamed from: a */
        float f25701a;

        /* renamed from: b */
        float f25702b;

        public C10357c() {
        }

        public C10357c(float f, float f2) {
            this.f25701a = f;
            this.f25702b = f2;
        }

        public String toString() {
            return "UnitSize{width=" + this.f25701a + ", height=" + this.f25702b + '}';
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a$b */
    /* compiled from: ComputeRuler */
    static class C10356b {

        /* renamed from: a */
        float f25696a;

        /* renamed from: b */
        int f25697b;

        /* renamed from: c */
        int f25698c;

        /* renamed from: d */
        double f25699d;

        /* renamed from: e */
        float f25700e;

        C10356b() {
        }

        /* renamed from: a */
        static JSONObject m30144a(C10356b bVar) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", (double) bVar.f25696a);
                jSONObject.put("letterSpacing", bVar.f25697b);
                jSONObject.put("lineHeight", bVar.f25699d);
                jSONObject.put("maxWidth", (double) bVar.f25700e);
                jSONObject.put("fontWeight", bVar.f25698c);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a$a */
    /* compiled from: ComputeRuler */
    static class C10355a implements Cloneable {

        /* renamed from: a */
        float f25693a;

        /* renamed from: b */
        boolean f25694b;

        /* renamed from: c */
        float f25695c;

        C10355a() {
        }

        public Object clone() {
            try {
                return (C10355a) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
