package com.appodeal.ads;

import android.app.Activity;
import android.media.AudioManager;
import com.appodeal.ads.C9229j1;
import com.appodeal.ads.C9420r;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.unified.UnifiedFullscreenAd;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.utils.C9661w;
import com.appodeal.ads.utils.C9662x;
import com.appodeal.ads.utils.C9670y;
import com.appodeal.ads.utils.Log;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.k1 */
public class C9251k1<AdRequestType extends C9420r<AdObjectType>, AdObjectType extends C9229j1> extends C9391p<AdRequestType, AdObjectType, C9401q> {

    /* renamed from: a */
    public static final AtomicBoolean f23257a = new AtomicBoolean(false);

    /* renamed from: com.appodeal.ads.k1$a */
    public class C9252a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f23258a;

        /* renamed from: b */
        public final /* synthetic */ C9490g f23259b;

        /* renamed from: c */
        public final /* synthetic */ C9420r f23260c;

        /* renamed from: d */
        public final /* synthetic */ C9229j1 f23261d;

        public C9252a(Activity activity, C9490g gVar, C9420r rVar, C9229j1 j1Var) {
            this.f23258a = activity;
            this.f23259b = gVar;
            this.f23260c = rVar;
            this.f23261d = j1Var;
        }

        public final void run() {
            C9251k1.this.getClass();
            AudioManager audioManager = (AudioManager) this.f23258a.getSystemService("audio");
            if (audioManager != null && C9422r0.f23916e && audioManager.getStreamVolume(2) == 0) {
                C9422r0.f23917f = audioManager.getStreamVolume(3);
                audioManager.setStreamVolume(3, 0, 0);
            }
            C9490g gVar = this.f23259b;
            AdType n = this.f23260c.mo60093n();
            gVar.getClass();
            if (C9490g.m28076a(n)) {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject optJSONObject = gVar.f24091c.optJSONObject("impression_interval");
                int i = -1;
                if (optJSONObject != null) {
                    i = optJSONObject.optInt("fullscreen", -1) * 1000;
                }
                if (i > 0) {
                    gVar.f24094f = currentTimeMillis;
                }
                C9490g.f24088i = currentTimeMillis;
                long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                HashMap hashMap = C9662x.f24470l;
                C9661w wVar = C9662x.C9663a.m28439a().f24479e;
                if (wVar != null) {
                    synchronized (wVar) {
                        wVar.f24469k++;
                    }
                }
                try {
                    JSONArray e = gVar.mo60743e();
                    e.put(currentTimeMillis2);
                    gVar.f24095g.mo60818c(String.valueOf(gVar.f24089a), e.toString());
                } catch (Exception e2) {
                    Log.log(e2);
                }
            }
            C9670y.m28445a(this.f23260c.mo60093n(), this.f23261d.f23268b);
            C9229j1 j1Var = this.f23261d;
            Activity activity = this.f23258a;
            UnifiedAdType unifiedadtype = j1Var.f23272f;
            if (unifiedadtype != null) {
                UnifiedAdParamsType unifiedadparamstype = j1Var.f23273g;
                if (unifiedadparamstype != null) {
                    unifiedadtype.onPrepareToShow(activity, unifiedadparamstype);
                } else {
                    UnifiedAdCallbackType unifiedadcallbacktype = j1Var.f23274h;
                    if (unifiedadcallbacktype != null) {
                        unifiedadcallbacktype.onAdShowFailed();
                    }
                }
            }
            C9229j1 j1Var2 = this.f23261d;
            Activity activity2 = this.f23258a;
            UnifiedFullscreenAd unifiedFullscreenAd = (UnifiedFullscreenAd) j1Var2.f23272f;
            UnifiedFullscreenAdCallback unifiedFullscreenAdCallback = (UnifiedFullscreenAdCallback) j1Var2.f23274h;
            if (unifiedFullscreenAd != null && unifiedFullscreenAdCallback != null) {
                unifiedFullscreenAd.show(activity2, unifiedFullscreenAdCallback);
            } else if (unifiedFullscreenAdCallback != null) {
                unifiedFullscreenAdCallback.onAdShowFailed();
            }
        }
    }

    /* renamed from: a */
    public static void m27408a() {
        AtomicBoolean atomicBoolean = f23257a;
        synchronized (atomicBoolean) {
            atomicBoolean.set(false);
        }
    }

    /* renamed from: b */
    public static void m27409b() {
        int i;
        AudioManager audioManager = (AudioManager) C9148b.f22956b.f22957a.getApplicationContext().getSystemService("audio");
        if (audioManager != null && C9422r0.f23916e && audioManager.getStreamVolume(3) == 0 && (i = C9422r0.f23917f) != -1) {
            audioManager.setStreamVolume(3, i, 0);
        }
    }

    /* renamed from: a */
    public final boolean mo60089a(Activity activity, C9401q qVar, C9577u<AdObjectType, AdRequestType, ?> uVar) {
        AdRequestType f = uVar.mo60846f();
        if (f == null) {
            return false;
        }
        C9490g gVar = qVar.f23823a;
        uVar.mo60837a(LogConstants.EVENT_SHOW, String.format("isDebug: %s, isLoaded: %s, isLoading: %s, placement: '%s'", new Object[]{Boolean.valueOf(qVar.f23824b), Boolean.valueOf(f.f23906u), Boolean.valueOf(f.mo60630u()), gVar.f24090b}));
        if (!gVar.mo60739a(activity, uVar.f24288f, f.f23905t)) {
            return false;
        }
        if (f.f23906u || f.f23907v || f.f23902q.containsKey(gVar.f24090b)) {
            AdObjectType a = f.mo60593a(gVar.f24090b);
            f.f23904s = a;
            C9229j1 j1Var = (C9229j1) a;
            if (j1Var != null) {
                uVar.f24307y = f;
                C9212h5.f23153a.post(new C9252a(activity, gVar, f, j1Var));
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo60090b(Activity activity, C9401q qVar, C9577u<AdObjectType, AdRequestType, ?> uVar) {
        AtomicBoolean atomicBoolean = f23257a;
        if (atomicBoolean.getAndSet(true)) {
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_SHOW_ERROR, String.format("Can't show %s. Fullscreen ad is already shown", new Object[]{uVar.mo60843d().getDisplayName()}));
            return false;
        }
        boolean b = super.mo60090b(activity, qVar, uVar);
        atomicBoolean.set(b);
        if (b) {
            C9212h5.m27350a($$Lambda$IwdAmNOGza8_tznd453ZOQZvpdU.INSTANCE, 15000);
        }
        return b;
    }
}
