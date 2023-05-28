package com.yandex.metrica.networktasks.api;

public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {

    /* renamed from: b */
    private static volatile NetworkServiceLocator f9669b;

    /* renamed from: a */
    private NetworkCore f9670a;

    private NetworkServiceLocator() {
    }

    public static NetworkServiceLocator getInstance() {
        return f9669b;
    }

    public static void init() {
        if (f9669b == null) {
            synchronized (NetworkServiceLocator.class) {
                if (f9669b == null) {
                    f9669b = new NetworkServiceLocator();
                }
            }
        }
    }

    public NetworkCore getNetworkCore() {
        return this.f9670a;
    }

    public void initAsync() {
        if (this.f9670a == null) {
            synchronized (this) {
                if (this.f9670a == null) {
                    NetworkCore networkCore = new NetworkCore();
                    this.f9670a = networkCore;
                    networkCore.setName("YMM-NC");
                    this.f9670a.start();
                }
            }
        }
    }

    public void onCreate() {
    }

    public void onDestroy() {
        NetworkCore networkCore = this.f9670a;
        if (networkCore != null) {
            networkCore.onDestroy();
        }
    }
}
