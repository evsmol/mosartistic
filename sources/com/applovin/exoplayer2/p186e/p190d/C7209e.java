package com.applovin.exoplayer2.p186e.p190d;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p186e.p190d.C7204b;
import com.applovin.exoplayer2.p221l.C7729aj;
import com.applovin.exoplayer2.p221l.C7755q;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.applovin.exoplayer2.e.d.e */
final class C7209e {

    /* renamed from: a */
    private static final String[] f15902a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f15903b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f15904c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    private static C7033s<C7204b.C7205a> m19434a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C7033s.C7034a i = C7033s.m18804i();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (C7729aj.m22268b(xmlPullParser, str3)) {
                String c = C7729aj.m22269c(xmlPullParser, str2 + ":Mime");
                String c2 = C7729aj.m22269c(xmlPullParser, str2 + ":Semantic");
                String c3 = C7729aj.m22269c(xmlPullParser, str2 + ":Length");
                String c4 = C7729aj.m22269c(xmlPullParser, str2 + ":Padding");
                if (c == null || c2 == null) {
                    return C7033s.m18803g();
                }
                i.mo53515a(new C7204b.C7205a(c, c2, c3 != null ? Long.parseLong(c3) : 0, c4 != null ? Long.parseLong(c4) : 0));
            }
        } while (!C7729aj.m22266a(xmlPullParser, str4));
        return i.mo53531a();
    }

    /* renamed from: a */
    public static C7204b m19435a(String str) throws IOException {
        try {
            return m19438b(str);
        } catch (C6809ai | NumberFormatException | XmlPullParserException unused) {
            C7755q.m22361c("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m19436a(XmlPullParser xmlPullParser) {
        for (String c : f15902a) {
            String c2 = C7729aj.m22269c(xmlPullParser, c);
            if (c2 != null) {
                return Integer.parseInt(c2) == 1;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static long m19437b(XmlPullParser xmlPullParser) {
        for (String c : f15903b) {
            String c2 = C7729aj.m22269c(xmlPullParser, c);
            if (c2 != null) {
                long parseLong = Long.parseLong(c2);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    private static C7204b m19438b(String str) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (C7729aj.m22268b(newPullParser, "x:xmpmeta")) {
            long j = -9223372036854775807L;
            C7033s<C7204b.C7205a> g = C7033s.m18803g();
            do {
                newPullParser.next();
                if (!C7729aj.m22268b(newPullParser, "rdf:Description")) {
                    if (C7729aj.m22268b(newPullParser, "Container:Directory")) {
                        str2 = "Container";
                        str3 = "Item";
                    } else if (C7729aj.m22268b(newPullParser, "GContainer:Directory")) {
                        str2 = "GContainer";
                        str3 = "GContainerItem";
                    }
                    g = m19434a(newPullParser, str2, str3);
                } else if (!m19436a(newPullParser)) {
                    return null;
                } else {
                    j = m19437b(newPullParser);
                    g = m19439c(newPullParser);
                }
            } while (!C7729aj.m22266a(newPullParser, "x:xmpmeta"));
            if (g.isEmpty()) {
                return null;
            }
            return new C7204b(j, g);
        }
        throw C6809ai.m17540b("Couldn't find xmp metadata", (Throwable) null);
    }

    /* renamed from: c */
    private static C7033s<C7204b.C7205a> m19439c(XmlPullParser xmlPullParser) {
        for (String c : f15904c) {
            String c2 = C7729aj.m22269c(xmlPullParser, c);
            if (c2 != null) {
                return C7033s.m18794a(new C7204b.C7205a("image/jpeg", "Primary", 0, 0), new C7204b.C7205a("video/mp4", "MotionPhoto", Long.parseLong(c2), 0));
            }
        }
        return C7033s.m18803g();
    }
}
