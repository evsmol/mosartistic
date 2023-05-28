package com.yandex.metrica.gpllibrary;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.gpllibrary.a */
public class C1811a implements C1814b {

    /* renamed from: a */
    private final FusedLocationProviderClient f4971a;

    /* renamed from: b */
    private final LocationListener f4972b;

    /* renamed from: c */
    private final LocationCallback f4973c;

    /* renamed from: d */
    private final Looper f4974d;

    /* renamed from: e */
    private final Executor f4975e;

    /* renamed from: f */
    private final long f4976f;

    /* renamed from: com.yandex.metrica.gpllibrary.a$a */
    static class C1812a {

        /* renamed from: a */
        private final Context f4977a;

        C1812a(Context context) {
            this.f4977a = context;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public FusedLocationProviderClient mo15377a() throws Throwable {
            return new FusedLocationProviderClient(this.f4977a);
        }
    }

    /* renamed from: com.yandex.metrica.gpllibrary.a$b */
    public enum C1813b {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public C1811a(Context context, LocationListener locationListener, Looper looper, Executor executor, long j) throws Throwable {
        this(new C1812a(context), locationListener, looper, executor, j);
    }

    public void startLocationUpdates(C1813b bVar) throws Throwable {
        Log.d("[GplLibraryWrapper]", "startLocationUpdates");
        FusedLocationProviderClient fusedLocationProviderClient = this.f4971a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f4976f);
        int ordinal = bVar.ordinal();
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? 105 : 100 : 102 : 104), this.f4973c, this.f4974d);
    }

    public void stopLocationUpdates() throws Throwable {
        Log.d("[GplLibraryWrapper]", "stopLocationUpdates");
        this.f4971a.removeLocationUpdates(this.f4973c);
    }

    public void updateLastKnownLocation() throws Throwable {
        Log.d("[GplLibraryWrapper]", "updateLastKnownLocation");
        this.f4971a.getLastLocation().addOnSuccessListener(this.f4975e, new GplOnSuccessListener(this.f4972b));
    }

    C1811a(C1812a aVar, LocationListener locationListener, Looper looper, Executor executor, long j) throws Throwable {
        this.f4971a = aVar.mo15377a();
        this.f4972b = locationListener;
        this.f4974d = looper;
        this.f4975e = executor;
        this.f4976f = j;
        this.f4973c = new GplLocationCallback(locationListener);
    }
}
