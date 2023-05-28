package com.yandex.metrica.impl.p082ob;

import android.telephony.CellSignalStrengthLte;
import kotlin.Metadata;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo38199d2 = {"Lcom/yandex/metrica/impl/ob/Fj;", "", "Landroid/telephony/CellSignalStrengthLte;", "cellSignalStrengthLte", "", "a", "(Landroid/telephony/CellSignalStrengthLte;)I", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo38200k = 1, mo38201mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.Fj */
public final class C2031Fj {

    /* renamed from: a */
    public static final C2031Fj f5421a = new C2031Fj();

    private C2031Fj() {
    }

    /* renamed from: a */
    public static final int m7216a(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getRssi();
    }
}
