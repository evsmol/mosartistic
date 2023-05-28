package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.yandex.metrica.impl.ob.th */
class C3511th implements CacheControlHttpsConnectionPerformer.Client {

    /* renamed from: a */
    final /* synthetic */ C2900di f9160a;

    /* renamed from: b */
    final /* synthetic */ File f9161b;

    /* renamed from: c */
    final /* synthetic */ C1997Eh f9162c;

    /* renamed from: d */
    final /* synthetic */ C3551uh f9163d;

    C3511th(C3551uh uhVar, C2900di diVar, File file, C1997Eh eh) {
        this.f9163d = uhVar;
        this.f9160a = diVar;
        this.f9161b = file;
        this.f9162c = eh;
    }

    public String getOldETag() {
        return this.f9163d.f9241e.mo17515b();
    }

    public void onError() {
        C3551uh.m10791a(this.f9163d, this.f9160a.f7680h);
        C3551uh.m10793c(this.f9163d);
    }

    public void onNotModified() {
        C3551uh.m10791a(this.f9163d, this.f9160a.f7681i);
        C3551uh.m10793c(this.f9163d);
        this.f9162c.mo15725a(this.f9161b);
    }

    public void onResponse(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        C3551uh.m10791a(this.f9163d, this.f9160a.f7681i);
        C3551uh.m10793c(this.f9163d);
        this.f9163d.f9241e.mo17514b(str);
        C3551uh uhVar = this.f9163d;
        File file = this.f9161b;
        uhVar.getClass();
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
        }
        C1848A2.m6807a((Closeable) fileOutputStream);
        this.f9162c.mo15725a(this.f9161b);
    }
}
