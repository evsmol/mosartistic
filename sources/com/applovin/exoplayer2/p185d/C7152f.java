package com.applovin.exoplayer2.p185d;

import com.applovin.exoplayer2.p182c.C6915b;
import com.applovin.exoplayer2.p185d.C7154g;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.exoplayer2.d.f */
public interface C7152f {

    /* renamed from: com.applovin.exoplayer2.d.f$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$d(C7152f fVar) {
            return false;
        }

        /* renamed from: a */
        public static void m19124a(C7152f fVar, C7152f fVar2) {
            if (fVar != fVar2) {
                if (fVar2 != null) {
                    fVar2.mo53758a((C7154g.C7155a) null);
                }
                if (fVar != null) {
                    fVar.mo53763b((C7154g.C7155a) null);
                }
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.f$a */
    public static class C7153a extends IOException {

        /* renamed from: a */
        public final int f15731a;

        public C7153a(Throwable th, int i) {
            super(th);
            this.f15731a = i;
        }
    }

    /* renamed from: a */
    void mo53758a(C7154g.C7155a aVar);

    /* renamed from: a */
    boolean mo53760a(String str);

    /* renamed from: b */
    void mo53763b(C7154g.C7155a aVar);

    /* renamed from: c */
    int mo53764c();

    /* renamed from: d */
    boolean mo53765d();

    /* renamed from: e */
    C7153a mo53766e();

    /* renamed from: f */
    UUID mo53767f();

    /* renamed from: g */
    C6915b mo53768g();

    /* renamed from: h */
    Map<String, String> mo53769h();
}
