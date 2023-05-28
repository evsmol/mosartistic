package com.bytedance.sdk.component.p313d.p316c.p317a.p318a;

import android.util.Log;
import com.appnext.base.p264b.C8850d;
import com.bytedance.sdk.component.p313d.p316c.p321c.C10531b;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.sdk.component.d.c.a.a.a */
/* compiled from: DiskLruCache */
public final class C10501a implements Closeable {

    /* renamed from: a */
    static final Pattern f26169a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: c */
    public static final OutputStream f26170c = new OutputStream() {
        public void write(int i) throws IOException {
        }
    };

    /* renamed from: b */
    final ExecutorService f26171b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final File f26172d;

    /* renamed from: e */
    private final File f26173e;

    /* renamed from: f */
    private final File f26174f;

    /* renamed from: g */
    private final File f26175g;

    /* renamed from: h */
    private final int f26176h;

    /* renamed from: i */
    private long f26177i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final int f26178j;

    /* renamed from: k */
    private long f26179k = 0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Writer f26180l;

    /* renamed from: m */
    private final LinkedHashMap<String, C10506b> f26181m = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f26182n;

    /* renamed from: o */
    private long f26183o = -1;

    /* renamed from: p */
    private long f26184p = 0;

    /* renamed from: q */
    private final Callable<Void> f26185q = new Callable<Void>() {
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                com.bytedance.sdk.component.d.c.a.a.a r0 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.this
                monitor-enter(r0)
                com.bytedance.sdk.component.d.c.a.a.a r1 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f26180l     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                com.bytedance.sdk.component.d.c.a.a.a r1 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.this     // Catch:{ all -> 0x0028 }
                r1.m30697h()     // Catch:{ all -> 0x0028 }
                com.bytedance.sdk.component.d.c.a.a.a r1 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m30695f()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                com.bytedance.sdk.component.d.c.a.a.a r1 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.this     // Catch:{ all -> 0x0028 }
                r1.m30692e()     // Catch:{ all -> 0x0028 }
                com.bytedance.sdk.component.d.c.a.a.a r1 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f26182n = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C105021.call():java.lang.Void");
        }
    };

    private C10501a(File file, int i, int i2, long j, ExecutorService executorService) {
        this.f26172d = file;
        this.f26176h = i;
        this.f26173e = new File(file, "journal");
        this.f26174f = new File(file, "journal.tmp");
        this.f26175g = new File(file, "journal.bkp");
        this.f26178j = i2;
        this.f26177i = j;
        this.f26171b = executorService;
    }

    /* renamed from: a */
    public static C10501a m30679a(File file, int i, int i2, long j, ExecutorService executorService) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m30684a(file2, file3, false);
                }
            }
            C10501a aVar = new C10501a(file, i, i2, j, executorService);
            if (aVar.f26173e.exists()) {
                try {
                    aVar.m30686c();
                    aVar.m30688d();
                    return aVar;
                } catch (IOException e) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.mo64023b();
                }
            }
            file.mkdirs();
            C10501a aVar2 = new C10501a(file, i, i2, j, executorService);
            aVar2.m30692e();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f26182n = r0 - r9.f26181m.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo64045b() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m30692e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f26180l = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f26173e, true), com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10511d.f26212a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30686c() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.bytedance.sdk.component.d.c.a.a.c r1 = new com.bytedance.sdk.component.d.c.a.a.c
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f26173e
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10511d.f26212a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo64044a()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo64044a()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo64044a()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo64044a()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo64044a()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f26176h     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f26178j     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo64044a()     // Catch:{ EOFException -> 0x005f }
            r9.m30690d((java.lang.String) r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r2 = r9.f26181m     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f26182n = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo64045b()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m30692e()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f26173e     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10511d.f26212a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f26180l = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            com.bytedance.sdk.component.p313d.p316c.p321c.C10531b.m30852a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            com.bytedance.sdk.component.p313d.p316c.p321c.C10531b.m30852a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.m30686c():void");
    }

    /* renamed from: d */
    private void m30690d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f26181m.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C10506b bVar = this.f26181m.get(str2);
            if (bVar == null) {
                bVar = new C10506b(str2);
                this.f26181m.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = bVar.f26196d = true;
                C10504a unused2 = bVar.f26197e = null;
                bVar.m30714a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C10504a unused3 = bVar.f26197e = new C10504a(bVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: d */
    private void m30688d() throws IOException {
        m30683a(this.f26174f);
        Iterator<C10506b> it = this.f26181m.values().iterator();
        while (it.hasNext()) {
            C10506b next = it.next();
            int i = 0;
            if (next.f26197e == null) {
                while (i < this.f26178j) {
                    this.f26179k += next.f26195c[i];
                    i++;
                }
            } else {
                C10504a unused = next.f26197e = null;
                while (i < this.f26178j) {
                    m30683a(next.mo64036a(i));
                    m30683a(next.mo64038b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: e */
    public synchronized void m30692e() throws IOException {
        if (this.f26180l != null) {
            this.f26180l.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f26174f), C10511d.f26212a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f26176h));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f26178j));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C10506b next : this.f26181m.values()) {
                if (next.f26197e != null) {
                    bufferedWriter.write("DIRTY " + next.f26194b + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f26194b + next.mo64037a() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f26173e.exists()) {
                m30684a(this.f26173e, this.f26175g, true);
            }
            m30684a(this.f26174f, this.f26173e, false);
            this.f26175g.delete();
            this.f26180l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f26173e, true), C10511d.f26212a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m30683a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m30684a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m30683a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.f26182n++;
        r11.f26180l.append("READ " + r12 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (m30695f() == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r11.f26171b.submit(r11.f26185q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        return new com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C10507c(r11, r12, com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C10506b.m30720e(r0), r8, com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C10506b.m30717b(r0), (com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C105021) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0075 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C10507c mo64020a(java.lang.String r12) throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.m30696g()     // Catch:{ all -> 0x0087 }
            r11.m30693e((java.lang.String) r12)     // Catch:{ all -> 0x0087 }
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r0 = r11.f26181m     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x0087 }
            com.bytedance.sdk.component.d.c.a.a.a$b r0 = (com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C10506b) r0     // Catch:{ all -> 0x0087 }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r11)
            return r1
        L_0x0014:
            boolean r2 = r0.f26196d     // Catch:{ all -> 0x0087 }
            if (r2 != 0) goto L_0x001c
            monitor-exit(r11)
            return r1
        L_0x001c:
            int r2 = r11.f26178j     // Catch:{ all -> 0x0087 }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0087 }
            r2 = 0
            r3 = 0
        L_0x0022:
            int r4 = r11.f26178j     // Catch:{ FileNotFoundException -> 0x0075 }
            if (r3 >= r4) goto L_0x0034
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0075 }
            java.io.File r5 = r0.mo64036a((int) r3)     // Catch:{ FileNotFoundException -> 0x0075 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0075 }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x0075 }
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0034:
            int r1 = r11.f26182n     // Catch:{ all -> 0x0087 }
            int r1 = r1 + 1
            r11.f26182n = r1     // Catch:{ all -> 0x0087 }
            java.io.Writer r1 = r11.f26180l     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r2.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch:{ all -> 0x0087 }
            r2.append(r12)     // Catch:{ all -> 0x0087 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0087 }
            r1.append(r2)     // Catch:{ all -> 0x0087 }
            boolean r1 = r11.m30695f()     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0062
            java.util.concurrent.ExecutorService r1 = r11.f26171b     // Catch:{ all -> 0x0087 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.f26185q     // Catch:{ all -> 0x0087 }
            r1.submit(r2)     // Catch:{ all -> 0x0087 }
        L_0x0062:
            com.bytedance.sdk.component.d.c.a.a.a$c r1 = new com.bytedance.sdk.component.d.c.a.a.a$c     // Catch:{ all -> 0x0087 }
            long r6 = r0.f26198f     // Catch:{ all -> 0x0087 }
            long[] r9 = r0.f26195c     // Catch:{ all -> 0x0087 }
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r5, r6, r8, r9)     // Catch:{ all -> 0x0087 }
            monitor-exit(r11)
            return r1
        L_0x0075:
            int r12 = r11.f26178j     // Catch:{ all -> 0x0087 }
            if (r2 >= r12) goto L_0x0085
            r12 = r8[r2]     // Catch:{ all -> 0x0087 }
            if (r12 == 0) goto L_0x0085
            r12 = r8[r2]     // Catch:{ all -> 0x0087 }
            com.bytedance.sdk.component.p313d.p316c.p321c.C10531b.m30852a(r12)     // Catch:{ all -> 0x0087 }
            int r2 = r2 + 1
            goto L_0x0075
        L_0x0085:
            monitor-exit(r11)
            return r1
        L_0x0087:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.mo64020a(java.lang.String):com.bytedance.sdk.component.d.c.a.a.a$c");
    }

    /* renamed from: b */
    public C10504a mo64022b(String str) throws IOException {
        return m30678a(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C10504a m30678a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m30696g()     // Catch:{ all -> 0x0061 }
            r5.m30693e((java.lang.String) r6)     // Catch:{ all -> 0x0061 }
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r0 = r5.f26181m     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0061 }
            com.bytedance.sdk.component.d.c.a.a.a$b r0 = (com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C10506b) r0     // Catch:{ all -> 0x0061 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0020
            long r1 = r0.f26198f     // Catch:{ all -> 0x0061 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0022
        L_0x0020:
            monitor-exit(r5)
            return r3
        L_0x0022:
            if (r0 != 0) goto L_0x002f
            com.bytedance.sdk.component.d.c.a.a.a$b r0 = new com.bytedance.sdk.component.d.c.a.a.a$b     // Catch:{ all -> 0x0061 }
            r0.<init>(r6)     // Catch:{ all -> 0x0061 }
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r7 = r5.f26181m     // Catch:{ all -> 0x0061 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0037
        L_0x002f:
            com.bytedance.sdk.component.d.c.a.a.a$a r7 = r0.f26197e     // Catch:{ all -> 0x0061 }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r3
        L_0x0037:
            com.bytedance.sdk.component.d.c.a.a.a$a r7 = new com.bytedance.sdk.component.d.c.a.a.a$a     // Catch:{ all -> 0x0061 }
            r7.<init>(r0)     // Catch:{ all -> 0x0061 }
            com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C10504a unused = r0.f26197e = r7     // Catch:{ all -> 0x0061 }
            java.io.Writer r8 = r5.f26180l     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r0.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "DIRTY "
            r0.append(r1)     // Catch:{ all -> 0x0061 }
            r0.append(r6)     // Catch:{ all -> 0x0061 }
            r6 = 10
            r0.append(r6)     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0061 }
            r8.write(r6)     // Catch:{ all -> 0x0061 }
            java.io.Writer r6 = r5.f26180l     // Catch:{ all -> 0x0061 }
            r6.flush()     // Catch:{ all -> 0x0061 }
            monitor-exit(r5)
            return r7
        L_0x0061:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.m30678a(java.lang.String, long):com.bytedance.sdk.component.d.c.a.a.a$a");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0109, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m30681a(com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C10504a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.bytedance.sdk.component.d.c.a.a.a$b r0 = r10.f26188b     // Catch:{ all -> 0x0110 }
            com.bytedance.sdk.component.d.c.a.a.a$a r1 = r0.f26197e     // Catch:{ all -> 0x0110 }
            if (r1 != r10) goto L_0x010a
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f26196d     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f26178j     // Catch:{ all -> 0x0110 }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f26189c     // Catch:{ all -> 0x0110 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x0110 }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo64038b((int) r2)     // Catch:{ all -> 0x0110 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0110 }
            if (r3 != 0) goto L_0x0030
            r10.mo64031b()     // Catch:{ all -> 0x0110 }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo64031b()     // Catch:{ all -> 0x0110 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r11.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x0110 }
            r11.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0110 }
            r10.<init>(r11)     // Catch:{ all -> 0x0110 }
            throw r10     // Catch:{ all -> 0x0110 }
        L_0x004d:
            int r10 = r9.f26178j     // Catch:{ all -> 0x0110 }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo64038b((int) r1)     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x0110 }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo64036a((int) r1)     // Catch:{ all -> 0x0110 }
            r10.renameTo(r2)     // Catch:{ all -> 0x0110 }
            long[] r10 = r0.f26195c     // Catch:{ all -> 0x0110 }
            r3 = r10[r1]     // Catch:{ all -> 0x0110 }
            long r5 = r2.length()     // Catch:{ all -> 0x0110 }
            long[] r10 = r0.f26195c     // Catch:{ all -> 0x0110 }
            r10[r1] = r5     // Catch:{ all -> 0x0110 }
            long r7 = r9.f26179k     // Catch:{ all -> 0x0110 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f26179k = r7     // Catch:{ all -> 0x0110 }
            goto L_0x007e
        L_0x007b:
            m30683a((java.io.File) r10)     // Catch:{ all -> 0x0110 }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f26182n     // Catch:{ all -> 0x0110 }
            r1 = 1
            int r10 = r10 + r1
            r9.f26182n = r10     // Catch:{ all -> 0x0110 }
            r10 = 0
            com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C10504a unused = r0.f26197e = r10     // Catch:{ all -> 0x0110 }
            boolean r10 = r0.f26196d     // Catch:{ all -> 0x0110 }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00c8
            boolean unused = r0.f26196d = r1     // Catch:{ all -> 0x0110 }
            java.io.Writer r10 = r9.f26180l     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r1.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r0.f26194b     // Catch:{ all -> 0x0110 }
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r0.mo64037a()     // Catch:{ all -> 0x0110 }
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            r1.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0110 }
            r10.write(r1)     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x00ee
            long r10 = r9.f26184p     // Catch:{ all -> 0x0110 }
            r1 = 1
            long r1 = r1 + r10
            r9.f26184p = r1     // Catch:{ all -> 0x0110 }
            long unused = r0.f26198f = r10     // Catch:{ all -> 0x0110 }
            goto L_0x00ee
        L_0x00c8:
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r10 = r9.f26181m     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r0.f26194b     // Catch:{ all -> 0x0110 }
            r10.remove(r11)     // Catch:{ all -> 0x0110 }
            java.io.Writer r10 = r9.f26180l     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r11.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.f26194b     // Catch:{ all -> 0x0110 }
            r11.append(r0)     // Catch:{ all -> 0x0110 }
            r11.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0110 }
            r10.write(r11)     // Catch:{ all -> 0x0110 }
        L_0x00ee:
            java.io.Writer r10 = r9.f26180l     // Catch:{ all -> 0x0110 }
            r10.flush()     // Catch:{ all -> 0x0110 }
            long r10 = r9.f26179k     // Catch:{ all -> 0x0110 }
            long r0 = r9.f26177i     // Catch:{ all -> 0x0110 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0101
            boolean r10 = r9.m30695f()     // Catch:{ all -> 0x0110 }
            if (r10 == 0) goto L_0x0108
        L_0x0101:
            java.util.concurrent.ExecutorService r10 = r9.f26171b     // Catch:{ all -> 0x0110 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f26185q     // Catch:{ all -> 0x0110 }
            r10.submit(r11)     // Catch:{ all -> 0x0110 }
        L_0x0108:
            monitor-exit(r9)
            return
        L_0x010a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0110 }
            r10.<init>()     // Catch:{ all -> 0x0110 }
            throw r10     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.m30681a(com.bytedance.sdk.component.d.c.a.a.a$a, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m30695f() {
        int i = this.f26182n;
        return i >= 2000 && i >= this.f26181m.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo64024c(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m30696g()     // Catch:{ all -> 0x0093 }
            r7.m30693e((java.lang.String) r8)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r0 = r7.f26181m     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0093 }
            com.bytedance.sdk.component.d.c.a.a.a$b r0 = (com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C10506b) r0     // Catch:{ all -> 0x0093 }
            r1 = 0
            if (r0 == 0) goto L_0x0091
            com.bytedance.sdk.component.d.c.a.a.a$a r2 = r0.f26197e     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x001a
            goto L_0x0091
        L_0x001a:
            int r2 = r7.f26178j     // Catch:{ all -> 0x0093 }
            if (r1 >= r2) goto L_0x005c
            java.io.File r2 = r0.mo64036a((int) r1)     // Catch:{ all -> 0x0093 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0093 }
            if (r3 == 0) goto L_0x0046
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0093 }
            if (r3 == 0) goto L_0x002f
            goto L_0x0046
        L_0x002f:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r0.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x0093 }
            r0.append(r2)     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0093 }
            r8.<init>(r0)     // Catch:{ all -> 0x0093 }
            throw r8     // Catch:{ all -> 0x0093 }
        L_0x0046:
            long r2 = r7.f26179k     // Catch:{ all -> 0x0093 }
            long[] r4 = r0.f26195c     // Catch:{ all -> 0x0093 }
            r5 = r4[r1]     // Catch:{ all -> 0x0093 }
            long r2 = r2 - r5
            r7.f26179k = r2     // Catch:{ all -> 0x0093 }
            long[] r2 = r0.f26195c     // Catch:{ all -> 0x0093 }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x0093 }
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005c:
            int r0 = r7.f26182n     // Catch:{ all -> 0x0093 }
            r1 = 1
            int r0 = r0 + r1
            r7.f26182n = r0     // Catch:{ all -> 0x0093 }
            java.io.Writer r0 = r7.f26180l     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r2.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x0093 }
            r2.append(r8)     // Catch:{ all -> 0x0093 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0093 }
            r0.append(r2)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.d.c.a.a.a$b> r0 = r7.f26181m     // Catch:{ all -> 0x0093 }
            r0.remove(r8)     // Catch:{ all -> 0x0093 }
            boolean r8 = r7.m30695f()     // Catch:{ all -> 0x0093 }
            if (r8 == 0) goto L_0x008f
            java.util.concurrent.ExecutorService r8 = r7.f26171b     // Catch:{ all -> 0x0093 }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f26185q     // Catch:{ all -> 0x0093 }
            r8.submit(r0)     // Catch:{ all -> 0x0093 }
        L_0x008f:
            monitor-exit(r7)
            return r1
        L_0x0091:
            monitor-exit(r7)
            return r1
        L_0x0093:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.mo64024c(java.lang.String):boolean");
    }

    /* renamed from: g */
    private void m30696g() {
        if (this.f26180l == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo64021a() throws IOException {
        m30696g();
        m30697h();
        this.f26180l.flush();
    }

    public synchronized void close() throws IOException {
        if (this.f26180l != null) {
            Iterator it = new ArrayList(this.f26181m.values()).iterator();
            while (it.hasNext()) {
                C10506b bVar = (C10506b) it.next();
                if (bVar.f26197e != null) {
                    bVar.f26197e.mo64031b();
                }
            }
            m30697h();
            this.f26180l.close();
            this.f26180l = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m30697h() throws IOException {
        long j = this.f26177i;
        long j2 = this.f26183o;
        if (j2 >= 0) {
            j = j2;
        }
        while (this.f26179k > j) {
            mo64024c((String) this.f26181m.entrySet().iterator().next().getKey());
        }
        this.f26183o = -1;
    }

    /* renamed from: b */
    public void mo64023b() throws IOException {
        close();
        C10511d.m30736a(this.f26172d);
    }

    /* renamed from: e */
    private void m30693e(String str) {
        if (!f26169a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: com.bytedance.sdk.component.d.c.a.a.a$c */
    /* compiled from: DiskLruCache */
    public final class C10507c implements Closeable {

        /* renamed from: b */
        private final String f26200b;

        /* renamed from: c */
        private final long f26201c;

        /* renamed from: d */
        private final InputStream[] f26202d;

        /* renamed from: e */
        private final long[] f26203e;

        private C10507c(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f26200b = str;
            this.f26201c = j;
            this.f26202d = inputStreamArr;
            this.f26203e = jArr;
        }

        /* renamed from: a */
        public InputStream mo64039a(int i) {
            return this.f26202d[i];
        }

        public void close() {
            for (InputStream a : this.f26202d) {
                C10531b.m30852a(a);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.d.c.a.a.a$a */
    /* compiled from: DiskLruCache */
    public final class C10504a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C10506b f26188b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final boolean[] f26189c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f26190d;

        /* renamed from: e */
        private boolean f26191e;

        private C10504a(C10506b bVar) {
            this.f26188b = bVar;
            this.f26189c = bVar.f26196d ? null : new boolean[C10501a.this.f26178j];
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002e */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo64029a(int r4) throws java.io.IOException {
            /*
                r3 = this;
                if (r4 < 0) goto L_0x0051
                com.bytedance.sdk.component.d.c.a.a.a r0 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.this
                int r0 = r0.f26178j
                if (r4 >= r0) goto L_0x0051
                com.bytedance.sdk.component.d.c.a.a.a r0 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.this
                monitor-enter(r0)
                com.bytedance.sdk.component.d.c.a.a.a$b r1 = r3.f26188b     // Catch:{ all -> 0x004e }
                com.bytedance.sdk.component.d.c.a.a.a$a r1 = r1.f26197e     // Catch:{ all -> 0x004e }
                if (r1 != r3) goto L_0x0048
                com.bytedance.sdk.component.d.c.a.a.a$b r1 = r3.f26188b     // Catch:{ all -> 0x004e }
                boolean r1 = r1.f26196d     // Catch:{ all -> 0x004e }
                if (r1 != 0) goto L_0x0022
                boolean[] r1 = r3.f26189c     // Catch:{ all -> 0x004e }
                r2 = 1
                r1[r4] = r2     // Catch:{ all -> 0x004e }
            L_0x0022:
                com.bytedance.sdk.component.d.c.a.a.a$b r1 = r3.f26188b     // Catch:{ all -> 0x004e }
                java.io.File r4 = r1.mo64038b((int) r4)     // Catch:{ all -> 0x004e }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002e }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x002e }
                goto L_0x003c
            L_0x002e:
                com.bytedance.sdk.component.d.c.a.a.a r1 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.this     // Catch:{ all -> 0x004e }
                java.io.File r1 = r1.f26172d     // Catch:{ all -> 0x004e }
                r1.mkdirs()     // Catch:{ all -> 0x004e }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0044 }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0044 }
            L_0x003c:
                com.bytedance.sdk.component.d.c.a.a.a$a$a r4 = new com.bytedance.sdk.component.d.c.a.a.a$a$a     // Catch:{ all -> 0x004e }
                r2 = 0
                r4.<init>(r1)     // Catch:{ all -> 0x004e }
                monitor-exit(r0)     // Catch:{ all -> 0x004e }
                return r4
            L_0x0044:
                java.io.OutputStream r4 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.f26170c     // Catch:{ all -> 0x004e }
                monitor-exit(r0)     // Catch:{ all -> 0x004e }
                return r4
            L_0x0048:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004e }
                r4.<init>()     // Catch:{ all -> 0x004e }
                throw r4     // Catch:{ all -> 0x004e }
            L_0x004e:
                r4 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004e }
                throw r4
            L_0x0051:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expected index "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " to be greater than 0 and less than the maximum value count of "
                r1.append(r4)
                com.bytedance.sdk.component.d.c.a.a.a r4 = com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.this
                int r4 = r4.f26178j
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p313d.p316c.p317a.p318a.C10501a.C10504a.mo64029a(int):java.io.OutputStream");
        }

        /* renamed from: a */
        public void mo64030a() throws IOException {
            if (this.f26190d) {
                C10501a.this.m30681a(this, false);
                C10501a.this.mo64024c(this.f26188b.f26194b);
            } else {
                C10501a.this.m30681a(this, true);
            }
            this.f26191e = true;
        }

        /* renamed from: b */
        public void mo64031b() throws IOException {
            C10501a.this.m30681a(this, false);
        }

        /* renamed from: com.bytedance.sdk.component.d.c.a.a.a$a$a */
        /* compiled from: DiskLruCache */
        private class C10505a extends FilterOutputStream {
            private C10505a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    boolean unused2 = C10504a.this.f26190d = true;
                }
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    boolean unused2 = C10504a.this.f26190d = true;
                }
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    boolean unused2 = C10504a.this.f26190d = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    boolean unused2 = C10504a.this.f26190d = true;
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.d.c.a.a.a$b */
    /* compiled from: DiskLruCache */
    private final class C10506b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f26194b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long[] f26195c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f26196d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C10504a f26197e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public long f26198f;

        private C10506b(String str) {
            this.f26194b = str;
            this.f26195c = new long[C10501a.this.f26178j];
        }

        /* renamed from: a */
        public String mo64037a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f26195c) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m30714a(String[] strArr) throws IOException {
            if (strArr.length == C10501a.this.f26178j) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f26195c[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m30716b(strArr);
                    }
                }
                return;
            }
            throw m30716b(strArr);
        }

        /* renamed from: b */
        private IOException m30716b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File mo64036a(int i) {
            File f = C10501a.this.f26172d;
            return new File(f, this.f26194b + "." + i);
        }

        /* renamed from: b */
        public File mo64038b(int i) {
            File f = C10501a.this.f26172d;
            return new File(f, this.f26194b + "." + i + C8850d.f22419eY);
        }
    }
}
