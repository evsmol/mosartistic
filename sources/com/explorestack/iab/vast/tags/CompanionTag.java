package com.explorestack.iab.vast.tags;

import android.text.TextUtils;
import com.explorestack.iab.mraid.C1361g;
import com.explorestack.iab.vast.TrackingEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import p150io.bidmachine.utils.IabUtils;

public class CompanionTag extends VastXmlTag {

    /* renamed from: j */
    public static final String[] f4587j = {IabUtils.KEY_WIDTH, IabUtils.KEY_HEIGHT, "id", "assetWidth", "assetHeight", "expandedWidth", "expandedHeight", "apiFramework", "adSlotID", "required"};

    /* renamed from: c */
    public StaticResourceTag f4588c;

    /* renamed from: d */
    public String f4589d;

    /* renamed from: e */
    public String f4590e;

    /* renamed from: f */
    public String f4591f;

    /* renamed from: g */
    public List<String> f4592g;

    /* renamed from: h */
    public Map<TrackingEvent, List<String>> f4593h;

    /* renamed from: i */
    public String f4594i;

    public CompanionTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "Companion");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.m6590a(name, "StaticResource")) {
                    StaticResourceTag staticResourceTag = new StaticResourceTag(xmlPullParser);
                    if (staticResourceTag.isValidTag()) {
                        mo4476a(staticResourceTag);
                    }
                } else if (VastXmlTag.m6590a(name, "IFrameResource")) {
                    mo4488n(VastXmlTag.m6593c(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "HTMLResource")) {
                    setHtmlResource(VastXmlTag.m6593c(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "CompanionClickThrough")) {
                    mo4487m(VastXmlTag.m6593c(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "CompanionClickTracking")) {
                    mo4486l(VastXmlTag.m6593c(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "TrackingEvents")) {
                    mo4477a((Map<TrackingEvent, List<String>>) new TrackingEventsTag(xmlPullParser).mo4519b());
                } else if (VastXmlTag.m6590a(name, "AdParameters")) {
                    setAdParameters(VastXmlTag.m6593c(xmlPullParser));
                } else {
                    VastXmlTag.m6594d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Companion");
    }

    /* renamed from: a */
    public final void mo4476a(StaticResourceTag staticResourceTag) {
        this.f4588c = staticResourceTag;
    }

    /* renamed from: a */
    public final void mo4477a(Map<TrackingEvent, List<String>> map) {
        this.f4593h = map;
    }

    public List<String> getCompanionClickTrackingList() {
        return this.f4592g;
    }

    public int getHeight() {
        return mo4525b(IabUtils.KEY_HEIGHT);
    }

    public String getHtml() {
        String htmlForMraid = getHtmlForMraid();
        if (htmlForMraid != null) {
            return C1361g.m6124d(htmlForMraid);
        }
        return null;
    }

    public String getHtmlForMraid() {
        String str = this.f4590e;
        if (str != null) {
            return str;
        }
        StaticResourceTag staticResourceTag = this.f4588c;
        if (staticResourceTag != null) {
            return String.format("<script type='text/javascript'>document.write('<a style=\"display: flex; width: 100%%; height: 100%%; justify-content: center; align-items: center\" href=\"%s\" target=\"_blank\"><img style=\"border-style: none; height: 100%%; width: 100%%; object-fit: contain;\" src=\"%s\"/></a>');</script>", new Object[]{this.f4591f, staticResourceTag.getText()});
        } else if (this.f4589d == null) {
            return null;
        } else {
            return String.format("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"%s\" height=\"%s\" src=\"%s\"></iframe>", new Object[]{Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), this.f4589d});
        }
    }

    public String[] getSupportedAttributes() {
        return f4587j;
    }

    public Map<TrackingEvent, List<String>> getTrackingEventListMap() {
        return this.f4593h;
    }

    public int getWidth() {
        return mo4525b(IabUtils.KEY_WIDTH);
    }

    public boolean hasCreative() {
        return (this.f4590e == null && this.f4588c == null && this.f4589d == null) ? false : true;
    }

    public boolean isValidTag() {
        return !TextUtils.isEmpty(mo4522a(IabUtils.KEY_WIDTH)) && !TextUtils.isEmpty(mo4522a(IabUtils.KEY_HEIGHT));
    }

    /* renamed from: l */
    public final void mo4486l(String str) {
        if (this.f4592g == null) {
            this.f4592g = new ArrayList();
        }
        this.f4592g.add(str);
    }

    /* renamed from: m */
    public final void mo4487m(String str) {
        this.f4591f = str;
    }

    /* renamed from: n */
    public final void mo4488n(String str) {
        this.f4589d = str;
    }

    public void setAdParameters(String str) {
        this.f4594i = str;
    }

    public void setHtmlResource(String str) {
        this.f4590e = str;
    }
}
