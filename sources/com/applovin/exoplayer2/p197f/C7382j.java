package com.applovin.exoplayer2.p197f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.exoplayer2.C7181e;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.C7819p;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.C7867w;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p182c.C6915b;
import com.applovin.exoplayer2.p182c.C6920e;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p182c.C6924h;
import com.applovin.exoplayer2.p185d.C7152f;
import com.applovin.exoplayer2.p185d.C7172n;
import com.applovin.exoplayer2.p197f.C7366a;
import com.applovin.exoplayer2.p197f.C7376g;
import com.applovin.exoplayer2.p197f.C7385l;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7725af;
import com.applovin.exoplayer2.p221l.C7727ah;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7762v;
import com.facebook.ads.AdError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.applovin.exoplayer2.f.j */
public abstract class C7382j extends C7181e {

    /* renamed from: b */
    private static final byte[] f16886b = {0, 0, 1, 103, 66, -64, Ascii.f15555VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.f15551SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.f15542CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.f15545FS, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private C7864v f16887A;

    /* renamed from: B */
    private MediaFormat f16888B;

    /* renamed from: C */
    private boolean f16889C;

    /* renamed from: D */
    private float f16890D;

    /* renamed from: E */
    private ArrayDeque<C7381i> f16891E;

    /* renamed from: F */
    private C7383a f16892F;

    /* renamed from: G */
    private C7381i f16893G;

    /* renamed from: H */
    private int f16894H;

    /* renamed from: I */
    private boolean f16895I;

    /* renamed from: J */
    private boolean f16896J;

    /* renamed from: K */
    private boolean f16897K;

    /* renamed from: L */
    private boolean f16898L;

    /* renamed from: M */
    private boolean f16899M;

    /* renamed from: N */
    private boolean f16900N;

    /* renamed from: O */
    private boolean f16901O;

    /* renamed from: P */
    private boolean f16902P;

    /* renamed from: Q */
    private boolean f16903Q;

    /* renamed from: R */
    private boolean f16904R;

    /* renamed from: S */
    private C7374e f16905S;

    /* renamed from: T */
    private long f16906T;

    /* renamed from: U */
    private int f16907U;

    /* renamed from: V */
    private int f16908V;

    /* renamed from: W */
    private ByteBuffer f16909W;

    /* renamed from: X */
    private boolean f16910X;

    /* renamed from: Y */
    private boolean f16911Y;

    /* renamed from: Z */
    private boolean f16912Z;

    /* renamed from: a */
    protected C6920e f16913a;

    /* renamed from: aa */
    private boolean f16914aa;

    /* renamed from: ab */
    private boolean f16915ab;

    /* renamed from: ac */
    private boolean f16916ac;

    /* renamed from: ad */
    private int f16917ad;

    /* renamed from: ae */
    private int f16918ae;

    /* renamed from: af */
    private int f16919af;

    /* renamed from: ag */
    private boolean f16920ag;

    /* renamed from: ah */
    private boolean f16921ah;

    /* renamed from: ai */
    private boolean f16922ai;

    /* renamed from: aj */
    private long f16923aj;

    /* renamed from: ak */
    private long f16924ak;

    /* renamed from: al */
    private boolean f16925al;

    /* renamed from: am */
    private boolean f16926am;

    /* renamed from: an */
    private boolean f16927an;

    /* renamed from: ao */
    private boolean f16928ao;

    /* renamed from: ap */
    private boolean f16929ap;

    /* renamed from: aq */
    private boolean f16930aq;

    /* renamed from: ar */
    private boolean f16931ar;

    /* renamed from: as */
    private C7819p f16932as;

    /* renamed from: at */
    private long f16933at = -9223372036854775807L;

    /* renamed from: au */
    private long f16934au = -9223372036854775807L;

    /* renamed from: av */
    private int f16935av;

    /* renamed from: c */
    private final C7376g.C7378b f16936c;

    /* renamed from: d */
    private final C7384k f16937d;

    /* renamed from: e */
    private final boolean f16938e;

    /* renamed from: f */
    private final float f16939f;

    /* renamed from: g */
    private final C6922g f16940g = C6922g.m18449f();

    /* renamed from: h */
    private final C6922g f16941h = new C6922g(0);

    /* renamed from: i */
    private final C6922g f16942i = new C6922g(2);

    /* renamed from: j */
    private final C7373d f16943j = new C7373d();

    /* renamed from: k */
    private final C7725af<C7864v> f16944k = new C7725af<>();

    /* renamed from: l */
    private final ArrayList<Long> f16945l = new ArrayList<>();

    /* renamed from: m */
    private final MediaCodec.BufferInfo f16946m = new MediaCodec.BufferInfo();

    /* renamed from: n */
    private final long[] f16947n = new long[10];

    /* renamed from: o */
    private final long[] f16948o = new long[10];

    /* renamed from: p */
    private final long[] f16949p = new long[10];

    /* renamed from: q */
    private C7864v f16950q;

    /* renamed from: r */
    private C7864v f16951r;

    /* renamed from: s */
    private C7152f f16952s;

    /* renamed from: t */
    private C7152f f16953t;

    /* renamed from: u */
    private MediaCrypto f16954u;

    /* renamed from: v */
    private boolean f16955v;

    /* renamed from: w */
    private long f16956w = -9223372036854775807L;

    /* renamed from: x */
    private float f16957x = 1.0f;

    /* renamed from: y */
    private float f16958y = 1.0f;

    /* renamed from: z */
    private C7376g f16959z;

    /* renamed from: com.applovin.exoplayer2.f.j$a */
    public static class C7383a extends Exception {

        /* renamed from: a */
        public final String f16960a;

        /* renamed from: b */
        public final boolean f16961b;

        /* renamed from: c */
        public final C7381i f16962c;

        /* renamed from: d */
        public final String f16963d;

        /* renamed from: e */
        public final C7383a f16964e;

        public C7383a(C7864v vVar, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + vVar, th, vVar.f18921l, z, (C7381i) null, m20538a(i), (C7383a) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C7383a(C7864v vVar, Throwable th, boolean z, C7381i iVar) {
            this("Decoder init failed: " + iVar.f16875a + ", " + vVar, th, vVar.f18921l, z, iVar, C7728ai.f18249a >= 21 ? m20539a(th) : null, (C7383a) null);
        }

        private C7383a(String str, Throwable th, String str2, boolean z, C7381i iVar, String str3, C7383a aVar) {
            super(str, th);
            this.f16960a = str2;
            this.f16961b = z;
            this.f16962c = iVar;
            this.f16963d = str3;
            this.f16964e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7383a m20536a(C7383a aVar) {
            return new C7383a(getMessage(), getCause(), this.f16960a, this.f16961b, this.f16962c, this.f16963d, aVar);
        }

        /* renamed from: a */
        private static String m20538a(int i) {
            String str = i < 0 ? "neg_" : "";
            return "com.applovin.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i);
        }

        /* renamed from: a */
        private static String m20539a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    public C7382j(int i, C7376g.C7378b bVar, C7384k kVar, boolean z, float f) {
        super(i);
        this.f16936c = bVar;
        this.f16937d = (C7384k) C7717a.m22120b(kVar);
        this.f16938e = z;
        this.f16939f = f;
        this.f16943j.mo53141f(0);
        this.f16943j.f15332b.order(ByteOrder.nativeOrder());
        this.f16890D = -1.0f;
        this.f16894H = 0;
        this.f16917ad = 0;
        this.f16907U = -1;
        this.f16908V = -1;
        this.f16906T = -9223372036854775807L;
        this.f16923aj = -9223372036854775807L;
        this.f16924ak = -9223372036854775807L;
        this.f16918ae = 0;
        this.f16919af = 0;
    }

    /* renamed from: B */
    private void mo53033B() {
        this.f16915ab = false;
        this.f16943j.mo53121a();
        this.f16942i.mo53121a();
        this.f16914aa = false;
        this.f16912Z = false;
    }

    /* renamed from: R */
    private void m20446R() {
        try {
            this.f16959z.mo54122d();
        } finally {
            mo54178M();
        }
    }

    /* renamed from: S */
    private boolean m20447S() {
        return this.f16908V >= 0;
    }

    /* renamed from: T */
    private void m20448T() {
        this.f16907U = -1;
        this.f16941h.f15332b = null;
    }

    /* renamed from: U */
    private void m20449U() {
        this.f16908V = -1;
        this.f16909W = null;
    }

    /* renamed from: V */
    private boolean m20450V() throws C7819p {
        C7376g gVar = this.f16959z;
        if (gVar == null || this.f16918ae == 2 || this.f16925al) {
            return false;
        }
        if (this.f16907U < 0) {
            int b = gVar.mo54118b();
            this.f16907U = b;
            if (b < 0) {
                return false;
            }
            this.f16941h.f15332b = this.f16959z.mo54109a(b);
            this.f16941h.mo53121a();
        }
        if (this.f16918ae == 1) {
            if (!this.f16904R) {
                this.f16921ah = true;
                this.f16959z.mo54110a(this.f16907U, 0, 0, 0, 4);
                m20448T();
            }
            this.f16918ae = 2;
            return false;
        } else if (this.f16902P) {
            this.f16902P = false;
            this.f16941h.f15332b.put(f16886b);
            this.f16959z.mo54110a(this.f16907U, 0, f16886b.length, 0, 0);
            m20448T();
            this.f16920ag = true;
            return true;
        } else {
            if (this.f16917ad == 1) {
                for (int i = 0; i < this.f16887A.f18923n.size(); i++) {
                    this.f16941h.f15332b.put(this.f16887A.f18923n.get(i));
                }
                this.f16917ad = 2;
            }
            int position = this.f16941h.f15332b.position();
            C7867w t = mo53853t();
            try {
                int a = mo53848a(t, this.f16941h, 0);
                if (mo52838g()) {
                    this.f16924ak = this.f16923aj;
                }
                if (a == -3) {
                    return false;
                }
                if (a == -5) {
                    if (this.f16917ad == 2) {
                        this.f16941h.mo53121a();
                        this.f16917ad = 1;
                    }
                    mo53041a(t);
                    return true;
                } else if (this.f16941h.mo53126c()) {
                    if (this.f16917ad == 2) {
                        this.f16941h.mo53121a();
                        this.f16917ad = 1;
                    }
                    this.f16925al = true;
                    if (!this.f16920ag) {
                        m20461aa();
                        return false;
                    }
                    try {
                        if (!this.f16904R) {
                            this.f16921ah = true;
                            this.f16959z.mo54110a(this.f16907U, 0, 0, 0, 4);
                            m20448T();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw mo53849a((Throwable) e, this.f16950q, C7476h.m20799b(e.getErrorCode()));
                    }
                } else if (this.f16920ag || this.f16941h.mo53127d()) {
                    boolean g = this.f16941h.mo53142g();
                    if (g) {
                        this.f16941h.f15331a.mo53131a(position);
                    }
                    if (this.f16895I && !g) {
                        C7762v.m22394a(this.f16941h.f15332b);
                        if (this.f16941h.f15332b.position() == 0) {
                            return true;
                        }
                        this.f16895I = false;
                    }
                    long j = this.f16941h.f15334d;
                    C7374e eVar = this.f16905S;
                    if (eVar != null) {
                        j = eVar.mo54152a(this.f16950q, this.f16941h);
                        this.f16923aj = Math.max(this.f16923aj, this.f16905S.mo54151a(this.f16950q));
                    }
                    long j2 = j;
                    if (this.f16941h.mo53124b()) {
                        this.f16945l.add(Long.valueOf(j2));
                    }
                    if (this.f16927an) {
                        this.f16944k.mo54983a(j2, this.f16950q);
                        this.f16927an = false;
                    }
                    this.f16923aj = Math.max(this.f16923aj, j2);
                    this.f16941h.mo53143h();
                    if (this.f16941h.mo53129e()) {
                        mo54187b(this.f16941h);
                    }
                    mo53046a(this.f16941h);
                    if (g) {
                        try {
                            this.f16959z.mo54111a(this.f16907U, 0, this.f16941h.f15331a, j2, 0);
                        } catch (MediaCodec.CryptoException e2) {
                            throw mo53849a((Throwable) e2, this.f16950q, C7476h.m20799b(e2.getErrorCode()));
                        }
                    } else {
                        this.f16959z.mo54110a(this.f16907U, 0, this.f16941h.f15332b.limit(), j2, 0);
                    }
                    m20448T();
                    this.f16920ag = true;
                    this.f16917ad = 0;
                    this.f16913a.f15322c++;
                    return true;
                } else {
                    this.f16941h.mo53121a();
                    if (this.f16917ad == 2) {
                        this.f16917ad = 1;
                    }
                    return true;
                }
            } catch (C6922g.C6923a e3) {
                mo53048a((Exception) e3);
                mo55181e(0);
                m20446R();
                return true;
            }
        }
    }

    /* renamed from: W */
    private boolean m20451W() {
        if (this.f16920ag) {
            this.f16918ae = 1;
            if (this.f16896J || this.f16898L) {
                this.f16919af = 3;
                return false;
            }
            this.f16919af = 1;
        }
        return true;
    }

    /* renamed from: X */
    private boolean m20452X() throws C7819p {
        if (this.f16920ag) {
            this.f16918ae = 1;
            if (this.f16896J || this.f16898L) {
                this.f16919af = 3;
                return false;
            }
            this.f16919af = 2;
        } else {
            m20463ac();
        }
        return true;
    }

    /* renamed from: Y */
    private void m20453Y() throws C7819p {
        if (this.f16920ag) {
            this.f16918ae = 1;
            this.f16919af = 3;
            return;
        }
        m20462ab();
    }

    /* renamed from: Z */
    private void m20454Z() {
        this.f16922ai = true;
        MediaFormat c = this.f16959z.mo54120c();
        if (this.f16894H != 0 && c.getInteger(IabUtils.KEY_WIDTH) == 32 && c.getInteger(IabUtils.KEY_HEIGHT) == 32) {
            this.f16903Q = true;
            return;
        }
        if (this.f16901O) {
            c.setInteger("channel-count", 1);
        }
        this.f16888B = c;
        this.f16889C = true;
    }

    /* renamed from: a */
    private void m20455a(MediaCrypto mediaCrypto, boolean z) throws C7383a {
        if (this.f16891E == null) {
            try {
                List<C7381i> d = m20476d(z);
                ArrayDeque<C7381i> arrayDeque = new ArrayDeque<>();
                this.f16891E = arrayDeque;
                if (this.f16938e) {
                    arrayDeque.addAll(d);
                } else if (!d.isEmpty()) {
                    this.f16891E.add(d.get(0));
                }
                this.f16892F = null;
            } catch (C7385l.C7388b e) {
                throw new C7383a(this.f16950q, (Throwable) e, z, -49998);
            }
        }
        if (!this.f16891E.isEmpty()) {
            while (this.f16959z == null) {
                C7381i peekFirst = this.f16891E.peekFirst();
                if (mo54186a(peekFirst)) {
                    try {
                        m20457a(peekFirst, mediaCrypto);
                    } catch (Exception e2) {
                        C7755q.m22359b("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst, e2);
                        this.f16891E.removeFirst();
                        C7383a aVar = new C7383a(this.f16950q, (Throwable) e2, z, peekFirst);
                        mo53048a((Exception) aVar);
                        C7383a aVar2 = this.f16892F;
                        if (aVar2 == null) {
                            this.f16892F = aVar;
                        } else {
                            this.f16892F = aVar2.m20536a(aVar);
                        }
                        if (this.f16891E.isEmpty()) {
                            throw this.f16892F;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f16891E = null;
            return;
        }
        throw new C7383a(this.f16950q, (Throwable) null, z, -49999);
    }

    /* renamed from: a */
    private void m20456a(C7152f fVar) {
        C7152f.CC.m19124a(this.f16953t, fVar);
        this.f16953t = fVar;
    }

    /* renamed from: a */
    private void m20457a(C7381i iVar, MediaCrypto mediaCrypto) throws Exception {
        String str = iVar.f16875a;
        float f = -1.0f;
        float a = C7728ai.f18249a < 23 ? -1.0f : mo53036a(this.f16958y, this.f16950q, mo53854u());
        if (a > this.f16939f) {
            f = a;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C7727ah.m22175a("createCodec:" + str);
        C7376g.C7377a a2 = mo53042a(iVar, this.f16950q, mediaCrypto, f);
        C7376g b = (!this.f16929ap || C7728ai.f18249a < 23) ? this.f16936c.mo54125b(a2) : new C7366a.C7368a(mo52826a(), this.f16930aq, this.f16931ar).mo54125b(a2);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.f16959z = b;
        this.f16893G = iVar;
        this.f16890D = f;
        this.f16887A = this.f16950q;
        this.f16894H = m20471c(str);
        this.f16895I = m20460a(str, this.f16887A);
        this.f16896J = mo55179b(str);
        this.f16897K = m20478d(str);
        this.f16898L = m20482e(str);
        this.f16899M = m20485g(str);
        this.f16900N = m20484f(str);
        this.f16901O = m20470b(str, this.f16887A);
        boolean z = false;
        this.f16904R = m20467b(iVar) || mo54171F();
        if (b.mo54117a()) {
            this.f16916ac = true;
            this.f16917ad = 1;
            if (this.f16894H != 0) {
                z = true;
            }
            this.f16902P = z;
        }
        if ("c2.android.mp3.decoder".equals(iVar.f16875a)) {
            this.f16905S = new C7374e();
        }
        if (mo52835d_() == 2) {
            this.f16906T = SystemClock.elapsedRealtime() + 1000;
        }
        this.f16913a.f15320a++;
        mo53050a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
    }

    /* renamed from: a */
    private boolean m20458a(C7381i iVar, C7864v vVar, C7152f fVar, C7152f fVar2) throws C7819p {
        C7172n c;
        if (fVar == fVar2) {
            return false;
        }
        if (fVar2 == null || fVar == null || C7728ai.f18249a < 23 || C7476h.f17126e.equals(fVar.mo53767f()) || C7476h.f17126e.equals(fVar2.mo53767f()) || (c = m20472c(fVar2)) == null) {
            return true;
        }
        return !iVar.f16881g && (c.f15749d ? false : fVar2.mo53760a(vVar.f18921l));
    }

    /* renamed from: a */
    private static boolean m20459a(IllegalStateException illegalStateException) {
        if (C7728ai.f18249a >= 21 && m20468b(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    /* renamed from: a */
    private static boolean m20460a(String str, C7864v vVar) {
        return C7728ai.f18249a < 21 && vVar.f18923n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* renamed from: aa */
    private void m20461aa() throws C7819p {
        int i = this.f16919af;
        if (i == 1) {
            m20446R();
        } else if (i == 2) {
            m20446R();
            m20463ac();
        } else if (i != 3) {
            this.f16926am = true;
            mo53035D();
        } else {
            m20462ab();
        }
    }

    /* renamed from: ab */
    private void m20462ab() throws C7819p {
        mo54175J();
        mo54170E();
    }

    /* renamed from: ac */
    private void m20463ac() throws C7819p {
        try {
            this.f16954u.setMediaDrmSession(m20472c(this.f16953t).f15748c);
            m20465b(this.f16953t);
            this.f16918ae = 0;
            this.f16919af = 0;
        } catch (MediaCryptoException e) {
            throw mo53849a((Throwable) e, this.f16950q, 6006);
        }
    }

    /* renamed from: ad */
    private void m20464ad() throws C7819p {
        C7717a.m22121b(!this.f16925al);
        C7867w t = mo53853t();
        this.f16942i.mo53121a();
        do {
            this.f16942i.mo53121a();
            int a = mo53848a(t, this.f16942i, 0);
            if (a == -5) {
                mo53041a(t);
                return;
            } else if (a != -4) {
                if (a != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f16942i.mo53126c()) {
                this.f16925al = true;
                return;
            } else {
                if (this.f16927an) {
                    C7864v vVar = (C7864v) C7717a.m22120b(this.f16950q);
                    this.f16951r = vVar;
                    mo53047a(vVar, (MediaFormat) null);
                    this.f16927an = false;
                }
                this.f16942i.mo53143h();
            }
        } while (this.f16943j.mo54145a(this.f16942i));
        this.f16914aa = true;
    }

    /* renamed from: b */
    private void m20465b(C7152f fVar) {
        C7152f.CC.m19124a(this.f16952s, fVar);
        this.f16952s = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0107  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean mo55176b(long r20, long r22) throws com.applovin.exoplayer2.C7819p {
        /*
            r19 = this;
            r15 = r19
            boolean r0 = r19.m20447S()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto L_0x00ce
            boolean r0 = r15.f16899M
            if (r0 == 0) goto L_0x0028
            boolean r0 = r15.f16921ah
            if (r0 == 0) goto L_0x0028
            com.applovin.exoplayer2.f.g r0 = r15.f16959z     // Catch:{ IllegalStateException -> 0x001c }
            android.media.MediaCodec$BufferInfo r1 = r15.f16946m     // Catch:{ IllegalStateException -> 0x001c }
            int r0 = r0.mo54108a((android.media.MediaCodec.BufferInfo) r1)     // Catch:{ IllegalStateException -> 0x001c }
            goto L_0x0030
        L_0x001c:
            r19.m20461aa()
            boolean r0 = r15.f16926am
            if (r0 == 0) goto L_0x0027
            r19.mo54175J()
        L_0x0027:
            return r14
        L_0x0028:
            com.applovin.exoplayer2.f.g r0 = r15.f16959z
            android.media.MediaCodec$BufferInfo r1 = r15.f16946m
            int r0 = r0.mo54108a((android.media.MediaCodec.BufferInfo) r1)
        L_0x0030:
            if (r0 >= 0) goto L_0x004a
            r1 = -2
            if (r0 != r1) goto L_0x0039
            r19.m20454Z()
            return r16
        L_0x0039:
            boolean r0 = r15.f16904R
            if (r0 == 0) goto L_0x0049
            boolean r0 = r15.f16925al
            if (r0 != 0) goto L_0x0046
            int r0 = r15.f16918ae
            r1 = 2
            if (r0 != r1) goto L_0x0049
        L_0x0046:
            r19.m20461aa()
        L_0x0049:
            return r14
        L_0x004a:
            boolean r1 = r15.f16903Q
            if (r1 == 0) goto L_0x0056
            r15.f16903Q = r14
            com.applovin.exoplayer2.f.g r1 = r15.f16959z
            r1.mo54113a((int) r0, (boolean) r14)
            return r16
        L_0x0056:
            android.media.MediaCodec$BufferInfo r1 = r15.f16946m
            int r1 = r1.size
            if (r1 != 0) goto L_0x0068
            android.media.MediaCodec$BufferInfo r1 = r15.f16946m
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0068
            r19.m20461aa()
            return r14
        L_0x0068:
            r15.f16908V = r0
            com.applovin.exoplayer2.f.g r1 = r15.f16959z
            java.nio.ByteBuffer r0 = r1.mo54119b(r0)
            r15.f16909W = r0
            if (r0 == 0) goto L_0x0089
            android.media.MediaCodec$BufferInfo r1 = r15.f16946m
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f16909W
            android.media.MediaCodec$BufferInfo r1 = r15.f16946m
            int r1 = r1.offset
            android.media.MediaCodec$BufferInfo r2 = r15.f16946m
            int r2 = r2.size
            int r1 = r1 + r2
            r0.limit(r1)
        L_0x0089:
            boolean r0 = r15.f16900N
            if (r0 == 0) goto L_0x00ae
            android.media.MediaCodec$BufferInfo r0 = r15.f16946m
            long r0 = r0.presentationTimeUs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00ae
            android.media.MediaCodec$BufferInfo r0 = r15.f16946m
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00ae
            long r0 = r15.f16923aj
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ae
            android.media.MediaCodec$BufferInfo r2 = r15.f16946m
            r2.presentationTimeUs = r0
        L_0x00ae:
            android.media.MediaCodec$BufferInfo r0 = r15.f16946m
            long r0 = r0.presentationTimeUs
            boolean r0 = r15.mo55183f((long) r0)
            r15.f16910X = r0
            long r0 = r15.f16924ak
            android.media.MediaCodec$BufferInfo r2 = r15.f16946m
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00c4
            r0 = 1
            goto L_0x00c5
        L_0x00c4:
            r0 = 0
        L_0x00c5:
            r15.f16911Y = r0
            android.media.MediaCodec$BufferInfo r0 = r15.f16946m
            long r0 = r0.presentationTimeUs
            r15.mo54189c((long) r0)
        L_0x00ce:
            boolean r0 = r15.f16899M
            if (r0 == 0) goto L_0x010b
            boolean r0 = r15.f16921ah
            if (r0 == 0) goto L_0x010b
            com.applovin.exoplayer2.f.g r5 = r15.f16959z     // Catch:{ IllegalStateException -> 0x00fe }
            java.nio.ByteBuffer r6 = r15.f16909W     // Catch:{ IllegalStateException -> 0x00fe }
            int r7 = r15.f16908V     // Catch:{ IllegalStateException -> 0x00fe }
            android.media.MediaCodec$BufferInfo r0 = r15.f16946m     // Catch:{ IllegalStateException -> 0x00fe }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00fe }
            r9 = 1
            android.media.MediaCodec$BufferInfo r0 = r15.f16946m     // Catch:{ IllegalStateException -> 0x00fe }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00fe }
            boolean r12 = r15.f16910X     // Catch:{ IllegalStateException -> 0x00fe }
            boolean r13 = r15.f16911Y     // Catch:{ IllegalStateException -> 0x00fe }
            com.applovin.exoplayer2.v r3 = r15.f16951r     // Catch:{ IllegalStateException -> 0x00fe }
            r0 = r19
            r1 = r20
            r17 = r3
            r3 = r22
            r18 = 0
            r14 = r17
            boolean r0 = r0.mo53052a(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x00fc }
            goto L_0x012c
        L_0x00fc:
            goto L_0x0100
        L_0x00fe:
            r18 = 0
        L_0x0100:
            r19.m20461aa()
            boolean r0 = r15.f16926am
            if (r0 == 0) goto L_0x010a
            r19.mo54175J()
        L_0x010a:
            return r18
        L_0x010b:
            r18 = 0
            com.applovin.exoplayer2.f.g r5 = r15.f16959z
            java.nio.ByteBuffer r6 = r15.f16909W
            int r7 = r15.f16908V
            android.media.MediaCodec$BufferInfo r0 = r15.f16946m
            int r8 = r0.flags
            r9 = 1
            android.media.MediaCodec$BufferInfo r0 = r15.f16946m
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f16910X
            boolean r13 = r15.f16911Y
            com.applovin.exoplayer2.v r14 = r15.f16951r
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.mo53052a(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x012c:
            if (r0 == 0) goto L_0x0149
            android.media.MediaCodec$BufferInfo r0 = r15.f16946m
            long r0 = r0.presentationTimeUs
            r15.mo54191d((long) r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f16946m
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x013f
            r14 = 1
            goto L_0x0140
        L_0x013f:
            r14 = 0
        L_0x0140:
            r19.m20449U()
            if (r14 != 0) goto L_0x0146
            return r16
        L_0x0146:
            r19.m20461aa()
        L_0x0149:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p197f.C7382j.mo55176b(long, long):boolean");
    }

    /* renamed from: b */
    private static boolean m20467b(C7381i iVar) {
        String str = iVar.f16875a;
        return (C7728ai.f18249a <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (C7728ai.f18249a <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((C7728ai.f18249a <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(C7728ai.f18251c) && "AFTS".equals(C7728ai.f18252d) && iVar.f16881g));
    }

    /* renamed from: b */
    private static boolean m20468b(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    /* renamed from: b */
    private static boolean mo55179b(String str) {
        return C7728ai.f18249a < 18 || (C7728ai.f18249a == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (C7728ai.f18249a == 19 && C7728ai.f18252d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    /* renamed from: b */
    private static boolean m20470b(String str, C7864v vVar) {
        return C7728ai.f18249a <= 18 && vVar.f18934y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    /* renamed from: c */
    private int m20471c(String str) {
        if (C7728ai.f18249a <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (C7728ai.f18252d.startsWith("SM-T585") || C7728ai.f18252d.startsWith("SM-A510") || C7728ai.f18252d.startsWith("SM-A520") || C7728ai.f18252d.startsWith("SM-J700"))) {
            return 2;
        }
        if (C7728ai.f18249a >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(C7728ai.f18250b) || "flounder_lte".equals(C7728ai.f18250b) || "grouper".equals(C7728ai.f18250b) || "tilapia".equals(C7728ai.f18250b)) ? 1 : 0;
        }
        return 0;
    }

    /* renamed from: c */
    private C7172n m20472c(C7152f fVar) throws C7819p {
        C6915b g = fVar.mo53768g();
        if (g == null || (g instanceof C7172n)) {
            return (C7172n) g;
        }
        throw mo53849a((Throwable) new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + g), this.f16950q, (int) AdError.MEDIAVIEW_MISSING_ERROR_CODE);
    }

    /* renamed from: c */
    private boolean m20473c(long j, long j2) throws C7819p {
        C7717a.m22121b(!this.f16926am);
        if (this.f16943j.mo54150l()) {
            if (!mo53052a(j, j2, (C7376g) null, this.f16943j.f15332b, this.f16908V, 0, this.f16943j.mo54149k(), this.f16943j.mo54147i(), this.f16943j.mo53124b(), this.f16943j.mo53126c(), this.f16951r)) {
                return false;
            }
            mo54191d(this.f16943j.mo54148j());
            this.f16943j.mo53121a();
        }
        if (this.f16925al) {
            this.f16926am = true;
            return false;
        }
        if (this.f16914aa) {
            C7717a.m22121b(this.f16943j.mo54145a(this.f16942i));
            this.f16914aa = false;
        }
        if (this.f16915ab) {
            if (this.f16943j.mo54150l()) {
                return true;
            }
            mo53033B();
            this.f16915ab = false;
            mo54170E();
            if (!this.f16912Z) {
                return false;
            }
        }
        m20464ad();
        if (this.f16943j.mo54150l()) {
            this.f16943j.mo53143h();
        }
        return this.f16943j.mo54150l() || this.f16925al || this.f16915ab;
    }

    /* renamed from: c */
    protected static boolean m20474c(C7864v vVar) {
        return vVar.f18908E == 0 || vVar.f18908E == 2;
    }

    /* renamed from: c */
    private static boolean m20475c(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* renamed from: d */
    private List<C7381i> m20476d(boolean z) throws C7385l.C7388b {
        List<C7381i> a = mo53043a(this.f16937d, this.f16950q, z);
        if (a.isEmpty() && z) {
            a = mo53043a(this.f16937d, this.f16950q, false);
            if (!a.isEmpty()) {
                C7755q.m22361c("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f16950q.f18921l + ", but no secure decoder available. Trying to proceed with " + a + ".");
            }
        }
        return a;
    }

    /* renamed from: d */
    private void m20477d(C7864v vVar) {
        mo53033B();
        String str = vVar.f18921l;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f16943j.mo54146g(32);
        } else {
            this.f16943j.mo54146g(1);
        }
        this.f16912Z = true;
    }

    /* renamed from: d */
    private static boolean m20478d(String str) {
        return C7728ai.f18249a == 29 && "c2.android.aac.decoder".equals(str);
    }

    /* renamed from: e */
    private boolean mo55181e(int i) throws C7819p {
        C7867w t = mo53853t();
        this.f16940g.mo53121a();
        int a = mo53848a(t, this.f16940g, i | 4);
        if (a == -5) {
            mo53041a(t);
            return true;
        } else if (a != -4 || !this.f16940g.mo53126c()) {
            return false;
        } else {
            this.f16925al = true;
            m20461aa();
            return false;
        }
    }

    /* renamed from: e */
    private boolean mo55182e(long j) {
        return this.f16956w == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f16956w;
    }

    /* renamed from: e */
    private boolean m20481e(C7864v vVar) throws C7819p {
        if (!(C7728ai.f18249a < 23 || this.f16959z == null || this.f16919af == 3 || mo52835d_() == 0)) {
            float a = mo53036a(this.f16958y, vVar, mo53854u());
            float f = this.f16890D;
            if (f == a) {
                return true;
            }
            if (a == -1.0f) {
                m20453Y();
                return false;
            } else if (f == -1.0f && a <= this.f16939f) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", a);
                this.f16959z.mo54114a(bundle);
                this.f16890D = a;
            }
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m20482e(String str) {
        return (C7728ai.f18249a <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (C7728ai.f18249a <= 19 && (("hb2000".equals(C7728ai.f18250b) || "stvm8".equals(C7728ai.f18250b)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
    }

    /* renamed from: f */
    private boolean mo55183f(long j) {
        int size = this.f16945l.size();
        for (int i = 0; i < size; i++) {
            if (this.f16945l.get(i).longValue() == j) {
                this.f16945l.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m20484f(String str) {
        return C7728ai.f18249a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(C7728ai.f18251c) && (C7728ai.f18250b.startsWith("baffin") || C7728ai.f18250b.startsWith("grand") || C7728ai.f18250b.startsWith("fortuna") || C7728ai.f18250b.startsWith("gprimelte") || C7728ai.f18250b.startsWith("j2y18lte") || C7728ai.f18250b.startsWith("ms01"));
    }

    /* renamed from: g */
    private static boolean m20485g(String str) {
        return C7728ai.f18249a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: A */
    public boolean mo52825A() {
        return this.f16926am;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo53034C() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo53035D() throws C7819p {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo54170E() throws C7819p {
        C7864v vVar;
        if (this.f16959z == null && !this.f16912Z && (vVar = this.f16950q) != null) {
            if (this.f16953t != null || !mo53053b(vVar)) {
                m20465b(this.f16953t);
                String str = this.f16950q.f18921l;
                C7152f fVar = this.f16952s;
                if (fVar != null) {
                    if (this.f16954u == null) {
                        C7172n c = m20472c(fVar);
                        if (c != null) {
                            try {
                                this.f16954u = new MediaCrypto(c.f15747b, c.f15748c);
                                this.f16955v = !c.f15749d && this.f16954u.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e) {
                                throw mo53849a((Throwable) e, this.f16950q, 6006);
                            }
                        } else if (this.f16952s.mo53766e() == null) {
                            return;
                        }
                    }
                    if (C7172n.f15746a) {
                        int c2 = this.f16952s.mo53764c();
                        if (c2 == 1) {
                            C7152f.C7153a aVar = (C7152f.C7153a) C7717a.m22120b(this.f16952s.mo53766e());
                            throw mo53849a((Throwable) aVar, this.f16950q, aVar.f15731a);
                        } else if (c2 != 4) {
                            return;
                        }
                    }
                }
                try {
                    m20455a(this.f16954u, this.f16955v);
                } catch (C7383a e2) {
                    throw mo53849a((Throwable) e2, this.f16950q, 4001);
                }
            } else {
                m20477d(this.f16950q);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public boolean mo54171F() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final C7376g mo54172G() {
        return this.f16959z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final MediaFormat mo54173H() {
        return this.f16888B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final C7381i mo54174I() {
        return this.f16893G;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo54175J() {
        try {
            if (this.f16959z != null) {
                this.f16959z.mo54123e();
                this.f16913a.f15321b++;
                mo53049a(this.f16893G.f16875a);
            }
            this.f16959z = null;
            try {
                if (this.f16954u != null) {
                    this.f16954u.release();
                }
            } finally {
                this.f16954u = null;
                m20465b((C7152f) null);
                mo54179N();
            }
        } catch (Throwable th) {
            this.f16959z = null;
            if (this.f16954u != null) {
                this.f16954u.release();
            }
            throw th;
        } finally {
            this.f16954u = null;
            m20465b((C7152f) null);
            mo54179N();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final boolean mo54176K() throws C7819p {
        boolean L = mo54177L();
        if (L) {
            mo54170E();
        }
        return L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public boolean mo54177L() {
        if (this.f16959z == null) {
            return false;
        }
        if (this.f16919af == 3 || this.f16896J || ((this.f16897K && !this.f16922ai) || (this.f16898L && this.f16921ah))) {
            mo54175J();
            return true;
        }
        m20446R();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo54178M() {
        m20448T();
        m20449U();
        this.f16906T = -9223372036854775807L;
        this.f16921ah = false;
        this.f16920ag = false;
        this.f16902P = false;
        this.f16903Q = false;
        this.f16910X = false;
        this.f16911Y = false;
        this.f16945l.clear();
        this.f16923aj = -9223372036854775807L;
        this.f16924ak = -9223372036854775807L;
        C7374e eVar = this.f16905S;
        if (eVar != null) {
            eVar.mo54153a();
        }
        this.f16918ae = 0;
        this.f16919af = 0;
        this.f16917ad = this.f16916ac ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo54179N() {
        mo54178M();
        this.f16932as = null;
        this.f16905S = null;
        this.f16891E = null;
        this.f16893G = null;
        this.f16887A = null;
        this.f16888B = null;
        this.f16889C = false;
        this.f16922ai = false;
        this.f16890D = -1.0f;
        this.f16894H = 0;
        this.f16895I = false;
        this.f16896J = false;
        this.f16897K = false;
        this.f16898L = false;
        this.f16899M = false;
        this.f16900N = false;
        this.f16901O = false;
        this.f16904R = false;
        this.f16916ac = false;
        this.f16917ad = 0;
        this.f16955v = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public float mo54180O() {
        return this.f16957x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final void mo54181P() {
        this.f16928ao = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final long mo54182Q() {
        return this.f16934au;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo53036a(float f, C7864v vVar, C7864v[] vVarArr) {
        return -1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo53038a(C7384k kVar, C7864v vVar) throws C7385l.C7388b;

    /* renamed from: a */
    public final int mo52851a(C7864v vVar) throws C7819p {
        try {
            return mo53038a(this.f16937d, vVar);
        } catch (C7385l.C7388b e) {
            throw mo53849a((Throwable) e, vVar, 4002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6924h mo53040a(C7381i iVar, C7864v vVar, C7864v vVar2) {
        return new C6924h(iVar.f16875a, vVar, vVar2, 0, 1);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (m20452X() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b2, code lost:
        if (m20452X() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cf, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00eb A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.exoplayer2.p182c.C6924h mo53041a(com.applovin.exoplayer2.C7867w r12) throws com.applovin.exoplayer2.C7819p {
        /*
            r11 = this;
            r0 = 1
            r11.f16927an = r0
            com.applovin.exoplayer2.v r1 = r12.f18967b
            java.lang.Object r1 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r1)
            r5 = r1
            com.applovin.exoplayer2.v r5 = (com.applovin.exoplayer2.C7864v) r5
            java.lang.String r1 = r5.f18921l
            if (r1 == 0) goto L_0x00ec
            com.applovin.exoplayer2.d.f r12 = r12.f18966a
            r11.m20456a((com.applovin.exoplayer2.p185d.C7152f) r12)
            r11.f16950q = r5
            boolean r12 = r11.f16912Z
            r1 = 0
            if (r12 == 0) goto L_0x001f
            r11.f16915ab = r0
            return r1
        L_0x001f:
            com.applovin.exoplayer2.f.g r12 = r11.f16959z
            if (r12 != 0) goto L_0x0029
            r11.f16891E = r1
            r11.mo54170E()
            return r1
        L_0x0029:
            com.applovin.exoplayer2.f.i r1 = r11.f16893G
            com.applovin.exoplayer2.v r4 = r11.f16887A
            com.applovin.exoplayer2.d.f r2 = r11.f16952s
            com.applovin.exoplayer2.d.f r3 = r11.f16953t
            boolean r2 = r11.m20458a((com.applovin.exoplayer2.p197f.C7381i) r1, (com.applovin.exoplayer2.C7864v) r5, (com.applovin.exoplayer2.p185d.C7152f) r2, (com.applovin.exoplayer2.p185d.C7152f) r3)
            if (r2 == 0) goto L_0x0046
            r11.m20453Y()
            com.applovin.exoplayer2.c.h r12 = new com.applovin.exoplayer2.c.h
            java.lang.String r3 = r1.f16875a
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x0046:
            com.applovin.exoplayer2.d.f r2 = r11.f16953t
            com.applovin.exoplayer2.d.f r3 = r11.f16952s
            r6 = 0
            if (r2 == r3) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 == 0) goto L_0x005b
            int r3 = com.applovin.exoplayer2.p221l.C7728ai.f18249a
            r7 = 23
            if (r3 < r7) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            goto L_0x005c
        L_0x005b:
            r3 = 1
        L_0x005c:
            com.applovin.exoplayer2.p221l.C7717a.m22121b((boolean) r3)
            com.applovin.exoplayer2.c.h r3 = r11.mo53040a((com.applovin.exoplayer2.p197f.C7381i) r1, (com.applovin.exoplayer2.C7864v) r4, (com.applovin.exoplayer2.C7864v) r5)
            int r7 = r3.f15343d
            r8 = 3
            r9 = 16
            r10 = 2
            if (r7 == 0) goto L_0x00d1
            if (r7 == r0) goto L_0x00b5
            if (r7 == r10) goto L_0x0089
            if (r7 != r8) goto L_0x0083
            boolean r0 = r11.m20481e((com.applovin.exoplayer2.C7864v) r5)
            if (r0 != 0) goto L_0x0078
            goto L_0x00bb
        L_0x0078:
            r11.f16887A = r5
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r11.m20452X()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x0083:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0089:
            boolean r7 = r11.m20481e((com.applovin.exoplayer2.C7864v) r5)
            if (r7 != 0) goto L_0x0090
            goto L_0x00bb
        L_0x0090:
            r11.f16916ac = r0
            r11.f16917ad = r0
            int r7 = r11.f16894H
            if (r7 == r10) goto L_0x00a8
            if (r7 != r0) goto L_0x00a7
            int r7 = r5.f18926q
            int r9 = r4.f18926q
            if (r7 != r9) goto L_0x00a7
            int r7 = r5.f18927r
            int r9 = r4.f18927r
            if (r7 != r9) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r11.f16902P = r0
            r11.f16887A = r5
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r11.m20452X()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00b5:
            boolean r0 = r11.m20481e((com.applovin.exoplayer2.C7864v) r5)
            if (r0 != 0) goto L_0x00be
        L_0x00bb:
            r7 = 16
            goto L_0x00d5
        L_0x00be:
            r11.f16887A = r5
            if (r2 == 0) goto L_0x00c9
            boolean r0 = r11.m20452X()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00c9:
            boolean r0 = r11.m20451W()
            if (r0 != 0) goto L_0x00d4
        L_0x00cf:
            r7 = 2
            goto L_0x00d5
        L_0x00d1:
            r11.m20453Y()
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            int r0 = r3.f15343d
            if (r0 == 0) goto L_0x00eb
            com.applovin.exoplayer2.f.g r0 = r11.f16959z
            if (r0 != r12) goto L_0x00e1
            int r12 = r11.f16919af
            if (r12 != r8) goto L_0x00eb
        L_0x00e1:
            com.applovin.exoplayer2.c.h r12 = new com.applovin.exoplayer2.c.h
            java.lang.String r3 = r1.f16875a
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x00eb:
            return r3
        L_0x00ec:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.applovin.exoplayer2.p r12 = r11.mo53849a((java.lang.Throwable) r12, (com.applovin.exoplayer2.C7864v) r5, (int) r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p197f.C7382j.mo53041a(com.applovin.exoplayer2.w):com.applovin.exoplayer2.c.h");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C7376g.C7377a mo53042a(C7381i iVar, C7864v vVar, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7380h mo54183a(Throwable th, C7381i iVar) {
        return new C7380h(th, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<C7381i> mo53043a(C7384k kVar, C7864v vVar, boolean z) throws C7385l.C7388b;

    /* renamed from: a */
    public void mo52827a(float f, float f2) throws C7819p {
        this.f16957x = f;
        this.f16958y = f2;
        m20481e(this.f16887A);
    }

    /* renamed from: a */
    public void mo52830a(long j, long j2) throws C7819p {
        boolean z = false;
        if (this.f16928ao) {
            this.f16928ao = false;
            m20461aa();
        }
        C7819p pVar = this.f16932as;
        if (pVar == null) {
            try {
                if (this.f16926am) {
                    mo53035D();
                } else if (this.f16950q != null || mo55181e(2)) {
                    mo54170E();
                    if (this.f16912Z) {
                        C7727ah.m22175a("bypassRender");
                        while (m20473c(j, j2)) {
                        }
                    } else if (this.f16959z != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        C7727ah.m22175a("drainAndFeed");
                        while (mo55176b(j, j2) && mo55182e(elapsedRealtime)) {
                        }
                        while (m20450V() && mo55182e(elapsedRealtime)) {
                        }
                    } else {
                        this.f16913a.f15323d += mo53852b(j);
                        mo55181e(1);
                        this.f16913a.mo53138a();
                    }
                    C7727ah.m22174a();
                    this.f16913a.mo53138a();
                }
            } catch (IllegalStateException e) {
                if (m20459a(e)) {
                    mo53048a((Exception) e);
                    if (C7728ai.f18249a >= 21 && m20475c(e)) {
                        z = true;
                    }
                    if (z) {
                        mo54175J();
                    }
                    throw mo53850a((Throwable) mo54183a((Throwable) e, mo54174I()), this.f16950q, z, 4003);
                }
                throw e;
            }
        } else {
            this.f16932as = null;
            throw pVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53044a(long j, boolean z) throws C7819p {
        this.f16925al = false;
        this.f16926am = false;
        this.f16928ao = false;
        if (this.f16912Z) {
            this.f16943j.mo53121a();
            this.f16942i.mo53121a();
            this.f16914aa = false;
        } else {
            mo54176K();
        }
        if (this.f16944k.mo54984b() > 0) {
            this.f16927an = true;
        }
        this.f16944k.mo54982a();
        int i = this.f16935av;
        if (i != 0) {
            this.f16934au = this.f16948o[i - 1];
            this.f16933at = this.f16947n[i - 1];
            this.f16935av = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53046a(C6922g gVar) throws C7819p {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54184a(C7819p pVar) {
        this.f16932as = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53047a(C7864v vVar, MediaFormat mediaFormat) throws C7819p {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53048a(Exception exc) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53049a(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53050a(String str, long j, long j2) {
    }

    /* renamed from: a */
    public void mo54185a(boolean z) {
        this.f16929ap = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53051a(boolean z, boolean z2) throws C7819p {
        this.f16913a = new C6920e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53851a(C7864v[] vVarArr, long j, long j2) throws C7819p {
        boolean z = true;
        if (this.f16934au == -9223372036854775807L) {
            if (this.f16933at != -9223372036854775807L) {
                z = false;
            }
            C7717a.m22121b(z);
            this.f16933at = j;
            this.f16934au = j2;
            return;
        }
        int i = this.f16935av;
        if (i == this.f16948o.length) {
            C7755q.m22361c("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f16948o[this.f16935av - 1]);
        } else {
            this.f16935av = i + 1;
        }
        long[] jArr = this.f16947n;
        int i2 = this.f16935av;
        jArr[i2 - 1] = j;
        this.f16948o[i2 - 1] = j2;
        this.f16949p[i2 - 1] = this.f16923aj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo53052a(long j, long j2, C7376g gVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C7864v vVar) throws C7819p;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo54186a(C7381i iVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo54187b(C6922g gVar) throws C7819p {
    }

    /* renamed from: b */
    public void mo54188b(boolean z) {
        this.f16930aq = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo53053b(C7864v vVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo54189c(long j) throws C7819p {
        boolean z;
        C7864v a = this.f16944k.mo54981a(j);
        if (a == null && this.f16889C) {
            a = this.f16944k.mo54985c();
        }
        if (a != null) {
            this.f16951r = a;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f16889C && this.f16951r != null)) {
            mo53047a(this.f16951r, this.f16888B);
            this.f16889C = false;
        }
    }

    /* renamed from: c */
    public void mo54190c(boolean z) {
        this.f16931ar = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo54191d(long j) {
        while (true) {
            int i = this.f16935av;
            if (i != 0 && j >= this.f16949p[0]) {
                long[] jArr = this.f16947n;
                this.f16933at = jArr[0];
                this.f16934au = this.f16948o[0];
                int i2 = i - 1;
                this.f16935av = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f16948o;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f16935av);
                long[] jArr3 = this.f16949p;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f16935av);
                mo53034C();
            } else {
                return;
            }
        }
    }

    /* renamed from: o */
    public final int mo52852o() {
        return 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo53056p() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo53057q() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo53058r() {
        this.f16950q = null;
        this.f16933at = -9223372036854775807L;
        this.f16934au = -9223372036854775807L;
        this.f16935av = 0;
        mo54177L();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo53059s() {
        try {
            mo53033B();
            mo54175J();
        } finally {
            m20456a((C7152f) null);
        }
    }

    /* renamed from: z */
    public boolean mo52847z() {
        return this.f16950q != null && (mo53857x() || m20447S() || (this.f16906T != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f16906T));
    }
}
