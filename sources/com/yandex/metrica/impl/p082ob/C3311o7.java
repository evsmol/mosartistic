package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p081ac.NativeCrashesHelper;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.o7 */
public class C3311o7 implements C3119k7 {
    /* renamed from: a */
    public String mo15441a() {
        return "YandexMetricaNativeCrashes";
    }

    /* renamed from: a */
    public void mo15442a(String str) {
    }

    /* renamed from: a */
    public void mo15443a(String str, String str2, String str3) {
        NativeCrashesHelper.setUpNativeUncaughtExceptionHandler(str2);
    }

    /* renamed from: b */
    public void mo15445b() {
        NativeCrashesHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    /* renamed from: c */
    public String mo15446c() {
        return "YandexMetricaNativeModule";
    }

    /* renamed from: a */
    public void mo15444a(boolean z) {
        NativeCrashesHelper.logsEnabled(z);
    }
}
