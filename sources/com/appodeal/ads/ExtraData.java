package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\n¨\u0006\f"}, mo38199d2 = {"Lcom/appodeal/ads/ExtraData;", "", "", "key", "value", "", "putExtra", "clear", "", "isNotEmpty", "Lorg/json/JSONObject;", "asJson", "apd_core"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class ExtraData {
    public static final ExtraData INSTANCE = new ExtraData();

    /* renamed from: a */
    public static final LinkedHashMap f22729a = new LinkedHashMap();

    /* renamed from: com.appodeal.ads.ExtraData$a */
    public static final class C8987a extends Lambda implements Function1<JsonObjectBuilder, Unit> {

        /* renamed from: a */
        public static final C8987a f22730a = new C8987a();

        public C8987a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
            Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
            for (Map.Entry entry : ExtraData.f22729a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    jsonObjectBuilder.hasObject(str, (JSONObject) value);
                } else if (value instanceof JSONArray) {
                    jsonObjectBuilder.hasArray(str, (JSONArray) value);
                } else {
                    jsonObjectBuilder.hasValue(str, value);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final JSONObject asJson() {
        return JsonObjectBuilderKt.jsonObject(C8987a.f22730a);
    }

    public final void clear() {
        f22729a.clear();
    }

    public final boolean isNotEmpty() {
        return !f22729a.isEmpty();
    }

    public final void putExtra(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "key");
        f22729a.put(str, obj);
    }
}
