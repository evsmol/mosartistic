package com.appnext.base.p260a.p263c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p260a.p262b.C8839d;
import com.appnext.base.p260a.p263c.C8844e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appnext.base.a.c.c */
public final class C8842c extends C8844e<C8838c> {
    private static final String COLUMN_STATUS = "status";

    /* renamed from: dS */
    public static final String f22391dS = "config_table";

    /* renamed from: dV */
    public static final String f22392dV = "key";

    /* renamed from: dW */
    private static final String f22393dW = "sample";

    /* renamed from: dX */
    private static final String f22394dX = "sample_type";

    /* renamed from: dY */
    private static final String f22395dY = "cycle";

    /* renamed from: dZ */
    private static final String f22396dZ = "cycle_type";

    /* renamed from: ea */
    private static final String f22397ea = "service_key";

    /* renamed from: eb */
    private static final String f22398eb = "data";

    /* renamed from: dU */
    private String[] f22399dU = {"key", "status", "sample", "sample_type", "cycle", "cycle_type", "service_key", "data"};

    /* renamed from: ar */
    public static String m26615ar() {
        return "create table config_table ( key text primary key, status text not null default 'off', sample text not null default '1', sample_type text not null default '',cycle text not null default '1', cycle_type text not null default 'once', service_key text not null default '', data text not null default '')";
    }

    /* renamed from: b */
    public final long mo58722b(JSONArray jSONArray) {
        return super.mo58738a(f22391dS, jSONArray);
    }

    /* renamed from: a */
    public final long mo58720a(JSONObject jSONObject) {
        return super.mo58739a(f22391dS, jSONObject);
    }

    /* renamed from: a */
    public final long mo58719a(C8838c cVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", cVar.mo58702ak());
        contentValues.put("sample", cVar.mo58703al());
        contentValues.put("sample_type", cVar.mo58704am());
        contentValues.put("cycle", cVar.mo58705an());
        contentValues.put("cycle_type", cVar.mo58706ao());
        contentValues.put("key", cVar.getKey());
        contentValues.put("service_key", cVar.mo58707ap());
        JSONObject aq = cVar.mo58708aq();
        if (aq != null) {
            contentValues.put("data", aq.toString());
        }
        return C8844e.m26645b(f22391dS, contentValues);
    }

    public final void delete() {
        super.delete(f22391dS);
    }

    /* renamed from: s */
    public final void mo58724s(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C8844e.C8845a.Equals);
            super.mo58737a(f22391dS, new String[]{"key"}, new String[]{str}, arrayList);
        }
    }

    /* renamed from: as */
    public final List<C8838c> mo58721as() {
        return super.mo58743y(f22391dS);
    }

    /* renamed from: t */
    public final C8838c mo58725t(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8844e.C8845a.Equals);
        List a = super.mo58740a(f22391dS, new String[]{"key"}, new String[]{str}, (String) null, arrayList);
        if (a == null || a.size() <= 0) {
            return null;
        }
        return (C8838c) a.get(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public final String[] mo58714at() {
        return this.f22399dU;
    }

    /* renamed from: c */
    protected static C8838c m26616c(Cursor cursor) {
        return new C8838c(cursor.getString(cursor.getColumnIndex("status")), cursor.getString(cursor.getColumnIndex("sample")), cursor.getString(cursor.getColumnIndex("sample_type")), cursor.getString(cursor.getColumnIndex("cycle")), cursor.getString(cursor.getColumnIndex("cycle_type")), cursor.getString(cursor.getColumnIndex("key")), cursor.getString(cursor.getColumnIndex("service_key")), cursor.getString(cursor.getColumnIndex("data")));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C8839d mo58715b(Cursor cursor) {
        return new C8838c(cursor.getString(cursor.getColumnIndex("status")), cursor.getString(cursor.getColumnIndex("sample")), cursor.getString(cursor.getColumnIndex("sample_type")), cursor.getString(cursor.getColumnIndex("cycle")), cursor.getString(cursor.getColumnIndex("cycle_type")), cursor.getString(cursor.getColumnIndex("key")), cursor.getString(cursor.getColumnIndex("service_key")), cursor.getString(cursor.getColumnIndex("data")));
    }
}
