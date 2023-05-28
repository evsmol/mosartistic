package com.yandex.metrica.impl.p082ob;

import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.v9 */
public class C3576v9 {

    /* renamed from: a */
    private final C3577a f9309a;

    /* renamed from: b */
    private final C2466Ql f9310b;

    /* renamed from: com.yandex.metrica.impl.ob.v9$a */
    public static class C3577a {
    }

    public C3576v9() {
        this(new C3577a(), new C2466Ql());
    }

    /* renamed from: a */
    public byte[] mo18325a(byte[] bArr, String str) {
        try {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C3577a aVar = this.f9309a;
            byte[] bytes = str.getBytes();
            aVar.getClass();
            C3636wm wmVar = new C3636wm("AES/CBC/PKCS5Padding", bytes, copyOfRange);
            if (C1848A2.m6811a(bArr)) {
                return null;
            }
            return this.f9310b.uncompress(wmVar.mo18385a(bArr, 16, bArr.length - 16));
        } catch (Throwable unused) {
            return null;
        }
    }

    public C3576v9(C3577a aVar, C2466Ql ql) {
        this.f9309a = aVar;
        this.f9310b = ql;
    }
}
