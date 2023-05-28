package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C4714c;
import com.ironsource.sdk.p144g.C4936d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.e */
public final class C4650e {

    /* renamed from: a */
    public C4936d f11602a;

    /* renamed from: b */
    public long f11603b;

    /* renamed from: c */
    public ArrayList<C4651f> f11604c;

    /* renamed from: d */
    public C4651f f11605d;

    /* renamed from: e */
    public int f11606e;

    /* renamed from: f */
    public int f11607f;

    /* renamed from: g */
    public C4714c f11608g;

    /* renamed from: h */
    private int f11609h;

    public C4650e() {
        this.f11602a = new C4936d();
        this.f11604c = new ArrayList<>();
    }

    public C4650e(int i, long j, C4936d dVar, int i2, C4714c cVar, int i3) {
        this.f11604c = new ArrayList<>();
        this.f11609h = i;
        this.f11603b = j;
        this.f11602a = dVar;
        this.f11606e = i2;
        this.f11607f = i3;
        this.f11608g = cVar;
    }

    /* renamed from: a */
    public final C4651f mo34027a() {
        Iterator<C4651f> it = this.f11604c.iterator();
        while (it.hasNext()) {
            C4651f next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f11605d;
    }

    /* renamed from: a */
    public final C4651f mo34028a(String str) {
        Iterator<C4651f> it = this.f11604c.iterator();
        while (it.hasNext()) {
            C4651f next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
