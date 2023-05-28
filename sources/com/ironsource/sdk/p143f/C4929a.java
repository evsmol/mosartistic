package com.ironsource.sdk.p143f;

import com.ironsource.mediationsdk.model.C4647b;
import com.ironsource.mediationsdk.model.C4648c;
import com.ironsource.mediationsdk.model.C4649d;
import com.ironsource.mediationsdk.model.C4662p;
import com.ironsource.mediationsdk.utils.C4713b;
import com.ironsource.mediationsdk.utils.C4722j;
import com.ironsource.mediationsdk.utils.C4733p;
import com.ironsource.sdk.controller.C4839u;
import com.ironsource.sdk.p144g.C4936d;

/* renamed from: com.ironsource.sdk.f.a */
public class C4929a {

    /* renamed from: a */
    private C4649d f12597a;

    /* renamed from: b */
    private C4662p f12598b;

    /* renamed from: c */
    private C4733p f12599c;

    /* renamed from: d */
    private boolean f12600d;

    /* renamed from: e */
    private C4839u f12601e;

    /* renamed from: f */
    private C4713b f12602f;

    /* renamed from: g */
    private C4648c f12603g;

    /* renamed from: h */
    private C4722j f12604h;

    /* renamed from: i */
    private C4647b f12605i;

    /* renamed from: com.ironsource.sdk.f.a$a */
    public static class C4930a {

        /* renamed from: a */
        public String f12606a;

        /* renamed from: b */
        public String f12607b;

        /* renamed from: c */
        public String f12608c;

        /* renamed from: a */
        public static C4930a m14384a(C4936d.C4941e eVar) {
            String str;
            C4930a aVar = new C4930a();
            if (eVar == C4936d.C4941e.RewardedVideo) {
                aVar.f12606a = "showRewardedVideo";
                aVar.f12607b = "onShowRewardedVideoSuccess";
                str = "onShowRewardedVideoFail";
            } else if (eVar == C4936d.C4941e.Interstitial) {
                aVar.f12606a = "showInterstitial";
                aVar.f12607b = "onShowInterstitialSuccess";
                str = "onShowInterstitialFail";
            } else {
                if (eVar == C4936d.C4941e.OfferWall) {
                    aVar.f12606a = "showOfferWall";
                    aVar.f12607b = "onShowOfferWallSuccess";
                    str = "onInitOfferWallFail";
                }
                return aVar;
            }
            aVar.f12608c = str;
            return aVar;
        }
    }

    public C4929a() {
        this.f12597a = new C4649d();
    }

    public C4929a(C4649d dVar, C4662p pVar, C4733p pVar2, boolean z, C4839u uVar, C4713b bVar, C4648c cVar, C4722j jVar, C4647b bVar2) {
        this.f12597a = dVar;
        this.f12598b = pVar;
        this.f12599c = pVar2;
        this.f12600d = z;
        this.f12601e = uVar;
        this.f12602f = bVar;
        this.f12603g = cVar;
        this.f12604h = jVar;
        this.f12605i = bVar2;
    }

    /* renamed from: a */
    public C4649d mo34649a() {
        return this.f12597a;
    }

    /* renamed from: b */
    public C4662p mo34650b() {
        return this.f12598b;
    }

    /* renamed from: c */
    public C4733p mo34651c() {
        return this.f12599c;
    }

    /* renamed from: d */
    public boolean mo34652d() {
        return this.f12600d;
    }

    /* renamed from: e */
    public C4839u mo34653e() {
        return this.f12601e;
    }

    /* renamed from: f */
    public C4713b mo34654f() {
        return this.f12602f;
    }

    /* renamed from: g */
    public C4648c mo34655g() {
        return this.f12603g;
    }

    /* renamed from: h */
    public C4722j mo34656h() {
        return this.f12604h;
    }

    /* renamed from: i */
    public C4647b mo34657i() {
        return this.f12605i;
    }
}
