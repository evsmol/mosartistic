package com.criteo.publisher.p064f0;

import android.content.Context;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.p074n0.C1308l;
import com.squareup.tape.FileObjectQueue;
import com.squareup.tape.InMemoryObjectQueue;
import com.squareup.tape.ObjectQueue;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.criteo.publisher.f0.z */
/* compiled from: ObjectQueueFactory */
public class C1131z<T> {

    /* renamed from: a */
    private final C1195g f3618a = C1197h.m5407b(getClass());

    /* renamed from: b */
    private final Context f3619b;

    /* renamed from: c */
    private final C1308l f3620c;

    /* renamed from: d */
    private final C1084a0<T> f3621d;

    public C1131z(Context context, C1308l lVar, C1084a0<T> a0Var) {
        this.f3619b = context;
        this.f3620c = lVar;
        this.f3621d = a0Var;
    }

    /* renamed from: a */
    public ObjectQueue<T> mo3224a() {
        return m5218a(mo3225b());
    }

    /* renamed from: b */
    public File mo3225b() {
        return new File(this.f3619b.getFilesDir(), this.f3621d.mo3159d());
    }

    /* renamed from: a */
    private ObjectQueue<T> m5218a(File file) {
        try {
            FileObjectQueue fileObjectQueue = new FileObjectQueue(file, new C1132a(this.f3620c, this.f3621d.mo3157b()));
            fileObjectQueue.peek();
            return fileObjectQueue;
        } catch (Exception | OutOfMemoryError e) {
            if (m5219b(file)) {
                try {
                    return new FileObjectQueue(file, new C1132a(this.f3620c, this.f3621d.mo3157b()));
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                } finally {
                    this.f3618a.mo3337a(C1088c0.m5069a(e));
                }
            }
            return new InMemoryObjectQueue();
        }
    }

    /* renamed from: b */
    private boolean m5219b(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File b : listFiles) {
                if (!m5219b(b)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: com.criteo.publisher.f0.z$a */
    /* compiled from: ObjectQueueFactory */
    static class C1132a<T> implements FileObjectQueue.Converter<T> {

        /* renamed from: a */
        private final C1308l f3622a;

        /* renamed from: b */
        private final Class<T> f3623b;

        C1132a(C1308l lVar, Class<T> cls) {
            this.f3622a = lVar;
            this.f3623b = cls;
        }

        public T from(byte[] bArr) throws IOException {
            if (bArr == null) {
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                T a = this.f3622a.mo3659a(this.f3623b, (InputStream) byteArrayInputStream);
                byteArrayInputStream.close();
                return a;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public void toStream(T t, OutputStream outputStream) throws IOException {
            if (t != null && outputStream != null) {
                this.f3622a.mo3660a((Object) t, outputStream);
            }
        }
    }
}
