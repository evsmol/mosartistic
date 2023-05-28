package com.bytedance.sdk.component.p313d.p316c.p317a;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.sdk.component.p313d.C10492b;
import java.io.File;

/* renamed from: com.bytedance.sdk.component.d.c.a.a */
/* compiled from: CacheConfig */
public class C10500a implements C10492b, Cloneable {

    /* renamed from: f */
    private static volatile C10492b f26163f;

    /* renamed from: a */
    private long f26164a;

    /* renamed from: b */
    private int f26165b;

    /* renamed from: c */
    private boolean f26166c;

    /* renamed from: d */
    private boolean f26167d;

    /* renamed from: e */
    private File f26168e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10500a(int i, long j, File file) {
        this(i, j, i != 0, j != 0, file);
    }

    public C10500a(int i, long j, boolean z, boolean z2, File file) {
        this.f26164a = j;
        this.f26165b = i;
        this.f26166c = z;
        this.f26167d = z2;
        this.f26168e = file;
    }

    /* renamed from: a */
    public long mo63997a() {
        return this.f26164a;
    }

    /* renamed from: b */
    public int mo63998b() {
        return this.f26165b;
    }

    /* renamed from: c */
    public boolean mo63999c() {
        return this.f26166c;
    }

    /* renamed from: d */
    public boolean mo64000d() {
        return this.f26167d;
    }

    /* renamed from: e */
    public File mo64001e() {
        return this.f26168e;
    }

    /* renamed from: a */
    public static void m30669a(Context context, C10492b bVar) {
        if (bVar != null) {
            f26163f = bVar;
        } else {
            f26163f = m30668a(new File(context.getCacheDir(), "image"));
        }
    }

    /* renamed from: a */
    public static C10492b m30668a(File file) {
        long j;
        int i;
        file.mkdirs();
        if (f26163f == null) {
            i = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            j = Math.min(m30671g() / 16, 41943040);
        } else {
            i = Math.min(f26163f.mo63998b() / 2, 31457280);
            j = Math.min(f26163f.mo63997a() / 2, 41943040);
        }
        return new C10500a(Math.max(i, 26214400), Math.max(j, 20971520), file);
    }

    /* renamed from: f */
    public static C10492b m30670f() {
        return f26163f;
    }

    /* renamed from: g */
    private static long m30671g() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }
}
