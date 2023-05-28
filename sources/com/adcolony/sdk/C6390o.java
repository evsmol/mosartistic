package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.C6288e0;
import com.adcolony.sdk.C6385n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.o */
class C6390o {

    /* renamed from: com.adcolony.sdk.o$a */
    class C6391a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6385n0 f13707a;

        /* renamed from: b */
        final /* synthetic */ SQLiteDatabase f13708b;

        /* renamed from: c */
        final /* synthetic */ C6392b f13709c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f13710d;

        C6391a(C6385n0 n0Var, SQLiteDatabase sQLiteDatabase, C6392b bVar, CountDownLatch countDownLatch) {
            this.f13707a = n0Var;
            this.f13708b = sQLiteDatabase;
            this.f13709c = bVar;
            this.f13710d = countDownLatch;
        }

        public void run() {
            for (C6385n0.C6386a next : this.f13707a.mo50856a()) {
                for (Map.Entry next2 : next.mo50862e().entrySet()) {
                    C6394c a = C6390o.m15564a((String) next2.getValue(), this.f13708b);
                    if (a != null) {
                        this.f13709c.m15566a(next.mo50861d(), (String) next2.getKey(), a);
                    }
                }
            }
            C6396o0.m15589c().mo50889a(this.f13709c);
            this.f13710d.countDown();
        }
    }

    /* renamed from: com.adcolony.sdk.o$b */
    static class C6392b {

        /* renamed from: a */
        private final int f13711a;

        /* renamed from: b */
        private final Map<String, ArrayList<C6393a>> f13712b;

        /* renamed from: com.adcolony.sdk.o$b$a */
        static class C6393a {

            /* renamed from: a */
            private final String f13713a;

            /* renamed from: b */
            private final C6394c f13714b;

            /* synthetic */ C6393a(String str, C6394c cVar, C6391a aVar) {
                this(str, cVar);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public String mo50875a() {
                return this.f13713a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C6394c mo50876b() {
                return this.f13714b;
            }

            private C6393a(String str, C6394c cVar) {
                this.f13713a = str;
                this.f13714b = cVar;
            }
        }

        /* synthetic */ C6392b(int i, C6391a aVar) {
            this(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6294f1 mo50874b() {
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15077b(b, "version", mo50873a());
            for (Map.Entry next : this.f13712b.entrySet()) {
                C6294f1 b2 = C6235c0.m15073b();
                Iterator it = ((ArrayList) next.getValue()).iterator();
                while (it.hasNext()) {
                    C6393a aVar = (C6393a) it.next();
                    C6290e1 a = C6235c0.m15059a();
                    for (String b3 : aVar.mo50876b().mo50879a((Character) ',')) {
                        a.mo50652b(b3);
                    }
                    C6235c0.m15068a(b2, aVar.mo50875a(), a);
                }
                C6235c0.m15069a(b, (String) next.getKey(), b2);
            }
            return b;
        }

        private C6392b(int i) {
            this.f13712b = new ConcurrentHashMap();
            this.f13711a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m15566a(String str, String str2, C6394c cVar) {
            ArrayList arrayList;
            C6393a aVar = new C6393a(str2, cVar, (C6391a) null);
            if (!this.f13712b.containsKey(str) || (arrayList = this.f13712b.get(str)) == null) {
                this.f13712b.put(str, new ArrayList(Collections.singletonList(aVar)));
            } else {
                arrayList.add(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo50873a() {
            return this.f13711a;
        }
    }

    /* renamed from: a */
    static C6392b m15563a(C6385n0 n0Var, SQLiteDatabase sQLiteDatabase, Executor executor, long j) {
        C6392b bVar = new C6392b(n0Var.mo50857b(), (C6391a) null);
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            executor.execute(new C6391a(n0Var, sQLiteDatabase, bVar, countDownLatch));
            if (j > 0) {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException | RejectedExecutionException e) {
            C6288e0.C6289a aVar = new C6288e0.C6289a();
            aVar.mo50644a("ADCDbReader.calculateFeatureVectors failed with: " + e.toString()).mo50645a(C6288e0.f13498i);
        }
        return bVar;
    }

    /* renamed from: com.adcolony.sdk.o$c */
    static class C6394c {

        /* renamed from: a */
        private final List<C6395a> f13715a = new ArrayList();

        /* renamed from: b */
        private final List<ContentValues> f13716b = new ArrayList();

        /* renamed from: com.adcolony.sdk.o$c$a */
        static class C6395a {

            /* renamed from: a */
            private final int f13717a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public final String f13718b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public final int f13719c;

            /* synthetic */ C6395a(int i, String str, int i2, C6391a aVar) {
                this(i, str, i2);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public int mo50884c() {
                return this.f13719c;
            }

            private C6395a(int i, String str, int i2) {
                this.f13717a = i;
                this.f13718b = str;
                this.f13719c = i2;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo50882a() {
                return this.f13717a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public String mo50883b() {
                return this.f13718b;
            }
        }

        C6394c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo50880b(int i) {
            if (i < 0 || i >= this.f13715a.size()) {
                return -1;
            }
            return this.f13715a.get(i).mo50884c();
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                str = "\n";
                if (i >= this.f13715a.size()) {
                    break;
                }
                sb.append(this.f13715a.get(i).f13718b);
                if (i != this.f13715a.size() - 1) {
                    str = " | ";
                }
                sb.append(str);
                i++;
            }
            for (ContentValues next : this.f13716b) {
                for (int i2 = 0; i2 < this.f13715a.size(); i2++) {
                    sb.append(next.getAsString(mo50877a(i2)));
                    if (i2 == this.f13715a.size() - 1) {
                        str2 = str;
                    } else {
                        str2 = " | ";
                    }
                    sb.append(str2);
                }
            }
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m15571a(int i, String str, int i2) {
            this.f13715a.add(new C6395a(i, str, i2, (C6391a) null));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo50877a(int i) {
            if (i < 0 || i >= this.f13715a.size()) {
                return null;
            }
            return this.f13715a.get(i).mo50883b();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m15572a(Cursor cursor) {
            ContentValues contentValues = new ContentValues();
            for (C6395a next : this.f13715a) {
                int a = next.f13719c;
                if (a == 1) {
                    contentValues.put(next.mo50883b(), Long.valueOf(cursor.getLong(next.mo50882a())));
                } else if (a == 2) {
                    contentValues.put(next.mo50883b(), Double.valueOf(cursor.getDouble(next.mo50882a())));
                } else if (a != 4) {
                    contentValues.put(next.mo50883b(), cursor.getString(next.mo50882a()));
                } else {
                    contentValues.put(next.mo50883b(), cursor.getBlob(next.mo50882a()));
                }
            }
            this.f13716b.add(contentValues);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo50878a(int i, Character ch) {
            if (i < 0 || i >= this.f13716b.size()) {
                return null;
            }
            ContentValues contentValues = this.f13716b.get(i);
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (i2 < this.f13715a.size()) {
                if (mo50880b(i2) == 3) {
                    sb.append("\"");
                    sb.append(contentValues.get(mo50877a(i2)));
                    sb.append("\"");
                } else {
                    sb.append(contentValues.getAsString(mo50877a(i2)));
                }
                sb.append(i2 == this.f13715a.size() + -1 ? "" : ch);
                i2++;
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<String> mo50879a(Character ch) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f13716b.size(); i++) {
                arrayList.add(mo50878a(i, ch));
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    static C6394c m15564a(String str, SQLiteDatabase sQLiteDatabase) {
        C6394c cVar;
        Throwable th;
        C6394c cVar2 = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(str, (String[]) null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToFirst()) {
                        cVar = new C6394c();
                        int i = 0;
                        while (i < rawQuery.getColumnCount()) {
                            try {
                                cVar.m15571a(i, rawQuery.getColumnName(i), rawQuery.getType(i));
                                i++;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    rawQuery.close();
                                } catch (Throwable th3) {
                                    try {
                                        th.addSuppressed(th3);
                                    } catch (SQLException e) {
                                        e = e;
                                        new C6288e0.C6289a().mo50644a("SQLException on execute query: ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
                                        return cVar;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        new C6288e0.C6289a().mo50644a("Error on execute query: ").mo50644a(th.toString()).mo50645a(C6288e0.f13498i);
                                        return cVar;
                                    }
                                }
                                throw th;
                            }
                        }
                        do {
                            cVar.m15572a(rawQuery);
                        } while (rawQuery.moveToNext());
                        cVar2 = cVar;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    cVar = null;
                    rawQuery.close();
                    throw th;
                }
            }
            if (rawQuery == null) {
                return cVar2;
            }
            rawQuery.close();
            return cVar2;
        } catch (SQLException e2) {
            e = e2;
            cVar = cVar2;
        } catch (Throwable th6) {
            th = th6;
            cVar = cVar2;
            new C6288e0.C6289a().mo50644a("Error on execute query: ").mo50644a(th.toString()).mo50645a(C6288e0.f13498i);
            return cVar;
        }
    }
}
