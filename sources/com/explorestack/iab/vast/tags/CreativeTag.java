package com.explorestack.iab.vast.tags;

import org.xmlpull.v1.XmlPullParser;

public class CreativeTag extends VastXmlTag {

    /* renamed from: d */
    public static final String[] f4595d = {"id", "adID"};

    /* renamed from: c */
    public CreativeContentTag f4596c;

    public CreativeTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        CreativeContentTag companionAdsCreativeTag;
        xmlPullParser.require(2, (String) null, "Creative");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.m6590a(name, "Linear")) {
                    companionAdsCreativeTag = new LinearCreativeTag(xmlPullParser);
                } else if (VastXmlTag.m6590a(name, "CompanionAds")) {
                    companionAdsCreativeTag = new CompanionAdsCreativeTag(xmlPullParser);
                } else {
                    VastXmlTag.m6594d(xmlPullParser);
                }
                this.f4596c = companionAdsCreativeTag;
            }
        }
        xmlPullParser.require(3, (String) null, "Creative");
    }

    public CreativeContentTag getCreativeContentTag() {
        return this.f4596c;
    }

    public String[] getSupportedAttributes() {
        return f4595d;
    }
}
