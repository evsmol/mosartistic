package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 */
/* compiled from: IntersectionType.kt */
/* synthetic */ class C5613x702eebb8 extends FunctionReference implements Function2<KotlinType, KotlinType, Boolean> {
    C5613x702eebb8(Object obj) {
        super(2, obj);
    }

    public final String getName() {
        return "isStrictSupertype";
    }

    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(TypeIntersector.class);
    }

    public final Boolean invoke(KotlinType kotlinType, KotlinType kotlinType2) {
        Intrinsics.checkNotNullParameter(kotlinType, "p0");
        Intrinsics.checkNotNullParameter(kotlinType2, "p1");
        return Boolean.valueOf(((TypeIntersector) this.receiver).isStrictSupertype(kotlinType, kotlinType2));
    }
}
