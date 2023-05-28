package com.explorestack.iab.vast.tags;

import com.explorestack.iab.vast.TrackingEvent;
import com.explorestack.iab.vast.VastLog;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

class TrackingEventsTag extends VastXmlTag {

    /* renamed from: c */
    public final EnumMap<TrackingEvent, List<String>> f4621c = new EnumMap<>(TrackingEvent.class);

    public TrackingEventsTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        TrackingEvent trackingEvent;
        xmlPullParser.require(2, (String) null, "TrackingEvents");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.m6590a(xmlPullParser.getName(), "Tracking")) {
                    String a = new TrackingTag(xmlPullParser).mo4522a("event");
                    try {
                        trackingEvent = TrackingEvent.valueOf(a);
                    } catch (Exception unused) {
                        VastLog.m6354d("VastXmlTag", String.format("Event: %s is not valid. Skipping it.", new Object[]{a}));
                        trackingEvent = null;
                    }
                    if (trackingEvent != null) {
                        String c = VastXmlTag.m6593c(xmlPullParser);
                        List list = this.f4621c.get(trackingEvent);
                        if (list != null) {
                            list.add(c);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(c);
                            this.f4621c.put(trackingEvent, arrayList);
                        }
                    }
                }
                VastXmlTag.m6594d(xmlPullParser);
            }
        }
        xmlPullParser.require(3, (String) null, "TrackingEvents");
    }

    /* renamed from: b */
    public EnumMap<TrackingEvent, List<String>> mo4519b() {
        return this.f4621c;
    }
}
