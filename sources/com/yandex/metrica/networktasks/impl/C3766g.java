package com.yandex.metrica.networktasks.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.networktasks.impl.g */
public final class C3766g {

    /* renamed from: a */
    private final C3767h f9714a;

    public C3766g() {
        this(new C3767h());
    }

    public C3766g(C3767h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "timeProvider");
        this.f9714a = hVar;
    }

    /* renamed from: a */
    public final boolean mo18599a(long j, long j2, String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        this.f9714a.getClass();
        long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        return currentTimeMillis < j || currentTimeMillis - j >= j2;
    }
}
