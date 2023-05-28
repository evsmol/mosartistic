package com.ironsource.mediationsdk.p126a;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.c */
public class C4532c {

    /* renamed from: a */
    private int f11121a = -1;

    /* renamed from: b */
    private long f11122b = -1;

    /* renamed from: c */
    private JSONObject f11123c;

    public C4532c(int i, long j, JSONObject jSONObject) {
        this.f11121a = i;
        this.f11122b = j;
        this.f11123c = jSONObject;
    }

    public C4532c(int i, JSONObject jSONObject) {
        this.f11121a = i;
        this.f11122b = System.currentTimeMillis();
        if (jSONObject == null) {
            this.f11123c = new JSONObject();
        } else {
            this.f11123c = jSONObject;
        }
    }

    /* renamed from: a */
    static C4524a m13166a(String str, int i) {
        if ("ironbeast".equals(str)) {
            return new C4534e(i);
        }
        if ("outcome".equals(str)) {
            return new C4535f(i);
        }
        if (i == 2) {
            return new C4534e(i);
        }
        if (i == 3) {
            return new C4535f(i);
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        logger.log(ironSourceTag, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }

    /* renamed from: a */
    public int mo33668a() {
        return this.f11121a;
    }

    /* renamed from: a */
    public void mo33669a(int i) {
        this.f11121a = i;
    }

    /* renamed from: a */
    public void mo33670a(String str, Object obj) {
        try {
            this.f11123c.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public long mo33671b() {
        return this.f11122b;
    }

    /* renamed from: c */
    public String mo33672c() {
        return this.f11123c.toString();
    }

    /* renamed from: d */
    public JSONObject mo33673d() {
        return this.f11123c;
    }
}
