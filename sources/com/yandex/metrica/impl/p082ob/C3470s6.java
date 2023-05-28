package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* renamed from: com.yandex.metrica.impl.ob.s6 */
public final class C3470s6 {

    /* renamed from: a */
    private final C1841A0 f9091a;

    public C3470s6(C1841A0 a0) {
        this.f9091a = a0;
    }

    /* renamed from: a */
    public final C2085H6 mo18202a(PluginErrorDetails pluginErrorDetails) {
        return C2111I6.m7360a(pluginErrorDetails.getExceptionClass(), pluginErrorDetails.getMessage(), pluginErrorDetails.getStacktrace(), pluginErrorDetails.getPlatform(), pluginErrorDetails.getVirtualMachineVersion(), pluginErrorDetails.getPluginEnvironment(), this.f9091a.mo15408a(), this.f9091a.mo15409b());
    }
}
