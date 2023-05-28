package com.criteo.publisher.p069k0;

import android.content.Context;
import com.criteo.publisher.C1330x;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.model.C1278u;
import com.criteo.publisher.p070l0.C1173c;
import com.criteo.publisher.p074n0.C1289b;
import com.criteo.publisher.p074n0.C1297d;
import org.json.JSONObject;

/* renamed from: com.criteo.publisher.k0.a */
/* compiled from: AppEventTask */
public class C1157a extends C1330x {

    /* renamed from: c */
    private final C1195g f3668c = C1197h.m5407b(C1157a.class);

    /* renamed from: d */
    private final Context f3669d;

    /* renamed from: e */
    private final C1297d f3670e;

    /* renamed from: f */
    private final C1289b f3671f;

    /* renamed from: g */
    private final C1166g f3672g;

    /* renamed from: h */
    private final C1278u f3673h;

    /* renamed from: i */
    private final C1173c f3674i;

    /* renamed from: j */
    private final String f3675j;

    public C1157a(Context context, C1297d dVar, C1289b bVar, C1166g gVar, C1278u uVar, C1173c cVar, String str) {
        this.f3669d = context;
        this.f3670e = dVar;
        this.f3671f = bVar;
        this.f3672g = gVar;
        this.f3673h = uVar;
        this.f3674i = cVar;
        this.f3675j = str;
    }

    /* renamed from: a */
    public void mo3040a() throws Throwable {
        boolean d = this.f3671f.mo3614d();
        String b = this.f3671f.mo3613b();
        C1166g gVar = this.f3672g;
        String str = this.f3675j;
        String a = this.f3674i.mo3278a();
        JSONObject a2 = gVar.mo3267a(2379, this.f3669d.getPackageName(), b, str, d ? 1 : 0, this.f3673h.mo3602b().get(), a);
        this.f3668c.mo3339a("App event response: %s", a2);
        if (a2.has("throttleSec")) {
            this.f3670e.mo2986a(a2.optInt("throttleSec", 0));
        } else {
            this.f3670e.mo2986a(0);
        }
    }
}
