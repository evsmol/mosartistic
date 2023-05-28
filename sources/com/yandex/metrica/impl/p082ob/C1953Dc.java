package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Dc */
public abstract class C1953Dc<T> {

    /* renamed from: e */
    static final long f5232e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    protected final Context f5233a;

    /* renamed from: b */
    protected final C3731zd f5234b;

    /* renamed from: c */
    protected final LocationListener f5235c;

    /* renamed from: d */
    protected final Looper f5236d;

    public C1953Dc(Context context, LocationListener locationListener, C3731zd zdVar, Looper looper) {
        this.f5233a = context;
        this.f5235c = locationListener;
        this.f5234b = zdVar;
        this.f5236d = looper;
    }

    /* renamed from: a */
    public abstract void mo15629a();

    /* renamed from: a */
    public abstract boolean mo15630a(T t);

    /* renamed from: b */
    public abstract void mo15631b();
}
