package com.yandex.metrica.impl.p082ob;

import android.telephony.CellIdentityWcdma;
import kotlin.Metadata;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, mo38199d2 = {"Lcom/yandex/metrica/impl/ob/Rj;", "Lcom/yandex/metrica/impl/ob/Mj;", "Landroid/telephony/CellIdentityWcdma;", "cellIdentity", "", "a", "(Landroid/telephony/CellIdentityWcdma;)Ljava/lang/Integer;", "b", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo38200k = 1, mo38201mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.Rj */
public final class C2497Rj implements C2319Mj<CellIdentityWcdma> {
    /* renamed from: a */
    public Integer mo16324b(CellIdentityWcdma cellIdentityWcdma) {
        return Integer.valueOf(cellIdentityWcdma.getMcc());
    }

    /* renamed from: b */
    public Integer mo16323a(CellIdentityWcdma cellIdentityWcdma) {
        return Integer.valueOf(cellIdentityWcdma.getMnc());
    }
}
