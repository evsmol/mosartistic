package com.bytedance.sdk.component.adexpress.dynamic.p303b;

import android.text.TextUtils;
import com.appnext.base.p264b.C8849c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.e */
/* compiled from: DynamicLayoutBrick */
public class C10348e {

    /* renamed from: a */
    public static final Map<String, Integer> f25592a;

    /* renamed from: b */
    private String f25593b;

    /* renamed from: c */
    private String f25594c;

    /* renamed from: d */
    private C10349f f25595d;

    /* renamed from: e */
    private C10349f f25596e;

    /* renamed from: f */
    private String f25597f;

    static {
        HashMap hashMap = new HashMap();
        f25592a = hashMap;
        hashMap.put("root", 8);
        f25592a.put("footer", 6);
        f25592a.put("empty", 6);
        f25592a.put("title", 0);
        f25592a.put("subtitle", 0);
        f25592a.put("source", 0);
        f25592a.put("score-count", 0);
        f25592a.put("text_star", 0);
        f25592a.put("text", 0);
        f25592a.put("tag-group", 17);
        f25592a.put("app-version", 0);
        f25592a.put("development-name", 0);
        f25592a.put("privacy-detail", 23);
        f25592a.put("image", 1);
        f25592a.put("image-wide", 1);
        f25592a.put("image-square", 1);
        f25592a.put("image-long", 1);
        f25592a.put("image-splash", 1);
        f25592a.put("image-cover", 1);
        f25592a.put("app-icon", 1);
        f25592a.put("icon-download", 1);
        f25592a.put("logoad", 4);
        f25592a.put("logounion", 5);
        f25592a.put("logo-union", 9);
        f25592a.put("dislike", 3);
        f25592a.put("close", 3);
        f25592a.put("close-fill", 3);
        f25592a.put("webview-close", 22);
        f25592a.put("feedback-dislike", 12);
        f25592a.put("button", 2);
        f25592a.put("downloadWithIcon", 2);
        f25592a.put("downloadButton", 2);
        f25592a.put("fillButton", 2);
        f25592a.put("laceButton", 2);
        f25592a.put("cardButton", 2);
        f25592a.put("colourMixtureButton", 2);
        f25592a.put("arrowButton", 1);
        f25592a.put("download-progress-button", 2);
        f25592a.put("vessel", 6);
        f25592a.put("image-group", 6);
        f25592a.put("custom-component-vessel", 6);
        f25592a.put("carousel", 24);
        f25592a.put("video-hd", 7);
        f25592a.put("video", 7);
        f25592a.put("video-vd", 7);
        f25592a.put("muted", 10);
        f25592a.put("star", 11);
        f25592a.put("skip-countdowns", 19);
        f25592a.put("skip-with-countdowns-skip-btn", 21);
        f25592a.put("skip-with-countdowns-video-countdown", 13);
        f25592a.put("skip-with-countdowns-skip-countdown", 20);
        f25592a.put("skip-with-time", 14);
        f25592a.put("skip-with-time-countdown", 13);
        f25592a.put("skip-with-time-skip-btn", 15);
        f25592a.put("skip", 15);
        f25592a.put("timedown", 13);
        f25592a.put("icon", 16);
        f25592a.put("scoreCountWithIcon", 6);
        f25592a.put("split-line", 18);
        f25592a.put("creative-playable-bait", 0);
        f25592a.put("score-count-type-2", 0);
    }

    /* renamed from: a */
    public int mo63354a() {
        if (TextUtils.isEmpty(this.f25593b)) {
            return 0;
        }
        if (this.f25593b.equals("logo")) {
            String str = this.f25593b + this.f25594c;
            this.f25593b = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.f25593b.contains("logounion")) {
                return 5;
            }
        }
        if (f25592a.get(this.f25593b) != null) {
            return f25592a.get(this.f25593b).intValue();
        }
        return -1;
    }

    /* renamed from: b */
    public String mo63357b() {
        return this.f25593b;
    }

    /* renamed from: a */
    public void mo63356a(String str) {
        this.f25593b = str;
    }

    /* renamed from: c */
    public String mo63360c() {
        return this.f25594c;
    }

    /* renamed from: b */
    public void mo63359b(String str) {
        this.f25594c = str;
    }

    /* renamed from: c */
    public void mo63361c(String str) {
        this.f25597f = str;
    }

    /* renamed from: d */
    public String mo63362d() {
        return this.f25597f;
    }

    /* renamed from: e */
    public C10349f mo63363e() {
        return this.f25595d;
    }

    /* renamed from: a */
    public void mo63355a(C10349f fVar) {
        this.f25595d = fVar;
    }

    /* renamed from: b */
    public void mo63358b(C10349f fVar) {
        this.f25596e = fVar;
    }

    /* renamed from: f */
    public C10349f mo63364f() {
        return this.f25596e;
    }

    public String toString() {
        return "DynamicLayoutBrick{type='" + this.f25593b + '\'' + ", data='" + this.f25594c + '\'' + ", value=" + this.f25595d + ", themeValue=" + this.f25596e + ", dataExtraInfo='" + this.f25597f + '\'' + '}';
    }

    /* renamed from: a */
    public static void m29890a(JSONObject jSONObject, C10348e eVar) {
        if (jSONObject != null && eVar != null) {
            eVar.mo63356a(jSONObject.optString("type", "root"));
            eVar.mo63359b(jSONObject.optString(C8849c.DATA));
            eVar.mo63361c(jSONObject.optString("dataExtraInfo"));
            C10349f c = C10349f.m29903c(jSONObject.optJSONObject("values"));
            C10349f c2 = C10349f.m29903c(jSONObject.optJSONObject("nightThemeValues"));
            eVar.mo63355a(c);
            eVar.mo63358b(c2);
        }
    }
}
