package com.explorestack.iab.vast.tags;

import com.appodeal.ads.modules.common.internal.LogConstants;
import org.xmlpull.v1.XmlPullParser;

public class WrapperAdTag extends AdContentTag {

    /* renamed from: i */
    public static final String[] f4633i = {"followAdditionalWrappers", "allowMultipleAds", "fallbackOnNoAd"};

    /* renamed from: h */
    public String f4634h;

    public WrapperAdTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "Wrapper");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.m6590a(name, "Creatives")) {
                    mo4458a(mo4460e(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "Extensions")) {
                    mo4459b(mo4462g(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "Impression")) {
                    mo4468m(VastXmlTag.m6593c(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, LogConstants.EVENT_ERROR)) {
                    mo4467l(VastXmlTag.m6593c(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "AdSystem")) {
                    mo4457a(new AdSystemTag(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "VASTAdTagURI")) {
                    mo4540n(VastXmlTag.m6593c(xmlPullParser));
                } else {
                    VastXmlTag.m6594d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Wrapper");
    }

    public String[] getSupportedAttributes() {
        return f4633i;
    }

    public String getVastAdTagUri() {
        return this.f4634h;
    }

    /* renamed from: n */
    public final void mo4540n(String str) {
        this.f4634h = str;
    }
}
