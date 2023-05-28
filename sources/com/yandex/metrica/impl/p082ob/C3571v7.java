package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p081ac.CrashpadServiceHelper;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.v7 */
public class C3571v7 implements C2944f7<C3434r7> {

    /* renamed from: a */
    private final C2255L1 f9305a;

    /* renamed from: com.yandex.metrica.impl.ob.v7$a */
    class C3572a implements C3293nm<String, C2851c0> {

        /* renamed from: a */
        final /* synthetic */ C3434r7 f9306a;

        C3572a(C3571v7 v7Var, C3434r7 r7Var) {
            this.f9306a = r7Var;
        }

        /* renamed from: a */
        public Object mo15448a(Object obj) {
            return C3716z0.m11105a((String) obj, C2642Ul.m8746b(this.f9306a.f9000b.mo17702a())).mo17332c(this.f9306a.f9001c.f5446a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.v7$b */
    class C3573b implements C3293nm<String, C2851c0> {

        /* renamed from: a */
        final /* synthetic */ C3434r7 f9307a;

        C3573b(C3571v7 v7Var, C3434r7 r7Var) {
            this.f9307a = r7Var;
        }

        /* renamed from: a */
        public Object mo15448a(Object obj) {
            return C3716z0.m11110b((String) obj, C2642Ul.m8746b(this.f9307a.f9000b.mo17702a())).mo17332c(this.f9307a.f9001c.f5446a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.v7$c */
    public static class C3574c implements C3240mm<File> {

        /* renamed from: a */
        private final String f9308a;

        public C3574c(String str) {
            this.f9308a = str;
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            File file = (File) obj;
            CrashpadServiceHelper.m6767a(this.f9308a);
        }
    }

    public C3571v7(C2255L1 l1) {
        this.f9305a = l1;
    }

    /* renamed from: a */
    public void mo17575a(Object obj) {
        C3434r7 r7Var = (C3434r7) obj;
        this.f9305a.mo16110a(r7Var, (C3293nm<String, C2851c0>) new C3573b(this, r7Var));
    }

    /* renamed from: b */
    public void mo17576b(Object obj) {
        C3434r7 r7Var = (C3434r7) obj;
        this.f9305a.mo16110a(r7Var, (C3293nm<String, C2851c0>) new C3572a(this, r7Var));
    }

    /* renamed from: a */
    public void mo18323a(C3434r7 r7Var) {
        this.f9305a.mo16110a(r7Var, (C3293nm<String, C2851c0>) new C3572a(this, r7Var));
    }

    /* renamed from: b */
    public void mo18324b(C3434r7 r7Var) {
        this.f9305a.mo16110a(r7Var, (C3293nm<String, C2851c0>) new C3573b(this, r7Var));
    }
}
