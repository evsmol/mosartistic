package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.H */
public class C2070H {

    /* renamed from: a */
    private final Context f5467a;

    /* renamed from: b */
    private final C2861c9 f5468b;

    /* renamed from: c */
    private final String f5469c;

    /* renamed from: d */
    private final C3241mn f5470d;

    public C2070H(Context context, C2861c9 c9Var) {
        this(context, c9Var, context.getPackageName(), new C3241mn());
    }

    /* renamed from: a */
    public List<String> mo15836a() {
        Signature[] signatureArr;
        String str;
        List<String> h = this.f5468b.mo17395h();
        boolean isEmpty = h.isEmpty();
        ArrayList arrayList = h;
        if (isEmpty) {
            ArrayList arrayList2 = new ArrayList();
            try {
                if (C1848A2.m6808a(28)) {
                    SigningInfo signingInfo = this.f5470d.mo17880b(this.f5467a, this.f5469c, 134217728).signingInfo;
                    if (signingInfo.hasMultipleSigners()) {
                        signatureArr = signingInfo.getApkContentsSigners();
                    } else {
                        signatureArr = signingInfo.getSigningCertificateHistory();
                    }
                } else {
                    signatureArr = this.f5470d.mo17880b(this.f5467a, this.f5469c, 64).signatures;
                }
                if (signatureArr != null) {
                    for (Signature byteArray : signatureArr) {
                        try {
                            str = C2814b.m9063a(MessageDigest.getInstance("SHA1").digest(byteArray.toByteArray())).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
                        } catch (Throwable unused) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList2);
            boolean isEmpty2 = arrayList2.isEmpty();
            arrayList = arrayList2;
            if (!isEmpty2) {
                this.f5468b.mo17385a((List<String>) arrayList2).mo17448d();
                arrayList = arrayList2;
            }
        }
        return arrayList;
    }

    C2070H(Context context, C2861c9 c9Var, String str, C3241mn mnVar) {
        this.f5467a = context;
        this.f5468b = c9Var;
        this.f5469c = str;
        this.f5470d = mnVar;
    }
}
