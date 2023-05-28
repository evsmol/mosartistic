package com.bytedance.sdk.component.adexpress.dynamic.p304c;

import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10344b;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10349f;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10352i;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10354a;
import com.bytedance.sdk.component.utils.C10638l;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.e */
/* compiled from: DynamicCanvas */
public class C10361e {

    /* renamed from: a */
    public C10344b f25705a;

    /* renamed from: b */
    protected C10354a f25706b = new C10354a();

    /* renamed from: c */
    private C10351h f25707c;

    /* renamed from: d */
    private C10362a f25708d;

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.e$a */
    /* compiled from: DynamicCanvas */
    static class C10362a {

        /* renamed from: a */
        float f25709a;

        /* renamed from: b */
        float f25710b;

        /* renamed from: c */
        float f25711c;

        C10362a() {
        }
    }

    /* renamed from: a */
    public void mo63594a(C10362a aVar) {
        this.f25708d = aVar;
    }

    /* renamed from: a */
    public void mo63591a() {
        this.f25706b.mo63581a();
    }

    /* renamed from: a */
    public void mo63593a(C10351h hVar, float f, float f2) {
        if (hVar != null) {
            this.f25707c = hVar;
        }
        C10351h hVar2 = this.f25707c;
        float g = hVar2.mo63560g();
        float h = hVar2.mo63562h();
        float f3 = TextUtils.equals(hVar2.mo63563i().mo63363e().mo63481q(), "fixed") ? h : 65536.0f;
        this.f25706b.mo63581a();
        this.f25706b.mo63583c(hVar2, g, f3);
        C10354a.C10357c a = this.f25706b.mo63578a(hVar2);
        C10344b bVar = new C10344b();
        bVar.f25574a = f;
        bVar.f25575b = f2;
        if (a != null) {
            g = a.f25701a;
        }
        bVar.f25576c = g;
        if (a != null) {
            h = a.f25702b;
        }
        bVar.f25577d = h;
        bVar.f25578e = "root";
        bVar.f25582i = 1280.0f;
        bVar.f25579f = hVar2;
        bVar.f25579f.mo63553c(bVar.f25574a);
        bVar.f25579f.mo63555d(bVar.f25575b);
        bVar.f25579f.mo63557e(bVar.f25576c);
        bVar.f25579f.mo63559f(bVar.f25577d);
        C10344b a2 = mo63590a(bVar, 0.0f);
        this.f25705a = a2;
        mo63592a(a2);
    }

