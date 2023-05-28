package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.impl.ob.O7 */
public class C2368O7 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a */
    private final String f6301a;

    /* renamed from: b */
    private final C2875cm f6302b;

    /* renamed from: c */
    protected final C2707X7 f6303c;

    public C2368O7(Context context, String str, C2707X7 x7) {
        this(context, str, x7, C2642Ul.m8745a());
    }

    public SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f6302b.forceE(th, "", new Object[0]);
            this.f6302b.forceW("Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f6301a);
            ((C3264nh) C3322oh.m10248a()).reportError("db_read_error", th);
            return null;
        }
    }

    public SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f6302b.forceE(th, "", new Object[0]);
            this.f6302b.forceW("Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f6301a);
            ((C3264nh) C3322oh.m10248a()).reportError("db_write_error", th);
            return null;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f6303c.mo17027a(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f6303c.mo17028a(sQLiteDatabase, i, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        this.f6303c.mo17029b(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f6303c.mo17030b(sQLiteDatabase, i, i2);
    }

    C2368O7(Context context, String str, C2707X7 x7, C2875cm cmVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, C3084j8.f8117a);
        this.f6303c = x7;
        this.f6301a = str;
        this.f6302b = cmVar;
    }
}
