package com.explorestack.iab.vast.tags;

import org.xmlpull.v1.XmlPullParser;

public class TrackingTag extends VastXmlTag {

    /* renamed from: c */
    public static final String[] f4622c = {"event"};

    public TrackingTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public String[] getSupportedAttributes() {
        return f4622c;
    }
}
