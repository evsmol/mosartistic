package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.apm.insight.runtime.p */
public class C6761p {

    /* renamed from: a */
    private static volatile C6770u f14524a;

    /* renamed from: b */
    private static volatile Handler f14525b;

    /* renamed from: a */
    public static HandlerThread m17018a() {
        if (f14524a == null) {
            synchronized (C6761p.class) {
                if (f14524a == null) {
                    f14524a = new C6770u("default_npth_thread");
                    f14524a.mo52329b();
                }
            }
        }
        return f14524a.mo52331c();
    }

    /* renamed from: b */
    public static C6770u m17019b() {
        if (f14524a == null) {
            m17018a();
        }
        return f14524a;
    }
}
