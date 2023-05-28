package com.applovin.exoplayer2.p197f;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p182c.C6924h;
import com.applovin.exoplayer2.p197f.C7385l;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7759u;

/* renamed from: com.applovin.exoplayer2.f.i */
public final class C7381i {

    /* renamed from: a */
    public final String f16875a;

    /* renamed from: b */
    public final String f16876b;

    /* renamed from: c */
    public final String f16877c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f16878d;

    /* renamed from: e */
    public final boolean f16879e;

    /* renamed from: f */
    public final boolean f16880f;

    /* renamed from: g */
    public final boolean f16881g;

    /* renamed from: h */
    public final boolean f16882h;

    /* renamed from: i */
    public final boolean f16883i;

    /* renamed from: j */
    public final boolean f16884j;

    /* renamed from: k */
    private final boolean f16885k;

    C7381i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f16875a = (String) C7717a.m22120b(str);
        this.f16876b = str2;
        this.f16877c = str3;
        this.f16878d = codecCapabilities;
        this.f16882h = z;
        this.f16883i = z2;
        this.f16884j = z3;
        this.f16879e = z4;
        this.f16880f = z5;
        this.f16881g = z6;
        this.f16885k = C7759u.m22380b(str2);
    }

    /* renamed from: a */
    private static int m20418a(String str, String str2, int i) {
        if (i > 1 || ((C7728ai.f18249a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        C7755q.m22361c("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    /* renamed from: a */
    private static Point m20419a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C7728ai.m22179a(i, widthAlignment) * widthAlignment, C7728ai.m22179a(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: a */
    public static C7381i m20420a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new C7381i(str, str2, str3, codecCapabilities, z, z2, z3, !z4 && codecCapabilities != null && m20422a(codecCapabilities) && !m20427c(str), codecCapabilities != null && m20426c(codecCapabilities), z5 || (codecCapabilities != null && m20430e(codecCapabilities)));
    }

    /* renamed from: a */
    private void m20421a(String str) {
        C7755q.m22356a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f16875a + ", " + this.f16876b + "] [" + C7728ai.f18253e + "]");
    }

    /* renamed from: a */
    private static boolean m20422a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C7728ai.f18249a >= 19 && m20425b(codecCapabilities);
    }

    /* renamed from: a */
    private static boolean m20423a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point a = m20419a(videoCapabilities, i, i2);
        int i3 = a.x;
        int i4 = a.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* renamed from: b */
    private void m20424b(String str) {
        C7755q.m22356a("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f16875a + ", " + this.f16876b + "] [" + C7728ai.f18253e + "]");
    }

    /* renamed from: b */
    private static boolean m20425b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: c */
    private static boolean m20426c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C7728ai.f18249a >= 21 && m20428d(codecCapabilities);
    }

    /* renamed from: c */
    private static boolean m20427c(String str) {
        return C7728ai.f18249a <= 22 && ("ODROID-XU3".equals(C7728ai.f18252d) || "Nexus 10".equals(C7728ai.f18252d)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str));
    }

    /* renamed from: d */
    private static boolean m20428d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: d */
    private static boolean m20429d(String str) {
        return C7728ai.f18252d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* renamed from: e */
    private static boolean m20430e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C7728ai.f18249a >= 21 && m20432f(codecCapabilities);
    }

    /* renamed from: e */
    private static boolean m20431e(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: f */
    private static boolean m20432f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: f */
    private static final boolean m20433f(String str) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(C7728ai.f18250b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r3.getVideoCapabilities();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.media.MediaCodecInfo.CodecProfileLevel[] m20434g(android.media.MediaCodecInfo.CodecCapabilities r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0018
            android.media.MediaCodecInfo$VideoCapabilities r3 = r3.getVideoCapabilities()
            if (r3 == 0) goto L_0x0018
            android.util.Range r3 = r3.getBitrateRange()
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            r1 = 180000000(0xaba9500, float:1.7967196E-32)
            r2 = 1
            if (r3 < r1) goto L_0x0022
            r3 = 1024(0x400, float:1.435E-42)
            goto L_0x0069
        L_0x0022:
            r1 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r3 < r1) goto L_0x002a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x0069
        L_0x002a:
            r1 = 60000000(0x3938700, float:8.670878E-37)
            if (r3 < r1) goto L_0x0032
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0032:
            r1 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r3 < r1) goto L_0x003a
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0069
        L_0x003a:
            r1 = 18000000(0x112a880, float:2.6936858E-38)
            if (r3 < r1) goto L_0x0042
            r3 = 64
            goto L_0x0069
        L_0x0042:
            r1 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r3 < r1) goto L_0x004a
            r3 = 32
            goto L_0x0069
        L_0x004a:
            r1 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r3 < r1) goto L_0x0052
            r3 = 16
            goto L_0x0069
        L_0x0052:
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            if (r3 < r1) goto L_0x005a
            r3 = 8
            goto L_0x0069
        L_0x005a:
            r1 = 1800000(0x1b7740, float:2.522337E-39)
            if (r3 < r1) goto L_0x0061
            r3 = 4
            goto L_0x0069
        L_0x0061:
            r1 = 800000(0xc3500, float:1.121039E-39)
            if (r3 < r1) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            android.media.MediaCodecInfo$CodecProfileLevel r1 = new android.media.MediaCodecInfo$CodecProfileLevel
            r1.<init>()
            r1.profile = r2
            r1.level = r3
            android.media.MediaCodecInfo$CodecProfileLevel[] r3 = new android.media.MediaCodecInfo.CodecProfileLevel[r2]
            r3[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p197f.C7381i.m20434g(android.media.MediaCodecInfo$CodecCapabilities):android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    /* renamed from: a */
    public Point mo54159a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16878d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m20419a(videoCapabilities, i, i2);
    }

    /* renamed from: a */
    public C6924h mo54160a(C7864v vVar, C7864v vVar2) {
        int i = !C7728ai.m22218a((Object) vVar.f18921l, (Object) vVar2.f18921l) ? 8 : 0;
        if (this.f16885k) {
            if (vVar.f18929t != vVar2.f18929t) {
                i |= 1024;
            }
            if (!this.f16879e && !(vVar.f18926q == vVar2.f18926q && vVar.f18927r == vVar2.f18927r)) {
                i |= 512;
            }
            if (!C7728ai.m22218a((Object) vVar.f18933x, (Object) vVar2.f18933x)) {
                i |= 2048;
            }
            if (m20429d(this.f16875a) && !vVar.mo55410a(vVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new C6924h(this.f16875a, vVar, vVar2, vVar.mo55410a(vVar2) ? 3 : 2, 0);
            }
        } else {
            if (vVar.f18934y != vVar2.f18934y) {
                i |= 4096;
            }
            if (vVar.f18935z != vVar2.f18935z) {
                i |= 8192;
            }
            if (vVar.f18904A != vVar2.f18904A) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f16876b)) {
                Pair<Integer, Integer> a = C7385l.m20544a(vVar);
                Pair<Integer, Integer> a2 = C7385l.m20544a(vVar2);
                if (!(a == null || a2 == null)) {
                    int intValue = ((Integer) a.first).intValue();
                    int intValue2 = ((Integer) a2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C6924h(this.f16875a, vVar, vVar2, 3, 0);
                    }
                }
            }
            if (!vVar.mo55410a(vVar2)) {
                i |= 32;
            }
            if (m20431e(this.f16876b)) {
                i |= 2;
            }
            if (i == 0) {
                return new C6924h(this.f16875a, vVar, vVar2, 1, 0);
            }
        }
        return new C6924h(this.f16875a, vVar, vVar2, 0, i);
    }

    /* renamed from: a */
    public boolean mo54161a(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16878d;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i)) {
                return true;
            } else {
                str = "sampleRate.support, " + i;
            }
        }
        m20421a(str);
        return false;
    }

    /* renamed from: a */
    public boolean mo54162a(int i, int i2, double d) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16878d;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else if (m20423a(videoCapabilities, i, i2, d)) {
                return true;
            } else {
                if (i >= i2 || !m20433f(this.f16875a) || !m20423a(videoCapabilities, i2, i, d)) {
                    str = "sizeAndRate.support, " + i + "x" + i2 + "x" + d;
                } else {
                    m20424b("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
                    return true;
                }
            }
        }
        m20421a(str);
        return false;
    }

    /* renamed from: a */
    public boolean mo54163a(C7864v vVar) throws C7385l.C7388b {
        boolean z = false;
        if (!mo54167b(vVar)) {
            return false;
        }
        if (!this.f16885k) {
            if (C7728ai.f18249a >= 21) {
                if (vVar.f18935z == -1 || mo54161a(vVar.f18935z)) {
                    return vVar.f18934y == -1 || mo54166b(vVar.f18934y);
                }
                return false;
            }
        } else if (vVar.f18926q <= 0 || vVar.f18927r <= 0) {
            return true;
        } else {
            if (C7728ai.f18249a >= 21) {
                return mo54162a(vVar.f18926q, vVar.f18927r, (double) vVar.f18928s);
            }
            if (vVar.f18926q * vVar.f18927r <= C7385l.m20557b()) {
                z = true;
            }
            if (!z) {
                m20421a("legacyFrameSize, " + vVar.f18926q + "x" + vVar.f18927r);
            }
            return z;
        }
    }

    /* renamed from: a */
    public MediaCodecInfo.CodecProfileLevel[] mo54164a() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16878d;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.f16878d.profileLevels;
    }

    /* renamed from: b */
    public boolean mo54165b() {
        if (C7728ai.f18249a >= 29 && "video/x-vnd.on2.vp9".equals(this.f16876b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mo54164a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo54166b(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16878d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else if (m20418a(this.f16875a, this.f16876b, audioCapabilities.getMaxInputChannelCount()) >= i) {
                return true;
            } else {
                str = "channelCount.support, " + i;
            }
        }
        m20421a(str);
        return false;
    }

    /* renamed from: b */
    public boolean mo54167b(C7864v vVar) {
        String d;
        StringBuilder sb;
        String str;
        if (vVar.f18918i == null || this.f16876b == null || (d = C7759u.m22382d(vVar.f18918i)) == null) {
            return true;
        }
        if (!this.f16876b.equals(d)) {
            sb = new StringBuilder();
            str = "codec.mime ";
        } else {
            Pair<Integer, Integer> a = C7385l.m20544a(vVar);
            if (a == null) {
                return true;
            }
            int intValue = ((Integer) a.first).intValue();
            int intValue2 = ((Integer) a.second).intValue();
            if (!this.f16885k && intValue != 42) {
                return true;
            }
            MediaCodecInfo.CodecProfileLevel[] a2 = mo54164a();
            if (C7728ai.f18249a <= 23 && "video/x-vnd.on2.vp9".equals(this.f16876b) && a2.length == 0) {
                a2 = m20434g(this.f16878d);
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a2) {
                if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                    return true;
                }
            }
            sb = new StringBuilder();
            str = "codec.profileLevel, ";
        }
        sb.append(str);
        sb.append(vVar.f18918i);
        sb.append(", ");
        sb.append(d);
        m20421a(sb.toString());
        return false;
    }

    /* renamed from: c */
    public boolean mo54168c(C7864v vVar) {
        if (this.f16885k) {
            return this.f16879e;
        }
        Pair<Integer, Integer> a = C7385l.m20544a(vVar);
        return a != null && ((Integer) a.first).intValue() == 42;
    }

    public String toString() {
        return this.f16875a;
    }
}
