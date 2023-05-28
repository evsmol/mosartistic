package com.applovin.exoplayer2.p209i;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.p182c.C6925i;
import com.applovin.exoplayer2.p182c.C6927j;
import com.applovin.exoplayer2.p221l.C7717a;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.i.d */
public abstract class C7572d extends C6927j<C7619j, C7620k, C7600h> implements C7588g {

    /* renamed from: a */
    private final String f17611a;

    protected C7572d(String str) {
        super(new C7619j[2], new C7620k[2]);
        this.f17611a = str;
        mo53150a(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C7585f mo54699a(byte[] bArr, int i, boolean z) throws C7600h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C7600h mo53148a(C7619j jVar, C7620k kVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C7717a.m22120b(jVar.f15332b);
            C7620k kVar2 = kVar;
            kVar2.mo54792a(jVar.f15334d, mo54699a(byteBuffer.array(), byteBuffer.limit(), z), jVar.f17798f);
            kVar.mo53125c(RecyclerView.UNDEFINED_DURATION);
            return null;
        } catch (C7600h e) {
            return e;
        }
    }

    /* renamed from: a */
    public void mo54658a(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C7600h mo53149a(Throwable th) {
        return new C7600h("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C7619j mo53155g() {
        return new C7619j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C7620k mo53156h() {
        return new C7578e(new C6925i.C6926a() {
            public final void releaseOutputBuffer(C6925i iVar) {
                C7572d.this.mo53152a((C7620k) iVar);
            }
        });
    }
}
