package com.appodeal.ads.networking;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.C9720y2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(mo38568c = "com.appodeal.ads.networking.JsonRequestExtKt", mo38569f = "JsonRequestExt.kt", mo38570l = {64}, mo38571m = "execute")
/* renamed from: com.appodeal.ads.networking.d */
public final class C9369d extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f23776a;

    /* renamed from: b */
    public int f23777b;

    public C9369d(Continuation<? super C9369d> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.f23776a = obj;
        this.f23777b |= RecyclerView.UNDEFINED_DURATION;
        Object a = C9361c.m27707a((C9720y2.C9721a) null, (Continuation) this);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m31661boximpl(a);
    }
}
