package com.applovin.impl.sdk.p256e;

import android.text.TextUtils;
import com.applovin.impl.adview.C7981d;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8536i;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.g */
public class C8414g extends C8401a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8536i f21142a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AppLovinPostbackListener f21143e;

    /* renamed from: f */
    private final C8432o.C8434a f21144f;

    public C8414g(C8536i iVar, C8432o.C8434a aVar, C8490n nVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", nVar);
        if (iVar != null) {
            this.f21142a = iVar;
            this.f21143e = appLovinPostbackListener;
            this.f21144f = aVar;
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25364a() {
        C84162 r0 = new C8449u<Object>(this.f21142a, mo57167d()) {

            /* renamed from: a */
            final String f21146a = C8414g.this.f21142a.mo57505a();

            /* renamed from: a */
            public void mo56275a(int i, String str, Object obj) {
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = this.f21120d;
                    String str2 = this.f21119c;
                    vVar2.mo57822e(str2, "Failed to dispatch postback. Error code: " + i + " URL: " + this.f21146a);
                }
                if (C8414g.this.f21143e != null) {
                    C8414g.this.f21143e.onPostbackFailure(this.f21146a, i);
                }
                if (C8414g.this.f21142a.mo57606p()) {
                    this.f21118b.mo57369aj().mo57293a(C8414g.this.f21142a.mo57607q(), this.f21146a, i, obj, str, false);
                }
            }

            /* renamed from: a */
            public void mo56277a(Object obj, int i) {
                if (obj instanceof String) {
                    for (String next : this.f21118b.mo57380b(C8380b.f20722aX)) {
                        if (next.startsWith(next)) {
                            String str = (String) obj;
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    C8572i.m26107d(jSONObject, this.f21118b);
                                    C8572i.m26106c(jSONObject, this.f21118b);
                                    C8572i.m26109e(jSONObject, this.f21118b);
                                    break;
                                } catch (JSONException unused) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                if (C8414g.this.f21143e != null) {
                    C8414g.this.f21143e.onPostbackSuccess(this.f21146a);
                }
                if (C8414g.this.f21142a.mo57606p()) {
                    this.f21118b.mo57369aj().mo57293a(C8414g.this.f21142a.mo57607q(), this.f21146a, i, obj, (String) null, true);
                }
            }
        };
        r0.mo57254a(this.f21144f);
        mo57167d().mo57337V().mo57227a((C8401a) r0);
    }

    public void run() {
        if (!StringUtils.isValidString(this.f21142a.mo57505a())) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57820c(this.f21119c, "Requested URL is not valid; nothing to do...");
            }
            AppLovinPostbackListener appLovinPostbackListener = this.f21143e;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.f21142a.mo57505a(), AppLovinErrorCodes.INVALID_URL);
            }
        } else if (this.f21142a.mo57608r()) {
            C7981d.m23719a(this.f21142a, mo57167d(), new AppLovinPostbackListener() {
                public void onPostbackFailure(String str, int i) {
                    C8414g.this.m25364a();
                }

                public void onPostbackSuccess(String str) {
                    if (C8414g.this.f21143e != null) {
                        C8414g.this.f21143e.onPostbackSuccess(C8414g.this.f21142a.mo57505a());
                    }
                }
            });
        } else {
            m25364a();
        }
    }
}
