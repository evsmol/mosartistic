package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.um */
public class C3560um {

    /* renamed from: c */
    private static volatile C3560um f9295c;

    /* renamed from: a */
    private final Context f9296a;

    /* renamed from: b */
    private final Map<String, C3487sm> f9297b = new HashMap();

    C3560um(Context context) {
        this.f9296a = context;
    }

    /* renamed from: a */
    public static C3560um m10854a(Context context) {
        if (f9295c == null) {
            synchronized (C3560um.class) {
                if (f9295c == null) {
                    f9295c = new C3560um(context);
                }
            }
        }
        return f9295c;
    }

    /* renamed from: a */
    public C3487sm mo18313a(String str) {
        if (!this.f9297b.containsKey(str)) {
            synchronized (this) {
                if (!this.f9297b.containsKey(str)) {
                    this.f9297b.put(str, new C3487sm(new ReentrantLock(), new C3518tm(this.f9296a, str)));
                }
            }
        }
        return this.f9297b.get(str);
    }
}
