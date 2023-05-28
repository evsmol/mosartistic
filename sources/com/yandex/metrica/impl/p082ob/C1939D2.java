package com.yandex.metrica.impl.p082ob;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.D2 */
public class C1939D2 {

    /* renamed from: a */
    private final List<C3240mm<C2875cm>> f5196a = new ArrayList();

    /* renamed from: b */
    private C2875cm f5197b;

    /* renamed from: com.yandex.metrica.impl.ob.D2$a */
    class C1940a implements C3240mm<C2875cm> {

        /* renamed from: a */
        final /* synthetic */ String f5198a;

        C1940a(C1939D2 d2, String str) {
            this.f5198a = str;
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            C2875cm cmVar = (C2875cm) obj;
            if (cmVar.isEnabled()) {
                cmVar.mo15283w(this.f5198a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        r0 = new com.yandex.metrica.impl.p082ob.C1974E2(r2, r3, "WebView interface setup failed because of an exception.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3 = r2.f5197b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r3 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        r2.f5196a.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        r0.mo15447b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15603a(android.webkit.WebView r3, com.yandex.metrica.impl.p082ob.C2603Uf r4) {
        /*
            r2 = this;
            r0 = 17
            boolean r0 = com.yandex.metrica.impl.p082ob.C1848A2.m6808a((int) r0)
            if (r0 == 0) goto L_0x0061
            android.webkit.WebSettings r0 = r3.getSettings()     // Catch:{ all -> 0x0046 }
            boolean r0 = r0.getJavaScriptEnabled()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0040
            com.yandex.metrica.AppMetricaJsInterface r0 = new com.yandex.metrica.AppMetricaJsInterface     // Catch:{ all -> 0x0046 }
            r0.<init>(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "AppMetrica"
            r3.addJavascriptInterface(r0, r1)     // Catch:{ all -> 0x0046 }
            com.yandex.metrica.AppMetricaInitializerJsInterface r0 = new com.yandex.metrica.AppMetricaInitializerJsInterface     // Catch:{ all -> 0x0046 }
            r0.<init>(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "AppMetricaInitializer"
            r3.addJavascriptInterface(r0, r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r3 = "WebView interface setup is successful."
            com.yandex.metrica.impl.ob.C2 r4 = new com.yandex.metrica.impl.ob.C2     // Catch:{ all -> 0x0046 }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x0046 }
            monitor-enter(r2)     // Catch:{ all -> 0x0046 }
            com.yandex.metrica.impl.ob.cm r3 = r2.f5197b     // Catch:{ all -> 0x003d }
            if (r3 != 0) goto L_0x0038
            java.util.List<com.yandex.metrica.impl.ob.mm<com.yandex.metrica.impl.ob.cm>> r3 = r2.f5196a     // Catch:{ all -> 0x003d }
            r3.add(r4)     // Catch:{ all -> 0x003d }
            goto L_0x003b
        L_0x0038:
            r4.mo15447b(r3)     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x0066
        L_0x003d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0040:
            java.lang.String r3 = "WebView interface setup failed because javascript is disabled for the WebView."
            r2.m6990a((java.lang.String) r3)     // Catch:{ all -> 0x0046 }
            goto L_0x0066
        L_0x0046:
            r3 = move-exception
            java.lang.String r4 = "WebView interface setup failed because of an exception."
            com.yandex.metrica.impl.ob.E2 r0 = new com.yandex.metrica.impl.ob.E2
            r0.<init>(r2, r3, r4)
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.cm r3 = r2.f5197b     // Catch:{ all -> 0x005e }
            if (r3 != 0) goto L_0x0059
            java.util.List<com.yandex.metrica.impl.ob.mm<com.yandex.metrica.impl.ob.cm>> r3 = r2.f5196a     // Catch:{ all -> 0x005e }
            r3.add(r0)     // Catch:{ all -> 0x005e }
            goto L_0x005c
        L_0x0059:
            r0.mo15447b(r3)     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r2)
            goto L_0x0066
        L_0x005e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0061:
            java.lang.String r3 = "WebView interface is not available on Android < 17."
            r2.m6990a((java.lang.String) r3)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C1939D2.mo15603a(android.webkit.WebView, com.yandex.metrica.impl.ob.Uf):void");
    }

    /* renamed from: a */
    public void mo15604a(C2875cm cmVar) {
        synchronized (this) {
            this.f5197b = cmVar;
        }
        for (C3240mm<C2875cm> b : this.f5196a) {
            b.mo15447b(cmVar);
        }
        this.f5196a.clear();
    }

    /* renamed from: a */
    private void m6990a(String str) {
        C1940a aVar = new C1940a(this, str);
        synchronized (this) {
            C2875cm cmVar = this.f5197b;
            if (cmVar == null) {
                this.f5196a.add(aVar);
            } else {
                aVar.mo15447b(cmVar);
            }
        }
    }
}
