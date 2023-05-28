package com.bytedance.sdk.openadsdk.multipro.aidl.p051a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.h */
/* compiled from: RewardAdVideoListenerManagerImpl */
public class C0910h extends C0903a {

    /* renamed from: a */
    private static Map<String, RemoteCallbackList<IRewardAdInteractionListener>> f3208a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static volatile C0910h f3209b;

    /* renamed from: a */
    public static C0910h m4317a() {
        if (f3209b == null) {
            synchronized (C0910h.class) {
                if (f3209b == null) {
                    f3209b = new C0910h();
                }
            }
        }
        return f3209b;
    }

    public synchronized void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iRewardAdInteractionListener);
        f3208a.put(str, remoteCallbackList);
    }

    public void executeRewardVideoCallback(String str, String str2, boolean z, int i, String str3, int i2, String str4) throws RemoteException {
        m4318a(str, str2, z, i, str3, i2, str4);
    }

    /* renamed from: a */
    private synchronized void m4318a(String str, String str2, boolean z, int i, String str3, int i2, String str4) {
        RemoteCallbackList remoteCallbackList;
        String str5 = str;
        String str6 = str2;
        synchronized (this) {
            try {
                if (f3208a != null) {
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList = f3208a.remove(str);
                    } else {
                        remoteCallbackList = f3208a.get(str);
                    }
                    RemoteCallbackList remoteCallbackList2 = remoteCallbackList;
                    if (remoteCallbackList2 != null) {
                        int beginBroadcast = remoteCallbackList2.beginBroadcast();
                        for (int i3 = 0; i3 < beginBroadcast; i3++) {
                            IRewardAdInteractionListener iRewardAdInteractionListener = (IRewardAdInteractionListener) remoteCallbackList2.getBroadcastItem(i3);
                            if (iRewardAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iRewardAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iRewardAdInteractionListener.onAdClose();
                                } else if ("onVideoComplete".equals(str2)) {
                                    iRewardAdInteractionListener.onVideoComplete();
                                } else if ("onVideoError".equals(str2)) {
                                    iRewardAdInteractionListener.onVideoError();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iRewardAdInteractionListener.onAdVideoBarClick();
                                } else if ("onRewardVerify".equals(str2)) {
                                    iRewardAdInteractionListener.onRewardVerify(z, i, str3, i2, str4);
                                } else if ("onSkippedVideo".equals(str2)) {
                                    iRewardAdInteractionListener.onSkippedVideo();
                                } else if ("recycleRes".equals(str2)) {
                                    iRewardAdInteractionListener.onDestroy();
                                }
                            }
                        }
                        remoteCallbackList2.finishBroadcast();
                        if ("recycleRes".equals(str2)) {
                            remoteCallbackList2.kill();
                        }
                    }
                }
            } catch (Throwable th) {
                C10638l.m31239c("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th);
            }
        }
        return;
    }
}
