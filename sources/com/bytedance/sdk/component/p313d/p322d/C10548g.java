package com.bytedance.sdk.component.p313d.p322d;

import com.bytedance.sdk.component.p313d.p316c.C10523c;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.d.g */
/* compiled from: DuplicateRequestCheckVisitor */
public class C10548g extends C10541a {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'I';
        r1 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x0026;
            case 56: goto L_0x0026;
            case 57: goto L_0x000f;
            default: goto L_0x000e;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String g1657027613257dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 74
            r1 = 55
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0000;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0026;
                case 95: goto L_0x000f;
                case 96: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x0026;
                case 56: goto L_0x0026;
                case 57: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0026
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 73
            r1 = 96
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public String mo64146a() {
        return "check_duplicate";
    }

    /* renamed from: a */
    public void mo64147a(C10523c cVar) {
        List list;
        String r = cVar.mo64096r();
        Map<String, List<C10523c>> f = cVar.mo64094p().mo64143f();
        synchronized (f) {
            list = f.get(r);
            if (list == null) {
                list = new LinkedList();
            }
        }
        synchronized (list) {
            list.add(cVar);
            f.put(r, list);
            if (list.size() <= 1) {
                cVar.mo64078a((C10550i) new C10545d());
            }
        }
    }
}
