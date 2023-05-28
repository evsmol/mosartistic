package com.ironsource.mediationsdk.utils;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C4605b;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.utils.e */
public final class C4716e {

    /* renamed from: a */
    public Map<String, Integer> f11792a;

    /* renamed from: b */
    C4715d f11793b;

    /* renamed from: c */
    public IronSourceLoggerManager f11794c;

    /* renamed from: d */
    private Map<String, Integer> f11795d;

    /* renamed from: e */
    private Map<String, String> f11796e;

    /* renamed from: f */
    private String f11797f;

    /* renamed from: g */
    private Timer f11798g = null;

    public C4716e(String str, C4715d dVar) {
        this.f11797f = str;
        this.f11793b = dVar;
        this.f11792a = new HashMap();
        this.f11795d = new HashMap();
        this.f11796e = new HashMap();
        this.f11794c = IronSourceLoggerManager.getLogger();
        mo34176a();
    }

    /* renamed from: a */
    private void m13787a(String str, int i) {
        this.f11795d.put(str, Integer.valueOf(i));
        this.f11796e.put(str, m13790c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m13793e(str), i);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m13794f(str), m13790c());
    }

    /* renamed from: b */
    private int m13788b(String str) {
        if (!m13790c().equalsIgnoreCase(m13791c(str))) {
            mo34178a(str);
        }
        return m13792d(str);
    }

    /* renamed from: b */
    private static Date m13789b() {
        Random random = new Random();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, random.nextInt(10));
        gregorianCalendar.set(13, random.nextInt(60));
        gregorianCalendar.set(14, random.nextInt(1000));
        gregorianCalendar.add(5, 1);
        return gregorianCalendar.getTime();
    }

    /* renamed from: c */
    private static String m13790c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    /* renamed from: c */
    private String m13791c(String str) {
        if (this.f11796e.containsKey(str)) {
            return this.f11796e.get(str);
        }
        String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m13794f(str), m13790c());
        this.f11796e.put(str, stringFromSharedPrefs);
        return stringFromSharedPrefs;
    }

    /* renamed from: d */
    private int m13792d(String str) {
        if (this.f11795d.containsKey(str)) {
            return this.f11795d.get(str).intValue();
        }
        int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m13793e(str), 0);
        this.f11795d.put(str, Integer.valueOf(intFromSharedPrefs));
        return intFromSharedPrefs;
    }

    /* renamed from: e */
    private static String m13793e(String str) {
        return str + "_counter";
    }

    /* renamed from: f */
    private static String m13794f(String str) {
        return str + "_day";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34176a() {
        Timer timer = this.f11798g;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f11798g = timer2;
        timer2.schedule(new TimerTask() {
            public final void run() {
                C4716e eVar = C4716e.this;
                synchronized (eVar) {
                    try {
                        for (String a : eVar.f11792a.keySet()) {
                            eVar.mo34178a(a);
                        }
                        eVar.f11793b.mo33320g();
                        eVar.mo34176a();
                    } catch (Exception e) {
                        eVar.f11794c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "onTimerTick", e);
                    }
                }
            }
        }, m13789b());
    }

    /* renamed from: a */
    public final void mo34177a(C4605b bVar) {
        synchronized (this) {
            try {
                String d = mo34181d(bVar);
                if (this.f11792a.containsKey(d)) {
                    m13787a(d, m13788b(d) + 1);
                }
            } catch (Exception e) {
                this.f11794c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "increaseShowCounter", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34178a(String str) {
        this.f11795d.put(str, 0);
        this.f11796e.put(str, m13790c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m13793e(str), 0);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m13794f(str), m13790c());
    }

    /* renamed from: b */
    public final boolean mo34179b(C4605b bVar) {
        synchronized (this) {
            boolean z = false;
            try {
                String d = mo34181d(bVar);
                if (!this.f11792a.containsKey(d)) {
                    return false;
                }
                if (m13790c().equalsIgnoreCase(m13791c(d))) {
                    return false;
                }
                if (this.f11792a.get(d).intValue() <= m13792d(d)) {
                    z = true;
                }
                return z;
            } catch (Exception e) {
                this.f11794c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "shouldSendCapReleasedEvent", e);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo34180c(C4605b bVar) {
        synchronized (this) {
            boolean z = false;
            try {
                String d = mo34181d(bVar);
                if (!this.f11792a.containsKey(d)) {
                    return false;
                }
                if (this.f11792a.get(d).intValue() <= m13788b(d)) {
                    z = true;
                }
                return z;
            } catch (Exception e) {
                this.f11794c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "isCapped", e);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public String mo34181d(C4605b bVar) {
        return this.f11797f + "_" + bVar.f11362f + "_" + bVar.mo33867j();
    }
}
