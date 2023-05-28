package com.apm.insight.p165a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.runtime.C6761p;

/* renamed from: com.apm.insight.a.a */
public class C6549a implements ICrashCallback {

    /* renamed from: d */
    private static volatile C6549a f13987d;

    /* renamed from: a */
    private volatile String f13988a;

    /* renamed from: b */
    private volatile C6551b f13989b;

    /* renamed from: c */
    private volatile C6552c f13990c;

    /* renamed from: e */
    private volatile boolean f13991e = false;

    private C6549a() {
    }

    /* renamed from: a */
    public static C6549a m15999a() {
        if (f13987d == null) {
            synchronized (C6549a.class) {
                if (f13987d == null) {
                    f13987d = new C6549a();
                }
            }
        }
        return f13987d;
    }

    /* renamed from: a */
    public void mo51976a(CrashType crashType, long j, String str) {
    }

    /* renamed from: a */
    public void mo51977a(String str) {
    }

    /* renamed from: a */
    public void mo51978a(String str, C6551b bVar, C6552c cVar) {
        this.f13988a = str;
        this.f13989b = bVar;
        this.f13990c = cVar;
        if (!this.f13991e) {
            this.f13991e = true;
            C6761p.m17019b().mo52327a((Runnable) new Runnable() {
                public void run() {
                }
            });
        }
    }

    /* renamed from: b */
    public void mo51979b() {
    }

    public void onCrash(CrashType crashType, String str, Thread thread) {
        boolean equals = crashType.equals(CrashType.NATIVE);
    }
}
