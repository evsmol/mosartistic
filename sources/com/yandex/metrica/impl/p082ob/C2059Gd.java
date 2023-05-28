package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Gd */
public class C2059Gd implements C1863Ad {

    /* renamed from: a */
    private final Context f5454a;

    /* renamed from: b */
    private final String f5455b;

    /* renamed from: c */
    private final C3241mn f5456c;

    public C2059Gd(Context context, String str, C3241mn mnVar) {
        this.f5454a = context;
        this.f5455b = str;
        this.f5456c = mnVar;
    }

    /* renamed from: a */
    public List<C1892Bd> mo15459a() {
        ArrayList arrayList = new ArrayList();
        PackageInfo b = this.f5456c.mo17880b(this.f5454a, this.f5455b, 4096);
        if (b != null) {
            for (String bd : b.requestedPermissions) {
                arrayList.add(new C1892Bd(bd, true));
            }
        }
        return arrayList;
    }
}
