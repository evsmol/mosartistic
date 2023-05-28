package com.applovin.exoplayer2;

import com.applovin.exoplayer2.p206h.C7537z;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.ap */
final class C6825ap extends C6780a {

    /* renamed from: c */
    private final int f14865c;

    /* renamed from: d */
    private final int f14866d;

    /* renamed from: e */
    private final int[] f14867e;

    /* renamed from: f */
    private final int[] f14868f;

    /* renamed from: g */
    private final C6904ba[] f14869g;

    /* renamed from: h */
    private final Object[] f14870h;

    /* renamed from: i */
    private final HashMap<Object, Integer> f14871i = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6825ap(Collection<? extends C6803ag> collection, C7537z zVar) {
        super(false, zVar);
        int i = 0;
        int size = collection.size();
        this.f14867e = new int[size];
        this.f14868f = new int[size];
        this.f14869g = new C6904ba[size];
        this.f14870h = new Object[size];
        int i2 = 0;
        int i3 = 0;
        for (C6803ag agVar : collection) {
            this.f14869g[i3] = agVar.mo52713b();
            this.f14868f[i3] = i;
            this.f14867e[i3] = i2;
            i += this.f14869g[i3].mo52823b();
            i2 += this.f14869g[i3].mo52824c();
            this.f14870h[i3] = agVar.mo52712a();
            this.f14871i.put(this.f14870h[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f14865c = i;
        this.f14866d = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C6904ba> mo52822a() {
        return Arrays.asList(this.f14869g);
    }

    /* renamed from: b */
    public int mo52823b() {
        return this.f14865c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo52444b(int i) {
        return C7728ai.m22188a(this.f14867e, i + 1, false, false);
    }

    /* renamed from: c */
    public int mo52824c() {
        return this.f14866d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo52447c(int i) {
        return C7728ai.m22188a(this.f14868f, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo52449d(Object obj) {
        Integer num = this.f14871i.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C6904ba mo52450d(int i) {
        return this.f14869g[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo52451e(int i) {
        return this.f14867e[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo52452f(int i) {
        return this.f14868f[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object mo52453g(int i) {
        return this.f14870h[i];
    }
}
