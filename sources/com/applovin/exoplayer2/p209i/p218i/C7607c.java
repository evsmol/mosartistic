package com.applovin.exoplayer2.p209i.p218i;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7734f;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;
import com.appnext.banners.BannerAdRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.exoplayer2.i.i.c */
final class C7607c {

    /* renamed from: a */
    private static final Pattern f17744a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: b */
    private static final Pattern f17745b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: c */
    private final C7772y f17746c = new C7772y();

    /* renamed from: d */
    private final StringBuilder f17747d = new StringBuilder();

    /* renamed from: a */
    private static char m21602a(C7772y yVar, int i) {
        return (char) yVar.mo55077d()[i];
    }

    /* renamed from: a */
    static String m21603a(C7772y yVar, StringBuilder sb) {
        m21608b(yVar);
        if (yVar.mo55064a() == 0) {
            return null;
        }
        String d = m21612d(yVar, sb);
        if (!"".equals(d)) {
            return d;
        }
        return "" + ((char) yVar.mo55084h());
    }

    /* renamed from: a */
    private void m21604a(C7608d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f17744a.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.mo54774c((String) C7717a.m22120b(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] a = C7728ai.m22225a(str, "\\.");
            String str2 = a[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.mo54770b(str2.substring(0, indexOf2));
                dVar.mo54766a(str2.substring(indexOf2 + 1));
            } else {
                dVar.mo54770b(str2);
            }
            if (a.length > 1) {
                dVar.mo54767a((String[]) C7728ai.m22222a((T[]) a, 1, a.length));
            }
        }
    }

