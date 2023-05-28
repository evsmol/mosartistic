package com.yandex.metrica.impl.p082ob;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.yandex.metrica.impl.p081ac.CrashpadServiceHelper;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.w7 */
public class C3608w7 {

    /* renamed from: a */
    private final String f9372a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public LocalServerSocket f9373b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f9374c;

    /* renamed from: d */
    private final C1884B7 f9375d;

    /* renamed from: e */
    private final C3240mm<String> f9376e;

    /* renamed from: f */
    private final String f9377f;

    /* renamed from: g */
    private List<C3240mm<String>> f9378g;

    /* renamed from: h */
    private final Thread f9379h;

    /* renamed from: com.yandex.metrica.impl.ob.w7$a */
    class C3609a extends Thread {
        C3609a() {
        }

        public void run() {
            while (C3608w7.this.f9374c) {
                try {
                    LocalSocket accept = C3608w7.this.f9373b.accept();
                    byte[] bArr = new byte[256];
                    int read = accept.getInputStream().read(bArr);
                    accept.close();
                    byte[] bArr2 = new byte[read];
                    System.arraycopy(bArr, 0, bArr2, 0, read);
                    C3608w7.m10934a(C3608w7.this, new String(bArr2));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w7$b */
    class C3610b implements C3240mm<String> {
        C3610b() {
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            CrashpadServiceHelper.setUpServiceHelper((String) obj);
        }
    }

    public C3608w7(String str, String str2) {
        this(str, str2, C1884B7.m6911a(), new C3610b());
    }

    C3608w7(String str, String str2, C1884B7 b7, C3240mm<String> mmVar) {
        this.f9374c = false;
        this.f9378g = new LinkedList();
        this.f9379h = new C3609a();
        this.f9372a = str;
        this.f9377f = str2;
        this.f9375d = b7;
        this.f9376e = mmVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|(3:12|13|(1:15))|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0034 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18357a(com.yandex.metrica.impl.p082ob.C3240mm<java.lang.String> r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.yandex.metrica.impl.ob.mm<java.lang.String>> r0 = r1.f9378g     // Catch:{ all -> 0x003a }
            r0.add(r2)     // Catch:{ all -> 0x003a }
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            boolean r2 = r1.f9374c
            if (r2 != 0) goto L_0x0039
            java.lang.String r2 = r1.f9377f
            if (r2 == 0) goto L_0x0039
            monitor-enter(r1)
            boolean r2 = r1.f9374c     // Catch:{ all -> 0x0036 }
            if (r2 != 0) goto L_0x0034
            com.yandex.metrica.impl.ob.B7 r2 = r1.f9375d     // Catch:{ all -> 0x0034 }
            boolean r2 = r2.mo15549b()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0034
            android.net.LocalServerSocket r2 = new android.net.LocalServerSocket     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r1.f9372a     // Catch:{ all -> 0x0034 }
            r2.<init>(r0)     // Catch:{ all -> 0x0034 }
            r1.f9373b = r2     // Catch:{ all -> 0x0034 }
            r2 = 1
            r1.f9374c = r2     // Catch:{ all -> 0x0034 }
            com.yandex.metrica.impl.ob.mm<java.lang.String> r2 = r1.f9376e     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r1.f9377f     // Catch:{ all -> 0x0034 }
            r2.mo15447b(r0)     // Catch:{ all -> 0x0034 }
            java.lang.Thread r2 = r1.f9379h     // Catch:{ all -> 0x0034 }
            r2.start()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            goto L_0x0039
        L_0x0036:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            throw r2
        L_0x0039:
            return
        L_0x003a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3608w7.mo18357a(com.yandex.metrica.impl.ob.mm):void");
    }

    /* renamed from: b */
    public synchronized void mo18358b(C3240mm<String> mmVar) {
        this.f9378g.remove(mmVar);
    }

    /* renamed from: a */
    static void m10934a(C3608w7 w7Var, String str) {
        synchronized (w7Var) {
            for (C3240mm<String> b : w7Var.f9378g) {
                b.mo15447b(str);
            }
        }
    }
}
