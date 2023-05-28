package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.pcollections.HashPMap;

@Metadata(mo38198d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH\u0000\"*\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0001X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, mo38199d2 = {"K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/pcollections/HashPMap;", "", "kotlin.jvm.PlatformType", "", "clearKClassCache", "", "getOrCreateKotlinClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "jClass", "Ljava/lang/Class;", "kotlin-reflection"}, mo38200k = 2, mo38201mv = {1, 6, 0}, mo38203xi = 48)
/* compiled from: kClassCache.kt */
public final class KClassCacheKt {
    private static HashPMap<String, Object> K_CLASS_CACHE;

    static {
        HashPMap<String, Object> empty = HashPMap.empty();
        Intrinsics.checkNotNullExpressionValue(empty, "empty<String, Any>()");
        K_CLASS_CACHE = empty;
    }

    public static final <T> KClassImpl<T> getOrCreateKotlinClass(Class<T> cls) {
        Class<T> cls2;
        Intrinsics.checkNotNullParameter(cls, "jClass");
        String name = cls.getName();
        Object obj = K_CLASS_CACHE.get(name);
        Class<T> cls3 = null;
        if (obj instanceof WeakReference) {
            KClassImpl<T> kClassImpl = (KClassImpl) ((WeakReference) obj).get();
            if (kClassImpl != null) {
                cls3 = kClassImpl.getJClass();
            }
            if (Intrinsics.areEqual((Object) cls3, (Object) cls)) {
                return kClassImpl;
            }
        } else if (obj != null) {
            WeakReference[] weakReferenceArr = (WeakReference[]) obj;
            int length = weakReferenceArr.length;
            int i = 0;
            while (i < length) {
                WeakReference weakReference = weakReferenceArr[i];
                i++;
                KClassImpl<T> kClassImpl2 = (KClassImpl) weakReference.get();
                if (kClassImpl2 == null) {
                    cls2 = null;
                } else {
                    cls2 = kClassImpl2.getJClass();
                }
                if (Intrinsics.areEqual((Object) cls2, (Object) cls)) {
                    return kClassImpl2;
                }
            }
            int length2 = ((Object[]) obj).length;
            WeakReference[] weakReferenceArr2 = new WeakReference[(length2 + 1)];
            System.arraycopy(obj, 0, weakReferenceArr2, 0, length2);
            KClassImpl<T> kClassImpl3 = new KClassImpl<>(cls);
            weakReferenceArr2[length2] = new WeakReference(kClassImpl3);
            HashPMap<String, Object> plus = K_CLASS_CACHE.plus(name, weakReferenceArr2);
            Intrinsics.checkNotNullExpressionValue(plus, "K_CLASS_CACHE.plus(name, newArray)");
            K_CLASS_CACHE = plus;
            return kClassImpl3;
        }
        KClassImpl<T> kClassImpl4 = new KClassImpl<>(cls);
        HashPMap<String, Object> plus2 = K_CLASS_CACHE.plus(name, new WeakReference(kClassImpl4));
        Intrinsics.checkNotNullExpressionValue(plus2, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
        K_CLASS_CACHE = plus2;
        return kClassImpl4;
    }
}
