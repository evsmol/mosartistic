package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: ConstUtil.kt */
public final class ConstUtil {
    public static final ConstUtil INSTANCE = new ConstUtil();

    private ConstUtil() {
    }

    public static final boolean canBeUsedForConstVal(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "type");
        return ConstUtilKt.canBeUsedForConstVal(kotlinType);
    }
}
