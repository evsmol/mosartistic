package com.appodeal.ads;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(mo38568c = "com.appodeal.ads.SdkCoreInitializerImpl", mo38569f = "SdkCoreInitializer.kt", mo38570l = {118, 119}, mo38571m = "installRequest")
/* renamed from: com.appodeal.ads.w4 */
public final class C9690w4 extends ContinuationImpl {

    /* renamed from: a */
    public Context f24517a;

    /* renamed from: b */
    public /* synthetic */ Object f24518b;

    /* renamed from: c */
    public final /* synthetic */ C9706x4 f24519c;

    /* renamed from: d */
    public int f24520d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9690w4(C9706x4 x4Var, Continuation<? super C9690w4> continuation) {
        super(continuation);
        this.f24519c = x4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f24518b = obj;
        this.f24520d |= RecyclerView.UNDEFINED_DURATION;
        return C9706x4.m28522a(this.f24519c, (Context) null, this);
    }
}
