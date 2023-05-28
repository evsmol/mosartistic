package com.applovin.exoplayer2.p206h;

import android.os.Handler;
import com.applovin.exoplayer2.C6787ab;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.p185d.C7154g;
import com.applovin.exoplayer2.p220k.C7654aa;
import com.applovin.exoplayer2.p220k.C7657b;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.h.p */
public interface C7509p {

    /* renamed from: com.applovin.exoplayer2.h.p$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static C6904ba $default$h(C7509p pVar) {
            return null;
        }

        public static boolean $default$i(C7509p pVar) {
            return true;
        }
    }

    /* renamed from: com.applovin.exoplayer2.h.p$a */
    public static final class C7510a extends C7508o {
        public C7510a(C7508o oVar) {
            super(oVar);
        }

        public C7510a(Object obj) {
            super(obj);
        }

        public C7510a(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public C7510a(Object obj, long j, int i) {
            super(obj, j, i);
        }

        /* renamed from: b */
        public C7510a mo54545a(Object obj) {
            return new C7510a(super.mo54545a(obj));
        }
    }

    /* renamed from: com.applovin.exoplayer2.h.p$b */
    public interface C7511b {
        void onSourceInfoRefreshed(C7509p pVar, C6904ba baVar);
    }

    /* renamed from: a */
    void mo54442a(Handler handler, C7154g gVar);

    /* renamed from: a */
    void mo54443a(Handler handler, C7512q qVar);

    /* renamed from: a */
    void mo54445a(C7154g gVar);

    /* renamed from: a */
    void mo54539a(C7506n nVar);

    /* renamed from: a */
    void mo54446a(C7511b bVar);

    /* renamed from: a */
    void mo54447a(C7511b bVar, C7654aa aaVar);

    /* renamed from: a */
    void mo54448a(C7512q qVar);

    /* renamed from: b */
    C7506n mo54541b(C7510a aVar, C7657b bVar, long j);

    /* renamed from: b */
    void mo54452b(C7511b bVar);

    /* renamed from: c */
    void mo54454c(C7511b bVar);

    /* renamed from: e */
    void mo54521e() throws IOException;

    /* renamed from: g */
    C6787ab mo54543g();

    /* renamed from: h */
    C6904ba mo54456h();

    /* renamed from: i */
    boolean mo54457i();
}
