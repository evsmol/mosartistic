package com.appodeal.ads;

import com.appodeal.ads.utils.Log;
import com.explorestack.iab.vast.TrackingEvent;
import java.util.TimerTask;

/* renamed from: com.appodeal.ads.f2 */
public final class C9184f2 extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ C9195g2 f23049a;

    /* renamed from: com.appodeal.ads.f2$a */
    public class C9185a implements Runnable {
        public C9185a() {
        }

        public final void run() {
            C9195g2 g2Var = C9184f2.this.f23049a;
            String str = C9195g2.f23097x;
            g2Var.mo59951a();
        }
    }

    /* renamed from: com.appodeal.ads.f2$b */
    public class C9186b implements Runnable {
        public C9186b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
            r0 = r2.f23051a.f23049a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r2 = this;
                com.appodeal.ads.f2 r0 = com.appodeal.ads.C9184f2.this
                com.appodeal.ads.g2 r0 = r0.f23049a
                java.lang.String r1 = com.appodeal.ads.C9195g2.f23097x
                r0.mo59955d()
                boolean r0 = com.appodeal.ads.Native.f22735e
                if (r0 == 0) goto L_0x0015
                com.appodeal.ads.f2 r0 = com.appodeal.ads.C9184f2.this
                com.appodeal.ads.g2 r0 = r0.f23049a
                boolean r0 = r0.f23117s
                if (r0 == 0) goto L_0x0023
            L_0x0015:
                com.appodeal.ads.f2 r0 = com.appodeal.ads.C9184f2.this
                com.appodeal.ads.g2 r0 = r0.f23049a
                java.util.Timer r1 = r0.f23107i
                if (r1 == 0) goto L_0x0023
                r1.cancel()
                r1 = 0
                r0.f23107i = r1
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9184f2.C9186b.run():void");
        }
    }

    /* renamed from: com.appodeal.ads.f2$c */
    public class C9187c implements Runnable {
        public C9187c() {
        }

        public final void run() {
            C9195g2 g2Var = C9184f2.this.f23049a;
            String str = C9195g2.f23097x;
            g2Var.mo59957f();
        }
    }

    /* renamed from: com.appodeal.ads.f2$d */
    public class C9188d implements Runnable {
        public C9188d() {
        }

        public final void run() {
            C9195g2 g2Var = C9184f2.this.f23049a;
            String str = C9195g2.f23097x;
            g2Var.mo59951a();
        }
    }

    public C9184f2(C9195g2 g2Var) {
        this.f23049a = g2Var;
    }

    public final void run() {
        Runnable cVar;
        int currentPosition;
        TrackingEvent trackingEvent;
        C9195g2 g2Var;
        try {
            if (this.f23049a.f23116r) {
                C9212h5.m27349a(new C9185a());
                return;
            }
            if (!C9195g2.m27314b(this.f23049a)) {
                cVar = new C9186b();
            } else {
                if (this.f23049a.mo59954c() && this.f23049a.f23105g.isPlaying()) {
                    if (this.f23049a.f23119u == 0) {
                        C9195g2 g2Var2 = this.f23049a;
                        g2Var2.f23119u = g2Var2.f23105g.getDuration();
                    }
                    if (this.f23049a.f23119u != 0 && (currentPosition = (this.f23049a.f23105g.getCurrentPosition() * 100) / this.f23049a.f23119u) >= this.f23049a.f23120v * 25) {
                        if (this.f23049a.f23120v == 0) {
                            Log.log(C9195g2.f23097x, "Video", String.format("started: %s%%", new Object[]{Integer.valueOf(currentPosition)}));
                            g2Var = this.f23049a;
                            trackingEvent = TrackingEvent.start;
                        } else if (this.f23049a.f23120v == 1) {
                            Log.log(C9195g2.f23097x, "Video", String.format("at first quartile: %s%%", new Object[]{Integer.valueOf(currentPosition)}));
                            g2Var = this.f23049a;
                            trackingEvent = TrackingEvent.firstQuartile;
                        } else if (this.f23049a.f23120v == 2) {
                            Log.log(C9195g2.f23097x, "Video", String.format("at midpoint: %s%%", new Object[]{Integer.valueOf(currentPosition)}));
                            g2Var = this.f23049a;
                            trackingEvent = TrackingEvent.midpoint;
                        } else {
                            if (this.f23049a.f23120v == 3) {
                                Log.log(C9195g2.f23097x, "Video", String.format("at third quartile: %s%%", new Object[]{Integer.valueOf(currentPosition)}));
                                g2Var = this.f23049a;
                                trackingEvent = TrackingEvent.thirdQuartile;
                            }
                            C9195g2.m27317e(this.f23049a);
                        }
                        C9195g2.m27312a(g2Var, trackingEvent);
                        C9195g2.m27317e(this.f23049a);
                    }
                }
                cVar = new C9187c();
            }
            C9212h5.m27349a(cVar);
        } catch (Throwable th) {
            Log.log(th);
            C9212h5.m27349a(new C9188d());
        }
    }
}
