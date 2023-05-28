package com.criteo.publisher.p074n0;

import com.criteo.publisher.model.C1268o;
import com.criteo.publisher.model.C1270q;
import com.criteo.publisher.model.C1281v;
import com.criteo.publisher.model.C1282w;
import com.criteo.publisher.model.C1284y;
import com.criteo.publisher.model.C1285z;
import com.criteo.publisher.model.p073b0.C1242m;
import com.criteo.publisher.model.p073b0.C1243n;
import com.criteo.publisher.model.p073b0.C1245o;
import com.criteo.publisher.model.p073b0.C1246p;
import com.criteo.publisher.model.p073b0.C1247q;
import com.criteo.publisher.model.p073b0.C1248r;
import com.criteo.publisher.p064f0.C1112n;
import com.criteo.publisher.p064f0.C1121t;
import com.criteo.publisher.p070l0.p071d.C1177c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* renamed from: com.criteo.publisher.n0.f */
/* compiled from: AutoValueGson_CustomAdapterFactory */
final class C1299f extends C1306j {
    C1299f() {
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (C1268o.class.isAssignableFrom(rawType)) {
            return C1268o.m5610a(gson);
        }
        if (C1270q.class.isAssignableFrom(rawType)) {
            return C1270q.m5625a(gson);
        }
        if (C1177c.class.isAssignableFrom(rawType)) {
            return C1177c.m5358a(gson);
        }
        if (C1112n.class.isAssignableFrom(rawType)) {
            return C1112n.m5143a(gson);
        }
        if (C1121t.class.isAssignableFrom(rawType)) {
            return C1121t.m5184a(gson);
        }
        if (C1121t.C1122a.class.isAssignableFrom(rawType)) {
            return C1121t.C1122a.m5189a(gson);
        }
        if (C1121t.C1123b.class.isAssignableFrom(rawType)) {
            return C1121t.C1123b.m5198a(gson);
        }
        if (C1242m.class.isAssignableFrom(rawType)) {
            return C1242m.m5519a(gson);
        }
        if (C1243n.class.isAssignableFrom(rawType)) {
            return C1243n.m5525a(gson);
        }
        if (C1245o.class.isAssignableFrom(rawType)) {
            return C1245o.m5547a(gson);
        }
        if (C1246p.class.isAssignableFrom(rawType)) {
            return C1246p.m5549a(gson);
        }
        if (C1247q.class.isAssignableFrom(rawType)) {
            return C1247q.m5551a(gson);
        }
        if (C1248r.class.isAssignableFrom(rawType)) {
            return C1248r.m5555a(gson);
        }
        if (C1281v.class.isAssignableFrom(rawType)) {
            return C1281v.m5684a(gson);
        }
        if (C1282w.class.isAssignableFrom(rawType)) {
            return C1282w.m5689a(gson);
        }
        if (C1284y.class.isAssignableFrom(rawType)) {
            return C1284y.m5699a(gson);
        }
        if (C1285z.class.isAssignableFrom(rawType)) {
            return C1285z.m5711a(gson);
        }
        return null;
    }
}
