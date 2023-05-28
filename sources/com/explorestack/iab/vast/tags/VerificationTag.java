package com.explorestack.iab.vast.tags;

import org.xmlpull.v1.XmlPullParser;

public class VerificationTag extends VastXmlTag {

    /* renamed from: e */
    public static final String[] f4627e = {"vendor"};

    /* renamed from: c */
    public JavaScriptResourceTag f4628c;

    /* renamed from: d */
    public String f4629d;

    public VerificationTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "Verification");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.m6590a(name, "JavaScriptResource")) {
                    this.f4628c = new JavaScriptResourceTag(xmlPullParser);
                } else if (VastXmlTag.m6590a(name, "VerificationParameters")) {
                    this.f4629d = VastXmlTag.m6593c(xmlPullParser);
                } else {
                    VastXmlTag.m6594d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Verification");
    }

    public JavaScriptResourceTag getJavaScriptResourceTag() {
        return this.f4628c;
    }

    public String[] getSupportedAttributes() {
        return f4627e;
    }

    public String getVendor() {
        return mo4522a("vendor");
    }

    public String getVerificationParameters() {
        return this.f4629d;
    }
}
