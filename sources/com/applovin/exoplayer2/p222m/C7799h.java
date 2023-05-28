package com.applovin.exoplayer2.p222m;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.applovin.exoplayer2.C6829as;
import com.applovin.exoplayer2.C7819p;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.C7867w;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p182c.C6924h;
import com.applovin.exoplayer2.p197f.C7376g;
import com.applovin.exoplayer2.p197f.C7380h;
import com.applovin.exoplayer2.p197f.C7381i;
import com.applovin.exoplayer2.p197f.C7382j;
import com.applovin.exoplayer2.p197f.C7384k;
import com.applovin.exoplayer2.p197f.C7385l;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7727ah;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7758t;
import com.applovin.exoplayer2.p221l.C7759u;
import com.applovin.exoplayer2.p222m.C7814n;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.applovin.exoplayer2.m.h */
public class C7799h extends C7382j {

    /* renamed from: c */
    private static final int[] f18449c = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: d */
    private static boolean f18450d;

    /* renamed from: e */
    private static boolean f18451e;

    /* renamed from: A */
    private int f18452A;

    /* renamed from: B */
    private long f18453B;

    /* renamed from: C */
    private long f18454C;

    /* renamed from: D */
    private long f18455D;

    /* renamed from: E */
    private int f18456E;

    /* renamed from: F */
    private int f18457F;

    /* renamed from: G */
    private int f18458G;

    /* renamed from: H */
    private int f18459H;

    /* renamed from: I */
    private float f18460I;

    /* renamed from: J */
    private C7816o f18461J;

    /* renamed from: K */
    private boolean f18462K;

    /* renamed from: L */
    private int f18463L;

    /* renamed from: M */
    private C7806l f18464M;

    /* renamed from: b */
    C7801b f18465b;

    /* renamed from: f */
    private final Context f18466f;

    /* renamed from: g */
    private final C7807m f18467g;

    /* renamed from: h */
    private final C7814n.C7815a f18468h;

    /* renamed from: i */
    private final long f18469i;

    /* renamed from: j */
    private final int f18470j;

    /* renamed from: k */
    private final boolean f18471k;

    /* renamed from: l */
    private C7800a f18472l;

    /* renamed from: m */
    private boolean f18473m;

    /* renamed from: n */
    private boolean f18474n;

    /* renamed from: o */
    private Surface f18475o;

    /* renamed from: p */
    private C7792d f18476p;

    /* renamed from: q */
    private boolean f18477q;

    /* renamed from: r */
    private int f18478r;

    /* renamed from: s */
    private boolean f18479s;

    /* renamed from: t */
    private boolean f18480t;

    /* renamed from: u */
    private boolean f18481u;

    /* renamed from: v */
    private long f18482v;

    /* renamed from: w */
    private long f18483w;

    /* renamed from: x */
    private long f18484x;

    /* renamed from: y */
    private int f18485y;

    /* renamed from: z */
    private int f18486z;

    /* renamed from: com.applovin.exoplayer2.m.h$a */
    protected static final class C7800a {

        /* renamed from: a */
        public final int f18487a;

        /* renamed from: b */
        public final int f18488b;

        /* renamed from: c */
        public final int f18489c;

        public C7800a(int i, int i2, int i3) {
            this.f18487a = i;
            this.f18488b = i2;
            this.f18489c = i3;
        }
    }

    /* renamed from: com.applovin.exoplayer2.m.h$b */
    private final class C7801b implements Handler.Callback, C7376g.C7379c {

        /* renamed from: b */
        private final Handler f18491b;

        public C7801b(C7376g gVar) {
            Handler a = C7728ai.m22195a((Handler.Callback) this);
            this.f18491b = a;
            gVar.mo54116a((C7376g.C7379c) this, a);
        }

        /* renamed from: a */
        private void m22641a(long j) {
            if (this == C7799h.this.f18465b) {
                if (j == Long.MAX_VALUE) {
                    C7799h.this.m22572R();
                    return;
                }
                try {
                    C7799h.this.mo55182e(j);
                } catch (C7819p e) {
                    C7799h.this.mo54184a(e);
                }
            }
        }

        /* renamed from: a */
        public void mo54158a(C7376g gVar, long j, long j2) {
            if (C7728ai.f18249a < 30) {
                this.f18491b.sendMessageAtFrontOfQueue(Message.obtain(this.f18491b, 0, (int) (j >> 32), (int) j));
                return;
            }
            m22641a(j);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m22641a(C7728ai.m22230b(message.arg1, message.arg2));
            return true;
        }
    }

    public C7799h(Context context, C7376g.C7378b bVar, C7384k kVar, long j, boolean z, Handler handler, C7814n nVar, int i) {
        super(2, bVar, kVar, z, 30.0f);
        this.f18469i = j;
        this.f18470j = i;
        Context applicationContext = context.getApplicationContext();
        this.f18466f = applicationContext;
        this.f18467g = new C7807m(applicationContext);
        this.f18468h = new C7814n.C7815a(handler, nVar);
        this.f18471k = m22589aa();
        this.f18483w = -9223372036854775807L;
        this.f18457F = -1;
        this.f18458G = -1;
        this.f18460I = -1.0f;
        this.f18478r = 1;
        this.f18463L = 0;
        m22576V();
    }

