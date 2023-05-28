package com.adcolony.sdk;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.adcolony.sdk.C6288e0;
import com.adcolony.sdk.C6385n0;
import com.adcolony.sdk.C6390o;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.adcolony.sdk.v */
class C6450v {

    /* renamed from: f */
    private static C6450v f13871f;

    /* renamed from: a */
    private final Executor f13872a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private SQLiteDatabase f13873b;

    /* renamed from: c */
    private boolean f13874c = false;

    /* renamed from: d */
    private C6453c f13875d;

    /* renamed from: e */
    private Set<String> f13876e = new HashSet();

    /* renamed from: com.adcolony.sdk.v$a */
    class C6451a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6294f1 f13877a;

        /* renamed from: b */
        final /* synthetic */ C6475x f13878b;

        /* renamed from: c */
        final /* synthetic */ Context f13879c;

        C6451a(C6294f1 f1Var, C6475x xVar, Context context) {
            this.f13877a = f1Var;
            this.f13878b = xVar;
            this.f13879c = context;
        }

        public void run() {
            C6385n0 a = C6385n0.m15543a(this.f13877a);
            if (a != null) {
                C6450v.this.m15784a(a, (C6475x<C6385n0>) this.f13878b, this.f13879c);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v$b */
    class C6452b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f13881a;

        /* renamed from: b */
        final /* synthetic */ ContentValues f13882b;

        C6452b(String str, ContentValues contentValues) {
            this.f13881a = str;
            this.f13882b = contentValues;
        }

        public void run() {
            C6450v.this.m15788b(this.f13881a, this.f13882b);
        }
    }

    /* renamed from: com.adcolony.sdk.v$c */
    interface C6453c {
        /* renamed from: a */
        void mo50824a();
    }

    C6450v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51047b() {
        this.f13876e.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m15788b(String str, ContentValues contentValues) {
        C6400p.m15604a(str, contentValues, this.f13873b);
    }

    /* renamed from: a */
    public static C6450v m15783a() {
        if (f13871f == null) {
            synchronized (C6450v.class) {
                if (f13871f == null) {
                    f13871f = new C6450v();
                }
            }
        }
        return f13871f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51045a(C6453c cVar) {
        this.f13875d = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51043a(C6294f1 f1Var, C6475x<C6385n0> xVar) {
        Context applicationContext = C6185a.m14889c() ? C6185a.m14880a().getApplicationContext() : null;
        if (applicationContext != null && f1Var != null) {
            try {
                this.f13872a.execute(new C6451a(f1Var, xVar, applicationContext));
            } catch (RejectedExecutionException e) {
                C6288e0.C6289a aVar = new C6288e0.C6289a();
                aVar.mo50644a("ADCEventsRepository.open failed with: " + e.toString()).mo50645a(C6288e0.f13498i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m15784a(C6385n0 n0Var, C6475x<C6385n0> xVar, Context context) {
        try {
            SQLiteDatabase sQLiteDatabase = this.f13873b;
            boolean z = false;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                this.f13873b = context.openOrCreateDatabase("adc_events_db", 0, (SQLiteDatabase.CursorFactory) null);
            }
            if (this.f13873b.needUpgrade(n0Var.mo50857b())) {
                if (m15787a(n0Var) && this.f13875d != null) {
                    z = true;
                }
                this.f13874c = z;
                if (z) {
                    this.f13875d.mo50824a();
                }
            } else {
                this.f13874c = true;
            }
            if (this.f13874c) {
                xVar.mo50820a(n0Var);
            }
        } catch (SQLiteException e) {
            new C6288e0.C6289a().mo50644a("Database cannot be opened").mo50644a(e.toString()).mo50645a(C6288e0.f13496g);
        }
        return;
    }

    /* renamed from: a */
    private boolean m15787a(C6385n0 n0Var) {
        return new C6383n(this.f13873b, n0Var).mo50847b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51044a(C6385n0.C6386a aVar, ContentValues contentValues) {
        String str;
        if (aVar != null && !this.f13876e.contains(aVar.mo50863f())) {
            this.f13876e.add(aVar.mo50863f());
            int c = aVar.mo50860c();
            long j = -1;
            C6385n0.C6389d g = aVar.mo50864g();
            if (g != null) {
                j = contentValues.getAsLong(g.mo50870a()).longValue() - g.mo50871b();
                str = g.mo50870a();
            } else {
                str = null;
            }
            C6400p.m15603a(c, j, str, aVar.mo50863f(), this.f13873b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51046a(String str, ContentValues contentValues) {
        if (this.f13874c) {
            try {
                this.f13872a.execute(new C6452b(str, contentValues));
            } catch (RejectedExecutionException e) {
                C6288e0.C6289a aVar = new C6288e0.C6289a();
                aVar.mo50644a("ADCEventsRepository.saveEvent failed with: " + e.toString()).mo50645a(C6288e0.f13498i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6390o.C6392b mo51042a(C6385n0 n0Var, long j) {
        if (this.f13874c) {
            return C6390o.m15563a(n0Var, this.f13873b, this.f13872a, j);
        }
        return null;
    }
}
