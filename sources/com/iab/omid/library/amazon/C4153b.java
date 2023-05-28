package com.iab.omid.library.amazon;

import android.content.Context;
import com.iab.omid.library.amazon.p099b.C4155b;
import com.iab.omid.library.amazon.p099b.C4158d;
import com.iab.omid.library.amazon.p099b.C4161f;
import com.iab.omid.library.amazon.p101d.C4169b;
import com.iab.omid.library.amazon.p101d.C4173e;

/* renamed from: com.iab.omid.library.amazon.b */
public class C4153b {

    /* renamed from: a */
    private boolean f9929a;

    /* renamed from: b */
    private void m11503b(Context context) {
        C4173e.m11602a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo32332a() {
        return "1.3.28-Amazon";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32333a(Context context) {
        m11503b(context);
        if (!mo32335b()) {
            mo32334a(true);
            C4161f.m11548a().mo32378a(context);
            C4155b.m11515a().mo32342a(context);
            C4169b.m11580a(context);
            C4158d.m11528a().mo32359a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32334a(boolean z) {
        this.f9929a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo32335b() {
        return this.f9929a;
    }
}
