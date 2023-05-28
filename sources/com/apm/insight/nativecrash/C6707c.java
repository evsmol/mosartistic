package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.C6553b;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6685o;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.apm.insight.nativecrash.c */
public class C6707c {

    /* renamed from: com.apm.insight.nativecrash.c$a */
    public static class C6708a extends C6710c {
        C6708a(File file) {
            super(file);
            this.f14404b = "Total FD Count:";
            this.f14405c = ":";
            this.f14406d = -2;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$b */
    public static class C6709b extends C6710c {
        C6709b(File file) {
            super(file);
            this.f14404b = "VmSize:";
            this.f14405c = "\\s+";
            this.f14406d = -1;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$c */
    public static class C6710c {

        /* renamed from: a */
        protected File f14403a;

        /* renamed from: b */
        protected String f14404b;

        /* renamed from: c */
        protected String f14405c;

        /* renamed from: d */
        protected int f14406d;

        public C6710c(File file) {
            this.f14403a = file;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[DONT_GENERATE] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo52197a() {
            /*
                r5 = this;
                java.io.File r0 = r5.f14403a
                boolean r0 = r0.exists()
                r1 = -1
                if (r0 == 0) goto L_0x004f
                java.io.File r0 = r5.f14403a
                boolean r0 = r0.isFile()
                if (r0 != 0) goto L_0x0012
                goto L_0x004f
            L_0x0012:
                r0 = 0
                java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0035 }
                java.io.File r3 = r5.f14403a     // Catch:{ all -> 0x0035 }
                r2.<init>(r3)     // Catch:{ all -> 0x0035 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
                r3.<init>(r2)     // Catch:{ all -> 0x0035 }
                r0 = -1
            L_0x0020:
                java.lang.String r2 = r3.readLine()     // Catch:{ all -> 0x0031 }
                if (r2 == 0) goto L_0x002d
                int r0 = r5.mo52198a(r2)     // Catch:{ all -> 0x0031 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C6707c.C6710c.mo52197a():int");
        }

        /* renamed from: a */
        public int mo52198a(String str) {
            int i = this.f14406d;
            if (!str.startsWith(this.f14404b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f14405c)[1].trim());
            } catch (NumberFormatException e) {
                C6553b.m16004a().mo52019a("NPTH_CATCH", (Throwable) e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$d */
    public static class C6711d extends C6710c {
        C6711d(File file) {
            super(file);
        }

        /* renamed from: b */
        public HashMap<String, List<String>> mo52199b() {
            HashMap<String, List<String>> hashMap = new HashMap<>();
            try {
                JSONArray b = C6675i.m16535b(this.f14403a.getAbsolutePath());
                if (b == null) {
                    return hashMap;
                }
                for (int i = 0; i < b.length(); i++) {
                    String optString = b.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        if (optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                            int indexOf = optString.indexOf("[routine:0x");
                            int i2 = indexOf + 11;
                            String substring = indexOf > 0 ? optString.substring(i2, optString.indexOf(93, i2)) : "unknown addr";
                            List list = hashMap.get(substring);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(substring, list);
                            }
                            list.add(optString);
                        }
                    }
                }
                return hashMap;
            } catch (IOException unused) {
            } catch (Throwable th) {
                C6553b.m16004a().mo52019a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$e */
    public static class C6712e extends C6710c {
        C6712e(File file) {
            super(file);
        }

        /* renamed from: a */
        public JSONArray mo52200a(HashMap<String, List<String>> hashMap) {
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (hashMap.isEmpty()) {
                return jSONArray;
            }
            try {
                JSONArray b = C6675i.m16535b(this.f14403a.getAbsolutePath());
                if (b == null) {
                    return jSONArray;
                }
                for (int i = 0; i < b.length(); i++) {
                    String optString = b.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        String substring = optString.substring(2, optString.indexOf(":"));
                        if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                            for (String str : list) {
                                jSONArray.put(str + " " + optString);
                            }
                            hashMap.remove(substring);
                        }
                    }
                }
                for (List<String> it : hashMap.values()) {
                    for (String str2 : it) {
                        jSONArray.put(str2 + "  0x000000:unknown");
                    }
                }
                return jSONArray;
            } catch (IOException unused) {
            } catch (Throwable th) {
                C6553b.m16004a().mo52019a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$f */
    public static class C6713f extends C6710c {
        C6713f(File file) {
            super(file);
            this.f14404b = "Total Threads Count:";
            this.f14405c = ":";
            this.f14406d = -2;
        }
    }

    /* renamed from: a */
    public static int m16774a(String str) {
        return new C6708a(C6685o.m16592b(str)).mo52197a();
    }

    /* renamed from: a */
    public static JSONArray m16775a(File file, File file2) {
        return new C6712e(file2).mo52200a(new C6711d(file).mo52199b());
    }

    /* renamed from: b */
    public static int m16776b(String str) {
        return new C6713f(C6685o.m16596c(str)).mo52197a();
    }

    /* renamed from: c */
    public static int m16777c(String str) {
        return new C6709b(C6685o.m16600d(str)).mo52197a();
    }
}
