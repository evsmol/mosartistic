package com.appodeal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebSettings;
import com.appnext.base.p264b.C8856i;
import com.appodeal.ads.UserSettings;
import com.appodeal.ads.modules.common.internal.data.ConnectionData;
import com.appodeal.ads.utils.Log;
import java.util.HashMap;

/* renamed from: com.appodeal.ads.j4 */
public class C9234j4 implements RestrictedData {

    /* renamed from: a */
    public static final C9234j4 f23194a = new C9234j4();

    /* renamed from: b */
    public static String f23195b;

    public final boolean canSendLocation() {
        return !C9217i0.m27371a() && !isParameterBlocked(C8856i.f22445fC) && !isParameterBlocked("lon");
    }

    public final boolean canSendLocationType() {
        return !C9217i0.m27371a() && !isParameterBlocked("lt");
    }

    public final boolean canSendUserSettings() {
        return !C9217i0.m27371a() && !isParameterBlocked("user_settings");
    }

    @Deprecated
    public final Integer getAge() {
        if (canSendUserSettings()) {
            return C9269l5.m27453a().f23317c;
        }
        return null;
    }

    public final String getCity() {
        if (canSendUserSettings()) {
            return C9269l5.m27453a().f23324j;
        }
        return null;
    }

    public final ConnectionData getConnectionData(Context context) {
        return C9182f1.m27272c(context);
    }

    public final String getCountry() {
        if (canSendUserSettings()) {
            return C9269l5.m27453a().f23320f;
        }
        return null;
    }

    @Deprecated
    public final UserSettings.Gender getGender() {
        if (canSendUserSettings()) {
            return C9269l5.m27453a().f23316b;
        }
        return null;
    }

    public final String getHttpAgent(Context context) {
        String str;
        StringBuilder sb;
        PackageManager packageManager;
        String str2 = null;
        if (!canSendUserSettings()) {
            return null;
        }
        String str3 = f23195b;
        if (str3 != null) {
            return str3;
        }
        if (context == null) {
            return null;
        }
        try {
            f23195b = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable th) {
            Log.log(th);
        }
        if (f23195b == null) {
            try {
                sb = new StringBuilder("Mozilla/5.0");
                sb.append(" (Linux; Android ");
                HashMap hashMap = C9182f1.f23039a;
                sb.append(Build.VERSION.RELEASE);
                sb.append("; ");
                sb.append(Build.MODEL);
                sb.append(" Build/");
                sb.append(Build.ID);
                sb.append("; wv)");
                sb.append(" AppleWebKit/537.36 (KHTML, like Gecko)");
                sb.append(" Version/4.0");
                packageManager = context.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.webview", 0);
                sb.append(" Chrome/");
                sb.append(packageInfo.versionName);
            } catch (Throwable unused) {
                str = null;
            }
            sb.append(" Mobile");
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                PackageInfo packageInfo2 = packageManager.getPackageInfo(context.getPackageName(), 0);
                sb.append(" ");
                int i = applicationInfo.labelRes;
                sb.append(i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i));
                sb.append("/");
                sb.append(packageInfo2.versionName);
            } catch (Throwable th2) {
                Log.log(th2);
            }
            str = sb.toString();
            f23195b = str;
        }
        if (f23195b == null) {
            try {
                str2 = System.getProperty("http.agent", "");
            } catch (Throwable th3) {
                Log.log(th3);
            }
            f23195b = str2;
        }
        if (f23195b == null) {
            f23195b = "";
        }
        return f23195b;
    }

    public final String getIabConsentString() {
        C9700x2.f24534a.getClass();
        return C9700x2.m28511e().mo60674f();
    }

    public final String getIfa() {
        return C9700x2.m28499a();
    }

    public final String getIp() {
        if (canSendUserSettings()) {
            return C9269l5.m27453a().f23318d;
        }
        return null;
    }

    public final LocationData getLocation(Context context) {
        return new C9729z1(context, this);
    }

    public final String getUSPrivacyString() {
        C9700x2.f24534a.getClass();
        return C9700x2.m28511e().getUSPrivacyString();
    }

    public final String getUserId() {
        return C9269l5.m27453a().f23315a;
    }

    public final String getZip() {
        if (canSendUserSettings()) {
            return C9269l5.m27453a().f23325k;
        }
        return null;
    }

    public final boolean isLimitAdTrackingEnabled() {
        return C9700x2.m28515i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isParameterBlocked(java.lang.String r4) {
        /*
            r3 = this;
            com.appodeal.ads.x2 r0 = com.appodeal.ads.C9700x2.f24534a
            r0.getClass()
            com.appodeal.ads.regulator.h r0 = com.appodeal.ads.C9700x2.m28511e()
            boolean r0 = r0.mo60665a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0019
            boolean r0 = com.appodeal.ads.C9700x2.m28513g()
            if (r0 != 0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 != 0) goto L_0x0034
            com.appodeal.ads.regulator.h r0 = com.appodeal.ads.C9700x2.m28511e()
            boolean r0 = r0.mo60675g()
            if (r0 == 0) goto L_0x002e
            boolean r0 = com.appodeal.ads.C9700x2.m28513g()
            if (r0 != 0) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            if (r0 == 0) goto L_0x003e
            boolean r4 = com.appodeal.ads.C9700x2.m28505a((java.lang.String) r4)
            if (r4 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9234j4.isParameterBlocked(java.lang.String):boolean");
    }

    public final boolean isUserAgeRestricted() {
        return C9217i0.m27371a();
    }

    public final boolean isUserCcpaProtected() {
        C9700x2.f24534a.getClass();
        return C9700x2.m28511e().mo60675g() && !C9700x2.m28513g();
    }

    public final boolean isUserGdprProtected() {
        C9700x2.f24534a.getClass();
        return C9700x2.m28511e().mo60665a() && !C9700x2.m28513g();
    }

    public boolean isUserHasConsent() {
        return C9700x2.m28513g();
    }

    public final boolean isUserInCcpaScope() {
        C9700x2.f24534a.getClass();
        return C9700x2.m28511e().mo60675g();
    }

    public final boolean isUserInGdprScope() {
        C9700x2.f24534a.getClass();
        return C9700x2.m28511e().mo60665a();
    }

    public final boolean isUserProtected() {
        C9700x2.f24534a.getClass();
        if (C9700x2.m28511e().mo60665a() && !C9700x2.m28513g()) {
            return true;
        }
        if (C9700x2.m28511e().mo60675g() && !C9700x2.m28513g()) {
            return true;
        }
        return false;
    }
}
