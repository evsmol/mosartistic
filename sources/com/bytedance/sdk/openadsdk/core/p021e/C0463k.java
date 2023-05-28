package com.bytedance.sdk.openadsdk.core.p021e;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTImage;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.k */
/* compiled from: Image */
public class C0463k {

    /* renamed from: a */
    private String f1583a;

    /* renamed from: b */
    private int f1584b;

    /* renamed from: c */
    private int f1585c;

    /* renamed from: d */
    private double f1586d;

    /* renamed from: e */
    private boolean f1587e;

    /* renamed from: f */
    private String f1588f;

    /* renamed from: a */
    public static TTImage m1949a(C0463k kVar) {
        if (kVar == null || !kVar.mo1290e()) {
            return null;
        }
        return new TTImage(kVar.mo1288c(), kVar.mo1285b(), kVar.mo1281a(), kVar.mo1289d());
    }

    /* renamed from: a */
    public String mo1281a() {
        return this.f1583a;
    }

    /* renamed from: a */
    public void mo1282a(int i) {
        this.f1584b = i;
    }

    /* renamed from: a */
    public void mo1283a(String str) {
        this.f1583a = str;
    }

    /* renamed from: a */
    public void mo1284a(boolean z) {
        this.f1587e = z;
    }

    /* renamed from: b */
    public int mo1285b() {
        return this.f1584b;
    }

    /* renamed from: b */
    public void mo1286b(int i) {
        this.f1585c = i;
    }

    /* renamed from: b */
    public void mo1287b(String str) {
        this.f1588f = str;
    }

    /* renamed from: c */
    public int mo1288c() {
        return this.f1585c;
    }

    /* renamed from: d */
    public double mo1289d() {
        return this.f1586d;
    }

    /* renamed from: e */
    public boolean mo1290e() {
        return !TextUtils.isEmpty(this.f1583a) && this.f1584b > 0 && this.f1585c > 0;
    }

    /* renamed from: f */
    public boolean mo1291f() {
        return this.f1587e;
    }

    /* renamed from: g */
    public String mo1292g() {
        return this.f1588f;
    }
}
