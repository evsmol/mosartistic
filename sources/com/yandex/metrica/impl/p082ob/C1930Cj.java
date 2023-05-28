package com.yandex.metrica.impl.p082ob;

import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import kotlin.Metadata;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\b¨\u0006\u000b"}, mo38199d2 = {"Lcom/yandex/metrica/impl/ob/Cj;", "", "Landroid/telephony/CellIdentityWcdma;", "cellIdentity", "", "a", "(Landroid/telephony/CellIdentityWcdma;)I", "Landroid/telephony/CellIdentityLte;", "(Landroid/telephony/CellIdentityLte;)I", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo38200k = 1, mo38201mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.Cj */
public final class C1930Cj {

    /* renamed from: a */
    public static final C1930Cj f5188a = new C1930Cj();

    private C1930Cj() {
    }

    /* renamed from: a */
    public static final int m6978a(CellIdentityWcdma cellIdentityWcdma) {
        return cellIdentityWcdma.getUarfcn();
    }

    /* renamed from: a */
    public static final int m6977a(CellIdentityLte cellIdentityLte) {
        return cellIdentityLte.getEarfcn();
    }
}
