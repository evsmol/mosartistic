package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import com.apm.insight.p166b.C6563f;
import com.apm.insight.p178l.C6688q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.apm.insight.runtime.l */
public class C6752l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Printer f14501a;

    /* renamed from: b */
    private static C6752l f14502b;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Printer f14503f = new Printer() {
        public void println(String str) {
            if (str != null) {
                if (str.charAt(0) == '>') {
                    C6752l.m16960a().mo52307a(str);
                } else if (str.charAt(0) == '<') {
                    C6752l.m16960a().mo52308b(str);
                }
                if (C6752l.f14501a != null && C6752l.f14501a != C6752l.f14503f) {
                    C6752l.f14501a.println(str);
                }
            }
        }
    };

    /* renamed from: c */
    private long f14504c = -1;

    /* renamed from: d */
    private final List<Printer> f14505d = new ArrayList();

    /* renamed from: e */
    private final List<Printer> f14506e = new ArrayList();

    /* renamed from: g */
    private boolean f14507g = false;

    private C6752l() {
    }

    /* renamed from: a */
    public static C6752l m16960a() {
        if (f14502b == null) {
            synchronized (C6752l.class) {
                if (f14502b == null) {
                    f14502b = new C6752l();
                }
            }
        }
        return f14502b;
    }

    /* renamed from: a */
    private static void m16961a(List<? extends Printer> list, String str) {
        if (list != null && !list.isEmpty()) {
            try {
                int size = list.size();
                int i = 0;
                while (i < size) {
                    Printer printer = (Printer) list.get(i);
                    if (printer != null) {
                        printer.println(str);
                        i++;
                    } else {
                        return;
                    }
                }
            } catch (Throwable th) {
                C6688q.m16630a(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52307a(String str) {
        C6563f.m16051a(false);
        this.f14504c = -1;
        try {
            m16961a(this.f14505d, str);
        } catch (Exception e) {
            C6688q.m16630a((Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo52308b(String str) {
        this.f14504c = SystemClock.uptimeMillis();
        try {
            m16961a(this.f14506e, str);
        } catch (Exception e) {
            C6688q.m16632b((Throwable) e);
        }
    }

    /* renamed from: b */
    public boolean mo52309b() {
        return this.f14504c != -1 && SystemClock.uptimeMillis() - this.f14504c > 5000;
    }
}
