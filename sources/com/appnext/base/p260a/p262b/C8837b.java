package com.appnext.base.p260a.p262b;

import java.util.Date;

/* renamed from: com.appnext.base.a.b.b */
public final class C8837b extends C8839d {

    /* renamed from: dG */
    private String f22375dG;

    /* renamed from: dH */
    private String f22376dH;

    /* renamed from: dI */
    private String f22377dI;

    /* renamed from: dJ */
    private Date f22378dJ;
    private String mDataType;

    public C8837b(String str, String str2, String str3) {
        this(str, str, str2, (Date) null, str3);
    }

    public C8837b(String str, String str2, String str3, String str4) {
        this(str, str2, str3, (Date) null, str4);
    }

    public C8837b(String str, String str2, String str3, Date date, String str4) {
        this.f22375dG = str;
        this.f22376dH = str2;
        this.f22377dI = str3;
        this.f22378dJ = date;
        this.mDataType = str4;
    }

    /* renamed from: ah */
    public final String mo58694ah() {
        return this.f22375dG;
    }

    public final String getType() {
        return this.f22376dH;
    }

    /* renamed from: ai */
    public final String mo58695ai() {
        return this.f22377dI;
    }

    /* renamed from: aj */
    public final Date mo58696aj() {
        return this.f22378dJ;
    }

    public final String getDataType() {
        return this.mDataType;
    }
}
