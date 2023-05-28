package com.explorestack.iab.vast.tags;

import org.xmlpull.v1.XmlPullParser;

public class AdSystemTag extends VastXmlTag {

    /* renamed from: c */
    public static final String[] f4563c = {"version"};

    public AdSystemTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public String[] getSupportedAttributes() {
        return f4563c;
    }

    public boolean isTextSupported() {
        return true;
    }
}
