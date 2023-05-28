package com.ironsource.sdk.p144g;

/* renamed from: com.ironsource.sdk.g.d */
public class C4936d {

    /* renamed from: a */
    private boolean f12644a;

    /* renamed from: b */
    private boolean f12645b;

    /* renamed from: c */
    private boolean f12646c;

    /* renamed from: d */
    private String f12647d;

    /* renamed from: e */
    private String f12648e;

    /* renamed from: f */
    private int f12649f;

    /* renamed from: g */
    private int f12650g;

    /* renamed from: h */
    private int f12651h;

    /* renamed from: i */
    private int[] f12652i;

    /* renamed from: j */
    private int[] f12653j;

    /* renamed from: k */
    private int[] f12654k;

    /* renamed from: l */
    private int[] f12655l;

    /* renamed from: com.ironsource.sdk.g.d$a */
    public enum C4937a {
        ;
        

        /* renamed from: a */
        public static final int f12656a = 1;

        /* renamed from: b */
        public static final int f12657b = 2;

        /* renamed from: c */
        public static final int f12658c = 3;

        static {
            f12659d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m14402a() {
            return (int[]) f12659d.clone();
        }
    }

    /* renamed from: com.ironsource.sdk.g.d$b */
    public enum C4938b {
        None,
        Loaded,
        Ready,
        Failed
    }

    /* renamed from: com.ironsource.sdk.g.d$c */
    public enum C4939c {
        Web,
        Native
    }

    /* renamed from: com.ironsource.sdk.g.d$d */
    public enum C4940d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);
        

        /* renamed from: d */
        public int f12673d;

        private C4940d(int i) {
            this.f12673d = i;
        }
    }

    /* renamed from: com.ironsource.sdk.g.d$e */
    public enum C4941e {
        Banner,
        OfferWall,
        Interstitial,
        OfferWallCredits,
        RewardedVideo,
        None
    }

    public C4936d() {
    }

    public C4936d(boolean z, boolean z2, boolean z3, String str, String str2, int i, int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.f12644a = z;
        this.f12645b = z2;
        this.f12646c = z3;
        this.f12647d = str;
        this.f12648e = str2;
        this.f12649f = i;
        this.f12650g = i2;
        this.f12651h = i3;
        this.f12652i = iArr;
        this.f12653j = iArr2;
        this.f12654k = iArr3;
        this.f12655l = iArr4;
    }

    /* renamed from: a */
    public boolean mo34666a() {
        return this.f12644a;
    }

    /* renamed from: b */
    public boolean mo34667b() {
        return this.f12645b;
    }

    /* renamed from: c */
    public boolean mo34668c() {
        return this.f12646c;
    }

    /* renamed from: d */
    public String mo34669d() {
        return this.f12647d;
    }

    /* renamed from: e */
    public String mo34670e() {
        return this.f12648e;
    }

    /* renamed from: f */
    public int mo34671f() {
        return this.f12649f;
    }

    /* renamed from: g */
    public int mo34672g() {
        return this.f12650g;
    }

    /* renamed from: h */
    public int mo34673h() {
        return this.f12651h;
    }

    /* renamed from: i */
    public int[] mo34674i() {
        return this.f12652i;
    }

    /* renamed from: j */
    public int[] mo34675j() {
        return this.f12653j;
    }

    /* renamed from: k */
    public int[] mo34676k() {
        return this.f12654k;
    }

    /* renamed from: l */
    public int[] mo34677l() {
        return this.f12655l;
    }
}
