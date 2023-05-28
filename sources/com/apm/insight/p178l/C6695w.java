package com.apm.insight.p178l;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.apm.insight.C6617h;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.w */
public class C6695w {
    /* renamed from: a */
    public static long m16682a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getTotalBytes();
            }
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static JSONObject m16683a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free", m16685b());
            jSONObject.put("inner_total", m16687c());
            jSONObject.put("sdcard_free", m16690f());
            jSONObject.put("sdcard_total", m16691g());
            jSONObject.put("inner_free_real", m16688d());
            jSONObject.put("inner_total_real", m16689e());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m16684a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: b */
    private static long m16685b() {
        try {
            return m16686b(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static long m16686b(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getFreeBytes();
            }
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    private static long m16687c() {
        try {
            return m16682a(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: d */
    private static long m16688d() {
        try {
            return m16686b(C6617h.m16313g().getFilesDir());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: e */
    private static long m16689e() {
        try {
            return m16682a(C6617h.m16313g().getFilesDir());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: f */
    private static long m16690f() {
        try {
            if (m16684a()) {
                return Environment.getExternalStorageDirectory().getFreeSpace();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: g */
    private static long m16691g() {
        try {
            if (m16684a()) {
                return Environment.getExternalStorageDirectory().getTotalSpace();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
