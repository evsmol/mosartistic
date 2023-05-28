package com.yandex.metrica.impl.p082ob;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.yandex.metrica.impl.ob.wm */
public class C3636wm {

    /* renamed from: a */
    private final String f9422a;

    /* renamed from: b */
    private final byte[] f9423b;

    /* renamed from: c */
    private final byte[] f9424c;

    public C3636wm(String str, byte[] bArr, byte[] bArr2) {
        this.f9422a = str;
        this.f9423b = bArr;
        this.f9424c = bArr2;
    }

    /* renamed from: a */
    public byte[] mo18384a(byte[] bArr) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f9423b, "AES");
        Cipher instance = Cipher.getInstance(this.f9422a);
        instance.init(1, secretKeySpec, new IvParameterSpec(this.f9424c));
        return instance.doFinal(bArr);
    }

    /* renamed from: a */
    public byte[] mo18385a(byte[] bArr, int i, int i2) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f9423b, "AES");
        Cipher instance = Cipher.getInstance(this.f9422a);
        instance.init(2, secretKeySpec, new IvParameterSpec(this.f9424c));
        return instance.doFinal(bArr, i, i2);
    }
}
