package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KProperty2Impl;

@Metadata(mo38198d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a.\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004 \u0005*\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0006\b\u0002\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0006"}, mo38199d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", "V", "kotlin.jvm.PlatformType", "invoke"}, mo38200k = 3, mo38201mv = {1, 6, 0}, mo38203xi = 48)
/* compiled from: KProperty2Impl.kt */
final class KProperty2Impl$_getter$1 extends Lambda implements Function0<KProperty2Impl.Getter<D, E, ? extends V>> {
    final /* synthetic */ KProperty2Impl<D, E, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KProperty2Impl$_getter$1(KProperty2Impl<D, E, ? extends V> kProperty2Impl) {
        super(0);
        this.this$0 = kProperty2Impl;
    }

    public final KProperty2Impl.Getter<D, E, V> invoke() {
        return new KProperty2Impl.Getter<>(this.this$0);
    }
}
