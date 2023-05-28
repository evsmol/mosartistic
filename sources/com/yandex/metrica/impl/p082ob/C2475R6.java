package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.yandex.metrica.impl.ob.R6 */
public final class C2475R6 implements Converter<Map<String, ? extends String>, C2966ff[]> {
    /* renamed from: a */
    public C2966ff[] fromModel(Map<String, String> map) {
        int size = map.size();
        C2966ff[] ffVarArr = new C2966ff[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ffVarArr[i2] = new C2966ff();
        }
        for (Map.Entry next : map.entrySet()) {
            C2966ff ffVar = ffVarArr[i];
            String str = (String) next.getKey();
            Charset charset = Charsets.UTF_8;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                ffVar.f7861a = bytes;
                C2966ff ffVar2 = ffVarArr[i];
                String str2 = (String) next.getValue();
                Charset charset2 = Charsets.UTF_8;
                if (str2 != null) {
                    byte[] bytes2 = str2.getBytes(charset2);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                    ffVar2.f7862b = bytes2;
                    i++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return ffVarArr;
    }

    public Object toModel(Object obj) {
        C2966ff[] ffVarArr = (C2966ff[]) obj;
        throw new UnsupportedOperationException();
    }
}
