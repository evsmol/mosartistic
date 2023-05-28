package com.bytedance.sdk.openadsdk.multipro.aidl.p051a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.e */
/* compiled from: DislikeClosedListenerManagerImpl */
public class C0907e extends C0903a {

    /* renamed from: a */
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> f3203a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static volatile C0907e f3204b;

    /* renamed from: a */
    public static C0907e m4312a() {
        if (f3204b == null) {
            synchronized (C0907e.class) {
                if (f3204b == null) {
                    f3204b = new C0907e();
                }
            }
        }
        return f3204b;
    }

    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iDislikeClosedListener);
        f3203a.put(str, remoteCallbackList);
    }

    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (!TextUtils.isEmpty(str)) {
            f3203a.remove(str);
        }
    }

    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        m4313a(str, str2);
    }

    /* renamed from: a */
    private synchronized void m4313a(String str, String str2) {
        RemoteCallbackList remoteCallbackList;
        try {
            if (!(f3203a == null || (remoteCallbackList = f3203a.get(str)) == null)) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i = 0; i < beginBroadcast; i++) {
                    IDislikeClosedListener iDislikeClosedListener = (IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i);
                    if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                        iDislikeClosedListener.onItemClickClosed();
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            C10638l.m31239c("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
        }
        return;
    }
}
