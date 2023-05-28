package com.yandex.metrica.impl.p082ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.t6 */
public class C3496t6<Output> implements Runnable {

    /* renamed from: a */
    private final File f9124a;

    /* renamed from: b */
    private final C3293nm<File, Output> f9125b;

    /* renamed from: c */
    private final C3240mm<File> f9126c;

    /* renamed from: d */
    private final C3240mm<Output> f9127d;

    public C3496t6(File file, C3293nm<File, Output> nmVar, C3240mm<File> mmVar, C3240mm<Output> mmVar2) {
        this.f9124a = file;
        this.f9125b = nmVar;
        this.f9126c = mmVar;
        this.f9127d = mmVar2;
    }

    public void run() {
        if (this.f9124a.exists()) {
            try {
                Output a = this.f9125b.mo15448a(this.f9124a);
                if (a != null) {
                    this.f9127d.mo15447b(a);
                }
            } catch (Throwable unused) {
            }
            this.f9126c.mo15447b(this.f9124a);
        }
    }
}
