package com.yandex.metrica.impl.p082ob;

import android.content.pm.FeatureInfo;

/* renamed from: com.yandex.metrica.impl.ob.rb */
public abstract class C3439rb {

    /* renamed from: com.yandex.metrica.impl.ob.rb$a */
    public static class C3440a extends C3439rb {
        /* renamed from: b */
        public C3475sb mo18154b(FeatureInfo featureInfo) {
            return new C3475sb(featureInfo.name, featureInfo.version, mo18155c(featureInfo));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rb$b */
    public static class C3441b extends C3439rb {
        /* renamed from: b */
        public C3475sb mo18154b(FeatureInfo featureInfo) {
            return new C3475sb(featureInfo.name, -1, mo18155c(featureInfo));
        }
    }

    /* renamed from: a */
    public C3475sb mo18153a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return mo18154b(featureInfo);
        }
        int i = featureInfo.reqGlEsVersion;
        if (i == 0) {
            return mo18154b(featureInfo);
        }
        return new C3475sb("openGlFeature", i, mo18155c(featureInfo));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C3475sb mo18154b(FeatureInfo featureInfo);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo18155c(FeatureInfo featureInfo) {
        return (featureInfo.flags & 1) != 0;
    }
}
