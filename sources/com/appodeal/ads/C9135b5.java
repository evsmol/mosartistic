package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.services.C9515c;
import com.appodeal.ads.services.C9525g;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.appodeal.ads.b5 */
public final class C9135b5 implements ConnectorCallback {

    /* renamed from: a */
    public final C9515c f22947a;

    public /* synthetic */ C9135b5() {
        this(C9525g.m28153b());
    }

    public C9135b5(C9515c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "servicesSolution");
        this.f22947a = cVar;
    }

    public final Map<String, String> getPartnerParams() {
        Object obj;
        Iterator it = this.f22947a.getServicesData().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ServiceData) obj) instanceof ServiceData.Firebase) {
                break;
            }
        }
        ServiceData.Firebase firebase = obj instanceof ServiceData.Firebase ? (ServiceData.Firebase) obj : null;
        Map mapOf = MapsKt.mapOf(TuplesKt.m14544to("appodeal_framework", Appodeal.getFrameworkName()), TuplesKt.m14544to("appodeal_framework_version", Appodeal.getEngineVersion()), TuplesKt.m14544to("appodeal_plugin_version", Appodeal.getPluginVersion()), TuplesKt.m14544to("appodeal_sdk_version", Appodeal.getVersion()), TuplesKt.m14544to("appodeal_segment_id", Long.valueOf(Appodeal.getSegmentId())), TuplesKt.m14544to("appodeal_session_uuid", C9409q4.m27877m().mo61191j()), TuplesKt.m14544to("appodeal_token", C9700x2.m28512f()), TuplesKt.m14544to("firebase_keywords", firebase == null ? null : firebase.getKeywordsAsString()));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapOf.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            Pair pair = value == null ? null : TuplesKt.m14544to(str, value.toString());
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    public final void onServiceDataUpdated(ServiceData serviceData) {
        Intrinsics.checkNotNullParameter(serviceData, "serviceData");
        if (serviceData instanceof ServiceData.Adjust) {
            for (Map.Entry next : ((ServiceData.Adjust) serviceData).getConversionData().entrySet()) {
                C9409q4.m27837a((String) next.getKey(), next.getValue());
            }
        } else if (serviceData instanceof ServiceData.AppsFlyer) {
            for (Map.Entry next2 : ((ServiceData.AppsFlyer) serviceData).getConversionData().entrySet()) {
                C9409q4.m27837a((String) next2.getKey(), next2.getValue());
            }
        } else if (serviceData instanceof ServiceData.Firebase) {
            ServiceData.Firebase firebase = (ServiceData.Firebase) serviceData;
            if (StringsKt.isBlank(firebase.getAppInstanceId())) {
                Log.log("FirebaseService", "appInstanceId is null or empty");
            }
            C9409q4.m27851b("keywords", (Object) firebase.getKeywordsAsString());
        } else {
            boolean z = serviceData instanceof ServiceData.FacebookAnalytics;
        }
    }
}
