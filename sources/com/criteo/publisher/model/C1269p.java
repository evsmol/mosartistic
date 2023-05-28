package com.criteo.publisher.model;

import android.content.Context;
import com.criteo.publisher.context.C1065b;
import com.criteo.publisher.context.C1067c;
import com.criteo.publisher.context.C1068d;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.p061c0.C1061d;
import com.criteo.publisher.p067i0.C1150c;
import com.criteo.publisher.p070l0.C1173c;
import com.criteo.publisher.p074n0.C1289b;
import com.criteo.publisher.p074n0.C1300g;
import com.criteo.publisher.p074n0.C1315s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: com.criteo.publisher.model.p */
/* compiled from: CdbRequestFactory */
public class C1269p {

    /* renamed from: a */
    private final Context f3942a;

    /* renamed from: b */
    private final String f3943b;

    /* renamed from: c */
    private final C1278u f3944c;

    /* renamed from: d */
    private final C1289b f3945d;

    /* renamed from: e */
    private final C1173c f3946e;

    /* renamed from: f */
    private final C1061d f3947f;

    /* renamed from: g */
    private final C1300g f3948g;

    /* renamed from: h */
    private final C1150c f3949h;

    /* renamed from: i */
    private final C1065b f3950i;

    /* renamed from: j */
    private final C1068d f3951j;

    public C1269p(Context context, String str, C1278u uVar, C1289b bVar, C1173c cVar, C1061d dVar, C1300g gVar, C1150c cVar2, C1065b bVar2, C1068d dVar2) {
        this.f3942a = context;
        this.f3943b = str;
        this.f3944c = uVar;
        this.f3945d = bVar;
        this.f3946e = cVar;
        this.f3947f = dVar;
        this.f3948g = gVar;
        this.f3949h = cVar2;
        this.f3950i = bVar2;
        this.f3951j = dVar2;
    }

    /* renamed from: a */
    public C1268o mo3558a(List<C1267n> list, ContextData contextData) {
        return C1268o.m5609a(this.f3947f.mo3078a(), C1281v.m5683a(this.f3942a.getPackageName(), this.f3943b, mo3559a((Map<String, Object>[]) new Map[]{C1067c.m4979a(contextData)})), C1285z.m5710a(this.f3945d.mo3613b(), C1315s.m5788a(this.f3946e.mo3283d()), C1315s.m5788a(this.f3946e.mo3282c()), C1315s.m5788a(this.f3946e.mo3284e()), mo3559a((Map<String, Object>[]) new Map[]{this.f3950i.mo3101j(), C1067c.m4979a(this.f3951j.mo3104a())})), this.f3948g.mo3645q(), this.f3949h.mo3247b(), this.f3946e.mo3281b(), m5619a(list));
    }

    /* renamed from: a */
    private List<C1270q> m5619a(List<C1267n> list) {
        ArrayList arrayList = new ArrayList();
        for (C1267n a : list) {
            arrayList.add(m5618a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    private C1270q m5618a(C1267n nVar) {
        return C1270q.m5624a(this.f3947f.mo3078a(), nVar.mo3553b(), nVar.mo3552a(), nVar.mo3554c());
    }

    /* renamed from: a */
    public Future<String> mo3560a() {
        return this.f3944c.mo3602b();
    }

    @SafeVarargs
    /* renamed from: a */
    public final Map<String, Object> mo3559a(Map<String, Object>... mapArr) {
        Map linkedHashMap = new LinkedHashMap();
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        for (Map<String, Object> entrySet : mapArr) {
            for (Map.Entry next : entrySet.entrySet()) {
                String[] split = ((String) next.getKey()).split("\\.", -1);
                if (!m5620a(split)) {
                    Map map = linkedHashMap;
                    for (int i = 0; i < split.length - 1; i++) {
                        String str = split[i];
                        if (map.containsKey(str)) {
                            Object obj = map.get(str);
                            if (!newSetFromMap.contains(obj)) {
                                break;
                            }
                            map = (Map) obj;
                        } else {
                            Map linkedHashMap2 = new LinkedHashMap();
                            newSetFromMap.add(linkedHashMap2);
                            map.put(str, linkedHashMap2);
                            map = linkedHashMap2;
                        }
                    }
                    String str2 = split[split.length - 1];
                    if (!map.containsKey(str2)) {
                        map.put(str2, next.getValue());
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private boolean m5620a(String[] strArr) {
        for (String isEmpty : strArr) {
            if (isEmpty.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
