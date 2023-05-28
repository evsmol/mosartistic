package com.bytedance.sdk.openadsdk.core.p021e;

import com.bytedance.sdk.component.utils.C10638l;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.c */
/* compiled from: AppInfo */
public class C0451c {

    /* renamed from: f */
    private static int f1490f = 1;

    /* renamed from: g */
    private static int f1491g = 5;

    /* renamed from: a */
    private String f1492a = "";

    /* renamed from: b */
    private String f1493b = "";

    /* renamed from: c */
    private String f1494c = "";

    /* renamed from: d */
    private double f1495d = -1.0d;

    /* renamed from: e */
    private int f1496e = -1;

    /* renamed from: h */
    private int f1497h;

    /* renamed from: a */
    public String mo1213a() {
        return this.f1492a;
    }

    /* renamed from: a */
    public void mo1216a(String str) {
        this.f1492a = str;
    }

    /* renamed from: b */
    public String mo1217b() {
        return this.f1493b;
    }

    /* renamed from: b */
    public void mo1219b(String str) {
        this.f1493b = str;
    }

    /* renamed from: c */
    public String mo1220c() {
        return this.f1494c;
    }

    /* renamed from: c */
    public void mo1221c(String str) {
        this.f1494c = str;
    }

    /* renamed from: d */
    public double mo1222d() {
        return this.f1495d;
    }

    /* renamed from: a */
    public void mo1214a(double d) {
        if (d < ((double) f1490f) || d > ((double) f1491g)) {
            this.f1495d = -1.0d;
        } else {
            this.f1495d = d;
        }
    }

    /* renamed from: e */
    public int mo1223e() {
        return this.f1496e;
    }

    /* renamed from: a */
    public void mo1215a(int i) {
        if (i <= 0) {
            this.f1496e = -1;
        } else {
            this.f1496e = i;
        }
    }

    /* renamed from: f */
    public int mo1224f() {
        return this.f1497h;
    }

    /* renamed from: b */
    public void mo1218b(int i) {
        this.f1497h = i;
    }

    /* renamed from: g */
    public JSONObject mo1225g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", mo1217b());
            jSONObject.put("app_size", mo1224f());
            jSONObject.put("comment_num", mo1223e());
            jSONObject.put("download_url", mo1213a());
            jSONObject.put("package_name", mo1220c());
            jSONObject.put("score", mo1222d());
        } catch (Exception e) {
            C10638l.m31234b(e.toString());
        }
        return jSONObject;
    }
}
