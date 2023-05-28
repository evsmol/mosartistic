package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.e */
public class C8397e implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C8490n f21108a;

    /* renamed from: b */
    private final Object f21109b = new Object();

    /* renamed from: c */
    private final LinkedHashMap<String, Bundle> f21110c = new LinkedHashMap<String, Bundle>() {
        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    };

    /* renamed from: d */
    private final Set<C8400a> f21111d = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.applovin.impl.sdk.e$a */
    public interface C8400a {
        void onCreativeIdGenerated(String str, String str2);
    }

    public C8397e(C8490n nVar) {
        this.f21108a = nVar;
        if (StringUtils.isValidString(m25291a())) {
            AppLovinCommunicator.getInstance(nVar.mo57332P()).subscribe((AppLovinCommunicatorSubscriber) this, "safedk_ad_info");
        }
    }

    /* renamed from: a */
    public static String m25291a() {
        return m25293c("getVersion");
    }

    /* renamed from: b */
    public static String m25292b() {
        return m25293c("getSdkKey");
    }

    /* renamed from: c */
    private static String m25293c(String str) {
        Class<?> cls;
        try {
            cls = Class.forName("com.applovin.quality.AppLovinQualityService");
        } catch (Throwable unused) {
            return "";
        }
        return (String) cls.getMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    /* renamed from: a */
    public Bundle mo57161a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f21109b) {
            bundle = this.f21110c.get(str);
        }
        return bundle;
    }

    /* renamed from: a */
    public void mo57162a(C8400a aVar) {
        this.f21111d.add(aVar);
    }

    /* renamed from: b */
    public void mo57163b(C8400a aVar) {
        this.f21111d.remove(aVar);
    }

    /* renamed from: b */
    public void mo57164b(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f21109b) {
                this.f21110c.remove(str);
            }
        }
    }

    public String getCommunicatorId() {
        return C8397e.class.getSimpleName();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f21108a.mo57320D();
                if (C8626v.m26252a()) {
                    this.f21108a.mo57320D().mo57821d("AppLovinSdk", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f21108a.mo57320D();
                if (C8626v.m26252a()) {
                    this.f21108a.mo57320D().mo57821d("AppLovinSdk", "Received SafeDK ad info without private data");
                }
            } else if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f21108a.mo57320D();
                if (C8626v.m26252a()) {
                    this.f21108a.mo57320D().mo57821d("AppLovinSdk", "Received SafeDK ad info without ad format");
                }
            } else {
                final String string = bundle2.getString("id");
                if (TextUtils.isEmpty(string)) {
                    this.f21108a.mo57320D();
                    if (C8626v.m26252a()) {
                        this.f21108a.mo57320D().mo57821d("AppLovinSdk", "Received SafeDK ad info without serve id");
                        return;
                    }
                    return;
                }
                synchronized (this.f21109b) {
                    this.f21108a.mo57320D();
                    if (C8626v.m26252a()) {
                        C8626v D = this.f21108a.mo57320D();
                        D.mo57818b("AppLovinSdk", "Storing current SafeDK ad info for serve id: " + string);
                    }
                    this.f21110c.put(string, bundle);
                }
                final String string2 = bundle.getString("ad_review_creative_id");
                if (StringUtils.isValidString(string2) && !this.f21111d.isEmpty()) {
                    Iterator it = new HashSet(this.f21111d).iterator();
                    while (it.hasNext()) {
                        final C8400a aVar = (C8400a) it.next();
                        this.f21108a.mo57337V().mo57228a((C8401a) new C8458z(this.f21108a, new Runnable() {
                            public void run() {
                                aVar.onCreativeIdGenerated(string, string2);
                            }
                        }), C8432o.C8434a.BACKGROUND);
                    }
                }
            }
        }
    }
}
