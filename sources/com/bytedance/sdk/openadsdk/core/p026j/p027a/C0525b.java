package com.bytedance.sdk.openadsdk.core.p026j.p027a;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.p323e.C10576b;
import com.bytedance.sdk.component.p323e.p325b.C10579b;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a.b */
/* compiled from: VastXmlParser */
public abstract class C0525b {

    /* renamed from: e */
    public static int f1977e;

    /* renamed from: a */
    protected int f1978a;

    /* renamed from: b */
    protected final Context f1979b;

    /* renamed from: c */
    protected int f1980c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d */
    protected double f1981d = Double.MIN_VALUE;

    public C0525b(Context context, int i, int i2) {
        if (i2 > 0 && i > 0) {
            this.f1981d = ((double) i) / ((double) i2);
        }
        float e = C1002v.m4748e(context);
        if (e != 0.0f) {
            this.f1980c = (int) (((float) i) / e);
        }
        this.f1979b = context.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1753a(Exception exc, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i);
            C0796b.m3985a().mo2608a("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1754a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            if (Integer.parseInt(str) < 2) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo1752a(String str, List<C0532c> list) {
        String str2;
        int i = this.f1978a;
        if (i >= 5) {
            return null;
        }
        this.f1978a = i + 1;
        if (str == null) {
            return null;
        }
        try {
            C10579b c = C0835d.m4093a().mo2660b().mo64151c();
            c.mo64176a(str);
            C10576b a = c.mo64172a();
            str2 = a.mo64164d();
            try {
                a.mo64160a();
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            str2 = null;
            mo1753a(e, 0);
            if (!list.isEmpty()) {
                C0532c.m2549b(list, C0519a.WRAPPER_TIMEOUT, -1, (String) null);
            }
            return str2;
        }
        return str2;
    }
}
