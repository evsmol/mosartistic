package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.a7 */
public class C2795a7 implements C3240mm<File>, C3293nm<File, C2762Z6> {
    /* renamed from: a */
    public Object mo15448a(Object obj) {
        String a = C2254L0.m7686a((File) obj);
        if (!TextUtils.isEmpty(a)) {
            try {
                return new C2762Z6(a);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo15447b(Object obj) {
        try {
            ((File) obj).delete();
        } catch (Throwable unused) {
        }
    }
}
