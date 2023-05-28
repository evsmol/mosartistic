package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j2 */
public class C3077j2 {

    /* renamed from: a */
    private final C3111k2 f8092a;

    /* renamed from: b */
    private final Context f8093b;

    /* renamed from: c */
    private final Map<String, C3047i2> f8094c = new HashMap();

    public C3077j2(Context context, C3111k2 k2Var) {
        this.f8093b = context;
        this.f8092a = k2Var;
    }

    /* renamed from: a */
    public synchronized C3047i2 mo17727a(String str, CounterConfiguration.C10685b bVar) {
        C3047i2 i2Var;
        i2Var = this.f8094c.get(str);
        if (i2Var == null) {
            i2Var = new C3047i2(str, this.f8093b, bVar, this.f8092a);
            this.f8094c.put(str, i2Var);
        }
        return i2Var;
    }
}
