package com.iab.omid.library.adcolony;

import android.content.Context;
import com.iab.omid.library.adcolony.p093b.C4105b;
import com.iab.omid.library.adcolony.p093b.C4108d;
import com.iab.omid.library.adcolony.p093b.C4111f;
import com.iab.omid.library.adcolony.p095d.C4119b;
import com.iab.omid.library.adcolony.p095d.C4123e;

/* renamed from: com.iab.omid.library.adcolony.b */
public class C4103b {

    /* renamed from: a */
    private boolean f9812a;

    /* renamed from: b */
    private void m11273b(Context context) {
        C4123e.m11372a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo32133a() {
        return "1.3.30-Adcolony";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32134a(Context context) {
        m11273b(context);
        if (!mo32136b()) {
            mo32135a(true);
            C4111f.m11318a().mo32179a(context);
            C4105b.m11285a().mo32143a(context);
            C4119b.m11350a(context);
            C4108d.m11298a().mo32160a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32135a(boolean z) {
        this.f9812a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo32136b() {
        return this.f9812a;
    }
}
