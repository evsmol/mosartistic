package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class AnnotationTypeQualifierResolver {
    private final JavaTypeEnhancementState javaTypeEnhancementState;
    private final MemoizedFunctionToNullable<ClassDescriptor, AnnotationDescriptor> resolvedNicknames;

    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public static final class TypeQualifierWithApplicability {
        private final int applicability;
        private final AnnotationDescriptor typeQualifier;

        public TypeQualifierWithApplicability(AnnotationDescriptor annotationDescriptor, int i) {
            Intrinsics.checkNotNullParameter(annotationDescriptor, "typeQualifier");
            this.typeQualifier = annotationDescriptor;
            this.applicability = i;
        }

        public final AnnotationDescriptor component1() {
            return this.typeQualifier;
        }

        public final List<AnnotationQualifierApplicabilityType> component2() {
            AnnotationQualifierApplicabilityType[] values = AnnotationQualifierApplicabilityType.values();
            Collection arrayList = new ArrayList();
            int length = values.length;
            int i = 0;
            while (i < length) {
                AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = values[i];
                i++;
                if (isApplicableTo(annotationQualifierApplicabilityType)) {
                    arrayList.add(annotationQualifierApplicabilityType);
                }
            }
            return (List) arrayList;
        }

        private final boolean isApplicableTo(AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
            if (isApplicableConsideringMask(annotationQualifierApplicabilityType)) {
                return true;
            }
            if (!isApplicableConsideringMask(AnnotationQualifierApplicabilityType.TYPE_USE) || annotationQualifierApplicabilityType == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                return false;
            }
            return true;
        }

        private final boolean isApplicableConsideringMask(AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
            return ((1 << annotationQualifierApplicabilityType.ordinal()) & this.applicability) != 0;
        }
    }

    public AnnotationTypeQualifierResolver(StorageManager storageManager, JavaTypeEnhancementState javaTypeEnhancementState2) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState2, "javaTypeEnhancementState");
        this.javaTypeEnhancementState = javaTypeEnhancementState2;
        this.resolvedNicknames = storageManager.createMemoizedFunctionWithNullableValues(new AnnotationTypeQualifierResolver$resolvedNicknames$1(this));
    }

    /* access modifiers changed from: private */
    public final AnnotationDescriptor computeTypeQualifierNickname(ClassDescriptor classDescriptor) {
        if (!classDescriptor.getAnnotations().hasAnnotation(AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_NICKNAME_FQNAME())) {
            return null;
        }
        for (AnnotationDescriptor resolveTypeQualifierAnnotation : classDescriptor.getAnnotations()) {
            AnnotationDescriptor resolveTypeQualifierAnnotation2 = resolveTypeQualifierAnnotation(resolveTypeQualifierAnnotation);
            if (resolveTypeQualifierAnnotation2 != null) {
                return resolveTypeQualifierAnnotation2;
            }
        }
        return null;
    }

    private final AnnotationDescriptor resolveTypeQualifierNickname(ClassDescriptor classDescriptor) {
        if (classDescriptor.getKind() != ClassKind.ANNOTATION_CLASS) {
            return null;
        }
        return this.resolvedNicknames.invoke(classDescriptor);
    }

    public final AnnotationDescriptor resolveTypeQualifierAnnotation(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor annotationClass;
        Intrinsics.checkNotNullParameter(annotationDescriptor, "annotationDescriptor");
        if (this.javaTypeEnhancementState.getJsr305().isDisabled() || (annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor)) == null) {
            return null;
        }
        if (AnnotationTypeQualifierResolverKt.isAnnotatedWithTypeQualifier(annotationClass)) {
            return annotationDescriptor;
        }
        return resolveTypeQualifierNickname(annotationClass);
    }

    public final JavaDefaultQualifiers resolveQualifierBuiltInDefaultAnnotation(AnnotationDescriptor annotationDescriptor) {
        JavaDefaultQualifiers javaDefaultQualifiers;
        Intrinsics.checkNotNullParameter(annotationDescriptor, "annotationDescriptor");
        if (this.javaTypeEnhancementState.getDisabledDefaultAnnotations() || (javaDefaultQualifiers = AnnotationQualifiersFqNamesKt.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(annotationDescriptor.getFqName())) == null) {
            return null;
        }
        ReportLevel resolveDefaultAnnotationState = resolveDefaultAnnotationState(annotationDescriptor);
        if (!(resolveDefaultAnnotationState != ReportLevel.IGNORE)) {
            resolveDefaultAnnotationState = null;
        }
        if (resolveDefaultAnnotationState == null) {
            return null;
        }
        return JavaDefaultQualifiers.copy$default(javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus.copy$default(javaDefaultQualifiers.getNullabilityQualifier(), (NullabilityQualifier) null, resolveDefaultAnnotationState.isWarning(), 1, (Object) null), (Collection) null, false, 6, (Object) null);
    }

    private final ReportLevel resolveDefaultAnnotationState(AnnotationDescriptor annotationDescriptor) {
        FqName fqName = annotationDescriptor.getFqName();
        if (fqName == null || !AnnotationQualifiersFqNamesKt.getJSPECIFY_DEFAULT_ANNOTATIONS().containsKey(fqName)) {
            return resolveJsr305AnnotationState(annotationDescriptor);
        }
        return this.javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
    }

    public final TypeQualifierWithApplicability resolveTypeQualifierDefaultAnnotation(AnnotationDescriptor annotationDescriptor) {
        Object obj;
        boolean z;
        List<AnnotationQualifierApplicabilityType> list;
        Intrinsics.checkNotNullParameter(annotationDescriptor, "annotationDescriptor");
        if (this.javaTypeEnhancementState.getJsr305().isDisabled()) {
            return null;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass == null || !annotationClass.getAnnotations().hasAnnotation(AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_DEFAULT_FQNAME())) {
            annotationClass = null;
        }
        if (annotationClass == null) {
            return null;
        }
        ClassDescriptor annotationClass2 = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        Intrinsics.checkNotNull(annotationClass2);
        AnnotationDescriptor findAnnotation = annotationClass2.getAnnotations().findAnnotation(AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_DEFAULT_FQNAME());
        Intrinsics.checkNotNull(findAnnotation);
        Map<Name, ConstantValue<?>> allValueArguments = findAnnotation.getAllValueArguments();
        Collection arrayList = new ArrayList();
        for (Map.Entry next : allValueArguments.entrySet()) {
            ConstantValue constantValue = (ConstantValue) next.getValue();
            if (Intrinsics.areEqual((Object) (Name) next.getKey(), (Object) JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                list = mapJavaConstantToQualifierApplicabilityTypes(constantValue);
            } else {
                list = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, list);
        }
        int i = 0;
        for (AnnotationQualifierApplicabilityType ordinal : (List) arrayList) {
            i |= 1 << ordinal.ordinal();
        }
        Iterator it = annotationClass.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (resolveTypeQualifierAnnotation((AnnotationDescriptor) obj) != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        AnnotationDescriptor annotationDescriptor2 = (AnnotationDescriptor) obj;
        if (annotationDescriptor2 == null) {
            return null;
        }
        return new TypeQualifierWithApplicability(annotationDescriptor2, i);
    }

    public final TypeQualifierWithApplicability resolveAnnotation(AnnotationDescriptor annotationDescriptor) {
        Intrinsics.checkNotNullParameter(annotationDescriptor, "annotationDescriptor");
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass == null) {
            return null;
        }
        Annotations annotations = annotationClass.getAnnotations();
        FqName fqName = JvmAnnotationNames.TARGET_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(fqName, "TARGET_ANNOTATION");
        AnnotationDescriptor findAnnotation = annotations.findAnnotation(fqName);
        if (findAnnotation == null) {
            return null;
        }
        Map<Name, ConstantValue<?>> allValueArguments = findAnnotation.getAllValueArguments();
        Collection arrayList = new ArrayList();
        for (Map.Entry<Name, ConstantValue<?>> value : allValueArguments.entrySet()) {
            CollectionsKt.addAll(arrayList, mapKotlinConstantToQualifierApplicabilityTypes((ConstantValue) value.getValue()));
        }
        int i = 0;
        for (AnnotationQualifierApplicabilityType ordinal : (List) arrayList) {
            i |= 1 << ordinal.ordinal();
        }
        return new TypeQualifierWithApplicability(annotationDescriptor, i);
    }

    public final ReportLevel resolveJsr305AnnotationState(AnnotationDescriptor annotationDescriptor) {
        Intrinsics.checkNotNullParameter(annotationDescriptor, "annotationDescriptor");
        ReportLevel resolveJsr305CustomState = resolveJsr305CustomState(annotationDescriptor);
        return resolveJsr305CustomState == null ? this.javaTypeEnhancementState.getJsr305().getGlobalLevel() : resolveJsr305CustomState;
    }

    public final ReportLevel resolveJsr305CustomState(AnnotationDescriptor annotationDescriptor) {
        Intrinsics.checkNotNullParameter(annotationDescriptor, "annotationDescriptor");
        ReportLevel reportLevel = this.javaTypeEnhancementState.getJsr305().getUserDefinedLevelForSpecificAnnotation().get(annotationDescriptor.getFqName());
        if (reportLevel != null) {
            return reportLevel;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass == null) {
            return null;
        }
        return migrationAnnotationStatus(annotationClass);
    }

    private final ReportLevel migrationAnnotationStatus(ClassDescriptor classDescriptor) {
        AnnotationDescriptor findAnnotation = classDescriptor.getAnnotations().findAnnotation(AnnotationQualifiersFqNamesKt.getMIGRATION_ANNOTATION_FQNAME());
        ConstantValue<?> firstArgument = findAnnotation == null ? null : DescriptorUtilsKt.firstArgument(findAnnotation);
        EnumValue enumValue = firstArgument instanceof EnumValue ? (EnumValue) firstArgument : null;
        if (enumValue == null) {
            return null;
        }
        ReportLevel migrationLevel = this.javaTypeEnhancementState.getJsr305().getMigrationLevel();
        if (migrationLevel != null) {
            return migrationLevel;
        }
        String asString = enumValue.getEnumEntryName().asString();
        int hashCode = asString.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && asString.equals("WARN")) {
                    return ReportLevel.WARN;
                }
                return null;
            } else if (!asString.equals("STRICT")) {
                return null;
            } else {
                return ReportLevel.STRICT;
            }
        } else if (!asString.equals("IGNORE")) {
            return null;
        } else {
            return ReportLevel.IGNORE;
        }
    }

    /* access modifiers changed from: private */
    public final List<String> toKotlinTargetNames(String str) {
        Iterable<KotlinTarget> mapJavaTargetArgumentByName = JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArgumentByName(str);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mapJavaTargetArgumentByName, 10));
        for (KotlinTarget name : mapJavaTargetArgumentByName) {
            arrayList.add(name.name());
        }
        return (List) arrayList;
    }

    private final List<AnnotationQualifierApplicabilityType> mapConstantToQualifierApplicabilityTypes(ConstantValue<?> constantValue, Function2<? super EnumValue, ? super AnnotationQualifierApplicabilityType, Boolean> function2) {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
        if (constantValue instanceof ArrayValue) {
            Collection arrayList = new ArrayList();
            for (ConstantValue mapConstantToQualifierApplicabilityTypes : (Iterable) ((ArrayValue) constantValue).getValue()) {
                CollectionsKt.addAll(arrayList, mapConstantToQualifierApplicabilityTypes(mapConstantToQualifierApplicabilityTypes, function2));
            }
            return (List) arrayList;
        } else if (!(constantValue instanceof EnumValue)) {
            return CollectionsKt.emptyList();
        } else {
            AnnotationQualifierApplicabilityType[] values = AnnotationQualifierApplicabilityType.values();
            int i = 0;
            int length = values.length;
            while (true) {
                if (i >= length) {
                    annotationQualifierApplicabilityType = null;
                    break;
                }
                annotationQualifierApplicabilityType = values[i];
                i++;
                if (function2.invoke(constantValue, annotationQualifierApplicabilityType).booleanValue()) {
                    break;
                }
            }
            return CollectionsKt.listOfNotNull(annotationQualifierApplicabilityType);
        }
    }

    private final List<AnnotationQualifierApplicabilityType> mapJavaConstantToQualifierApplicabilityTypes(ConstantValue<?> constantValue) {
        return mapConstantToQualifierApplicabilityTypes(constantValue, C5440xefd2e52b.INSTANCE);
    }

    private final List<AnnotationQualifierApplicabilityType> mapKotlinConstantToQualifierApplicabilityTypes(ConstantValue<?> constantValue) {
        return mapConstantToQualifierApplicabilityTypes(constantValue, new C5441xfc38e52c(this));
    }
}
