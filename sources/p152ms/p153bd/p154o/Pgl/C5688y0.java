package p152ms.p153bd.p154o.Pgl;

/* renamed from: ms.bd.o.Pgl.y0 */
public class C5688y0 {

    /* renamed from: c */
    private static volatile C5688y0 f13043c;

    /* renamed from: a */
    private int f13044a = 0;

    /* renamed from: b */
    private Throwable f13045b = null;

    private C5688y0() {
    }

    /* renamed from: a */
    public static C5688y0 m14706a() {
        if (f13043c == null) {
            synchronized (C5688y0.class) {
                if (f13043c == null) {
                    f13043c = new C5688y0();
                }
            }
        }
        return f13043c;
    }

    /* renamed from: b */
    public synchronized Throwable mo42245b() {
        return this.f13045b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo42246c() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Throwable r0 = r2.f13045b     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            int r0 = r2.f13044a     // Catch:{ all -> 0x001e }
            int r1 = r0 + 1
            r2.f13044a = r1     // Catch:{ all -> 0x001e }
            r1 = 30
            if (r0 >= r1) goto L_0x0010
            goto L_0x001c
        L_0x0010:
            r0 = 0
            r2.f13044a = r0     // Catch:{ all -> 0x001e }
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ all -> 0x001e }
            r0.<init>()     // Catch:{ all -> 0x001e }
            r2.f13045b = r0     // Catch:{ all -> 0x001e }
            monitor-exit(r2)
            return
        L_0x001c:
            monitor-exit(r2)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p152ms.p153bd.p154o.Pgl.C5688y0.mo42246c():void");
    }
}
