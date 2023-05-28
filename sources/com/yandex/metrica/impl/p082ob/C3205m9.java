package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.m9 */
public class C3205m9 extends C3023h9<C1956Df> {
    public Object defaultValue() {
        return new C1956Df();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (C1956Df) MessageNano.mergeFrom(new C1956Df(), bArr);
    }
}
