package com.iab.omid.library.appodeal.p107d;

import android.text.TextUtils;
import com.iab.omid.library.appodeal.Omid;
import com.iab.omid.library.appodeal.adsession.C4259a;
import com.iab.omid.library.appodeal.adsession.CreativeType;
import com.iab.omid.library.appodeal.adsession.ImpressionType;
import com.iab.omid.library.appodeal.adsession.Owner;

/* renamed from: com.iab.omid.library.appodeal.d.e */
public class C4280e {
    /* renamed from: a */
    public static void m12078a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m12079a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m12080a(C4259a aVar) {
        if (aVar.mo32714f()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m12081a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m12082a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m12083a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m12084b(C4259a aVar) {
        if (aVar.mo32715g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m12085c(C4259a aVar) {
        m12090h(aVar);
        m12084b(aVar);
    }

    /* renamed from: d */
    public static void m12086d(C4259a aVar) {
        if (aVar.getAdSessionStatePublisher().mo32811c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m12087e(C4259a aVar) {
        if (aVar.getAdSessionStatePublisher().mo32812d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m12088f(C4259a aVar) {
        if (!aVar.mo32716h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m12089g(C4259a aVar) {
        if (!aVar.mo32717i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m12090h(C4259a aVar) {
        if (!aVar.mo32714f()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
