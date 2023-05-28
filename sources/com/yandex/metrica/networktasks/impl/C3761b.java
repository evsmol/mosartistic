package com.yandex.metrica.networktasks.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.networktasks.impl.b */
public final class C3761b {

    /* renamed from: a */
    private final String f9709a;

    public C3761b(String str) {
        this.f9709a = m11159a(str);
    }

    /* renamed from: a */
    private final String m11159a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "uri");
        return Intrinsics.areEqual((Object) "http", (Object) parse.getScheme()) ? parse.buildUpon().scheme("https").build().toString() : str;
    }

    /* renamed from: a */
    public final String mo18594a() {
        return this.f9709a;
    }
}
