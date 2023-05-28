package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.impl.p082ob.C1992Eg;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gd */
public class C2995gd extends C1992Eg {

    /* renamed from: m */
    private final C3208mc f7901m;

    /* renamed from: com.yandex.metrica.impl.ob.gd$b */
    public static class C2997b {

        /* renamed from: a */
        public final C3356pi f7902a;

        /* renamed from: b */
        public final C3208mc f7903b;

        public C2997b(C3356pi piVar, C3208mc mcVar) {
            this.f7902a = piVar;
            this.f7903b = mcVar;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.gd$c */
    public static class C2998c implements C1992Eg.C1996d<C2995gd, C2997b> {

        /* renamed from: a */
        private final Context f7904a;

        /* renamed from: b */
        private final C1927Cg f7905b;

        C2998c(Context context, C1927Cg cg) {
            this.f7904a = context;
            this.f7905b = cg;
        }

        /* renamed from: a */
        public C2995gd mo15618a(C2997b bVar) {
            C2995gd gdVar = new C2995gd(bVar.f7903b);
            C1927Cg cg = this.f7905b;
            Context context = this.f7904a;
            cg.getClass();
            gdVar.mo15697b(C1848A2.m6796a(context, context.getPackageName()));
            C1927Cg cg2 = this.f7905b;
            Context context2 = this.f7904a;
            cg2.getClass();
            gdVar.mo15695a(String.valueOf(C1848A2.m6812b(context2, context2.getPackageName())));
            gdVar.mo15693a(bVar.f7902a);
            gdVar.mo15691a(C2575U.m8554a());
            gdVar.mo15692a(C2007F0.m7154g().mo15751n().mo17477a());
            gdVar.mo15703e(this.f7904a.getPackageName());
            gdVar.mo15694a(C2007F0.m7154g().mo15755r().mo18393a(this.f7904a));
            gdVar.mo15690a(C2007F0.m7154g().mo15737a().mo15551a());
            return gdVar;
        }
    }

    /* renamed from: A */
    public List<String> mo17633A() {
        return mo15720v().mo17993x();
    }

    public String toString() {
        return "RequestConfig{mSuitableCollectionConfig=" + this.f7901m + "} " + super.toString();
    }

    /* renamed from: z */
    public C3208mc mo17634z() {
        return this.f7901m;
    }

    private C2995gd(C3208mc mcVar) {
        this.f7901m = mcVar;
    }
}
