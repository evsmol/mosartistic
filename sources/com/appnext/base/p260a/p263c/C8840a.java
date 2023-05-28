package com.appnext.base.p260a.p263c;

import android.content.ContentValues;
import android.database.Cursor;
import com.appnext.base.p260a.p262b.C8836a;
import com.appnext.base.p260a.p262b.C8839d;
import com.appnext.base.p260a.p263c.C8844e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.appnext.base.a.c.a */
public final class C8840a extends C8844e<C8836a> {
    private static final String COLUMN_PACKAGE_NAME = "p";

    /* renamed from: dS */
    public static final String f22387dS = "ct";

    /* renamed from: dT */
    private static final String f22388dT = "c";

    /* renamed from: dU */
    private String[] f22389dU = {COLUMN_PACKAGE_NAME, f22388dT};

    /* renamed from: ar */
    public static String m26605ar() {
        return "create table ct ( p text, c integer)";
    }

    /* renamed from: a */
    public final long mo58712a(JSONArray jSONArray) {
        return super.mo58738a(f22387dS, jSONArray);
    }

    public final void delete() {
        super.delete(f22387dS);
    }

    /* renamed from: q */
    public final void mo58717q(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8844e.C8845a.Equals);
        super.mo58737a(f22387dS, new String[]{COLUMN_PACKAGE_NAME}, new String[]{str}, arrayList);
    }

    /* renamed from: as */
    public final List<C8836a> mo58713as() {
        return super.mo58743y(f22387dS);
    }

    /* renamed from: r */
    public final List<C8836a> mo58718r(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8844e.C8845a.Equals);
        return super.mo58740a(f22387dS, new String[]{COLUMN_PACKAGE_NAME}, new String[]{str}, (String) null, arrayList);
    }

    /* renamed from: b */
    private static ContentValues m26606b(C8836a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_PACKAGE_NAME, aVar.getPackageName());
        contentValues.put(f22388dT, aVar.mo58692ag());
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public final String[] mo58714at() {
        return this.f22389dU;
    }

    /* renamed from: a */
    protected static C8836a m26604a(Cursor cursor) {
        return new C8836a(cursor.getString(cursor.getColumnIndex(COLUMN_PACKAGE_NAME)), Integer.valueOf(cursor.getInt(cursor.getColumnIndex(f22388dT))));
    }

    /* renamed from: a */
    public final long mo58711a(C8836a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_PACKAGE_NAME, aVar.getPackageName());
        contentValues.put(f22388dT, aVar.mo58692ag());
        return C8844e.m26642a(f22387dS, contentValues);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C8839d mo58715b(Cursor cursor) {
        return new C8836a(cursor.getString(cursor.getColumnIndex(COLUMN_PACKAGE_NAME)), Integer.valueOf(cursor.getInt(cursor.getColumnIndex(f22388dT))));
    }
}
