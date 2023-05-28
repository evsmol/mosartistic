package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.i2 */
public class C3047i2 {

    /* renamed from: a */
    private final String f8031a;

    /* renamed from: b */
    private final Context f8032b;

    /* renamed from: c */
    private final CounterConfiguration.C10685b f8033c;

    /* renamed from: d */
    private final C3111k2 f8034d;

    public C3047i2(String str, Context context, CounterConfiguration.C10685b bVar, C3111k2 k2Var) {
        this.f8031a = str;
        this.f8032b = context;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            this.f8033c = CounterConfiguration.C10685b.SELF_DIAGNOSTIC_MAIN;
        } else if (ordinal != 1) {
            this.f8033c = null;
        } else {
            this.f8033c = CounterConfiguration.C10685b.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f8034d = k2Var;
    }

    /* renamed from: a */
    public void mo17700a(C2851c0 c0Var) {
        if (this.f8033c != null) {
            try {
                String str = this.f8031a;
                CounterConfiguration counterConfiguration = new CounterConfiguration();
                synchronized (counterConfiguration) {
                    counterConfiguration.mo64612b(str);
                }
                counterConfiguration.mo64609a(this.f8033c);
                this.f8034d.mo17773a(c0Var.mo17328b(new C2445Q1(new C1850A3(this.f8032b, (ResultReceiver) null), counterConfiguration, (String) null).mo16502c()));
            } catch (Throwable unused) {
            }
        }
    }
}
