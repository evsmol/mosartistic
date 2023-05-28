package com.iab.omid.library.applovin;

import android.content.Context;
import com.iab.omid.library.applovin.internal.C4205a;
import com.iab.omid.library.applovin.internal.C4206b;
import com.iab.omid.library.applovin.internal.C4211f;
import com.iab.omid.library.applovin.internal.C4214h;
import com.iab.omid.library.applovin.utils.C4224a;
import com.iab.omid.library.applovin.utils.C4226c;
import com.iab.omid.library.applovin.utils.C4230e;
import com.iab.omid.library.applovin.utils.C4233g;

/* renamed from: com.iab.omid.library.applovin.b */
public class C4198b {

    /* renamed from: a */
    private boolean f10041a;

    /* renamed from: b */
    private void m11724b(Context context) {
        C4233g.m11883a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo32526a() {
        return "1.4.1-Applovin";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32527a(Context context) {
        m11724b(context);
        if (!mo32529b()) {
            mo32528a(true);
            C4214h.m11798c().mo32587a(context);
            C4206b.m11751g().mo32550a(context);
            C4224a.m11847a(context);
            C4226c.m11855a(context);
            C4230e.m11877a(context);
            C4211f.m11776b().mo32568a(context);
            C4205a.m11745a().mo32538a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32528a(boolean z) {
        this.f10041a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo32529b() {
        return this.f10041a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo32530c() {
        C4233g.m11880a();
        C4205a.m11745a().mo32541d();
    }
}
