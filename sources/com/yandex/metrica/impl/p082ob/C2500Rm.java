package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

/* renamed from: com.yandex.metrica.impl.ob.Rm */
public final class C2500Rm {

    /* renamed from: g */
    private static final HashMap<String, C2500Rm> f6609g = new HashMap<>();

    /* renamed from: a */
    private final String f6610a;

    /* renamed from: b */
    private FileLock f6611b;

    /* renamed from: c */
    private FileChannel f6612c;

    /* renamed from: d */
    private final File f6613d;

    /* renamed from: e */
    private RandomAccessFile f6614e;

    /* renamed from: f */
    private Semaphore f6615f = new Semaphore(1, true);

    private C2500Rm(Context context, String str) {
        File file;
        String str2 = str + ".lock";
        this.f6610a = str2;
        File cacheDir = context.getCacheDir();
        File file2 = null;
        if (cacheDir == null) {
            file = null;
        } else {
            file = new File(cacheDir, "appmetrica_locks");
        }
        if (file != null) {
            file.mkdirs();
        }
        this.f6613d = file != null ? new File(file, str2) : file2;
    }

    /* renamed from: a */
    public static synchronized C2500Rm m8297a(Context context, String str) {
        C2500Rm rm;
        synchronized (C2500Rm.class) {
            HashMap<String, C2500Rm> hashMap = f6609g;
            rm = hashMap.get(str);
            if (rm == null) {
                rm = new C2500Rm(context, str);
                hashMap.put(str, rm);
            }
        }
        return rm;
    }

    /* renamed from: b */
    public synchronized void mo16583b() {
        this.f6615f.release();
        if (this.f6615f.availablePermits() > 0) {
            C2254L0.m7690a(this.f6611b);
            C1848A2.m6807a((Closeable) this.f6612c);
            C1848A2.m6807a((Closeable) this.f6614e);
            this.f6612c = null;
            this.f6614e = null;
        }
    }

    /* renamed from: a */
    public synchronized void mo16582a() throws Throwable {
        this.f6615f.acquire();
        if (this.f6613d != null) {
            if (this.f6612c == null) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f6613d, "rw");
                this.f6614e = randomAccessFile;
                this.f6612c = randomAccessFile.getChannel();
            }
            this.f6611b = this.f6612c.lock();
        } else {
            throw new IllegalStateException("Lock file is null");
        }
    }
}
