package com.applovin.impl.sdk;

import android.os.Process;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static final AppLovinExceptionHandler f20435a = new AppLovinExceptionHandler();

    /* renamed from: b */
    private final Set<C8490n> f20436b = new HashSet(2);

    /* renamed from: c */
    private final AtomicBoolean f20437c = new AtomicBoolean();

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f20438d;

    public static AppLovinExceptionHandler shared() {
        return f20435a;
    }

    public void addSdk(C8490n nVar) {
        this.f20436b.add(nVar);
    }

    public void enable() {
        if (this.f20437c.compareAndSet(false, true)) {
            this.f20438d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        for (C8490n next : this.f20436b) {
            next.mo57320D();
            if (C8626v.m26252a()) {
                next.mo57320D().mo57818b("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            ((EventServiceImpl) next.mo57408x()).trackEventSynchronously("paused");
            ((EventServiceImpl) next.mo57408x()).trackEventSynchronously("crashed");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f20438d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
