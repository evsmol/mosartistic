package com.apm.insight.p166b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.apm.insight.b.i */
public class C6575i {

    /* renamed from: a */
    private static volatile boolean f14108a;

    /* renamed from: b */
    private static Printer f14109b;

    /* renamed from: c */
    private static final CopyOnWriteArrayList<C6562e> f14110c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private static C6562e f14111d;

    /* renamed from: e */
    private static volatile C6577a f14112e;

    /* renamed from: f */
    private static volatile boolean f14113f = false;

    /* renamed from: g */
    private static long f14114g = 0;

    /* renamed from: h */
    private static int f14115h = 0;

    /* renamed from: com.apm.insight.b.i$a */
    public interface C6577a {
        /* renamed from: a */
        void mo52014a(long j);
    }

    /* renamed from: a */
    public static void m16093a() {
        if (!f14108a) {
            f14108a = true;
            f14109b = new Printer() {
                public void println(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        boolean z = false;
                        if (str.charAt(0) == '>') {
                            z = true;
                        } else if (str.charAt(0) != '<') {
                            return;
                        }
                        C6575i.m16095a(z, str);
                    }
                }
            };
            C6578j.m16097a();
            C6578j.m16098a(f14109b);
        }
    }

    /* renamed from: a */
    public static void m16094a(C6562e eVar) {
        synchronized (f14110c) {
            f14110c.add(eVar);
        }
    }

    /* renamed from: a */
    public static void m16095a(boolean z, String str) {
        C6562e eVar;
        C6562e eVar2;
        long nanoTime = System.nanoTime();
        C6562e.f14040a = nanoTime / 1000000;
        C6562e.f14041b = SystemClock.currentThreadTimeMillis();
        if (z && (eVar2 = f14111d) != null && eVar2.mo51995a()) {
            f14111d.mo51994a(str);
        }
        CopyOnWriteArrayList<C6562e> copyOnWriteArrayList = f14110c;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            C6562e eVar3 = copyOnWriteArrayList.get(i);
            if (eVar3 != null && eVar3.mo51995a()) {
                boolean z2 = eVar3.f14042c;
                if (z) {
                    if (!z2) {
                        eVar3.mo51994a(str);
                    }
                } else if (z2) {
                    eVar3.mo51996b(str);
                }
            } else if (!z && eVar3.f14042c) {
                eVar3.mo51996b("");
            }
        }
        if (!z && (eVar = f14111d) != null && eVar.mo51995a()) {
            f14111d.mo51996b("");
        }
        if (f14113f) {
            f14114g += System.nanoTime() - nanoTime;
            int i2 = f14115h;
            f14115h = i2 + 1;
            if (i2 >= 1000) {
                if (f14112e != null) {
                    f14112e.mo52014a(f14114g);
                }
                f14115h = 0;
                f14114g = 0;
                f14113f = false;
            }
        }
    }
}
