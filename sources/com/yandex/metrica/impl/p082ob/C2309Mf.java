package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Mf */
public final class C2309Mf {

    /* renamed from: a */
    private final ICommonExecutor f6197a;

    /* renamed from: b */
    private final C2522Sf f6198b;

    /* renamed from: c */
    private final C2243Kf f6199c;

    /* renamed from: d */
    private final C2252Kn<String> f6200d;

    /* renamed from: e */
    private final C2252Kn<String> f6201e;

    /* renamed from: com.yandex.metrica.impl.ob.Mf$a */
    public static final class C2310a extends C2933em {

        /* renamed from: a */
        final /* synthetic */ C2309Mf f6202a;

        /* renamed from: b */
        final /* synthetic */ int f6203b;

        /* renamed from: c */
        final /* synthetic */ String f6204c;

        /* renamed from: d */
        final /* synthetic */ String f6205d;

        /* renamed from: e */
        final /* synthetic */ Map f6206e;

        /* renamed from: f */
        final /* synthetic */ Map f6207f;

        C2310a(C2309Mf mf, int i, String str, String str2, Map map, Map map2) {
            this.f6202a = mf;
            this.f6203b = i;
            this.f6204c = str;
            this.f6205d = str2;
            this.f6206e = map;
            this.f6207f = map2;
        }

        /* renamed from: a */
        public void mo15597a() {
            C2309Mf.m7942a(this.f6202a).mo15477a(this.f6203b, this.f6204c, this.f6205d, this.f6206e, this.f6207f);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Mf$b */
    public static final class C2311b extends C2933em {

        /* renamed from: a */
        final /* synthetic */ C2309Mf f6208a;

        /* renamed from: b */
        final /* synthetic */ String f6209b;

        /* renamed from: c */
        final /* synthetic */ byte[] f6210c;

        C2311b(C2309Mf mf, String str, byte[] bArr) {
            this.f6208a = mf;
            this.f6209b = str;
            this.f6210c = bArr;
        }

        /* renamed from: a */
        public void mo15597a() {
            C2309Mf.m7942a(this.f6208a).mo15483a(this.f6209b, this.f6210c);
        }
    }

    public C2309Mf(ICommonExecutor iCommonExecutor, C2522Sf sf, C2243Kf kf, C2252Kn<String> kn, C2252Kn<String> kn2) {
        this.f6197a = iCommonExecutor;
        this.f6198b = sf;
        this.f6199c = kf;
        this.f6200d = kn;
        this.f6201e = kn2;
    }

    /* renamed from: a */
    public final void mo16297a(int i, String str, String str2, Map<String, String> map, Map<String, byte[]> map2) {
        this.f6199c.mo15517a(null);
        this.f6200d.mo15517a(str);
        this.f6197a.execute(new C2310a(this, i, str, str2, map, map2));
    }

    public C2309Mf(ICommonExecutor iCommonExecutor) {
        this(iCommonExecutor, new C2522Sf());
    }

    private C2309Mf(ICommonExecutor iCommonExecutor, C2522Sf sf) {
        this(iCommonExecutor, sf, new C2243Kf(sf), new C2103Hn(new C2069Gn("Event name")), new C2103Hn(new C2069Gn("Session extra key")));
    }

    /* renamed from: a */
    public final void mo16298a(String str, byte[] bArr) {
        this.f6201e.mo15517a(str);
        this.f6197a.execute(new C2311b(this, str, bArr));
    }

    /* renamed from: a */
    public final boolean mo16299a() {
        this.f6198b.getClass();
        return C2470R2.m8229h();
    }

    /* renamed from: a */
    public static final C2214K0 m7942a(C2309Mf mf) {
        mf.f6198b.getClass();
        C2470R2 k = C2470R2.m8232k();
        Intrinsics.checkNotNull(k);
        Intrinsics.checkNotNullExpressionValue(k, "provider.peekInitializedImpl()!!");
        C3110k1 d = k.mo16545d();
        Intrinsics.checkNotNull(d);
        Intrinsics.checkNotNullExpressionValue(d, "provider.peekInitialized…rterApiConsumerProvider!!");
        C2214K0 b = d.mo17772b();
        Intrinsics.checkNotNullExpressionValue(b, "provider.peekInitialized…erProvider!!.mainReporter");
        return b;
    }
}
