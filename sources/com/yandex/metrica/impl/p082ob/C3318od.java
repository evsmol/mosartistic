package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.impl.p082ob.C2076H1;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;
import java.util.EnumSet;

/* renamed from: com.yandex.metrica.impl.ob.od */
public class C3318od implements IExecutionPolicy {

    /* renamed from: c */
    private static final EnumSet<C2076H1.C2080d> f8517c = EnumSet.of(C2076H1.C2080d.OFFLINE);

    /* renamed from: a */
    private C2499Rl f8518a = new C2321Ml();

    /* renamed from: b */
    private final Context f8519b;

    public C3318od(Context context) {
        this.f8519b = context;
    }

    public boolean canBeExecuted() {
        C2499Rl rl = this.f8518a;
        Context context = this.f8519b;
        ((C2321Ml) rl).getClass();
        return !f8517c.contains(C2076H1.m7289a(context));
    }
}
