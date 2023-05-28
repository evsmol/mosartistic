package com.applovin.exoplayer2.p222m;

import android.view.Surface;
import com.applovin.exoplayer2.p197f.C7380h;
import com.applovin.exoplayer2.p197f.C7381i;

/* renamed from: com.applovin.exoplayer2.m.g */
public class C7798g extends C7380h {

    /* renamed from: c */
    public final int f18447c;

    /* renamed from: d */
    public final boolean f18448d;

    public C7798g(Throwable th, C7381i iVar, Surface surface) {
        super(th, iVar);
        this.f18447c = System.identityHashCode(surface);
        this.f18448d = surface == null || surface.isValid();
    }
}
