package com.adcolony.sdk;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.adcolony.sdk.C6288e0;
import com.adcolony.sdk.C6385n0;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.adcolony.sdk.n */
class C6383n {

    /* renamed from: a */
    private final SQLiteDatabase f13684a;

    /* renamed from: b */
    private final C6385n0 f13685b;

    C6383n(SQLiteDatabase sQLiteDatabase, C6385n0 n0Var) {
        this.f13684a = sQLiteDatabase;
        this.f13685b = n0Var;
    }

    /* renamed from: a */
    private void m15522a(C6385n0.C6386a aVar, List<String> list) {
        m15524a(aVar.mo50863f(), "manager_tmp_table");
        m15529c(aVar);
        m15525a("manager_tmp_table", aVar.mo50863f(), list);
        m15528b("manager_tmp_table");
    }

    /* renamed from: c */
    private void m15530c(C6385n0.C6388c cVar, String str) {
        ArrayList<String[]> c = mo50848c(cVar.mo50869b());
        boolean z = true;
        if (cVar.mo50868a().length == c.size()) {
            boolean z2 = false;
            for (int i = 0; i < cVar.mo50868a().length; i++) {
                if (!Objects.equals(cVar.mo50868a()[i], c.get(i)[2])) {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (z) {
            m15523a(cVar.mo50869b());
            m15527b(cVar, str);
        }
    }

    /* renamed from: d */
    private void m15531d(C6385n0.C6386a aVar) {
        List<C6385n0.C6388c> b = aVar.mo50859b();
        ArrayList<String> d = mo50849d(aVar.mo50863f());
        for (C6385n0.C6388c next : b) {
            if (d.contains(next.mo50869b())) {
                m15530c(next, aVar.mo50863f());
            } else {
                m15527b(next, aVar.mo50863f());
            }
            d.remove(next.mo50869b());
        }
        Iterator<String> it = d.iterator();
        while (it.hasNext()) {
            m15523a(it.next());
        }
    }

    /* renamed from: e */
    private void m15532e(C6385n0.C6386a aVar) {
        boolean z;
        boolean z2;
        ArrayList<C6384a> g = mo50852g(aVar.mo50863f());
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        boolean z4 = false;
        for (C6385n0.C6387b next : aVar.mo50858a()) {
            int size = g.size() - 1;
            while (true) {
                if (size < 0) {
                    z = false;
                    z2 = false;
                    break;
                }
                C6384a aVar2 = g.get(size);
                if (Objects.equals(aVar2.mo50853a(), next.mo50866b())) {
                    arrayList.add(next.mo50866b());
                    z = aVar2.mo50854a(next);
                    g.remove(size);
                    z2 = true;
                    break;
                }
                size--;
            }
            if (!z2 || !z) {
                z4 = true;
            }
        }
        if (g.size() <= 0) {
            z3 = z4;
        }
        if (z3) {
            m15522a(aVar, (List<String>) arrayList);
            m15526b(aVar);
            return;
        }
        m15531d(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo50847b() {
        int version = this.f13684a.getVersion();
        this.f13684a.beginTransaction();
        boolean z = false;
        try {
            List<C6385n0.C6386a> a = this.f13685b.mo50856a();
            ArrayList<String> a2 = mo50846a();
            for (C6385n0.C6386a next : a) {
                if (a2.contains(next.mo50863f())) {
                    m15532e(next);
                } else {
                    m15529c(next);
                    m15526b(next);
                }
                a2.remove(next.mo50863f());
            }
            Iterator<String> it = a2.iterator();
            while (it.hasNext()) {
                m15528b(it.next());
            }
            this.f13684a.setVersion(this.f13685b.mo50857b());
            this.f13684a.setTransactionSuccessful();
            z = true;
            new C6288e0.C6289a().mo50644a("Success upgrading database from ").mo50642a(version).mo50644a(" to ").mo50642a(this.f13685b.mo50857b()).mo50645a(C6288e0.f13494e);
        } catch (SQLException e) {
            new C6288e0.C6289a().mo50644a("Upgrading database from ").mo50642a(version).mo50644a(" to ").mo50642a(this.f13685b.mo50857b()).mo50644a("caused: ").mo50644a(e.toString()).mo50645a(C6288e0.f13496g);
        } catch (Throwable th) {
            this.f13684a.endTransaction();
            throw th;
        }
        this.f13684a.endTransaction();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ArrayList<String> mo50851f(String str) {
        SQLiteDatabase sQLiteDatabase = this.f13684a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master  WHERE type='" + str + "' ORDER BY name", (String[]) null);
        ArrayList<String> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            arrayList.add(rawQuery.getString(0));
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ArrayList<C6384a> mo50852g(String str) {
        ArrayList<C6384a> arrayList = new ArrayList<>();
        Iterator<String[]> it = mo50850e("PRAGMA table_info(" + str + ")").iterator();
        while (it.hasNext()) {
            C6384a a = C6384a.m15540a(it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: com.adcolony.sdk.n$a */
    static class C6384a {

        /* renamed from: a */
        private final String f13686a;

        /* renamed from: b */
        private final String f13687b;

        /* renamed from: c */
        private final String f13688c;

        private C6384a(String[] strArr) {
            this.f13686a = strArr[1];
            this.f13687b = strArr[2];
            this.f13688c = strArr[4];
        }

        /* renamed from: a */
        static C6384a m15540a(String[] strArr) {
            if (strArr.length >= 5) {
                return new C6384a(strArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo50854a(C6385n0.C6387b bVar) {
            return Objects.equals(this.f13686a, bVar.mo50866b()) && Objects.equals(this.f13687b, bVar.mo50867c()) && Objects.equals(this.f13688c, bVar.mo50865a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo50853a() {
            return this.f13686a;
        }
    }

    /* renamed from: a */
    private void m15523a(String str) {
        SQLiteDatabase sQLiteDatabase = this.f13684a;
        sQLiteDatabase.execSQL("DROP INDEX " + str);
    }

    /* renamed from: a */
    private String m15520a(C6385n0.C6386a aVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ");
        sb.append(aVar.mo50863f());
        sb.append(" (");
        for (int i = 0; i < aVar.mo50858a().size(); i++) {
            C6385n0.C6387b bVar = aVar.mo50858a().get(i);
            sb.append(bVar.mo50866b());
            sb.append(" ");
            sb.append(bVar.mo50867c());
            if (bVar.mo50865a() != null) {
                if (bVar.mo50865a() instanceof Boolean) {
                    str = ((Boolean) bVar.mo50865a()).booleanValue() ? "1" : BuildConfig.ADAPTER_VERSION;
                } else if (bVar.mo50865a() instanceof String) {
                    str = "'" + bVar.mo50865a() + "'";
                } else {
                    str = bVar.mo50865a().toString();
                }
                sb.append(" DEFAULT ");
                sb.append(str);
            }
            if (i < aVar.mo50858a().size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ArrayList<String> mo50849d(String str) {
        ArrayList<String[]> e = mo50850e("PRAGMA index_list(" + str + ")");
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String[]> it = e.iterator();
        while (it.hasNext()) {
            String[] next = it.next();
            if (next.length >= 3) {
                arrayList.add(next[1]);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m15529c(C6385n0.C6386a aVar) {
        this.f13684a.execSQL(m15520a(aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ArrayList<String[]> mo50848c(String str) {
        return mo50850e("PRAGMA index_info(" + str + ")");
    }

    /* renamed from: a */
    private String m15521a(C6385n0.C6388c cVar, String str) {
        String join = TextUtils.join(", ", cVar.mo50868a());
        return "CREATE INDEX " + cVar.mo50869b() + " ON " + str + "(" + join + ")";
    }

    /* renamed from: a */
    private void m15524a(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = this.f13684a;
        sQLiteDatabase.execSQL("ALTER TABLE " + str + " RENAME TO " + str2);
    }

    /* renamed from: a */
    private void m15525a(String str, String str2, List<String> list) {
        String join = TextUtils.join(", ", list);
        SQLiteDatabase sQLiteDatabase = this.f13684a;
        sQLiteDatabase.execSQL("INSERT INTO " + str2 + " (" + join + ") SELECT " + join + " FROM " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ArrayList<String[]> mo50850e(String str) {
        Cursor rawQuery = this.f13684a.rawQuery(str, (String[]) null);
        ArrayList<String[]> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            int columnCount = rawQuery.getColumnCount();
            String[] strArr = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                strArr[i] = rawQuery.getString(i);
            }
            arrayList.add(strArr);
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> mo50846a() {
        ArrayList<String> f = mo50851f("table");
        for (int size = f.size() - 1; size >= 0; size--) {
            String str = f.get(size);
            if (str.startsWith("android_") || str.startsWith("sqlite_")) {
                f.remove(size);
            }
        }
        return f;
    }

    /* renamed from: b */
    private void m15526b(C6385n0.C6386a aVar) {
        for (C6385n0.C6388c b : aVar.mo50859b()) {
            m15527b(b, aVar.mo50863f());
        }
    }

    /* renamed from: b */
    private void m15527b(C6385n0.C6388c cVar, String str) {
        this.f13684a.execSQL(m15521a(cVar, str));
    }

    /* renamed from: b */
    private void m15528b(String str) {
        SQLiteDatabase sQLiteDatabase = this.f13684a;
        sQLiteDatabase.execSQL("DROP TABLE " + str);
    }
}
