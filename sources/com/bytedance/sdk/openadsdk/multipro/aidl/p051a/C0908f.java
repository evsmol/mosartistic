package com.bytedance.sdk.openadsdk.multipro.aidl.p051a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.f */
/* compiled from: FullScreenVideoListenerManagerImpl */
public class C0908f extends C0903a {

    /* renamed from: a */
    private static Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> f3205a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static volatile C0908f f3206b;

    /* renamed from: a */
    public static C0908f m4314a() {
        if (f3206b == null) {
            synchronized (C0908f.class) {
                if (f3206b == null) {
                    f3206b = new C0908f();
                }
            }
        }
        return f3206b;
    }

    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        f3205a.put(str, remoteCallbackList);
    }

    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        m4315a(str, str2);
    }

    /* renamed from: a */
    private synchronized void m4315a(String str, String str2) {
        RemoteCallbackList remoteCallbackList;
        try {
            if (f3205a != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = f3205a.remove(str);
                } else {
                    remoteCallbackList = f3205a.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < beginBroadcast; i++) {
                        IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener = (IFullScreenVideoAdInteractionListener) remoteCallbackList.getBroadcastItem(i);
                        if (iFullScreenVideoAdInteractionListener != null) {
                            if ("onAdShow".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onAdShow();
                            } else if ("onAdClose".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onAdClose();
                            } else if ("onVideoComplete".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onVideoComplete();
                            } else if ("onSkippedVideo".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onSkippedVideo();
                            } else if ("onAdVideoBarClick".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onAdVideoBarClick();
                            } else if ("recycleRes".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onDestroy();
                            }
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th) {
            C10638l.m31239c("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th);
        }
        return;
    }
}
