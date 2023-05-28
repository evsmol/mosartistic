package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.core.api.ProtobufStateSerializer;

/* renamed from: com.yandex.metrica.impl.ob.h9 */
public abstract class C3023h9<T extends MessageNano> implements ProtobufStateSerializer<T> {
    public byte[] toByteArray(Object obj) {
        return MessageNano.toByteArray((MessageNano) obj);
    }
}
