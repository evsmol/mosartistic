package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* renamed from: com.yandex.metrica.impl.ob.h6 */
public final class C3020h6 {

    /* renamed from: a */
    private final C3082j6 f7950a;

    /* renamed from: b */
    private final Map<String, byte[]> f7951b;

    public C3020h6(Context context, C2108I3 i3) {
        String a = i3.mo15878a();
        if (a != null) {
            C1848A2.m6797a(a);
        }
        C3082j6 j6Var = new C3082j6(context, i3);
        this.f7950a = j6Var;
        this.f7951b = MapsKt.toMutableMap(j6Var.mo17732a());
    }

    /* renamed from: a */
    public final Map<String, byte[]> mo17653a() {
        return new HashMap(this.f7951b);
    }

    /* renamed from: a */
    public final void mo17654a(String str, byte[] bArr) {
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                byte[] put = this.f7951b.put(str, bArr);
                this.f7950a.mo17733a(this.f7951b);
            }
        }
        byte[] remove = this.f7951b.remove(str);
        this.f7950a.mo17733a(this.f7951b);
    }
}
