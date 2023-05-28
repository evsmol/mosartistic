package com.yandex.metrica.impl.p082ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.p081ac.CrashpadServiceHelper;

/* renamed from: com.yandex.metrica.impl.ob.T4 */
public class C2551T4 extends C2702X4 {

    /* renamed from: b */
    private final C3240mm<String> f6776b;

    /* renamed from: com.yandex.metrica.impl.ob.T4$a */
    class C2552a implements C3240mm<String> {
        C2552a() {
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            String str = (String) obj;
            if (C1848A2.m6808a(21)) {
                CrashpadServiceHelper.m6767a(str);
            }
        }
    }

    public C2551T4(C2259L3 l3) {
        this(l3, new C2552a());
    }

    /* renamed from: a */
    public boolean mo16069a(C2851c0 c0Var) {
        Bundle l = c0Var.mo17343l();
        if (l == null) {
            return true;
        }
        String string = l.getString("payload_crash_id");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        this.f6776b.mo15447b(string);
        return true;
    }

    public C2551T4(C2259L3 l3, C3240mm<String> mmVar) {
        super(l3);
        this.f6776b = mmVar;
    }
}
