package com.applovin.exoplayer2.p221l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.applovin.exoplayer2.p221l.C7765w;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.applovin.exoplayer2.l.w */
public final class C7765w {

    /* renamed from: a */
    private static C7765w f18332a;

    /* renamed from: b */
    private final Handler f18333b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final CopyOnWriteArrayList<WeakReference<C7768b>> f18334c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private final Object f18335d = new Object();

    /* renamed from: e */
    private int f18336e = 0;

    /* renamed from: com.applovin.exoplayer2.l.w$a */
    public static final class C7767a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static volatile boolean f18337a;
    }

    /* renamed from: com.applovin.exoplayer2.l.w$b */
    public interface C7768b {
        void onNetworkTypeChanged(int i);
    }

    /* renamed from: com.applovin.exoplayer2.l.w$c */
    private final class C7769c extends BroadcastReceiver {
        private C7769c() {
        }

        public void onReceive(Context context, Intent intent) {
            int b = C7765w.m22408c(context);
            if (C7728ai.f18249a >= 29 && !C7767a.f18337a && b == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) C7717a.m22120b((TelephonyManager) context.getSystemService("phone"));
                    C7770d dVar = new C7770d();
                    if (C7728ai.f18249a < 31) {
                        telephonyManager.listen(dVar, 1);
                    } else {
                        telephonyManager.listen(dVar, 1048576);
                    }
                    telephonyManager.listen(dVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            C7765w.this.m22403a(b);
        }
    }

    /* renamed from: com.applovin.exoplayer2.l.w$d */
    private class C7770d extends PhoneStateListener {
        private C7770d() {
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            C7765w.this.m22403a(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2 = serviceState == null ? "" : serviceState.toString();
            C7765w.this.m22403a(serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    private C7765w(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C7769c(), intentFilter);
    }

    /* renamed from: a */
    private static int m22401a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            case 20:
                return C7728ai.f18249a >= 29 ? 9 : 0;
            default:
                return 6;
        }
    }

    /* renamed from: a */
    public static synchronized C7765w m22402a(Context context) {
        C7765w wVar;
        synchronized (C7765w.class) {
            if (f18332a == null) {
                f18332a = new C7765w(context);
            }
            wVar = f18332a;
        }
        return wVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r0.next();
        r2 = (com.applovin.exoplayer2.p221l.C7765w.C7768b) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.onNetworkTypeChanged(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.f18334c.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f18334c.iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m22403a(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f18335d
            monitor-enter(r0)
            int r1 = r3.f18336e     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0009:
            r3.f18336e = r4     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.applovin.exoplayer2.l.w$b>> r0 = r3.f18334c
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            com.applovin.exoplayer2.l.w$b r2 = (com.applovin.exoplayer2.p221l.C7765w.C7768b) r2
            if (r2 == 0) goto L_0x002a
            r2.onNetworkTypeChanged(r4)
            goto L_0x0012
        L_0x002a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.applovin.exoplayer2.l.w$b>> r2 = r3.f18334c
            r2.remove(r1)
            goto L_0x0012
        L_0x0030:
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p221l.C7765w.m22403a(int):void");
    }

    /* renamed from: b */
    private void m22406b() {
        Iterator<WeakReference<C7768b>> it = this.f18334c.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == null) {
                this.f18334c.remove(next);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m22407b(C7768b bVar) {
        bVar.onNetworkTypeChanged(mo55037a());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m22408c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return m22401a(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* renamed from: a */
    public int mo55037a() {
        int i;
        synchronized (this.f18335d) {
            i = this.f18336e;
        }
        return i;
    }

    /* renamed from: a */
    public void mo55038a(C7768b bVar) {
        m22406b();
        this.f18334c.add(new WeakReference(bVar));
        this.f18333b.post(new Runnable(bVar) {
            public final /* synthetic */ C7765w.C7768b f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7765w.this.m22407b(this.f$1);
            }
        });
    }
}
