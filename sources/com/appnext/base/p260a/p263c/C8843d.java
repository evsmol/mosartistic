package com.appnext.base.p260a.p263c;

import android.content.ContentValues;
import android.database.Cursor;
import com.appnext.base.p260a.p262b.C8837b;
import com.appnext.base.p260a.p262b.C8839d;
import com.appnext.base.p260a.p263c.C8844e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONArray;

/* renamed from: com.appnext.base.a.c.d */
public class C8843d extends C8844e<C8837b> {
    public static final String COLUMN_TYPE = "t";

    /* renamed from: ec */
    public static final String f22400ec = "pk";

    /* renamed from: ed */
    public static final String f22401ed = "cd";

    /* renamed from: ee */
    public static final String f22402ee = "cdd";

    /* renamed from: ef */
    public static final String f22403ef = "cdt";

    /* renamed from: dU */
    private String[] f22404dU = {f22400ec, COLUMN_TYPE, f22401ed, f22402ee, f22403ef};

    /* renamed from: eg */
    private String f22405eg;

    /* renamed from: a */
    private static String m26625a(boolean z) {
        return z ? "primary key" : "";
    }

    public C8843d(String str) {
        this.f22405eg = str;
    }

    /* renamed from: a */
    public final long mo58726a(C8837b bVar) {
        return C8844e.m26642a(this.f22405eg, m26627c(bVar));
    }

    /* renamed from: a */
    public final long mo58727a(JSONArray jSONArray) {
        return super.mo58741b(this.f22405eg, jSONArray);
    }

    /* renamed from: b */
    public final long mo58730b(C8837b bVar) {
        mo58733u(bVar.getType());
        return C8844e.m26642a(this.f22405eg, m26627c(bVar));
    }

    /* renamed from: u */
    public final void mo58733u(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8844e.C8845a.Equals);
        super.mo58737a(this.f22405eg, new String[]{COLUMN_TYPE}, new String[]{str}, arrayList);
    }

    /* renamed from: b */
    public final int mo58729b(String str, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8844e.C8845a.Equals);
        arrayList.add(C8844e.C8845a.LessThan);
        return super.mo58737a(this.f22405eg, new String[]{COLUMN_TYPE, f22402ee}, new String[]{str, String.valueOf(j)}, arrayList);
    }

    public final void delete() {
        super.delete(this.f22405eg);
    }

    /* renamed from: as */
    public final List<C8837b> mo58728as() {
        return super.mo58743y(this.f22405eg);
    }

    /* renamed from: v */
    public final List<C8837b> mo58734v(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8844e.C8845a.Equals);
        return super.mo58740a(this.f22405eg, new String[]{COLUMN_TYPE}, new String[]{str}, (String) null, arrayList);
    }

    /* renamed from: w */
    public final List<C8837b> mo58735w(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8844e.C8845a.Equals);
        return super.mo58740a(this.f22405eg, new String[]{f22400ec}, new String[]{str}, (String) null, arrayList);
    }

    /* renamed from: c */
    public final List<C8837b> mo58731c(String str, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8844e.C8845a.Equals);
        arrayList.add(C8844e.C8845a.GreaterThan);
        return super.mo58740a(this.f22405eg, new String[]{COLUMN_TYPE, f22402ee}, new String[]{str, String.valueOf(j)}, (String) null, arrayList);
    }

    /* renamed from: x */
    public final List<C8837b> mo58736x(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8844e.C8845a.Equals);
        String str2 = this.f22405eg;
        String[] strArr = {COLUMN_TYPE};
        String[] strArr2 = {str};
        List<C8837b> a = super.mo58740a(str2, strArr, strArr2, f22402ee + " DESC", arrayList);
        if (a == null || a.isEmpty()) {
            return null;
        }
        ListIterator<C8837b> listIterator = a.listIterator();
        listIterator.next();
        while (listIterator.hasNext()) {
            listIterator.next();
            listIterator.remove();
        }
        return a;
    }

    /* renamed from: c */
    private static ContentValues m26627c(C8837b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(f22400ec, bVar.mo58694ah());
        contentValues.put(COLUMN_TYPE, bVar.getType());
        contentValues.put(f22401ed, bVar.mo58695ai());
        contentValues.put(f22403ef, bVar.getDataType());
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public final String[] mo58714at() {
        return this.f22404dU;
    }

    /* renamed from: d */
    protected static C8837b m26628d(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex(f22400ec));
        String string2 = cursor.getString(cursor.getColumnIndex(COLUMN_TYPE));
        String string3 = cursor.getString(cursor.getColumnIndex(f22401ed));
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(cursor.getLong(cursor.getColumnIndex(f22402ee)) * 1000);
        return new C8837b(string, string2, string3, instance.getTime(), cursor.getString(cursor.getColumnIndex(f22403ef)));
    }

    /* renamed from: b */
    protected static String m26626b(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("create table ");
        sb.append(str);
        sb.append(" ( pk text not null, t text not null " + "" + ", cd" + " text not null, cdd" + " text default (strftime('%s','now')), cdt" + " text)");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C8839d mo58715b(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex(f22400ec));
        String string2 = cursor.getString(cursor.getColumnIndex(COLUMN_TYPE));
        String string3 = cursor.getString(cursor.getColumnIndex(f22401ed));
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(cursor.getLong(cursor.getColumnIndex(f22402ee)) * 1000);
        return new C8837b(string, string2, string3, instance.getTime(), cursor.getString(cursor.getColumnIndex(f22403ef)));
    }
}
