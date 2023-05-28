package com.appodeal.ads.adapters.meta;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import com.facebook.ads.AudienceNetworkAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.appodeal.ads.adapters.meta.a */
public final class C9060a {

    /* renamed from: a */
    public ArrayList f22873a;

    /* renamed from: b */
    public boolean f22874b = false;

    /* renamed from: c */
    public boolean f22875c = false;

    /* renamed from: com.appodeal.ads.adapters.meta.a$a */
    public interface C9061a {
        /* renamed from: a */
        void mo59434a();

        /* renamed from: b */
        void mo59435b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27148a(List list, AudienceNetworkAds.InitResult initResult) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9061a aVar = (C9061a) it.next();
            if (initResult.isSuccess()) {
                aVar.mo59435b();
            } else {
                aVar.mo59434a();
            }
        }
        synchronized (C9060a.class) {
            this.f22873a.removeAll(list);
        }
    }

    /* renamed from: a */
    public final void mo59436a(Context context, String str, MetaNetwork.C9059a aVar) {
        synchronized (C9060a.class) {
            if (this.f22875c) {
                aVar.mo59435b();
            } else {
                if (this.f22873a == null) {
                    this.f22873a = new ArrayList();
                }
                this.f22873a.add(aVar);
            }
        }
        if (!this.f22874b) {
            this.f22874b = true;
            AudienceNetworkAds.InitSettingsBuilder buildInitSettings = AudienceNetworkAds.buildInitSettings(context);
            if (!TextUtils.isEmpty(str)) {
                buildInitSettings.withMediationService(str);
            }
            buildInitSettings.withInitListener(new AudienceNetworkAds.InitListener(context) {
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                    C9060a.this.m27147a(this.f$1, initResult);
                }
            }).initialize();
        }
    }

    /* renamed from: a */
    public final boolean mo59437a() {
        return this.f22875c;
    }

    /* renamed from: b */
    public final void m27147a(Context context, AudienceNetworkAds.InitResult initResult) {
        ArrayList arrayList;
        Log.log(LogConstants.KEY_NETWORK, "Log", String.format("Meta %s", new Object[]{initResult.getMessage()}));
        this.f22875c = initResult.isSuccess();
        this.f22874b = false;
        if (this.f22873a != null) {
            synchronized (C9060a.class) {
                arrayList = new ArrayList(this.f22873a);
            }
            new Handler(context.getMainLooper()).post(new Runnable(arrayList, initResult) {
                public final /* synthetic */ List f$1;
                public final /* synthetic */ AudienceNetworkAds.InitResult f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C9060a.this.m27148a(this.f$1, this.f$2);
                }
            });
        }
    }
}
