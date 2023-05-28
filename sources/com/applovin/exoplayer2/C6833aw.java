package com.applovin.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.C6814an;
import com.applovin.exoplayer2.C6822ao;
import com.applovin.exoplayer2.C6839ay;
import com.applovin.exoplayer2.C6844b;
import com.applovin.exoplayer2.C6911c;
import com.applovin.exoplayer2.C7650k;
import com.applovin.exoplayer2.C7820q;
import com.applovin.exoplayer2.p180a.C6781a;
import com.applovin.exoplayer2.p181b.C6856d;
import com.applovin.exoplayer2.p181b.C6864g;
import com.applovin.exoplayer2.p182c.C6920e;
import com.applovin.exoplayer2.p182c.C6924h;
import com.applovin.exoplayer2.p186e.C7223f;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.C7422e;
import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p206h.C7494f;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.C7515r;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7621l;
import com.applovin.exoplayer2.p219j.C7628c;
import com.applovin.exoplayer2.p219j.C7644h;
import com.applovin.exoplayer2.p219j.C7647j;
import com.applovin.exoplayer2.p220k.C7660d;
import com.applovin.exoplayer2.p220k.C7678n;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7718aa;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7732d;
import com.applovin.exoplayer2.p221l.C7735g;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p222m.C7805k;
import com.applovin.exoplayer2.p222m.C7806l;
import com.applovin.exoplayer2.p222m.C7814n;
import com.applovin.exoplayer2.p222m.C7816o;
import com.applovin.exoplayer2.p222m.p223a.C7777a;
import com.applovin.exoplayer2.p222m.p223a.C7788i;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: com.applovin.exoplayer2.aw */
public class C6833aw extends C7129d implements C7820q {

    /* renamed from: A */
    private int f14882A;

    /* renamed from: B */
    private int f14883B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C6920e f14884C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C6920e f14885D;

    /* renamed from: E */
    private int f14886E;

    /* renamed from: F */
    private C6856d f14887F;

    /* renamed from: G */
    private float f14888G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f14889H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public List<C7540a> f14890I;

    /* renamed from: J */
    private boolean f14891J;

    /* renamed from: K */
    private boolean f14892K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C7718aa f14893L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f14894M;

    /* renamed from: N */
    private boolean f14895N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C7818o f14896O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C7816o f14897P;

    /* renamed from: b */
    protected final C6827ar[] f14898b;

    /* renamed from: c */
    private final C7735g f14899c = new C7735g();

    /* renamed from: d */
    private final Context f14900d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7822r f14901e;

    /* renamed from: f */
    private final C6836b f14902f;

    /* renamed from: g */
    private final C6837c f14903g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CopyOnWriteArraySet<C6814an.C6820d> f14904h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C6781a f14905i;

    /* renamed from: j */
    private final C6844b f14906j;

    /* renamed from: k */
    private final C6911c f14907k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C6839ay f14908l;

    /* renamed from: m */
    private final C6909bb f14909m;

    /* renamed from: n */
    private final C6910bc f14910n;

    /* renamed from: o */
    private final long f14911o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C7864v f14912p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C7864v f14913q;

    /* renamed from: r */
    private AudioTrack f14914r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Object f14915s;

    /* renamed from: t */
    private Surface f14916t;

    /* renamed from: u */
    private SurfaceHolder f14917u;

    /* renamed from: v */
    private C7788i f14918v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f14919w;

    /* renamed from: x */
    private TextureView f14920x;

    /* renamed from: y */
    private int f14921y;

    /* renamed from: z */
    private int f14922z;

    @Deprecated
    /* renamed from: com.applovin.exoplayer2.aw$a */
    public static final class C6835a {

        /* renamed from: A */
        private boolean f14923A;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Context f14924a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C6831au f14925b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C7732d f14926c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f14927d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C7647j f14928e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C7515r f14929f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C6786aa f14930g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C7660d f14931h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C6781a f14932i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public Looper f14933j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C7718aa f14934k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C6856d f14935l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public boolean f14936m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f14937n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public boolean f14938o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f14939p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public int f14940q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public int f14941r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public boolean f14942s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public C6832av f14943t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public long f14944u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public long f14945v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public C7870z f14946w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public long f14947x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public long f14948y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public boolean f14949z;

        @Deprecated
        public C6835a(Context context) {
            this(context, new C7817n(context), new C7223f());
        }

        @Deprecated
        public C6835a(Context context, C6831au auVar, C7340l lVar) {
            this(context, auVar, new C7628c(context), new C7494f(context, lVar), new C7716l(), C7678n.m21979a(context), new C6781a(C7732d.f18265a));
        }

