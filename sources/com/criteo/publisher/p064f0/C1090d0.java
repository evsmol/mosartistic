package com.criteo.publisher.p064f0;

import android.util.AtomicFile;
import com.criteo.publisher.p064f0.C1112n;
import com.criteo.publisher.p064f0.C1118r;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;

/* renamed from: com.criteo.publisher.f0.d0 */
/* compiled from: SyncMetricFile */
class C1090d0 {

    /* renamed from: a */
    private final String f3538a;

    /* renamed from: b */
    private final AtomicFile f3539b;

    /* renamed from: c */
    private final Object f3540c = new Object();

    /* renamed from: d */
    private final C1117q f3541d;

    /* renamed from: e */
    private volatile SoftReference<C1112n> f3542e;

    C1090d0(String str, AtomicFile atomicFile, C1117q qVar) {
        this.f3538a = str;
        this.f3539b = atomicFile;
        this.f3541d = qVar;
        this.f3542e = new SoftReference<>((Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1112n mo3186b() throws IOException {
        synchronized (this.f3540c) {
            C1112n nVar = this.f3542e.get();
            if (nVar != null) {
                return nVar;
            }
            C1112n c = m5074c();
            this.f3542e = new SoftReference<>(c);
            return c;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3183a(C1112n nVar) throws IOException {
        synchronized (this.f3540c) {
            this.f3542e = new SoftReference<>((Object) null);
            m5073b(nVar);
            this.f3542e = new SoftReference<>(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3185a(C1118r.C1119a aVar) throws IOException {
        synchronized (this.f3540c) {
            C1112n.C1113a l = mo3186b().mo3143l();
            aVar.mo3130a(l);
            mo3183a(l.mo3149a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3184a(C1116p pVar) throws IOException {
        synchronized (this.f3540c) {
            C1112n b = mo3186b();
            mo3182a();
            try {
                if (!pVar.mo3216a(b)) {
                }
            } finally {
                mo3183a(b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3182a() {
        synchronized (this.f3540c) {
            this.f3542e = new SoftReference<>((Object) null);
            this.f3539b.delete();
        }
    }

    /* renamed from: c */
    private C1112n m5074c() throws IOException {
        BufferedInputStream bufferedInputStream;
        if (!this.f3539b.getBaseFile().exists()) {
            return C1112n.m5142a(this.f3538a).mo3149a();
        }
        FileInputStream openRead = this.f3539b.openRead();
        try {
            bufferedInputStream = new BufferedInputStream(openRead);
            C1112n a = this.f3541d.mo3217a(bufferedInputStream);
            bufferedInputStream.close();
            if (openRead != null) {
                openRead.close();
            }
            return a;
        } catch (Throwable th) {
            if (openRead != null) {
                try {
                    openRead.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: b */
    private void m5073b(C1112n nVar) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream startWrite = this.f3539b.startWrite();
        try {
            bufferedOutputStream = new BufferedOutputStream(startWrite);
            this.f3541d.mo3218a(nVar, bufferedOutputStream);
            this.f3539b.finishWrite(startWrite);
            bufferedOutputStream.close();
            if (startWrite != null) {
                startWrite.close();
                return;
            }
            return;
        } catch (IOException e) {
            this.f3539b.failWrite(startWrite);
            throw e;
        } catch (Throwable th) {
            if (startWrite != null) {
                try {
                    startWrite.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
        throw th;
    }
}
