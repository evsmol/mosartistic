package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8426m;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinVariableService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class VariableServiceImpl implements AppLovinVariableService {

    /* renamed from: a */
    private final C8490n f20471a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicBoolean f20472b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f20473c = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AppLovinVariableService.OnVariablesUpdateListener f20474d;

    /* renamed from: e */
    private Bundle f20475e;

    /* renamed from: f */
    private final Object f20476f = new Object();

    VariableServiceImpl(C8490n nVar) {
        this.f20471a = nVar;
        String str = (String) nVar.mo57343a(C8382d.f21002j);
        if (StringUtils.isValidString(str)) {
            updateVariables(JsonUtils.deserialize(str));
        }
    }

    /* renamed from: a */
    private Object m24927a(String str, Object obj, Class<?> cls) {
        if (TextUtils.isEmpty(str)) {
            C8626v.m26258i("AppLovinVariableService", "Unable to retrieve variable value for empty name");
            return obj;
        }
        if (!this.f20471a.mo57387d()) {
            C8626v.m26257h("AppLovinSdk", "Attempted to retrieve variable before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        synchronized (this.f20476f) {
            if (this.f20475e == null) {
                C8626v.m26258i("AppLovinVariableService", "Unable to retrieve variable value for name \"" + str + "\". No variables returned by the server.");
                return obj;
            } else if (cls.equals(String.class)) {
                String string = this.f20475e.getString(str, (String) obj);
                return string;
            } else if (cls.equals(Boolean.class)) {
                Boolean valueOf = Boolean.valueOf(this.f20475e.getBoolean(str, ((Boolean) obj).booleanValue()));
                return valueOf;
            } else {
                throw new IllegalStateException("Unable to retrieve variable value for " + str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24929a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f20476f
            monitor-enter(r0)
            com.applovin.sdk.AppLovinVariableService$OnVariablesUpdateListener r1 = r4.f20474d     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x001f
            android.os.Bundle r1 = r4.f20475e     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            android.os.Bundle r1 = r4.f20475e     // Catch:{ all -> 0x0021 }
            java.lang.Object r1 = r1.clone()     // Catch:{ all -> 0x0021 }
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ all -> 0x0021 }
            r2 = 1
            com.applovin.impl.sdk.VariableServiceImpl$2 r3 = new com.applovin.impl.sdk.VariableServiceImpl$2     // Catch:{ all -> 0x0021 }
            r3.<init>(r1)     // Catch:{ all -> 0x0021 }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(r2, r3)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.VariableServiceImpl.m24929a():void");
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean getBoolean(String str, boolean z) {
        return ((Boolean) m24927a(str, Boolean.valueOf(z), Boolean.class)).booleanValue();
    }

    public String getString(String str) {
        return getString(str, (String) null);
    }

    public String getString(String str, String str2) {
        return (String) m24927a(str, str2, String.class);
    }

    @Deprecated
    public void loadVariables() {
        String str;
        if (!this.f20471a.mo57387d()) {
            str = "The AppLovin SDK is waiting for the initial variables to be returned upon completing initialization.";
        } else if (this.f20472b.compareAndSet(false, true)) {
            this.f20471a.mo57337V().mo57228a((C8401a) new C8426m(this.f20471a, new C8426m.C8428a() {
                /* renamed from: a */
                public void mo56829a() {
                    VariableServiceImpl.this.f20472b.set(false);
                }
            }), C8432o.C8434a.BACKGROUND);
            return;
        } else {
            str = "Ignored explicit variables load. Service is already in the process of retrieving the latest set of variables.";
        }
        C8626v.m26258i("AppLovinVariableService", str);
    }

    @Deprecated
    public void setOnVariablesUpdateListener(AppLovinVariableService.OnVariablesUpdateListener onVariablesUpdateListener) {
        this.f20474d = onVariablesUpdateListener;
        synchronized (this.f20476f) {
            if (onVariablesUpdateListener != null) {
                if (this.f20475e != null && this.f20473c.compareAndSet(false, true)) {
                    this.f20471a.mo57320D();
                    if (C8626v.m26252a()) {
                        this.f20471a.mo57320D().mo57818b("AppLovinVariableService", "Setting initial listener");
                    }
                    m24929a();
                }
            }
        }
    }

    public String toString() {
        return "VariableService{variables=" + this.f20475e + ", listener=" + this.f20474d + '}';
    }

    public void updateVariables(JSONObject jSONObject) {
        this.f20471a.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = this.f20471a.mo57320D();
            D.mo57818b("AppLovinVariableService", "Updating variables: " + jSONObject + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        synchronized (this.f20476f) {
            this.f20475e = JsonUtils.toBundle(jSONObject);
            m24929a();
            this.f20471a.mo57349a(C8382d.f21002j, jSONObject.toString());
        }
    }
}
