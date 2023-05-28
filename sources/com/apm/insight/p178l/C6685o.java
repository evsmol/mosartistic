package com.apm.insight.p178l;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C6617h;
import java.io.File;

/* renamed from: com.apm.insight.l.o */
public class C6685o {

    /* renamed from: a */
    private static String f14367a;

    /* renamed from: b */
    private static File f14368b;

    /* renamed from: c */
    private static File f14369c;

    /* renamed from: d */
    private static File f14370d;

    /* renamed from: a */
    public static File m16584a() {
        File file = f14369c;
        return file == null ? m16598d(C6617h.m16313g()) : file;
    }

    /* renamed from: a */
    public static File m16585a(Context context) {
        return new File(m16615j(context), "apminsight/CrashLogJava");
    }

    /* renamed from: a */
    public static File m16586a(Context context, String str) {
        return new File(m16615j(context) + '/' + "apminsight/CrashCommonLog" + '/' + str);
    }

    /* renamed from: a */
    public static File m16587a(File file) {
        return new File(file, "flog.txt");
    }

    /* renamed from: a */
    public static File m16588a(File file, String str) {
        return new File(file, file.getName() + str);
    }

    /* renamed from: a */
    public static String m16589a(String str) {
        return "dart_" + str;
    }

    /* renamed from: b */
    public static File m16590b(Context context) {
        return new File(m16615j(context), "apminsight/CrashLogSimple");
    }

    /* renamed from: b */
    public static File m16591b(File file) {
        return new File(file, "tombstone.txt");
    }

    /* renamed from: b */
    public static File m16592b(String str) {
        return new File(m16586a(C6617h.m16313g(), str), "fds.txt");
    }

    /* renamed from: b */
    public static String m16593b() {
        return "anr_" + C6617h.m16311e();
    }

    /* renamed from: c */
    public static File m16594c(Context context) {
        return new File(m16615j(context), "apminsight/RuntimeContext");
    }

    /* renamed from: c */
    public static File m16595c(File file) {
        return new File(file, "header.bin");
    }

    /* renamed from: c */
    public static File m16596c(String str) {
        return new File(m16586a(C6617h.m16313g(), str), "threads.txt");
    }

    /* renamed from: c */
    public static String m16597c() {
        return String.format("ensure_%s", new Object[]{C6617h.m16311e()});
    }

    /* renamed from: d */
    public static File m16598d(Context context) {
        if (f14369c == null) {
            if (context == null) {
                context = C6617h.m16313g();
            }
            f14369c = new File(m16615j(context), "apminsight/CrashLogNative");
        }
        return f14369c;
    }

    /* renamed from: d */
    public static File m16599d(File file) {
        return new File(m16586a(C6617h.m16313g(), file.getName()), "maps.txt");
    }

    /* renamed from: d */
    public static File m16600d(String str) {
        return new File(m16586a(C6617h.m16313g(), str), "meminfo.txt");
    }

    /* renamed from: e */
    public static File m16601e(Context context) {
        if (f14370d == null) {
            f14370d = new File(m16615j(context) + '/' + "apminsight/CrashCommonLog" + '/' + C6617h.m16312f());
        }
        return f14370d;
    }

    /* renamed from: e */
    public static File m16602e(File file) {
        return new File(file, "callback.json");
    }

    /* renamed from: e */
    public static File m16603e(String str) {
        return new File(m16586a(C6617h.m16313g(), str), "pthreads.txt");
    }

    /* renamed from: f */
    public static File m16604f(Context context) {
        return new File(m16615j(context), "apminsight/CrashCommonLog");
    }

    /* renamed from: f */
    public static File m16605f(File file) {
        return new File(file, "upload.json");
    }

    /* renamed from: f */
    public static File m16606f(String str) {
        return new File(m16586a(C6617h.m16313g(), str), "rountines.txt");
    }

    /* renamed from: g */
    public static File m16607g(Context context) {
        return new File(m16615j(context), "apminsight/issueCrashTimes");
    }

    /* renamed from: g */
    public static File m16608g(File file) {
        return new File(file, "javastack.txt");
    }

    /* renamed from: g */
    public static File m16609g(String str) {
        return new File(m16586a(C6617h.m16313g(), str), "leakd_threads.txt");
    }

    /* renamed from: h */
    public static File m16610h(Context context) {
        return new File(m16615j(context) + '/' + "apminsight/issueCrashTimes" + '/' + "current.times");
    }

    /* renamed from: h */
    public static File m16611h(File file) {
        return new File(m16586a(C6617h.m16313g(), file.getName()), "logcat.txt");
    }

    /* renamed from: i */
    public static File m16612i(Context context) {
        return new File(m16615j(context), "apminsight/alogCrash");
    }

    /* renamed from: i */
    public static File m16613i(File file) {
        return new File(m16586a(C6617h.m16313g(), file.getName()), "fds.txt");
    }

    /* renamed from: j */
    public static File m16614j(File file) {
        return new File(m16586a(C6617h.m16313g(), file.getName()), "threads.txt");
    }

    /* renamed from: j */
    public static String m16615j(Context context) {
        if (TextUtils.isEmpty(f14367a)) {
            try {
                f14367a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e) {
                f14367a = "/sdcard/";
                e.printStackTrace();
            }
        }
        return f14367a;
    }

    /* renamed from: k */
    public static File m16616k(File file) {
        return new File(m16586a(C6617h.m16313g(), file.getName()), "meminfo.txt");
    }

    /* renamed from: l */
    public static File m16617l(File file) {
        return new File(m16586a(C6617h.m16313g(), file.getName()), "pthreads.txt");
    }

    /* renamed from: m */
    public static File m16618m(File file) {
        return new File(m16586a(C6617h.m16313g(), file.getName()), "rountines.txt");
    }

    /* renamed from: n */
    public static File m16619n(File file) {
        return new File(m16586a(C6617h.m16313g(), file.getName()), "leakd_threads.txt");
    }

    /* renamed from: o */
    public static File m16620o(File file) {
        return new File(file, "abortmsg.txt");
    }
}
