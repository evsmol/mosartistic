package p085f;

import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p085f.C3793a;

/* renamed from: f.a */
public abstract class C3793a<Self extends C3793a<Self>> {

    /* renamed from: e */
    public static final Executor f9766e = Executors.newFixedThreadPool(2);

    /* renamed from: a */
    public final C3798d f9767a;

    /* renamed from: b */
    public final String f9768b;

    /* renamed from: c */
    public C3797c<Self> f9769c;

    /* renamed from: d */
    public C3796b<Self> f9770d;

    /* renamed from: f.a$b */
    public class C3795b implements Runnable {
        private C3795b() {
        }

        public void run() {
            C3793a.this.mo18679a();
        }
    }

    public C3793a(C3798d dVar, String str) {
        this.f9767a = dVar;
        this.f9768b = str;
    }

    /* renamed from: a */
    public Self mo18677a(C3796b<Self> bVar) {
        this.f9770d = bVar;
        return mo18686d();
    }

    /* renamed from: a */
    public Self mo18678a(C3797c<Self> cVar) {
        this.f9769c = cVar;
        return mo18686d();
    }

    /* renamed from: a */
    public final void mo18679a() {
        try {
            mo18680a(this.f9768b, mo18687e());
        } catch (Throwable unused) {
            mo18683b();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.net.URLConnection] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.io.Closeable, java.io.Flushable] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0083 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18680a(java.lang.String r4, byte[] r5) {
        /*
            r3 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0083 }
            r1.<init>(r4)     // Catch:{ all -> 0x0083 }
            java.net.URLConnection r4 = r1.openConnection()     // Catch:{ all -> 0x0083 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ all -> 0x0083 }
            f.d r1 = r3.f9767a     // Catch:{ all -> 0x0082 }
            r1.mo18690a(r4)     // Catch:{ all -> 0x0082 }
            r1 = 0
            r4.setInstanceFollowRedirects(r1)     // Catch:{ all -> 0x0082 }
            r1 = 40000(0x9c40, float:5.6052E-41)
            r4.setConnectTimeout(r1)     // Catch:{ all -> 0x0082 }
            r4.setReadTimeout(r1)     // Catch:{ all -> 0x0082 }
            r3.mo18685c(r4)     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x0048
            int r1 = r5.length     // Catch:{ all -> 0x0082 }
            if (r1 <= 0) goto L_0x0048
            r1 = 1
            r4.setDoOutput(r1)     // Catch:{ all -> 0x0082 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0040 }
            java.io.OutputStream r2 = r4.getOutputStream()     // Catch:{ all -> 0x0040 }
            r1.<init>(r2)     // Catch:{ all -> 0x0040 }
            r1.write(r5)     // Catch:{ all -> 0x003d }
            p158a.C5785a.m14753a((java.io.Flushable) r1)     // Catch:{ all -> 0x0082 }
            p158a.C5785a.m14752a((java.io.Closeable) r1)     // Catch:{ all -> 0x0082 }
            goto L_0x0048
        L_0x003d:
            r5 = move-exception
            r0 = r1
            goto L_0x0041
        L_0x0040:
            r5 = move-exception
        L_0x0041:
            p158a.C5785a.m14753a((java.io.Flushable) r0)     // Catch:{ all -> 0x0082 }
            p158a.C5785a.m14752a((java.io.Closeable) r0)     // Catch:{ all -> 0x0082 }
            throw r5     // Catch:{ all -> 0x0082 }
        L_0x0048:
            int r0 = r3.mo18682b(r4)     // Catch:{ all -> 0x0082 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L_0x007b
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x007b
            r1 = 305(0x131, float:4.27E-43)
            if (r0 == r1) goto L_0x0064
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0064
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x0064
            switch(r0) {
                case 301: goto L_0x0064;
                case 302: goto L_0x0064;
                case 303: goto L_0x0064;
                default: goto L_0x0063;
            }     // Catch:{ all -> 0x0082 }
        L_0x0063:
            goto L_0x0077
        L_0x0064:
            java.lang.String r0 = "Location"
            java.lang.String r0 = r4.getHeaderField(r0)     // Catch:{ all -> 0x0082 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x0077
            r3.mo18680a(r0, r5)     // Catch:{ all -> 0x0082 }
            r3.mo18681a((java.net.URLConnection) r4)
            return
        L_0x0077:
            r3.mo18683b()     // Catch:{ all -> 0x0082 }
            goto L_0x0087
        L_0x007b:
            r3.mo18684c()     // Catch:{ all -> 0x0082 }
            r3.mo18681a((java.net.URLConnection) r4)
            return
        L_0x0082:
            r0 = r4
        L_0x0083:
            r3.mo18683b()     // Catch:{ all -> 0x008b }
            r4 = r0
        L_0x0087:
            r3.mo18681a((java.net.URLConnection) r4)
            return
        L_0x008b:
            r4 = move-exception
            r3.mo18681a((java.net.URLConnection) r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p085f.C3793a.mo18680a(java.lang.String, byte[]):void");
    }

    /* renamed from: a */
    public final void mo18681a(URLConnection uRLConnection) {
        try {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).disconnect();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final int mo18682b(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo18683b() {
        C3796b<Self> bVar = this.f9770d;
        if (bVar != null) {
            bVar.mo18674b(mo18686d());
        }
    }

    /* renamed from: c */
    public final void mo18684c() {
        C3797c<Self> cVar = this.f9769c;
        if (cVar != null) {
            cVar.mo18673a(mo18686d());
        }
    }

    /* renamed from: c */
    public abstract void mo18685c(URLConnection uRLConnection);

    /* renamed from: d */
    public abstract Self mo18686d();

    /* renamed from: e */
    public abstract byte[] mo18687e();

    /* renamed from: f */
    public Self mo18688f() {
        f9766e.execute(new C3795b());
        return mo18686d();
    }
}