    /* renamed from: a */
    public void mo63592a(C10344b bVar) {
        if (bVar != null) {
            C10638l.m31235b("DynamicCanvas", "native parser: type = " + bVar.f25579f.mo63563i().mo63357b() + "; width = " + bVar.f25576c + "; height = " + bVar.f25577d + "; x = " + bVar.f25574a + "; y = " + bVar.f25575b);
            List<List<C10344b>> list = bVar.f25580g;
            if (list != null && list.size() > 0) {
                for (List<C10344b> next : list) {
                    if (next != null && next.size() > 0) {
                        for (C10344b a : next) {
                            mo63592a(a);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0205  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.adexpress.dynamic.p303b.C10344b mo63590a(com.bytedance.sdk.component.adexpress.dynamic.p303b.C10344b r37, float r38) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            com.bytedance.sdk.component.adexpress.dynamic.b.h r2 = r1.f25579f
            if (r2 != 0) goto L_0x0009
            return r1
        L_0x0009:
            r2.mo63572r()
            java.util.List r3 = r2.mo63570p()
            if (r3 == 0) goto L_0x0409
            int r4 = r3.size()
            if (r4 > 0) goto L_0x001a
            goto L_0x0409
        L_0x001a:
            com.bytedance.sdk.component.adexpress.dynamic.b.e r4 = r2.mo63563i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r4 = r4.mo63363e()
            float r5 = r4.mo63451i()
            float r6 = r4.mo63446h()
            float r7 = r4.mo63436f()
            float r8 = r4.mo63441g()
            float r9 = r4.mo63426d()
            java.lang.String r10 = r4.mo63496w()
            java.lang.String r11 = r4.mo63498x()
            float r12 = r1.f25574a
            float r12 = r12 + r8
            float r13 = r1.f25575b
            float r13 = r13 + r5
            float r14 = r1.f25576c
            float r14 = r14 - r8
            float r14 = r14 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r6
            float r14 = r14 - r9
            float r8 = r1.f25577d
            float r8 = r8 - r5
            float r8 = r8 - r7
            float r8 = r8 - r9
            com.bytedance.sdk.component.adexpress.dynamic.b.i r5 = new com.bytedance.sdk.component.adexpress.dynamic.b.i
            r5.<init>(r12, r13)
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r7 = r1.f25580g
            if (r7 != 0) goto L_0x0062
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1.f25580g = r7
        L_0x0062:
            java.util.Iterator r7 = r3.iterator()
            r13 = 0
        L_0x0067:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L_0x007f
            java.lang.Object r15 = r7.next()
            java.util.List r15 = (java.util.List) r15
            com.bytedance.sdk.component.adexpress.dynamic.c.a r9 = r0.f25706b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r9 = r9.mo63580a((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h>) r15)
            if (r9 == 0) goto L_0x0067
            float r9 = r9.f25702b
            float r13 = r13 + r9
            goto L_0x0067
        L_0x007f:
            java.lang.String r7 = "space-between"
            java.lang.String r9 = "space-around"
            java.lang.String r15 = "flex-end"
            java.lang.String r6 = "center"
            r17 = r12
            r12 = 1
            int r18 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r18 >= 0) goto L_0x00d0
            boolean r18 = android.text.TextUtils.equals(r11, r6)
            if (r18 == 0) goto L_0x0099
            float r8 = r8 - r13
            r11 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r11
            goto L_0x00d1
        L_0x0099:
            boolean r18 = android.text.TextUtils.equals(r11, r15)
            if (r18 == 0) goto L_0x00a1
            float r8 = r8 - r13
            goto L_0x00d1
        L_0x00a1:
            boolean r18 = android.text.TextUtils.equals(r11, r9)
            if (r18 == 0) goto L_0x00b5
            float r8 = r8 - r13
            int r11 = r3.size()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r8 = r8 / r11
            float r8 = com.bytedance.sdk.component.adexpress.dynamic.p304c.C10372k.m30199a(r8)
            r11 = r8
            goto L_0x00d2
        L_0x00b5:
            boolean r11 = android.text.TextUtils.equals(r11, r7)
            if (r11 == 0) goto L_0x00d0
            int r11 = r3.size()
            if (r11 <= r12) goto L_0x00d0
            float r8 = r8 - r13
            int r11 = r3.size()
            int r11 = r11 - r12
            float r11 = (float) r11
            float r8 = r8 / r11
            float r8 = com.bytedance.sdk.component.adexpress.dynamic.p304c.C10372k.m30199a(r8)
            r11 = r8
            r8 = 0
            goto L_0x00d2
        L_0x00d0:
            r8 = 0
        L_0x00d1:
            r11 = 0
        L_0x00d2:
            float r13 = r5.f25688b
            float r13 = r13 + r8
            r5.f25688b = r13
            r13 = r38
            r8 = 0
        L_0x00da:
            int r12 = r3.size()
            if (r8 >= r12) goto L_0x0407
            java.lang.Object r12 = r3.get(r8)
            java.util.List r12 = (java.util.List) r12
            int r8 = r8 + 1
            r20 = r3
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r3 = r1.f25580g
            int r3 = r3.size()
            if (r8 < r3) goto L_0x011b
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r3 = r1.f25580g
            int r3 = r3.size()
            int r3 = r8 - r3
            r19 = 1
            int r3 = r3 + 1
            r38 = r13
            r13 = 0
        L_0x0101:
            if (r13 >= r3) goto L_0x0118
            r21 = r3
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r3 = r1.f25580g
            r22 = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r3.add(r11)
            int r13 = r13 + 1
            r3 = r21
            r11 = r22
            goto L_0x0101
        L_0x0118:
            r22 = r11
            goto L_0x011f
        L_0x011b:
            r22 = r11
            r38 = r13
        L_0x011f:
            java.util.Iterator r3 = r12.iterator()
            r11 = 0
        L_0x0124:
            boolean r13 = r3.hasNext()
            r21 = r4
            if (r13 == 0) goto L_0x0165
            java.lang.Object r13 = r3.next()
            com.bytedance.sdk.component.adexpress.dynamic.b.h r13 = (com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r13
            com.bytedance.sdk.component.adexpress.dynamic.b.e r23 = r13.mo63563i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r23 = r23.mo63363e()
            java.lang.String r4 = r23.mo63484r()
            r24 = r3
            int r3 = r23.mo63375J()
            java.lang.String r1 = "flex"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 != 0) goto L_0x015e
            r1 = 1
            if (r3 == r1) goto L_0x015e
            r1 = 2
            if (r3 != r1) goto L_0x0153
            goto L_0x015e
        L_0x0153:
            com.bytedance.sdk.component.adexpress.dynamic.c.a r1 = r0.f25706b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r1 = r1.mo63578a((com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r13)
            if (r1 == 0) goto L_0x015e
            float r1 = r1.f25701a
            float r11 = r11 + r1
        L_0x015e:
            r1 = r37
            r4 = r21
            r3 = r24
            goto L_0x0124
        L_0x0165:
            float r1 = r14 - r11
            r3 = 0
            float r1 = java.lang.Math.max(r1, r3)
            java.util.Iterator r4 = r12.iterator()
            r11 = 0
        L_0x0171:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x01a5
            java.lang.Object r13 = r4.next()
            com.bytedance.sdk.component.adexpress.dynamic.b.h r13 = (com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r13
            com.bytedance.sdk.component.adexpress.dynamic.b.e r16 = r13.mo63563i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r16 = r16.mo63363e()
            int r3 = r16.mo63375J()
            r24 = r4
            r4 = 1
            if (r3 == r4) goto L_0x01a1
            int r3 = r16.mo63375J()
            r4 = 2
            if (r3 != r4) goto L_0x0196
            goto L_0x01a1
        L_0x0196:
            com.bytedance.sdk.component.adexpress.dynamic.c.a r3 = r0.f25706b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = r3.mo63578a((com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r13)
            if (r3 == 0) goto L_0x01a1
            float r3 = r3.f25701a
            float r11 = r11 + r3
        L_0x01a1:
            r4 = r24
            r3 = 0
            goto L_0x0171
        L_0x01a5:
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x01f3
            boolean r3 = android.text.TextUtils.equals(r10, r6)
            if (r3 == 0) goto L_0x01b5
            float r3 = r14 - r11
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            goto L_0x01f4
        L_0x01b5:
            boolean r3 = android.text.TextUtils.equals(r10, r15)
            if (r3 == 0) goto L_0x01be
            float r3 = r14 - r11
            goto L_0x01f4
        L_0x01be:
            boolean r3 = android.text.TextUtils.equals(r10, r9)
            if (r3 == 0) goto L_0x01d4
            float r3 = r14 - r11
            int r4 = r12.size()
            r13 = 1
            int r4 = r4 + r13
            float r4 = (float) r4
            float r3 = r3 / r4
            float r3 = com.bytedance.sdk.component.adexpress.dynamic.p304c.C10372k.m30199a(r3)
            r4 = r3
            goto L_0x01f5
        L_0x01d4:
            r13 = 1
            boolean r3 = android.text.TextUtils.equals(r10, r7)
            if (r3 == 0) goto L_0x01f3
            int r3 = r12.size()
            if (r3 <= r13) goto L_0x01f3
            float r3 = r14 - r11
            int r4 = r12.size()
            float r4 = (float) r4
            r11 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r11
            float r3 = r3 / r4
            float r3 = com.bytedance.sdk.component.adexpress.dynamic.p304c.C10372k.m30199a(r3)
            r4 = r3
            r3 = 0
            goto L_0x01f5
        L_0x01f3:
            r3 = 0
        L_0x01f4:
            r4 = 0
        L_0x01f5:
            float r11 = r5.f25687a
            float r11 = r11 + r3
            r5.f25687a = r11
            java.util.Iterator r3 = r12.iterator()
            r11 = 0
        L_0x01ff:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x0247
            java.lang.Object r13 = r3.next()
            com.bytedance.sdk.component.adexpress.dynamic.b.h r13 = (com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r13
            r16 = r3
            com.bytedance.sdk.component.adexpress.dynamic.c.a r3 = r0.f25706b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = r3.mo63578a((com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r13)
            if (r3 == 0) goto L_0x021e
            com.bytedance.sdk.component.adexpress.dynamic.c.a r3 = r0.f25706b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = r3.mo63578a((com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r13)
            float r3 = r3.f25702b
            goto L_0x021f
        L_0x021e:
            r3 = 0
        L_0x021f:
            com.bytedance.sdk.component.adexpress.dynamic.b.e r13 = r13.mo63563i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r13 = r13.mo63363e()
            r24 = r3
            int r3 = r13.mo63375J()
            r25 = r7
            r7 = 1
            if (r3 == r7) goto L_0x023d
            int r3 = r13.mo63375J()
            r7 = 2
            if (r3 != r7) goto L_0x023a
            goto L_0x023d
        L_0x023a:
            r3 = r24
            goto L_0x023e
        L_0x023d:
            r3 = 0
        L_0x023e:
            float r11 = java.lang.Math.max(r11, r3)
            r3 = r16
            r7 = r25
            goto L_0x01ff
        L_0x0247:
            r25 = r7
            java.util.Iterator r3 = r12.iterator()
            r13 = r38
        L_0x024f:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x03dd
            java.lang.Object r7 = r3.next()
            com.bytedance.sdk.component.adexpress.dynamic.b.h r7 = (com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r7
            r38 = r3
            com.bytedance.sdk.component.adexpress.dynamic.c.a r3 = r0.f25706b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = r3.mo63578a((com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r7)
            com.bytedance.sdk.component.adexpress.dynamic.b.e r16 = r7.mo63563i()
            r24 = r9
            com.bytedance.sdk.component.adexpress.dynamic.b.f r9 = r16.mo63363e()
            r16 = r10
            int r10 = r9.mo63366A()
            float r10 = (float) r10
            r26 = r13
            int r13 = r9.mo63369D()
            float r13 = (float) r13
            r27 = r14
            int r14 = r9.mo63367B()
            float r14 = (float) r14
            r28 = r4
            int r4 = r9.mo63368C()
            float r4 = (float) r4
            r29 = r5
            if (r3 != 0) goto L_0x028f
            r5 = 0
            goto L_0x0291
        L_0x028f:
            float r5 = r3.f25701a
        L_0x0291:
            if (r3 != 0) goto L_0x0297
            r30 = r12
            r3 = 0
            goto L_0x029b
        L_0x0297:
            float r3 = r3.f25702b
            r30 = r12
        L_0x029b:
            java.lang.String r12 = r2.mo63547b()
            r31 = r2
            java.lang.String r2 = "root"
            boolean r2 = android.text.TextUtils.equals(r12, r2)
            if (r2 == 0) goto L_0x02ab
            float r2 = (float) r8
            goto L_0x02ad
        L_0x02ab:
            r2 = r26
        L_0x02ad:
            int r12 = r9.mo63375J()
            r32 = r8
            r8 = 1
            if (r12 != r8) goto L_0x02c5
            float r8 = r5 - r13
            float r8 = r8 - r4
            float r12 = r3 - r10
            float r12 = r12 - r14
            r26 = r2
            r2 = r37
            com.bytedance.sdk.component.adexpress.dynamic.b.i r8 = r0.m30152a(r2, r9, r8, r12)
            goto L_0x02cb
        L_0x02c5:
            r26 = r2
            r2 = r37
            r8 = r29
        L_0x02cb:
            int r12 = r9.mo63375J()
            r33 = r8
            r8 = 2
            if (r12 != r8) goto L_0x02f1
            com.bytedance.sdk.component.adexpress.dynamic.c.a r8 = r0.f25706b
            com.bytedance.sdk.component.adexpress.dynamic.b.h r12 = r0.f25707c
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r8 = r8.mo63578a((com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h) r12)
            float r12 = r5 - r13
            float r12 = r12 - r4
            float r33 = r3 - r10
            r34 = r1
            float r1 = r33 - r14
            r35 = r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r7 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r7.<init>(r12, r1)
            com.bytedance.sdk.component.adexpress.dynamic.b.i r8 = r0.m30153a((com.bytedance.sdk.component.adexpress.dynamic.p303b.C10349f) r9, (com.bytedance.sdk.component.adexpress.dynamic.p304c.C10354a.C10357c) r8, (com.bytedance.sdk.component.adexpress.dynamic.p304c.C10354a.C10357c) r7)
            goto L_0x02f7
        L_0x02f1:
            r34 = r1
            r35 = r7
            r8 = r33
        L_0x02f7:
            java.lang.String r1 = r21.mo63390Y()
            int r7 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0338
            java.lang.String r7 = "flex-start"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 != 0) goto L_0x0338
            int r12 = r1.hashCode()
            r7 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r12 == r7) goto L_0x031e
            r7 = 1742952711(0x67e35907, float:2.1472389E24)
            if (r12 == r7) goto L_0x0316
            goto L_0x0326
        L_0x0316:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x0326
            r1 = 1
            goto L_0x0327
        L_0x031e:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0326
            r1 = 0
            goto L_0x0327
        L_0x0326:
            r1 = -1
        L_0x0327:
            if (r1 == 0) goto L_0x0332
            r7 = 1
            if (r1 == r7) goto L_0x032d
            goto L_0x0338
        L_0x032d:
            float r1 = r11 - r3
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x033b
        L_0x0332:
            float r1 = r11 - r3
            r7 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r7
            goto L_0x033b
        L_0x0338:
            r7 = 1073741824(0x40000000, float:2.0)
            r1 = 0
        L_0x033b:
            com.bytedance.sdk.component.adexpress.dynamic.b.b r12 = new com.bytedance.sdk.component.adexpress.dynamic.b.b
            r12.<init>()
            float r7 = r8.f25687a
            float r7 = r7 + r4
            r12.f25574a = r7
            float r7 = r8.f25688b
            float r7 = r7 + r10
            float r7 = r7 + r1
            r12.f25575b = r7
            float r1 = r5 - r13
            float r1 = r1 - r4
            r12.f25576c = r1
            float r3 = r3 - r10
            float r3 = r3 - r14
            r12.f25577d = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r2.f25578e
            r1.append(r3)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r3 = r35.mo63547b()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r12.f25578e = r1
            r12.f25581h = r2
            r7 = r35
            r12.f25579f = r7
            r1 = r34
            r12.f25582i = r1
            r3 = r30
            r12.f25583j = r3
            com.bytedance.sdk.component.adexpress.dynamic.b.h r4 = r12.f25579f
            float r7 = r12.f25574a
            r4.mo63553c(r7)
            com.bytedance.sdk.component.adexpress.dynamic.b.h r4 = r12.f25579f
            float r7 = r12.f25575b
            r4.mo63555d(r7)
            com.bytedance.sdk.component.adexpress.dynamic.b.h r4 = r12.f25579f
            float r7 = r12.f25576c
            r4.mo63557e(r7)
            com.bytedance.sdk.component.adexpress.dynamic.b.h r4 = r12.f25579f
            float r7 = r12.f25577d
            r4.mo63559f(r7)
            r4 = r26
            com.bytedance.sdk.component.adexpress.dynamic.b.b r7 = r0.mo63590a(r12, r4)
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r8 = r2.f25580g
            r10 = r32
            java.lang.Object r8 = r8.get(r10)
            java.util.List r8 = (java.util.List) r8
            r8.add(r7)
            int r7 = r9.mo63375J()
            r8 = 1
            if (r7 == r8) goto L_0x03c8
            int r7 = r9.mo63375J()
            r9 = 2
            if (r7 == r9) goto L_0x03c5
            r7 = r29
            float r12 = r7.f25687a
            float r5 = r5 + r28
            float r12 = r12 + r5
            r7.f25687a = r12
            goto L_0x03cb
        L_0x03c5:
            r7 = r29
            goto L_0x03cb
        L_0x03c8:
            r7 = r29
            r9 = 2
        L_0x03cb:
            r12 = r3
            r13 = r4
            r5 = r7
            r8 = r10
            r10 = r16
            r9 = r24
            r14 = r27
            r4 = r28
            r2 = r31
            r3 = r38
            goto L_0x024f
        L_0x03dd:
            r31 = r2
            r7 = r5
            r24 = r9
            r16 = r10
            r26 = r13
            r27 = r14
            r12 = r17
            r2 = r37
            r10 = r8
            r8 = 1
            r7.f25687a = r12
            float r1 = r7.f25688b
            float r11 = r11 + r22
            float r1 = r1 + r11
            r7.f25688b = r1
            r1 = r2
            r8 = r10
            r10 = r16
            r3 = r20
            r4 = r21
            r11 = r22
            r7 = r25
            r2 = r31
            goto L_0x00da
        L_0x0407:
            r2 = r1
            return r2
        L_0x0409:
            r2 = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p304c.C10361e.mo63590a(com.bytedance.sdk.component.adexpress.dynamic.b.b, float):com.bytedance.sdk.component.adexpress.dynamic.b.b");
    }

    /* renamed from: a */
    private C10352i m30153a(C10349f fVar, C10354a.C10357c cVar, C10354a.C10357c cVar2) {
        float U = (float) fVar.mo63386U();
        float W = (float) fVar.mo63388W();
        float V = (float) fVar.mo63387V();
        float X = (float) fVar.mo63389X();
        boolean L = fVar.mo63377L();
        boolean M = fVar.mo63378M();
        boolean N = fVar.mo63379N();
        boolean O = fVar.mo63380O();
        if (!L) {
            if (M) {
                U = ((this.f25708d.f25709a != 0.0f ? this.f25708d.f25709a : cVar.f25701a) - V) - cVar2.f25701a;
            } else {
                U = 0.0f;
            }
        }
        if (!N) {
            if (O) {
                W = ((this.f25708d.f25710b != 0.0f ? this.f25708d.f25710b : cVar.f25702b) - X) - cVar2.f25702b;
            } else {
                W = 0.0f;
            }
        }
        return new C10352i(U, W);
    }

    /* renamed from: a */
    private C10352i m30152a(C10344b bVar, C10349f fVar, float f, float f2) {
        float f3;
        float f4;
        C10344b bVar2 = bVar;
        float f5 = bVar2.f25574a;
        float f6 = bVar2.f25575b;
        float U = (float) fVar.mo63386U();
        float W = (float) fVar.mo63388W();
        float V = (float) fVar.mo63387V();
        float X = (float) fVar.mo63389X();
        boolean L = fVar.mo63377L();
        boolean M = fVar.mo63378M();
        boolean N = fVar.mo63379N();
        boolean O = fVar.mo63380O();
        String K = fVar.mo63376K();
        float f7 = bVar2.f25576c;
        float f8 = bVar2.f25577d;
        if (TextUtils.equals(K, BuildConfig.ADAPTER_VERSION)) {
            if (L) {
                f5 = bVar2.f25574a + U;
            } else if (M) {
                f5 = ((bVar2.f25574a + f7) - V) - f;
            }
            if (N) {
                f4 = bVar2.f25575b;
            } else {
                if (O) {
                    f3 = bVar2.f25575b;
                    f6 = ((f3 + f8) - X) - f2;
                }
                return new C10352i(f5, f6);
            }
        } else {
            if (TextUtils.equals(K, "1")) {
                f5 = bVar2.f25574a + ((f7 - f) / 2.0f);
                if (N) {
                    f4 = bVar2.f25575b;
                } else if (O) {
                    f3 = bVar2.f25575b;
                    f6 = ((f3 + f8) - X) - f2;
                }
            } else if (TextUtils.equals(K, "2")) {
                f6 = bVar2.f25575b + ((f8 - f2) / 2.0f);
                if (L) {
                    f5 = bVar2.f25574a + U;
                } else if (M) {
                    f5 = ((bVar2.f25574a + f7) - V) - f;
                }
            } else if (TextUtils.equals(K, "3")) {
                f5 = bVar2.f25574a + ((f7 - f) / 2.0f);
                f6 = bVar2.f25575b + ((f8 - f2) / 2.0f);
            }
            return new C10352i(f5, f6);
        }
        f6 = f4 + W;
        return new C10352i(f5, f6);
    }
}
