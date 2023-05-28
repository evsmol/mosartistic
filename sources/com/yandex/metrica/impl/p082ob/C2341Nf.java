package com.yandex.metrica.impl.p082ob;

import android.util.Log;
import com.yandex.metrica.C10722f;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;

/* renamed from: com.yandex.metrica.impl.ob.Nf */
public class C2341Nf implements IPluginReporter {

    /* renamed from: a */
    private final C2744Yf f6271a;

    /* renamed from: b */
    private final C10722f f6272b;

    /* renamed from: c */
    private final ICommonExecutor f6273c;

    /* renamed from: d */
    private final C3422qm<C2291M0> f6274d;

    /* renamed from: com.yandex.metrica.impl.ob.Nf$a */
    class C2342a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PluginErrorDetails f6275a;

        C2342a(PluginErrorDetails pluginErrorDetails) {
            this.f6275a = pluginErrorDetails;
        }

        public void run() {
            C2341Nf.m8026a(C2341Nf.this).reportUnhandledException(this.f6275a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nf$b */
    class C2343b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PluginErrorDetails f6277a;

        /* renamed from: b */
        final /* synthetic */ String f6278b;

        C2343b(PluginErrorDetails pluginErrorDetails, String str) {
            this.f6277a = pluginErrorDetails;
            this.f6278b = str;
        }

        public void run() {
            C2341Nf.m8026a(C2341Nf.this).reportError(this.f6277a, this.f6278b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nf$c */
    class C2344c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6280a;

        /* renamed from: b */
        final /* synthetic */ String f6281b;

        /* renamed from: c */
        final /* synthetic */ PluginErrorDetails f6282c;

        C2344c(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f6280a = str;
            this.f6281b = str2;
            this.f6282c = pluginErrorDetails;
        }

        public void run() {
            C2341Nf.m8026a(C2341Nf.this).reportError(this.f6280a, this.f6281b, this.f6282c);
        }
    }

    public C2341Nf(C2744Yf yf, C10722f fVar, ICommonExecutor iCommonExecutor, C3422qm<C2291M0> qmVar) {
        this.f6271a = yf;
        this.f6272b = fVar;
        this.f6273c = iCommonExecutor;
        this.f6274d = qmVar;
    }

    /* renamed from: a */
    static IPluginReporter m8026a(C2341Nf nf) {
        return nf.f6274d.mo16401a().getPluginExtension();
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        if (!this.f6271a.mo17083a(pluginErrorDetails, str)) {
            Log.w("AppMetrica", "Error stacktrace must be non empty");
            return;
        }
        this.f6272b.getClass();
        this.f6273c.execute(new C2343b(pluginErrorDetails, str));
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f6271a.reportUnhandledException(pluginErrorDetails);
        this.f6272b.getClass();
        this.f6273c.execute(new C2342a(pluginErrorDetails));
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f6271a.reportError(str, str2, pluginErrorDetails);
        this.f6272b.getClass();
        this.f6273c.execute(new C2344c(str, str2, pluginErrorDetails));
    }
}
