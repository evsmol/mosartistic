package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C8612l;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.v */
public class C8626v {

    /* renamed from: a */
    private static C8490n f21785a;

    /* renamed from: b */
    private final C8490n f21786b;

    C8626v(final C8490n nVar) {
        this.f21786b = nVar;
        if (!nVar.mo57388e()) {
            f21785a = nVar;
            m26250a("SDK Session Begin");
            nVar.mo57372am().registerReceiver(new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    C8626v.this.m26250a("SDK Session End");
                    nVar.mo57372am().unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26250a(String str) {
        C8612l lVar = new C8612l();
        lVar.mo57741a().mo57747a(str).mo57741a();
        m26255f("AppLovinSdk", lVar.toString());
    }

    /* renamed from: a */
    private void m26251a(String str, String str2, boolean z) {
        int intValue;
        if (StringUtils.isValidString(str2) && (intValue = ((Integer) this.f21786b.mo57342a(C8380b.f20739ao)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + intValue) - 1) / intValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * intValue;
                String substring = str2.substring(i3, Math.min(length, i3 + intValue));
                if (z) {
                    Log.d(str, substring);
                } else {
                    mo57818b(str, substring);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m26252a() {
        C8490n nVar = f21785a;
        return nVar == null || m26253a(nVar);
    }

    /* renamed from: a */
    public static boolean m26253a(C8490n nVar) {
        return nVar != null && nVar.mo57331O().mo57097d();
    }

    /* renamed from: c */
    public static void m26254c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    /* renamed from: f */
    public static void m26255f(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: g */
    public static void m26256g(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: h */
    public static void m26257h(String str, String str2) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: i */
    public static void m26258i(String str, String str2) {
        m26254c(str, str2, (Throwable) null);
    }

    /* renamed from: j */
    public static void m26259j(String str, String str2) {
        m26255f(str, str2);
    }

    /* renamed from: a */
    public void mo57816a(String str, String str2) {
        if (m26253a(this.f21786b)) {
            m26251a(str, str2, false);
        }
    }

    /* renamed from: a */
    public void mo57817a(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    /* renamed from: b */
    public void mo57818b(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: b */
    public void mo57819b(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    /* renamed from: c */
    public void mo57820c(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: d */
    public void mo57821d(String str, String str2) {
        mo57817a(str, str2, (Throwable) null);
    }

    /* renamed from: e */
    public void mo57822e(String str, String str2) {
        mo57819b(str, str2, (Throwable) null);
    }
}
