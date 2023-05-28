package com.bykv.p271vk.openvk.component.video.p272a.p276b;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.j */
/* compiled from: SkipProxySelector */
class C10144j extends ProxySelector {

    /* renamed from: a */
    private static final List<Proxy> f25064a = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: b */
    private final ProxySelector f25065b = ProxySelector.getDefault();

    /* renamed from: c */
    private final String f25066c;

    /* renamed from: d */
    private final int f25067d;

    private C10144j(String str, int i) {
        this.f25066c = str;
        this.f25067d = i;
    }

    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return (!this.f25066c.equalsIgnoreCase(uri.getHost()) || this.f25067d != uri.getPort()) ? this.f25065b.select(uri) : f25064a;
        }
        throw new IllegalArgumentException("URI can't be null");
    }

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f25065b.connectFailed(uri, socketAddress, iOException);
    }

    /* renamed from: a */
    static void m28890a(String str, int i) {
        ProxySelector.setDefault(new C10144j(str, i));
    }
}
