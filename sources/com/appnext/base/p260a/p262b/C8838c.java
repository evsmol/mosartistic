package com.appnext.base.p260a.p262b;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.appnext.base.a.b.c */
public class C8838c extends C8839d {

    /* renamed from: dK */
    private String f22379dK;

    /* renamed from: dL */
    private String f22380dL;

    /* renamed from: dM */
    private String f22381dM;

    /* renamed from: dN */
    private String f22382dN;

    /* renamed from: dO */
    private String f22383dO;

    /* renamed from: dP */
    private String f22384dP;

    /* renamed from: dQ */
    private String f22385dQ;

    /* renamed from: dR */
    private JSONObject f22386dR;

    public C8838c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f22379dK = str;
        this.f22380dL = str2;
        this.f22381dM = str3;
        this.f22382dN = str4;
        this.f22383dO = str5;
        this.f22384dP = str6;
        this.f22385dQ = str7;
        if (TextUtils.isEmpty(str8)) {
            this.f22386dR = null;
            return;
        }
        try {
            this.f22386dR = new JSONObject(str8);
        } catch (Throwable unused) {
            this.f22386dR = null;
        }
    }

    /* renamed from: ak */
    public final String mo58702ak() {
        return this.f22379dK;
    }

    /* renamed from: al */
    public final String mo58703al() {
        return this.f22380dL;
    }

    /* renamed from: am */
    public final String mo58704am() {
        return this.f22381dM;
    }

    /* renamed from: an */
    public final String mo58705an() {
        return this.f22382dN;
    }

    /* renamed from: ao */
    public final String mo58706ao() {
        return this.f22383dO;
    }

    public final String getKey() {
        return this.f22384dP;
    }

    /* renamed from: ap */
    public final String mo58707ap() {
        return this.f22385dQ;
    }

    /* renamed from: aq */
    public final JSONObject mo58708aq() {
        return this.f22386dR;
    }

    /* renamed from: p */
    private boolean m26592p(String str) {
        JSONObject jSONObject = this.f22386dR;
        return jSONObject != null && jSONObject.has(str) && !this.f22386dR.isNull(str);
    }

    /* renamed from: d */
    public final String mo58709d(String str, String str2) {
        if (!m26592p(str)) {
            return str2;
        }
        try {
            return this.f22386dR.getString(str);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public final long mo58700a(String str, long j) {
        if (!m26592p(str)) {
            return 1;
        }
        try {
            return this.f22386dR.getLong(str);
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* renamed from: a */
    public final int mo58699a(String str, int i) {
        if (!m26592p(str)) {
            return i;
        }
        try {
            return this.f22386dR.getInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    /* renamed from: a */
    public final boolean mo58701a(String str, boolean z) {
        if (!m26592p(str)) {
            return z;
        }
        try {
            return this.f22386dR.getBoolean(str);
        } catch (Throwable unused) {
            return z;
        }
    }
}
