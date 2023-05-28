package com.bytedance.sdk.component.p313d.p314a;

import com.bytedance.sdk.component.p313d.C10559h;
import com.bytedance.sdk.component.p313d.C10562k;
import com.bytedance.sdk.component.p313d.p316c.p321c.C10532c;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.sdk.component.d.a.b */
/* compiled from: KeyGeneratorFactory */
public class C10489b {
    /* renamed from: a */
    public static C10562k m30637a() {
        return new C10562k() {

            /* renamed from: a */
            private WeakHashMap<String, String> f26147a = new WeakHashMap<>();

            /* renamed from: b */
            public String mo63996b(C10559h hVar) {
                return m30638a(hVar.mo64072a());
            }

            /* renamed from: a */
            public String mo63995a(C10559h hVar) {
                return m30638a(hVar.mo64072a() + "#width=" + hVar.mo64079b() + "#height=" + hVar.mo64081c() + "#scaletype=" + hVar.mo64082d());
            }

            /* renamed from: a */
            private String m30638a(String str) {
                String str2 = this.f26147a.get(str);
                if (str2 != null) {
                    return str2;
                }
                String a = C10532c.m30853a(str);
                this.f26147a.put(str, a);
                return a;
            }
        };
    }
}
