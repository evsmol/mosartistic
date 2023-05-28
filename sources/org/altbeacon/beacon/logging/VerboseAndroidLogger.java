package org.altbeacon.beacon.logging;

import android.util.Log;

final class VerboseAndroidLogger extends AbstractAndroidLogger {
    VerboseAndroidLogger() {
    }

    /* renamed from: d */
    public void mo43021d(String str, String str2, Object... objArr) {
        Log.d(str, formatString(str2, objArr));
    }

    /* renamed from: i */
    public void mo43024i(String str, String str2, Object... objArr) {
        Log.i(str, formatString(str2, objArr));
    }

    /* renamed from: w */
    public void mo43025w(String str, String str2, Object... objArr) {
        Log.w(str, formatString(str2, objArr));
    }

    /* renamed from: w */
    public void mo43026w(Throwable th, String str, String str2, Object... objArr) {
        Log.w(str, formatString(str2, objArr), th);
    }

    /* renamed from: e */
    public void mo43022e(String str, String str2, Object... objArr) {
        Log.e(str, formatString(str2, objArr));
    }

    /* renamed from: e */
    public void mo43023e(Throwable th, String str, String str2, Object... objArr) {
        Log.e(str, formatString(str2, objArr), th);
    }
}
