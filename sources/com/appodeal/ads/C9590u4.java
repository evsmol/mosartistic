package com.appodeal.ads;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.consent.Consent;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(mo38568c = "com.appodeal.ads.SdkCoreInitializerImpl", mo38569f = "SdkCoreInitializer.kt", mo38570l = {159, 163}, mo38571m = "initializeSdkRegulator")
/* renamed from: com.appodeal.ads.u4 */
public final class C9590u4 extends ContinuationImpl {

    /* renamed from: a */
    public Context f24323a;

    /* renamed from: b */
    public Consent f24324b;

    /* renamed from: c */
    public Boolean f24325c;

    /* renamed from: d */
    public String f24326d;

    /* renamed from: e */
    public /* synthetic */ Object f24327e;

    /* renamed from: f */
    public final /* synthetic */ C9706x4 f24328f;

    /* renamed from: g */
    public int f24329g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9590u4(C9706x4 x4Var, Continuation<? super C9590u4> continuation) {
        super(continuation);
        this.f24328f = x4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f24327e = obj;
        this.f24329g |= RecyclerView.UNDEFINED_DURATION;
        return C9706x4.m28521a(this.f24328f, (Context) null, (Consent) null, (Boolean) null, (String) null, this);
    }
}
