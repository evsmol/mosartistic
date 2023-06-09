package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* compiled from: ClassicBuiltinSpecialProperties.kt */
public final class ClassicBuiltinSpecialProperties {
    public static final ClassicBuiltinSpecialProperties INSTANCE = new ClassicBuiltinSpecialProperties();

    private ClassicBuiltinSpecialProperties() {
    }

    public final String getBuiltinSpecialPropertyGetterName(CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        boolean isBuiltIn = KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
        if (!_Assertions.ENABLED || isBuiltIn) {
            CallableMemberDescriptor firstOverridden$default = DescriptorUtilsKt.firstOverridden$default(DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor), false, C5445xccd5eab2.INSTANCE, 1, (Object) null);
            if (firstOverridden$default == null || (name = BuiltinSpecialProperties.INSTANCE.getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP().get(DescriptorUtilsKt.getFqNameSafe(firstOverridden$default))) == null) {
                return null;
            }
            return name.asString();
        }
        throw new AssertionError("This method is defined only for builtin members, but " + callableMemberDescriptor + " found");
    }

    public final boolean hasBuiltinSpecialPropertyFqName(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        if (!BuiltinSpecialProperties.INSTANCE.getSPECIAL_SHORT_NAMES().contains(callableMemberDescriptor.getName())) {
            return false;
        }
        return hasBuiltinSpecialPropertyFqNameImpl(callableMemberDescriptor);
    }

    private final boolean hasBuiltinSpecialPropertyFqNameImpl(CallableMemberDescriptor callableMemberDescriptor) {
        DeclarationDescriptor declarationDescriptor = callableMemberDescriptor;
        if (CollectionsKt.contains(BuiltinSpecialProperties.INSTANCE.getSPECIAL_FQ_NAMES(), DescriptorUtilsKt.fqNameOrNull(declarationDescriptor)) && callableMemberDescriptor.getValueParameters().isEmpty()) {
            return true;
        }
        if (!KotlinBuiltIns.isBuiltIn(declarationDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "overriddenDescriptors");
        Iterable<CallableMemberDescriptor> iterable = overriddenDescriptors;
        if (!((Collection) iterable).isEmpty()) {
            for (CallableMemberDescriptor callableMemberDescriptor2 : iterable) {
                ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = INSTANCE;
                Intrinsics.checkNotNullExpressionValue(callableMemberDescriptor2, "it");
                if (classicBuiltinSpecialProperties.hasBuiltinSpecialPropertyFqName(callableMemberDescriptor2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
