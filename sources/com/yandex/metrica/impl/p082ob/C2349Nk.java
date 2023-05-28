package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3454rl;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.Nk */
public class C2349Nk implements C1932Cl {

    /* renamed from: a */
    private final Pattern f6284a;

    C2349Nk(Pattern pattern) {
        this.f6284a = pattern;
    }

    /* renamed from: a */
    public boolean mo15595a(Object obj) {
        return this.f6284a.matcher((String) obj).matches();
    }

    /* renamed from: a */
    public C3454rl.C3456b mo15594a() {
        return C3454rl.C3456b.BAD_REGEXP_MATCHED;
    }
}
