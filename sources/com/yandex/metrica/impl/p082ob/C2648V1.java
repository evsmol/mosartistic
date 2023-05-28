package com.yandex.metrica.impl.p082ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.V1 */
public abstract class C2648V1<T> {

    /* renamed from: a */
    protected final Context f7023a;

    /* renamed from: b */
    private final String f7024b;

    /* renamed from: c */
    private final String f7025c;

    public C2648V1(Context context, String str, String str2) {
        this.f7023a = context;
        this.f7024b = str;
        this.f7025c = str2;
    }

    /* renamed from: a */
    public T mo16943a() {
        int identifier = this.f7023a.getResources().getIdentifier(this.f7024b, this.f7025c, this.f7023a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return mo15736a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo15736a(int i);
}
