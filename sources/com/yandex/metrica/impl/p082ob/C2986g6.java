package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;

/* renamed from: com.yandex.metrica.impl.ob.g6 */
public final class C2986g6 implements ProtobufConverter<Map<String, ? extends byte[]>, C2061Gf> {
    /* renamed from: a */
    public C2061Gf fromModel(Map<String, byte[]> map) {
        C2061Gf gf = new C2061Gf();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            C2094Hf hf = new C2094Hf();
            String str = (String) next.getKey();
            Charset charset = Charsets.UTF_8;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                hf.f5533a = bytes;
                hf.f5534b = (byte[]) next.getValue();
                arrayList.add(hf);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        Object[] array = arrayList.toArray(new C2094Hf[0]);
        if (array != null) {
            gf.f5457a = (C2094Hf[]) array;
            return gf;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public Map<String, byte[]> toModel(C2061Gf gf) {
        C2094Hf[] hfArr = gf.f5457a;
        Intrinsics.checkNotNullExpressionValue(hfArr, "input.extras");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(hfArr.length), 16));
        for (C2094Hf hf : hfArr) {
            byte[] bArr = hf.f5533a;
            Intrinsics.checkNotNullExpressionValue(bArr, "it.key");
            Pair pair = TuplesKt.m14544to(new String(bArr, Charsets.UTF_8), hf.f5534b);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
