package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.i6 */
public final class C3051i6 extends C3023h9<C2061Gf> {
    public Object defaultValue() {
        return new C2061Gf();
    }

    public Object toState(byte[] bArr) {
        C2061Gf gf = (C2061Gf) MessageNano.mergeFrom(new C2061Gf(), bArr);
        Intrinsics.checkNotNullExpressionValue(gf, "SessionExtrasProtobuf.Se…ionExtras.parseFrom(data)");
        return gf;
    }
}
