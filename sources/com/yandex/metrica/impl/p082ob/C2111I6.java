package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* renamed from: com.yandex.metrica.impl.ob.I6 */
public final class C2111I6 {
    /* renamed from: a */
    public static final C2085H6 m7361a(Throwable th, C3607w6 w6Var, List<StackTraceElement> list, String str, Boolean bool) {
        C2016F6 f6;
        ArrayList arrayList = null;
        if (th != null) {
            f6 = C2052G6.m7253a(th);
        } else {
            f6 = null;
        }
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (StackTraceElement d6 : list) {
                arrayList.add(new C1947D6(d6));
            }
        }
        return new C2085H6(f6, w6Var, arrayList, (String) null, (String) null, (Map<String, String>) null, str, bool);
    }

    /* renamed from: a */
    public static final C2085H6 m7360a(String str, String str2, List<? extends StackTraceItem> list, String str3, String str4, Map<String, String> map, String str5, Boolean bool) {
        ArrayList arrayList;
        List<? extends StackTraceItem> list2 = list;
        if (list2 != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (StackTraceItem stackTraceItem : list) {
                arrayList.add(new C1947D6(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), (Boolean) null));
            }
        } else {
            arrayList = null;
        }
        return new C2085H6(new C2016F6(str, str2, arrayList, (C2016F6) null, (List<C2016F6>) null), (C3607w6) null, (List<C1947D6>) null, str3, str4, map, str5, bool);
    }
}
