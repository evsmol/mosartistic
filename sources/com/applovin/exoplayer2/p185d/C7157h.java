package com.applovin.exoplayer2.p185d;

import android.os.Looper;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p185d.C7152f;
import com.applovin.exoplayer2.p185d.C7154g;
import com.facebook.ads.AdError;

/* renamed from: com.applovin.exoplayer2.d.h */
public interface C7157h {

    /* renamed from: b */
    public static final C7157h f15737b;
    @Deprecated

    /* renamed from: c */
    public static final C7157h f15738c;

    /* renamed from: com.applovin.exoplayer2.d.h$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static C7159a $default$a(C7157h hVar, Looper looper, C7154g.C7155a aVar, C7864v vVar) {
            return C7159a.f15739b;
        }

        public static void $default$a(C7157h hVar) {
        }

        public static void $default$b(C7157h hVar) {
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.h$a */
    public interface C7159a {

        /* renamed from: b */
        public static final C7159a f15739b = $$Lambda$h$a$WekmMZBCOPnaK1rR9s28oPGmUM.INSTANCE;

        /* renamed from: com.applovin.exoplayer2.d.h$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: a */
            public static /* synthetic */ void m19157a() {
            }
        }

        void release();
    }

    static {
        C71581 r0 = new C7157h() {
            /* renamed from: a */
            public int mo53779a(C7864v vVar) {
                return vVar.f18924o != null ? 1 : 0;
            }

            /* renamed from: a */
            public /* synthetic */ C7159a mo53780a(Looper looper, C7154g.C7155a aVar, C7864v vVar) {
                return CC.$default$a(this, looper, aVar, vVar);
            }

            /* renamed from: a */
            public /* synthetic */ void mo53781a() {
                CC.$default$a(this);
            }

            /* renamed from: b */
            public C7152f mo53783b(Looper looper, C7154g.C7155a aVar, C7864v vVar) {
                if (vVar.f18924o == null) {
                    return null;
                }
                return new C7166l(new C7152f.C7153a(new C7179t(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
            }

            /* renamed from: b */
            public /* synthetic */ void mo53784b() {
                CC.$default$b(this);
            }
        };
        f15737b = r0;
        f15738c = r0;
    }

    /* renamed from: a */
    int mo53779a(C7864v vVar);

    /* renamed from: a */
    C7159a mo53780a(Looper looper, C7154g.C7155a aVar, C7864v vVar);

    /* renamed from: a */
    void mo53781a();

    /* renamed from: b */
    C7152f mo53783b(Looper looper, C7154g.C7155a aVar, C7864v vVar);

    /* renamed from: b */
    void mo53784b();
}
