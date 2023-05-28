package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.k9 */
public class C3121k9 extends C3023h9<C1894Bf> {
    public Object defaultValue() {
        return new C1894Bf();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (C1894Bf) MessageNano.mergeFrom(new C1894Bf(), bArr);
    }
}
