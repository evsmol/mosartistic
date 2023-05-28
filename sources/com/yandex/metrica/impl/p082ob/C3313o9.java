package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.o9 */
public class C3313o9 extends C3023h9<C2025Ff> {
    public Object defaultValue() {
        return new C2025Ff();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (C2025Ff) MessageNano.mergeFrom(new C2025Ff(), bArr);
    }
}
