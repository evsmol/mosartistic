package com.appodeal.ads;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.networking.C9328b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(mo38568c = "com.appodeal.ads.SdkCoreInitializerImpl", mo38569f = "SdkCoreInitializer.kt", mo38570l = {129}, mo38571m = "initializeServices")
/* renamed from: com.appodeal.ads.v4 */
public final class C9680v4 extends ContinuationImpl {

    /* renamed from: a */
    public C9706x4 f24504a;

    /* renamed from: b */
    public /* synthetic */ Object f24505b;

    /* renamed from: c */
    public final /* synthetic */ C9706x4 f24506c;

    /* renamed from: d */
    public int f24507d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9680v4(C9706x4 x4Var, Continuation<? super C9680v4> continuation) {
        super(continuation);
        this.f24506c = x4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f24505b = obj;
        this.f24507d |= RecyclerView.UNDEFINED_DURATION;
        return C9706x4.m28520a(this.f24506c, (Context) null, (C9328b) null, (Continuation) this);
    }
}
