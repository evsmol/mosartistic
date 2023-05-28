package com.appnext.base.p264b;

import com.appnext.core.C8924i;
import com.appodeal.ads.modules.common.internal.LogConstants;

/* renamed from: com.appnext.base.b.d */
public final class C8850d {
    public static final String STATUS = "status";

    /* renamed from: eS */
    public static final String f22413eS = "service_key";

    /* renamed from: eT */
    public static final String f22414eT = "4.7.2";

    /* renamed from: eU */
    public static final String f22415eU = "config.json";

    /* renamed from: eV */
    public static final String f22416eV = "plist.json";

    /* renamed from: eW */
    public static final String f22417eW = "/data/appnext/";

    /* renamed from: eX */
    public static final String f22418eX = "videos/";

    /* renamed from: eY */
    public static final String f22419eY = ".tmp";

    /* renamed from: eZ */
    public static final String f22420eZ = "http://cdn.appnext.com/tools/services/4.7.2/config.json";

    /* renamed from: fa */
    public static final String f22421fa = "http://cdn.appnext.com/tools/services/4.7.2/plist.json";

    /* renamed from: fb */
    public static final int f22422fb = 1024;

    /* renamed from: fc */
    public static final long f22423fc = 1048576;

    /* renamed from: fd */
    public static final int f22424fd = 15000;

    /* renamed from: fe */
    public static final String f22425fe = "on";

    /* renamed from: ff */
    public static final String f22426ff = "off";

    /* renamed from: fg */
    public static final String f22427fg = "config_data_obj";

    /* renamed from: fh */
    public static final String f22428fh = "second";

    /* renamed from: fi */
    public static final String f22429fi = "minute";

    /* renamed from: fj */
    public static final String f22430fj = "hour";

    /* renamed from: fk */
    public static final String f22431fk = "day";

    /* renamed from: fl */
    public static final String f22432fl = "time";

    /* renamed from: fm */
    public static final String f22433fm = "once";

    /* renamed from: fn */
    public static final String f22434fn = "interval";

    /* renamed from: fo */
    public static final String f22435fo = "isAidDisabled";

    /* renamed from: fp */
    public static final String f22436fp = "aidForSend";

    /* renamed from: aL */
    public static final String m26675aL() {
        return C8924i.f22640hm;
    }

    /* renamed from: aM */
    public static final String m26676aM() {
        return C8924i.f22641hn;
    }

    /* renamed from: com.appnext.base.b.d$a */
    public enum C8851a {
        String("String"),
        Long("Long"),
        Double("Double"),
        Integer("Integer"),
        HashMap("HashMap"),
        ArrayList("ArrayList"),
        Boolean("Boolean"),
        JSONArray("JSONArray"),
        JSONObject("JSONObject"),
        Set(LogConstants.EVENT_SET);
        
        private String mDataType;

        private C8851a(String str) {
            this.mDataType = str;
        }

        public final String getType() {
            return this.mDataType;
        }
    }
}
