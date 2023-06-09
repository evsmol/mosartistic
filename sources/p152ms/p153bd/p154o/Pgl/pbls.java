package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p152ms.p153bd.p154o.Pgl.pblu;

/* renamed from: ms.bd.o.Pgl.pbls */
public class pbls implements pblu.pgla {

    /* renamed from: ms.bd.o.Pgl.pbls$pgla */
    private static class pgla {

        /* renamed from: a */
        public ZipFile f13006a;

        /* renamed from: b */
        public ZipEntry f13007b;

        public pgla(ZipFile zipFile, ZipEntry zipEntry) {
            this.f13006a = zipFile;
            this.f13007b = zipEntry;
        }
    }

    /* renamed from: a */
    private pgla m14648a(Context context, String[] strArr, String str, pblv pblv) {
        int i;
        ZipFile zipFile;
        String[] strArr2 = strArr;
        String[] a = m14650a(context);
        int length = a.length;
        char c = 0;
        int i2 = 0;
        while (i2 < length) {
            String str2 = a[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                i = 5;
                if (i3 >= 5) {
                    zipFile = null;
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile == null) {
                String str3 = str;
            } else {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < i) {
                        int length2 = strArr2.length;
                        int i7 = 0;
                        while (i7 < length2) {
                            String str4 = "lib" + File.separatorChar + strArr2[i7] + File.separatorChar + str;
                            Object[] objArr = new Object[2];
                            objArr[c] = str4;
                            objArr[1] = str2;
                            if (pblv != null) {
                                String.format(Locale.US, "Looking for %s in APK %s...", objArr);
                                ZipEntry entry = zipFile.getEntry(str4);
                                if (entry != null) {
                                    return new pgla(zipFile, entry);
                                }
                                i7++;
                                c = 0;
                                i = 5;
                            } else {
                                throw null;
                            }
                        }
                        String str5 = str;
                        i5 = i6;
                    } else {
                        String str6 = str;
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
            c = 0;
        }
        return null;
    }

    /* renamed from: a */
    private void m14649a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private String[] m14650a(Context context) {
        String[] strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr = applicationInfo.splitSourceDirs) == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    /* renamed from: a */
    private String[] m14651a(Context context, String str) {
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        ZipFile zipFile = null;
        for (String file : m14650a(context)) {
            try {
                ZipFile zipFile2 = new ZipFile(new File(file), 1);
                Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
                zipFile = zipFile2;
            } catch (IOException unused) {
            }
        }
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ms.bd.o.Pgl.pbls$pgla} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        m14649a((java.io.Closeable) r10);
        m14649a((java.io.Closeable) r3);
        r13.setReadable(true, false);
        r13.setExecutable(true, false);
        r13.setWritable(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        if (r14.f13006a == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        r14.f13006a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00b2 A[SYNTHETIC, Splitter:B:70:0x00b2] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42223a(android.content.Context r10, java.lang.String[] r11, java.lang.String r12, java.io.File r13, p152ms.p153bd.p154o.Pgl.pblv r14) {
        /*
            r9 = this;
            r0 = 0
            ms.bd.o.Pgl.pbls$pgla r14 = r9.m14648a(r10, r11, r12, r14)     // Catch:{ all -> 0x00af }
            r1 = 1
            r2 = 0
            if (r14 == 0) goto L_0x0097
            r10 = 0
        L_0x000a:
            int r11 = r10 + 1
            r3 = 5
            if (r10 >= r3) goto L_0x008d
            java.lang.String r10 = "Found %s! Extracting..."
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x009c }
            r3[r2] = r12     // Catch:{ all -> 0x009c }
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x009c }
            java.lang.String.format(r4, r10, r3)     // Catch:{ all -> 0x009c }
            boolean r10 = r13.exists()     // Catch:{ IOException -> 0x008a }
            if (r10 != 0) goto L_0x0027
            boolean r10 = r13.createNewFile()     // Catch:{ IOException -> 0x008a }
            if (r10 != 0) goto L_0x0027
            goto L_0x008a
        L_0x0027:
            java.util.zip.ZipFile r10 = r14.f13006a     // Catch:{ FileNotFoundException | IOException -> 0x0082, all -> 0x0078 }
            java.util.zip.ZipEntry r3 = r14.f13007b     // Catch:{ FileNotFoundException | IOException -> 0x0082, all -> 0x0078 }
            java.io.InputStream r10 = r10.getInputStream(r3)     // Catch:{ FileNotFoundException | IOException -> 0x0082, all -> 0x0078 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException | IOException -> 0x0083, all -> 0x0076 }
            r3.<init>(r13)     // Catch:{ FileNotFoundException | IOException -> 0x0083, all -> 0x0076 }
            r4 = 0
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ FileNotFoundException | IOException -> 0x0084, all -> 0x0073 }
        L_0x003a:
            int r7 = r10.read(r6)     // Catch:{ FileNotFoundException | IOException -> 0x0084, all -> 0x0073 }
            r8 = -1
            if (r7 != r8) goto L_0x006d
            r3.flush()     // Catch:{ FileNotFoundException | IOException -> 0x0084, all -> 0x0073 }
            java.io.FileDescriptor r6 = r3.getFD()     // Catch:{ FileNotFoundException | IOException -> 0x0084, all -> 0x0073 }
            r6.sync()     // Catch:{ FileNotFoundException | IOException -> 0x0084, all -> 0x0073 }
            long r6 = r13.length()     // Catch:{ FileNotFoundException | IOException -> 0x0084, all -> 0x0073 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0054
            goto L_0x0084
        L_0x0054:
            r9.m14649a((java.io.Closeable) r10)     // Catch:{ all -> 0x009c }
            r9.m14649a((java.io.Closeable) r3)     // Catch:{ all -> 0x009c }
            r13.setReadable(r1, r2)     // Catch:{ all -> 0x009c }
            r13.setExecutable(r1, r2)     // Catch:{ all -> 0x009c }
            r13.setWritable(r1)     // Catch:{ all -> 0x009c }
            java.util.zip.ZipFile r10 = r14.f13006a     // Catch:{ IOException -> 0x006c }
            if (r10 == 0) goto L_0x006c
            java.util.zip.ZipFile r10 = r14.f13006a     // Catch:{ IOException -> 0x006c }
            r10.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            return
        L_0x006d:
            r3.write(r6, r2, r7)     // Catch:{ FileNotFoundException | IOException -> 0x0084, all -> 0x0073 }
            long r7 = (long) r7
            long r4 = r4 + r7
            goto L_0x003a
        L_0x0073:
            r11 = move-exception
            r0 = r3
            goto L_0x007b
        L_0x0076:
            r11 = move-exception
            goto L_0x007b
        L_0x0078:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x007b:
            r9.m14649a((java.io.Closeable) r10)     // Catch:{ all -> 0x009c }
            r9.m14649a((java.io.Closeable) r0)     // Catch:{ all -> 0x009c }
            throw r11     // Catch:{ all -> 0x009c }
        L_0x0082:
            r10 = r0
        L_0x0083:
            r3 = r0
        L_0x0084:
            r9.m14649a((java.io.Closeable) r10)     // Catch:{ all -> 0x009c }
            r9.m14649a((java.io.Closeable) r3)     // Catch:{ all -> 0x009c }
        L_0x008a:
            r10 = r11
            goto L_0x000a
        L_0x008d:
            java.util.zip.ZipFile r10 = r14.f13006a     // Catch:{ IOException -> 0x0096 }
            if (r10 == 0) goto L_0x0096
            java.util.zip.ZipFile r10 = r14.f13006a     // Catch:{ IOException -> 0x0096 }
            r10.close()     // Catch:{ IOException -> 0x0096 }
        L_0x0096:
            return
        L_0x0097:
            java.lang.String[] r10 = r9.m14651a(r10, r12)     // Catch:{ Exception -> 0x009f }
            goto L_0x00a9
        L_0x009c:
            r10 = move-exception
            r0 = r14
            goto L_0x00b0
        L_0x009f:
            r10 = move-exception
            java.lang.String[] r13 = new java.lang.String[r1]     // Catch:{ all -> 0x009c }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x009c }
            r13[r2] = r10     // Catch:{ all -> 0x009c }
            r10 = r13
        L_0x00a9:
            ms.bd.o.Pgl.pblt r13 = new ms.bd.o.Pgl.pblt     // Catch:{ all -> 0x009c }
            r13.<init>(r12, r11, r10)     // Catch:{ all -> 0x009c }
            throw r13     // Catch:{ all -> 0x009c }
        L_0x00af:
            r10 = move-exception
        L_0x00b0:
            if (r0 == 0) goto L_0x00bb
            java.util.zip.ZipFile r11 = r0.f13006a     // Catch:{ IOException -> 0x00bb }
            if (r11 == 0) goto L_0x00bb
            java.util.zip.ZipFile r11 = r0.f13006a     // Catch:{ IOException -> 0x00bb }
            r11.close()     // Catch:{ IOException -> 0x00bb }
        L_0x00bb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p152ms.p153bd.p154o.Pgl.pbls.mo42223a(android.content.Context, java.lang.String[], java.lang.String, java.io.File, ms.bd.o.Pgl.pblv):void");
    }
}
