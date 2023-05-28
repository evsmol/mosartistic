package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3398qf;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.yandex.metrica.impl.ob.te */
public final class C3508te {

    /* renamed from: a */
    private final C1950D9 f9152a = new C1950D9();

    /* renamed from: a */
    public C3398qf.C3403d.C3404a.C3406b[] mo18233a(byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return new C3398qf.C3403d.C3404a.C3406b[0];
        }
        Map<String, byte[]> a = this.f9152a.toModel(bArr);
        int size = a.size();
        C3398qf.C3403d.C3404a.C3406b[] bVarArr = new C3398qf.C3403d.C3404a.C3406b[size];
        for (int i2 = 0; i2 < size; i2++) {
            bVarArr[i2] = new C3398qf.C3403d.C3404a.C3406b();
        }
        for (Object next : ((LinkedHashMap) a).entrySet()) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) next;
            C3398qf.C3403d.C3404a.C3406b bVar = bVarArr[i];
            String str = (String) entry.getKey();
            Charset charset = Charsets.UTF_8;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                bVar.f8831a = bytes;
                bVar.f8832b = (byte[]) entry.getValue();
                i = i3;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return bVarArr;
    }
}
