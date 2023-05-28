package com.bytedance.sdk.openadsdk.multipro.aidl.p052b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.b.c */
/* compiled from: FullScreenVideoListenerImpl */
public class C0919c extends IFullScreenVideoAdInteractionListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f3220a;

    /* renamed from: b */
    private Handler f3221b = new Handler(Looper.getMainLooper());

    public C0919c(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f3220a = fullScreenVideoAdInteractionListener;
    }

    /* renamed from: a */
    private void m4327a() {
        this.f3220a = null;
        this.f3221b = null;
    }

    /* renamed from: b */
    private Handler m4328b() {
        Handler handler = this.f3221b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f3221b = handler2;
        return handler2;
    }

    public void onDestroy() throws RemoteException {
        m4327a();
    }

    public void onAdShow() throws RemoteException {
        m4328b().post(new Runnable() {
            public void run() {
                if (C0919c.this.f3220a != null) {
                    C0919c.this.f3220a.onAdShow();
                }
            }
        });
    }

    public void onAdVideoBarClick() throws RemoteException {
        m4328b().post(new Runnable() {
            public void run() {
                if (C0919c.this.f3220a != null) {
                    C0919c.this.f3220a.onAdVideoBarClick();
                }
            }
        });
    }

    public void onAdClose() throws RemoteException {
        m4328b().post(new Runnable() {
            public void run() {
                if (C0919c.this.f3220a != null) {
                    C0919c.this.f3220a.onAdClose();
                }
            }
        });
    }

    public void onVideoComplete() throws RemoteException {
        m4328b().post(new Runnable() {
            public void run() {
                if (C0919c.this.f3220a != null) {
                    C0919c.this.f3220a.onVideoComplete();
                }
            }
        });
    }

    public void onSkippedVideo() throws RemoteException {
        m4328b().post(new Runnable() {
            public void run() {
                if (C0919c.this.f3220a != null) {
                    C0919c.this.f3220a.onSkippedVideo();
                }
            }
        });
    }
}
