package com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10102d;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10093c;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.a.c */
/* compiled from: DiskLruCache */
public class C10079c extends C10076a {

    /* renamed from: a */
    public final File f24895a;

    /* renamed from: b */
    private final LinkedHashMap<String, File> f24896b = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: c */
    private final ReentrantReadWriteLock f24897c;

    /* renamed from: d */
    private final ReentrantReadWriteLock.ReadLock f24898d;

    /* renamed from: e */
    private final ReentrantReadWriteLock.WriteLock f24899e;

    /* renamed from: f */
    private final Set<C10086a> f24900f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile long f24901g;

    /* renamed from: h */
    private volatile float f24902h;

    /* renamed from: i */
    private final C10087b f24903i;

    /* renamed from: j */
    private final Runnable f24904j;

    /* renamed from: k */
    private final Handler f24905k;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.a.c$a */
    /* compiled from: DiskLruCache */
    public interface C10086a {
        /* renamed from: a */
        void mo62692a(String str);

        /* renamed from: a */
        void mo62693a(Set<String> set);
    }

    /* renamed from: a */
    public void mo62684a(C10086a aVar) {
        if (aVar != null) {
            this.f24900f.add(aVar);
        }
    }

    public C10079c(File file) throws IOException {
        String str;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f24897c = reentrantReadWriteLock;
        this.f24898d = reentrantReadWriteLock.readLock();
        this.f24899e = this.f24897c.writeLock();
        this.f24900f = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f24901g = 104857600;
        this.f24902h = 0.5f;
        this.f24903i = new C10087b();
        this.f24904j = new Runnable() {
            public void run() {
                C10615e.m31159a((C10618g) new C10618g("cleanupCmd", 1) {
                    public void run() {
                        C10079c.this.m28720b(C10079c.this.f24901g);
                    }
                });
            }
        };
        this.f24905k = new Handler(Looper.getMainLooper());
        if (file == null || !file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            if (file == null) {
                str = " dir null";
            } else {
                str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
            }
            throw new IOException("dir error!  " + str);
        }
        this.f24895a = file;
        C10615e.m31159a((C10618g) new C10618g("DiskLruCache", 5) {
            public void run() {
                C10079c.this.m28719b();
            }
        });
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28719b() {
        this.f24899e.lock();
        try {
            File[] listFiles = this.f24895a.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                final HashMap hashMap = new HashMap(listFiles.length);
                ArrayList arrayList = new ArrayList(listFiles.length);
                for (File file : listFiles) {
                    if (file.isFile()) {
                        arrayList.add(file);
                        hashMap.put(file, Long.valueOf(file.lastModified()));
                    }
                }
                Collections.sort(arrayList, new Comparator<File>() {
                    /* renamed from: a */
                    public int compare(File file, File file2) {
                        int i = ((((Long) hashMap.get(file)).longValue() - ((Long) hashMap.get(file2)).longValue()) > 0 ? 1 : ((((Long) hashMap.get(file)).longValue() - ((Long) hashMap.get(file2)).longValue()) == 0 ? 0 : -1));
                        if (i < 0) {
                            return -1;
                        }
                        return i > 0 ? 1 : 0;
                    }
                });
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    this.f24896b.put(m28717a(file2), file2);
                }
            }
            this.f24899e.unlock();
            m28722c();
        } catch (Throwable th) {
            this.f24899e.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo62683a(long j) {
        this.f24901g = j;
        m28722c();
    }

    /* renamed from: c */
    private void m28722c() {
        this.f24905k.removeCallbacks(this.f24904j);
        this.f24905k.postDelayed(this.f24904j, 10000);
    }

    /* renamed from: a */
    public void mo62682a() {
        C10102d.m28766c().mo62732d();
        Context a = C10112e.m28782a();
        if (a != null) {
            C10093c.m28755a(a).mo62713a(0);
        }
        this.f24905k.removeCallbacks(this.f24904j);
        C10615e.m31159a((C10618g) new C10618g("clear", 1) {
            public void run() {
                C10079c.this.m28720b(0);
            }
        });
    }

    /* renamed from: a */
    public void mo62674a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f24903i.mo62694a(str);
        }
    }

    /* renamed from: b */
    public void mo62675b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f24903i.mo62695b(str);
        }
    }

    /* renamed from: c */
    public File mo62676c(String str) {
        this.f24898d.lock();
        File file = this.f24896b.get(str);
        this.f24898d.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.f24895a, str);
        this.f24899e.lock();
        this.f24896b.put(str, file2);
        this.f24899e.unlock();
        for (C10086a a : this.f24900f) {
            a.mo62692a(str);
        }
        m28722c();
        return file2;
    }

    /* renamed from: d */
    public File mo62677d(String str) {
        if (!this.f24898d.tryLock()) {
            return null;
        }
        File file = this.f24896b.get(str);
        this.f24898d.unlock();
        return file;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4 A[LOOP:3: B:42:0x00de->B:44:0x00e4, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m28720b(long r13) {
        /*
            r12 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r12.f24899e
            r1.lock()
            r1 = 0
            r3 = 0
            java.util.LinkedHashMap<java.lang.String, java.io.File> r4 = r12.f24896b     // Catch:{ all -> 0x00ce }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x00ce }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00ce }
        L_0x0017:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00ce }
            if (r5 == 0) goto L_0x002f
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00ce }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00ce }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x00ce }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x00ce }
            long r5 = r5.length()     // Catch:{ all -> 0x00ce }
            long r1 = r1 + r5
            goto L_0x0017
        L_0x002f:
            int r4 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x0039
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f24899e
            r13.unlock()
            return
        L_0x0039:
            float r13 = (float) r13
            float r14 = r12.f24902h     // Catch:{ all -> 0x00ce }
            float r13 = r13 * r14
            long r13 = (long) r13     // Catch:{ all -> 0x00ce }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x00ce }
            r4.<init>()     // Catch:{ all -> 0x00ce }
            java.util.LinkedHashMap<java.lang.String, java.io.File> r3 = r12.f24896b     // Catch:{ all -> 0x00cb }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x00cb }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00cb }
        L_0x004e:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00cb }
            if (r5 == 0) goto L_0x00af
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00cb }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00cb }
            java.lang.Object r6 = r5.getValue()     // Catch:{ all -> 0x00cb }
            java.io.File r6 = (java.io.File) r6     // Catch:{ all -> 0x00cb }
            if (r6 == 0) goto L_0x00a4
            boolean r7 = r6.exists()     // Catch:{ all -> 0x00cb }
            if (r7 == 0) goto L_0x00a4
            com.bykv.vk.openvk.component.video.a.b.a.c$b r7 = r12.f24903i     // Catch:{ all -> 0x00cb }
            java.lang.String r8 = r12.m28717a((java.io.File) r6)     // Catch:{ all -> 0x00cb }
            boolean r7 = r7.mo62696c(r8)     // Catch:{ all -> 0x00cb }
            if (r7 != 0) goto L_0x00ab
            long r7 = r6.length()     // Catch:{ all -> 0x00cb }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x00cb }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cb }
            r10.<init>()     // Catch:{ all -> 0x00cb }
            java.lang.String r11 = r6.getAbsolutePath()     // Catch:{ all -> 0x00cb }
            r10.append(r11)     // Catch:{ all -> 0x00cb }
            java.lang.String r11 = "-tmp"
            r10.append(r11)     // Catch:{ all -> 0x00cb }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00cb }
            r9.<init>(r10)     // Catch:{ all -> 0x00cb }
            boolean r6 = r6.renameTo(r9)     // Catch:{ all -> 0x00cb }
            if (r6 == 0) goto L_0x00ab
            r0.add(r9)     // Catch:{ all -> 0x00cb }
            long r1 = r1 - r7
            java.lang.Object r5 = r5.getKey()     // Catch:{ all -> 0x00cb }
            r4.add(r5)     // Catch:{ all -> 0x00cb }
            goto L_0x00ab
        L_0x00a4:
            java.lang.Object r5 = r5.getKey()     // Catch:{ all -> 0x00cb }
            r4.add(r5)     // Catch:{ all -> 0x00cb }
        L_0x00ab:
            int r5 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x004e
        L_0x00af:
            java.util.Iterator r13 = r4.iterator()     // Catch:{ all -> 0x00cb }
        L_0x00b3:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x00cb }
            if (r14 == 0) goto L_0x00c5
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x00cb }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00cb }
            java.util.LinkedHashMap<java.lang.String, java.io.File> r1 = r12.f24896b     // Catch:{ all -> 0x00cb }
            r1.remove(r14)     // Catch:{ all -> 0x00cb }
            goto L_0x00b3
        L_0x00c5:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f24899e
            r13.unlock()
            goto L_0x00d8
        L_0x00cb:
            r13 = move-exception
            r3 = r4
            goto L_0x00cf
        L_0x00ce:
            r13 = move-exception
        L_0x00cf:
            r13.printStackTrace()     // Catch:{ all -> 0x00fa }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f24899e
            r13.unlock()
            r4 = r3
        L_0x00d8:
            java.util.Set<com.bykv.vk.openvk.component.video.a.b.a.c$a> r13 = r12.f24900f
            java.util.Iterator r13 = r13.iterator()
        L_0x00de:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00ee
            java.lang.Object r14 = r13.next()
            com.bykv.vk.openvk.component.video.a.b.a.c$a r14 = (com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10079c.C10086a) r14
            r14.mo62693a((java.util.Set<java.lang.String>) r4)
            goto L_0x00de
        L_0x00ee:
            com.bykv.vk.openvk.component.video.a.b.a.c$5 r13 = new com.bykv.vk.openvk.component.video.a.b.a.c$5
            r14 = 1
            java.lang.String r1 = "trimSize"
            r13.<init>(r1, r14, r0)
            com.bytedance.sdk.component.p328f.C10615e.m31159a((com.bytedance.sdk.component.p328f.C10618g) r13)
            return
        L_0x00fa:
            r13 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r14 = r12.f24899e
            r14.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10079c.m28720b(long):void");
    }

    /* renamed from: a */
    private String m28717a(File file) {
        return file.getName();
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.a.c$b */
    /* compiled from: DiskLruCache */
    private static final class C10087b {

        /* renamed from: a */
        private final Map<String, Integer> f24914a;

        private C10087b() {
            this.f24914a = new HashMap();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo62694a(String str) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = this.f24914a.get(str);
                if (num == null) {
                    this.f24914a.put(str, 1);
                } else {
                    this.f24914a.put(str, Integer.valueOf(num.intValue() + 1));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo62695b(String str) {
            Integer num;
            if (!TextUtils.isEmpty(str) && (num = this.f24914a.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.f24914a.remove(str);
                } else {
                    this.f24914a.put(str, Integer.valueOf(num.intValue() - 1));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo62696c(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.f24914a.containsKey(str);
        }
    }
}
