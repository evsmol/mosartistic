package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Zd */
public class C2769Zd extends C3023h9<C1924Cf> {
    public Object defaultValue() {
        return new C1924Cf();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (C1924Cf) MessageNano.mergeFrom(new C1924Cf(), bArr);
    }
}
