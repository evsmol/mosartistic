package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.core.api.ProtobufConverter;

/* renamed from: com.yandex.metrica.impl.ob.O6 */
public class C2367O6<T> {

    /* renamed from: a */
    private final ProtobufConverter<T, ? extends MessageNano> f6300a;

    C2367O6(ProtobufConverter<T, ? extends MessageNano> protobufConverter) {
        this.f6300a = protobufConverter;
    }

    /* renamed from: a */
    public byte[] mo16381a(T t) {
        return MessageNano.toByteArray((MessageNano) this.f6300a.fromModel(t));
    }
}
