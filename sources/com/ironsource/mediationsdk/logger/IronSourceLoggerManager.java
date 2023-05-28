package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.ArrayList;
import java.util.Iterator;

public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {

    /* renamed from: c */
    private static IronSourceLoggerManager f11556c;

    /* renamed from: d */
    private ArrayList<IronSourceLogger> f11557d;

    private IronSourceLoggerManager(String str) {
        super(str);
        ArrayList<IronSourceLogger> arrayList = new ArrayList<>();
        this.f11557d = arrayList;
        arrayList.add(new C4639a(0));
    }

    public static synchronized IronSourceLoggerManager getLogger() {
        IronSourceLoggerManager ironSourceLoggerManager;
        Class<IronSourceLoggerManager> cls = IronSourceLoggerManager.class;
        synchronized (cls) {
            if (f11556c == null) {
                f11556c = new IronSourceLoggerManager(cls.getSimpleName());
            }
            ironSourceLoggerManager = f11556c;
        }
        return ironSourceLoggerManager;
    }

    public static synchronized IronSourceLoggerManager getLogger(int i) {
        IronSourceLoggerManager ironSourceLoggerManager;
        Class<IronSourceLoggerManager> cls = IronSourceLoggerManager.class;
        synchronized (cls) {
            if (f11556c == null) {
                f11556c = new IronSourceLoggerManager(cls.getSimpleName());
            } else {
                f11556c.f11552a = i;
            }
            ironSourceLoggerManager = f11556c;
        }
        return ironSourceLoggerManager;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f11557d.add(ironSourceLogger);
    }

    public synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (i >= this.f11552a) {
            Iterator<IronSourceLogger> it = this.f11557d.iterator();
            while (it.hasNext()) {
                IronSourceLogger next = it.next();
                if (next.f11552a <= i) {
                    next.log(ironSourceTag, str, i);
                }
            }
        }
    }

    public synchronized void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.f11557d.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
            return;
        }
        Iterator<IronSourceLogger> it2 = this.f11557d.iterator();
        while (it2.hasNext()) {
            it2.next().logException(ironSourceTag, str, th);
        }
    }

    public synchronized void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        log(ironSourceTag, str, i);
    }

    public void setLoggerDebugLevel(String str, int i) {
        if (str != null) {
            IronSourceLogger ironSourceLogger = null;
            Iterator<IronSourceLogger> it = this.f11557d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IronSourceLogger next = it.next();
                if (next.f11553b.equals(str)) {
                    ironSourceLogger = next;
                    break;
                }
            }
            if (ironSourceLogger == null) {
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                log(ironSourceTag, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
            } else if (i < 0 || i > 3) {
                this.f11557d.remove(ironSourceLogger);
            } else {
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
                log(ironSourceTag2, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
                ironSourceLogger.setDebugLevel(i);
            }
        }
    }
}
