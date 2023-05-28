package com.explorestack.iab.vast.tags;

import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.vast.C1422a;
import org.xmlpull.v1.XmlPullParser;

public class AppodealExtensionTag extends ExtensionTag implements C1422a {

    /* renamed from: d */
    public final IabElementStyle f4567d = new IabElementStyle();

    /* renamed from: e */
    public final IabElementStyle f4568e = new IabElementStyle();

    /* renamed from: f */
    public final IabElementStyle f4569f = new IabElementStyle();

    /* renamed from: g */
    public final IabElementStyle f4570g = new IabElementStyle();

    /* renamed from: h */
    public final IabElementStyle f4571h = new IabElementStyle();

    /* renamed from: i */
    public final IabElementStyle f4572i = new IabElementStyle();

    /* renamed from: j */
    public final IabElementStyle f4573j = new IabElementStyle();

    /* renamed from: k */
    public final IabElementStyle f4574k = new IabElementStyle();

    /* renamed from: l */
    public final PostBannerTag f4575l = new PostBannerTag();

    /* renamed from: m */
    public Integer f4576m;

    /* renamed from: n */
    public Integer f4577n;

    /* renamed from: o */
    public CompanionTag f4578o;

    /* renamed from: p */
    public Boolean f4579p;

    /* renamed from: q */
    public Float f4580q;

    /* renamed from: r */
    public boolean f4581r = false;

    /* renamed from: s */
    public boolean f4582s = false;

    /* renamed from: t */
    public boolean f4583t = false;

    /* renamed from: u */
    public boolean f4584u = false;

    /* renamed from: v */
    public Integer f4585v;

