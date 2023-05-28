package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.L */
public final class C4474L {

    /* renamed from: a */
    ConcurrentHashMap<String, CopyOnWriteArrayList<C4470J>> f10767a = new ConcurrentHashMap<>();

    /* renamed from: b */
    String f10768b = "";

    /* renamed from: c */
    C4470J f10769c;

    /* renamed from: d */
    private String f10770d = "";

    /* renamed from: e */
    private final List<String> f10771e;

    /* renamed from: f */
    private final int f10772f;

    /* renamed from: g */
    private final Timer f10773g = new Timer();

    public C4474L(List<String> list, int i) {
        this.f10771e = list;
        this.f10772f = i;
    }

    /* renamed from: c */
    private synchronized boolean m12859c() {
        return this.f10769c != null && this.f10769c.f10744b.equals(this.f10770d);
    }

    /* renamed from: d */
    private void m12860d() {
        Iterator<C4470J> it = mo33480a().iterator();
        while (it.hasNext()) {
            C4514Y next = it.next();
            if (!next.equals(this.f10769c)) {
                next.mo33546d();
            }
        }
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<C4470J> mo33480a() {
        CopyOnWriteArrayList<C4470J> copyOnWriteArrayList = this.f10767a.get(this.f10768b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    /* renamed from: a */
    public final synchronized void mo33481a(C4470J j) {
        IronLog.INTERNAL.verbose("");
        if (this.f10769c != null && !this.f10769c.equals(j)) {
            this.f10769c.mo33546d();
        }
        this.f10769c = j;
    }

    /* renamed from: a */
    public final void mo33482a(CopyOnWriteArrayList<C4470J> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        m12860d();
        this.f10767a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f10770d)) {
            if (m12859c()) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("ad from previous waterfall " + this.f10770d + " is still showing - the current waterfall " + this.f10768b + " will be deleted instead");
                String str2 = this.f10768b;
                this.f10768b = this.f10770d;
                this.f10770d = str2;
            }
            final String str3 = this.f10770d;
            this.f10773g.schedule(new TimerTask() {
                public final void run() {
                    try {
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.verbose("removing waterfall with id " + str3 + " from memory");
                        C4474L.this.f10767a.remove(str3);
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.verbose("waterfall size is currently " + C4474L.this.f10767a.size());
                    } finally {
                        cancel();
                    }
                }
            }, (long) this.f10772f);
        }
        this.f10770d = this.f10768b;
        this.f10768b = str;
    }

    /* renamed from: b */
    public final boolean mo33483b() {
        return this.f10767a.size() > 5;
    }

    /* renamed from: b */
    public final synchronized boolean mo33484b(C4470J j) {
        boolean z;
        IronLog.INTERNAL.verbose("");
        if (j != null) {
            if (this.f10769c != null) {
                if (j.mo33464c() != LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK || !this.f10769c.mo33612k().equals(j.mo33612k())) {
                    if ((j.mo33464c() == LoadWhileShowSupportState.NONE || this.f10771e.contains(j.mo33613l())) && this.f10769c.mo33613l().equals(j.mo33613l())) {
                    }
                }
            }
            z = false;
            if (z && j != null) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(j.mo33612k() + " does not support load while show and will not be added to the auction request");
            }
        }
        z = true;
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.verbose(j.mo33612k() + " does not support load while show and will not be added to the auction request");
        return !z;
    }
}
