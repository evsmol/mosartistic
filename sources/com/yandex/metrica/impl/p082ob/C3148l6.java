package com.yandex.metrica.impl.p082ob;

import android.os.FileObserver;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.l6 */
public class C3148l6 extends FileObserver {

    /* renamed from: a */
    private final C3240mm<File> f8222a;

    /* renamed from: b */
    private final File f8223b;

    /* renamed from: c */
    private final C1877B0 f8224c;

    public C3148l6(File file, C3240mm<File> mmVar) {
        this(file, mmVar, new C1877B0());
    }

    public void onEvent(int i, String str) {
        if (i == 8 && !TextUtils.isEmpty(str)) {
            C3240mm<File> mmVar = this.f8222a;
            C1877B0 b0 = this.f8224c;
            File file = this.f8223b;
            b0.getClass();
            mmVar.mo15447b(new File(file, str));
        }
    }

    C3148l6(File file, C3240mm<File> mmVar, C1877B0 b0) {
        super(file.getAbsolutePath(), 8);
        this.f8222a = mmVar;
        this.f8223b = file;
        this.f8224c = b0;
    }
}
