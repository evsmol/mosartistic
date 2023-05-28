package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.rtm.service.EventToReporterProxy;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.rtm.wrapper.l */
public class C3782l implements C3776f {

    /* renamed from: a */
    private final EventToReporterProxy f9750a;

    public C3782l(C3779i iVar, Context context, Executor executor, C3780j jVar) {
        this(new EventToReporterProxy(new C3771a(iVar), context, executor, new C3773c(jVar)));
    }

    public void reportData(Bundle bundle) {
        try {
            this.f9750a.reportData(bundle);
        } catch (Throwable unused) {
        }
    }

    C3782l(EventToReporterProxy eventToReporterProxy) {
        this.f9750a = eventToReporterProxy;
    }
}
