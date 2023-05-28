package com.criteo.publisher.p066h0;

import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.p067i0.C1147a;
import com.criteo.publisher.p074n0.C1288a;
import java.util.Map;

/* renamed from: com.criteo.publisher.h0.f */
/* compiled from: OtherAdServersHeaderBidding */
public class C1145f implements C1143d {

    /* renamed from: a */
    private final C1195g f3645a = C1197h.m5407b(getClass());

    /* renamed from: b */
    public boolean mo3237b(Object obj) {
        return obj instanceof Map;
    }

    /* renamed from: a */
    public C1147a mo3232a() {
        return C1147a.CUSTOM_APP_BIDDING;
    }

    /* renamed from: a */
    public void mo3234a(Object obj) {
        if (mo3237b(obj)) {
            Map map = (Map) obj;
            map.remove("crt_cpm");
            map.remove("crt_displayUrl");
            map.remove("crt_size");
        }
    }

    /* renamed from: a */
    public void mo3235a(Object obj, C1288a aVar, C1272s sVar) {
        if (mo3237b(obj)) {
            Map map = (Map) obj;
            map.put("crt_displayUrl", sVar.mo3572d());
            map.put("crt_cpm", sVar.mo3566a());
            String str = "crt_displayUrl=" + sVar.mo3572d() + "," + "crt_cpm" + "=" + sVar.mo3566a();
            if (aVar == C1288a.CRITEO_BANNER) {
                String str2 = sVar.mo3581k() + "x" + sVar.mo3573e();
                map.put("crt_size", str2);
                str = str + "," + "crt_size" + "=" + str2;
            }
            this.f3645a.mo3337a(C1136a.m5229a(mo3232a(), str));
        }
    }
}
