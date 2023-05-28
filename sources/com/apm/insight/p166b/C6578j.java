package com.apm.insight.p166b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.apm.insight.b.j */
public final class C6578j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static int f14116a = 5;

    /* renamed from: b */
    private static C6580b f14117b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C6579a f14118c;

    /* renamed from: d */
    private static boolean f14119d;

    /* renamed from: e */
    private static Printer f14120e;

    /* renamed from: com.apm.insight.b.j$a */
    public interface C6579a {
        /* renamed from: a */
        void mo52015a(long j);
    }

    /* renamed from: com.apm.insight.b.j$b */
    static class C6580b implements Printer {

        /* renamed from: a */
        List<Printer> f14121a = new ArrayList();

        /* renamed from: b */
        List<Printer> f14122b = new ArrayList();

        /* renamed from: c */
        List<Printer> f14123c = new ArrayList();

        /* renamed from: d */
        boolean f14124d = false;

        /* renamed from: e */
        boolean f14125e = false;

        C6580b() {
        }

        public void println(String str) {
            if (!TextUtils.isEmpty(str)) {
                long currentTimeMillis = C6578j.f14118c != null ? System.currentTimeMillis() : 0;
                if (str.charAt(0) == '>' && this.f14125e) {
                    for (Printer next : this.f14123c) {
                        if (!this.f14121a.contains(next)) {
                            this.f14121a.add(next);
                        }
                    }
                    this.f14123c.clear();
                    this.f14125e = false;
                }
                if (this.f14121a.size() > C6578j.f14116a) {
                    Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
                }
                for (Printer next2 : this.f14121a) {
                    if (next2 != null) {
                        next2.println(str);
                    }
                }
                if (str.charAt(0) == '<' && this.f14124d) {
                    for (Printer next3 : this.f14122b) {
                        this.f14121a.remove(next3);
                        this.f14123c.remove(next3);
                    }
                    this.f14122b.clear();
                    this.f14124d = false;
                }
                if (C6578j.f14118c != null && currentTimeMillis > 0) {
                    C6578j.f14118c.mo52015a(System.currentTimeMillis() - currentTimeMillis);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m16097a() {
        if (!f14119d) {
            f14119d = true;
            f14117b = new C6580b();
            Printer d = m16101d();
            f14120e = d;
            if (d != null) {
                f14117b.f14121a.add(f14120e);
            }
            Looper.getMainLooper().setMessageLogging(f14117b);
        }
    }

    /* renamed from: a */
    public static void m16098a(Printer printer) {
        if (printer != null && !f14117b.f14123c.contains(printer)) {
            f14117b.f14123c.add(printer);
            f14117b.f14125e = true;
        }
    }

    /* renamed from: d */
    private static Printer m16101d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }
}
