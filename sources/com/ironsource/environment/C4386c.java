package com.ironsource.environment;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.c */
public class C4386c {

    /* renamed from: a */
    private String f10462a;

    /* renamed from: b */
    private String f10463b;

    /* renamed from: c */
    private int f10464c;

    /* renamed from: d */
    private String f10465d;

    public C4386c(int i, String str, String str2, String str3) {
        this.f10464c = i;
        this.f10463b = str2;
        this.f10462a = str;
        this.f10465d = str3;
    }

    public C4386c(String str, String str2, String str3) {
        this.f10464c = -1;
        this.f10463b = str2;
        this.f10462a = str;
        this.f10465d = str3;
    }

    /* renamed from: a */
    public static long m12474a(Context context) {
        try {
            return m12482e(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: a */
    public static JSONObject m12475a(Context context, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                int i = 0;
                if (jSONArray.length() == 0) {
                    while (i < packageInfo.requestedPermissions.length) {
                        jSONObject.put(packageInfo.requestedPermissions[i], (packageInfo.requestedPermissionsFlags[i] & 2) != 0 ? "Granted" : "Rejected");
                        i++;
                    }
                } else {
                    List asList = Arrays.asList(packageInfo.requestedPermissions);
                    while (i < jSONArray.length()) {
                        String string = jSONArray.getString(i);
                        int indexOf = asList.indexOf(string);
                        if (indexOf != -1) {
                            jSONObject.put(string, (packageInfo.requestedPermissionsFlags[indexOf] & 2) != 0 ? "Granted" : "Rejected");
                        } else {
                            jSONObject.put(string, "notFoundInManifest");
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [int] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m12476a(android.content.Context r3, java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L_0x0035
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x0031 }
            r2 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r2)     // Catch:{ Exception -> 0x0031 }
            java.lang.String[] r0 = r3.requestedPermissions     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x0035
            r0 = 0
        L_0x001a:
            java.lang.String[] r2 = r3.requestedPermissions     // Catch:{ Exception -> 0x002e }
            int r2 = r2.length     // Catch:{ Exception -> 0x002e }
            if (r1 >= r2) goto L_0x002c
            if (r0 != 0) goto L_0x002c
            java.lang.String[] r2 = r3.requestedPermissions     // Catch:{ Exception -> 0x002e }
            r2 = r2[r1]     // Catch:{ Exception -> 0x002e }
            boolean r0 = r4.equals(r2)     // Catch:{ Exception -> 0x002e }
            int r1 = r1 + 1
            goto L_0x001a
        L_0x002c:
            r1 = r0
            goto L_0x0035
        L_0x002e:
            r3 = move-exception
            r1 = r0
            goto L_0x0032
        L_0x0031:
            r3 = move-exception
        L_0x0032:
            r3.printStackTrace()
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C4386c.m12476a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static long m12477b(Context context) {
        try {
            return m12482e(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m12478b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: c */
    public static String m12479c(Context context) {
        try {
            return m12482e(context).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static String m12480c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: d */
    public static String m12481d(Context context) {
        String str;
        try {
            str = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable unused) {
            str = null;
        }
        return TextUtils.isEmpty(str) ? "" : str;
    }

    /* renamed from: e */
    private static PackageInfo m12482e(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
    }

    /* renamed from: a */
    public String mo33193a() {
        return this.f10462a;
    }

    /* renamed from: b */
    public String mo33194b() {
        return this.f10463b;
    }

    /* renamed from: c */
    public String mo33195c() {
        return this.f10465d;
    }

    /* renamed from: d */
    public void mo33196d() {
        C4402f.m12523a(this);
    }
}
