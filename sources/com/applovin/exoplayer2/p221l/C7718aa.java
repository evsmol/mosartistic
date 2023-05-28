package com.applovin.exoplayer2.p221l;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: com.applovin.exoplayer2.l.aa */
public final class C7718aa {

    /* renamed from: a */
    private final Object f18229a = new Object();

    /* renamed from: b */
    private final PriorityQueue<Integer> f18230b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c */
    private int f18231c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: a */
    public void mo54958a(int i) {
        synchronized (this.f18229a) {
            this.f18230b.add(Integer.valueOf(i));
            this.f18231c = Math.max(this.f18231c, i);
        }
    }

    /* renamed from: b */
    public void mo54959b(int i) {
        synchronized (this.f18229a) {
            this.f18230b.remove(Integer.valueOf(i));
            this.f18231c = this.f18230b.isEmpty() ? RecyclerView.UNDEFINED_DURATION : ((Integer) C7728ai.m22198a(this.f18230b.peek())).intValue();
            this.f18229a.notifyAll();
        }
    }
}
