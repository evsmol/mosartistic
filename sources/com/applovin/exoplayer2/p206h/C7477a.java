package com.applovin.exoplayer2.p206h;

import android.os.Handler;
import android.os.Looper;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.p185d.C7154g;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.C7512q;
import com.applovin.exoplayer2.p220k.C7654aa;
import com.applovin.exoplayer2.p221l.C7717a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.applovin.exoplayer2.h.a */
public abstract class C7477a implements C7509p {

    /* renamed from: a */
    private final ArrayList<C7509p.C7511b> f17127a = new ArrayList<>(1);

    /* renamed from: b */
    private final HashSet<C7509p.C7511b> f17128b = new HashSet<>(1);

    /* renamed from: c */
    private final C7512q.C7513a f17129c = new C7512q.C7513a();

    /* renamed from: d */
    private final C7154g.C7155a f17130d = new C7154g.C7155a();

    /* renamed from: e */
    private Looper f17131e;

    /* renamed from: f */
    private C6904ba f17132f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C7154g.C7155a mo54438a(int i, C7509p.C7510a aVar) {
        return this.f17130d.mo53817a(i, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C7512q.C7513a mo54439a(int i, C7509p.C7510a aVar, long j) {
        return this.f17129c.mo54550a(i, aVar, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C7512q.C7513a mo54440a(C7509p.C7510a aVar) {
        return this.f17129c.mo54550a(0, aVar, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54441a() {
    }

    /* renamed from: a */
    public final void mo54442a(Handler handler, C7154g gVar) {
        C7717a.m22120b(handler);
        C7717a.m22120b(gVar);
        this.f17130d.mo53820a(handler, gVar);
    }

    /* renamed from: a */
    public final void mo54443a(Handler handler, C7512q qVar) {
        C7717a.m22120b(handler);
        C7717a.m22120b(qVar);
        this.f17129c.mo54552a(handler, qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54444a(C6904ba baVar) {
        this.f17132f = baVar;
        Iterator<C7509p.C7511b> it = this.f17127a.iterator();
        while (it.hasNext()) {
            it.next().onSourceInfoRefreshed(this, baVar);
        }
    }

    /* renamed from: a */
    public final void mo54445a(C7154g gVar) {
        this.f17130d.mo53821a(gVar);
    }

    /* renamed from: a */
    public final void mo54446a(C7509p.C7511b bVar) {
        C7717a.m22120b(this.f17131e);
        boolean isEmpty = this.f17128b.isEmpty();
        this.f17128b.add(bVar);
        if (isEmpty) {
            mo54441a();
        }
    }

    /* renamed from: a */
    public final void mo54447a(C7509p.C7511b bVar, C7654aa aaVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f17131e;
        C7717a.m22118a(looper == null || looper == myLooper);
        C6904ba baVar = this.f17132f;
        this.f17127a.add(bVar);
        if (this.f17131e == null) {
            this.f17131e = myLooper;
            this.f17128b.add(bVar);
            mo54449a(aaVar);
        } else if (baVar != null) {
            mo54446a(bVar);
            bVar.onSourceInfoRefreshed(this, baVar);
        }
    }

    /* renamed from: a */
    public final void mo54448a(C7512q qVar) {
        this.f17129c.mo54558a(qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo54449a(C7654aa aaVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C7154g.C7155a mo54450b(C7509p.C7510a aVar) {
        return this.f17130d.mo53817a(0, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo54451b() {
    }

    /* renamed from: b */
    public final void mo54452b(C7509p.C7511b bVar) {
        boolean z = !this.f17128b.isEmpty();
        this.f17128b.remove(bVar);
        if (z && this.f17128b.isEmpty()) {
            mo54451b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo54453c();

    /* renamed from: c */
    public final void mo54454c(C7509p.C7511b bVar) {
        this.f17127a.remove(bVar);
        if (this.f17127a.isEmpty()) {
            this.f17131e = null;
            this.f17132f = null;
            this.f17128b.clear();
            mo54453c();
            return;
        }
        mo54452b(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo54455d() {
        return !this.f17128b.isEmpty();
    }

    /* renamed from: h */
    public /* synthetic */ C6904ba mo54456h() {
        return C7509p.CC.$default$h(this);
    }

    /* renamed from: i */
    public /* synthetic */ boolean mo54457i() {
        return C7509p.CC.$default$i(this);
    }
}
