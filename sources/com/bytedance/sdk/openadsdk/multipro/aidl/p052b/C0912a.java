package com.bytedance.sdk.openadsdk.multipro.aidl.p052b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.b.a */
/* compiled from: AppOpenAdListenerImpl */
public class C0912a extends IAppOpenAdInteractionListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTAppOpenAd.AppOpenAdInteractionListener f3210a;

    /* renamed from: b */
    private Handler f3211b = new Handler(Looper.getMainLooper());

    public C0912a(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f3210a = appOpenAdInteractionListener;
    }

    /* renamed from: a */
    private void m4321a() {
        this.f3210a = null;
        this.f3211b = null;
    }

    /* renamed from: b */
    private Handler m4322b() {
        Handler handler = this.f3211b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f3211b = handler2;
        return handler2;
    }

    public void onDestroy() throws RemoteException {
        m4321a();
    }

    public void onAdShow() throws RemoteException {
        m4322b().post(new Runnable() {
            public void run() {
                if (C0912a.this.f3210a != null) {
                    C0912a.this.f3210a.onAdShow();
                }
            }
        });
    }

    public void onAdClicked() throws RemoteException {
        m4322b().post(new Runnable() {
            public void run() {
                if (C0912a.this.f3210a != null) {
                    C0912a.this.f3210a.onAdClicked();
                }
            }
        });
    }

    public void onAdSkip() throws RemoteException {
        m4322b().post(new Runnable() {
            public void run() {
                if (C0912a.this.f3210a != null) {
                    C0912a.this.f3210a.onAdSkip();
                }
            }
        });
    }

    public void onAdTimeOver() throws RemoteException {
        m4322b().post(new Runnable() {
            public void run() {
                if (C0912a.this.f3210a != null) {
                    C0912a.this.f3210a.onAdCountdownToZero();
                }
            }
        });
    }
}
