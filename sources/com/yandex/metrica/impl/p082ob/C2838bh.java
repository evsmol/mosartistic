package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.bh */
public class C2838bh {

    /* renamed from: a */
    private ICommonExecutor f7478a;

    /* renamed from: b */
    private final ProtobufStateStorage<C2926eh> f7479b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2840b f7480c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3576v9 f7481d;

    /* renamed from: e */
    private final CacheControlHttpsConnectionPerformer f7482e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SystemTimeProvider f7483f;

    /* renamed from: g */
    private final C3318od f7484g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f7485h;

    /* renamed from: com.yandex.metrica.impl.ob.bh$a */
    class C2839a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2806ah f7486a;

        C2839a(C2806ah ahVar) {
            this.f7486a = ahVar;
        }

        public void run() {
            C2838bh bhVar = C2838bh.this;
            C2838bh.m9195a(bhVar, this.f7486a, bhVar.f7485h);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bh$b */
    public static class C2840b {

        /* renamed from: a */
        private final C3063ih f7488a;

        public C2840b() {
            this(new C3063ih());
        }

        /* renamed from: a */
        public List<C3034hh> mo17311a(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            if (C1848A2.m6811a(bArr)) {
                return arrayList;
            }
            try {
                return this.f7488a.mo17715a(new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                return arrayList;
            }
        }

        C2840b(C3063ih ihVar) {
            this.f7488a = ihVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2838bh(android.content.Context r10, java.lang.String r11, com.yandex.metrica.core.api.executors.ICommonExecutor r12) {
        /*
            r9 = this;
            java.lang.Class<com.yandex.metrica.impl.ob.eh> r11 = com.yandex.metrica.impl.p082ob.C2926eh.class
            com.yandex.metrica.impl.ob.fa r11 = com.yandex.metrica.impl.p082ob.C2947fa.C2949b.m9536a(r11)
            com.yandex.metrica.core.api.ProtobufStateStorage r2 = r11.mo17592a(r10)
            com.yandex.metrica.impl.ob.bh$b r3 = new com.yandex.metrica.impl.ob.bh$b
            r3.<init>()
            com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer r4 = new com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer
            com.yandex.metrica.impl.ob.F0 r11 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.sd r11 = r11.mo15757t()
            r11.getClass()
            r11 = 0
            r4.<init>(r11)
            com.yandex.metrica.impl.ob.v9 r6 = new com.yandex.metrica.impl.ob.v9
            r6.<init>()
            com.yandex.metrica.coreutils.services.SystemTimeProvider r7 = new com.yandex.metrica.coreutils.services.SystemTimeProvider
            r7.<init>()
            com.yandex.metrica.impl.ob.od r8 = new com.yandex.metrica.impl.ob.od
            r8.<init>(r10)
            r1 = 0
            r0 = r9
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2838bh.<init>(android.content.Context, java.lang.String, com.yandex.metrica.core.api.executors.ICommonExecutor):void");
    }

    /* renamed from: a */
    public void mo17307a(C2806ah ahVar) {
        this.f7478a.execute(new C2839a(ahVar));
    }

    /* renamed from: b */
    public boolean mo17309b(C3356pi piVar) {
        String str = this.f7485h;
        if (str != null) {
            return !str.equals(piVar.mo17958L());
        }
        if (piVar.mo17958L() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static void m9195a(C2838bh bhVar, C2806ah ahVar, String str) {
        if (bhVar.f7484g.canBeExecuted() && str != null) {
            bhVar.f7482e.performConnection(str, new C2870ch(bhVar, (C2926eh) bhVar.f7479b.read(), ahVar));
        }
    }

    C2838bh(String str, ProtobufStateStorage protobufStateStorage, C2840b bVar, CacheControlHttpsConnectionPerformer cacheControlHttpsConnectionPerformer, ICommonExecutor iCommonExecutor, C3576v9 v9Var, SystemTimeProvider systemTimeProvider, C3318od odVar) {
        this.f7485h = str;
        this.f7479b = protobufStateStorage;
        this.f7480c = bVar;
        this.f7482e = cacheControlHttpsConnectionPerformer;
        this.f7478a = iCommonExecutor;
        this.f7481d = v9Var;
        this.f7483f = systemTimeProvider;
        this.f7484g = odVar;
    }

    /* renamed from: a */
    public void mo17308a(C3356pi piVar) {
        if (piVar != null) {
            this.f7485h = piVar.mo17958L();
        }
    }
}
