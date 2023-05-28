package com.bytedance.sdk.openadsdk.core.p020d;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.bytedance.sdk.openadsdk.core.d.a */
/* compiled from: FrequentCallController */
public class C0441a {

    /* renamed from: a */
    private static volatile C0441a f1468a;

    /* renamed from: b */
    private static volatile boolean f1469b;

    /* renamed from: c */
    private static volatile long f1470c;

    /* renamed from: d */
    private final Queue<C0443a> f1471d = new LinkedList();

    /* renamed from: e */
    private Handler f1472e;

    /* renamed from: f */
    private final C0516f f1473f = C0558m.m2673h();

    private C0441a() {
    }

    /* renamed from: a */
    public static C0441a m1805a() {
        if (f1468a == null) {
            synchronized (C0441a.class) {
                if (f1468a == null) {
                    f1468a = new C0441a();
                }
            }
        }
        return f1468a;
    }

    /* renamed from: b */
    private synchronized boolean m1810b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f1473f.mo1698i();
        long h = this.f1473f.mo1696h();
        if (this.f1471d.size() <= 0 || this.f1471d.size() < i) {
            this.f1471d.offer(new C0443a(currentTimeMillis, str));
        } else {
            long abs = Math.abs(currentTimeMillis - this.f1471d.peek().f1475a);
            if (abs <= h) {
                m1809b(h - abs);
                return true;
            }
            this.f1471d.poll();
            this.f1471d.offer(new C0443a(currentTimeMillis, str));
        }
        return false;
    }

    /* renamed from: a */
    public synchronized boolean mo1189a(String str) {
        if (m1810b(str)) {
            m1808a(true);
            m1806a(f1470c);
        } else {
            m1808a(false);
        }
        return f1469b;
    }

    /* renamed from: a */
    private synchronized void m1806a(long j) {
        if (this.f1472e == null) {
            this.f1472e = new Handler(Looper.getMainLooper());
        }
        this.f1472e.postDelayed(new Runnable() {
            public void run() {
                C0441a.this.m1808a(false);
            }
        }, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m1808a(boolean z) {
        f1469b = z;
    }

    /* renamed from: b */
    public synchronized boolean mo1190b() {
        return f1469b;
    }

    /* renamed from: b */
    private synchronized void m1809b(long j) {
        f1470c = j;
    }

    /* renamed from: c */
    public synchronized String mo1191c() {
        String str;
        HashMap hashMap = new HashMap();
        for (C0443a aVar : this.f1471d) {
            if (hashMap.containsKey(aVar.f1476b)) {
                hashMap.put(aVar.f1476b, Integer.valueOf(((Integer) hashMap.get(aVar.f1476b)).intValue() + 1));
            } else {
                hashMap.put(aVar.f1476b, 1);
            }
        }
        int i = RecyclerView.UNDEFINED_DURATION;
        str = "";
        for (String str2 : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(str2)).intValue();
            if (i < intValue) {
                str = str2;
                i = intValue;
            }
        }
        return str;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.d.a$a */
    /* compiled from: FrequentCallController */
    private static class C0443a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f1475a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f1476b;

        private C0443a(long j, String str) {
            this.f1475a = j;
            this.f1476b = str;
        }
    }
}
