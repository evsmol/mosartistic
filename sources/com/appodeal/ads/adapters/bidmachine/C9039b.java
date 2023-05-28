package com.appodeal.ads.adapters.bidmachine;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.appodeal.ads.AppodealStateParams;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.networking.LoadingError;
import com.explorestack.iab.mraid.MraidLog;
import com.explorestack.iab.vast.VastLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p150io.bidmachine.BidMachine;
import p150io.bidmachine.InitializationCallback;

/* renamed from: com.appodeal.ads.adapters.bidmachine.b */
/* compiled from: BidMachineInitializer */
public final class C9039b {

    /* renamed from: d */
    public static final C9039b f22844d = new C9039b();

    /* renamed from: a */
    public ArrayList f22845a;

    /* renamed from: b */
    public boolean f22846b = false;

    /* renamed from: c */
    public boolean f22847c = false;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.b$a */
    /* compiled from: BidMachineInitializer */
    public interface C9040a {
        void onInitializationFailed(LoadingError loadingError);

        void onInitializationFinished();
    }

    /* renamed from: a */
    public static C9039b m27133a() {
        return f22844d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m27135b() {
        mo59421a((LoadingError) null);
    }

    /* renamed from: a */
    public final void mo59420a(Context context, JSONObject jSONObject, AppodealStateParams appodealStateParams, C9040a aVar) {
        if (jSONObject == null) {
            aVar.onInitializationFailed(LoadingError.InternalError);
            return;
        }
        MraidLog.addLogListener(C9043c.m27140a());
        VastLog.addLogListener(C9043c.m27140a());
        RestrictedData restrictedData = appodealStateParams.getRestrictedData();
        if (restrictedData.isUserInGdprScope()) {
            BidMachine.setSubjectToGDPR(Boolean.TRUE);
            BidMachine.setConsentConfig(restrictedData.isUserHasConsent(), restrictedData.getIabConsentString());
        }
        if (restrictedData.isUserInCcpaScope()) {
            String uSPrivacyString = restrictedData.getUSPrivacyString();
            if (!TextUtils.isEmpty(uSPrivacyString)) {
                BidMachine.setUSPrivacyString(uSPrivacyString);
            }
        }
        if (restrictedData.isUserAgeRestricted()) {
            BidMachine.setCoppa(Boolean.TRUE);
        }
        BidMachine.setTargetingParams(C9043c.m27143a(context, jSONObject, appodealStateParams.getRestrictedData()));
        BidMachine.setLoggingEnabled(appodealStateParams.isTestMode());
        BidMachine.setTestMode(appodealStateParams.isTestMode());
        synchronized (C9039b.class) {
            if (this.f22847c) {
                aVar.onInitializationFinished();
            } else {
                if (this.f22845a == null) {
                    this.f22845a = new ArrayList();
                }
                this.f22845a.add(aVar);
            }
        }
        if (!this.f22846b) {
            this.f22846b = true;
            mo59419a(context, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo59419a(Context context, JSONObject jSONObject) {
        if (BidMachine.isInitialized()) {
            mo59421a((LoadingError) null);
            return;
        }
        String optString = jSONObject.optString("seller_id");
        if (TextUtils.isEmpty(optString)) {
            mo59421a(LoadingError.IncorrectAdunit);
            return;
        }
        String optString2 = jSONObject.optString("endpoint");
        if (!TextUtils.isEmpty(optString2)) {
            BidMachine.setEndpoint(optString2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("mediation_config");
        if (optJSONArray != null) {
            BidMachine.registerNetworks(context, optJSONArray.toString());
        }
        BidMachine.initialize(context, optString, new InitializationCallback() {
            public final void onInitialized() {
                C9039b.this.m27135b();
            }
        });
    }

    /* renamed from: a */
    public final void mo59421a(LoadingError loadingError) {
        ArrayList arrayList;
        this.f22847c = loadingError == null;
        this.f22846b = false;
        if (this.f22845a != null) {
            synchronized (C9039b.class) {
                arrayList = new ArrayList(this.f22845a);
            }
            new Handler(Looper.getMainLooper()).post(new Runnable(arrayList, loadingError) {
                public final /* synthetic */ List f$1;
                public final /* synthetic */ LoadingError f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C9039b.this.m27134a(this.f$1, this.f$2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27134a(List list, LoadingError loadingError) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9040a aVar = (C9040a) it.next();
            if (this.f22847c) {
                aVar.onInitializationFinished();
            } else {
                aVar.onInitializationFailed(loadingError);
            }
        }
        synchronized (C9039b.class) {
            this.f22845a.removeAll(list);
        }
    }
}
