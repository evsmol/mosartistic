package com.appodeal.ads.utils;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.C9326n5;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.utils.exception_handler.C9623a;
import java.util.EnumMap;

/* renamed from: com.appodeal.ads.utils.y */
public final class C9670y {

    /* renamed from: a */
    public static final EnumMap<AdType, Pair<Handler, Runnable>> f24494a = new EnumMap<>(AdType.class);

    /* renamed from: a */
    public static void m28444a(AdType adType) {
        EnumMap<AdType, Pair<Handler, Runnable>> enumMap = f24494a;
        Pair pair = enumMap.get(adType);
        if (pair != null) {
            ((Handler) pair.first).removeCallbacks((Runnable) pair.second);
            enumMap.remove(adType);
        }
    }

    /* renamed from: a */
    public static void m28445a(AdType adType, AdNetwork<?> adNetwork) {
        Handler handler = new Handler(Looper.getMainLooper());
        $$Lambda$7bMj6mZ_Ki8j_SPHJq3YEIOUaKM r1 = new Runnable(adNetwork) {
            public final /* synthetic */ AdNetwork f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9670y.m28446b(AdType.this, this.f$1);
            }
        };
        handler.postDelayed(r1, 3000);
        f24494a.put(adType, new Pair(handler, r1));
    }

    /* renamed from: b */
    public static void m28446b(AdType adType, AdNetwork adNetwork) {
        Log.log(new C9623a(String.format("%s %s was not shown", new Object[]{C9326n5.m27531a(adNetwork.getName()), adType.getDisplayName()})));
        f24494a.remove(adType);
    }
}
