package com.applovin.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.common.p183a.C7039u;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: com.applovin.exoplayer2.ab */
public final class C6787ab implements C7397g {

    /* renamed from: a */
    public static final C6787ab f14611a = new C6790b().mo52619a();

    /* renamed from: g */
    public static final C7397g.C7398a<C6787ab> f14612g = $$Lambda$ab$gWIwMl_uYHYejR8gVGg7CUA8tuw.INSTANCE;

    /* renamed from: b */
    public final String f14613b;

    /* renamed from: c */
    public final C6796f f14614c;

    /* renamed from: d */
    public final C6794e f14615d;

    /* renamed from: e */
    public final C6797ac f14616e;

    /* renamed from: f */
    public final C6791c f14617f;

    /* renamed from: com.applovin.exoplayer2.ab$a */
    public static final class C6789a {

        /* renamed from: a */
        public final Uri f14618a;

        /* renamed from: b */
        public final Object f14619b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6789a)) {
                return false;
            }
            C6789a aVar = (C6789a) obj;
            return this.f14618a.equals(aVar.f14618a) && C7728ai.m22218a(this.f14619b, aVar.f14619b);
        }

        public int hashCode() {
            int hashCode = this.f14618a.hashCode() * 31;
            Object obj = this.f14619b;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* renamed from: com.applovin.exoplayer2.ab$b */
    public static final class C6790b {

        /* renamed from: a */
        private String f14620a;

        /* renamed from: b */
        private Uri f14621b;

        /* renamed from: c */
        private String f14622c;

        /* renamed from: d */
        private long f14623d;

        /* renamed from: e */
        private long f14624e;

        /* renamed from: f */
        private boolean f14625f;

        /* renamed from: g */
        private boolean f14626g;

        /* renamed from: h */
        private boolean f14627h;

        /* renamed from: i */
        private C6792d.C6793a f14628i;

        /* renamed from: j */
        private List<Object> f14629j;

        /* renamed from: k */
        private String f14630k;

        /* renamed from: l */
        private List<Object> f14631l;

        /* renamed from: m */
        private C6789a f14632m;

        /* renamed from: n */
        private Object f14633n;

        /* renamed from: o */
        private C6797ac f14634o;

        /* renamed from: p */
        private C6794e.C6795a f14635p;

        public C6790b() {
            this.f14624e = Long.MIN_VALUE;
            this.f14628i = new C6792d.C6793a();
            this.f14629j = Collections.emptyList();
            this.f14631l = Collections.emptyList();
            this.f14635p = new C6794e.C6795a();
        }

        private C6790b(C6787ab abVar) {
            this();
            this.f14624e = abVar.f14617f.f14638b;
            this.f14625f = abVar.f14617f.f14639c;
            this.f14626g = abVar.f14617f.f14640d;
            this.f14623d = abVar.f14617f.f14637a;
            this.f14627h = abVar.f14617f.f14641e;
            this.f14620a = abVar.f14613b;
            this.f14634o = abVar.f14616e;
            this.f14635p = abVar.f14615d.mo52628a();
            C6796f fVar = abVar.f14614c;
            if (fVar != null) {
                this.f14630k = fVar.f14675f;
                this.f14622c = fVar.f14671b;
                this.f14621b = fVar.f14670a;
                this.f14629j = fVar.f14674e;
                this.f14631l = fVar.f14676g;
                this.f14633n = fVar.f14677h;
                this.f14628i = fVar.f14672c != null ? fVar.f14672c.mo52624b() : new C6792d.C6793a();
                this.f14632m = fVar.f14673d;
            }
        }

        /* renamed from: a */
        public C6790b mo52616a(Uri uri) {
            this.f14621b = uri;
            return this;
        }

        /* renamed from: a */
        public C6790b mo52617a(Object obj) {
            this.f14633n = obj;
            return this;
        }

        /* renamed from: a */
        public C6790b mo52618a(String str) {
            this.f14620a = (String) C7717a.m22120b(str);
            return this;
        }

        /* renamed from: a */
        public C6787ab mo52619a() {
            C6796f fVar;
            C7717a.m22121b(this.f14628i.f14651b == null || this.f14628i.f14650a != null);
            Uri uri = this.f14621b;
            C6792d dVar = null;
            if (uri != null) {
                String str = this.f14622c;
                if (this.f14628i.f14650a != null) {
                    dVar = this.f14628i.mo52627a();
                }
                fVar = new C6796f(uri, str, dVar, this.f14632m, this.f14629j, this.f14630k, this.f14631l, this.f14633n);
            } else {
                fVar = null;
            }
            String str2 = this.f14620a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            C6791c cVar = new C6791c(this.f14623d, this.f14624e, this.f14625f, this.f14626g, this.f14627h);
            C6794e a = this.f14635p.mo52631a();
            C6797ac acVar = this.f14634o;
            if (acVar == null) {
                acVar = C6797ac.f14679a;
            }
            return new C6787ab(str3, cVar, fVar, a, acVar);
        }

        /* renamed from: b */
        public C6790b mo52620b(String str) {
            this.f14630k = str;
            return this;
        }
    }

    /* renamed from: com.applovin.exoplayer2.ab$c */
    public static final class C6791c implements C7397g {

        /* renamed from: f */
        public static final C7397g.C7398a<C6791c> f14636f = $$Lambda$ab$c$Dx1vSveCvdPBzi65xKGhCZqqXg.INSTANCE;

        /* renamed from: a */
        public final long f14637a;

        /* renamed from: b */
        public final long f14638b;

        /* renamed from: c */
        public final boolean f14639c;

        /* renamed from: d */
        public final boolean f14640d;

        /* renamed from: e */
        public final boolean f14641e;

        private C6791c(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f14637a = j;
            this.f14638b = j2;
            this.f14639c = z;
            this.f14640d = z2;
            this.f14641e = z3;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ C6791c m17337a(Bundle bundle) {
            return new C6791c(bundle.getLong(m17338a(0), 0), bundle.getLong(m17338a(1), Long.MIN_VALUE), bundle.getBoolean(m17338a(2), false), bundle.getBoolean(m17338a(3), false), bundle.getBoolean(m17338a(4), false));
        }

        /* renamed from: a */
        private static String m17338a(int i) {
            return Integer.toString(i, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6791c)) {
                return false;
            }
            C6791c cVar = (C6791c) obj;
            return this.f14637a == cVar.f14637a && this.f14638b == cVar.f14638b && this.f14639c == cVar.f14639c && this.f14640d == cVar.f14640d && this.f14641e == cVar.f14641e;
        }

        public int hashCode() {
            long j = this.f14637a;
            long j2 = this.f14638b;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f14639c ? 1 : 0)) * 31) + (this.f14640d ? 1 : 0)) * 31) + (this.f14641e ? 1 : 0);
        }
    }

    /* renamed from: com.applovin.exoplayer2.ab$d */
    public static final class C6792d {

        /* renamed from: a */
        public final UUID f14642a;

        /* renamed from: b */
        public final Uri f14643b;

        /* renamed from: c */
        public final C7039u<String, String> f14644c;

        /* renamed from: d */
        public final boolean f14645d;

        /* renamed from: e */
        public final boolean f14646e;

        /* renamed from: f */
        public final boolean f14647f;

        /* renamed from: g */
        public final C7033s<Integer> f14648g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final byte[] f14649h;

        /* renamed from: com.applovin.exoplayer2.ab$d$a */
        public static final class C6793a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public UUID f14650a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public Uri f14651b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public C7039u<String, String> f14652c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public boolean f14653d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public boolean f14654e;
            /* access modifiers changed from: private */

            /* renamed from: f */
            public boolean f14655f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public C7033s<Integer> f14656g;
            /* access modifiers changed from: private */

            /* renamed from: h */
            public byte[] f14657h;

            @Deprecated
            private C6793a() {
                this.f14652c = C7039u.m18834a();
                this.f14656g = C7033s.m18803g();
            }

            private C6793a(C6792d dVar) {
                this.f14650a = dVar.f14642a;
                this.f14651b = dVar.f14643b;
                this.f14652c = dVar.f14644c;
                this.f14653d = dVar.f14645d;
                this.f14654e = dVar.f14646e;
                this.f14655f = dVar.f14647f;
                this.f14656g = dVar.f14648g;
                this.f14657h = dVar.f14649h;
            }

            /* renamed from: a */
            public C6792d mo52627a() {
                return new C6792d(this);
            }
        }

        private C6792d(C6793a aVar) {
            C7717a.m22121b(!aVar.f14655f || aVar.f14651b != null);
            this.f14642a = (UUID) C7717a.m22120b(aVar.f14650a);
            this.f14643b = aVar.f14651b;
            this.f14644c = aVar.f14652c;
            this.f14645d = aVar.f14653d;
            this.f14647f = aVar.f14655f;
            this.f14646e = aVar.f14654e;
            this.f14648g = aVar.f14656g;
            this.f14649h = aVar.f14657h != null ? Arrays.copyOf(aVar.f14657h, aVar.f14657h.length) : null;
        }

        /* renamed from: a */
        public byte[] mo52623a() {
            byte[] bArr = this.f14649h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        /* renamed from: b */
        public C6793a mo52624b() {
            return new C6793a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6792d)) {
                return false;
            }
            C6792d dVar = (C6792d) obj;
            return this.f14642a.equals(dVar.f14642a) && C7728ai.m22218a((Object) this.f14643b, (Object) dVar.f14643b) && C7728ai.m22218a((Object) this.f14644c, (Object) dVar.f14644c) && this.f14645d == dVar.f14645d && this.f14647f == dVar.f14647f && this.f14646e == dVar.f14646e && this.f14648g.equals(dVar.f14648g) && Arrays.equals(this.f14649h, dVar.f14649h);
        }

        public int hashCode() {
            int hashCode = this.f14642a.hashCode() * 31;
            Uri uri = this.f14643b;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f14644c.hashCode()) * 31) + (this.f14645d ? 1 : 0)) * 31) + (this.f14647f ? 1 : 0)) * 31) + (this.f14646e ? 1 : 0)) * 31) + this.f14648g.hashCode()) * 31) + Arrays.hashCode(this.f14649h);
        }
    }

    /* renamed from: com.applovin.exoplayer2.ab$e */
    public static final class C6794e implements C7397g {

        /* renamed from: a */
        public static final C6794e f14658a = new C6795a().mo52631a();

        /* renamed from: g */
        public static final C7397g.C7398a<C6794e> f14659g = $$Lambda$ab$e$jTWWN0THvrW8sUCs0sI5CCG5dA.INSTANCE;

        /* renamed from: b */
        public final long f14660b;

        /* renamed from: c */
        public final long f14661c;

        /* renamed from: d */
        public final long f14662d;

        /* renamed from: e */
        public final float f14663e;

        /* renamed from: f */
        public final float f14664f;

        /* renamed from: com.applovin.exoplayer2.ab$e$a */
        public static final class C6795a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public long f14665a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public long f14666b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public long f14667c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public float f14668d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public float f14669e;

            public C6795a() {
                this.f14665a = -9223372036854775807L;
                this.f14666b = -9223372036854775807L;
                this.f14667c = -9223372036854775807L;
                this.f14668d = -3.4028235E38f;
                this.f14669e = -3.4028235E38f;
            }

            private C6795a(C6794e eVar) {
                this.f14665a = eVar.f14660b;
                this.f14666b = eVar.f14661c;
                this.f14667c = eVar.f14662d;
                this.f14668d = eVar.f14663e;
                this.f14669e = eVar.f14664f;
            }

            /* renamed from: a */
            public C6794e mo52631a() {
                return new C6794e(this);
            }
        }

        @Deprecated
        public C6794e(long j, long j2, long j3, float f, float f2) {
            this.f14660b = j;
            this.f14661c = j2;
            this.f14662d = j3;
            this.f14663e = f;
            this.f14664f = f2;
        }

        private C6794e(C6795a aVar) {
            this(aVar.f14665a, aVar.f14666b, aVar.f14667c, aVar.f14668d, aVar.f14669e);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ C6794e m17351a(Bundle bundle) {
            return new C6794e(bundle.getLong(m17352a(0), -9223372036854775807L), bundle.getLong(m17352a(1), -9223372036854775807L), bundle.getLong(m17352a(2), -9223372036854775807L), bundle.getFloat(m17352a(3), -3.4028235E38f), bundle.getFloat(m17352a(4), -3.4028235E38f));
        }

        /* renamed from: a */
        private static String m17352a(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: a */
        public C6795a mo52628a() {
            return new C6795a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6794e)) {
                return false;
            }
            C6794e eVar = (C6794e) obj;
            return this.f14660b == eVar.f14660b && this.f14661c == eVar.f14661c && this.f14662d == eVar.f14662d && this.f14663e == eVar.f14663e && this.f14664f == eVar.f14664f;
        }

        public int hashCode() {
            long j = this.f14660b;
            long j2 = this.f14661c;
            long j3 = this.f14662d;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            float f = this.f14663e;
            int i2 = 0;
            int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f14664f;
            if (f2 != 0.0f) {
                i2 = Float.floatToIntBits(f2);
            }
            return floatToIntBits + i2;
        }
    }

    /* renamed from: com.applovin.exoplayer2.ab$f */
    public static final class C6796f {

        /* renamed from: a */
        public final Uri f14670a;

        /* renamed from: b */
        public final String f14671b;

        /* renamed from: c */
        public final C6792d f14672c;

        /* renamed from: d */
        public final C6789a f14673d;

        /* renamed from: e */
        public final List<Object> f14674e;

        /* renamed from: f */
        public final String f14675f;

        /* renamed from: g */
        public final List<Object> f14676g;

        /* renamed from: h */
        public final Object f14677h;

        private C6796f(Uri uri, String str, C6792d dVar, C6789a aVar, List<Object> list, String str2, List<Object> list2, Object obj) {
            this.f14670a = uri;
            this.f14671b = str;
            this.f14672c = dVar;
            this.f14673d = aVar;
            this.f14674e = list;
            this.f14675f = str2;
            this.f14676g = list2;
            this.f14677h = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6796f)) {
                return false;
            }
            C6796f fVar = (C6796f) obj;
            return this.f14670a.equals(fVar.f14670a) && C7728ai.m22218a((Object) this.f14671b, (Object) fVar.f14671b) && C7728ai.m22218a((Object) this.f14672c, (Object) fVar.f14672c) && C7728ai.m22218a((Object) this.f14673d, (Object) fVar.f14673d) && this.f14674e.equals(fVar.f14674e) && C7728ai.m22218a((Object) this.f14675f, (Object) fVar.f14675f) && this.f14676g.equals(fVar.f14676g) && C7728ai.m22218a(this.f14677h, fVar.f14677h);
        }

        public int hashCode() {
            int hashCode = this.f14670a.hashCode() * 31;
            String str = this.f14671b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C6792d dVar = this.f14672c;
            int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            C6789a aVar = this.f14673d;
            int hashCode4 = (((hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f14674e.hashCode()) * 31;
            String str2 = this.f14675f;
            int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f14676g.hashCode()) * 31;
            Object obj = this.f14677h;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode5 + i;
        }
    }

    private C6787ab(String str, C6791c cVar, C6796f fVar, C6794e eVar, C6797ac acVar) {
        this.f14613b = str;
        this.f14614c = fVar;
        this.f14615d = eVar;
        this.f14616e = acVar;
        this.f14617f = cVar;
    }

    /* renamed from: a */
    public static C6787ab m17328a(Uri uri) {
        return new C6790b().mo52616a(uri).mo52619a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C6787ab m17329a(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = (String) C7717a.m22120b(bundle2.getString(m17330a(0), ""));
        Bundle bundle3 = bundle2.getBundle(m17330a(1));
        C6794e fromBundle = bundle3 == null ? C6794e.f14658a : C6794e.f14659g.fromBundle(bundle3);
        Bundle bundle4 = bundle2.getBundle(m17330a(2));
        C6797ac fromBundle2 = bundle4 == null ? C6797ac.f14679a : C6797ac.f14678H.fromBundle(bundle4);
        Bundle bundle5 = bundle2.getBundle(m17330a(3));
        return new C6787ab(str, bundle5 == null ? new C6791c(0, Long.MIN_VALUE, false, false, false) : C6791c.f14636f.fromBundle(bundle5), (C6796f) null, fromBundle, fromBundle2);
    }

    /* renamed from: a */
    private static String m17330a(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    public C6790b mo52611a() {
        return new C6790b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6787ab)) {
            return false;
        }
        C6787ab abVar = (C6787ab) obj;
        return C7728ai.m22218a((Object) this.f14613b, (Object) abVar.f14613b) && this.f14617f.equals(abVar.f14617f) && C7728ai.m22218a((Object) this.f14614c, (Object) abVar.f14614c) && C7728ai.m22218a((Object) this.f14615d, (Object) abVar.f14615d) && C7728ai.m22218a((Object) this.f14616e, (Object) abVar.f14616e);
    }

    public int hashCode() {
        int hashCode = this.f14613b.hashCode() * 31;
        C6796f fVar = this.f14614c;
        return ((((((hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31) + this.f14615d.hashCode()) * 31) + this.f14617f.hashCode()) * 31) + this.f14616e.hashCode();
    }
}
