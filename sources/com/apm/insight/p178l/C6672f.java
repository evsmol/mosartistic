package com.apm.insight.p178l;

import com.apm.insight.C6617h;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.C6718a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: com.apm.insight.l.f */
public class C6672f {
    /* renamed from: a */
    public static File m16506a(String str, int i, int i2) {
        File file = new File(C6685o.m16586a(C6617h.m16313g(), str), "logcat.txt");
        if (file.exists() && file.length() > 0) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m16705a(file.getAbsolutePath(), String.valueOf(i), String.valueOf(i2));
        return file;
    }

    /* renamed from: a */
    public static void m16507a() {
        try {
            m16506a(C6617h.m16312f(), C6617h.m16315i().getLogcatDumpCount(), C6617h.m16315i().getLogcatLevel());
            m16508b();
            m16510d();
            m16509c();
            m16511e();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static File m16508b() {
        File file = new File(C6685o.m16601e(C6617h.m16313g()), "maps.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m16722f(file.getAbsolutePath());
        return file;
    }

    /* renamed from: c */
    public static File m16509c() {
        File file = new File(C6685o.m16601e(C6617h.m16313g()), "meminfo.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m16717d(file.getAbsolutePath());
        return file;
    }

    /* renamed from: d */
    public static File m16510d() {
        File file = new File(C6685o.m16601e(C6617h.m16313g()), "fds.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m16719e(file.getAbsolutePath());
        return file;
    }

    /* renamed from: e */
    public static File m16511e() {
        File file = new File(C6685o.m16601e(C6617h.m16313g()), "threads.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m16723g(file.getAbsolutePath());
        return file;
    }

    /* renamed from: f */
    public static File m16512f() {
        BufferedWriter bufferedWriter;
        File file = new File(C6685o.m16601e(C6617h.m16313g()), "anr_trace.txt");
        if (file.exists() || !C6718a.m16804f()) {
            return file;
        }
        File file2 = new File("/data/anr/traces.txt");
        if (!file2.exists()) {
            return file;
        }
        BufferedReader bufferedReader = null;
        try {
            file.getParentFile().mkdirs();
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                int i = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            bufferedWriter.write(readLine);
                            bufferedWriter.write(10);
                            i += readLine.length();
                            if (i >= 1048576) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        C6677k.m16550a((Closeable) bufferedReader);
                        C6677k.m16550a((Closeable) bufferedWriter);
                        return file;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        C6677k.m16550a((Closeable) bufferedReader);
                        C6677k.m16550a((Closeable) bufferedWriter);
                        throw th;
                    }
                }
                C6677k.m16550a((Closeable) bufferedReader2);
            } catch (IOException unused2) {
                bufferedWriter = null;
                bufferedReader = bufferedReader2;
                C6677k.m16550a((Closeable) bufferedReader);
                C6677k.m16550a((Closeable) bufferedWriter);
                return file;
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = null;
                bufferedReader = bufferedReader2;
                C6677k.m16550a((Closeable) bufferedReader);
                C6677k.m16550a((Closeable) bufferedWriter);
                throw th;
            }
        } catch (IOException unused3) {
            bufferedWriter = null;
            C6677k.m16550a((Closeable) bufferedReader);
            C6677k.m16550a((Closeable) bufferedWriter);
            return file;
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter = null;
            C6677k.m16550a((Closeable) bufferedReader);
            C6677k.m16550a((Closeable) bufferedWriter);
            throw th;
        }
        C6677k.m16550a((Closeable) bufferedWriter);
        return file;
    }
}
