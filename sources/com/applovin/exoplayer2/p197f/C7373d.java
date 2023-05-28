package com.applovin.exoplayer2.p197f;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p221l.C7717a;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.f.d */
final class C7373d extends C6922g {

    /* renamed from: f */
    private long f16854f;

    /* renamed from: g */
    private int f16855g;

    /* renamed from: h */
    private int f16856h = 32;

    public C7373d() {
        super(2);
    }

    /* renamed from: b */
    private boolean m20380b(C6922g gVar) {
        if (!mo54150l()) {
            return true;
        }
        if (this.f16855g >= this.f16856h || gVar.mo53124b() != mo53124b()) {
            return false;
        }
        ByteBuffer byteBuffer = gVar.f15332b;
        return byteBuffer == null || this.f15332b == null || this.f15332b.position() + byteBuffer.remaining() <= 3072000;
    }

    /* renamed from: a */
    public void mo53121a() {
        super.mo53121a();
        this.f16855g = 0;
    }

    /* renamed from: a */
    public boolean mo54145a(C6922g gVar) {
        C7717a.m22118a(!gVar.mo53142g());
        C7717a.m22118a(!gVar.mo53129e());
        C7717a.m22118a(!gVar.mo53126c());
        if (!m20380b(gVar)) {
            return false;
        }
        int i = this.f16855g;
        this.f16855g = i + 1;
        if (i == 0) {
            this.f15334d = gVar.f15334d;
            if (gVar.mo53127d()) {
                mo53122a_(1);
            }
        }
        if (gVar.mo53124b()) {
            mo53122a_(RecyclerView.UNDEFINED_DURATION);
        }
        ByteBuffer byteBuffer = gVar.f15332b;
        if (byteBuffer != null) {
            mo53141f(byteBuffer.remaining());
            this.f15332b.put(byteBuffer);
        }
        this.f16854f = gVar.f15334d;
        return true;
    }

    /* renamed from: g */
    public void mo54146g(int i) {
        C7717a.m22118a(i > 0);
        this.f16856h = i;
    }

    /* renamed from: i */
    public long mo54147i() {
        return this.f15334d;
    }

    /* renamed from: j */
    public long mo54148j() {
        return this.f16854f;
    }

    /* renamed from: k */
    public int mo54149k() {
        return this.f16855g;
    }

    /* renamed from: l */
    public boolean mo54150l() {
        return this.f16855g > 0;
    }
}
