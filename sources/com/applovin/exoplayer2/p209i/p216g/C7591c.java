package com.applovin.exoplayer2.p209i.p216g;

import com.applovin.exoplayer2.p209i.C7572d;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p209i.C7600h;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7729aj;
import com.applovin.exoplayer2.p221l.C7755q;
import com.appnext.base.p264b.C8849c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.applovin.exoplayer2.i.g.c */
public final class C7591c extends C7572d {

    /* renamed from: a */
    static final Pattern f17668a = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: b */
    static final Pattern f17669b = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: c */
    private static final Pattern f17670c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: d */
    private static final Pattern f17671d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: e */
    private static final Pattern f17672e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: f */
    private static final Pattern f17673f = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: g */
    private static final Pattern f17674g = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: h */
    private static final C7593b f17675h = new C7593b(30.0f, 1, 1);

    /* renamed from: i */
    private static final C7592a f17676i = new C7592a(32, 15);

    /* renamed from: j */
    private final XmlPullParserFactory f17677j;

    /* renamed from: com.applovin.exoplayer2.i.g.c$a */
    private static final class C7592a {

        /* renamed from: a */
        final int f17678a;

        /* renamed from: b */
        final int f17679b;

        C7592a(int i, int i2) {
            this.f17678a = i;
            this.f17679b = i2;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.g.c$b */
    private static final class C7593b {

        /* renamed from: a */
        final float f17680a;

        /* renamed from: b */
        final int f17681b;

        /* renamed from: c */
        final int f17682c;

        C7593b(float f, int i, int i2) {
            this.f17680a = f;
            this.f17681b = i;
            this.f17682c = i2;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.g.c$c */
    private static final class C7594c {

        /* renamed from: a */
        final int f17683a;

        /* renamed from: b */
        final int f17684b;

        C7594c(int i, int i2) {
            this.f17683a = i;
            this.f17684b = i2;
        }
    }

    public C7591c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f17677j = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00da, code lost:
        if (r14.equals("s") != false) goto L_0x0106;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0123  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m21502a(java.lang.String r14, com.applovin.exoplayer2.p209i.p216g.C7591c.C7593b r15) throws com.applovin.exoplayer2.p209i.C7600h {
        /*
            java.util.regex.Pattern r0 = f17670c
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0088
            java.lang.String r14 = r0.group(r8)
            java.lang.Object r14 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r14)
            java.lang.String r14 = (java.lang.String) r14
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            double r8 = (double) r8
            java.lang.String r14 = r0.group(r7)
            java.lang.Object r14 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r14)
            java.lang.String r14 = (java.lang.String) r14
            long r10 = java.lang.Long.parseLong(r14)
            r12 = 60
            long r10 = r10 * r12
            double r10 = (double) r10
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r6)
            java.lang.Object r14 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r14)
            java.lang.String r14 = (java.lang.String) r14
            long r6 = java.lang.Long.parseLong(r14)
            double r6 = (double) r6
            double r8 = r8 + r6
            java.lang.String r14 = r0.group(r5)
            r5 = 0
            if (r14 == 0) goto L_0x005a
            double r10 = java.lang.Double.parseDouble(r14)
            goto L_0x005b
        L_0x005a:
            r10 = r5
        L_0x005b:
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r4)
            if (r14 == 0) goto L_0x006c
            long r10 = java.lang.Long.parseLong(r14)
            float r14 = (float) r10
            float r1 = r15.f17680a
            float r14 = r14 / r1
            double r10 = (double) r14
            goto L_0x006d
        L_0x006c:
            r10 = r5
        L_0x006d:
            double r8 = r8 + r10
            r14 = 6
            java.lang.String r14 = r0.group(r14)
            if (r14 == 0) goto L_0x0083
            long r0 = java.lang.Long.parseLong(r14)
            double r0 = (double) r0
            int r14 = r15.f17681b
            double r4 = (double) r14
            double r0 = r0 / r4
            float r14 = r15.f17680a
            double r14 = (double) r14
            double r5 = r0 / r14
        L_0x0083:
            double r8 = r8 + r5
            double r8 = r8 * r2
            long r14 = (long) r8
            return r14
        L_0x0088:
            java.util.regex.Pattern r0 = f17671d
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x012e
            java.lang.String r14 = r0.group(r8)
            java.lang.Object r14 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r14)
            java.lang.String r14 = (java.lang.String) r14
            double r9 = java.lang.Double.parseDouble(r14)
            java.lang.String r14 = r0.group(r7)
            java.lang.Object r14 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r14)
            java.lang.String r14 = (java.lang.String) r14
            r0 = -1
            int r1 = r14.hashCode()
            r11 = 102(0x66, float:1.43E-43)
            if (r1 == r11) goto L_0x00fb
            r11 = 104(0x68, float:1.46E-43)
            if (r1 == r11) goto L_0x00f1
            r11 = 109(0x6d, float:1.53E-43)
            if (r1 == r11) goto L_0x00e7
            r11 = 3494(0xda6, float:4.896E-42)
            if (r1 == r11) goto L_0x00dd
            r11 = 115(0x73, float:1.61E-43)
            if (r1 == r11) goto L_0x00d4
            r7 = 116(0x74, float:1.63E-43)
            if (r1 == r7) goto L_0x00ca
            goto L_0x0105
        L_0x00ca:
            java.lang.String r1 = "t"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0105
            r7 = 5
            goto L_0x0106
        L_0x00d4:
            java.lang.String r1 = "s"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0105
            goto L_0x0106
        L_0x00dd:
            java.lang.String r1 = "ms"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0105
            r7 = 3
            goto L_0x0106
        L_0x00e7:
            java.lang.String r1 = "m"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0105
            r7 = 1
            goto L_0x0106
        L_0x00f1:
            java.lang.String r1 = "h"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0105
            r7 = 0
            goto L_0x0106
        L_0x00fb:
            java.lang.String r1 = "f"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0105
            r7 = 4
            goto L_0x0106
        L_0x0105:
            r7 = -1
        L_0x0106:
            if (r7 == 0) goto L_0x0123
            if (r7 == r8) goto L_0x0120
            if (r7 == r6) goto L_0x0119
            if (r7 == r5) goto L_0x0115
            if (r7 == r4) goto L_0x0111
            goto L_0x012a
        L_0x0111:
            int r14 = r15.f17682c
            double r14 = (double) r14
            goto L_0x011e
        L_0x0115:
            float r14 = r15.f17680a
            double r14 = (double) r14
            goto L_0x011e
        L_0x0119:
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x011e:
            double r9 = r9 / r14
            goto L_0x012a
        L_0x0120:
            r14 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0128
        L_0x0123:
            r14 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0128:
            double r9 = r9 * r14
        L_0x012a:
            double r9 = r9 * r2
            long r14 = (long) r9
            return r14
        L_0x012e:
            com.applovin.exoplayer2.i.h r15 = new com.applovin.exoplayer2.i.h
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>((java.lang.String) r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p216g.C7591c.m21502a(java.lang.String, com.applovin.exoplayer2.i.g.c$b):long");
    }

    /* renamed from: a */
    private static C7592a m21503a(XmlPullParser xmlPullParser, C7592a aVar) throws C7600h {
        StringBuilder sb;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f17674g.matcher(attributeValue);
        if (!matcher.matches()) {
            sb = new StringBuilder();
        } else {
            try {
                int parseInt = Integer.parseInt((String) C7717a.m22120b(matcher.group(1)));
                int parseInt2 = Integer.parseInt((String) C7717a.m22120b(matcher.group(2)));
                if (parseInt != 0 && parseInt2 != 0) {
                    return new C7592a(parseInt, parseInt2);
                }
                throw new C7600h("Invalid cell resolution " + parseInt + " " + parseInt2);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        }
        sb.append("Ignoring malformed cell resolution: ");
        sb.append(attributeValue);
        C7755q.m22361c("TtmlDecoder", sb.toString());
        return aVar;
    }

    /* renamed from: a */
    private static C7593b m21504a(XmlPullParser xmlPullParser) throws C7600h {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] a = C7728ai.m22225a(attributeValue2, " ");
            if (a.length == 2) {
                f = ((float) Integer.parseInt(a[0])) / ((float) Integer.parseInt(a[1]));
            } else {
                throw new C7600h("frameRateMultiplier doesn't have 2 parts");
            }
        }
        int i = f17675h.f17681b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = f17675h.f17682c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new C7593b(((float) parseInt) * f, i, i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.p209i.p216g.C7595d m21505a(org.xmlpull.v1.XmlPullParser r19, com.applovin.exoplayer2.p209i.p216g.C7595d r20, java.util.Map<java.lang.String, com.applovin.exoplayer2.p209i.p216g.C7596e> r21, com.applovin.exoplayer2.p209i.p216g.C7591c.C7593b r22) throws com.applovin.exoplayer2.p209i.C7600h {
        /*
            r0 = r19
            r9 = r20
            r1 = r22
            int r2 = r19.getAttributeCount()
            r3 = 0
            com.applovin.exoplayer2.i.g.g r5 = m21508a((org.xmlpull.v1.XmlPullParser) r0, (com.applovin.exoplayer2.p209i.p216g.C7598g) r3)
            java.lang.String r8 = ""
            r11 = r3
            r10 = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r11
            r3 = 0
        L_0x0024:
            if (r3 >= r2) goto L_0x00c2
            java.lang.String r4 = r0.getAttributeName(r3)
            java.lang.String r6 = r0.getAttributeValue(r3)
            int r18 = r4.hashCode()
            switch(r18) {
                case -934795532: goto L_0x0068;
                case 99841: goto L_0x005e;
                case 100571: goto L_0x0054;
                case 93616297: goto L_0x004a;
                case 109780401: goto L_0x0040;
                case 1292595405: goto L_0x0036;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0072
        L_0x0036:
            java.lang.String r7 = "backgroundImage"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 5
            goto L_0x0073
        L_0x0040:
            java.lang.String r7 = "style"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 3
            goto L_0x0073
        L_0x004a:
            java.lang.String r7 = "begin"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 0
            goto L_0x0073
        L_0x0054:
            java.lang.String r7 = "end"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 1
            goto L_0x0073
        L_0x005e:
            java.lang.String r7 = "dur"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 2
            goto L_0x0073
        L_0x0068:
            java.lang.String r7 = "region"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 4
            goto L_0x0073
        L_0x0072:
            r7 = -1
        L_0x0073:
            if (r7 == 0) goto L_0x00b8
            r4 = 1
            if (r7 == r4) goto L_0x00b1
            r4 = 2
            if (r7 == r4) goto L_0x00aa
            r4 = 3
            if (r7 == r4) goto L_0x009f
            r4 = 4
            if (r7 == r4) goto L_0x0095
            r4 = 5
            if (r7 == r4) goto L_0x0085
            goto L_0x0092
        L_0x0085:
            java.lang.String r4 = "#"
            boolean r4 = r6.startsWith(r4)
            if (r4 == 0) goto L_0x0092
            r4 = 1
            java.lang.String r11 = r6.substring(r4)
        L_0x0092:
            r4 = r21
            goto L_0x00be
        L_0x0095:
            r4 = r21
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L_0x00be
            r10 = r6
            goto L_0x00be
        L_0x009f:
            r4 = r21
            java.lang.String[] r6 = m21512a((java.lang.String) r6)
            int r7 = r6.length
            if (r7 <= 0) goto L_0x00be
            r8 = r6
            goto L_0x00be
        L_0x00aa:
            r4 = r21
            long r16 = m21502a((java.lang.String) r6, (com.applovin.exoplayer2.p209i.p216g.C7591c.C7593b) r1)
            goto L_0x00be
        L_0x00b1:
            r4 = r21
            long r14 = m21502a((java.lang.String) r6, (com.applovin.exoplayer2.p209i.p216g.C7591c.C7593b) r1)
            goto L_0x00be
        L_0x00b8:
            r4 = r21
            long r12 = m21502a((java.lang.String) r6, (com.applovin.exoplayer2.p209i.p216g.C7591c.C7593b) r1)
        L_0x00be:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x00c2:
            if (r9 == 0) goto L_0x00de
            long r1 = r9.f17688d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00e3
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00d6
            long r1 = r9.f17688d
            long r12 = r12 + r1
        L_0x00d6:
            int r1 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00e3
            long r1 = r9.f17688d
            long r14 = r14 + r1
            goto L_0x00e3
        L_0x00de:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e3:
            r1 = r12
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x00fc
            int r6 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00f1
            long r16 = r1 + r16
            r3 = r16
            goto L_0x00fd
        L_0x00f1:
            if (r9 == 0) goto L_0x00fc
            long r6 = r9.f17689e
            int r12 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x00fc
            long r3 = r9.f17689e
            goto L_0x00fd
        L_0x00fc:
            r3 = r14
        L_0x00fd:
            java.lang.String r0 = r19.getName()
            r6 = r8
            r7 = r10
            r8 = r11
            r9 = r20
            com.applovin.exoplayer2.i.g.d r0 = com.applovin.exoplayer2.p209i.p216g.C7595d.m21520a(r0, r1, r3, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p216g.C7591c.m21505a(org.xmlpull.v1.XmlPullParser, com.applovin.exoplayer2.i.g.d, java.util.Map, com.applovin.exoplayer2.i.g.c$b):com.applovin.exoplayer2.i.g.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a8, code lost:
        if (r2 != 2) goto L_0x01ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.p209i.p216g.C7596e m21506a(org.xmlpull.v1.XmlPullParser r17, com.applovin.exoplayer2.p209i.p216g.C7591c.C7592a r18, com.applovin.exoplayer2.p209i.p216g.C7591c.C7594c r19) {
        /*
            r0 = r17
            r1 = r19
            java.lang.String r2 = "id"
            java.lang.String r4 = com.applovin.exoplayer2.p221l.C7729aj.m22269c(r0, r2)
            r2 = 0
            if (r4 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r3 = "origin"
            java.lang.String r3 = com.applovin.exoplayer2.p221l.C7729aj.m22269c(r0, r3)
            java.lang.String r5 = "TtmlDecoder"
            if (r3 == 0) goto L_0x01e2
            java.util.regex.Pattern r6 = f17669b
            java.util.regex.Matcher r6 = r6.matcher(r3)
            java.util.regex.Pattern r7 = f17673f
            java.util.regex.Matcher r7 = r7.matcher(r3)
            boolean r8 = r6.matches()
            java.lang.String r9 = "Ignoring region with malformed origin: "
            java.lang.String r10 = "Ignoring region with missing tts:extent: "
            r11 = 1120403456(0x42c80000, float:100.0)
            r12 = 2
            r13 = 1
            if (r8 == 0) goto L_0x0069
            java.lang.String r7 = r6.group(r13)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r7 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r7)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0056 }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x0056 }
            float r7 = r7 / r11
            java.lang.String r6 = r6.group(r12)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r6 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r6)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x0056 }
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x0056 }
            float r6 = r6 / r11
            r16 = r7
            r7 = r6
            r6 = r16
            goto L_0x00a0
        L_0x0056:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x005b:
            r0.append(r9)
        L_0x005e:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L_0x0065:
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r5, r0)
            return r2
        L_0x0069:
            boolean r6 = r7.matches()
            if (r6 == 0) goto L_0x01da
            if (r1 != 0) goto L_0x007a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0076:
            r0.append(r10)
            goto L_0x005e
        L_0x007a:
            java.lang.String r6 = r7.group(r13)     // Catch:{ NumberFormatException -> 0x01d3 }
            java.lang.Object r6 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r6)     // Catch:{ NumberFormatException -> 0x01d3 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x01d3 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x01d3 }
            java.lang.String r7 = r7.group(r12)     // Catch:{ NumberFormatException -> 0x01d3 }
            java.lang.Object r7 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r7)     // Catch:{ NumberFormatException -> 0x01d3 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x01d3 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x01d3 }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x01d3 }
            int r8 = r1.f17683a     // Catch:{ NumberFormatException -> 0x01d3 }
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x01d3 }
            float r6 = r6 / r8
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x01d3 }
            int r8 = r1.f17684b     // Catch:{ NumberFormatException -> 0x01d3 }
            float r8 = (float) r8
            float r7 = r7 / r8
        L_0x00a0:
            java.lang.String r8 = "extent"
            java.lang.String r8 = com.applovin.exoplayer2.p221l.C7729aj.m22269c(r0, r8)
            if (r8 == 0) goto L_0x01cf
            java.util.regex.Pattern r9 = f17669b
            java.util.regex.Matcher r9 = r9.matcher(r8)
            java.util.regex.Pattern r14 = f17673f
            java.util.regex.Matcher r8 = r14.matcher(r8)
            boolean r14 = r9.matches()
            java.lang.String r15 = "Ignoring region with malformed extent: "
            if (r14 == 0) goto L_0x00e7
            java.lang.String r1 = r9.group(r13)     // Catch:{ NumberFormatException -> 0x00dd }
            java.lang.Object r1 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r1)     // Catch:{ NumberFormatException -> 0x00dd }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x00dd }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x00dd }
            float r1 = r1 / r11
            java.lang.String r8 = r9.group(r12)     // Catch:{ NumberFormatException -> 0x00dd }
            java.lang.Object r8 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r8)     // Catch:{ NumberFormatException -> 0x00dd }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x00dd }
            float r2 = java.lang.Float.parseFloat(r8)     // Catch:{ NumberFormatException -> 0x00dd }
            float r2 = r2 / r11
            r9 = r1
            r10 = r2
            goto L_0x011c
        L_0x00dd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x00e2:
            r0.append(r15)
            goto L_0x005e
        L_0x00e7:
            boolean r9 = r8.matches()
            if (r9 == 0) goto L_0x01c3
            if (r1 != 0) goto L_0x00f5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x0076
        L_0x00f5:
            java.lang.String r9 = r8.group(r13)     // Catch:{ NumberFormatException -> 0x01bc }
            java.lang.Object r9 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r9)     // Catch:{ NumberFormatException -> 0x01bc }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01bc }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01bc }
            java.lang.String r8 = r8.group(r12)     // Catch:{ NumberFormatException -> 0x01bc }
            java.lang.Object r8 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r8)     // Catch:{ NumberFormatException -> 0x01bc }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x01bc }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01bc }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01bc }
            int r10 = r1.f17683a     // Catch:{ NumberFormatException -> 0x01bc }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01bc }
            float r9 = r9 / r10
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x01bc }
            int r1 = r1.f17684b     // Catch:{ NumberFormatException -> 0x01bc }
            float r1 = (float) r1
            float r8 = r8 / r1
            r10 = r8
        L_0x011c:
            java.lang.String r1 = "displayAlign"
            java.lang.String r1 = com.applovin.exoplayer2.p221l.C7729aj.m22269c(r0, r1)
            r2 = -1
            r3 = 0
            if (r1 == 0) goto L_0x015d
            java.lang.String r1 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r1)
            int r5 = r1.hashCode()
            r8 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r5 == r8) goto L_0x0143
            r8 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r5 == r8) goto L_0x0139
            goto L_0x014d
        L_0x0139:
            java.lang.String r5 = "after"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x014d
            r1 = 1
            goto L_0x014e
        L_0x0143:
            java.lang.String r5 = "center"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x014d
            r1 = 0
            goto L_0x014e
        L_0x014d:
            r1 = -1
        L_0x014e:
            if (r1 == 0) goto L_0x0156
            if (r1 == r13) goto L_0x0153
            goto L_0x015d
        L_0x0153:
            float r7 = r7 + r10
            r8 = 2
            goto L_0x015e
        L_0x0156:
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r10 / r1
            float r7 = r7 + r1
            r8 = 1
            goto L_0x015e
        L_0x015d:
            r8 = 0
        L_0x015e:
            r1 = 1065353216(0x3f800000, float:1.0)
            r5 = r18
            int r5 = r5.f17679b
            float r5 = (float) r5
            float r1 = r1 / r5
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r11 = "writingMode"
            java.lang.String r0 = com.applovin.exoplayer2.p221l.C7729aj.m22269c(r0, r11)
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r0)
            int r11 = r0.hashCode()
            r14 = 3694(0xe6e, float:5.176E-42)
            if (r11 == r14) goto L_0x019b
            r3 = 3553396(0x363874, float:4.979368E-39)
            if (r11 == r3) goto L_0x0191
            r3 = 3553576(0x363928, float:4.97962E-39)
            if (r11 == r3) goto L_0x0187
            goto L_0x01a4
        L_0x0187:
            java.lang.String r3 = "tbrl"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x01a4
            r2 = 2
            goto L_0x01a4
        L_0x0191:
            java.lang.String r3 = "tblr"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x01a4
            r2 = 1
            goto L_0x01a4
        L_0x019b:
            java.lang.String r11 = "tb"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x01a4
            r2 = 0
        L_0x01a4:
            if (r2 == 0) goto L_0x01ab
            if (r2 == r13) goto L_0x01ab
            if (r2 == r12) goto L_0x01af
            goto L_0x01ad
        L_0x01ab:
            r13 = 2
            goto L_0x01af
        L_0x01ad:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x01af:
            com.applovin.exoplayer2.i.g.e r0 = new com.applovin.exoplayer2.i.g.e
            r2 = 0
            r11 = 1
            r3 = r0
            r5 = r6
            r6 = r7
            r7 = r2
            r12 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x01bc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x00e2
        L_0x01c3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported extent: "
        L_0x01ca:
            r0.append(r1)
            goto L_0x005e
        L_0x01cf:
            java.lang.String r0 = "Ignoring region without an extent"
            goto L_0x0065
        L_0x01d3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x005b
        L_0x01da:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported origin: "
            goto L_0x01ca
        L_0x01e2:
            java.lang.String r0 = "Ignoring region without an origin"
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p216g.C7591c.m21506a(org.xmlpull.v1.XmlPullParser, com.applovin.exoplayer2.i.g.c$a, com.applovin.exoplayer2.i.g.c$c):com.applovin.exoplayer2.i.g.e");
    }

    /* renamed from: a */
    private static C7598g m21507a(C7598g gVar) {
        return gVar == null ? new C7598g() : gVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.p209i.p216g.C7598g m21508a(org.xmlpull.v1.XmlPullParser r12, com.applovin.exoplayer2.p209i.p216g.C7598g r13) {
        /*
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x02e8
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            int r5 = r4.hashCode()
            r6 = 5
            r7 = 4
            r8 = -1
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r5) {
                case -1550943582: goto L_0x00b7;
                case -1224696685: goto L_0x00ad;
                case -1065511464: goto L_0x00a3;
                case -879295043: goto L_0x0098;
                case -734428249: goto L_0x008e;
                case 3355: goto L_0x0084;
                case 3511770: goto L_0x0079;
                case 94842723: goto L_0x006f;
                case 109403361: goto L_0x0064;
                case 110138194: goto L_0x0059;
                case 365601008: goto L_0x004e;
                case 921125321: goto L_0x0042;
                case 1115953443: goto L_0x0036;
                case 1287124693: goto L_0x002b;
                case 1754920356: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00c1
        L_0x001f:
            java.lang.String r5 = "multiRowAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 8
            goto L_0x00c2
        L_0x002b:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 1
            goto L_0x00c2
        L_0x0036:
            java.lang.String r5 = "rubyPosition"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 11
            goto L_0x00c2
        L_0x0042:
            java.lang.String r5 = "textEmphasis"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 13
            goto L_0x00c2
        L_0x004e:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 4
            goto L_0x00c2
        L_0x0059:
            java.lang.String r5 = "textCombine"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 9
            goto L_0x00c2
        L_0x0064:
            java.lang.String r5 = "shear"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 14
            goto L_0x00c2
        L_0x006f:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 2
            goto L_0x00c2
        L_0x0079:
            java.lang.String r5 = "ruby"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 10
            goto L_0x00c2
        L_0x0084:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 0
            goto L_0x00c2
        L_0x008e:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 5
            goto L_0x00c2
        L_0x0098:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 12
            goto L_0x00c2
        L_0x00a3:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 7
            goto L_0x00c2
        L_0x00ad:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 3
            goto L_0x00c2
        L_0x00b7:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 6
            goto L_0x00c2
        L_0x00c1:
            r4 = -1
        L_0x00c2:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x02d0;
                case 1: goto L_0x02bc;
                case 2: goto L_0x02a8;
                case 3: goto L_0x029f;
                case 4: goto L_0x0282;
                case 5: goto L_0x0273;
                case 6: goto L_0x0263;
                case 7: goto L_0x0255;
                case 8: goto L_0x0247;
                case 9: goto L_0x0207;
                case 10: goto L_0x018a;
                case 11: goto L_0x014a;
                case 12: goto L_0x00e5;
                case 13: goto L_0x00d7;
                case 14: goto L_0x00c9;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            goto L_0x02e4
        L_0x00c9:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            float r3 = m21516d(r3)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54721a((float) r3)
            goto L_0x02e4
        L_0x00d7:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.b r3 = com.applovin.exoplayer2.p209i.p216g.C7590b.m21501a((java.lang.String) r3)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54724a((com.applovin.exoplayer2.p209i.p216g.C7590b) r3)
            goto L_0x02e4
        L_0x00e5:
            java.lang.String r3 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x010f;
                case -1026963764: goto L_0x0105;
                case 913457136: goto L_0x00fb;
                case 1679736913: goto L_0x00f1;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x0118
        L_0x00f1:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0118
            r8 = 0
            goto L_0x0118
        L_0x00fb:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0118
            r8 = 1
            goto L_0x0118
        L_0x0105:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0118
            r8 = 2
            goto L_0x0118
        L_0x010f:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0118
            r8 = 3
        L_0x0118:
            if (r8 == 0) goto L_0x0140
            if (r8 == r11) goto L_0x0136
            if (r8 == r10) goto L_0x012c
            if (r8 == r9) goto L_0x0122
            goto L_0x02e4
        L_0x0122:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54732b((boolean) r1)
            goto L_0x02e4
        L_0x012c:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54732b((boolean) r11)
            goto L_0x02e4
        L_0x0136:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54727a((boolean) r1)
            goto L_0x02e4
        L_0x0140:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54727a((boolean) r11)
            goto L_0x02e4
        L_0x014a:
            java.lang.String r3 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r3)
            int r4 = r3.hashCode()
            r5 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r4 == r5) goto L_0x0167
            r5 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r4 == r5) goto L_0x015d
            goto L_0x0170
        L_0x015d:
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0170
            r8 = 1
            goto L_0x0170
        L_0x0167:
            java.lang.String r4 = "before"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0170
            r8 = 0
        L_0x0170:
            if (r8 == 0) goto L_0x0180
            if (r8 == r11) goto L_0x0176
            goto L_0x02e4
        L_0x0176:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54737d((int) r10)
            goto L_0x02e4
        L_0x0180:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54737d((int) r11)
            goto L_0x02e4
        L_0x018a:
            java.lang.String r3 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -618561360: goto L_0x01c8;
                case -410956671: goto L_0x01be;
                case -250518009: goto L_0x01b4;
                case -136074796: goto L_0x01aa;
                case 3016401: goto L_0x01a0;
                case 3556653: goto L_0x0196;
                default: goto L_0x0195;
            }
        L_0x0195:
            goto L_0x01d1
        L_0x0196:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d1
            r8 = 3
            goto L_0x01d1
        L_0x01a0:
            java.lang.String r4 = "base"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d1
            r8 = 1
            goto L_0x01d1
        L_0x01aa:
            java.lang.String r4 = "textContainer"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d1
            r8 = 4
            goto L_0x01d1
        L_0x01b4:
            java.lang.String r4 = "delimiter"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d1
            r8 = 5
            goto L_0x01d1
        L_0x01be:
            java.lang.String r4 = "container"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d1
            r8 = 0
            goto L_0x01d1
        L_0x01c8:
            java.lang.String r4 = "baseContainer"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d1
            r8 = 2
        L_0x01d1:
            if (r8 == 0) goto L_0x01fd
            if (r8 == r11) goto L_0x01f3
            if (r8 == r10) goto L_0x01f3
            if (r8 == r9) goto L_0x01e9
            if (r8 == r7) goto L_0x01e9
            if (r8 == r6) goto L_0x01df
            goto L_0x02e4
        L_0x01df:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54734c((int) r7)
            goto L_0x02e4
        L_0x01e9:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54734c((int) r9)
            goto L_0x02e4
        L_0x01f3:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54734c((int) r10)
            goto L_0x02e4
        L_0x01fd:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54734c((int) r11)
            goto L_0x02e4
        L_0x0207:
            java.lang.String r3 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r3)
            int r4 = r3.hashCode()
            r5 = 96673(0x179a1, float:1.35468E-40)
            if (r4 == r5) goto L_0x0224
            r5 = 3387192(0x33af38, float:4.746467E-39)
            if (r4 == r5) goto L_0x021a
            goto L_0x022d
        L_0x021a:
            java.lang.String r4 = "none"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x022d
            r8 = 0
            goto L_0x022d
        L_0x0224:
            java.lang.String r4 = "all"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x022d
            r8 = 1
        L_0x022d:
            if (r8 == 0) goto L_0x023d
            if (r8 == r11) goto L_0x0233
            goto L_0x02e4
        L_0x0233:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54742e((boolean) r11)
            goto L_0x02e4
        L_0x023d:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54742e((boolean) r1)
            goto L_0x02e4
        L_0x0247:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            android.text.Layout$Alignment r3 = m21513b((java.lang.String) r3)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54730b((android.text.Layout.Alignment) r3)
            goto L_0x02e4
        L_0x0255:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            android.text.Layout$Alignment r3 = m21513b((java.lang.String) r3)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54723a((android.text.Layout.Alignment) r3)
            goto L_0x02e4
        L_0x0263:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54738d((boolean) r3)
            goto L_0x02e4
        L_0x0273:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54735c((boolean) r3)
            goto L_0x02e4
        L_0x0282:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)     // Catch:{ h -> 0x028a }
            m21510a((java.lang.String) r3, (com.applovin.exoplayer2.p209i.p216g.C7598g) r13)     // Catch:{ h -> 0x028a }
            goto L_0x02e4
        L_0x028a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
        L_0x0291:
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r5, r3)
            goto L_0x02e4
        L_0x029f:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54726a((java.lang.String) r3)
            goto L_0x02e4
        L_0x02a8:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            int r4 = com.applovin.exoplayer2.p221l.C7734f.m22287a(r3)     // Catch:{ IllegalArgumentException -> 0x02b4 }
            r13.mo54722a((int) r4)     // Catch:{ IllegalArgumentException -> 0x02b4 }
            goto L_0x02e4
        L_0x02b4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            goto L_0x0291
        L_0x02bc:
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            int r4 = com.applovin.exoplayer2.p221l.C7734f.m22287a(r3)     // Catch:{ IllegalArgumentException -> 0x02c8 }
            r13.mo54729b((int) r4)     // Catch:{ IllegalArgumentException -> 0x02c8 }
            goto L_0x02e4
        L_0x02c8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            goto L_0x0291
        L_0x02d0:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x02e4
            com.applovin.exoplayer2.i.g.g r13 = m21507a((com.applovin.exoplayer2.p209i.p216g.C7598g) r13)
            com.applovin.exoplayer2.i.g.g r13 = r13.mo54731b((java.lang.String) r3)
        L_0x02e4:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x02e8:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p216g.C7591c.m21508a(org.xmlpull.v1.XmlPullParser, com.applovin.exoplayer2.i.g.g):com.applovin.exoplayer2.i.g.g");
    }

    /* renamed from: a */
    private static Map<String, C7598g> m21509a(XmlPullParser xmlPullParser, Map<String, C7598g> map, C7592a aVar, C7594c cVar, Map<String, C7596e> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (C7729aj.m22268b(xmlPullParser, "style")) {
                String c = C7729aj.m22269c(xmlPullParser, "style");
                C7598g a = m21508a(xmlPullParser, new C7598g());
                if (c != null) {
                    for (String str : m21512a(c)) {
                        a.mo54725a(map.get(str));
                    }
                }
                String j = a.mo54747j();
                if (j != null) {
                    map.put(j, a);
                }
            } else if (C7729aj.m22268b(xmlPullParser, "region")) {
                C7596e a2 = m21506a(xmlPullParser, aVar, cVar);
                if (a2 != null) {
                    map2.put(a2.f17698a, a2);
                }
            } else if (C7729aj.m22268b(xmlPullParser, "metadata")) {
                m21511a(xmlPullParser, map3);
            }
        } while (!C7729aj.m22266a(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: a */
    private static void m21510a(String str, C7598g gVar) throws C7600h {
        Matcher matcher;
        String[] a = C7728ai.m22225a(str, "\\s+");
        if (a.length == 1) {
            matcher = f17672e.matcher(str);
        } else if (a.length == 2) {
            matcher = f17672e.matcher(a[1]);
            C7755q.m22361c("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new C7600h("Invalid number of entries for fontSize: " + a.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) C7717a.m22120b(matcher.group(3));
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
            if (c == 0) {
                gVar.mo54741e(1);
            } else if (c == 1) {
                gVar.mo54741e(2);
            } else if (c == 2) {
                gVar.mo54741e(3);
            } else {
                throw new C7600h("Invalid unit for fontSize: '" + str2 + "'.");
            }
            gVar.mo54728b(Float.parseFloat((String) C7717a.m22120b(matcher.group(1))));
            return;
        }
        throw new C7600h("Invalid expression for fontSize: '" + str + "'.");
    }

    /* renamed from: a */
    private static void m21511a(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String c;
        do {
            xmlPullParser.next();
            if (C7729aj.m22268b(xmlPullParser, "image") && (c = C7729aj.m22269c(xmlPullParser, "id")) != null) {
                map.put(c, xmlPullParser.nextText());
            }
        } while (!C7729aj.m22266a(xmlPullParser, "metadata"));
    }

    /* renamed from: a */
    private static String[] m21512a(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : C7728ai.m22225a(trim, "\\s+");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.Layout.Alignment m21513b(java.lang.String r5) {
        /*
            java.lang.String r5 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x0038;
                case 100571: goto L_0x002e;
                case 3317767: goto L_0x0024;
                case 108511772: goto L_0x001a;
                case 109757538: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0042
        L_0x0010:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 2
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 0
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 3
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 4
            goto L_0x0043
        L_0x0042:
            r5 = -1
        L_0x0043:
            if (r5 == 0) goto L_0x0055
            if (r5 == r4) goto L_0x0055
            if (r5 == r3) goto L_0x0052
            if (r5 == r2) goto L_0x0052
            if (r5 == r1) goto L_0x004f
            r5 = 0
            return r5
        L_0x004f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L_0x0052:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L_0x0055:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p216g.C7591c.m21513b(java.lang.String):android.text.Layout$Alignment");
    }

    /* renamed from: b */
    private static C7594c m21514b(XmlPullParser xmlPullParser) {
        StringBuilder sb;
        String str;
        String c = C7729aj.m22269c(xmlPullParser, "extent");
        if (c == null) {
            return null;
        }
        Matcher matcher = f17673f.matcher(c);
        if (!matcher.matches()) {
            sb = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        } else {
            try {
                return new C7594c(Integer.parseInt((String) C7717a.m22120b(matcher.group(1))), Integer.parseInt((String) C7717a.m22120b(matcher.group(2))));
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                str = "Ignoring malformed tts extent: ";
            }
        }
        sb.append(str);
        sb.append(c);
        C7755q.m22361c("TtmlDecoder", sb.toString());
        return null;
    }

    /* renamed from: c */
    private static boolean m21515c(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(C8849c.DATA) || str.equals("information");
    }

    /* renamed from: d */
    private static float m21516d(String str) {
        Matcher matcher = f17668a.matcher(str);
        if (!matcher.matches()) {
            C7755q.m22361c("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C7717a.m22120b(matcher.group(1)))));
        } catch (NumberFormatException e) {
            C7755q.m22359b("TtmlDecoder", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7585f mo54699a(byte[] bArr, int i, boolean z) throws C7600h {
        C7593b bVar;
        try {
            XmlPullParser newPullParser = this.f17677j.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C7596e(""));
            C7594c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C7593b bVar2 = f17675h;
            C7592a aVar = f17676i;
            C7599h hVar = null;
            int i2 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C7595d dVar = (C7595d) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = m21504a(newPullParser);
                            aVar = m21503a(newPullParser, f17676i);
                            cVar = m21514b(newPullParser);
                        }
                        C7594c cVar2 = cVar;
                        C7593b bVar3 = bVar2;
                        C7592a aVar2 = aVar;
                        if (!m21515c(name)) {
                            C7755q.m22358b("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i2++;
                            bVar2 = bVar3;
                        } else {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                m21509a(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    C7595d a = m21505a(newPullParser, dVar, hashMap2, bVar);
                                    arrayDeque.push(a);
                                    if (dVar != null) {
                                        dVar.mo54716a(a);
                                    }
                                } catch (C7600h e) {
                                    C7755q.m22359b("TtmlDecoder", "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            bVar2 = bVar;
                        }
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((C7595d) C7717a.m22120b(dVar)).mo54716a(C7595d.m21519a(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new C7599h((C7595d) C7717a.m22120b((C7595d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new C7600h("No TTML subtitles found");
        } catch (XmlPullParserException e2) {
            throw new C7600h("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }
}
