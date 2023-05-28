package com.bykv.p271vk.openvk.component.video.p272a.p276b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10137h;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10139i;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10146l;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10076a;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10093c;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10098a;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10099b;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10100c;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.b */
/* compiled from: DownloadTask */
class C10088b extends C10074a {

    /* renamed from: m */
    final Object f24915m = this;

    /* renamed from: n */
    final Object f24916n;

    /* renamed from: o */
    private final int f24917o;

    /* renamed from: p */
    private final C10090b f24918p;

    /* renamed from: q */
    private volatile C10137h.C10138a f24919q;

    /* renamed from: r */
    private volatile C10099b f24920r;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.b$b */
    /* compiled from: DownloadTask */
    public interface C10090b {
        /* renamed from: a */
        void mo62711a(C10088b bVar);
    }

    C10088b(C10089a aVar) {
        super(aVar.f24924d, aVar.f24925e);
        this.f24917o = aVar.f24927g;
        this.f24918p = aVar.f24929i;
        this.f24884g = aVar.f24921a;
        this.f24885h = aVar.f24922b;
        this.f24883f = aVar.f24926f;
        this.f24887j = aVar.f24923c;
        this.f24886i = aVar.f24928h;
        this.f24916n = aVar.f24930j;
    }

    public void run() {
        this.f24878a.mo62674a(this.f24885h);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            m28737j();
        } catch (C10098a unused) {
        }
        this.f24881d.set(SystemClock.elapsedRealtime() - elapsedRealtime);
        this.f24878a.mo62675b(this.f24885h);
        C10090b bVar = this.f24918p;
        if (bVar != null) {
            bVar.mo62711a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C10137h.C10138a mo62697h() {
        return this.f24919q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C10099b mo62698i() {
        return this.f24920r;
    }

    /* renamed from: j */
    private boolean m28737j() throws C10098a {
        while (this.f24887j.mo62793a()) {
            mo62670e();
            C10146l.C10147a b = this.f24887j.mo62794b();
            try {
                m28736a(b);
                return true;
            } catch (C10100c e) {
                b.mo62795a();
                mo62666a(Boolean.valueOf(mo62672g()), this.f24884g, e);
            } catch (IOException e2) {
                if (e2 instanceof SocketTimeoutException) {
                    b.mo62796b();
                }
                if (!mo62667b()) {
                    mo62666a(Boolean.valueOf(mo62672g()), this.f24884g, e2);
                }
            } catch (C10137h.C10138a e3) {
                this.f24919q = e3;
                mo62666a(Boolean.valueOf(mo62672g()), this.f24884g, e3);
                return false;
            } catch (C10099b e4) {
                this.f24920r = e4;
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        mo62668c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cf, code lost:
        if (com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d1, code lost:
        android.util.Log.i("TAG_PROXY_DownloadTask", "download succeed, no need to cancel call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d8, code lost:
        com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28909a((java.io.Closeable) r6.mo62749d());
        r4.mo62784a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e2, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x021d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28736a(com.bykv.p271vk.openvk.component.video.p272a.p276b.C10146l.C10147a r13) throws java.io.IOException, com.bykv.p271vk.openvk.component.video.p272a.p276b.C10137h.C10138a, com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10098a, com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10099b {
        /*
            r12 = this;
            com.bykv.vk.openvk.component.video.a.b.a.a r0 = r12.f24878a
            java.lang.String r1 = r12.f24885h
            java.io.File r0 = r0.mo62676c(r1)
            long r1 = r0.length()
            int r3 = r12.f24917o
            if (r3 <= 0) goto L_0x0044
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0044
            boolean r13 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r13 == 0) goto L_0x0043
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "no necessary to download for "
            r0.append(r3)
            java.lang.String r3 = r12.f24885h
            r0.append(r3)
            java.lang.String r3 = ", cache file size: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ", max: "
            r0.append(r1)
            int r1 = r12.f24917o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r13, r0)
        L_0x0043:
            return
        L_0x0044:
            int r3 = r12.mo62671f()
            com.bykv.vk.openvk.component.video.a.b.b.c r4 = r12.f24879b
            java.lang.String r5 = r12.f24885h
            com.bykv.vk.openvk.component.video.a.b.b.a r4 = r4.mo62712a((java.lang.String) r5, (int) r3)
            if (r4 == 0) goto L_0x0076
            int r5 = r4.f24933c
            long r5 = (long) r5
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0076
            boolean r13 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r13 == 0) goto L_0x0075
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "file download complete, key: "
            r0.append(r1)
            java.lang.String r1 = r12.f24885h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r13, r0)
        L_0x0075:
            return
        L_0x0076:
            r12.mo62670e()
            int r5 = (int) r1
            int r6 = r12.f24917o
            java.lang.String r7 = "GET"
            com.bykv.vk.openvk.component.video.a.b.e.a r6 = r12.mo62663a(r13, r5, r6, r7)
            if (r6 != 0) goto L_0x0085
            return
        L_0x0085:
            r7 = 0
            r8 = 1
            r9 = 0
            r12.mo62670e()     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.i r10 = r12.f24886i     // Catch:{ all -> 0x020e }
            if (r10 != 0) goto L_0x0095
            boolean r10 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24981e     // Catch:{ all -> 0x020e }
            if (r10 == 0) goto L_0x0095
            r10 = 1
            goto L_0x0096
        L_0x0095:
            r10 = 0
        L_0x0096:
            java.lang.String r10 = com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28904a(r6, r10, r8)     // Catch:{ all -> 0x020e }
            if (r10 != 0) goto L_0x01ea
            int r10 = com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28898a((com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e.C10114a) r6)     // Catch:{ all -> 0x020e }
            if (r4 == 0) goto L_0x0111
            int r11 = r4.f24933c     // Catch:{ all -> 0x020e }
            if (r11 == r10) goto L_0x0111
            boolean r0 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r1.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Content-Length not match, old: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            int r2 = r4.f24933c     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", key: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r12.f24885h     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x020e }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x020e }
        L_0x00d4:
            com.bykv.vk.openvk.component.video.a.b.c.b r0 = new com.bykv.vk.openvk.component.video.a.b.c.b     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r1.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Content-Length not match, old length: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            int r2 = r4.f24933c     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", new length: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r12.f24884g     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", currentUrl: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = ", previousInfo: "
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = r4.f24935e     // Catch:{ all -> 0x020e }
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x020e }
            r0.<init>(r13)     // Catch:{ all -> 0x020e }
            throw r0     // Catch:{ all -> 0x020e }
        L_0x0111:
            com.bykv.vk.openvk.component.video.a.b.b.c r13 = r12.f24879b     // Catch:{ all -> 0x020e }
            java.lang.String r4 = r12.f24885h     // Catch:{ all -> 0x020e }
            com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28900a(r6, r13, r4, r3)     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.b.c r13 = r12.f24879b     // Catch:{ all -> 0x020e }
            java.lang.String r4 = r12.f24885h     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.b.a r13 = r13.mo62712a((java.lang.String) r4, (int) r3)     // Catch:{ all -> 0x020e }
            if (r13 != 0) goto L_0x0124
            r13 = 0
            goto L_0x0126
        L_0x0124:
            int r13 = r13.f24933c     // Catch:{ all -> 0x020e }
        L_0x0126:
            java.io.InputStream r3 = r6.mo62749d()     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.h r4 = new com.bykv.vk.openvk.component.video.a.b.h     // Catch:{ all -> 0x020e }
            boolean r10 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24980d     // Catch:{ all -> 0x020e }
            if (r10 == 0) goto L_0x0133
            java.lang.String r10 = "rwd"
            goto L_0x0135
        L_0x0133:
            java.lang.String r10 = "rw"
        L_0x0135:
            r4.<init>(r0, r10)     // Catch:{ all -> 0x020e }
            r4.mo62785a((long) r1)     // Catch:{ all -> 0x01e7 }
            boolean r0 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e7 }
            r7.<init>()     // Catch:{ all -> 0x01e7 }
            java.lang.String r10 = "preload start from: "
            r7.append(r10)     // Catch:{ all -> 0x01e7 }
            r7.append(r1)     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x01e7 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x01e7 }
        L_0x0155:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01e7 }
        L_0x0159:
            int r1 = r3.read(r0)     // Catch:{ all -> 0x01e7 }
            if (r1 < 0) goto L_0x01ca
            r12.mo62670e()     // Catch:{ all -> 0x01e7 }
            if (r1 <= 0) goto L_0x0181
            r4.mo62786a(r0, r9, r1)     // Catch:{ all -> 0x01e7 }
            int r5 = r5 + r1
            com.bykv.vk.openvk.component.video.a.b.i r2 = r12.f24886i     // Catch:{ all -> 0x01e7 }
            if (r2 == 0) goto L_0x0179
            java.lang.Object r2 = r12.f24915m     // Catch:{ all -> 0x01e7 }
            monitor-enter(r2)     // Catch:{ all -> 0x01e7 }
            java.lang.Object r7 = r12.f24915m     // Catch:{ all -> 0x0176 }
            r7.notifyAll()     // Catch:{ all -> 0x0176 }
            monitor-exit(r2)     // Catch:{ all -> 0x0176 }
            goto L_0x0179
        L_0x0176:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0176 }
            throw r13     // Catch:{ all -> 0x01e7 }
        L_0x0179:
            java.util.concurrent.atomic.AtomicInteger r2 = r12.f24880c     // Catch:{ all -> 0x01e7 }
            r2.addAndGet(r1)     // Catch:{ all -> 0x01e7 }
            r12.mo62665a(r13, r5)     // Catch:{ all -> 0x01e7 }
        L_0x0181:
            int r1 = r12.f24917o     // Catch:{ all -> 0x01e7 }
            if (r1 <= 0) goto L_0x01c6
            int r1 = r12.f24917o     // Catch:{ all -> 0x01e7 }
            if (r5 < r1) goto L_0x01c6
            boolean r13 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01e7 }
            if (r13 == 0) goto L_0x01ad
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e7 }
            r0.<init>()     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = "download, more data received, currentCacheFileSize: "
            r0.append(r1)     // Catch:{ all -> 0x01e7 }
            r0.append(r5)     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = ", max: "
            r0.append(r1)     // Catch:{ all -> 0x01e7 }
            int r1 = r12.f24917o     // Catch:{ all -> 0x01e7 }
            r0.append(r1)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e7 }
            android.util.Log.w(r13, r0)     // Catch:{ all -> 0x01e7 }
        L_0x01ad:
            java.io.InputStream r13 = r6.mo62749d()
            com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28909a((java.io.Closeable) r13)
            r4.mo62784a()
            r12.mo62664a()
            boolean r13 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r13 == 0) goto L_0x01c5
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.String r0 = "cancel call"
            android.util.Log.w(r13, r0)
        L_0x01c5:
            return
        L_0x01c6:
            r12.mo62670e()     // Catch:{ all -> 0x01e7 }
            goto L_0x0159
        L_0x01ca:
            r12.mo62668c()     // Catch:{ all -> 0x01e3 }
            boolean r13 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01e3 }
            if (r13 == 0) goto L_0x01d8
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.String r0 = "download succeed, no need to cancel call"
            android.util.Log.i(r13, r0)     // Catch:{ all -> 0x01e3 }
        L_0x01d8:
            java.io.InputStream r13 = r6.mo62749d()
            com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28909a((java.io.Closeable) r13)
            r4.mo62784a()
            return
        L_0x01e3:
            r13 = move-exception
            r7 = r4
            r8 = 0
            goto L_0x020f
        L_0x01e7:
            r13 = move-exception
            r7 = r4
            goto L_0x020f
        L_0x01ea:
            com.bykv.vk.openvk.component.video.a.b.c.c r0 = new com.bykv.vk.openvk.component.video.a.b.c.c     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r1.<init>()     // Catch:{ all -> 0x020e }
            r1.append(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r12.f24884g     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", url: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x020e }
            r0.<init>(r13)     // Catch:{ all -> 0x020e }
            throw r0     // Catch:{ all -> 0x020e }
        L_0x020e:
            r13 = move-exception
        L_0x020f:
            java.io.InputStream r0 = r6.mo62749d()
            com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28909a((java.io.Closeable) r0)
            if (r7 == 0) goto L_0x021b
            r7.mo62784a()
        L_0x021b:
            if (r8 == 0) goto L_0x022b
            r12.mo62664a()
            boolean r0 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r0 == 0) goto L_0x022b
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.String r1 = "cancel call"
            android.util.Log.w(r0, r1)
        L_0x022b:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p271vk.openvk.component.video.p272a.p276b.C10088b.m28736a(com.bykv.vk.openvk.component.video.a.b.l$a):void");
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.b$a */
    /* compiled from: DownloadTask */
    static final class C10089a {

        /* renamed from: a */
        String f24921a;

        /* renamed from: b */
        String f24922b;

        /* renamed from: c */
        C10146l f24923c;

        /* renamed from: d */
        C10076a f24924d;

        /* renamed from: e */
        C10093c f24925e;

        /* renamed from: f */
        List<C10139i.C10141b> f24926f;

        /* renamed from: g */
        int f24927g;

        /* renamed from: h */
        C10139i f24928h;

        /* renamed from: i */
        C10090b f24929i;

        /* renamed from: j */
        Object f24930j;

        C10089a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10089a mo62707a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f24921a = str;
                return this;
            }
            throw new IllegalArgumentException("rawKey == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C10089a mo62710b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f24922b = str;
                return this;
            }
            throw new IllegalArgumentException("key == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10089a mo62705a(C10146l lVar) {
            if (lVar != null) {
                this.f24923c = lVar;
                return this;
            }
            throw new IllegalArgumentException("urls is empty");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10089a mo62701a(C10076a aVar) {
            if (aVar != null) {
                this.f24924d = aVar;
                return this;
            }
            throw new IllegalArgumentException("cache == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10089a mo62703a(C10093c cVar) {
            if (cVar != null) {
                this.f24925e = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10089a mo62708a(List<C10139i.C10141b> list) {
            this.f24926f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10089a mo62700a(int i) {
            this.f24927g = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10089a mo62702a(C10090b bVar) {
            this.f24929i = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10089a mo62704a(C10139i iVar) {
            this.f24928h = iVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10089a mo62706a(Object obj) {
            this.f24930j = obj;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10088b mo62709a() {
            if (this.f24924d != null && this.f24925e != null && !TextUtils.isEmpty(this.f24921a) && !TextUtils.isEmpty(this.f24922b) && this.f24923c != null) {
                return new C10088b(this);
            }
            throw new IllegalArgumentException();
        }
    }
}
