package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;

/* renamed from: com.yandex.metrica.impl.ob.ga */
public abstract class C2990ga<T> implements C2947fa<T> {
    /* renamed from: a */
    public ProtobufStateStorage<T> mo17592a(Context context) {
        return mo17594a(context, mo17595c(context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ProtobufStateStorage<T> mo17594a(Context context, C2476R7 r7);

    /* renamed from: b */
    public ProtobufStateStorage<T> mo17593b(Context context) {
        return mo17594a(context, mo17596d(context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C2476R7 mo17595c(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C2476R7 mo17596d(Context context);
}
