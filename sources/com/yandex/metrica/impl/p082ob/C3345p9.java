package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.impl.p082ob.C2121If;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.p9 */
public class C3345p9 extends C3023h9<C2121If> {
    public Object defaultValue() {
        C2121If ifR = new C2121If();
        ifR.f5591k = new C2121If.C2132i();
        return ifR;
    }

    public Object toState(byte[] bArr) throws IOException {
        return (C2121If) MessageNano.mergeFrom(new C2121If(), bArr);
    }
}
