package kotlin.reflect.jvm.internal.pcollections;

public final class HashPMap<K, V> {
    private static final HashPMap<Object, Object> EMPTY = new HashPMap<>(IntTreePMap.empty(), 0);
    private final IntTreePMap<ConsPStack<MapEntry<K, V>>> intMap;
    private final int size;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i != 1) {
            objArr[1] = "empty";
        } else {
            objArr[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    public static <K, V> HashPMap<K, V> empty() {
        HashPMap<Object, Object> hashPMap = EMPTY;
        if (hashPMap == null) {
            $$$reportNull$$$0(0);
        }
        return hashPMap;
    }

    private HashPMap(IntTreePMap<ConsPStack<MapEntry<K, V>>> intTreePMap, int i) {
        this.intMap = intTreePMap;
        this.size = i;
    }

    public V get(Object obj) {
        ConsPStack<E> entries = getEntries(obj.hashCode());
        while (entries != null && entries.size() > 0) {
            MapEntry mapEntry = (MapEntry) entries.first;
            if (mapEntry.key.equals(obj)) {
                return mapEntry.value;
            }
            entries = entries.rest;
        }
        return null;
    }

    public HashPMap<K, V> plus(K k, V v) {
        ConsPStack entries = getEntries(k.hashCode());
        int size2 = entries.size();
        int keyIndexIn = keyIndexIn(entries, k);
        if (keyIndexIn != -1) {
            entries = entries.minus(keyIndexIn);
        }
        ConsPStack plus = entries.plus(new MapEntry(k, v));
        return new HashPMap<>(this.intMap.plus(k.hashCode(), plus), (this.size - size2) + plus.size());
    }

    private ConsPStack<MapEntry<K, V>> getEntries(int i) {
        ConsPStack<MapEntry<K, V>> consPStack = this.intMap.get(i);
        return consPStack == null ? ConsPStack.empty() : consPStack;
    }

    private static <K, V> int keyIndexIn(ConsPStack<MapEntry<K, V>> consPStack, Object obj) {
        int i = 0;
        ConsPStack<E> consPStack2 = consPStack;
        while (consPStack2 != null && consPStack2.size() > 0) {
            if (((MapEntry) consPStack2.first).key.equals(obj)) {
                return i;
            }
            i++;
            consPStack2 = consPStack2.rest;
        }
        return -1;
    }
}
