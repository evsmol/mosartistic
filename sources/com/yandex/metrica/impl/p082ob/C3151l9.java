package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.core.api.ProtobufStateSerializer;
import com.yandex.metrica.core.api.ProtobufStateStorage;

/* renamed from: com.yandex.metrica.impl.ob.l9 */
public class C3151l9<T, P extends MessageNano> implements ProtobufStateStorage<T> {

    /* renamed from: a */
    private final String f8226a;

    /* renamed from: b */
    private final C2476R7 f8227b;

    /* renamed from: c */
    private final ProtobufStateSerializer<P> f8228c;

    /* renamed from: d */
    private final ProtobufConverter<T, P> f8229d;

    public C3151l9(String str, C2476R7 r7, ProtobufStateSerializer<P> protobufStateSerializer, ProtobufConverter<T, P> protobufConverter) {
        this.f8226a = str;
        this.f8227b = r7;
        this.f8228c = protobufStateSerializer;
        this.f8229d = protobufConverter;
    }

    public void delete() {
        this.f8227b.mo16554b(this.f8226a);
    }

    public T read() {
        try {
            byte[] a = this.f8227b.mo16553a(this.f8226a);
            if (C1848A2.m6811a(a)) {
                return this.f8229d.toModel(this.f8228c.defaultValue());
            }
            return this.f8229d.toModel(this.f8228c.toState(a));
        } catch (Throwable unused) {
            return this.f8229d.toModel(this.f8228c.defaultValue());
        }
    }

    public void save(T t) {
        this.f8227b.mo16552a(this.f8226a, this.f8228c.toByteArray(this.f8229d.fromModel(t)));
    }
}
