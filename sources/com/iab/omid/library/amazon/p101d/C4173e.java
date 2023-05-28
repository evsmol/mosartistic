package com.iab.omid.library.amazon.p101d;

import android.text.TextUtils;
import com.iab.omid.library.amazon.Omid;
import com.iab.omid.library.amazon.adsession.C4152a;
import com.iab.omid.library.amazon.adsession.CreativeType;
import com.iab.omid.library.amazon.adsession.ImpressionType;
import com.iab.omid.library.amazon.adsession.Owner;

/* renamed from: com.iab.omid.library.amazon.d.e */
public class C4173e {
    /* renamed from: a */
    public static void m11599a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m11600a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m11601a(C4152a aVar) {
        if (aVar.mo32307g()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m11602a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m11603a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m11604a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m11605b(C4152a aVar) {
        if (aVar.mo32308h()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m11606c(C4152a aVar) {
        m11611h(aVar);
        m11605b(aVar);
    }

    /* renamed from: d */
    public static void m11607d(C4152a aVar) {
        if (aVar.getAdSessionStatePublisher().mo32404c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m11608e(C4152a aVar) {
        if (aVar.getAdSessionStatePublisher().mo32405d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m11609f(C4152a aVar) {
        if (!aVar.mo32309i()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m11610g(C4152a aVar) {
        if (!aVar.mo32310j()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m11611h(C4152a aVar) {
        if (!aVar.mo32307g()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
