package com.applovin.exoplayer2.p209i;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p209i.p210a.C7543a;
import com.applovin.exoplayer2.p209i.p210a.C7546b;
import com.applovin.exoplayer2.p209i.p211b.C7556a;
import com.applovin.exoplayer2.p209i.p212c.C7569a;
import com.applovin.exoplayer2.p209i.p214e.C7579a;
import com.applovin.exoplayer2.p209i.p215f.C7586a;
import com.applovin.exoplayer2.p209i.p216g.C7591c;
import com.applovin.exoplayer2.p209i.p217h.C7601a;
import com.applovin.exoplayer2.p209i.p218i.C7605a;
import com.applovin.exoplayer2.p209i.p218i.C7616g;

/* renamed from: com.applovin.exoplayer2.i.i */
public interface C7603i {

    /* renamed from: a */
    public static final C7603i f17741a = new C7603i() {
        /* renamed from: a */
        public boolean mo54756a(C7864v vVar) {
            String str = vVar.f18921l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        /* renamed from: b */
        public C7588g mo54757b(C7864v vVar) {
            String str = vVar.f18921l;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c = 9;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c = 10;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C7616g();
                    case 1:
                        return new C7579a(vVar.f18923n);
                    case 2:
                        return new C7605a();
                    case 3:
                        return new C7591c();
                    case 4:
                        return new C7586a();
                    case 5:
                        return new C7601a(vVar.f18923n);
                    case 6:
                    case 7:
                        return new C7543a(str, vVar.f18907D, 16000);
                    case 8:
                        return new C7546b(vVar.f18907D, vVar.f18923n);
                    case 9:
                        return new C7556a(vVar.f18923n);
                    case 10:
                        return new C7569a();
                    case 11:
                        return new C7567c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    /* renamed from: a */
    boolean mo54756a(C7864v vVar);

    /* renamed from: b */
    C7588g mo54757b(C7864v vVar);
}
