package com.applovin.exoplayer2;

import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p219j.C7637d;
import com.applovin.exoplayer2.p220k.C7657b;
import com.applovin.exoplayer2.p220k.C7677m;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.ads.AdSize;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.applovin.exoplayer2.l */
public class C7716l implements C6786aa {

    /* renamed from: a */
    private final C7677m f18218a;

    /* renamed from: b */
    private final long f18219b;

    /* renamed from: c */
    private final long f18220c;

    /* renamed from: d */
    private final long f18221d;

    /* renamed from: e */
    private final long f18222e;

    /* renamed from: f */
    private final int f18223f;

    /* renamed from: g */
    private final boolean f18224g;

    /* renamed from: h */
    private final long f18225h;

    /* renamed from: i */
    private final boolean f18226i;

    /* renamed from: j */
    private int f18227j;

    /* renamed from: k */
    private boolean f18228k;

    public C7716l() {
        this(new C7677m(true, 65536), 50000, 50000, IronSourceConstants.IS_INSTANCE_NOT_FOUND, 5000, -1, false, 0, false);
    }

    protected C7716l(C7677m mVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        m22102a(i3, 0, "bufferForPlaybackMs", BuildConfig.ADAPTER_VERSION);
        m22102a(i4, 0, "bufferForPlaybackAfterRebufferMs", BuildConfig.ADAPTER_VERSION);
        m22102a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m22102a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m22102a(i2, i, "maxBufferMs", "minBufferMs");
        m22102a(i6, 0, "backBufferDurationMs", BuildConfig.ADAPTER_VERSION);
        this.f18218a = mVar;
        this.f18219b = C7476h.m20800b((long) i);
        this.f18220c = C7476h.m20800b((long) i2);
        this.f18221d = C7476h.m20800b((long) i3);
        this.f18222e = C7476h.m20800b((long) i4);
        this.f18223f = i5;
        this.f18227j = i5 == -1 ? 13107200 : i5;
        this.f18224g = z;
        this.f18225h = C7476h.m20800b((long) i6);
        this.f18226i = z2;
    }

    /* renamed from: a */
    private static int m22101a(int i) {
        switch (i) {
            case AdSize.AUTO_HEIGHT:
                return 0;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    private static void m22102a(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        C7717a.m22119a(z, (Object) str + " cannot be less than " + str2);
    }

    /* renamed from: a */
    private void m22103a(boolean z) {
        int i = this.f18223f;
        if (i == -1) {
            i = 13107200;
        }
        this.f18227j = i;
        this.f18228k = false;
        if (z) {
            this.f18218a.mo54920d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo54953a(C6827ar[] arVarArr, C7637d[] dVarArr) {
        int i = 0;
        for (int i2 = 0; i2 < arVarArr.length; i2++) {
            if (dVarArr[i2] != null) {
                i += m22101a(arVarArr[i2].mo52826a());
            }
        }
        return Math.max(13107200, i);
    }

    /* renamed from: a */
    public void mo52602a() {
        m22103a(false);
    }

    /* renamed from: a */
    public void mo52603a(C6827ar[] arVarArr, C7483ad adVar, C7637d[] dVarArr) {
        int i = this.f18223f;
        if (i == -1) {
            i = mo54953a(arVarArr, dVarArr);
        }
        this.f18227j = i;
        this.f18218a.mo54919a(i);
    }

    /* renamed from: a */
    public boolean mo52604a(long j, float f, boolean z, long j2) {
        long b = C7728ai.m22232b(j, f);
        long j3 = z ? this.f18222e : this.f18221d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || b >= j3 || (!this.f18224g && this.f18218a.mo54921e() >= this.f18227j);
    }

    /* renamed from: a */
    public boolean mo52605a(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.f18218a.mo54921e() >= this.f18227j;
        long j3 = this.f18219b;
        if (f > 1.0f) {
            j3 = Math.min(C7728ai.m22191a(j3, f), this.f18220c);
        }
        if (j2 < Math.max(j3, 500000)) {
            if (!this.f18224g && z2) {
                z = false;
            }
            this.f18228k = z;
            if (!z && j2 < 500000) {
                C7755q.m22361c("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f18220c || z2) {
            this.f18228k = false;
        }
        return this.f18228k;
    }

    /* renamed from: b */
    public void mo52606b() {
        m22103a(true);
    }

    /* renamed from: c */
    public void mo52607c() {
        m22103a(true);
    }

    /* renamed from: d */
    public C7657b mo52608d() {
        return this.f18218a;
    }

    /* renamed from: e */
    public long mo52609e() {
        return this.f18225h;
    }

    /* renamed from: f */
    public boolean mo52610f() {
        return this.f18226i;
    }
}
