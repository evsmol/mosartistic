package com.criteo.publisher;

import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.p074n0.C1311o;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import javax.net.ssl.SSLException;

/* renamed from: com.criteo.publisher.x */
/* compiled from: SafeRunnable */
public abstract class C1330x implements Runnable {

    /* renamed from: a */
    private final C1195g f4051a = C1197h.m5407b(C1330x.class);

    /* renamed from: b */
    private final StackTraceElement[] f4052b = Thread.currentThread().getStackTrace();

    /* renamed from: a */
    public abstract void mo3040a() throws Throwable;

    public void run() {
        try {
            mo3040a();
        } catch (Throwable th) {
            ExecutionException executionException = new ExecutionException(th);
            executionException.setStackTrace(this.f4052b);
            if (th instanceof RuntimeException) {
                C1311o.m5779a((Throwable) executionException);
            } else if (m5929a(th)) {
                this.f4051a.mo3337a(C1328v.m5924d(executionException));
            } else {
                this.f4051a.mo3337a(C1328v.m5923c(executionException));
            }
        }
    }

    /* renamed from: a */
    private boolean m5929a(Throwable th) {
        return (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof SSLException) || (th instanceof ProtocolException) || (th instanceof SocketTimeoutException);
    }
}
