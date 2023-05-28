package com.applovin.exoplayer2.p181b;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.applovin.exoplayer2.C6813am;
import com.applovin.exoplayer2.C6827ar;
import com.applovin.exoplayer2.C6829as;
import com.applovin.exoplayer2.C7819p;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.C7867w;
import com.applovin.exoplayer2.p181b.C6864g;
import com.applovin.exoplayer2.p181b.C6866h;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p182c.C6924h;
import com.applovin.exoplayer2.p197f.C7376g;
import com.applovin.exoplayer2.p197f.C7381i;
import com.applovin.exoplayer2.p197f.C7382j;
import com.applovin.exoplayer2.p197f.C7384k;
import com.applovin.exoplayer2.p197f.C7385l;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7757s;
import com.applovin.exoplayer2.p221l.C7758t;
import com.applovin.exoplayer2.p221l.C7759u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.b.q */
public class C6892q extends C7382j implements C7757s {

    /* renamed from: b */
    private final Context f15170b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6864g.C6865a f15171c;

    /* renamed from: d */
    private final C6866h f15172d;

    /* renamed from: e */
    private int f15173e;

    /* renamed from: f */
    private boolean f15174f;

    /* renamed from: g */
    private C7864v f15175g;

    /* renamed from: h */
    private long f15176h;

    /* renamed from: i */
    private boolean f15177i;

    /* renamed from: j */
    private boolean f15178j;

    /* renamed from: k */
    private boolean f15179k;

    /* renamed from: l */
    private boolean f15180l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C6827ar.C6828a f15181m;

    /* renamed from: com.applovin.exoplayer2.b.q$a */
    private final class C6894a implements C6866h.C6869c {
        private C6894a() {
        }

        /* renamed from: a */
        public void mo52970a() {
            C6892q.this.mo53033B();
        }

        /* renamed from: a */
        public void mo52971a(int i, long j, long j2) {
            C6892q.this.f15171c.mo52936a(i, j, j2);
        }

        /* renamed from: a */
        public void mo52972a(long j) {
            C6892q.this.f15171c.mo52937a(j);
        }

        /* renamed from: a */
        public void mo52973a(Exception exc) {
            C7755q.m22362c("MediaCodecAudioRenderer", "Audio sink error", exc);
            C6892q.this.f15171c.mo52940a(exc);
        }

        /* renamed from: a */
        public void mo52974a(boolean z) {
            C6892q.this.f15171c.mo52943a(z);
        }

        /* renamed from: b */
        public void mo52975b() {
            if (C6892q.this.f15181m != null) {
                C6892q.this.f15181m.mo52848a();
            }
        }

        /* renamed from: b */
        public void mo52976b(long j) {
            if (C6892q.this.f15181m != null) {
                C6892q.this.f15181m.mo52849a(j);
            }
        }
    }

    public C6892q(Context context, C7376g.C7378b bVar, C7384k kVar, boolean z, Handler handler, C6864g gVar, C6866h hVar) {
        super(1, bVar, kVar, z, 44100.0f);
        this.f15170b = context.getApplicationContext();
        this.f15172d = hVar;
        this.f15171c = new C6864g.C6865a(handler, gVar);
        hVar.mo52952a((C6866h.C6869c) new C6894a());
    }

    public C6892q(Context context, C7384k kVar, boolean z, Handler handler, C6864g gVar, C6866h hVar) {
        this(context, C7376g.C7378b.f16872a, kVar, z, handler, gVar, hVar);
    }

    /* renamed from: R */
    private void m18206R() {
        long a = this.f15172d.mo52946a(mo52825A());
        if (a != Long.MIN_VALUE) {
            if (!this.f15178j) {
                a = Math.max(this.f15176h, a);
            }
            this.f15176h = a;
            this.f15178j = false;
        }
    }

    /* renamed from: S */
    private static boolean m18207S() {
        return C7728ai.f18249a == 23 && ("ZTE B2017G".equals(C7728ai.f18252d) || "AXON 7 mini".equals(C7728ai.f18252d));
    }

    /* renamed from: a */
    private int m18208a(C7381i iVar, C7864v vVar) {
        if (!"OMX.google.raw.decoder".equals(iVar.f16875a) || C7728ai.f18249a >= 24 || (C7728ai.f18249a == 23 && C7728ai.m22249c(this.f15170b))) {
            return vVar.f18922m;
        }
        return -1;
    }

