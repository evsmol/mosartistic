package p150io.bidmachine.core;

/* renamed from: io.bidmachine.core.AdapterLogger */
public class AdapterLogger {
    public static void logMessage(String str, String str2) {
        Logger.log(str, str2);
    }

    public static void logError(String str, String str2) {
        Logger.logError(str, str2);
    }

    public static void logThrowable(Throwable th) {
        Logger.log(th);
    }
}
