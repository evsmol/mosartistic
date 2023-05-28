package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.yandex.metrica.impl.ob.tm */
public class C3518tm {

    /* renamed from: a */
    private final Context f9168a;

    /* renamed from: b */
    private final String f9169b;

    /* renamed from: c */
    private final C1877B0 f9170c;

    /* renamed from: d */
    private File f9171d;

    /* renamed from: e */
    private FileLock f9172e;

    /* renamed from: f */
    private RandomAccessFile f9173f;

    /* renamed from: g */
    private FileChannel f9174g;

    /* renamed from: h */
    private int f9175h;

    public C3518tm(Context context, String str) {
        this(context, str, new C1877B0());
    }

    /* renamed from: a */
    public synchronized void mo18240a() throws Throwable {
        File b = this.f9170c.mo15522b(this.f9168a.getFilesDir(), this.f9169b);
        this.f9171d = b;
        if (b != null) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f9171d, "rw");
            this.f9173f = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f9174g = channel;
            if (this.f9175h == 0) {
                this.f9172e = channel.lock();
            }
            this.f9175h++;
        } else {
            throw new IllegalStateException("Cannot create lock file");
        }
    }

    /* renamed from: b */
    public synchronized void mo18241b() {
        File file = this.f9171d;
        if (file != null) {
            file.getAbsolutePath();
        }
        int i = this.f9175h - 1;
        this.f9175h = i;
        if (i == 0) {
            C2254L0.m7690a(this.f9172e);
        }
        C1848A2.m6807a((Closeable) this.f9173f);
        C1848A2.m6807a((Closeable) this.f9174g);
        this.f9173f = null;
        this.f9172e = null;
        this.f9174g = null;
    }

    /* renamed from: c */
    public synchronized void mo18242c() {
        mo18241b();
        File file = this.f9171d;
        if (file != null) {
            file.delete();
        }
    }

    C3518tm(Context context, String str, C1877B0 b0) {
        this.f9175h = 0;
        this.f9168a = context;
        this.f9169b = str + ".lock";
        this.f9170c = b0;
    }
}
