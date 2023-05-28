package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3094jb;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.Response;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.kb */
public final class C3123kb {

    /* renamed from: a */
    private final C3094jb f8185a;

    /* renamed from: b */
    private final C2637Uh f8186b;

    public C3123kb(C3094jb jbVar, C2637Uh uh) {
        this.f8185a = jbVar;
        this.f8186b = uh;
    }

    /* renamed from: a */
    public final void mo17779a() {
        Request build = new Request.Builder(this.f8186b.mo16844c()).build();
        NetworkClient.Builder builder = new NetworkClient.Builder();
        C2007F0 g = C2007F0.m7154g();
        Intrinsics.checkNotNullExpressionValue(g, "GlobalServiceLocator.getInstance()");
        g.mo15757t().getClass();
        String str = null;
        NetworkClient.Builder withSslSocketFactory = builder.withSslSocketFactory((SSLSocketFactory) null);
        int i = C3209md.f8324a;
        NetworkClient.Builder withReadTimeout = withSslSocketFactory.withConnectTimeout(i).withReadTimeout(i);
        boolean z = false;
        NetworkClient build2 = withReadTimeout.withUseCaches(false).withInstanceFollowRedirects(true).build();
        Intrinsics.checkNotNullExpressionValue(build2, "NetworkClient.Builder()\n…rue)\n            .build()");
        Response execute = build2.newCall(build).execute();
        Intrinsics.checkNotNullExpressionValue(execute, "client.newCall(request).execute()");
        C3094jb jbVar = this.f8185a;
        if (execute.getCode() == 200) {
            z = true;
        }
        int length = execute.getResponseData().length;
        int code = execute.getCode();
        Throwable exception = execute.getException();
        if (exception != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(exception.getClass().getSimpleName());
            sb.append(" : ");
            Intrinsics.checkNotNullExpressionValue(exception, "it");
            sb.append(exception.getLocalizedMessage());
            str = sb.toString();
        }
        jbVar.mo17754a(new C3094jb.C3095a(z, code, length, str));
    }
}
