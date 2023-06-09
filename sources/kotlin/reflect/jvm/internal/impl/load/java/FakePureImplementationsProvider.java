package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: FakePureImplementationsProvider.kt */
public final class FakePureImplementationsProvider {
    public static final FakePureImplementationsProvider INSTANCE = new FakePureImplementationsProvider();
    private static final HashMap<FqName, FqName> pureImplementations = new HashMap<>();

    private FakePureImplementationsProvider() {
    }

    public final FqName getPurelyImplementedInterface(FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "classFqName");
        return pureImplementations.get(fqName);
    }

    static {
        INSTANCE.implementedWith(StandardNames.FqNames.mutableList, INSTANCE.fqNameListOf("java.util.ArrayList", "java.util.LinkedList"));
        INSTANCE.implementedWith(StandardNames.FqNames.mutableSet, INSTANCE.fqNameListOf("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        INSTANCE.implementedWith(StandardNames.FqNames.mutableMap, INSTANCE.fqNameListOf("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        INSTANCE.implementedWith(new FqName("java.util.function.Function"), INSTANCE.fqNameListOf("java.util.function.UnaryOperator"));
        INSTANCE.implementedWith(new FqName("java.util.function.BiFunction"), INSTANCE.fqNameListOf("java.util.function.BinaryOperator"));
    }

    private final void implementedWith(FqName fqName, List<FqName> list) {
        Map map = pureImplementations;
        for (Object next : list) {
            FqName fqName2 = (FqName) next;
            map.put(next, fqName);
        }
    }

    private final List<FqName> fqNameListOf(String... strArr) {
        Collection arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            arrayList.add(new FqName(str));
        }
        return (List) arrayList;
    }
}
