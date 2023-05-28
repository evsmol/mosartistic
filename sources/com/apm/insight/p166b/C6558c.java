package com.apm.insight.p166b;

import android.os.SystemClock;
import com.apm.insight.runtime.C6737b;
import com.apm.insight.runtime.C6761p;

/* renamed from: com.apm.insight.b.c */
public class C6558c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static long f14028b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6555b f14029a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f14030c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Runnable f14031d = new Runnable() {
        public void run() {
            if (!C6558c.this.f14030c) {
                C6558c.this.f14029a.mo51985d();
                long unused = C6558c.f14028b = SystemClock.uptimeMillis();
                boolean a = C6563f.m16052a();
                C6761p.m17019b().mo52328a(C6558c.this.f14031d, 500);
                C6737b.m16912a(C6558c.f14028b);
            }
        }
    };

    C6558c(C6555b bVar) {
        this.f14029a = bVar;
        C6761p.m17019b().mo52328a(this.f14031d, 5000);
    }

    /* renamed from: c */
    public static boolean m16038c() {
        return SystemClock.uptimeMillis() - f14028b <= 15000;
    }

    /* renamed from: a */
    public void mo51990a() {
        if (!this.f14030c) {
            C6761p.m17019b().mo52328a(this.f14031d, 5000);
        }
    }

    /* renamed from: b */
    public void mo51991b() {
        this.f14030c = true;
    }
}
