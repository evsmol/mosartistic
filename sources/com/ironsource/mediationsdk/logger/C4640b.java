package com.ironsource.mediationsdk.logger;

import com.ironsource.environment.p124e.C4401c;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* renamed from: com.ironsource.mediationsdk.logger.b */
public final class C4640b extends IronSourceLogger {

    /* renamed from: c */
    public LogListener f11558c;

    private C4640b() {
        super("publisher");
    }

    public C4640b(LogListener logListener, int i) {
        super("publisher", 1);
        this.f11558c = null;
    }

    public final synchronized void log(final IronSourceLogger.IronSourceTag ironSourceTag, final String str, final int i) {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (C4640b.this.f11558c != null && str != null) {
                    C4640b.this.f11558c.onLog(ironSourceTag, str, i);
                }
            }
        });
    }

    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}
