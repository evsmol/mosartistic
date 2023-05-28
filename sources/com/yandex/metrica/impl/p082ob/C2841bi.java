package com.yandex.metrica.impl.p082ob;

import android.util.Pair;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.bi */
public class C2841bi {

    /* renamed from: a */
    public final String f7489a;

    /* renamed from: b */
    public final String f7490b;

    /* renamed from: c */
    public final String f7491c;

    /* renamed from: d */
    public final List<Pair<String, String>> f7492d;

    /* renamed from: e */
    public final Long f7493e;

    /* renamed from: f */
    public final List<C2842a> f7494f;

    /* renamed from: com.yandex.metrica.impl.ob.bi$a */
    public enum C2842a {
        WIFI,
        CELL
    }

    public C2841bi(String str, String str2, String str3, List<Pair<String, String>> list, Long l, List<C2842a> list2) {
        this.f7489a = str;
        this.f7490b = str2;
        this.f7491c = str3;
        this.f7492d = C1848A2.m6816c(list);
        this.f7493e = l;
        this.f7494f = list2;
    }
}
