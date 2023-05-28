package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata(mo38200k = 3, mo38201mv = {1, 6, 0}, mo38203xi = 48)
@DebugMetadata(mo38568c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", mo38569f = "Reduce.kt", mo38570l = {183}, mo38571m = "first")
/* compiled from: Reduce.kt */
final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    FlowKt__ReduceKt$first$3(Continuation<? super FlowKt__ReduceKt$first$3> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return FlowKt.first((Flow) null, (Function2) null, this);
    }
}
