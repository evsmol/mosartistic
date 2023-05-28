package com.yandex.metrica.rtm.wrapper;

import com.yandex.metrica.rtm.client.DataSender;
import com.yandex.metrica.rtm.client.ReporterDescriptor;

/* renamed from: com.yandex.metrica.rtm.wrapper.g */
public class C3777g implements C3774d {

    /* renamed from: a */
    private final DataSender f9748a;

    public C3777g(C3781k kVar, String str, boolean z) throws Throwable {
        this(new C3772b(new DataSender(new C3783m(kVar), new ReporterDescriptor(str, z))));
    }

    C3777g(C3772b bVar) throws Throwable {
        this.f9748a = bVar.mo18654a();
    }
}
