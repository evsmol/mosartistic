package kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo38198d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo38199d2 = {"<no name provided>", "Ljava/lang/reflect/Type;", "invoke"}, mo38200k = 3, mo38201mv = {1, 6, 0}, mo38203xi = 48)
/* compiled from: KTypeImpl.kt */
final class KTypeImpl$arguments$2$1$type$1 extends Lambda implements Function0<Type> {

    /* renamed from: $i */
    final /* synthetic */ int f12925$i;
    final /* synthetic */ Lazy<List<Type>> $parameterizedTypeArguments$delegate;
    final /* synthetic */ KTypeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KTypeImpl$arguments$2$1$type$1(KTypeImpl kTypeImpl, int i, Lazy<? extends List<? extends Type>> lazy) {
        super(0);
        this.this$0 = kTypeImpl;
        this.f12925$i = i;
        this.$parameterizedTypeArguments$delegate = lazy;
    }

    public final Type invoke() {
        Type javaType = this.this$0.getJavaType();
        if (javaType instanceof Class) {
            Class cls = (Class) javaType;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            Intrinsics.checkNotNullExpressionValue(componentType, "{\n                      …                        }");
            return componentType;
        } else if (javaType instanceof GenericArrayType) {
            if (this.f12925$i == 0) {
                Type genericComponentType = ((GenericArrayType) javaType).getGenericComponentType();
                Intrinsics.checkNotNullExpressionValue(genericComponentType, "{\n                      …                        }");
                return genericComponentType;
            }
            throw new KotlinReflectionInternalError(Intrinsics.stringPlus("Array type has been queried for a non-0th argument: ", this.this$0));
        } else if (javaType instanceof ParameterizedType) {
            Type type = (Type) KTypeImpl$arguments$2.m31671invoke$lambda0(this.$parameterizedTypeArguments$delegate).get(this.f12925$i);
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Intrinsics.checkNotNullExpressionValue(lowerBounds, "argument.lowerBounds");
                Type type2 = (Type) ArraysKt.firstOrNull((Object[]) lowerBounds);
                if (type2 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds, "argument.upperBounds");
                    type = (Type) ArraysKt.first((Object[]) upperBounds);
                } else {
                    type = type2;
                }
            }
            Intrinsics.checkNotNullExpressionValue(type, "{\n                      …                        }");
            return type;
        } else {
            throw new KotlinReflectionInternalError(Intrinsics.stringPlus("Non-generic type has been queried for arguments: ", this.this$0));
        }
    }
}
