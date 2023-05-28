package com.yandex.metrica;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p082ob.C2007F0;
import com.yandex.metrica.impl.p082ob.C2670Vl;
import com.yandex.metrica.impl.p082ob.C3111k2;
import com.yandex.metrica.impl.p082ob.C3334p1;
import com.yandex.metrica.impl.p082ob.C3371q1;
import com.yandex.metrica.impl.p082ob.C3427r1;

public class MetricaService extends Service {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C3334p1 f26732c;

    /* renamed from: a */
    private final C10691d f26733a = new C10688a();

    /* renamed from: b */
    private final IMetricaService.C10686a f26734b = new C10689b(this);

    /* renamed from: com.yandex.metrica.MetricaService$a */
    class C10688a implements C10691d {
        C10688a() {
        }

        /* renamed from: a */
        public void mo64676a(int i) {
            MetricaService.this.stopSelfResult(i);
        }
    }

    /* renamed from: com.yandex.metrica.MetricaService$b */
    class C10689b extends IMetricaService.C10686a {
        C10689b(MetricaService metricaService) {
        }

        /* renamed from: a */
        public void mo64644a(int i, Bundle bundle) throws RemoteException {
            MetricaService.f26732c.mo17926a(i, bundle);
        }

        /* renamed from: b */
        public void mo64646b(Bundle bundle) throws RemoteException {
            MetricaService.f26732c.mo17930b(bundle);
        }

        public void reportData(Bundle bundle) throws RemoteException {
            MetricaService.f26732c.reportData(bundle);
        }

        /* renamed from: a */
        public void mo64645a(Bundle bundle) throws RemoteException {
            MetricaService.f26732c.mo17927a(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.MetricaService$c */
    static class C10690c extends Binder {
        C10690c() {
        }
    }

    /* renamed from: com.yandex.metrica.MetricaService$d */
    public interface C10691d {
        /* renamed from: a */
        void mo64676a(int i);
    }

    public IBinder onBind(Intent intent) {
        IBinder iBinder;
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(intent.getAction())) {
            iBinder = new C10690c();
        } else {
            iBinder = this.f26734b;
        }
        f26732c.mo15410a(intent);
        return iBinder;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f26732c.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        super.onCreate();
        C2007F0.m7153a(getApplicationContext());
        C2670Vl.m8797a(getApplicationContext());
        C3334p1 p1Var = f26732c;
        if (p1Var == null) {
            f26732c = new C3371q1(new C3427r1(getApplicationContext(), this.f26733a));
        } else {
            p1Var.mo17928a(this.f26733a);
        }
        f26732c.mo15525a();
        C2007F0.m7154g().mo15738a(new C3111k2(f26732c));
    }

    public void onDestroy() {
        f26732c.mo15528b();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        super.onRebind(intent);
        f26732c.mo15414c(intent);
    }

    public void onStart(Intent intent, int i) {
        f26732c.mo15526a(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        f26732c.mo15527a(intent, i, i2);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        f26732c.mo15412b(intent);
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(intent.getAction())) {
            return false;
        }
        if (intent.getData() == null) {
            return false;
        }
        return true;
    }
}
