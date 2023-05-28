package com.yandex.metrica.impl.p082ob;

import android.os.FileObserver;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.Y6 */
public class C2735Y6 {

    /* renamed from: a */
    private final FileObserver f7223a;

    /* renamed from: b */
    private final File f7224b;

    /* renamed from: c */
    private final C3202m6 f7225c;

    public C2735Y6(File file, C3240mm<File> mmVar) {
        this(new C3148l6(file, mmVar), file, new C3202m6());
    }

    /* renamed from: a */
    public void mo17077a() {
        this.f7225c.mo17838a(this.f7224b);
        this.f7223a.startWatching();
    }

    C2735Y6(FileObserver fileObserver, File file, C3202m6 m6Var) {
        this.f7223a = fileObserver;
        this.f7224b = file;
        this.f7225c = m6Var;
    }
}