        @Deprecated
        public C6835a(Context context, C6831au auVar, C7647j jVar, C7515r rVar, C6786aa aaVar, C7660d dVar, C6781a aVar) {
            this.f14924a = context;
            this.f14925b = auVar;
            this.f14928e = jVar;
            this.f14929f = rVar;
            this.f14930g = aaVar;
            this.f14931h = dVar;
            this.f14932i = aVar;
            this.f14933j = C7728ai.m22247c();
            this.f14935l = C6856d.f14999a;
            this.f14937n = 0;
            this.f14940q = 1;
            this.f14941r = 0;
            this.f14942s = true;
            this.f14943t = C6832av.f14879e;
            this.f14944u = 5000;
            this.f14945v = 15000;
            this.f14946w = new C7650k.C7652a().mo54876a();
            this.f14926c = C7732d.f18265a;
            this.f14947x = 500;
            this.f14948y = 2000;
        }

        @Deprecated
        /* renamed from: a */
        public C6833aw mo52870a() {
            C7717a.m22121b(!this.f14923A);
            this.f14923A = true;
            return new C6833aw(this);
        }
    }

    /* renamed from: com.applovin.exoplayer2.aw$b */
    private final class C6836b implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C6814an.C6818b, C6839ay.C6841a, C6844b.C6846b, C6864g, C6911c.C6913b, C7422e, C7621l, C7788i.C7789a, C7814n, C7820q.C7821a {
        private C6836b() {
        }

        /* renamed from: a */
        public void mo52871a() {
            C6833aw.this.m17754a(false, -1, 3);
        }

        /* renamed from: a */
        public void mo52872a(float f) {
            C6833aw.this.m17734W();
        }

        /* renamed from: a */
        public void mo52873a(int i) {
            boolean x = C6833aw.this.mo52789x();
            C6833aw.this.m17754a(x, i, C6833aw.m17756b(x, i));
        }

        /* renamed from: a */
        public void mo52459a(int i, long j) {
            C6833aw.this.f14905i.mo52459a(i, j);
        }

        /* renamed from: a */
        public void mo52460a(int i, long j, long j2) {
            C6833aw.this.f14905i.mo52460a(i, j, j2);
        }

        /* renamed from: a */
        public void mo52874a(int i, boolean z) {
            Iterator it = C6833aw.this.f14904h.iterator();
            while (it.hasNext()) {
                ((C6814an.C6820d) it.next()).mo52467a(i, z);
            }
        }

        /* renamed from: a */
        public void mo52468a(long j) {
            C6833aw.this.f14905i.mo52468a(j);
        }

        /* renamed from: a */
        public void mo52469a(long j, int i) {
            C6833aw.this.f14905i.mo52469a(j, i);
        }

        /* renamed from: a */
        public void mo52875a(Surface surface) {
            C6833aw.this.m17753a((Object) null);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52471a(C6787ab abVar, int i) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, abVar, i);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52472a(C6797ac acVar) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, acVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52473a(C6811ak akVar) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, akVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52474a(C6813am amVar) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, amVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52475a(C6814an.C6816a aVar) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, aVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52476a(C6814an.C6821e eVar, C6814an.C6821e eVar2, int i) {
            C6814an.C6818b.CC.$default$a(this, eVar, eVar2, i);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52478a(C6814an anVar, C6814an.C6819c cVar) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, anVar, cVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52479a(C6904ba baVar, int i) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, baVar, i);
        }

        /* renamed from: a */
        public void mo52480a(C6920e eVar) {
            C6920e unused = C6833aw.this.f14884C = eVar;
            C6833aw.this.f14905i.mo52480a(eVar);
        }

        /* renamed from: a */
        public void mo52876a(C7399a aVar) {
            C6833aw.this.f14905i.mo52481a(aVar);
            C6833aw.this.f14901e.mo55237a(aVar);
            Iterator it = C6833aw.this.f14904h.iterator();
            while (it.hasNext()) {
                ((C6814an.C6820d) it.next()).mo52481a(aVar);
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo52482a(C7483ad adVar, C7644h hVar) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, adVar, hVar);
        }

        /* renamed from: a */
        public void mo52483a(C7816o oVar) {
            C7816o unused = C6833aw.this.f14897P = oVar;
            C6833aw.this.f14905i.mo52483a(oVar);
            Iterator it = C6833aw.this.f14904h.iterator();
            while (it.hasNext()) {
                ((C6814an.C6820d) it.next()).mo52483a(oVar);
            }
        }

