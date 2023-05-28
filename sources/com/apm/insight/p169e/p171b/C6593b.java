package com.apm.insight.p169e.p171b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.p169e.p170a.C6590a;
import com.apm.insight.p178l.C6688q;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.apm.insight.e.b.b */
public class C6593b extends C6592a<C6590a> {
    public C6593b() {
        super("duplicatelog");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ContentValues mo52030a(C6590a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", aVar.f14139a);
        contentValues.put("insert_time", Long.valueOf(aVar.f14140b));
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HashMap<String, String> mo52031a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("path", "TEXT");
        hashMap.put("insert_time", "INTEGER");
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "TEXT");
        hashMap.put("ext2", "TEXT");
        return hashMap;
    }

    /* renamed from: a */
    public void mo52033a(SQLiteDatabase sQLiteDatabase, C6590a aVar) {
        if (aVar != null && !mo52036a(sQLiteDatabase, aVar.f14139a)) {
            super.mo52033a(sQLiteDatabase, aVar);
            try {
                sQLiteDatabase.execSQL("delete from " + this.f14142b + " where " + "_id" + " in (select " + "_id" + " from " + this.f14142b + " order by " + "insert_time" + " desc limit 1000 offset " + 500 + ")");
            } catch (Exception e) {
                C6688q.m16632b((Throwable) e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo52036a(android.database.sqlite.SQLiteDatabase r11, java.lang.String r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x002e
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L_0x000a
            goto L_0x002e
        L_0x000a:
            r1 = 1
            java.lang.String r3 = r10.f14142b     // Catch:{ all -> 0x0026 }
            r4 = 0
            java.lang.String r5 = "path=?"
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ all -> 0x0026 }
            r6[r0] = r12     // Catch:{ all -> 0x0026 }
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0026 }
            int r12 = r11.getCount()     // Catch:{ all -> 0x0026 }
            r11.close()     // Catch:{ all -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            r11 = move-exception
            goto L_0x0028
        L_0x0026:
            r11 = move-exception
            r12 = 0
        L_0x0028:
            com.apm.insight.p178l.C6688q.m16632b((java.lang.Throwable) r11)
        L_0x002b:
            if (r12 <= 0) goto L_0x002e
            r0 = 1
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p169e.p171b.C6593b.mo52036a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }
}
