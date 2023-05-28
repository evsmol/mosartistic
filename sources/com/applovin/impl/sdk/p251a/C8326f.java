package com.applovin.impl.sdk.p251a;

import android.content.Context;
import android.util.Log;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C8656R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.applovin.impl.sdk.a.f */
public class C8326f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f20506a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f20507b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f20508c;

    public C8326f(C8490n nVar) {
        this.f20506a = nVar;
        this.f20507b = nVar.mo57332P();
    }

    /* renamed from: a */
    public String mo56869a(String str) {
        try {
            return ScriptInjector.injectScriptContentIntoHtml(this.f20508c, str);
        } catch (Throwable th) {
            this.f20506a.mo57320D();
            if (C8626v.m26252a()) {
                this.f20506a.mo57320D().mo57819b("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }

    /* renamed from: a */
    public void mo56870a() {
        if (((Boolean) this.f20506a.mo57342a(C8380b.f20750az)).booleanValue()) {
            this.f20506a.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D = this.f20506a.mo57320D();
                D.mo57818b("OpenMeasurementService", "Initializing Open Measurement SDK v" + mo56872c() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    Omid.activate(C8326f.this.f20507b);
                    C8326f.this.f20506a.mo57320D();
                    if (C8626v.m26252a()) {
                        C8626v D = C8326f.this.f20506a.mo57320D();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Init ");
                        sb.append(C8326f.this.mo56871b() ? "succeeded" : "failed");
                        sb.append(" and took ");
                        sb.append(System.currentTimeMillis() - currentTimeMillis);
                        sb.append("ms");
                        D.mo57818b("OpenMeasurementService", sb.toString());
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C8326f.this.f20507b.getResources().openRawResource(C8656R.raw.omsdk_v_1_0)));
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine != null) {
                                    sb2.append(readLine);
                                } else {
                                    String unused = C8326f.this.f20508c = sb2.toString();
                                    try {
                                        bufferedReader.close();
                                        return;
                                    } catch (IOException e) {
                                        Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e2) {
                                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        C8326f.this.f20506a.mo57320D();
                        if (C8626v.m26252a()) {
                            C8326f.this.f20506a.mo57320D().mo57819b("OpenMeasurementService", "Failed to retrieve resource omskd_v_1_0.js", th2);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public boolean mo56871b() {
        return Omid.isActive();
    }

    /* renamed from: c */
    public String mo56872c() {
        return Omid.getVersion();
    }

    /* renamed from: d */
    public Partner mo56873d() {
        return Partner.createPartner((String) this.f20506a.mo57342a(C8380b.f20699aA), AppLovinSdk.VERSION);
    }

    /* renamed from: e */
    public String mo56874e() {
        return this.f20508c;
    }
}
