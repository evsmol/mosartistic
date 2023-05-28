package com.bytedance.sdk.openadsdk.p332a;

import com.bytedance.sdk.component.utils.C10627f;
import com.bytedance.sdk.component.utils.C10638l;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.bytedance.sdk.openadsdk.a.a */
/* compiled from: LruDiskFile */
public abstract class C10679a {

    /* renamed from: a */
    private final ExecutorService f26702a = Executors.newSingleThreadExecutor();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2134a(List<File> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo64589a(long j, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo64590a(File file, long j, int i);

    /* renamed from: a */
    public void mo64588a(File file) throws IOException {
        this.f26702a.submit(new C10681a(file));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m31415b(File file) throws IOException {
        try {
            C10627f.m31209b(file);
        } catch (Throwable th) {
            C10638l.m31230a("LruDiskFile", "setLastModifiedNowError", th);
        }
        mo2134a(C10627f.m31207a(file.getParentFile()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo64591b(List<File> list) {
        long j = 0;
        for (File length : list) {
            j += length.length();
        }
        return j;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.a.a$a */
    /* compiled from: LruDiskFile */
    private class C10681a implements Callable<Void> {

        /* renamed from: b */
        private final File f26704b;

        private C10681a(File file) {
            this.f26704b = file;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            C10679a.this.m31415b(this.f26704b);
            return null;
        }
    }
}
