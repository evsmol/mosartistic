package com.applovin.exoplayer2.p186e.p195i;

import android.util.SparseArray;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7733e;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.i.g */
public final class C7299g implements C7287ad.C7290c {

    /* renamed from: a */
    private final int f16463a;

    /* renamed from: b */
    private final List<C7864v> f16464b;

    public C7299g() {
        this(0);
    }

    public C7299g(int i) {
        this(i, C7033s.m18803g());
    }

    public C7299g(int i, List<C7864v> list) {
        this.f16463a = i;
        this.f16464b = list;
    }

    /* renamed from: a */
    private C7328z m20016a(C7287ad.C7289b bVar) {
        return new C7328z(m20019c(bVar));
    }

    /* renamed from: a */
    private boolean m20017a(int i) {
        return (i & this.f16463a) != 0;
    }

    /* renamed from: b */
    private C7293af m20018b(C7287ad.C7289b bVar) {
        return new C7293af(m20019c(bVar));
    }

    /* renamed from: c */
    private List<C7864v> m20019c(C7287ad.C7289b bVar) {
        String str;
        int i;
        if (m20017a(32)) {
            return this.f16464b;
        }
        C7772y yVar = new C7772y(bVar.f16391d);
        List<C7864v> list = this.f16464b;
        while (yVar.mo55064a() > 0) {
            int h = yVar.mo55084h();
            int c = yVar.mo55074c() + yVar.mo55084h();
            if (h == 134) {
                list = new ArrayList<>();
                int h2 = yVar.mo55084h() & 31;
                for (int i2 = 0; i2 < h2; i2++) {
                    String f = yVar.mo55081f(3);
                    int h3 = yVar.mo55084h();
                    boolean z = true;
                    boolean z2 = (h3 & 128) != 0;
                    if (z2) {
                        i = h3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte h4 = (byte) yVar.mo55084h();
                    yVar.mo55079e(1);
                    List<byte[]> list2 = null;
                    if (z2) {
                        if ((h4 & 64) == 0) {
                            z = false;
                        }
                        list2 = C7733e.m22284a(z);
                    }
                    list.add(new C7864v.C7866a().mo55435f(str).mo55429c(f).mo55445p(i).mo55422a(list2).mo55424a());
                }
            }
            yVar.mo55076d(c);
        }
        return list;
    }

    /* renamed from: a */
    public SparseArray<C7287ad> mo54022a() {
        return new SparseArray<>();
    }

    /* renamed from: a */
    public C7287ad mo54023a(int i, C7287ad.C7289b bVar) {
        if (i == 2) {
            return new C7319t(new C7303k(m20018b(bVar)));
        }
        if (i == 3 || i == 4) {
            return new C7319t(new C7316q(bVar.f16389b));
        }
        if (i == 21) {
            return new C7319t(new C7314o());
        }
        if (i != 27) {
            if (i == 36) {
                return new C7319t(new C7312n(m20016a(bVar)));
            }
            if (i == 89) {
                return new C7319t(new C7301i(bVar.f16390c));
            }
            if (i != 138) {
                if (i == 172) {
                    return new C7319t(new C7296d(bVar.f16389b));
                }
                if (i == 257) {
                    return new C7327y(new C7318s("application/vnd.dvb.ait"));
                }
                if (i != 129) {
                    if (i != 130) {
                        if (i != 134) {
                            if (i != 135) {
                                switch (i) {
                                    case 15:
                                        if (m20017a(2)) {
                                            return null;
                                        }
                                        return new C7319t(new C7298f(false, bVar.f16389b));
                                    case 16:
                                        return new C7319t(new C7305l(m20018b(bVar)));
                                    case 17:
                                        if (m20017a(2)) {
                                            return null;
                                        }
                                        return new C7319t(new C7315p(bVar.f16389b));
                                    default:
                                        return null;
                                }
                            }
                        } else if (m20017a(16)) {
                            return null;
                        } else {
                            return new C7327y(new C7318s("application/x-scte35"));
                        }
                    } else if (!m20017a(64)) {
                        return null;
                    }
                }
                return new C7319t(new C7294b(bVar.f16389b));
            }
            return new C7319t(new C7300h(bVar.f16389b));
        } else if (m20017a(4)) {
            return null;
        } else {
            return new C7319t(new C7308m(m20016a(bVar), m20017a(1), m20017a(8)));
        }
    }
}
