package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C3620wf;
import com.yandex.metrica.impl.p082ob.C3714z;

/* renamed from: com.yandex.metrica.impl.ob.u9 */
public class C3532u9 implements ProtobufConverter<C3714z, C3620wf.C3621a> {
    /* renamed from: a */
    public C3620wf.C3621a fromModel(C3714z zVar) {
        C3620wf.C3621a aVar = new C3620wf.C3621a();
        C3714z.C3715a aVar2 = zVar.f9547a;
        if (aVar2 != null) {
            int ordinal = aVar2.ordinal();
            if (ordinal == 0) {
                aVar.f9395a = 1;
            } else if (ordinal == 1) {
                aVar.f9395a = 2;
            } else if (ordinal == 2) {
                aVar.f9395a = 3;
            } else if (ordinal == 3) {
                aVar.f9395a = 4;
            } else if (ordinal == 4) {
                aVar.f9395a = 5;
            }
        }
        Boolean bool = zVar.f9548b;
        if (bool != null) {
            if (bool.booleanValue()) {
                aVar.f9396b = 1;
            } else {
                aVar.f9396b = 0;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public C3714z toModel(C3620wf.C3621a aVar) {
        C3714z.C3715a aVar2;
        int i = aVar.f9395a;
        Boolean bool = null;
        if (i == 1) {
            aVar2 = C3714z.C3715a.ACTIVE;
        } else if (i == 2) {
            aVar2 = C3714z.C3715a.WORKING_SET;
        } else if (i == 3) {
            aVar2 = C3714z.C3715a.FREQUENT;
        } else if (i != 4) {
            aVar2 = i != 5 ? null : C3714z.C3715a.RESTRICTED;
        } else {
            aVar2 = C3714z.C3715a.RARE;
        }
        int i2 = aVar.f9396b;
        if (i2 == 0) {
            bool = Boolean.FALSE;
        } else if (i2 == 1) {
            bool = Boolean.TRUE;
        }
        return new C3714z(aVar2, bool);
    }
}
