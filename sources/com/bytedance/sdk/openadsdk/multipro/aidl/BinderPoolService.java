package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0904b;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0905c;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0906d;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0907e;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0908f;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0909g;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0910h;

public class BinderPoolService extends Service {

    /* renamed from: a */
    private Binder f3184a = new C0897a();

    public void onCreate() {
        super.onCreate();
        C10638l.m31235b("MultiProcess", "BinderPoolService has been created ! ");
    }

    public IBinder onBind(Intent intent) {
        C10638l.m31235b("MultiProcess", "BinderPoolService onBind ! ");
        return this.f3184a;
    }

    public void onDestroy() {
        super.onDestroy();
        C10638l.m31235b("MultiProcess", "BinderPoolService is destroy ! ");
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService$a */
    public static class C0897a extends IBinderPool.Stub {
        public IBinder queryBinder(int i) throws RemoteException {
            C10638l.m31238c("MultiProcess", "queryBinder...........binderCode=" + i);
            if (i == 0) {
                return C0910h.m4317a();
            }
            if (i == 1) {
                return C0908f.m4314a();
            }
            if (i == 2) {
                return C0905c.m4310a();
            }
            if (i == 4) {
                return C0906d.m4311a();
            }
            if (i == 5) {
                return C0909g.m4316a();
            }
            if (i == 6) {
                return C0907e.m4312a();
            }
            if (i != 7) {
                return null;
            }
            return C0904b.m4308a();
        }
    }
}
