package com.iab.omid.library.appodeal;

import android.content.Context;
import com.iab.omid.library.appodeal.p105b.C4262b;
import com.iab.omid.library.appodeal.p105b.C4265d;
import com.iab.omid.library.appodeal.p105b.C4268f;
import com.iab.omid.library.appodeal.p107d.C4276b;
import com.iab.omid.library.appodeal.p107d.C4280e;

/* renamed from: com.iab.omid.library.appodeal.b */
public class C4260b {

    /* renamed from: a */
    private boolean f10170a;

    /* renamed from: b */
    private void m11984b(Context context) {
        C4280e.m12081a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo32739a() {
        return "1.3.15-Appodeal";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32740a(Context context) {
        m11984b(context);
        if (!mo32742b()) {
            mo32741a(true);
            C4268f.m12029a().mo32785a(context);
            C4262b.m11996a().mo32749a(context);
            C4276b.m12061a(context);
            C4265d.m12009a().mo32766a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32741a(boolean z) {
        this.f10170a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo32742b() {
        return this.f10170a;
    }
}
