package com.explorestack.iab.vast.tags;

import org.xmlpull.v1.XmlPullParser;

public class AdTag extends VastXmlTag {

    /* renamed from: d */
    public static final String[] f4564d = {"id"};

    /* renamed from: c */
    public AdContentTag f4565c;

    public AdTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        AdContentTag wrapperAdTag;
        xmlPullParser.require(2, (String) null, "Ad");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.m6590a(name, "InLine")) {
                    wrapperAdTag = new InLineAdTag(xmlPullParser);
                } else if (VastXmlTag.m6590a(name, "Wrapper")) {
                    wrapperAdTag = new WrapperAdTag(xmlPullParser);
                } else {
                    VastXmlTag.m6594d(xmlPullParser);
                }
                this.f4565c = wrapperAdTag;
            }
        }
        xmlPullParser.require(3, (String) null, "Ad");
    }

    public AdContentTag getAdContentTag() {
        return this.f4565c;
    }

    public String[] getSupportedAttributes() {
        return f4564d;
    }
}