    /* renamed from: a */
    private static void m21605a(C7772y yVar, C7608d dVar, StringBuilder sb) {
        m21608b(yVar);
        String d = m21612d(yVar, sb);
        if (!"".equals(d) && ":".equals(m21603a(yVar, sb))) {
            m21608b(yVar);
            String c = m21609c(yVar, sb);
            if (c != null && !"".equals(c)) {
                int c2 = yVar.mo55074c();
                String a = m21603a(yVar, sb);
                if (!";".equals(a)) {
                    if ("}".equals(a)) {
                        yVar.mo55076d(c2);
                    } else {
                        return;
                    }
                }
                if ("color".equals(d)) {
                    dVar.mo54764a(C7734f.m22289b(c));
                } else if ("background-color".equals(d)) {
                    dVar.mo54768b(C7734f.m22289b(c));
                } else {
                    boolean z = true;
                    if ("ruby-position".equals(d)) {
                        if ("over".equals(c)) {
                            dVar.mo54776d(1);
                        } else if ("under".equals(c)) {
                            dVar.mo54776d(2);
                        }
                    } else if ("text-combine-upright".equals(d)) {
                        if (!BannerAdRequest.TYPE_ALL.equals(c) && !c.startsWith("digits")) {
                            z = false;
                        }
                        dVar.mo54778d(z);
                    } else if ("text-decoration".equals(d)) {
                        if ("underline".equals(c)) {
                            dVar.mo54765a(true);
                        }
                    } else if ("font-family".equals(d)) {
                        dVar.mo54777d(c);
                    } else if ("font-weight".equals(d)) {
                        if ("bold".equals(c)) {
                            dVar.mo54769b(true);
                        }
                    } else if ("font-style".equals(d)) {
                        if ("italic".equals(c)) {
                            dVar.mo54773c(true);
                        }
                    } else if ("font-size".equals(d)) {
                        m21606a(c, dVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m21606a(String str, C7608d dVar) {
        Matcher matcher = f17745b.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            C7755q.m22361c("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        int i = 2;
        String str2 = (String) C7717a.m22120b(matcher.group(2));
        char c = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != 37) {
            if (hashCode != 3240) {
                if (hashCode == 3592 && str2.equals("px")) {
                    c = 0;
                }
            } else if (str2.equals("em")) {
                c = 1;
            }
        } else if (str2.equals("%")) {
            c = 2;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    i = 3;
                } else {
                    throw new IllegalStateException();
                }
            }
            dVar.mo54772c(i);
        } else {
            dVar.mo54772c(1);
        }
        dVar.mo54763a(Float.parseFloat((String) C7717a.m22120b(matcher.group(1))));
    }

    /* renamed from: b */
    private static String m21607b(C7772y yVar, StringBuilder sb) {
        m21608b(yVar);
        if (yVar.mo55064a() < 5 || !"::cue".equals(yVar.mo55081f(5))) {
            return null;
        }
        int c = yVar.mo55074c();
        String a = m21603a(yVar, sb);
        if (a == null) {
            return null;
        }
        if ("{".equals(a)) {
            yVar.mo55076d(c);
            return "";
        }
        String d = "(".equals(a) ? m21611d(yVar) : null;
        if (!")".equals(m21603a(yVar, sb))) {
            return null;
        }
        return d;
    }

    /* renamed from: b */
    static void m21608b(C7772y yVar) {
        while (true) {
            boolean z = true;
            while (yVar.mo55064a() > 0 && z) {
                if (!m21613e(yVar) && !m21614f(yVar)) {
                    z = false;
                }
            }
            return;
        }
    }

    /* renamed from: c */
    private static String m21609c(C7772y yVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int c = yVar.mo55074c();
            String a = m21603a(yVar, sb);
            if (a == null) {
                return null;
            }
            if ("}".equals(a) || ";".equals(a)) {
                yVar.mo55076d(c);
                z = true;
            } else {
                sb2.append(a);
            }
        }
        return sb2.toString();
    }

    /* renamed from: c */
    static void m21610c(C7772y yVar) {
        do {
        } while (!TextUtils.isEmpty(yVar.mo55062C()));
    }

    /* renamed from: d */
    private static String m21611d(C7772y yVar) {
        int c = yVar.mo55074c();
        int b = yVar.mo55072b();
        boolean z = false;
        while (c < b && !z) {
            int i = c + 1;
            z = ((char) yVar.mo55077d()[c]) == ')';
            c = i;
        }
        return yVar.mo55081f((c - 1) - yVar.mo55074c()).trim();
    }

    /* renamed from: d */
    private static String m21612d(C7772y yVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int c = yVar.mo55074c();
        int b = yVar.mo55072b();
        while (c < b && !z) {
            char c2 = (char) yVar.mo55077d()[c];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                c++;
                sb.append(c2);
            }
        }
        yVar.mo55079e(c - yVar.mo55074c());
        return sb.toString();
    }

    /* renamed from: e */
    private static boolean m21613e(C7772y yVar) {
        char a = m21602a(yVar, yVar.mo55074c());
        if (a != 9 && a != 10 && a != 12 && a != 13 && a != ' ') {
            return false;
        }
        yVar.mo55079e(1);
        return true;
    }

    /* renamed from: f */
    private static boolean m21614f(C7772y yVar) {
        int c = yVar.mo55074c();
        int b = yVar.mo55072b();
        byte[] d = yVar.mo55077d();
        if (c + 2 > b) {
            return false;
        }
        int i = c + 1;
        if (d[c] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (d[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= b) {
                yVar.mo55079e(b - yVar.mo55074c());
                return true;
            } else if (((char) d[i2]) == '*' && ((char) d[i3]) == '/') {
                i2 = i3 + 1;
                b = i2;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: a */
    public List<C7608d> mo54760a(C7772y yVar) {
        this.f17747d.setLength(0);
        int c = yVar.mo55074c();
        m21610c(yVar);
        this.f17746c.mo55070a(yVar.mo55077d(), yVar.mo55074c());
        this.f17746c.mo55076d(c);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String b = m21607b(this.f17746c, this.f17747d);
            if (b == null || !"{".equals(m21603a(this.f17746c, this.f17747d))) {
                return arrayList;
            }
            C7608d dVar = new C7608d();
            m21604a(dVar, b);
            String str = null;
            boolean z = false;
            while (!z) {
                int c2 = this.f17746c.mo55074c();
                String a = m21603a(this.f17746c, this.f17747d);
                boolean z2 = a == null || "}".equals(a);
                if (!z2) {
                    this.f17746c.mo55076d(c2);
                    m21605a(this.f17746c, dVar, this.f17747d);
                }
                str = a;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
