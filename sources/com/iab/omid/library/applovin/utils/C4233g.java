package com.iab.omid.library.applovin.utils;

import android.text.TextUtils;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.adsession.C4197a;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* renamed from: com.iab.omid.library.applovin.utils.g */
public class C4233g {
    /* renamed from: a */
    public static void m11880a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m11881a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m11882a(C4197a aVar) {
        m11888d(aVar);
        m11886b(aVar);
    }

    /* renamed from: a */
    public static void m11883a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m11884a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m11885a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m11886b(C4197a aVar) {
        if (aVar.mo32499g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m11887c(C4197a aVar) {
        if (aVar.mo32502j()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: d */
    private static void m11888d(C4197a aVar) {
        if (!aVar.mo32502j()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    /* renamed from: e */
    public static void m11889e(C4197a aVar) {
        if (!aVar.mo32500h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: f */
    public static void m11890f(C4197a aVar) {
        if (!aVar.mo32501i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: g */
    public static void m11891g(C4197a aVar) {
        if (aVar.getAdSessionStatePublisher().mo32614c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: h */
    public static void m11892h(C4197a aVar) {
        if (aVar.getAdSessionStatePublisher().mo32615d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
