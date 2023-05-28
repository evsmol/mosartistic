package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.ka */
class C3122ka {

    /* renamed from: a */
    private final Context f8183a;

    /* renamed from: b */
    private final C1877B0 f8184b;

    C3122ka(Context context, C1877B0 b0) {
        this.f8183a = context;
        this.f8184b = b0;
    }

    /* renamed from: b */
    private String m9892b(String str, File file) {
        this.f8184b.getClass();
        File file2 = new File(file, str);
        if (!file2.exists() && m9891a(this.f8183a.getDatabasePath(str), file, str)) {
            String str2 = str + "-journal";
            m9891a(this.f8183a.getDatabasePath(str2), file, str2);
            String str3 = str + "-shm";
            m9891a(this.f8183a.getDatabasePath(str3), file, str3);
            String str4 = str + "-wal";
            m9891a(this.f8183a.getDatabasePath(str4), file, str4);
        }
        return file2.getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo17778a(String str, File file) {
        File noBackupFilesDir;
        try {
            this.f8184b.getClass();
            File file2 = new File(file, str);
            if (file2.exists()) {
                return file2.getAbsolutePath();
            }
            if (C1848A2.m6808a(21) && (noBackupFilesDir = this.f8183a.getNoBackupFilesDir()) != null) {
                this.f8184b.getClass();
                if (m9891a(new File(noBackupFilesDir, str), file, str)) {
                    String str2 = str + "-journal";
                    this.f8184b.getClass();
                    m9891a(new File(noBackupFilesDir, str2), file, str2);
                    String str3 = str + "-shm";
                    this.f8184b.getClass();
                    m9891a(new File(noBackupFilesDir, str3), file, str3);
                    String str4 = str + "-wal";
                    this.f8184b.getClass();
                    m9891a(new File(noBackupFilesDir, str4), file, str4);
                    return file2.getAbsolutePath();
                }
            }
            return m9892b(str, file);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo17777a(String str) {
        try {
            File noBackupFilesDir = this.f8183a.getNoBackupFilesDir();
            if (noBackupFilesDir == null) {
                return str;
            }
            return m9892b(str, noBackupFilesDir);
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    private boolean m9891a(File file, File file2, String str) {
        if (file == null || !file.exists()) {
            return false;
        }
        this.f8184b.getClass();
        File file3 = new File(file2, str);
        boolean renameTo = file.renameTo(file3);
        return !renameTo ? C2814b.m9067a(file, file3) : renameTo;
    }
}
