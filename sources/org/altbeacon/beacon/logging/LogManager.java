package org.altbeacon.beacon.logging;

public final class LogManager {
    private static Logger sLogger = Loggers.infoLogger();
    private static boolean sVerboseLoggingEnabled = false;

    public static boolean isVerboseLoggingEnabled() {
        return sVerboseLoggingEnabled;
    }

    /* renamed from: d */
    public static void m14725d(String str, String str2, Object... objArr) {
        sLogger.mo43021d(str, str2, objArr);
    }

    /* renamed from: i */
    public static void m14728i(String str, String str2, Object... objArr) {
        sLogger.mo43024i(str, str2, objArr);
    }

    /* renamed from: w */
    public static void m14729w(String str, String str2, Object... objArr) {
        sLogger.mo43025w(str, str2, objArr);
    }

    /* renamed from: w */
    public static void m14730w(Throwable th, String str, String str2, Object... objArr) {
        sLogger.mo43026w(th, str, str2, objArr);
    }

    /* renamed from: e */
    public static void m14726e(String str, String str2, Object... objArr) {
        sLogger.mo43022e(str, str2, objArr);
    }

    /* renamed from: e */
    public static void m14727e(Throwable th, String str, String str2, Object... objArr) {
        sLogger.mo43023e(th, str, str2, objArr);
    }
}
