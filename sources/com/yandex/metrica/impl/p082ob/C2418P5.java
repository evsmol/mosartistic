package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.P5 */
public class C2418P5 extends C3023h9<C1865Af> {
    public Object defaultValue() {
        return new C1865Af();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (C1865Af) MessageNano.mergeFrom(new C1865Af(), bArr);
    }
}
