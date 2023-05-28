package com.yandex.metrica.impl.p082ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.p081ac.CrashpadServiceHelper;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.t7 */
public class C3497t7 implements C2915e7<String> {

    /* renamed from: a */
    private final C3571v7 f9128a;

    /* renamed from: b */
    private final C3293nm<String, Bundle> f9129b;

    /* renamed from: c */
    private final Callable<List<Bundle>> f9130c;

    /* renamed from: d */
    private final C3240mm<String> f9131d;

    /* renamed from: e */
    private final C3471s7 f9132e;

    /* renamed from: com.yandex.metrica.impl.ob.t7$a */
    class C3498a implements C3293nm<String, Bundle> {
        C3498a() {
        }

        /* renamed from: a */
        public Object mo15448a(Object obj) {
            return CrashpadServiceHelper.readCrash((String) obj);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.t7$b */
    class C3499b implements Callable<List<Bundle>> {
        C3499b() {
        }

        public Object call() throws Exception {
            return CrashpadServiceHelper.readOldCrashes();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.t7$c */
    class C3500c implements C3240mm<String> {
        C3500c() {
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            CrashpadServiceHelper.m6767a((String) obj);
        }
    }

    public C3497t7(C3571v7 v7Var) {
        this(v7Var, new C3471s7(), new C3498a(), new C3499b(), new C3500c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17498a(java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.String r3 = (java.lang.String) r3
            com.yandex.metrica.impl.ob.nm<java.lang.String, android.os.Bundle> r0 = r2.f9129b     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r0.mo15448a(r3)     // Catch:{ all -> 0x0013 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0013
            com.yandex.metrica.impl.ob.s7 r1 = r2.f9132e     // Catch:{ all -> 0x0013 }
            com.yandex.metrica.impl.ob.r7 r0 = r1.mo15813a((java.lang.String) r3, (android.os.Bundle) r0)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x001c
            com.yandex.metrica.impl.ob.v7 r3 = r2.f9128a
            r3.mo18323a((com.yandex.metrica.impl.p082ob.C3434r7) r0)
            goto L_0x0021
        L_0x001c:
            com.yandex.metrica.impl.ob.mm<java.lang.String> r0 = r2.f9131d
            r0.mo15447b(r3)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3497t7.mo17498a(java.lang.Object):void");
    }

    public C3497t7(C3571v7 v7Var, C3471s7 s7Var, C3293nm<String, Bundle> nmVar, Callable<List<Bundle>> callable, C3240mm<String> mmVar) {
        this.f9128a = v7Var;
        this.f9132e = s7Var;
        this.f9129b = nmVar;
        this.f9130c = callable;
        this.f9131d = mmVar;
    }

    /* renamed from: a */
    public void mo17497a() {
        try {
            for (Bundle bundle : this.f9130c.call()) {
                String string = bundle.getString("arg_ui");
                if (!TextUtils.isEmpty(string)) {
                    C3434r7 a = this.f9132e.mo15813a(string, bundle);
                    if (a != null) {
                        this.f9128a.mo18324b(a);
                    } else {
                        this.f9131d.mo15447b(string);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
