package com.onesignal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSInAppMessageAction {
    private String clickId;
    private String clickName;
    private String clickUrl;
    private boolean closesMessage;
    private boolean firstClick;
    private List<OSInAppMessageOutcome> outcomes = new ArrayList();
    private String pageId;
    private List<OSInAppMessagePrompt> prompts = new ArrayList();
    private OSInAppMessageTag tags;
    private OSInAppMessageActionUrlType urlTarget;

    OSInAppMessageAction(JSONObject jSONObject) throws JSONException {
        this.clickId = jSONObject.optString("id", (String) null);
        this.clickName = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) null);
        this.clickUrl = jSONObject.optString("url", (String) null);
        this.pageId = jSONObject.optString("pageId", (String) null);
        OSInAppMessageActionUrlType fromString = OSInAppMessageActionUrlType.fromString(jSONObject.optString("url_target", (String) null));
        this.urlTarget = fromString;
        if (fromString == null) {
            this.urlTarget = OSInAppMessageActionUrlType.IN_APP_WEBVIEW;
        }
        this.closesMessage = jSONObject.optBoolean("close", true);
        if (jSONObject.has("outcomes")) {
            parseOutcomes(jSONObject);
        }
        if (jSONObject.has("tags")) {
            this.tags = new OSInAppMessageTag(jSONObject.getJSONObject("tags"));
        }
        if (jSONObject.has("prompts")) {
            parsePrompts(jSONObject);
        }
    }

    private void parseOutcomes(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("outcomes");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.outcomes.add(new OSInAppMessageOutcome((JSONObject) jSONArray.get(i)));
        }
    }

    private void parsePrompts(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("prompts");
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != 3452698) {
                if (hashCode == 1901043637 && string.equals("location")) {
                    c = 1;
                }
            } else if (string.equals("push")) {
                c = 0;
            }
            if (c == 0) {
                this.prompts.add(new OSInAppMessagePushPrompt());
            } else if (c == 1) {
                this.prompts.add(new OSInAppMessageLocationPrompt());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String getClickId() {
        return this.clickId;
    }

    public OSInAppMessageActionUrlType getUrlTarget() {
        return this.urlTarget;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public List<OSInAppMessageOutcome> getOutcomes() {
        return this.outcomes;
    }

    public List<OSInAppMessagePrompt> getPrompts() {
        return this.prompts;
    }

    public OSInAppMessageTag getTags() {
        return this.tags;
    }

    public boolean isFirstClick() {
        return this.firstClick;
    }

    /* access modifiers changed from: package-private */
    public void setFirstClick(boolean z) {
        this.firstClick = z;
    }

    public enum OSInAppMessageActionUrlType {
        IN_APP_WEBVIEW("webview"),
        BROWSER("browser"),
        REPLACE_CONTENT("replacement");
        
        private String text;

        private OSInAppMessageActionUrlType(String str) {
            this.text = str;
        }

        public String toString() {
            return this.text;
        }

        public static OSInAppMessageActionUrlType fromString(String str) {
            for (OSInAppMessageActionUrlType oSInAppMessageActionUrlType : values()) {
                if (oSInAppMessageActionUrlType.text.equalsIgnoreCase(str)) {
                    return oSInAppMessageActionUrlType;
                }
            }
            return null;
        }
    }
}
