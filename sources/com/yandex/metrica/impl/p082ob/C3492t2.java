package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.t2 */
public final class C3492t2 extends C2648V1<String[]> {
    public C3492t2(Context context, String str) {
        super(context, str, "array");
    }

    /* renamed from: a */
    public Object mo15736a(int i) {
        Context context = this.f7023a;
        Intrinsics.checkNotNullExpressionValue(context, "mContext");
        return context.getResources().getStringArray(i);
    }
}
