package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.appodeal.ads.modules.common.internal.Constants;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;

/* compiled from: predefinedEnhancementInfo.kt */
public final class PredefinedEnhancementInfoKt {
    /* access modifiers changed from: private */
    public static final JavaTypeQualifiers NOT_NULLABLE = new JavaTypeQualifiers(NullabilityQualifier.NOT_NULL, (MutabilityQualifier) null, true, false, 8, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final JavaTypeQualifiers NOT_PLATFORM = new JavaTypeQualifiers(NullabilityQualifier.NOT_NULL, (MutabilityQualifier) null, false, false, 8, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final JavaTypeQualifiers NULLABLE = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, (MutabilityQualifier) null, false, false, 8, (DefaultConstructorMarker) null);
    private static final Map<String, PredefinedFunctionEnhancementInfo> PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;

    static {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String javaLang = signatureBuildingComponents.javaLang("Object");
        String javaFunction = signatureBuildingComponents.javaFunction("Predicate");
        String javaFunction2 = signatureBuildingComponents.javaFunction("Function");
        String javaFunction3 = signatureBuildingComponents.javaFunction("Consumer");
        String javaFunction4 = signatureBuildingComponents.javaFunction("BiFunction");
        String javaFunction5 = signatureBuildingComponents.javaFunction("BiConsumer");
        String javaFunction6 = signatureBuildingComponents.javaFunction("UnaryOperator");
        String javaUtil = signatureBuildingComponents.javaUtil("stream/Stream");
        String javaUtil2 = signatureBuildingComponents.javaUtil("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Iterator")).function("forEachRemaining", new C5458xb250426d(javaFunction3));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaLang("Iterable")).function("spliterator", new C5464xb250462e(signatureBuildingComponents));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Collection"));
        classEnhancementBuilder.function("removeIf", new C5465xb25049ef(javaFunction));
        classEnhancementBuilder.function("stream", new C5466xb25049f0(javaUtil));
        classEnhancementBuilder.function("parallelStream", new C5467xb25049f1(javaUtil));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("List")).function("replaceAll", new C5468xb2504db0(javaFunction6));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Map"));
        classEnhancementBuilder2.function("forEach", new C5469xb2505171(javaFunction5));
        classEnhancementBuilder2.function("putIfAbsent", new C5470xb2505172(javaLang));
        classEnhancementBuilder2.function("replace", new C5471xb2505173(javaLang));
        classEnhancementBuilder2.function("replace", new C5472xb2505174(javaLang));
        classEnhancementBuilder2.function("replaceAll", new C5473xb2505175(javaFunction4));
        classEnhancementBuilder2.function("compute", new C5474xb2505176(javaLang, javaFunction4));
        classEnhancementBuilder2.function("computeIfAbsent", new C5475xb2505177(javaLang, javaFunction2));
        classEnhancementBuilder2.function("computeIfPresent", new C5476xb2505178(javaLang, javaFunction4));
        classEnhancementBuilder2.function("merge", new C5477xb2505179(javaLang, javaFunction4));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaUtil2);
        classEnhancementBuilder3.function("empty", new C5478xb2505532(javaUtil2));
        classEnhancementBuilder3.function("of", new C5479xb2505533(javaLang, javaUtil2));
        classEnhancementBuilder3.function("ofNullable", new C5480xb2505534(javaLang, javaUtil2));
        classEnhancementBuilder3.function(Constants.GET, new C5481xb2505535(javaLang));
        classEnhancementBuilder3.function("ifPresent", new C5482xb2505536(javaFunction3));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaLang("ref/Reference")).function(Constants.GET, new C5483xb25058f3(javaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction).function("test", new C5484xb2505cb4(javaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaFunction("BiPredicate")).function("test", new C5485xb2506075(javaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction3).function("accept", new C5459x97b836dd(javaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction5).function("accept", new C5460x97b83a9e(javaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction2).function("apply", new C5461x97b83e5f(javaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction4).function("apply", new C5462x97b84220(javaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaFunction("Supplier")).function(Constants.GET, new C5463x97b845e1(javaLang));
        PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE = signatureEnhancementBuilder.build();
    }

    public static final Map<String, PredefinedFunctionEnhancementInfo> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;
    }
}
