package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.p016b.C0406b;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p021e.C0455g;
import com.bytedance.sdk.openadsdk.core.p021e.C0460j;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.f */
/* compiled from: ExpressClickListener */
public class C0591f extends C0406b {
    public C0591f(Context context, C0477n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0455g mo1097a(float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, long j, long j2, View view, View view2, String str, float f5, int i, float f6, int i2, JSONObject jSONObject) {
        float f7;
        float f8;
        float f9;
        float f10;
        int i3;
        int i4;
        long j3;
        long j4;
        int i5;
        char c;
        char c2;
        int i6;
        int[] a = C1002v.m4730a(view);
        if (a == null || a.length != 2) {
            f10 = f;
            f9 = f2;
            f8 = f3;
            f7 = f4;
            i4 = 0;
            i3 = 0;
        } else {
            i4 = a[0];
            i3 = a[1];
            if (this.f1348r == 0) {
                float b = C1002v.m4731b(this.f1332b, f);
                float f11 = (float) i4;
                float b2 = C1002v.m4731b(this.f1332b, f2);
                float f12 = (float) i3;
                f8 = (C1002v.m4731b(this.f1332b, f3) + f11) - 0.5f;
                f7 = (C1002v.m4731b(this.f1332b, f4) + f12) - 0.5f;
                f9 = (b2 + f12) - 0.5f;
                f10 = (b + f11) - 0.5f;
            } else {
                f10 = f;
                f9 = f2;
                f8 = f3;
                f7 = f4;
            }
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (this.f1333c != null) {
            j4 = this.f1333c.f1555e;
            int i7 = i4;
            j3 = this.f1333c.f1556f;
            if (this.f1348r == 0) {
                iArr[0] = ((int) C1002v.m4731b(this.f1332b, (float) this.f1333c.f1557g)) + i7;
                iArr[1] = ((int) C1002v.m4731b(this.f1332b, (float) this.f1333c.f1558h)) + i3;
                i6 = (int) C1002v.m4731b(this.f1332b, (float) this.f1333c.f1559i);
                i5 = (int) C1002v.m4731b(this.f1332b, (float) this.f1333c.f1560j);
                c2 = 0;
                c = 1;
            } else {
                c2 = 0;
                iArr[0] = this.f1333c.f1557g;
                c = 1;
                iArr[1] = this.f1333c.f1558h;
                i6 = this.f1333c.f1559i;
                i5 = this.f1333c.f1560j;
            }
            iArr2[c2] = i6;
            iArr2[c] = i5;
            if (i6 == 0 && i5 == 0 && view2 != null) {
                iArr = C1002v.m4730a(view2);
                iArr2 = C1002v.m4743c(view2);
            }
        } else {
            j4 = j;
            j3 = j2;
        }
        this.f1348r = 0;
        return new C0455g.C0457a().mo1254f(f10).mo1252e(f9).mo1249d(f8).mo1246c(f7).mo1244b(j4).mo1236a(j3).mo1245b(a).mo1240a(iArr).mo1248c(C1002v.m4743c(view)).mo1251d(iArr2).mo1250d(this.f1367y).mo1253e(this.f1368z).mo1255f(this.f1355A).mo1243b(C0503h.m2281d().mo1591b() ? 1 : 2).mo1237a(sparseArray).mo1238a(str).mo1235a(i2).mo1239a(jSONObject).mo1241a();
    }

    /* renamed from: a */
    public void mo1960a(C0460j jVar) {
        this.f1333c = jVar;
    }
}
