package com.applovin.exoplayer2.p185d;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.p182c.C6915b;
import com.applovin.exoplayer2.p185d.C7148e;
import com.applovin.exoplayer2.p185d.C7152f;
import com.applovin.exoplayer2.p185d.C7154g;
import com.applovin.exoplayer2.p185d.C7167m;
import com.applovin.exoplayer2.p206h.C7499j;
import com.applovin.exoplayer2.p206h.C7505m;
import com.applovin.exoplayer2.p220k.C7699v;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7736h;
import com.applovin.exoplayer2.p221l.C7737i;
import com.applovin.exoplayer2.p221l.C7755q;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.exoplayer2.d.b */
class C7131b implements C7152f {

    /* renamed from: a */
    public final List<C7148e.C7150a> f15645a;

    /* renamed from: b */
    final C7177r f15646b;

    /* renamed from: c */
    final UUID f15647c;

    /* renamed from: d */
    final C7136e f15648d;

    /* renamed from: e */
    private final C7167m f15649e;

    /* renamed from: f */
    private final C7132a f15650f;

    /* renamed from: g */
    private final C7133b f15651g;

    /* renamed from: h */
    private final int f15652h;

    /* renamed from: i */
    private final boolean f15653i;

    /* renamed from: j */
    private final boolean f15654j;

    /* renamed from: k */
    private final HashMap<String, String> f15655k;

    /* renamed from: l */
    private final C7737i<C7154g.C7155a> f15656l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C7699v f15657m;

    /* renamed from: n */
    private int f15658n;

    /* renamed from: o */
    private int f15659o;

    /* renamed from: p */
    private HandlerThread f15660p;

    /* renamed from: q */
    private C7134c f15661q;

    /* renamed from: r */
    private C6915b f15662r;

    /* renamed from: s */
    private C7152f.C7153a f15663s;

    /* renamed from: t */
    private byte[] f15664t;

    /* renamed from: u */
    private byte[] f15665u;

    /* renamed from: v */
    private C7167m.C7168a f15666v;

    /* renamed from: w */
    private C7167m.C7171d f15667w;

    /* renamed from: com.applovin.exoplayer2.d.b$a */
    public interface C7132a {
        /* renamed from: a */
        void mo53770a();

        /* renamed from: a */
        void mo53771a(C7131b bVar);

        /* renamed from: a */
        void mo53772a(Exception exc, boolean z);
    }

    /* renamed from: com.applovin.exoplayer2.d.b$b */
    public interface C7133b {
        /* renamed from: a */
        void mo53773a(C7131b bVar, int i);

        /* renamed from: b */
        void mo53774b(C7131b bVar, int i);
    }

    /* renamed from: com.applovin.exoplayer2.d.b$c */
    private class C7134c extends Handler {

        /* renamed from: b */
        private boolean f15669b;

