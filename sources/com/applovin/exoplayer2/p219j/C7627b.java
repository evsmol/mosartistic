package com.applovin.exoplayer2.p219j;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p206h.C7482ac;
import com.applovin.exoplayer2.p219j.C7637d;
import com.applovin.exoplayer2.p221l.C7717a;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.j.b */
public abstract class C7627b implements C7637d {

    /* renamed from: a */
    protected final C7482ac f17840a;

    /* renamed from: b */
    protected final int f17841b;

    /* renamed from: c */
    protected final int[] f17842c;

    /* renamed from: d */
    private final int f17843d;

    /* renamed from: e */
    private final C7864v[] f17844e;

    /* renamed from: f */
    private final long[] f17845f;

    /* renamed from: g */
    private int f17846g;

    public C7627b(C7482ac acVar, int[] iArr, int i) {
        int i2 = 0;
        C7717a.m22121b(iArr.length > 0);
        this.f17843d = i;
        this.f17840a = (C7482ac) C7717a.m22120b(acVar);
        int length = iArr.length;
        this.f17841b = length;
        this.f17844e = new C7864v[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f17844e[i3] = acVar.mo54479a(iArr[i3]);
        }
        Arrays.sort(this.f17844e, $$Lambda$b$XwOlcEtU5JOv_rtmCb6VP1bxxLA.INSTANCE);
        this.f17842c = new int[this.f17841b];
        while (true) {
            int i4 = this.f17841b;
            if (i2 < i4) {
                this.f17842c[i2] = acVar.mo54478a(this.f17844e[i2]);
                i2++;
            } else {
                this.f17845f = new long[i4];
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m21741a(C7864v vVar, C7864v vVar2) {
        return vVar2.f18917h - vVar.f18917h;
    }

    /* renamed from: a */
    public final C7864v mo54806a(int i) {
        return this.f17844e[i];
    }

    /* renamed from: a */
    public void mo54798a() {
    }

    /* renamed from: a */
    public void mo54799a(float f) {
    }

    /* renamed from: a */
    public /* synthetic */ void mo54807a(boolean z) {
        C7637d.CC.$default$a(this, z);
    }

    /* renamed from: b */
    public final int mo54808b(int i) {
        return this.f17842c[i];
    }

    /* renamed from: b */
    public void mo54800b() {
    }

    /* renamed from: d */
    public final C7482ac mo54809d() {
        return this.f17840a;
    }

    /* renamed from: e */
    public final int mo54810e() {
        return this.f17842c.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7627b bVar = (C7627b) obj;
        return this.f17840a == bVar.f17840a && Arrays.equals(this.f17842c, bVar.f17842c);
    }

    /* renamed from: f */
    public final C7864v mo54812f() {
        return this.f17844e[mo54801c()];
    }

    /* renamed from: g */
    public /* synthetic */ void mo54813g() {
        C7637d.CC.$default$g(this);
    }

    /* renamed from: h */
    public /* synthetic */ void mo54814h() {
        C7637d.CC.$default$h(this);
    }

    public int hashCode() {
        if (this.f17846g == 0) {
            this.f17846g = (System.identityHashCode(this.f17840a) * 31) + Arrays.hashCode(this.f17842c);
        }
        return this.f17846g;
    }
}
