package com.applovin.impl.communicator;

import android.content.Context;
import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C8626v;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.communicator.b */
public class C8055b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private boolean f19519a = true;

    /* renamed from: b */
    private final String f19520b;

    /* renamed from: c */
    private final WeakReference<AppLovinCommunicatorSubscriber> f19521c;

    /* renamed from: d */
    private final Set<String> f19522d = new LinkedHashSet();

    /* renamed from: e */
    private final Object f19523e = new Object();

    C8055b(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f19520b = str;
        this.f19521c = new WeakReference<>(appLovinCommunicatorSubscriber);
    }

    /* renamed from: a */
    public String mo55960a() {
        return this.f19520b;
    }

    /* renamed from: a */
    public void mo55961a(boolean z) {
        this.f19519a = z;
    }

    /* renamed from: b */
    public AppLovinCommunicatorSubscriber mo55962b() {
        return (AppLovinCommunicatorSubscriber) this.f19521c.get();
    }

    /* renamed from: c */
    public boolean mo55963c() {
        return this.f19519a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8055b)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f19521c.get();
        C8055b bVar = (C8055b) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) bVar.f19521c.get();
        if (mo55960a().equals(bVar.mo55960a())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f19520b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f19521c.get();
        return (hashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (mo55962b() == null) {
            C8626v.m26258i("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        boolean z = false;
        synchronized (this.f19523e) {
            if (!this.f19522d.contains(communicatorMessageImpl.getUniqueId())) {
                this.f19522d.add(communicatorMessageImpl.getUniqueId());
                z = true;
            }
        }
        if (z) {
            mo55962b().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }
}
