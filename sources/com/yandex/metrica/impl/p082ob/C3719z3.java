package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;

/* renamed from: com.yandex.metrica.impl.ob.z3 */
public class C3719z3 {

    /* renamed from: a */
    private final C1850A3 f9567a;

    /* renamed from: b */
    private final CounterConfiguration f9568b;

    public C3719z3(Bundle bundle) {
        this.f9567a = C1850A3.m6820a(bundle);
        this.f9568b = CounterConfiguration.m31427a(bundle);
    }

    /* renamed from: a */
    public C1850A3 mo18443a() {
        return this.f9567a;
    }

    /* renamed from: b */
    public CounterConfiguration mo18444b() {
        return this.f9568b;
    }

    public String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f9567a + ", mCounterConfiguration=" + this.f9568b + '}';
    }

    /* renamed from: a */
    public static boolean m11119a(C3719z3 z3Var, Context context) {
        return z3Var.f9567a == null || !context.getPackageName().equals(z3Var.f9567a.mo15430f()) || z3Var.f9567a.mo15433i() != YandexMetrica.getLibraryApiLevel();
    }

    public C3719z3(C1850A3 a3, CounterConfiguration counterConfiguration) {
        this.f9567a = a3;
        this.f9568b = counterConfiguration;
    }
}
