package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.p181b.C6861f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.applovin.exoplayer2.b.l */
public abstract class C6877l implements C6861f {

    /* renamed from: b */
    protected C6861f.C6862a f15077b = C6861f.C6862a.f15016a;

    /* renamed from: c */
    protected C6861f.C6862a f15078c = C6861f.C6862a.f15016a;

    /* renamed from: d */
    private C6861f.C6862a f15079d = C6861f.C6862a.f15016a;

    /* renamed from: e */
    private C6861f.C6862a f15080e = C6861f.C6862a.f15016a;

    /* renamed from: f */
    private ByteBuffer f15081f = f15015a;

    /* renamed from: g */
    private ByteBuffer f15082g = f15015a;

    /* renamed from: h */
    private boolean f15083h;

    /* renamed from: a */
    public final C6861f.C6862a mo52927a(C6861f.C6862a aVar) throws C6861f.C6863b {
        this.f15079d = aVar;
        this.f15080e = mo53008b(aVar);
        return mo52929a() ? this.f15080e : C6861f.C6862a.f15016a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ByteBuffer mo53007a(int i) {
        if (this.f15081f.capacity() < i) {
            this.f15081f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f15081f.clear();
        }
        ByteBuffer byteBuffer = this.f15081f;
        this.f15082g = byteBuffer;
        return byteBuffer;
    }

    /* renamed from: a */
    public boolean mo52929a() {
        return this.f15080e != C6861f.C6862a.f15016a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6861f.C6862a mo53008b(C6861f.C6862a aVar) throws C6861f.C6863b {
        return C6861f.C6862a.f15016a;
    }

    /* renamed from: b */
    public final void mo52930b() {
        this.f15083h = true;
        mo53010h();
    }

    /* renamed from: c */
    public ByteBuffer mo52931c() {
        ByteBuffer byteBuffer = this.f15082g;
        this.f15082g = f15015a;
        return byteBuffer;
    }

    /* renamed from: d */
    public boolean mo52932d() {
        return this.f15083h && this.f15082g == f15015a;
    }

    /* renamed from: e */
    public final void mo52933e() {
        this.f15082g = f15015a;
        this.f15083h = false;
        this.f15077b = this.f15079d;
        this.f15078c = this.f15080e;
        mo53011i();
    }

    /* renamed from: f */
    public final void mo52934f() {
        mo52933e();
        this.f15081f = f15015a;
        this.f15079d = C6861f.C6862a.f15016a;
        this.f15080e = C6861f.C6862a.f15016a;
        this.f15077b = C6861f.C6862a.f15016a;
        this.f15078c = C6861f.C6862a.f15016a;
        mo53012j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo53009g() {
        return this.f15082g.hasRemaining();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo53010h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo53011i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo53012j() {
    }
}
