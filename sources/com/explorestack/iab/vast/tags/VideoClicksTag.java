package com.explorestack.iab.vast.tags;

import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class VideoClicksTag extends VastXmlTag {

    /* renamed from: c */
    public String f4630c;

    /* renamed from: d */
    public List<String> f4631d;

    /* renamed from: e */
    public List<String> f4632e;

    public VideoClicksTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "VideoClicks");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.m6590a(name, "ClickThrough")) {
                    mo4538n(VastXmlTag.m6593c(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "ClickTracking")) {
                    mo4536l(VastXmlTag.m6593c(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "CustomClick")) {
                    mo4537m(VastXmlTag.m6593c(xmlPullParser));
                } else {
                    VastXmlTag.m6594d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "VideoClicks");
    }

    public String getClickThroughUrl() {
        return this.f4630c;
    }

    public List<String> getClickTrackingUrlList() {
        return this.f4631d;
    }

    /* renamed from: l */
    public final void mo4536l(String str) {
        if (this.f4631d == null) {
            this.f4631d = new ArrayList();
        }
        this.f4631d.add(str);
    }

    /* renamed from: m */
    public final void mo4537m(String str) {
        if (this.f4632e == null) {
            this.f4632e = new ArrayList();
        }
        this.f4632e.add(str);
    }

    /* renamed from: n */
    public final void mo4538n(String str) {
        this.f4630c = str;
    }
}
