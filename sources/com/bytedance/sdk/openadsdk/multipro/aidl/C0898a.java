package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0904b;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0905c;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0906d;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0907e;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0908f;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0909g;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0910h;
import com.bytedance.sdk.openadsdk.utils.C0996u;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a */
/* compiled from: BinderPool */
public class C0898a {

    /* renamed from: c */
    private static C0898a f3185c = new C0898a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static C0911b f3186d;

    /* renamed from: a */
    private Context f3187a = C0558m.m2663a().getApplicationContext();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public IBinderPool f3188b;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f3189e = 0;

    /* renamed from: f */
    private ServiceConnection f3190f = new ServiceConnection() {
        public void onServiceDisconnected(ComponentName componentName) {
            C10638l.m31238c("MultiProcess", "BinderPool......onServiceDisconnected");
        }

        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C10615e.m31160a(new C10618g("onServiceConnected") {
                public void run() {
                    IBinderPool unused = C0898a.this.f3188b = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        C0898a.this.f3188b.asBinder().linkToDeath(C0898a.this.f3191g, 0);
                    } catch (RemoteException e) {
                        C10638l.m31239c("MultiProcess", "onServiceConnected throws :", e);
                    }
                    C10638l.m31235b("MultiProcess", "onServiceConnected - binderService consume time ：" + (System.currentTimeMillis() - C0898a.this.f3189e));
                    if (C0898a.f3186d != null) {
                        C0898a.f3186d.mo2792a();
                    }
                }
            }, 5);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: g */
    public IBinder.DeathRecipient f3191g = new IBinder.DeathRecipient() {
        public void binderDied() {
            C10615e.m31160a(new C10618g("binderDied") {
                public void run() {
                    C10638l.m31241d("MultiProcess", "binder died.");
                    C0898a.this.f3188b.asBinder().unlinkToDeath(C0898a.this.f3191g, 0);
                    IBinderPool unused = C0898a.this.f3188b = null;
                    C0898a.this.m4304c();
                }
            }, 5);
        }
    };

    private C0898a() {
        m4304c();
    }

    /* renamed from: a */
    public static C0898a m4299a(Context context) {
        return f3185c;
    }

    /* renamed from: a */
    public void mo2768a() {
        this.f3187a.bindService(new Intent(this.f3187a, BinderPoolService.class), this.f3190f, 1);
        this.f3189e = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static void m4300a(C0911b bVar) {
        f3186d = bVar;
    }

    /* renamed from: a */
    public IBinder mo2767a(int i) {
        try {
            if (C0934b.m4334c()) {
                try {
                    if (this.f3188b != null) {
                        return this.f3188b.queryBinder(i);
                    }
                    return null;
                } catch (RemoteException e) {
                    e.printStackTrace();
                    C0996u.m4683l("queryBinder error");
                    return null;
                }
            } else if (i == 0) {
                return C0910h.m4317a();
            } else {
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
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m4304c() {
        if (C0934b.m4334c()) {
            C10638l.m31238c("MultiProcess", "BinderPool......connectBinderPoolService");
            mo2768a();
        }
    }
}
