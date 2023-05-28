package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.u6 */
public class C3529u6 implements Runnable {

    /* renamed from: a */
    private final File f9193a;

    /* renamed from: b */
    private final C3240mm<File> f9194b;

    /* renamed from: c */
    private final C3560um f9195c;

    public C3529u6(Context context, File file, C3240mm<File> mmVar) {
        this(file, mmVar, C3560um.m10854a(context));
    }

    public void run() {
        File[] listFiles;
        if (this.f9193a.exists() && this.f9193a.isDirectory() && (listFiles = this.f9193a.listFiles()) != null) {
            for (File file : listFiles) {
                C3487sm a = this.f9195c.mo18313a(file.getName());
                try {
                    a.mo18221a();
                    this.f9194b.mo15447b(file);
                } catch (Throwable unused) {
                }
                a.mo18223c();
            }
        }
    }

    C3529u6(File file, C3240mm<File> mmVar, C3560um umVar) {
        this.f9193a = file;
        this.f9194b = mmVar;
        this.f9195c = umVar;
    }
}
