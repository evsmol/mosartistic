package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.g9 */
public class C2989g9 extends C3023h9<C3620wf> {
    public Object defaultValue() {
        return new C3620wf();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (C3620wf) MessageNano.mergeFrom(new C3620wf(), bArr);
    }
}
