package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C4714c;
import com.ironsource.sdk.p144g.C4936d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.o */
public final class C4661o {

    /* renamed from: a */
    public ArrayList<Placement> f11657a;

    /* renamed from: b */
    public C4936d f11658b;

    /* renamed from: c */
    public int f11659c;

    /* renamed from: d */
    public boolean f11660d;

    /* renamed from: e */
    public int f11661e;

    /* renamed from: f */
    public String f11662f;

    /* renamed from: g */
    public String f11663g;

    /* renamed from: h */
    public int f11664h;

    /* renamed from: i */
    public int f11665i;

    /* renamed from: j */
    public int f11666j;

    /* renamed from: k */
    public Placement f11667k;

    /* renamed from: l */
    public C4714c f11668l;

    public C4661o() {
        this.f11657a = new ArrayList<>();
        this.f11658b = new C4936d();
    }

    public C4661o(int i, boolean z, int i2, int i3, int i4, C4936d dVar, C4714c cVar, int i5) {
        this.f11657a = new ArrayList<>();
        this.f11659c = i;
        this.f11660d = z;
        this.f11661e = i2;
        this.f11664h = i3;
        this.f11658b = dVar;
        this.f11665i = i4;
        this.f11668l = cVar;
        this.f11666j = i5;
    }

    /* renamed from: a */
    public final Placement mo34043a() {
        Iterator<Placement> it = this.f11657a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f11667k;
    }
}
