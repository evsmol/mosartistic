package com.applovin.exoplayer2.p219j;

import com.applovin.exoplayer2.C6830at;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.j.k */
public final class C7649k {

    /* renamed from: a */
    public final int f17985a;

    /* renamed from: b */
    public final C6830at[] f17986b;

    /* renamed from: c */
    public final C7637d[] f17987c;

    /* renamed from: d */
    public final Object f17988d;

    public C7649k(C6830at[] atVarArr, C7637d[] dVarArr, Object obj) {
        this.f17986b = atVarArr;
        this.f17987c = (C7637d[]) dVarArr.clone();
        this.f17988d = obj;
        this.f17985a = atVarArr.length;
    }

    /* renamed from: a */
    public boolean mo54868a(int i) {
        return this.f17986b[i] != null;
    }

    /* renamed from: a */
    public boolean mo54869a(C7649k kVar) {
        if (kVar == null || kVar.f17987c.length != this.f17987c.length) {
            return false;
        }
        for (int i = 0; i < this.f17987c.length; i++) {
            if (!mo54870a(kVar, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo54870a(C7649k kVar, int i) {
        return kVar != null && C7728ai.m22218a((Object) this.f17986b[i], (Object) kVar.f17986b[i]) && C7728ai.m22218a((Object) this.f17987c[i], (Object) kVar.f17987c[i]);
    }
}
