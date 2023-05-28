package com.apm.insight.p178l;

import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.apm.insight.l.j */
public final class C6676j {

    /* renamed from: a */
    private static final Set<String> f14356a;

    static {
        HashSet hashSet = new HashSet();
        f14356a = hashSet;
        hashSet.add("HeapTaskDaemon");
        f14356a.add("ThreadPlus");
        f14356a.add("ApiDispatcher");
        f14356a.add("ApiLocalDispatcher");
        f14356a.add("AsyncLoader");
        f14356a.add("AsyncTask");
        f14356a.add("Binder");
        f14356a.add("PackageProcessor");
        f14356a.add("SettingsObserver");
        f14356a.add("WifiManager");
        f14356a.add("JavaBridge");
        f14356a.add("Compiler");
        f14356a.add("Signal Catcher");
        f14356a.add("GC");
        f14356a.add("ReferenceQueueDaemon");
        f14356a.add("FinalizerDaemon");
        f14356a.add("FinalizerWatchdogDaemon");
        f14356a.add("CookieSyncManager");
        f14356a.add("RefQueueWorker");
        f14356a.add("CleanupReference");
        f14356a.add("VideoManager");
        f14356a.add("DBHelper-AsyncOp");
        f14356a.add("InstalledAppTracker2");
        f14356a.add("AppData-AsyncOp");
        f14356a.add("IdleConnectionMonitor");
        f14356a.add("LogReaper");
        f14356a.add("ActionReaper");
        f14356a.add("Okio Watchdog");
        f14356a.add("CheckWaitingQueue");
        f14356a.add("NPTH-CrashTimer");
        f14356a.add("NPTH-JavaCallback");
        f14356a.add("NPTH-LocalParser");
        f14356a.add("ANR_FILE_MODIFY");
    }

    /* renamed from: a */
    public static Set<String> m16548a() {
        return f14356a;
    }

    /* renamed from: a */
    public static boolean m16549a(Throwable th) {
        if (th == null) {
            return true;
        }
        try {
            return (th instanceof ConnectTimeoutException) || (th instanceof SocketTimeoutException) || (th instanceof BindException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof PortUnreachableException) || (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof ProtocolException) || (th instanceof SSLException);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }
}
