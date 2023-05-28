package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.StackTraceItem;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.Yf */
public class C2744Yf implements IPluginReporter {

    /* renamed from: a */
    private final C2252Kn<PluginErrorDetails> f7236a = new C2103Hn(new C2069Gn("Error details"));

    /* renamed from: b */
    private final C2252Kn<String> f7237b = new C2103Hn(new C2035Fn("Error identifier"));

    /* renamed from: c */
    private final C2252Kn<Collection<StackTraceItem>> f7238c = new C2005En("Stacktrace");

    /* renamed from: a */
    public boolean mo17083a(PluginErrorDetails pluginErrorDetails, String str) {
        this.f7236a.mo15517a(pluginErrorDetails);
        return this.f7238c.mo15517a(pluginErrorDetails.getStacktrace()).mo15965b();
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f7236a.mo15517a(pluginErrorDetails);
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f7236a.mo15517a(pluginErrorDetails);
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f7237b.mo15517a(str);
    }
}
