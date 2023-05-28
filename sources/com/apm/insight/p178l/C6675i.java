package com.apm.insight.p178l;

import android.text.TextUtils;
import com.apm.insight.C6553b;
import com.apm.insight.C6617h;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C6594a;
import com.apm.insight.entity.C6599e;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p173g.C6614d;
import com.apm.insight.p177k.C6647e;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.i */
public class C6675i {
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0117, code lost:
        if (r18 != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r18 != false) goto L_0x011b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.apm.insight.entity.C6594a m16515a(java.io.File r17, boolean r18) {
        /*
            java.lang.String r0 = "\n"
            com.apm.insight.entity.a r1 = new com.apm.insight.entity.a
            r1.<init>()
            boolean r2 = r17.exists()
            java.lang.String r3 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 是OOM.\n"
            java.lang.String r4 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 且不是OOM.\n"
            if (r2 == 0) goto L_0x0117
            java.lang.String r2 = r17.getAbsolutePath()     // Catch:{ IOException -> 0x001a }
            java.lang.String r2 = m16521a((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ IOException -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0025
            if (r18 == 0) goto L_0x011a
            goto L_0x011b
        L_0x0025:
            java.lang.String[] r2 = r2.split(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r2.length
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x003d:
            r14 = 1
            if (r11 >= r9) goto L_0x0072
            r15 = r2[r11]
            if (r12 != 0) goto L_0x004e
            java.lang.String r5 = "stack:"
            boolean r5 = r15.startsWith(r5)
            if (r5 == 0) goto L_0x004e
            r12 = 1
            goto L_0x006f
        L_0x004e:
            if (r13 != 0) goto L_0x005a
            java.lang.String r5 = "err:"
            boolean r5 = r15.startsWith(r5)
            if (r5 == 0) goto L_0x005a
            r13 = 1
            goto L_0x006f
        L_0x005a:
            if (r13 == 0) goto L_0x0063
            r8.append(r15)
            r8.append(r0)
            goto L_0x006f
        L_0x0063:
            if (r12 == 0) goto L_0x006c
            r7.append(r15)
            r7.append(r0)
            goto L_0x006f
        L_0x006c:
            r6.add(r15)
        L_0x006f:
            int r11 = r11 + 1
            goto L_0x003d
        L_0x0072:
            int r0 = r6.size()
            if (r0 < r14) goto L_0x007f
            java.lang.Object r0 = r6.get(r10)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            int r2 = r6.size()
            r5 = 2
            if (r2 < r5) goto L_0x008e
            java.lang.Object r2 = r6.get(r14)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x008f
        L_0x008e:
            r2 = 0
        L_0x008f:
            int r9 = r6.size()
            r10 = 3
            if (r9 < r10) goto L_0x009d
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x009e
        L_0x009d:
            r5 = 0
        L_0x009e:
            int r9 = r6.size()
            r11 = 4
            if (r9 < r11) goto L_0x00ae
            java.lang.Object r6 = r6.get(r10)
            java.lang.String r6 = (java.lang.String) r6
            r16 = r6
            goto L_0x00b0
        L_0x00ae:
            r16 = 0
        L_0x00b0:
            if (r12 == 0) goto L_0x00bd
            int r6 = r7.length()
            if (r6 <= 0) goto L_0x00bd
            java.lang.String r2 = r7.toString()
            goto L_0x00f6
        L_0x00bd:
            java.lang.String r6 = "\nCaused by: "
            if (r5 == 0) goto L_0x00d8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r6)
            if (r18 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r3 = r4
        L_0x00d0:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x00f6
        L_0x00d8:
            if (r2 == 0) goto L_0x00f1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r6)
            if (r18 == 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r3 = r4
        L_0x00e9:
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            goto L_0x00f6
        L_0x00f1:
            if (r18 == 0) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r3 = r4
        L_0x00f5:
            r2 = r3
        L_0x00f6:
            if (r13 == 0) goto L_0x0112
            int r3 = r8.length()
            if (r3 <= 0) goto L_0x0112
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "\nCaused by: InvalidStack.CrashWhenWriteStack: Npth在抓取堆栈时发生如下错误:\n"
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r3.toString()
        L_0x0112:
            r3 = r2
            r5 = r0
            r0 = r16
            goto L_0x011d
        L_0x0117:
            if (r18 == 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r3 = r4
        L_0x011b:
            r0 = 0
            r5 = 0
        L_0x011d:
            java.lang.String r2 = "data"
            r1.mo52052a((java.lang.String) r2, (java.lang.Object) r3)
            java.lang.String r2 = "process_name"
            r1.mo52052a((java.lang.String) r2, (java.lang.Object) r5)
            java.lang.String r2 = "crash_thread_name"
            r1.mo52052a((java.lang.String) r2, (java.lang.Object) r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)
            java.lang.String r2 = "isOOM"
            r1.mo52052a((java.lang.String) r2, (java.lang.Object) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p178l.C6675i.m16515a(java.io.File, boolean):com.apm.insight.entity.a");
    }

    /* renamed from: a */
    public static C6599e m16516a(File file, CrashType crashType) {
        C6594a d = m16542d(file);
        String name = file.getName();
        String substring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject optJSONObject = d.mo52066h().optJSONObject("header");
        if (optJSONObject.optString("unique_key", (String) null) == null) {
            try {
                optJSONObject.put("unique_key", "android_" + C6617h.m16309c().mo52322a() + "_" + substring + "_" + CrashType.LAUNCH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        C6599e eVar = new C6599e();
        eVar.mo52069a(crashType == CrashType.LAUNCH ? C6647e.m16431e() : C6647e.m16427c());
        eVar.mo52071a(d.mo52066h());
        eVar.mo52072a(C6647e.m16416a());
        return eVar;
    }

    /* renamed from: a */
    public static String m16517a(File file, String str) {
        return m16518a(file, str, -1);
    }

    /* renamed from: a */
    public static String m16518a(File file, String str, long j) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    C6677k.m16550a((Closeable) bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    if (!(sb.length() == 0 || str == null)) {
                        sb.append(str);
                    }
                    sb.append(readLine);
                } else {
                    C6677k.m16550a((Closeable) bufferedReader2);
                    return sb.toString();
                }
            }
        } catch (Throwable th2) {
            th = th2;
            C6677k.m16550a((Closeable) bufferedReader);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m16519a(File file, String str, String str2, JSONObject jSONObject, String str3, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("dump_file", str3);
            jSONObject2.put("encrypt", z);
            m16527a(file2, jSONObject2, false);
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return file2.getAbsolutePath();
    }

    /* renamed from: a */
    public static String m16520a(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        return m16519a(file, str, str2, jSONObject, (String) null, z);
    }

    /* renamed from: a */
    public static String m16521a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m16517a(new File(str), str2);
    }

    /* renamed from: a */
    public static JSONArray m16522a(File file, long j) {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    C6677k.m16550a((Closeable) bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    jSONArray.put(readLine);
                } else {
                    C6677k.m16550a((Closeable) bufferedReader2);
                    return jSONArray;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            C6677k.m16550a((Closeable) bufferedReader);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m16523a(File file, File file2) {
        FileOutputStream fileOutputStream;
        if (file != null && file2 != null) {
            FileInputStream fileInputStream = null;
            try {
                file2.getParentFile().mkdirs();
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = null;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        C6677k.m16550a((Closeable) fileInputStream);
                        C6677k.m16550a((Closeable) fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        C6677k.m16550a((Closeable) fileInputStream);
                        C6677k.m16550a((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    fileInputStream = fileInputStream2;
                    C6677k.m16550a((Closeable) fileInputStream);
                    C6677k.m16550a((Closeable) fileOutputStream);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    C6677k.m16550a((Closeable) fileInputStream2);
                } catch (Exception e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    C6677k.m16550a((Closeable) fileInputStream);
                    C6677k.m16550a((Closeable) fileOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = fileInputStream2;
                    C6677k.m16550a((Closeable) fileInputStream);
                    C6677k.m16550a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = null;
                e.printStackTrace();
                C6677k.m16550a((Closeable) fileInputStream);
                C6677k.m16550a((Closeable) fileOutputStream);
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                C6677k.m16550a((Closeable) fileInputStream);
                C6677k.m16550a((Closeable) fileOutputStream);
                throw th;
            }
            C6677k.m16550a((Closeable) fileOutputStream);
        }
    }

    /* renamed from: a */
    public static void m16524a(File file, String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            file.getParentFile().mkdirs();
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
                try {
                    fileOutputStream2.write(str.getBytes());
                    fileOutputStream2.flush();
                    C6677k.m16550a((Closeable) fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    C6677k.m16550a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C6677k.m16550a((Closeable) fileOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m16525a(File file, Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            FileOutputStream fileOutputStream = null;
            try {
                Properties properties = new Properties();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    for (Map.Entry next : map.entrySet()) {
                        properties.setProperty((String) next.getKey(), (String) next.getValue());
                    }
                    properties.store(fileOutputStream2, "no");
                    C6677k.m16550a((Closeable) fileOutputStream2);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C6688q.m16632b((Throwable) e);
                        C6677k.m16550a((Closeable) fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        C6677k.m16550a((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    C6677k.m16550a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                C6688q.m16632b((Throwable) e);
                C6677k.m16550a((Closeable) fileOutputStream);
            }
        }
    }

    /* renamed from: a */
    public static void m16526a(File file, JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            file.getParentFile().mkdirs();
            BufferedWriter bufferedWriter = null;
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
                try {
                    C6679m.m16566a(jSONArray, (Writer) bufferedWriter2);
                    C6677k.m16550a((Closeable) bufferedWriter2);
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    C6677k.m16550a((Closeable) bufferedWriter);
                }
            } catch (Throwable unused2) {
                C6677k.m16550a((Closeable) bufferedWriter);
            }
        }
    }

    /* renamed from: a */
    public static void m16527a(File file, JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            file.getParentFile().mkdirs();
            BufferedWriter bufferedWriter = null;
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
                try {
                    C6679m.m16568a(jSONObject, (Writer) bufferedWriter2);
                    C6677k.m16550a((Closeable) bufferedWriter2);
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    C6677k.m16550a((Closeable) bufferedWriter);
                }
            } catch (Throwable unused2) {
                C6677k.m16550a((Closeable) bufferedWriter);
            }
        }
    }

    /* renamed from: a */
    public static void m16528a(OutputStream outputStream, File... fileArr) {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry("/"));
                for (File a : fileArr) {
                    m16530a(zipOutputStream2, a);
                }
                C6677k.m16550a((Closeable) zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                C6677k.m16550a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C6677k.m16550a((Closeable) zipOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m16529a(String str, File file) {
        ZipOutputStream zipOutputStream = null;
        try {
            new File(str).getParentFile().mkdirs();
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                m16531a(zipOutputStream2, file, "");
                C6677k.m16550a((Closeable) zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                C6677k.m16550a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C6677k.m16550a((Closeable) zipOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m16530a(ZipOutputStream zipOutputStream, File file) {
        File[] fileArr;
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                fileArr = file.listFiles();
            } else {
                fileArr = new File[]{file};
            }
            if (fileArr != null) {
                for (int i = 0; i < fileArr.length; i++) {
                    m16531a(zipOutputStream, fileArr[i], fileArr[i].getName());
                }
            }
        }
    }

    /* renamed from: a */
    private static void m16531a(ZipOutputStream zipOutputStream, File file, String str) {
        String str2;
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
                    if (str.length() == 0) {
                        str2 = "";
                    } else {
                        str2 = str + "/";
                    }
                    for (int i = 0; i < listFiles.length; i++) {
                        m16531a(zipOutputStream, listFiles[i], str2 + listFiles[i].getName());
                    }
                    return;
                }
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(str));
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (-1 != read) {
                            zipOutputStream.write(bArr, 0, read);
                        } else {
                            C6677k.m16550a((Closeable) fileInputStream2);
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    C6677k.m16550a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C6677k.m16550a((Closeable) fileInputStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static boolean m16532a(File file) {
        boolean z;
        boolean z2 = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        int i = 0;
        while (listFiles != null && i < listFiles.length) {
            if (!listFiles[i].isFile()) {
                z = m16532a(listFiles[i]);
            } else if (listFiles[i].canWrite()) {
                z = listFiles[i].delete();
            } else {
                z2 = false;
                i++;
            }
            z2 &= z;
            i++;
        }
        return z2 & file.delete();
    }

    /* renamed from: a */
    public static boolean m16533a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m16532a(new File(str));
    }

    /* renamed from: a */
    public static boolean m16534a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    /* renamed from: b */
    public static JSONArray m16535b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m16522a(new File(str), -1);
    }

    /* renamed from: b */
    public static JSONArray m16536b(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        if (!(str == null || str2 == null)) {
            for (String put : str.split(str2)) {
                jSONArray.put(put);
            }
        }
        return jSONArray;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m16537b(java.io.File r3, org.json.JSONObject r4, boolean r5) {
        /*
            java.lang.String r5 = "err_write"
            if (r4 != 0) goto L_0x0005
            return
        L_0x0005:
            java.io.File r0 = r3.getParentFile()
            r0.mkdirs()
            r0 = 0
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x0021 }
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ all -> 0x0021 }
            r2.<init>(r3)     // Catch:{ all -> 0x0021 }
            r1.<init>(r2)     // Catch:{ all -> 0x0021 }
            com.apm.insight.p178l.C6679m.m16568a((org.json.JSONObject) r4, (java.io.Writer) r1)     // Catch:{ all -> 0x001e }
            com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r1)
            goto L_0x0041
        L_0x001e:
            r3 = move-exception
            r0 = r1
            goto L_0x0022
        L_0x0021:
            r3 = move-exception
        L_0x0022:
            java.lang.String r1 = r3.toString()     // Catch:{ JSONException -> 0x0035 }
            r4.put(r5, r1)     // Catch:{ JSONException -> 0x0035 }
            java.lang.String r1 = "filters"
            java.lang.String r2 = r3.getLocalizedMessage()     // Catch:{ JSONException -> 0x0035 }
            com.apm.insight.entity.C6594a.m16164a((org.json.JSONObject) r4, (java.lang.String) r1, (java.lang.String) r5, (java.lang.String) r2)     // Catch:{ JSONException -> 0x0035 }
            goto L_0x0035
        L_0x0033:
            r3 = move-exception
            goto L_0x0042
        L_0x0035:
            com.apm.insight.c r4 = com.apm.insight.C6553b.m16004a()     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = "NPTH_CATCH"
            r4.mo52019a((java.lang.String) r5, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0033 }
            com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r0)
        L_0x0041:
            return
        L_0x0042:
            com.apm.insight.p178l.C6677k.m16550a((java.io.Closeable) r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p178l.C6675i.m16537b(java.io.File, org.json.JSONObject, boolean):void");
    }

    /* renamed from: b */
    public static boolean m16538b(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    /* renamed from: c */
    public static String m16539c(File file) {
        return m16517a(file, "\n");
    }

    /* renamed from: c */
    public static String m16540c(String str) {
        return m16521a(str, "\n");
    }

    /* renamed from: c */
    public static void m16541c(String str, String str2) {
        m16529a(str2, new File(str));
    }

    /* renamed from: d */
    public static C6594a m16542d(File file) {
        C6594a a = m16515a(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z = false;
        for (int i = 0; i < C6614d.m16289a(); i++) {
            File a2 = C6685o.m16588a(file, "." + i);
            if (a2.exists()) {
                try {
                    a.mo52060c(new JSONObject(m16540c(a2.getAbsolutePath())));
                    z = true;
                } catch (Throwable unused) {
                }
            }
        }
        a.mo52047a("crash_type", z ? "step" : "simple");
        JSONObject optJSONObject = a.mo52066h().optJSONObject("header");
        JSONObject f = Header.m16139a(C6617h.m16313g(), a.mo52066h().optLong("crash_time", 0)).mo52042f();
        if (optJSONObject == null) {
            a.mo52051a(f);
        } else {
            C6678l.m16557a(optJSONObject, f);
        }
        return a;
    }

    /* renamed from: d */
    public static C6599e m16543d(String str) {
        try {
            String c = m16540c(str);
            if (c == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(c);
            C6599e eVar = new C6599e();
            eVar.mo52069a(jSONObject.optString("url"));
            eVar.mo52071a(jSONObject.optJSONObject("body"));
            eVar.mo52074b(jSONObject.optString("dump_file"));
            eVar.mo52072a(jSONObject.optBoolean("encrypt", false));
            return eVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static C6599e m16544e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(m16540c(str));
            C6599e eVar = new C6599e();
            eVar.mo52078d(jSONObject.optString("aid"));
            eVar.mo52076c(jSONObject.optString("did"));
            eVar.mo52080e(jSONObject.optString("processName"));
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("alogFiles");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
                eVar.mo52070a((List<String>) arrayList);
            }
            return eVar;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static Map<String, String> m16545e(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            Properties properties = new Properties();
            fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                Set<String> stringPropertyNames = properties.stringPropertyNames();
                HashMap hashMap = new HashMap();
                for (String next : stringPropertyNames) {
                    hashMap.put(next, properties.getProperty(next));
                }
                C6677k.m16550a((Closeable) fileInputStream);
                return hashMap;
            } catch (IOException e) {
                e = e;
                try {
                    C6688q.m16632b((Throwable) e);
                    C6677k.m16550a((Closeable) fileInputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    C6677k.m16550a((Closeable) fileInputStream2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            fileInputStream = null;
            C6688q.m16632b((Throwable) e);
            C6677k.m16550a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C6677k.m16550a((Closeable) fileInputStream2);
            throw th;
        }
    }

    /* renamed from: f */
    public static void m16546f(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            NativeImpl.m16713c(file2.getAbsolutePath());
        } catch (Throwable th) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
        }
    }

    /* renamed from: g */
    public static boolean m16547g(File file) {
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            int c = NativeImpl.m16713c(file.getAbsolutePath());
            if (c <= 0) {
                return c < 0;
            }
            NativeImpl.m16700a(c);
            return false;
        } catch (Throwable th) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
        }
    }
}
