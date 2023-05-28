package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.impl.p082ob.C2578U1;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/* renamed from: com.yandex.metrica.impl.ob.n6 */
public class C3249n6 {

    /* renamed from: a */
    private final C1877B0 f8414a;

    /* renamed from: b */
    private final C3202m6 f8415b;

    /* renamed from: c */
    private final Context f8416c;

    /* renamed from: d */
    private final C3560um f8417d;

    public C3249n6(Context context) {
        this(context, new C1877B0(), new C3202m6(), C3560um.m10854a(context));
    }

    /* renamed from: a */
    public void mo17883a(C2578U1.C2584f fVar) {
        File a = this.f8414a.mo15519a(this.f8416c, "appmetrica_crashes");
        if (this.f8415b.mo17838a(a)) {
            C1850A3 a2 = fVar.mo16744a().mo18443a();
            String str = a2.mo15431g() + "-" + a2.mo15432h();
            C3487sm a3 = this.f8417d.mo18313a(str);
            PrintWriter printWriter = null;
            try {
                a3.mo18221a();
                this.f8414a.getClass();
                PrintWriter printWriter2 = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(a, str))));
                try {
                    printWriter2.write(new C2762Z6(fVar.mo16748b(), fVar.mo16744a(), fVar.mo16749c()).mo17103k());
                    C1848A2.m6807a((Closeable) printWriter2);
                    a3.mo18223c();
                } catch (IOException unused) {
                    printWriter = printWriter2;
                    C1848A2.m6807a((Closeable) printWriter);
                    a3.mo18223c();
                }
            } catch (IOException unused2) {
                C1848A2.m6807a((Closeable) printWriter);
                a3.mo18223c();
            }
        }
    }

    C3249n6(Context context, C1877B0 b0, C3202m6 m6Var, C3560um umVar) {
        this.f8416c = context;
        this.f8414a = b0;
        this.f8415b = m6Var;
        this.f8417d = umVar;
    }
}