    public AppodealExtensionTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        IabElementStyle iabElementStyle;
        IabElementStyle iabElementStyle2;
        IabElementStyle iabElementStyle3;
        IabElementStyle iabElementStyle4;
        xmlPullParser.require(2, (String) null, "Extension");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.m6590a(name, "Video")) {
                    iabElementStyle4 = this.f4567d;
                } else if (VastXmlTag.m6590a(name, "LoadingView")) {
                    iabElementStyle4 = this.f4573j;
                } else if (VastXmlTag.m6590a(name, "Countdown")) {
                    iabElementStyle4 = this.f4574k;
                } else if (VastXmlTag.m6590a(name, "Progress")) {
                    iabElementStyle4 = this.f4571h;
                } else if (VastXmlTag.m6590a(name, "ClosableView")) {
                    iabElementStyle4 = this.f4570g;
                } else if (VastXmlTag.m6590a(name, "Mute")) {
                    iabElementStyle4 = this.f4569f;
                } else if (VastXmlTag.m6590a(name, "CTA")) {
                    iabElementStyle4 = this.f4568e;
                } else if (VastXmlTag.m6590a(name, "RepeatView")) {
                    iabElementStyle4 = this.f4572i;
                } else if (VastXmlTag.m6590a(name, "Postbanner")) {
                    this.f4575l.parse(xmlPullParser);
                } else if (VastXmlTag.m6590a(name, "Autorotate")) {
                    this.f4579p = Boolean.valueOf(VastXmlTag.m6591b(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "R1")) {
                    this.f4583t = VastXmlTag.m6591b(xmlPullParser);
                } else if (VastXmlTag.m6590a(name, "R2")) {
                    this.f4584u = VastXmlTag.m6591b(xmlPullParser);
                } else if (VastXmlTag.m6590a(name, "ForceOrientation")) {
                    this.f4585v = VastXmlTag.m6597g(VastXmlTag.m6593c(xmlPullParser));
                } else if (VastXmlTag.m6590a(name, "CtaText")) {
                    this.f4568e.setContent(VastXmlTag.m6593c(xmlPullParser));
                } else {
                    if (VastXmlTag.m6590a(name, "ShowCta")) {
                        iabElementStyle = this.f4568e;
                    } else if (VastXmlTag.m6590a(name, "ShowMute")) {
                        iabElementStyle = this.f4569f;
                    } else if (VastXmlTag.m6590a(name, "ShowCompanion")) {
                        this.f4575l.setVisible(VastXmlTag.m6591b(xmlPullParser));
                    } else if (VastXmlTag.m6590a(name, "CompanionCloseTime")) {
                        int f = VastXmlTag.m6596f(VastXmlTag.m6593c(xmlPullParser));
                        if (f > -1) {
                            this.f4575l.setCloseTimeSec(f);
                        }
                    } else if (VastXmlTag.m6590a(name, "Muted")) {
                        this.f4581r = VastXmlTag.m6591b(xmlPullParser);
                    } else if (VastXmlTag.m6590a(name, "VideoClickable")) {
                        this.f4582s = VastXmlTag.m6591b(xmlPullParser);
                    } else {
                        if (VastXmlTag.m6590a(name, "CtaXPosition")) {
                            iabElementStyle3 = this.f4568e;
                        } else {
                            if (VastXmlTag.m6590a(name, "CtaYPosition")) {
                                iabElementStyle2 = this.f4568e;
                            } else if (VastXmlTag.m6590a(name, "CloseXPosition")) {
                                iabElementStyle3 = this.f4570g;
                            } else if (VastXmlTag.m6590a(name, "CloseYPosition")) {
                                iabElementStyle2 = this.f4570g;
                            } else if (VastXmlTag.m6590a(name, "MuteXPosition")) {
                                iabElementStyle3 = this.f4569f;
                            } else if (VastXmlTag.m6590a(name, "MuteYPosition")) {
                                iabElementStyle2 = this.f4569f;
                            } else if (VastXmlTag.m6590a(name, "AssetsColor")) {
                                Integer c = VastXmlTag.m6592c(VastXmlTag.m6593c(xmlPullParser));
                                if (c != null) {
                                    this.f4576m = c;
                                }
                            } else if (VastXmlTag.m6590a(name, "AssetsBackgroundColor")) {
                                Integer c2 = VastXmlTag.m6592c(VastXmlTag.m6593c(xmlPullParser));
                                if (c2 != null) {
                                    this.f4577n = c2;
                                }
                            } else if (VastXmlTag.m6590a(name, "Companion")) {
                                CompanionTag companionTag = new CompanionTag(xmlPullParser);
                                if (companionTag.isValidTag() && companionTag.hasCreative()) {
                                    this.f4578o = companionTag;
                                }
                            } else if (VastXmlTag.m6590a(name, "CloseTime")) {
                                String c3 = VastXmlTag.m6593c(xmlPullParser);
                                if (c3 != null) {
                                    this.f4580q = Float.valueOf(Float.parseFloat(c3));
                                }
                            } else if (VastXmlTag.m6590a(name, "ShowProgress")) {
                                iabElementStyle = this.f4571h;
                            } else {
                                VastXmlTag.m6594d(xmlPullParser);
                            }
                            iabElementStyle2.setVerticalPosition(VastXmlTag.m6599i(VastXmlTag.m6593c(xmlPullParser)));
                        }
                        iabElementStyle3.setHorizontalPosition(VastXmlTag.m6598h(VastXmlTag.m6593c(xmlPullParser)));
                    }
                    iabElementStyle.setVisible(Boolean.valueOf(VastXmlTag.m6591b(xmlPullParser)));
                }
                VastXmlTag.m6589a(xmlPullParser, iabElementStyle4);
            }
        }
        xmlPullParser.require(3, (String) null, "Extension");
    }

    public Integer getAssetsBackgroundColor() {
        return this.f4577n;
    }

    public Integer getAssetsColor() {
        return this.f4576m;
    }

    public IabElementStyle getCloseStyle() {
        return this.f4570g;
    }

    public Float getCloseTimeSec() {
        return this.f4580q;
    }

    public CompanionTag getCompanionTag() {
        return this.f4578o;
    }

    public IabElementStyle getCountDownStyle() {
        return this.f4574k;
    }

    public IabElementStyle getCtaStyle() {
        return this.f4568e;
    }

    public Integer getForceOrientation() {
        return this.f4585v;
    }

    public IabElementStyle getLoadingStyle() {
        return this.f4573j;
    }

    public IabElementStyle getMuteStyle() {
        return this.f4569f;
    }

    public PostBannerTag getPostBannerTag() {
        return this.f4575l;
    }

    public IabElementStyle getProgressStyle() {
        return this.f4571h;
    }

    public IabElementStyle getRepeatStyle() {
        return this.f4572i;
    }

    public IabElementStyle getVideoStyle() {
        return this.f4567d;
    }

    public Boolean isAutoRotate() {
        return this.f4579p;
    }

    public boolean isMuted() {
        return this.f4581r;
    }

    public boolean isR1() {
        return this.f4583t;
    }

    public boolean isR2() {
        return this.f4584u;
    }

    public boolean isVideoClickable() {
        return this.f4582s;
    }
}
