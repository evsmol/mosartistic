package com.applovin.exoplayer2.p185d;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.p183a.C6967aq;
import com.applovin.exoplayer2.common.p183a.C6980ax;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.common.p183a.C7047w;
import com.applovin.exoplayer2.p185d.C7131b;
import com.applovin.exoplayer2.p185d.C7138c;
import com.applovin.exoplayer2.p185d.C7148e;
import com.applovin.exoplayer2.p185d.C7152f;
import com.applovin.exoplayer2.p185d.C7154g;
import com.applovin.exoplayer2.p185d.C7157h;
import com.applovin.exoplayer2.p185d.C7167m;
import com.applovin.exoplayer2.p220k.C7687r;
import com.applovin.exoplayer2.p220k.C7699v;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7759u;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.applovin.exoplayer2.d.c */
public class C7138c implements C7157h {

    /* renamed from: a */
    volatile C7142c f15676a;

    /* renamed from: d */
    private final UUID f15677d;

    /* renamed from: e */
    private final C7167m.C7170c f15678e;

    /* renamed from: f */
    private final C7177r f15679f;

    /* renamed from: g */
    private final HashMap<String, String> f15680g;

    /* renamed from: h */
    private final boolean f15681h;

    /* renamed from: i */
    private final int[] f15682i;

    /* renamed from: j */
    private final boolean f15683j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C7145f f15684k;

    /* renamed from: l */
    private final C7699v f15685l;

    /* renamed from: m */
    private final C7146g f15686m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final long f15687n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final List<C7131b> f15688o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Set<C7144e> f15689p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Set<C7131b> f15690q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f15691r;

    /* renamed from: s */
    private C7167m f15692s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C7131b f15693t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C7131b f15694u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Looper f15695v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public Handler f15696w;

    /* renamed from: x */
    private int f15697x;

    /* renamed from: y */
    private byte[] f15698y;

    /* renamed from: com.applovin.exoplayer2.d.c$a */
    public static final class C7140a {

        /* renamed from: a */
        private final HashMap<String, String> f15699a = new HashMap<>();

        /* renamed from: b */
        private UUID f15700b = C7476h.f17125d;

        /* renamed from: c */
        private C7167m.C7170c f15701c = C7173o.f15750a;

        /* renamed from: d */
        private boolean f15702d;

        /* renamed from: e */
        private int[] f15703e = new int[0];

        /* renamed from: f */
        private boolean f15704f;

        /* renamed from: g */
        private C7699v f15705g = new C7687r();

        /* renamed from: h */
        private long f15706h = 300000;

        /* renamed from: a */
        public C7140a mo53785a(UUID uuid, C7167m.C7170c cVar) {
            this.f15700b = (UUID) C7717a.m22120b(uuid);
            this.f15701c = (C7167m.C7170c) C7717a.m22120b(cVar);
            return this;
        }

        /* renamed from: a */
        public C7140a mo53786a(boolean z) {
            this.f15702d = z;
            return this;
        }

        /* renamed from: a */
        public C7140a mo53787a(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (!(i == 2 || i == 1)) {
                    z = false;
                }
                C7717a.m22118a(z);
            }
            this.f15703e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: a */
        public C7138c mo53788a(C7177r rVar) {
            return new C7138c(this.f15700b, this.f15701c, rVar, this.f15699a, this.f15702d, this.f15703e, this.f15704f, this.f15705g, this.f15706h);
        }

