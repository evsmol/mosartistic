package com.criteo.publisher.p070l0.p071d;

import com.criteo.publisher.p070l0.p071d.C1175b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* renamed from: com.criteo.publisher.l0.d.c */
/* compiled from: GdprData */
public abstract class C1177c {
    /* renamed from: a */
    public abstract String mo3287a();

    /* renamed from: b */
    public abstract Boolean mo3288b();

    /* renamed from: c */
    public abstract Integer mo3289c();

    /* renamed from: a */
    public static C1177c m5357a(String str, Boolean bool, Integer num) {
        return new C1175b(str, bool, num);
    }

    /* renamed from: a */
    public static TypeAdapter<C1177c> m5358a(Gson gson) {
        return new C1175b.C1176a(gson);
    }
}
