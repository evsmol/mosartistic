package p152ms.p153bd.p154o.Pgl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: ms.bd.o.Pgl.t0 */
public class C5678t0 {

    /* renamed from: a */
    private static final String f13027a = ((String) pblk.m14617a(16777217, 0, 0, "da92a1", new byte[]{69, 113, 69, 69, 91, 53, 116, 79, 122}));

    /* renamed from: b */
    private static final String f13028b = ((String) pblk.m14617a(16777217, 0, 0, "5e9757", new byte[]{Ascii.f15544FF, 102, 88, 71, Ascii.f15546GS, 33, 36, 65}));

    /* renamed from: c */
    private static final String f13029c = ((String) pblk.m14617a(16777217, 0, 0, "ace8a6", new byte[]{86, 100, Ascii.ETB, 88, 75, 51, 103, 81}));

    /* renamed from: d */
    private static final String f13030d = ((String) pblk.m14617a(16777217, 0, 0, "bb41d1", new byte[]{99, 99}));

    /* renamed from: e */
    private static final String f13031e = ((String) pblk.m14617a(16777217, 0, 0, "1355fe", new byte[]{40, 38}));

    /* renamed from: f */
    private static final String f13032f = ((String) pblk.m14617a(16777217, 0, 0, "28bbd6", new byte[]{37, 46}));

    /* renamed from: g */
    private static final String f13033g = ((String) pblk.m14617a(16777217, 0, 0, "f56368", new byte[]{122, 54, 93}));

    /* renamed from: h */
    private static final String f13034h = ((String) pblk.m14617a(16777217, 0, 0, "d724f4", new byte[]{120, 60, 79}));

    /* renamed from: i */
    private static final String f13035i = ((String) pblk.m14617a(16777217, 0, 0, "26cd34", new byte[]{32, 59, 2, Ascii.NAK}));

    /* renamed from: j */
    private static final FileFilter f13036j = new pgla();

    /* renamed from: ms.bd.o.Pgl.t0$pgla */
    static class pgla implements FileFilter {
        pgla() {
        }

        public boolean accept(File file) {
            return Pattern.matches((String) pblk.m14617a(16777217, 0, 0, "9e3449", new byte[]{43, 119, 85, 123, 91, 99, 99, 121}), file.getName());
        }
    }

