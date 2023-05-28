package com.explorestack.iab.vast.tags;

import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class VastTag extends VastXmlTag {

    /* renamed from: d */
    public static final String[] f4623d = {"version"};

    /* renamed from: c */
    public final List<AdTag> f4624c = new ArrayList();

    public VastTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "VAST");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.m6590a(xmlPullParser.getName(), "Ad")) {
                    this.f4624c.add(new AdTag(xmlPullParser));
                } else {
                    VastXmlTag.m6594d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "VAST");
    }

    public List<AdTag> getAdTagList() {
        return this.f4624c;
    }

    public String[] getSupportedAttributes() {
        return f4623d;
    }

    public boolean hasAd() {
        List<AdTag> list = this.f4624c;
        return list != null && list.size() > 0;
    }
}
