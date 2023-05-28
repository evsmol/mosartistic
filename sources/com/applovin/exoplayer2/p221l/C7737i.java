package com.applovin.exoplayer2.p221l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.exoplayer2.l.i */
public final class C7737i<E> implements Iterable<E> {

    /* renamed from: a */
    private final Object f18274a = new Object();

    /* renamed from: b */
    private final Map<E, Integer> f18275b = new HashMap();

    /* renamed from: c */
    private Set<E> f18276c = Collections.emptySet();

    /* renamed from: d */
    private List<E> f18277d = Collections.emptyList();

    /* renamed from: a */
    public Set<E> mo54997a() {
        Set<E> set;
        synchronized (this.f18274a) {
            set = this.f18276c;
        }
        return set;
    }

    /* renamed from: a */
    public void mo54998a(E e) {
        synchronized (this.f18274a) {
            ArrayList arrayList = new ArrayList(this.f18277d);
            arrayList.add(e);
            this.f18277d = Collections.unmodifiableList(arrayList);
            Integer num = this.f18275b.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f18276c);
                hashSet.add(e);
                this.f18276c = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f18275b;
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            map.put(e, Integer.valueOf(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo54999b(E r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f18274a
            monitor-enter(r0)
            java.util.Map<E, java.lang.Integer> r1 = r4.f18275b     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x000f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x004c }
            java.util.List<E> r3 = r4.f18277d     // Catch:{ all -> 0x004c }
            r2.<init>(r3)     // Catch:{ all -> 0x004c }
            r2.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x004c }
            r4.f18277d = r2     // Catch:{ all -> 0x004c }
            int r2 = r1.intValue()     // Catch:{ all -> 0x004c }
            r3 = 1
            if (r2 != r3) goto L_0x003c
            java.util.Map<E, java.lang.Integer> r1 = r4.f18275b     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x004c }
            java.util.Set<E> r2 = r4.f18276c     // Catch:{ all -> 0x004c }
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ all -> 0x004c }
            r4.f18276c = r5     // Catch:{ all -> 0x004c }
            goto L_0x004a
        L_0x003c:
            java.util.Map<E, java.lang.Integer> r2 = r4.f18275b     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x004c }
            r2.put(r5, r1)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x004c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p221l.C7737i.mo54999b(java.lang.Object):void");
    }

    /* renamed from: c */
    public int mo55000c(E e) {
        int intValue;
        synchronized (this.f18274a) {
            intValue = this.f18275b.containsKey(e) ? this.f18275b.get(e).intValue() : 0;
        }
        return intValue;
    }

    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f18274a) {
            it = this.f18277d.iterator();
        }
        return it;
    }
}
