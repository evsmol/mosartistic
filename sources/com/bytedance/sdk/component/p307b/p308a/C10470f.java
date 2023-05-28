package com.bytedance.sdk.component.p307b.p308a;

import com.applovin.exoplayer2.common.base.Ascii;
import com.bytedance.sdk.component.p307b.p308a.p311b.C10458a;
import com.bytedance.sdk.component.p307b.p308a.p311b.C10466i;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.b.a.f */
/* compiled from: HttpUrl */
public final class C10470f {

    /* renamed from: d */
    private static final char[] f26089d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f26090a;

    /* renamed from: b */
    final String f26091b;

    /* renamed from: c */
    final int f26092c;

    /* renamed from: e */
    private final String f26093e;

    /* renamed from: f */
    private final String f26094f;

    /* renamed from: g */
    private final List<String> f26095g;

    /* renamed from: h */
    private final List<String> f26096h;

    /* renamed from: i */
    private final String f26097i;

    /* renamed from: j */
    private final String f26098j;

    C10470f(C10471a aVar) {
        this.f26090a = aVar.f26099a;
        this.f26093e = m30545a(aVar.f26100b, false);
        this.f26094f = m30545a(aVar.f26101c, false);
        this.f26091b = aVar.f26102d;
        this.f26092c = aVar.mo63956a();
        this.f26095g = m30546a(aVar.f26104f, false);
        String str = null;
        this.f26096h = aVar.f26105g != null ? m30546a(aVar.f26105g, true) : null;
        this.f26097i = aVar.f26106h != null ? m30545a(aVar.f26106h, false) : str;
        this.f26098j = aVar.toString();
    }

