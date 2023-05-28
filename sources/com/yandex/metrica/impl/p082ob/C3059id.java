package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.modules.api.CommonIdentifiers;
import com.yandex.metrica.modules.api.ModuleFullRemoteConfig;
import com.yandex.metrica.modules.api.RemoteConfigMetaInfo;

/* renamed from: com.yandex.metrica.impl.ob.id */
public final class C3059id {

    /* renamed from: a */
    private final CommonIdentifiers f8054a;

    /* renamed from: b */
    private final RemoteConfigMetaInfo f8055b;

    /* renamed from: c */
    private final C3356pi f8056c;

    public C3059id(C3356pi piVar) {
        this.f8056c = piVar;
        this.f8054a = new CommonIdentifiers(piVar.mo17968V(), piVar.mo17977i());
        this.f8055b = new RemoteConfigMetaInfo(piVar.mo17983o(), piVar.mo17948B());
    }

    /* renamed from: a */
    public final ModuleFullRemoteConfig<Object> mo17712a(String str) {
        return new ModuleFullRemoteConfig(this.f8054a, this.f8055b, this.f8056c.mo17947A().get(str));
    }
}