        @Deprecated
        /* renamed from: a */
        public /* synthetic */ void mo52485a(C7864v vVar) {
            C6864g.CC.$default$a((C6864g) this, vVar);
        }

        /* renamed from: a */
        public void mo52486a(C7864v vVar, C6924h hVar) {
            C7864v unused = C6833aw.this.f14912p = vVar;
            C6833aw.this.f14905i.mo52486a(vVar, hVar);
        }

        /* renamed from: a */
        public void mo52487a(Exception exc) {
            C6833aw.this.f14905i.mo52487a(exc);
        }

        /* renamed from: a */
        public void mo52488a(Object obj, long j) {
            C6833aw.this.f14905i.mo52488a(obj, j);
            if (C6833aw.this.f14915s == obj) {
                Iterator it = C6833aw.this.f14904h.iterator();
                while (it.hasNext()) {
                    ((C6814an.C6820d) it.next()).mo52456a();
                }
            }
        }

        /* renamed from: a */
        public void mo52489a(String str) {
            C6833aw.this.f14905i.mo52489a(str);
        }

        /* renamed from: a */
        public void mo52490a(String str, long j, long j2) {
            C6833aw.this.f14905i.mo52490a(str, j, j2);
        }

        /* renamed from: a */
        public void mo52877a(List<C7540a> list) {
            List unused = C6833aw.this.f14890I = list;
            Iterator it = C6833aw.this.f14904h.iterator();
            while (it.hasNext()) {
                ((C6814an.C6820d) it.next()).mo52491a(list);
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo52878a(boolean z) {
            C7820q.C7821a.CC.$default$a(this, z);
        }

        @Deprecated
        /* renamed from: a */
        public /* synthetic */ void mo52493a(boolean z, int i) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, z, i);
        }

        @Deprecated
        /* renamed from: a_ */
        public /* synthetic */ void mo52494a_(C7864v vVar) {
            C7814n.CC.$default$a_(this, vVar);
        }

        /* renamed from: a_ */
        public void mo52495a_(boolean z) {
            if (C6833aw.this.f14889H != z) {
                boolean unused = C6833aw.this.f14889H = z;
                C6833aw.this.m17735X();
            }
        }

        @Deprecated
        /* renamed from: b */
        public /* synthetic */ void mo52496b() {
            C6814an.C6818b.CC.$default$b(this);
        }

        /* renamed from: b */
        public void mo52497b(int i) {
            C6833aw.this.m17736Y();
        }

        /* renamed from: b */
        public /* synthetic */ void mo52501b(C6811ak akVar) {
            C6814an.C6818b.CC.$default$b((C6814an.C6818b) this, akVar);
        }

        /* renamed from: b */
        public void mo52502b(C6920e eVar) {
            C6833aw.this.f14905i.mo52502b(eVar);
            C7864v unused = C6833aw.this.f14912p = null;
            C6920e unused2 = C6833aw.this.f14884C = null;
        }

        /* renamed from: b */
        public void mo52503b(C7864v vVar, C6924h hVar) {
            C7864v unused = C6833aw.this.f14913q = vVar;
            C6833aw.this.f14905i.mo52503b(vVar, hVar);
        }

        /* renamed from: b */
        public void mo52504b(Exception exc) {
            C6833aw.this.f14905i.mo52504b(exc);
        }

        /* renamed from: b */
        public void mo52505b(String str) {
            C6833aw.this.f14905i.mo52505b(str);
        }

        /* renamed from: b */
        public void mo52506b(String str, long j, long j2) {
            C6833aw.this.f14905i.mo52506b(str, j, j2);
        }

        /* renamed from: b */
        public void mo52879b(boolean z) {
            C6833aw.this.m17736Y();
        }

        /* renamed from: b */
        public void mo52507b(boolean z, int i) {
            C6833aw.this.m17736Y();
        }

        /* renamed from: b_ */
        public void mo52508b_(boolean z) {
            C6833aw awVar;
            if (C6833aw.this.f14893L != null) {
                boolean z2 = false;
                if (z && !C6833aw.this.f14894M) {
                    C6833aw.this.f14893L.mo54958a(0);
                    awVar = C6833aw.this;
                    z2 = true;
                } else if (!z && C6833aw.this.f14894M) {
                    C6833aw.this.f14893L.mo54959b(0);
                    awVar = C6833aw.this;
                } else {
                    return;
                }
                boolean unused = awVar.f14894M = z2;
            }
        }

        /* renamed from: c */
        public /* synthetic */ void mo52510c(int i) {
            C6814an.C6818b.CC.$default$c((C6814an.C6818b) this, i);
        }

