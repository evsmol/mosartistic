package com.explorestack.iab.vast.tags;

import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParser;

public class StaticResourceTag extends VastXmlTag {

    /* renamed from: c */
    public static final String[] f4620c = {"creativeType"};

    public StaticResourceTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public String[] getSupportedAttributes() {
        return f4620c;
    }

    public boolean isTextSupported() {
        return true;
    }

    public boolean isValidTag() {
        String a = mo4522a("creativeType");
        if (!TextUtils.isEmpty(a)) {
            return a.matches("image/.*(?i)(gif|jpeg|jpg|bmp|png)");
        }
        return false;
    }
}
