package com.explorestack.iab.vast.tags;

import com.explorestack.iab.vast.TrackingEvent;
import com.explorestack.iab.vast.VastLog;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

public class LinearCreativeTag extends CreativeContentTag {

    /* renamed from: i */
    public static final String[] f4599i = {"skipoffset"};

    /* renamed from: c */
    public String f4600c;

    /* renamed from: d */
    public List<MediaFileTag> f4601d;

    /* renamed from: e */
    public VideoClicksTag f4602e;

    /* renamed from: f */
    public String f4603f;

    /* renamed from: g */
    public EnumMap<TrackingEvent, List<String>> f4604g;

    /* renamed from: h */
    public int f4605h = -1;

    public LinearCreativeTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "Linear");
        int e = VastXmlTag.m6595e(mo4522a("skipoffset"));
        if (e > -1) {
            mo4492a(e);
        }
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.m6590a(name, "Duration")) {
                    setDuration(VastXmlTag.m6593c(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "MediaFiles")) {
                    mo4495a(m6581e(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "VideoClicks")) {
                    mo4493a(new VideoClicksTag(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "AdParameters")) {
                    setAdParameters(VastXmlTag.m6593c(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "TrackingEvents")) {
                    mo4494a(new TrackingEventsTag(xmlPullParser).mo4519b());
                } else {
                    VastXmlTag.m6594d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Linear");
    }

    /* renamed from: e */
    public static List<MediaFileTag> m6581e(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, (String) null, "MediaFiles");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.m6590a(xmlPullParser.getName(), "MediaFile")) {
                    MediaFileTag mediaFileTag = new MediaFileTag(xmlPullParser);
                    if (mediaFileTag.isValidTag()) {
                        arrayList.add(mediaFileTag);
                    } else {
                        VastLog.m6354d("VastXmlTag", "MediaFile: is not valid. Skipping it.");
                    }
                }
                VastXmlTag.m6594d(xmlPullParser);
            }
        }
        xmlPullParser.require(3, (String) null, "MediaFiles");
        return arrayList;
    }

    /* renamed from: a */
    public final void mo4492a(int i) {
        this.f4605h = i;
    }

    /* renamed from: a */
    public final void mo4493a(VideoClicksTag videoClicksTag) {
        this.f4602e = videoClicksTag;
    }

    /* renamed from: a */
    public final void mo4494a(EnumMap<TrackingEvent, List<String>> enumMap) {
        this.f4604g = enumMap;
    }

    /* renamed from: a */
    public final void mo4495a(List<MediaFileTag> list) {
        this.f4601d = list;
    }

    public List<MediaFileTag> getMediaFileTagList() {
        return this.f4601d;
    }

    public int getSkipOffsetSec() {
        return this.f4605h;
    }

    public String[] getSupportedAttributes() {
        return f4599i;
    }

    public Map<TrackingEvent, List<String>> getTrackingEventListMap() {
        return this.f4604g;
    }

    public VideoClicksTag getVideoClicksTag() {
        return this.f4602e;
    }

    public void setAdParameters(String str) {
        this.f4603f = str;
    }

    public void setDuration(String str) {
        this.f4600c = str;
    }
}
