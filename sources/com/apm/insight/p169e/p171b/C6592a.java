package com.apm.insight.p169e.p171b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.C6553b;
import com.apm.insight.p178l.C6688q;
import java.util.HashMap;

/* renamed from: com.apm.insight.e.b.a */
public abstract class C6592a<T> {

    /* renamed from: a */
    protected final String f14141a = "_id";

    /* renamed from: b */
    protected final String f14142b;

    protected C6592a(String str) {
        this.f14142b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ContentValues mo52030a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract HashMap<String, String> mo52031a();

    /* renamed from: a */
    public void mo52032a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.f14142b);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> a = mo52031a();
            if (a != null) {
                for (String next : a.keySet()) {
                    sb.append(next);
                    sb.append(" ");
                    sb.append(a.get(next));
                    sb.append(",");
                }
                sb.delete(sb.length() - 1, sb.length());
                sb.append(")");
                sQLiteDatabase.execSQL(sb.toString());
            }
        } catch (Throwable th) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public void mo52033a(SQLiteDatabase sQLiteDatabase, T t) {
        if (sQLiteDatabase != null && t != null) {
            try {
                sQLiteDatabase.insert(this.f14142b, (String) null, mo52030a(t));
            } catch (Throwable th) {
                C6688q.m16632b(th);
            }
        }
    }
}
