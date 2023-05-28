package com.appodeal.ads;

import android.app.Application;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.libs.network.AppodealEndpoints;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(mo38568c = "com.appodeal.ads.SdkCoreInitializerImpl", mo38569f = "SdkCoreInitializer.kt", mo38570l = {175, 179, 188}, mo38571m = "prepareSdkCore")
/* renamed from: com.appodeal.ads.y4 */
public final class C9725y4 extends ContinuationImpl {

    /* renamed from: a */
    public Object f24637a;

    /* renamed from: b */
    public Object f24638b;

    /* renamed from: c */
    public Object f24639c;

    /* renamed from: d */
    public Context f24640d;

    /* renamed from: e */
    public AppodealEndpoints f24641e;

    /* renamed from: f */
    public String f24642f;

    /* renamed from: g */
    public /* synthetic */ Object f24643g;

    /* renamed from: h */
    public final /* synthetic */ C9706x4 f24644h;

    /* renamed from: i */
    public int f24645i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9725y4(C9706x4 x4Var, Continuation<? super C9725y4> continuation) {
        super(continuation);
        this.f24644h = x4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f24643g = obj;
        this.f24645i |= RecyclerView.UNDEFINED_DURATION;
        return C9706x4.m28519a(this.f24644h, (Application) null, (String) null, (Continuation) this);
    }
}
