package com.yandex.metrica.impl.p082ob;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.N5 */
public class C2331N5 {

    /* renamed from: a */
    private boolean f6241a;

    /* renamed from: b */
    private Set<Integer> f6242b;

    /* renamed from: c */
    private int f6243c;

    /* renamed from: d */
    private int f6244d;

    public C2331N5() {
        this(false, 0, 0, new HashSet());
    }

    /* renamed from: a */
    public void mo16332a() {
        this.f6242b = new HashSet();
        this.f6244d = 0;
    }

    /* renamed from: b */
    public Set<Integer> mo16335b() {
        return this.f6242b;
    }

    /* renamed from: c */
    public int mo16337c() {
        return this.f6244d;
    }

    /* renamed from: d */
    public int mo16338d() {
        return this.f6243c;
    }

    /* renamed from: e */
    public boolean mo16339e() {
        return this.f6241a;
    }

    public C2331N5(boolean z, int i, int i2, Set<Integer> set) {
        this.f6241a = z;
        this.f6242b = set;
        this.f6243c = i;
        this.f6244d = i2;
    }

    /* renamed from: b */
    public void mo16336b(int i) {
        this.f6243c = i;
        this.f6244d = 0;
    }

    /* renamed from: a */
    public void mo16334a(boolean z) {
        this.f6241a = z;
    }

    /* renamed from: a */
    public void mo16333a(int i) {
        this.f6242b.add(Integer.valueOf(i));
        this.f6244d++;
    }
}
