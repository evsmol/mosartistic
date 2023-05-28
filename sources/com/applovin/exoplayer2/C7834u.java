package com.applovin.exoplayer2;

/* renamed from: com.applovin.exoplayer2.u */
public final class C7834u extends RuntimeException {

    /* renamed from: a */
    public final int f18683a;

    public C7834u(int i) {
        super(m22963a(i));
        this.f18683a = i;
    }

    /* renamed from: a */
    private static String m22963a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
