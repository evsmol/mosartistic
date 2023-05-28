package com.bytedance.sdk.openadsdk.multipro.aidl.p052b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.b.d */
/* compiled from: RewardVideoListenerImpl */
public class C0925d extends IRewardAdInteractionListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTRewardVideoAd.RewardAdInteractionListener f3227a;

    /* renamed from: b */
    private Handler f3228b = new Handler(Looper.getMainLooper());

    public C0925d(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f3227a = rewardAdInteractionListener;
    }

    /* renamed from: a */
    private void m4330a() {
        this.f3227a = null;
        this.f3228b = null;
    }

    /* renamed from: b */
    private Handler m4331b() {
        Handler handler = this.f3228b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f3228b = handler2;
        return handler2;
    }

    public void onDestroy() throws RemoteException {
        m4330a();
    }

    public void onAdShow() throws RemoteException {
        m4331b().post(new Runnable() {
            public void run() {
                if (C0925d.this.f3227a != null) {
                    C0925d.this.f3227a.onAdShow();
                }
            }
        });
    }

    public void onAdVideoBarClick() throws RemoteException {
        m4331b().post(new Runnable() {
            public void run() {
                if (C0925d.this.f3227a != null) {
                    C0925d.this.f3227a.onAdVideoBarClick();
                }
            }
        });
    }

    public void onAdClose() throws RemoteException {
        m4331b().post(new Runnable() {
            public void run() {
                if (C0925d.this.f3227a != null) {
                    C0925d.this.f3227a.onAdClose();
                }
            }
        });
    }

    public void onVideoComplete() throws RemoteException {
        m4331b().post(new Runnable() {
            public void run() {
                if (C0925d.this.f3227a != null) {
                    C0925d.this.f3227a.onVideoComplete();
                }
            }
        });
    }

    public void onVideoError() throws RemoteException {
        m4331b().post(new Runnable() {
            public void run() {
                if (C0925d.this.f3227a != null) {
                    C0925d.this.f3227a.onVideoError();
                }
            }
        });
    }

    public void onSkippedVideo() throws RemoteException {
        m4331b().post(new Runnable() {
            public void run() {
                if (C0925d.this.f3227a != null) {
                    C0925d.this.f3227a.onSkippedVideo();
                }
            }
        });
    }

    public void onRewardVerify(boolean z, int i, String str, int i2, String str2) throws RemoteException {
        final boolean z2 = z;
        final int i3 = i;
        final String str3 = str;
        final int i4 = i2;
        final String str4 = str2;
        m4331b().post(new Runnable() {
            public void run() {
                if (C0925d.this.f3227a != null) {
                    C0925d.this.f3227a.onRewardVerify(z2, i3, str3, i4, str4);
                }
            }
        });
    }
}
