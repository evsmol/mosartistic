package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.MessageNano;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.i9 */
public final class C3054i9 extends C3023h9<C3699yf> {
    public Object defaultValue() {
        return new C3699yf();
    }

    public Object toState(byte[] bArr) {
        C3699yf yfVar = (C3699yf) MessageNano.mergeFrom(new C3699yf(), bArr);
        Intrinsics.checkNotNullExpressionValue(yfVar, "ClidsInfoProto.ClidsInfo.parseFrom(data)");
        return yfVar;
    }
}
