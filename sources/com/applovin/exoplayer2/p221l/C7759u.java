package com.applovin.exoplayer2.p221l;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.exoplayer2.l.u */
public final class C7759u {

    /* renamed from: a */
    private static final ArrayList<C7760a> f18305a = new ArrayList<>();

    /* renamed from: b */
    private static final Pattern f18306b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: com.applovin.exoplayer2.l.u$a */
    private static final class C7760a {

        /* renamed from: a */
        public final String f18307a;

        /* renamed from: b */
        public final String f18308b;

        /* renamed from: c */
        public final int f18309c;
    }

    /* renamed from: com.applovin.exoplayer2.l.u$b */
    static final class C7761b {

        /* renamed from: a */
        public final int f18310a;

        /* renamed from: b */
        public final int f18311b;

        public C7761b(int i, int i2) {
            this.f18310a = i;
            this.f18311b = i2;
        }

        /* renamed from: a */
        public int mo55036a() {
            int i = this.f18311b;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    /* renamed from: a */
    public static String m22376a(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: a */
    public static boolean m22377a(String str) {
        return "audio".equals(m22386h(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        r4 = (r4 = m22385g(r5)).mo55036a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m22378a(java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = -1
            int r2 = r4.hashCode()
            r3 = 1
            switch(r2) {
                case -2123537834: goto L_0x0076;
                case -432837260: goto L_0x006c;
                case -432837259: goto L_0x0062;
                case -53558318: goto L_0x0057;
                case 187078296: goto L_0x004d;
                case 187094639: goto L_0x0043;
                case 1504578661: goto L_0x0038;
                case 1504619009: goto L_0x002e;
                case 1504831518: goto L_0x0024;
                case 1903231877: goto L_0x001a;
                case 1903589369: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0080
        L_0x000f:
            java.lang.String r2 = "audio/g711-mlaw"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 5
            goto L_0x0080
        L_0x001a:
            java.lang.String r2 = "audio/g711-alaw"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 4
            goto L_0x0080
        L_0x0024:
            java.lang.String r2 = "audio/mpeg"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 0
            goto L_0x0080
        L_0x002e:
            java.lang.String r2 = "audio/flac"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 6
            goto L_0x0080
        L_0x0038:
            java.lang.String r2 = "audio/eac3"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 8
            goto L_0x0080
        L_0x0043:
            java.lang.String r2 = "audio/raw"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 3
            goto L_0x0080
        L_0x004d:
            java.lang.String r2 = "audio/ac3"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 7
            goto L_0x0080
        L_0x0057:
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 10
            goto L_0x0080
        L_0x0062:
            java.lang.String r2 = "audio/mpeg-L2"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 2
            goto L_0x0080
        L_0x006c:
            java.lang.String r2 = "audio/mpeg-L1"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 1
            goto L_0x0080
        L_0x0076:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 9
        L_0x0080:
            switch(r1) {
                case 0: goto L_0x009a;
                case 1: goto L_0x009a;
                case 2: goto L_0x009a;
                case 3: goto L_0x009a;
                case 4: goto L_0x009a;
                case 5: goto L_0x009a;
                case 6: goto L_0x009a;
                case 7: goto L_0x009a;
                case 8: goto L_0x009a;
                case 9: goto L_0x009a;
                case 10: goto L_0x0084;
                default: goto L_0x0083;
            }
        L_0x0083:
            return r0
        L_0x0084:
            if (r5 != 0) goto L_0x0087
            return r0
        L_0x0087:
            com.applovin.exoplayer2.l.u$b r4 = m22385g(r5)
            if (r4 != 0) goto L_0x008e
            return r0
        L_0x008e:
            int r4 = r4.mo55036a()
            if (r4 == 0) goto L_0x0099
            r5 = 16
            if (r4 == r5) goto L_0x0099
            r0 = 1
        L_0x0099:
            return r0
        L_0x009a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p221l.C7759u.m22378a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m22379b(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.hashCode()
            r1 = 8
            r2 = 7
            r3 = 6
            r4 = 5
            r5 = 0
            switch(r0) {
                case -2123537834: goto L_0x005f;
                case -1095064472: goto L_0x0055;
                case -53558318: goto L_0x004b;
                case 187078296: goto L_0x0041;
                case 187078297: goto L_0x0037;
                case 1504578661: goto L_0x002d;
                case 1504831518: goto L_0x0023;
                case 1505942594: goto L_0x0019;
                case 1556697186: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0069
        L_0x000e:
            java.lang.String r0 = "audio/true-hd"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 8
            goto L_0x006a
        L_0x0019:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 7
            goto L_0x006a
        L_0x0023:
            java.lang.String r0 = "audio/mpeg"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 0
            goto L_0x006a
        L_0x002d:
            java.lang.String r0 = "audio/eac3"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 3
            goto L_0x006a
        L_0x0037:
            java.lang.String r0 = "audio/ac4"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 5
            goto L_0x006a
        L_0x0041:
            java.lang.String r0 = "audio/ac3"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 2
            goto L_0x006a
        L_0x004b:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 1
            goto L_0x006a
        L_0x0055:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 6
            goto L_0x006a
        L_0x005f:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 4
            goto L_0x006a
        L_0x0069:
            r6 = -1
        L_0x006a:
            switch(r6) {
                case 0: goto L_0x008a;
                case 1: goto L_0x007b;
                case 2: goto L_0x007a;
                case 3: goto L_0x0079;
                case 4: goto L_0x0076;
                case 5: goto L_0x0073;
                case 6: goto L_0x0072;
                case 7: goto L_0x0071;
                case 8: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            return r5
        L_0x006e:
            r6 = 14
            return r6
        L_0x0071:
            return r1
        L_0x0072:
            return r2
        L_0x0073:
            r6 = 17
            return r6
        L_0x0076:
            r6 = 18
            return r6
        L_0x0079:
            return r3
        L_0x007a:
            return r4
        L_0x007b:
            if (r7 != 0) goto L_0x007e
            return r5
        L_0x007e:
            com.applovin.exoplayer2.l.u$b r6 = m22385g(r7)
            if (r6 != 0) goto L_0x0085
            return r5
        L_0x0085:
            int r6 = r6.mo55036a()
            return r6
        L_0x008a:
            r6 = 9
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p221l.C7759u.m22379b(java.lang.String, java.lang.String):int");
    }

    /* renamed from: b */
    public static boolean m22380b(String str) {
        return "video".equals(m22386h(str));
    }

    /* renamed from: c */
    public static boolean m22381c(String str) {
        return "text".equals(m22386h(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: d */
    public static String m22382d(String str) {
        C7761b g;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return "video/avc";
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (lowerCase.startsWith("av01")) {
            return "video/av01";
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!lowerCase.startsWith("mp4a")) {
            return lowerCase.startsWith("mha1") ? "audio/mha1" : lowerCase.startsWith("mhm1") ? "audio/mhm1" : (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) ? "audio/ac3" : (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) ? "audio/eac3" : lowerCase.startsWith("ec+3") ? "audio/eac3-joc" : (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) ? "audio/ac4" : lowerCase.startsWith("dtsc") ? "audio/vnd.dts" : lowerCase.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) ? "audio/vnd.dts.hd" : lowerCase.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : lowerCase.startsWith("opus") ? "audio/opus" : lowerCase.startsWith("vorbis") ? "audio/vorbis" : lowerCase.startsWith("flac") ? "audio/flac" : lowerCase.startsWith("stpp") ? "application/ttml+xml" : lowerCase.startsWith("wvtt") ? "text/vtt" : lowerCase.contains("cea708") ? "application/cea-708" : (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? "application/cea-608" : m22387i(lowerCase);
        }
        if (lowerCase.startsWith("mp4a.") && (g = m22385g(lowerCase)) != null) {
            str2 = m22376a(g.f18310a);
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    /* renamed from: e */
    public static int m22383e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m22377a(str)) {
            return 1;
        }
        if (m22380b(str)) {
            return 2;
        }
        if (m22381c(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m22388j(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m22384f(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1007807498(0xffffffffc3ee13f6, float:-476.15594)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = -586683234(0xffffffffdd07ec9e, float:-6.1214856E17)
            if (r0 == r1) goto L_0x0020
            r1 = 187090231(0xb26c537, float:3.2118805E-32)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            if (r0 == r2) goto L_0x003c
            return r4
        L_0x003c:
            java.lang.String r4 = "audio/wav"
            return r4
        L_0x003f:
            java.lang.String r4 = "audio/mpeg"
            return r4
        L_0x0042:
            java.lang.String r4 = "audio/flac"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p221l.C7759u.m22384f(java.lang.String):java.lang.String");
    }

    /* renamed from: g */
    static C7761b m22385g(String str) {
        Matcher matcher = f18306b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C7717a.m22120b(matcher.group(1));
        String group = matcher.group(2);
        int i = 0;
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i = Integer.parseInt(group);
            }
            return new C7761b(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    private static String m22386h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: i */
    private static String m22387i(String str) {
        int size = f18305a.size();
        for (int i = 0; i < size; i++) {
            C7760a aVar = f18305a.get(i);
            if (str.startsWith(aVar.f18308b)) {
                return aVar.f18307a;
            }
        }
        return null;
    }

    /* renamed from: j */
    private static int m22388j(String str) {
        int size = f18305a.size();
        for (int i = 0; i < size; i++) {
            C7760a aVar = f18305a.get(i);
            if (str.equals(aVar.f18307a)) {
                return aVar.f18309c;
            }
        }
        return -1;
    }
}
