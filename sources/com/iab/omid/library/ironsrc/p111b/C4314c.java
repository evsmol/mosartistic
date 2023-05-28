package com.iab.omid.library.ironsrc.p111b;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.ironsrc.p114e.C4332a;

/* renamed from: com.iab.omid.library.ironsrc.b.c */
public class C4314c {

    /* renamed from: a */
    private final C4332a f10292a;

    /* renamed from: b */
    private final String f10293b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f10294c;

    /* renamed from: d */
    private final String f10295d;

    public C4314c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f10292a = new C4332a(view);
        this.f10293b = view.getClass().getCanonicalName();
        this.f10294c = friendlyObstructionPurpose;
        this.f10295d = str;
    }

    /* renamed from: a */
    public C4332a mo32948a() {
        return this.f10292a;
    }

    /* renamed from: b */
    public String mo32949b() {
        return this.f10293b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose mo32950c() {
        return this.f10294c;
    }

    /* renamed from: d */
    public String mo32951d() {
        return this.f10295d;
    }
}
