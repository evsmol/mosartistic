package com.appodeal.ads.modules.common.internal.ext;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\n"}, mo38199d2 = {"Lcom/appodeal/ads/modules/common/internal/ext/JsonArrayBuilder;", "", "", "value", "", "putValues", "Lorg/json/JSONArray;", "build", "<init>", "()V", "apd_internal"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class JsonArrayBuilder {

    /* renamed from: a */
    public final JSONArray f23354a = new JSONArray();

    public final JSONArray build() {
        return this.f23354a;
    }

    public final void putValues(List<? extends Object> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f23354a.put(it.next());
            }
        }
    }
}
