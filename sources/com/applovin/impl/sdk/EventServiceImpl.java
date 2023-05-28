package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.sdk.network.C8533h;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class EventServiceImpl implements AppLovinEventService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f20448a;

    /* renamed from: b */
    private final Map<String, Object> f20449b;

    /* renamed from: c */
    private final AtomicBoolean f20450c = new AtomicBoolean();

    public EventServiceImpl(C8490n nVar) {
        this.f20448a = nVar;
        if (((Boolean) nVar.mo57342a(C8380b.f20791bn)).booleanValue()) {
            this.f20449b = JsonUtils.toStringObjectMap((String) this.f20448a.mo57378b(C8382d.f21012t, JsonUtils.EMPTY_JSON));
            return;
        }
        this.f20449b = CollectionUtils.map();
        nVar.mo57349a(C8382d.f21012t, JsonUtils.EMPTY_JSON);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m24911a() {
        return ((String) this.f20448a.mo57342a(C8380b.f20782be)) + "4.0/pix";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m24914a(C8549q qVar, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        boolean contains = this.f20448a.mo57380b(C8380b.f20789bl).contains(qVar.mo57645a());
        map2.put("AppLovin-Event", contains ? qVar.mo57645a() : "postinstall");
        if (!contains) {
            map2.put("AppLovin-Sub-Event", qVar.mo57645a());
        }
        return map2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m24915a(C8549q qVar, boolean z) {
        boolean contains = this.f20448a.mo57380b(C8380b.f20789bl).contains(qVar.mo57645a());
        Map<String, Object> a = this.f20448a.mo57340Y().mo57625a((Map<String, String>) null, z, false);
        a.put("event", contains ? qVar.mo57645a() : "postinstall");
        a.put("event_id", qVar.mo57648d());
        a.put("ts", Long.toString(qVar.mo57647c()));
        if (!contains) {
            a.put("sub_event", qVar.mo57645a());
        }
        return Utils.stringifyObjectMap(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m24916b() {
        return ((String) this.f20448a.mo57342a(C8380b.f20783bf)) + "4.0/pix";
    }

    /* renamed from: c */
    private void m24919c() {
        if (((Boolean) this.f20448a.mo57342a(C8380b.f20791bn)).booleanValue()) {
            this.f20448a.mo57349a(C8382d.f21012t, CollectionUtils.toJsonString(this.f20449b, JsonUtils.EMPTY_JSON));
        }
    }

    public Map<String, Object> getSuperProperties() {
        return CollectionUtils.map(this.f20449b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f20450c.compareAndSet(false, true)) {
            this.f20448a.mo57408x().trackEvent("landing");
        }
    }

    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            C8626v.m26258i("AppLovinEventService", "Super property key cannot be null or empty");
        } else if (obj == null) {
            this.f20449b.remove(str);
            m24919c();
        } else {
            List<String> b = this.f20448a.mo57380b(C8380b.f20790bm);
            if (!Utils.objectIsOfType(obj, b, this.f20448a)) {
                C8626v.m26258i("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + b);
                return;
            }
            this.f20449b.put(str, Utils.sanitizeSuperProperty(obj, this.f20448a));
            m24919c();
        }
    }

    public String toString() {
        return "EventService{}";
    }

    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    public void trackEvent(String str) {
        trackEvent(str, CollectionUtils.map());
    }

    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, (Map<String, String>) null);
    }

    public void trackEvent(String str, Map<String, String> map, final Map<String, String> map2) {
        this.f20448a.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = this.f20448a.mo57320D();
            D.mo57818b("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        final C8549q qVar = new C8549q(str, map, this.f20449b);
        try {
            this.f20448a.mo57337V().mo57228a((C8401a) new C8458z(this.f20448a, new Runnable() {
                public void run() {
                    EventServiceImpl.this.f20448a.mo57339X().mo57568a(C8533h.m25871o().mo57602c(EventServiceImpl.this.m24911a()).mo57605d(EventServiceImpl.this.m24916b()).mo57596a((Map<String, String>) EventServiceImpl.this.m24915a(qVar, false)).mo57600b((Map<String, String>) EventServiceImpl.this.m24914a(qVar, (Map<String, String>) map2)).mo57603c(qVar.mo57646b()).mo57601b(((Boolean) EventServiceImpl.this.f20448a.mo57342a(C8380b.f20917eJ)).booleanValue()).mo57597a(((Boolean) EventServiceImpl.this.f20448a.mo57342a(C8380b.f20908eA)).booleanValue()).mo57598a());
                }
            }), C8432o.C8434a.BACKGROUND);
        } catch (Throwable th) {
            this.f20448a.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D2 = this.f20448a.mo57320D();
                D2.mo57819b("AppLovinEventService", "Unable to track event: " + qVar, th);
            }
        }
    }

    public void trackEventSynchronously(String str) {
        this.f20448a.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = this.f20448a.mo57320D();
            D.mo57818b("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        C8549q qVar = new C8549q(str, CollectionUtils.map(), this.f20449b);
        this.f20448a.mo57339X().mo57568a(C8533h.m25871o().mo57602c(m24911a()).mo57605d(m24916b()).mo57596a(m24915a(qVar, true)).mo57600b(m24914a(qVar, (Map<String, String>) null)).mo57603c(qVar.mo57646b()).mo57601b(((Boolean) this.f20448a.mo57342a(C8380b.f20917eJ)).booleanValue()).mo57597a(((Boolean) this.f20448a.mo57342a(C8380b.f20908eA)).booleanValue()).mo57598a());
    }

    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            C8626v.m26254c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
        }
        trackEvent("iap", map2);
    }
}
