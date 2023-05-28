package com.applovin.exoplayer2;

import android.util.Pair;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.p206h.C7537z;
import com.applovin.exoplayer2.p221l.C7717a;

/* renamed from: com.applovin.exoplayer2.a */
public abstract class C6780a extends C6904ba {

    /* renamed from: c */
    private final int f14581c;

    /* renamed from: d */
    private final C7537z f14582d;

    /* renamed from: e */
    private final boolean f14583e;

    public C6780a(boolean z, C7537z zVar) {
        this.f14583e = z;
        this.f14582d = zVar;
        this.f14581c = zVar.mo54616a();
    }

    /* renamed from: a */
    private int m17086a(int i, boolean z) {
        if (z) {
            return this.f14582d.mo54617a(i);
        }
        if (i < this.f14581c - 1) {
            return i + 1;
        }
        return -1;
    }

    /* renamed from: a */
    public static Object m17087a(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: a */
    public static Object m17088a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: b */
    private int m17089b(int i, boolean z) {
        if (z) {
            return this.f14582d.mo54620b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* renamed from: b */
    public static Object m17090b(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: a */
    public int mo52438a(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f14583e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int c = mo52447c(i);
        int f = mo52452f(c);
        C6904ba d = mo52450d(c);
        int i4 = i - f;
        if (i2 != 2) {
            i3 = i2;
        }
        int a = d.mo52438a(i4, i3, z);
        if (a != -1) {
            return f + a;
        }
        int a2 = m17086a(c, z);
        while (a2 != -1 && mo52450d(a2).mo53081d()) {
            a2 = m17086a(a2, z);
        }
        if (a2 != -1) {
            return mo52452f(a2) + mo52450d(a2).mo52446b(z);
        }
        if (i2 == 2) {
            return mo52446b(z);
        }
        return -1;
    }

    /* renamed from: a */
    public int mo52439a(boolean z) {
        if (this.f14581c == 0) {
            return -1;
        }
        if (this.f14583e) {
            z = false;
        }
        int b = z ? this.f14582d.mo54619b() : this.f14581c - 1;
        while (mo52450d(b).mo53081d()) {
            b = m17089b(b, z);
            if (b == -1) {
                return -1;
            }
        }
        return mo52452f(b) + mo52450d(b).mo52439a(z);
    }

    /* renamed from: a */
    public final C6904ba.C6906a mo52440a(int i, C6904ba.C6906a aVar, boolean z) {
        int b = mo52444b(i);
        int f = mo52452f(b);
        mo52450d(b).mo52440a(i - mo52451e(b), aVar, z);
        aVar.f15258c += f;
        if (z) {
            aVar.f15257b = m17088a(mo52453g(b), C7717a.m22120b(aVar.f15257b));
        }
        return aVar;
    }

    /* renamed from: a */
    public final C6904ba.C6906a mo52441a(Object obj, C6904ba.C6906a aVar) {
        Object a = m17087a(obj);
        Object b = m17090b(obj);
        int d = mo52449d(a);
        int f = mo52452f(d);
        mo52450d(d).mo52441a(b, aVar);
        aVar.f15258c += f;
        aVar.f15257b = obj;
        return aVar;
    }

    /* renamed from: a */
    public final C6904ba.C6908c mo52442a(int i, C6904ba.C6908c cVar, long j) {
        int c = mo52447c(i);
        int f = mo52452f(c);
        int e = mo52451e(c);
        mo52450d(c).mo52442a(i - f, cVar, j);
        Object g = mo52453g(c);
        if (!C6904ba.C6908c.f15267a.equals(cVar.f15271b)) {
            g = m17088a(g, cVar.f15271b);
        }
        cVar.f15271b = g;
        cVar.f15285p += e;
        cVar.f15286q += e;
        return cVar;
    }

    /* renamed from: a */
    public final Object mo52443a(int i) {
        int b = mo52444b(i);
        return m17088a(mo52453g(b), mo52450d(b).mo52443a(i - mo52451e(b)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo52444b(int i);

    /* renamed from: b */
    public int mo52445b(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f14583e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int c = mo52447c(i);
        int f = mo52452f(c);
        C6904ba d = mo52450d(c);
        int i4 = i - f;
        if (i2 != 2) {
            i3 = i2;
        }
        int b = d.mo52445b(i4, i3, z);
        if (b != -1) {
            return f + b;
        }
        int b2 = m17089b(c, z);
        while (b2 != -1 && mo52450d(b2).mo53081d()) {
            b2 = m17089b(b2, z);
        }
        if (b2 != -1) {
            return mo52452f(b2) + mo52450d(b2).mo52439a(z);
        }
        if (i2 == 2) {
            return mo52439a(z);
        }
        return -1;
    }

    /* renamed from: b */
    public int mo52446b(boolean z) {
        if (this.f14581c == 0) {
            return -1;
        }
        int i = 0;
        if (this.f14583e) {
            z = false;
        }
        if (z) {
            i = this.f14582d.mo54622c();
        }
        while (mo52450d(i).mo53081d()) {
            i = m17086a(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo52452f(i) + mo52450d(i).mo52446b(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo52447c(int i);

    /* renamed from: c */
    public final int mo52448c(Object obj) {
        int c;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object a = m17087a(obj);
        Object b = m17090b(obj);
        int d = mo52449d(a);
        if (d == -1 || (c = mo52450d(d).mo52448c(b)) == -1) {
            return -1;
        }
        return mo52451e(d) + c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo52449d(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C6904ba mo52450d(int i);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo52451e(int i);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo52452f(int i);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract Object mo52453g(int i);
}