    /* renamed from: a */
    private static int m14685a() {
        try {
            return new File((String) pblk.m14617a(16777217, 0, 0, "092ead", new byte[]{110, 40, 88, 2, 17, 119, 54, Ascii.f15552SO, 106, 54, 36, 40, Ascii.f15552SO, 2, 71, 96, 39, Ascii.f15546GS, 110, 122, 34, 43, 84, 94})).listFiles(f13036j).length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r11 == null) goto L_0x0049;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[SYNTHETIC, Splitter:B:21:0x003d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m14686a(java.lang.String r11) {
        /*
            r0 = 114(0x72, float:1.6E-43)
            r1 = 0
            r2 = 1
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0039 }
            r4.<init>(r11)     // Catch:{ all -> 0x0039 }
            boolean r11 = r4.exists()     // Catch:{ all -> 0x0039 }
            if (r11 != 0) goto L_0x0023
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            r7 = 0
            java.lang.String r9 = "39cd10"
            byte[] r10 = new byte[r2]     // Catch:{ all -> 0x0039 }
            r10[r1] = r0     // Catch:{ all -> 0x0039 }
            java.lang.Object r11 = p152ms.p153bd.p154o.Pgl.pblk.m14617a(r5, r6, r7, r9, r10)     // Catch:{ all -> 0x0039 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0039 }
            return r11
        L_0x0023:
            java.io.FileReader r11 = new java.io.FileReader     // Catch:{ all -> 0x0039 }
            r11.<init>(r4)     // Catch:{ all -> 0x0039 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x0037 }
            r4.<init>(r11)     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = r4.readLine()     // Catch:{ all -> 0x0035 }
            r4.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0044
        L_0x0035:
            goto L_0x003b
        L_0x0037:
            r4 = r3
            goto L_0x003b
        L_0x0039:
            r11 = r3
            r4 = r11
        L_0x003b:
            if (r4 == 0) goto L_0x0042
            r4.close()     // Catch:{ all -> 0x0041 }
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            if (r11 == 0) goto L_0x0049
        L_0x0044:
            r11.close()     // Catch:{ all -> 0x0048 }
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            if (r3 != 0) goto L_0x005e
            byte[] r9 = new byte[r2]
            r9[r1] = r0
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.String r8 = "3d7bc4"
            java.lang.Object r11 = p152ms.p153bd.p154o.Pgl.pblk.m14617a(r4, r5, r6, r8, r9)
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x0062
        L_0x005e:
            java.lang.String r11 = r3.trim()
        L_0x0062:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p152ms.p153bd.p154o.Pgl.C5678t0.m14686a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static String m14687a(HashMap<String, String> hashMap, String str) {
        String str2;
        try {
            str2 = hashMap.get(str);
        } catch (Throwable unused) {
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|12|32|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        if (r2 == null) goto L_0x00b2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00af */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8 A[SYNTHETIC, Splitter:B:28:0x00a8] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap<java.lang.String, java.lang.String> m14688b() {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x00a5 }
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.String r7 = "a47945"
            r8 = 13
            byte[] r8 = new byte[r8]     // Catch:{ all -> 0x00a5 }
            r9 = 63
            r10 = 0
            r8[r10] = r9     // Catch:{ all -> 0x00a5 }
            r9 = 38
            r11 = 1
            r8[r11] = r9     // Catch:{ all -> 0x00a5 }
            r9 = 86
            r12 = 2
            r8[r12] = r9     // Catch:{ all -> 0x00a5 }
            r9 = 3
            r13 = 66
            r8[r9] = r13     // Catch:{ all -> 0x00a5 }
            r9 = 4
            r13 = 8
            r8[r9] = r13     // Catch:{ all -> 0x00a5 }
            r9 = 109(0x6d, float:1.53E-43)
            r14 = 5
            r8[r14] = r9     // Catch:{ all -> 0x00a5 }
            r9 = 6
            r15 = 97
            r8[r9] = r15     // Catch:{ all -> 0x00a5 }
            r9 = 7
            r8[r9] = r14     // Catch:{ all -> 0x00a5 }
            r9 = 115(0x73, float:1.61E-43)
            r8[r13] = r9     // Catch:{ all -> 0x00a5 }
            r13 = 9
            r14 = 96
            r8[r13] = r14     // Catch:{ all -> 0x00a5 }
            r13 = 10
            r14 = 126(0x7e, float:1.77E-43)
            r8[r13] = r14     // Catch:{ all -> 0x00a5 }
            r13 = 11
            r14 = 48
            r8[r13] = r14     // Catch:{ all -> 0x00a5 }
            r13 = 12
            r14 = 75
            r8[r13] = r14     // Catch:{ all -> 0x00a5 }
            java.lang.Object r3 = p152ms.p153bd.p154o.Pgl.pblk.m14617a(r3, r4, r5, r7, r8)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00a5 }
            r2.<init>(r3)     // Catch:{ all -> 0x00a5 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x00a3 }
            r3.<init>(r2)     // Catch:{ all -> 0x00a3 }
        L_0x0064:
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x00a1 }
            if (r1 != 0) goto L_0x006e
            r3.close()     // Catch:{ all -> 0x00af }
            goto L_0x00af
        L_0x006e:
            r13 = 16777217(0x1000001, float:2.350989E-38)
            r14 = 0
            r15 = 0
            java.lang.String r17 = "8519ee"
            byte[] r4 = new byte[r11]     // Catch:{ all -> 0x00a1 }
            r4[r10] = r9     // Catch:{ all -> 0x00a1 }
            r18 = r4
            java.lang.Object r4 = p152ms.p153bd.p154o.Pgl.pblk.m14617a(r13, r14, r15, r17, r18)     // Catch:{ all -> 0x00a1 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00a1 }
            java.lang.String[] r1 = r1.split(r4, r12)     // Catch:{ all -> 0x00a1 }
            int r4 = r1.length     // Catch:{ all -> 0x00a1 }
            if (r4 >= r12) goto L_0x008a
            goto L_0x0064
        L_0x008a:
            r4 = r1[r10]     // Catch:{ all -> 0x00a1 }
            java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x00a1 }
            r1 = r1[r11]     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x00a1 }
            java.lang.Object r5 = r0.get(r4)     // Catch:{ all -> 0x00a1 }
            if (r5 == 0) goto L_0x009d
            goto L_0x0064
        L_0x009d:
            r0.put(r4, r1)     // Catch:{ all -> 0x00a1 }
            goto L_0x0064
        L_0x00a1:
            r1 = r3
            goto L_0x00a6
        L_0x00a3:
            goto L_0x00a6
        L_0x00a5:
            r2 = r1
        L_0x00a6:
            if (r1 == 0) goto L_0x00ad
            r1.close()     // Catch:{ all -> 0x00ac }
            goto L_0x00ad
        L_0x00ac:
        L_0x00ad:
            if (r2 == 0) goto L_0x00b2
        L_0x00af:
            r2.close()     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p152ms.p153bd.p154o.Pgl.C5678t0.m14688b():java.util.HashMap");
    }

    /* renamed from: c */
    public static String m14689c() {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap<String, String> b = m14688b();
            jSONObject.put(f13035i, m14685a());
            jSONObject.put(f13030d, m14687a(b, f13027a));
            jSONObject.put(f13031e, m14687a(b, f13028b));
            jSONObject.put(f13033g, m14686a((String) pblk.m14617a(16777217, 0, 0, "58cb7a", new byte[]{107, 41, 9, 5, 71, 114, 51, Ascii.f15551SI, 59, 49, 33, 41, 95, 5, 17, 101, 34, Ascii.f15545FS, 63, 125, 39, 42, 5, 89, Ascii.f15555VT, 102, 35, 73, 125, 49, 52, 47, Ascii.SYN, 4, Ascii.f15542CR, 103, 121, Ascii.SUB, 34, 39, 45, 52, Ascii.SYN, Ascii.f15543EM, 55, 123, 55, 1, Ascii.f15542CR, 52, 54, 63, 1})));
            jSONObject.put(f13034h, m14686a((String) pblk.m14617a(16777217, 0, 0, "f0dc27", new byte[]{56, 33, Ascii.f15552SO, 4, 66, 36, 96, 7, 60, 48, 114, 33, 88, 4, Ascii.DC4, 51, 113, Ascii.DC4, 56, 124, 116, 34, 2, 88, Ascii.f15552SO, 48, 112, 65, 122, 48, 103, 39, 17, 5, 8, 49, 42, Ascii.DC2, 37, 38, 126, 60, 17, Ascii.CAN, 50, 45, 108, Ascii.f15554US, 10, 53, 101, 55, 6})));
            jSONObject.put(f13032f, m14687a(b, f13029c));
        } catch (Throwable unused) {
        }
        String jSONObject2 = jSONObject.toString();
        return TextUtils.isEmpty(jSONObject2) ? (String) pblk.m14617a(16777217, 0, 0, "09c07f", new byte[]{58, 38}) : jSONObject2.trim();
    }
}
