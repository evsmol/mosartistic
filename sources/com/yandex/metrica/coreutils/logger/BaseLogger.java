package com.yandex.metrica.coreutils.logger;

import android.util.Log;

public abstract class BaseLogger {
    private volatile boolean mIsEnabled = false;

    private static String wrapMsg(String str) {
        return str == null ? "" : str;
    }

    /* access modifiers changed from: protected */
    public abstract String formatMessage(String str, Object[] objArr);

    /* access modifiers changed from: protected */
    public abstract String getPrefix();

    /* access modifiers changed from: protected */
    public abstract String getTag();

    public void setEnabled() {
        this.mIsEnabled = true;
    }

    public void setDisabled() {
        this.mIsEnabled = false;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public BaseLogger(boolean z) {
        this.mIsEnabled = z;
    }

    /* renamed from: d */
    public void mo15259d(String str) {
        log(3, wrapMsg(str));
    }

    /* renamed from: i */
    public void mo15273i(String str) {
        log(4, str);
    }

    /* renamed from: w */
    public void mo15283w(String str) {
        log(5, str);
    }

    /* renamed from: e */
    public void mo15260e(String str) {
        log(6, str);
    }

    /* renamed from: e */
    public void mo15261e(Throwable th, String str) {
        log(6, th, str);
    }

    /* renamed from: fd */
    public void mo15262fd(String str, Object... objArr) {
        log(3, wrapMsg(str), objArr);
    }

    /* renamed from: fi */
    public void mo15265fi(String str, Object... objArr) {
        log(4, str, objArr);
    }

    /* renamed from: fw */
    public void mo15270fw(String str, Object... objArr) {
        log(5, str, objArr);
    }

    /* renamed from: fe */
    public void mo15263fe(String str, Object... objArr) {
        log(6, str, objArr);
    }

    /* renamed from: fe */
    public void mo15264fe(Throwable th, String str, Object... objArr) {
        log(6, th, str, objArr);
    }

    public void forceI(String str, Object... objArr) {
        Log.println(4, getTag(), getFormattedMessage(str, objArr));
    }

    public void forceW(String str, Object... objArr) {
        Log.println(5, getTag(), getFormattedMessage(str, objArr));
    }

    public void forceE(Throwable th, String str, Object... objArr) {
        String tag = getTag();
        Log.println(6, tag, getFormattedMessage(str, objArr) + "\n" + Log.getStackTraceString(th));
    }

    /* access modifiers changed from: package-private */
    public void log(int i, String str) {
        if (shouldLog()) {
            Log.println(i, getTag(), getMessage(str));
        }
    }

    /* access modifiers changed from: package-private */
    public void log(int i, String str, Object... objArr) {
        if (shouldLog()) {
            Log.println(i, getTag(), getFormattedMessage(str, objArr));
        }
    }

    /* access modifiers changed from: package-private */
    public void log(int i, Throwable th, String str) {
        if (shouldLog()) {
            String tag = getTag();
            Log.println(i, tag, getMessage(str) + "\n" + Log.getStackTraceString(th));
        }
    }

    /* access modifiers changed from: package-private */
    public void log(int i, Throwable th, String str, Object... objArr) {
        if (shouldLog()) {
            String tag = getTag();
            Log.println(i, tag, getFormattedMessage(str, objArr) + "\n" + Log.getStackTraceString(th));
        }
    }

    /* access modifiers changed from: protected */
    public boolean shouldLog() {
        return this.mIsEnabled;
    }

    private String getMessage(String str) {
        return getPrefix() + wrapMsg(str);
    }

    private String getFormattedMessage(String str, Object[] objArr) {
        try {
            return getPrefix() + formatMessage(wrapMsg(str), objArr);
        } catch (Throwable unused) {
            return onFormatException();
        }
    }

    /* access modifiers changed from: package-private */
    public String onFormatException() {
        return getPrefix();
    }
}
