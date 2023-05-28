package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C4714c;
import com.ironsource.sdk.p144g.C4936d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.h */
public final class C4653h {

    /* renamed from: a */
    public ArrayList<InterstitialPlacement> f11615a;

    /* renamed from: b */
    public C4936d f11616b;

    /* renamed from: c */
    public int f11617c;

    /* renamed from: d */
    public boolean f11618d;

    /* renamed from: e */
    public int f11619e;

    /* renamed from: f */
    public int f11620f;

    /* renamed from: g */
    public String f11621g;

    /* renamed from: h */
    public String f11622h;

    /* renamed from: i */
    public C4714c f11623i;

    /* renamed from: j */
    public InterstitialPlacement f11624j;

    public C4653h() {
        this.f11615a = new ArrayList<>();
        this.f11616b = new C4936d();
    }

    public C4653h(int i, boolean z, int i2, C4936d dVar, C4714c cVar, int i3) {
        this.f11615a = new ArrayList<>();
        this.f11617c = i;
        this.f11618d = z;
        this.f11619e = i2;
        this.f11616b = dVar;
        this.f11623i = cVar;
        this.f11620f = i3;
    }

    /* renamed from: a */
    public final InterstitialPlacement mo34030a() {
        Iterator<InterstitialPlacement> it = this.f11615a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f11624j;
    }
}
