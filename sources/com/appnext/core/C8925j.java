package com.appnext.core;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;

/* renamed from: com.appnext.core.j */
public final class C8925j {

    /* renamed from: hp */
    private static C8925j f22643hp;

    /* renamed from: be */
    private int f22644be = 24;
    /* access modifiers changed from: private */

    /* renamed from: hq */
    public HashMap<String, SharedPreferences> f22645hq = new HashMap<>();

    private C8925j() {
    }

    /* renamed from: d */
    public final void mo59031d(final Context context, final String str) {
        if (!this.f22645hq.containsKey(str.replace("/", ""))) {
            new Thread(new Runnable() {
                public final void run() {
                    HashMap a = C8925j.this.f22645hq;
                    String str = str;
                    Context context = context;
                    a.put(str, context.getSharedPreferences("apnxt_cap" + str.replace("/", ""), 0));
                }
            }).start();
        }
    }

    /* renamed from: bj */
    public static synchronized C8925j m26963bj() {
        C8925j jVar;
        synchronized (C8925j.class) {
            if (f22643hp == null) {
                f22643hp = new C8925j();
            }
            jVar = f22643hp;
        }
        return jVar;
    }

    /* renamed from: n */
    public final void mo59032n(String str, String str2) {
        this.f22645hq.get(str2).edit().putLong(str, System.currentTimeMillis()).apply();
    }

    /* renamed from: o */
    public final boolean mo59033o(String str, String str2) {
        long j = this.f22645hq.get(str2).getLong(str, -1);
        return j != -1 && System.currentTimeMillis() - ((long) (this.f22644be * 3600000)) <= j;
    }

    /* renamed from: p */
    public final boolean mo59034p(String str, String str2) {
        long j = this.f22645hq.get(str2).getLong(str, -1);
        return j != -1 && System.currentTimeMillis() - 120000 <= j;
    }

    /* renamed from: ab */
    public final void mo59029ab(String str) {
        this.f22645hq.get(str).edit().clear().apply();
    }

    /* renamed from: b */
    public final void mo59030b(int i) {
        this.f22644be = i;
    }
}
