package com.applovin.exoplayer2.p209i.p214e;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.p184b.C7056c;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.exoplayer2.i.e.c */
final class C7581c {

    /* renamed from: a */
    public final String f17629a;

    /* renamed from: b */
    public final int f17630b;

    /* renamed from: c */
    public final Integer f17631c;

    /* renamed from: d */
    public final float f17632d;

    /* renamed from: e */
    public final boolean f17633e;

    /* renamed from: f */
    public final boolean f17634f;

    /* renamed from: g */
    public final boolean f17635g;

    /* renamed from: h */
    public final boolean f17636h;

    /* renamed from: com.applovin.exoplayer2.i.e.c$a */
    static final class C7582a {

        /* renamed from: a */
        public final int f17637a;

        /* renamed from: b */
        public final int f17638b;

        /* renamed from: c */
        public final int f17639c;

        /* renamed from: d */
        public final int f17640d;

        /* renamed from: e */
        public final int f17641e;

        /* renamed from: f */
        public final int f17642f;

        /* renamed from: g */
        public final int f17643g;

        /* renamed from: h */
        public final int f17644h;

        /* renamed from: i */
        public final int f17645i;

        private C7582a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f17637a = i;
            this.f17638b = i2;
            this.f17639c = i3;
            this.f17640d = i4;
            this.f17641e = i5;
            this.f17642f = i6;
            this.f17643g = i7;
            this.f17644h = i8;
            this.f17645i = i9;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.applovin.exoplayer2.p209i.p214e.C7581c.C7582a m21477a(java.lang.String r14) {
            /*
                r0 = 7
                java.lang.String r14 = r14.substring(r0)
                java.lang.String r1 = ","
                java.lang.String[] r14 = android.text.TextUtils.split(r14, r1)
                r1 = 0
                r2 = -1
                r3 = 0
                r5 = -1
                r6 = -1
                r7 = -1
                r8 = -1
                r9 = -1
                r10 = -1
                r11 = -1
                r12 = -1
            L_0x0016:
                int r4 = r14.length
                if (r3 >= r4) goto L_0x0092
                r4 = r14[r3]
                java.lang.String r4 = r4.trim()
                java.lang.String r4 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r4)
                int r13 = r4.hashCode()
                switch(r13) {
                    case -1178781136: goto L_0x0071;
                    case -1026963764: goto L_0x0067;
                    case -192095652: goto L_0x005d;
                    case -70925746: goto L_0x0053;
                    case 3029637: goto L_0x0049;
                    case 3373707: goto L_0x003f;
                    case 366554320: goto L_0x0035;
                    case 1767875043: goto L_0x002b;
                    default: goto L_0x002a;
                }
            L_0x002a:
                goto L_0x007b
            L_0x002b:
                java.lang.String r13 = "alignment"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 1
                goto L_0x007c
            L_0x0035:
                java.lang.String r13 = "fontsize"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 3
                goto L_0x007c
            L_0x003f:
                java.lang.String r13 = "name"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 0
                goto L_0x007c
            L_0x0049:
                java.lang.String r13 = "bold"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 4
                goto L_0x007c
            L_0x0053:
                java.lang.String r13 = "primarycolour"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 2
                goto L_0x007c
            L_0x005d:
                java.lang.String r13 = "strikeout"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 7
                goto L_0x007c
            L_0x0067:
                java.lang.String r13 = "underline"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 6
                goto L_0x007c
            L_0x0071:
                java.lang.String r13 = "italic"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 5
                goto L_0x007c
            L_0x007b:
                r4 = -1
            L_0x007c:
                switch(r4) {
                    case 0: goto L_0x008e;
                    case 1: goto L_0x008c;
                    case 2: goto L_0x008a;
                    case 3: goto L_0x0088;
                    case 4: goto L_0x0086;
                    case 5: goto L_0x0084;
                    case 6: goto L_0x0082;
                    case 7: goto L_0x0080;
                    default: goto L_0x007f;
                }
            L_0x007f:
                goto L_0x008f
            L_0x0080:
                r12 = r3
                goto L_0x008f
            L_0x0082:
                r11 = r3
                goto L_0x008f
            L_0x0084:
                r10 = r3
                goto L_0x008f
            L_0x0086:
                r9 = r3
                goto L_0x008f
            L_0x0088:
                r8 = r3
                goto L_0x008f
            L_0x008a:
                r7 = r3
                goto L_0x008f
            L_0x008c:
                r6 = r3
                goto L_0x008f
            L_0x008e:
                r5 = r3
            L_0x008f:
                int r3 = r3 + 1
                goto L_0x0016
            L_0x0092:
                if (r5 == r2) goto L_0x009c
                com.applovin.exoplayer2.i.e.c$a r0 = new com.applovin.exoplayer2.i.e.c$a
                int r13 = r14.length
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x009d
            L_0x009c:
                r0 = 0
            L_0x009d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p214e.C7581c.C7582a.m21477a(java.lang.String):com.applovin.exoplayer2.i.e.c$a");
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.e.c$b */
    static final class C7583b {

        /* renamed from: c */
        private static final Pattern f17646c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        private static final Pattern f17647d = Pattern.compile(C7728ai.m22200a("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e */
        private static final Pattern f17648e = Pattern.compile(C7728ai.m22200a("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f */
        private static final Pattern f17649f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public final int f17650a;

        /* renamed from: b */
        public final PointF f17651b;

        private C7583b(int i, PointF pointF) {
            this.f17650a = i;
            this.f17651b = pointF;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|(1:7)|8|9|(2:11|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.applovin.exoplayer2.p209i.p214e.C7581c.C7583b m21478a(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = f17646c
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = -1
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x002b
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r3)
                java.lang.String r3 = (java.lang.String) r3
                android.graphics.PointF r4 = m21480c(r3)     // Catch:{ RuntimeException -> 0x0021 }
                if (r4 == 0) goto L_0x0021
                r1 = r4
            L_0x0021:
                int r3 = m21481d(r3)     // Catch:{ RuntimeException -> 0x0029 }
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0029:
                goto L_0x0009
            L_0x002b:
                com.applovin.exoplayer2.i.e.c$b r5 = new com.applovin.exoplayer2.i.e.c$b
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p214e.C7581c.C7583b.m21478a(java.lang.String):com.applovin.exoplayer2.i.e.c$b");
        }

        /* renamed from: b */
        public static String m21479b(String str) {
            return f17646c.matcher(str).replaceAll("");
        }

        /* renamed from: c */
        private static PointF m21480c(String str) {
            String str2;
            String str3;
            Matcher matcher = f17647d.matcher(str);
            Matcher matcher2 = f17648e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    C7755q.m22358b("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C7717a.m22120b(str2)).trim()), Float.parseFloat(((String) C7717a.m22120b(str3)).trim()));
        }

        /* renamed from: d */
        private static int m21481d(String str) {
            Matcher matcher = f17649f.matcher(str);
            if (matcher.find()) {
                return C7581c.m21474c((String) C7717a.m22120b(matcher.group(1)));
            }
            return -1;
        }
    }

    private C7581c(String str, int i, Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f17629a = str;
        this.f17630b = i;
        this.f17631c = num;
        this.f17632d = f;
        this.f17633e = z;
        this.f17634f = z2;
        this.f17635g = z3;
        this.f17636h = z4;
    }

    /* renamed from: a */
    public static C7581c m21470a(String str, C7582a aVar) {
        String str2 = str;
        C7582a aVar2 = aVar;
        C7717a.m22118a(str2.startsWith("Style:"));
        String[] split = TextUtils.split(str2.substring(6), ",");
        if (split.length != aVar2.f17645i) {
            C7755q.m22361c("SsaStyle", C7728ai.m22200a("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(aVar2.f17645i), Integer.valueOf(split.length), str2));
            return null;
        }
        try {
            return new C7581c(split[aVar2.f17637a].trim(), aVar2.f17638b != -1 ? m21474c(split[aVar2.f17638b].trim()) : -1, aVar2.f17639c != -1 ? m21471a(split[aVar2.f17639c].trim()) : null, aVar2.f17640d != -1 ? m21475d(split[aVar2.f17640d].trim()) : -3.4028235E38f, aVar2.f17641e != -1 && m21476e(split[aVar2.f17641e].trim()), aVar2.f17642f != -1 && m21476e(split[aVar2.f17642f].trim()), aVar2.f17643g != -1 && m21476e(split[aVar2.f17643g].trim()), aVar2.f17644h != -1 && m21476e(split[aVar2.f17644h].trim()));
        } catch (RuntimeException e) {
            C7755q.m22359b("SsaStyle", "Skipping malformed 'Style:' line: '" + str2 + "'", e);
            return null;
        }
    }

    /* renamed from: a */
    public static Integer m21471a(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C7717a.m22118a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(C7056c.m18926a(((parseLong >> 24) & 255) ^ 255), C7056c.m18926a(parseLong & 255), C7056c.m18926a((parseLong >> 8) & 255), C7056c.m18926a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            C7755q.m22359b("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m21472a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m21474c(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m21472a(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        C7755q.m22361c("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* renamed from: d */
    private static float m21475d(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            C7755q.m22359b("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }

    /* renamed from: e */
    private static boolean m21476e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            C7755q.m22359b("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
