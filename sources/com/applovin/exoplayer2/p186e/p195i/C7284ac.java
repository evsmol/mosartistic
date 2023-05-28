package com.applovin.exoplayer2.p186e.p195i;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.i.ac */
public final class C7284ac implements C7262h {

    /* renamed from: a */
    public static final C7340l f16358a = $$Lambda$ac$HmjoHnpD5QxxORvHZild8fFPM.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f16359b;

    /* renamed from: c */
    private final int f16360c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<C7726ag> f16361d;

    /* renamed from: e */
    private final C7772y f16362e;

    /* renamed from: f */
    private final SparseIntArray f16363f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C7287ad.C7290c f16364g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseArray<C7287ad> f16365h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final SparseBooleanArray f16366i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final SparseBooleanArray f16367j;

    /* renamed from: k */
    private final C7283ab f16368k;

    /* renamed from: l */
    private C7281aa f16369l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C7329j f16370m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f16371n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f16372o;

    /* renamed from: p */
    private boolean f16373p;

    /* renamed from: q */
    private boolean f16374q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C7287ad f16375r;

    /* renamed from: s */
    private int f16376s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f16377t;

    /* renamed from: com.applovin.exoplayer2.e.i.ac$a */
    private class C7285a implements C7326x {

        /* renamed from: b */
        private final C7771x f16379b = new C7771x(new byte[4]);

        public C7285a() {
        }

        /* renamed from: a */
        public void mo54017a(C7726ag agVar, C7329j jVar, C7287ad.C7291d dVar) {
        }

