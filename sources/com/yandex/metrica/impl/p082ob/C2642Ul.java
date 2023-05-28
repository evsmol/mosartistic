package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ul */
public abstract class C2642Ul {

    /* renamed from: a */
    private static Map<String, C2875cm> f7013a = new HashMap();

    /* renamed from: b */
    private static Map<String, C2537Sl> f7014b = new HashMap();

    /* renamed from: c */
    private static final Object f7015c = new Object();

    /* renamed from: d */
    private static final Object f7016d = new Object();

    /* renamed from: e */
    public static final /* synthetic */ int f7017e = 0;

    /* renamed from: a */
    public static C2537Sl m8744a(String str) {
        if (TextUtils.isEmpty(str)) {
            return C2537Sl.m8401a();
        }
        C2537Sl sl = f7014b.get(str);
        if (sl == null) {
            synchronized (f7016d) {
                sl = f7014b.get(str);
                if (sl == null) {
                    sl = new C2537Sl(str);
                    f7014b.put(str, sl);
                }
            }
        }
        return sl;
    }

    /* renamed from: b */
    public static C2875cm m8746b(String str) {
        if (TextUtils.isEmpty(str)) {
            return C2875cm.m9327a();
        }
        C2875cm cmVar = f7013a.get(str);
        if (cmVar == null) {
            synchronized (f7015c) {
                cmVar = f7013a.get(str);
                if (cmVar == null) {
                    cmVar = new C2875cm(str);
                    f7013a.put(str, cmVar);
                }
            }
        }
        return cmVar;
    }

    /* renamed from: a */
    public static C2875cm m8745a() {
        return C2875cm.m9327a();
    }
}
