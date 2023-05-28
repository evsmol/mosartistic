package com.appodeal.ads;

import com.appodeal.ads.C9205h2;
import com.appodeal.ads.C9378o1;
import com.appodeal.ads.C9384o4;
import com.appodeal.ads.C9566t0;
import com.appodeal.ads.C9685w2;
import com.appodeal.ads.Native;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.s4 */
public final class C9482s4 {
    /* renamed from: a */
    public static final int m28038a(C9577u<?, ?, ?> uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (uVar instanceof C9378o1.C9379a) {
            return 1;
        }
        if (uVar instanceof C9685w2.C9687b) {
            return 2;
        }
        if (uVar instanceof C9384o4.C9386b) {
            return 128;
        }
        if (uVar instanceof C9566t0.C9568b) {
            return 3164;
        }
        if (uVar instanceof C9205h2.C9207b) {
            return 256;
        }
        if (uVar instanceof Native.C8988a) {
            return 512;
        }
        C9194g1.f23071a.mo59987b(Intrinsics.stringPlus("unexpected AdTypeController: ", uVar));
        return 0;
    }
}
