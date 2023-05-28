package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.C10720e;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Pf */
public class C2431Pf {

    /* renamed from: a */
    private final Map<String, C2376Of> f6474a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2522Sf f6475b;

    /* renamed from: c */
    private final ICommonExecutor f6476c;

    /* renamed from: com.yandex.metrica.impl.ob.Pf$a */
    class C2432a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f6477a;

        C2432a(Context context) {
            this.f6477a = context;
        }

        public void run() {
            C2522Sf a = C2431Pf.this.f6475b;
            Context context = this.f6477a;
            a.getClass();
            C2470R2.m8217a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Pf$b */
    private static class C2433b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C2431Pf f6479a = new C2431Pf(C2410P.m8089g().mo16430c(), new C2522Sf());
    }

    C2431Pf(ICommonExecutor iCommonExecutor, C2522Sf sf) {
        this.f6476c = iCommonExecutor;
        this.f6475b = sf;
    }

    /* renamed from: b */
    private C2376Of m8144b(Context context, String str) {
        this.f6475b.getClass();
        if (C2470R2.m8232k() == null) {
            this.f6476c.execute(new C2432a(context));
        }
        C2376Of of = new C2376Of(this.f6476c, context, str);
        this.f6474a.put(str, of);
        return of;
    }

    /* renamed from: a */
    public static C2431Pf m8142a() {
        return C2433b.f6479a;
    }

    /* renamed from: a */
    public C2376Of mo16473a(Context context, String str) {
        C2376Of of = this.f6474a.get(str);
        if (of == null) {
            synchronized (this.f6474a) {
                of = this.f6474a.get(str);
                if (of == null) {
                    C2376Of b = m8144b(context, str);
                    b.mo16398d(str);
                    of = b;
                }
            }
        }
        return of;
    }

    /* renamed from: a */
    public C2376Of mo16472a(Context context, C10720e eVar) {
        C2376Of of = this.f6474a.get(eVar.apiKey);
        if (of == null) {
            synchronized (this.f6474a) {
                of = this.f6474a.get(eVar.apiKey);
                if (of == null) {
                    C2376Of b = m8144b(context, eVar.apiKey);
                    b.mo16397a(eVar);
                    of = b;
                }
            }
        }
        return of;
    }
}