        /* renamed from: a */
        public void mo54018a(C7772y yVar) {
            if (yVar.mo55084h() == 0 && (yVar.mo55084h() & 128) != 0) {
                yVar.mo55079e(6);
                int a = yVar.mo55064a() / 4;
                for (int i = 0; i < a; i++) {
                    yVar.mo55068a(this.f16379b, 4);
                    int c = this.f16379b.mo55054c(16);
                    this.f16379b.mo55051b(3);
                    if (c == 0) {
                        this.f16379b.mo55051b(13);
                    } else {
                        int c2 = this.f16379b.mo55054c(13);
                        if (C7284ac.this.f16365h.get(c2) == null) {
                            C7284ac.this.f16365h.put(c2, new C7327y(new C7286b(c2)));
                            C7284ac.m19921b(C7284ac.this);
                        }
                    }
                }
                if (C7284ac.this.f16359b != 2) {
                    C7284ac.this.f16365h.remove(0);
                }
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.i.ac$b */
    private class C7286b implements C7326x {

        /* renamed from: b */
        private final C7771x f16381b = new C7771x(new byte[5]);

        /* renamed from: c */
        private final SparseArray<C7287ad> f16382c = new SparseArray<>();

        /* renamed from: d */
        private final SparseIntArray f16383d = new SparseIntArray();

        /* renamed from: e */
        private final int f16384e;

        public C7286b(int i) {
            this.f16384e = i;
        }

        /* renamed from: a */
        private C7287ad.C7289b m19942a(C7772y yVar, int i) {
            int c = yVar.mo55074c();
            int i2 = i + c;
            String str = null;
            ArrayList arrayList = null;
            int i3 = -1;
            while (yVar.mo55074c() < i2) {
                int h = yVar.mo55084h();
                int c2 = yVar.mo55074c() + yVar.mo55084h();
                if (c2 > i2) {
                    break;
                }
                if (h == 5) {
                    long o = yVar.mo55091o();
                    if (o != 1094921523) {
                        if (o != 1161904947) {
                            if (o != 1094921524) {
                                if (o == 1212503619) {
                                    i3 = 36;
                                }
                                yVar.mo55079e(c2 - yVar.mo55074c());
                            }
                        }
                        i3 = 135;
                        yVar.mo55079e(c2 - yVar.mo55074c());
                    }
                    i3 = 129;
                    yVar.mo55079e(c2 - yVar.mo55074c());
                } else {
                    if (h != 106) {
                        if (h != 122) {
                            if (h == 127) {
                                if (yVar.mo55084h() != 21) {
                                }
                            } else if (h == 123) {
                                i3 = 138;
                            } else if (h == 10) {
                                str = yVar.mo55081f(3).trim();
                            } else if (h == 89) {
                                arrayList = new ArrayList();
                                while (yVar.mo55074c() < c2) {
                                    String trim = yVar.mo55081f(3).trim();
                                    int h2 = yVar.mo55084h();
                                    byte[] bArr = new byte[4];
                                    yVar.mo55071a(bArr, 0, 4);
                                    arrayList.add(new C7287ad.C7288a(trim, h2, bArr));
                                }
                                i3 = 89;
                            } else if (h == 111) {
                                i3 = 257;
                            }
                            yVar.mo55079e(c2 - yVar.mo55074c());
                        }
                        i3 = 135;
                        yVar.mo55079e(c2 - yVar.mo55074c());
                    }
                    i3 = 129;
                    yVar.mo55079e(c2 - yVar.mo55074c());
                }
                i3 = 172;
                yVar.mo55079e(c2 - yVar.mo55074c());
            }
            yVar.mo55076d(i2);
            return new C7287ad.C7289b(i3, str, arrayList, Arrays.copyOfRange(yVar.mo55077d(), c, i2));
        }

        /* renamed from: a */
        public void mo54017a(C7726ag agVar, C7329j jVar, C7287ad.C7291d dVar) {
        }

        /* renamed from: a */
        public void mo54018a(C7772y yVar) {
            C7726ag agVar;
            C7772y yVar2 = yVar;
            if (yVar.mo55084h() == 2) {
                if (C7284ac.this.f16359b == 1 || C7284ac.this.f16359b == 2 || C7284ac.this.f16371n == 1) {
                    agVar = (C7726ag) C7284ac.this.f16361d.get(0);
                } else {
                    agVar = new C7726ag(((C7726ag) C7284ac.this.f16361d.get(0)).mo54986a());
                    C7284ac.this.f16361d.add(agVar);
                }
                if ((yVar.mo55084h() & 128) != 0) {
                    yVar2.mo55079e(1);
                    int i = yVar.mo55085i();
                    int i2 = 3;
                    yVar2.mo55079e(3);
                    yVar2.mo55068a(this.f16381b, 2);
                    this.f16381b.mo55051b(3);
                    int i3 = 13;
                    int unused = C7284ac.this.f16377t = this.f16381b.mo55054c(13);
                    yVar2.mo55068a(this.f16381b, 2);
                    int i4 = 4;
                    this.f16381b.mo55051b(4);
                    yVar2.mo55079e(this.f16381b.mo55054c(12));
                    if (C7284ac.this.f16359b == 2 && C7284ac.this.f16375r == null) {
                        C7287ad.C7289b bVar = new C7287ad.C7289b(21, (String) null, (List<C7287ad.C7288a>) null, C7728ai.f18254f);
                        C7284ac acVar = C7284ac.this;
                        C7287ad unused2 = acVar.f16375r = acVar.f16364g.mo54023a(21, bVar);
                        if (C7284ac.this.f16375r != null) {
                            C7284ac.this.f16375r.mo54020a(agVar, C7284ac.this.f16370m, new C7287ad.C7291d(i, 21, 8192));
                        }
                    }
                    this.f16382c.clear();
                    this.f16383d.clear();
                    int a = yVar.mo55064a();
                    while (a > 0) {
                        yVar2.mo55068a(this.f16381b, 5);
                        int c = this.f16381b.mo55054c(8);
                        this.f16381b.mo55051b(i2);
                        int c2 = this.f16381b.mo55054c(i3);
                        this.f16381b.mo55051b(i4);
                        int c3 = this.f16381b.mo55054c(12);
                        C7287ad.C7289b a2 = m19942a(yVar2, c3);
                        if (c == 6 || c == 5) {
                            c = a2.f16388a;
                        }
                        a -= c3 + 5;
                        int i5 = C7284ac.this.f16359b == 2 ? c : c2;
                        if (!C7284ac.this.f16366i.get(i5)) {
                            C7287ad f = (C7284ac.this.f16359b == 2 && c == 21) ? C7284ac.this.f16375r : C7284ac.this.f16364g.mo54023a(c, a2);
                            if (C7284ac.this.f16359b != 2 || c2 < this.f16383d.get(i5, 8192)) {
                                this.f16383d.put(i5, c2);
                                this.f16382c.put(i5, f);
                            }
                        }
                        i2 = 3;
                        i4 = 4;
                        i3 = 13;
                    }
                    int size = this.f16383d.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        int keyAt = this.f16383d.keyAt(i6);
                        int valueAt = this.f16383d.valueAt(i6);
                        C7284ac.this.f16366i.put(keyAt, true);
                        C7284ac.this.f16367j.put(valueAt, true);
                        C7287ad valueAt2 = this.f16382c.valueAt(i6);
                        if (valueAt2 != null) {
                            if (valueAt2 != C7284ac.this.f16375r) {
                                valueAt2.mo54020a(agVar, C7284ac.this.f16370m, new C7287ad.C7291d(i, keyAt, 8192));
                            }
                            C7284ac.this.f16365h.put(valueAt, valueAt2);
                        }
                    }
                    if (C7284ac.this.f16359b != 2) {
                        C7284ac.this.f16365h.remove(this.f16384e);
                        C7284ac acVar2 = C7284ac.this;
                        int unused3 = acVar2.f16371n = acVar2.f16359b == 1 ? 0 : C7284ac.this.f16371n - 1;
                        if (C7284ac.this.f16371n == 0) {
                            C7284ac.this.f16370m.mo53895a();
                        } else {
                            return;
                        }
                    } else if (!C7284ac.this.f16372o) {
                        C7284ac.this.f16370m.mo53895a();
                        int unused4 = C7284ac.this.f16371n = 0;
                    } else {
                        return;
                    }
                    boolean unused5 = C7284ac.this.f16372o = true;
                }
            }
        }
    }

    public C7284ac() {
        this(0);
    }

    public C7284ac(int i) {
        this(1, i, 112800);
    }

    public C7284ac(int i, int i2, int i3) {
        this(i, new C7726ag(0), new C7299g(i2), i3);
    }

    public C7284ac(int i, C7726ag agVar, C7287ad.C7290c cVar, int i2) {
        this.f16364g = (C7287ad.C7290c) C7717a.m22120b(cVar);
        this.f16360c = i2;
        this.f16359b = i;
        if (i == 1 || i == 2) {
            this.f16361d = Collections.singletonList(agVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f16361d = arrayList;
            arrayList.add(agVar);
        }
        this.f16362e = new C7772y(new byte[9400], 0);
        this.f16366i = new SparseBooleanArray();
        this.f16367j = new SparseBooleanArray();
        this.f16365h = new SparseArray<>();
        this.f16363f = new SparseIntArray();
        this.f16368k = new C7283ab(i2);
        this.f16370m = C7329j.f16703a;
        this.f16377t = -1;
        m19923b();
    }

    /* renamed from: a */
    private int m19914a() throws C6809ai {
        int c = this.f16362e.mo55074c();
        int b = this.f16362e.mo55072b();
        int a = C7292ae.m19954a(this.f16362e.mo55077d(), c, b);
        this.f16362e.mo55076d(a);
        int i = a + 188;
        if (i > b) {
            int i2 = this.f16376s + (a - c);
            this.f16376s = i2;
            if (this.f16359b == 2 && i2 > 376) {
                throw C6809ai.m17540b("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
            }
        } else {
            this.f16376s = 0;
        }
        return i;
    }

    /* renamed from: a */
    private void m19918a(long j) {
        C7353v vVar;
        C7329j jVar;
        if (!this.f16373p) {
            this.f16373p = true;
            if (this.f16368k.mo54015b() != -9223372036854775807L) {
                C7281aa aaVar = new C7281aa(this.f16368k.mo54016c(), this.f16368k.mo54015b(), j, this.f16377t, this.f16360c);
                this.f16369l = aaVar;
                jVar = this.f16370m;
                vVar = aaVar.mo53862a();
            } else {
                jVar = this.f16370m;
                vVar = new C7353v.C7355b(this.f16368k.mo54015b());
            }
            jVar.mo53896a(vVar);
        }
    }

    /* renamed from: a */
    private boolean m19919a(int i) {
        return this.f16359b == 2 || this.f16372o || !this.f16367j.get(i, false);
    }

    /* renamed from: b */
    static /* synthetic */ int m19921b(C7284ac acVar) {
        int i = acVar.f16371n;
        acVar.f16371n = i + 1;
        return i;
    }

    /* renamed from: b */
    private void m19923b() {
        this.f16366i.clear();
        this.f16365h.clear();
        SparseArray<C7287ad> a = this.f16364g.mo54022a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f16365h.put(a.keyAt(i), a.valueAt(i));
        }
        this.f16365h.put(0, new C7327y(new C7285a()));
        this.f16375r = null;
    }

    /* renamed from: b */
    private boolean m19924b(C7279i iVar) throws IOException {
        byte[] d = this.f16362e.mo55077d();
        if (9400 - this.f16362e.mo55074c() < 188) {
            int a = this.f16362e.mo55064a();
            if (a > 0) {
                System.arraycopy(d, this.f16362e.mo55074c(), d, 0, a);
            }
            this.f16362e.mo55070a(d, a);
        }
        while (this.f16362e.mo55064a() < 188) {
            int b = this.f16362e.mo55072b();
            int a2 = iVar.mo53898a(d, b, 9400 - b);
            if (a2 == -1) {
                return false;
            }
            this.f16362e.mo55075c(b + a2);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C7262h[] m19927d() {
        return new C7262h[]{new C7284ac()};
    }

    /* renamed from: a */
    public int mo53876a(C7279i iVar, C7352u uVar) throws IOException {
        C7279i iVar2 = iVar;
        C7352u uVar2 = uVar;
        long d = iVar.mo53893d();
        if (this.f16372o) {
            if (((d == -1 || this.f16359b == 2) ? false : true) && !this.f16368k.mo54014a()) {
                return this.f16368k.mo54013a(iVar2, uVar2, this.f16377t);
            }
            m19918a(d);
            if (this.f16374q) {
                this.f16374q = false;
                mo53877a(0, 0);
                if (iVar.mo53892c() != 0) {
                    uVar2.f16774a = 0;
                    return 1;
                }
            }
            C7281aa aaVar = this.f16369l;
            if (aaVar != null && aaVar.mo53868b()) {
                return this.f16369l.mo53861a(iVar2, uVar2);
            }
        }
        if (!m19924b(iVar)) {
            return -1;
        }
        int a = m19914a();
        int b = this.f16362e.mo55072b();
        if (a > b) {
            return 0;
        }
        int q = this.f16362e.mo55093q();
        if ((8388608 & q) == 0) {
            int i = ((4194304 & q) != 0 ? 1 : 0) | 0;
            int i2 = (2096896 & q) >> 8;
            boolean z = (q & 32) != 0;
            C7287ad adVar = (q & 16) != 0 ? this.f16365h.get(i2) : null;
            if (adVar != null) {
                if (this.f16359b != 2) {
                    int i3 = q & 15;
                    int i4 = this.f16363f.get(i2, i3 - 1);
                    this.f16363f.put(i2, i3);
                    if (i4 != i3) {
                        if (i3 != ((i4 + 1) & 15)) {
                            adVar.mo54019a();
                        }
                    }
                }
                if (z) {
                    int h = this.f16362e.mo55084h();
                    i |= (this.f16362e.mo55084h() & 64) != 0 ? 2 : 0;
                    this.f16362e.mo55079e(h - 1);
                }
                boolean z2 = this.f16372o;
                if (m19919a(i2)) {
                    this.f16362e.mo55075c(a);
                    adVar.mo54021a(this.f16362e, i);
                    this.f16362e.mo55075c(b);
                }
                if (this.f16359b != 2 && !z2 && this.f16372o && d != -1) {
                    this.f16374q = true;
                }
            }
        }
        this.f16362e.mo55076d(a);
        return 0;
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        C7281aa aaVar;
        C7717a.m22121b(this.f16359b != 2);
        int size = this.f16361d.size();
        for (int i = 0; i < size; i++) {
            C7726ag agVar = this.f16361d.get(i);
            boolean z = agVar.mo54990c() == -9223372036854775807L;
            if (!z) {
                long a = agVar.mo54986a();
                z = (a == -9223372036854775807L || a == 0 || a == j2) ? false : true;
            }
            if (z) {
                agVar.mo54987a(j2);
            }
        }
        if (!(j2 == 0 || (aaVar = this.f16369l) == null)) {
            aaVar.mo53863a(j2);
        }
        this.f16362e.mo55067a(0);
        this.f16363f.clear();
        for (int i2 = 0; i2 < this.f16365h.size(); i2++) {
            this.f16365h.valueAt(i2).mo54019a();
        }
        this.f16376s = 0;
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f16370m = jVar;
    }

    /* renamed from: a */
    public boolean mo53879a(C7279i iVar) throws IOException {
        boolean z;
        byte[] d = this.f16362e.mo55077d();
        iVar.mo53908d(d, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                } else if (d[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                iVar.mo53902b(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo53880c() {
    }
}
