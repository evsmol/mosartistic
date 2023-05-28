package com.ironsource.sdk.p144g;

/* renamed from: com.ironsource.sdk.g.a */
public final class C4932a extends C4943f {

    /* renamed from: e */
    private static String f12611e = "type";

    /* renamed from: f */
    private static String f12612f = "numOfAdUnits";

    /* renamed from: g */
    private static String f12613g = "firstCampaignCredits";

    /* renamed from: h */
    private static String f12614h = "totalNumberCredits";

    /* renamed from: i */
    private static String f12615i = "productType";

    /* renamed from: a */
    public String f12616a;

    /* renamed from: b */
    public String f12617b;

    /* renamed from: c */
    public boolean f12618c;

    /* renamed from: j */
    private String f12619j;

    /* renamed from: k */
    private String f12620k;

    /* renamed from: l */
    private String f12621l;

    public C4932a(String str) {
        super(str);
        boolean z;
        if (mo34682a(f12611e)) {
            this.f12619j = mo34685d(f12611e);
        }
        if (mo34682a(f12612f)) {
            this.f12617b = mo34685d(f12612f);
            z = true;
        } else {
            z = false;
        }
        this.f12618c = z;
        if (mo34682a(f12613g)) {
            this.f12620k = mo34685d(f12613g);
        }
        if (mo34682a(f12614h)) {
            this.f12621l = mo34685d(f12614h);
        }
        if (mo34682a(f12615i)) {
            this.f12616a = mo34685d(f12615i);
        }
    }
}
