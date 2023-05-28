package com.yandex.metrica.impl.p082ob;

import java.util.Comparator;

/* renamed from: com.yandex.metrica.impl.ob.pn */
public class C3363pn implements Comparator<C3555uj> {
    public int compare(Object obj, Object obj2) {
        C3555uj ujVar = (C3555uj) obj;
        C3555uj ujVar2 = (C3555uj) obj2;
        if (ujVar == ujVar2) {
            return 0;
        }
        boolean z = true;
        boolean z2 = ujVar == null;
        if (ujVar2 != null) {
            z = false;
        }
        if (!(z ^ z2) && ujVar.mo18291q() == ujVar2.mo18291q() && ujVar.mo18277c() == ujVar2.mo18277c() && (ujVar.mo18285k() == null ? ujVar2.mo18285k() == null : ujVar.mo18285k().equals(ujVar2.mo18285k())) && (ujVar.mo18286l() == null ? ujVar2.mo18286l() == null : ujVar.mo18286l().equals(ujVar2.mo18286l())) && (ujVar.mo18279e() == null ? ujVar2.mo18279e() == null : ujVar.mo18279e().equals(ujVar2.mo18279e())) && (ujVar.mo18276b() == null ? ujVar2.mo18276b() == null : ujVar.mo18276b().equals(ujVar2.mo18276b())) && (ujVar.mo18288n() == null ? ujVar2.mo18288n() == null : ujVar.mo18288n().equals(ujVar2.mo18288n())) && (ujVar.mo18287m() == null ? ujVar2.mo18287m() == null : ujVar.mo18287m().equals(ujVar2.mo18287m()))) {
            if (ujVar.mo18289o() != null) {
                if (ujVar.mo18289o().equals(ujVar2.mo18289o())) {
                    return 0;
                }
            } else if (ujVar2.mo18289o() == null) {
                return 0;
            }
        }
        return 10;
    }
}
