package com.bytedance.sdk.component.p293a;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.h */
/* compiled from: DataConverterActual */
class C10230h {

    /* renamed from: a */
    private C10237l f25264a;

    /* renamed from: a */
    static C10230h m29371a(C10237l lVar) {
        return new C10230h(lVar);
    }

    private C10230h(C10237l lVar) {
        this.f25264a = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> T mo63040a(String str, Type type) throws JSONException {
        m29372a(str);
        if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
            return new JSONObject(str);
        }
        return this.f25264a.mo2401a(str, type);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> String mo63041a(T t) {
        String str;
        if (t == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            str = t.toString();
        } else {
            str = this.f25264a.mo2402a(t);
        }
        m29372a(str);
        return str;
    }

    /* renamed from: a */
    private static void m29372a(String str) {
        if (!str.startsWith("{") || !str.endsWith("}")) {
            C10231i.m29375a((RuntimeException) new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n " + str));
        }
    }
}
