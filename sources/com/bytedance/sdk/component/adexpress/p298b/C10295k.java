package com.bytedance.sdk.component.adexpress.p298b;

import com.bytedance.sdk.component.adexpress.p298b.C10292i;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.b.k */
/* compiled from: RenderRealChain */
public class C10295k implements C10292i.C10293a {

    /* renamed from: a */
    C10299n f25410a;

    /* renamed from: b */
    private List<C10292i> f25411b;

    /* renamed from: c */
    private C10291h f25412c;

    /* renamed from: d */
    private AtomicBoolean f25413d = new AtomicBoolean(false);

    public C10295k(List<C10292i> list, C10291h hVar) {
        this.f25411b = list;
        this.f25412c = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x000b A[LOOP:0: B:1:0x000b->B:4:0x001b, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63166a() {
        /*
            r2 = this;
            com.bytedance.sdk.component.adexpress.b.h r0 = r2.f25412c
            r0.mo1961a()
            java.util.List<com.bytedance.sdk.component.adexpress.b.i> r0 = r2.f25411b
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r0.next()
            com.bytedance.sdk.component.adexpress.b.i r1 = (com.bytedance.sdk.component.adexpress.p298b.C10292i) r1
            boolean r1 = r1.mo63161a(r2)
            if (r1 == 0) goto L_0x000b
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p298b.C10295k.mo63166a():void");
    }

    /* renamed from: a */
    public void mo63167a(C10292i iVar) {
        int indexOf = this.f25411b.indexOf(iVar);
        if (indexOf >= 0) {
            do {
                indexOf++;
                if (indexOf >= this.f25411b.size() || this.f25411b.get(indexOf).mo63161a(this)) {
                }
                indexOf++;
                return;
            } while (this.f25411b.get(indexOf).mo63161a(this));
        }
    }

    /* renamed from: b */
    public boolean mo63171b(C10292i iVar) {
        int indexOf = this.f25411b.indexOf(iVar);
        return indexOf < this.f25411b.size() - 1 && indexOf >= 0;
    }

    /* renamed from: b */
    public C10299n mo63170b() {
        return this.f25410a;
    }

    /* renamed from: a */
    public void mo63168a(C10299n nVar) {
        this.f25410a = nVar;
    }

    /* renamed from: a */
    public void mo63169a(boolean z) {
        this.f25413d.getAndSet(z);
    }

    /* renamed from: c */
    public boolean mo63172c() {
        return this.f25413d.get();
    }
}
