package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3720z4;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;

/* renamed from: com.yandex.metrica.impl.ob.p0 */
public class C3333p0<C extends C3720z4> extends C3603w2<C> {

    /* renamed from: e */
    private final C1976E4 f8544e;

    /* renamed from: f */
    private final C2827b8 f8545f;

    public C3333p0(C c, C3707yi yiVar, C1976E4 e4, C2827b8 b8Var) {
        super(c, yiVar);
        this.f8544e = e4;
        this.f8545f = b8Var;
    }

    /* renamed from: a */
    public void mo17925a(C2851c0 c0Var) {
        if (!this.f9367c) {
            synchronized (this.f9366b) {
                if (!this.f9367c) {
                    mo16586f();
                }
            }
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(C3443rd.m10616a(((C3720z4) mo18355e()).mo18447b(), (ConfigProvider) mo18355e(), c0Var, this.f8544e, this.f8545f));
        }
    }
}
