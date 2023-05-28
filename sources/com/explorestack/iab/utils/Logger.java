package com.explorestack.iab.utils;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Logger {

    /* renamed from: c */
    public static LogLevel f4265c = LogLevel.error;

    /* renamed from: a */
    public final List<LogListener> f4266a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final String f4267b;

    public enum LogLevel {
        debug(1),
        info(2),
        warning(3),
        error(4),
        none(5);
        

        /* renamed from: a */
        public int f4268a;

        private LogLevel(int i) {
            this.f4268a = i;
        }

        public int getValue() {
            return this.f4268a;
        }
    }

    public Logger(String str) {
        this.f4267b = str;
    }

    /* renamed from: a */
    public LogLevel mo4030a() {
        return f4265c;
    }

    /* renamed from: a */
    public void mo4031a(LogListener logListener) {
        if (logListener != null) {
            this.f4266a.add(logListener);
        }
    }

    /* renamed from: a */
    public final void mo4032a(LogLevel logLevel, String... strArr) {
        if (!this.f4266a.isEmpty()) {
            for (LogListener onLog : this.f4266a) {
                onLog.onLog(logLevel, this.f4267b, Arrays.toString(strArr));
            }
        }
    }

    /* renamed from: a */
    public void mo4033a(String str) {
        LogLevel logLevel = LogLevel.error;
        if (mo4038a(logLevel, str)) {
            Log.e(this.f4267b, str);
        }
        mo4032a(logLevel, str);
    }

    /* renamed from: a */
    public void mo4034a(String str, String str2) {
        LogLevel logLevel = LogLevel.debug;
        if (mo4038a(logLevel, str2)) {
            String str3 = this.f4267b;
            Log.d(str3, "[" + str + "] " + str2);
        }
        mo4032a(logLevel, "[" + str + "] " + str2);
    }

    /* renamed from: a */
    public void mo4035a(String str, String str2, Throwable th) {
        LogLevel logLevel = LogLevel.error;
        if (mo4038a(logLevel, str2)) {
            String str3 = this.f4267b;
            Log.e(str3, "[" + str + "] " + str2, th);
        }
        mo4032a(logLevel, "[" + str + "] " + str2, th.toString());
    }

    /* renamed from: a */
    public void mo4036a(String str, Throwable th) {
        LogLevel logLevel = LogLevel.error;
        if (mo4038a(logLevel, str)) {
            Log.e(this.f4267b, str, th);
        }
        mo4032a(logLevel, str, th.toString());
    }

    /* renamed from: a */
    public final boolean mo4037a(LogLevel logLevel) {
        LogLevel logLevel2 = f4265c;
        return (logLevel2 == null || logLevel == null || logLevel2.getValue() > logLevel.getValue()) ? false : true;
    }

    /* renamed from: a */
    public final boolean mo4038a(LogLevel logLevel, String str) {
        return !TextUtils.isEmpty(str) && mo4037a(logLevel);
    }

    /* renamed from: b */
    public void mo4039b(LogLevel logLevel) {
        Log.d(this.f4267b, String.format("Changing logging level. From: %s, To: %s", new Object[]{f4265c, logLevel}));
        f4265c = logLevel;
    }

    /* renamed from: b */
    public void mo4040b(String str, String str2) {
        LogLevel logLevel = LogLevel.error;
        if (mo4038a(logLevel, str2)) {
            String str3 = this.f4267b;
            Log.e(str3, "[" + str + "] " + str2);
        }
        mo4032a(logLevel, "[" + str + "] " + str2);
    }

    /* renamed from: c */
    public void mo4041c(String str, String str2) {
        LogLevel logLevel = LogLevel.warning;
        if (mo4038a(logLevel, str2)) {
            String str3 = this.f4267b;
            Log.w(str3, "[" + str + "] " + str2);
        }
        mo4032a(logLevel, "[" + str + "] " + str2);
    }
}
