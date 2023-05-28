package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.p082ob.C3733zf;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.yandex.metrica.impl.ob.D9 */
public final class C1950D9 implements Converter<Map<String, ? extends byte[]>, byte[]> {
    /* renamed from: a */
    public byte[] fromModel(Map<String, byte[]> map) {
        C3733zf zfVar = new C3733zf();
        int size = map.size();
        C3733zf.C3734a[] aVarArr = new C3733zf.C3734a[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            aVarArr[i2] = new C3733zf.C3734a();
        }
        zfVar.f9585a = aVarArr;
        for (T next : map.entrySet()) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) next;
            zfVar.f9585a[i].f9587a = (String) entry.getKey();
            zfVar.f9585a[i].f9588b = (byte[]) entry.getValue();
            i = i3;
        }
        byte[] byteArray = MessageNano.toByteArray(zfVar);
        Intrinsics.checkNotNullExpressionValue(byteArray, "MessageNano.toByteArray(proto)");
        return byteArray;
    }

    /* renamed from: a */
    public Map<String, byte[]> toModel(byte[] bArr) {
        C3733zf.C3734a[] aVarArr = ((C3733zf) MessageNano.mergeFrom(new C3733zf(), bArr)).f9585a;
        Intrinsics.checkNotNullExpressionValue(aVarArr, "EventExtrasProto.EventEx…s.parseFrom(input).extras");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(aVarArr.length), 16));
        for (C3733zf.C3734a aVar : aVarArr) {
            Pair pair = TuplesKt.m14544to(aVar.f9587a, aVar.f9588b);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
