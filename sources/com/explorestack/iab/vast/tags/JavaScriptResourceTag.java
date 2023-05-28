package com.explorestack.iab.vast.tags;

import org.xmlpull.v1.XmlPullParser;

public class JavaScriptResourceTag extends VastXmlTag {

    /* renamed from: c */
    public static final String[] f4598c = {"apiFramework"};

    public JavaScriptResourceTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public String[] getSupportedAttributes() {
        return f4598c;
    }

    public boolean isTextSupported() {
        return true;
    }
}
