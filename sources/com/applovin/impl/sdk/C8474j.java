package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.C8056c;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p236c.C8134c;
import com.applovin.impl.sdk.network.C8509a;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.network.C8533h;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.appnext.core.p267a.C8894b;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.j */
public class C8474j implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C8490n f21284a;

    /* renamed from: b */
    private final AppLovinCommunicator f21285b;

    C8474j(C8490n nVar) {
        this.f21284a = nVar;
        this.f21285b = AppLovinCommunicator.getInstance(nVar.mo57332P());
        if (!nVar.mo57388e() && ((Boolean) nVar.mo57342a(C8380b.f20980fu)).booleanValue()) {
            this.f21285b.mo52414a(nVar);
            this.f21285b.subscribe((AppLovinCommunicatorSubscriber) this, C8056c.f19524a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00af  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.os.Bundle m25537b(com.applovin.impl.mediation.p234a.C8070a r4) {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r4.mo56071f()
            java.lang.String r2 = "id"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.mo56152S()
            java.lang.String r2 = "network_name"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.getAdUnitId()
            java.lang.String r2 = "max_ad_unit_id"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.mo56096p()
            java.lang.String r2 = "third_party_ad_placement_id"
            r0.putString(r2, r1)
            com.applovin.mediation.MaxAdFormat r1 = r4.getFormat()
            java.lang.String r1 = r1.getLabel()
            java.lang.String r2 = "ad_format"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.getCreativeId()
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r4.getCreativeId()
            java.lang.String r2 = "creative_id"
            r0.putString(r2, r1)
        L_0x0049:
            java.lang.String r1 = r4.getDspName()
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = r4.getDspName()
            java.lang.String r2 = "dsp_name"
            r0.putString(r2, r1)
        L_0x005c:
            com.applovin.mediation.MaxAdFormat r1 = r4.mo56093m()
            if (r1 == 0) goto L_0x007d
            com.applovin.mediation.MaxAdFormat r1 = r4.mo56093m()
            java.lang.String r1 = r1.getLabel()
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r1 == 0) goto L_0x007d
            com.applovin.mediation.MaxAdFormat r1 = r4.mo56093m()
            java.lang.String r1 = r1.getLabel()
            java.lang.String r2 = "hybrid_ad_format"
            r0.putString(r2, r1)
        L_0x007d:
            boolean r1 = r4.mo56092l()
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = r4.getNetworkName()
            java.lang.String r2 = "custom_js_network_name"
        L_0x0089:
            r0.putString(r2, r1)
            goto L_0x00a0
        L_0x008d:
            java.lang.String r1 = r4.mo56152S()
            java.lang.String r2 = "CUSTOM_NETWORK_SDK"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00a0
            java.lang.String r1 = r4.getNetworkName()
            java.lang.String r2 = "custom_sdk_network_name"
            goto L_0x0089
        L_0x00a0:
            org.json.JSONObject r1 = r4.mo56066b()
            android.os.Bundle r1 = com.applovin.impl.sdk.utils.JsonUtils.toBundle((org.json.JSONObject) r1)
            r0.putAll(r1)
            boolean r1 = r4 instanceof com.applovin.impl.mediation.p234a.C8071b
            if (r1 == 0) goto L_0x00e3
            com.applovin.impl.mediation.a.b r4 = (com.applovin.impl.mediation.p234a.C8071b) r4
            android.view.View r4 = r4.mo56095o()
            if (r4 == 0) goto L_0x00dc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r2 = 64
            r1.append(r2)
            int r4 = r4.hashCode()
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            goto L_0x00de
        L_0x00dc:
            java.lang.String r4 = "N/A"
        L_0x00de:
            java.lang.String r1 = "ad_view"
            r0.putString(r1, r4)
        L_0x00e3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C8474j.m25537b(com.applovin.impl.mediation.a.a):android.os.Bundle");
    }

    /* renamed from: a */
    public void mo57286a() {
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue()) {
            mo57287a(new Bundle(), "privacy_setting_updated");
        }
    }

    /* renamed from: a */
    public void mo57287a(Bundle bundle, String str) {
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue() && !this.f21284a.mo57388e()) {
            this.f21285b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this));
        }
    }

    /* renamed from: a */
    public void mo57288a(C8070a aVar) {
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue() && this.f21285b.hasSubscriber("max_revenue_events")) {
            Bundle b = m25537b(aVar);
            b.putAll(JsonUtils.toBundle(aVar.mo56068c()));
            b.putString("country_code", this.f21284a.mo57403t().getCountryCode());
            BundleUtils.putStringIfValid("user_segment", this.f21284a.mo57401r().getName(), b);
            mo57287a(b, "max_revenue_events");
        }
    }

    /* renamed from: a */
    public void mo57289a(C8070a aVar, String str) {
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue() && this.f21285b.hasSubscriber("max_ad_events")) {
            Bundle b = m25537b(aVar);
            b.putString("type", str);
            this.f21284a.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D = this.f21284a.mo57320D();
                D.mo57818b("CommunicatorService", "Sending \"max_ad_events\" message: " + b);
            }
            mo57287a(b, "max_ad_events");
        }
    }

    /* renamed from: a */
    public void mo57290a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            mo57287a(bundle, "adapter_initialization_status");
        }
    }

    /* renamed from: a */
    public void mo57291a(String str) {
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                mo57287a(Bundle.EMPTY, "live_network_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("live_network", str);
            mo57287a(bundle, "live_network_updated");
        }
    }

    /* renamed from: a */
    public void mo57292a(String str, String str2) {
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            mo57287a(bundle, "network_sdk_version_updated");
        }
    }

    /* renamed from: a */
    public void mo57293a(String str, String str2, int i, Object obj, String str3, boolean z) {
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z);
            BundleUtils.putString("error_message", str3, bundle);
            mo57287a(bundle, "receive_http_response");
        }
    }

    /* renamed from: a */
    public void mo57294a(String str, String str2, String str3) {
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue()) {
            String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", maybeConvertToIndentedString);
            bundle.putString("response", maybeConvertToIndentedString2);
            mo57287a(bundle, "responses");
        }
    }

    /* renamed from: a */
    public void mo57295a(JSONObject jSONObject, boolean z) {
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21284a.mo57319C());
            bundle.putString("applovin_random_token", this.f21284a.mo57399p());
            bundle.putString("compass_random_token", this.f21284a.mo57398o());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(this.f21284a.mo57332P()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(C8134c.m24356a(this.f21284a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f21284a.mo57397n());
            bundle2.putBundle(C8894b.f22527hW, JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "safedk_settings")));
            this.f21284a.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D = this.f21284a.mo57320D();
                D.mo57818b("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            mo57287a(bundle2, "safedk_init");
        }
    }

    /* renamed from: b */
    public void mo57296b(C8070a aVar, String str) {
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue() && this.f21285b.hasSubscriber("ad_callback_blocked_after_hidden")) {
            Bundle b = m25537b(aVar);
            b.putString("callback_name", str);
            mo57287a(b, "ad_callback_blocked_after_hidden");
        }
    }

    /* renamed from: b */
    public void mo57297b(String str) {
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                mo57287a(Bundle.EMPTY, "test_mode_network_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("test_mode_network", str);
            mo57287a(bundle, "test_mode_network_updated");
        }
    }

    /* renamed from: c */
    public boolean mo57298c(String str) {
        return C8056c.f19524a.contains(str);
    }

    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        int i;
        Map<String, Object> map;
        if (((Boolean) this.f21284a.mo57342a(C8380b.f20980fu)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21284a.mo57319C());
                }
                this.f21284a.mo57339X().mo57568a(new C8533h.C8535a().mo57602c(messageData.getString("url")).mo57605d(messageData.getString("backup_url")).mo57596a(stringMap).mo57603c(map2).mo57600b(stringMap2).mo57597a(((Boolean) this.f21284a.mo57342a(C8380b.f20908eA)).booleanValue()).mo57595a(string).mo57598a());
            } else if ("send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
                String string2 = messageData2.getString("http_method", "POST");
                long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f21284a.mo57342a(C8380b.f20896do)).longValue();
                int i2 = messageData2.getInt("retry_count", ((Integer) this.f21284a.mo57342a(C8380b.f20897dp)).intValue());
                long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f21284a.mo57342a(C8380b.f20898dq)).longValue();
                Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
                long j = millis2;
                if ("GET".equalsIgnoreCase(string2)) {
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f21284a.mo57340Y().mo57625a((Map<String, String>) null, false, false))));
                    }
                    i = i2;
                    map = null;
                } else {
                    map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        Map<String, Object> h = this.f21284a.mo57340Y().mo57633h();
                        Map<String, Object> d = this.f21284a.mo57340Y().mo57629d();
                        if (!d.containsKey("idfv") || !d.containsKey("idfv_scope")) {
                            i = i2;
                        } else {
                            i = i2;
                            int intValue = ((Integer) d.get("idfv_scope")).intValue();
                            d.remove("idfv");
                            d.remove("idfv_scope");
                            h.put("idfv", (String) d.get("idfv"));
                            h.put("idfv_scope", Integer.valueOf(intValue));
                        }
                        h.put("server_installed_at", this.f21284a.mo57342a(C8380b.f20733ai));
                        h.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21284a.mo57319C());
                        map.put("app", h);
                        map.put("device", d);
                    } else {
                        i = i2;
                    }
                }
                this.f21284a.mo57337V().mo57228a((C8401a) new C8509a(appLovinCommunicatorMessage.getPublisherId(), C8516c.m25763a(this.f21284a).mo57528a(messageData2.getString("url")).mo57538c(messageData2.getString("backup_url")).mo57529a(stringMap3).mo57534b(string2).mo57535b(BundleUtils.toStringMap(messageData2.getBundle("headers"))).mo57530a(map != null ? new JSONObject(map) : null).mo57533b((int) millis).mo57526a(i).mo57537c((int) j).mo57527a(new JSONObject()).mo57539c(messageData2.getBoolean("is_encoding_enabled", false)).mo57532a(), this.f21284a), C8432o.C8434a.MAIN);
            } else if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f21284a.mo57406v().addCustomQueryParams(Utils.stringifyObjectMap(BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
            } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f21284a.mo57406v().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            } else if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f21284a.mo57324H().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            }
        }
    }
}
