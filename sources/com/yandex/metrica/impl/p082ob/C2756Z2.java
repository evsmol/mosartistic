package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Z2 */
public class C2756Z2 extends C3023h9<C3664xf> {
    public Object defaultValue() {
        return new C3664xf();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (C3664xf) MessageNano.mergeFrom(new C3664xf(), bArr);
    }
}
