package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.YandexMetricaPlugins;

/* renamed from: com.yandex.metrica.impl.ob.V2 */
public final class C2649V2 implements YandexMetricaPlugins {

    /* renamed from: a */
    private final C2563Tf f7026a;

    public C2649V2(C2563Tf tf) {
        this.f7026a = tf;
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f7026a.mo16709a(pluginErrorDetails, str);
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f7026a.mo16708a(pluginErrorDetails);
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f7026a.mo16710a(str, str2, pluginErrorDetails);
    }
}