    /* renamed from: a */
    public URL mo63948a() {
        try {
            return new URL(this.f26098j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public String mo63949b() {
        if (this.f26093e.isEmpty()) {
            return "";
        }
        int length = this.f26090a.length() + 3;
        String str = this.f26098j;
        return this.f26098j.substring(length, C10466i.m30522a(str, length, str.length(), ":@"));
    }

    /* renamed from: c */
    public String mo63950c() {
        if (this.f26094f.isEmpty()) {
            return "";
        }
        int indexOf = this.f26098j.indexOf(64);
        return this.f26098j.substring(this.f26098j.indexOf(58, this.f26090a.length() + 3) + 1, indexOf);
    }

    /* renamed from: a */
    public static int m30541a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: a */
    static void m30549a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: d */
    public List<String> mo63951d() {
        int indexOf = this.f26098j.indexOf(47, this.f26090a.length() + 3);
        String str = this.f26098j;
        int a = C10466i.m30522a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            int a2 = C10466i.m30521a(this.f26098j, i, a, '/');
            arrayList.add(this.f26098j.substring(i, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    /* renamed from: e */
    public String mo63952e() {
        if (this.f26096h == null) {
            return null;
        }
        int indexOf = this.f26098j.indexOf(63) + 1;
        String str = this.f26098j;
        return this.f26098j.substring(indexOf, C10466i.m30521a(str, indexOf, str.length(), '#'));
    }

    /* renamed from: b */
    static void m30552b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: b */
    static List<String> m30551b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: c */
    public static C10470f m30553c(String str) {
        C10471a aVar = new C10471a();
        if (aVar.mo63957a((C10470f) null, str) == C10471a.C10472a.SUCCESS) {
            return aVar.mo63961b();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10470f) && ((C10470f) obj).f26098j.equals(this.f26098j);
    }

    public int hashCode() {
        return this.f26098j.hashCode();
    }

    public String toString() {
        return this.f26098j;
    }

    /* renamed from: com.bytedance.sdk.component.b.a.f$a */
    /* compiled from: HttpUrl */
    public static final class C10471a {

        /* renamed from: a */
        String f26099a;

        /* renamed from: b */
        String f26100b = "";

        /* renamed from: c */
        String f26101c = "";

        /* renamed from: d */
        String f26102d;

        /* renamed from: e */
        int f26103e = -1;

        /* renamed from: f */
        final List<String> f26104f;

        /* renamed from: g */
        List<String> f26105g;

        /* renamed from: h */
        String f26106h;

        /* renamed from: com.bytedance.sdk.component.b.a.f$a$a */
        /* compiled from: HttpUrl */
        enum C10472a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public C10471a() {
            ArrayList arrayList = new ArrayList();
            this.f26104f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public C10471a mo63958a(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f26099a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f26099a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        /* renamed from: b */
        public C10471a mo63960b(String str) {
            if (str != null) {
                String e = m30566e(str, 0, str.length());
                if (e != null) {
                    this.f26102d = e;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo63956a() {
            int i = this.f26103e;
            return i != -1 ? i : C10470f.m30541a(this.f26099a);
        }

        /* renamed from: c */
        public C10471a mo63962c(String str) {
            if (str != null) {
                return m30559a(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        /* renamed from: a */
        private C10471a m30559a(String str, boolean z) {
            int i = 0;
            do {
                int a = C10466i.m30522a(str, i, str.length(), "/\\");
                m30561a(str, i, a, a < str.length(), z);
                i = a + 1;
            } while (i <= str.length());
            return this;
        }

        /* renamed from: d */
        public C10471a mo63963d(String str) {
            this.f26105g = str != null ? C10470f.m30551b(C10470f.m30544a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* renamed from: a */
        public C10471a mo63959a(String str, String str2) {
            if (str != null) {
                if (this.f26105g == null) {
                    this.f26105g = new ArrayList();
                }
                this.f26105g.add(C10470f.m30544a(str, " \"'<>#&=", true, false, true, true));
                this.f26105g.add(str2 != null ? C10470f.m30544a(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        /* renamed from: b */
        public C10470f mo63961b() {
            if (this.f26099a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f26102d != null) {
                return new C10470f(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f26099a);
            sb.append("://");
            if (!this.f26100b.isEmpty() || !this.f26101c.isEmpty()) {
                sb.append(this.f26100b);
                if (!this.f26101c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f26101c);
                }
                sb.append('@');
            }
            if (this.f26102d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f26102d);
                sb.append(']');
            } else {
                sb.append(this.f26102d);
            }
            int a = mo63956a();
            if (a != C10470f.m30541a(this.f26099a)) {
                sb.append(':');
                sb.append(a);
            }
            C10470f.m30549a(sb, this.f26104f);
            if (this.f26105g != null) {
                sb.append('?');
                C10470f.m30552b(sb, this.f26105g);
            }
            if (this.f26106h != null) {
                sb.append('#');
                sb.append(this.f26106h);
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10472a mo63957a(C10470f fVar, String str) {
            int a;
            int i;
            C10470f fVar2 = fVar;
            String str2 = str;
            int a2 = C10466i.m30520a(str2, 0, str.length());
            int b = C10466i.m30528b(str2, a2, str.length());
            if (m30562b(str2, a2, b) != -1) {
                if (str.regionMatches(true, a2, "https:", 0, 6)) {
                    this.f26099a = "https";
                    a2 += 6;
                } else if (!str.regionMatches(true, a2, "http:", 0, 5)) {
                    return C10472a.UNSUPPORTED_SCHEME;
                } else {
                    this.f26099a = "http";
                    a2 += 5;
                }
            } else if (fVar2 == null) {
                return C10472a.MISSING_SCHEME;
            } else {
                this.f26099a = fVar2.f26090a;
            }
            int c = m30563c(str2, a2, b);
            char c2 = '?';
            char c3 = '#';
            if (c >= 2 || fVar2 == null || !fVar2.f26090a.equals(this.f26099a)) {
                int i2 = a2 + c;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a = C10466i.m30522a(str2, i2, b, "@/\\?#");
                    char charAt = a != b ? str2.charAt(a) : 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int i3 = a;
                        int d = m30565d(str2, i2, i3);
                        int i4 = d + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int a3 = C10466i.m30521a(str2, i2, a, ':');
                                int i5 = a3;
                                String str3 = "%40";
                                i = a;
                                String a4 = C10470f.m30542a(str, i2, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z2) {
                                    a4 = this.f26100b + str3 + a4;
                                }
                                this.f26100b = a4;
                                if (i5 != i) {
                                    this.f26101c = C10470f.m30542a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = a;
                                this.f26101c += "%40" + C10470f.m30542a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i2 = i + 1;
                        }
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int i32 = a;
                int d2 = m30565d(str2, i2, i32);
                int i42 = d2 + 1;
                if (i42 < i32) {
                    this.f26102d = m30566e(str2, i2, d2);
                    int f = m30568f(str2, i42, i32);
                    this.f26103e = f;
                    if (f == -1) {
                        return C10472a.INVALID_PORT;
                    }
                } else {
                    this.f26102d = m30566e(str2, i2, d2);
                    this.f26103e = C10470f.m30541a(this.f26099a);
                }
                if (this.f26102d == null) {
                    return C10472a.INVALID_HOST;
                }
                a2 = i32;
            } else {
                this.f26100b = fVar.mo63949b();
                this.f26101c = fVar.mo63950c();
                this.f26102d = fVar2.f26091b;
                this.f26103e = fVar2.f26092c;
                this.f26104f.clear();
                this.f26104f.addAll(fVar.mo63951d());
                if (a2 == b || str2.charAt(a2) == '#') {
                    mo63963d(fVar.mo63952e());
                }
            }
            int a5 = C10466i.m30522a(str2, a2, b, "?#");
            m30560a(str2, a2, a5);
            if (a5 < b && str2.charAt(a5) == '?') {
                int a6 = C10466i.m30521a(str2, a5, b, '#');
                this.f26105g = C10470f.m30551b(C10470f.m30542a(str, a5 + 1, a6, " \"'<>#", true, false, true, true, (Charset) null));
                a5 = a6;
            }
            if (a5 < b && str2.charAt(a5) == '#') {
                this.f26106h = C10470f.m30542a(str, 1 + a5, b, "", true, false, false, false, (Charset) null);
            }
            return C10472a.SUCCESS;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: a */
        private void m30560a(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f26104f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f26104f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f26104f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = com.bytedance.sdk.component.p307b.p308a.p311b.C10466i.m30522a((java.lang.String) r11, (int) r6, (int) r13, (java.lang.String) r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m30561a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p307b.p308a.C10470f.C10471a.m30560a(java.lang.String, int, int):void");
        }

        /* renamed from: a */
        private void m30561a(String str, int i, int i2, boolean z, boolean z2) {
            String a = C10470f.m30542a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, (Charset) null);
            if (!m30567e(a)) {
                if (m30569f(a)) {
                    m30564c();
                    return;
                }
                List<String> list = this.f26104f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f26104f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f26104f.add(a);
                }
                if (z) {
                    this.f26104f.add("");
                }
            }
        }

        /* renamed from: e */
        private boolean m30567e(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: f */
        private boolean m30569f(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: c */
        private void m30564c() {
            List<String> list = this.f26104f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f26104f.isEmpty()) {
                this.f26104f.add("");
                return;
            }
            List<String> list2 = this.f26104f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: b */
        private static int m30562b(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: c */
        private static int m30563c(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: d */
        private static int m30565d(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: e */
        private static String m30566e(String str, int i, int i2) {
            return C10466i.m30523a(C10470f.m30543a(str, i, i2, false));
        }

        /* renamed from: f */
        private static int m30568f(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C10470f.m30542a(str, i, i2, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: a */
    static String m30545a(String str, boolean z) {
        return m30543a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private List<String> m30546a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m30545a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static String m30543a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C10458a aVar = new C10458a();
                aVar.mo63905a(str, i, i3);
                m30548a(aVar, str, i3, i2, z);
                return aVar.mo63916c();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m30548a(C10458a aVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int a = C10466i.m30519a(str.charAt(i + 1));
                int a2 = C10466i.m30519a(str.charAt(i3));
                if (!(a == -1 || a2 == -1)) {
                    aVar.mo63912b((a << 4) + a2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                aVar.mo63912b(32);
                i += Character.charCount(codePointAt);
            }
            aVar.mo63903a(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static boolean m30550a(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C10466i.m30519a(str.charAt(i + 1)) == -1 || C10466i.m30519a(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static String m30542a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m30550a(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            C10458a aVar = new C10458a();
            int i5 = i;
            aVar.mo63905a(str, i, i4);
            m30547a(aVar, str, i4, i2, str2, z, z2, z3, z4, charset);
            return aVar.mo63916c();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m30547a(C10458a aVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C10458a aVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    aVar.mo63904a(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m30550a(str, i, i2)))))) {
                    if (aVar2 == null) {
                        aVar2 = new C10458a();
                    }
                    if (charset == null || charset.equals(C10466i.f26087a)) {
                        aVar2.mo63903a(codePointAt);
                    } else {
                        aVar2.mo63906a(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!aVar2.mo63909a()) {
                        byte b = aVar2.mo63911b() & 255;
                        aVar.mo63912b(37);
                        aVar.mo63912b((int) f26089d[(b >> 4) & 15]);
                        aVar.mo63912b((int) f26089d[b & Ascii.f15551SI]);
                    }
                } else {
                    aVar.mo63903a(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static String m30544a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m30542a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }
}
