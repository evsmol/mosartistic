package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8393e;
import com.applovin.impl.sdk.p255d.C8394f;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.appnext.base.p264b.C8850d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.r */
public class C8550r {

    /* renamed from: a */
    private final String f21593a = "FileManager";

    /* renamed from: b */
    private final C8490n f21594b;

    /* renamed from: c */
    private final C8626v f21595c;

    /* renamed from: d */
    private final Object f21596d = new Object();

    /* renamed from: e */
    private final Set<String> f21597e = new HashSet();

    C8550r(C8490n nVar) {
        this.f21594b = nVar;
        this.f21595c = nVar.mo57320D();
    }

    /* renamed from: a */
    private long m25998a() {
        long longValue = ((Long) this.f21594b.mo57342a(C8380b.f20797bt)).longValue();
        if (longValue < 0 || !m26003b()) {
            return -1;
        }
        return longValue;
    }

    /* renamed from: a */
    private long m25999a(long j) {
        return j / C8850d.f22423fc;
    }

    /* renamed from: a */
    private File m26000a(String str, boolean z, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (C8626v.m26252a()) {
                this.f21595c.mo57818b("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (C8626v.m26252a()) {
            C8626v vVar = this.f21595c;
            vVar.mo57818b("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File e = m26009e(context);
        File file = new File(e, str);
        if (z) {
            try {
                e.mkdirs();
            } catch (Throwable th) {
                if (C8626v.m26252a()) {
                    C8626v vVar2 = this.f21595c;
                    vVar2.mo57819b("FileManager", "Unable to make cache directory at " + e, th);
                }
                return null;
            }
        }
        return file;
    }

    /* renamed from: a */
    private void m26001a(long j, Context context) {
        C8626v vVar;
        String str;
        if (m26003b()) {
            long intValue = (long) ((Integer) this.f21594b.mo57342a(C8380b.f20798bu)).intValue();
            if (intValue != -1) {
                int i = (m25999a(j) > intValue ? 1 : (m25999a(j) == intValue ? 0 : -1));
                boolean a = C8626v.m26252a();
                if (i > 0) {
                    if (a) {
                        this.f21595c.mo57818b("FileManager", "Cache has exceeded maximum size; dropping...");
                    }
                    for (File b : m26007d(context)) {
                        m26004b(b);
                    }
                    this.f21594b.mo57338W().mo57151a(C8394f.f21089h);
                    return;
                } else if (a) {
                    vVar = this.f21595c;
                    str = "Cache is present but under size limit; not dropping...";
                } else {
                    return;
                }
            } else if (C8626v.m26252a()) {
                vVar = this.f21595c;
                str = "Cache has no maximum size set; skipping drop...";
            } else {
                return;
            }
            vVar.mo57818b("FileManager", str);
        }
    }

    /* renamed from: a */
    private boolean m26002a(File file, String str, List<String> list, boolean z, C8393e eVar) {
        if (file == null || !file.exists() || file.isDirectory()) {
            InputStream inputStream = null;
            try {
                inputStream = mo57653a(str, list, z, eVar);
                return mo57661b(inputStream, file);
            } finally {
                Utils.close(inputStream, this.f21594b);
            }
        } else {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f21595c;
                vVar.mo57818b("FileManager", "File exists for " + str);
            }
            if (eVar == null) {
                return true;
            }
            eVar.mo57145b(file.length());
            return true;
        }
    }

    /* renamed from: b */
    private boolean m26003b() {
        return ((Boolean) this.f21594b.mo57342a(C8380b.f20796bs)).booleanValue();
    }

    /* renamed from: b */
    private boolean m26004b(File file) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f21595c;
            vVar.mo57818b("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            m26006c(file);
            return file.delete();
        } catch (Exception e) {
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21595c;
                vVar2.mo57819b("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", e);
            }
            return false;
        } finally {
            m26008d(file);
        }
    }

