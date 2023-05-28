package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import java.io.IOException;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.n9 */
public class C3255n9 extends C3023h9<C1989Ef> {
    public Object defaultValue() {
        return new C1989Ef();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (C1989Ef) MessageNano.mergeFrom(new C1989Ef(), bArr);
    }
}
