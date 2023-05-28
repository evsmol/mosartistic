package com.applovin.impl.adview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.activity.p232b.C7905a;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p252ad.C8357g;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8394f;
import com.applovin.impl.sdk.utils.C8562b;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.adview.o */
public class C8010o implements AppLovinInterstitialAdDialog {

    /* renamed from: a */
    protected final C8490n f19342a;

    /* renamed from: b */
    private final WeakReference<Context> f19343b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile AppLovinAdLoadListener f19344c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile AppLovinAdDisplayListener f19345d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile AppLovinAdVideoPlaybackListener f19346e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile AppLovinAdClickListener f19347f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile C8350e f19348g;

    public C8010o(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (context != null) {
            this.f19342a = appLovinSdk.coreSdk;
            this.f19343b = new WeakReference<>(context);
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23780a(final int i) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C8010o.this.f19344c != null) {
                    C8010o.this.f19344c.failedToReceiveAd(i);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23781a(Context context) {
        Intent intent = new Intent(context, AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f19342a.mo57319C());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: a */
    private void m23785a(C8350e eVar, final Context context) {
        m23797f();
        this.f19348g = eVar;
        final long max = Math.max(0, ((Long) this.f19342a.mo57342a(C8380b.f20849ct)).longValue());
        this.f19342a.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = this.f19342a.mo57320D();
            D.mo57818b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        m23786a(eVar, context, (Runnable) new Runnable() {
            public void run() {
                new Handler(context.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        C8010o.this.f19342a.mo57320D();
                        if (C8626v.m26252a()) {
                            C8010o.this.f19342a.mo57320D().mo57818b("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
                        }
                        C8010o.this.m23781a(context);
                    }
                }, max);
            }
        });
    }

    /* renamed from: a */
    private void m23786a(C8350e eVar, Context context, final Runnable runnable) {
        if (!TextUtils.isEmpty(eVar.mo56956N()) || !eVar.mo56993ah() || C8572i.m26102a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(eVar.mo56994ai()).setMessage(eVar.mo56995aj()).setPositiveButton(eVar.mo56996ak(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        create.show();
    }

    /* renamed from: a */
    private void m23787a(C8350e eVar, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, Context context) {
        m23797f();
        this.f19348g = eVar;
        final long max = Math.max(0, ((Long) this.f19342a.mo57342a(C8380b.f20849ct)).longValue());
        this.f19342a.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = this.f19342a.mo57320D();
            D.mo57818b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        final Context context2 = context;
        final ViewGroup viewGroup2 = viewGroup;
        final AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver2 = appLovinFullscreenAdViewObserver;
        m23786a(eVar, context, (Runnable) new Runnable() {
            public void run() {
                new Handler(context2.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        C8010o.this.f19342a.mo57320D();
                        if (C8626v.m26252a()) {
                            C8626v D = C8010o.this.f19342a.mo57320D();
                            D.mo57818b("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup2 + ")");
                        }
                        viewGroup2.setBackgroundColor(-16777216);
                        C7905a.m23400a(C8010o.this.f19348g, C8010o.this.f19347f, C8010o.this.f19345d, C8010o.this.f19346e, C8010o.this.f19342a, (Activity) context2, new C7905a.C7919a() {
                            /* renamed from: a */
                            public void mo52368a(C7905a aVar) {
                                if (C8562b.m26058a((Activity) context2)) {
                                    C8626v.m26258i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                                    C8010o.m23788a(C8010o.this.f19348g, C8010o.this.f19345d, "Failed to show interstitial: attempting to show ad when parent activity is finishing", (Throwable) null, (AppLovinFullscreenActivity) null);
                                    return;
                                }
                                appLovinFullscreenAdViewObserver2.setPresenter(aVar);
                                try {
                                    aVar.mo55540a(viewGroup2);
                                } catch (Throwable th) {
                                    String str = "Failed to show interstitial: presenter threw exception " + th;
                                    C8626v.m26258i("InterstitialAdDialogWrapper", str);
                                    C8010o.m23788a(C8010o.this.f19348g, C8010o.this.f19345d, str, (Throwable) null, (AppLovinFullscreenActivity) null);
                                }
                            }

                            /* renamed from: a */
                            public void mo52369a(String str, Throwable th) {
                                C8010o.m23788a(C8010o.this.f19348g, C8010o.this.f19345d, str, th, (AppLovinFullscreenActivity) null);
                            }
                        });
                    }
                }, max);
            }
        });
    }

    /* renamed from: a */
    public static void m23788a(C8350e eVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        C8626v.m26254c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof C8357g) {
            C8575k.m26145a(appLovinAdDisplayListener, str);
        } else {
            C8575k.m26157b(appLovinAdDisplayListener, (AppLovinAd) eVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    /* renamed from: a */
    private void m23789a(AppLovinAd appLovinAd) {
        if (this.f19345d != null) {
            this.f19345d.adHidden(appLovinAd);
        }
    }

    /* renamed from: a */
    private void m23790a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f19342a.mo57406v().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    /* renamed from: a */
    private boolean m23791a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        String str;
        if (context == null) {
            str = "Failed to show interstitial: stale activity reference provided";
        } else if (appLovinAd == null) {
            str = "Failed to show ad: " + appLovinAd2;
        } else if (((AppLovinAdImpl) appLovinAd).hasShown() && ((Boolean) this.f19342a.mo57342a(C8380b.f20837ch)).booleanValue()) {
            throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
        } else if (appLovinAd instanceof C8350e) {
            return true;
        } else {
            this.f19342a.mo57320D();
            if (C8626v.m26252a()) {
                this.f19342a.mo57320D().mo57822e("InterstitialAdDialogWrapper", "Failed to show interstitial: unknown ad type provided: '" + appLovinAd + "'");
            }
            return false;
        }
        C8626v.m26258i("InterstitialAdDialogWrapper", str);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m23793b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C8010o.this.f19344c != null) {
                    C8010o.this.f19344c.adReceived(appLovinAd);
                }
            }
        });
    }

