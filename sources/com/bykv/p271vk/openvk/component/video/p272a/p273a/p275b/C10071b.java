package com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b;

import android.content.Context;
import com.bykv.p271vk.openvk.component.video.api.C10184b;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p290e.C10197a;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import com.bykv.p271vk.openvk.component.video.p272a.p285e.C10180c;
import com.bytedance.sdk.component.p307b.p308a.C10457b;
import com.bytedance.sdk.component.p307b.p308a.C10467c;
import com.bytedance.sdk.component.p307b.p308a.C10476i;
import com.bytedance.sdk.component.p307b.p308a.C10479k;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.b.b */
/* compiled from: ReallyVideoPreload */
public class C10071b {

    /* renamed from: a */
    private Context f24867a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10188c f24868b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f24869c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public File f24870d = null;

    /* renamed from: e */
    private File f24871e = null;

    /* renamed from: f */
    private final List<C10197a.C10198a> f24872f = new ArrayList();

    /* renamed from: g */
    private volatile boolean f24873g = false;

    public C10071b(Context context, C10188c cVar) {
        this.f24867a = context;
        this.f24868b = cVar;
        this.f24870d = C10180c.m29077b(cVar.mo62936a(), cVar.mo62962k());
        this.f24871e = C10180c.m29078c(cVar.mo62936a(), cVar.mo62962k());
    }

    /* renamed from: a */
    public void mo62661a(C10197a.C10198a aVar) {
        if (this.f24873g) {
            synchronized (C10197a.C10198a.class) {
                this.f24872f.add(aVar);
            }
            return;
        }
        this.f24872f.add(aVar);
        if (this.f24871e.exists() || (!this.f24868b.mo62959h() && this.f24870d.length() >= ((long) this.f24868b.mo62943b()))) {
            C10202c.m29289b("VideoPreload", "Cache file is exist");
            this.f24868b.mo62958g(1);
            m28677a(this.f24868b, 200);
            C10073c.m28695a(this.f24868b);
            return;
        }
        this.f24873g = true;
        this.f24868b.mo62958g(0);
        m28681b();
    }

