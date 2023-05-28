package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3454rl;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.ok */
public class C3325ok implements C1932Cl {

    /* renamed from: a */
    private final Pattern f8538a;

    C3325ok(Pattern pattern) {
        this.f8538a = pattern;
    }

    /* renamed from: a */
    public boolean mo15595a(Object obj) {
        return !this.f8538a.matcher((String) obj).matches();
    }

    /* renamed from: a */
    public C3454rl.C3456b mo15594a() {
        return C3454rl.C3456b.REGEXP_NOT_MATCHED;
    }
}
