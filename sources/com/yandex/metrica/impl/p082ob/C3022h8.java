package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.h8 */
public class C3022h8 implements C2988g8 {

    /* renamed from: a */
    private final Context f7953a;

    /* renamed from: b */
    private final String f7954b;

    /* renamed from: c */
    private final C2707X7 f7955c;

    /* renamed from: d */
    private final C3518tm f7956d;

    /* renamed from: e */
    private C2368O7 f7957e;

    public C3022h8(Context context, String str, C3518tm tmVar, C2707X7 x7) {
        this.f7953a = context;
        this.f7954b = str;
        this.f7956d = tmVar;
        this.f7955c = x7;
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase mo17628a() {
        C2368O7 o7;
        try {
            this.f7956d.mo18240a();
            o7 = new C2368O7(this.f7953a, this.f7954b, this.f7955c);
            this.f7957e = o7;
        } catch (Throwable unused) {
            return null;
        }
        return o7.getWritableDatabase();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0006 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo17629a(android.database.sqlite.SQLiteDatabase r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            if (r1 == 0) goto L_0x0006
            r1.close()     // Catch:{ all -> 0x0006 }
        L_0x0006:
            com.yandex.metrica.impl.ob.O7 r1 = r0.f7957e     // Catch:{ all -> 0x0015 }
            com.yandex.metrica.impl.p082ob.C1848A2.m6807a((java.io.Closeable) r1)     // Catch:{ all -> 0x0015 }
            com.yandex.metrica.impl.ob.tm r1 = r0.f7956d     // Catch:{ all -> 0x0015 }
            r1.mo18241b()     // Catch:{ all -> 0x0015 }
            r1 = 0
            r0.f7957e = r1     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)
            return
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3022h8.mo17629a(android.database.sqlite.SQLiteDatabase):void");
    }
}
