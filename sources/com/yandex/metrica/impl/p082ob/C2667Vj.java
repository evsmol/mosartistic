package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo38199d2 = {"Lcom/yandex/metrica/impl/ob/Vj;", "", "Landroid/content/Context;", "context", "", "Lcom/yandex/metrica/impl/ob/Tj;", "a", "(Landroid/content/Context;)Ljava/util/List;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo38200k = 1, mo38201mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.Vj */
public final class C2667Vj {

    /* renamed from: a */
    public static final C2667Vj f7059a = new C2667Vj();

    /* renamed from: com.yandex.metrica.impl.ob.Vj$a */
    static final class C2668a<T, R> implements C3327om<SubscriptionManager, List<? extends SubscriptionInfo>> {

        /* renamed from: a */
        public static final C2668a f7060a = new C2668a();

        C2668a() {
        }

        /* renamed from: a */
        public Object mo15530a(Object obj) {
            return ((SubscriptionManager) obj).getActiveSubscriptionInfoList();
        }
    }

    private C2667Vj() {
    }

    /* renamed from: a */
    public static final List<C2570Tj> m8794a(Context context) {
        Integer num;
        Integer num2;
        List<SubscriptionInfo> list = (List) C1848A2.m6794a(C2668a.f7060a, context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager");
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SubscriptionInfo subscriptionInfo : list) {
            if (C1848A2.m6808a(29)) {
                num = C2693Wj.m8819a(subscriptionInfo);
            } else {
                num = Integer.valueOf(subscriptionInfo.getMcc());
            }
            if (C1848A2.m6808a(29)) {
                num2 = C2693Wj.m8820b(subscriptionInfo);
            } else {
                num2 = Integer.valueOf(subscriptionInfo.getMnc());
            }
            boolean z = true;
            if (subscriptionInfo.getDataRoaming() != 1) {
                z = false;
            }
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C2570Tj(num, num2, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }
}
