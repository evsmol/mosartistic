package com.apm.insight.p169e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.C6617h;
import com.apm.insight.p169e.p170a.C6590a;
import com.apm.insight.p169e.p171b.C6593b;
import com.apm.insight.p178l.C6688q;

/* renamed from: com.apm.insight.e.a */
public class C6589a {

    /* renamed from: a */
    private static volatile C6589a f14136a;

    /* renamed from: b */
    private C6593b f14137b;

    /* renamed from: c */
    private SQLiteDatabase f14138c;

    private C6589a() {
    }

    /* renamed from: a */
    public static C6589a m16122a() {
        if (f14136a == null) {
            synchronized (C6589a.class) {
                if (f14136a == null) {
                    f14136a = new C6589a();
                }
            }
        }
        return f14136a;
    }

    /* renamed from: b */
    private void m16123b() {
        if (this.f14137b == null) {
            mo52025a(C6617h.m16313g());
        }
    }

    /* renamed from: a */
    public synchronized void mo52025a(Context context) {
        try {
            this.f14138c = new C6591b(context).getWritableDatabase();
        } catch (Throwable th) {
            C6688q.m16632b(th);
        }
        this.f14137b = new C6593b();
    }

    /* renamed from: a */
    public synchronized void mo52026a(C6590a aVar) {
        m16123b();
        if (this.f14137b != null) {
            this.f14137b.mo52033a(this.f14138c, aVar);
        }
    }

    /* renamed from: a */
    public synchronized boolean mo52027a(String str) {
        m16123b();
        if (this.f14137b == null) {
            return false;
        }
        return this.f14137b.mo52036a(this.f14138c, str);
    }
}
