package com.bytedance.sdk.openadsdk.multipro.aidl.p051a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.d */
/* compiled from: CommonPermissionListenerManagerImpl */
public class C0906d extends C0903a {

    /* renamed from: a */
    private static HashMap<String, RemoteCallbackList<ICommonPermissionListener>> f3201a = new HashMap<>();

    /* renamed from: b */
    private static volatile C0906d f3202b;

    /* renamed from: a */
    public static C0906d m4311a() {
        if (f3202b == null) {
            synchronized (C0906d.class) {
                if (f3202b == null) {
                    f3202b = new C0906d();
                }
            }
        }
        return f3202b;
    }

    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener != null) {
            C10638l.m31235b("MultiProcess", "CommonPermissionListenerManagerImpl registerPermissionListener");
            RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
            remoteCallbackList.register(iCommonPermissionListener);
            f3201a.put(str, remoteCallbackList);
        }
    }

    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        C10638l.m31235b("MultiProcess", "00000 CommonPermissionListenerManagerImpl broadcastDialogListener: 00000" + String.valueOf(str) + ", " + str2);
        RemoteCallbackList remove = f3201a.remove(str);
        if (remove != null) {
            int beginBroadcast = remove.beginBroadcast();
            for (int i = 0; i < beginBroadcast; i++) {
                ICommonPermissionListener iCommonPermissionListener = (ICommonPermissionListener) remove.getBroadcastItem(i);
                if (iCommonPermissionListener != null) {
                    C10638l.m31235b("MultiProcess", "CommonPermissionListenerManagerImpl broadcastDialogListener: " + String.valueOf(str) + ", " + str2);
                    if (str2 == null) {
                        iCommonPermissionListener.onGranted();
                    } else {
                        iCommonPermissionListener.onDenied(str2);
                    }
                }
            }
            remove.finishBroadcast();
            remove.kill();
        }
    }
}
