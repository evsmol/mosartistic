package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;

@Metadata(mo38198d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0004"}, mo38199d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "V", "kotlin.jvm.PlatformType", "invoke"}, mo38200k = 3, mo38201mv = {1, 6, 0}, mo38203xi = 48)
/* compiled from: KProperty0Impl.kt */
final class KMutableProperty0Impl$_setter$1 extends Lambda implements Function0<KMutableProperty0Impl.Setter<V>> {
    final /* synthetic */ KMutableProperty0Impl<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KMutableProperty0Impl$_setter$1(KMutableProperty0Impl<V> kMutableProperty0Impl) {
        super(0);
        this.this$0 = kMutableProperty0Impl;
    }

    public final KMutableProperty0Impl.Setter<V> invoke() {
        return new KMutableProperty0Impl.Setter<>(this.this$0);
    }
}
