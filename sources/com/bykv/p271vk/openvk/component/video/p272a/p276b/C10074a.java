package com.bykv.p271vk.openvk.component.video.p272a.p276b;

import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10139i;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10146l;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10076a;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10077b;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10093c;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10098a;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p280d.C10111a;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e.C10114a;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e.C10115b;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e.C10116c;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e.C10119e;
import com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.a */
/* compiled from: AbsTask */
abstract class C10074a implements C10145k {

    /* renamed from: m */
    private static final AtomicLong f24877m = new AtomicLong();

    /* renamed from: a */
    protected volatile C10076a f24878a;

    /* renamed from: b */
    protected final C10093c f24879b;

    /* renamed from: c */
    protected final AtomicInteger f24880c = new AtomicInteger();

    /* renamed from: d */
    protected final AtomicLong f24881d = new AtomicLong();

    /* renamed from: e */
    protected C10111a f24882e;

    /* renamed from: f */
    protected volatile List<C10139i.C10141b> f24883f;

    /* renamed from: g */
    protected volatile String f24884g;

    /* renamed from: h */
    protected volatile String f24885h;

    /* renamed from: i */
    protected volatile C10139i f24886i;

    /* renamed from: j */
    protected volatile C10146l f24887j;

    /* renamed from: k */
    protected volatile boolean f24888k = false;

    /* renamed from: l */
    public final long f24889l = f24877m.incrementAndGet();

    /* renamed from: n */
    private final AtomicInteger f24890n = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f24891o = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62666a(Boolean bool, String str, Throwable th) {
    }

    public C10074a(C10076a aVar, C10093c cVar) {
        this.f24878a = aVar;
        this.f24879b = cVar;
    }

    /* renamed from: a */
    public void mo62664a() {
        this.f24890n.compareAndSet(0, 1);
    }

    /* renamed from: b */
    public boolean mo62667b() {
        return this.f24890n.get() == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo62668c() {
        this.f24890n.compareAndSet(0, 2);
    }

    /* renamed from: d */
    public boolean mo62669d() {
        return this.f24890n.get() == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo62670e() throws C10098a {
        if (mo62667b()) {
            throw new C10098a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10114a mo62663a(C10146l.C10147a aVar, int i, int i2, String str) throws IOException {
        C10115b b = C10116c.m28803a().mo62754b();
        C10119e eVar = new C10119e();
        HashMap hashMap = new HashMap();
        eVar.f24993b = aVar.f25075a;
        eVar.f24992a = 0;
        if (VersionInfo.GIT_BRANCH.equalsIgnoreCase(str)) {
            eVar.f24992a = 4;
        }
        List<C10139i.C10141b> list = this.f24883f;
        if (list != null && !list.isEmpty()) {
            for (C10139i.C10141b next : list) {
                if (!"Range".equalsIgnoreCase(next.f25059a) && !"Connection".equalsIgnoreCase(next.f25059a) && !"Proxy-Connection".equalsIgnoreCase(next.f25059a) && !"Host".equalsIgnoreCase(next.f25059a)) {
                    hashMap.put(next.f25059a, next.f25060b);
                }
            }
        }
        String a = C10148a.m28901a(i, i2);
        if (a != null) {
            hashMap.put("Range", a);
        }
        if (C10112e.f24982f) {
            hashMap.put("Cache-Control", "no-cache");
        }
        C10102d c = C10102d.m28766c();
        C10121f a2 = C10121f.m28816a();
        boolean z = this.f24886i == null;
        C10097c a3 = z ? c.mo62721a() : a2.mo62759b();
        C10097c b2 = z ? c.mo62731b() : a2.mo62760c();
        if (!(a3 == null && b2 == null)) {
            if (a3 != null) {
                eVar.f24994c = a3.mo62720a(aVar.f25076b);
            }
            if (b2 != null) {
                eVar.f24995d = b2.mo62720a(aVar.f25076b);
            }
        }
        eVar.f24996e = hashMap;
        if (!this.f24888k) {
            return b.mo62753a(eVar);
        }
        this.f24888k = false;
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo62671f() {
        if (this.f24886i != null) {
            return this.f24886i.f25051c.f25052a;
        }
        return this.f24878a instanceof C10077b ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo62672g() {
        return mo62671f() == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62665a(int i, int i2) {
        if (i > 0 && i2 >= 0) {
            int i3 = C10112e.f24983g;
            int f = mo62671f();
            if (i3 == 1 || (i3 == 2 && f == 1)) {
                int i4 = (int) ((((float) i2) / ((float) i)) * 100.0f);
                if (i4 > 100) {
                    i4 = 100;
                }
                synchronized (this) {
                    if (i4 > this.f24891o) {
                        this.f24891o = i4;
                        C10148a.m28911a((Runnable) new Runnable() {
                            public void run() {
                                if (C10074a.this.f24882e != null) {
                                    C10074a.this.f24882e.mo62742a(C10074a.this.f24887j, C10074a.this.f24891o);
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
