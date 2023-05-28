package com.bytedance.mobsec.metasec.p292ov;

import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import p152ms.p153bd.p154o.Pgl.C5674r0;
import p152ms.p153bd.p154o.Pgl.C5678t0;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: com.bytedance.mobsec.metasec.ov.pgla */
public class pgla {

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pblb */
    static class pblb extends pblb.pgla {
        pblb() {
        }

        /* renamed from: a */
        public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
            return "";
        }
    }

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pblc */
    static class pblc extends pblb.pgla {
        pblc() {
        }

        /* renamed from: a */
        public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
            return C5678t0.m14689c();
        }
    }

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pbld */
    static class pbld extends pblb.pgla {
        pbld() {
        }

        /* renamed from: a */
        public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
            return "";
        }
    }

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pgla  reason: collision with other inner class name */
    static class C10731pgla extends pblb.pgla {
        C10731pgla() {
        }

        /* renamed from: a */
        public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
            int i2;
            try {
                Display defaultDisplay = ((WindowManager) p152ms.p153bd.p154o.Pgl.pgla.m14675a().mo42236b().getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                if (Build.VERSION.SDK_INT >= 17) {
                    defaultDisplay.getRealSize(point);
                } else if (Build.VERSION.SDK_INT >= 13) {
                    defaultDisplay.getSize(point);
                } else {
                    C5674r0.f13024a = defaultDisplay.getWidth();
                    i2 = defaultDisplay.getHeight();
                    C5674r0.f13025b = i2;
                    return C5674r0.f13024a + "*" + C5674r0.f13025b;
                }
                C5674r0.f13024a = point.x;
                i2 = point.y;
                C5674r0.f13025b = i2;
            } catch (Throwable unused) {
            }
            return C5674r0.f13024a + "*" + C5674r0.f13025b;
        }
    }

    /* renamed from: a */
    public static void m29313a() {
        p152ms.p153bd.p154o.Pgl.pblb.m14603a(268435457, (pblb.pgla) new C10731pgla());
        p152ms.p153bd.p154o.Pgl.pblb.m14603a(268435463, (pblb.pgla) new pblb());
        p152ms.p153bd.p154o.Pgl.pblb.m14603a(268435462, (pblb.pgla) new pblc());
        p152ms.p153bd.p154o.Pgl.pblb.m14603a(268435464, (pblb.pgla) new pbld());
    }
}
