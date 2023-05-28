package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3351pf;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.yandex.metrica.impl.ob.Yc */
public class C2741Yc {
    /* renamed from: a */
    public C3351pf.C3352a mo17082a(C3155lc lcVar) {
        int i;
        int i2;
        C3351pf.C3352a aVar = new C3351pf.C3352a();
        aVar.f8568a = lcVar.mo17818f() == null ? aVar.f8568a : lcVar.mo17818f().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.f8569b = timeUnit.toSeconds(lcVar.mo17816d());
        aVar.f8572e = timeUnit.toSeconds(lcVar.mo17815c());
        if (lcVar.mo17812b() == null) {
            i = 0;
        } else {
            i = C2171J1.m7472a(lcVar.mo17812b());
        }
        aVar.f8573f = i;
        if (lcVar.mo17817e() == null) {
            i2 = 3;
        } else {
            i2 = C2171J1.m7474a(lcVar.mo17817e());
        }
        aVar.f8574g = i2;
        JSONArray a = lcVar.mo17806a();
        if (a != null) {
            aVar.f8570c = C2171J1.m7482b(a);
        }
        JSONArray g = lcVar.mo17819g();
        if (g != null) {
            aVar.f8571d = C2171J1.m7479a(g);
        }
        return aVar;
    }
}
