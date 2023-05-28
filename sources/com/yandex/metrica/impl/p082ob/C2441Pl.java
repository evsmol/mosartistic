package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.appodeal.advertising.AdvertisingInfo;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.metrica.impl.ob.Pl */
public final class C2441Pl {

    /* renamed from: a */
    private final Context f6493a;

    /* renamed from: b */
    private final C3650xb f6494b;

    /* renamed from: c */
    private final C1889Bb f6495c;

    public C2441Pl(Context context, C3650xb xbVar, C1889Bb bb) {
        this.f6493a = context;
        this.f6494b = xbVar;
        this.f6495c = bb;
    }

    /* renamed from: b */
    private final String m8158b() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID().toString()");
        String replace$default = StringsKt.replace$default(uuid, "-", "", false, 4, (Object) null);
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
        if (replace$default != null) {
            String lowerCase = replace$default.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final String mo16485a() {
        boolean z;
        byte[] bArr;
        C3729zb a = this.f6494b.mo18394a(this.f6493a, (C2057Gb) new C2090Hb(5, 500));
        Intrinsics.checkNotNullExpressionValue(a, "advertisingIdGetter.getI…sedRetryStrategy(5, 500))");
        C3539ub c = a.mo18455c();
        Intrinsics.checkNotNullExpressionValue(c, "advertisingIdGetter.getI…yStrategy(5, 500)).yandex");
        boolean z2 = false;
        if (c.mo18256a()) {
            C3504tb tbVar = c.f9198a;
            Intrinsics.checkNotNull(tbVar);
            String str = tbVar.f9142b;
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNullExpressionValue(str, "yandexAdvId.mAdTrackingInfo!!.advId!!");
            Charset charset = Charsets.UTF_8;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                try {
                    bArr = MessageDigest.getInstance("MD5").digest(bytes);
                } catch (NoSuchAlgorithmException unused) {
                    bArr = new byte[0];
                }
                String a2 = C2814b.m9063a(bArr);
                Intrinsics.checkNotNullExpressionValue(a2, "StringUtils.toHexString(…!.advId!!.toByteArray()))");
                return a2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String a3 = this.f6495c.mo15551a().mo15453a();
        if (a3 != null) {
            if (!(a3.length() == 0)) {
                try {
                    UUID.fromString(a3);
                    z = true;
                } catch (Throwable unused2) {
                    z = false;
                }
                if (z && (!Intrinsics.areEqual((Object) a3, (Object) AdvertisingInfo.defaultAdvertisingId))) {
                    z2 = true;
                }
            }
            if (z2) {
                return StringsKt.replace$default(a3, "-", "", false, 4, (Object) null);
            }
        }
        return m8158b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2441Pl(android.content.Context r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            java.lang.String r1 = "GlobalServiceLocator.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.yandex.metrica.impl.ob.xb r0 = r0.mo15755r()
            java.lang.String r2 = "GlobalServiceLocator.get…ternalAdvertisingIdGetter"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            com.yandex.metrica.impl.ob.F0 r2 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            com.yandex.metrica.impl.ob.Bb r1 = r2.mo15737a()
            java.lang.String r2 = "GlobalServiceLocator.getInstance().appSetIdGetter"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r3.<init>(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2441Pl.<init>(android.content.Context):void");
    }
}
