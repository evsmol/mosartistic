package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import com.yandex.metrica.gpllibrary.C1811a;
import com.yandex.metrica.gpllibrary.C1814b;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.dc */
public class C2891dc extends C1953Dc<C2864cc> {

    /* renamed from: f */
    private final C1814b f7638f;

    public C2891dc(Context context, C2425Pc pc, IHandlerExecutor iHandlerExecutor, C3697yd ydVar) {
        this(context, pc, iHandlerExecutor, ydVar, new C2038G1());
    }

    /* renamed from: a */
    public boolean mo15630a(Object obj) {
        C2864cc ccVar = (C2864cc) obj;
        if (ccVar.f7582b != null && this.f5234b.mo15812a(this.f5233a)) {
            try {
                this.f7638f.startLocationUpdates(ccVar.f7582b.f7389a);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo15631b() {
        if (this.f5234b.mo15812a(this.f5233a)) {
            try {
                this.f7638f.updateLastKnownLocation();
            } catch (Throwable unused) {
            }
        }
    }

    private C2891dc(Context context, C2425Pc pc, IHandlerExecutor iHandlerExecutor, C3697yd ydVar, C2038G1 g1) {
        this(context, iHandlerExecutor, (LocationListener) new C3730zc(pc), g1.mo15807a(ydVar));
    }

    /* renamed from: a */
    public void mo15629a() {
        try {
            this.f7638f.stopLocationUpdates();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static C1814b m9361a(Context context, LocationListener locationListener, IHandlerExecutor iHandlerExecutor) {
        if (C3015h2.m9660a("com.google.android.gms.location.LocationRequest")) {
            try {
                return new C1811a(context, locationListener, iHandlerExecutor.getLooper(), (Executor) iHandlerExecutor, C1953Dc.f5232e);
            } catch (Throwable unused) {
            }
        }
        return new C2559Tb();
    }

    C2891dc(Context context, IHandlerExecutor iHandlerExecutor, LocationListener locationListener, C3731zd zdVar) {
        this(context, iHandlerExecutor.getLooper(), locationListener, zdVar, m9361a(context, locationListener, iHandlerExecutor));
    }

    C2891dc(Context context, Looper looper, LocationListener locationListener, C3731zd zdVar, C1814b bVar) {
        super(context, locationListener, zdVar, looper);
        this.f7638f = bVar;
    }
}