    /* renamed from: c */
    private long m26005c(Context context) {
        boolean z;
        long a = m25998a();
        boolean z2 = a != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List<String> b = this.f21594b.mo57380b(C8380b.f20803bz);
        long j = 0;
        for (File next : m26007d(context)) {
            if (!z2 || b.contains(next.getName()) || m26010e(next) || seconds - TimeUnit.MILLISECONDS.toSeconds(next.lastModified()) <= a) {
                z = false;
            } else {
                if (C8626v.m26252a()) {
                    C8626v vVar = this.f21595c;
                    vVar.mo57818b("FileManager", "File " + next.getName() + " has expired, removing...");
                }
                z = m26004b(next);
            }
            if (z) {
                this.f21594b.mo57338W().mo57151a(C8394f.f21088g);
            } else {
                j += next.length();
            }
        }
        return j;
    }

    /* renamed from: c */
    private void m26006c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f21596d) {
            boolean add = this.f21597e.add(absolutePath);
            while (!add) {
                try {
                    this.f21596d.wait();
                    add = this.f21597e.add(absolutePath);
                } catch (InterruptedException e) {
                    if (C8626v.m26252a()) {
                        C8626v vVar = this.f21595c;
                        vVar.mo57819b("FileManager", "Lock '" + absolutePath + "' interrupted", e);
                    }
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r2.listFiles();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.io.File> m26007d(android.content.Context r2) {
        /*
            r1 = this;
            java.io.File r2 = r1.m26009e((android.content.Context) r2)
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x0015
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto L_0x0015
            java.util.List r2 = java.util.Arrays.asList(r2)
            return r2
        L_0x0015:
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C8550r.m26007d(android.content.Context):java.util.List");
    }

    /* renamed from: d */
    private void m26008d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f21596d) {
            this.f21597e.remove(absolutePath);
            this.f21596d.notifyAll();
        }
    }

    /* renamed from: e */
    private File m26009e(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    /* renamed from: e */
    private boolean m26010e(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f21596d) {
            contains = this.f21597e.contains(absolutePath);
        }
        return contains;
    }

    /* renamed from: a */
    public File mo57652a(String str, Context context) {
        return m26000a(str, true, context);
    }

    /* renamed from: a */
    public InputStream mo57653a(String str, List<String> list, boolean z, C8393e eVar) {
        if (!z || Utils.isDomainWhitelisted(str, list)) {
            if (((Boolean) this.f21594b.mo57342a(C8380b.f20827cX)).booleanValue() && !str.contains("https://")) {
                if (C8626v.m26252a()) {
                    this.f21595c.mo57821d("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
                }
                str = str.replace("http://", "https://");
            }
            if (C8626v.m26252a()) {
                C8626v vVar = this.f21595c;
                vVar.mo57818b("FileManager", "Loading " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setConnectTimeout(((Integer) this.f21594b.mo57342a(C8380b.f20825cV)).intValue());
                httpURLConnection.setReadTimeout(((Integer) this.f21594b.mo57342a(C8380b.f20826cW)).intValue());
                httpURLConnection.setDefaultUseCaches(true);
                httpURLConnection.setUseCaches(true);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                int responseCode = httpURLConnection.getResponseCode();
                eVar.mo57141a(responseCode);
                if (responseCode >= 200) {
                    if (responseCode < 300) {
                        if (C8626v.m26252a()) {
                            C8626v vVar2 = this.f21595c;
                            vVar2.mo57818b("FileManager", "Opened stream to resource " + str);
                        }
                        return httpURLConnection.getInputStream();
                    }
                }
                return null;
            } catch (Exception e) {
                if (C8626v.m26252a()) {
                    C8626v vVar3 = this.f21595c;
                    vVar3.mo57819b("FileManager", "Error loading " + str, e);
                }
                eVar.mo57143a(e);
                return null;
            }
        } else {
            if (C8626v.m26252a()) {
                C8626v vVar4 = this.f21595c;
                vVar4.mo57818b("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
    }

    /* renamed from: a */
    public String mo57654a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, C8393e eVar) {
        return mo57655a(context, str, str2, list, z, z2, false, eVar);
    }

    /* renamed from: a */
    public String mo57655a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, boolean z3, C8393e eVar) {
        if (!StringUtils.isValidString(str)) {
            if (C8626v.m26252a()) {
                this.f21595c.mo57818b("FileManager", "Nothing to cache, skipping...");
            }
            return null;
        }
        Uri parse = Uri.parse(str);
        String fileName = ((Boolean) this.f21594b.mo57342a(C8380b.f20964fe)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
        if (z2) {
            fileName = StringUtils.encodeUriString(fileName, this.f21594b);
        }
        if (StringUtils.isValidString(fileName) && StringUtils.isValidString(str2)) {
            StringBuilder sb = new StringBuilder();
            String str3 = str2;
            sb.append(str2);
            sb.append(fileName);
            fileName = sb.toString();
        }
        String str4 = fileName;
        Context context2 = context;
        File a = mo57652a(str4, context);
        if (!m26002a(a, str, list, z, eVar)) {
            return null;
        }
        if (C8626v.m26252a()) {
            C8626v vVar = this.f21595c;
            vVar.mo57818b("FileManager", "Caching succeeded for file " + str4);
        }
        return z3 ? Uri.fromFile(a).toString() : str4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.applovin.impl.sdk.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        com.applovin.impl.sdk.utils.Utils.close(r3, r8.f21594b);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = r3.toString("UTF-8");
        r1 = r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A[Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x006d, all -> 0x005d, all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x006d, all -> 0x005d, all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b A[Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x006d, all -> 0x005d, all -> 0x00b2 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo57656a(java.io.File r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = com.applovin.impl.sdk.C8626v.m26252a()
            java.lang.String r2 = "FileManager"
            if (r1 == 0) goto L_0x0026
            com.applovin.impl.sdk.v r1 = r8.f21595c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Reading resource from filesystem: "
            r3.append(r4)
            java.lang.String r4 = r9.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.mo57818b(r2, r3)
        L_0x0026:
            r8.m26006c((java.io.File) r9)     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x006d, all -> 0x005d }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x006d, all -> 0x005d }
            r1.<init>(r9)     // Catch:{ FileNotFoundException -> 0x0093, IOException -> 0x006d, all -> 0x005d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
        L_0x0037:
            r6 = 0
            int r7 = r1.read(r5, r6, r4)     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            if (r7 < 0) goto L_0x0050
            r3.write(r5, r6, r7)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0037
        L_0x0042:
            com.applovin.impl.sdk.n r4 = r8.f21594b     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            com.applovin.impl.sdk.utils.Utils.close(r3, r4)     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
        L_0x0047:
            com.applovin.impl.sdk.n r2 = r8.f21594b
            com.applovin.impl.sdk.utils.Utils.close(r1, r2)
            r8.m26008d((java.io.File) r9)
            return r0
        L_0x0050:
            java.lang.String r4 = "UTF-8"
            java.lang.String r0 = r3.toString(r4)     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0059, all -> 0x0057 }
            goto L_0x0047
        L_0x0057:
            r3 = move-exception
            goto L_0x005f
        L_0x0059:
            r3 = move-exception
            goto L_0x006f
        L_0x005b:
            r3 = move-exception
            goto L_0x0095
        L_0x005d:
            r3 = move-exception
            r1 = r0
        L_0x005f:
            boolean r4 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x0047
            com.applovin.impl.sdk.v r4 = r8.f21595c     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = "Unknown failure to read file."
            r4.mo57819b(r2, r5, r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0047
        L_0x006d:
            r3 = move-exception
            r1 = r0
        L_0x006f:
            boolean r4 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x0047
            com.applovin.impl.sdk.v r4 = r8.f21595c     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r5.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = "Failed to read file: "
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r9.getName()     // Catch:{ all -> 0x00b2 }
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            r5.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00b2 }
            r4.mo57818b(r2, r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0047
        L_0x0093:
            r3 = move-exception
            r1 = r0
        L_0x0095:
            boolean r4 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x0047
            com.applovin.impl.sdk.v r4 = r8.f21595c     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r5.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = "File not found. "
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            r5.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00b2 }
            r4.mo57820c(r2, r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0047
        L_0x00b2:
            r0 = move-exception
            com.applovin.impl.sdk.n r2 = r8.f21594b
            com.applovin.impl.sdk.utils.Utils.close(r1, r2)
            r8.m26008d((java.io.File) r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C8550r.mo57656a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public void mo57657a(Context context) {
        if (m26003b() && this.f21594b.mo57386c()) {
            if (C8626v.m26252a()) {
                this.f21595c.mo57818b("FileManager", "Compacting cache...");
            }
            m26001a(m26005c(context), context);
        }
    }

    /* renamed from: a */
    public boolean mo57658a(File file, String str, List<String> list, C8393e eVar) {
        return m26002a(file, str, list, true, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A[Catch:{ all -> 0x0072 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo57659a(java.io.InputStream r7, java.io.File r8) {
        /*
            r6 = this;
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            java.lang.String r1 = "FileManager"
            if (r0 == 0) goto L_0x0022
            com.applovin.impl.sdk.v r0 = r6.f21595c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Writing resource to filesystem: "
            r2.append(r3)
            java.lang.String r3 = r8.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.mo57818b(r1, r2)
        L_0x0022:
            r0 = 0
            r2 = 0
            r6.m26006c((java.io.File) r8)     // Catch:{ all -> 0x005e }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x005e }
            r3.<init>(r8)     // Catch:{ all -> 0x005e }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r0]     // Catch:{ all -> 0x005b }
        L_0x0030:
            int r5 = r7.read(r4, r2, r0)     // Catch:{ all -> 0x005b }
            if (r5 < 0) goto L_0x0051
            r3.write(r4, r2, r5)     // Catch:{ Exception -> 0x003a }
            goto L_0x0030
        L_0x003a:
            r7 = move-exception
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0048
            com.applovin.impl.sdk.v r0 = r6.f21595c     // Catch:{ all -> 0x005b }
            java.lang.String r4 = "Failed to write next buffer to file"
            r0.mo57819b(r1, r4, r7)     // Catch:{ all -> 0x005b }
        L_0x0048:
            com.applovin.impl.sdk.n r7 = r6.f21594b
            com.applovin.impl.sdk.utils.Utils.close(r3, r7)
        L_0x004d:
            r6.m26008d((java.io.File) r8)
            return r2
        L_0x0051:
            com.applovin.impl.sdk.n r7 = r6.f21594b
            com.applovin.impl.sdk.utils.Utils.close(r3, r7)
            r6.m26008d((java.io.File) r8)
            r7 = 1
            return r7
        L_0x005b:
            r7 = move-exception
            r0 = r3
            goto L_0x005f
        L_0x005e:
            r7 = move-exception
        L_0x005f:
            boolean r3 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x006c
            com.applovin.impl.sdk.v r3 = r6.f21595c     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = "Unknown failure to write file."
            r3.mo57819b(r1, r4, r7)     // Catch:{ all -> 0x0072 }
        L_0x006c:
            com.applovin.impl.sdk.n r7 = r6.f21594b
            com.applovin.impl.sdk.utils.Utils.close(r0, r7)
            goto L_0x004d
        L_0x0072:
            r7 = move-exception
            com.applovin.impl.sdk.n r1 = r6.f21594b
            com.applovin.impl.sdk.utils.Utils.close(r0, r1)
            r6.m26008d((java.io.File) r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C8550r.mo57659a(java.io.InputStream, java.io.File):boolean");
    }

    /* renamed from: b */
    public void mo57660b(Context context) {
        try {
            mo57652a(".nomedia", context);
            File file = new File(m26009e(context), ".nomedia");
            if (!file.exists()) {
                if (C8626v.m26252a()) {
                    C8626v vVar = this.f21595c;
                    vVar.mo57818b("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
                }
                if (!file.createNewFile() && C8626v.m26252a()) {
                    this.f21595c.mo57822e("FileManager", "Failed to create .nomedia file");
                }
            }
        } catch (IOException e) {
            if (C8626v.m26252a()) {
                this.f21595c.mo57819b("FileManager", "Failed to create .nomedia file", e);
            }
        }
    }

    /* renamed from: b */
    public boolean mo57661b(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        if (C8626v.m26252a()) {
            C8626v vVar = this.f21595c;
            vVar.mo57818b("FileManager", "Caching " + file.getAbsolutePath() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        if (!mo57659a(inputStream, file)) {
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21595c;
                vVar2.mo57822e("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        } else if (!C8626v.m26252a()) {
            return true;
        } else {
            C8626v vVar3 = this.f21595c;
            vVar3.mo57818b("FileManager", "Caching completed for " + file);
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo57662b(String str, Context context) {
        File a = m26000a(str, false, context);
        return a != null && a.exists() && !a.isDirectory();
    }
}
