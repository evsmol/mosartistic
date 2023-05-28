package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.gj */
public class C3005gj implements C2872cj {

    /* renamed from: a */
    private final Context f7930a;

    /* renamed from: b */
    private final C1877B0 f7931b;

    C3005gj(Context context, C1877B0 b0) {
        this.f7930a = context;
        this.f7931b = b0;
    }

    /* renamed from: b */
    private boolean m9643b() {
        boolean z;
        File file;
        File c = this.f7931b.mo15524c(this.f7930a);
        if (c != null) {
            this.f7931b.getClass();
            z = new File(c, "metrica_data.db").exists();
        } else {
            z = false;
        }
        if (!z && C1848A2.m6808a(21)) {
            C1877B0 b0 = this.f7931b;
            Context context = this.f7930a;
            b0.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            if (noBackupFilesDir == null) {
                file = null;
            } else {
                file = new File(noBackupFilesDir, "metrica_data.db");
            }
            z = file != null && file.exists();
        }
        if (z) {
            return z;
        }
        C1877B0 b02 = this.f7931b;
        Context context2 = this.f7930a;
        b02.getClass();
        File databasePath = context2.getDatabasePath("metrica_data.db");
        if (databasePath == null || !databasePath.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo17194a() {
        return !m9643b();
    }
}
