package com.applovin.communicator;

import android.content.Context;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.communicator.C8054a;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import java.util.Collections;
import java.util.List;

public final class AppLovinCommunicator {

    /* renamed from: a */
    private static AppLovinCommunicator f14575a;

    /* renamed from: b */
    private static final Object f14576b = new Object();

    /* renamed from: c */
    private C8490n f14577c;

    /* renamed from: d */
    private C8626v f14578d;

    /* renamed from: e */
    private final C8054a f14579e;

    /* renamed from: f */
    private final MessagingServiceImpl f14580f;

    private AppLovinCommunicator(Context context) {
        this.f14579e = new C8054a(context);
        this.f14580f = new MessagingServiceImpl(context);
    }

    /* renamed from: a */
    private void m17084a(String str) {
        if (this.f14578d != null && C8626v.m26252a()) {
            this.f14578d.mo57818b("AppLovinCommunicator", str);
        }
    }

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f14576b) {
            if (f14575a == null) {
                f14575a = new AppLovinCommunicator(context.getApplicationContext());
            }
        }
        return f14575a;
    }

    /* renamed from: a */
    public void mo52414a(C8490n nVar) {
        this.f14577c = nVar;
        this.f14578d = nVar.mo57320D();
        m17084a("Attached SDK instance: " + nVar + APSSharedUtil.TRUNCATE_SEPARATOR);
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f14580f;
    }

    public boolean hasSubscriber(String str) {
        return this.f14579e.mo55958a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f14577c.mo57369aj().mo57298c(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, (List<String>) Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String next : list) {
            if (!this.f14579e.mo55957a(appLovinCommunicatorSubscriber, next)) {
                m17084a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + next);
            }
        }
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f14577c + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, (List<String>) Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String next : list) {
            m17084a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + next);
            this.f14579e.mo55959b(appLovinCommunicatorSubscriber, next);
        }
    }
}
