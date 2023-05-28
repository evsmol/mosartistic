package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.sdk.C8477l;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8561a;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.m */
public class C8483m implements C8477l.C8482a, AppLovinWebViewActivity.EventListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final AtomicBoolean f21301a = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static WeakReference<AppLovinWebViewActivity> f21302b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8490n f21303c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C8626v f21304d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AppLovinUserService.OnConsentDialogDismissListener f21305e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8477l f21306f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public WeakReference<Activity> f21307g = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8561a f21308h;

    /* renamed from: i */
    private AtomicBoolean f21309i = new AtomicBoolean();

    C8483m(C8490n nVar) {
        this.f21303c = nVar;
        this.f21304d = nVar.mo57320D();
        if (nVar.mo57333R() != null) {
            this.f21307g = new WeakReference<>(nVar.mo57333R());
        }
        C8490n.m25594a(C8490n.m25593Q()).mo56832a(new C8561a() {
            public void onActivityStarted(Activity activity) {
                WeakReference unused = C8483m.this.f21307g = new WeakReference(activity);
            }
        });
        this.f21306f = new C8477l(this, nVar);
    }

    /* renamed from: a */
    private void m25576a(boolean z, long j) {
        m25584g();
        if (z) {
            mo57309a(j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m25578a(C8490n nVar) {
        String str;
        if (mo57312d()) {
            str = "Consent dialog already showing";
        } else if (!C8572i.m26102a(nVar.mo57332P())) {
            str = "No internet available, skip showing of consent dialog";
        } else if (!((Boolean) nVar.mo57342a(C8380b.f20700aB)).booleanValue()) {
            if (C8626v.m26252a()) {
                this.f21304d.mo57822e("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        } else if (StringUtils.isValidString((String) nVar.mo57342a(C8380b.f20701aC))) {
            return true;
        } else {
            if (C8626v.m26252a()) {
                this.f21304d.mo57822e("ConsentDialogManager", "AdServer returned empty consent dialog URL");
            }
            return false;
        }
        C8626v.m26258i("AppLovinSdk", str);
        return false;
    }

    /* renamed from: g */
    private void m25584g() {
        this.f21303c.mo57368ai().mo56834b(this.f21308h);
        if (mo57312d()) {
            AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) f21302b.get();
            f21302b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f21305e;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f21305e = null;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo57307a() {
        final Activity activity = (Activity) this.f21307g.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C8483m.this.mo57310a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.f21303c.mo57342a(C8380b.f20703aE)).longValue());
        }
    }

    /* renamed from: a */
    public void mo57309a(final long j) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                C8626v unused = C8483m.this.f21304d;
                if (C8626v.m26252a()) {
                    C8483m.this.f21304d.mo57818b("ConsentDialogManager", "Scheduling repeating consent alert");
                }
                C8483m.this.f21306f.mo57302a(j, C8483m.this.f21303c, C8483m.this);
            }
        });
    }

    /* renamed from: a */
    public void mo57310a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() {
            public void run() {
                C8483m mVar = C8483m.this;
                if (!mVar.m25578a(mVar.f21303c) || C8483m.f21301a.getAndSet(true)) {
                    AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = onConsentDialogDismissListener;
                    if (onConsentDialogDismissListener != null) {
                        onConsentDialogDismissListener.onDismiss();
                        return;
                    }
                    return;
                }
                WeakReference unused = C8483m.this.f21307g = new WeakReference(activity);
                AppLovinUserService.OnConsentDialogDismissListener unused2 = C8483m.this.f21305e = onConsentDialogDismissListener;
                C8561a unused3 = C8483m.this.f21308h = new C8561a() {
                    public void onActivityStarted(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            if (!C8483m.this.mo57312d() || C8483m.f21302b.get() != activity) {
                                AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity;
                                WeakReference unused = C8483m.f21302b = new WeakReference(appLovinWebViewActivity);
                                appLovinWebViewActivity.loadUrl((String) C8483m.this.f21303c.mo57342a(C8380b.f20701aC), C8483m.this);
                            }
                            C8483m.f21301a.set(false);
                        }
                    }
                };
                C8483m.this.f21303c.mo57368ai().mo56832a(C8483m.this.f21308h);
                Intent intent = new Intent(activity, AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, C8483m.this.f21303c.mo57319C());
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) C8483m.this.f21303c.mo57342a(C8380b.f20702aD));
                activity.startActivity(intent);
            }
        });
    }

    /* renamed from: b */
    public void mo57308b() {
    }

    /* renamed from: c */
    public void mo57311c() {
        if (!this.f21309i.getAndSet(true)) {
            final String str = (String) this.f21303c.mo57342a(C8380b.f20701aC);
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    WebView tryToCreateWebView = Utils.tryToCreateWebView(C8483m.this.f21303c.mo57332P(), "preloading consent dialog");
                    if (tryToCreateWebView != null) {
                        tryToCreateWebView.loadUrl(str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo57312d() {
        WeakReference<AppLovinWebViewActivity> weakReference = f21302b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void onReceivedEvent(String str) {
        boolean booleanValue;
        C8490n nVar;
        C8380b bVar;
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, this.f21303c.mo57332P());
            m25584g();
            return;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, this.f21303c.mo57332P());
            booleanValue = ((Boolean) this.f21303c.mo57342a(C8380b.f20704aF)).booleanValue();
            nVar = this.f21303c;
            bVar = C8380b.f20709aK;
        } else if ("closed".equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f21303c.mo57342a(C8380b.f20705aG)).booleanValue();
            nVar = this.f21303c;
            bVar = C8380b.f20710aL;
        } else if (AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f21303c.mo57342a(C8380b.f20706aH)).booleanValue();
            nVar = this.f21303c;
            bVar = C8380b.f20711aM;
        } else {
            return;
        }
        m25576a(booleanValue, ((Long) nVar.mo57342a(bVar)).longValue());
    }
}
