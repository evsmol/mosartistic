package com.apm.insight.runtime;

import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.C6762q;
import java.util.Comparator;

/* renamed from: com.apm.insight.runtime.g */
public class C6744g {

    /* renamed from: a */
    private static final Comparator<C6746a> f14491a = new Comparator<C6746a>() {
        /* renamed from: a */
        public final int compare(C6746a aVar, C6746a aVar2) {
            int i = aVar.f14494b + aVar.f14495c;
            int i2 = aVar2.f14494b + aVar2.f14495c;
            if (i != i2) {
                return i > i2 ? -1 : 1;
            }
            return 0;
        }
    };

    /* renamed from: b */
    private static byte[] f14492b = new byte[4096];

    /* renamed from: com.apm.insight.runtime.g$a */
    public static class C6746a {

        /* renamed from: a */
        public String f14493a = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;

        /* renamed from: b */
        public int f14494b;

        /* renamed from: c */
        public int f14495c;

        C6746a() {
        }
    }

    /* renamed from: a */
    public static long m16948a(int i) {
        return NativeImpl.m16714c(i) * C6762q.C6763a.m17022a();
    }
}
