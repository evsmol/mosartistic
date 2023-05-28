package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.applovin.impl.sdk.C8626v;

/* renamed from: com.applovin.impl.sdk.utils.e */
public class C8567e {

    /* renamed from: a */
    private static C8567e f21636a;

    /* renamed from: b */
    private static final Object f21637b = new Object();

    /* renamed from: c */
    private final Bundle f21638c;

    /* renamed from: d */
    private final int f21639d;

    /* renamed from: e */
    private final boolean f21640e;

    private C8567e(Context context) {
        boolean z;
        Bundle bundle = null;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            C8626v.m26254c("AndroidManifest", "Failed to get meta data.", e);
        } catch (Throwable th) {
            this.f21638c = null;
            throw th;
        }
        this.f21638c = bundle;
        int i = 0;
        try {
            XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = openXmlResourceParser.getEventType();
            int i2 = 0;
            z = false;
            do {
                if (2 == eventType) {
                    try {
                        if (openXmlResourceParser.getName().equals("application")) {
                            for (int i3 = 0; i3 < openXmlResourceParser.getAttributeCount(); i3++) {
                                String attributeName = openXmlResourceParser.getAttributeName(i3);
                                String attributeValue = openXmlResourceParser.getAttributeValue(i3);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    i2 = Integer.valueOf(attributeValue.substring(1)).intValue();
                                } else if (attributeName.equals("usesCleartextTraffic")) {
                                    z = Boolean.valueOf(attributeValue).booleanValue();
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = i2;
                        try {
                            C8626v.m26254c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            this.f21639d = i;
                            this.f21640e = z;
                        } catch (Throwable th3) {
                            this.f21639d = i;
                            this.f21640e = z;
                            throw th3;
                        }
                    }
                }
                eventType = openXmlResourceParser.next();
            } while (eventType != 1);
            this.f21639d = i2;
        } catch (Throwable th4) {
            th = th4;
            z = false;
            C8626v.m26254c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
            this.f21639d = i;
            this.f21640e = z;
        }
        this.f21640e = z;
    }

    /* renamed from: a */
    public static C8567e m26072a(Context context) {
        C8567e eVar;
        synchronized (f21637b) {
            if (f21636a == null) {
                f21636a = new C8567e(context);
            }
            eVar = f21636a;
        }
        return eVar;
    }

    /* renamed from: a */
    public String mo57695a(String str, String str2) {
        Bundle bundle = this.f21638c;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    /* renamed from: a */
    public boolean mo57696a() {
        return this.f21639d != 0;
    }

    /* renamed from: a */
    public boolean mo57697a(String str) {
        Bundle bundle = this.f21638c;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo57698a(String str, boolean z) {
        Bundle bundle = this.f21638c;
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }
}
