package com.applovin.exoplayer2.p219j;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.common.base.MoreObjects;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.common.p183a.C7047w;
import com.applovin.exoplayer2.common.p184b.C7056c;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Locale;

/* renamed from: com.applovin.exoplayer2.j.i */
public class C7645i implements C7397g {

    /* renamed from: N */
    public static final C7397g.C7398a<C7645i> f17934N = $$Lambda$i$VR8GrYQvbA5B4xCGCTFiS4otP0.INSTANCE;

    /* renamed from: o */
    public static final C7645i f17935o;
    @Deprecated

    /* renamed from: p */
    public static final C7645i f17936p;

    /* renamed from: A */
    public final boolean f17937A;

    /* renamed from: B */
    public final C7033s<String> f17938B;

    /* renamed from: C */
    public final C7033s<String> f17939C;

    /* renamed from: D */
    public final int f17940D;

    /* renamed from: E */
    public final int f17941E;

    /* renamed from: F */
    public final int f17942F;

    /* renamed from: G */
    public final C7033s<String> f17943G;

    /* renamed from: H */
    public final C7033s<String> f17944H;

    /* renamed from: I */
    public final int f17945I;

    /* renamed from: J */
    public final boolean f17946J;

    /* renamed from: K */
    public final boolean f17947K;

    /* renamed from: L */
    public final boolean f17948L;

    /* renamed from: M */
    public final C7047w<Integer> f17949M;

    /* renamed from: q */
    public final int f17950q;

    /* renamed from: r */
    public final int f17951r;

    /* renamed from: s */
    public final int f17952s;

    /* renamed from: t */
    public final int f17953t;

    /* renamed from: u */
    public final int f17954u;

    /* renamed from: v */
    public final int f17955v;

    /* renamed from: w */
    public final int f17956w;

    /* renamed from: x */
    public final int f17957x;

    /* renamed from: y */
    public final int f17958y;

    /* renamed from: z */
    public final int f17959z;

    /* renamed from: com.applovin.exoplayer2.j.i$a */
    public static class C7646a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f17960a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f17961b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f17962c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f17963d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f17964e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f17965f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f17966g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f17967h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f17968i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f17969j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f17970k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C7033s<String> f17971l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public C7033s<String> f17972m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f17973n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f17974o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f17975p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public C7033s<String> f17976q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public C7033s<String> f17977r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public int f17978s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public boolean f17979t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public boolean f17980u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public boolean f17981v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public C7047w<Integer> f17982w;

        @Deprecated
        public C7646a() {
            this.f17960a = Integer.MAX_VALUE;
            this.f17961b = Integer.MAX_VALUE;
            this.f17962c = Integer.MAX_VALUE;
            this.f17963d = Integer.MAX_VALUE;
            this.f17968i = Integer.MAX_VALUE;
            this.f17969j = Integer.MAX_VALUE;
            this.f17970k = true;
            this.f17971l = C7033s.m18803g();
            this.f17972m = C7033s.m18803g();
            this.f17973n = 0;
            this.f17974o = Integer.MAX_VALUE;
            this.f17975p = Integer.MAX_VALUE;
            this.f17976q = C7033s.m18803g();
            this.f17977r = C7033s.m18803g();
            this.f17978s = 0;
            this.f17979t = false;
            this.f17980u = false;
            this.f17981v = false;
            this.f17982w = C7047w.m18896g();
        }

        public C7646a(Context context) {
            this();
            mo54841b(context);
            mo54842b(context, true);
        }

