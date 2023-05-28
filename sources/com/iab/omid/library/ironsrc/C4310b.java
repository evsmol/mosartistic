package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.p111b.C4312b;
import com.iab.omid.library.ironsrc.p111b.C4315d;
import com.iab.omid.library.ironsrc.p111b.C4318f;
import com.iab.omid.library.ironsrc.p113d.C4326b;
import com.iab.omid.library.ironsrc.p113d.C4330e;

/* renamed from: com.iab.omid.library.ironsrc.b */
public class C4310b {

    /* renamed from: a */
    private boolean f10283a;

    /* renamed from: b */
    private void m12208b(Context context) {
        C4330e.m12302a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo32933a() {
        return "1.3.12-Ironsrc";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32934a(Context context) {
        m12208b(context);
        if (!mo32936b()) {
            mo32935a(true);
            C4318f.m12251a().mo32971a(context);
            C4312b.m12220a().mo32943a(context);
            C4326b.m12282a(context);
            C4315d.m12231a().mo32952a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32935a(boolean z) {
        this.f10283a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo32936b() {
        return this.f10283a;
    }
}
