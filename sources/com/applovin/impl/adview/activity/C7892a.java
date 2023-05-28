package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C8010o;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.p232b.C7905a;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8346b;
import com.applovin.impl.sdk.p252ad.C8349d;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8438p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.activity.a */
public class C7892a implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f19048a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8626v f19049b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final WeakReference<AppLovinFullscreenActivity> f19050c;

    /* renamed from: d */
    private final AtomicBoolean f19051d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Messenger f19052e;

    /* renamed from: com.applovin.impl.adview.activity.a$a */
    private class C7895a implements AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
        private C7895a() {
        }

        /* renamed from: a */
        private void m23379a(Bundle bundle, FullscreenAdService.C7891b bVar) {
            Message obtain = Message.obtain((Handler) null, bVar.mo55514a());
            if (bundle != null) {
                obtain.setData(bundle);
            }
            try {
                C7892a.this.f19052e.send(obtain);
            } catch (RemoteException e) {
                C8626v unused = C7892a.this.f19049b;
                if (C8626v.m26252a()) {
                    C8626v b = C7892a.this.f19049b;
                    b.mo57819b("AppLovinFullscreenActivity", "Failed to forward callback (" + bVar.mo55514a() + ")", e);
                }
            }
        }

        /* renamed from: a */
        private void m23380a(FullscreenAdService.C7891b bVar) {
            m23379a((Bundle) null, bVar);
        }

        public void adClicked(AppLovinAd appLovinAd) {
            m23380a(FullscreenAdService.C7891b.AD_CLICKED);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            m23380a(FullscreenAdService.C7891b.AD_DISPLAYED);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            m23380a(FullscreenAdService.C7891b.AD_HIDDEN);
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            m23380a(FullscreenAdService.C7891b.AD_VIDEO_STARTED);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d);
            bundle.putBoolean("fully_watched", z);
            m23379a(bundle, FullscreenAdService.C7891b.AD_VIDEO_ENDED);
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.a$b */
    private static class C7896b extends Handler {

        /* renamed from: a */
        private final WeakReference<C7892a> f19059a;

        private C7896b(C7892a aVar) {
            this.f19059a = new WeakReference<>(aVar);
        }

        public void handleMessage(Message message) {
            C7892a aVar;
            if (message.what != FullscreenAdService.C7891b.AD.mo55514a() || (aVar = (C7892a) this.f19059a.get()) == null) {
                super.handleMessage(message);
                return;
            }
            aVar.m23372a(C8346b.m25008a(message.getData().getInt(FullscreenAdService.DATA_KEY_AD_SOURCE)), message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
        }
    }

    public C7892a(AppLovinFullscreenActivity appLovinFullscreenActivity, C8490n nVar) {
        this.f19048a = nVar;
        this.f19049b = nVar.mo57320D();
        this.f19050c = new WeakReference<>(appLovinFullscreenActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23370a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f19050c.get();
        if (appLovinFullscreenActivity != null) {
            if (C8626v.m26252a()) {
                this.f19049b.mo57818b("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (C8626v.m26252a()) {
            this.f19049b.mo57822e("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23372a(C8346b bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C8346b bVar2 = bVar;
            this.f19048a.mo57337V().mo57227a((C8401a) new C8438p(jSONObject, C8349d.m25017a(JsonUtils.getString(jSONObject, "zone_id", "")), bVar2, new AppLovinAdLoadListener() {
                public void adReceived(final AppLovinAd appLovinAd) {
                    final AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) C7892a.this.f19050c.get();
                    C8626v unused = C7892a.this.f19049b;
                    boolean a = C8626v.m26252a();
                    if (appLovinFullscreenActivity != null) {
                        if (a) {
                            C7892a.this.f19049b.mo57818b("AppLovinFullscreenActivity", "Presenting ad...");
                        }
                        final C7895a aVar = new C7895a();
                        C7905a.m23400a((C8350e) appLovinAd, aVar, aVar, aVar, C7892a.this.f19048a, appLovinFullscreenActivity, new C7905a.C7919a() {
                            /* renamed from: a */
                            public void mo52368a(C7905a aVar) {
                                appLovinFullscreenActivity.setPresenter(aVar);
                                aVar.mo55551d();
                            }

                            /* renamed from: a */
                            public void mo52369a(String str, Throwable th) {
                                C8010o.m23788a((C8350e) appLovinAd, aVar, str, th, appLovinFullscreenActivity);
                            }
                        });
                    } else if (a) {
                        C8626v b = C7892a.this.f19049b;
                        b.mo57822e("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
                    }
                }

                public void failedToReceiveAd(int i) {
                    C7892a.this.m23370a();
                }
            }, this.f19048a));
        } catch (JSONException e) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f19049b;
                vVar.mo57819b("AppLovinFullscreenActivity", "Unable to process ad: " + str, e);
            }
            m23370a();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f19051d.compareAndSet(false, true)) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f19049b;
                vVar.mo57818b("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f19052e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.C7891b.AD.mo55514a());
            obtain.replyTo = new Messenger(new C7896b());
            try {
                if (C8626v.m26252a()) {
                    this.f19049b.mo57818b("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f19052e.send(obtain);
            } catch (RemoteException e) {
                if (C8626v.m26252a()) {
                    this.f19049b.mo57819b("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e);
                }
                m23370a();
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f19051d.compareAndSet(true, false) && C8626v.m26252a()) {
            C8626v vVar = this.f19049b;
            vVar.mo57818b("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }
}
