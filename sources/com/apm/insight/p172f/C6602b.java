package com.apm.insight.p172f;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C6594a;
import com.apm.insight.entity.C6595b;
import com.apm.insight.entity.C6597c;
import com.apm.insight.p177k.C6651g;
import com.apm.insight.p178l.C6688q;
import com.apm.insight.p178l.C6693v;
import com.apm.insight.runtime.C6761p;
import com.apm.insight.runtime.p179a.C6729f;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.apm.insight.f.b */
public final class C6602b {
    /* renamed from: a */
    private static String m16234a(StackTraceElement[] stackTraceElementArr, int i) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < stackTraceElementArr.length) {
            C6693v.m16662a(stackTraceElementArr[i], sb);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m16236a(Object obj, Throwable th, String str, boolean z, Map<String, String> map, String str2, String str3) {
        try {
            final Object obj2 = obj;
            final Throwable th2 = th;
            final String str4 = str;
            final boolean z2 = z;
            final Map<String, String> map2 = map;
            final String str5 = str2;
            final String str6 = str3;
            C6761p.m17019b().mo52327a((Runnable) new Runnable() {
                public void run() {
                    C6602b.m16246c(obj2, th2, str4, z2, map2, str5, str6);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m16237a(Throwable th, String str, boolean z) {
        m16238a(th, str, z, "core_exception_monitor");
    }

    /* renamed from: a */
    public static void m16238a(Throwable th, String str, boolean z, String str2) {
        m16239a(th, str, z, (Map<String, String>) null, str2);
    }

    /* renamed from: a */
    public static void m16239a(Throwable th, String str, boolean z, Map<String, String> map, String str2) {
        try {
            final Throwable th2 = th;
            final String str3 = str;
            final boolean z2 = z;
            final Map<String, String> map2 = map;
            final String str4 = str2;
            C6761p.m17019b().mo52327a((Runnable) new Runnable() {
                public void run() {
                    C6602b.m16243b((Object) null, th2, str3, z2, (Map<String, String>) map2, str4);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m16240a(Map<String, String> map, C6597c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String next : map.keySet()) {
                    jSONObject.put(next, map.get(next));
                }
                cVar.mo52052a("custom", (Object) jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m16242a(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, Map<String, String> map) {
        try {
            final StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
            final int i2 = i;
            final String str3 = str;
            final String str4 = str2;
            final Map<String, String> map2 = map;
            C6761p.m17019b().mo52327a((Runnable) new Runnable() {
                public void run() {
                    C6602b.m16245b(stackTraceElementArr2, i2, str3, str4, "core_exception_monitor", (Map<String, String>) map2);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m16243b(Object obj, Throwable th, String str, boolean z, Map<String, String> map, String str2) {
        m16246c(obj, th, str, z, map, "EnsureNotReachHere", str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m16245b(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, String str3, Map<String, String> map) {
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i + 1) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    if (stackTraceElement != null) {
                        String a = m16234a(stackTraceElementArr, i);
                        if (!TextUtils.isEmpty(a)) {
                            C6597c a2 = C6597c.m16211a(stackTraceElement, a, str, Thread.currentThread().getName(), true, str2, str3);
                            m16240a(map, a2);
                            C6729f.m16893a().mo52278a(CrashType.ENSURE, (C6594a) a2);
                            C6651g.m16437a(a2);
                            C6688q.m16631b((Object) "[report] " + str);
                        }
                    }
                }
            } catch (Throwable th) {
                C6688q.m16632b(th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m16246c(Object obj, Throwable th, String str, boolean z, Map<String, String> map, String str2, String str3) {
        if (th != null) {
            try {
                StackTraceElement[] stackTrace = th.getStackTrace();
                StackTraceElement stackTraceElement = stackTrace[0];
                if (stackTraceElement != null) {
                    String a = C6693v.m16658a(th);
                    if (!TextUtils.isEmpty(a)) {
                        C6597c a2 = C6597c.m16211a(stackTraceElement, a, str, Thread.currentThread().getName(), z, str2, str3);
                        if (obj != null) {
                            a2.mo52052a("exception_line_num", (Object) C6595b.m16201a(obj, th, stackTrace));
                        }
                        m16240a(map, a2);
                        C6729f.m16893a().mo52278a(CrashType.ENSURE, (C6594a) a2);
                        C6651g.m16438a(obj, a2);
                        C6688q.m16631b((Object) "[reportException] " + str);
                    }
                }
            } catch (Throwable th2) {
                C6688q.m16632b(th2);
            }
        }
    }
}
