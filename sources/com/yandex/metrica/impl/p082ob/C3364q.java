package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.q */
public class C3364q extends C3109k0 {

    /* renamed from: a */
    private Application f8657a;

    /* renamed from: b */
    private volatile C3367c f8658b = C3367c.NOT_WATCHING_YET;

    /* renamed from: c */
    private final C3458rm<C3365a, C3366b> f8659c = new C3458rm<>(true);

    /* renamed from: com.yandex.metrica.impl.ob.q$a */
    public enum C3365a {
        CREATED,
        RESUMED,
        PAUSED,
        STARTED,
        STOPPED,
        DESTROYED
    }

    /* renamed from: com.yandex.metrica.impl.ob.q$b */
    interface C3366b {
        /* renamed from: a */
        void mo17137a(Activity activity, C3365a aVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.q$c */
    public enum C3367c {
        WATCHING((String) null),
        NO_APPLICATION("Bad application object"),
        NOT_WATCHING_YET("Internal inconsistency");
        

        /* renamed from: a */
        public final String f8671a;

        private C3367c(String str) {
            this.f8671a = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m10426b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.q$c r0 = r2.f8658b     // Catch:{ all -> 0x0025 }
            com.yandex.metrica.impl.ob.q$c r1 = com.yandex.metrica.impl.p082ob.C3364q.C3367c.WATCHING     // Catch:{ all -> 0x0025 }
            if (r0 == r1) goto L_0x0023
            com.yandex.metrica.impl.ob.rm<com.yandex.metrica.impl.ob.q$a, com.yandex.metrica.impl.ob.q$b> r0 = r2.f8659c     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.mo18185b()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0010
            goto L_0x0023
        L_0x0010:
            android.app.Application r0 = r2.f8657a     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x001a
            com.yandex.metrica.impl.ob.q$c r0 = com.yandex.metrica.impl.p082ob.C3364q.C3367c.NO_APPLICATION     // Catch:{ all -> 0x0025 }
            r2.f8658b = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)
            return
        L_0x001a:
            r2.f8658b = r1     // Catch:{ all -> 0x0025 }
            android.app.Application r0 = r2.f8657a     // Catch:{ all -> 0x0025 }
            r0.registerActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)
            return
        L_0x0023:
            monitor-exit(r2)
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3364q.m10426b():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(2:4|5)|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo18055a(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.app.Application r0 = r1.f8657a     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x000d
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x000d }
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x000d }
            r1.f8657a = r2     // Catch:{ all -> 0x000d }
        L_0x000d:
            r1.m10426b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return
        L_0x0012:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3364q.mo18055a(android.content.Context):void");
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        m10425a(C3365a.CREATED, activity);
    }

    public void onActivityDestroyed(Activity activity) {
        m10425a(C3365a.DESTROYED, activity);
    }

    public void onActivityPaused(Activity activity) {
        m10425a(C3365a.PAUSED, activity);
    }

    public void onActivityResumed(Activity activity) {
        m10425a(C3365a.RESUMED, activity);
    }

    public void onActivityStarted(Activity activity) {
        m10425a(C3365a.STARTED, activity);
    }

    public void onActivityStopped(Activity activity) {
        m10425a(C3365a.STOPPED, activity);
    }

    /* renamed from: a */
    public synchronized void mo18054a(Application application) {
        if (this.f8657a == null) {
            this.f8657a = application;
        }
        m10426b();
    }

    /* renamed from: a */
    public C3367c mo18053a() {
        return this.f8658b;
    }

    /* renamed from: a */
    private void m10425a(C3365a aVar, Activity activity) {
        Collection<C3366b> a;
        synchronized (this) {
            a = this.f8659c.mo18180a(aVar);
        }
        if (a != null) {
            for (C3366b a2 : a) {
                a2.mo17137a(activity, aVar);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo18056a(C3366b bVar, C3365a... aVarArr) {
        if (aVarArr.length == 0) {
            aVarArr = C3365a.values();
        }
        for (C3365a a : aVarArr) {
            this.f8659c.mo18181a(a, bVar);
        }
        m10426b();
    }
}
