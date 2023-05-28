package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import com.apm.insight.C6553b;
import com.apm.insight.C6617h;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.entity.C6594a;
import com.apm.insight.entity.C6598d;
import com.apm.insight.entity.Header;
import com.apm.insight.p169e.C6589a;
import com.apm.insight.p169e.p170a.C6590a;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6677k;
import com.apm.insight.p178l.C6685o;
import com.apm.insight.p178l.C6690s;
import com.apm.insight.p178l.C6695w;
import com.apm.insight.runtime.C6762q;
import com.apm.insight.runtime.C6766s;
import com.appnext.base.p264b.C8849c;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.nativecrash.b */
public final class C6700b {

    /* renamed from: d */
    private static Boolean f14386d;

    /* renamed from: a */
    private final Context f14387a;

    /* renamed from: b */
    private JSONObject f14388b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6702b f14389c;

    /* renamed from: com.apm.insight.nativecrash.b$a */
    private static class C6701a {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public static String m16765b(File file) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        C6677k.m16550a((Closeable) bufferedReader2);
                        return "";
                    } else if (!readLine.startsWith("[FATAL:jni_android.cc") || !readLine.contains("Please include Java exception stack in crash report ttwebview:")) {
                        C6677k.m16550a((Closeable) bufferedReader2);
                        return "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int indexOf = readLine.indexOf(" ttwebview:");
                        sb.append("Caused by: ");
                        sb.append("Please include Java exception stack in crash report");
                        sb.append("\n");
                        sb.append(readLine.substring(indexOf + 11));
                        while (true) {
                            sb.append("\n");
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 != null) {
                                sb.append(readLine2);
                            } else {
                                String sb2 = sb.toString();
                                C6677k.m16550a((Closeable) bufferedReader2);
                                return sb2;
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                        return "";
                    } finally {
                        C6677k.m16550a((Closeable) bufferedReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                return "";
            }
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$b */
    private class C6702b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C6714d f14391b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C6699a f14392c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final File f14393d;

        /* renamed from: e */
        private final File f14394e;

        public C6702b(File file) {
            this.f14393d = file;
            this.f14394e = C6685o.m16586a(C6617h.m16313g(), file.getName());
            this.f14392c = new C6699a(file);
            this.f14391b = new C6714d(file);
            if (this.f14392c.mo52177a() && this.f14391b.mo52201a() == null) {
                this.f14391b.mo52202a(file);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001c A[Catch:{ all -> 0x0017 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo52192a() {
            /*
                r3 = this;
                com.apm.insight.nativecrash.a r0 = r3.f14392c
                java.util.Map r0 = r0.mo52179c()
                if (r0 == 0) goto L_0x0019
                boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0017 }
                if (r1 != 0) goto L_0x0019
                java.lang.String r1 = "start_time"
                java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0017 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0017 }
                goto L_0x001a
            L_0x0017:
                r0 = move-exception
                goto L_0x0021
            L_0x0019:
                r0 = 0
            L_0x001a:
                if (r0 == 0) goto L_0x002a
                long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0017 }
                return r0
            L_0x0021:
                com.apm.insight.c r1 = com.apm.insight.C6553b.m16004a()
                java.lang.String r2 = "NPTH_CATCH"
                r1.mo52019a((java.lang.String) r2, (java.lang.Throwable) r0)
            L_0x002a:
                long r0 = java.lang.System.currentTimeMillis()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C6700b.C6702b.mo52192a():long");
        }

        /* renamed from: b */
        public File mo52193b() {
            return this.f14393d;
        }

        /* renamed from: c */
        public boolean mo52194c() {
            return this.f14392c.mo52177a();
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$c */
    public class C6703c extends C6705e {
        C6703c() {
            super();
            this.f14398c = "Total FD Count:";
            this.f14397b = C6685o.m16613i(C6700b.this.f14389c.mo52193b());
            this.f14399d = ":";
            this.f14400e = -2;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$d */
    public class C6704d extends C6705e {
        C6704d() {
            super();
            this.f14398c = "VmSize:";
            this.f14397b = C6685o.m16616k(C6700b.this.f14389c.mo52193b());
            this.f14399d = "\\s+";
            this.f14400e = -1;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$e */
    public class C6705e {

        /* renamed from: b */
        protected File f14397b;

        /* renamed from: c */
        protected String f14398c;

        /* renamed from: d */
        protected String f14399d;

        /* renamed from: e */
        protected int f14400e;

        public C6705e() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[DONT_GENERATE] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo52195a() {
            /*
                r5 = this;
                java.io.File r0 = r5.f14397b
                boolean r0 = r0.exists()
                r1 = -1
                if (r0 == 0) goto L_0x004f
                java.io.File r0 = r5.f14397b
                boolean r0 = r0.isFile()
                if (r0 != 0) goto L_0x0012
                goto L_0x004f
            L_0x0012:
                r0 = 0
                java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0035 }
                java.io.File r3 = r5.f14397b     // Catch:{ all -> 0x0035 }
                r2.<init>(r3)     // Catch:{ all -> 0x0035 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
                r3.<init>(r2)     // Catch:{ all -> 0x0035 }
                r0 = -1
            L_0x0020:
                java.lang.String r2 = r3.readLine()     // Catch:{ all -> 0x0031 }
                if (r2 == 0) goto L_0x002d
                int r0 = r5.mo52196a(r2)     // Catch:{ all -> 0x0031 }
                if (r0 != r1) goto L_0x002d
                goto L_0x0020
            L_0x002d:
                com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r3)
                goto L_0x0047
            L_0x0031:
                r1 = move-exception
                r2 = r0
                r0 = r3
                goto L_0x0038
            L_0x0035:
                r2 = move-exception
                r1 = r2
                r2 = -1
            L_0x0038:
                com.apm.insight.c r3 = com.apm.insight.C6553b.m16004a()     // Catch:{ all -> 0x0048 }
                java.lang.String r4 = "NPTH_CATCH"
                r3.mo52019a((java.lang.String) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0048 }
                if (r0 == 0) goto L_0x0046
                com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r0)
            L_0x0046:
                r0 = r2
            L_0x0047:
                return r0
            L_0x0048:
                r1 = move-exception
                if (r0 == 0) goto L_0x004e
                com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r0)
            L_0x004e:
                throw r1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C6700b.C6705e.mo52195a():int");
        }

        /* renamed from: a */
        public int mo52196a(String str) {
            int i = this.f14400e;
            if (!str.startsWith(this.f14398c)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f14399d)[1].trim());
            } catch (NumberFormatException e) {
                C6553b.m16004a().mo52019a("NPTH_CATCH", (Throwable) e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$f */
    public class C6706f extends C6705e {
        C6706f() {
            super();
            this.f14398c = "Total Threads Count:";
            this.f14397b = C6685o.m16614j(C6700b.this.f14389c.mo52193b());
            this.f14399d = ":";
            this.f14400e = -2;
        }
    }

    public C6700b(Context context) {
        this.f14387a = context;
    }

    /* renamed from: a */
    private String m16736a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append(str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
        }
        return sb.toString().toUpperCase();
    }

    /* renamed from: a */
    private void m16737a(C6594a aVar) {
        aVar.mo52045a(m16748n());
        aVar.mo52052a("is_native_crash", (Object) 1);
        aVar.mo52052a("repack_time", (Object) Long.valueOf(System.currentTimeMillis()));
        aVar.mo52052a("crash_uuid", (Object) this.f14389c.mo52193b().getName());
        aVar.mo52052a("jiffy", (Object) Long.valueOf(C6762q.C6763a.m17022a()));
    }

    /* renamed from: a */
    private void m16738a(Map<String, String> map) {
        String str = "true";
        map.put("has_fds_file", C6685o.m16613i(this.f14389c.mo52193b()).exists() ? str : "false");
        File h = C6685o.m16611h(this.f14389c.mo52193b());
        map.put("has_logcat_file", (!h.exists() || h.length() <= 128) ? "false" : str);
        map.put("has_maps_file", C6685o.m16599d(this.f14389c.mo52193b()).exists() ? str : "false");
        map.put("has_tombstone_file", C6685o.m16591b(this.f14389c.mo52193b()).exists() ? str : "false");
        map.put("has_meminfo_file", C6685o.m16616k(this.f14389c.mo52193b()).exists() ? str : "false");
        if (!C6685o.m16614j(this.f14389c.mo52193b()).exists()) {
            str = "false";
        }
        map.put("has_threads_file", str);
    }

    /* renamed from: b */
    private void m16739b(C6594a aVar) {
        C6598d.m16214b(aVar.mo52066h());
        HashMap hashMap = new HashMap();
        if (m16747m()) {
            hashMap.put("is_root", "true");
            aVar.mo52052a("is_root", (Object) "true");
        } else {
            hashMap.put("is_root", "false");
            aVar.mo52052a("is_root", (Object) "false");
        }
        m16738a((Map<String, String>) hashMap);
        int o = m16749o();
        if (o > 0) {
            if (o > 960) {
                hashMap.put("fd_leak", "true");
            } else {
                hashMap.put("fd_leak", "false");
            }
            aVar.mo52052a("fd_count", (Object) Integer.valueOf(o));
        }
        int p = m16750p();
        if (p > 0) {
            if (p > 350) {
                hashMap.put("threads_leak", "true");
            } else {
                hashMap.put("threads_leak", "false");
            }
            aVar.mo52052a("threads_count", (Object) Integer.valueOf(p));
        }
        int q = m16751q();
        if (q > 0) {
            if (((long) q) > m16746i()) {
                hashMap.put("memory_leak", "true");
            } else {
                hashMap.put("memory_leak", "false");
            }
            aVar.mo52052a("memory_size", (Object) Integer.valueOf(q));
        }
        hashMap.put("sdk_version", "1.3.8.nourl-alpha.0");
        hashMap.put("has_java_stack", String.valueOf(aVar.mo52066h().opt("java_data") != null));
        JSONArray a = C6707c.m16775a(C6685o.m16617l(this.f14389c.f14393d), C6685o.m16618m(this.f14389c.f14393d));
        hashMap.put("leak_threads_count", String.valueOf(a.length()));
        if (a.length() > 0) {
            try {
                C6675i.m16526a(C6685o.m16619n(this.f14389c.f14393d), a, false);
            } catch (Throwable unused) {
            }
        }
        aVar.mo52057b();
        aVar.mo52059c();
        aVar.mo52058c((Map<? extends String, ? extends String>) hashMap);
    }

    /* renamed from: c */
    private void m16740c(C6594a aVar) {
        Map<String, String> b = this.f14389c.f14391b.mo52203b();
        if (!b.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (String next : b.keySet()) {
                String a = m16736a(b.get(next));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lib_name", next);
                    jSONObject.put("lib_uuid", a);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    C6553b.m16004a().mo52019a("NPTH_CATCH", (Throwable) e);
                }
            }
            aVar.mo52052a("crash_lib_uuid", (Object) jSONArray);
        }
    }

    /* renamed from: d */
    private void m16741d(C6594a aVar) {
        File e = C6685o.m16602e(this.f14389c.mo52193b());
        if (e.exists() || this.f14388b != null) {
            try {
                aVar.mo52060c(this.f14388b == null ? new JSONObject(C6675i.m16540c(e.getAbsolutePath())) : this.f14388b);
                aVar.mo52047a("has_callback", "true");
                if (aVar.mo52066h().opt("storage") == null) {
                    aVar.mo52056b(C6695w.m16683a(C6617h.m16313g()));
                }
                C6690s.m16639a(aVar, aVar.mo52067i(), CrashType.NATIVE);
            } catch (Throwable th) {
                C6553b.m16004a().mo52019a("NPTH_CATCH", th);
            }
            long j = -1;
            long optLong = aVar.mo52066h().optLong("crash_time", -1);
            long optLong2 = aVar.mo52066h().optLong("java_end", -1);
            if (!(optLong2 == -1 || optLong == -1)) {
                j = optLong2 - optLong;
            }
            try {
                aVar.mo52054b("total_cost", String.valueOf(j));
                aVar.mo52047a("total_cost", String.valueOf(j / 1000));
            } catch (Throwable unused) {
            }
        } else {
            aVar.mo52056b(C6695w.m16683a(C6617h.m16313g()));
            aVar.mo52047a("has_callback", "false");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16742e(com.apm.insight.entity.C6594a r5) {
        /*
            r4 = this;
            com.apm.insight.nativecrash.b$b r0 = r4.f14389c
            java.io.File r0 = r0.mo52193b()
            java.io.File r0 = com.apm.insight.p178l.C6685o.m16608g((java.io.File) r0)
            boolean r1 = r0.exists()
            java.lang.String r2 = "NPTH_CATCH"
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x001b }
            java.lang.String r0 = com.apm.insight.p178l.C6693v.m16657a((java.lang.String) r0)     // Catch:{ all -> 0x001b }
            goto L_0x0025
        L_0x001b:
            r0 = move-exception
            com.apm.insight.c r1 = com.apm.insight.C6553b.m16004a()
            r1.mo52019a((java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x0023:
            java.lang.String r0 = ""
        L_0x0025:
            com.apm.insight.nativecrash.b$b r1 = r4.f14389c
            java.io.File r1 = r1.mo52193b()
            java.io.File r1 = com.apm.insight.p178l.C6685o.m16620o(r1)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x0055
            java.lang.String r1 = com.apm.insight.nativecrash.C6700b.C6701a.m16765b(r1)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0054
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "\n"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            goto L_0x0055
        L_0x0054:
            r0 = r1
        L_0x0055:
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0069
            java.lang.String r1 = "java_data"
            r5.mo52052a((java.lang.String) r1, (java.lang.Object) r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r5 = move-exception
            com.apm.insight.c r0 = com.apm.insight.C6553b.m16004a()
            r0.mo52019a((java.lang.String) r2, (java.lang.Throwable) r5)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C6700b.m16742e(com.apm.insight.entity.a):void");
    }

    /* renamed from: f */
    private void m16743f(C6594a aVar) {
        File a = C6685o.m16587a(this.f14389c.mo52193b());
        if (a.exists()) {
            try {
                aVar.mo52052a("native_log", (Object) C6675i.m16536b(C6675i.m16521a(a.getAbsolutePath(), "\n"), "\n"));
            } catch (Throwable th) {
                C6553b.m16004a().mo52019a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: g */
    private void m16744g(C6594a aVar) {
        File h = C6685o.m16611h(this.f14389c.mo52193b());
        if (!h.exists()) {
            NativeImpl.m16705a(h.getAbsolutePath(), String.valueOf(C6617h.m16315i().getLogcatDumpCount()), String.valueOf(C6617h.m16315i().getLogcatLevel()));
        }
        BufferedReader bufferedReader = null;
        JSONArray jSONArray = new JSONArray();
        String str = " " + this.f14389c.f14392c.mo52179c().get("pid") + " ";
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(h));
            try {
                if (h.length() > 512000) {
                    bufferedReader2.skip(h.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if ((readLine.length() > 32 ? readLine.substring(0, 31) : readLine).contains(str)) {
                        jSONArray.put(readLine);
                    }
                }
                C6677k.m16550a((Closeable) bufferedReader2);
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C6677k.m16550a((Closeable) bufferedReader);
                aVar.mo52052a("logcat", (Object) jSONArray);
            }
        } catch (Throwable unused2) {
            C6677k.m16550a((Closeable) bufferedReader);
            aVar.mo52052a("logcat", (Object) jSONArray);
        }
        aVar.mo52052a("logcat", (Object) jSONArray);
    }

    /* renamed from: h */
    private void m16745h(C6594a aVar) {
        Map<String, String> a = mo52180a();
        if (a != null && aVar != null) {
            String str = a.get("process_name");
            if (str != null) {
                aVar.mo52052a("process_name", (Object) str);
            }
            String str2 = a.get("start_time");
            if (str2 != null) {
                try {
                    aVar.mo52044a(Long.decode(str2).longValue());
                } catch (Throwable th) {
                    C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                }
            }
            String str3 = a.get("pid");
            if (str3 != null) {
                try {
                    aVar.mo52052a("pid", (Object) Long.decode(str3));
                } catch (Throwable th2) {
                    C6553b.m16004a().mo52019a("NPTH_CATCH", th2);
                }
            }
            String str4 = a.get("crash_thread_name");
            if (str4 != null) {
                aVar.mo52052a("crash_thread_name", (Object) str4);
            }
            String str5 = a.get("crash_time");
            if (str5 != null) {
                try {
                    aVar.mo52052a("crash_time", (Object) Long.decode(str5));
                } catch (Throwable th3) {
                    C6553b.m16004a().mo52019a("NPTH_CATCH", th3);
                }
            }
            aVar.mo52052a(C8849c.DATA, (Object) mo52182b());
        }
    }

    /* renamed from: i */
    public static long m16746i() {
        if (NativeImpl.m16720e()) {
            return Long.MAX_VALUE;
        }
        return Header.m16141a() ? 3891200 : 2867200;
    }

    /* renamed from: m */
    public static boolean m16747m() {
        Boolean bool = f14386d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        int i = 0;
        while (i < 11) {
            try {
                if (new File(strArr[i]).exists()) {
                    Boolean bool2 = true;
                    f14386d = bool2;
                    return bool2.booleanValue();
                }
                i++;
            } catch (Throwable th) {
                C6553b.m16004a().mo52019a("NPTH_CATCH", th);
            }
        }
        Boolean bool3 = false;
        f14386d = bool3;
        return bool3.booleanValue();
    }

    /* renamed from: n */
    private Header m16748n() {
        Header header = new Header(this.f14387a);
        JSONObject a = C6766s.m17031a().mo52315a(this.f14389c.mo52192a());
        if (a != null) {
            header.mo52038a(a);
            header.mo52040d();
            header.mo52041e();
        }
        Header.m16143b(header);
        return header;
    }

    /* renamed from: o */
    private int m16749o() {
        return new C6703c().mo52195a();
    }

    /* renamed from: p */
    private int m16750p() {
        return new C6706f().mo52195a();
    }

    /* renamed from: q */
    private int m16751q() {
        return new C6704d().mo52195a();
    }

    /* renamed from: a */
    public Map<String, String> mo52180a() {
        C6702b bVar = this.f14389c;
        if (bVar != null) {
            return bVar.f14392c.mo52179c();
        }
        return null;
    }

    /* renamed from: a */
    public void mo52181a(File file) {
        this.f14389c = new C6702b(file);
    }

    /* renamed from: b */
    public String mo52182b() {
        C6702b bVar = this.f14389c;
        if (bVar == null) {
            return null;
        }
        String c = bVar.f14391b.mo52204c();
        return (c == null || c.isEmpty()) ? this.f14389c.f14392c.mo52178b() : c;
    }

    /* renamed from: c */
    public boolean mo52183c() {
        C6702b bVar = this.f14389c;
        if (bVar != null) {
            return bVar.mo52194c();
        }
        return false;
    }

    /* renamed from: d */
    public JSONObject mo52184d() {
        File f = C6685o.m16605f(this.f14389c.mo52193b());
        if (!f.exists()) {
            return null;
        }
        try {
            String c = C6675i.m16540c(f.getAbsolutePath());
            if (c != null && !c.isEmpty()) {
                return new JSONObject(c);
            }
        } catch (Throwable th) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:13|(4:16|(1:52)(3:18|19|(2:21|53)(1:51))|25|14)|49|26|27|28|(1:32)|33|34|(2:36|(3:(4:40|(2:42|55)(1:56)|43|38)|54|61)(1:59))(1:58)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00d2 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8 A[Catch:{ IOException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo52185e() {
        /*
            r10 = this;
            java.lang.String r0 = "NPTH_CATCH"
            com.apm.insight.nativecrash.b$b r1 = r10.f14389c     // Catch:{ IOException -> 0x0110 }
            java.io.File r1 = r1.mo52193b()     // Catch:{ IOException -> 0x0110 }
            java.io.File r1 = com.apm.insight.p178l.C6685o.m16602e((java.io.File) r1)     // Catch:{ IOException -> 0x0110 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r3.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r4 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0110 }
            r3.append(r4)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r4 = ".tmp'"
            r3.append(r4)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0110 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0110 }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0110 }
            if (r3 == 0) goto L_0x002f
            r2.delete()     // Catch:{ IOException -> 0x0110 }
        L_0x002f:
            boolean r3 = r1.exists()     // Catch:{ IOException -> 0x0110 }
            r4 = 46
            r5 = 0
            if (r3 == 0) goto L_0x0065
        L_0x0038:
            int r2 = com.apm.insight.nativecrash.NativeCrashCollector.m16693a()     // Catch:{ IOException -> 0x0110 }
            if (r5 >= r2) goto L_0x0118
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r3.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r6 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0110 }
            r3.append(r6)     // Catch:{ IOException -> 0x0110 }
            r3.append(r4)     // Catch:{ IOException -> 0x0110 }
            r3.append(r5)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0110 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0110 }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0110 }
            if (r3 == 0) goto L_0x0062
            r2.delete()     // Catch:{ IOException -> 0x0110 }
        L_0x0062:
            int r5 = r5 + 1
            goto L_0x0038
        L_0x0065:
            com.apm.insight.entity.a r3 = new com.apm.insight.entity.a     // Catch:{ IOException -> 0x0110 }
            r3.<init>()     // Catch:{ IOException -> 0x0110 }
            r6 = 0
        L_0x006b:
            int r7 = com.apm.insight.nativecrash.NativeCrashCollector.m16693a()     // Catch:{ IOException -> 0x0110 }
            if (r6 >= r7) goto L_0x00b5
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r8.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r9 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0110 }
            r8.append(r9)     // Catch:{ IOException -> 0x0110 }
            r8.append(r4)     // Catch:{ IOException -> 0x0110 }
            r8.append(r6)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0110 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0110 }
            boolean r8 = r7.exists()     // Catch:{ IOException -> 0x0110 }
            if (r8 != 0) goto L_0x0093
            goto L_0x00b2
        L_0x0093:
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ JSONException -> 0x00aa }
            java.lang.String r7 = com.apm.insight.p178l.C6675i.m16540c((java.lang.String) r7)     // Catch:{ JSONException -> 0x00aa }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00aa }
            r8.<init>(r7)     // Catch:{ JSONException -> 0x00aa }
            int r7 = r8.length()     // Catch:{ JSONException -> 0x00aa }
            if (r7 <= 0) goto L_0x00b2
            r3.mo52060c((org.json.JSONObject) r8)     // Catch:{ JSONException -> 0x00aa }
            goto L_0x00b2
        L_0x00aa:
            r7 = move-exception
            com.apm.insight.c r8 = com.apm.insight.C6553b.m16004a()     // Catch:{ IOException -> 0x0110 }
            r8.mo52019a((java.lang.String) r0, (java.lang.Throwable) r7)     // Catch:{ IOException -> 0x0110 }
        L_0x00b2:
            int r6 = r6 + 1
            goto L_0x006b
        L_0x00b5:
            org.json.JSONObject r3 = r3.mo52066h()     // Catch:{ IOException -> 0x0110 }
            int r6 = r3.length()     // Catch:{ all -> 0x00d2 }
            if (r6 == 0) goto L_0x00d2
            java.lang.String r6 = "storage"
            java.lang.Object r6 = r3.opt(r6)     // Catch:{ all -> 0x00d2 }
            if (r6 != 0) goto L_0x00d2
            android.content.Context r6 = com.apm.insight.C6617h.m16313g()     // Catch:{ all -> 0x00d2 }
            org.json.JSONObject r6 = com.apm.insight.p178l.C6695w.m16683a((android.content.Context) r6)     // Catch:{ all -> 0x00d2 }
            com.apm.insight.entity.C6594a.m16167a((org.json.JSONObject) r3, (org.json.JSONObject) r6)     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            int r6 = r3.length()     // Catch:{ IOException -> 0x0110 }
            if (r6 == 0) goto L_0x0118
            r10.f14388b = r3     // Catch:{ IOException -> 0x0110 }
            com.apm.insight.p178l.C6675i.m16537b(r2, r3, r5)     // Catch:{ IOException -> 0x0110 }
            boolean r2 = r2.renameTo(r1)     // Catch:{ IOException -> 0x0110 }
            if (r2 == 0) goto L_0x0118
        L_0x00e3:
            int r2 = com.apm.insight.nativecrash.NativeCrashCollector.m16693a()     // Catch:{ IOException -> 0x0110 }
            if (r5 >= r2) goto L_0x0118
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r3.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r6 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0110 }
            r3.append(r6)     // Catch:{ IOException -> 0x0110 }
            r3.append(r4)     // Catch:{ IOException -> 0x0110 }
            r3.append(r5)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0110 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0110 }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0110 }
            if (r3 == 0) goto L_0x010d
            r2.delete()     // Catch:{ IOException -> 0x0110 }
        L_0x010d:
            int r5 = r5 + 1
            goto L_0x00e3
        L_0x0110:
            r1 = move-exception
            com.apm.insight.c r2 = com.apm.insight.C6553b.m16004a()
            r2.mo52019a((java.lang.String) r0, (java.lang.Throwable) r1)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C6700b.mo52185e():void");
    }

    /* renamed from: f */
    public boolean mo52186f() {
        ICrashFilter b = C6617h.m16307b().mo51972b();
        if (b == null) {
            return true;
        }
        try {
            return b.onNativeCrashFilter(mo52182b(), "");
        } catch (Throwable th) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
            return true;
        }
    }

    /* renamed from: g */
    public boolean mo52187g() {
        return C6589a.m16122a().mo52027a(C6685o.m16605f(this.f14389c.mo52193b()).getAbsolutePath());
    }

    /* renamed from: h */
    public void mo52188h() {
        C6589a.m16122a().mo52026a(C6590a.m16127a(C6685o.m16605f(this.f14389c.mo52193b()).getAbsolutePath()));
    }

    /* renamed from: j */
    public JSONObject mo52189j() {
        try {
            C6594a aVar = new C6594a();
            m16737a(aVar);
            m16745h(aVar);
            m16740c(aVar);
            m16741d(aVar);
            m16742e(aVar);
            m16744g(aVar);
            m16743f(aVar);
            m16739b(aVar);
            File f = C6685o.m16605f(this.f14389c.mo52193b());
            JSONObject h = aVar.mo52066h();
            C6675i.m16527a(f, h, false);
            return h;
        } catch (Throwable th) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: k */
    public boolean mo52190k() {
        return C6675i.m16532a(this.f14389c.mo52193b());
    }

    /* renamed from: l */
    public void mo52191l() {
        try {
            String absolutePath = this.f14389c.mo52193b().getAbsolutePath();
            C6675i.m16541c(absolutePath, Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + "localDebug" + "/" + C6617h.m16313g().getPackageName() + "/" + this.f14389c.mo52193b().getName() + ".zip");
        } catch (Throwable th) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
        }
    }
}
