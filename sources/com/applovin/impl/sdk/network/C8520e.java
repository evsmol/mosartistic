package com.applovin.impl.sdk.network;

import android.os.Process;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.sdk.network.e */
class C8520e {

    /* renamed from: a */
    private final PriorityBlockingQueue<C8524b> f21481a = new PriorityBlockingQueue<>();

    /* renamed from: b */
    private final C8490n f21482b;

    /* renamed from: com.applovin.impl.sdk.network.e$a */
    static class C8522a extends Thread {

        /* renamed from: a */
        private final BlockingQueue<C8524b> f21483a;

        /* renamed from: b */
        private final C8490n f21484b;

        private C8522a(BlockingQueue<C8524b> blockingQueue, int i, C8490n nVar) {
            super("AL-Network-" + i);
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            } else if (nVar != null) {
                this.f21483a = blockingQueue;
                this.f21484b = nVar;
            } else {
                throw new IllegalArgumentException("No sdk specified");
            }
        }

        /* renamed from: a */
        private void m25804a() throws InterruptedException {
            m25805a(this.f21483a.take());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.io.Closeable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.net.HttpURLConnection} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.net.HttpURLConnection} */
        /* JADX WARNING: type inference failed for: r0v0, types: [java.io.Closeable] */
        /* JADX WARNING: type inference failed for: r2v2, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r0v7 */
        /* JADX WARNING: type inference failed for: r2v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0069 A[Catch:{ all -> 0x00bc }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0078 A[SYNTHETIC, Splitter:B:27:0x0078] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m25805a(final com.applovin.impl.sdk.network.C8520e.C8524b r10) {
            /*
                r9 = this;
                r0 = 0
                r1 = 0
                java.net.HttpURLConnection r2 = r9.m25806b(r10)     // Catch:{ all -> 0x005b }
                byte[] r3 = r10.f21492e     // Catch:{ all -> 0x0058 }
                if (r3 == 0) goto L_0x002d
                byte[] r3 = r10.f21492e     // Catch:{ all -> 0x0058 }
                int r3 = r3.length     // Catch:{ all -> 0x0058 }
                if (r3 <= 0) goto L_0x002d
                r3 = 1
                r2.setDoOutput(r3)     // Catch:{ all -> 0x0058 }
                byte[] r3 = r10.f21492e     // Catch:{ all -> 0x0058 }
                int r3 = r3.length     // Catch:{ all -> 0x0058 }
                r2.setFixedLengthStreamingMode(r3)     // Catch:{ all -> 0x0058 }
                java.io.OutputStream r3 = r2.getOutputStream()     // Catch:{ all -> 0x0058 }
                byte[] r4 = r10.f21492e     // Catch:{ all -> 0x0058 }
                r3.write(r4)     // Catch:{ all -> 0x0058 }
                r3.close()     // Catch:{ all -> 0x0058 }
            L_0x002d:
                int r1 = r2.getResponseCode()     // Catch:{ all -> 0x0058 }
                if (r1 <= 0) goto L_0x0043
                java.io.InputStream r3 = r2.getInputStream()     // Catch:{ all -> 0x0058 }
                com.applovin.impl.sdk.n r4 = r9.f21484b     // Catch:{ all -> 0x003e }
                java.lang.String r4 = com.applovin.impl.sdk.utils.C8572i.m26094a((java.io.InputStream) r3, (com.applovin.impl.sdk.C8490n) r4)     // Catch:{ all -> 0x003e }
                goto L_0x0045
            L_0x003e:
                r4 = move-exception
                r8 = r4
                r4 = r3
                r3 = r8
                goto L_0x005e
            L_0x0043:
                r3 = r0
                r4 = r3
            L_0x0045:
                com.applovin.impl.sdk.n r5 = r9.f21484b
                com.applovin.impl.sdk.utils.Utils.close(r3, r5)
                com.applovin.impl.sdk.n r3 = r9.f21484b
                com.applovin.impl.sdk.utils.Utils.close(r0, r3)
                com.applovin.impl.sdk.n r3 = r9.f21484b
                com.applovin.impl.sdk.utils.Utils.disconnect(r2, r3)
                r3 = r0
                r6 = r3
                r0 = r4
                goto L_0x0097
            L_0x0058:
                r3 = move-exception
                r4 = r0
                goto L_0x005e
            L_0x005b:
                r3 = move-exception
                r2 = r0
                r4 = r2
            L_0x005e:
                com.applovin.impl.sdk.n r5 = r9.f21484b     // Catch:{ all -> 0x00bc }
                r5.mo57320D()     // Catch:{ all -> 0x00bc }
                boolean r5 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x00bc }
                if (r5 == 0) goto L_0x0076
                com.applovin.impl.sdk.n r5 = r9.f21484b     // Catch:{ all -> 0x00bc }
                com.applovin.impl.sdk.v r5 = r5.mo57320D()     // Catch:{ all -> 0x00bc }
                java.lang.String r6 = "NetworkCommunicationThread"
                java.lang.String r7 = "Failed to make HTTP request"
                r5.mo57817a((java.lang.String) r6, (java.lang.String) r7, (java.lang.Throwable) r3)     // Catch:{ all -> 0x00bc }
            L_0x0076:
                if (r2 == 0) goto L_0x0086
                java.io.InputStream r5 = r2.getErrorStream()     // Catch:{ all -> 0x0083 }
                com.applovin.impl.sdk.n r6 = r9.f21484b     // Catch:{ all -> 0x0084 }
                java.lang.String r6 = com.applovin.impl.sdk.utils.C8572i.m26094a((java.io.InputStream) r5, (com.applovin.impl.sdk.C8490n) r6)     // Catch:{ all -> 0x0084 }
                goto L_0x0088
            L_0x0083:
                r5 = r0
            L_0x0084:
                r6 = r0
                goto L_0x0088
            L_0x0086:
                r5 = r0
                r6 = r5
            L_0x0088:
                com.applovin.impl.sdk.n r7 = r9.f21484b
                com.applovin.impl.sdk.utils.Utils.close(r4, r7)
                com.applovin.impl.sdk.n r4 = r9.f21484b
                com.applovin.impl.sdk.utils.Utils.close(r5, r4)
                com.applovin.impl.sdk.n r4 = r9.f21484b
                com.applovin.impl.sdk.utils.Utils.disconnect(r2, r4)
            L_0x0097:
                com.applovin.impl.sdk.network.e$c$a r2 = com.applovin.impl.sdk.network.C8520e.C8526c.m25831d()
                com.applovin.impl.sdk.network.e$c$a r1 = r2.mo57562a((int) r1)
                com.applovin.impl.sdk.network.e$c$a r0 = r1.mo57563a((java.lang.String) r0)
                com.applovin.impl.sdk.network.e$c$a r0 = r0.mo57566b((java.lang.String) r6)
                com.applovin.impl.sdk.network.e$c$a r0 = r0.mo57564a((java.lang.Throwable) r3)
                com.applovin.impl.sdk.network.e$c r0 = r0.mo57565a()
                java.util.concurrent.Executor r1 = r10.f21495h
                com.applovin.impl.sdk.network.e$a$1 r2 = new com.applovin.impl.sdk.network.e$a$1
                r2.<init>(r10, r0)
                r1.execute(r2)
                return
            L_0x00bc:
                r10 = move-exception
                com.applovin.impl.sdk.n r1 = r9.f21484b
                com.applovin.impl.sdk.utils.Utils.close(r4, r1)
                com.applovin.impl.sdk.n r1 = r9.f21484b
                com.applovin.impl.sdk.utils.Utils.close(r0, r1)
                com.applovin.impl.sdk.n r0 = r9.f21484b
                com.applovin.impl.sdk.utils.Utils.disconnect(r2, r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C8520e.C8522a.m25805a(com.applovin.impl.sdk.network.e$b):void");
        }

        /* renamed from: b */
        private HttpURLConnection m25806b(C8524b bVar) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(bVar.f21489b).openConnection();
            httpURLConnection.setRequestMethod(bVar.f21490c);
            httpURLConnection.setConnectTimeout(bVar.f21493f);
            httpURLConnection.setReadTimeout(bVar.f21493f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!bVar.f21491d.isEmpty()) {
                for (Map.Entry entry : bVar.f21491d.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    m25804a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.e$b */
    static class C8524b implements Comparable<C8524b> {

        /* renamed from: a */
        private static final AtomicInteger f21488a = new AtomicInteger();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f21489b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f21490c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Map<String, String> f21491d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final byte[] f21492e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final int f21493f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Consumer<C8526c> f21494g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final Executor f21495h;

        /* renamed from: i */
        private final int f21496i;

        /* renamed from: com.applovin.impl.sdk.network.e$b$a */
        static class C8525a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public String f21497a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public String f21498b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public Map<String, String> f21499c = CollectionUtils.map();
            /* access modifiers changed from: private */

            /* renamed from: d */
            public byte[] f21500d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public int f21501e;
            /* access modifiers changed from: private */

            /* renamed from: f */
            public Consumer<C8526c> f21502f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public Executor f21503g;

            C8525a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C8525a mo57550a(int i) {
                this.f21501e = i;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C8525a mo57551a(Consumer<C8526c> consumer) {
                this.f21502f = consumer;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C8525a mo57552a(String str) {
                this.f21497a = str;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C8525a mo57553a(String str, String str2) {
                this.f21499c.put(str, str2);
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C8525a mo57554a(Map<String, String> map) {
                if (map == null) {
                    map = CollectionUtils.map();
                }
                this.f21499c = map;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C8525a mo57555a(Executor executor) {
                this.f21503g = executor;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C8525a mo57556a(byte[] bArr) {
                this.f21500d = bArr;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C8524b mo57557a() {
                return new C8524b(this);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C8525a mo57558b(String str) {
                this.f21498b = str;
                return this;
            }
        }

        private C8524b(C8525a aVar) {
            this.f21489b = aVar.f21497a;
            this.f21490c = aVar.f21498b;
            this.f21491d = aVar.f21499c != null ? aVar.f21499c : Collections.emptyMap();
            this.f21492e = aVar.f21500d;
            this.f21493f = aVar.f21501e;
            this.f21494g = aVar.f21502f;
            this.f21495h = aVar.f21503g;
            this.f21496i = f21488a.incrementAndGet();
        }

        /* renamed from: a */
        public int compareTo(C8524b bVar) {
            return this.f21496i - bVar.f21496i;
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.e$c */
    static class C8526c {

        /* renamed from: a */
        private final int f21504a;

        /* renamed from: b */
        private final String f21505b;

        /* renamed from: c */
        private final String f21506c;

        /* renamed from: d */
        private final Throwable f21507d;

        /* renamed from: com.applovin.impl.sdk.network.e$c$a */
        static class C8527a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public int f21508a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public String f21509b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public String f21510c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public Throwable f21511d;

            C8527a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C8527a mo57562a(int i) {
                this.f21508a = i;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C8527a mo57563a(String str) {
                this.f21509b = str;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C8527a mo57564a(Throwable th) {
                this.f21511d = th;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C8526c mo57565a() {
                return new C8526c(this);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C8527a mo57566b(String str) {
                this.f21510c = str;
                return this;
            }
        }

        private C8526c(C8527a aVar) {
            this.f21504a = aVar.f21508a;
            this.f21505b = aVar.f21509b;
            this.f21506c = aVar.f21510c;
            this.f21507d = aVar.f21511d;
        }

        /* renamed from: d */
        static C8527a m25831d() {
            return new C8527a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo57559a() throws Throwable {
            Throwable th = this.f21507d;
            if (th == null) {
                return this.f21504a;
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo57560b() throws Throwable {
            Throwable th = this.f21507d;
            if (th == null) {
                return this.f21505b;
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo57561c() {
            return this.f21506c;
        }
    }

    C8520e(C8490n nVar) {
        this.f21482b = nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo57544a() {
        for (int i = 0; i < ((Integer) this.f21482b.mo57342a(C8380b.f20743as)).intValue(); i++) {
            new C8522a(this.f21481a, i, this.f21482b).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo57545a(C8524b bVar) {
        if (bVar != null) {
            this.f21481a.add(bVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
