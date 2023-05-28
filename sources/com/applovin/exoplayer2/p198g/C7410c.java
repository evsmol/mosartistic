package com.applovin.exoplayer2.p198g;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p198g.p199a.C7404b;
import com.applovin.exoplayer2.p198g.p200b.C7408b;
import com.applovin.exoplayer2.p198g.p202d.C7417a;
import com.applovin.exoplayer2.p198g.p203e.C7435g;
import com.applovin.exoplayer2.p198g.p205g.C7464c;

/* renamed from: com.applovin.exoplayer2.g.c */
public interface C7410c {

    /* renamed from: a */
    public static final C7410c f16991a = new C7410c() {
        /* renamed from: a */
        public boolean mo54236a(C7864v vVar) {
            String str = vVar.f18921l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        /* renamed from: b */
        public C7405b mo54237b(C7864v vVar) {
            String str = vVar.f18921l;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    return new C7435g();
                }
                if (c == 1) {
                    return new C7408b();
                }
                if (c == 2) {
                    return new C7464c();
                }
                if (c == 3) {
                    return new C7417a();
                }
                if (c == 4) {
                    return new C7404b();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    /* renamed from: a */
    boolean mo54236a(C7864v vVar);

    /* renamed from: b */
    C7405b mo54237b(C7864v vVar);
}
