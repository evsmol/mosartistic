package com.bytedance.sdk.openadsdk.multipro.aidl.p051a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.b */
/* compiled from: AppOpenAdListenerManagerImpl */
public class C0904b extends C0903a {

    /* renamed from: a */
    private static Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> f3197a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static volatile C0904b f3198b;

    /* renamed from: a */
    public static C0904b m4308a() {
        if (f3198b == null) {
            synchronized (C0904b.class) {
                if (f3198b == null) {
                    f3198b = new C0904b();
                }
            }
        }
        return f3198b;
    }

    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        f3197a.put(str, remoteCallbackList);
    }

    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        m4309a(str, str2);
    }

    /* renamed from: a */
    private synchronized void m4309a(String str, String str2) {
        RemoteCallbackList remoteCallbackList;
        try {
            if (f3197a != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = f3197a.remove(str);
                } else {
                    remoteCallbackList = f3197a.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < beginBroadcast; i++) {
                        IAppOpenAdInteractionListener iAppOpenAdInteractionListener = (IAppOpenAdInteractionListener) remoteCallbackList.getBroadcastItem(i);
                        if (iAppOpenAdInteractionListener != null) {
                            if ("onAdShow".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdShow();
                            } else if ("onAdClicked".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdClicked();
                            } else if ("onAdSkip".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdSkip();
                            } else if ("onAdTimeOver".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdTimeOver();
                            } else if ("recycleRes".equals(str2)) {
                                iAppOpenAdInteractionListener.onDestroy();
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
            C10638l.m31239c("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th);
        }
        return;
    }
}
