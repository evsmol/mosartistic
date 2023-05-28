package com.applovin.exoplayer2.p206h.p207a;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.h.a.a */
public final class C7478a implements C7397g {

    /* renamed from: a */
    public static final C7478a f17133a = new C7478a((Object) null, new C7479a[0], 0, -9223372036854775807L, 0);

    /* renamed from: g */
    public static final C7397g.C7398a<C7478a> f17134g = $$Lambda$a$vBKfUbsOWV0HIeQgOPgiVmpb74.INSTANCE;

    /* renamed from: h */
    private static final C7479a f17135h = new C7479a(0).mo54466b(0);

    /* renamed from: b */
    public final Object f17136b;

    /* renamed from: c */
    public final int f17137c;

    /* renamed from: d */
    public final long f17138d;

    /* renamed from: e */
    public final long f17139e;

    /* renamed from: f */
    public final int f17140f;

    /* renamed from: i */
    private final C7479a[] f17141i;

    /* renamed from: com.applovin.exoplayer2.h.a.a$a */
    public static final class C7479a implements C7397g {

        /* renamed from: h */
        public static final C7397g.C7398a<C7479a> f17142h = $$Lambda$a$a$qEJSSbv7nhL2EgNplwta3WBm8k.INSTANCE;

        /* renamed from: a */
        public final long f17143a;

        /* renamed from: b */
        public final int f17144b;

        /* renamed from: c */
        public final Uri[] f17145c;

        /* renamed from: d */
        public final int[] f17146d;

        /* renamed from: e */
        public final long[] f17147e;

        /* renamed from: f */
        public final long f17148f;

        /* renamed from: g */
        public final boolean f17149g;

        public C7479a(long j) {
            this(j, -1, new int[0], new Uri[0], new long[0], 0, false);
        }

        private C7479a(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            C7717a.m22118a(iArr.length == uriArr.length);
            this.f17143a = j;
            this.f17144b = i;
            this.f17146d = iArr;
            this.f17145c = uriArr;
            this.f17147e = jArr;
            this.f17148f = j2;
            this.f17149g = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static C7479a m20827a(Bundle bundle) {
            long j = bundle.getLong(m20830c(0));
            int i = bundle.getInt(m20830c(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(m20830c(2));
            int[] intArray = bundle.getIntArray(m20830c(3));
            long[] longArray = bundle.getLongArray(m20830c(4));
            long j2 = bundle.getLong(m20830c(5));
            boolean z = bundle.getBoolean(m20830c(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new C7479a(j, i, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j2, z);
        }

        /* renamed from: a */
        private static int[] m20828a(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* renamed from: a */
        private static long[] m20829a(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        /* renamed from: c */
        private static String m20830c(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: a */
        public int mo54464a() {
            return mo54465a(-1);
        }

        /* renamed from: a */
        public int mo54465a(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f17146d;
                if (i2 >= iArr.length || this.f17149g || iArr[i2] == 0 || iArr[i2] == 1) {
                    return i2;
                }
                i2++;
            }
            return i2;
        }

        /* renamed from: b */
        public C7479a mo54466b(int i) {
            int[] a = m20828a(this.f17146d, i);
            long[] a2 = m20829a(this.f17147e, i);
            return new C7479a(this.f17143a, i, a, (Uri[]) Arrays.copyOf(this.f17145c, i), a2, this.f17148f, this.f17149g);
        }

        /* renamed from: b */
        public boolean mo54467b() {
            return this.f17144b == -1 || mo54464a() < this.f17144b;
        }

        /* renamed from: c */
        public boolean mo54468c() {
            if (this.f17144b == -1) {
                return true;
            }
            for (int i = 0; i < this.f17144b; i++) {
                int[] iArr = this.f17146d;
                if (iArr[i] == 0 || iArr[i] == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7479a aVar = (C7479a) obj;
            return this.f17143a == aVar.f17143a && this.f17144b == aVar.f17144b && Arrays.equals(this.f17145c, aVar.f17145c) && Arrays.equals(this.f17146d, aVar.f17146d) && Arrays.equals(this.f17147e, aVar.f17147e) && this.f17148f == aVar.f17148f && this.f17149g == aVar.f17149g;
        }

        public int hashCode() {
            long j = this.f17143a;
            long j2 = this.f17148f;
            return (((((((((((this.f17144b * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f17145c)) * 31) + Arrays.hashCode(this.f17146d)) * 31) + Arrays.hashCode(this.f17147e)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f17149g ? 1 : 0);
        }
    }

    private C7478a(Object obj, C7479a[] aVarArr, long j, long j2, int i) {
        this.f17136b = obj;
        this.f17138d = j;
        this.f17139e = j2;
        this.f17137c = aVarArr.length + i;
        this.f17141i = aVarArr;
        this.f17140f = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C7478a m20821a(Bundle bundle) {
        C7479a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m20823b(1));
        if (parcelableArrayList == null) {
            aVarArr = new C7479a[0];
        } else {
            C7479a[] aVarArr2 = new C7479a[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                aVarArr2[i] = C7479a.f17142h.fromBundle((Bundle) parcelableArrayList.get(i));
            }
            aVarArr = aVarArr2;
        }
        return new C7478a((Object) null, aVarArr, bundle.getLong(m20823b(2), 0), bundle.getLong(m20823b(3), -9223372036854775807L), bundle.getInt(m20823b(4)));
    }

    /* renamed from: a */
    private boolean m20822a(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = mo54459a(i).f17143a;
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || j < j2 : j < j3;
    }

    /* renamed from: b */
    private static String m20823b(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    public int mo54458a(long j, long j2) {
        int i = this.f17137c - 1;
        while (i >= 0 && m20822a(j, j2, i)) {
            i--;
        }
        if (i < 0 || !mo54459a(i).mo54468c()) {
            return -1;
        }
        return i;
    }

    /* renamed from: a */
    public C7479a mo54459a(int i) {
        int i2 = this.f17140f;
        return i < i2 ? f17135h : this.f17141i[i - i2];
    }

    /* renamed from: b */
    public int mo54460b(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = this.f17140f;
        while (i < this.f17137c && ((mo54459a(i).f17143a != Long.MIN_VALUE && mo54459a(i).f17143a <= j) || !mo54459a(i).mo54467b())) {
            i++;
        }
        if (i < this.f17137c) {
            return i;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7478a aVar = (C7478a) obj;
        return C7728ai.m22218a(this.f17136b, aVar.f17136b) && this.f17137c == aVar.f17137c && this.f17138d == aVar.f17138d && this.f17139e == aVar.f17139e && this.f17140f == aVar.f17140f && Arrays.equals(this.f17141i, aVar.f17141i);
    }

    public int hashCode() {
        int i = this.f17137c * 31;
        Object obj = this.f17136b;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f17138d)) * 31) + ((int) this.f17139e)) * 31) + this.f17140f) * 31) + Arrays.hashCode(this.f17141i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f17136b);
        sb.append(", adResumePositionUs=");
        sb.append(this.f17138d);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f17141i.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f17141i[i].f17143a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.f17141i[i].f17146d.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.f17141i[i].f17146d[i2];
                sb.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb.append(", durationUs=");
                sb.append(this.f17141i[i].f17147e[i2]);
                sb.append(')');
                if (i2 < this.f17141i[i].f17146d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f17141i.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
