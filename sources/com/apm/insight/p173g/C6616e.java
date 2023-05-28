package com.apm.insight.p173g;

import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6689r;
import com.apm.insight.runtime.p179a.C6720b;

/* renamed from: com.apm.insight.g.e */
public class C6616e {
    /* renamed from: a */
    public static boolean m16296a(long j) {
        if (C6689r.m16637a(2)) {
            return true;
        }
        if (C6689r.m16637a(1024)) {
            return false;
        }
        return (C6720b.m16829c() == -1 || j - C6720b.m16829c() <= C6617h.m16315i().getLaunchCrashInterval()) && (!C6617h.m16319m() || C6617h.m16322p() != 0);
    }
}
