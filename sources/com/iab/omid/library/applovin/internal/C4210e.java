package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.applovin.weakreference.C4250a;

/* renamed from: com.iab.omid.library.applovin.internal.e */
public class C4210e {

    /* renamed from: a */
    private final C4250a f10067a;

    /* renamed from: b */
    private final String f10068b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f10069c;

    /* renamed from: d */
    private final String f10070d;

    public C4210e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f10067a = new C4250a(view);
        this.f10068b = view.getClass().getCanonicalName();
        this.f10069c = friendlyObstructionPurpose;
        this.f10070d = str;
    }

    /* renamed from: a */
    public String mo32563a() {
        return this.f10070d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose mo32564b() {
        return this.f10069c;
    }

    /* renamed from: c */
    public C4250a mo32565c() {
        return this.f10067a;
    }

    /* renamed from: d */
    public String mo32566d() {
        return this.f10068b;
    }
}
