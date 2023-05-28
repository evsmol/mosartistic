package com.apm.insight;

import com.apm.insight.p172f.C6601a;
import com.apm.insight.p172f.C6602b;
import com.apm.insight.p178l.C6676j;
import com.apm.insight.runtime.C6754m;
import java.util.Map;

/* renamed from: com.apm.insight.c */
public class C6582c {
    public C6582c() {
        C6601a.m16233a();
    }

    /* renamed from: a */
    public void mo52017a(String str) {
        mo52018a(str, "EnsureNotReachHere", (Map<String, String>) null);
    }

    /* renamed from: a */
    public void mo52018a(String str, String str2, Map<String, String> map) {
        if (C6617h.m16315i().isEnsureEnable()) {
            C6602b.m16242a(Thread.currentThread().getStackTrace(), 5, str, str2, map);
        }
    }

    /* renamed from: a */
    public void mo52019a(String str, Throwable th) {
        C6754m.m16968a(th, str);
    }

    /* renamed from: a */
    public void mo52020a(Throwable th, String str) {
        if (mo52021a(th)) {
            C6602b.m16237a(th, str, true);
        }
    }

    /* renamed from: a */
    public boolean mo52021a(Throwable th) {
        return C6617h.m16315i().isEnsureEnable() && !C6676j.m16549a(th);
    }
}
