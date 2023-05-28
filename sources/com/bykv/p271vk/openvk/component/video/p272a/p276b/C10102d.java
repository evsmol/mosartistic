package com.bykv.p271vk.openvk.component.video.p272a.p276b;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10201b;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10088b;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10077b;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10079c;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10092b;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10093c;
import com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a;
import com.bytedance.sdk.component.p328f.C10618g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.d */
/* compiled from: Preloader */
public class C10102d {

    /* renamed from: e */
    private static volatile C10102d f24948e;

    /* renamed from: a */
    private volatile int f24949a = 163840;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SparseArray<Map<String, C10088b>> f24950b = new SparseArray<>(2);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10110b<Runnable> f24951c;

    /* renamed from: d */
    private final ExecutorService f24952d;

    /* renamed from: f */
    private volatile C10093c f24953f;

    /* renamed from: g */
    private volatile C10079c f24954g;

    /* renamed from: h */
    private volatile C10077b f24955h;

    /* renamed from: i */
    private final HashSet<C10109a> f24956i = new HashSet<>();

    /* renamed from: j */
    private final C10088b.C10090b f24957j = new C10088b.C10090b() {
        /* renamed from: a */
        public void mo62711a(C10088b bVar) {
            int f = bVar.mo62671f();
            synchronized (C10102d.this.f24950b) {
                Map map = (Map) C10102d.this.f24950b.get(f);
                if (map != null) {
                    map.remove(bVar.f24885h);
                }
            }
            if (C10112e.f24979c) {
                Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + bVar.f24885h);
            }
        }
    };

    /* renamed from: k */
    private volatile C10097c f24958k;

    /* renamed from: l */
    private volatile C10097c f24959l;

    /* renamed from: m */
    private volatile String f24960m;

    /* renamed from: n */
    private volatile boolean f24961n;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62724a(C10079c cVar) {
        this.f24954g = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62725a(C10093c cVar) {
        this.f24953f = cVar;
    }

    /* renamed from: a */
    public void mo62722a(int i) {
        if (i > 0) {
            this.f24949a = i;
        }
        if (C10112e.f24979c) {
            Log.i("TAG_PROXY_Preloader", "MaxPreloadSize: " + i);
        }
    }

    private C10102d() {
        C10110b<Runnable> bVar = new C10110b<>();
        this.f24951c = bVar;
        ExecutorService a = m28764a(bVar);
        this.f24952d = a;
        this.f24951c.mo62740a((ThreadPoolExecutor) a);
        this.f24950b.put(0, new HashMap());
        this.f24950b.put(1, new HashMap());
    }

    /* renamed from: a */
    public synchronized void mo62723a(long j, long j2, long j3) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10097c mo62721a() {
        return this.f24958k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10097c mo62731b() {
        return this.f24959l;
    }

    /* renamed from: c */
    public static C10102d m28766c() {
        if (f24948e == null) {
            synchronized (C10102d.class) {
                if (f24948e == null) {
                    f24948e = new C10102d();
                }
            }
        }
        return f24948e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.bykv.vk.openvk.component.video.a.b.b} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.HashSet] */
    /* JADX WARNING: type inference failed for: r0v15, types: [java.util.HashSet] */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62727a(boolean r8, java.lang.String r9) {
        /*
            r7 = this;
            r7.f24960m = r9
            r7.f24961n = r8
            boolean r0 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setCurrentPlayKey, "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
        L_0x001e:
            r0 = 0
            if (r9 != 0) goto L_0x007b
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r1 = r7.f24956i
            monitor-enter(r1)
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.f24956i     // Catch:{ all -> 0x0078 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r8 != 0) goto L_0x0038
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0078 }
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.f24956i     // Catch:{ all -> 0x0078 }
            r0.<init>(r8)     // Catch:{ all -> 0x0078 }
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.f24956i     // Catch:{ all -> 0x0078 }
            r8.clear()     // Catch:{ all -> 0x0078 }
        L_0x0038:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0141
            java.util.Iterator r8 = r0.iterator()
        L_0x003f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0141
            java.lang.Object r9 = r8.next()
            com.bykv.vk.openvk.component.video.a.b.d$a r9 = (com.bykv.p271vk.openvk.component.video.p272a.p276b.C10102d.C10109a) r9
            boolean r1 = r9.f24970a
            boolean r2 = r9.f24971b
            int r3 = r9.f24972c
            java.lang.String r4 = r9.f24973d
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.f24974e
            java.lang.String[] r6 = r9.f24975f
            r0 = r7
            r0.mo62728a(r1, r2, r3, r4, r5, r6)
            boolean r0 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setCurrentPlayKey, resume preload: "
            r1.append(r2)
            java.lang.String r9 = r9.f24973d
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.i(r0, r9)
            goto L_0x003f
        L_0x0078:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r8
        L_0x007b:
            int r1 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24984h
            r2 = 3
            if (r1 == r2) goto L_0x00aa
            r3 = 2
            if (r1 != r3) goto L_0x0084
            goto L_0x00aa
        L_0x0084:
            r2 = 1
            if (r1 != r2) goto L_0x0141
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r1 = r7.f24950b
            monitor-enter(r1)
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r2 = r7.f24950b     // Catch:{ all -> 0x00a7 }
            int r8 = com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10092b.m28752a(r8)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r8 = r2.get(r8)     // Catch:{ all -> 0x00a7 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x00a7 }
            if (r8 == 0) goto L_0x009f
            java.lang.Object r8 = r8.remove(r9)     // Catch:{ all -> 0x00a7 }
            r0 = r8
            com.bykv.vk.openvk.component.video.a.b.b r0 = (com.bykv.p271vk.openvk.component.video.p272a.p276b.C10088b) r0     // Catch:{ all -> 0x00a7 }
        L_0x009f:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0141
            r0.mo62664a()
            goto L_0x0141
        L_0x00a7:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            throw r8
        L_0x00aa:
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r8 = r7.f24950b
            monitor-enter(r8)
            r9 = 0
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r3 = r7.f24950b     // Catch:{ all -> 0x0142 }
            int r3 = r3.size()     // Catch:{ all -> 0x0142 }
        L_0x00b4:
            if (r9 >= r3) goto L_0x00e2
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r4 = r7.f24950b     // Catch:{ all -> 0x0142 }
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r5 = r7.f24950b     // Catch:{ all -> 0x0142 }
            int r5 = r5.keyAt(r9)     // Catch:{ all -> 0x0142 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0142 }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x0142 }
            if (r4 == 0) goto L_0x00df
            java.util.Collection r5 = r4.values()     // Catch:{ all -> 0x0142 }
            if (r5 == 0) goto L_0x00dc
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0142 }
            if (r6 != 0) goto L_0x00dc
            if (r0 != 0) goto L_0x00d9
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0142 }
            r0.<init>()     // Catch:{ all -> 0x0142 }
        L_0x00d9:
            r0.addAll(r5)     // Catch:{ all -> 0x0142 }
        L_0x00dc:
            r4.clear()     // Catch:{ all -> 0x0142 }
        L_0x00df:
            int r9 = r9 + 1
            goto L_0x00b4
        L_0x00e2:
            monitor-exit(r8)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0141
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L_0x0141
            java.util.Iterator r8 = r0.iterator()
        L_0x00ef:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x011b
            java.lang.Object r9 = r8.next()
            com.bykv.vk.openvk.component.video.a.b.b r9 = (com.bykv.p271vk.openvk.component.video.p272a.p276b.C10088b) r9
            r9.mo62664a()
            boolean r3 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r3 == 0) goto L_0x00ef
            java.lang.String r3 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setCurrentPlayKey, cancel preload: "
            r4.append(r5)
            java.lang.String r9 = r9.f24884g
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            android.util.Log.i(r3, r9)
            goto L_0x00ef
        L_0x011b:
            if (r1 != r2) goto L_0x0141
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.f24956i
            monitor-enter(r8)
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x013e }
        L_0x0124:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x013c
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x013e }
            com.bykv.vk.openvk.component.video.a.b.b r0 = (com.bykv.p271vk.openvk.component.video.p272a.p276b.C10088b) r0     // Catch:{ all -> 0x013e }
            java.lang.Object r0 = r0.f24916n     // Catch:{ all -> 0x013e }
            com.bykv.vk.openvk.component.video.a.b.d$a r0 = (com.bykv.p271vk.openvk.component.video.p272a.p276b.C10102d.C10109a) r0     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0124
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r1 = r7.f24956i     // Catch:{ all -> 0x013e }
            r1.add(r0)     // Catch:{ all -> 0x013e }
            goto L_0x0124
        L_0x013c:
            monitor-exit(r8)     // Catch:{ all -> 0x013e }
            goto L_0x0141
        L_0x013e:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x013e }
            throw r9
        L_0x0141:
            return
        L_0x0142:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0142 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p271vk.openvk.component.video.p272a.p276b.C10102d.mo62727a(boolean, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo62729a(boolean z, boolean z2, int i, String str, String... strArr) {
        mo62728a(z, z2, i, str, (Map<String, String>) null, strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0105, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0127, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0154, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62728a(boolean r19, boolean r20, int r21, java.lang.String r22, java.util.Map<java.lang.String, java.lang.String> r23, java.lang.String... r24) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r9 = r22
            r10 = r24
            boolean r2 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = "TAG_PROXY_Preloader"
            java.lang.String r3 = "preload start ！！！！"
            android.util.Log.d(r2, r3)
        L_0x0013:
            if (r0 == 0) goto L_0x0018
            com.bykv.vk.openvk.component.video.a.b.a.b r2 = r1.f24955h
            goto L_0x001a
        L_0x0018:
            com.bykv.vk.openvk.component.video.a.b.a.c r2 = r1.f24954g
        L_0x001a:
            r11 = r2
            com.bykv.vk.openvk.component.video.a.b.b.c r12 = r1.f24953f
            if (r11 == 0) goto L_0x01d1
            if (r12 != 0) goto L_0x0023
            goto L_0x01d1
        L_0x0023:
            boolean r2 = android.text.TextUtils.isEmpty(r22)
            if (r2 != 0) goto L_0x01d0
            if (r10 == 0) goto L_0x01d0
            int r2 = r10.length
            if (r2 > 0) goto L_0x0030
            goto L_0x01d0
        L_0x0030:
            if (r21 > 0) goto L_0x0036
            int r2 = r1.f24949a
            r13 = r2
            goto L_0x0038
        L_0x0036:
            r13 = r21
        L_0x0038:
            if (r20 == 0) goto L_0x003c
            r14 = r9
            goto L_0x0041
        L_0x003c:
            java.lang.String r2 = com.bykv.p271vk.openvk.component.video.api.p291f.C10201b.m29279a((java.lang.String) r22)
            r14 = r2
        L_0x0041:
            java.io.File r2 = r11.mo62677d(r14)
            if (r2 == 0) goto L_0x0077
            long r3 = r2.length()
            long r5 = (long) r13
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0077
            boolean r0 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "no need preload, file size: "
            r3.append(r4)
            long r4 = r2.length()
            r3.append(r4)
            java.lang.String r2 = ", need preload size: "
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = r3.toString()
            android.util.Log.i(r0, r2)
        L_0x0076:
            return
        L_0x0077:
            com.bykv.vk.openvk.component.video.a.b.f r2 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10121f.m28816a()
            int r3 = com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10092b.m28752a(r19)
            boolean r2 = r2.mo62758a((int) r3, (java.lang.String) r14)
            if (r2 == 0) goto L_0x00a0
            boolean r0 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "has running proxy task, skip preload for key: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r0, r2)
        L_0x009f:
            return
        L_0x00a0:
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r15 = r1.f24950b
            monitor-enter(r15)
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r2 = r1.f24950b     // Catch:{ all -> 0x01cd }
            r16 = 0
            r8 = 1
            if (r0 == 0) goto L_0x00ac
            r3 = 1
            goto L_0x00ad
        L_0x00ac:
            r3 = 0
        L_0x00ad:
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x01cd }
            r7 = r2
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ all -> 0x01cd }
            boolean r2 = r7.containsKey(r14)     // Catch:{ all -> 0x01cd }
            if (r2 == 0) goto L_0x00bc
            monitor-exit(r15)     // Catch:{ all -> 0x01cd }
            return
        L_0x00bc:
            com.bykv.vk.openvk.component.video.a.b.d$a r6 = new com.bykv.vk.openvk.component.video.a.b.d$a     // Catch:{ all -> 0x01cd }
            r2 = r6
            r3 = r19
            r4 = r20
            r5 = r13
            r10 = r6
            r6 = r22
            r17 = r7
            r7 = r23
            r21 = r13
            r13 = 1
            r8 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r2 = r1.f24960m     // Catch:{ all -> 0x01cd }
            if (r2 == 0) goto L_0x0155
            int r3 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24984h     // Catch:{ all -> 0x01cd }
            r4 = 3
            if (r3 != r4) goto L_0x0109
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r2 = r1.f24956i     // Catch:{ all -> 0x01cd }
            monitor-enter(r2)     // Catch:{ all -> 0x01cd }
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r0 = r1.f24956i     // Catch:{ all -> 0x0106 }
            r0.add(r10)     // Catch:{ all -> 0x0106 }
            monitor-exit(r2)     // Catch:{ all -> 0x0106 }
            boolean r0 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r2.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = "cancel preload: "
            r2.append(r3)     // Catch:{ all -> 0x01cd }
            r2.append(r9)     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = ", add to pending queue"
            r2.append(r3)     // Catch:{ all -> 0x01cd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cd }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cd }
        L_0x0104:
            monitor-exit(r15)     // Catch:{ all -> 0x01cd }
            return
        L_0x0106:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0106 }
            throw r0     // Catch:{ all -> 0x01cd }
        L_0x0109:
            r4 = 2
            if (r3 != r4) goto L_0x0128
            boolean r0 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r2.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = "cancel preload: "
            r2.append(r3)     // Catch:{ all -> 0x01cd }
            r2.append(r9)     // Catch:{ all -> 0x01cd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cd }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cd }
        L_0x0126:
            monitor-exit(r15)     // Catch:{ all -> 0x01cd }
            return
        L_0x0128:
            if (r3 != r13) goto L_0x0155
            boolean r3 = r1.f24961n     // Catch:{ all -> 0x01cd }
            if (r3 != r0) goto L_0x0155
            boolean r0 = r2.equals(r14)     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0155
            boolean r0 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0153
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r2.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = "cancel preload: "
            r2.append(r3)     // Catch:{ all -> 0x01cd }
            r2.append(r9)     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = ", it is playing"
            r2.append(r3)     // Catch:{ all -> 0x01cd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cd }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cd }
        L_0x0153:
            monitor-exit(r15)     // Catch:{ all -> 0x01cd }
            return
        L_0x0155:
            r0 = 0
            java.util.List r2 = com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28906a((java.util.Map<java.lang.String, java.lang.String>) r23)     // Catch:{ all -> 0x01cd }
            java.util.List r2 = com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28905a((java.util.List<com.bykv.p271vk.openvk.component.video.p272a.p276b.C10139i.C10141b>) r2)     // Catch:{ all -> 0x01cd }
            if (r2 == 0) goto L_0x0187
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01cd }
            int r3 = r2.size()     // Catch:{ all -> 0x01cd }
            r0.<init>(r3)     // Catch:{ all -> 0x01cd }
            int r3 = r2.size()     // Catch:{ all -> 0x01cd }
            r4 = 0
        L_0x016e:
            if (r4 >= r3) goto L_0x0187
            java.lang.Object r5 = r2.get(r4)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.i$b r5 = (com.bykv.p271vk.openvk.component.video.p272a.p276b.C10139i.C10141b) r5     // Catch:{ all -> 0x01cd }
            if (r5 == 0) goto L_0x0184
            com.bykv.vk.openvk.component.video.a.b.i$b r6 = new com.bykv.vk.openvk.component.video.a.b.i$b     // Catch:{ all -> 0x01cd }
            java.lang.String r7 = r5.f25059a     // Catch:{ all -> 0x01cd }
            java.lang.String r5 = r5.f25060b     // Catch:{ all -> 0x01cd }
            r6.<init>(r7, r5)     // Catch:{ all -> 0x01cd }
            r0.add(r6)     // Catch:{ all -> 0x01cd }
        L_0x0184:
            int r4 = r4 + 1
            goto L_0x016e
        L_0x0187:
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = new com.bykv.vk.openvk.component.video.a.b.b$a     // Catch:{ all -> 0x01cd }
            r2.<init>()     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62701a((com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10076a) r11)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62703a((com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10093c) r12)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62707a((java.lang.String) r9)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62710b(r14)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.l r3 = new com.bykv.vk.openvk.component.video.a.b.l     // Catch:{ all -> 0x01cd }
            java.util.List r4 = com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28907a((java.lang.String[]) r24)     // Catch:{ all -> 0x01cd }
            r3.<init>((java.util.List<java.lang.String>) r4)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62705a((com.bykv.p271vk.openvk.component.video.p272a.p276b.C10146l) r3)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r2.mo62708a((java.util.List<com.bykv.p271vk.openvk.component.video.p272a.p276b.C10139i.C10141b>) r0)     // Catch:{ all -> 0x01cd }
            r2 = r21
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r0.mo62700a((int) r2)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$b r2 = r1.f24957j     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r0.mo62702a((com.bykv.p271vk.openvk.component.video.p272a.p276b.C10088b.C10090b) r2)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r0.mo62706a((java.lang.Object) r10)     // Catch:{ all -> 0x01cd }
            com.bykv.vk.openvk.component.video.a.b.b r0 = r0.mo62709a()     // Catch:{ all -> 0x01cd }
            r2 = r17
            r2.put(r14, r0)     // Catch:{ all -> 0x01cd }
            monitor-exit(r15)     // Catch:{ all -> 0x01cd }
            java.util.concurrent.ExecutorService r2 = r1.f24952d
            r2.execute(r0)
            return
        L_0x01cd:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01cd }
            throw r0
        L_0x01d0:
            return
        L_0x01d1:
            boolean r0 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r0 == 0) goto L_0x01dc
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.String r2 = "cache or videoProxyDB null in Preloader!!!"
            android.util.Log.e(r0, r2)
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p271vk.openvk.component.video.p272a.p276b.C10102d.mo62728a(boolean, boolean, int, java.lang.String, java.util.Map, java.lang.String[]):void");
    }

    /* renamed from: a */
    public void mo62726a(String str) {
        mo62730a(false, false, str);
    }

    /* renamed from: a */
    public void mo62730a(boolean z, boolean z2, String str) {
        if (!TextUtils.isEmpty(str)) {
            final boolean z3 = z;
            final boolean z4 = z2;
            final String str2 = str;
            C10148a.m28908a((C10618g) new C10618g("cancel b b S") {
                public void run() {
                    C10088b bVar;
                    synchronized (C10102d.this.f24950b) {
                        Map map = (Map) C10102d.this.f24950b.get(C10092b.m28752a(z3));
                        if (map != null) {
                            bVar = (C10088b) map.remove(z4 ? str2 : C10201b.m29279a(str2));
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar != null) {
                        bVar.mo62664a();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public void mo62732d() {
        C10148a.m28908a((C10618g) new C10618g("cancelAll") {
            public void run() {
                ArrayList<C10088b> arrayList = new ArrayList<>();
                synchronized (C10102d.this.f24950b) {
                    int size = C10102d.this.f24950b.size();
                    for (int i = 0; i < size; i++) {
                        Map map = (Map) C10102d.this.f24950b.get(C10102d.this.f24950b.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    C10102d.this.f24951c.clear();
                }
                for (C10088b bVar : arrayList) {
                    bVar.mo62664a();
                    if (C10112e.f24979c) {
                        Log.w("TAG_PROXY_Preloader", "PreloadTask: " + bVar + ", canceled!!!");
                    }
                }
            }
        });
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.d$a */
    /* compiled from: Preloader */
    private static final class C10109a {

        /* renamed from: a */
        final boolean f24970a;

        /* renamed from: b */
        final boolean f24971b;

        /* renamed from: c */
        final int f24972c;

        /* renamed from: d */
        final String f24973d;

        /* renamed from: e */
        final Map<String, String> f24974e;

        /* renamed from: f */
        final String[] f24975f;

        C10109a(boolean z, boolean z2, int i, String str, Map<String, String> map, String[] strArr) {
            this.f24970a = z;
            this.f24971b = z2;
            this.f24972c = i;
            this.f24973d = str;
            this.f24974e = map;
            this.f24975f = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C10109a aVar = (C10109a) obj;
            if (this.f24970a == aVar.f24970a && this.f24971b == aVar.f24971b && this.f24972c == aVar.f24972c) {
                return this.f24973d.equals(aVar.f24973d);
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.f24970a ? 1 : 0) * true) + (this.f24971b ? 1 : 0)) * 31) + this.f24972c) * 31) + this.f24973d.hashCode();
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.d$b */
    /* compiled from: Preloader */
    private static final class C10110b<T> extends LinkedBlockingDeque<T> {

        /* renamed from: a */
        private ThreadPoolExecutor f24976a;

        private C10110b() {
        }

        /* renamed from: a */
        public void mo62740a(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.f24976a != null) {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                } else if (threadPoolExecutor != null) {
                    this.f24976a = threadPoolExecutor;
                } else {
                    throw new NullPointerException("executor argument can't be null!");
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return offerFirst(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean offer(T r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.ThreadPoolExecutor r0 = r3.f24976a     // Catch:{ all -> 0x002b }
                int r0 = r0.getPoolSize()     // Catch:{ all -> 0x002b }
                java.util.concurrent.ThreadPoolExecutor r1 = r3.f24976a     // Catch:{ all -> 0x002b }
                int r1 = r1.getActiveCount()     // Catch:{ all -> 0x002b }
                java.util.concurrent.ThreadPoolExecutor r2 = r3.f24976a     // Catch:{ all -> 0x002b }
                int r2 = r2.getMaximumPoolSize()     // Catch:{ all -> 0x002b }
                if (r1 < r0) goto L_0x0025
                if (r0 >= r2) goto L_0x0025
                boolean r4 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x002b }
                if (r4 == 0) goto L_0x0022
                java.lang.String r4 = "TAG_PROXY_TT"
                java.lang.String r0 = "create new preloader thread"
                android.util.Log.i(r4, r0)     // Catch:{ all -> 0x002b }
            L_0x0022:
                r4 = 0
                monitor-exit(r3)     // Catch:{ all -> 0x002b }
                return r4
            L_0x0025:
                monitor-exit(r3)     // Catch:{ all -> 0x002b }
                boolean r4 = r3.offerFirst(r4)
                return r4
            L_0x002b:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x002b }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bykv.p271vk.openvk.component.video.p272a.p276b.C10102d.C10110b.offer(java.lang.Object):boolean");
        }
    }

    /* renamed from: a */
    private static ExecutorService m28764a(final C10110b<Runnable> bVar) {
        int a = C10148a.m28897a();
        return new ThreadPoolExecutor(0, a < 1 ? 1 : a > 4 ? 4 : a, 60, TimeUnit.SECONDS, bVar, new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                C101071 r0 = new Thread(runnable) {
                    public void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        super.run();
                    }
                };
                r0.setName("tt_pangle_thread_video_preload_" + r0.getId());
                r0.setDaemon(true);
                if (C10112e.f24979c) {
                    Log.i("TAG_PROXY_Preloader", "new preload thead: " + r0.getName());
                }
                return r0;
            }
        }, new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    bVar.offerFirst(runnable);
                    if (C10112e.f24979c) {
                        Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }
}
