package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.h */
public class C8464h extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    public static int f21255a = -1;

    /* renamed from: b */
    private final AudioManager f21256b;

    /* renamed from: c */
    private final Context f21257c;

    /* renamed from: d */
    private final C8490n f21258d;

    /* renamed from: e */
    private final Set<C8466a> f21259e = new HashSet();

    /* renamed from: f */
    private final Object f21260f = new Object();

    /* renamed from: g */
    private boolean f21261g;

    /* renamed from: h */
    private int f21262h;

    /* renamed from: com.applovin.impl.sdk.h$a */
    public interface C8466a {
        /* renamed from: a */
        void mo55575a(int i);
    }

    C8464h(C8490n nVar) {
        this.f21258d = nVar;
        Context P = nVar.mo57332P();
        this.f21257c = P;
        this.f21256b = (AudioManager) P.getSystemService("audio");
    }

    /* renamed from: a */
    public static boolean m25510a(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: b */
    private void m25511b() {
        this.f21258d.mo57320D();
        if (C8626v.m26252a()) {
            this.f21258d.mo57320D().mo57818b("AudioSessionManager", "Observing ringer mode...");
        }
        this.f21262h = f21255a;
        this.f21257c.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f21258d.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        this.f21258d.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* renamed from: b */
    private void m25512b(final int i) {
        if (!this.f21261g) {
            this.f21258d.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D = this.f21258d.mo57320D();
                D.mo57818b("AudioSessionManager", "Ringer mode is " + i);
            }
            synchronized (this.f21260f) {
                for (final C8466a next : this.f21259e) {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() {
                        public void run() {
                            next.mo55575a(i);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: c */
    private void m25513c() {
        this.f21258d.mo57320D();
        if (C8626v.m26252a()) {
            this.f21258d.mo57320D().mo57818b("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f21257c.unregisterReceiver(this);
        this.f21258d.mo57372am().unregisterReceiver(this);
    }

    /* renamed from: a */
    public int mo57274a() {
        return this.f21256b.getRingerMode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo57275a(com.applovin.impl.sdk.C8464h.C8466a r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f21260f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f21259e     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x000d:
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f21259e     // Catch:{ all -> 0x0020 }
            r1.add(r3)     // Catch:{ all -> 0x0020 }
            java.util.Set<com.applovin.impl.sdk.h$a> r3 = r2.f21259e     // Catch:{ all -> 0x0020 }
            int r3 = r3.size()     // Catch:{ all -> 0x0020 }
            r1 = 1
            if (r3 != r1) goto L_0x001e
            r2.m25511b()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C8464h.mo57275a(com.applovin.impl.sdk.h$a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo57276b(com.applovin.impl.sdk.C8464h.C8466a r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f21260f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f21259e     // Catch:{ all -> 0x001f }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x000d:
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f21259e     // Catch:{ all -> 0x001f }
            r1.remove(r3)     // Catch:{ all -> 0x001f }
            java.util.Set<com.applovin.impl.sdk.h$a> r3 = r2.f21259e     // Catch:{ all -> 0x001f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x001d
            r2.m25513c()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C8464h.mo57276b(com.applovin.impl.sdk.h$a):void");
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            m25512b(this.f21256b.getRingerMode());
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f21261g = true;
            this.f21262h = this.f21256b.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f21261g = false;
            if (this.f21262h != this.f21256b.getRingerMode()) {
                this.f21262h = f21255a;
                m25512b(this.f21256b.getRingerMode());
            }
        }
    }
}
