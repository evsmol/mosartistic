package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: context.kt */
public final class DeserializationContext {
    private final DeserializationComponents components;
    private final DeserializedContainerSource containerSource;
    private final DeclarationDescriptor containingDeclaration;
    private final MemberDeserializer memberDeserializer;
    private final BinaryVersion metadataVersion;
    private final NameResolver nameResolver;
    private final TypeDeserializer typeDeserializer;
    private final TypeTable typeTable;
    private final VersionRequirementTable versionRequirementTable;

    public DeserializationContext(DeserializationComponents deserializationComponents, NameResolver nameResolver2, DeclarationDescriptor declarationDescriptor, TypeTable typeTable2, VersionRequirementTable versionRequirementTable2, BinaryVersion binaryVersion, DeserializedContainerSource deserializedContainerSource, TypeDeserializer typeDeserializer2, List<ProtoBuf.TypeParameter> list) {
        Intrinsics.checkNotNullParameter(deserializationComponents, "components");
        Intrinsics.checkNotNullParameter(nameResolver2, "nameResolver");
        Intrinsics.checkNotNullParameter(declarationDescriptor, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeTable2, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable2, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(binaryVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(list, "typeParameters");
        this.components = deserializationComponents;
        this.nameResolver = nameResolver2;
        this.containingDeclaration = declarationDescriptor;
        this.typeTable = typeTable2;
        this.versionRequirementTable = versionRequirementTable2;
        this.metadataVersion = binaryVersion;
        this.containerSource = deserializedContainerSource;
        String str = "Deserializer for \"" + this.containingDeclaration.getName() + '\"';
        DeserializedContainerSource deserializedContainerSource2 = this.containerSource;
        this.typeDeserializer = new TypeDeserializer(this, typeDeserializer2, list, str, deserializedContainerSource2 == null ? "[container not found]" : deserializedContainerSource2.getPresentableString());
        this.memberDeserializer = new MemberDeserializer(this);
    }

    public final DeserializationComponents getComponents() {
        return this.components;
    }

    public final NameResolver getNameResolver() {
        return this.nameResolver;
    }

    public final DeclarationDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    public final TypeTable getTypeTable() {
        return this.typeTable;
    }

    public final VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable;
    }

    public final DeserializedContainerSource getContainerSource() {
        return this.containerSource;
    }

    public final TypeDeserializer getTypeDeserializer() {
        return this.typeDeserializer;
    }

    public final MemberDeserializer getMemberDeserializer() {
        return this.memberDeserializer;
    }

    public final StorageManager getStorageManager() {
        return this.components.getStorageManager();
    }

    public static /* synthetic */ DeserializationContext childContext$default(DeserializationContext deserializationContext, DeclarationDescriptor declarationDescriptor, List list, NameResolver nameResolver2, TypeTable typeTable2, VersionRequirementTable versionRequirementTable2, BinaryVersion binaryVersion, int i, Object obj) {
        if ((i & 4) != 0) {
            nameResolver2 = deserializationContext.nameResolver;
        }
        NameResolver nameResolver3 = nameResolver2;
        if ((i & 8) != 0) {
            typeTable2 = deserializationContext.typeTable;
        }
        TypeTable typeTable3 = typeTable2;
        if ((i & 16) != 0) {
            versionRequirementTable2 = deserializationContext.versionRequirementTable;
        }
        VersionRequirementTable versionRequirementTable3 = versionRequirementTable2;
        if ((i & 32) != 0) {
            binaryVersion = deserializationContext.metadataVersion;
        }
        return deserializationContext.childContext(declarationDescriptor, list, nameResolver3, typeTable3, versionRequirementTable3, binaryVersion);
    }

    public final DeserializationContext childContext(DeclarationDescriptor declarationDescriptor, List<ProtoBuf.TypeParameter> list, NameResolver nameResolver2, TypeTable typeTable2, VersionRequirementTable versionRequirementTable2, BinaryVersion binaryVersion) {
        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
        Intrinsics.checkNotNullParameter(declarationDescriptor, "descriptor");
        List<ProtoBuf.TypeParameter> list2 = list;
        Intrinsics.checkNotNullParameter(list, "typeParameterProtos");
        NameResolver nameResolver3 = nameResolver2;
        Intrinsics.checkNotNullParameter(nameResolver2, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable2, "typeTable");
        VersionRequirementTable versionRequirementTable3 = versionRequirementTable2;
        Intrinsics.checkNotNullParameter(versionRequirementTable3, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(binaryVersion, "metadataVersion");
        DeserializationComponents deserializationComponents = this.components;
        if (!VersionSpecificBehaviorKt.isVersionRequirementTableWrittenCorrectly(binaryVersion)) {
            versionRequirementTable3 = this.versionRequirementTable;
        }
        return new DeserializationContext(deserializationComponents, nameResolver2, declarationDescriptor, typeTable2, versionRequirementTable3, binaryVersion, this.containerSource, this.typeDeserializer, list);
    }
}
