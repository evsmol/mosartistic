package com.apm.insight.p174h;

import com.apm.insight.C6553b;
import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6688q;
import com.apm.insight.runtime.C6761p;
import com.apm.insight.runtime.C6764r;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.apm.insight.h.b */
public class C6620b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static HashMap<String, String> f14231a;

    /* renamed from: a */
    public static String m16331a() {
        return C6617h.m16313g().getFilesDir() + "/apminsight/selflib/";
    }

    /* renamed from: a */
    public static String m16332a(String str) {
        return C6617h.m16313g().getFilesDir() + "/apminsight/selflib/" + "lib" + str + ".so";
    }

    /* renamed from: b */
    public static void m16334b(final String str) {
        C6761p.m17019b().mo52327a((Runnable) new Runnable() {

            /* renamed from: a */
            boolean f14232a = false;

            public void run() {
                String str;
                String str2;
                C6620b.m16338d();
                if (!C6620b.m16340f(str)) {
                    C6764r.m17029a("updateSo", str);
                    File file = new File(C6620b.m16332a(str));
                    file.getParentFile().mkdirs();
                    if (file.exists()) {
                        file.delete();
                    }
                    C6688q.m16626a("doUnpackLibrary: " + str);
                    String str3 = null;
                    try {
                        str3 = C6622c.m16341a(C6617h.m16313g(), str, file);
                    } catch (Throwable th) {
                        C6764r.m17029a("updateSoError", str);
                        C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                    }
                    if (str3 == null) {
                        C6620b.f14231a.put(file.getName(), "1.3.8.nourl-alpha.0");
                        try {
                            C6675i.m16524a(new File(C6620b.m16339e(str)), "1.3.8.nourl-alpha.0", false);
                        } catch (Throwable unused) {
                        }
                        str2 = str;
                        str = "updateSoSuccess";
                    } else if (!this.f14232a) {
                        this.f14232a = true;
                        C6764r.m17029a("updateSoPostRetry", str);
                        C6761p.m17019b().mo52328a((Runnable) this, 3000);
                        return;
                    } else {
                        str2 = str;
                        str = "updateSoFailed";
                    }
                    C6764r.m17029a(str, str2);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m16338d() {
        if (f14231a == null) {
            f14231a = new HashMap<>();
            File file = new File(C6617h.m16313g().getFilesDir(), "/apminsight/selflib/");
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    if (str.endsWith(".ver")) {
                        String substring = str.substring(0, str.length() - 4);
                        try {
                            f14231a.put(substring, C6675i.m16540c(file.getAbsolutePath() + "/" + str));
                        } catch (Throwable th) {
                            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                        }
                    } else if (!str.endsWith(".so")) {
                        C6675i.m16532a(new File(file, str));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static String m16339e(String str) {
        return C6617h.m16313g().getFilesDir() + "/apminsight/selflib/" + str + ".ver";
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m16340f(String str) {
        return "1.3.8.nourl-alpha.0".equals(f14231a.get(str)) && new File(m16332a(str)).exists();
    }
}
