package com.explorestack.iab.vast.tags;

import org.xmlpull.v1.XmlPullParser;

public class ExtensionTag extends VastXmlTag {

    /* renamed from: c */
    public static final String[] f4597c = {"type"};

    public ExtensionTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public String[] getSupportedAttributes() {
        return f4597c;
    }
}
