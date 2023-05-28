package com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a;

import android.content.Context;
import com.bykv.p271vk.openvk.component.video.api.C10184b;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import com.bykv.p271vk.openvk.component.video.p272a.p285e.C10180c;
import com.bytedance.sdk.component.p307b.p308a.C10457b;
import com.bytedance.sdk.component.p307b.p308a.C10467c;
import com.bytedance.sdk.component.p307b.p308a.C10476i;
import com.bytedance.sdk.component.p307b.p308a.C10479k;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.a.c */
/* compiled from: VideoCacheImpl */
public class C10068c implements C10067b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile long f24856a = -2147483648L;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f24857b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public File f24858c;

    /* renamed from: d */
    private File f24859d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f24860e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile long f24861f = -1;

    /* renamed from: g */
    private volatile boolean f24862g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile boolean f24863h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public RandomAccessFile f24864i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C10188c f24865j;

    public C10068c(Context context, C10188c cVar) {
        this.f24865j = cVar;
        try {
            this.f24858c = C10180c.m29077b(cVar.mo62936a(), cVar.mo62962k());
            this.f24859d = C10180c.m29078c(cVar.mo62936a(), cVar.mo62962k());
            if (m28658d()) {
                this.f24864i = new RandomAccessFile(this.f24859d, "r");
            } else {
                this.f24864i = new RandomAccessFile(this.f24858c, "rw");
            }
            if (!m28658d()) {
                this.f24860e = this.f24858c.length();
                mo62656c();
            }
        } catch (Throwable unused) {
            C10202c.m29291b("VideoCacheImpl", "Error using file ", cVar.mo62961j(), " as disc cache");
        }
    }

    /* renamed from: d */
    private boolean m28658d() {
        return this.f24859d.exists();
    }

    /* renamed from: c */
    public void mo62656c() {
        C10476i.C10477a aVar;
        if (C10184b.m29130e() != null) {
            aVar = C10184b.m29130e().mo63966b();
        } else {
            aVar = new C10476i.C10477a();
        }
        aVar.mo63967a((long) this.f24865j.mo62964m(), TimeUnit.MILLISECONDS).mo63970b((long) this.f24865j.mo62965n(), TimeUnit.MILLISECONDS).mo63971c((long) this.f24865j.mo62966o(), TimeUnit.MILLISECONDS);
        C10476i a = aVar.mo63969a();
        C10202c.m29291b("VideoCacheImpl", "RANGE, bytes=", Long.valueOf(this.f24860e), " file hash=", this.f24865j.mo62962k());
        C10479k.C10480a aVar2 = new C10479k.C10480a();
        a.mo63868a(aVar2.mo63987a("RANGE", "bytes=" + this.f24860e + "-").mo63986a(this.f24865j.mo62961j()).mo63981a().mo63989b()).mo63861a(new C10467c() {
            /* renamed from: a */
            public void mo62658a(C10457b bVar, IOException iOException) {
                boolean unused = C10068c.this.f24863h = false;
                long unused2 = C10068c.this.f24856a = -1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:113:0x0157 A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x012d A[Catch:{ all -> 0x01bd }] */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x0219 A[SYNTHETIC, Splitter:B:79:0x0219] */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x0221 A[Catch:{ all -> 0x021d }] */
            /* JADX WARNING: Removed duplicated region for block: B:86:0x0226 A[Catch:{ all -> 0x021d }] */
            /* JADX WARNING: Removed duplicated region for block: B:91:0x0245 A[Catch:{ all -> 0x021d }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo62657a(com.bytedance.sdk.component.p307b.p308a.C10457b r25, com.bytedance.sdk.component.p307b.p308a.C10483m r26) throws java.io.IOException {
                /*
                    r24 = this;
                    r1 = r24
                    r2 = 0
                    if (r26 == 0) goto L_0x0289
                    r3 = 0
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0202 }
                    boolean r4 = r26.mo63891d()     // Catch:{ all -> 0x0202 }
                    boolean unused = r0.f24863h = r4     // Catch:{ all -> 0x0202 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0202 }
                    boolean r0 = r0.f24863h     // Catch:{ all -> 0x0202 }
                    if (r0 == 0) goto L_0x01bf
                    com.bytedance.sdk.component.b.a.n r4 = r26.mo63893f()     // Catch:{ all -> 0x0202 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    boolean r0 = r0.f24863h     // Catch:{ all -> 0x01bd }
                    if (r0 == 0) goto L_0x0039
                    if (r4 == 0) goto L_0x0039
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    long r5 = r4.mo63897a()     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r7 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    long r7 = r7.f24860e     // Catch:{ all -> 0x01bd }
                    long r5 = r5 + r7
                    long unused = r0.f24856a = r5     // Catch:{ all -> 0x01bd }
                    java.io.InputStream r3 = r4.mo63899c()     // Catch:{ all -> 0x01bd }
                L_0x0039:
                    if (r3 != 0) goto L_0x0073
                    if (r3 == 0) goto L_0x0043
                    r3.close()     // Catch:{ all -> 0x0041 }
                    goto L_0x0043
                L_0x0041:
                    r0 = move-exception
                    goto L_0x006f
                L_0x0043:
                    if (r4 == 0) goto L_0x0048
                    r4.close()     // Catch:{ all -> 0x0041 }
                L_0x0048:
                    if (r26 == 0) goto L_0x004d
                    r26.close()     // Catch:{ all -> 0x0041 }
                L_0x004d:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0041 }
                    boolean r0 = r0.f24863h     // Catch:{ all -> 0x0041 }
                    if (r0 == 0) goto L_0x0072
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0041 }
                    java.io.File r0 = r0.f24858c     // Catch:{ all -> 0x0041 }
                    long r2 = r0.length()     // Catch:{ all -> 0x0041 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0041 }
                    long r4 = r0.f24856a     // Catch:{ all -> 0x0041 }
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 != 0) goto L_0x0072
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0041 }
                    r0.m28662f()     // Catch:{ all -> 0x0041 }
                    goto L_0x0072
                L_0x006f:
                    r0.printStackTrace()
                L_0x0072:
                    return
                L_0x0073:
                    r0 = 8192(0x2000, float:1.14794E-41)
                    byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r5 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    long r5 = r5.f24860e     // Catch:{ all -> 0x01bd }
                    r7 = 0
                    r10 = r7
                    r9 = 0
                L_0x0081:
                    int r12 = 8192 - r9
                    int r12 = r3.read(r0, r9, r12)     // Catch:{ all -> 0x01bd }
                    r13 = -1
                    r15 = 8
                    r16 = 7
                    r17 = 6
                    r18 = 5
                    r19 = 4
                    r20 = 3
                    r21 = 2
                    r14 = 10
                    r22 = 1
                    if (r12 == r13) goto L_0x015b
                    int r9 = r9 + r12
                    long r12 = (long) r12     // Catch:{ all -> 0x01bd }
                    long r10 = r10 + r12
                    r12 = 8192(0x2000, double:4.0474E-320)
                    long r12 = r10 % r12
                    int r23 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
                    if (r23 == 0) goto L_0x00bb
                    com.bykv.vk.openvk.component.video.a.a.a.c r12 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    long r12 = r12.f24856a     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r7 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    long r7 = r7.f24860e     // Catch:{ all -> 0x01bd }
                    long r12 = r12 - r7
                    int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r7 != 0) goto L_0x00b9
                    goto L_0x00bb
                L_0x00b9:
                    r7 = 0
                    goto L_0x00bc
                L_0x00bb:
                    r7 = 1
                L_0x00bc:
                    java.lang.String r8 = "VideoCacheImpl"
                    r12 = 14
                    java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x01bd }
                    java.lang.String r13 = "Write segment,execAppend ="
                    r12[r2] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.Boolean r13 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x01bd }
                    r12[r22] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.String r13 = " offset="
                    r12[r21] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01bd }
                    r12[r20] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.String r13 = " totalLength = "
                    r12[r19] = r13     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r13 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    long r19 = r13.f24856a     // Catch:{ all -> 0x01bd }
                    java.lang.Long r13 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x01bd }
                    r12[r18] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.String r13 = " saveSize ="
                    r12[r17] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01bd }
                    r12[r16] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.String r13 = " startSaved="
                    r12[r15] = r13     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r13 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    long r15 = r13.f24860e     // Catch:{ all -> 0x01bd }
                    java.lang.Long r13 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x01bd }
                    r15 = 9
                    r12[r15] = r13     // Catch:{ all -> 0x01bd }
                    java.lang.String r13 = " fileHash="
                    r12[r14] = r13     // Catch:{ all -> 0x01bd }
                    r13 = 11
                    com.bykv.vk.openvk.component.video.a.a.a.c r14 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.api.c.c r14 = r14.f24865j     // Catch:{ all -> 0x01bd }
                    java.lang.String r14 = r14.mo62962k()     // Catch:{ all -> 0x01bd }
                    r12[r13] = r14     // Catch:{ all -> 0x01bd }
                    r13 = 12
                    java.lang.String r14 = " url="
                    r12[r13] = r14     // Catch:{ all -> 0x01bd }
                    r13 = 13
                    com.bykv.vk.openvk.component.video.a.a.a.c r14 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.api.c.c r14 = r14.f24865j     // Catch:{ all -> 0x01bd }
                    java.lang.String r14 = r14.mo62961j()     // Catch:{ all -> 0x01bd }
                    r12[r13] = r14     // Catch:{ all -> 0x01bd }
                    com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29291b((java.lang.String) r8, (java.lang.Object[]) r12)     // Catch:{ all -> 0x01bd }
                    if (r7 == 0) goto L_0x0157
                    com.bykv.vk.openvk.component.video.a.a.a.c r7 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    java.lang.Object r7 = r7.f24857b     // Catch:{ all -> 0x01bd }
                    monitor-enter(r7)     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r8 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0154 }
                    java.io.RandomAccessFile r8 = r8.f24864i     // Catch:{ all -> 0x0154 }
                    java.lang.Long r12 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0154 }
                    int r12 = r12.intValue()     // Catch:{ all -> 0x0154 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r13 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0154 }
                    com.bykv.vk.openvk.component.video.api.c.c r13 = r13.f24865j     // Catch:{ all -> 0x0154 }
                    java.lang.String r13 = r13.mo62962k()     // Catch:{ all -> 0x0154 }
                    com.bykv.p271vk.openvk.component.video.p272a.p285e.C10180c.m29076a(r8, r0, r12, r9, r13)     // Catch:{ all -> 0x0154 }
                    monitor-exit(r7)     // Catch:{ all -> 0x0154 }
                    long r7 = (long) r9     // Catch:{ all -> 0x0154 }
                    long r5 = r5 + r7
                    r9 = 0
                    goto L_0x0157
                L_0x0154:
                    r0 = move-exception
                    monitor-exit(r7)     // Catch:{ all -> 0x0154 }
                    throw r0     // Catch:{ all -> 0x01bd }
                L_0x0157:
                    r7 = 0
                    goto L_0x0081
                L_0x015b:
                    java.lang.String r0 = "VideoCacheImpl"
                    java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x01bd }
                    java.lang.String r6 = "Write segment,Write over, startIndex ="
                    r5[r2] = r6     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r6 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    long r6 = r6.f24860e     // Catch:{ all -> 0x01bd }
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01bd }
                    r5[r22] = r6     // Catch:{ all -> 0x01bd }
                    java.lang.String r6 = " totalLength = "
                    r5[r21] = r6     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r6 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    long r6 = r6.f24856a     // Catch:{ all -> 0x01bd }
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01bd }
                    r5[r20] = r6     // Catch:{ all -> 0x01bd }
                    java.lang.String r6 = " saveSize = "
                    r5[r19] = r6     // Catch:{ all -> 0x01bd }
                    java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01bd }
                    r5[r18] = r6     // Catch:{ all -> 0x01bd }
                    java.lang.String r6 = " writeEndSegment ="
                    r5[r17] = r6     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r6 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    long r6 = r6.f24856a     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r8 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    long r8 = r8.f24860e     // Catch:{ all -> 0x01bd }
                    long r6 = r6 - r8
                    int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                    if (r8 != 0) goto L_0x019f
                    goto L_0x01a1
                L_0x019f:
                    r22 = 0
                L_0x01a1:
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r22)     // Catch:{ all -> 0x01bd }
                    r5[r16] = r6     // Catch:{ all -> 0x01bd }
                    java.lang.String r6 = " url="
                    r5[r15] = r6     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.a.a.a.c r6 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x01bd }
                    com.bykv.vk.openvk.component.video.api.c.c r6 = r6.f24865j     // Catch:{ all -> 0x01bd }
                    java.lang.String r6 = r6.mo62961j()     // Catch:{ all -> 0x01bd }
                    r7 = 9
                    r5[r7] = r6     // Catch:{ all -> 0x01bd }
                    com.bykv.p271vk.openvk.component.video.api.p291f.C10202c.m29291b((java.lang.String) r0, (java.lang.Object[]) r5)     // Catch:{ all -> 0x01bd }
                    goto L_0x01d0
                L_0x01bd:
                    r0 = move-exception
                    goto L_0x0204
                L_0x01bf:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0202 }
                    boolean unused = r0.f24863h = r2     // Catch:{ all -> 0x0202 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0202 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r4 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0202 }
                    long r4 = r4.f24861f     // Catch:{ all -> 0x0202 }
                    long unused = r0.f24856a = r4     // Catch:{ all -> 0x0202 }
                    r4 = r3
                L_0x01d0:
                    if (r3 == 0) goto L_0x01d5
                    r3.close()     // Catch:{ all -> 0x021d }
                L_0x01d5:
                    if (r4 == 0) goto L_0x01da
                    r4.close()     // Catch:{ all -> 0x021d }
                L_0x01da:
                    if (r26 == 0) goto L_0x01df
                    r26.close()     // Catch:{ all -> 0x021d }
                L_0x01df:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x021d }
                    boolean r0 = r0.f24863h     // Catch:{ all -> 0x021d }
                    if (r0 == 0) goto L_0x0297
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x021d }
                    java.io.File r0 = r0.f24858c     // Catch:{ all -> 0x021d }
                    long r2 = r0.length()     // Catch:{ all -> 0x021d }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x021d }
                    long r4 = r0.f24856a     // Catch:{ all -> 0x021d }
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 != 0) goto L_0x0297
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x021d }
                    r0.m28662f()     // Catch:{ all -> 0x021d }
                    goto L_0x0297
                L_0x0202:
                    r0 = move-exception
                    r4 = r3
                L_0x0204:
                    com.bykv.vk.openvk.component.video.a.a.a.c r5 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x024f }
                    boolean unused = r5.f24863h = r2     // Catch:{ all -> 0x024f }
                    com.bykv.vk.openvk.component.video.a.a.a.c r2 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x024f }
                    com.bykv.vk.openvk.component.video.a.a.a.c r5 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x024f }
                    long r5 = r5.f24861f     // Catch:{ all -> 0x024f }
                    long unused = r2.f24856a = r5     // Catch:{ all -> 0x024f }
                    r0.printStackTrace()     // Catch:{ all -> 0x024f }
                    if (r3 == 0) goto L_0x021f
                    r3.close()     // Catch:{ all -> 0x021d }
                    goto L_0x021f
                L_0x021d:
                    r0 = move-exception
                    goto L_0x024b
                L_0x021f:
                    if (r4 == 0) goto L_0x0224
                    r4.close()     // Catch:{ all -> 0x021d }
                L_0x0224:
                    if (r26 == 0) goto L_0x0229
                    r26.close()     // Catch:{ all -> 0x021d }
                L_0x0229:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x021d }
                    boolean r0 = r0.f24863h     // Catch:{ all -> 0x021d }
                    if (r0 == 0) goto L_0x0297
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x021d }
                    java.io.File r0 = r0.f24858c     // Catch:{ all -> 0x021d }
                    long r2 = r0.length()     // Catch:{ all -> 0x021d }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x021d }
                    long r4 = r0.f24856a     // Catch:{ all -> 0x021d }
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 != 0) goto L_0x0297
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x021d }
                    r0.m28662f()     // Catch:{ all -> 0x021d }
                    goto L_0x0297
                L_0x024b:
                    r0.printStackTrace()
                    goto L_0x0297
                L_0x024f:
                    r0 = move-exception
                    r2 = r0
                    if (r3 == 0) goto L_0x0259
                    r3.close()     // Catch:{ all -> 0x0257 }
                    goto L_0x0259
                L_0x0257:
                    r0 = move-exception
                    goto L_0x0285
                L_0x0259:
                    if (r4 == 0) goto L_0x025e
                    r4.close()     // Catch:{ all -> 0x0257 }
                L_0x025e:
                    if (r26 == 0) goto L_0x0263
                    r26.close()     // Catch:{ all -> 0x0257 }
                L_0x0263:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0257 }
                    boolean r0 = r0.f24863h     // Catch:{ all -> 0x0257 }
                    if (r0 == 0) goto L_0x0288
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0257 }
                    java.io.File r0 = r0.f24858c     // Catch:{ all -> 0x0257 }
                    long r3 = r0.length()     // Catch:{ all -> 0x0257 }
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0257 }
                    long r5 = r0.f24856a     // Catch:{ all -> 0x0257 }
                    int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r0 != 0) goto L_0x0288
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this     // Catch:{ all -> 0x0257 }
                    r0.m28662f()     // Catch:{ all -> 0x0257 }
                    goto L_0x0288
                L_0x0285:
                    r0.printStackTrace()
                L_0x0288:
                    throw r2
                L_0x0289:
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this
                    boolean unused = r0.f24863h = r2
                    com.bykv.vk.openvk.component.video.a.a.a.c r0 = com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.this
                    long r2 = r0.f24861f
                    long unused = r0.f24856a = r2
                L_0x0297:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.p271vk.openvk.component.video.p272a.p273a.p274a.C10068c.C100691.mo62657a(com.bytedance.sdk.component.b.a.b, com.bytedance.sdk.component.b.a.m):void");
            }
        });
    }

    /* renamed from: a */
    public int mo62653a(long j, byte[] bArr, int i, int i2) throws IOException {
        long j2 = j;
        try {
            if (j2 == this.f24856a) {
                return -1;
            }
            int i3 = 0;
            int i4 = 0;
            while (!this.f24862g) {
                synchronized (this.f24857b) {
                    long e = m28659e();
                    if (j2 < e) {
                        C10202c.m29289b("VideoCacheImpl", "read:  read " + j2 + " success");
                        this.f24864i.seek(j2);
                        i4 = this.f24864i.read(bArr, i, i2);
                    } else {
                        byte[] bArr2 = bArr;
                        int i5 = i;
                        int i6 = i2;
                        C10202c.m29291b("VideoCacheImpl", "read: wait at ", Long.valueOf(j), "  file size = ", Long.valueOf(e));
                        i3 += 33;
                        this.f24857b.wait(33);
                    }
                }
                if (i4 > 0) {
                    return i4;
                }
                if (i3 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }

    /* renamed from: a */
    public void mo62654a() {
        try {
            if (!this.f24862g) {
                this.f24864i.close();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f24862g = true;
        return;
    }

    /* renamed from: e */
    private long m28659e() {
        if (m28658d()) {
            return this.f24859d.length();
        }
        return this.f24858c.length();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m28662f() throws IOException {
        synchronized (this.f24857b) {
            if (m28658d()) {
                C10202c.m29291b("VideoCacheImpl", "complete: isCompleted ", this.f24865j.mo62961j(), this.f24865j.mo62962k());
                return;
            }
            try {
                if (this.f24858c.renameTo(this.f24859d)) {
                    if (this.f24864i != null) {
                        this.f24864i.close();
                    }
                    this.f24864i = new RandomAccessFile(this.f24859d, "rw");
                    C10202c.m29291b("VideoCacheImpl", "complete: rename ", this.f24865j.mo62962k(), this.f24865j.mo62961j());
                    return;
                }
                throw new IOException("Error renaming file " + this.f24858c + " to " + this.f24859d + " for completion!");
            } catch (Throwable th) {
                th.printStackTrace();
                C10202c.m29289b("VideoCacheImpl", th.getMessage());
            }
        }
    }

    /* renamed from: b */
    public long mo62655b() throws IOException {
        if (m28658d()) {
            this.f24856a = this.f24859d.length();
        } else {
            synchronized (this.f24857b) {
                int i = 0;
                do {
                    if (this.f24856a == -2147483648L) {
                        try {
                            C10202c.m29289b("VideoCacheImpl", "totalLength: wait");
                            i += 15;
                            this.f24857b.wait(5);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            throw new IOException("total length InterruptException");
                        }
                    }
                } while (i <= 20000);
                return -1;
            }
        }
        C10202c.m29291b("VideoCacheImpl", "totalLength= ", Long.valueOf(this.f24856a));
        return this.f24856a;
    }
}
