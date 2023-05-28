package com.ironsource.sdk.p146i;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.controller.C4845x;
import com.ironsource.sdk.p140d.C4908b;
import com.ironsource.sdk.p144g.C4936d;
import com.ironsource.sdk.utils.C4984b;

/* renamed from: com.ironsource.sdk.i.a */
public final class C4951a {

    /* renamed from: com.ironsource.sdk.i.a$1 */
    static /* synthetic */ class C49521 {

        /* renamed from: a */
        static final /* synthetic */ int[] f12694a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                int[] r0 = com.ironsource.sdk.p144g.C4936d.C4937a.m14402a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12694a = r0
                r1 = 1
                int r2 = com.ironsource.sdk.p144g.C4936d.C4937a.f12656a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f12694a     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.sdk.p144g.C4936d.C4937a.f12657b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r1 = f12694a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = com.ironsource.sdk.p144g.C4936d.C4937a.f12658c     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p146i.C4951a.C49521.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static boolean m14424a(Activity activity) {
        int parseInt = Integer.parseInt(C4984b.m14516a().f12754a.getString("back_button_state", "2"));
        if (C49521.f12694a[(parseInt == 0 ? C4936d.C4937a.f12656a : parseInt == 1 ? C4936d.C4937a.f12657b : C4936d.C4937a.f12658c) - 1] != 3) {
            return false;
        }
        try {
            C4845x xVar = (C4845x) C4908b.m14292a((Context) activity).f12532a.f12194a;
            if (xVar != null) {
                xVar.mo34441b(C4845x.m14183b("nativeNavigationPressed", C4845x.m14167a("action", "back", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
