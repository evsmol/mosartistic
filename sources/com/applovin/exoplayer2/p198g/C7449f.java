package com.applovin.exoplayer2.p198g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.C6829as;
import com.applovin.exoplayer2.C7181e;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.C7867w;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.g.f */
public final class C7449f extends C7181e implements Handler.Callback {

    /* renamed from: a */
    private final C7410c f17058a;

    /* renamed from: b */
    private final C7422e f17059b;

    /* renamed from: c */
    private final Handler f17060c;

    /* renamed from: d */
    private final C7416d f17061d;

    /* renamed from: e */
    private C7405b f17062e;

    /* renamed from: f */
    private boolean f17063f;

    /* renamed from: g */
    private boolean f17064g;

    /* renamed from: h */
    private long f17065h;

    /* renamed from: i */
    private long f17066i;

    /* renamed from: j */
    private C7399a f17067j;

    public C7449f(C7422e eVar, Looper looper) {
        this(eVar, looper, C7410c.f16991a);
    }

    public C7449f(C7422e eVar, Looper looper, C7410c cVar) {
        super(5);
        this.f17059b = (C7422e) C7717a.m22120b(eVar);
        this.f17060c = looper == null ? null : C7728ai.m22196a(looper, (Handler.Callback) this);
        this.f17058a = (C7410c) C7717a.m22120b(cVar);
        this.f17061d = new C7416d();
        this.f17066i = -9223372036854775807L;
    }

    /* renamed from: B */
    private void m20726B() {
        if (!this.f17063f && this.f17067j == null) {
            this.f17061d.mo53121a();
            C7867w t = mo53853t();
            int a = mo53848a(t, (C6922g) this.f17061d, 0);
            if (a == -4) {
                if (this.f17061d.mo53126c()) {
                    this.f17063f = true;
                    return;
                }
                this.f17061d.f17002f = this.f17065h;
                this.f17061d.mo53143h();
                C7399a a2 = ((C7405b) C7728ai.m22198a(this.f17062e)).mo54224a(this.f17061d);
                if (a2 != null) {
                    ArrayList arrayList = new ArrayList(a2.mo54200a());
                    m20728a(a2, (List<C7399a.C7401a>) arrayList);
                    if (!arrayList.isEmpty()) {
                        this.f17067j = new C7399a((List<? extends C7399a.C7401a>) arrayList);
                        this.f17066i = this.f17061d.f15334d;
                    }
                }
            } else if (a == -5) {
                this.f17065h = ((C7864v) C7717a.m22120b(t.f18967b)).f18925p;
            }
        }
    }

    /* renamed from: a */
    private void m20727a(C7399a aVar) {
        Handler handler = this.f17060c;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            m20729b(aVar);
        }
    }

    /* renamed from: a */
    private void m20728a(C7399a aVar, List<C7399a.C7401a> list) {
        for (int i = 0; i < aVar.mo54200a(); i++) {
            C7864v a = aVar.mo54201a(i).mo54213a();
            if (a == null || !this.f17058a.mo54236a(a)) {
                list.add(aVar.mo54201a(i));
            } else {
                C7405b b = this.f17058a.mo54237b(a);
                byte[] bArr = (byte[]) C7717a.m22120b(aVar.mo54201a(i).mo54215b());
                this.f17061d.mo53121a();
                this.f17061d.mo53141f(bArr.length);
                ((ByteBuffer) C7728ai.m22198a(this.f17061d.f15332b)).put(bArr);
                this.f17061d.mo53143h();
                C7399a a2 = b.mo54224a(this.f17061d);
                if (a2 != null) {
                    m20728a(a2, list);
                }
            }
        }
    }

    /* renamed from: b */
    private void m20729b(C7399a aVar) {
        this.f17059b.mo52876a(aVar);
    }

    /* renamed from: c */
    private boolean m20730c(long j) {
        boolean z;
        C7399a aVar = this.f17067j;
        if (aVar == null || this.f17066i > j) {
            z = false;
        } else {
            m20727a(aVar);
            this.f17067j = null;
            this.f17066i = -9223372036854775807L;
            z = true;
        }
        if (this.f17063f && this.f17067j == null) {
            this.f17064g = true;
        }
        return z;
    }

    /* renamed from: A */
    public boolean mo52825A() {
        return this.f17064g;
    }

    /* renamed from: a */
    public int mo52851a(C7864v vVar) {
        if (!this.f17058a.mo54236a(vVar)) {
            return C6829as.CC.m17728b(0);
        }
        return C6829as.CC.m17728b(vVar.f18908E == 0 ? 4 : 2);
    }

    /* renamed from: a */
    public void mo52830a(long j, long j2) {
        boolean z = true;
        while (z) {
            m20726B();
            z = m20730c(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53044a(long j, boolean z) {
        this.f17067j = null;
        this.f17066i = -9223372036854775807L;
        this.f17063f = false;
        this.f17064g = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53851a(C7864v[] vVarArr, long j, long j2) {
        this.f17062e = this.f17058a.mo54237b(vVarArr[0]);
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m20729b((C7399a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo53058r() {
        this.f17067j = null;
        this.f17066i = -9223372036854775807L;
        this.f17062e = null;
    }

    /* renamed from: y */
    public String mo52846y() {
        return "MetadataRenderer";
    }

    /* renamed from: z */
    public boolean mo52847z() {
        return true;
    }
}
