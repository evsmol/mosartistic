package com.yandex.metrica.impl.p082ob;

import android.util.Log;
import com.yandex.metrica.C10722f;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.plugins.PluginErrorDetails;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Tf */
public final class C2563Tf {

    /* renamed from: a */
    private final ICommonExecutor f6784a;

    /* renamed from: b */
    private final C2522Sf f6785b;

    /* renamed from: c */
    private final C2243Kf f6786c;

    /* renamed from: d */
    private final C2718Xf f6787d;

    /* renamed from: e */
    private final C10722f f6788e;

    /* renamed from: com.yandex.metrica.impl.ob.Tf$a */
    static final class C2564a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2563Tf f6789a;

        /* renamed from: b */
        final /* synthetic */ PluginErrorDetails f6790b;

        /* renamed from: c */
        final /* synthetic */ String f6791c;

        C2564a(C2563Tf tf, PluginErrorDetails pluginErrorDetails, String str) {
            this.f6789a = tf;
            this.f6790b = pluginErrorDetails;
            this.f6791c = str;
        }

        public final void run() {
            C2563Tf.m8487a(this.f6789a).getPluginExtension().reportError(this.f6790b, this.f6791c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Tf$b */
    static final class C2565b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2563Tf f6792a;

        /* renamed from: b */
        final /* synthetic */ String f6793b;

        /* renamed from: c */
        final /* synthetic */ String f6794c;

        /* renamed from: d */
        final /* synthetic */ PluginErrorDetails f6795d;

        C2565b(C2563Tf tf, String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f6792a = tf;
            this.f6793b = str;
            this.f6794c = str2;
            this.f6795d = pluginErrorDetails;
        }

        public final void run() {
            C2563Tf.m8487a(this.f6792a).getPluginExtension().reportError(this.f6793b, this.f6794c, this.f6795d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Tf$c */
    static final class C2566c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2563Tf f6796a;

        /* renamed from: b */
        final /* synthetic */ PluginErrorDetails f6797b;

        C2566c(C2563Tf tf, PluginErrorDetails pluginErrorDetails) {
            this.f6796a = tf;
            this.f6797b = pluginErrorDetails;
        }

        public final void run() {
            C2563Tf.m8487a(this.f6796a).getPluginExtension().reportUnhandledException(this.f6797b);
        }
    }

    public C2563Tf(ICommonExecutor iCommonExecutor, C2522Sf sf, C2243Kf kf, C2718Xf xf, C10722f fVar) {
        this.f6784a = iCommonExecutor;
        this.f6785b = sf;
        this.f6786c = kf;
        this.f6787d = xf;
        this.f6788e = fVar;
    }

    /* renamed from: a */
    public final void mo16708a(PluginErrorDetails pluginErrorDetails) {
        this.f6786c.mo15517a(null);
        this.f6787d.mo17111a().reportUnhandledException(pluginErrorDetails);
        C10722f fVar = this.f6788e;
        Intrinsics.checkNotNull(pluginErrorDetails);
        fVar.getClass();
        this.f6784a.execute(new C2566c(this, pluginErrorDetails));
    }

    public C2563Tf(ICommonExecutor iCommonExecutor) {
        this(iCommonExecutor, new C2522Sf());
    }

    private C2563Tf(ICommonExecutor iCommonExecutor, C2522Sf sf) {
        this(iCommonExecutor, sf, new C2243Kf(sf), new C2718Xf(), new C10722f(sf, new C1939D2()));
    }

    /* renamed from: a */
    public final void mo16709a(PluginErrorDetails pluginErrorDetails, String str) {
        this.f6786c.mo15517a(null);
        if (!this.f6787d.mo17111a().mo17083a(pluginErrorDetails, str)) {
            Log.w("AppMetrica", "Error stacktrace must be non empty");
            return;
        }
        C10722f fVar = this.f6788e;
        Intrinsics.checkNotNull(pluginErrorDetails);
        fVar.getClass();
        this.f6784a.execute(new C2564a(this, pluginErrorDetails, str));
    }

    /* renamed from: a */
    public final void mo16710a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f6786c.mo15517a(null);
        this.f6787d.mo17111a().reportError(str, str2, pluginErrorDetails);
        C10722f fVar = this.f6788e;
        Intrinsics.checkNotNull(str);
        fVar.getClass();
        this.f6784a.execute(new C2565b(this, str, str2, pluginErrorDetails));
    }

    /* renamed from: a */
    public static final C2214K0 m8487a(C2563Tf tf) {
        tf.f6785b.getClass();
        C2470R2 k = C2470R2.m8232k();
        Intrinsics.checkNotNull(k);
        Intrinsics.checkNotNullExpressionValue(k, "provider.peekInitializedImpl()!!");
        C3110k1 d = k.mo16545d();
        Intrinsics.checkNotNull(d);
        Intrinsics.checkNotNullExpressionValue(d, "provider.peekInitialized…rterApiConsumerProvider!!");
        C2214K0 b = d.mo17772b();
        Intrinsics.checkNotNullExpressionValue(b, "provider.peekInitialized…erProvider!!.mainReporter");
        return b;
    }
}
