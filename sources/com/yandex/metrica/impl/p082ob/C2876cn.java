package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.cn */
public class C2876cn extends C2538Sm<String> {
    public C2876cn(int i, String str) {
        this(i, str, C2642Ul.m8745a());
    }

    public C2876cn(int i, String str, C2875cm cmVar) {
        super(i, str, cmVar);
    }

    /* renamed from: a */
    public String mo16729a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (bytes.length <= super.mo16652b()) {
                return str;
            }
            String str2 = new String(bytes, 0, super.mo16652b(), "UTF-8");
            try {
                if (this.f6743c.isEnabled()) {
                    C2875cm cmVar = this.f6743c;
                    cmVar.mo15270fw("\"%s\" %s exceeded limit of %d bytes", super.mo16651a(), str, Integer.valueOf(super.mo16652b()));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
