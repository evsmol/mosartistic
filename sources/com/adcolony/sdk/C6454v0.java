package com.adcolony.sdk;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import com.adcolony.sdk.C6288e0;
import java.io.File;

/* renamed from: com.adcolony.sdk.v0 */
class C6454v0 {

    /* renamed from: a */
    private String f13884a;

    /* renamed from: b */
    private String f13885b;

    /* renamed from: c */
    private String f13886c;

    /* renamed from: d */
    private String f13887d;

    /* renamed from: e */
    private File f13888e;

    /* renamed from: f */
    private File f13889f;

    /* renamed from: g */
    private File f13890g;

    C6454v0() {
    }

    /* renamed from: b */
    private long m15797b(StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }

    /* renamed from: c */
    private long m15798c(StatFs statFs) {
        return Build.VERSION.SDK_INT >= 18 ? m15799d(statFs) : (long) statFs.getBlockSize();
    }

    /* renamed from: d */
    private long m15799d(StatFs statFs) {
        return statFs.getBlockSizeLong();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo51050a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return (double) (m15796a(statFs) * m15798c(statFs));
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo51056e() {
        C6328k b = C6185a.m14887b();
        this.f13884a = mo51057f() + "/adc3/";
        this.f13885b = this.f13884a + "media/";
        File file = new File(this.f13885b);
        this.f13888e = file;
        if (!file.isDirectory()) {
            this.f13888e.delete();
            this.f13888e.mkdirs();
        }
        if (!this.f13888e.isDirectory()) {
            b.mo50786b(true);
            return false;
        } else if (mo51050a(this.f13885b) < 2.097152E7d) {
            new C6288e0.C6289a().mo50644a("Not enough memory available at media path, disabling AdColony.").mo50645a(C6288e0.f13495f);
            b.mo50786b(true);
            return false;
        } else {
            this.f13886c = mo51057f() + "/adc3/data/";
            File file2 = new File(this.f13886c);
            this.f13889f = file2;
            if (!file2.isDirectory()) {
                this.f13889f.delete();
            }
            this.f13889f.mkdirs();
            this.f13887d = this.f13884a + "tmp/";
            File file3 = new File(this.f13887d);
            this.f13890g = file3;
            if (!file3.isDirectory()) {
                this.f13890g.delete();
                this.f13890g.mkdirs();
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo51057f() {
        Context a = C6185a.m14880a();
        if (a == null) {
            return "";
        }
        return a.getFilesDir().getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C6294f1 mo51058g() {
        if (!new File(mo51051a() + "AppVersion").exists()) {
            return C6235c0.m15073b();
        }
        return C6235c0.m15082c(mo51051a() + "AppVersion");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo51059h() {
        File file = this.f13888e;
        if (file == null || this.f13889f == null || this.f13890g == null) {
            return false;
        }
        if (!file.isDirectory()) {
            this.f13888e.delete();
        }
        if (!this.f13889f.isDirectory()) {
            this.f13889f.delete();
        }
        if (!this.f13890g.isDirectory()) {
            this.f13890g.delete();
        }
        this.f13888e.mkdirs();
        this.f13889f.mkdirs();
        this.f13890g.mkdirs();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo51053b() {
        return this.f13886c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo51054c() {
        return this.f13885b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo51055d() {
        return this.f13887d;
    }

    /* renamed from: a */
    private long m15796a(StatFs statFs) {
        return Build.VERSION.SDK_INT >= 18 ? m15797b(statFs) : (long) statFs.getAvailableBlocks();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51052a(C6294f1 f1Var) {
        C6235c0.m15089j(f1Var, mo51051a() + "AppVersion");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo51051a() {
        return this.f13884a;
    }
}
