package com.applovin.exoplayer2.p182c;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.applovin.exoplayer2.c.a */
public abstract class C6914a {

    /* renamed from: a */
    private int f15307a;

    /* renamed from: a */
    public void mo53121a() {
        this.f15307a = 0;
    }

    /* renamed from: a_ */
    public final void mo53122a_(int i) {
        this.f15307a = i;
    }

    /* renamed from: b */
    public final void mo53123b(int i) {
        this.f15307a = i | this.f15307a;
    }

    /* renamed from: b */
    public final boolean mo53124b() {
        return mo53128d(RecyclerView.UNDEFINED_DURATION);
    }

    /* renamed from: c */
    public final void mo53125c(int i) {
        this.f15307a = (~i) & this.f15307a;
    }

    /* renamed from: c */
    public final boolean mo53126c() {
        return mo53128d(4);
    }

    /* renamed from: d */
    public final boolean mo53127d() {
        return mo53128d(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo53128d(int i) {
        return (this.f15307a & i) == i;
    }

    /* renamed from: e */
    public final boolean mo53129e() {
        return mo53128d(268435456);
    }
}
