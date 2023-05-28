package com.applovin.exoplayer2.p206h;

import android.content.Context;
import android.util.SparseArray;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p206h.C7524u;
import com.applovin.exoplayer2.p220k.C7670i;
import com.applovin.exoplayer2.p220k.C7681o;

/* renamed from: com.applovin.exoplayer2.h.f */
public final class C7494f implements C7515r {

    /* renamed from: a */
    private final C7670i.C7671a f17200a;

    /* renamed from: b */
    private final SparseArray<C7515r> f17201b;

    /* renamed from: c */
    private final int[] f17202c;

    /* renamed from: d */
    private long f17203d;

    /* renamed from: e */
    private long f17204e;

    /* renamed from: f */
    private long f17205f;

    /* renamed from: g */
    private float f17206g;

    /* renamed from: h */
    private float f17207h;

    public C7494f(Context context, C7340l lVar) {
        this((C7670i.C7671a) new C7681o.C7682a(context), lVar);
    }

    public C7494f(C7670i.C7671a aVar, C7340l lVar) {
        this.f17200a = aVar;
        SparseArray<C7515r> a = m20919a(aVar, lVar);
        this.f17201b = a;
        this.f17202c = new int[a.size()];
        for (int i = 0; i < this.f17201b.size(); i++) {
            this.f17202c[i] = this.f17201b.keyAt(i);
        }
        this.f17203d = -9223372036854775807L;
        this.f17204e = -9223372036854775807L;
        this.f17205f = -9223372036854775807L;
        this.f17206g = -3.4028235E38f;
        this.f17207h = -3.4028235E38f;
    }

    /* renamed from: a */
    private static SparseArray<C7515r> m20919a(C7670i.C7671a aVar, C7340l lVar) {
        SparseArray<C7515r> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (C7515r) Class.forName("com.applovin.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(C7515r.class).getConstructor(new Class[]{C7670i.C7671a.class}).newInstance(new Object[]{aVar}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (C7515r) Class.forName("com.applovin.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(C7515r.class).getConstructor(new Class[]{C7670i.C7671a.class}).newInstance(new Object[]{aVar}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (C7515r) Class.forName("com.applovin.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(C7515r.class).getConstructor(new Class[]{C7670i.C7671a.class}).newInstance(new Object[]{aVar}));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (C7515r) Class.forName("com.applovin.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(C7515r.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new C7524u.C7526a(aVar, lVar));
        return sparseArray;
    }
}
