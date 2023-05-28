package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.appnext.base.p264b.C8850d;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Annotations.kt */
public final class AnnotationsKt {
    public static final Annotations composeAnnotations(Annotations annotations, Annotations annotations2) {
        Intrinsics.checkNotNullParameter(annotations, "first");
        Intrinsics.checkNotNullParameter(annotations2, C8850d.f22428fh);
        if (annotations.isEmpty()) {
            return annotations2;
        }
        if (annotations2.isEmpty()) {
            return annotations;
        }
        return new CompositeAnnotations(annotations, annotations2);
    }
}
