package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.google.protobuf.nano.p091ym.MessageNano;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.j6 */
public final class C3082j6 {

    /* renamed from: a */
    private final String f8105a = "session_extras";

    /* renamed from: b */
    private final C2986g6 f8106b = new C2986g6();

    /* renamed from: c */
    private final C3051i6 f8107c = new C3051i6();

    /* renamed from: d */
    private final C2476R7 f8108d;

    public C3082j6(Context context, C2108I3 i3) {
        i3.mo15878a();
        C2476R7 a = C3093ja.m9805a(context).mo17737a(i3);
        Intrinsics.checkNotNullExpressionValue(a, "DatabaseStorageFactory.g…Id\") !no-logs*/\n        }");
        this.f8108d = a;
    }

    /* renamed from: a */
    public final Map<String, byte[]> mo17732a() {
        try {
            byte[] a = this.f8108d.mo16553a(this.f8105a);
            if (a != null) {
                if (!(a.length == 0)) {
                    C2986g6 g6Var = this.f8106b;
                    this.f8107c.getClass();
                    C2061Gf gf = (C2061Gf) MessageNano.mergeFrom(new C2061Gf(), a);
                    Intrinsics.checkNotNullExpressionValue(gf, "SessionExtrasProtobuf.Se…ionExtras.parseFrom(data)");
                    return g6Var.toModel(gf);
                }
            }
        } catch (Throwable unused) {
        }
        C2986g6 g6Var2 = this.f8106b;
        this.f8107c.getClass();
        return g6Var2.toModel(new C2061Gf());
    }

    /* renamed from: a */
    public final void mo17733a(Map<String, byte[]> map) {
        C2476R7 r7 = this.f8108d;
        String str = this.f8105a;
        C3051i6 i6Var = this.f8107c;
        C2061Gf a = this.f8106b.fromModel(map);
        i6Var.getClass();
        r7.mo16552a(str, MessageNano.toByteArray(a));
    }
}