    /* renamed from: f */
    private void m23797f() {
        if (this.f19342a.mo57368ai().mo56833b() == null) {
            this.f19342a.mo57338W().mo57151a(C8394f.f21096o);
        }
    }

    /* renamed from: g */
    private Context m23798g() {
        return (Context) this.f19343b.get();
    }

    /* renamed from: a */
    public void mo55767a() {
        this.f19347f = null;
        this.f19344c = null;
        this.f19346e = null;
        this.f19345d = null;
    }

    /* renamed from: b */
    public AppLovinAdDisplayListener mo55768b() {
        return this.f19345d;
    }

    /* renamed from: c */
    public AppLovinAdVideoPlaybackListener mo55769c() {
        return this.f19346e;
    }

    /* renamed from: d */
    public AppLovinAdClickListener mo55770d() {
        return this.f19347f;
    }

    /* renamed from: e */
    public C8350e mo55771e() {
        return this.f19348g;
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f19347f = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f19345d = appLovinAdDisplayListener;
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f19344c = appLovinAdLoadListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f19346e = appLovinAdVideoPlaybackListener;
    }

    public void show() {
        m23790a((AppLovinAdLoadListener) new AppLovinAdLoadListener() {
            public void adReceived(AppLovinAd appLovinAd) {
                C8010o.this.m23793b(appLovinAd);
                C8010o.this.showAndRender(appLovinAd);
            }

            public void failedToReceiveAd(int i) {
                C8010o.this.m23780a(i);
            }
        });
    }

    public void showAndRender(AppLovinAd appLovinAd) {
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f19342a);
        Context g = m23798g();
        if (!m23791a(maybeRetrieveNonDummyAd, appLovinAd, g)) {
            m23789a(appLovinAd);
        } else {
            m23785a((C8350e) maybeRetrieveNonDummyAd, g);
        }
    }

    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle) {
        if (viewGroup == null || lifecycle == null) {
            C8626v.m26258i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
            m23789a(appLovinAd);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f19342a);
        Context g = m23798g();
        if (!m23791a(maybeRetrieveNonDummyAd, appLovinAd, g)) {
            m23789a(appLovinAd);
            return;
        }
        AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(lifecycle, this, this.f19342a);
        lifecycle.addObserver(appLovinFullscreenAdViewObserver);
        m23787a((C8350e) maybeRetrieveNonDummyAd, viewGroup, appLovinFullscreenAdViewObserver, g);
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }
}
