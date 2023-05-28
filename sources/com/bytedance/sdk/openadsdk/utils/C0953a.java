package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.adexpress.C10261a;
import com.bytedance.sdk.component.p323e.p326c.C10584a;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.C0547k;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.openadsdk.utils.a */
/* compiled from: ActivityLifecycleListener */
public class C0953a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static boolean f3272a = false;

    /* renamed from: b */
    public static long f3273b;

    /* renamed from: c */
    public static long f3274c;

    /* renamed from: d */
    private AtomicInteger f3275d = new AtomicInteger(0);

    /* renamed from: e */
    private AtomicBoolean f3276e = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public HashSet<Integer> f3277f = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0957a f3278g = new C0957a();

    /* renamed from: h */
    private volatile CopyOnWriteArrayList<C10261a> f3279h = new CopyOnWriteArrayList<>();

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        if (this.f3275d.incrementAndGet() > 0) {
            this.f3276e.set(false);
        }
    }

    public void onActivityResumed(final Activity activity) {
        C10615e.m31160a(new C10618g("AppConfig_onActivityResume") {
            public void run() {
                C0547k.m2621c().removeMessages(1001);
                if (activity != null) {
                    C0953a.this.f3277f.add(Integer.valueOf(activity.hashCode()));
                    C10584a.m31052b((Context) activity);
                }
            }
        }, 5);
        if (!f3272a) {
            f3273b = System.currentTimeMillis();
            f3272a = true;
        }
    }

    public void onActivityPaused(Activity activity) {
        C10615e.m31160a(new C10618g("AppConfig_onActivityResume") {
            public void run() {
                Handler c = C0547k.m2621c();
                Message obtain = Message.obtain(c, C0953a.this.f3278g);
                obtain.what = 1001;
                c.sendMessageDelayed(obtain, 30000);
            }
        }, 5);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.a$a */
    /* compiled from: ActivityLifecycleListener */
    static class C0957a implements Runnable {
        C0957a() {
        }

        public void run() {
            C10615e.m31163b().execute(new C10618g("reportPvFromBackGround") {
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    public void onActivityStopped(Activity activity) {
        if (this.f3275d.decrementAndGet() == 0) {
            this.f3276e.set(true);
        }
        m4461b();
    }

    public void onActivityDestroyed(Activity activity) {
        if (activity != null) {
            this.f3277f.remove(Integer.valueOf(activity.hashCode()));
        }
        if (this.f3279h != null && this.f3279h.size() > 0) {
            Iterator<C10261a> it = this.f3279h.iterator();
            while (it.hasNext()) {
                C10261a next = it.next();
                if (next != null) {
                    next.mo63089a(activity);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2881a(C10261a aVar) {
        this.f3279h.add(new WeakReference(aVar).get());
    }

    /* renamed from: b */
    public boolean mo2883b(C10261a aVar) {
        return this.f3279h.remove(new WeakReference(aVar).get());
    }

    /* renamed from: a */
    public boolean mo2882a() {
        return this.f3276e.get();
    }

    /* renamed from: b */
    private void m4461b() {
        C10615e.m31165b((C10618g) new C10618g("reportSdkUseTime") {
            public void run() {
                if (C0953a.this.mo2882a()) {
                    C0953a.f3272a = false;
                    C0953a.f3274c = System.currentTimeMillis();
                    C0796b.m3985a().mo2602a(C0953a.f3273b / 1000, C0953a.f3274c / 1000, C0547k.f2053b.get() ^ true ? 1 : 0);
                    C0547k.f2053b.set(false);
                }
            }
        });
    }
}
