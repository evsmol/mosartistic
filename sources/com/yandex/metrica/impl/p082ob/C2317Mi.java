package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2572Tl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Mi */
public final class C2317Mi {

    /* renamed from: a */
    private final C3097jd f6230a;

    /* renamed from: com.yandex.metrica.impl.ob.Mi$a */
    static final class C2318a extends Lambda implements Function1<Map.Entry<? extends String, ? extends C3029hd>, Object> {

        /* renamed from: a */
        final /* synthetic */ C2572Tl.C2573a f6231a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2318a(C2572Tl.C2573a aVar) {
            super(1);
            this.f6231a = aVar;
        }

        public Object invoke(Object obj) {
            return ((C3029hd) ((Map.Entry) obj).getValue()).parse((JSONObject) this.f6231a);
        }
    }

    public C2317Mi() {
        C2007F0 g = C2007F0.m7154g();
        Intrinsics.checkNotNullExpressionValue(g, "GlobalServiceLocator.getInstance()");
        C3097jd j = g.mo15747j();
        Intrinsics.checkNotNullExpressionValue(j, "GlobalServiceLocator.get…tance().modulesController");
        this.f6230a = j;
    }

    /* renamed from: a */
    public final void mo16322a(C2638Ui ui, C2572Tl.C2573a aVar) {
        Map<String, C3029hd> c = this.f6230a.mo17765c();
        C2318a aVar2 = new C2318a(aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : c.entrySet()) {
            Object invoke = aVar2.invoke(next);
            if (invoke != null) {
                linkedHashMap.put(next.getKey(), invoke);
            }
        }
        ui.mo16894b((Map<String, Object>) linkedHashMap);
    }
}