        /* renamed from: b */
        public C7140a mo53789b(boolean z) {
            this.f15704f = z;
            return this;
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.c$b */
    private class C7141b implements C7167m.C7169b {
        private C7141b() {
        }

        /* renamed from: a */
        public void mo53790a(C7167m mVar, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((C7142c) C7717a.m22120b(C7138c.this.f15676a)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.c$c */
    private class C7142c extends Handler {
        public C7142c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (C7131b bVar : C7138c.this.f15688o) {
                    if (bVar.mo53761a(bArr)) {
                        bVar.mo53757a(message.what);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.c$d */
    public static final class C7143d extends Exception {
        private C7143d(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.c$e */
    private class C7144e implements C7157h.C7159a {

        /* renamed from: c */
        private final C7154g.C7155a f15710c;

        /* renamed from: d */
        private C7152f f15711d;

        /* renamed from: e */
        private boolean f15712e;

        public C7144e(C7154g.C7155a aVar) {
            this.f15710c = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m19094a() {
            if (!this.f15712e) {
                C7152f fVar = this.f15711d;
                if (fVar != null) {
                    fVar.mo53763b(this.f15710c);
                }
                C7138c.this.f15689p.remove(this);
                this.f15712e = true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m19095b(C7864v vVar) {
            if (C7138c.this.f15691r != 0 && !this.f15712e) {
                C7138c cVar = C7138c.this;
                this.f15711d = cVar.m19059a((Looper) C7717a.m22120b(cVar.f15695v), this.f15710c, vVar, false);
                C7138c.this.f15689p.add(this);
            }
        }

        /* renamed from: a */
        public void mo53792a(C7864v vVar) {
            ((Handler) C7717a.m22120b(C7138c.this.f15696w)).post(new Runnable(vVar) {
                public final /* synthetic */ C7864v f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C7138c.C7144e.this.m19095b(this.f$1);
                }
            });
        }

        public void release() {
            C7728ai.m22215a((Handler) C7717a.m22120b(C7138c.this.f15696w), (Runnable) new Runnable() {
                public final void run() {
                    C7138c.C7144e.this.m19094a();
                }
            });
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.c$f */
    private class C7145f implements C7131b.C7132a {

        /* renamed from: b */
        private final Set<C7131b> f15714b = new HashSet();

        /* renamed from: c */
        private C7131b f15715c;

        public C7145f() {
        }

        /* renamed from: a */
        public void mo53770a() {
            this.f15715c = null;
            C7033s<C7131b> a = C7033s.m18797a(this.f15714b);
            this.f15714b.clear();
            C6980ax<C7131b> a2 = a.iterator();
            while (a2.hasNext()) {
                a2.next().mo53762b();
            }
        }

        /* renamed from: a */
        public void mo53771a(C7131b bVar) {
            this.f15714b.add(bVar);
            if (this.f15715c == null) {
                this.f15715c = bVar;
                bVar.mo53756a();
            }
        }

        /* renamed from: a */
        public void mo53772a(Exception exc, boolean z) {
            this.f15715c = null;
            C7033s<C7131b> a = C7033s.m18797a(this.f15714b);
            this.f15714b.clear();
            C6980ax<C7131b> a2 = a.iterator();
            while (a2.hasNext()) {
                a2.next().mo53759a(exc, z);
            }
        }

        /* renamed from: b */
        public void mo53793b(C7131b bVar) {
            this.f15714b.remove(bVar);
            if (this.f15715c == bVar) {
                this.f15715c = null;
                if (!this.f15714b.isEmpty()) {
                    C7131b next = this.f15714b.iterator().next();
                    this.f15715c = next;
                    next.mo53756a();
                }
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.c$g */
    private class C7146g implements C7131b.C7133b {
        private C7146g() {
        }

        /* renamed from: a */
        public void mo53773a(C7131b bVar, int i) {
            if (C7138c.this.f15687n != -9223372036854775807L) {
                C7138c.this.f15690q.remove(bVar);
                ((Handler) C7717a.m22120b(C7138c.this.f15696w)).removeCallbacksAndMessages(bVar);
            }
        }

        /* renamed from: b */
        public void mo53774b(C7131b bVar, int i) {
            if (i == 1 && C7138c.this.f15691r > 0 && C7138c.this.f15687n != -9223372036854775807L) {
                C7138c.this.f15690q.add(bVar);
                ((Handler) C7717a.m22120b(C7138c.this.f15696w)).postAtTime(new Runnable() {
                    public final void run() {
                        C7131b.this.mo53763b((C7154g.C7155a) null);
                    }
                }, bVar, SystemClock.uptimeMillis() + C7138c.this.f15687n);
            } else if (i == 0) {
                C7138c.this.f15688o.remove(bVar);
                if (C7138c.this.f15693t == bVar) {
                    C7131b unused = C7138c.this.f15693t = null;
                }
                if (C7138c.this.f15694u == bVar) {
                    C7131b unused2 = C7138c.this.f15694u = null;
                }
                C7138c.this.f15684k.mo53793b(bVar);
                if (C7138c.this.f15687n != -9223372036854775807L) {
                    ((Handler) C7717a.m22120b(C7138c.this.f15696w)).removeCallbacksAndMessages(bVar);
                    C7138c.this.f15690q.remove(bVar);
                }
            }
            C7138c.this.m19075e();
        }
    }

    private C7138c(UUID uuid, C7167m.C7170c cVar, C7177r rVar, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, C7699v vVar, long j) {
        C7717a.m22120b(uuid);
        C7717a.m22119a(!C7476h.f17123b.equals(uuid), (Object) "Use C.CLEARKEY_UUID instead");
        this.f15677d = uuid;
        this.f15678e = cVar;
        this.f15679f = rVar;
        this.f15680g = hashMap;
        this.f15681h = z;
        this.f15682i = iArr;
        this.f15683j = z2;
        this.f15685l = vVar;
        this.f15684k = new C7145f();
        this.f15686m = new C7146g();
        this.f15697x = 0;
        this.f15688o = new ArrayList();
        this.f15689p = C6967aq.m18599b();
        this.f15690q = C6967aq.m18599b();
        this.f15687n = j;
    }

    /* renamed from: a */
    private C7131b m19056a(List<C7148e.C7150a> list, boolean z, C7154g.C7155a aVar) {
        C7717a.m22120b(this.f15692s);
        List<C7148e.C7150a> list2 = list;
        C7131b bVar = new C7131b(this.f15677d, this.f15692s, this.f15684k, this.f15686m, list2, this.f15697x, this.f15683j | z, z, this.f15698y, this.f15680g, this.f15679f, (Looper) C7717a.m22120b(this.f15695v), this.f15685l);
        bVar.mo53758a(aVar);
        if (this.f15687n != -9223372036854775807L) {
            bVar.mo53758a((C7154g.C7155a) null);
        }
        return bVar;
    }

    /* renamed from: a */
    private C7131b m19057a(List<C7148e.C7150a> list, boolean z, C7154g.C7155a aVar, boolean z2) {
        C7131b a = m19056a(list, z, aVar);
        if (m19066a((C7152f) a) && !this.f15690q.isEmpty()) {
            m19071c();
            m19064a((C7152f) a, aVar);
            a = m19056a(list, z, aVar);
        }
        if (!m19066a((C7152f) a) || !z2 || this.f15689p.isEmpty()) {
            return a;
        }
        m19073d();
        if (!this.f15690q.isEmpty()) {
            m19071c();
        }
        m19064a((C7152f) a, aVar);
        return m19056a(list, z, aVar);
    }

    /* renamed from: a */
    private C7152f m19058a(int i, boolean z) {
        C7167m mVar = (C7167m) C7717a.m22120b(this.f15692s);
        if ((mVar.mo53837d() == 2 && C7172n.f15746a) || C7728ai.m22187a(this.f15682i, i) == -1 || mVar.mo53837d() == 1) {
            return null;
        }
        C7131b bVar = this.f15693t;
        if (bVar == null) {
            C7131b a = m19057a((List<C7148e.C7150a>) C7033s.m18803g(), true, (C7154g.C7155a) null, z);
            this.f15688o.add(a);
            this.f15693t = a;
        } else {
            bVar.mo53758a((C7154g.C7155a) null);
        }
        return this.f15693t;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7152f m19059a(Looper looper, C7154g.C7155a aVar, C7864v vVar, boolean z) {
        List<C7148e.C7150a> list;
        m19069b(looper);
        if (vVar.f18924o == null) {
            return m19058a(C7759u.m22383e(vVar.f18921l), z);
        }
        C7131b bVar = null;
        if (this.f15698y == null) {
            list = m19062a((C7148e) C7717a.m22120b(vVar.f18924o), this.f15677d, false);
            if (list.isEmpty()) {
                C7143d dVar = new C7143d(this.f15677d);
                C7755q.m22362c("DefaultDrmSessionMgr", "DRM error", dVar);
                if (aVar != null) {
                    aVar.mo53822a((Exception) dVar);
                }
                return new C7166l(new C7152f.C7153a(dVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (this.f15681h) {
            Iterator<C7131b> it = this.f15688o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7131b next = it.next();
                if (C7728ai.m22218a((Object) next.f15645a, (Object) list)) {
                    bVar = next;
                    break;
                }
            }
        } else {
            bVar = this.f15694u;
        }
        if (bVar == null) {
            bVar = m19057a(list, false, aVar, z);
            if (!this.f15681h) {
                this.f15694u = bVar;
            }
            this.f15688o.add(bVar);
        } else {
            bVar.mo53758a(aVar);
        }
        return bVar;
    }

    /* renamed from: a */
    private static List<C7148e.C7150a> m19062a(C7148e eVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(eVar.f15723b);
        for (int i = 0; i < eVar.f15723b; i++) {
            C7148e.C7150a a = eVar.mo53796a(i);
            if ((a.mo53808a(uuid) || (C7476h.f17124c.equals(uuid) && a.mo53808a(C7476h.f17123b))) && (a.f15729d != null || z)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private synchronized void m19063a(Looper looper) {
        if (this.f15695v == null) {
            this.f15695v = looper;
            this.f15696w = new Handler(looper);
        } else {
            C7717a.m22121b(this.f15695v == looper);
            C7717a.m22120b(this.f15696w);
        }
    }

    /* renamed from: a */
    private void m19064a(C7152f fVar, C7154g.C7155a aVar) {
        fVar.mo53763b(aVar);
        if (this.f15687n != -9223372036854775807L) {
            fVar.mo53763b((C7154g.C7155a) null);
        }
    }

    /* renamed from: a */
    private boolean m19065a(C7148e eVar) {
        if (this.f15698y != null) {
            return true;
        }
        if (m19062a(eVar, this.f15677d, true).isEmpty()) {
            if (eVar.f15723b != 1 || !eVar.mo53796a(0).mo53808a(C7476h.f17123b)) {
                return false;
            }
            C7755q.m22361c("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f15677d);
        }
        String str = eVar.f15722a;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? C7728ai.f18249a >= 25 : !"cbc1".equals(str) && !"cens".equals(str);
    }

    /* renamed from: a */
    private static boolean m19066a(C7152f fVar) {
        return fVar.mo53764c() == 1 && (C7728ai.f18249a < 19 || (((C7152f.C7153a) C7717a.m22120b(fVar.mo53766e())).getCause() instanceof ResourceBusyException));
    }

    /* renamed from: b */
    private void m19069b(Looper looper) {
        if (this.f15676a == null) {
            this.f15676a = new C7142c(looper);
        }
    }

    /* renamed from: c */
    private void m19071c() {
        C6980ax<C7131b> a = C7047w.m18893a(this.f15690q).iterator();
        while (a.hasNext()) {
            a.next().mo53763b((C7154g.C7155a) null);
        }
    }

    /* renamed from: d */
    private void m19073d() {
        C6980ax<C7144e> a = C7047w.m18893a(this.f15689p).iterator();
        while (a.hasNext()) {
            a.next().release();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m19075e() {
        if (this.f15692s != null && this.f15691r == 0 && this.f15688o.isEmpty() && this.f15689p.isEmpty()) {
            ((C7167m) C7717a.m22120b(this.f15692s)).mo53836c();
            this.f15692s = null;
        }
    }

    /* renamed from: a */
    public int mo53779a(C7864v vVar) {
        int d = ((C7167m) C7717a.m22120b(this.f15692s)).mo53837d();
        if (vVar.f18924o == null) {
            if (C7728ai.m22187a(this.f15682i, C7759u.m22383e(vVar.f18921l)) != -1) {
                return d;
            }
            return 0;
        } else if (m19065a(vVar.f18924o)) {
            return d;
        } else {
            return 1;
        }
    }

    /* renamed from: a */
    public C7157h.C7159a mo53780a(Looper looper, C7154g.C7155a aVar, C7864v vVar) {
        C7717a.m22121b(this.f15691r > 0);
        m19063a(looper);
        C7144e eVar = new C7144e(aVar);
        eVar.mo53792a(vVar);
        return eVar;
    }

    /* renamed from: a */
    public final void mo53781a() {
        int i = this.f15691r;
        this.f15691r = i + 1;
        if (i == 0) {
            if (this.f15692s == null) {
                C7167m acquireExoMediaDrm = this.f15678e.acquireExoMediaDrm(this.f15677d);
                this.f15692s = acquireExoMediaDrm;
                acquireExoMediaDrm.mo53827a((C7167m.C7169b) new C7141b());
            } else if (this.f15687n != -9223372036854775807L) {
                for (int i2 = 0; i2 < this.f15688o.size(); i2++) {
                    this.f15688o.get(i2).mo53758a((C7154g.C7155a) null);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo53782a(int i, byte[] bArr) {
        C7717a.m22121b(this.f15688o.isEmpty());
        if (i == 1 || i == 3) {
            C7717a.m22120b(bArr);
        }
        this.f15697x = i;
        this.f15698y = bArr;
    }

    /* renamed from: b */
    public C7152f mo53783b(Looper looper, C7154g.C7155a aVar, C7864v vVar) {
        C7717a.m22121b(this.f15691r > 0);
        m19063a(looper);
        return m19059a(looper, aVar, vVar, true);
    }

    /* renamed from: b */
    public final void mo53784b() {
        int i = this.f15691r - 1;
        this.f15691r = i;
        if (i == 0) {
            if (this.f15687n != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f15688o);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((C7131b) arrayList.get(i2)).mo53763b((C7154g.C7155a) null);
                }
            }
            m19073d();
            m19075e();
        }
    }
}
