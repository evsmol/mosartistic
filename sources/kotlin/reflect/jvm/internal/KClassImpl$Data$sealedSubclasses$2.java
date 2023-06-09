package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

@Metadata(mo38198d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo38199d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "kotlin.jvm.PlatformType", "", "invoke"}, mo38200k = 3, mo38201mv = {1, 6, 0}, mo38203xi = 48)
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$sealedSubclasses$2 extends Lambda implements Function0<List<? extends KClassImpl<? extends T>>> {
    final /* synthetic */ KClassImpl<T>.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KClassImpl$Data$sealedSubclasses$2(KClassImpl<T>.Data data) {
        super(0);
        this.this$0 = data;
    }

    public final List<KClassImpl<? extends T>> invoke() {
        KClassImpl kClassImpl;
        Collection<ClassDescriptor> sealedSubclasses = this.this$0.getDescriptor().getSealedSubclasses();
        Intrinsics.checkNotNullExpressionValue(sealedSubclasses, "descriptor.sealedSubclasses");
        Collection arrayList = new ArrayList();
        for (ClassDescriptor classDescriptor : sealedSubclasses) {
            if (classDescriptor != null) {
                Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
                if (javaClass == null) {
                    kClassImpl = null;
                } else {
                    kClassImpl = new KClassImpl(javaClass);
                }
                if (kClassImpl != null) {
                    arrayList.add(kClassImpl);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
        }
        return (List) arrayList;
    }
}
