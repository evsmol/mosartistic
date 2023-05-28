package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestBodyEncryptionMode;

/* renamed from: com.yandex.metrica.impl.ob.zm */
public class C3743zm implements RequestBodyEncrypter {

    /* renamed from: a */
    private C3712ym f9605a;

    public C3743zm() {
        this(new C3712ym());
    }

    public byte[] encrypt(byte[] bArr) {
        return this.f9605a.mo18438a(bArr);
    }

    public RequestBodyEncryptionMode getEncryptionMode() {
        return RequestBodyEncryptionMode.AES_RSA;
    }

    C3743zm(C3712ym ymVar) {
        this.f9605a = ymVar;
    }
}
