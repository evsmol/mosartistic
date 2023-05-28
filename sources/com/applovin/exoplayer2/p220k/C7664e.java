package com.applovin.exoplayer2.p220k;

import com.applovin.exoplayer2.p220k.C7670i;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.k.e */
public abstract class C7664e implements C7670i {

    /* renamed from: a */
    private final boolean f18036a;

    /* renamed from: b */
    private final ArrayList<C7654aa> f18037b = new ArrayList<>(1);

    /* renamed from: c */
    private int f18038c;

    /* renamed from: d */
    private C7674l f18039d;

    protected C7664e(boolean z) {
        this.f18036a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54897a(int i) {
        C7674l lVar = (C7674l) C7728ai.m22198a(this.f18039d);
        for (int i2 = 0; i2 < this.f18038c; i2++) {
            this.f18037b.get(i2).mo54882a(this, lVar, this.f18036a, i);
        }
    }

    /* renamed from: a */
    public final void mo54524a(C7654aa aaVar) {
        C7717a.m22120b(aaVar);
        if (!this.f18037b.contains(aaVar)) {
            this.f18037b.add(aaVar);
            this.f18038c++;
        }
    }

    /* renamed from: b */
    public /* synthetic */ Map<String, List<String>> mo54525b() {
        return C7670i.CC.$default$b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo54898b(C7674l lVar) {
        for (int i = 0; i < this.f18038c; i++) {
            this.f18037b.get(i).mo54881a(this, lVar, this.f18036a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo54899c(C7674l lVar) {
        this.f18039d = lVar;
        for (int i = 0; i < this.f18038c; i++) {
            this.f18037b.get(i).mo54883b(this, lVar, this.f18036a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo54900d() {
        C7674l lVar = (C7674l) C7728ai.m22198a(this.f18039d);
        for (int i = 0; i < this.f18038c; i++) {
            this.f18037b.get(i).mo54884c(this, lVar, this.f18036a);
        }
        this.f18039d = null;
    }
}
