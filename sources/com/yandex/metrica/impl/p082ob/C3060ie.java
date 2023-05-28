package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.PreloadInfo;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ie */
public class C3060ie {

    /* renamed from: a */
    private C2923ee f8057a;

    public C3060ie(PreloadInfo preloadInfo, C2875cm cmVar, boolean z) {
        if (preloadInfo == null) {
            return;
        }
        if (!TextUtils.isEmpty(preloadInfo.getTrackingId())) {
            this.f8057a = new C2923ee(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z, C3522u0.APP);
        } else if (cmVar.isEnabled()) {
            cmVar.mo15260e("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(20:2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0032 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo17713a(org.json.JSONObject r6) {
        /*
            r5 = this;
            com.yandex.metrica.impl.ob.ee r0 = r5.f8057a
            if (r0 == 0) goto L_0x0035
            java.lang.String r1 = "preloadInfo"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0035 }
            r2.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "trackingId"
            java.lang.String r4 = r0.f7751a     // Catch:{ all -> 0x0032 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "additionalParams"
            org.json.JSONObject r4 = r0.f7752b     // Catch:{ all -> 0x0032 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "wasSet"
            boolean r4 = r0.f7753c     // Catch:{ all -> 0x0032 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "autoTracking"
            boolean r4 = r0.f7754d     // Catch:{ all -> 0x0032 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "source"
            com.yandex.metrica.impl.ob.u0 r0 = r0.f7755e     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r0.mo18246a()     // Catch:{ all -> 0x0032 }
            r2.put(r3, r0)     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r6.put(r1, r2)     // Catch:{ all -> 0x0035 }
        L_0x0035:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3060ie.mo17713a(org.json.JSONObject):org.json.JSONObject");
    }
}
