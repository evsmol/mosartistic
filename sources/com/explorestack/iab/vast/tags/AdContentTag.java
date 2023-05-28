package com.explorestack.iab.vast.tags;

import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class AdContentTag extends VastXmlTag {

    /* renamed from: c */
    public AdSystemTag f4558c;

    /* renamed from: d */
    public List<CreativeTag> f4559d;

    /* renamed from: e */
    public List<ExtensionTag> f4560e;

    /* renamed from: f */
    public List<String> f4561f;

    /* renamed from: g */
    public List<String> f4562g;

    public AdContentTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    /* renamed from: a */
    public void mo4457a(AdSystemTag adSystemTag) {
        this.f4558c = adSystemTag;
    }

    /* renamed from: a */
    public void mo4458a(List<CreativeTag> list) {
        this.f4559d = list;
    }

    /* renamed from: b */
    public void mo4459b(List<ExtensionTag> list) {
        this.f4560e = list;
    }

    /* renamed from: e */
    public List<CreativeTag> mo4460e(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, (String) null, "Creatives");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.m6590a(xmlPullParser.getName(), "Creative")) {
                    arrayList.add(new CreativeTag(xmlPullParser));
                } else {
                    VastXmlTag.m6594d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Creatives");
        return arrayList;
    }

    /* renamed from: f */
    public final ExtensionTag mo4461f(XmlPullParser xmlPullParser) {
        ExtensionTag extensionTag;
        xmlPullParser.require(2, (String) null, "Extension");
        String a = new ExtensionTag(xmlPullParser).mo4522a("type");
        if (VastXmlTag.m6590a(a, "appodeal")) {
            extensionTag = new AppodealExtensionTag(xmlPullParser);
        } else if (VastXmlTag.m6590a(a, "AdVerifications")) {
            AdVerificationsExtensionTag adVerificationsExtensionTag = null;
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (VastXmlTag.m6590a(xmlPullParser.getName(), "AdVerifications")) {
                        adVerificationsExtensionTag = new AdVerificationsExtensionTag(xmlPullParser);
                    } else {
                        VastXmlTag.m6594d(xmlPullParser);
                    }
                }
            }
            extensionTag = adVerificationsExtensionTag;
        } else {
            VastXmlTag.m6594d(xmlPullParser);
            extensionTag = null;
        }
        xmlPullParser.require(3, (String) null, "Extension");
        return extensionTag;
    }

    /* renamed from: g */
    public List<ExtensionTag> mo4462g(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, (String) null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.m6590a(xmlPullParser.getName(), "Extension")) {
                    ExtensionTag f = mo4461f(xmlPullParser);
                    if (f != null) {
                        arrayList.add(f);
                    }
                } else {
                    VastXmlTag.m6594d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Extensions");
        return arrayList;
    }

    public List<CreativeTag> getCreativeTagList() {
        return this.f4559d;
    }

    public List<String> getErrorUrlList() {
        return this.f4562g;
    }

    public List<ExtensionTag> getExtensionTagList() {
        return this.f4560e;
    }

    public List<String> getImpressionUrlList() {
        return this.f4561f;
    }

    /* renamed from: l */
    public void mo4467l(String str) {
        if (this.f4562g == null) {
            this.f4562g = new ArrayList();
        }
        this.f4562g.add(str);
    }

    /* renamed from: m */
    public void mo4468m(String str) {
        if (this.f4561f == null) {
            this.f4561f = new ArrayList();
        }
        this.f4561f.add(str);
    }
}
