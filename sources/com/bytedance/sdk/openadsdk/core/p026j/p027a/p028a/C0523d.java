package com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.bytedance.sdk.openadsdk.core.p026j.C0518a;
import com.bytedance.sdk.openadsdk.core.p026j.p027a.C0519a;
import com.bytedance.sdk.openadsdk.core.p026j.p027a.C0525b;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c;
import com.bytedance.sdk.openadsdk.core.p026j.p030c.C0538a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a.a.d */
/* compiled from: VastXmlPullParser */
public class C0523d extends C0525b {

    /* renamed from: f */
    public static final String f1969f = null;

    public C0523d(Context context, int i, int i2) {
        super(context, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040 A[SYNTHETIC, Splitter:B:24:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048 A[SYNTHETIC, Splitter:B:31:0x0048] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.core.p026j.C0518a mo1748b(java.lang.String r6, java.util.List<com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "UTF-8"
            r1 = 0
            f1977e = r1
            android.content.Context r2 = r5.f1979b
            r3 = 0
            if (r2 != 0) goto L_0x000e
            r6 = -1
            f1977e = r6
            return r3
        L_0x000e:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L_0x0018
            r6 = -2
            f1977e = r6
            return r3
        L_0x0018:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            byte[] r6 = r6.getBytes(r0)     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            org.xmlpull.v1.XmlPullParser r6 = android.util.Xml.newPullParser()     // Catch:{ Exception -> 0x003b }
            java.lang.String r4 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r6.setFeature(r4, r1)     // Catch:{ Exception -> 0x003b }
            r6.setInput(r2, r0)     // Catch:{ Exception -> 0x003b }
            r6.nextTag()     // Catch:{ Exception -> 0x003b }
            com.bytedance.sdk.openadsdk.core.j.a r6 = r5.m2514a((org.xmlpull.v1.XmlPullParser) r6, (java.util.List<com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c>) r7)     // Catch:{ Exception -> 0x003b }
            r2.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            return r6
        L_0x0038:
            r6 = move-exception
            goto L_0x0046
        L_0x003a:
            r2 = r3
        L_0x003b:
            r6 = -3
            f1977e = r6     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0043
            r2.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            return r3
        L_0x0044:
            r6 = move-exception
            r3 = r2
        L_0x0046:
            if (r3 == 0) goto L_0x004b
            r3.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.mo1748b(java.lang.String, java.util.List):com.bytedance.sdk.openadsdk.core.j.a");
    }

    /* renamed from: a */
    private C0518a m2514a(XmlPullParser xmlPullParser, List<C0532c> list) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, f1969f, "VAST");
        boolean z = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (LogConstants.EVENT_ERROR.equals(name)) {
                    str = m2521b(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (mo1754a(xmlPullParser.getAttributeValue(f1969f, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            } else if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    C0518a a = C0521b.m2505a(this.f1979b, xmlPullParser, list, this.f1980c, this.f1981d);
                                    if (a != null) {
                                        if (!TextUtils.isEmpty(a.mo1742g())) {
                                            return a;
                                        }
                                        f1977e = -6;
                                        return null;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    C0518a b = m2520b(xmlPullParser, list);
                                    if (b != null) {
                                        return b;
                                    }
                                } else {
                                    m2517a(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        m2517a(xmlPullParser);
                    }
                    z = true;
                } else {
                    m2517a(xmlPullParser);
                }
            }
        }
        if (!z) {
            f1977e = -4;
            m2522c(str);
        }
        if (f1977e == 0) {
            f1977e = -5;
        }
        return null;
    }

    /* renamed from: c */
    private void m2522c(String str) {
        if (!TextUtils.isEmpty(str)) {
            C0532c.m2546a(C0532c.m2543a(Collections.singletonList(new C0532c.C0534a(str).mo1771a()), this.f1978a > 0 ? C0519a.NO_ADS_VAST_RESPONSE : C0519a.UNDEFINED_ERROR, -1, (String) null));
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.a.a.d$a */
    /* compiled from: VastXmlPullParser */
    static class C0524a {

        /* renamed from: a */
        String f1970a;

        /* renamed from: b */
        C0538a.C0541a f1971b;

        /* renamed from: c */
        C0538a.C0542b f1972c;

        /* renamed from: d */
        String f1973d;

        /* renamed from: e */
        final List<C0532c> f1974e = new ArrayList();

        /* renamed from: f */
        final List<C0532c> f1975f = new ArrayList();

        /* renamed from: g */
        float f1976g = Float.MIN_VALUE;

        public C0524a() {
        }

        public C0524a(String str, C0538a.C0541a aVar, C0538a.C0542b bVar) {
            mo1750a(str, aVar, bVar);
        }

        /* renamed from: a */
        public void mo1750a(String str, C0538a.C0541a aVar, C0538a.C0542b bVar) {
            this.f1970a = str;
            this.f1971b = aVar;
            this.f1972c = bVar;
        }

        /* renamed from: a */
        public void mo1749a(String str) {
            this.f1974e.add(new C0532c.C0534a(str).mo1771a());
        }

        /* renamed from: b */
        public void mo1751b(String str) {
            this.f1975f.add(new C0532c.C0534a(str).mo1771a());
        }
    }

    /* renamed from: a */
    public static List<C0532c> m2516a(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        return m2523d(m2521b(xmlPullParser, str));
    }

    /* renamed from: b */
    public static int m2519b(String str) {
        if (TextUtils.isEmpty(str)) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: b */
    public static String m2521b(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String str2;
        xmlPullParser.require(2, f1969f, str);
        if (xmlPullParser.next() == 4) {
            str2 = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            str2 = "";
        }
        xmlPullParser.require(3, f1969f, str);
        return str2;
    }

    /* renamed from: a */
    public static void m2517a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static void m2518a(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (!str.equals(xmlPullParser.getName()) || xmlPullParser.getEventType() != i) {
                xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.sdk.openadsdk.core.p026j.C0518a m2520b(org.xmlpull.v1.XmlPullParser r18, java.util.List<com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c> r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.f1978a
            r4 = 5
            r5 = 0
            if (r3 < r4) goto L_0x0010
            m2517a(r18)
            return r5
        L_0x0010:
            com.bytedance.sdk.openadsdk.core.j.d r3 = new com.bytedance.sdk.openadsdk.core.j.d
            r3.<init>(r5)
            r6 = r5
            r7 = r6
        L_0x0017:
            int r8 = r18.getEventType()
            java.lang.String r9 = "Wrapper"
            r10 = 3
            if (r8 != r10) goto L_0x0042
            java.lang.String r8 = r18.getName()
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x002b
            goto L_0x0042
        L_0x002b:
            com.bytedance.sdk.openadsdk.core.j.a r1 = r0.mo1748b((java.lang.String) r6, (java.util.List<com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c>) r2)
            if (r1 == 0) goto L_0x0041
            com.bytedance.sdk.openadsdk.core.j.c r2 = r1.mo1734c()
            if (r2 != 0) goto L_0x003a
            r1.mo1730a((com.bytedance.sdk.openadsdk.core.p026j.C0536c) r7)
        L_0x003a:
            com.bytedance.sdk.openadsdk.core.j.d r2 = r1.mo1726a()
            r2.mo1789a((com.bytedance.sdk.openadsdk.core.p026j.C0546d) r3)
        L_0x0041:
            return r1
        L_0x0042:
            r18.next()
            int r8 = r18.getEventType()
            r11 = 2
            if (r8 == r11) goto L_0x004d
            goto L_0x0017
        L_0x004d:
            java.lang.String r8 = r18.getName()
            int r13 = r8.hashCode()
            java.lang.String r14 = "ClickTracking"
            java.lang.String r15 = "Error"
            java.lang.String r12 = "VASTAdTagURI"
            r5 = 4
            r4 = 1
            switch(r13) {
                case -587420703: goto L_0x008f;
                case 67232232: goto L_0x0087;
                case 611554000: goto L_0x007d;
                case 1150879268: goto L_0x0073;
                case 2107600959: goto L_0x006b;
                case 2114088489: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0097
        L_0x0061:
            java.lang.String r13 = "Impression"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x0097
            r13 = 2
            goto L_0x0098
        L_0x006b:
            boolean r13 = r8.equals(r14)
            if (r13 == 0) goto L_0x0097
            r13 = 4
            goto L_0x0098
        L_0x0073:
            java.lang.String r13 = "CompanionAds"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x0097
            r13 = 5
            goto L_0x0098
        L_0x007d:
            java.lang.String r13 = "TrackingEvents"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x0097
            r13 = 3
            goto L_0x0098
        L_0x0087:
            boolean r13 = r8.equals(r15)
            if (r13 == 0) goto L_0x0097
            r13 = 1
            goto L_0x0098
        L_0x008f:
            boolean r13 = r8.equals(r12)
            if (r13 == 0) goto L_0x0097
            r13 = 0
            goto L_0x0098
        L_0x0097:
            r13 = -1
        L_0x0098:
            if (r13 == 0) goto L_0x00d9
            if (r13 == r4) goto L_0x00c5
            if (r13 == r11) goto L_0x00bc
            if (r13 == r10) goto L_0x00b7
            if (r13 == r5) goto L_0x00ae
            r4 = 5
            if (r13 == r4) goto L_0x00a6
            goto L_0x00d6
        L_0x00a6:
            android.content.Context r5 = r0.f1979b
            com.bytedance.sdk.openadsdk.core.j.c r5 = com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0520a.m2504a(r5, r1)
            r7 = r5
            goto L_0x00d6
        L_0x00ae:
            r4 = 5
            java.util.List r5 = m2516a((org.xmlpull.v1.XmlPullParser) r1, (java.lang.String) r14)
            r3.mo1806g((java.util.List<com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c>) r5)
            goto L_0x00d6
        L_0x00b7:
            r4 = 5
            com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0522c.m2511a((org.xmlpull.v1.XmlPullParser) r1, (com.bytedance.sdk.openadsdk.core.p026j.C0546d) r3)
            goto L_0x00d6
        L_0x00bc:
            r4 = 5
            java.util.List r5 = m2516a((org.xmlpull.v1.XmlPullParser) r1, (java.lang.String) r8)
            r3.mo1793a((java.util.List<com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c>) r5)
            goto L_0x00d6
        L_0x00c5:
            r4 = 5
            com.bytedance.sdk.openadsdk.core.j.b.c$a r5 = new com.bytedance.sdk.openadsdk.core.j.b.c$a
            java.lang.String r8 = m2521b((org.xmlpull.v1.XmlPullParser) r1, (java.lang.String) r15)
            r5.<init>(r8)
            com.bytedance.sdk.openadsdk.core.j.b.c r5 = r5.mo1771a()
            r2.add(r5)
        L_0x00d6:
            r5 = r6
        L_0x00d7:
            r6 = 0
            goto L_0x00ed
        L_0x00d9:
            r4 = 5
            java.lang.String r5 = m2521b((org.xmlpull.v1.XmlPullParser) r1, (java.lang.String) r12)
            java.lang.String r5 = r0.mo1752a((java.lang.String) r5, (java.util.List<com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c>) r2)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x00d7
            m2518a(r1, r9, r10)
            r6 = 0
            return r6
        L_0x00ed:
            r16 = r6
            r6 = r5
            r5 = r16
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a.C0523d.m2520b(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.j.a");
    }

    /* renamed from: a */
    private static List<C0532c> m2515a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new C0532c.C0534a(str).mo1770a(z).mo1771a());
    }

    /* renamed from: d */
    private static List<C0532c> m2523d(String str) {
        return m2515a(str, false);
    }
}
