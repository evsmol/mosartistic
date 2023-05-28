package com.applovin.exoplayer2.p209i.p218i;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.p213d.C7575c;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.i.i.f */
public final class C7610f {

    /* renamed from: a */
    public static final Pattern f17768a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f17769b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map<String, Integer> f17770c;

    /* renamed from: d */
    private static final Map<String, Integer> f17771d;

    /* renamed from: com.applovin.exoplayer2.i.i.f$a */
    private static class C7612a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Comparator<C7612a> f17772a = $$Lambda$f$a$TCH4XBECFUwanThpebF9rnMO9g.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C7613b f17773b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f17774c;

        private C7612a(C7613b bVar, int i) {
            this.f17773b = bVar;
            this.f17774c = i;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.i.f$b */
    private static final class C7613b {

        /* renamed from: a */
        public final String f17775a;

        /* renamed from: b */
        public final int f17776b;

        /* renamed from: c */
        public final String f17777c;

        /* renamed from: d */
        public final Set<String> f17778d;

        private C7613b(String str, int i, String str2, Set<String> set) {
            this.f17776b = i;
            this.f17775a = str;
            this.f17777c = str2;
            this.f17778d = set;
        }

        /* renamed from: a */
        public static C7613b m21671a() {
            return new C7613b("", 0, "", Collections.emptySet());
        }

        /* renamed from: a */
        public static C7613b m21672a(String str, int i) {
            String str2;
            String trim = str.trim();
            C7717a.m22118a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] a = C7728ai.m22225a(trim, "\\.");
            String str3 = a[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < a.length; i2++) {
                hashSet.add(a[i2]);
            }
            return new C7613b(str3, i, str2, hashSet);
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.i.f$c */
    private static final class C7614c implements Comparable<C7614c> {

        /* renamed from: a */
        public final int f17779a;

        /* renamed from: b */
        public final C7608d f17780b;

        public C7614c(int i, C7608d dVar) {
            this.f17779a = i;
            this.f17780b = dVar;
        }

        /* renamed from: a */
        public int compareTo(C7614c cVar) {
            return Integer.compare(this.f17779a, cVar.f17779a);
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.i.f$d */
    private static final class C7615d {

        /* renamed from: a */
        public long f17781a = 0;

        /* renamed from: b */
        public long f17782b = 0;

        /* renamed from: c */
        public CharSequence f17783c;

        /* renamed from: d */
        public int f17784d = 2;

        /* renamed from: e */
        public float f17785e = -3.4028235E38f;

        /* renamed from: f */
        public int f17786f = 1;

        /* renamed from: g */
        public int f17787g = 0;

        /* renamed from: h */
        public float f17788h = -3.4028235E38f;

        /* renamed from: i */
        public int f17789i = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: j */
        public float f17790j = 1.0f;

        /* renamed from: k */
        public int f17791k = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: a */
        private static float m21674a(float f, int i) {
            int i2 = (f > -3.4028235E38f ? 1 : (f == -3.4028235E38f ? 0 : -1));
            if (i2 == 0 || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return i2 != 0 ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        /* renamed from: a */
        private static float m21675a(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* renamed from: a */
        private static float m21676a(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        /* renamed from: b */
        private static int m21677b(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        /* renamed from: c */
        private static Layout.Alignment m21678c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            C7755q.m22361c("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* renamed from: a */
        public C7609e mo54790a() {
            return new C7609e(mo54791b().mo54656e(), this.f17781a, this.f17782b);
        }

        /* renamed from: b */
        public C7540a.C7542a mo54791b() {
            float f = this.f17788h;
            if (f == -3.4028235E38f) {
                f = m21675a(this.f17784d);
            }
            int i = this.f17789i;
            if (i == Integer.MIN_VALUE) {
                i = m21677b(this.f17784d);
            }
            C7540a.C7542a d = new C7540a.C7542a().mo54642a(m21678c(this.f17784d)).mo54639a(m21674a(this.f17785e, this.f17786f), this.f17786f).mo54640a(this.f17787g).mo54638a(f).mo54648b(i).mo54646b(Math.min(this.f17790j, m21676a(i, f))).mo54655d(this.f17791k);
            CharSequence charSequence = this.f17783c;
            if (charSequence != null) {
                d.mo54643a(charSequence);
            }
            return d;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f17770c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f17771d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static int m21644a(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static int m21645a(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: a */
    private static int m21646a(List<C7608d> list, String str, C7613b bVar) {
        List<C7614c> b = m21659b(list, str, bVar);
        for (int i = 0; i < b.size(); i++) {
            C7608d dVar = b.get(i).f17780b;
            if (dVar.mo54786k() != -1) {
                return dVar.mo54786k();
            }
        }
        return -1;
    }

    /* renamed from: a */
    static SpannedString m21647a(String str, String str2, List<C7608d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m21655a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = m21645a(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    if (!substring.trim().isEmpty()) {
                        String g = m21666g(substring);
                        if (m21665f(g)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    C7613b bVar = (C7613b) arrayDeque.pop();
                                    m21656a(str, bVar, (List<C7612a>) arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new C7612a(bVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (bVar.f17775a.equals(g)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(C7613b.m21672a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m21656a(str, (C7613b) arrayDeque.pop(), (List<C7612a>) arrayList, spannableStringBuilder, list);
        }
        m21656a(str, C7613b.m21671a(), (List<C7612a>) Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: a */
    static C7540a.C7542a m21648a(String str) {
        C7615d dVar = new C7615d();
        m21657a(str, dVar);
        return dVar.mo54791b();
    }

    /* renamed from: a */
    static C7540a m21649a(CharSequence charSequence) {
        C7615d dVar = new C7615d();
        dVar.f17783c = charSequence;
        return dVar.mo54791b().mo54656e();
    }

    /* renamed from: a */
    public static C7609e m21650a(C7772y yVar, List<C7608d> list) {
        String C = yVar.mo55062C();
        if (C == null) {
            return null;
        }
        Matcher matcher = f17768a.matcher(C);
        if (matcher.matches()) {
            return m21651a((String) null, matcher, yVar, list);
        }
        String C2 = yVar.mo55062C();
        if (C2 == null) {
            return null;
        }
        Matcher matcher2 = f17768a.matcher(C2);
        if (matcher2.matches()) {
            return m21651a(C.trim(), matcher2, yVar, list);
        }
        return null;
    }

    /* renamed from: a */
    private static C7609e m21651a(String str, Matcher matcher, C7772y yVar, List<C7608d> list) {
        C7615d dVar = new C7615d();
        try {
            dVar.f17781a = C7617h.m21684a((String) C7717a.m22120b(matcher.group(1)));
            dVar.f17782b = C7617h.m21684a((String) C7717a.m22120b(matcher.group(2)));
            m21657a((String) C7717a.m22120b(matcher.group(3)), dVar);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String C = yVar.mo55062C();
                if (!TextUtils.isEmpty(C)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(C.trim());
                } else {
                    dVar.f17783c = m21647a(str, sb.toString(), list);
                    return dVar.mo54790a();
                }
            }
        } catch (NumberFormatException unused) {
            C7755q.m22361c("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21652a(android.text.SpannableStringBuilder r4, com.applovin.exoplayer2.p209i.p218i.C7608d r5, int r6, int r7) {
        /*
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.mo54761a()
            r1 = -1
            r2 = 33
            if (r0 == r1) goto L_0x0018
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            int r1 = r5.mo54761a()
            r0.<init>(r1)
            com.applovin.exoplayer2.p209i.p213d.C7576d.m21454a(r4, r0, r6, r7, r2)
        L_0x0018:
            boolean r0 = r5.mo54771b()
            if (r0 == 0) goto L_0x0026
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L_0x0026:
            boolean r0 = r5.mo54775c()
            if (r0 == 0) goto L_0x0034
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L_0x0034:
            boolean r0 = r5.mo54781f()
            if (r0 == 0) goto L_0x0046
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r1 = r5.mo54780e()
            r0.<init>(r1)
            com.applovin.exoplayer2.p209i.p213d.C7576d.m21454a(r4, r0, r6, r7, r2)
        L_0x0046:
            boolean r0 = r5.mo54783h()
            if (r0 == 0) goto L_0x0058
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r1 = r5.mo54782g()
            r0.<init>(r1)
            com.applovin.exoplayer2.p209i.p213d.C7576d.m21454a(r4, r0, r6, r7, r2)
        L_0x0058:
            java.lang.String r0 = r5.mo54779d()
            if (r0 == 0) goto L_0x006a
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            java.lang.String r1 = r5.mo54779d()
            r0.<init>(r1)
            com.applovin.exoplayer2.p209i.p213d.C7576d.m21454a(r4, r0, r6, r7, r2)
        L_0x006a:
            int r0 = r5.mo54784i()
            r1 = 1
            if (r0 == r1) goto L_0x008f
            r1 = 2
            if (r0 == r1) goto L_0x0085
            r1 = 3
            if (r0 == r1) goto L_0x0078
            goto L_0x009c
        L_0x0078:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.mo54785j()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            r0.<init>(r1)
            goto L_0x0099
        L_0x0085:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.mo54785j()
            r0.<init>(r1)
            goto L_0x0099
        L_0x008f:
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r3 = r5.mo54785j()
            int r3 = (int) r3
            r0.<init>(r3, r1)
        L_0x0099:
            com.applovin.exoplayer2.p209i.p213d.C7576d.m21454a(r4, r0, r6, r7, r2)
        L_0x009c:
            boolean r5 = r5.mo54787l()
            if (r5 == 0) goto L_0x00aa
            com.applovin.exoplayer2.i.d.a r5 = new com.applovin.exoplayer2.i.d.a
            r5.<init>()
            r4.setSpan(r5, r6, r7, r2)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p218i.C7610f.m21652a(android.text.SpannableStringBuilder, com.applovin.exoplayer2.i.i.d, int, int):void");
    }

    /* renamed from: a */
    private static void m21653a(SpannableStringBuilder spannableStringBuilder, String str, C7613b bVar, List<C7612a> list, List<C7608d> list2) {
        int a = m21646a(list2, str, bVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C7612a.f17772a);
        int i = bVar.f17776b;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if ("rt".equals(((C7612a) arrayList.get(i3)).f17773b.f17775a)) {
                C7612a aVar = (C7612a) arrayList.get(i3);
                int a2 = m21644a(m21646a(list2, str, aVar.f17773b), a, 1);
                int i4 = aVar.f17773b.f17776b - i2;
                int b = aVar.f17774c - i2;
                CharSequence subSequence = spannableStringBuilder.subSequence(i4, b);
                spannableStringBuilder.delete(i4, b);
                spannableStringBuilder.setSpan(new C7575c(subSequence.toString(), a2), i, i4, 33);
                i2 += subSequence.length();
                i = i4;
            }
        }
    }

    /* renamed from: a */
    private static void m21654a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        Object backgroundColorSpan;
        for (String next : set) {
            if (f17770c.containsKey(next)) {
                backgroundColorSpan = new ForegroundColorSpan(f17770c.get(next).intValue());
            } else if (f17771d.containsKey(next)) {
                backgroundColorSpan = new BackgroundColorSpan(f17771d.get(next).intValue());
            }
            spannableStringBuilder.setSpan(backgroundColorSpan, i, i2, 33);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21655a(java.lang.String r5, android.text.SpannableStringBuilder r6) {
        /*
            int r0 = r5.hashCode()
            r1 = 3309(0xced, float:4.637E-42)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0038
            r1 = 3464(0xd88, float:4.854E-42)
            if (r0 == r1) goto L_0x002e
            r1 = 96708(0x179c4, float:1.35517E-40)
            if (r0 == r1) goto L_0x0024
            r1 = 3374865(0x337f11, float:4.729193E-39)
            if (r0 == r1) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.String r0 = "nbsp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 2
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "amp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 3
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "lt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "gt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x0070
            if (r0 == r4) goto L_0x006d
            if (r0 == r3) goto L_0x006a
            if (r0 == r2) goto L_0x0067
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "ignoring unsupported entity: '&"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = ";'"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "WebvttCueParser"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r6, r5)
            goto L_0x0075
        L_0x0067:
            r5 = 38
            goto L_0x0072
        L_0x006a:
            r5 = 32
            goto L_0x0072
        L_0x006d:
            r5 = 62
            goto L_0x0072
        L_0x0070:
            r5 = 60
        L_0x0072:
            r6.append(r5)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p218i.C7610f.m21655a(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00af A[LOOP:0: B:51:0x00a9->B:53:0x00af, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21656a(java.lang.String r8, com.applovin.exoplayer2.p209i.p218i.C7610f.C7613b r9, java.util.List<com.applovin.exoplayer2.p209i.p218i.C7610f.C7612a> r10, android.text.SpannableStringBuilder r11, java.util.List<com.applovin.exoplayer2.p209i.p218i.C7608d> r12) {
        /*
            int r0 = r9.f17776b
            int r1 = r11.length()
            java.lang.String r2 = r9.f17775a
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0076
            r7 = 105(0x69, float:1.47E-43)
            if (r3 == r7) goto L_0x006c
            r7 = 3314158(0x3291ee, float:4.644125E-39)
            if (r3 == r7) goto L_0x0062
            r7 = 3511770(0x3595da, float:4.921038E-39)
            if (r3 == r7) goto L_0x0058
            r7 = 98
            if (r3 == r7) goto L_0x004e
            r7 = 99
            if (r3 == r7) goto L_0x0044
            r7 = 117(0x75, float:1.64E-43)
            if (r3 == r7) goto L_0x003a
            r7 = 118(0x76, float:1.65E-43)
            if (r3 == r7) goto L_0x0030
            goto L_0x0080
        L_0x0030:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 6
            goto L_0x0081
        L_0x003a:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 3
            goto L_0x0081
        L_0x0044:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 4
            goto L_0x0081
        L_0x004e:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 0
            goto L_0x0081
        L_0x0058:
            java.lang.String r3 = "ruby"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 2
            goto L_0x0081
        L_0x0062:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 5
            goto L_0x0081
        L_0x006c:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 1
            goto L_0x0081
        L_0x0076:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 7
            goto L_0x0081
        L_0x0080:
            r2 = -1
        L_0x0081:
            r3 = 33
            switch(r2) {
                case 0: goto L_0x009d;
                case 1: goto L_0x0097;
                case 2: goto L_0x0093;
                case 3: goto L_0x008d;
                case 4: goto L_0x0087;
                case 5: goto L_0x00a5;
                case 6: goto L_0x00a5;
                case 7: goto L_0x00a5;
                default: goto L_0x0086;
            }
        L_0x0086:
            return
        L_0x0087:
            java.util.Set<java.lang.String> r10 = r9.f17778d
            m21654a((android.text.SpannableStringBuilder) r11, (java.util.Set<java.lang.String>) r10, (int) r0, (int) r1)
            goto L_0x00a5
        L_0x008d:
            android.text.style.UnderlineSpan r10 = new android.text.style.UnderlineSpan
            r10.<init>()
            goto L_0x00a2
        L_0x0093:
            m21653a((android.text.SpannableStringBuilder) r11, (java.lang.String) r8, (com.applovin.exoplayer2.p209i.p218i.C7610f.C7613b) r9, (java.util.List<com.applovin.exoplayer2.p209i.p218i.C7610f.C7612a>) r10, (java.util.List<com.applovin.exoplayer2.p209i.p218i.C7608d>) r12)
            goto L_0x00a5
        L_0x0097:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r5)
            goto L_0x00a2
        L_0x009d:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r6)
        L_0x00a2:
            r11.setSpan(r10, r0, r1, r3)
        L_0x00a5:
            java.util.List r8 = m21659b(r12, r8, r9)
        L_0x00a9:
            int r9 = r8.size()
            if (r4 >= r9) goto L_0x00bd
            java.lang.Object r9 = r8.get(r4)
            com.applovin.exoplayer2.i.i.f$c r9 = (com.applovin.exoplayer2.p209i.p218i.C7610f.C7614c) r9
            com.applovin.exoplayer2.i.i.d r9 = r9.f17780b
            m21652a((android.text.SpannableStringBuilder) r11, (com.applovin.exoplayer2.p209i.p218i.C7608d) r9, (int) r0, (int) r1)
            int r4 = r4 + 1
            goto L_0x00a9
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p218i.C7610f.m21656a(java.lang.String, com.applovin.exoplayer2.i.i.f$b, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* renamed from: a */
    private static void m21657a(String str, C7615d dVar) {
        Matcher matcher = f17769b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C7717a.m22120b(matcher.group(1));
            String str3 = (String) C7717a.m22120b(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    m21660b(str3, dVar);
                } else if ("align".equals(str2)) {
                    dVar.f17784d = m21664e(str3);
                } else if ("position".equals(str2)) {
                    m21662c(str3, dVar);
                } else if ("size".equals(str2)) {
                    dVar.f17790j = C7617h.m21686b(str3);
                } else if ("vertical".equals(str2)) {
                    dVar.f17791k = m21663d(str3);
                } else {
                    C7755q.m22361c("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                C7755q.m22361c("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m21658b(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x002a;
                case -1074341483: goto L_0x0020;
                case 100571: goto L_0x0016;
                case 109757538: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0058
            if (r0 == r4) goto L_0x0057
            if (r0 == r3) goto L_0x0057
            if (r0 == r2) goto L_0x0056
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid anchor value: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r0, r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L_0x0056:
            return r3
        L_0x0057:
            return r4
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p218i.C7610f.m21658b(java.lang.String):int");
    }

    /* renamed from: b */
    private static List<C7614c> m21659b(List<C7608d> list, String str, C7613b bVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C7608d dVar = list.get(i);
            int a = dVar.mo54762a(str, bVar.f17775a, bVar.f17778d, bVar.f17777c);
            if (a > 0) {
                arrayList.add(new C7614c(a, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    private static void m21660b(String str, C7615d dVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            dVar.f17787g = m21658b(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            dVar.f17785e = C7617h.m21686b(str);
            dVar.f17786f = 0;
            return;
        }
        dVar.f17785e = (float) Integer.parseInt(str);
        dVar.f17786f = 1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m21661c(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 0
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1842484672: goto L_0x0040;
                case -1364013995: goto L_0x0036;
                case -1276788989: goto L_0x002c;
                case -1074341483: goto L_0x0022;
                case 100571: goto L_0x0018;
                case 109757538: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "start"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "end"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 5
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "middle"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 3
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "line-right"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 4
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "center"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 2
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "line-left"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 0
            goto L_0x004b
        L_0x004a:
            r0 = -1
        L_0x004b:
            if (r0 == 0) goto L_0x0072
            if (r0 == r6) goto L_0x0072
            if (r0 == r5) goto L_0x0071
            if (r0 == r4) goto L_0x0071
            if (r0 == r3) goto L_0x0070
            if (r0 == r2) goto L_0x0070
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid anchor value: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r0, r7)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            return r7
        L_0x0070:
            return r5
        L_0x0071:
            return r6
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p218i.C7610f.m21661c(java.lang.String):int");
    }

    /* renamed from: c */
    private static void m21662c(String str, C7615d dVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            dVar.f17789i = m21661c(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        dVar.f17788h = C7617h.m21686b(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m21663d(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 3462(0xd86, float:4.851E-42)
            r2 = 1
            if (r0 == r1) goto L_0x0018
            r1 = 3642(0xe3a, float:5.104E-42)
            if (r0 == r1) goto L_0x000e
            goto L_0x0022
        L_0x000e:
            java.lang.String r0 = "rl"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0022
            r0 = 0
            goto L_0x0023
        L_0x0018:
            java.lang.String r0 = "lr"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = -1
        L_0x0023:
            if (r0 == 0) goto L_0x0042
            if (r0 == r2) goto L_0x0040
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid 'vertical' value: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r0, r3)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            return r3
        L_0x0040:
            r3 = 2
            return r3
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p218i.C7610f.m21663d(java.lang.String):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m21664e(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            switch(r0) {
                case -1364013995: goto L_0x003f;
                case -1074341483: goto L_0x0035;
                case 100571: goto L_0x002b;
                case 3317767: goto L_0x0021;
                case 108511772: goto L_0x0017;
                case 109757538: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0049
        L_0x000d:
            java.lang.String r0 = "start"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            goto L_0x004a
        L_0x0017:
            java.lang.String r0 = "right"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 5
            goto L_0x004a
        L_0x0021:
            java.lang.String r0 = "left"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "end"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 4
            goto L_0x004a
        L_0x0035:
            java.lang.String r0 = "middle"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 3
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "center"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x004a
        L_0x0049:
            r0 = -1
        L_0x004a:
            if (r0 == 0) goto L_0x0071
            if (r0 == r4) goto L_0x0070
            if (r0 == r5) goto L_0x006f
            if (r0 == r3) goto L_0x006f
            if (r0 == r2) goto L_0x006e
            if (r0 == r1) goto L_0x006d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid alignment value: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r0, r6)
            return r5
        L_0x006d:
            return r1
        L_0x006e:
            return r3
        L_0x006f:
            return r5
        L_0x0070:
            return r2
        L_0x0071:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p218i.C7610f.m21664e(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007e A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21665f(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 98
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x006f
            r1 = 99
            if (r0 == r1) goto L_0x0065
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L_0x005b
            r1 = 3650(0xe42, float:5.115E-42)
            if (r0 == r1) goto L_0x0051
            r1 = 3314158(0x3291ee, float:4.644125E-39)
            if (r0 == r1) goto L_0x0047
            r1 = 3511770(0x3595da, float:4.921038E-39)
            if (r0 == r1) goto L_0x003d
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L_0x0033
            r1 = 118(0x76, float:1.65E-43)
            if (r0 == r1) goto L_0x0029
            goto L_0x0079
        L_0x0029:
            java.lang.String r0 = "v"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 7
            goto L_0x007a
        L_0x0033:
            java.lang.String r0 = "u"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 6
            goto L_0x007a
        L_0x003d:
            java.lang.String r0 = "ruby"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 4
            goto L_0x007a
        L_0x0047:
            java.lang.String r0 = "lang"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 3
            goto L_0x007a
        L_0x0051:
            java.lang.String r0 = "rt"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 5
            goto L_0x007a
        L_0x005b:
            java.lang.String r0 = "i"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 2
            goto L_0x007a
        L_0x0065:
            java.lang.String r0 = "c"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 1
            goto L_0x007a
        L_0x006f:
            java.lang.String r0 = "b"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 0
            goto L_0x007a
        L_0x0079:
            r4 = -1
        L_0x007a:
            switch(r4) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x007e;
                case 4: goto L_0x007e;
                case 5: goto L_0x007e;
                case 6: goto L_0x007e;
                case 7: goto L_0x007e;
                default: goto L_0x007d;
            }
        L_0x007d:
            return r2
        L_0x007e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p218i.C7610f.m21665f(java.lang.String):boolean");
    }

    /* renamed from: g */
    private static String m21666g(String str) {
        String trim = str.trim();
        C7717a.m22118a(!trim.isEmpty());
        return C7728ai.m22242b(trim, "[ \\.]")[0];
    }
}
