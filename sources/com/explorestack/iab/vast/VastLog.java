package com.explorestack.iab.vast;

import com.explorestack.iab.utils.LogListener;
import com.explorestack.iab.utils.Logger;

public class VastLog {

    /* renamed from: a */
    public static final Logger f4352a = new Logger("VastLog");

    /* renamed from: a */
    public static void m6350a(String str) {
        f4352a.mo4033a(str);
    }

    /* renamed from: a */
    public static void m6351a(String str, String str2) {
        f4352a.mo4040b(str, str2);
    }

    /* renamed from: a */
    public static void m6352a(String str, String str2, Throwable th) {
        f4352a.mo4035a(str, str2, th);
    }

    /* renamed from: a */
    public static void m6353a(String str, Throwable th) {
        f4352a.mo4036a(str, th);
    }

    public static void addLogListener(LogListener logListener) {
        f4352a.mo4031a(logListener);
    }

    /* renamed from: d */
    public static void m6354d(String str, String str2) {
        f4352a.mo4034a(str, str2);
    }

    public static void setLoggingLevel(Logger.LogLevel logLevel) {
        f4352a.mo4039b(logLevel);
    }
}
