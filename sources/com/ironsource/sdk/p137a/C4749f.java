package com.ironsource.sdk.p137a;

import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.sdk.a.f */
public final class C4749f {

    /* renamed from: a */
    public static C4750a f12037a = new C4750a(2001, m13927a("initsdk"));

    /* renamed from: b */
    public static C4750a f12038b = new C4750a(2002, m13927a("createcontrollerweb"));

    /* renamed from: c */
    public static C4750a f12039c = new C4750a(2003, m13927a("createcontrollernative"));

    /* renamed from: d */
    public static C4750a f12040d = new C4750a(2004, m13927a("controllerstageready"));

    /* renamed from: e */
    public static C4750a f12041e = new C4750a(IronSourceConstants.IS_INSTANCE_OPENED, m13927a("loadad"));

    /* renamed from: f */
    public static C4750a f12042f = new C4750a(2006, m13927a("loadadfailed"));

    /* renamed from: g */
    public static C4750a f12043g = new C4750a(2007, m13927a("initproduct"));

    /* renamed from: h */
    public static C4750a f12044h = new C4750a(AdError.REMOTE_ADS_SERVICE_ERROR, m13927a("initproductfailed"));

    /* renamed from: i */
    public static C4750a f12045i = new C4750a(AdError.INTERSTITIAL_AD_TIMEOUT, m13927a("loadproduct"));

    /* renamed from: j */
    public static C4750a f12046j = new C4750a(2010, m13927a("parseadmfailed"));

    /* renamed from: k */
    public static C4750a f12047k = new C4750a(2011, m13927a("loadadsuccess"));

    /* renamed from: l */
    public static C4750a f12048l = new C4750a(2013, m13927a("controllerfailed"));

    /* renamed from: m */
    public static C4750a f12049m = new C4750a(2015, m13927a("appendnativefeaturesdatafailed"));

    /* renamed from: n */
    public static C4750a f12050n = new C4750a(2016, m13927a("adunitcouldnotloadtowebview"));

    /* renamed from: o */
    public static C4750a f12051o = new C4750a(2017, m13927a("webviewcleanupfailed"));

    /* renamed from: p */
    public static C4750a f12052p = new C4750a(2018, m13927a("removewebviewfailed"));

    /* renamed from: q */
    public static C4750a f12053q = new C4750a(2021, m13927a("fialedregactlifecycle"));

    /* renamed from: r */
    public static C4750a f12054r = new C4750a(2022, m13927a("loadcontrollerhtml"));

    /* renamed from: s */
    public static C4750a f12055s = new C4750a(2023, m13927a("controllerhtmlsuccess"));

    /* renamed from: t */
    public static C4750a f12056t = new C4750a(2024, m13927a("controllerhtmlfailed"));

    /* renamed from: u */
    public static C4750a f12057u = new C4750a(2025, m13927a("webviewcrashrpg"));

    /* renamed from: com.ironsource.sdk.a.f$a */
    public static class C4750a {

        /* renamed from: a */
        String f12058a;

        /* renamed from: b */
        int f12059b;

        C4750a(int i, String str) {
            this.f12059b = i;
            this.f12058a = str;
        }
    }

    static {
        new C4750a(2014, m13927a("extractinstalledpackagesfailed"));
        new C4750a(2019, m13927a("adunitcouldnotloadtowebviewbanners"));
        new C4750a(2020, m13927a("banneralreadydestroyed"));
    }

    /* renamed from: a */
    private static String m13927a(String str) {
        return "n_" + str;
    }
}
