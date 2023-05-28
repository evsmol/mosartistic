package com.yandex.metrica.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.yandex.metrica.identifiers.impl.d */
public class C1819d implements ServiceConnection {

    /* renamed from: a */
    private final Intent f4985a;

    /* renamed from: b */
    private IBinder f4986b;

    /* renamed from: c */
    private final Object f4987c = new Object();

    public C1819d(Intent intent, String str) {
        this.f4985a = intent;
        String.format("[AdServiceConnection-%s]", new Object[]{str});
    }

    /* renamed from: a */
    public Intent mo15381a() {
        return this.f4985a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(2:7|8)|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0010 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.IBinder mo15382a(long r3) {
        /*
            r2 = this;
            android.os.IBinder r0 = r2.f4986b
            if (r0 != 0) goto L_0x0015
            java.lang.Object r0 = r2.f4987c
            monitor-enter(r0)
            android.os.IBinder r1 = r2.f4986b     // Catch:{ all -> 0x0012 }
            if (r1 != 0) goto L_0x0010
            java.lang.Object r1 = r2.f4987c     // Catch:{ InterruptedException -> 0x0010 }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x0010 }
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r3
        L_0x0015:
            android.os.IBinder r3 = r2.f4986b
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.identifiers.impl.C1819d.mo15382a(long):android.os.IBinder");
    }

    /* renamed from: a */
    public boolean mo15383a(Context context) {
        return context.bindService(this.f4985a, this, 1);
    }

    /* renamed from: b */
    public void mo15384b(Context context) {
        synchronized (this.f4987c) {
            this.f4986b = null;
            this.f4987c.notifyAll();
        }
        context.unbindService(this);
    }

    public void onBindingDied(ComponentName componentName) {
        synchronized (this.f4987c) {
            this.f4986b = null;
            this.f4987c.notifyAll();
        }
    }

    public void onNullBinding(ComponentName componentName) {
        synchronized (this.f4987c) {
            this.f4987c.notifyAll();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f4987c) {
            this.f4986b = iBinder;
            this.f4987c.notifyAll();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f4987c) {
            this.f4986b = null;
            this.f4987c.notifyAll();
        }
    }
}
