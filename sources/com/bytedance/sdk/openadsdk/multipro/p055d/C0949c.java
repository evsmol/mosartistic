package com.bytedance.sdk.openadsdk.multipro.p055d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0894a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.d.c */
/* compiled from: SPMultiProviderImpl */
public class C0949c implements C0894a {

    /* renamed from: a */
    private Context f3263a;

    /* renamed from: a */
    public String mo2760a() {
        return "t_sp";
    }

    /* renamed from: b */
    public void mo2762b() {
    }

    /* renamed from: c */
    private Context m4431c() {
        Context context = this.f3263a;
        return context == null ? C0558m.m2663a() : context;
    }

    /* renamed from: a */
    public Cursor mo2758a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Map<String, ?> b;
        if (!uri.getPath().split("/")[2].equals("get_all") || (b = C0948b.m4426b(m4431c(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String next : b.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = next;
            objArr[2] = b.get(next);
            if (objArr[2] instanceof Boolean) {
                objArr[1] = "boolean";
            } else if (objArr[2] instanceof String) {
                objArr[1] = "string";
            } else if (objArr[2] instanceof Integer) {
                objArr[1] = "int";
            } else if (objArr[2] instanceof Long) {
                objArr[1] = "long";
            } else if (objArr[2] instanceof Float) {
                objArr[1] = "float";
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    /* renamed from: a */
    public String mo2761a(Uri uri) {
        String[] split = uri.getPath().split("/");
        String str = split[2];
        String str2 = split[3];
        if (str.equals("contain")) {
            return C0948b.m4423a(C0558m.m2663a(), uri.getQueryParameter("sp_file_name"), str2) + "";
        }
        return "" + C0948b.m4418a(m4431c(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    /* renamed from: a */
    public Uri mo2759a(Uri uri, ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String[] split = uri.getPath().split("/");
        String str = split[2];
        String str2 = split[3];
        Object obj = contentValues.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (obj != null) {
            C0948b.m4421a(m4431c(), uri.getQueryParameter("sp_file_name"), str2, obj);
        }
        return null;
    }

    /* renamed from: a */
    public int mo2757a(Uri uri, String str, String[] strArr) {
        String[] split = uri.getPath().split("/");
        if (split[2].equals("clean")) {
            C0948b.m4420a(m4431c(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = split[3];
        if (C0948b.m4423a(m4431c(), uri.getQueryParameter("sp_file_name"), str2)) {
            C0948b.m4427b(m4431c(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    /* renamed from: a */
    public int mo2756a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        mo2759a(uri, contentValues);
        return 0;
    }
}
