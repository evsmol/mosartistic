package com.explorestack.iab.vast.tags;

import android.text.TextUtils;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.vast.VastLog;
import org.xmlpull.v1.XmlPullParser;

public class PostBannerTag extends VastXmlTag {

    /* renamed from: o */
    public static final /* synthetic */ boolean f4607o = (!PostBannerTag.class.desiredAssertionStatus());

    /* renamed from: c */
    public final IabElementStyle f4608c = new IabElementStyle();

    /* renamed from: d */
    public final IabElementStyle f4609d = new IabElementStyle();

    /* renamed from: e */
    public final IabElementStyle f4610e = new IabElementStyle();

    /* renamed from: f */
    public final IabElementStyle f4611f = new IabElementStyle();

    /* renamed from: g */
    public String f4612g;

    /* renamed from: h */
    public float f4613h = 0.0f;

    /* renamed from: i */
    public float f4614i = 0.0f;

    /* renamed from: j */
    public boolean f4615j = true;

    /* renamed from: k */
    public boolean f4616k = false;

    /* renamed from: l */
    public boolean f4617l = false;

    /* renamed from: m */
    public boolean f4618m = false;

    /* renamed from: n */
    public boolean f4619n = false;

    /* renamed from: a */
    public void mo4505a(XmlPullParser xmlPullParser) {
        IabElementStyle iabElementStyle;
        xmlPullParser.require(2, (String) null, "Postbanner");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                try {
                    String name = xmlPullParser.getName();
                    if (VastXmlTag.m6590a(name, "CloseTime")) {
                        String c = VastXmlTag.m6593c(xmlPullParser);
                        if (TextUtils.isEmpty(c)) {
                            continue;
                        } else {
                            if (!f4607o) {
                                if (c == null) {
                                    throw new AssertionError();
                                }
                            }
                            this.f4613h = Float.parseFloat(c);
                        }
                    } else if (VastXmlTag.m6590a(name, "Duration")) {
                        String c2 = VastXmlTag.m6593c(xmlPullParser);
                        if (TextUtils.isEmpty(c2)) {
                            continue;
                        } else {
                            if (!f4607o) {
                                if (c2 == null) {
                                    throw new AssertionError();
                                }
                            }
                            this.f4614i = Float.parseFloat(c2);
                        }
                    } else {
                        if (VastXmlTag.m6590a(name, "ClosableView")) {
                            iabElementStyle = this.f4608c;
                        } else if (VastXmlTag.m6590a(name, "Countdown")) {
                            iabElementStyle = this.f4609d;
                        } else if (VastXmlTag.m6590a(name, "LoadingView")) {
                            iabElementStyle = this.f4610e;
                        } else if (VastXmlTag.m6590a(name, "Progress")) {
                            iabElementStyle = this.f4611f;
                        } else if (VastXmlTag.m6590a(name, "UseNativeClose")) {
                            this.f4617l = VastXmlTag.m6591b(xmlPullParser);
                        } else if (VastXmlTag.m6590a(name, "IgnoresSafeAreaLayoutGuide")) {
                            this.f4616k = VastXmlTag.m6591b(xmlPullParser);
                        } else if (VastXmlTag.m6590a(name, "ProductLink")) {
                            this.f4612g = VastXmlTag.m6593c(xmlPullParser);
                        } else if (VastXmlTag.m6590a(name, "R1")) {
                            this.f4618m = VastXmlTag.m6591b(xmlPullParser);
                        } else if (VastXmlTag.m6590a(name, "R2")) {
                            this.f4619n = VastXmlTag.m6591b(xmlPullParser);
                        } else {
                            VastXmlTag.m6594d(xmlPullParser);
                        }
                        VastXmlTag.m6589a(xmlPullParser, iabElementStyle);
                    }
                } catch (Throwable th) {
                    VastLog.m6353a("VastXmlTag", th);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Postbanner");
    }

    public IabElementStyle getCloseStyle() {
        return this.f4608c;
    }

    public float getCloseTimeSec() {
        return this.f4613h;
    }

    public IabElementStyle getCountDownStyle() {
        return this.f4609d;
    }

    public float getDurationSec() {
        return this.f4614i;
    }

    public IabElementStyle getLoadingStyle() {
        return this.f4610e;
    }

    public String getProductLink() {
        return this.f4612g;
    }

    public IabElementStyle getProgressStyle() {
        return this.f4611f;
    }

    public boolean isForceUseNativeClose() {
        return this.f4617l;
    }

    public boolean isR1() {
        return this.f4618m;
    }

    public boolean isR2() {
        return this.f4619n;
    }

    public boolean isVisible() {
        return this.f4615j;
    }

    public void setCloseTimeSec(int i) {
        this.f4613h = (float) i;
    }

    public void setVisible(boolean z) {
        this.f4615j = z;
    }
}
