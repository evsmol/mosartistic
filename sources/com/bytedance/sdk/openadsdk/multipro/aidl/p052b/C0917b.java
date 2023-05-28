package com.bytedance.sdk.openadsdk.multipro.aidl.p052b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C0424a;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.b.b */
/* compiled from: DislikeClosedListenerImpl */
public class C0917b extends IDislikeClosedListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0424a.C0431a f3216a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f3217b;

    /* renamed from: c */
    private Handler f3218c = new Handler(Looper.getMainLooper());

    public C0917b(String str, C0424a.C0431a aVar) {
        this.f3217b = str;
        this.f3216a = aVar;
    }

    /* renamed from: a */
    private Handler m4323a() {
        Handler handler = this.f3218c;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f3218c = handler2;
        return handler2;
    }

    public void onItemClickClosed() throws RemoteException {
        m4323a().post(new Runnable() {
            public void run() {
                if (C0917b.this.f3216a != null) {
                    C0917b.this.f3216a.mo1168a();
                    TTDislikeListView.m3845a(6, C0917b.this.f3217b);
                }
            }
        });
    }
}
