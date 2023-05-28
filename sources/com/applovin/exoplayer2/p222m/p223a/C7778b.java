package com.applovin.exoplayer2.p222m.p223a;

import com.applovin.exoplayer2.C6829as;
import com.applovin.exoplayer2.C7181e;
import com.applovin.exoplayer2.C7819p;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.m.a.b */
public final class C7778b extends C7181e {

    /* renamed from: a */
    private final C6922g f18363a = new C6922g(1);

    /* renamed from: b */
    private final C7772y f18364b = new C7772y();

    /* renamed from: c */
    private long f18365c;

    /* renamed from: d */
    private C7777a f18366d;

    /* renamed from: e */
    private long f18367e;

    public C7778b() {
        super(6);
    }

    /* renamed from: B */
    private void m22502B() {
        C7777a aVar = this.f18366d;
        if (aVar != null) {
            aVar.mo52888a();
        }
    }

    /* renamed from: a */
    private float[] m22503a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f18364b.mo55070a(byteBuffer.array(), byteBuffer.limit());
        this.f18364b.mo55076d(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f18364b.mo55094r());
        }
        return fArr;
    }

    /* renamed from: A */
    public boolean mo52825A() {
        return mo52838g();
    }

    /* renamed from: a */
    public int mo52851a(C7864v vVar) {
        return C6829as.CC.m17728b("application/x-camera-motion".equals(vVar.f18921l) ? 4 : 0);
    }

    /* renamed from: a */
    public void mo52821a(int i, Object obj) throws C7819p {
        if (i == 8) {
            this.f18366d = (C7777a) obj;
        } else {
            super.mo52821a(i, obj);
        }
    }

    /* renamed from: a */
    public void mo52830a(long j, long j2) {
        while (!mo52838g() && this.f18367e < 100000 + j) {
            this.f18363a.mo53121a();
            if (mo53848a(mo53853t(), this.f18363a, 0) == -4 && !this.f18363a.mo53126c()) {
                this.f18367e = this.f18363a.f15334d;
                if (this.f18366d != null && !this.f18363a.mo53124b()) {
                    this.f18363a.mo53143h();
                    float[] a = m22503a((ByteBuffer) C7728ai.m22198a(this.f18363a.f15332b));
                    if (a != null) {
                        ((C7777a) C7728ai.m22198a(this.f18366d)).mo52890a(this.f18367e - this.f18365c, a);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53044a(long j, boolean z) {
        this.f18367e = Long.MIN_VALUE;
        m22502B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53851a(C7864v[] vVarArr, long j, long j2) {
        this.f18365c = j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo53058r() {
        m22502B();
    }

    /* renamed from: y */
    public String mo52846y() {
        return "CameraMotionRenderer";
    }

    /* renamed from: z */
    public boolean mo52847z() {
        return true;
    }
}
