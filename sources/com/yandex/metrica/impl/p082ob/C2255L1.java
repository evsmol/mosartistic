package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C1941D3;
import com.yandex.metrica.impl.p082ob.C2168J;
import com.yandex.metrica.impl.p082ob.C2312Mg;
import com.yandex.metrica.impl.p082ob.C3571v7;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.L1 */
public class C2255L1 {

    /* renamed from: a */
    private final Context f6002a;

    /* renamed from: b */
    private final ICommonExecutor f6003b;

    /* renamed from: c */
    private final C3079j4 f6004c;

    /* renamed from: d */
    private final C1877B0 f6005d;

    /* renamed from: com.yandex.metrica.impl.ob.L1$a */
    class C2256a implements C3240mm<C2762Z6> {
        C2256a() {
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            C2762Z6 z6 = (C2762Z6) obj;
            C2255L1 l1 = C2255L1.this;
            C3049i4 i4Var = new C3049i4(z6.mo17093a(), z6.mo17098f(), z6.mo17099g(), z6.mo17100h(), z6.mo17101i());
            String e = z6.mo17097e();
            byte[] c = z6.mo17095c();
            int b = z6.mo17094b();
            HashMap<C2168J.C2169a, Integer> j = z6.mo17102j();
            String d = z6.mo17096d();
            C2875cm b2 = C2642Ul.m8746b(z6.mo17093a());
            List<Integer> list = C3716z0.f9563i;
            C2168J a = new C2168J(c, e, C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.mo17139b(), b2).mo15966a(j);
            a.f7531h = b;
            l1.mo16109a(i4Var, a.mo17332c(d), new C1941D3(new C2312Mg.C2314b((String) null, (String) null, (String) null, (String) null, (String) null, (Map<String, String>) null, false, (List<String>) null), new C1941D3.C1942a(), (ResultReceiver) null));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.L1$b */
    protected class C2257b implements C3240mm<String> {

        /* renamed from: a */
        private final C3049i4 f6007a;

        /* renamed from: b */
        private final C3293nm<String, C2851c0> f6008b;

        public C2257b(C3049i4 i4Var, C3293nm<String, C2851c0> nmVar) {
            this.f6007a = i4Var;
            this.f6008b = nmVar;
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            C2255L1.this.mo16109a(this.f6007a, this.f6008b.mo15448a((String) obj), new C1941D3(new C2312Mg.C2314b((String) null, (String) null, (String) null, (String) null, (String) null, (Map<String, String>) null, false, (List<String>) null), new C1941D3.C1942a(), (ResultReceiver) null));
        }
    }

    C2255L1(Context context, C3079j4 j4Var, ICommonExecutor iCommonExecutor, C1877B0 b0) {
        this.f6002a = context;
        this.f6003b = iCommonExecutor;
        this.f6004c = j4Var;
        this.f6005d = b0;
    }

    /* renamed from: a */
    public void mo16111a(File file) {
        C2795a7 a7Var = new C2795a7();
        this.f6003b.execute(new C3496t6(file, a7Var, a7Var, new C2256a()));
    }

    /* renamed from: a */
    public void mo16109a(C3049i4 i4Var, C2851c0 c0Var, C1941D3 d3) {
        this.f6004c.mo17728a(i4Var, d3).mo17622a(c0Var, d3);
        this.f6004c.mo17729a(i4Var.mo17703b(), i4Var.mo17704c().intValue(), i4Var.mo17705d());
    }

    /* renamed from: a */
    public void mo16110a(C3434r7 r7Var, C3293nm<String, C2851c0> nmVar) {
        ICommonExecutor iCommonExecutor = this.f6003b;
        C1877B0 b0 = this.f6005d;
        String str = r7Var.f8999a.f9197b;
        b0.getClass();
        iCommonExecutor.execute(new C3496t6(new File(str), new C3052i7(new C2859c7(C2987g7.CRASHPAD, r7Var.f9001c.f5447b), new C3021h7(new C2419P6())), new C3571v7.C3574c(r7Var.f8999a.f9196a), new C2257b(r7Var.f9000b, nmVar)));
    }

    /* renamed from: a */
    public void mo16108a(C2851c0 c0Var, Bundle bundle) {
        if (!(C2788a1.EVENT_TYPE_UNDEFINED.mo17139b() == c0Var.f7528e)) {
            this.f6003b.execute(new C2326N1(this.f6002a, c0Var, bundle, this.f6004c));
        }
    }
}