        /* renamed from: c */
        public void mo52513c(C6920e eVar) {
            C6920e unused = C6833aw.this.f14885D = eVar;
            C6833aw.this.f14905i.mo52513c(eVar);
        }

        /* renamed from: c */
        public void mo52514c(Exception exc) {
            C6833aw.this.f14905i.mo52514c(exc);
        }

        @Deprecated
        /* renamed from: c */
        public /* synthetic */ void mo52515c(boolean z) {
            C6814an.C6818b.CC.$default$c((C6814an.C6818b) this, z);
        }

        /* renamed from: d */
        public /* synthetic */ void mo52517d(int i) {
            C6814an.C6818b.CC.$default$d((C6814an.C6818b) this, i);
        }

        /* renamed from: d */
        public void mo52519d(C6920e eVar) {
            C6833aw.this.f14905i.mo52519d(eVar);
            C7864v unused = C6833aw.this.f14913q = null;
            C6920e unused2 = C6833aw.this.f14885D = null;
        }

        /* renamed from: d */
        public /* synthetic */ void mo52520d(boolean z) {
            C6814an.C6818b.CC.$default$d((C6814an.C6818b) this, z);
        }

        @Deprecated
        /* renamed from: e */
        public /* synthetic */ void mo52522e(int i) {
            C6814an.C6818b.CC.$default$e((C6814an.C6818b) this, i);
        }

        /* renamed from: e */
        public /* synthetic */ void mo52524e(boolean z) {
            C6814an.C6818b.CC.$default$e((C6814an.C6818b) this, z);
        }