    /* renamed from: b */
    private void m28681b() {
        C10476i.C10477a aVar;
        if (C10184b.m29130e() != null) {
            aVar = C10184b.m29130e().mo63966b();
        } else {
            aVar = new C10476i.C10477a();
        }
        aVar.mo63967a((long) this.f24868b.mo62964m(), TimeUnit.MILLISECONDS).mo63970b((long) this.f24868b.mo62965n(), TimeUnit.MILLISECONDS).mo63971c((long) this.f24868b.mo62966o(), TimeUnit.MILLISECONDS);
        C10476i a = aVar.mo63969a();
        C10479k.C10480a aVar2 = new C10479k.C10480a();
        final long length = this.f24870d.length();
        if (this.f24868b.mo62959h()) {
            aVar2.mo63987a("RANGE", "bytes=" + length + "-").mo63986a(this.f24868b.mo62961j()).mo63981a().mo63989b();
        } else {
            aVar2.mo63987a("RANGE", "bytes=" + length + "-" + this.f24868b.mo62943b()).mo63986a(this.f24868b.mo62961j()).mo63981a().mo63989b();
        }
        a.mo63868a(aVar2.mo63989b()).mo63861a(new C10467c() {
            /* renamed from: a */
            public void mo62658a(C10457b bVar, IOException iOException) {
                C10071b bVar2 = C10071b.this;
                bVar2.m28678a(bVar2.f24868b, 601, iOException.getMessage());
                C10073c.m28695a(C10071b.this.f24868b);
            }

            /* JADX WARNING: Removed duplicated region for block: B:54:0x0185 A[Catch:{ all -> 0x01d2 }] */
            /* JADX WARNING: Removed duplicated region for block: B:88:0x025a A[Catch:{ all -> 0x02a4 }] */
            /* JADX WARNING: Removed duplicated region for block: B:98:0x019d A[SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo62657a(com.bytedance.sdk.component.p307b.p308a.C10457b r23, com.bytedance.sdk.component.p307b.p308a.C10483m r24) throws java.io.IOException {
                /*
                    r22 = this;
                    r1 = r22
                    r2 = r24
                    long r3 = r2
                    r6 = 0
                    r7 = 3
                    java.lang.String r8 = " Preload size="
                    r9 = 2
                    java.lang.String r10 = "Pre finally "
                    r11 = 4
                    java.lang.String r12 = "VideoPreload"
                    r13 = 1
                    r14 = 0
                    if (r2 == 0) goto L_0x01e5
                    boolean r0 = r24.mo63891d()     // Catch:{ all -> 0x01e1 }
                    if (r0 != 0) goto L_0x0079
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x0070 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x0070 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f24868b     // Catch:{ all -> 0x0070 }
                    int r4 = r24.mo63889c()     // Catch:{ all -> 0x0070 }
                    java.lang.String r15 = r24.mo63892e()     // Catch:{ all -> 0x0070 }
                    r0.m28678a((com.bykv.p271vk.openvk.component.video.api.p288c.C10188c) r3, (int) r4, (java.lang.String) r15)     // Catch:{ all -> 0x0070 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r14] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f24868b
                    java.lang.String r2 = r2.mo62961j()
                    r0[r13] = r2
                    r0[r9] = r8
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f24868b
                    int r2 = r2.mo62943b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r0[r7] = r2
                    com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29291b((java.lang.String) r12, (java.lang.Object[]) r0)
                L_0x0066:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r0 = r0.f24868b
                    com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10073c.m28695a(r0)
                    return
                L_0x0070:
                    r0 = move-exception
                    r7 = r6
                    r23 = r8
                    r5 = 601(0x259, float:8.42E-43)
                    r8 = r7
                    goto L_0x0248
                L_0x0079:
                    com.bytedance.sdk.component.b.a.n r15 = r24.mo63893f()     // Catch:{ all -> 0x01e1 }
                    com.bytedance.sdk.component.b.a.n r15 = r24.mo63893f()     // Catch:{ all -> 0x01da }
                    r16 = 0
                    if (r0 == 0) goto L_0x009d
                    if (r15 == 0) goto L_0x009d
                    r23 = r8
                    long r7 = r2     // Catch:{ all -> 0x0099 }
                    long r18 = r15.mo63897a()     // Catch:{ all -> 0x0099 }
                    long r7 = r7 + r18
                    java.io.InputStream r0 = r15.mo63899c()     // Catch:{ all -> 0x0099 }
                    r18 = r7
                    r7 = r0
                    goto L_0x00a2
                L_0x0099:
                    r0 = move-exception
                    r7 = r6
                    r8 = r7
                    goto L_0x00f5
                L_0x009d:
                    r23 = r8
                    r7 = r6
                    r18 = r16
                L_0x00a2:
                    if (r7 != 0) goto L_0x00fa
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x00f3 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x00f3 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f24868b     // Catch:{ all -> 0x00f3 }
                    int r4 = r24.mo63889c()     // Catch:{ all -> 0x00f3 }
                    java.lang.String r8 = r24.mo63892e()     // Catch:{ all -> 0x00f3 }
                    r0.m28678a((com.bykv.p271vk.openvk.component.video.api.p288c.C10188c) r3, (int) r4, (java.lang.String) r8)     // Catch:{ all -> 0x00f3 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r15)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r14] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f24868b
                    java.lang.String r2 = r2.mo62961j()
                    r0[r13] = r2
                    r0[r9] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f24868b
                    int r2 = r2.mo62943b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29291b((java.lang.String) r12, (java.lang.Object[]) r0)
                    goto L_0x0066
                L_0x00f3:
                    r0 = move-exception
                    r8 = r6
                L_0x00f5:
                    r6 = r15
                    r5 = 601(0x259, float:8.42E-43)
                    goto L_0x0248
                L_0x00fa:
                    java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ all -> 0x01d5 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x01d5 }
                    java.io.File r0 = r0.f24870d     // Catch:{ all -> 0x01d5 }
                    java.lang.String r6 = "rw"
                    r8.<init>(r0, r6)     // Catch:{ all -> 0x01d5 }
                    r0 = 8192(0x2000, float:1.14794E-41)
                    byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01d2 }
                    r20 = r16
                    r6 = 0
                L_0x010e:
                    int r5 = 8192 - r6
                    int r5 = r7.read(r0, r6, r5)     // Catch:{ all -> 0x01d2 }
                    r9 = -1
                    if (r5 == r9) goto L_0x01a2
                    com.bykv.vk.openvk.component.video.a.a.b.b r9 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x01d2 }
                    boolean r9 = r9.f24869c     // Catch:{ all -> 0x01d2 }
                    if (r9 == 0) goto L_0x016b
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f24868b     // Catch:{ all -> 0x01d2 }
                    int r4 = r24.mo63889c()     // Catch:{ all -> 0x01d2 }
                    r0.m28683b(r3, r4)     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r8)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r15)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r14] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f24868b
                    java.lang.String r2 = r2.mo62961j()
                    r0[r13] = r2
                    r2 = 2
                    r0[r2] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f24868b
                    int r2 = r2.mo62943b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29291b((java.lang.String) r12, (java.lang.Object[]) r0)
                    goto L_0x0066
                L_0x016b:
                    int r6 = r6 + r5
                    long r13 = (long) r5
                    long r20 = r20 + r13
                    r13 = 8192(0x2000, double:4.0474E-320)
                    long r13 = r20 % r13
                    int r5 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
                    if (r5 == 0) goto L_0x0182
                    long r13 = r2     // Catch:{ all -> 0x01d2 }
                    long r13 = r18 - r13
                    int r5 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
                    if (r5 != 0) goto L_0x0180
                    goto L_0x0182
                L_0x0180:
                    r5 = 0
                    goto L_0x0183
                L_0x0182:
                    r5 = 1
                L_0x0183:
                    if (r5 == 0) goto L_0x019d
                    java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01d2 }
                    int r5 = r5.intValue()     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r13 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r13 = r13.f24868b     // Catch:{ all -> 0x01d2 }
                    java.lang.String r13 = r13.mo62962k()     // Catch:{ all -> 0x01d2 }
                    com.bykv.p271vk.openvk.component.video.p272a.p285e.C10180c.m29076a(r8, r0, r5, r6, r13)     // Catch:{ all -> 0x01d2 }
                    long r5 = (long) r6     // Catch:{ all -> 0x01d2 }
                    long r3 = r3 + r5
                    r6 = 0
                L_0x019d:
                    r9 = 2
                    r13 = 1
                    r14 = 0
                    goto L_0x010e
                L_0x01a2:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r0 = r0.f24868b     // Catch:{ all -> 0x01d2 }
                    boolean r0 = r0.mo62959h()     // Catch:{ all -> 0x01d2 }
                    if (r0 == 0) goto L_0x01c1
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x01d2 }
                    java.io.File r0 = r0.f24870d     // Catch:{ all -> 0x01d2 }
                    long r3 = r0.length()     // Catch:{ all -> 0x01d2 }
                    int r0 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
                    if (r0 != 0) goto L_0x01c1
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x01d2 }
                    r0.m28686d()     // Catch:{ all -> 0x01d2 }
                L_0x01c1:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f24868b     // Catch:{ all -> 0x01d2 }
                    int r4 = r24.mo63889c()     // Catch:{ all -> 0x01d2 }
                    r0.m28677a((com.bykv.p271vk.openvk.component.video.api.p288c.C10188c) r3, (int) r4)     // Catch:{ all -> 0x01d2 }
                    r6 = r8
                    goto L_0x01f9
                L_0x01d2:
                    r0 = move-exception
                    goto L_0x00f5
                L_0x01d5:
                    r0 = move-exception
                    r6 = r15
                    r5 = 601(0x259, float:8.42E-43)
                    goto L_0x0247
                L_0x01da:
                    r0 = move-exception
                    r23 = r8
                    r6 = r15
                    r5 = 601(0x259, float:8.42E-43)
                    goto L_0x0246
                L_0x01e1:
                    r0 = move-exception
                    r23 = r8
                    goto L_0x0243
                L_0x01e5:
                    r23 = r8
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x0242 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x0242 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f24868b     // Catch:{ all -> 0x0242 }
                    java.lang.String r4 = "Network link failed."
                    r5 = 601(0x259, float:8.42E-43)
                    r0.m28678a((com.bykv.p271vk.openvk.component.video.api.p288c.C10188c) r3, (int) r5, (java.lang.String) r4)     // Catch:{ all -> 0x0240 }
                    r6 = 0
                    r7 = 0
                    r15 = 0
                L_0x01f9:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r15)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r2 = 0
                    r0[r2] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f24868b
                    java.lang.String r2 = r2.mo62961j()
                    r3 = 1
                    r0[r3] = r2
                    r2 = 2
                    r0[r2] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f24868b
                    int r2 = r2.mo62943b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29291b((java.lang.String) r12, (java.lang.Object[]) r0)
                L_0x0236:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r0 = r0.f24868b
                    com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10073c.m28695a(r0)
                    goto L_0x02a3
                L_0x0240:
                    r0 = move-exception
                    goto L_0x0245
                L_0x0242:
                    r0 = move-exception
                L_0x0243:
                    r5 = 601(0x259, float:8.42E-43)
                L_0x0245:
                    r6 = 0
                L_0x0246:
                    r7 = 0
                L_0x0247:
                    r8 = 0
                L_0x0248:
                    r0.printStackTrace()     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x02a4 }
                    r3.m28684c()     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r4 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.api.c.c r4 = r4.f24868b     // Catch:{ all -> 0x02a4 }
                    if (r2 == 0) goto L_0x025e
                    int r5 = r24.mo63889c()     // Catch:{ all -> 0x02a4 }
                L_0x025e:
                    java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02a4 }
                    r3.m28678a((com.bykv.p271vk.openvk.component.video.api.p288c.C10188c) r4, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r8)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r0.m28679a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r2 = 0
                    r0[r2] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f24868b
                    java.lang.String r2 = r2.mo62961j()
                    r3 = 1
                    r0[r3] = r2
                    r2 = 2
                    r0[r2] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f24868b
                    int r2 = r2.mo62943b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29291b((java.lang.String) r12, (java.lang.Object[]) r0)
                    goto L_0x0236
                L_0x02a3:
                    return
                L_0x02a4:
                    r0 = move-exception
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r3.m28679a((java.io.Closeable) r8)
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r3.m28679a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r3.m28679a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    r3.m28679a((java.io.Closeable) r2)
                    java.lang.Object[] r2 = new java.lang.Object[r11]
                    r3 = 0
                    r2[r3] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f24868b
                    java.lang.String r3 = r3.mo62961j()
                    r4 = 1
                    r2[r4] = r3
                    r3 = 2
                    r2[r3] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f24868b
                    int r3 = r3.mo62943b()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r4 = 3
                    r2[r4] = r3
                    com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29291b((java.lang.String) r12, (java.lang.Object[]) r2)
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f24868b
                    com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10073c.m28695a(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10071b.C100721.mo62657a(com.bytedance.sdk.component.b.a.b, com.bytedance.sdk.component.b.a.m):void");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28679a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public C10188c mo62660a() {
        return this.f24868b;
    }

    /* renamed from: a */
    public void mo62662a(boolean z) {
        this.f24869c = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28677a(C10188c cVar, int i) {
        synchronized (C10197a.C10198a.class) {
            for (C10197a.C10198a next : this.f24872f) {
                if (next != null) {
                    next.mo591a(cVar, i);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28678a(C10188c cVar, int i, String str) {
        synchronized (C10197a.C10198a.class) {
            for (C10197a.C10198a next : this.f24872f) {
                if (next != null) {
                    next.mo592a(cVar, i, str);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28683b(C10188c cVar, int i) {
        synchronized (C10197a.C10198a.class) {
            for (C10197a.C10198a next : this.f24872f) {
                if (next != null) {
                    next.mo593b(cVar, i);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m28684c() {
        try {
            this.f24871e.delete();
            this.f24870d.delete();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m28686d() {
        try {
            if (!this.f24870d.renameTo(this.f24871e)) {
                throw new IOException("Error renaming file " + this.f24870d + " to " + this.f24871e + " for completion!");
            }
        } catch (Throwable th) {
            th.printStackTrace();
            C10202c.m29289b("VideoPreload", th.getMessage());
        }
    }
}
