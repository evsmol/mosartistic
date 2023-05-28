package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.impl.p082ob.C1924Cf;
import java.io.IOException;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.he */
public class C3030he extends C3023h9<C1924Cf.C1925a> {
    public Object defaultValue() {
        return new C1924Cf.C1925a();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (C1924Cf.C1925a) MessageNano.mergeFrom(new C1924Cf.C1925a(), bArr);
    }
}
