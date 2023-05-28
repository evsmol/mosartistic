package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2121If;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Yi */
public class C2747Yi {

    /* renamed from: a */
    private final C2889da f7241a;

    /* renamed from: b */
    private final C2777Zi f7242b;

    public C2747Yi() {
        this(new C2889da(), new C2777Zi());
    }

    /* renamed from: a */
    public void mo17084a(C2638Ui ui, JSONObject jSONObject) {
        C2889da daVar = this.f7241a;
        C2121If.C2153w wVar = new C2121If.C2153w();
        JSONObject optJSONObject = jSONObject.optJSONObject("ui_parsing");
        if (optJSONObject != null) {
            wVar.f5744a = optJSONObject.optInt("too_long_text_bound", wVar.f5744a);
            wVar.f5745b = optJSONObject.optInt("truncated_text_bound", wVar.f5745b);
            wVar.f5746c = optJSONObject.optInt("max_visited_children_in_level", wVar.f5746c);
            wVar.f5747d = C2572Tl.m8504a(C2572Tl.m8510a(optJSONObject, "after_create_timeout", (Long) null), TimeUnit.SECONDS, wVar.f5747d);
            wVar.f5748e = optJSONObject.optBoolean("relative_text_size_calculation", wVar.f5748e);
            wVar.f5749f = optJSONObject.optBoolean("error_reporting", wVar.f5749f);
            wVar.f5750g = optJSONObject.optBoolean("parsing_allowed_by_default", wVar.f5750g);
            wVar.f5751h = this.f7242b.mo17122a(optJSONObject.optJSONArray("filters"));
        }
        ui.mo16882a(daVar.toModel(wVar));
    }

    C2747Yi(C2889da daVar, C2777Zi zi) {
        this.f7241a = daVar;
        this.f7242b = zi;
    }
}
