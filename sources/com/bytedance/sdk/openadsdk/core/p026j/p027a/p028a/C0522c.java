package com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p026j.C0518a;
import com.bytedance.sdk.openadsdk.core.p026j.C0526b;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c;
import com.bytedance.sdk.openadsdk.core.p026j.p030c.C0545d;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a.a.c */
/* compiled from: LinearParser */
public class C0522c {
    /* renamed from: a */
    public static void m2510a(XmlPullParser xmlPullParser, C0518a aVar, int i, double d) throws IOException, XmlPullParserException {
        boolean z = false;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("Linear")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if (z && TextUtils.isEmpty(aVar.mo1742g())) {
                    C0523d.m2517a(xmlPullParser);
                }
                String name = xmlPullParser.getName();
                char c = 65535;
                switch (name.hashCode()) {
                    case -2049897434:
                        if (name.equals("VideoClicks")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1927368268:
                        if (name.equals("Duration")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -385055469:
                        if (name.equals("MediaFiles")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 70476538:
                        if (name.equals("Icons")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 611554000:
                        if (name.equals("TrackingEvents")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    aVar.mo1727a(m2512b(xmlPullParser));
                } else if (c == 1) {
                    m2511a(xmlPullParser, aVar.mo1726a());
                } else if (c == 2) {
                    m2509a(xmlPullParser, aVar);
                } else if (c == 3) {
                    String a = m2508a(xmlPullParser, i, d);
                    if (!TextUtils.isEmpty(a)) {
                        aVar.mo1737d(a);
                    }
                    z = true;
                } else if (c != 4) {
                    C0523d.m2517a(xmlPullParser);
                } else {
                    C0526b a2 = m2507a(xmlPullParser);
                    if (a2 != null && aVar.mo1732b() == null) {
                        aVar.mo1729a(a2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static String m2508a(XmlPullParser xmlPullParser, int i, double d) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        double d2 = Double.NEGATIVE_INFINITY;
        String str = null;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                return str;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String attributeValue = xmlPullParser.getAttributeValue(C0523d.f1969f, "type");
                int b = C0523d.m2519b(xmlPullParser.getAttributeValue(C0523d.f1969f, IabUtils.KEY_WIDTH));
                int b2 = C0523d.m2519b(xmlPullParser.getAttributeValue(C0523d.f1969f, IabUtils.KEY_HEIGHT));
                int b3 = C0523d.m2519b(xmlPullParser.getAttributeValue(C0523d.f1969f, "bitrate"));
                String b4 = C0523d.m2521b(xmlPullParser, "MediaFile");
                if (b > 0 && b2 > 0 && C0545d.f2031a.contains(attributeValue) && !TextUtils.isEmpty(b4)) {
                    double a = C0545d.m2579a(i, d, b, b2, b3, attributeValue);
                    if (a > d2) {
                        str = b4;
                        d2 = a;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.sdk.openadsdk.core.p026j.C0526b m2507a(org.xmlpull.v1.XmlPullParser r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r23
            r2 = 0
        L_0x0003:
            int r3 = r23.getEventType()
            java.lang.String r4 = "Icons"
            r5 = 3
            if (r3 != r5) goto L_0x0018
            java.lang.String r3 = r23.getName()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            return r2
        L_0x0018:
            r23.next()
            int r3 = r23.getEventType()
            r6 = 2
            if (r3 == r6) goto L_0x0024
            goto L_0x0208
        L_0x0024:
            java.lang.String r3 = r23.getName()
            java.lang.String r7 = "Icon"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0208
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.f1969f
            java.lang.String r8 = "width"
            java.lang.String r3 = r0.getAttributeValue(r3, r8)
            int r9 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2519b(r3)
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.f1969f
            java.lang.String r8 = "height"
            java.lang.String r3 = r0.getAttributeValue(r3, r8)
            int r10 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2519b(r3)
            if (r9 <= 0) goto L_0x0202
            r3 = 300(0x12c, float:4.2E-43)
            if (r9 > r3) goto L_0x0202
            if (r10 <= 0) goto L_0x0202
            if (r10 <= r3) goto L_0x0054
            goto L_0x0202
        L_0x0054:
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.f1969f
            java.lang.String r8 = "offset"
            java.lang.String r3 = r0.getAttributeValue(r3, r8)
            int r3 = com.bytedance.sdk.openadsdk.core.p026j.p029b.C0527a.m2533a((java.lang.String) r3)
            java.lang.String r8 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.f1969f
            java.lang.String r11 = "duration"
            java.lang.String r8 = r0.getAttributeValue(r8, r11)
            int r8 = com.bytedance.sdk.openadsdk.core.p026j.p029b.C0527a.m2533a((java.lang.String) r8)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r11 = 0
            r20 = 0
        L_0x0079:
            int r12 = r23.next()
            if (r12 != r5) goto L_0x00b7
            java.lang.String r12 = r23.getName()
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x008a
            goto L_0x00b7
        L_0x008a:
            if (r11 == 0) goto L_0x0003
            java.lang.String r6 = r11.f1970a
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0003
            com.bytedance.sdk.openadsdk.core.j.b r2 = new com.bytedance.sdk.openadsdk.core.j.b
            long r6 = (long) r3
            r16 = r6
            long r5 = (long) r8
            com.bytedance.sdk.openadsdk.core.j.c.a$a r3 = r11.f1971b
            com.bytedance.sdk.openadsdk.core.j.c.a$b r7 = r11.f1972c
            java.lang.String r14 = r11.f1970a
            r8 = r2
            r11 = r16
            r19 = r13
            r17 = r14
            r13 = r5
            r5 = r15
            r15 = r3
            r16 = r7
            r18 = r5
            r8.<init>(r9, r10, r11, r13, r15, r16, r17, r18, r19, r20)
            r3 = 3
            com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2518a(r0, r4, r3)
            goto L_0x0003
        L_0x00b7:
            r19 = r13
            r5 = r15
            int r12 = r23.getEventType()
            if (r12 == r6) goto L_0x00c5
            r15 = r5
            r13 = r19
            r5 = 3
            goto L_0x0079
        L_0x00c5:
            java.lang.String r12 = r23.getName()
            int r14 = r12.hashCode()
            java.lang.String r15 = "HTMLResource"
            java.lang.String r1 = "IconClicks"
            java.lang.String r13 = "StaticResource"
            java.lang.String r6 = "IFrameResource"
            r21 = r2
            java.lang.String r2 = "IconViewTracking"
            r22 = r3
            r3 = 1
            switch(r14) {
                case -1044238411: goto L_0x0100;
                case -375340334: goto L_0x00f8;
                case 676623548: goto L_0x00f0;
                case 1030746596: goto L_0x00e8;
                case 1928285401: goto L_0x00e0;
                default: goto L_0x00df;
            }
        L_0x00df:
            goto L_0x0108
        L_0x00e0:
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto L_0x0108
            r12 = 0
            goto L_0x0109
        L_0x00e8:
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0108
            r12 = 3
            goto L_0x0109
        L_0x00f0:
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0108
            r12 = 2
            goto L_0x0109
        L_0x00f8:
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x0108
            r12 = 1
            goto L_0x0109
        L_0x0100:
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0108
            r12 = 4
            goto L_0x0109
        L_0x0108:
            r12 = -1
        L_0x0109:
            if (r12 == 0) goto L_0x01da
            if (r12 == r3) goto L_0x01c2
            r3 = 2
            if (r12 == r3) goto L_0x017d
            r3 = 3
            if (r12 == r3) goto L_0x0130
            r3 = 4
            if (r12 == r3) goto L_0x011c
            com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2517a(r23)
            r2 = r19
            goto L_0x012e
        L_0x011c:
            com.bytedance.sdk.openadsdk.core.j.b.c$a r1 = new com.bytedance.sdk.openadsdk.core.j.b.c$a
            java.lang.String r2 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2521b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r2)
            r1.<init>(r2)
            com.bytedance.sdk.openadsdk.core.j.b.c r1 = r1.mo1771a()
            r2 = r19
            r2.add(r1)
        L_0x012e:
            r12 = 3
            goto L_0x0144
        L_0x0130:
            r2 = r19
        L_0x0132:
            int r3 = r23.next()
            r12 = 3
            if (r3 != r12) goto L_0x0147
            java.lang.String r3 = r23.getName()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0144
            goto L_0x0147
        L_0x0144:
            r14 = 2
            goto L_0x01f8
        L_0x0147:
            int r3 = r23.getEventType()
            r14 = 2
            if (r3 == r14) goto L_0x014f
            goto L_0x0132
        L_0x014f:
            java.lang.String r3 = r23.getName()
            java.lang.String r6 = "IconClickThrough"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0160
            java.lang.String r20 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2521b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r6)
            goto L_0x0132
        L_0x0160:
            java.lang.String r3 = r23.getName()
            java.lang.String r6 = "IconClickTracking"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0132
            com.bytedance.sdk.openadsdk.core.j.b.c$a r3 = new com.bytedance.sdk.openadsdk.core.j.b.c$a
            java.lang.String r6 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2521b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r6)
            r3.<init>(r6)
            com.bytedance.sdk.openadsdk.core.j.b.c r3 = r3.mo1771a()
            r5.add(r3)
            goto L_0x0132
        L_0x017d:
            r2 = r19
            r12 = 3
            r14 = 2
            com.bytedance.sdk.openadsdk.core.j.c.a$a r1 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0541a.NONE
            java.lang.String r1 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.f1969f
            java.lang.String r3 = "creativeType"
            java.lang.String r1 = r0.getAttributeValue(r1, r3)
            java.lang.String r1 = r1.toLowerCase()
            java.util.Set<java.lang.String> r3 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.f2014a
            boolean r3 = r3.contains(r1)
            if (r3 != 0) goto L_0x01a2
            java.util.Set<java.lang.String> r3 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.f2015b
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            r3 = 0
            goto L_0x01a6
        L_0x01a2:
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2521b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r13)
        L_0x01a6:
            java.util.Set<java.lang.String> r6 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.f2014a
            boolean r1 = r6.contains(r1)
            if (r1 == 0) goto L_0x01b1
            com.bytedance.sdk.openadsdk.core.j.c.a$a r1 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0541a.IMAGE
            goto L_0x01b3
        L_0x01b1:
            com.bytedance.sdk.openadsdk.core.j.c.a$a r1 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0541a.JAVASCRIPT
        L_0x01b3:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x01f8
            com.bytedance.sdk.openadsdk.core.j.a.a.d$a r6 = new com.bytedance.sdk.openadsdk.core.j.a.a.d$a
            com.bytedance.sdk.openadsdk.core.j.c.a$b r11 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0542b.STATIC_RESOURCE
            r6.<init>(r3, r1, r11)
            r11 = r6
            goto L_0x01f8
        L_0x01c2:
            r2 = r19
            r12 = 3
            r14 = 2
            if (r11 == 0) goto L_0x01cc
            com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2517a(r23)
            goto L_0x01f8
        L_0x01cc:
            com.bytedance.sdk.openadsdk.core.j.a.a.d$a r1 = new com.bytedance.sdk.openadsdk.core.j.a.a.d$a
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2521b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r6)
            com.bytedance.sdk.openadsdk.core.j.c.a$a r6 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0541a.NONE
            com.bytedance.sdk.openadsdk.core.j.c.a$b r11 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0542b.IFRAME_RESOURCE
            r1.<init>(r3, r6, r11)
            goto L_0x01f7
        L_0x01da:
            r2 = r19
            r12 = 3
            r14 = 2
            if (r11 == 0) goto L_0x01ea
            com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = r11.f1972c
            com.bytedance.sdk.openadsdk.core.j.c.a$b r3 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0542b.IFRAME_RESOURCE
            if (r1 == r3) goto L_0x01ea
            com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2517a(r23)
            goto L_0x01f8
        L_0x01ea:
            com.bytedance.sdk.openadsdk.core.j.a.a.d$a r1 = new com.bytedance.sdk.openadsdk.core.j.a.a.d$a
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2521b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r15)
            com.bytedance.sdk.openadsdk.core.j.c.a$a r6 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0541a.NONE
            com.bytedance.sdk.openadsdk.core.j.c.a$b r11 = com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a.C0542b.HTML_RESOURCE
            r1.<init>(r3, r6, r11)
        L_0x01f7:
            r11 = r1
        L_0x01f8:
            r13 = r2
            r15 = r5
            r2 = r21
            r3 = r22
            r5 = 3
            r6 = 2
            goto L_0x0079
        L_0x0202:
            r21 = r2
            com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2517a(r23)
            goto L_0x020a
        L_0x0208:
            r21 = r2
        L_0x020a:
            r2 = r21
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0522c.m2507a(org.xmlpull.v1.XmlPullParser):com.bytedance.sdk.openadsdk.core.j.b");
    }

    /* renamed from: b */
    public static double m2512b(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String[] split = C0523d.m2521b(xmlPullParser, "Duration").split(":");
        if (split.length != 3) {
            return 0.0d;
        }
        try {
            return (double) (((float) ((Integer.parseInt(split[0].trim()) * 60 * 60) + (Integer.parseInt(split[1].trim()) * 60))) + Float.parseFloat(split[2].trim()));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
        if (r0.equals("midpoint") != false) goto L_0x00c4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2511a(org.xmlpull.v1.XmlPullParser r7, com.bytedance.sdk.openadsdk.core.p026j.C0546d r8) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
        L_0x0000:
            int r0 = r7.next()
            r1 = 3
            if (r0 != r1) goto L_0x0015
            java.lang.String r0 = r7.getName()
            java.lang.String r2 = "TrackingEvents"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            return
        L_0x0015:
            int r0 = r7.getEventType()
            r2 = 2
            if (r0 == r2) goto L_0x001d
            goto L_0x0000
        L_0x001d:
            java.lang.String r0 = r7.getName()
            java.lang.String r3 = "Tracking"
            boolean r0 = r3.equals(r0)
            r4 = 4
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.f1969f
            java.lang.String r5 = "event"
            java.lang.String r0 = r7.getAttributeValue(r0, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x003c
            com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2518a(r7, r3, r1)
            goto L_0x0000
        L_0x003c:
            r5 = -1
            int r6 = r0.hashCode()
            switch(r6) {
                case -1638835128: goto L_0x00ba;
                case -1337830390: goto L_0x00b0;
                case -934426579: goto L_0x00a5;
                case -840405966: goto L_0x009a;
                case -599445191: goto L_0x0090;
                case 3363353: goto L_0x0085;
                case 3532159: goto L_0x007b;
                case 94756344: goto L_0x0071;
                case 106440182: goto L_0x0066;
                case 109757538: goto L_0x005c;
                case 560220243: goto L_0x0051;
                case 1778167540: goto L_0x0046;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x00c3
        L_0x0046:
            java.lang.String r1 = "creativeView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r1 = 0
            goto L_0x00c4
        L_0x0051:
            java.lang.String r1 = "firstQuartile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r1 = 2
            goto L_0x00c4
        L_0x005c:
            java.lang.String r1 = "start"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r1 = 1
            goto L_0x00c4
        L_0x0066:
            java.lang.String r1 = "pause"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r1 = 8
            goto L_0x00c4
        L_0x0071:
            java.lang.String r1 = "close"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r1 = 6
            goto L_0x00c4
        L_0x007b:
            java.lang.String r1 = "skip"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r1 = 7
            goto L_0x00c4
        L_0x0085:
            java.lang.String r1 = "mute"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r1 = 10
            goto L_0x00c4
        L_0x0090:
            java.lang.String r1 = "complete"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r1 = 5
            goto L_0x00c4
        L_0x009a:
            java.lang.String r1 = "unmute"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r1 = 11
            goto L_0x00c4
        L_0x00a5:
            java.lang.String r1 = "resume"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r1 = 9
            goto L_0x00c4
        L_0x00b0:
            java.lang.String r1 = "thirdQuartile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r1 = 4
            goto L_0x00c4
        L_0x00ba:
            java.lang.String r2 = "midpoint"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r1 = -1
        L_0x00c4:
            switch(r1) {
                case 0: goto L_0x0129;
                case 1: goto L_0x0129;
                case 2: goto L_0x011e;
                case 3: goto L_0x0113;
                case 4: goto L_0x0108;
                case 5: goto L_0x00ff;
                case 6: goto L_0x00f6;
                case 7: goto L_0x00ed;
                case 8: goto L_0x00e4;
                case 9: goto L_0x00db;
                case 10: goto L_0x00d2;
                case 11: goto L_0x00c9;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            goto L_0x0000
        L_0x00c9:
            java.util.List r0 = m2513c(r7)
            r8.mo1813l(r0)
            goto L_0x0000
        L_0x00d2:
            java.util.List r0 = m2513c(r7)
            r8.mo1812k(r0)
            goto L_0x0000
        L_0x00db:
            java.util.List r0 = m2513c(r7)
            r8.mo1798c((java.util.List<com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c>) r0)
            goto L_0x0000
        L_0x00e4:
            java.util.List r0 = m2513c(r7)
            r8.mo1796b((java.util.List<com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c>) r0)
            goto L_0x0000
        L_0x00ed:
            java.util.List r0 = m2513c(r7)
            r8.mo1804f((java.util.List<com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c>) r0)
            goto L_0x0000
        L_0x00f6:
            java.util.List r0 = m2513c(r7)
            r8.mo1802e((java.util.List<com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c>) r0)
            goto L_0x0000
        L_0x00ff:
            java.util.List r0 = m2513c(r7)
            r8.mo1800d((java.util.List<com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c>) r0)
            goto L_0x0000
        L_0x0108:
            java.lang.String r0 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2521b((org.xmlpull.v1.XmlPullParser) r7, (java.lang.String) r3)
            r1 = 1061158912(0x3f400000, float:0.75)
            r8.mo1791a((java.lang.String) r0, (float) r1)
            goto L_0x0000
        L_0x0113:
            java.lang.String r0 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2521b((org.xmlpull.v1.XmlPullParser) r7, (java.lang.String) r3)
            r1 = 1056964608(0x3f000000, float:0.5)
            r8.mo1791a((java.lang.String) r0, (float) r1)
            goto L_0x0000
        L_0x011e:
            java.lang.String r0 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2521b((org.xmlpull.v1.XmlPullParser) r7, (java.lang.String) r3)
            r1 = 1048576000(0x3e800000, float:0.25)
            r8.mo1791a((java.lang.String) r0, (float) r1)
            goto L_0x0000
        L_0x0129:
            java.lang.String r0 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2521b((org.xmlpull.v1.XmlPullParser) r7, (java.lang.String) r3)
            r1 = 0
            r8.mo1792a((java.lang.String) r0, (long) r1)
            goto L_0x0000
        L_0x0134:
            int r0 = r7.getEventType()
            if (r0 != r4) goto L_0x013f
            r7.nextTag()
            goto L_0x0000
        L_0x013f:
            com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2517a(r7)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0522c.m2511a(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.j.d):void");
    }

    /* renamed from: a */
    private static void m2509a(XmlPullParser xmlPullParser, C0518a aVar) throws IOException, XmlPullParserException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                int hashCode = name.hashCode();
                if (hashCode != -617879491) {
                    if (hashCode == 2107600959 && name.equals("ClickTracking")) {
                        c = 1;
                    }
                } else if (name.equals("ClickThrough")) {
                    c = 0;
                }
                if (c == 0) {
                    aVar.mo1735c(C0523d.m2521b(xmlPullParser, "ClickThrough"));
                } else if (c != 1) {
                    C0523d.m2517a(xmlPullParser);
                } else {
                    aVar.mo1726a().mo1806g(C0523d.m2516a(xmlPullParser, "ClickTracking"));
                }
            }
        }
    }

    /* renamed from: c */
    private static List<C0532c> m2513c(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return C0523d.m2516a(xmlPullParser, "Tracking");
    }
}
