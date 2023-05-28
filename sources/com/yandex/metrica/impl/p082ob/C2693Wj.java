package com.yandex.metrica.impl.p082ob;

import android.telephony.SubscriptionInfo;
import kotlin.Metadata;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, mo38199d2 = {"Lcom/yandex/metrica/impl/ob/Wj;", "", "Landroid/telephony/SubscriptionInfo;", "subscriptionInfo", "", "a", "(Landroid/telephony/SubscriptionInfo;)Ljava/lang/Integer;", "b", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo38200k = 1, mo38201mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.Wj */
public final class C2693Wj {

    /* renamed from: a */
    public static final C2693Wj f7092a = new C2693Wj();

    private C2693Wj() {
    }

    /* renamed from: a */
    public static final Integer m8819a(SubscriptionInfo subscriptionInfo) {
        return C2814b.m9073c(subscriptionInfo.getMccString());
    }

    /* renamed from: b */
    public static final Integer m8820b(SubscriptionInfo subscriptionInfo) {
        return C2814b.m9073c(subscriptionInfo.getMncString());
    }
}
