package com.bytedance.sdk.openadsdk.multipro.aidl.p051a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonDialogListener;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.c */
/* compiled from: CommonDialogListenerManagerImpl */
public class C0905c extends C0903a {

    /* renamed from: a */
    public static HashMap<String, RemoteCallbackList<ICommonDialogListener>> f3199a = new HashMap<>();

    /* renamed from: b */
    private static volatile C0905c f3200b;

    /* renamed from: a */
    public static C0905c m4310a() {
        if (f3200b == null) {
            synchronized (C0905c.class) {
                if (f3200b == null) {
                    f3200b = new C0905c();
                }
            }
        }
        return f3200b;
    }

    public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
        if (iCommonDialogListener != null) {
            RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
            remoteCallbackList.register(iCommonDialogListener);
            f3199a.put(str, remoteCallbackList);
        }
    }

    public void broadcastDialogListener(String str, int i) throws RemoteException {
        RemoteCallbackList remove = f3199a.remove(str);
        if (remove != null) {
            int beginBroadcast = remove.beginBroadcast();
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                ICommonDialogListener iCommonDialogListener = (ICommonDialogListener) remove.getBroadcastItem(i2);
                if (iCommonDialogListener != null) {
                    if (i == 1) {
                        iCommonDialogListener.onDialogBtnYes();
                    } else if (i == 2) {
                        iCommonDialogListener.onDialogBtnNo();
                    } else if (i != 3) {
                        iCommonDialogListener.onDialogCancel();
                    } else {
                        iCommonDialogListener.onDialogCancel();
                    }
                }
            }
            remove.finishBroadcast();
            remove.kill();
        }
    }
}
