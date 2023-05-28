package com.explorestack.iab.vast.tags;

import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParser;
import p150io.bidmachine.utils.IabUtils;

public class MediaFileTag extends VastXmlTag {

    /* renamed from: c */
    public static final String[] f4606c = {"delivery", "type", IabUtils.KEY_WIDTH, IabUtils.KEY_HEIGHT, "codec", "id", "bitrate", "minBitrate", "maxBitrate", "scalable", "maintainAspectRatio", "apiFramework"};

    public MediaFileTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public int getHeight() {
        return mo4525b(IabUtils.KEY_HEIGHT);
    }

    public String[] getSupportedAttributes() {
        return f4606c;
    }

    public String getType() {
        return mo4522a("type");
    }

    public int getWidth() {
        return mo4525b(IabUtils.KEY_WIDTH);
    }

    public boolean isTextSupported() {
        return true;
    }

    public boolean isValidTag() {
        return !TextUtils.isEmpty(mo4522a("type")) && !TextUtils.isEmpty(mo4522a(IabUtils.KEY_WIDTH)) && !TextUtils.isEmpty(mo4522a(IabUtils.KEY_HEIGHT)) && !TextUtils.isEmpty(getText());
    }
}
