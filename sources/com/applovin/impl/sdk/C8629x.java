package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p252ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.applovin.impl.sdk.x */
class C8629x {

    /* renamed from: a */
    private final Queue<AppLovinAdImpl> f21792a = new LinkedList();

    /* renamed from: b */
    private final Object f21793b = new Object();

    C8629x() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo57826a() {
        int size;
        synchronized (this.f21793b) {
            size = this.f21792a.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo57827a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f21793b) {
            if (mo57826a() <= 25) {
                this.f21792a.offer(appLovinAdImpl);
            } else {
                C8626v.m26258i("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo57828b() {
        boolean z;
        synchronized (this.f21793b) {
            z = mo57826a() == 0;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AppLovinAdImpl mo57829c() {
        AppLovinAdImpl poll;
        synchronized (this.f21793b) {
            poll = !mo57828b() ? this.f21792a.poll() : null;
        }
        return poll;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public AppLovinAdImpl mo57830d() {
        AppLovinAdImpl peek;
        synchronized (this.f21793b) {
            peek = this.f21792a.peek();
        }
        return peek;
    }
}
