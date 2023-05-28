package com.appodeal.ads.utils;

import android.os.Handler;
import android.os.Looper;
import com.appodeal.ads.C9258l;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: com.appodeal.ads.utils.o */
public final class C9640o {

    /* renamed from: a */
    public static final Handler f24430a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static HashMap f24431b = new HashMap();

    /* renamed from: com.appodeal.ads.utils.o$a */
    public static class C9641a implements Runnable {

        /* renamed from: a */
        public final C9258l f24432a;

        /* renamed from: b */
        public final C9642b f24433b;

        /* renamed from: c */
        public final long f24434c;

        public C9641a(C9258l lVar, C9642b bVar) {
            this.f24432a = lVar;
            this.f24433b = bVar;
            this.f24434c = (lVar.getExpTime() * 1000) + System.currentTimeMillis();
        }

        public final void run() {
            C9640o.m28398b(this.f24432a);
            C9642b bVar = this.f24433b;
            if (bVar != null) {
                bVar.mo59118a(this.f24432a);
            }
        }
    }

    /* renamed from: com.appodeal.ads.utils.o$b */
    public interface C9642b<AdObjectType extends C9258l> {
        /* renamed from: a */
        void mo59118a(AdObjectType adobjecttype);
    }

    /* renamed from: a */
    public static void m28396a(C9258l lVar) {
        C9641a aVar;
        if (lVar != null && lVar.f23269c.getExpTime() > 0 && (aVar = (C9641a) f24431b.get(lVar)) != null) {
            long currentTimeMillis = aVar.f24434c - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                Runnable runnable = (Runnable) f24431b.get(lVar);
                if (runnable != null) {
                    f24430a.removeCallbacks(runnable);
                }
                f24430a.postDelayed(aVar, currentTimeMillis);
                return;
            }
            aVar.run();
        }
    }

    /* renamed from: a */
    public static void m28397a(Collection<? extends C9258l> collection) {
        if (collection != null) {
            for (C9258l b : collection) {
                m28398b(b);
            }
        }
    }

    /* renamed from: b */
    public static void m28398b(C9258l lVar) {
        if (lVar != null) {
            Runnable runnable = (Runnable) f24431b.get(lVar);
            if (runnable != null) {
                f24430a.removeCallbacks(runnable);
            }
            f24431b.remove(lVar);
        }
    }
}
