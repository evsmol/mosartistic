package com.yandex.metrica.modules.api;

public final class RemoteConfigMetaInfo {

    /* renamed from: a */
    private final long f9617a;

    /* renamed from: b */
    private final long f9618b;

    public RemoteConfigMetaInfo(long j, long j2) {
        this.f9617a = j;
        this.f9618b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteConfigMetaInfo)) {
            return false;
        }
        RemoteConfigMetaInfo remoteConfigMetaInfo = (RemoteConfigMetaInfo) obj;
        return this.f9617a == remoteConfigMetaInfo.f9617a && this.f9618b == remoteConfigMetaInfo.f9618b;
    }

    public int hashCode() {
        long j = this.f9617a;
        long j2 = this.f9618b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "RemoteConfigMetaInfo(firstSendTime=" + this.f9617a + ", lastUpdateTime=" + this.f9618b + ")";
    }
}
