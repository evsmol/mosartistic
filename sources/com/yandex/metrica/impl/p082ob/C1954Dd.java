package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Dd */
class C1954Dd implements C1863Ad {

    /* renamed from: a */
    private final Context f5237a;

    /* renamed from: b */
    private final C3241mn f5238b;

    public C1954Dd(Context context, C3241mn mnVar) {
        this.f5237a = context;
        this.f5238b = mnVar;
    }

    /* renamed from: a */
    public List<C1892Bd> mo15459a() {
        ArrayList arrayList = new ArrayList();
        C3241mn mnVar = this.f5238b;
        Context context = this.f5237a;
        PackageInfo b = mnVar.mo17880b(context, context.getPackageName(), 4096);
        if (b == null) {
            return arrayList;
        }
        String[] strArr = b.requestedPermissions;
        int[] iArr = b.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (iArr == null || iArr.length <= i || (iArr[i] & 2) == 0) {
                arrayList.add(new C1892Bd(str, false));
            } else {
                arrayList.add(new C1892Bd(str, true));
            }
        }
        return arrayList;
    }
}
