package com.applovin.exoplayer2.p221l;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.applovin.exoplayer2.l.aj */
public final class C7729aj {
    /* renamed from: a */
    public static boolean m22265a(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: a */
    public static boolean m22266a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m22265a(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: b */
    public static boolean m22267b(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: b */
    public static boolean m22268b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m22267b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: c */
    public static String m22269c(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
