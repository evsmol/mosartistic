package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C2572Tl;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ri */
public class C2496Ri {

    /* renamed from: a */
    private final C2596U9 f6595a;

    C2496Ri() {
        this(new C2596U9());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16575a(C2638Ui ui, C2572Tl.C2573a aVar) {
        C2121If.C2146p pVar = new C2121If.C2146p();
        JSONObject optJSONObject = aVar.optJSONObject("sdk_list");
        if (optJSONObject != null) {
            Long a = C2572Tl.m8510a(optJSONObject, "min_collecting_interval_seconds", (Long) null);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            pVar.f5708a = C2572Tl.m8504a(a, timeUnit, pVar.f5708a);
            pVar.f5709b = C2572Tl.m8504a(C2572Tl.m8510a(optJSONObject, "min_first_collecting_delay_seconds", (Long) null), timeUnit, pVar.f5709b);
            pVar.f5710c = C2572Tl.m8504a(C2572Tl.m8510a(optJSONObject, "min_collecting_delay_after_launch_seconds", (Long) null), timeUnit, pVar.f5710c);
            pVar.f5711d = C2572Tl.m8504a(C2572Tl.m8510a(optJSONObject, "min_request_retry_interval_seconds", (Long) null), timeUnit, pVar.f5711d);
        }
        ui.mo16873a(this.f6595a.toModel(pVar));
    }

    C2496Ri(C2596U9 u9) {
        this.f6595a = u9;
    }
}
