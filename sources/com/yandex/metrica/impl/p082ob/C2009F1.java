package com.yandex.metrica.impl.p082ob;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.F1 */
public class C2009F1 {

    /* renamed from: a */
    private final int f5381a;

    /* renamed from: b */
    private final int f5382b;

    /* renamed from: c */
    private final int f5383c;

    public C2009F1(int i, int i2, int i3) {
        this.f5381a = i;
        this.f5382b = i2;
        this.f5383c = i3;
    }

    /* renamed from: a */
    public final int mo15762a(Boolean bool) {
        if (bool == null) {
            return this.f5381a;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.FALSE)) {
            return this.f5382b;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            return this.f5383c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public final Boolean mo15763a(int i) {
        if (i == this.f5382b) {
            return Boolean.FALSE;
        }
        if (i == this.f5383c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
