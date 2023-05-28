package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.identifiers.impl.r */
public final class C1833r implements C1824i {

    /* renamed from: a */
    private final C1820e f5007a;

    public C1833r() {
        this(new C1820e(C1834s.f5008a, C1832q.f5006a, "huawei"));
    }

    public C1833r(C1820e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "connectionController");
        this.f5007a = eVar;
    }

    /* renamed from: a */
    public C1822g mo15400a(Context context) {
        C1822g gVar;
        C1820e eVar;
        C1822g gVar2;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            C1837v vVar = (C1837v) this.f5007a.mo15389a(context);
            gVar = new C1822g(C1827l.OK, new C1821f("huawei", vVar.mo15402a(), Boolean.valueOf(vVar.mo15404c())), (String) null, 4);
            try {
                eVar = this.f5007a;
            } catch (Throwable unused) {
            }
        } catch (C1825j e) {
            String message = e.getMessage();
            if (message == null) {
                message = "unknown exception during binding huawei services";
            }
            Intrinsics.checkNotNullParameter(message, "errorMessage");
            gVar2 = new C1822g(C1827l.IDENTIFIER_PROVIDER_UNAVAILABLE, (C1821f) null, message);
        } catch (Throwable th) {
            try {
                this.f5007a.mo15390b(context);
            } catch (Throwable unused2) {
            }
            throw th;
        }
        eVar.mo15390b(context);
        return gVar;
        gVar = gVar2;
        eVar = this.f5007a;
        eVar.mo15390b(context);
        return gVar;
    }
}
