package com.yandex.metrica.modules.api;

import kotlin.jvm.internal.Intrinsics;

public final class ModuleFullRemoteConfig {

    /* renamed from: a */
    private final CommonIdentifiers f9614a;

    /* renamed from: b */
    private final RemoteConfigMetaInfo f9615b;

    /* renamed from: c */
    private final Object f9616c;

    public ModuleFullRemoteConfig(CommonIdentifiers commonIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        Intrinsics.checkNotNullParameter(commonIdentifiers, "commonIdentifiers");
        Intrinsics.checkNotNullParameter(remoteConfigMetaInfo, "remoteConfigMetaInfo");
        this.f9614a = commonIdentifiers;
        this.f9615b = remoteConfigMetaInfo;
        this.f9616c = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleFullRemoteConfig)) {
            return false;
        }
        ModuleFullRemoteConfig moduleFullRemoteConfig = (ModuleFullRemoteConfig) obj;
        return Intrinsics.areEqual((Object) this.f9614a, (Object) moduleFullRemoteConfig.f9614a) && Intrinsics.areEqual((Object) this.f9615b, (Object) moduleFullRemoteConfig.f9615b) && Intrinsics.areEqual(this.f9616c, moduleFullRemoteConfig.f9616c);
    }

    public int hashCode() {
        CommonIdentifiers commonIdentifiers = this.f9614a;
        int i = 0;
        int hashCode = (commonIdentifiers != null ? commonIdentifiers.hashCode() : 0) * 31;
        RemoteConfigMetaInfo remoteConfigMetaInfo = this.f9615b;
        int hashCode2 = (hashCode + (remoteConfigMetaInfo != null ? remoteConfigMetaInfo.hashCode() : 0)) * 31;
        Object obj = this.f9616c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ModuleFullRemoteConfig(commonIdentifiers=" + this.f9614a + ", remoteConfigMetaInfo=" + this.f9615b + ", moduleConfig=" + this.f9616c + ")";
    }
}
