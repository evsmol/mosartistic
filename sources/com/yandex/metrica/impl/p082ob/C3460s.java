package com.yandex.metrica.impl.p082ob;

import android.util.Pair;

/* renamed from: com.yandex.metrica.impl.ob.s */
public class C3460s {

    /* renamed from: a */
    private C2812am f9079a;

    /* renamed from: b */
    private long f9080b;

    /* renamed from: c */
    private boolean f9081c;

    /* renamed from: d */
    private final C2849bn f9082d;

    /* renamed from: com.yandex.metrica.impl.ob.s$a */
    public static final class C3461a {

        /* renamed from: a */
        public final String f9083a;

        /* renamed from: b */
        public final long f9084b;

        public C3461a(String str, long j) {
            this.f9083a = str;
            this.f9084b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3461a.class != obj.getClass()) {
                return false;
            }
            C3461a aVar = (C3461a) obj;
            if (this.f9084b != aVar.f9084b) {
                return false;
            }
            String str = this.f9083a;
            String str2 = aVar.f9083a;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
                return true;
            } else if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f9083a;
            int hashCode = str != null ? str.hashCode() : 0;
            long j = this.f9084b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }
    }

    public C3460s(String str, long j, C2875cm cmVar) {
        this(str, j, new C2849bn(cmVar, "[App Environment]"));
    }

    /* renamed from: a */
    public synchronized void mo18189a(Pair<String, String> pair) {
        if (this.f9082d.mo17315b(this.f9079a, (String) pair.first, (String) pair.second)) {
            this.f9081c = true;
        }
    }

    /* renamed from: b */
    public synchronized void mo18190b() {
        this.f9079a = new C2812am();
    }

    public synchronized String toString() {
        return "Map size " + this.f9079a.size() + ". Is changed " + this.f9081c + ". Current revision " + this.f9080b;
    }

    C3460s(String str, long j, C2849bn bnVar) {
        this.f9080b = j;
        try {
            this.f9079a = new C2812am(str);
        } catch (Throwable unused) {
            this.f9079a = new C2812am();
        }
        this.f9082d = bnVar;
    }

    /* renamed from: a */
    public synchronized C3461a mo18188a() {
        if (this.f9081c) {
            this.f9080b++;
            this.f9081c = false;
        }
        return new C3461a(C2572Tl.m8546g(this.f9079a), this.f9080b);
    }
}