        public C7134c(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private boolean m19052a(Message message, C7178s sVar) {
            C7178s sVar2 = sVar;
            C7135d dVar = (C7135d) message.obj;
            if (!dVar.f15671b) {
                return false;
            }
            dVar.f15674e++;
            if (dVar.f15674e > C7131b.this.f15657m.mo54929a(3)) {
                return false;
            }
            long a = C7131b.this.f15657m.mo54930a(new C7699v.C7700a(new C7499j(dVar.f15670a, sVar2.f15758a, sVar2.f15759b, sVar2.f15760c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f15672c, sVar2.f15761d), new C7505m(3), sVar.getCause() instanceof IOException ? (IOException) sVar.getCause() : new C7137f(sVar.getCause()), dVar.f15674e));
            if (a == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f15669b) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), a);
                return true;
            }
        }

        /* renamed from: a */
        public synchronized void mo53775a() {
            removeCallbacksAndMessages((Object) null);
            this.f15669b = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo53776a(int i, Object obj, boolean z) {
            obtainMessage(i, new C7135d(C7499j.m20942a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.applovin.exoplayer2.d.s} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.applovin.exoplayer2.d.s} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.applovin.exoplayer2.d.s} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.Exception] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r6.obj
                com.applovin.exoplayer2.d.b$d r0 = (com.applovin.exoplayer2.p185d.C7131b.C7135d) r0
                int r1 = r6.what     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                if (r1 == 0) goto L_0x0022
                r2 = 1
                if (r1 != r2) goto L_0x001c
                com.applovin.exoplayer2.d.b r1 = com.applovin.exoplayer2.p185d.C7131b.this     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                com.applovin.exoplayer2.d.r r1 = r1.f15646b     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                com.applovin.exoplayer2.d.b r2 = com.applovin.exoplayer2.p185d.C7131b.this     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                java.util.UUID r2 = r2.f15647c     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                java.lang.Object r3 = r0.f15673d     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                com.applovin.exoplayer2.d.m$a r3 = (com.applovin.exoplayer2.p185d.C7167m.C7168a) r3     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                byte[] r1 = r1.mo53846a((java.util.UUID) r2, (com.applovin.exoplayer2.p185d.C7167m.C7168a) r3)     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                goto L_0x0044
            L_0x001c:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                r1.<init>()     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                throw r1     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
            L_0x0022:
                com.applovin.exoplayer2.d.b r1 = com.applovin.exoplayer2.p185d.C7131b.this     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                com.applovin.exoplayer2.d.r r1 = r1.f15646b     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                com.applovin.exoplayer2.d.b r2 = com.applovin.exoplayer2.p185d.C7131b.this     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                java.util.UUID r2 = r2.f15647c     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                java.lang.Object r3 = r0.f15673d     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                com.applovin.exoplayer2.d.m$d r3 = (com.applovin.exoplayer2.p185d.C7167m.C7171d) r3     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                byte[] r1 = r1.mo53847a((java.util.UUID) r2, (com.applovin.exoplayer2.p185d.C7167m.C7171d) r3)     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                goto L_0x0044
            L_0x0033:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                com.applovin.exoplayer2.p221l.C7755q.m22359b(r2, r3, r1)
                goto L_0x0044
            L_0x003c:
                r1 = move-exception
                boolean r2 = r5.m19052a(r6, r1)
                if (r2 == 0) goto L_0x0044
                return
            L_0x0044:
                com.applovin.exoplayer2.d.b r2 = com.applovin.exoplayer2.p185d.C7131b.this
                com.applovin.exoplayer2.k.v r2 = r2.f15657m
                long r3 = r0.f15670a
                r2.mo54931a((long) r3)
                monitor-enter(r5)
                boolean r2 = r5.f15669b     // Catch:{ all -> 0x0069 }
                if (r2 != 0) goto L_0x0067
                com.applovin.exoplayer2.d.b r2 = com.applovin.exoplayer2.p185d.C7131b.this     // Catch:{ all -> 0x0069 }
                com.applovin.exoplayer2.d.b$e r2 = r2.f15648d     // Catch:{ all -> 0x0069 }
                int r6 = r6.what     // Catch:{ all -> 0x0069 }
                java.lang.Object r0 = r0.f15673d     // Catch:{ all -> 0x0069 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0069 }
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch:{ all -> 0x0069 }
                r6.sendToTarget()     // Catch:{ all -> 0x0069 }
            L_0x0067:
                monitor-exit(r5)     // Catch:{ all -> 0x0069 }
                return
            L_0x0069:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0069 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p185d.C7131b.C7134c.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.b$d */
    private static final class C7135d {

        /* renamed from: a */
        public final long f15670a;

        /* renamed from: b */
        public final boolean f15671b;

        /* renamed from: c */
        public final long f15672c;

        /* renamed from: d */
        public final Object f15673d;

        /* renamed from: e */
        public int f15674e;

        public C7135d(long j, boolean z, long j2, Object obj) {
            this.f15670a = j;
            this.f15671b = z;
            this.f15672c = j2;
            this.f15673d = obj;
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.b$e */
    private class C7136e extends Handler {
        public C7136e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                C7131b.this.m19022a(obj, obj2);
            } else if (i == 1) {
                C7131b.this.m19027b(obj, obj2);
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.b$f */
    public static final class C7137f extends IOException {
        public C7137f(Throwable th) {
            super(th);
        }
    }

    public C7131b(UUID uuid, C7167m mVar, C7132a aVar, C7133b bVar, List<C7148e.C7150a> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, C7177r rVar, Looper looper, C7699v vVar) {
        List<C7148e.C7150a> list2;
        if (i == 1 || i == 3) {
            C7717a.m22120b(bArr);
        }
        this.f15647c = uuid;
        this.f15650f = aVar;
        this.f15651g = bVar;
        this.f15649e = mVar;
        this.f15652h = i;
        this.f15653i = z;
        this.f15654j = z2;
        if (bArr != null) {
            this.f15665u = bArr;
            list2 = null;
        } else {
            list2 = Collections.unmodifiableList((List) C7717a.m22120b(list));
        }
        this.f15645a = list2;
        this.f15655k = hashMap;
        this.f15646b = rVar;
        this.f15656l = new C7737i<>();
        this.f15657m = vVar;
        this.f15658n = 2;
        this.f15648d = new C7136e(looper);
    }

    /* renamed from: a */
    private void m19019a(C7736h<C7154g.C7155a> hVar) {
        for (C7154g.C7155a accept : this.f15656l.mo54997a()) {
            hVar.accept(accept);
        }
    }

    /* renamed from: a */
    private void m19020a(Exception exc, int i) {
        this.f15663s = new C7152f.C7153a(exc, C7161j.m19159a(exc, i));
        C7755q.m22362c("DefaultDrmSession", "DRM session error", exc);
        m19019a((C7736h<C7154g.C7155a>) new C7736h(exc) {
            public final /* synthetic */ Exception f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((C7154g.C7155a) obj).mo53822a(this.f$0);
            }
        });
        if (this.f15658n != 4) {
            this.f15658n = 1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19022a(Object obj, Object obj2) {
        if (obj != this.f15667w) {
            return;
        }
        if (this.f15658n == 2 || m19032m()) {
            this.f15667w = null;
            if (obj2 instanceof Exception) {
                this.f15650f.mo53772a((Exception) obj2, false);
                return;
            }
            try {
                this.f15649e.mo53833b((byte[]) obj2);
                this.f15650f.mo53770a();
            } catch (Exception e) {
                this.f15650f.mo53772a(e, true);
            }
        }
    }

    /* renamed from: a */
    private void m19023a(boolean z) {
        if (!this.f15654j) {
            byte[] bArr = (byte[]) C7728ai.m22198a(this.f15664t);
            int i = this.f15652h;
            if (i == 0 || i == 1) {
                if (this.f15665u == null) {
                    m19024a(bArr, 1, z);
                    return;
                } else if (this.f15658n == 4 || m19029j()) {
                    long k = m19030k();
                    if (this.f15652h == 0 && k <= 60) {
                        C7755q.m22356a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + k);
                    } else if (k <= 0) {
                        m19020a((Exception) new C7176q(), 2);
                        return;
                    } else {
                        this.f15658n = 4;
                        m19019a((C7736h<C7154g.C7155a>) $$Lambda$Gzv1dYveRHC7e0zRjSFyD1B82w.INSTANCE);
                        return;
                    }
                } else {
                    return;
                }
            } else if (i != 2) {
                if (i == 3) {
                    C7717a.m22120b(this.f15665u);
                    C7717a.m22120b(this.f15664t);
                    m19024a(this.f15665u, 3, z);
                    return;
                }
                return;
            } else if (this.f15665u != null && !m19029j()) {
                return;
            }
            m19024a(bArr, 2, z);
        }
    }

    /* renamed from: a */
    private void m19024a(byte[] bArr, int i, boolean z) {
        try {
            this.f15666v = this.f15649e.mo53826a(bArr, this.f15645a, i, this.f15655k);
            ((C7134c) C7728ai.m22198a(this.f15661q)).mo53776a(1, C7717a.m22120b(this.f15666v), z);
        } catch (Exception e) {
            m19026b(e, true);
        }
    }

    /* renamed from: b */
    private void m19026b(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.f15650f.mo53771a(this);
        } else {
            m19020a(exc, z ? 1 : 2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19027b(Object obj, Object obj2) {
        C7736h hVar;
        if (obj == this.f15666v && m19032m()) {
            this.f15666v = null;
            if (obj2 instanceof Exception) {
                m19026b((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f15652h == 3) {
                    this.f15649e.mo53831a((byte[]) C7728ai.m22198a(this.f15665u), bArr);
                    hVar = $$Lambda$vjhS4PV9Iv0rWoJZGb7FkEkouCU.INSTANCE;
                } else {
                    byte[] a = this.f15649e.mo53831a(this.f15664t, bArr);
                    if (!((this.f15652h != 2 && (this.f15652h != 0 || this.f15665u == null)) || a == null || a.length == 0)) {
                        this.f15665u = a;
                    }
                    this.f15658n = 4;
                    hVar = $$Lambda$Gs2KjknzbLUN5GYKO7rmhuMiyf4.INSTANCE;
                }
                m19019a((C7736h<C7154g.C7155a>) hVar);
            } catch (Exception e) {
                m19026b(e, true);
            }
        }
    }

    /* renamed from: i */
    private boolean m19028i() {
        if (m19032m()) {
            return true;
        }
        try {
            byte[] a = this.f15649e.mo53830a();
            this.f15664t = a;
            this.f15662r = this.f15649e.mo53838d(a);
            this.f15658n = 3;
            m19019a((C7736h<C7154g.C7155a>) new C7736h(3) {
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    ((C7154g.C7155a) obj).mo53819a(this.f$0);
                }
            });
            C7717a.m22120b(this.f15664t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f15650f.mo53771a(this);
            return false;
        } catch (Exception e) {
            m19020a(e, 1);
            return false;
        }
    }

    /* renamed from: j */
    private boolean m19029j() {
        try {
            this.f15649e.mo53834b(this.f15664t, this.f15665u);
            return true;
        } catch (Exception e) {
            m19020a(e, 1);
            return false;
        }
    }

    /* renamed from: k */
    private long m19030k() {
        if (!C7476h.f17125d.equals(this.f15647c)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C7717a.m22120b(C7180u.m19240a(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    /* renamed from: l */
    private void m19031l() {
        if (this.f15652h == 0 && this.f15658n == 4) {
            C7728ai.m22198a(this.f15664t);
            m19023a(false);
        }
    }

    /* renamed from: m */
    private boolean m19032m() {
        int i = this.f15658n;
        return i == 3 || i == 4;
    }

    /* renamed from: a */
    public void mo53756a() {
        this.f15667w = this.f15649e.mo53832b();
        ((C7134c) C7728ai.m22198a(this.f15661q)).mo53776a(0, C7717a.m22120b(this.f15667w), true);
    }

    /* renamed from: a */
    public void mo53757a(int i) {
        if (i == 2) {
            m19031l();
        }
    }

    /* renamed from: a */
    public void mo53758a(C7154g.C7155a aVar) {
        boolean z = false;
        C7717a.m22121b(this.f15659o >= 0);
        if (aVar != null) {
            this.f15656l.mo54998a(aVar);
        }
        int i = this.f15659o + 1;
        this.f15659o = i;
        if (i == 1) {
            if (this.f15658n == 2) {
                z = true;
            }
            C7717a.m22121b(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f15660p = handlerThread;
            handlerThread.start();
            this.f15661q = new C7134c(this.f15660p.getLooper());
            if (m19028i()) {
                m19023a(true);
            }
        } else if (aVar != null && m19032m() && this.f15656l.mo55000c(aVar) == 1) {
            aVar.mo53819a(this.f15658n);
        }
        this.f15651g.mo53773a(this, this.f15659o);
    }

    /* renamed from: a */
    public void mo53759a(Exception exc, boolean z) {
        m19020a(exc, z ? 1 : 3);
    }

    /* renamed from: a */
    public boolean mo53760a(String str) {
        return this.f15649e.mo53829a((byte[]) C7717a.m22115a(this.f15664t), str);
    }

    /* renamed from: a */
    public boolean mo53761a(byte[] bArr) {
        return Arrays.equals(this.f15664t, bArr);
    }

    /* renamed from: b */
    public void mo53762b() {
        if (m19028i()) {
            m19023a(true);
        }
    }

    /* renamed from: b */
    public void mo53763b(C7154g.C7155a aVar) {
        C7717a.m22121b(this.f15659o > 0);
        int i = this.f15659o - 1;
        this.f15659o = i;
        if (i == 0) {
            this.f15658n = 0;
            ((C7136e) C7728ai.m22198a(this.f15648d)).removeCallbacksAndMessages((Object) null);
            ((C7134c) C7728ai.m22198a(this.f15661q)).mo53775a();
            this.f15661q = null;
            ((HandlerThread) C7728ai.m22198a(this.f15660p)).quit();
            this.f15660p = null;
            this.f15662r = null;
            this.f15663s = null;
            this.f15666v = null;
            this.f15667w = null;
            byte[] bArr = this.f15664t;
            if (bArr != null) {
                this.f15649e.mo53828a(bArr);
                this.f15664t = null;
            }
        }
        if (aVar != null) {
            this.f15656l.mo54999b(aVar);
            if (this.f15656l.mo55000c(aVar) == 0) {
                aVar.mo53825d();
            }
        }
        this.f15651g.mo53774b(this, this.f15659o);
    }

    /* renamed from: c */
    public final int mo53764c() {
        return this.f15658n;
    }

    /* renamed from: d */
    public boolean mo53765d() {
        return this.f15653i;
    }

    /* renamed from: e */
    public final C7152f.C7153a mo53766e() {
        if (this.f15658n == 1) {
            return this.f15663s;
        }
        return null;
    }

    /* renamed from: f */
    public final UUID mo53767f() {
        return this.f15647c;
    }

    /* renamed from: g */
    public final C6915b mo53768g() {
        return this.f15662r;
    }

    /* renamed from: h */
    public Map<String, String> mo53769h() {
        byte[] bArr = this.f15664t;
        if (bArr == null) {
            return null;
        }
        return this.f15649e.mo53835c(bArr);
    }
}
