package com.applovin.exoplayer2.p197f;

import java.util.NoSuchElementException;

/* renamed from: com.applovin.exoplayer2.f.f */
final class C7375f {

    /* renamed from: a */
    private int f16860a = 0;

    /* renamed from: b */
    private int f16861b = -1;

    /* renamed from: c */
    private int f16862c = 0;

    /* renamed from: d */
    private int[] f16863d;

    /* renamed from: e */
    private int f16864e;

    public C7375f() {
        int[] iArr = new int[16];
        this.f16863d = iArr;
        this.f16864e = iArr.length - 1;
    }

    /* renamed from: d */
    private void m20392d() {
        int[] iArr = this.f16863d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i = this.f16860a;
            int i2 = length2 - i;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f16863d, 0, iArr2, i2, i);
            this.f16860a = 0;
            this.f16861b = this.f16862c - 1;
            this.f16863d = iArr2;
            this.f16864e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public int mo54154a() {
        int i = this.f16862c;
        if (i != 0) {
            int[] iArr = this.f16863d;
            int i2 = this.f16860a;
            int i3 = iArr[i2];
            this.f16860a = (i2 + 1) & this.f16864e;
            this.f16862c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public void mo54155a(int i) {
        if (this.f16862c == this.f16863d.length) {
            m20392d();
        }
        int i2 = (this.f16861b + 1) & this.f16864e;
        this.f16861b = i2;
        this.f16863d[i2] = i;
        this.f16862c++;
    }

    /* renamed from: b */
    public boolean mo54156b() {
        return this.f16862c == 0;
    }

    /* renamed from: c */
    public void mo54157c() {
        this.f16860a = 0;
        this.f16861b = -1;
        this.f16862c = 0;
    }
}