        /* renamed from: f */
        public void mo52880f(int i) {
            C7818o a = C6833aw.m17758b(C6833aw.this.f14908l);
            if (!a.equals(C6833aw.this.f14896O)) {
                C7818o unused = C6833aw.this.f14896O = a;
                Iterator it = C6833aw.this.f14904h.iterator();
                while (it.hasNext()) {
                    ((C6814an.C6820d) it.next()).mo52484a(a);
                }
            }
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C6833aw.this.m17748a(surfaceTexture);
            C6833aw.this.m17746a(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C6833aw.this.m17753a((Object) null);
            C6833aw.this.m17746a(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C6833aw.this.m17746a(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C6833aw.this.m17746a(i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C6833aw.this.f14919w) {
                C6833aw.this.m17753a((Object) surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C6833aw.this.f14919w) {
                C6833aw.this.m17753a((Object) null);
            }
            C6833aw.this.m17746a(0, 0);
        }
    }

    /* renamed from: com.applovin.exoplayer2.aw$c */
    private static final class C6837c implements C6822ao.C6824b, C7777a, C7806l {

        /* renamed from: a */
        private C7806l f14951a;

        /* renamed from: b */
        private C7777a f14952b;

        /* renamed from: c */
        private C7806l f14953c;

        /* renamed from: d */
        private C7777a f14954d;

        private C6837c() {
        }

        /* renamed from: a */
        public void mo52888a() {
            C7777a aVar = this.f14954d;
            if (aVar != null) {
                aVar.mo52888a();
            }
            C7777a aVar2 = this.f14952b;
            if (aVar2 != null) {
                aVar2.mo52888a();
            }
        }

        /* renamed from: a */
        public void mo52821a(int i, Object obj) {
            C7777a aVar;
            if (i == 7) {
                this.f14951a = (C7806l) obj;
            } else if (i == 8) {
                this.f14952b = (C7777a) obj;
            } else if (i == 10000) {
                C7788i iVar = (C7788i) obj;
                if (iVar == null) {
                    aVar = null;
                    this.f14953c = null;
                } else {
                    this.f14953c = iVar.getVideoFrameMetadataListener();
                    aVar = iVar.getCameraMotionListener();
                }
                this.f14954d = aVar;
            }
        }

        /* renamed from: a */
        public void mo52889a(long j, long j2, C7864v vVar, MediaFormat mediaFormat) {
            C7806l lVar = this.f14953c;
            if (lVar != null) {
                lVar.mo52889a(j, j2, vVar, mediaFormat);
            }
            C7806l lVar2 = this.f14951a;
            if (lVar2 != null) {
                lVar2.mo52889a(j, j2, vVar, mediaFormat);
            }
        }

        /* renamed from: a */
        public void mo52890a(long j, float[] fArr) {
            C7777a aVar = this.f14954d;
            if (aVar != null) {
                aVar.mo52890a(j, fArr);
            }
            C7777a aVar2 = this.f14952b;
            if (aVar2 != null) {
                aVar2.mo52890a(j, fArr);
            }
        }
    }

    protected C6833aw(C6835a aVar) {
        C6833aw awVar;
        try {
            this.f14900d = aVar.f14924a.getApplicationContext();
            this.f14905i = aVar.f14932i;
            this.f14893L = aVar.f14934k;
            this.f14887F = aVar.f14935l;
            this.f14921y = aVar.f14940q;
            this.f14922z = aVar.f14941r;
            this.f14889H = aVar.f14939p;
            this.f14911o = aVar.f14948y;
            this.f14902f = new C6836b();
            this.f14903g = new C6837c();
            this.f14904h = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(aVar.f14933j);
            this.f14898b = aVar.f14925b.mo52856a(handler, this.f14902f, this.f14902f, this.f14902f, this.f14902f);
            this.f14888G = 1.0f;
            this.f14886E = C7728ai.f18249a < 21 ? m17764d(0) : C7476h.m20796a(this.f14900d);
            this.f14890I = Collections.emptyList();
            this.f14891J = true;
            Handler handler2 = handler;
            C7822r rVar = r1;
            try {
                C7822r rVar2 = new C7822r(this.f14898b, aVar.f14928e, aVar.f14929f, aVar.f14930g, aVar.f14931h, this.f14905i, aVar.f14942s, aVar.f14943t, aVar.f14944u, aVar.f14945v, aVar.f14946w, aVar.f14947x, aVar.f14949z, aVar.f14926c, aVar.f14933j, this, new C6814an.C6816a.C6817a().mo52798a(20, 21, 22, 23, 24, 25, 26, 27).mo52799a());
                awVar = this;
                try {
                    awVar.f14901e = rVar;
                    rVar.mo55236a((C6814an.C6818b) awVar.f14902f);
                    awVar.f14901e.mo55239a((C7820q.C7821a) awVar.f14902f);
                    if (aVar.f14927d > 0) {
                        awVar.f14901e.mo55244b(aVar.f14927d);
                    }
                    Handler handler3 = handler2;
                    C6844b bVar = new C6844b(aVar.f14924a, handler3, awVar.f14902f);
                    awVar.f14906j = bVar;
                    bVar.mo52900a(aVar.f14938o);
                    C6911c cVar = new C6911c(aVar.f14924a, handler3, awVar.f14902f);
                    awVar.f14907k = cVar;
                    cVar.mo53118a(aVar.f14936m ? awVar.f14887F : null);
                    C6839ay ayVar = new C6839ay(aVar.f14924a, handler3, awVar.f14902f);
                    awVar.f14908l = ayVar;
                    ayVar.mo52894a(C7728ai.m22262g(awVar.f14887F.f15003d));
                    C6909bb bbVar = new C6909bb(aVar.f14924a);
                    awVar.f14909m = bbVar;
                    bbVar.mo53112a(aVar.f14937n != 0);
                    C6910bc bcVar = new C6910bc(aVar.f14924a);
                    awVar.f14910n = bcVar;
                    bcVar.mo53114a(aVar.f14937n == 2);
                    awVar.f14896O = m17758b(awVar.f14908l);
                    awVar.f14897P = C7816o.f18542a;
                    awVar.m17747a(1, 10, (Object) Integer.valueOf(awVar.f14886E));
                    awVar.m17747a(2, 10, (Object) Integer.valueOf(awVar.f14886E));
                    awVar.m17747a(1, 3, (Object) awVar.f14887F);
                    awVar.m17747a(2, 4, (Object) Integer.valueOf(awVar.f14921y));
                    awVar.m17747a(2, 5, (Object) Integer.valueOf(awVar.f14922z));
                    awVar.m17747a(1, 9, (Object) Boolean.valueOf(awVar.f14889H));
                    awVar.m17747a(2, 7, (Object) awVar.f14903g);
                    awVar.m17747a(6, 8, (Object) awVar.f14903g);
                    awVar.f14899c.mo54992a();
                } catch (Throwable th) {
                    th = th;
                    awVar.f14899c.mo54992a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                awVar = this;
                awVar.f14899c.mo54992a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            awVar = this;
            awVar.f14899c.mo54992a();
            throw th;
        }
    }

    /* renamed from: U */
    private void m17733U() {
        if (this.f14918v != null) {
            this.f14901e.mo55235a((C6822ao.C6824b) this.f14903g).mo52806a(10000).mo52807a((Object) null).mo52818i();
            this.f14918v.mo55140b(this.f14902f);
            this.f14918v = null;
        }
        TextureView textureView = this.f14920x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f14902f) {
                C7755q.m22361c("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f14920x.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f14920x = null;
        }
        SurfaceHolder surfaceHolder = this.f14917u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f14902f);
            this.f14917u = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m17734W() {
        m17747a(1, 2, (Object) Float.valueOf(this.f14888G * this.f14907k.mo53116a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m17735X() {
        this.f14905i.mo52495a_(this.f14889H);
        Iterator<C6814an.C6820d> it = this.f14904h.iterator();
        while (it.hasNext()) {
            it.next().mo52495a_(this.f14889H);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m17736Y() {
        int t = mo52786t();
        boolean z = true;
        if (t != 1) {
            if (t == 2 || t == 3) {
                boolean q = mo52868q();
                C6909bb bbVar = this.f14909m;
                if (!mo52789x() || q) {
                    z = false;
                }
                bbVar.mo53113b(z);
                this.f14910n.mo53115b(mo52789x());
                return;
            } else if (t != 4) {
                throw new IllegalStateException();
            }
        }
        this.f14909m.mo53113b(false);
        this.f14910n.mo53115b(false);
    }

    /* renamed from: Z */
    private void m17737Z() {
        this.f14899c.mo54995d();
        if (Thread.currentThread() != mo52784r().getThread()) {
            String a = C7728ai.m22200a("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), mo52784r().getThread().getName());
            if (!this.f14891J) {
                C7755q.m22359b("SimpleExoPlayer", a, this.f14892K ? null : new IllegalStateException());
                this.f14892K = true;
                return;
            }
            throw new IllegalStateException(a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17746a(int i, int i2) {
        if (i != this.f14882A || i2 != this.f14883B) {
            this.f14882A = i;
            this.f14883B = i2;
            this.f14905i.mo52458a(i, i2);
            Iterator<C6814an.C6820d> it = this.f14904h.iterator();
            while (it.hasNext()) {
                it.next().mo52458a(i, i2);
            }
        }
    }

    /* renamed from: a */
    private void m17747a(int i, int i2, Object obj) {
        for (C6827ar arVar : this.f14898b) {
            if (arVar.mo52826a() == i) {
                this.f14901e.mo55235a((C6822ao.C6824b) arVar).mo52806a(i2).mo52807a(obj).mo52818i();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17748a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        m17753a((Object) surface);
        this.f14916t = surface;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17753a(Object obj) {
        boolean z;
        ArrayList<C6822ao> arrayList = new ArrayList<>();
        C6827ar[] arVarArr = this.f14898b;
        int length = arVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            C6827ar arVar = arVarArr[i];
            if (arVar.mo52826a() == 2) {
                arrayList.add(this.f14901e.mo55235a((C6822ao.C6824b) arVar).mo52806a(1).mo52807a(obj).mo52818i());
            }
            i++;
        }
        Object obj2 = this.f14915s;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (C6822ao a : arrayList) {
                    a.mo52810a(this.f14911o);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.f14915s;
            Surface surface = this.f14916t;
            if (obj3 == surface) {
                surface.release();
                this.f14916t = null;
            }
        }
        this.f14915s = obj;
        if (z) {
            this.f14901e.mo55243a(false, C7819p.m22727a((RuntimeException) new C7834u(3), 1003));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17754a(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.f14901e.mo55242a(z2, i3, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m17756b(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C7818o m17758b(C6839ay ayVar) {
        return new C7818o(0, ayVar.mo52893a(), ayVar.mo52895b());
    }

    /* renamed from: c */
    private void m17763c(SurfaceHolder surfaceHolder) {
        this.f14919w = false;
        this.f14917u = surfaceHolder;
        surfaceHolder.addCallback(this.f14902f);
        Surface surface = this.f14917u.getSurface();
        if (surface == null || !surface.isValid()) {
            m17746a(0, 0);
            return;
        }
        Rect surfaceFrame = this.f14917u.getSurfaceFrame();
        m17746a(surfaceFrame.width(), surfaceFrame.height());
    }

    /* renamed from: d */
    private int m17764d(int i) {
        AudioTrack audioTrack = this.f14914r;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i)) {
            this.f14914r.release();
            this.f14914r = null;
        }
        if (this.f14914r == null) {
            this.f14914r = new AudioTrack(3, TTAdSdk.INIT_LOCAL_FAIL_CODE, 4, 2, 2, 0, i);
        }
        return this.f14914r.getAudioSessionId();
    }

    /* renamed from: A */
    public long mo52745A() {
        m17737Z();
        return this.f14901e.mo52745A();
    }

    /* renamed from: B */
    public long mo52746B() {
        m17737Z();
        return this.f14901e.mo52746B();
    }

    /* renamed from: C */
    public long mo52747C() {
        m17737Z();
        return this.f14901e.mo52747C();
    }

    /* renamed from: D */
    public C6813am mo52748D() {
        m17737Z();
        return this.f14901e.mo52748D();
    }

    /* renamed from: E */
    public void mo52860E() {
        AudioTrack audioTrack;
        m17737Z();
        if (C7728ai.f18249a < 21 && (audioTrack = this.f14914r) != null) {
            audioTrack.release();
            this.f14914r = null;
        }
        this.f14906j.mo52900a(false);
        this.f14908l.mo52896c();
        this.f14909m.mo53113b(false);
        this.f14910n.mo53115b(false);
        this.f14907k.mo53119b();
        this.f14901e.mo55233E();
        this.f14905i.mo52509c();
        m17733U();
        Surface surface = this.f14916t;
        if (surface != null) {
            surface.release();
            this.f14916t = null;
        }
        if (this.f14894M) {
            ((C7718aa) C7717a.m22120b(this.f14893L)).mo54959b(0);
            this.f14894M = false;
        }
        this.f14890I = Collections.emptyList();
        this.f14895N = true;
    }

    /* renamed from: F */
    public int mo52749F() {
        m17737Z();
        return this.f14901e.mo52749F();
    }

    /* renamed from: G */
    public int mo52750G() {
        m17737Z();
        return this.f14901e.mo52750G();
    }

    /* renamed from: H */
    public long mo52751H() {
        m17737Z();
        return this.f14901e.mo52751H();
    }

    /* renamed from: I */
    public long mo52752I() {
        m17737Z();
        return this.f14901e.mo52752I();
    }

    /* renamed from: J */
    public long mo52753J() {
        m17737Z();
        return this.f14901e.mo52753J();
    }

    /* renamed from: K */
    public boolean mo52754K() {
        m17737Z();
        return this.f14901e.mo52754K();
    }

    /* renamed from: L */
    public int mo52755L() {
        m17737Z();
        return this.f14901e.mo52755L();
    }

    /* renamed from: M */
    public int mo52756M() {
        m17737Z();
        return this.f14901e.mo52756M();
    }

    /* renamed from: N */
    public long mo52757N() {
        m17737Z();
        return this.f14901e.mo52757N();
    }

    /* renamed from: O */
    public long mo52758O() {
        m17737Z();
        return this.f14901e.mo52758O();
    }

    /* renamed from: P */
    public C7483ad mo52759P() {
        m17737Z();
        return this.f14901e.mo52759P();
    }

    /* renamed from: Q */
    public C7644h mo52760Q() {
        m17737Z();
        return this.f14901e.mo52760Q();
    }

    /* renamed from: R */
    public C6797ac mo52761R() {
        return this.f14901e.mo52761R();
    }

    /* renamed from: S */
    public C6904ba mo52762S() {
        m17737Z();
        return this.f14901e.mo52762S();
    }

    /* renamed from: T */
    public C7816o mo52763T() {
        return this.f14897P;
    }

    /* renamed from: V */
    public List<C7540a> mo52764V() {
        m17737Z();
        return this.f14890I;
    }

    /* renamed from: a */
    public void mo52861a(float f) {
        m17737Z();
        float a = C7728ai.m22178a(f, 0.0f, 1.0f);
        if (this.f14888G != a) {
            this.f14888G = a;
            m17734W();
            this.f14905i.mo52457a(a);
            Iterator<C6814an.C6820d> it = this.f14904h.iterator();
            while (it.hasNext()) {
                it.next().mo52457a(a);
            }
        }
    }

    /* renamed from: a */
    public void mo52765a(int i, long j) {
        m17737Z();
        this.f14905i.mo52516d();
        this.f14901e.mo52765a(i, j);
    }

    /* renamed from: a */
    public void mo52862a(SurfaceHolder surfaceHolder) {
        m17737Z();
        if (surfaceHolder == null) {
            mo52869v();
            return;
        }
        m17733U();
        this.f14919w = true;
        this.f14917u = surfaceHolder;
        surfaceHolder.addCallback(this.f14902f);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m17753a((Object) null);
            m17746a(0, 0);
            return;
        }
        m17753a((Object) surface);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        m17746a(surfaceFrame.width(), surfaceFrame.height());
    }

    /* renamed from: a */
    public void mo52767a(SurfaceView surfaceView) {
        m17737Z();
        if (surfaceView instanceof C7805k) {
            m17733U();
            m17753a((Object) surfaceView);
        } else if (surfaceView instanceof C7788i) {
            m17733U();
            this.f14918v = (C7788i) surfaceView;
            this.f14901e.mo55235a((C6822ao.C6824b) this.f14903g).mo52806a(10000).mo52807a((Object) this.f14918v).mo52818i();
            this.f14918v.mo55139a(this.f14902f);
            m17753a((Object) this.f14918v.getVideoSurface());
        } else {
            mo52862a(surfaceView == null ? null : surfaceView.getHolder());
            return;
        }
        m17763c(surfaceView.getHolder());
    }

    /* renamed from: a */
    public void mo52768a(TextureView textureView) {
        m17737Z();
        if (textureView == null) {
            mo52869v();
            return;
        }
        m17733U();
        this.f14920x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            C7755q.m22361c("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f14902f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m17753a((Object) null);
            m17746a(0, 0);
            return;
        }
        m17748a(surfaceTexture);
        m17746a(textureView.getWidth(), textureView.getHeight());
    }

    @Deprecated
    /* renamed from: a */
    public void mo52863a(C6814an.C6818b bVar) {
        C7717a.m22120b(bVar);
        this.f14901e.mo55236a(bVar);
    }

    /* renamed from: a */
    public void mo52769a(C6814an.C6820d dVar) {
        C7717a.m22120b(dVar);
        this.f14904h.add(dVar);
        mo52863a((C6814an.C6818b) dVar);
    }

    /* renamed from: a */
    public void mo52864a(C7509p pVar) {
        m17737Z();
        this.f14901e.mo55238a(pVar);
    }

    /* renamed from: a */
    public void mo52770a(boolean z) {
        m17737Z();
        int a = this.f14907k.mo53117a(z, mo52786t());
        m17754a(z, a, m17756b(z, a));
    }

    /* renamed from: b */
    public C7819p mo52780e() {
        m17737Z();
        return this.f14901e.mo52780e();
    }

    /* renamed from: b */
    public void mo52866b(SurfaceHolder surfaceHolder) {
        m17737Z();
        if (surfaceHolder != null && surfaceHolder == this.f14917u) {
            mo52869v();
        }
    }

    /* renamed from: b */
    public void mo52773b(SurfaceView surfaceView) {
        m17737Z();
        mo52866b(surfaceView == null ? null : surfaceView.getHolder());
    }

    /* renamed from: b */
    public void mo52774b(TextureView textureView) {
        m17737Z();
        if (textureView != null && textureView == this.f14920x) {
            mo52869v();
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo52867b(C6814an.C6818b bVar) {
        this.f14901e.mo55245b(bVar);
    }

    /* renamed from: b */
    public void mo52775b(C6814an.C6820d dVar) {
        C7717a.m22120b(dVar);
        this.f14904h.remove(dVar);
        mo52867b((C6814an.C6818b) dVar);
    }

    /* renamed from: b */
    public void mo52776b(boolean z) {
        m17737Z();
        this.f14901e.mo52776b(z);
    }

    /* renamed from: c */
    public void mo52778c(int i) {
        m17737Z();
        this.f14901e.mo52778c(i);
    }

    /* renamed from: q */
    public boolean mo52868q() {
        m17737Z();
        return this.f14901e.mo52868q();
    }

    /* renamed from: r */
    public Looper mo52784r() {
        return this.f14901e.mo52784r();
    }

    /* renamed from: s */
    public C6814an.C6816a mo52785s() {
        m17737Z();
        return this.f14901e.mo52785s();
    }

    /* renamed from: t */
    public int mo52786t() {
        m17737Z();
        return this.f14901e.mo52786t();
    }

    /* renamed from: u */
    public int mo52787u() {
        m17737Z();
        return this.f14901e.mo52787u();
    }

    /* renamed from: v */
    public void mo52869v() {
        m17737Z();
        m17733U();
        m17753a((Object) null);
        m17746a(0, 0);
    }

    /* renamed from: w */
    public void mo52788w() {
        m17737Z();
        boolean x = mo52789x();
        int a = this.f14907k.mo53117a(x, 2);
        m17754a(x, a, m17756b(x, a));
        this.f14901e.mo52788w();
    }

    /* renamed from: x */
    public boolean mo52789x() {
        m17737Z();
        return this.f14901e.mo52789x();
    }

    /* renamed from: y */
    public int mo52790y() {
        m17737Z();
        return this.f14901e.mo52790y();
    }

    /* renamed from: z */
    public boolean mo52791z() {
        m17737Z();
        return this.f14901e.mo52791z();
    }
}
