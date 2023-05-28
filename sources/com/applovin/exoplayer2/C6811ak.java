package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.exoplayer2.C7397g;

/* renamed from: com.applovin.exoplayer2.ak */
public class C6811ak extends Exception implements C7397g {

    /* renamed from: k */
    public static final C7397g.C7398a<C6811ak> f14807k = $$Lambda$PI0wrKiCQtn6T0ZADJh0UvnZKvQ.INSTANCE;

    /* renamed from: i */
    public final int f14808i;

    /* renamed from: j */
    public final long f14809j;

    protected C6811ak(Bundle bundle) {
        this(bundle.getString(m17544a(2)), m17545a(bundle), bundle.getInt(m17544a(0), 1000), bundle.getLong(m17544a(1), SystemClock.elapsedRealtime()));
    }

    protected C6811ak(String str, Throwable th, int i, long j) {
        super(str, th);
        this.f14808i = i;
        this.f14809j = j;
    }

    /* renamed from: a */
    private static RemoteException m17543a(String str) {
        return new RemoteException(str);
    }

    /* renamed from: a */
    protected static String m17544a(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    private static Throwable m17545a(Bundle bundle) {
        String string = bundle.getString(m17544a(3));
        String string2 = bundle.getString(m17544a(4));
        Throwable th = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, C6811ak.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                th = m17546a(cls, string2);
            }
            if (th != null) {
                return th;
            }
        } catch (Throwable unused) {
        }
        return m17543a(string2);
    }

    /* renamed from: a */
    private static Throwable m17546a(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
    }
}
