package com.explorestack.iab.vast.tags;

import com.appodeal.ads.modules.common.internal.LogConstants;
import org.xmlpull.v1.XmlPullParser;

public class InLineAdTag extends AdContentTag {
    public InLineAdTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "InLine");
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
                } else {
                    VastXmlTag.m6594d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "InLine");
    }
}
