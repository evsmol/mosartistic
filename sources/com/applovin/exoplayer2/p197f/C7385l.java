package com.applovin.exoplayer2.p197f;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p197f.C7385l;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7759u;
import com.applovin.exoplayer2.p222m.C7790b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.exoplayer2.f.l */
public final class C7385l {

    /* renamed from: a */
    private static final Pattern f16966a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap<C7387a, List<C7381i>> f16967b = new HashMap<>();

    /* renamed from: c */
    private static int f16968c = -1;

    /* renamed from: com.applovin.exoplayer2.f.l$a */
    private static final class C7387a {

        /* renamed from: a */
        public final String f16969a;

        /* renamed from: b */
        public final boolean f16970b;

        /* renamed from: c */
        public final boolean f16971c;

        public C7387a(String str, boolean z, boolean z2) {
            this.f16969a = str;
            this.f16970b = z;
            this.f16971c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C7387a.class) {
                return false;
            }
            C7387a aVar = (C7387a) obj;
            return TextUtils.equals(this.f16969a, aVar.f16969a) && this.f16970b == aVar.f16970b && this.f16971c == aVar.f16971c;
        }

        public int hashCode() {
            int i = 1231;
            int hashCode = (((this.f16969a.hashCode() + 31) * 31) + (this.f16970b ? 1231 : 1237)) * 31;
            if (!this.f16971c) {
                i = 1237;
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.applovin.exoplayer2.f.l$b */
    public static class C7388b extends Exception {
        private C7388b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: com.applovin.exoplayer2.f.l$c */
    private interface C7389c {
        /* renamed from: a */
        int mo54194a();

        /* renamed from: a */
        MediaCodecInfo mo54195a(int i);

        /* renamed from: a */
        boolean mo54196a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo54197b();

        /* renamed from: b */
        boolean mo54198b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    /* renamed from: com.applovin.exoplayer2.f.l$d */
    private static final class C7390d implements C7389c {
        private C7390d() {
        }

        /* renamed from: a */
        public int mo54194a() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: a */
        public MediaCodecInfo mo54195a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: a */
        public boolean mo54196a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        /* renamed from: b */
        public boolean mo54197b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo54198b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }
    }

    /* renamed from: com.applovin.exoplayer2.f.l$e */
    private static final class C7391e implements C7389c {

        /* renamed from: a */
        private final int f16972a;

        /* renamed from: b */
        private MediaCodecInfo[] f16973b;

        public C7391e(boolean z, boolean z2) {
            this.f16972a = (z || z2) ? 1 : 0;
        }

        /* renamed from: c */
        private void m20589c() {
            if (this.f16973b == null) {
                this.f16973b = new MediaCodecList(this.f16972a).getCodecInfos();
            }
        }

        /* renamed from: a */
        public int mo54194a() {
            m20589c();
            return this.f16973b.length;
        }

        /* renamed from: a */
        public MediaCodecInfo mo54195a(int i) {
            m20589c();
            return this.f16973b[i];
        }

        /* renamed from: a */
        public boolean mo54196a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        /* renamed from: b */
        public boolean mo54197b() {
            return true;
        }

        /* renamed from: b */
        public boolean mo54198b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }
    }

    /* renamed from: com.applovin.exoplayer2.f.l$f */
    private interface C7392f<T> {
        int getScore(T t);
    }

    /* renamed from: a */
    private static int m20540a(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m20541a(C7381i iVar) {
        return iVar.f16875a.startsWith("OMX.google") ? 1 : 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m20542a(C7392f fVar, Object obj, Object obj2) {
        return fVar.getScore(obj2) - fVar.getScore(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m20543a(C7864v vVar, C7381i iVar) {
        try {
            return iVar.mo54163a(vVar) ? 1 : 0;
        } catch (C7388b unused) {
            return -1;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r3.equals("avc1") != false) goto L_0x0071;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m20544a(com.applovin.exoplayer2.C7864v r6) {
        /*
            java.lang.String r0 = r6.f18918i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r0 = r6.f18918i
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.f18921l
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x001f
            java.lang.String r6 = r6.f18918i
            android.util.Pair r6 = m20545a((java.lang.String) r6, (java.lang.String[]) r0)
            return r6
        L_0x001f:
            r2 = 0
            r3 = r0[r2]
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L_0x0066;
                case 3006243: goto L_0x005d;
                case 3006244: goto L_0x0053;
                case 3199032: goto L_0x0049;
                case 3214780: goto L_0x003f;
                case 3356560: goto L_0x0035;
                case 3624515: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0070
        L_0x002b:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 2
            goto L_0x0071
        L_0x0035:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 6
            goto L_0x0071
        L_0x003f:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 4
            goto L_0x0071
        L_0x0049:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 3
            goto L_0x0071
        L_0x0053:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 1
            goto L_0x0071
        L_0x005d:
            java.lang.String r5 = "avc1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0066:
            java.lang.String r2 = "av01"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 5
            goto L_0x0071
        L_0x0070:
            r2 = -1
        L_0x0071:
            switch(r2) {
                case 0: goto L_0x0093;
                case 1: goto L_0x0093;
                case 2: goto L_0x008c;
                case 3: goto L_0x0085;
                case 4: goto L_0x0085;
                case 5: goto L_0x007c;
                case 6: goto L_0x0075;
                default: goto L_0x0074;
            }
        L_0x0074:
            return r1
        L_0x0075:
            java.lang.String r6 = r6.f18918i
            android.util.Pair r6 = m20572e(r6, r0)
            return r6
        L_0x007c:
            java.lang.String r1 = r6.f18918i
            com.applovin.exoplayer2.m.b r6 = r6.f18933x
            android.util.Pair r6 = m20546a((java.lang.String) r1, (java.lang.String[]) r0, (com.applovin.exoplayer2.p222m.C7790b) r6)
            return r6
        L_0x0085:
            java.lang.String r6 = r6.f18918i
            android.util.Pair r6 = m20560b(r6, r0)
            return r6
        L_0x008c:
            java.lang.String r6 = r6.f18918i
            android.util.Pair r6 = m20569d(r6, r0)
            return r6
        L_0x0093:
            java.lang.String r6 = r6.f18918i
            android.util.Pair r6 = m20565c(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p197f.C7385l.m20544a(com.applovin.exoplayer2.v):android.util.Pair");
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m20545a(String str, String[] strArr) {
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        if (strArr.length < 3) {
            sb2 = new StringBuilder();
        } else {
            Matcher matcher = f16966a.matcher(strArr[1]);
            if (!matcher.matches()) {
                sb2 = new StringBuilder();
            } else {
                str = matcher.group(1);
                Integer b = m20561b(str);
                if (b == null) {
                    sb = new StringBuilder();
                    str2 = "Unknown Dolby Vision profile string: ";
                } else {
                    str = strArr[2];
                    Integer c = m20566c(str);
                    if (c != null) {
                        return new Pair<>(b, c);
                    }
                    sb = new StringBuilder();
                    str2 = "Unknown Dolby Vision level string: ";
                }
                sb2.append(str2);
                sb2.append(str);
                C7755q.m22361c("MediaCodecUtil", sb2.toString());
                return null;
            }
        }
        sb2.append("Ignoring malformed Dolby Vision codec string: ");
        sb2.append(str);
        C7755q.m22361c("MediaCodecUtil", sb2.toString());
        return null;
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m20546a(String str, String[] strArr, C7790b bVar) {
        StringBuilder sb;
        StringBuilder sb2;
        String sb3;
        if (strArr.length < 4) {
            sb = new StringBuilder();
        } else {
            int i = 1;
            try {
                int parseInt = Integer.parseInt(strArr[1]);
                int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
                int parseInt3 = Integer.parseInt(strArr[3]);
                if (parseInt != 0) {
                    sb2 = new StringBuilder();
                    sb2.append("Unknown AV1 profile: ");
                    sb2.append(parseInt);
                } else if (parseInt3 == 8 || parseInt3 == 10) {
                    if (parseInt3 != 8) {
                        i = (bVar == null || !(bVar.f18415d != null || bVar.f18414c == 7 || bVar.f18414c == 6)) ? 2 : 4096;
                    }
                    int f = m20574f(parseInt2);
                    if (f != -1) {
                        return new Pair<>(Integer.valueOf(i), Integer.valueOf(f));
                    }
                    sb2 = new StringBuilder();
                    sb2.append("Unknown AV1 level: ");
                    sb2.append(parseInt2);
                } else {
                    sb = new StringBuilder();
                    sb.append("Unknown AV1 bit depth: ");
                    sb.append(parseInt3);
                    sb3 = sb.toString();
                    C7755q.m22361c("MediaCodecUtil", sb3);
                    return null;
                }
                sb3 = sb2.toString();
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
            C7755q.m22361c("MediaCodecUtil", sb3);
            return null;
        }
        sb.append("Ignoring malformed AV1 codec string: ");
        sb.append(str);
        sb3 = sb.toString();
        C7755q.m22361c("MediaCodecUtil", sb3);
        return null;
    }

    /* renamed from: a */
    public static C7381i m20547a() throws C7388b {
        return m20548a("audio/raw", false, false);
    }

    /* renamed from: a */
    public static C7381i m20548a(String str, boolean z, boolean z2) throws C7388b {
        List<C7381i> b = m20562b(str, z, z2);
        if (b.isEmpty()) {
            return null;
        }
        return b.get(0);
    }

    /* renamed from: a */
    private static Integer m20549a(String str) {
        int i;
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c = 13;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c = 14;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c = 15;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c = 16;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c = 17;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c = 0;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c = 1;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c = 2;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c = 3;
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c = 4;
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c = 18;
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c = 19;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c = 20;
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c = 21;
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c = 22;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c = 23;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c = 24;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c = 25;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c = 5;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c = 6;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c = 7;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c = 8;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c = 9;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c = 10;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c = 11;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 4;
            case 2:
                return 16;
            case 3:
                i = 64;
                break;
            case 4:
                i = 256;
                break;
            case 5:
                i = 1024;
                break;
            case 6:
                i = 4096;
                break;
            case 7:
                i = 16384;
                break;
            case 8:
                i = 65536;
                break;
            case 9:
                i = 262144;
                break;
            case 10:
                i = 1048576;
                break;
            case 11:
                i = 4194304;
                break;
            case 12:
                i = 16777216;
                break;
            case 13:
                return 2;
            case 14:
                return 8;
            case 15:
                i = 32;
                break;
            case 16:
                i = 128;
                break;
            case 17:
                i = 512;
                break;
            case 18:
                i = 2048;
                break;
            case 19:
                i = 8192;
                break;
            case 20:
                i = 32768;
                break;
            case 21:
                i = 131072;
                break;
            case 22:
                i = 524288;
                break;
            case 23:
                i = 2097152;
                break;
            case 24:
                i = 8388608;
                break;
            case 25:
                i = 33554432;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    private static String m20550a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (!str2.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        if (r1.f16970b == false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0105 A[SYNTHETIC, Splitter:B:62:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<com.applovin.exoplayer2.p197f.C7381i> m20551a(com.applovin.exoplayer2.p197f.C7385l.C7387a r24, com.applovin.exoplayer2.p197f.C7385l.C7389c r25) throws com.applovin.exoplayer2.p197f.C7385l.C7388b {
        /*
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0153 }
            r5.<init>()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r15 = r1.f16969a     // Catch:{ Exception -> 0x0153 }
            int r14 = r25.mo54194a()     // Catch:{ Exception -> 0x0153 }
            boolean r13 = r25.mo54197b()     // Catch:{ Exception -> 0x0153 }
            r0 = 0
            r12 = 0
        L_0x0019:
            if (r12 >= r14) goto L_0x0152
            android.media.MediaCodecInfo r0 = r2.mo54195a(r12)     // Catch:{ Exception -> 0x0153 }
            boolean r6 = m20555a((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x0153 }
            if (r6 == 0) goto L_0x002d
        L_0x0025:
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x0124
        L_0x002d:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x0153 }
            boolean r6 = m20556a(r0, r11, r13, r15)     // Catch:{ Exception -> 0x0153 }
            if (r6 != 0) goto L_0x0038
            goto L_0x0025
        L_0x0038:
            java.lang.String r10 = m20550a((android.media.MediaCodecInfo) r0, (java.lang.String) r11, (java.lang.String) r15)     // Catch:{ Exception -> 0x0153 }
            if (r10 != 0) goto L_0x003f
            goto L_0x0025
        L_0x003f:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x00f3 }
            boolean r6 = r2.mo54196a(r4, r10, r9)     // Catch:{ Exception -> 0x00f3 }
            boolean r7 = r2.mo54198b(r4, r10, r9)     // Catch:{ Exception -> 0x00f3 }
            boolean r8 = r1.f16971c     // Catch:{ Exception -> 0x00f3 }
            if (r8 != 0) goto L_0x0051
            if (r7 != 0) goto L_0x0025
        L_0x0051:
            boolean r7 = r1.f16971c     // Catch:{ Exception -> 0x00f3 }
            if (r7 == 0) goto L_0x0058
            if (r6 != 0) goto L_0x0058
            goto L_0x0025
        L_0x0058:
            boolean r6 = r2.mo54196a(r3, r10, r9)     // Catch:{ Exception -> 0x00f3 }
            boolean r7 = r2.mo54198b(r3, r10, r9)     // Catch:{ Exception -> 0x00f3 }
            boolean r8 = r1.f16970b     // Catch:{ Exception -> 0x00f3 }
            if (r8 != 0) goto L_0x0066
            if (r7 != 0) goto L_0x0025
        L_0x0066:
            boolean r7 = r1.f16970b     // Catch:{ Exception -> 0x00f3 }
            if (r7 == 0) goto L_0x006d
            if (r6 != 0) goto L_0x006d
            goto L_0x0025
        L_0x006d:
            boolean r16 = m20567c((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x00f3 }
            boolean r17 = m20573e((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x00f3 }
            boolean r0 = m20577g((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x00f3 }
            if (r13 == 0) goto L_0x007f
            boolean r7 = r1.f16970b     // Catch:{ Exception -> 0x00f3 }
            if (r7 == r6) goto L_0x0085
        L_0x007f:
            if (r13 != 0) goto L_0x00b7
            boolean r7 = r1.f16970b     // Catch:{ Exception -> 0x00ac }
            if (r7 != 0) goto L_0x00b7
        L_0x0085:
            r18 = 0
            r19 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r20 = r10
            r10 = r16
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            com.applovin.exoplayer2.f.i r0 = com.applovin.exoplayer2.p197f.C7381i.m20420a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00a8 }
            r5.add(r0)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x0124
        L_0x00a8:
            r0 = move-exception
            r1 = r21
            goto L_0x00fd
        L_0x00ac:
            r0 = move-exception
            r20 = r10
            r22 = r12
            r23 = r13
            r18 = r14
            r1 = r11
            goto L_0x00fd
        L_0x00b7:
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            if (r23 != 0) goto L_0x0124
            if (r6 == 0) goto L_0x0124
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8 }
            r6.<init>()     // Catch:{ Exception -> 0x00a8 }
            r14 = r21
            r6.append(r14)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r7 = ".secure"
            r6.append(r7)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00f0 }
            r13 = 0
            r19 = 1
            r7 = r15
            r8 = r20
            r10 = r16
            r11 = r17
            r12 = r0
            r1 = r14
            r14 = r19
            com.applovin.exoplayer2.f.i r0 = com.applovin.exoplayer2.p197f.C7381i.m20420a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00ee }
            r5.add(r0)     // Catch:{ Exception -> 0x00ee }
            return r5
        L_0x00ee:
            r0 = move-exception
            goto L_0x00fd
        L_0x00f0:
            r0 = move-exception
            r1 = r14
            goto L_0x00fd
        L_0x00f3:
            r0 = move-exception
            r20 = r10
            r1 = r11
            r22 = r12
            r23 = r13
            r18 = r14
        L_0x00fd:
            int r6 = com.applovin.exoplayer2.p221l.C7728ai.f18249a     // Catch:{ Exception -> 0x0153 }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x012e
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x0153 }
            if (r6 != 0) goto L_0x012e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0153 }
            r0.<init>()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch:{ Exception -> 0x0153 }
            r0.append(r1)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0153 }
            com.applovin.exoplayer2.p221l.C7755q.m22363d(r8, r0)     // Catch:{ Exception -> 0x0153 }
        L_0x0124:
            int r12 = r22 + 1
            r1 = r24
            r14 = r18
            r13 = r23
            goto L_0x0019
        L_0x012e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0153 }
            r2.<init>()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x0153 }
            r2.append(r1)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x0153 }
            r1 = r20
            r2.append(r1)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0153 }
            com.applovin.exoplayer2.p221l.C7755q.m22363d(r8, r1)     // Catch:{ Exception -> 0x0153 }
            throw r0     // Catch:{ Exception -> 0x0153 }
        L_0x0152:
            return r5
        L_0x0153:
            r0 = move-exception
            com.applovin.exoplayer2.f.l$b r1 = new com.applovin.exoplayer2.f.l$b
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p197f.C7385l.m20551a(com.applovin.exoplayer2.f.l$a, com.applovin.exoplayer2.f.l$c):java.util.ArrayList");
    }

    /* renamed from: a */
    public static List<C7381i> m20552a(List<C7381i> list, C7864v vVar) {
        ArrayList arrayList = new ArrayList(list);
        m20554a(arrayList, new C7392f() {
            public final int getScore(Object obj) {
                return C7385l.m20543a(C7864v.this, (C7381i) obj);
            }
        });
        return arrayList;
    }

    /* renamed from: a */
    private static void m20553a(String str, List<C7381i> list) {
        if ("audio/raw".equals(str)) {
            if (C7728ai.f18249a < 26 && C7728ai.f18250b.equals("R9") && list.size() == 1 && list.get(0).f16875a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C7381i.m20420a("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
            }
            m20554a(list, $$Lambda$l$Tl7kcoI8lF70y_eEfdPwqt8BwQc.INSTANCE);
        }
        if (C7728ai.f18249a < 21 && list.size() > 1) {
            String str2 = list.get(0).f16875a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m20554a(list, $$Lambda$l$V0co7jnKyzCB6kZJrZXrymu7l_4.INSTANCE);
            }
        }
        if (C7728ai.f18249a < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f16875a)) {
            list.add(list.remove(0));
        }
    }

    /* renamed from: a */
    private static <T> void m20554a(List<T> list, C7392f<T> fVar) {
        Collections.sort(list, new Comparator() {
            public final int compare(Object obj, Object obj2) {
                return C7385l.m20542a(C7385l.C7392f.this, obj, obj2);
            }
        });
    }

    /* renamed from: a */
    private static boolean m20555a(MediaCodecInfo mediaCodecInfo) {
        return C7728ai.f18249a >= 29 && m20563b(mediaCodecInfo);
    }

    /* renamed from: a */
    private static boolean m20556a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (C7728ai.f18249a < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (C7728ai.f18249a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && ("a70".equals(C7728ai.f18250b) || ("Xiaomi".equals(C7728ai.f18251c) && C7728ai.f18250b.startsWith("HM")))) {
            return false;
        }
        if (C7728ai.f18249a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) && ("dlxu".equals(C7728ai.f18250b) || "protou".equals(C7728ai.f18250b) || "ville".equals(C7728ai.f18250b) || "villeplus".equals(C7728ai.f18250b) || "villec2".equals(C7728ai.f18250b) || C7728ai.f18250b.startsWith("gee") || "C6602".equals(C7728ai.f18250b) || "C6603".equals(C7728ai.f18250b) || "C6606".equals(C7728ai.f18250b) || "C6616".equals(C7728ai.f18250b) || "L36h".equals(C7728ai.f18250b) || "SO-02E".equals(C7728ai.f18250b))) {
            return false;
        }
        if (C7728ai.f18249a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) && ("C1504".equals(C7728ai.f18250b) || "C1505".equals(C7728ai.f18250b) || "C1604".equals(C7728ai.f18250b) || "C1605".equals(C7728ai.f18250b))) {
            return false;
        }
        if (C7728ai.f18249a < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(C7728ai.f18251c) && (C7728ai.f18250b.startsWith("zeroflte") || C7728ai.f18250b.startsWith("zerolte") || C7728ai.f18250b.startsWith("zenlte") || "SC-05G".equals(C7728ai.f18250b) || "marinelteatt".equals(C7728ai.f18250b) || "404SC".equals(C7728ai.f18250b) || "SC-04G".equals(C7728ai.f18250b) || "SCV31".equals(C7728ai.f18250b)))) {
            return false;
        }
        if (C7728ai.f18249a <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C7728ai.f18251c) && (C7728ai.f18250b.startsWith("d2") || C7728ai.f18250b.startsWith("serrano") || C7728ai.f18250b.startsWith("jflte") || C7728ai.f18250b.startsWith("santos") || C7728ai.f18250b.startsWith("t0"))) {
            return false;
        }
        if (C7728ai.f18249a > 19 || !C7728ai.f18250b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
        }
        return false;
    }

    /* renamed from: b */
    public static int m20557b() throws C7388b {
        if (f16968c == -1) {
            int i = 0;
            C7381i a = m20548a("video/avc", false, false);
            if (a != null) {
                MediaCodecInfo.CodecProfileLevel[] a2 = a.mo54164a();
                int length = a2.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m20540a(a2[i].level), i2);
                    i++;
                }
                i = Math.max(i2, C7728ai.f18249a >= 21 ? 345600 : 172800);
            }
            f16968c = i;
        }
        return f16968c;
    }

    /* renamed from: b */
    private static int m20558b(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m20559b(C7381i iVar) {
        String str = iVar.f16875a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (C7728ai.f18249a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* renamed from: b */
    private static Pair<Integer, Integer> m20560b(String str, String[] strArr) {
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        if (strArr.length < 4) {
            sb = new StringBuilder();
        } else {
            int i = 1;
            Matcher matcher = f16966a.matcher(strArr[1]);
            if (!matcher.matches()) {
                sb = new StringBuilder();
            } else {
                str = matcher.group(1);
                if (!"1".equals(str)) {
                    if ("2".equals(str)) {
                        i = 2;
                    } else {
                        sb2 = new StringBuilder();
                        str2 = "Unknown HEVC profile string: ";
                        sb.append(str2);
                        sb.append(str);
                        C7755q.m22361c("MediaCodecUtil", sb.toString());
                        return null;
                    }
                }
                str = strArr[3];
                Integer a = m20549a(str);
                if (a != null) {
                    return new Pair<>(Integer.valueOf(i), a);
                }
                sb2 = new StringBuilder();
                str2 = "Unknown HEVC level string: ";
                sb.append(str2);
                sb.append(str);
                C7755q.m22361c("MediaCodecUtil", sb.toString());
                return null;
            }
        }
        sb.append("Ignoring malformed HEVC codec string: ");
        sb.append(str);
        C7755q.m22361c("MediaCodecUtil", sb.toString());
        return null;
    }

    /* renamed from: b */
    private static Integer m20561b(String str) {
        int i;
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 8;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                i = 16;
                break;
            case 5:
                i = 32;
                break;
            case 6:
                i = 64;
                break;
            case 7:
                i = 128;
                break;
            case 8:
                i = 256;
                break;
            case 9:
                i = 512;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: b */
    public static synchronized List<C7381i> m20562b(String str, boolean z, boolean z2) throws C7388b {
        synchronized (C7385l.class) {
            C7387a aVar = new C7387a(str, z, z2);
            List<C7381i> list = f16967b.get(aVar);
            if (list != null) {
                return list;
            }
            ArrayList<C7381i> a = m20551a(aVar, C7728ai.f18249a >= 21 ? new C7391e(z, z2) : new C7390d());
            if (z && a.isEmpty() && 21 <= C7728ai.f18249a && C7728ai.f18249a <= 23) {
                a = m20551a(aVar, (C7389c) new C7390d());
                if (!a.isEmpty()) {
                    C7755q.m22361c("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + a.get(0).f16875a);
                }
            }
            m20553a(str, (List<C7381i>) a);
            List<C7381i> unmodifiableList = Collections.unmodifiableList(a);
            f16967b.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: b */
    private static boolean m20563b(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    /* renamed from: c */
    private static int m20564c(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: c */
    private static Pair<Integer, Integer> m20565c(String str, String[] strArr) {
        StringBuilder sb;
        int i;
        int i2;
        String str2;
        if (strArr.length < 2) {
            sb = new StringBuilder();
        } else {
            try {
                if (strArr[1].length() == 6) {
                    i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                    i = Integer.parseInt(strArr[1].substring(4), 16);
                } else if (strArr.length >= 3) {
                    int parseInt = Integer.parseInt(strArr[1]);
                    i = Integer.parseInt(strArr[2]);
                    i2 = parseInt;
                } else {
                    C7755q.m22361c("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int b = m20558b(i2);
                if (b == -1) {
                    str2 = "Unknown AVC profile: " + i2;
                    C7755q.m22361c("MediaCodecUtil", str2);
                    return null;
                }
                int c = m20564c(i);
                if (c != -1) {
                    return new Pair<>(Integer.valueOf(b), Integer.valueOf(c));
                }
                sb = new StringBuilder();
                sb.append("Unknown AVC level: ");
                sb.append(i);
                str2 = sb.toString();
                C7755q.m22361c("MediaCodecUtil", str2);
                return null;
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        }
        sb.append("Ignoring malformed AVC codec string: ");
        sb.append(str);
        str2 = sb.toString();
        C7755q.m22361c("MediaCodecUtil", str2);
        return null;
    }

    /* renamed from: c */
    private static Integer m20566c(String str) {
        int i;
        if (str == null) {
            return null;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        switch (hashCode) {
            case 1537:
                if (str.equals("01")) {
                    c = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = 8;
                    break;
                }
                break;
            default:
                switch (hashCode) {
                    case 1567:
                        if (str.equals("10")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 1568:
                        if (str.equals("11")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 1569:
                        if (str.equals("12")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 1570:
                        if (str.equals("13")) {
                            c = 12;
                            break;
                        }
                        break;
                }
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                i = 16;
                break;
            case 5:
                i = 32;
                break;
            case 6:
                i = 64;
                break;
            case 7:
                i = 128;
                break;
            case 8:
                i = 256;
                break;
            case 9:
                i = 512;
                break;
            case 10:
                i = 1024;
                break;
            case 11:
                i = 2048;
                break;
            case 12:
                i = 4096;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: c */
    private static boolean m20567c(MediaCodecInfo mediaCodecInfo) {
        return C7728ai.f18249a >= 29 ? m20570d(mediaCodecInfo) : !m20573e(mediaCodecInfo);
    }

    /* renamed from: d */
    private static int m20568d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    /* renamed from: d */
    private static Pair<Integer, Integer> m20569d(String str, String[] strArr) {
        StringBuilder sb;
        String str2;
        if (strArr.length < 3) {
            sb = new StringBuilder();
        } else {
            try {
                int parseInt = Integer.parseInt(strArr[1]);
                int parseInt2 = Integer.parseInt(strArr[2]);
                int d = m20568d(parseInt);
                if (d == -1) {
                    str2 = "Unknown VP9 profile: " + parseInt;
                    C7755q.m22361c("MediaCodecUtil", str2);
                    return null;
                }
                int e = m20571e(parseInt2);
                if (e != -1) {
                    return new Pair<>(Integer.valueOf(d), Integer.valueOf(e));
                }
                sb = new StringBuilder();
                sb.append("Unknown VP9 level: ");
                sb.append(parseInt2);
                str2 = sb.toString();
                C7755q.m22361c("MediaCodecUtil", str2);
                return null;
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        }
        sb.append("Ignoring malformed VP9 codec string: ");
        sb.append(str);
        str2 = sb.toString();
        C7755q.m22361c("MediaCodecUtil", str2);
        return null;
    }

    /* renamed from: d */
    private static boolean m20570d(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    /* renamed from: e */
    private static int m20571e(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    /* renamed from: e */
    private static Pair<Integer, Integer> m20572e(String str, String[] strArr) {
        int g;
        if (strArr.length != 3) {
            C7755q.m22361c("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(C7759u.m22376a(Integer.parseInt(strArr[1], 16))) && (g = m20576g(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(g), 0);
            }
        } catch (NumberFormatException unused) {
            C7755q.m22361c("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* renamed from: e */
    private static boolean m20573e(MediaCodecInfo mediaCodecInfo) {
        if (C7728ai.f18249a >= 29) {
            return m20575f(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || (!lowerCase.startsWith("omx.") && !lowerCase.startsWith("c2."));
    }

    /* renamed from: f */
    private static int m20574f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    /* renamed from: f */
    private static boolean m20575f(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* renamed from: g */
    private static int m20576g(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: g */
    private static boolean m20577g(MediaCodecInfo mediaCodecInfo) {
        if (C7728ai.f18249a >= 29) {
            return m20578h(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return !lowerCase.startsWith("omx.google.") && !lowerCase.startsWith("c2.android.") && !lowerCase.startsWith("c2.google.");
    }

    /* renamed from: h */
    private static boolean m20578h(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }
}
