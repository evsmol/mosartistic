package com.bytedance.sdk.openadsdk.core.p026j.p027a.p028a;

import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.bytedance.sdk.openadsdk.core.p026j.C0518a;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a.a.b */
/* compiled from: InLineParser */
public class C0521b {
    /* renamed from: a */
    public static C0518a m2505a(Context context, XmlPullParser xmlPullParser, List<C0532c> list, int i, double d) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, C0523d.f1969f, "InLine");
        C0518a aVar = new C0518a();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                aVar.mo1726a().mo1811j(list);
                if (!TextUtils.isEmpty(aVar.mo1742g())) {
                    return aVar;
                }
                return null;
            } else if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                switch (name.hashCode()) {
                    case -1692490108:
                        if (name.equals("Creatives")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -56677412:
                        if (name.equals("Description")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 67232232:
                        if (name.equals(LogConstants.EVENT_ERROR)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 501930965:
                        if (name.equals("AdTitle")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 2114088489:
                        if (name.equals("Impression")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    aVar.mo1731a(C0523d.m2521b(xmlPullParser, name));
                } else if (c == 1) {
                    aVar.mo1733b(C0523d.m2521b(xmlPullParser, name));
                } else if (c == 2) {
                    list.addAll(C0523d.m2516a(xmlPullParser, name));
                } else if (c == 3) {
                    aVar.mo1726a().mo1793a(C0523d.m2516a(xmlPullParser, name));
                } else if (c != 4) {
                    C0523d.m2517a(xmlPullParser);
                } else if (TextUtils.isEmpty(aVar.mo1742g()) || aVar.mo1734c() == null) {
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if ("Creative".equals(xmlPullParser.getName())) {
                                m2506a(context, xmlPullParser, aVar, i, d);
                            } else {
                                C0523d.m2517a(xmlPullParser);
                            }
                        }
                    }
                } else {
                    C0523d.m2517a(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2506a(Context context, XmlPullParser xmlPullParser, C0518a aVar, int i, double d) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(aVar.mo1742g())) {
                    C0522c.m2510a(xmlPullParser, aVar, i, d);
                } else if (!"CompanionAds".equals(xmlPullParser.getName()) || aVar.mo1734c() != null) {
                    C0523d.m2517a(xmlPullParser);
                } else {
                    aVar.mo1730a(C0520a.m2504a(context, xmlPullParser));
                }
            }
        }
    }
}
