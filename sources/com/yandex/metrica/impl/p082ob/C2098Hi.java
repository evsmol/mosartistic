package com.yandex.metrica.impl.p082ob;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Hi */
public class C2098Hi {
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(76:8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|(1:82)(1:83)|84|86)(1:88)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a A[Catch:{ all -> 0x0161 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15876a(com.yandex.metrica.impl.p082ob.C2638Ui r5, com.yandex.metrica.impl.p082ob.C2572Tl.C2573a r6) {
        /*
            r4 = this;
            com.yandex.metrica.impl.ob.If$i r0 = new com.yandex.metrica.impl.ob.If$i
            r0.<init>()
            java.lang.String r1 = "features"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0161 }
            r2.<init>()     // Catch:{ all -> 0x0161 }
            java.lang.Object r2 = r6.get(r1)     // Catch:{ all -> 0x0010 }
        L_0x0010:
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ all -> 0x0161 }
            java.lang.String r6 = "list"
            org.json.JSONObject r6 = r2.optJSONObject(r6)     // Catch:{ all -> 0x0161 }
            if (r6 == 0) goto L_0x0161
            com.yandex.metrica.impl.ob.Sh$a r1 = new com.yandex.metrica.impl.ob.Sh$a     // Catch:{ all -> 0x0161 }
            r1.<init>()     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "easy_collecting"
            boolean r3 = r0.f5632a     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16626d((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "egress"
            boolean r3 = r0.f5654w     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16627e((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "package_info"
            boolean r3 = r0.f5633b     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16635m((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "permissions_collecting"
            boolean r3 = r0.f5634c     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16636n((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "features_collecting"
            boolean r3 = r0.f5635d     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16628f((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "sdk_list"
            boolean r3 = r0.f5641j     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16637o((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "google_aid"
            boolean r3 = r0.f5636e     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16629g((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "throttling"
            boolean r3 = r0.f5649r     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16639q((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "wifi_around"
            boolean r3 = r0.f5637f     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16644v((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "wifi_connected"
            boolean r3 = r0.f5638g     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16645w((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "cells_around"
            boolean r3 = r0.f5639h     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16625c((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "sim_info"
            boolean r3 = r0.f5640i     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16638p((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "identity_light_collecting"
            boolean r3 = r0.f5642k     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16632j((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "location_collecting"
            boolean r3 = r0.f5643l     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16634l((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "lbs_collecting"
            boolean r3 = r0.f5644m     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16633k((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "gpl_collecting"
            boolean r3 = r0.f5645n     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16630h((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "ui_parsing"
            boolean r3 = r0.f5646o     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16642t((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "ui_event_sending"
            boolean r3 = r0.f5647p     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16641s((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "ui_raw_event_sending"
            boolean r3 = r0.f5647p     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16643u((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "ui_collecting_for_bridge"
            boolean r3 = r0.f5648q     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16640r((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "cell_additional_info"
            boolean r3 = r0.f5650s     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16622a((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "cell_additional_info_connected_only"
            boolean r3 = r0.f5651t     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.m7338a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.mo16624b((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "huawei_oaid"
            boolean r0 = r0.f5653v     // Catch:{ all -> 0x0161 }
            boolean r0 = r4.m7338a(r6, r2, r0)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r0 = r1.mo16631i((boolean) r0)     // Catch:{ all -> 0x0161 }
            java.lang.String r1 = "ssl_pinning"
            boolean r2 = r6.has(r1)     // Catch:{ all -> 0x0161 }
            if (r2 == 0) goto L_0x014a
            org.json.JSONObject r1 = r6.getJSONObject(r1)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "enabled"
            boolean r1 = r1.getBoolean(r2)     // Catch:{ all -> 0x0161 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0161 }
            goto L_0x014b
        L_0x014a:
            r1 = 0
        L_0x014b:
            com.yandex.metrica.impl.ob.Sh$a r0 = r0.mo16621a((java.lang.Boolean) r1)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh r1 = new com.yandex.metrica.impl.ob.Sh     // Catch:{ all -> 0x0161 }
            r1.<init>(r0)     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = "socket"
            r2 = 0
            boolean r6 = r4.m7338a(r6, r0, r2)     // Catch:{ all -> 0x0161 }
            r5.mo16889a((boolean) r6)     // Catch:{ all -> 0x0161 }
            r5.mo16868a((com.yandex.metrica.impl.p082ob.C2531Sh) r1)     // Catch:{ all -> 0x0161 }
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2098Hi.mo15876a(com.yandex.metrica.impl.ob.Ui, com.yandex.metrica.impl.ob.Tl$a):void");
    }

    /* renamed from: a */
    private boolean m7338a(JSONObject jSONObject, String str, boolean z) throws JSONException {
        Boolean valueOf = jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled")) : null;
        Boolean valueOf2 = Boolean.valueOf(z);
        if (valueOf == null) {
            valueOf = valueOf2;
        }
        return valueOf.booleanValue();
    }
}
