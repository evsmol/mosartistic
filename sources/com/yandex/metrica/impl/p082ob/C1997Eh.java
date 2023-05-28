package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.Eh */
public class C1997Eh {

    /* renamed from: a */
    private final Context f5343a;

    /* renamed from: b */
    private final C2316Mh f5344b;

    /* renamed from: c */
    private final C3551uh f5345c;

    /* renamed from: d */
    private C2198Jh f5346d;

    /* renamed from: e */
    private C2198Jh f5347e;

    /* renamed from: f */
    private C3356pi f5348f;

    public C1997Eh(Context context) {
        this(context, new C2316Mh(), new C3551uh(context));
    }

    /* renamed from: a */
    public synchronized void mo15724a(C3356pi piVar) {
        this.f5348f = piVar;
        C2198Jh jh = this.f5346d;
        if (jh == null) {
            C2316Mh mh = this.f5344b;
            Context context = this.f5343a;
            mh.getClass();
            this.f5346d = new C2198Jh(context, piVar, new C3449rh(), new C2245Kh(mh), new C3625wh("open", "http"), new C3625wh("port_already_in_use", "http"), "Http");
        } else {
            jh.mo16031a(piVar);
        }
        this.f5345c.mo18271a(piVar, this);
    }

    /* renamed from: b */
    public synchronized void mo15726b() {
        C2198Jh jh = this.f5346d;
        if (jh != null) {
            jh.mo16037b();
        }
        C2198Jh jh2 = this.f5347e;
        if (jh2 != null) {
            jh2.mo16037b();
        }
    }

    C1997Eh(Context context, C2316Mh mh, C3551uh uhVar) {
        this.f5343a = context;
        this.f5344b = mh;
        this.f5345c = uhVar;
    }

    /* renamed from: b */
    public synchronized void mo15727b(C3356pi piVar) {
        this.f5348f = piVar;
        this.f5345c.mo18271a(piVar, this);
        C2198Jh jh = this.f5346d;
        if (jh != null) {
            jh.mo16039b(piVar);
        }
        C2198Jh jh2 = this.f5347e;
        if (jh2 != null) {
            jh2.mo16039b(piVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo15723a() {
        C2198Jh jh = this.f5346d;
        if (jh != null) {
            jh.mo16030a();
        }
        C2198Jh jh2 = this.f5347e;
        if (jh2 != null) {
            jh2.mo16030a();
        }
    }

    /* renamed from: a */
    public synchronized void mo15725a(File file) {
        C2198Jh jh = this.f5347e;
        if (jh == null) {
            C2316Mh mh = this.f5344b;
            Context context = this.f5343a;
            C3356pi piVar = this.f5348f;
            mh.getClass();
            this.f5347e = new C2198Jh(context, piVar, new C3591vh(file), new C2281Lh(mh), new C3625wh("open", "https"), new C3625wh("port_already_in_use", "https"), "Https");
        } else {
            jh.mo16031a(this.f5348f);
        }
    }
}