    /* renamed from: b */
    private static boolean m18211b(String str) {
        return C7728ai.f18249a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C7728ai.f18251c) && (C7728ai.f18250b.startsWith("zeroflte") || C7728ai.f18250b.startsWith("herolte") || C7728ai.f18250b.startsWith("heroqlte"));
    }

    /* renamed from: A */
    public boolean mo52825A() {
        return super.mo52825A() && this.f15172d.mo52961d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo53033B() {
        this.f15178j = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo53034C() {
        super.mo53034C();
        this.f15172d.mo52958b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo53035D() throws C7819p {
        try {
            this.f15172d.mo52960c();
        } catch (C6866h.C6871e e) {
            throw mo53850a((Throwable) e, e.f15031c, e.f15030b, (int) IronSourceConstants.errorCode_isReadyException);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo53036a(float f, C7864v vVar, C7864v[] vVarArr) {
        int i = -1;
        for (C7864v vVar2 : vVarArr) {
            int i2 = vVar2.f18935z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo53037a(C7381i iVar, C7864v vVar, C7864v[] vVarArr) {
        int a = m18208a(iVar, vVar);
        if (vVarArr.length == 1) {
            return a;
        }
        for (C7864v vVar2 : vVarArr) {
            if (iVar.mo54160a(vVar, vVar2).f15343d != 0) {
                a = Math.max(a, m18208a(iVar, vVar2));
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo53038a(C7384k kVar, C7864v vVar) throws C7385l.C7388b {
        if (!C7759u.m22377a(vVar.f18921l)) {
            return C6829as.CC.m17728b(0);
        }
        int i = C7728ai.f18249a >= 21 ? 32 : 0;
        boolean z = vVar.f18908E != 0;
        boolean c = m20474c(vVar);
        int i2 = 8;
        int i3 = 4;
        if (c && this.f15172d.mo52955a(vVar) && (!z || C7385l.m20547a() != null)) {
            return C6829as.CC.m17727a(4, 8, i);
        }
        if ("audio/raw".equals(vVar.f18921l) && !this.f15172d.mo52955a(vVar)) {
            return C6829as.CC.m17728b(1);
        }
        if (!this.f15172d.mo52955a(C7728ai.m22236b(2, vVar.f18934y, vVar.f18935z))) {
            return C6829as.CC.m17728b(1);
        }
        List<C7381i> a = mo53043a(kVar, vVar, false);
        if (a.isEmpty()) {
            return C6829as.CC.m17728b(1);
        }
        if (!c) {
            return C6829as.CC.m17728b(2);
        }
        C7381i iVar = a.get(0);
        boolean a2 = iVar.mo54163a(vVar);
        if (a2 && iVar.mo54168c(vVar)) {
            i2 = 16;
        }
        if (!a2) {
            i3 = 3;
        }
        return C6829as.CC.m17727a(i3, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MediaFormat mo53039a(C7864v vVar, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", vVar.f18934y);
        mediaFormat.setInteger("sample-rate", vVar.f18935z);
        C7758t.m22375a(mediaFormat, vVar.f18923n);
        C7758t.m22373a(mediaFormat, "max-input-size", i);
        if (C7728ai.f18249a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !m18207S()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (C7728ai.f18249a <= 28 && "audio/ac4".equals(vVar.f18921l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (C7728ai.f18249a >= 24 && this.f15172d.mo52957b(C7728ai.m22236b(4, vVar.f18934y, vVar.f18935z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6924h mo53040a(C7381i iVar, C7864v vVar, C7864v vVar2) {
        C6924h a = iVar.mo54160a(vVar, vVar2);
        int i = a.f15344e;
        if (m18208a(iVar, vVar2) > this.f15173e) {
            i |= 64;
        }
        int i2 = i;
        return new C6924h(iVar.f16875a, vVar, vVar2, i2 != 0 ? 0 : a.f15343d, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6924h mo53041a(C7867w wVar) throws C7819p {
        C6924h a = super.mo53041a(wVar);
        this.f15171c.mo52939a(wVar.f18967b, a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7376g.C7377a mo53042a(C7381i iVar, C7864v vVar, MediaCrypto mediaCrypto, float f) {
        this.f15173e = mo53037a(iVar, vVar, mo53854u());
        this.f15174f = m18211b(iVar.f16875a);
        MediaFormat a = mo53039a(vVar, iVar.f16877c, this.f15173e, f);
        this.f15175g = "audio/raw".equals(iVar.f16876b) && !"audio/raw".equals(vVar.f18921l) ? vVar : null;
        return C7376g.C7377a.m20413a(iVar, a, vVar, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C7381i> mo53043a(C7384k kVar, C7864v vVar, boolean z) throws C7385l.C7388b {
        C7381i a;
        String str = vVar.f18921l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f15172d.mo52955a(vVar) && (a = C7385l.m20547a()) != null) {
            return Collections.singletonList(a);
        }
        List<C7381i> a2 = C7385l.m20552a(kVar.getDecoderInfos(str, z, false), vVar);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(a2);
            arrayList.addAll(kVar.getDecoderInfos("audio/eac3", z, false));
            a2 = arrayList;
        }
        return Collections.unmodifiableList(a2);
    }

    /* renamed from: a */
    public void mo52821a(int i, Object obj) throws C7819p {
        if (i == 2) {
            this.f15172d.mo52948a(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f15172d.mo52951a((C6856d) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.f15172d.mo52959b(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f15172d.mo52949a(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f15181m = (C6827ar.C6828a) obj;
                    return;
                default:
                    super.mo52821a(i, obj);
                    return;
            }
        } else {
            this.f15172d.mo52953a((C6876k) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53044a(long j, boolean z) throws C7819p {
        super.mo53044a(j, z);
        if (this.f15180l) {
            this.f15172d.mo52968k();
        } else {
            this.f15172d.mo52967j();
        }
        this.f15176h = j;
        this.f15177i = true;
        this.f15178j = true;
    }

    /* renamed from: a */
    public void mo53045a(C6813am amVar) {
        this.f15172d.mo52950a(amVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53046a(C6922g gVar) {
        if (this.f15177i && !gVar.mo53124b()) {
            if (Math.abs(gVar.f15334d - this.f15176h) > 500000) {
                this.f15176h = gVar.f15334d;
            }
            this.f15177i = false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093 A[LOOP:0: B:26:0x008f->B:28:0x0093, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53047a(com.applovin.exoplayer2.C7864v r6, android.media.MediaFormat r7) throws com.applovin.exoplayer2.C7819p {
        /*
            r5 = this;
            com.applovin.exoplayer2.v r0 = r5.f15175g
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0009
            r6 = r0
            goto L_0x0099
        L_0x0009:
            com.applovin.exoplayer2.f.g r0 = r5.mo54172G()
            if (r0 != 0) goto L_0x0011
            goto L_0x0099
        L_0x0011:
            java.lang.String r0 = r6.f18921l
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
        L_0x001b:
            int r0 = r6.f18904A
            goto L_0x004c
        L_0x001e:
            int r0 = com.applovin.exoplayer2.p221l.C7728ai.f18249a
            r4 = 24
            if (r0 < r4) goto L_0x0031
            java.lang.String r0 = "pcm-encoding"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L_0x0031
            int r0 = r7.getInteger(r0)
            goto L_0x004c
        L_0x0031:
            java.lang.String r0 = "v-bits-per-sample"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L_0x0042
            int r0 = r7.getInteger(r0)
            int r0 = com.applovin.exoplayer2.p221l.C7728ai.m22243c((int) r0)
            goto L_0x004c
        L_0x0042:
            java.lang.String r0 = r6.f18921l
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x004b
            goto L_0x001b
        L_0x004b:
            r0 = 2
        L_0x004c:
            com.applovin.exoplayer2.v$a r4 = new com.applovin.exoplayer2.v$a
            r4.<init>()
            com.applovin.exoplayer2.v$a r3 = r4.mo55435f((java.lang.String) r3)
            com.applovin.exoplayer2.v$a r0 = r3.mo55442m((int) r0)
            int r3 = r6.f18905B
            com.applovin.exoplayer2.v$a r0 = r0.mo55443n((int) r3)
            int r3 = r6.f18906C
            com.applovin.exoplayer2.v$a r0 = r0.mo55444o((int) r3)
            java.lang.String r3 = "channel-count"
            int r3 = r7.getInteger(r3)
            com.applovin.exoplayer2.v$a r0 = r0.mo55440k((int) r3)
            java.lang.String r3 = "sample-rate"
            int r7 = r7.getInteger(r3)
            com.applovin.exoplayer2.v$a r7 = r0.mo55441l((int) r7)
            com.applovin.exoplayer2.v r7 = r7.mo55424a()
            boolean r0 = r5.f15174f
            if (r0 == 0) goto L_0x0098
            int r0 = r7.f18934y
            r3 = 6
            if (r0 != r3) goto L_0x0098
            int r0 = r6.f18934y
            if (r0 >= r3) goto L_0x0098
            int r0 = r6.f18934y
            int[] r2 = new int[r0]
            r0 = 0
        L_0x008f:
            int r3 = r6.f18934y
            if (r0 >= r3) goto L_0x0098
            r2[r0] = r0
            int r0 = r0 + 1
            goto L_0x008f
        L_0x0098:
            r6 = r7
        L_0x0099:
            com.applovin.exoplayer2.b.h r7 = r5.f15172d     // Catch:{ a -> 0x009f }
            r7.mo52954a((com.applovin.exoplayer2.C7864v) r6, (int) r1, (int[]) r2)     // Catch:{ a -> 0x009f }
            return
        L_0x009f:
            r6 = move-exception
            com.applovin.exoplayer2.v r7 = r6.f15023a
            r0 = 5001(0x1389, float:7.008E-42)
            com.applovin.exoplayer2.p r6 = r5.mo53849a((java.lang.Throwable) r6, (com.applovin.exoplayer2.C7864v) r7, (int) r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p181b.C6892q.mo53047a(com.applovin.exoplayer2.v, android.media.MediaFormat):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53048a(Exception exc) {
        C7755q.m22362c("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f15171c.mo52945b(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53049a(String str) {
        this.f15171c.mo52941a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53050a(String str, long j, long j2) {
        this.f15171c.mo52942a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53051a(boolean z, boolean z2) throws C7819p {
        super.mo53051a(z, z2);
        this.f15171c.mo52938a(this.f16913a);
        if (mo53855v().f14874b) {
            this.f15172d.mo52964g();
        } else {
            this.f15172d.mo52965h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo53052a(long j, long j2, C7376g gVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C7864v vVar) throws C7819p {
        C7717a.m22120b(byteBuffer);
        if (this.f15175g != null && (i2 & 2) != 0) {
            ((C7376g) C7717a.m22120b(gVar)).mo54113a(i, false);
            return true;
        } else if (z) {
            if (gVar != null) {
                gVar.mo54113a(i, false);
            }
            this.f16913a.f15325f += i3;
            this.f15172d.mo52958b();
            return true;
        } else {
            try {
                if (!this.f15172d.mo52956a(byteBuffer, j3, i3)) {
                    return false;
                }
                if (gVar != null) {
                    gVar.mo54113a(i, false);
                }
                this.f16913a.f15324e += i3;
                return true;
            } catch (C6866h.C6868b e) {
                throw mo53850a((Throwable) e, e.f15026c, e.f15025b, (int) IronSourceConstants.errorCode_biddingDataException);
            } catch (C6866h.C6871e e2) {
                throw mo53850a((Throwable) e2, vVar, e2.f15030b, (int) IronSourceConstants.errorCode_isReadyException);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo53053b(C7864v vVar) {
        return this.f15172d.mo52955a(vVar);
    }

    /* renamed from: c */
    public C7757s mo52834c() {
        return this;
    }

    /* renamed from: c_ */
    public long mo53054c_() {
        if (mo52835d_() == 2) {
            m18206R();
        }
        return this.f15176h;
    }

    /* renamed from: d */
    public C6813am mo53055d() {
        return this.f15172d.mo52963f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo53056p() {
        super.mo53056p();
        this.f15172d.mo52947a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo53057q() {
        m18206R();
        this.f15172d.mo52966i();
        super.mo53057q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo53058r() {
        this.f15179k = true;
        try {
            this.f15172d.mo52967j();
            try {
                super.mo53058r();
            } finally {
                this.f15171c.mo52944b(this.f16913a);
            }
        } catch (Throwable th) {
            super.mo53058r();
            throw th;
        } finally {
            this.f15171c.mo52944b(this.f16913a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo53059s() {
        try {
            super.mo53059s();
        } finally {
            if (this.f15179k) {
                this.f15179k = false;
                this.f15172d.mo52969l();
            }
        }
    }

    /* renamed from: y */
    public String mo52846y() {
        return "MediaCodecAudioRenderer";
    }

    /* renamed from: z */
    public boolean mo52847z() {
        return this.f15172d.mo52962e() || super.mo52847z();
    }
}
