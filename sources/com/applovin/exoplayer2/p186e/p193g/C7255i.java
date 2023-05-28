package com.applovin.exoplayer2.p186e.p193g;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.common.base.Splitter;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.p204f.C7454c;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.g.i */
final class C7255i {

    /* renamed from: a */
    private static final Splitter f16223a = Splitter.m18959on(':');

    /* renamed from: b */
    private static final Splitter f16224b = Splitter.m18959on('*');

    /* renamed from: c */
    private final List<C7256a> f16225c = new ArrayList();

    /* renamed from: d */
    private int f16226d = 0;

    /* renamed from: e */
    private int f16227e;

    /* renamed from: com.applovin.exoplayer2.e.g.i$a */
    private static final class C7256a {

        /* renamed from: a */
        public final int f16228a;

        /* renamed from: b */
        public final long f16229b;

        /* renamed from: c */
        public final int f16230c;

        public C7256a(int i, long j, int i2) {
            this.f16228a = i;
            this.f16229b = j;
            this.f16230c = i2;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m19774a(java.lang.String r5) throws com.applovin.exoplayer2.C6809ai {
        /*
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1711564334: goto L_0x0034;
                case -1332107749: goto L_0x002a;
                case -1251387154: goto L_0x0020;
                case -830665521: goto L_0x0016;
                case 1760745220: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "Super_SlowMotion_BGM"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 2
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "Super_SlowMotion_Deflickering_On"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 4
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "Super_SlowMotion_Data"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 1
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "Super_SlowMotion_Edit_Data"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 3
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "SlowMotion_Data"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 0
            goto L_0x003f
        L_0x003e:
            r5 = -1
        L_0x003f:
            if (r5 == 0) goto L_0x005d
            if (r5 == r4) goto L_0x005a
            if (r5 == r3) goto L_0x0057
            if (r5 == r2) goto L_0x0054
            if (r5 != r1) goto L_0x004c
            r5 = 2820(0xb04, float:3.952E-42)
            return r5
        L_0x004c:
            r5 = 0
            java.lang.String r0 = "Invalid SEF name"
            com.applovin.exoplayer2.ai r5 = com.applovin.exoplayer2.C6809ai.m17540b(r0, r5)
            throw r5
        L_0x0054:
            r5 = 2819(0xb03, float:3.95E-42)
            return r5
        L_0x0057:
            r5 = 2817(0xb01, float:3.947E-42)
            return r5
        L_0x005a:
            r5 = 2816(0xb00, float:3.946E-42)
            return r5
        L_0x005d:
            r5 = 2192(0x890, float:3.072E-42)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p193g.C7255i.m19774a(java.lang.String):int");
    }

    /* renamed from: a */
    private static C7454c m19775a(C7772y yVar, int i) throws C6809ai {
        ArrayList arrayList = new ArrayList();
        List<String> splitToList = f16224b.splitToList(yVar.mo55081f(i));
        int i2 = 0;
        while (i2 < splitToList.size()) {
            List<String> splitToList2 = f16223a.splitToList(splitToList.get(i2));
            if (splitToList2.size() == 3) {
                try {
                    arrayList.add(new C7454c.C7456a(Long.parseLong(splitToList2.get(0)), Long.parseLong(splitToList2.get(1)), 1 << (Integer.parseInt(splitToList2.get(2)) - 1)));
                    i2++;
                } catch (NumberFormatException e) {
                    throw C6809ai.m17540b((String) null, e);
                }
            } else {
                throw C6809ai.m17540b((String) null, (Throwable) null);
            }
        }
        return new C7454c(arrayList);
    }

    /* renamed from: a */
    private void m19776a(C7279i iVar, C7352u uVar) throws IOException {
        C7772y yVar = new C7772y(8);
        iVar.mo53903b(yVar.mo55077d(), 0, 8);
        this.f16227e = yVar.mo55094r() + 8;
        if (yVar.mo55093q() != 1397048916) {
            uVar.f16774a = 0;
            return;
        }
        uVar.f16774a = iVar.mo53892c() - ((long) (this.f16227e - 12));
        this.f16226d = 2;
    }

    /* renamed from: a */
    private void m19777a(C7279i iVar, List<C7399a.C7401a> list) throws IOException {
        long c = iVar.mo53892c();
        int d = (int) ((iVar.mo53893d() - iVar.mo53892c()) - ((long) this.f16227e));
        C7772y yVar = new C7772y(d);
        iVar.mo53903b(yVar.mo55077d(), 0, d);
        for (int i = 0; i < this.f16225c.size(); i++) {
            C7256a aVar = this.f16225c.get(i);
            yVar.mo55076d((int) (aVar.f16229b - c));
            yVar.mo55079e(4);
            int r = yVar.mo55094r();
            int a = m19774a(yVar.mo55081f(r));
            int i2 = aVar.f16230c - (r + 8);
            if (a == 2192) {
                list.add(m19775a(yVar, i2));
            } else if (!(a == 2816 || a == 2817 || a == 2819 || a == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: b */
    private void m19778b(C7279i iVar, C7352u uVar) throws IOException {
        long j;
        long d = iVar.mo53893d();
        int i = (this.f16227e - 12) - 8;
        C7772y yVar = new C7772y(i);
        iVar.mo53903b(yVar.mo55077d(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            yVar.mo55079e(2);
            short l = yVar.mo55088l();
            if (l == 2192 || l == 2816 || l == 2817 || l == 2819 || l == 2820) {
                this.f16225c.add(new C7256a(l, (d - ((long) this.f16227e)) - ((long) yVar.mo55094r()), yVar.mo55094r()));
            } else {
                yVar.mo55079e(8);
            }
        }
        if (this.f16225c.isEmpty()) {
            j = 0;
        } else {
            this.f16226d = 3;
            j = this.f16225c.get(0).f16229b;
        }
        uVar.f16774a = j;
    }

    /* renamed from: a */
    public int mo53976a(C7279i iVar, C7352u uVar, List<C7399a.C7401a> list) throws IOException {
        int i = this.f16226d;
        long j = 0;
        if (i == 0) {
            long d = iVar.mo53893d();
            if (d != -1 && d >= 8) {
                j = d - 8;
            }
            uVar.f16774a = j;
            this.f16226d = 1;
        } else if (i == 1) {
            m19776a(iVar, uVar);
        } else if (i == 2) {
            m19778b(iVar, uVar);
        } else if (i == 3) {
            m19777a(iVar, list);
            uVar.f16774a = 0;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    /* renamed from: a */
    public void mo53977a() {
        this.f16225c.clear();
        this.f16226d = 0;
    }
}
