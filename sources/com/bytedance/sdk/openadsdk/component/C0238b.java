package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10622b;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0625t;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C0898a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0904b;
import com.bytedance.sdk.openadsdk.multipro.aidl.p052b.C0912a;
import com.bytedance.sdk.openadsdk.utils.C0984l;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.b */
/* compiled from: TTAppOpenAdImpl */
public class C0238b implements TTAppOpenAd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f786a;

    /* renamed from: b */
    private final C0477n f787b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TTAppOpenAd.AppOpenAdInteractionListener f788c;

    /* renamed from: d */
    private final AtomicBoolean f789d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f790e;

    /* renamed from: f */
    private final boolean f791f;

    public C0238b(Context context, C0477n nVar, boolean z) {
        this.f786a = context;
        this.f787b = nVar;
        this.f791f = z;
        this.f790e = C0984l.m4553a();
    }

    public void setOpenAdInteractionListener(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f788c = appOpenAdInteractionListener;
        m933a();
    }

    /* renamed from: a */
    private void m933a() {
        if (C0934b.m4334c()) {
            C10615e.m31168c(new C10618g("AppOpenAd_registerMultiProcessListener") {
                public void run() {
                    C0898a a = C0898a.m4299a(C0238b.this.f786a);
                    if (C0238b.this.f788c != null) {
                        C10638l.m31235b("MultiProcess", "start registerAppOpenListener ! ");
                        IListenerManager asInterface = C0904b.asInterface(a.mo2767a(7));
                        if (asInterface != null) {
                            try {
                                asInterface.registerAppOpenAdListener(C0238b.this.f790e, new C0912a(C0238b.this.f788c));
                                TTAppOpenAd.AppOpenAdInteractionListener unused = C0238b.this.f788c = null;
                                C10638l.m31235b("MultiProcess", "end registerAppOpenAdListener ! ");
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }, 5);
        }
    }

    public void showAppOpenAd(Activity activity) {
        Context context;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        int i = 1;
        if (!this.f789d.getAndSet(true)) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (activity != null) {
                    context = activity;
                } else {
                    context = this.f786a;
                }
                if (context == null) {
                    context = C0558m.m2663a();
                }
                int i2 = 0;
                try {
                    i2 = activity.getWindowManager().getDefaultDisplay().getRotation();
                } catch (Exception unused) {
                }
                Intent intent = new Intent(context, TTAppOpenAdActivity.class);
                intent.putExtra("orientation_angle", i2);
                if (!this.f791f) {
                    i = 2;
                }
                intent.putExtra(FullscreenAdService.DATA_KEY_AD_SOURCE, i);
                if (C0934b.m4334c()) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f787b.mo1397ar().toString());
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f790e);
                } else {
                    C0625t.m3022a().mo2036h();
                    C0625t.m3022a().mo2026a(this.f787b);
                    C0625t.m3022a().mo2023a(this.f788c);
                    this.f788c = null;
                }
                C10622b.m31190a(context, intent, new C10622b.C10623a() {
                    /* renamed from: a */
                    public void mo299a() {
                        C10638l.m31235b("TTAppOpenAdImpl", "app open ad startActivitySuccess");
                    }

                    /* renamed from: a */
                    public void mo300a(Throwable th) {
                        C10638l.m31235b("TTAppOpenAdImpl", "app open ad startActivityFail");
                    }
                });
                return;
            }
            C10638l.m31242e("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
    }
}
