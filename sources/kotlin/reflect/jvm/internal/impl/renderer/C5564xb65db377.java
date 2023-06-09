package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS$1 */
/* compiled from: DescriptorRenderer.kt */
final class C5564xb65db377 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {
    public static final C5564xb65db377 INSTANCE = new C5564xb65db377();

    C5564xb65db377() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DescriptorRendererOptions) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(DescriptorRendererOptions descriptorRendererOptions) {
        Intrinsics.checkNotNullParameter(descriptorRendererOptions, "$this$withOptions");
        descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
    }
}