    public C7799h(Context context, C7384k kVar, long j, boolean z, Handler handler, C7814n nVar, int i) {
        this(context, C7376g.C7378b.f16872a, kVar, j, z, handler, nVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m22572R() {
        mo54181P();
    }

    /* renamed from: S */
    private void m22573S() {
        this.f18483w = this.f18469i > 0 ? SystemClock.elapsedRealtime() + this.f18469i : -9223372036854775807L;
    }

    /* renamed from: T */
    private void m22574T() {
        C7376g G;
        this.f18479s = false;
        if (C7728ai.f18249a >= 23 && this.f18462K && (G = mo54172G()) != null) {
            this.f18465b = new C7801b(G);
        }
    }

    /* renamed from: U */
    private void m22575U() {
        if (this.f18477q) {
            this.f18468h.mo55217a((Object) this.f18475o);
        }
    }

    /* renamed from: V */
    private void m22576V() {
        this.f18461J = null;
    }

    /* renamed from: W */
    private void m22577W() {
        if (this.f18457F != -1 || this.f18458G != -1) {
            C7816o oVar = this.f18461J;
            if (oVar == null || oVar.f18544b != this.f18457F || this.f18461J.f18545c != this.f18458G || this.f18461J.f18546d != this.f18459H || this.f18461J.f18547e != this.f18460I) {
                C7816o oVar2 = new C7816o(this.f18457F, this.f18458G, this.f18459H, this.f18460I);
                this.f18461J = oVar2;
                this.f18468h.mo55214a(oVar2);
            }
        }
    }

    /* renamed from: X */
    private void m22578X() {
        C7816o oVar = this.f18461J;
        if (oVar != null) {
            this.f18468h.mo55214a(oVar);
        }
    }

    /* renamed from: Y */
    private void m22579Y() {
        if (this.f18485y > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f18468h.mo55211a(this.f18485y, elapsedRealtime - this.f18484x);
            this.f18485y = 0;
            this.f18484x = elapsedRealtime;
        }
    }

    /* renamed from: Z */
    private void m22580Z() {
        int i = this.f18456E;
        if (i != 0) {
            this.f18468h.mo55212a(this.f18455D, i);
            this.f18455D = 0;
            this.f18456E = 0;
        }
    }

    /* renamed from: a */
    protected static int m22581a(C7381i iVar, C7864v vVar) {
        if (vVar.f18922m == -1) {
            return m22593c(iVar, vVar);
        }
        int size = vVar.f18923n.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += vVar.f18923n.get(i2).length;
        }
        return vVar.f18922m + i;
    }

    /* renamed from: a */
    private static List<C7381i> m22582a(C7384k kVar, C7864v vVar, boolean z, boolean z2) throws C7385l.C7388b {
        Pair<Integer, Integer> a;
        String str;
        String str2 = vVar.f18921l;
        if (str2 == null) {
            return Collections.emptyList();
        }
        List<C7381i> a2 = C7385l.m20552a(kVar.getDecoderInfos(str2, z, z2), vVar);
        if ("video/dolby-vision".equals(str2) && (a = C7385l.m20544a(vVar)) != null) {
            int intValue = ((Integer) a.first).intValue();
            if (intValue == 16 || intValue == 256) {
                str = "video/hevc";
            } else if (intValue == 512) {
                str = "video/avc";
            }
            a2.addAll(kVar.getDecoderInfos(str, z, z2));
        }
        return Collections.unmodifiableList(a2);
    }

    /* renamed from: a */
    private void m22583a(long j, long j2, C7864v vVar) {
        C7806l lVar = this.f18464M;
        if (lVar != null) {
            lVar.mo52889a(j, j2, vVar, mo54173H());
        }
    }

    /* renamed from: a */
    private static void m22584a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* renamed from: a */
    private static void m22585a(C7376g gVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        gVar.mo54114a(bundle);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22588a(java.lang.Object r5) throws com.applovin.exoplayer2.C7819p {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.view.Surface
            if (r0 == 0) goto L_0x0007
            android.view.Surface r5 = (android.view.Surface) r5
            goto L_0x0008
        L_0x0007:
            r5 = 0
        L_0x0008:
            if (r5 != 0) goto L_0x0026
            com.applovin.exoplayer2.m.d r0 = r4.f18476p
            if (r0 == 0) goto L_0x0010
            r5 = r0
            goto L_0x0026
        L_0x0010:
            com.applovin.exoplayer2.f.i r0 = r4.mo54174I()
            if (r0 == 0) goto L_0x0026
            boolean r1 = r4.m22592b((com.applovin.exoplayer2.p197f.C7381i) r0)
            if (r1 == 0) goto L_0x0026
            android.content.Context r5 = r4.f18466f
            boolean r0 = r0.f16881g
            com.applovin.exoplayer2.m.d r5 = com.applovin.exoplayer2.p222m.C7792d.m22550a(r5, r0)
            r4.f18476p = r5
        L_0x0026:
            android.view.Surface r0 = r4.f18475o
            if (r0 == r5) goto L_0x006e
            r4.f18475o = r5
            com.applovin.exoplayer2.m.m r0 = r4.f18467g
            r0.mo55195a((android.view.Surface) r5)
            r0 = 0
            r4.f18477q = r0
            int r0 = r4.mo52835d_()
            com.applovin.exoplayer2.f.g r1 = r4.mo54172G()
            if (r1 == 0) goto L_0x0054
            int r2 = com.applovin.exoplayer2.p221l.C7728ai.f18249a
            r3 = 23
            if (r2 < r3) goto L_0x004e
            if (r5 == 0) goto L_0x004e
            boolean r2 = r4.f18473m
            if (r2 != 0) goto L_0x004e
            r4.mo55173a((com.applovin.exoplayer2.p197f.C7376g) r1, (android.view.Surface) r5)
            goto L_0x0054
        L_0x004e:
            r4.mo54175J()
            r4.mo54170E()
        L_0x0054:
            if (r5 == 0) goto L_0x0067
            com.applovin.exoplayer2.m.d r1 = r4.f18476p
            if (r5 == r1) goto L_0x0067
            r4.m22578X()
            r4.m22574T()
            r5 = 2
            if (r0 != r5) goto L_0x007a
            r4.m22573S()
            goto L_0x007a
        L_0x0067:
            r4.m22576V()
            r4.m22574T()
            goto L_0x007a
        L_0x006e:
            if (r5 == 0) goto L_0x007a
            com.applovin.exoplayer2.m.d r0 = r4.f18476p
            if (r5 == r0) goto L_0x007a
            r4.m22578X()
            r4.m22575U()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p222m.C7799h.m22588a(java.lang.Object):void");
    }

    /* renamed from: aa */
    private static boolean m22589aa() {
        return "NVIDIA".equals(C7728ai.f18251c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0343, code lost:
        if (r0.equals("602LV") != false) goto L_0x0705;
     */
    /* renamed from: ab */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m22590ab() {
        /*
            int r0 = com.applovin.exoplayer2.p221l.C7728ai.f18249a
            r1 = 4
            r2 = 5
            r3 = 3
            r4 = 6
            r5 = 28
            r6 = -1
            r7 = 2
            r8 = 0
            r9 = 1
            if (r0 > r5) goto L_0x0064
            java.lang.String r0 = com.applovin.exoplayer2.p221l.C7728ai.f18250b
            int r10 = r0.hashCode()
            switch(r10) {
                case -1339091551: goto L_0x0054;
                case -1220081023: goto L_0x004a;
                case -1220066608: goto L_0x0040;
                case -1012436106: goto L_0x0036;
                case -64886864: goto L_0x002c;
                case 3415681: goto L_0x0022;
                case 825323514: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x005e
        L_0x0018:
            java.lang.String r10 = "machuca"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 4
            goto L_0x005f
        L_0x0022:
            java.lang.String r10 = "once"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 5
            goto L_0x005f
        L_0x002c:
            java.lang.String r10 = "magnolia"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 3
            goto L_0x005f
        L_0x0036:
            java.lang.String r10 = "oneday"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 6
            goto L_0x005f
        L_0x0040:
            java.lang.String r10 = "dangalUHD"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x004a:
            java.lang.String r10 = "dangalFHD"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 2
            goto L_0x005f
        L_0x0054:
            java.lang.String r10 = "dangal"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 0
            goto L_0x005f
        L_0x005e:
            r0 = -1
        L_0x005f:
            switch(r0) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0063;
                case 2: goto L_0x0063;
                case 3: goto L_0x0063;
                case 4: goto L_0x0063;
                case 5: goto L_0x0063;
                case 6: goto L_0x0063;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x0064
        L_0x0063:
            return r9
        L_0x0064:
            int r0 = com.applovin.exoplayer2.p221l.C7728ai.f18249a
            r10 = 27
            if (r0 > r10) goto L_0x0075
            java.lang.String r0 = com.applovin.exoplayer2.p221l.C7728ai.f18250b
            java.lang.String r11 = "HWEML"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0075
            return r9
        L_0x0075:
            int r0 = com.applovin.exoplayer2.p221l.C7728ai.f18249a
            r11 = 26
            if (r0 > r11) goto L_0x0745
            java.lang.String r0 = com.applovin.exoplayer2.p221l.C7728ai.f18250b
            int r12 = r0.hashCode()
            switch(r12) {
                case -2144781245: goto L_0x06f9;
                case -2144781185: goto L_0x06ee;
                case -2144781160: goto L_0x06e3;
                case -2097309513: goto L_0x06d8;
                case -2022874474: goto L_0x06cd;
                case -1978993182: goto L_0x06c2;
                case -1978990237: goto L_0x06b7;
                case -1936688988: goto L_0x06ac;
                case -1936688066: goto L_0x06a1;
                case -1936688065: goto L_0x0695;
                case -1931988508: goto L_0x0689;
                case -1885099851: goto L_0x067d;
                case -1696512866: goto L_0x0671;
                case -1680025915: goto L_0x0665;
                case -1615810839: goto L_0x0659;
                case -1600724499: goto L_0x064d;
                case -1554255044: goto L_0x0641;
                case -1481772737: goto L_0x0635;
                case -1481772730: goto L_0x0629;
                case -1481772729: goto L_0x061d;
                case -1320080169: goto L_0x0611;
                case -1217592143: goto L_0x0605;
                case -1180384755: goto L_0x05f9;
                case -1139198265: goto L_0x05ed;
                case -1052835013: goto L_0x05e1;
                case -993250464: goto L_0x05d6;
                case -993250458: goto L_0x05cb;
                case -965403638: goto L_0x05bf;
                case -958336948: goto L_0x05b3;
                case -879245230: goto L_0x05a7;
                case -842500323: goto L_0x059b;
                case -821392978: goto L_0x058f;
                case -797483286: goto L_0x0583;
                case -794946968: goto L_0x0577;
                case -788334647: goto L_0x056b;
                case -782144577: goto L_0x055f;
                case -575125681: goto L_0x0553;
                case -521118391: goto L_0x0547;
                case -430914369: goto L_0x053b;
                case -290434366: goto L_0x052f;
                case -282781963: goto L_0x0523;
                case -277133239: goto L_0x0517;
                case -173639913: goto L_0x050b;
                case -56598463: goto L_0x04ff;
                case 2126: goto L_0x04f3;
                case 2564: goto L_0x04e7;
                case 2715: goto L_0x04db;
                case 2719: goto L_0x04cf;
                case 3091: goto L_0x04c3;
                case 3483: goto L_0x04b7;
                case 73405: goto L_0x04ab;
                case 75537: goto L_0x049f;
                case 75739: goto L_0x0493;
                case 76779: goto L_0x0487;
                case 78669: goto L_0x047b;
                case 79305: goto L_0x046f;
                case 80618: goto L_0x0463;
                case 88274: goto L_0x0457;
                case 98846: goto L_0x044b;
                case 98848: goto L_0x043f;
                case 99329: goto L_0x0433;
                case 101481: goto L_0x0427;
                case 1513190: goto L_0x041c;
                case 1514184: goto L_0x0411;
                case 1514185: goto L_0x0406;
                case 2133089: goto L_0x03fa;
                case 2133091: goto L_0x03ee;
                case 2133120: goto L_0x03e2;
                case 2133151: goto L_0x03d6;
                case 2133182: goto L_0x03ca;
                case 2133184: goto L_0x03be;
                case 2436959: goto L_0x03b2;
                case 2463773: goto L_0x03a6;
                case 2464648: goto L_0x039a;
                case 2689555: goto L_0x038e;
                case 3154429: goto L_0x0382;
                case 3284551: goto L_0x0376;
                case 3351335: goto L_0x036a;
                case 3386211: goto L_0x035e;
                case 41325051: goto L_0x0352;
                case 51349633: goto L_0x0347;
                case 51350594: goto L_0x033d;
                case 55178625: goto L_0x0331;
                case 61542055: goto L_0x0326;
                case 65355429: goto L_0x031a;
                case 66214468: goto L_0x030e;
                case 66214470: goto L_0x0302;
                case 66214473: goto L_0x02f6;
                case 66215429: goto L_0x02ea;
                case 66215431: goto L_0x02de;
                case 66215433: goto L_0x02d2;
                case 66216390: goto L_0x02c6;
                case 76402249: goto L_0x02ba;
                case 76404105: goto L_0x02ae;
                case 76404911: goto L_0x02a2;
                case 80963634: goto L_0x0296;
                case 82882791: goto L_0x028a;
                case 98715550: goto L_0x027e;
                case 101370885: goto L_0x0272;
                case 102844228: goto L_0x0266;
                case 165221241: goto L_0x025a;
                case 182191441: goto L_0x024e;
                case 245388979: goto L_0x0242;
                case 287431619: goto L_0x0236;
                case 307593612: goto L_0x022a;
                case 308517133: goto L_0x021e;
                case 316215098: goto L_0x0212;
                case 316215116: goto L_0x0206;
                case 316246811: goto L_0x01fa;
                case 316246818: goto L_0x01ee;
                case 407160593: goto L_0x01e2;
                case 507412548: goto L_0x01d6;
                case 793982701: goto L_0x01ca;
                case 794038622: goto L_0x01be;
                case 794040393: goto L_0x01b2;
                case 835649806: goto L_0x01a6;
                case 917340916: goto L_0x019a;
                case 958008161: goto L_0x018e;
                case 1060579533: goto L_0x0182;
                case 1150207623: goto L_0x0176;
                case 1176899427: goto L_0x016a;
                case 1280332038: goto L_0x015e;
                case 1306947716: goto L_0x0152;
                case 1349174697: goto L_0x0146;
                case 1522194893: goto L_0x013a;
                case 1691543273: goto L_0x012e;
                case 1691544261: goto L_0x0122;
                case 1709443163: goto L_0x0116;
                case 1865889110: goto L_0x010a;
                case 1906253259: goto L_0x00fe;
                case 1977196784: goto L_0x00f2;
                case 2006372676: goto L_0x00e6;
                case 2019281702: goto L_0x00da;
                case 2029784656: goto L_0x00ce;
                case 2030379515: goto L_0x00c2;
                case 2033393791: goto L_0x00b6;
                case 2047190025: goto L_0x00aa;
                case 2047252157: goto L_0x009e;
                case 2048319463: goto L_0x0092;
                case 2048855701: goto L_0x0086;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x0704
        L_0x0086:
            java.lang.String r1 = "HWWAS-H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 66
            goto L_0x0705
        L_0x0092:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 65
            goto L_0x0705
        L_0x009e:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 33
            goto L_0x0705
        L_0x00aa:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 32
            goto L_0x0705
        L_0x00b6:
            java.lang.String r1 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 14
            goto L_0x0705
        L_0x00c2:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 64
            goto L_0x0705
        L_0x00ce:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 63
            goto L_0x0705
        L_0x00da:
            java.lang.String r1 = "DM-01K"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 29
            goto L_0x0705
        L_0x00e6:
            java.lang.String r1 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 19
            goto L_0x0705
        L_0x00f2:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 69
            goto L_0x0705
        L_0x00fe:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 100
            goto L_0x0705
        L_0x010a:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x0705
        L_0x0116:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 68
            goto L_0x0705
        L_0x0122:
            java.lang.String r1 = "CPH1715"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 24
            goto L_0x0705
        L_0x012e:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 23
            goto L_0x0705
        L_0x013a:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 133(0x85, float:1.86E-43)
            goto L_0x0705
        L_0x0146:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 61
            goto L_0x0705
        L_0x0152:
            java.lang.String r1 = "EverStar_S"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 35
            goto L_0x0705
        L_0x015e:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 62
            goto L_0x0705
        L_0x016a:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 71
            goto L_0x0705
        L_0x0176:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 78
            goto L_0x0705
        L_0x0182:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 96
            goto L_0x0705
        L_0x018e:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 72
            goto L_0x0705
        L_0x019a:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 10
            goto L_0x0705
        L_0x01a6:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 81
            goto L_0x0705
        L_0x01b2:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 59
            goto L_0x0705
        L_0x01be:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 58
            goto L_0x0705
        L_0x01ca:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 57
            goto L_0x0705
        L_0x01d6:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x0705
        L_0x01e2:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x0705
        L_0x01ee:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 125(0x7d, float:1.75E-43)
            goto L_0x0705
        L_0x01fa:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 124(0x7c, float:1.74E-43)
            goto L_0x0705
        L_0x0206:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 123(0x7b, float:1.72E-43)
            goto L_0x0705
        L_0x0212:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 122(0x7a, float:1.71E-43)
            goto L_0x0705
        L_0x021e:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 12
            goto L_0x0705
        L_0x022a:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 11
            goto L_0x0705
        L_0x0236:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 60
            goto L_0x0705
        L_0x0242:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 82
            goto L_0x0705
        L_0x024e:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 25
            goto L_0x0705
        L_0x025a:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 8
            goto L_0x0705
        L_0x0266:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 77
            goto L_0x0705
        L_0x0272:
            java.lang.String r1 = "l5460"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 76
            goto L_0x0705
        L_0x027e:
            java.lang.String r1 = "i9031"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 67
            goto L_0x0705
        L_0x028a:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 135(0x87, float:1.89E-43)
            goto L_0x0705
        L_0x0296:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x0705
        L_0x02a2:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x0705
        L_0x02ae:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x0705
        L_0x02ba:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x0705
        L_0x02c6:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 48
            goto L_0x0705
        L_0x02d2:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 47
            goto L_0x0705
        L_0x02de:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 46
            goto L_0x0705
        L_0x02ea:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 45
            goto L_0x0705
        L_0x02f6:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 44
            goto L_0x0705
        L_0x0302:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 43
            goto L_0x0705
        L_0x030e:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 42
            goto L_0x0705
        L_0x031a:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 30
            goto L_0x0705
        L_0x0326:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 7
            goto L_0x0705
        L_0x0331:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 15
            goto L_0x0705
        L_0x033d:
            java.lang.String r2 = "602LV"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0704
            goto L_0x0705
        L_0x0347:
            java.lang.String r1 = "601LV"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 3
            goto L_0x0705
        L_0x0352:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 83
            goto L_0x0705
        L_0x035e:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 92
            goto L_0x0705
        L_0x036a:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 85
            goto L_0x0705
        L_0x0376:
            java.lang.String r1 = "kate"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 75
            goto L_0x0705
        L_0x0382:
            java.lang.String r1 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 50
            goto L_0x0705
        L_0x038e:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 136(0x88, float:1.9E-43)
            goto L_0x0705
        L_0x039a:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x0705
        L_0x03a6:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x0705
        L_0x03b2:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 93
            goto L_0x0705
        L_0x03be:
            java.lang.String r1 = "F04J"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 41
            goto L_0x0705
        L_0x03ca:
            java.lang.String r1 = "F04H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 40
            goto L_0x0705
        L_0x03d6:
            java.lang.String r1 = "F03H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 39
            goto L_0x0705
        L_0x03e2:
            java.lang.String r1 = "F02H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 38
            goto L_0x0705
        L_0x03ee:
            java.lang.String r1 = "F01J"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 37
            goto L_0x0705
        L_0x03fa:
            java.lang.String r1 = "F01H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 36
            goto L_0x0705
        L_0x0406:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 2
            goto L_0x0705
        L_0x0411:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 1
            goto L_0x0705
        L_0x041c:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 0
            goto L_0x0705
        L_0x0427:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 49
            goto L_0x0705
        L_0x0433:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 28
            goto L_0x0705
        L_0x043f:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 27
            goto L_0x0705
        L_0x044b:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 26
            goto L_0x0705
        L_0x0457:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 139(0x8b, float:1.95E-43)
            goto L_0x0705
        L_0x0463:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x0705
        L_0x046f:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x0705
        L_0x047b:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 94
            goto L_0x0705
        L_0x0487:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 86
            goto L_0x0705
        L_0x0493:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 80
            goto L_0x0705
        L_0x049f:
            java.lang.String r1 = "M04"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 79
            goto L_0x0705
        L_0x04ab:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 73
            goto L_0x0705
        L_0x04b7:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 84
            goto L_0x0705
        L_0x04c3:
            java.lang.String r1 = "b5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 16
            goto L_0x0705
        L_0x04cf:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 129(0x81, float:1.81E-43)
            goto L_0x0705
        L_0x04db:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 127(0x7f, float:1.78E-43)
            goto L_0x0705
        L_0x04e7:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x0705
        L_0x04f3:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 20
            goto L_0x0705
        L_0x04ff:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 134(0x86, float:1.88E-43)
            goto L_0x0705
        L_0x050b:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 31
            goto L_0x0705
        L_0x0517:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 138(0x8a, float:1.93E-43)
            goto L_0x0705
        L_0x0523:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 17
            goto L_0x0705
        L_0x052f:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x0705
        L_0x053b:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x0705
        L_0x0547:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 53
            goto L_0x0705
        L_0x0553:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 51
            goto L_0x0705
        L_0x055f:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 91
            goto L_0x0705
        L_0x056b:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 132(0x84, float:1.85E-43)
            goto L_0x0705
        L_0x0577:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 131(0x83, float:1.84E-43)
            goto L_0x0705
        L_0x0583:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 119(0x77, float:1.67E-43)
            goto L_0x0705
        L_0x058f:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 9
            goto L_0x0705
        L_0x059b:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 88
            goto L_0x0705
        L_0x05a7:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 126(0x7e, float:1.77E-43)
            goto L_0x0705
        L_0x05b3:
            java.lang.String r1 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 34
            goto L_0x0705
        L_0x05bf:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 120(0x78, float:1.68E-43)
            goto L_0x0705
        L_0x05cb:
            java.lang.String r1 = "A10-70L"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 6
            goto L_0x0705
        L_0x05d6:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 5
            goto L_0x0705
        L_0x05e1:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 87
            goto L_0x0705
        L_0x05ed:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x0705
        L_0x05f9:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 70
            goto L_0x0705
        L_0x0605:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 18
            goto L_0x0705
        L_0x0611:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 52
            goto L_0x0705
        L_0x061d:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 99
            goto L_0x0705
        L_0x0629:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 98
            goto L_0x0705
        L_0x0635:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 97
            goto L_0x0705
        L_0x0641:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 130(0x82, float:1.82E-43)
            goto L_0x0705
        L_0x064d:
            java.lang.String r1 = "pacificrim"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 95
            goto L_0x0705
        L_0x0659:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x0705
        L_0x0665:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 21
            goto L_0x0705
        L_0x0671:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 137(0x89, float:1.92E-43)
            goto L_0x0705
        L_0x067d:
            java.lang.String r1 = "RAIJIN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x0705
        L_0x0689:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 13
            goto L_0x0705
        L_0x0695:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x0705
        L_0x06a1:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x0705
        L_0x06ac:
            java.lang.String r1 = "PGN528"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x0705
        L_0x06b7:
            java.lang.String r1 = "NX573J"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 90
            goto L_0x0705
        L_0x06c2:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 89
            goto L_0x0705
        L_0x06cd:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 22
            goto L_0x0705
        L_0x06d8:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 74
            goto L_0x0705
        L_0x06e3:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 56
            goto L_0x0705
        L_0x06ee:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 55
            goto L_0x0705
        L_0x06f9:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 54
            goto L_0x0705
        L_0x0704:
            r1 = -1
        L_0x0705:
            switch(r1) {
                case 0: goto L_0x070f;
                case 1: goto L_0x070f;
                case 2: goto L_0x070f;
                case 3: goto L_0x070f;
                case 4: goto L_0x070f;
                case 5: goto L_0x070f;
                case 6: goto L_0x070f;
                case 7: goto L_0x070f;
                case 8: goto L_0x070f;
                case 9: goto L_0x070f;
                case 10: goto L_0x070f;
                case 11: goto L_0x070f;
                case 12: goto L_0x070f;
                case 13: goto L_0x070f;
                case 14: goto L_0x070f;
                case 15: goto L_0x070f;
                case 16: goto L_0x070f;
                case 17: goto L_0x070f;
                case 18: goto L_0x070f;
                case 19: goto L_0x070f;
                case 20: goto L_0x070f;
                case 21: goto L_0x070f;
                case 22: goto L_0x070f;
                case 23: goto L_0x070f;
                case 24: goto L_0x070f;
                case 25: goto L_0x070f;
                case 26: goto L_0x070f;
                case 27: goto L_0x070f;
                case 28: goto L_0x070f;
                case 29: goto L_0x070f;
                case 30: goto L_0x070f;
                case 31: goto L_0x070f;
                case 32: goto L_0x070f;
                case 33: goto L_0x070f;
                case 34: goto L_0x070f;
                case 35: goto L_0x070f;
                case 36: goto L_0x070f;
                case 37: goto L_0x070f;
                case 38: goto L_0x070f;
                case 39: goto L_0x070f;
                case 40: goto L_0x070f;
                case 41: goto L_0x070f;
                case 42: goto L_0x070f;
                case 43: goto L_0x070f;
                case 44: goto L_0x070f;
                case 45: goto L_0x070f;
                case 46: goto L_0x070f;
                case 47: goto L_0x070f;
                case 48: goto L_0x070f;
                case 49: goto L_0x070f;
                case 50: goto L_0x070f;
                case 51: goto L_0x070f;
                case 52: goto L_0x070f;
                case 53: goto L_0x070f;
                case 54: goto L_0x070f;
                case 55: goto L_0x070f;
                case 56: goto L_0x070f;
                case 57: goto L_0x070f;
                case 58: goto L_0x070f;
                case 59: goto L_0x070f;
                case 60: goto L_0x070f;
                case 61: goto L_0x070f;
                case 62: goto L_0x070f;
                case 63: goto L_0x070f;
                case 64: goto L_0x070f;
                case 65: goto L_0x070f;
                case 66: goto L_0x070f;
                case 67: goto L_0x070f;
                case 68: goto L_0x070f;
                case 69: goto L_0x070f;
                case 70: goto L_0x070f;
                case 71: goto L_0x070f;
                case 72: goto L_0x070f;
                case 73: goto L_0x070f;
                case 74: goto L_0x070f;
                case 75: goto L_0x070f;
                case 76: goto L_0x070f;
                case 77: goto L_0x070f;
                case 78: goto L_0x070f;
                case 79: goto L_0x070f;
                case 80: goto L_0x070f;
                case 81: goto L_0x070f;
                case 82: goto L_0x070f;
                case 83: goto L_0x070f;
                case 84: goto L_0x070f;
                case 85: goto L_0x070f;
                case 86: goto L_0x070f;
                case 87: goto L_0x070f;
                case 88: goto L_0x070f;
                case 89: goto L_0x070f;
                case 90: goto L_0x070f;
                case 91: goto L_0x070f;
                case 92: goto L_0x070f;
                case 93: goto L_0x070f;
                case 94: goto L_0x070f;
                case 95: goto L_0x070f;
                case 96: goto L_0x070f;
                case 97: goto L_0x070f;
                case 98: goto L_0x070f;
                case 99: goto L_0x070f;
                case 100: goto L_0x070f;
                case 101: goto L_0x070f;
                case 102: goto L_0x070f;
                case 103: goto L_0x070f;
                case 104: goto L_0x070f;
                case 105: goto L_0x070f;
                case 106: goto L_0x070f;
                case 107: goto L_0x070f;
                case 108: goto L_0x070f;
                case 109: goto L_0x070f;
                case 110: goto L_0x070f;
                case 111: goto L_0x070f;
                case 112: goto L_0x070f;
                case 113: goto L_0x070f;
                case 114: goto L_0x070f;
                case 115: goto L_0x070f;
                case 116: goto L_0x070f;
                case 117: goto L_0x070f;
                case 118: goto L_0x070f;
                case 119: goto L_0x070f;
                case 120: goto L_0x070f;
                case 121: goto L_0x070f;
                case 122: goto L_0x070f;
                case 123: goto L_0x070f;
                case 124: goto L_0x070f;
                case 125: goto L_0x070f;
                case 126: goto L_0x070f;
                case 127: goto L_0x070f;
                case 128: goto L_0x070f;
                case 129: goto L_0x070f;
                case 130: goto L_0x070f;
                case 131: goto L_0x070f;
                case 132: goto L_0x070f;
                case 133: goto L_0x070f;
                case 134: goto L_0x070f;
                case 135: goto L_0x070f;
                case 136: goto L_0x070f;
                case 137: goto L_0x070f;
                case 138: goto L_0x070f;
                case 139: goto L_0x070f;
                default: goto L_0x0708;
            }
        L_0x0708:
            java.lang.String r0 = com.applovin.exoplayer2.p221l.C7728ai.f18252d
            int r1 = r0.hashCode()
            goto L_0x0710
        L_0x070f:
            return r9
        L_0x0710:
            r2 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r1 == r2) goto L_0x0734
            r2 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r1 == r2) goto L_0x072a
            r2 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r1 == r2) goto L_0x0720
            goto L_0x073d
        L_0x0720:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x073d
            r6 = 1
            goto L_0x073d
        L_0x072a:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x073d
            r6 = 0
            goto L_0x073d
        L_0x0734:
            java.lang.String r1 = "JSN-L21"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x073d
            r6 = 2
        L_0x073d:
            if (r6 == 0) goto L_0x0744
            if (r6 == r9) goto L_0x0744
            if (r6 == r7) goto L_0x0744
            goto L_0x0745
        L_0x0744:
            return r9
        L_0x0745:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p222m.C7799h.m22590ab():boolean");
    }

    /* renamed from: b */
    private static Point m22591b(C7381i iVar, C7864v vVar) {
        boolean z = vVar.f18927r > vVar.f18926q;
        int i = z ? vVar.f18927r : vVar.f18926q;
        int i2 = z ? vVar.f18926q : vVar.f18927r;
        float f = ((float) i2) / ((float) i);
        for (int i3 : f18449c) {
            int i4 = (int) (((float) i3) * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (C7728ai.f18249a >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point a = iVar.mo54159a(i5, i3);
                if (iVar.mo54162a(a.x, a.y, (double) vVar.f18928s)) {
                    return a;
                }
            } else {
                try {
                    int a2 = C7728ai.m22179a(i3, 16) * 16;
                    int a3 = C7728ai.m22179a(i4, 16) * 16;
                    if (a2 * a3 <= C7385l.m20557b()) {
                        int i6 = z ? a3 : a2;
                        if (!z) {
                            a2 = a3;
                        }
                        return new Point(i6, a2);
                    }
                } catch (C7385l.C7388b unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private boolean m22592b(C7381i iVar) {
        return C7728ai.f18249a >= 23 && !this.f18462K && !mo55179b(iVar.f16875a) && (!iVar.f16881g || C7792d.m22551a(this.f18466f));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r12 = ((java.lang.Integer) r12.first).intValue();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m22593c(com.applovin.exoplayer2.p197f.C7381i r11, com.applovin.exoplayer2.C7864v r12) {
        /*
            int r0 = r12.f18926q
            int r1 = r12.f18927r
            r2 = -1
            if (r0 == r2) goto L_0x00d0
            if (r1 != r2) goto L_0x000b
            goto L_0x00d0
        L_0x000b:
            java.lang.String r3 = r12.f18921l
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/hevc"
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L_0x0034
            android.util.Pair r12 = com.applovin.exoplayer2.p197f.C7385l.m20544a((com.applovin.exoplayer2.C7864v) r12)
            if (r12 == 0) goto L_0x0033
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r12 == r3) goto L_0x0031
            if (r12 == r7) goto L_0x0031
            if (r12 != r8) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = r6
        L_0x0034:
            int r12 = r3.hashCode()
            r4 = 5
            r9 = 4
            r10 = 3
            switch(r12) {
                case -1664118616: goto L_0x006d;
                case -1662541442: goto L_0x0065;
                case 1187890754: goto L_0x005b;
                case 1331836730: goto L_0x0053;
                case 1599127256: goto L_0x0049;
                case 1599127257: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0077
        L_0x003f:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 5
            goto L_0x0078
        L_0x0049:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 3
            goto L_0x0078
        L_0x0053:
            boolean r12 = r3.equals(r5)
            if (r12 == 0) goto L_0x0077
            r12 = 2
            goto L_0x0078
        L_0x005b:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 1
            goto L_0x0078
        L_0x0065:
            boolean r12 = r3.equals(r6)
            if (r12 == 0) goto L_0x0077
            r12 = 4
            goto L_0x0078
        L_0x006d:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 0
            goto L_0x0078
        L_0x0077:
            r12 = -1
        L_0x0078:
            if (r12 == 0) goto L_0x00c7
            if (r12 == r7) goto L_0x00c7
            if (r12 == r8) goto L_0x0088
            if (r12 == r10) goto L_0x00c7
            if (r12 == r9) goto L_0x0085
            if (r12 == r4) goto L_0x0085
            return r2
        L_0x0085:
            int r0 = r0 * r1
            goto L_0x00ca
        L_0x0088:
            java.lang.String r12 = com.applovin.exoplayer2.p221l.C7728ai.f18252d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x00c6
            java.lang.String r12 = com.applovin.exoplayer2.p221l.C7728ai.f18251c
            java.lang.String r3 = "Amazon"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x00b5
            java.lang.String r12 = com.applovin.exoplayer2.p221l.C7728ai.f18252d
            java.lang.String r3 = "KFSOWI"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x00c6
            java.lang.String r12 = com.applovin.exoplayer2.p221l.C7728ai.f18252d
            java.lang.String r3 = "AFTS"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x00b5
            boolean r11 = r11.f16881g
            if (r11 == 0) goto L_0x00b5
            goto L_0x00c6
        L_0x00b5:
            r11 = 16
            int r12 = com.applovin.exoplayer2.p221l.C7728ai.m22179a((int) r0, (int) r11)
            int r0 = com.applovin.exoplayer2.p221l.C7728ai.m22179a((int) r1, (int) r11)
            int r12 = r12 * r0
            int r12 = r12 * 16
            int r0 = r12 * 16
            goto L_0x00c9
        L_0x00c6:
            return r2
        L_0x00c7:
            int r0 = r0 * r1
        L_0x00c9:
            r9 = 2
        L_0x00ca:
            int r0 = r0 * 3
            int r9 = r9 * 2
            int r0 = r0 / r9
            return r0
        L_0x00d0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p222m.C7799h.m22593c(com.applovin.exoplayer2.f.i, com.applovin.exoplayer2.v):int");
    }

    /* renamed from: g */
    private static boolean m22594g(long j) {
        return j < -30000;
    }

    /* renamed from: h */
    private static boolean m22595h(long j) {
        return j < -500000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo53033B() {
        this.f18481u = true;
        if (!this.f18479s) {
            this.f18479s = true;
            this.f18468h.mo55217a((Object) this.f18475o);
            this.f18477q = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo53034C() {
        super.mo53034C();
        m22574T();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public boolean mo54171F() {
        return this.f18462K && C7728ai.f18249a < 23;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo54178M() {
        super.mo54178M();
        this.f18452A = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo53036a(float f, C7864v vVar, C7864v[] vVarArr) {
        float f2 = -1.0f;
        for (C7864v vVar2 : vVarArr) {
            float f3 = vVar2.f18928s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo53038a(C7384k kVar, C7864v vVar) throws C7385l.C7388b {
        int i = 0;
        if (!C7759u.m22380b(vVar.f18921l)) {
            return C6829as.CC.m17728b(0);
        }
        boolean z = vVar.f18924o != null;
        List<C7381i> a = m22582a(kVar, vVar, z, false);
        if (z && a.isEmpty()) {
            a = m22582a(kVar, vVar, false, false);
        }
        if (a.isEmpty()) {
            return C6829as.CC.m17728b(1);
        }
        if (!m20474c(vVar)) {
            return C6829as.CC.m17728b(2);
        }
        C7381i iVar = a.get(0);
        boolean a2 = iVar.mo54163a(vVar);
        int i2 = iVar.mo54168c(vVar) ? 16 : 8;
        if (a2) {
            List<C7381i> a3 = m22582a(kVar, vVar, z, true);
            if (!a3.isEmpty()) {
                C7381i iVar2 = a3.get(0);
                if (iVar2.mo54163a(vVar) && iVar2.mo54168c(vVar)) {
                    i = 32;
                }
            }
        }
        return C6829as.CC.m17727a(a2 ? 4 : 3, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MediaFormat mo55169a(C7864v vVar, String str, C7800a aVar, float f, boolean z, int i) {
        Pair<Integer, Integer> a;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(IabUtils.KEY_WIDTH, vVar.f18926q);
        mediaFormat.setInteger(IabUtils.KEY_HEIGHT, vVar.f18927r);
        C7758t.m22375a(mediaFormat, vVar.f18923n);
        C7758t.m22372a(mediaFormat, "frame-rate", vVar.f18928s);
        C7758t.m22373a(mediaFormat, "rotation-degrees", vVar.f18929t);
        C7758t.m22371a(mediaFormat, vVar.f18933x);
        if ("video/dolby-vision".equals(vVar.f18921l) && (a = C7385l.m20544a(vVar)) != null) {
            C7758t.m22373a(mediaFormat, Scopes.PROFILE, ((Integer) a.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f18487a);
        mediaFormat.setInteger("max-height", aVar.f18488b);
        C7758t.m22373a(mediaFormat, "max-input-size", aVar.f18489c);
        if (C7728ai.f18249a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m22584a(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6924h mo53040a(C7381i iVar, C7864v vVar, C7864v vVar2) {
        C6924h a = iVar.mo54160a(vVar, vVar2);
        int i = a.f15344e;
        if (vVar2.f18926q > this.f18472l.f18487a || vVar2.f18927r > this.f18472l.f18488b) {
            i |= 256;
        }
        if (m22581a(iVar, vVar2) > this.f18472l.f18489c) {
            i |= 64;
        }
        int i2 = i;
        return new C6924h(iVar.f16875a, vVar, vVar2, i2 != 0 ? 0 : a.f15343d, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6924h mo53041a(C7867w wVar) throws C7819p {
        C6924h a = super.mo53041a(wVar);
        this.f18468h.mo55215a(wVar.f18967b, a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7376g.C7377a mo53042a(C7381i iVar, C7864v vVar, MediaCrypto mediaCrypto, float f) {
        C7792d dVar = this.f18476p;
        if (!(dVar == null || dVar.f18422a == iVar.f16881g)) {
            this.f18476p.release();
            this.f18476p = null;
        }
        String str = iVar.f16877c;
        C7800a a = mo55170a(iVar, vVar, mo53854u());
        this.f18472l = a;
        MediaFormat a2 = mo55169a(vVar, str, a, f, this.f18471k, this.f18462K ? this.f18463L : 0);
        if (this.f18475o == null) {
            if (m22592b(iVar)) {
                if (this.f18476p == null) {
                    this.f18476p = C7792d.m22550a(this.f18466f, iVar.f16881g);
                }
                this.f18475o = this.f18476p;
            } else {
                throw new IllegalStateException();
            }
        }
        return C7376g.C7377a.m20414a(iVar, a2, vVar, this.f18475o, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7380h mo54183a(Throwable th, C7381i iVar) {
        return new C7798g(th, iVar, this.f18475o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7800a mo55170a(C7381i iVar, C7864v vVar, C7864v[] vVarArr) {
        int c;
        int i = vVar.f18926q;
        int i2 = vVar.f18927r;
        int a = m22581a(iVar, vVar);
        if (vVarArr.length == 1) {
            if (!(a == -1 || (c = m22593c(iVar, vVar)) == -1)) {
                a = Math.min((int) (((float) a) * 1.5f), c);
            }
            return new C7800a(i, i2, a);
        }
        int length = vVarArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            C7864v vVar2 = vVarArr[i3];
            if (vVar.f18933x != null && vVar2.f18933x == null) {
                vVar2 = vVar2.mo55408a().mo55420a(vVar.f18933x).mo55424a();
            }
            if (iVar.mo54160a(vVar, vVar2).f15343d != 0) {
                z |= vVar2.f18926q == -1 || vVar2.f18927r == -1;
                i = Math.max(i, vVar2.f18926q);
                i2 = Math.max(i2, vVar2.f18927r);
                a = Math.max(a, m22581a(iVar, vVar2));
            }
        }
        if (z) {
            C7755q.m22361c("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point b = m22591b(iVar, vVar);
            if (b != null) {
                i = Math.max(i, b.x);
                i2 = Math.max(i2, b.y);
                a = Math.max(a, m22593c(iVar, vVar.mo55408a().mo55436g(i).mo55437h(i2).mo55424a()));
                C7755q.m22361c("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new C7800a(i, i2, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C7381i> mo53043a(C7384k kVar, C7864v vVar, boolean z) throws C7385l.C7388b {
        return m22582a(kVar, vVar, z, this.f18462K);
    }

    /* renamed from: a */
    public void mo52827a(float f, float f2) throws C7819p {
        super.mo52827a(f, f2);
        this.f18467g.mo55192a(f);
    }

    /* renamed from: a */
    public void mo52821a(int i, Object obj) throws C7819p {
        if (i == 1) {
            m22588a(obj);
        } else if (i == 7) {
            this.f18464M = (C7806l) obj;
        } else if (i == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f18463L != intValue) {
                this.f18463L = intValue;
                if (this.f18462K) {
                    mo54175J();
                }
            }
        } else if (i == 4) {
            this.f18478r = ((Integer) obj).intValue();
            C7376g G = mo54172G();
            if (G != null) {
                G.mo54121c(this.f18478r);
            }
        } else if (i != 5) {
            super.mo52821a(i, obj);
        } else {
            this.f18467g.mo55193a(((Integer) obj).intValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53044a(long j, boolean z) throws C7819p {
        super.mo53044a(j, z);
        m22574T();
        this.f18467g.mo55199c();
        this.f18453B = -9223372036854775807L;
        this.f18482v = -9223372036854775807L;
        this.f18486z = 0;
        if (z) {
            m22573S();
        } else {
            this.f18483w = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53046a(C6922g gVar) throws C7819p {
        if (!this.f18462K) {
            this.f18452A++;
        }
        if (C7728ai.f18249a < 23 && this.f18462K) {
            mo55182e(gVar.f15334d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55171a(C7376g gVar, int i, long j) {
        C7727ah.m22175a("skipVideoBuffer");
        gVar.mo54113a(i, false);
        C7727ah.m22174a();
        this.f16913a.f15325f++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55172a(C7376g gVar, int i, long j, long j2) {
        m22577W();
        C7727ah.m22175a("releaseOutputBuffer");
        gVar.mo54112a(i, j2);
        C7727ah.m22174a();
        this.f18454C = SystemClock.elapsedRealtime() * 1000;
        this.f16913a.f15324e++;
        this.f18486z = 0;
        mo53033B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55173a(C7376g gVar, Surface surface) {
        gVar.mo54115a(surface);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53047a(C7864v vVar, MediaFormat mediaFormat) {
        C7376g G = mo54172G();
        if (G != null) {
            G.mo54121c(this.f18478r);
        }
        if (this.f18462K) {
            this.f18457F = vVar.f18926q;
            this.f18458G = vVar.f18927r;
        } else {
            C7717a.m22120b(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f18457F = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(IabUtils.KEY_WIDTH);
            this.f18458G = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(IabUtils.KEY_HEIGHT);
        }
        this.f18460I = vVar.f18930u;
        if (C7728ai.f18249a < 21) {
            this.f18459H = vVar.f18929t;
        } else if (vVar.f18929t == 90 || vVar.f18929t == 270) {
            int i = this.f18457F;
            this.f18457F = this.f18458G;
            this.f18458G = i;
            this.f18460I = 1.0f / this.f18460I;
        }
        this.f18467g.mo55198b(vVar.f18928s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53048a(Exception exc) {
        C7755q.m22362c("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f18468h.mo55216a(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53049a(String str) {
        this.f18468h.mo55218a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53050a(String str, long j, long j2) {
        this.f18468h.mo55219a(str, j, j2);
        this.f18473m = mo55179b(str);
        this.f18474n = ((C7381i) C7717a.m22120b(mo54174I())).mo54165b();
        if (C7728ai.f18249a >= 23 && this.f18462K) {
            this.f18465b = new C7801b((C7376g) C7717a.m22120b(mo54172G()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53051a(boolean z, boolean z2) throws C7819p {
        super.mo53051a(z, z2);
        boolean z3 = mo53855v().f14874b;
        C7717a.m22121b(!z3 || this.f18463L != 0);
        if (this.f18462K != z3) {
            this.f18462K = z3;
            mo54175J();
        }
        this.f18468h.mo55213a(this.f16913a);
        this.f18467g.mo55191a();
        this.f18480t = z2;
        this.f18481u = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo53052a(long j, long j2, C7376g gVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C7864v vVar) throws C7819p {
        long j4;
        boolean z3;
        long j5;
        long j6;
        int i4;
        C7376g gVar2;
        C7799h hVar;
        long j7 = j;
        C7376g gVar3 = gVar;
        int i5 = i;
        long j8 = j3;
        C7717a.m22120b(gVar);
        if (this.f18482v == -9223372036854775807L) {
            this.f18482v = j7;
        }
        if (j8 != this.f18453B) {
            this.f18467g.mo55194a(j8);
            this.f18453B = j8;
        }
        long Q = mo54182Q();
        long j9 = j8 - Q;
        if (!z || z2) {
            double O = (double) mo54180O();
            boolean z4 = mo52835d_() == 2;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j10 = (long) (((double) (j8 - j7)) / O);
            if (z4) {
                j10 -= elapsedRealtime - j2;
            }
            if (this.f18475o != this.f18476p) {
                long j11 = elapsedRealtime - this.f18454C;
                if (this.f18481u ? this.f18479s : !z4 && !this.f18480t) {
                    j4 = j11;
                    z3 = false;
                } else {
                    j4 = j11;
                    z3 = true;
                }
                if (this.f18483w == -9223372036854775807L && j7 >= Q && (z3 || (z4 && mo55176b(j10, j4)))) {
                    long nanoTime = System.nanoTime();
                    m22583a(j9, nanoTime, vVar);
                    if (C7728ai.f18249a >= 21) {
                        hVar = this;
                        gVar2 = gVar;
                        i4 = i;
                        j6 = j9;
                        j5 = nanoTime;
                        hVar.mo55172a(gVar2, i4, j6, j5);
                    }
                    mo55180c(gVar3, i5, j9);
                } else {
                    if (z4 && j7 != this.f18482v) {
                        long nanoTime2 = System.nanoTime();
                        long b = this.f18467g.mo55196b((j10 * 1000) + nanoTime2);
                        long j12 = (b - nanoTime2) / 1000;
                        long j13 = j12;
                        boolean z5 = this.f18483w != -9223372036854775807L;
                        if (mo55177b(j12, j2, z2) && mo55178b(j7, z5)) {
                            return false;
                        }
                        if (mo55174a(j13, j2, z2)) {
                            if (z5) {
                                mo55171a(gVar3, i5, j9);
                            } else {
                                mo55175b(gVar3, i5, j9);
                            }
                            j10 = j13;
                        } else {
                            j10 = j13;
                            if (C7728ai.f18249a >= 21) {
                                if (j10 < 50000) {
                                    hVar = this;
                                    hVar.m22583a(j9, b, vVar);
                                    gVar2 = gVar;
                                    i4 = i;
                                    j6 = j9;
                                    j5 = b;
                                    hVar.mo55172a(gVar2, i4, j6, j5);
                                }
                            } else if (j10 < 30000) {
                                if (j10 > 11000) {
                                    try {
                                        Thread.sleep((j10 - 10000) / 1000);
                                    } catch (InterruptedException unused) {
                                        Thread.currentThread().interrupt();
                                        return false;
                                    }
                                }
                                m22583a(j9, b, vVar);
                                mo55180c(gVar3, i5, j9);
                            }
                        }
                    }
                    return false;
                }
                mo55183f(j10);
                return true;
            } else if (!m22594g(j10)) {
                return false;
            } else {
                mo55171a(gVar3, i5, j9);
                mo55183f(j10);
                return true;
            }
        } else {
            mo55171a(gVar3, i5, j9);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo55174a(long j, long j2, boolean z) {
        return m22594g(j) && !z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo54186a(C7381i iVar) {
        return this.f18475o != null || m22592b(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo54187b(C6922g gVar) throws C7819p {
        if (this.f18474n) {
            ByteBuffer byteBuffer = (ByteBuffer) C7717a.m22120b(gVar.f15335e);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    m22585a(mo54172G(), bArr);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo55175b(C7376g gVar, int i, long j) {
        C7727ah.m22175a("dropVideoBuffer");
        gVar.mo54113a(i, false);
        C7727ah.m22174a();
        mo55181e(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo55176b(long j, long j2) {
        return m22594g(j) && j2 > 100000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo55177b(long j, long j2, boolean z) {
        return m22595h(j) && !z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo55178b(long j, boolean z) throws C7819p {
        int b = mo53852b(j);
        if (b == 0) {
            return false;
        }
        this.f16913a.f15328i++;
        int i = this.f18452A + b;
        if (z) {
            this.f16913a.f15325f += i;
        } else {
            mo55181e(i);
        }
        mo54176K();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo55179b(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C7799h.class) {
            if (!f18450d) {
                f18451e = m22590ab();
                f18450d = true;
            }
        }
        return f18451e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo55180c(C7376g gVar, int i, long j) {
        m22577W();
        C7727ah.m22175a("releaseOutputBuffer");
        gVar.mo54113a(i, true);
        C7727ah.m22174a();
        this.f18454C = SystemClock.elapsedRealtime() * 1000;
        this.f16913a.f15324e++;
        this.f18486z = 0;
        mo53033B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo54191d(long j) {
        super.mo54191d(j);
        if (!this.f18462K) {
            this.f18452A--;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo55181e(int i) {
        this.f16913a.f15326g += i;
        this.f18485y += i;
        this.f18486z += i;
        this.f16913a.f15327h = Math.max(this.f18486z, this.f16913a.f15327h);
        int i2 = this.f18470j;
        if (i2 > 0 && this.f18485y >= i2) {
            m22579Y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo55182e(long j) throws C7819p {
        mo54189c(j);
        m22577W();
        this.f16913a.f15324e++;
        mo53033B();
        mo54191d(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo55183f(long j) {
        this.f16913a.mo53139a(j);
        this.f18455D += j;
        this.f18456E++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo53056p() {
        super.mo53056p();
        this.f18485y = 0;
        this.f18484x = SystemClock.elapsedRealtime();
        this.f18454C = SystemClock.elapsedRealtime() * 1000;
        this.f18455D = 0;
        this.f18456E = 0;
        this.f18467g.mo55197b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo53057q() {
        this.f18483w = -9223372036854775807L;
        m22579Y();
        m22580Z();
        this.f18467g.mo55200d();
        super.mo53057q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo53058r() {
        m22576V();
        m22574T();
        this.f18477q = false;
        this.f18467g.mo55201e();
        this.f18465b = null;
        try {
            super.mo53058r();
        } finally {
            this.f18468h.mo55220b(this.f16913a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo53059s() {
        try {
            super.mo53059s();
        } finally {
            C7792d dVar = this.f18476p;
            if (dVar != null) {
                if (this.f18475o == dVar) {
                    this.f18475o = null;
                }
                this.f18476p.release();
                this.f18476p = null;
            }
        }
    }

    /* renamed from: y */
    public String mo52846y() {
        return "MediaCodecVideoRenderer";
    }

    /* renamed from: z */
    public boolean mo52847z() {
        C7792d dVar;
        if (super.mo52847z() && (this.f18479s || (((dVar = this.f18476p) != null && this.f18475o == dVar) || mo54172G() == null || this.f18462K))) {
            this.f18483w = -9223372036854775807L;
            return true;
        } else if (this.f18483w == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f18483w) {
                return true;
            }
            this.f18483w = -9223372036854775807L;
            return false;
        }
    }
}
