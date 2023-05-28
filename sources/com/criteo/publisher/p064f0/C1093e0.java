package com.criteo.publisher.p064f0;

import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.p074n0.C1311o;
import com.squareup.tape.FileException;
import com.squareup.tape.FileObjectQueue;
import com.squareup.tape.ObjectQueue;
import com.squareup.tape.QueueFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.criteo.publisher.f0.e0 */
/* compiled from: TapeSendingQueue */
class C1093e0<T> implements C1102k<T> {

    /* renamed from: a */
    private final C1195g f3548a = C1197h.m5407b(C1093e0.class);

    /* renamed from: b */
    private final Object f3549b = new Object();

    /* renamed from: c */
    private ObjectQueue<T> f3550c;

    /* renamed from: d */
    private Method f3551d;

    /* renamed from: e */
    private QueueFile f3552e;

    /* renamed from: f */
    private final C1131z<T> f3553f;

    /* renamed from: g */
    private final C1084a0<T> f3554g;

    C1093e0(C1131z<T> zVar, C1084a0<T> a0Var) {
        this.f3553f = zVar;
        this.f3554g = a0Var;
        this.f3551d = null;
        this.f3552e = null;
    }

    /* renamed from: a */
    public boolean mo3195a(T t) {
        synchronized (this.f3549b) {
            try {
                m5082b().add(t);
            } catch (FileException e) {
                C1311o.m5779a((Throwable) e);
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r1.size() <= 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        if (r3 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0053, code lost:
        if (r3 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0055, code lost:
        r3 = r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<T> mo3194a(int r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f3549b
            monitor-enter(r0)
            com.squareup.tape.ObjectQueue r1 = r6.m5082b()     // Catch:{ all -> 0x0078 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0078 }
            r2.<init>()     // Catch:{ all -> 0x0078 }
            r3 = 0
            r4 = 0
        L_0x000e:
            if (r4 >= r7) goto L_0x006b
            java.lang.Object r5 = r1.peek()     // Catch:{ FileException -> 0x0040 }
            if (r5 != 0) goto L_0x0029
            int r7 = r1.size()     // Catch:{ FileException -> 0x0020 }
            if (r7 <= 0) goto L_0x006b
            r1.remove()     // Catch:{ FileException -> 0x0020 }
            goto L_0x006b
        L_0x0020:
            r7 = move-exception
            if (r3 != 0) goto L_0x0025
            r3 = r7
            goto L_0x006b
        L_0x0025:
            r3.addSuppressed(r7)     // Catch:{ all -> 0x0078 }
            goto L_0x006b
        L_0x0029:
            r2.add(r5)     // Catch:{ FileException -> 0x0040 }
            int r5 = r1.size()     // Catch:{ FileException -> 0x0036 }
            if (r5 <= 0) goto L_0x0056
            r1.remove()     // Catch:{ FileException -> 0x0036 }
            goto L_0x0056
        L_0x0036:
            r5 = move-exception
            if (r3 != 0) goto L_0x003a
            goto L_0x0055
        L_0x003a:
            r3.addSuppressed(r5)     // Catch:{ all -> 0x0078 }
            goto L_0x0056
        L_0x003e:
            r7 = move-exception
            goto L_0x0059
        L_0x0040:
            r5 = move-exception
            if (r3 != 0) goto L_0x0045
            r3 = r5
            goto L_0x0048
        L_0x0045:
            r3.addSuppressed(r5)     // Catch:{ all -> 0x003e }
        L_0x0048:
            int r5 = r1.size()     // Catch:{ FileException -> 0x0052 }
            if (r5 <= 0) goto L_0x0056
            r1.remove()     // Catch:{ FileException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r5 = move-exception
            if (r3 != 0) goto L_0x003a
        L_0x0055:
            r3 = r5
        L_0x0056:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0059:
            int r2 = r1.size()     // Catch:{ FileException -> 0x0063 }
            if (r2 <= 0) goto L_0x006a
            r1.remove()     // Catch:{ FileException -> 0x0063 }
            goto L_0x006a
        L_0x0063:
            r1 = move-exception
            if (r3 != 0) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            r3.addSuppressed(r1)     // Catch:{ all -> 0x0078 }
        L_0x006a:
            throw r7     // Catch:{ all -> 0x0078 }
        L_0x006b:
            if (r3 == 0) goto L_0x0076
            com.criteo.publisher.logging.g r7 = r6.f3548a     // Catch:{ all -> 0x0078 }
            com.criteo.publisher.logging.e r1 = com.criteo.publisher.p064f0.C1088c0.m5068a((java.lang.Exception) r3)     // Catch:{ all -> 0x0078 }
            r7.mo3337a(r1)     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            return r2
        L_0x0078:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.p064f0.C1093e0.mo3194a(int):java.util.List");
    }

    /* renamed from: a */
    public int mo3192a() {
        synchronized (this.f3549b) {
            ObjectQueue b = m5082b();
            if (b instanceof FileObjectQueue) {
                try {
                    int intValue = ((Integer) m5083c().invoke(mo3193a((FileObjectQueue<?>) (FileObjectQueue) b), new Object[0])).intValue();
                    return intValue;
                } catch (Exception e) {
                    C1311o.m5779a((Throwable) e);
                }
            }
            int size = b.size() * this.f3554g.mo3156a();
            return size;
        }
    }

    /* renamed from: c */
    private Method m5083c() throws ReflectiveOperationException {
        if (this.f3551d == null) {
            Method declaredMethod = QueueFile.class.getDeclaredMethod("usedBytes", new Class[0]);
            this.f3551d = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return this.f3551d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public QueueFile mo3193a(FileObjectQueue<?> fileObjectQueue) throws ReflectiveOperationException, ClassCastException {
        if (this.f3552e == null) {
            Field declaredField = FileObjectQueue.class.getDeclaredField("queueFile");
            declaredField.setAccessible(true);
            this.f3552e = (QueueFile) declaredField.get(fileObjectQueue);
        }
        return this.f3552e;
    }

    /* renamed from: b */
    private ObjectQueue<T> m5082b() {
        if (this.f3550c == null) {
            this.f3550c = this.f3553f.mo3224a();
        }
        return this.f3550c;
    }
}
