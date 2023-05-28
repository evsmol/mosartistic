package com.criteo.publisher.p058a;

import android.content.Context;
import com.criteo.publisher.C1146i;
import com.criteo.publisher.model.C1278u;
import com.criteo.publisher.p069k0.C1157a;
import com.criteo.publisher.p069k0.C1166g;
import com.criteo.publisher.p070l0.C1173c;
import com.criteo.publisher.p074n0.C1289b;
import com.criteo.publisher.p074n0.C1297d;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.criteo.publisher.a.a */
/* compiled from: AppEvents */
public class C1017a implements C1297d {

    /* renamed from: a */
    private final Context f3385a;

    /* renamed from: b */
    private final C1289b f3386b;

    /* renamed from: c */
    private final C1146i f3387c;

    /* renamed from: d */
    private final C1166g f3388d;

    /* renamed from: e */
    private final C1173c f3389e;

    /* renamed from: f */
    private final C1278u f3390f;

    /* renamed from: g */
    private final Executor f3391g;

    /* renamed from: h */
    private final AtomicLong f3392h = new AtomicLong(-1);

    /* renamed from: a */
    public void mo2985a() {
    }

    public C1017a(Context context, C1289b bVar, C1146i iVar, C1166g gVar, C1173c cVar, C1278u uVar, Executor executor) {
        this.f3385a = context;
        this.f3386b = bVar;
        this.f3387c = iVar;
        this.f3388d = gVar;
        this.f3389e = cVar;
        this.f3390f = uVar;
        this.f3391g = executor;
    }

    /* renamed from: a */
    private void m4855a(String str) {
        if (m4856e()) {
            long j = this.f3392h.get();
            if (j <= 0 || this.f3387c.mo3242a() >= j) {
                this.f3391g.execute(new C1157a(this.f3385a, this, this.f3386b, this.f3388d, this.f3390f, this.f3389e, str));
            }
        }
    }

    /* renamed from: a */
    public void mo2986a(int i) {
        this.f3392h.set(this.f3387c.mo3242a() + ((long) (i * 1000)));
    }

    /* renamed from: d */
    public void mo2989d() {
        m4855a("Launch");
    }

    /* renamed from: b */
    public void mo2987b() {
        m4855a("Active");
    }

    /* renamed from: c */
    public void mo2988c() {
        m4855a("Inactive");
    }

    /* renamed from: e */
    private boolean m4856e() {
        return this.f3389e.mo3285g() && this.f3389e.mo3286i();
    }
}
