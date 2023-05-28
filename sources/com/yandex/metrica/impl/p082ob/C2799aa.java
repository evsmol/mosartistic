package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C3552ui;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.aa */
public class C2799aa implements ProtobufConverter<C3552ui, C2121If.C2150t> {

    /* renamed from: a */
    private static final EnumMap<C3552ui.C3554b, String> f7384a;

    /* renamed from: b */
    private static final Map<String, C3552ui.C3554b> f7385b;

    static {
        EnumMap<C3552ui.C3554b, String> enumMap = new EnumMap<>(C3552ui.C3554b.class);
        f7384a = enumMap;
        HashMap hashMap = new HashMap();
        f7385b = hashMap;
        C3552ui.C3554b bVar = C3552ui.C3554b.WIFI;
        enumMap.put(bVar, "wifi");
        C3552ui.C3554b bVar2 = C3552ui.C3554b.CELL;
        enumMap.put(bVar2, "cell");
        hashMap.put("wifi", bVar);
        hashMap.put("cell", bVar2);
    }

    /* renamed from: a */
    public C2121If.C2150t fromModel(C3552ui uiVar) {
        C2121If.C2150t tVar = new C2121If.C2150t();
        if (uiVar.f9246a != null) {
            C2121If.C2151u uVar = new C2121If.C2151u();
            tVar.f5724a = uVar;
            C3552ui.C3553a aVar = uiVar.f9246a;
            uVar.f5726a = aVar.f9248a;
            uVar.f5727b = aVar.f9249b;
        }
        if (uiVar.f9247b != null) {
            C2121If.C2151u uVar2 = new C2121If.C2151u();
            tVar.f5725b = uVar2;
            C3552ui.C3553a aVar2 = uiVar.f9247b;
            uVar2.f5726a = aVar2.f9248a;
            uVar2.f5727b = aVar2.f9249b;
        }
        return tVar;
    }

    /* renamed from: a */
    public C3552ui toModel(C2121If.C2150t tVar) {
        C2121If.C2151u uVar = tVar.f5724a;
        C3552ui.C3553a aVar = null;
        C3552ui.C3553a aVar2 = uVar != null ? new C3552ui.C3553a(uVar.f5726a, uVar.f5727b) : null;
        C2121If.C2151u uVar2 = tVar.f5725b;
        if (uVar2 != null) {
            aVar = new C3552ui.C3553a(uVar2.f5726a, uVar2.f5727b);
        }
        return new C3552ui(aVar2, aVar);
    }
}
