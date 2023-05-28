package com.appsgeyser.sdk.server.network;

public abstract class OnNetworkStateChangedListener {

    /* renamed from: id */
    private String f24839id;

    public abstract void networkIsDown();

    public abstract void networkIsUp();

    protected OnNetworkStateChangedListener(String str) {
        this.f24839id = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f24839id.equals(((OnNetworkStateChangedListener) obj).f24839id);
    }

    public int hashCode() {
        return this.f24839id.hashCode();
    }
}