        protected C7646a(Bundle bundle) {
            this.f17960a = bundle.getInt(C7645i.mo54827a(6), C7645i.f17935o.f17950q);
            this.f17961b = bundle.getInt(C7645i.mo54827a(7), C7645i.f17935o.f17951r);
            this.f17962c = bundle.getInt(C7645i.mo54827a(8), C7645i.f17935o.f17952s);
            this.f17963d = bundle.getInt(C7645i.mo54827a(9), C7645i.f17935o.f17953t);
            this.f17964e = bundle.getInt(C7645i.mo54827a(10), C7645i.f17935o.f17954u);
            this.f17965f = bundle.getInt(C7645i.mo54827a(11), C7645i.f17935o.f17955v);
            this.f17966g = bundle.getInt(C7645i.mo54827a(12), C7645i.f17935o.f17956w);
            this.f17967h = bundle.getInt(C7645i.mo54827a(13), C7645i.f17935o.f17957x);
            this.f17968i = bundle.getInt(C7645i.mo54827a(14), C7645i.f17935o.f17958y);
            this.f17969j = bundle.getInt(C7645i.mo54827a(15), C7645i.f17935o.f17959z);
            this.f17970k = bundle.getBoolean(C7645i.mo54827a(16), C7645i.f17935o.f17937A);
            this.f17971l = C7033s.m18799a((E[]) (String[]) MoreObjects.firstNonNull(bundle.getStringArray(C7645i.mo54827a(17)), new String[0]));
            this.f17972m = m21859a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(C7645i.mo54827a(1)), new String[0]));
            this.f17973n = bundle.getInt(C7645i.mo54827a(2), C7645i.f17935o.f17940D);
            this.f17974o = bundle.getInt(C7645i.mo54827a(18), C7645i.f17935o.f17941E);
            this.f17975p = bundle.getInt(C7645i.mo54827a(19), C7645i.f17935o.f17942F);
            this.f17976q = C7033s.m18799a((E[]) (String[]) MoreObjects.firstNonNull(bundle.getStringArray(C7645i.mo54827a(20)), new String[0]));
            this.f17977r = m21859a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(C7645i.mo54827a(3)), new String[0]));
            this.f17978s = bundle.getInt(C7645i.mo54827a(4), C7645i.f17935o.f17945I);
            this.f17979t = bundle.getBoolean(C7645i.mo54827a(5), C7645i.f17935o.f17946J);
            this.f17980u = bundle.getBoolean(C7645i.mo54827a(21), C7645i.f17935o.f17947K);
            this.f17981v = bundle.getBoolean(C7645i.mo54827a(22), C7645i.f17935o.f17948L);
            this.f17982w = C7047w.m18893a(C7056c.m18928a((int[]) MoreObjects.firstNonNull(bundle.getIntArray(C7645i.mo54827a(23)), new int[0])));
        }

        /* renamed from: a */
        private static C7033s<String> m21859a(String[] strArr) {
            C7033s.C7034a i = C7033s.m18804i();
            for (String b : (String[]) C7717a.m22120b(strArr)) {
                i.mo53515a(C7728ai.m22238b((String) C7717a.m22120b(b)));
            }
            return i.mo53531a();
        }

        /* renamed from: a */
        private void mo54836a(Context context) {
            CaptioningManager captioningManager;
            if ((C7728ai.f18249a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f17978s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f17977r = C7033s.m18793a(C7728ai.m22202a(locale));
                }
            }
        }

        /* renamed from: b */
        public C7646a mo54840b(int i, int i2, boolean z) {
            this.f17968i = i;
            this.f17969j = i2;
            this.f17970k = z;
            return this;
        }

        /* renamed from: b */
        public C7646a mo54841b(Context context) {
            if (C7728ai.f18249a >= 19) {
                mo54836a(context);
            }
            return this;
        }

        /* renamed from: b */
        public C7646a mo54842b(Context context, boolean z) {
            Point d = C7728ai.m22253d(context);
            return mo54840b(d.x, d.y, z);
        }

        /* renamed from: b */
        public C7645i mo54843b() {
            return new C7645i(this);
        }
    }

    static {
        C7645i b = new C7646a().mo54843b();
        f17935o = b;
        f17936p = b;
    }

    protected C7645i(C7646a aVar) {
        this.f17950q = aVar.f17960a;
        this.f17951r = aVar.f17961b;
        this.f17952s = aVar.f17962c;
        this.f17953t = aVar.f17963d;
        this.f17954u = aVar.f17964e;
        this.f17955v = aVar.f17965f;
        this.f17956w = aVar.f17966g;
        this.f17957x = aVar.f17967h;
        this.f17958y = aVar.f17968i;
        this.f17959z = aVar.f17969j;
        this.f17937A = aVar.f17970k;
        this.f17938B = aVar.f17971l;
        this.f17939C = aVar.f17972m;
        this.f17940D = aVar.f17973n;
        this.f17941E = aVar.f17974o;
        this.f17942F = aVar.f17975p;
        this.f17943G = aVar.f17976q;
        this.f17944H = aVar.f17977r;
        this.f17945I = aVar.f17978s;
        this.f17946J = aVar.f17979t;
        this.f17947K = aVar.f17980u;
        this.f17948L = aVar.f17981v;
        this.f17949M = aVar.f17982w;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String mo54827a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7645i iVar = (C7645i) obj;
        return this.f17950q == iVar.f17950q && this.f17951r == iVar.f17951r && this.f17952s == iVar.f17952s && this.f17953t == iVar.f17953t && this.f17954u == iVar.f17954u && this.f17955v == iVar.f17955v && this.f17956w == iVar.f17956w && this.f17957x == iVar.f17957x && this.f17937A == iVar.f17937A && this.f17958y == iVar.f17958y && this.f17959z == iVar.f17959z && this.f17938B.equals(iVar.f17938B) && this.f17939C.equals(iVar.f17939C) && this.f17940D == iVar.f17940D && this.f17941E == iVar.f17941E && this.f17942F == iVar.f17942F && this.f17943G.equals(iVar.f17943G) && this.f17944H.equals(iVar.f17944H) && this.f17945I == iVar.f17945I && this.f17946J == iVar.f17946J && this.f17947K == iVar.f17947K && this.f17948L == iVar.f17948L && this.f17949M.equals(iVar.f17949M);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((this.f17950q + 31) * 31) + this.f17951r) * 31) + this.f17952s) * 31) + this.f17953t) * 31) + this.f17954u) * 31) + this.f17955v) * 31) + this.f17956w) * 31) + this.f17957x) * 31) + (this.f17937A ? 1 : 0)) * 31) + this.f17958y) * 31) + this.f17959z) * 31) + this.f17938B.hashCode()) * 31) + this.f17939C.hashCode()) * 31) + this.f17940D) * 31) + this.f17941E) * 31) + this.f17942F) * 31) + this.f17943G.hashCode()) * 31) + this.f17944H.hashCode()) * 31) + this.f17945I) * 31) + (this.f17946J ? 1 : 0)) * 31) + (this.f17947K ? 1 : 0)) * 31) + (this.f17948L ? 1 : 0)) * 31) + this.f17949M.hashCode();
    }
}
