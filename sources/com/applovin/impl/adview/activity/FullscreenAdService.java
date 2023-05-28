package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C8010o;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;

public class FullscreenAdService extends Service {
    public static final String DATA_KEY_AD_SOURCE = "ad_source";
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    /* renamed from: com.applovin.impl.adview.activity.FullscreenAdService$a */
    private static class C7890a extends Handler {
        private C7890a() {
        }

        public void handleMessage(Message message) {
            try {
                C8010o oVar = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (oVar != null) {
                    C8350e e = oVar.mo55771e();
                    if (message.what == C7891b.AD.mo55514a()) {
                        Bundle bundle = new Bundle();
                        bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, e.getRawFullResponse());
                        bundle.putInt(FullscreenAdService.DATA_KEY_AD_SOURCE, e.getSource().mo56927a());
                        Message obtain = Message.obtain((Handler) null, C7891b.AD.mo55514a());
                        obtain.setData(bundle);
                        message.replyTo.send(obtain);
                    } else if (message.what == C7891b.AD_DISPLAYED.mo55514a()) {
                        C8575k.m26144a(oVar.mo55768b(), (AppLovinAd) e);
                    } else if (message.what == C7891b.AD_CLICKED.mo55514a()) {
                        C8575k.m26143a(oVar.mo55770d(), (AppLovinAd) e);
                    } else if (message.what == C7891b.AD_VIDEO_STARTED.mo55514a()) {
                        C8575k.m26148a(oVar.mo55769c(), (AppLovinAd) e);
                    } else if (message.what == C7891b.AD_VIDEO_ENDED.mo55514a()) {
                        Bundle data = message.getData();
                        C8575k.m26149a(oVar.mo55769c(), (AppLovinAd) e, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    } else if (message.what == C7891b.AD_HIDDEN.mo55514a()) {
                        C8575k.m26157b(oVar.mo55768b(), (AppLovinAd) e);
                    } else {
                        super.handleMessage(message);
                    }
                } else if (!Utils.getBooleanForProbability(1)) {
                    super.handleMessage(message);
                } else {
                    throw new RuntimeException("parentWrapper is null for " + message.what);
                }
            } catch (RemoteException e2) {
                C8626v.m26254c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e2);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.FullscreenAdService$b */
    public enum C7891b {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);
        

        /* renamed from: g */
        private final int f19047g;

        private C7891b(int i) {
            this.f19047g = i;
        }

        /* renamed from: a */
        public int mo55514a() {
            return this.f19047g;
        }
    }

    public IBinder onBind(Intent intent) {
        return new Messenger(new C7890a()).getBinder();
    }
}
