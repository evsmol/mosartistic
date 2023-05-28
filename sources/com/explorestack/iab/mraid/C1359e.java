package com.explorestack.iab.mraid;

/* renamed from: com.explorestack.iab.mraid.e */
public final class C1359e {

    /* renamed from: a */
    public int f4172a;

    /* renamed from: b */
    public int f4173b;

    /* renamed from: c */
    public int f4174c;

    /* renamed from: d */
    public int f4175d;

    /* renamed from: e */
    public C1378l f4176e;

    /* renamed from: f */
    public boolean f4177f;

    public C1359e() {
        this(0, 0, 0, 0, C1378l.TopRight, true);
    }

    public C1359e(int i, int i2, int i3, int i4, C1378l lVar, boolean z) {
        this.f4172a = i;
        this.f4173b = i2;
        this.f4174c = i3;
        this.f4175d = i4;
        this.f4176e = lVar;
        this.f4177f = z;
    }

    public String toString() {
        return "MRAIDResizeProperties{width=" + this.f4172a + ", height=" + this.f4173b + ", offsetX=" + this.f4174c + ", offsetY=" + this.f4175d + ", customClosePosition=" + this.f4176e + ", allowOffscreen=" + this.f4177f + '}';
    }
}
