package com.explorestack.iab.mraid;

import com.explorestack.iab.utils.LogListener;
import com.explorestack.iab.utils.Logger;

public class MraidLog {

    /* renamed from: a */
    public static final Logger f4088a = new Logger("MraidLog");

    /* renamed from: a */
    public static Logger.LogLevel m5980a() {
        return f4088a.mo4030a();
    }

    /* renamed from: a */
    public static void m5981a(String str) {
        f4088a.mo4033a(str);
    }

    /* renamed from: a */
    public static void m5982a(String str, String str2) {
        f4088a.mo4040b(str, str2);
    }

    /* renamed from: a */
    public static void m5983a(String str, Throwable th) {
        f4088a.mo4036a(str, th);
    }

    public static void addLogListener(LogListener logListener) {
        f4088a.mo4031a(logListener);
    }

    /* renamed from: b */
    public static void m5984b(String str, String str2) {
        f4088a.mo4041c(str, str2);
    }

    /* renamed from: d */
    public static void m5985d(String str, String str2) {
        f4088a.mo4034a(str, str2);
    }

    public static void setLoggingLevel(Logger.LogLevel logLevel) {
        f4088a.mo4039b(logLevel);
    }
}
