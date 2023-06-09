package kotlin.reflect.jvm.internal.impl.load.java;

import com.appodeal.ads.modules.common.internal.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;

/* compiled from: propertiesConventionUtil.kt */
public final class PropertiesConventionUtilKt {
    public static final Name propertyNameByGetMethodName(Name name) {
        Intrinsics.checkNotNullParameter(name, "methodName");
        Name propertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(name, Constants.GET, false, (String) null, 12, (Object) null);
        return propertyNameFromAccessorMethodName$default == null ? propertyNameFromAccessorMethodName$default(name, "is", false, (String) null, 8, (Object) null) : propertyNameFromAccessorMethodName$default;
    }

    public static final Name propertyNameBySetMethodName(Name name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "methodName");
        return propertyNameFromAccessorMethodName$default(name, "set", false, z ? "is" : null, 4, (Object) null);
    }

    public static final List<Name> propertyNamesBySetMethodName(Name name) {
        Intrinsics.checkNotNullParameter(name, "methodName");
        return CollectionsKt.listOfNotNull((T[]) new Name[]{propertyNameBySetMethodName(name, false), propertyNameBySetMethodName(name, true)});
    }

    static /* synthetic */ Name propertyNameFromAccessorMethodName$default(Name name, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return propertyNameFromAccessorMethodName(name, str, z, str2);
    }

    private static final Name propertyNameFromAccessorMethodName(Name name, String str, boolean z, String str2) {
        if (name.isSpecial()) {
            return null;
        }
        String identifier = name.getIdentifier();
        Intrinsics.checkNotNullExpressionValue(identifier, "methodName.identifier");
        boolean z2 = false;
        if (!StringsKt.startsWith$default(identifier, str, false, 2, (Object) null) || identifier.length() == str.length()) {
            return null;
        }
        char charAt = identifier.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        if (str2 != null) {
            if (!_Assertions.ENABLED || z) {
                return Name.identifier(Intrinsics.stringPlus(str2, StringsKt.removePrefix(identifier, str)));
            }
            throw new AssertionError("Assertion failed");
        } else if (!z) {
            return name;
        } else {
            String decapitalizeSmartForCompiler = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(StringsKt.removePrefix(identifier, str), true);
            if (!Name.isValidIdentifier(decapitalizeSmartForCompiler)) {
                return null;
            }
            return Name.identifier(decapitalizeSmartForCompiler);
        }
    }

    public static final List<Name> getPropertyNamesCandidatesByAccessorName(Name name) {
        Intrinsics.checkNotNullParameter(name, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String asString = name.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "name.asString()");
        if (JvmAbi.isGetterName(asString)) {
            return CollectionsKt.listOfNotNull(propertyNameByGetMethodName(name));
        }
        if (JvmAbi.isSetterName(asString)) {
            return propertyNamesBySetMethodName(name);
        }
        return BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }
}
