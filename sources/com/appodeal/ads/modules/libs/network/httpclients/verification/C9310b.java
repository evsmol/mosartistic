package com.appodeal.ads.modules.libs.network.httpclients.verification;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.appodeal.ads.modules.libs.network.httpclients.verification.b */
public final class C9310b {

    /* renamed from: a */
    public String f23540a;

    /* renamed from: a */
    public static boolean m27493a(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bytes = "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAENIBD8zVGWMJWVFPJ9aQkyZS+ahKDB9xbQZeXIb7keGfUEMdOaOxWd+nTa2HbkeHi0PNfdGHAyCE4mycvIPwStw==".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] decode = Base64.decode(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(NetworkSettings.D…eArray(), Base64.DEFAULT)");
            PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(decode));
            Signature instance = Signature.getInstance("SHA256withECDSA");
            instance.initVerify(generatePublic);
            instance.update(bArr);
            return instance.verify(bArr2);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final String mo60316a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f23540a = uuid;
        return uuid;
    }

    /* renamed from: a */
    public final boolean mo60317a(String str) {
        String str2 = this.f23540a;
        if (str2 == null) {
            return true;
        }
        if (str2.length() > 0) {
            if (!(str == null || str.length() == 0)) {
                byte[] decode = Base64.decode(str, 0);
                byte[] bytes = str2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                Intrinsics.checkNotNullExpressionValue(decode, "decryptedSignatureBytes");
                return m27493a(bytes, decode);
            }
        }
        return true;
    }
}
